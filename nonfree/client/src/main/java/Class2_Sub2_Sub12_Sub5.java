import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub2_Sub12_Sub5 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_584 = Static12.method257("Loaded update list");

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_586 = Static12.method257("Please try using a different world)3");

	@OriginalMember(owner = "client!sa", name = "sb", descriptor = "[B")
	public static byte[] aByteArray17 = new byte[520];

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "Lclient!o;")
	public static Class40 aClass40_590 = Static12.method257(" with @lre@");

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_585 = Static12.method257("Unexpected server response: ");

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "Lclient!o;")
	public static Class40 aClass40_588 = Static12.method257("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!sa", name = "zb", descriptor = "I")
	public static int anInt2030 = 0;

	@OriginalMember(owner = "client!sa", name = "Fb", descriptor = "Lclient!o;")
	public static Class40 aClass40_593 = Static12.method257("");

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_587 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "Ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_592 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "Kb", descriptor = "I")
	public static int anInt2039 = 0;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_589 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "yb", descriptor = "Lclient!o;")
	public static Class40 aClass40_591 = aClass40_593;

	@OriginalMember(owner = "client!sa", name = "Cb", descriptor = "I")
	private final int anInt2032;

	@OriginalMember(owner = "client!sa", name = "Jb", descriptor = "I")
	private final int anInt2038;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	private final int anInt2022;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private final int anInt2021;

	@OriginalMember(owner = "client!sa", name = "vb", descriptor = "I")
	private final int anInt2028;

	@OriginalMember(owner = "client!sa", name = "pb", descriptor = "I")
	private final int anInt2024;

	@OriginalMember(owner = "client!sa", name = "Eb", descriptor = "I")
	private final int anInt2034;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lclient!f;")
	private Class2_Sub2_Sub6 aClass2_Sub2_Sub6_2;

	@OriginalMember(owner = "client!sa", name = "ob", descriptor = "I")
	private int anInt2023;

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "I")
	private int anInt2026;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lclient!ne;", line = 34)
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		if (this.aClass2_Sub2_Sub6_2 != null) {
			@Pc(13) int local13 = Class24.anInt2511 - this.anInt2026;
			if (local13 > 100 && this.aClass2_Sub2_Sub6_2.anInt669 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub2_Sub6_2.anIntArray128[this.anInt2023] >= local13) {
							break label37;
						}
						local13 -= this.aClass2_Sub2_Sub6_2.anIntArray128[this.anInt2023];
						this.anInt2023++;
					} while (this.aClass2_Sub2_Sub6_2.anIntArray124.length > this.anInt2023);
					this.anInt2023 -= this.aClass2_Sub2_Sub6_2.anInt669;
				} while (this.anInt2023 >= 0 && this.aClass2_Sub2_Sub6_2.anIntArray124.length > this.anInt2023);
				this.aClass2_Sub2_Sub6_2 = null;
			}
			this.anInt2026 = Class24.anInt2511 - local13;
		}
		@Pc(104) Class2_Sub2_Sub10 local104 = Static83.method1470(this.anInt2034);
		if (local104.anIntArray210 != null) {
			local104 = local104.method766();
		}
		return local104 == null ? null : local104.method777(this.anInt2021, this.anInt2028, this.anInt2024, this.aClass2_Sub2_Sub6_2, this.anInt2022, this.anInt2023, this.anInt2038, this.anInt2032);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 466)
	public Class2_Sub2_Sub12_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2032 = arg6;
		this.anInt2038 = arg3;
		this.anInt2022 = arg1;
		this.anInt2021 = arg2;
		this.anInt2028 = arg5;
		this.anInt2024 = arg4;
		this.anInt2034 = arg0;
		if (arg7 != -1) {
			this.aClass2_Sub2_Sub6_2 = Static57.method1042(arg7);
			this.anInt2023 = 0;
			this.anInt2026 = Class24.anInt2511 - 1;
			if (arg8 && this.aClass2_Sub2_Sub6_2.anInt669 != -1) {
				this.anInt2023 = (int) ((double) this.aClass2_Sub2_Sub6_2.anIntArray124.length * Math.random());
				this.anInt2026 -= (int) ((double) this.aClass2_Sub2_Sub6_2.anIntArray128[this.anInt2023] * Math.random());
				return;
			}
		}
	}
}
