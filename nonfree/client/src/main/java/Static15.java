import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public static int anInt2963;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	public static int anInt2965;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1190 = Static121.method2047("Location");

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1187 = aClass60_1190;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1189 = Static121.method2047("Create a free account");

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1188 = aClass60_1189;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public static int anInt2962 = 0;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "[B")
	public static byte[] aByteArray126 = new byte[520];

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1191 = Static121.method2047("<col=ffffff>");

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Lclient!mf;")
	public static Class48 aClass48_66 = new Class48(30);

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1192 = Static121.method2047("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Throwable;BLjava/lang/String;)V")
	public static void method2092(@OriginalArg(0) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static2.method991(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static26.aClass35_1.anApplet1 != null) {
				@Pc(108) Class30 local108 = Static26.aClass35_1.method985(new URL(Static26.aClass35_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static76.anInt1898 + "&u=" + Static62.aLong61 + "&v1=" + Static53.aString1 + "&v2=" + Static53.aString3 + "&e=" + local7));
				while (local108.anInt1209 == 0) {
					Static13.method278(1L);
				}
				if (local108.anInt1209 == 1) {
					@Pc(127) DataInputStream local127 = (DataInputStream) local108.anObject3;
					local127.read();
					local127.close();
				}
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!qc;)Z")
	public static boolean method2093(@OriginalArg(1) Class60 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static46.anInt1193; local16++) {
			if (arg0.method1661(Static61.aClass60Array12[local16])) {
				return true;
			}
		}
		return arg0.method1661(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass60_1066);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(ILclient!lc;Lclient!lc;)V")
	public static void method2095(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1) {
		Static1.aClass40_1 = arg1;
		Static98.aClass40_71 = arg0;
		Static18.anInt455 = Static98.aClass40_71.method1114(3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIBII)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static121.aClass4_Sub4_Sub3_Sub1Array10[0].method431(arg4, arg0);
		Static121.aClass4_Sub4_Sub3_Sub1Array10[1].method431(arg4, arg1 + arg0 - 16);
		@Pc(27) int local27 = (arg1 - 32) * arg1 / arg2;
		if (local27 < 8) {
			local27 = 8;
		}
		Static80.method1705(arg4, arg0 + 16, 16, arg1 - 32, Static60.anInt2334);
		@Pc(58) int local58 = (arg1 - local27 - 32) * arg3 / (arg2 - arg1);
		Static80.method1705(arg4, arg0 + local58 + 16, 16, local27, Static41.anInt1035);
		Static80.method1713(arg4, local58 + arg0 + 16, local27, Static14.anInt3010);
		Static80.method1713(arg4 + 1, local58 + 16 + arg0, local27, Static14.anInt3010);
		Static80.method1720(arg4, local58 + arg0 + 16, 16, Static14.anInt3010);
		Static80.method1720(arg4, arg0 + local58 + 17, 16, Static14.anInt3010);
		Static80.method1713(arg4 + 15, arg0 - -local58 + 16, local27, Static112.anInt2728);
		Static80.method1713(arg4 + 14, arg0 + 17 + local58, local27 - 1, Static112.anInt2728);
		Static80.method1720(arg4, arg0 + local58 + local27 + 15, 16, Static112.anInt2728);
		Static80.method1720(arg4 + 1, local58 + 14 + arg0 + local27, 15, Static112.anInt2728);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
	public static void method2098() {
		aClass60_1192 = null;
		aClass60_1187 = null;
		aClass48_66 = null;
		aByteArray126 = null;
		aClass60_1189 = null;
		aClass60_1188 = null;
		aClass60_1191 = null;
		aClass60_1190 = null;
	}
}
