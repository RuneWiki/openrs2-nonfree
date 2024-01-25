import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	public int anInt1599;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public int anInt1600;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	public int anInt1602;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public int anInt1596 = -1;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	public int anInt1604 = -1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(6) Class29 local6 = arg0.method5866();
		local6.U(super.anInt1588, super.anInt1589, super.anInt1590);
		@Pc(20) Class88_Sub2 local20 = Static232.method3033(3);
		@Pc(41) Class57 local41;
		if (this.anInt1596 != -1) {
			local41 = Static306.aClass67_3.method1452(this.anInt1596).method983(-1, arg0, this.anInt1598, null, 0, null, 2048, 0);
			if (local41 != null) {
				local41.method6060(local6, local20.aClass88_Sub8Array1[2], 0);
			}
		}
		if (this.anInt1604 != -1) {
			local41 = Static306.aClass67_3.method1452(this.anInt1604).method983(-1, arg0, this.anInt1599, null, 0, null, 2048, 0);
			if (local41 != null) {
				local41.method6060(local6, local20.aClass88_Sub8Array1[1], 0);
			}
		}
		local41 = Static306.aClass67_3.method1452(this.anInt1600).method983(-1, arg0, this.anInt1602, null, 0, null, 2048, 0);
		if (local41 != null) {
			local41.method6060(local6, local20.aClass88_Sub8Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class29 local6 = arg0.method5866();
		local6.U(super.anInt1588, super.anInt1589, super.anInt1590);
		@Pc(31) Class57 local31 = Static306.aClass67_3.method1452(this.anInt1600).method983(-1, arg0, this.anInt1602, null, 0, null, 131072, 0);
		if (local31 != null && local31.method6071(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt1604 != -1) {
			local31 = Static306.aClass67_3.method1452(this.anInt1604).method983(-1, arg0, this.anInt1599, null, 0, null, 131072, 0);
			if (local31 != null && local31.method6071(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt1596 != -1) {
			local31 = Static306.aClass67_3.method1452(this.anInt1596).method983(-1, arg0, this.anInt1598, null, 0, null, 131072, 0);
			if (local31 != null && local31.method6071(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
