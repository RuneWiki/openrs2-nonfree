import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
	public static int anInt621;

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!ke;")
	public static Class43 aClass43_6;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!sg;")
	private static Class77 aClass77_272 = Static146.method2172("You have only just left another world)3");

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_273 = aClass77_272;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_274 = Static146.method2172("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_275 = null;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!lf;)V")
	public static void method440(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = 0;
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		if (arg0.anInt2385 == 0) {
			local10 = Static172.aClass60_1.method2077(arg0.anInt2392, arg0.anInt2376, arg0.anInt2386);
		}
		if (arg0.anInt2385 == 1) {
			local10 = Static172.aClass60_1.method2082(arg0.anInt2392, arg0.anInt2376, arg0.anInt2386);
		}
		if (arg0.anInt2385 == 2) {
			local10 = Static172.aClass60_1.method2063(arg0.anInt2392, arg0.anInt2376, arg0.anInt2386);
		}
		if (arg0.anInt2385 == 3) {
			local10 = Static172.aClass60_1.method2072(arg0.anInt2392, arg0.anInt2376, arg0.anInt2386);
		}
		if (local10 != 0) {
			@Pc(86) int local86 = Static172.aClass60_1.method2059(arg0.anInt2392, arg0.anInt2376, arg0.anInt2386, local10);
			local8 = local86 >> 6 & 0x3;
			local12 = local86 & 0x1F;
			local6 = local10 >> 14 & 0x7FFF;
		}
		arg0.anInt2378 = local12;
		arg0.anInt2389 = local6;
		arg0.anInt2391 = local8;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method441(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static84.method2216(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static132.aClass50_3.anApplet1 != null) {
				@Pc(101) Class78 local101 = Static132.aClass50_3.method1744(new URL(Static132.aClass50_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static72.anInt1933 + "&u=" + Static40.aLong39 + "&v1=" + Static95.aString5 + "&v2=" + Static95.aString3 + "&e=" + local7));
				while (local101.anInt3646 == 0) {
					Static27.method564(1L);
				}
				if (local101.anInt3646 == 1) {
					@Pc(125) DataInputStream local125 = (DataInputStream) local101.anObject3;
					local125.read();
					local125.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	public static void method442() {
		Static174.anInt4449 = 0;
		Static72.anInt1932 = 0;
		Static153.method2616();
		Static174.method2939();
		Static176.method2958();
		Static177.method2965();
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static72.anInt1932; local24++) {
			local30 = Static33.anIntArray149[local24];
			if (Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local30].anInt4401 != Static143.anInt3513) {
				Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local30] = null;
			}
		}
		if (Static25.anInt731 != Static74.aClass2_Sub18_Sub1_1.anInt3423) {
			throw new RuntimeException("gpp1 pos:" + Static74.aClass2_Sub18_Sub1_1.anInt3423 + " psize:" + Static25.anInt731);
		}
		for (local30 = 0; local30 < Static124.anInt3042; local30++) {
			if (Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[Static177.anIntArray632[local30]] == null) {
				throw new RuntimeException("gpp2 pos:" + local30 + " size:" + Static124.anInt3042);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method443() {
		aClass77_274 = null;
		aClass77_273 = null;
		aClass77_272 = null;
		aClass77_275 = null;
		aClass43_6 = null;
	}
}
