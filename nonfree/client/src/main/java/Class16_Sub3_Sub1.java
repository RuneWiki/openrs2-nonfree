import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class16_Sub3_Sub1 extends Class16_Sub3 {

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
	public int anInt752;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
	public int anInt746 = -1;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
	public int anInt758 = -1;

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5335(@OriginalArg(0) Class19 arg0) {
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!ya;I)Z")
	@Override
	public boolean method5341(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class31 local6 = arg1.method4289();
		local6.j(super.anInt744, super.anInt739, super.anInt737);
		@Pc(31) Class110 local31 = Static444.aClass206_3.method4703(this.anInt755).method4773(0, this.anInt756, null, 131072, -1, null, 0, arg1);
		if (local31 != null && local31.method4894(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt758 != -1) {
			local31 = Static444.aClass206_3.method4703(this.anInt758).method4773(0, this.anInt752, null, 131072, -1, null, 0, arg1);
			if (local31 != null && local31.method4894(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt746 != -1) {
			local31 = Static444.aClass206_3.method4703(this.anInt746).method4773(0, this.anInt749, null, 131072, -1, null, 0, arg1);
			if (local31 != null && local31.method4894(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(Lclient!ya;I)Lclient!fk;")
	@Override
	public Class3_Sub3 method5339(@OriginalArg(0) Class19 arg0) {
		@Pc(6) Class31 local6 = arg0.method4289();
		local6.j(super.anInt744, super.anInt739, super.anInt737);
		@Pc(18) Class3_Sub3 local18 = Static38.method672(3);
		@Pc(46) Class110 local46;
		if (this.anInt746 != -1) {
			local46 = Static444.aClass206_3.method4703(this.anInt746).method4773(0, this.anInt749, null, 2048, -1, null, 0, arg0);
			if (local46 != null) {
				local46.method4889(local6, local18.aClass3_Sub5Array1[2], 0);
			}
		}
		if (this.anInt758 != -1) {
			local46 = Static444.aClass206_3.method4703(this.anInt758).method4773(0, this.anInt752, null, 2048, -1, null, 0, arg0);
			if (local46 != null) {
				local46.method4889(local6, local18.aClass3_Sub5Array1[1], 0);
			}
		}
		local46 = Static444.aClass206_3.method4703(this.anInt755).method4773(0, this.anInt756, null, 2048, -1, null, 0, arg0);
		if (local46 != null) {
			local46.method4889(local6, local18.aClass3_Sub5Array1[0], 0);
		}
		return local18;
	}
}
