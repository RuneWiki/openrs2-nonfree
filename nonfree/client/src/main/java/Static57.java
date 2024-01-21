import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray56;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	public static int anInt2682;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "Lclient!lc;")
	public static Class31 aClass31_924 = Static56.method1206("Import ready");

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray68 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_925 = Static56.method1206("Loading friend list");

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public static int anInt2679 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_926 = Static56.method1206("Username: ");

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
	public static int anInt2681 = 0;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!fe;")
	public static Class17 aClass17_96 = new Class17(100);

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!lc;")
	public static Class31 aClass31_927 = Static56.method1206("Loading game screen )2 ");

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!lc;")
	public static Class31 aClass31_928 = Static56.method1206("Report abuse @whi@");

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	public static int anInt2683 = 256;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "Lclient!lc;")
	public static Class31 aClass31_929 = Static56.method1206("To create a new account you need to");

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
	public static int anInt2684 = 0;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!lc;")
	public static Class31 aClass31_930 = Static56.method1206(" you requested@lre@ new recovery*6n@lre@questions)3@yel@ The requested change will occur*6non: @lre@");

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!lc;")
	public static Class31 aClass31_931 = Static56.method1206("Unknown");

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!lc;")
	public static Class31 aClass31_932 = Static56.method1206(" @whi@");

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
	public static int[] anIntArray383 = new int[16384];

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public static int anInt2685 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1690() {
		Static13.method377();
		if (Static103.anInt2775 != 10) {
			return;
		}
		@Pc(17) int local17 = Static49.anInt2693;
		@Pc(21) int local21 = Static105.anInt2783 - 202;
		@Pc(25) int local25 = Static15.anInt649 - 171;
		if (Static64.anInt607 == 0) {
			if (local17 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 100 && local25 <= 140) {
				Static64.anInt607 = 3;
				Static88.anInt2361 = 0;
			}
			if (local17 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 100 && local25 <= 140) {
				Static64.anInt607 = 2;
				Static88.anInt2361 = 0;
				Static58.aClass31_682 = Static91.aClass31_862;
				Static58.aClass31_689 = Static58.aClass31_688;
			}
		} else if (Static64.anInt607 == 2) {
			@Pc(75) byte local75 = 60;
			@Pc(76) int local76 = local75 + 30;
			if (local17 == 1 && local25 >= 75 && local25 < 90) {
				Static88.anInt2361 = 0;
			}
			local76 += 15;
			if (local17 == 1 && local25 >= 90 && local25 < 105) {
				Static88.anInt2361 = 1;
			}
			local76 += 15;
			if (local17 == 1 && local21 >= 25 && local21 <= 175 && local25 >= 130 && local25 <= 170) {
				Static58.aClass31_687 = Static58.aClass31_687.method1212().method1196();
				Static44.method1063(Static58.aClass31_688, Static13.aClass31_184);
				Static75.method1404(20);
			} else {
				if (local17 == 1 && local21 >= 185 && local21 <= 335 && local25 >= 130 && local25 <= 170) {
					Static64.anInt607 = 0;
					Static58.aClass31_690 = Static58.aClass31_688;
					Static58.aClass31_687 = Static58.aClass31_688;
				}
				while (true) {
					while (Static67.method1360()) {
						@Pc(214) boolean local214 = false;
						for (@Pc(216) int local216 = 0; Static13.aClass31_185.method1223() > local216; local216++) {
							if (Static8.anInt291 == Static13.aClass31_185.method1216(local216)) {
								local214 = true;
								break;
							}
						}
						if (Static88.anInt2361 == 0) {
							if (Static58.anInt1935 == 85 && Static58.aClass31_687.method1223() > 0) {
								Static58.aClass31_687 = Static58.aClass31_687.method1213(Static58.aClass31_687.method1223() - 1, 0);
							}
							if (Static58.anInt1935 == 84 || Static58.anInt1935 == 80) {
								Static88.anInt2361 = 1;
							}
							if (local214 && Static58.aClass31_687.method1223() < 12) {
								Static58.aClass31_687 = Static58.aClass31_687.method1205(Static8.anInt291);
							}
						} else if (Static88.anInt2361 == 1) {
							if (Static58.anInt1935 == 85 && Static58.aClass31_690.method1223() > 0) {
								Static58.aClass31_690 = Static58.aClass31_690.method1213(Static58.aClass31_690.method1223() - 1, 0);
							}
							if (Static58.anInt1935 == 84 || Static58.anInt1935 == 80) {
								Static88.anInt2361 = 0;
							}
							if (local214 && Static58.aClass31_690.method1223() < 20) {
								Static58.aClass31_690 = Static58.aClass31_690.method1205(Static8.anInt291);
							}
						}
					}
					return;
				}
			}
		} else if (Static64.anInt607 == 3 && local17 == 1 && local21 >= 105 && local21 <= 255 && local25 >= 130 && local25 <= 170) {
			Static64.anInt607 = 0;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZBLclient!kc;ILclient!kc;)Lclient!ia;")
	public static Class2_Sub1_Sub6 method1691(@OriginalArg(2) Class11 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class11 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(20) int[] local20 = arg0.method329(arg1);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(32) byte[] local32 = arg0.method324(local20[local22], arg1);
			if (local32 == null) {
				local7 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(60) byte[] local60 = arg2.method324(0, local52);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub1_Sub6(arg0, arg2, arg1, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1692(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(21) String local21;
			if (arg1 instanceof RuntimeException_Sub1) {
				@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg1;
				local21 = local11.aString7 + " | ";
				arg1 = local11.aThrowable1;
			} else {
				local21 = "";
			}
			@Pc(32) StringWriter local32 = new StringWriter();
			@Pc(37) PrintWriter local37 = new PrintWriter(local32);
			arg1.printStackTrace(local37);
			local37.close();
			@Pc(45) String local45 = local32.toString();
			@Pc(57) BufferedReader local57 = new BufferedReader(new StringReader(local45));
			@Pc(60) String local60 = local57.readLine();
			while (true) {
				while (true) {
					@Pc(63) String local63 = local57.readLine();
					if (local63 == null) {
						local21 = local21 + "| " + local60;
						if (arg0 != null) {
							local21 = local21 + " | " + arg0;
						}
						Static11.method358(local21);
						return;
					}
					@Pc(69) int local69 = local63.indexOf(40);
					@Pc(76) int local76 = local63.indexOf(41, local69 + 1);
					if (local69 >= 0 && local76 >= 0) {
						@Pc(90) String local90 = local63.substring(local69 + 1, local76);
						@Pc(94) int local94 = local90.indexOf(".java:");
						if (local94 >= 0) {
							local90 = local90.substring(0, local94) + local90.substring(local94 + 5);
							local21 = local21 + local90 + ' ';
							continue;
						}
						local63 = local63.substring(0, local69);
					}
					local63 = local63.trim();
					local63 = local63.substring(local63.lastIndexOf(32) + 1);
					local63 = local63.substring(local63.lastIndexOf(9) + 1);
					local21 = local21 + local63 + ' ';
				}
			}
		} catch (@Pc(194) Exception local194) {
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public static void method1693() {
		if (!Static18.aBoolean53) {
			return;
		}
		Static18.aBoolean53 = false;
		Static96.aClass2_Sub1_Sub3_Sub1_18 = null;
		Static98.aClass2_Sub1_Sub3_Sub1_7 = null;
		Static30.aClass9_12 = null;
		Static100.aClass2_Sub1_Sub3_Sub1_20 = null;
		Static83.aClass9_24 = null;
		Static3.aClass9_1 = null;
		Static69.aClass2_Sub1_Sub3_Sub1_12 = null;
		Static55.aClass9_15 = null;
		Static76.aClass9_20 = null;
		Static76.aClass9_22 = null;
		Static90.aClass9_25 = null;
		Static68.aClass2_Sub1_Sub3_Sub1_11 = null;
		Static23.aClass9_9 = null;
		Static3.anIntArray14 = null;
		Static47.aClass2_Sub1_Sub3_Sub1_10 = null;
		Static63.anIntArray297 = null;
		Static93.aClass2_Sub1_Sub3_Sub1_16 = null;
		Static68.anIntArray302 = null;
		Static38.aClass2_Sub1_Sub3_Sub1_8 = null;
		Static79.aClass9_23 = null;
		Static91.aClass2_Sub1_Sub3_Sub1_15 = null;
		Static69.aClass9_19 = null;
		Static62.aClass9_16 = null;
		Static47.aClass2_Sub1_Sub3_Sub1_9 = null;
		Static24.aClass9_10 = null;
		Static79.anIntArray325 = null;
		Static70.aClass2_Sub1_Sub3_Sub1_13 = null;
		Static67.aClass9_18 = null;
		Static89.aClass2_Sub1_Sub3_Sub1_14 = null;
		Static28.aClass2_Sub1_Sub3_Sub1_6 = null;
		Static13.aClass2_Sub1_Sub3_Sub1_4 = null;
		Static10.aClass2_Sub1_Sub3_Sub1_3 = null;
		Static23.aClass2_Sub1_Sub3_Sub1Array1 = null;
		Static18.anIntArray98 = null;
		Static50.aClass9_4 = null;
		Static28.aClass9_11 = null;
		Static50.anIntArray73 = null;
		Static93.aClass2_Sub1_Sub3_Sub1_17 = null;
		Static11.aClass9_5 = null;
		Static34.anIntArray172 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public static void method1694() {
		aClass31_926 = null;
		aClass17_96 = null;
		aClass31_932 = null;
		aClass31_927 = null;
		aClass31_924 = null;
		Class2.anIntArray382 = null;
		aClass31_928 = null;
		aClass31_925 = null;
		anIntArray383 = null;
		anIntArrayArray68 = null;
		aClass31_929 = null;
		aClass31_931 = null;
		aBooleanArray56 = null;
		aClass31_930 = null;
	}
}
