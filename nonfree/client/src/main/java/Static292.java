import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
	public static int anInt5493;

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "I")
	public static int anInt5494;

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "[I")
	public static int[] anIntArray617;

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
	public static int anInt5495;

	@OriginalMember(owner = "client!sm", name = "O", descriptor = "Lclient!ck;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!sm", name = "T", descriptor = "Lclient!vj;")
	public static Class206 aClass206_4;

	@OriginalMember(owner = "client!sm", name = "Z", descriptor = "Lclient!qp;")
	public static Class6_Sub32 aClass6_Sub32_1;

	@OriginalMember(owner = "client!sm", name = "J", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[250][];

	@OriginalMember(owner = "client!sm", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Loaded textures";

	@OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
	public static int anInt5503 = 0;

	@OriginalMember(owner = "client!sm", name = "Y", descriptor = "[I")
	public static final int[] anIntArray618 = new int[25];

	@OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
	public static int anInt5505 = 0;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!dp;Lclient!dp;Lclient!fh;ILclient!dp;)Z")
	public static boolean method4991(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class6_Sub12_Sub1 arg2, @OriginalArg(4) Class53 arg3) {
		Static191.aClass6_Sub12_Sub1_3 = arg2;
		Static293.aClass53_136 = arg0;
		Static6.aClass53_9 = arg1;
		Static91.aClass53_86 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)I")
	public static int method4992() {
		try {
			if (Static250.anInt486 == 0) {
				if (Static245.method4300() - 5000L < Static277.aLong173) {
					return 0;
				}
				Static173.aClass196_4 = Static308.aClass206_5.method5525(Static137.anInt2483, Static133.aString102);
				Static283.aLong176 = Static245.method4300();
				Static250.anInt486 = 1;
			}
			if (Static245.method4300() > Static283.aLong176 + 30000L) {
				return Static106.method2155(1000);
			}
			@Pc(80) int local80;
			@Pc(117) int local117;
			if (Static250.anInt486 == 1) {
				if (Static173.aClass196_4.anInt5851 == 2) {
					return Static106.method2155(1001);
				}
				if (Static173.aClass196_4.anInt5851 != 1) {
					return -1;
				}
				Static216.aClass11_5 = new Class11((Socket) Static173.aClass196_4.anObject8, Static308.aClass206_5);
				Static173.aClass196_4 = null;
				local80 = 0;
				Static131.aClass6_Sub10_Sub1_2.anInt4188 = 0;
				if (Static350.aBoolean422) {
					local80 = Static142.anInt2559;
				}
				Static131.aClass6_Sub10_Sub1_2.method3968(23);
				Static131.aClass6_Sub10_Sub1_2.method3976(local80);
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				if (aClass34_1 != null) {
					aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				local117 = Static216.aClass11_5.method167();
				if (aClass34_1 != null) {
					aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				if (local117 != 0) {
					return Static106.method2155(local117);
				}
				Static250.anInt486 = 2;
			}
			if (Static250.anInt486 == 2) {
				if (Static216.aClass11_5.method160() < 2) {
					return -1;
				}
				Static240.anInt4010 = Static216.aClass11_5.method167();
				Static240.anInt4010 <<= 0x8;
				Static240.anInt4010 += Static216.aClass11_5.method167();
				Static352.aByteArray97 = new byte[Static240.anInt4010];
				Static47.anInt899 = 0;
				Static250.anInt486 = 3;
			}
			if (Static250.anInt486 != 3) {
				return -1;
			}
			local80 = Static216.aClass11_5.method160();
			if (local80 < 1) {
				return -1;
			}
			if (Static240.anInt4010 - Static47.anInt899 < local80) {
				local80 = Static240.anInt4010 - Static47.anInt899;
			}
			Static216.aClass11_5.method164(Static352.aByteArray97, local80, Static47.anInt899);
			Static47.anInt899 += local80;
			if (Static240.anInt4010 > Static47.anInt899) {
				return -1;
			} else if (Static214.method3838(Static352.aByteArray97)) {
				Static139.aClass64_Sub1Array1 = new Class64_Sub1[Static354.anInt6364];
				local117 = 0;
				for (@Pc(232) int local232 = Static341.anInt6214; local232 <= Static74.anInt1382; local232++) {
					@Pc(238) Class64_Sub1 local238 = Static354.method5809(local232);
					if (local238 != null) {
						Static139.aClass64_Sub1Array1[local117++] = local238;
					}
				}
				Static65.aClass6_Sub13_1 = null;
				Static96.anInt1766 = 0;
				Static216.aClass11_5.method159();
				Static301.anInt5708 = 0;
				Static216.aClass11_5 = null;
				Static250.anInt486 = 0;
				Static352.aByteArray97 = null;
				Static277.aLong173 = Static245.method4300();
				return 0;
			} else {
				return Static106.method2155(1002);
			}
		} catch (@Pc(270) IOException local270) {
			return Static106.method2155(1003);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIZZ)V")
	public static void method4993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6) {
		if (!arg5 && arg3 == Static296.anInt5969 && arg1 == Static154.anInt2914 && (Static77.anInt1421 == arg4 || Static16.method287())) {
			return;
		}
		Static296.anInt5969 = arg3;
		Static154.anInt2914 = arg1;
		Static77.anInt1421 = arg4;
		if (Static16.method287()) {
			Static77.anInt1421 = 0;
		}
		if (arg6) {
			Static290.method4952(28);
		} else {
			Static290.method4952(25);
		}
		Static113.method2274(true, Static171.aString133, Static298.aClass30_4);
		@Pc(62) int local62 = Static44.anInt881;
		Static44.anInt881 = (Static296.anInt5969 - (Static153.anInt2883 >> 4)) * 8;
		@Pc(73) int local73 = Static300.anInt5672;
		Static300.anInt5672 = (Static154.anInt2914 - (Static246.anInt4606 >> 4)) * 8;
		Static115.aClass6_Sub2_Sub19_3 = Static307.method1092(Static296.anInt5969 * 8, Static154.anInt2914 * 8);
		Static37.aClass41_1 = null;
		@Pc(97) int local97 = Static44.anInt881 - local62;
		@Pc(101) int local101 = Static300.anInt5672 - local73;
		@Pc(105) int local105;
		@Pc(115) int local115;
		if (arg6) {
			Static149.anInt2759 = 0;
			local105 = (Static153.anInt2883 - 1) * 128;
			@Pc(177) int local177 = (Static246.anInt4606 - 1) * 128;
			for (local115 = 0; local115 < 32768; local115++) {
				@Pc(185) Class44_Sub4_Sub4_Sub2 local185 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local115];
				if (local185 != null) {
					local185.anInt6339 -= local101 * 128;
					local185.anInt6340 -= local97 * 128;
					if (local185.anInt6340 >= 0 && local185.anInt6340 <= local105 && local185.anInt6339 >= 0 && local185.anInt6339 <= local177) {
						@Pc(230) boolean local230 = true;
						for (@Pc(232) int local232 = 0; local232 < 10; local232++) {
							local185.anIntArray560[local232] -= local97;
							local185.anIntArray561[local232] -= local101;
							if (local185.anIntArray560[local232] < 0 || local185.anIntArray560[local232] >= Static153.anInt2883 || local185.anIntArray561[local232] < 0 || local185.anIntArray561[local232] >= Static246.anInt4606) {
								local230 = false;
							}
						}
						if (local230) {
							Static191.anIntArray428[Static149.anInt2759++] = local115;
						} else {
							Static239.aClass44_Sub4_Sub4_Sub2Array8[local115].method4726(null);
							Static239.aClass44_Sub4_Sub4_Sub2Array8[local115] = null;
						}
					} else {
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local115].method4726(null);
						Static239.aClass44_Sub4_Sub4_Sub2Array8[local115] = null;
					}
				}
			}
		} else {
			for (local105 = 0; local105 < 32768; local105++) {
				@Pc(111) Class44_Sub4_Sub4_Sub2 local111 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local105];
				if (local111 != null) {
					for (local115 = 0; local115 < 10; local115++) {
						local111.anIntArray560[local115] -= local97;
						local111.anIntArray561[local115] -= local101;
					}
					local111.anInt6339 -= local101 * 128;
					local111.anInt6340 -= local97 * 128;
				}
			}
		}
		for (local105 = 0; local105 < 2048; local105++) {
			@Pc(329) Class44_Sub4_Sub4_Sub1 local329 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local105];
			if (local329 != null) {
				for (local115 = 0; local115 < 10; local115++) {
					local329.anIntArray560[local115] -= local97;
					local329.anIntArray561[local115] -= local101;
				}
				local329.anInt6339 -= local101 * 128;
				local329.anInt6340 -= local97 * 128;
			}
		}
		Static343.anInt6225 = arg4;
		Static253.aClass44_Sub4_Sub4_Sub1_1.method4477(arg2, false, Static343.anInt6225, arg0);
		Static273.method5568(local101, local97);
		for (@Pc(395) Class6_Sub5 local395 = (Class6_Sub5) Static261.aClass211_30.method5594(); local395 != null; local395 = (Class6_Sub5) Static261.aClass211_30.method5582()) {
			local395.anInt517 -= local101;
			local395.anInt514 -= local97;
			if (local395.anInt514 < 0 || local395.anInt517 < 0 || local395.anInt514 >= Static153.anInt2883 || local395.anInt517 >= Static246.anInt4606) {
				local395.method5756();
			}
		}
		if (Static299.anInt5652 != 0) {
			Static24.anInt385 -= local101;
			Static299.anInt5652 -= local97;
		}
		Static284.anInt5378 = 0;
		if (arg6) {
			Static148.anInt2742 -= local97;
			Static268.anInt5000 -= local101;
			Static13.anInt229 -= local101;
			Static11.anInt197 -= local101 * 128;
			Static287.anInt5405 -= local97 * 128;
			Static179.anInt3361 -= local97;
			if (Math.abs(local97) > Static153.anInt2883 || Math.abs(local101) > Static246.anInt4606) {
				Static262.method4419();
			}
		} else if (Static334.anInt6112 == 4) {
			Static277.anInt5293 -= local101 * 128;
			Static10.anInt187 -= local97 * 128;
			Static304.anInt5743 -= local97 * 128;
			Static219.anInt4043 -= local101 * 128;
		} else {
			Static334.anInt6112 = 1;
		}
		Static184.method3475();
		Static280.aClass211_32.method5584();
		Static62.aClass211_5.method5584();
		Static227.aClass109_6.method2946();
		Static84.method1409();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
	public static void method4994(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(3, arg0);
		local8.method2645();
	}

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "(B)V")
	public static void method4996() {
		Static190.aBoolean274 = false;
		Static299.anIntArray639 = null;
		Static241.anIntArray669 = null;
		Static204.aClipboard1 = null;
		Static20.aBooleanArray3 = null;
		Static98.anIntArray255 = null;
		Static205.method5709();
	}
}
