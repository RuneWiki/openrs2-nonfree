import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
	public static int anInt6891;

	@OriginalMember(owner = "client!ts", name = "ub", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_138 = new Class92(17, -1);

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(ILclient!tb;)V")
	public static void method5724(@OriginalArg(1) Class6_Sub40 arg0) {
		if (!Static250.aBoolean294) {
			arg0.method6525();
			Static151.anInt3129--;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public static void method5730() {
		@Pc(8) int local8 = Static298.aByteArrayArray20.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static298.aByteArrayArray20[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static100.anInt2218; local24++) {
					if (Static273.anIntArray327[local24] == Static411.anIntArray508[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static273.anIntArray327[Static100.anInt2218] = Static411.anIntArray508[local14];
					local22 = Static100.anInt2218++;
				}
				@Pc(68) Class6_Sub1 local68 = new Class6_Sub1(Static298.aByteArrayArray20[local14]);
				@Pc(70) int local70 = 0;
				while (Static298.aByteArrayArray20[local14].length > local68.anInt7898 && local70 < 511 && Static136.anInt2887 < 1023) {
					@Pc(89) int local89 = local70++ << 6 | local22;
					@Pc(93) int local93 = local68.method6485();
					@Pc(97) int local97 = local93 >> 14;
					@Pc(103) int local103 = local93 >> 7 & 0x3F;
					@Pc(107) int local107 = local93 & 0x3F;
					@Pc(121) int local121 = (Static411.anIntArray508[local14] >> 8) * 64 + local103 - Static2.anInt6396;
					@Pc(134) int local134 = (Static411.anIntArray508[local14] & 0xFF) * 64 + local107 - Static348.anInt6273;
					@Pc(141) Class48 local141 = Static235.aClass263_2.method6416(local68.method6485());
					if (Static308.aClass3_Sub2_Sub1_Sub1Array1[local89] == null && (local141.aByte28 & 0x1) > 0 && Static232.anInt4221 == local97 && local121 >= 0 && Static181.anInt3574 > local141.anInt1752 + local121 && local134 >= 0 && Static117.anInt2450 > local141.anInt1752 + local134) {
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local89] = new Class3_Sub2_Sub1_Sub1();
						Static308.aClass3_Sub2_Sub1_Sub1Array1[local89].anInt6602 = local89;
						@Pc(201) Class3_Sub2_Sub1_Sub1 local201 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local89];
						Static66.anIntArray102[Static136.anInt2887++] = local89;
						local201.anInt6586 = Static66.anInt1741;
						local201.method1318(local141);
						local201.method5515(local201.aClass48_1.anInt1752);
						local201.anInt6571 = local201.aClass48_1.anInt1744 << 3;
						if (local201.anInt6571 == 0) {
							local201.method5517(0);
						} else {
							local201.method5517(local201.aClass48_1.aByte30 + 4 << 11 & 0x3F6B);
						}
						local201.method1322(local121, local97, true, local134, local201.method5521());
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method5741(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static266.method1443(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static15.method392(local7);
			local7 = Static402.method5952(":", "%3a", local7);
			local7 = Static402.method5952("@", "%40", local7);
			local7 = Static402.method5952("&", "%26", local7);
			local7 = Static402.method5952("#", "%23", local7);
			if (Static148.aClass209_47.anApplet1 != null) {
				@Pc(101) Class122 local101 = Static148.aClass209_47.method4695(new URL(Static148.aClass209_47.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static440.anInt7777 + "&u=" + Static403.aLong204 + "&v1=" + Static325.aString40 + "&v2=" + Static325.aString45 + "&e=" + local7));
				while (local101.anInt3557 == 0) {
					Static88.method4161(1L);
				}
				if (local101.anInt3557 == 1) {
					@Pc(120) DataInputStream local120 = (DataInputStream) local101.anObject7;
					local120.read();
					local120.close();
				}
			}
		} catch (@Pc(132) Exception local132) {
		}
	}
}
