import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uha", name = "t", descriptor = "I")
	public static int anInt9589;

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "I")
	public static int anInt9577 = 0;

	@OriginalMember(owner = "client!uha", name = "f", descriptor = "Lclient!aia;")
	public static final Class15 aClass15_9 = new Class15("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Z)V")
	public static void method8234(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		Static95.aString23 = arg1;
		Static148.aBoolean201 = arg2;
		Static221.aString43 = arg0;
		if (!Static148.aBoolean201 && (Static221.aString43.equals("") || Static95.aString23.equals(""))) {
			Static606.method8671(3);
			return;
		}
		Static353.aBoolean428 = false;
		if (Static10.anInt220 != 1) {
			Static141.anInt2455 = -1;
			Static556.anInt9403 = 0;
		}
		Static606.method8671(-3);
		Static548.anInt9248 = 1;
		Static450.anInt7672 = 0;
		Static583.anInt9799 = 0;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method8235(@OriginalArg(0) Class133 arg0) {
		Static602.aClass55_16 = Static170.method2646(Static313.anInt5371, arg0, true);
		Static1.aClass272_18 = method8236(arg0, Static313.anInt5371);
		Static281.aClass55_8 = Static170.method2646(Static164.anInt2742, arg0, true);
		Static199.aClass272_7 = method8236(arg0, Static164.anInt2742);
		Static16.aClass55_1 = Static170.method2646(Static37.anInt601, arg0, true);
		Static485.aClass272_16 = method8236(arg0, Static37.anInt601);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ILclient!ha;I)Lclient!pia;")
	public static Class272 method8236(@OriginalArg(1) Class133 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class214 local14 = Static352.method5258(true, arg0, arg1);
		return local14 == null ? null : local14.aClass272_10;
	}
}
