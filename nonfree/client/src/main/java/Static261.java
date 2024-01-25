import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kq", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString55;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_145 = new Class88("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "S")
	public static short aShort69 = 256;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
	public static int anInt5286 = 0;

	@OriginalMember(owner = "client!kq", name = "E", descriptor = "Lclient!vaa;")
	public static final Class299 aClass299_2 = new Class299();

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
	public static int anInt5287 = 0;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public static boolean method4417(@OriginalArg(0) String arg0) {
		return Static86.method1907(arg0);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
	public static void method4418() {
		@Pc(5) int local5 = 0;
		if (Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867)) {
			local5 = 55;
		}
		if (!Static208.aClass12_Sub10_Sub1_1.aBoolean180) {
			local5 |= 0x40;
		}
		Static432.method6608(local5);
		Static49.aClass155_2.method4073(local5);
		Static150.aClass254_2.method6346(local5);
		Static161.aClass110_3.method3023(local5);
		Static82.aClass212_2.method5067(local5);
		Static381.method6033(local5);
		Static58.method1433(local5);
		Static539.method7930(local5);
		Static540.method7947(local5);
		Static345.method5434();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!r;IILclient!nk;II)V")
	public static void method4419(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class218 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg2.method5246(arg0.va(), arg3, arg0.e(), arg0.U(), arg0.wa(), arg0.Q(), arg1, arg0.TA(), arg4, arg0.n());
		}
	}
}
