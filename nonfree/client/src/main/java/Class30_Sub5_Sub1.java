import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class30_Sub5_Sub1 extends Class30_Sub5 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public int anInt6413;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	public int anInt6415;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	public int anInt6419;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
	public int anInt6423;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
	public int anInt6417 = -1;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
	public int anInt6421 = -1;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		@Pc(6) Class40 local6 = arg0.method5918();
		local6.U(super.anInt6405, super.anInt6406, super.anInt6410);
		@Pc(24) Class41_Sub7 local24 = Static306.method4409(3);
		@Pc(46) Class17 local46;
		if (this.anInt6421 != -1) {
			local46 = Static43.aClass57_1.method1414(this.anInt6421).method3717(2048, 0, arg0, 0, null, this.anInt6419, null, -1);
			if (local46 != null) {
				local46.method6189(local6, local24.aClass41_Sub8Array1[2], 0);
			}
		}
		if (this.anInt6417 != -1) {
			local46 = Static43.aClass57_1.method1414(this.anInt6417).method3717(2048, 0, arg0, 0, null, this.anInt6423, null, -1);
			if (local46 != null) {
				local46.method6189(local6, local24.aClass41_Sub8Array1[1], 0);
			}
		}
		local46 = Static43.aClass57_1.method1414(this.anInt6413).method3717(2048, 0, arg0, 0, null, this.anInt6415, null, -1);
		if (local46 != null) {
			local46.method6189(local6, local24.aClass41_Sub8Array1[0], 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class40 local11 = arg0.method5918();
		local11.U(super.anInt6405, super.anInt6406, super.anInt6410);
		@Pc(36) Class17 local36 = Static43.aClass57_1.method1414(this.anInt6413).method3717(131072, 0, arg0, 0, null, this.anInt6415, null, -1);
		if (local36 != null && local36.method6203(arg2, arg1, local11, true)) {
			return true;
		}
		if (this.anInt6417 != -1) {
			local36 = Static43.aClass57_1.method1414(this.anInt6417).method3717(131072, 0, arg0, 0, null, this.anInt6423, null, -1);
			if (local36 != null && local36.method6203(arg2, arg1, local11, true)) {
				return true;
			}
		}
		if (this.anInt6421 != -1) {
			local36 = Static43.aClass57_1.method1414(this.anInt6421).method3717(131072, 0, arg0, 0, null, this.anInt6419, null, -1);
			if (local36 != null && local36.method6203(arg2, arg1, local11, true)) {
				return true;
			}
		}
		return false;
	}
}
