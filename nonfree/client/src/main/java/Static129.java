import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!hs;")
	public static Class103 aClass103_3;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_91 = new Class175("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "[I")
	public static final int[] anIntArray223 = new int[2];

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
	public static final byte[] aByteArray35 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)V")
	public static void method2230(@OriginalArg(0) int arg0) {
		Static440.anInt7506 = arg0;
		Static229.aClass5_36.method116();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public static int method2231() {
		try {
			if (Static100.anInt2238 == 0) {
				if (Static45.aLong36 > Static150.method2672() - 5000L) {
					return 0;
				}
				Static164.aClass190_5 = Static295.aClass103_5.method2834(Static266.aString50, Static446.anInt7542);
				Static400.aLong202 = Static150.method2672();
				Static100.anInt2238 = 1;
			}
			if (Static150.method2672() > Static400.aLong202 + 30000L) {
				return Static285.method4195(1000);
			}
			@Pc(73) int local73;
			@Pc(105) int local105;
			if (Static100.anInt2238 == 1) {
				if (Static164.aClass190_5.anInt5799 == 2) {
					return Static285.method4195(1001);
				}
				if (Static164.aClass190_5.anInt5799 != 1) {
					return -1;
				}
				Static122.aClass27_1 = new Class27((Socket) Static164.aClass190_5.anObject7, Static295.aClass103_5);
				Static164.aClass190_5 = null;
				local73 = 0;
				if (Static24.aBoolean41) {
					local73 = Static9.anInt258;
				}
				Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
				Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_9.anInt1611);
				Static302.aClass3_Sub2_Sub2_2.method6008(local73);
				Static122.aClass27_1.method891(Static302.aClass3_Sub2_Sub2_2.aByteArray95, Static302.aClass3_Sub2_Sub2_2.anInt7620);
				Static212.method3428();
				local105 = Static122.aClass27_1.method890();
				Static212.method3428();
				if (local105 != 0) {
					return Static285.method4195(local105);
				}
				Static100.anInt2238 = 2;
			}
			if (Static100.anInt2238 == 2) {
				if (Static122.aClass27_1.method894() < 2) {
					return -1;
				}
				Static170.anInt3580 = Static122.aClass27_1.method890();
				Static170.anInt3580 <<= 0x8;
				Static170.anInt3580 += Static122.aClass27_1.method890();
				Static100.anInt2238 = 3;
				Static444.anInt7530 = 0;
				Static122.aByteArray34 = new byte[Static170.anInt3580];
			}
			if (Static100.anInt2238 != 3) {
				return -1;
			}
			local73 = Static122.aClass27_1.method894();
			if (local73 < 1) {
				return -1;
			}
			if (Static170.anInt3580 - Static444.anInt7530 < local73) {
				local73 = Static170.anInt3580 - Static444.anInt7530;
			}
			Static122.aClass27_1.method896(Static122.aByteArray34, local73, Static444.anInt7530);
			Static444.anInt7530 += local73;
			if (Static444.anInt7530 < Static170.anInt3580) {
				return -1;
			} else if (Static222.method3519(Static122.aByteArray34)) {
				Static279.aClass145_Sub1Array9 = new Class145_Sub1[Static391.anInt6742];
				local105 = 0;
				for (@Pc(208) int local208 = Static177.anInt3619; local208 <= Static178.anInt3627; local208++) {
					@Pc(215) Class145_Sub1 local215 = Static318.method2568(local208);
					if (local215 != null) {
						Static279.aClass145_Sub1Array9[local105++] = local215;
					}
				}
				Static119.aClass3_Sub43_1 = null;
				Static309.anInt5632 = 0;
				Static122.aClass27_1.method893();
				Static122.aByteArray34 = null;
				Static357.anInt6422 = 0;
				Static122.aClass27_1 = null;
				Static100.anInt2238 = 0;
				Static45.aLong36 = Static150.method2672();
				return 0;
			} else {
				return Static285.method4195(1002);
			}
		} catch (@Pc(249) IOException local249) {
			return Static285.method4195(1003);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method2233(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class68 local8 = Static347.method4975(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray25 != null) {
			@Pc(18) Class3_Sub20 local18 = new Class3_Sub20();
			local18.aClass68_4 = local8;
			local18.anInt2711 = arg3;
			local18.anObjectArray35 = local8.anObjectArray25;
			local18.aString26 = arg0;
			Static272.method4044(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt2211 != 0) {
			local35 = Static264.method3992(local8);
		}
		if (!local35 || !Static56.method1160(local8).method3485(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static414.method5552(Static14.aClass92_17);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 2) {
			Static414.method5552(Static15.aClass92_18);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 3) {
			Static414.method5552(Static34.aClass92_32);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 4) {
			Static414.method5552(Static297.aClass92_193);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 5) {
			Static414.method5552(Static437.aClass92_250);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 6) {
			Static414.method5552(Static400.aClass92_230);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 7) {
			Static414.method5552(Static390.aClass92_224);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 8) {
			Static414.method5552(Static228.aClass92_255);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 9) {
			Static414.method5552(Static350.aClass92_209);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
		if (arg3 == 10) {
			Static414.method5552(Static366.aClass92_217);
			Static253.method3857(local8.anInt2192, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
	public static boolean method2234(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!es;")
	public static Class16 method2235(@OriginalArg(0) Component arg0) {
		return new Class16_Sub1(arg0);
	}
}
