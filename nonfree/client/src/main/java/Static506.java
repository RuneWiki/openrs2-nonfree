import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tda", name = "t", descriptor = "Lclient!jw;")
	public static Class2_Sub27 aClass2_Sub27_3;

	@OriginalMember(owner = "client!tda", name = "Jb", descriptor = "I")
	public static int anInt8082 = -1;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(Z)V")
	public static void method6590() {
		if (Static394.aClass261_1 != null) {
			Static573.aClass264_1 = new Class264();
			Static573.aClass264_1.method5510(Static454.aLong200, Static394.aClass261_1.aClass159_65.method2776(Static261.anInt4297), Static394.aClass261_1, Static394.aClass261_1.anInt6597);
			Static55.aThread1 = new Thread(Static573.aClass264_1, "");
			Static55.aThread1.start();
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ILclient!gk;B)V")
	public static void method6594(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (Static466.aClass121_4 == null) {
			return;
		}
		try {
			Static466.aClass121_4.method2186(0L);
			Static466.aClass121_4.method2183(24, arg0, arg1.aByteArray52);
		} catch (@Pc(28) Exception local28) {
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZLclient!ifa;IIILclient!da;)V")
	public static void method6596(@OriginalArg(1) Class157 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class33 arg4) {
		if (arg4 != null) {
			arg0.method2757(arg4.l(), arg4.OA(), arg1, arg2, arg4.K(), arg4.H(), arg4.J(), arg4.KA(), arg4.za(), arg3);
		}
	}
}
