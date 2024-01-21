import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class4_Sub1_Sub3_Sub7 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!td", name = "db", descriptor = "Z")
	public boolean aBoolean251 = false;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
	private int anInt2829 = 0;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "I")
	private int anInt2825 = 0;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "I")
	public final int anInt2815;

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "I")
	public final int anInt2827;

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public final int anInt2817;

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "I")
	public final int anInt2831;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
	private final int anInt2826;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
	public final int anInt2830;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "Lclient!vc;")
	private Class4_Sub1_Sub17 aClass4_Sub1_Sub17_3;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub1_Sub3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2815 = arg1;
		this.anInt2827 = arg2;
		this.anInt2817 = arg5 + arg6;
		this.anInt2831 = arg3;
		this.anInt2826 = arg0;
		this.anInt2830 = arg4;
		@Pc(36) int local36 = Static33.method549(this.anInt2826).anInt2768;
		if (local36 == -1) {
			this.aBoolean251 = true;
		} else {
			this.aBoolean251 = false;
			this.aClass4_Sub1_Sub17_3 = Static79.method1437(local36);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)V")
	public void method1822(@OriginalArg(1) int arg0) {
		if (this.aBoolean251) {
			return;
		}
		this.anInt2825 += arg0;
		while (this.aClass4_Sub1_Sub17_3.anIntArray327[this.anInt2829] < this.anInt2825) {
			this.anInt2825 -= this.aClass4_Sub1_Sub17_3.anIntArray327[this.anInt2829];
			this.anInt2829++;
			if (this.aClass4_Sub1_Sub17_3.anIntArray330.length <= this.anInt2829) {
				this.aBoolean251 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		@Pc(14) Class4_Sub1_Sub14 local14 = Static33.method549(this.anInt2826);
		@Pc(22) Class4_Sub1_Sub3_Sub3 local22;
		if (this.aBoolean251) {
			local22 = local14.method1790(-1);
		} else {
			local22 = local14.method1790(this.anInt2829);
		}
		return local22 == null ? null : local22;
	}
}
