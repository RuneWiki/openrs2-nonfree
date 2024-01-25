import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static193 {

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "Lclient!sj;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!ls", name = "Q", descriptor = "Lclient!gj;")
	public static Class31 aClass31_84;

	@OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
	public static int anInt3777;

	@OriginalMember(owner = "client!ls", name = "T", descriptor = "Lclient!qs;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!ls", name = "P", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_74 = new Class93("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "(B)V")
	public static void method3474() {
		Static125.method2616(25);
		Static266.method4815();
		System.gc();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILclient!mj;Lclient!mj;)V")
	public static void method3476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62_Sub4 arg3, @OriginalArg(4) Class62_Sub4 arg4) {
		if (Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static65.method1493(arg0, arg1, arg2);
		}
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub4_2 = arg3;
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub4_1 = arg4;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!gk;B)V")
	public static void method3477(@OriginalArg(0) Class55_Sub2 arg0) {
		arg0.aClass62_Sub1_Sub2_1 = null;
		if (Static52.anInt1117 < 20) {
			Static278.aClass67_8.method2100(arg0);
			Static52.anInt1117++;
		}
	}
}
