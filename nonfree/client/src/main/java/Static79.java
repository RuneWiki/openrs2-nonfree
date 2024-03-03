import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!ug;)V", line = 17)
	public static void method1908(@OriginalArg(1) Class2_Sub37 arg0) {
		if (Static307.aClass67ArrayArrayArray3 == null) {
			return;
		}
		@Pc(8) Interface6 local8 = null;
		if (arg0.anInt6479 == 0) {
			local8 = (Interface6) Static12.method283(arg0.anInt6469, arg0.anInt6472, arg0.anInt6474);
		}
		if (arg0.anInt6479 == 1) {
			local8 = (Interface6) Static27.method893(arg0.anInt6469, arg0.anInt6472, arg0.anInt6474);
		}
		if (arg0.anInt6479 == 2) {
			local8 = (Interface6) Static98.method2209(arg0.anInt6469, arg0.anInt6472, arg0.anInt6474, id.class);
		}
		if (arg0.anInt6479 == 3) {
			local8 = (Interface6) Static25.method865(arg0.anInt6469, arg0.anInt6472, arg0.anInt6474);
		}
		if (local8 == null) {
			arg0.anInt6481 = 0;
			arg0.anInt6470 = 0;
			arg0.anInt6480 = -1;
		} else {
			arg0.anInt6480 = local8.method6086();
			arg0.anInt6470 = local8.method6082();
			arg0.anInt6481 = local8.method6085();
		}
	}
}
