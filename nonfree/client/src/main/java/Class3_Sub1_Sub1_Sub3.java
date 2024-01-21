import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class3_Sub1_Sub1_Sub3 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!fb", name = "xb", descriptor = "I")
	private int anInt906 = 0;

	@OriginalMember(owner = "client!fb", name = "Fb", descriptor = "I")
	private int anInt910 = 0;

	@OriginalMember(owner = "client!fb", name = "Tb", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!fb", name = "Yb", descriptor = "I")
	public final int anInt921;

	@OriginalMember(owner = "client!fb", name = "Sb", descriptor = "I")
	public final int anInt918;

	@OriginalMember(owner = "client!fb", name = "Vb", descriptor = "I")
	public final int anInt919;

	@OriginalMember(owner = "client!fb", name = "Hb", descriptor = "I")
	public final int anInt912;

	@OriginalMember(owner = "client!fb", name = "Nb", descriptor = "I")
	private final int anInt917;

	@OriginalMember(owner = "client!fb", name = "Kb", descriptor = "I")
	public final int anInt915;

	@OriginalMember(owner = "client!fb", name = "zb", descriptor = "Lclient!m;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt921 = arg3;
		this.anInt918 = arg4;
		this.anInt919 = arg6 + arg5;
		this.anInt912 = arg1;
		this.anInt917 = arg0;
		this.anInt915 = arg2;
		@Pc(37) int local37 = Static47.method827(this.anInt917).anInt2212;
		if (local37 == -1) {
			this.aBoolean57 = true;
		} else {
			this.aBoolean57 = false;
			this.aClass3_Sub1_Sub6_1 = Static67.method1107(local37);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
	public void method617(@OriginalArg(1) int arg0) {
		if (this.aBoolean57) {
			return;
		}
		this.anInt910 += arg0;
		while (this.anInt910 > this.aClass3_Sub1_Sub6_1.anIntArray224[this.anInt906]) {
			this.anInt910 -= this.aClass3_Sub1_Sub6_1.anIntArray224[this.anInt906];
			this.anInt906++;
			if (this.aClass3_Sub1_Sub6_1.anIntArray220.length <= this.anInt906) {
				this.aBoolean57 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		@Pc(8) Class3_Sub1_Sub15 local8 = Static47.method827(this.anInt917);
		@Pc(25) Class3_Sub1_Sub1_Sub4 local25;
		if (this.aBoolean57) {
			local25 = local8.method1484(-1);
		} else {
			local25 = local8.method1484(this.anInt906);
		}
		return local25 == null ? null : local25;
	}
}
