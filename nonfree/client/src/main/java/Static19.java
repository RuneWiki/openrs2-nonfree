import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!au", name = "v", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_8 = new Class7("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!au", name = "D", descriptor = "[I")
	public static int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Z")
	public static boolean method495(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIBIII)V")
	public static void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static28.anInt644 <= arg3 && arg1 <= Static125.anInt2545 && Static108.anInt2276 <= arg0 && Static173.anInt3208 >= arg2) {
			Static274.method4027(arg1, arg4, arg0, arg2, arg3);
		} else {
			Static194.method3004(arg3, arg4, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V")
	public static void method500() {
		Static344.aClass42_5.method1290();
		Static396.aClass205_5.method4754();
		Static184.aClass158_1.method3690();
		Static349.aClass115_4.method2771();
		Static238.aClass116_2.method2824();
		Static165.aClass19_1.method557();
		Static293.aClass127_1.method2979();
		Static67.aClass263_2.method5776();
		Static45.aClass36_4.method877();
		Static405.aClass252_1.method5551();
		Static117.aClass75_1.method1987();
		Static343.aClass217_15.method4902();
		Static17.aClass78_3.method2112();
		Static28.aClass239_1.method5340();
		Static400.aClass35_2.method869();
		Static303.aClass161_1.method3746();
		Static117.aClass142_1.method3364();
		Static316.aClass167_1.method3839();
		Static305.aClass84_2.method2220();
		Static274.aClass124_1.method2967();
		Static312.method4442();
		Static308.method4376();
		Static370.method5072();
		Static18.method2990();
		Static409.aClass134_54.method3267();
		Static319.aClass134_35.method3267();
		Static431.aClass134_56.method3267();
		Static452.aClass134_59.method3267();
		Static13.aClass134_1.method3267();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BLclient!ul;I)Lclient!lm;")
	public static Class151 method501(@OriginalArg(1) Class246 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method5499(arg1);
		return local13 == null ? null : new Class151(local13);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!uq;III)V")
	public static void method504(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray14 != null) {
			@Pc(13) Class1_Sub24 local13 = new Class1_Sub24();
			local13.anObjectArray3 = arg0.anObjectArray14;
			local13.aClass251_5 = arg0;
			Static13.method366(local13);
		}
		Static410.anInt6626 = arg2;
		Static347.anInt5821 = arg0.anInt6664;
		Static355.aBoolean412 = true;
		Static314.anInt5418 = arg0.anInt6689;
		Static221.anInt2659 = arg0.anInt6732;
		Static135.anInt2708 = arg0.anInt6679;
		Static92.anInt1948 = arg0.anInt6704;
		Static161.anInt3018 = arg1;
		Static408.method5469(arg0);
	}
}
