import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
	public int anInt3580;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	public int anInt3581;

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
	public int anInt3582;

	@OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
	public int anInt3588;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	public int anInt3578 = -1;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
	public int anInt3585 = -1;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(6) Class23 local6 = arg2.method4466();
		local6.method5091(super.anInt3567, super.anInt3568, super.anInt3572);
		@Pc(30) Class5 local30 = Static247.method4270(this.anInt3582).method3723(0, arg2, -1, this.anInt3588, null, 65536, null, 0);
		if (local30 != null && local30.method3995(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt3585 != -1) {
			local30 = Static247.method4270(this.anInt3585).method3723(0, arg2, -1, this.anInt3581, null, 65536, null, 0);
			if (local30 != null && local30.method3995(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt3578 != -1) {
			local30 = Static247.method4270(this.anInt3578).method3723(0, arg2, -1, this.anInt3580, null, 65536, null, 0);
			if (local30 != null && local30.method3995(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		@Pc(6) Class23 local6 = arg0.method4466();
		local6.method5091(super.anInt3567, super.anInt3568, super.anInt3572);
		@Pc(18) Class17_Sub2 local18 = Static238.method4100(3);
		@Pc(38) Class5 local38;
		if (this.anInt3578 != -1) {
			local38 = Static247.method4270(this.anInt3578).method3723(0, arg0, -1, this.anInt3580, null, 1024, null, 0);
			if (local38 != null) {
				local38.method4029(local6, local18.aClass17_Sub6Array1[2], 0);
			}
		}
		if (this.anInt3585 != -1) {
			local38 = Static247.method4270(this.anInt3585).method3723(0, arg0, -1, this.anInt3581, null, 1024, null, 0);
			if (local38 != null) {
				local38.method4029(local6, local18.aClass17_Sub6Array1[1], 0);
			}
		}
		local38 = Static247.method4270(this.anInt3582).method3723(0, arg0, -1, this.anInt3588, null, 1024, null, 0);
		if (local38 != null) {
			local38.method4029(local6, local18.aClass17_Sub6Array1[0], 0);
		}
		return local18;
	}
}
