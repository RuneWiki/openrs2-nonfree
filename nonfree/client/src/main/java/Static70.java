import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!rc;")
	private static Class55 aClass55_823 = Static34.method846(" from your ignore list first");

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!rc;")
	private static Class55 aClass55_824 = Static34.method846("level)2");

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_825 = aClass55_824;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Lclient!rc;")
	public static Class55 aClass55_826 = Static34.method846("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[104][104];

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_827 = Static34.method846("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
	public static final int anInt2067 = 3353893;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_828 = Static34.method846("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!od", name = "Gb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_837 = Static34.method846("Your account has been disabled)3");

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_829 = aClass55_837;

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_830 = Static34.method846("Loaded textures");

	@OriginalMember(owner = "client!od", name = "ob", descriptor = "Lclient!rc;")
	public static Class55 aClass55_831 = Static34.method846("::fpson");

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_832 = aClass55_828;

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_833 = Static34.method846("Texturen geladen)3");

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "I")
	public static int anInt2072 = 0;

	@OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
	public static volatile int anInt2073 = -1;

	@OriginalMember(owner = "client!od", name = "xb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_834 = aClass55_823;

	@OriginalMember(owner = "client!od", name = "Ab", descriptor = "Lclient!rc;")
	public static Class55 aClass55_835 = aClass55_830;

	@OriginalMember(owner = "client!od", name = "Cb", descriptor = "Lclient!rc;")
	public static Class55 aClass55_836 = Static34.method846("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!od", name = "Ib", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIIII)V")
	public static void method1400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class6_Sub9 local6 = (Class6_Sub9) Static89.aClass3_5.method31(); local6 != null; local6 = (Class6_Sub9) Static89.aClass3_5.method26()) {
			if (local6.anInt1906 != -1 || local6.anIntArray185 != null) {
				@Pc(18) int local18 = 0;
				if (local6.anInt1923 < arg2) {
					local18 = arg2 - local6.anInt1923;
				} else if (arg2 < local6.anInt1909) {
					local18 = local6.anInt1909 - arg2;
				}
				if (local6.anInt1917 < arg3) {
					local18 += arg3 - local6.anInt1917;
				} else if (arg3 < local6.anInt1920) {
					local18 += local6.anInt1920 - arg3;
				}
				if (local6.anInt1925 < local18 - 64 || Static74.anInt1807 == 0 || local6.anInt1919 != arg0) {
					if (local6.aClass6_Sub3_Sub1_2 != null) {
						Static26.aClass6_Sub3_Sub2_3.method1980(local6.aClass6_Sub3_Sub1_2);
						local6.aClass6_Sub3_Sub1_2 = null;
					}
					if (local6.aClass6_Sub3_Sub1_1 != null) {
						Static26.aClass6_Sub3_Sub2_3.method1980(local6.aClass6_Sub3_Sub1_1);
						local6.aClass6_Sub3_Sub1_1 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(126) int local126 = Static74.anInt1807 * (local6.anInt1925 - local18) / local6.anInt1925;
					if (local6.aClass6_Sub3_Sub1_2 != null) {
						local6.aClass6_Sub3_Sub1_2.method1148(local126);
					} else if (local6.anInt1906 >= 0) {
						@Pc(138) Class28 local138 = Static117.method872(Static55.aClass40_Sub1_24, local6.anInt1906);
						if (local138 != null) {
							@Pc(145) Class6_Sub4_Sub1 local145 = local138.method871().method565(Static87.aClass10_1);
							@Pc(150) Class6_Sub3_Sub1 local150 = Static119.method1142(local145, local126);
							local150.method1139(-1);
							Static26.aClass6_Sub3_Sub2_3.method1975(local150);
							local6.aClass6_Sub3_Sub1_2 = local150;
						}
					}
					if (local6.aClass6_Sub3_Sub1_1 != null) {
						local6.aClass6_Sub3_Sub1_1.method1148(local126);
						if (!local6.aClass6_Sub3_Sub1_1.method1145()) {
							local6.aClass6_Sub3_Sub1_1 = null;
						}
					} else if (local6.anIntArray185 != null && (local6.anInt1908 -= arg1) <= 0) {
						@Pc(203) int local203 = (int) (Math.random() * (double) local6.anIntArray185.length);
						@Pc(211) Class28 local211 = Static117.method872(Static55.aClass40_Sub1_24, local6.anIntArray185[local203]);
						if (local211 != null) {
							@Pc(218) Class6_Sub4_Sub1 local218 = local211.method871().method565(Static87.aClass10_1);
							@Pc(223) Class6_Sub3_Sub1 local223 = Static119.method1142(local218, local126);
							local223.method1139(0);
							Static26.aClass6_Sub3_Sub2_3.method1975(local223);
							local6.aClass6_Sub3_Sub1_1 = local223;
							local6.anInt1908 = (int) (Math.random() * (double) (local6.anInt1915 - local6.anInt1918)) + local6.anInt1918;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)I")
	public static int method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!rc;Lclient!pb;ZLclient!rc;)Lclient!eb;")
	public static Class6_Sub2_Sub2_Sub2 method1402(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(8) int local8 = arg1.method1229(arg2);
		@Pc(14) int local14 = arg1.method1242(local8, arg0);
		return Static31.method797(local14, local8, arg1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)I")
	public static int method1403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class6_Sub13 local19 = (Class6_Sub13) Static12.aClass38_8.method1183((long) arg0);
		if (local19 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local19.anIntArray275.length) {
			return local19.anIntArray275[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!b;Lclient!fb;II)V")
	public static void method1406(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class6_Sub5 local9 = new Class6_Sub5();
		local9.anInt929 = arg0.method1495();
		local9.anInt927 = arg0.method1503();
		local9.anIntArray56 = new int[local9.anInt929];
		local9.aClass25Array1 = new Class25[local9.anInt929];
		local9.anIntArray58 = new int[local9.anInt929];
		local9.aClass25Array2 = new Class25[local9.anInt929];
		local9.anIntArray55 = new int[local9.anInt929];
		local9.aByteArrayArrayArray5 = new byte[local9.anInt929][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt929; local56++) {
			try {
				@Pc(62) int local62 = arg0.method1495();
				@Pc(84) String local84;
				@Pc(93) String local93;
				@Pc(95) int local95;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local84 = new String(arg0.method1461().method1661());
					local93 = new String(arg0.method1461().method1661());
					local95 = 0;
					if (local62 == 1) {
						local95 = arg0.method1503();
					}
					local9.anIntArray56[local56] = local62;
					local9.anIntArray55[local56] = local95;
					local9.aClass25Array1[local56] = arg1.method725(Static107.method2002(local84), local93);
				} else if (local62 == 3 || local62 == 4) {
					local84 = new String(arg0.method1461().method1661());
					local93 = new String(arg0.method1461().method1661());
					local95 = arg0.method1495();
					@Pc(164) String[] local164 = new String[local95];
					for (@Pc(166) int local166 = 0; local166 < local95; local166++) {
						local164[local166] = new String(arg0.method1461().method1661());
					}
					@Pc(190) byte[][] local190 = new byte[local95][];
					@Pc(203) int local203;
					if (local62 == 3) {
						for (@Pc(197) int local197 = 0; local197 < local95; local197++) {
							local203 = arg0.method1503();
							local190[local197] = new byte[local203];
							arg0.method1508(local190[local197], local203);
						}
					}
					local9.anIntArray56[local56] = local62;
					@Pc(230) Class[] local230 = new Class[local95];
					for (local203 = 0; local203 < local95; local203++) {
						local230[local203] = Static107.method2002(local164[local203]);
					}
					local9.aClass25Array2[local56] = arg1.method722(Static107.method2002(local84), local230, local93);
					local9.aByteArrayArrayArray5[local56] = local190;
				}
			} catch (@Pc(269) ClassNotFoundException local269) {
				local9.anIntArray58[local56] = -1;
			} catch (@Pc(276) SecurityException local276) {
				local9.anIntArray58[local56] = -2;
			} catch (@Pc(283) NullPointerException local283) {
				local9.anIntArray58[local56] = -3;
			} catch (@Pc(290) Exception local290) {
				local9.anIntArray58[local56] = -4;
			} catch (@Pc(297) Throwable local297) {
				local9.anIntArray58[local56] = -5;
			}
		}
		Static103.aClass3_9.method23(local9);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method1407() {
		aClass55_834 = null;
		aClass55_823 = null;
		aClass55_826 = null;
		aClass55_829 = null;
		aClass55_833 = null;
		aClass55_827 = null;
		aClass55_831 = null;
		aClass55_830 = null;
		aClass55_824 = null;
		aClass55_832 = null;
		aClass55_837 = null;
		aClass55_828 = null;
		aClass55_836 = null;
		aClass55_825 = null;
		anIntArrayArray15 = null;
		aBigInteger1 = null;
		aClass55_835 = null;
	}
}
