import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class2_Sub2_Sub12_Sub5 extends Class2_Sub2_Sub12 {

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

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class2_Sub2_Sub12_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2032 = arg6;
		this.anInt2038 = arg3;
		this.anInt2022 = arg1;
		this.anInt2021 = arg2;
		this.anInt2028 = arg5;
		this.anInt2024 = arg4;
		this.anInt2034 = arg0;
		if (arg7 != -1) {
			this.aClass2_Sub2_Sub6_2 = Static62.method1042(arg7);
			this.anInt2023 = 0;
			this.anInt2026 = Static107.anInt2511 - 1;
			if (arg8 && this.aClass2_Sub2_Sub6_2.anInt669 != -1) {
				this.anInt2023 = (int) ((double) this.aClass2_Sub2_Sub6_2.anIntArray124.length * Math.random());
				this.anInt2026 -= (int) ((double) this.aClass2_Sub2_Sub6_2.anIntArray128[this.anInt2023] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		if (this.aClass2_Sub2_Sub6_2 != null) {
			@Pc(13) int local13 = Static107.anInt2511 - this.anInt2026;
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
			this.anInt2026 = Static107.anInt2511 - local13;
		}
		@Pc(104) Class2_Sub2_Sub10 local104 = Static91.method1470(this.anInt2034);
		if (local104.anIntArray210 != null) {
			local104 = local104.method766();
		}
		return local104 == null ? null : local104.method777(this.anInt2021, this.anInt2028, this.anInt2024, this.aClass2_Sub2_Sub6_2, this.anInt2022, this.anInt2023, this.anInt2038, this.anInt2032);
	}
}
