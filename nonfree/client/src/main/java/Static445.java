import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!rda;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Z")
	public static boolean aBoolean599 = false;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method6827(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(2, arg0);
		local8.method3826();
		local8.aString50 = arg1;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIBII)V")
	public static void method6828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static104.aClass6_Sub6_Sub1_4.anInt1155 != 0 && arg0 != 0 && Static521.anInt9062 < 50 && arg1 != -1) {
			Static360.aClass161Array1[Static521.anInt9062++] = new Class161((byte) 1, arg1, arg0, arg3, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!iaa;I)Lclient!cc;")
	public static Class6_Sub1 method6831(@OriginalArg(0) Class6_Sub26 arg0) {
		arg0.method4966();
		@Pc(13) int local13 = arg0.method4966();
		@Pc(22) Class6_Sub1 local22 = Static489.method7370(local13);
		local22.anInt9808 = arg0.method4966();
		@Pc(31) int local31 = arg0.method4966();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method4966();
			local22.method8167(local39, arg0);
		}
		local22.method8160();
		return local22;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
	public static void method6832() {
		Static539.aClass339_6.method7933();
		Static165.aClass25_3.method986();
		Static517.aClass285_2.method7164();
		Static480.aClass57_11.method1466();
		Static504.aClass343_2.method7996();
		Static98.aClass203_1.method4906();
		Static114.aClass156_2.method4106();
		Static355.aClass278_2.method6835();
		Static177.aClass171_1.method4471();
		Static329.aClass294_1.method7332();
		Static416.aClass250_1.method6263();
		Static17.aClass42_3.method1148();
		Static109.aClass226_3.method5637();
		Static499.aClass118_2.method3495();
		Static72.aClass165_1.method4284();
		Static61.aClass15_1.method639();
		Static273.aClass115_1.method3456();
		Static116.aClass110_1.method2918();
		Static106.aClass205_1.method4918();
		Static370.aClass17_1.method652();
		Static502.method7496();
		Static253.method4430();
		Static572.method8058();
		Static423.method6545();
		Static268.aClass245_63.method6083(5);
		Static272.aClass245_42.method6083(5);
		Static208.aClass245_35.method6083(5);
		Static6.aClass245_7.method6083(5);
		Static89.aClass245_23.method6083(5);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Z")
	public static boolean method6833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
