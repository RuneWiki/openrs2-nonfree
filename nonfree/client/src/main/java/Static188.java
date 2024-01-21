import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1 aClass2_Sub2_Sub17_Sub1_5;

	@OriginalMember(owner = "client!u", name = "N", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1089 = Static181.method2795("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!u", name = "P", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1090 = Static181.method2795("gleiten:");

	@OriginalMember(owner = "client!u", name = "S", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1091 = Static181.method2795("<col=ff0000>");

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_1092 = Static181.method2795("sl_back");

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Throwable;)V")
	public static void method2856(@OriginalArg(0) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(17) String local17 = "";
			if (arg1 != null) {
				local17 = Static172.method2657(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local17 = local17 + " | ";
				}
				local17 = local17 + arg0;
			}
			System.out.println("Error: " + local17);
			local17 = local17.replace(':', '.');
			local17 = local17.replace('@', '_');
			local17 = local17.replace('&', '_');
			local17 = local17.replace('#', '_');
			if (Static191.aClass1_4.anApplet1 != null) {
				@Pc(111) Class15 local111 = Static191.aClass1_4.method3(new URL(Static191.aClass1_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static212.anInt4234 + "&u=" + Static16.aLong78 + "&v1=" + Static1.aString3 + "&v2=" + Static1.aString2 + "&e=" + local17));
				while (local111.anInt624 == 0) {
					Static119.method2069(1L);
				}
				if (local111.anInt624 == 1) {
					@Pc(130) DataInputStream local130 = (DataInputStream) local111.anObject1;
					local130.read();
					local130.close();
				}
			}
		} catch (@Pc(137) Exception local137) {
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!eh;BLclient!eh;Lclient!jd;Lclient!eh;)Z")
	public static boolean method2857(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1, @OriginalArg(3) Class2_Sub9_Sub3 arg2, @OriginalArg(4) Class28 arg3) {
		Static211.aClass2_Sub9_Sub3_2 = arg2;
		Static8.aClass28_13 = arg3;
		Static29.aClass28_38 = arg1;
		Static214.aClass28_202 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!eb;ZI)V")
	public static void method2858(@OriginalArg(0) Class25 arg0, @OriginalArg(1) boolean arg1) {
		if (Static74.aClass25_4 != null) {
			try {
				Static74.aClass25_4.method796();
			} catch (@Pc(12) Exception local12) {
			}
			Static74.aClass25_4 = null;
		}
		Static74.aClass25_4 = arg0;
		Static46.method855(arg1);
		Static125.aClass2_Sub3_1.anInt340 = 0;
		Static206.anInt4066 = 0;
		Static168.aClass2_Sub3_3 = null;
		Static63.aClass2_Sub2_Sub15_3 = null;
		while (true) {
			@Pc(40) Class2_Sub2_Sub15 local40 = (Class2_Sub2_Sub15) Static170.aClass63_14.method2114();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub2_Sub15) Static96.aClass63_9.method2114();
					if (local40 == null) {
						if (Static78.aByte6 != 0) {
							try {
								@Pc(92) Class2_Sub3 local92 = new Class2_Sub3(4);
								local92.method247(4);
								local92.method247(Static78.aByte6);
								local92.method239(0);
								Static74.aClass25_4.method800(local92.aByteArray2, 4);
							} catch (@Pc(115) IOException local115) {
								try {
									Static74.aClass25_4.method796();
								} catch (@Pc(120) Exception local120) {
								}
								Static167.anInt3455++;
								Static74.aClass25_4 = null;
							}
						}
						Static177.anInt3617 = 0;
						Static166.aLong118 = Static68.method1276();
						return;
					}
					Static50.aClass71_1.method2229(local40);
					Static152.aClass63_13.method2115(local40.aLong149, local40);
					Static167.anInt3454++;
					Static78.anInt1772--;
				}
			}
			Static90.aClass63_8.method2115(local40.aLong149, local40);
			Static41.anInt1039++;
			Static68.anInt1623--;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)I")
	public static int method2859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(31) int local31 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local31;
		}
		return arg1;
	}
}
