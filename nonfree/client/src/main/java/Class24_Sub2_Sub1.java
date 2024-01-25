import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class24_Sub2_Sub1 extends Class24_Sub2 {

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public int anInt3067;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	public int anInt3069;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	public int anInt3072;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
	public int anInt3074;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	public int anInt3073 = -1;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public int anInt3070 = -1;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Lclient!za;I)Lclient!nd;")
	@Override
	public Class40_Sub5 method5686(@OriginalArg(0) Class50 arg0) {
		@Pc(6) Class34 local6 = arg0.method5819();
		local6.U(super.anInt3060, super.anInt3063, super.anInt3061);
		@Pc(18) Class40_Sub5 local18 = Static171.method2916(3);
		@Pc(39) Class63 local39;
		if (this.anInt3073 != -1) {
			local39 = Static313.aClass272_2.method6068(this.anInt3073).method1534(2048, 0, -1, null, arg0, 0, null, this.anInt3069);
			if (local39 != null) {
				local39.method6090(local6, local18.aClass40_Sub8Array1[2], 0);
			}
		}
		if (this.anInt3070 != -1) {
			local39 = Static313.aClass272_2.method6068(this.anInt3070).method1534(2048, 0, -1, null, arg0, 0, null, this.anInt3074);
			if (local39 != null) {
				local39.method6090(local6, local18.aClass40_Sub8Array1[1], 0);
			}
		}
		local39 = Static313.aClass272_2.method6068(this.anInt3072).method1534(2048, 0, -1, null, arg0, 0, null, this.anInt3067);
		if (local39 != null) {
			local39.method6090(local6, local18.aClass40_Sub8Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method5685(@OriginalArg(1) Class50 arg0) {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!za;II)Z")
	@Override
	public boolean method5691(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class34 local12 = arg0.method5819();
		local12.U(super.anInt3060, super.anInt3063, super.anInt3061);
		@Pc(37) Class63 local37 = Static313.aClass272_2.method6068(this.anInt3072).method1534(131072, 0, -1, null, arg0, 0, null, this.anInt3067);
		if (local37 != null && local37.method6101(arg2, arg1, local12, true)) {
			return true;
		}
		if (this.anInt3070 != -1) {
			local37 = Static313.aClass272_2.method6068(this.anInt3070).method1534(131072, 0, -1, null, arg0, 0, null, this.anInt3074);
			if (local37 != null && local37.method6101(arg2, arg1, local12, true)) {
				return true;
			}
		}
		if (this.anInt3073 != -1) {
			local37 = Static313.aClass272_2.method6068(this.anInt3073).method1534(131072, 0, -1, null, arg0, 0, null, this.anInt3069);
			if (local37 != null && local37.method6101(arg2, arg1, local12, true)) {
				return true;
			}
		}
		return false;
	}
}
