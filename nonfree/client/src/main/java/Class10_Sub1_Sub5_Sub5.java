import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class10_Sub1_Sub5_Sub5 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	private int anInt2414 = 0;

	@OriginalMember(owner = "client!td", name = "Ab", descriptor = "Z")
	public boolean aBoolean109 = false;

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "I")
	private int anInt2423 = 0;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
	private final int anInt2419;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "I")
	public final int anInt2421;

	@OriginalMember(owner = "client!td", name = "Gb", descriptor = "I")
	public final int anInt2425;

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
	public final int anInt2409;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "I")
	public final int anInt2407;

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "I")
	public final int anInt2418;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "Lclient!ge;")
	private Class10_Sub1_Sub6 aClass10_Sub1_Sub6_2;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub1_Sub5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2419 = arg0;
		this.anInt2421 = arg4;
		this.anInt2425 = arg1;
		this.anInt2409 = arg5 + arg6;
		this.anInt2407 = arg2;
		this.anInt2418 = arg3;
		@Pc(36) int local36 = Static51.method789(this.anInt2419).anInt2185;
		if (local36 == -1) {
			this.aBoolean109 = true;
		} else {
			this.aBoolean109 = false;
			this.aClass10_Sub1_Sub6_2 = Static5.method33(local36);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		@Pc(13) Class10_Sub1_Sub14 local13 = Static51.method789(this.anInt2419);
		@Pc(22) Class10_Sub1_Sub5_Sub4 local22;
		if (this.aBoolean109) {
			local22 = local13.method1273(-1);
		} else {
			local22 = local13.method1273(this.anInt2423);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	public void method1494(@OriginalArg(0) int arg0) {
		if (this.aBoolean109) {
			return;
		}
		this.anInt2414 += arg0;
		while (this.aClass10_Sub1_Sub6_2.anIntArray109[this.anInt2423] < this.anInt2414) {
			this.anInt2414 -= this.aClass10_Sub1_Sub6_2.anIntArray109[this.anInt2423];
			this.anInt2423++;
			if (this.anInt2423 >= this.aClass10_Sub1_Sub6_2.anIntArray106.length) {
				this.aBoolean109 = true;
				return;
			}
		}
	}
}
