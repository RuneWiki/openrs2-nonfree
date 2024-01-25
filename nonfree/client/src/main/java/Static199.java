import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!cga;)V")
	public static void method3037(@OriginalArg(1) Class14_Sub9 arg0) {
		if (Static486.aClass58ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface19 local8 = null;
		if (arg0.anInt1591 == 0) {
			local8 = (Interface19) Static622.method8738(arg0.anInt1592, arg0.anInt1584, arg0.anInt1586);
		}
		if (arg0.anInt1591 == 1) {
			local8 = (Interface19) Static385.method5716(arg0.anInt1592, arg0.anInt1584, arg0.anInt1586);
		}
		if (arg0.anInt1591 == 2) {
			local8 = (Interface19) Static595.method8438(arg0.anInt1592, arg0.anInt1584, arg0.anInt1586, nq.class);
		}
		if (arg0.anInt1591 == 3) {
			local8 = (Interface19) Static430.method6312(arg0.anInt1592, arg0.anInt1584, arg0.anInt1586);
		}
		if (local8 == null) {
			arg0.anInt1582 = 0;
			arg0.anInt1583 = 0;
			arg0.anInt1589 = -1;
		} else {
			arg0.anInt1589 = local8.method9171();
			arg0.anInt1583 = local8.method9175();
			arg0.anInt1582 = local8.method9174();
		}
	}
}
