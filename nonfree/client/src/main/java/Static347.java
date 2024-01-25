import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rf", name = "J", descriptor = "Lclient!ph;")
	public static Class187 aClass187_106;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[200];

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method4710() {
		if (Static358.anInt6086 == 8) {
			Static458.method6071(4);
		} else if (Static358.anInt6086 == 4 || Static358.anInt6086 == 5) {
			Static458.method6071(2);
		} else if (Static358.anInt6086 == 11) {
			Static458.method6071(2);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!rk;B)Z")
	public static boolean method4711(@OriginalArg(0) Class208 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean386) {
			return false;
		} else if (!arg0.method4759(Static143.anInterface5_2)) {
			return false;
		} else if (Static210.aClass167_6.method3709((long) arg0.anInt6001) == null) {
			return Static108.aClass167_11.method3709((long) arg0.anInt6003) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILclient!ms;IBIIIILclient!ms;)V")
	public static void method4712(@OriginalArg(0) int arg0, @OriginalArg(2) Class24_Sub3_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class24_Sub3_Sub2 arg6) {
		@Pc(7) int local7 = arg6.method4908();
		if (local7 == -1) {
			return;
		}
		@Pc(23) Class80 local23 = (Class80) Static359.aClass267_64.method6014((long) local7);
		if (local23 == null) {
			@Pc(30) Class66[] local30 = Static463.method1664(Static21.aClass187_8, local7);
			if (local30 == null) {
				return;
			}
			local23 = Static412.aClass50_8.method5861(local30[0]);
			Static359.aClass267_64.method6008(local23, (long) local7);
		}
		Static95.method1725(arg1.anInt7094, arg1.method4919() * 64, 0, arg2 >> 1, arg1.aByte98, arg0 >> 1, arg1.anInt7092);
		@Pc(78) int local78 = arg3 + Static394.anIntArray650[0] - 18;
		@Pc(86) int local86 = local78 + arg4 / 4 * 18;
		@Pc(101) int local101 = Static394.anIntArray650[1] + arg5 - 16 - 54;
		@Pc(109) int local109 = local101 + arg4 % 4 * 18;
		local23.method5558(local86, local109);
		if (arg6 == arg1) {
			Static412.aClass50_8.method5834(18, local86 - 1, -256, 18, local109 - 1);
		}
		@Pc(131) Class40_Sub3 local131 = Static396.method5260();
		local131.anInt2647 = local86 + 16;
		local131.anInt2646 = local109;
		local131.aClass24_Sub3_Sub2_1 = arg6;
		local131.anInt2650 = local109 + 16;
		local131.anInt2648 = local86;
		Static427.aClass240_7.method5225(local131);
	}
}
