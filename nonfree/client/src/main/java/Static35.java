import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!re;")
	public static Class56_Sub1 aClass56_Sub1_11;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!na;")
	public static Class56 aClass56_14;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!pe;")
	public static Class65 aClass65_373 = Static119.method1462("Fertigkeit)2");

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
	public static int anInt794 = -1;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	public static int anInt795 = 0;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_374 = Static119.method1462("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!pe;")
	private static Class65 aClass65_375 = Static119.method1462("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!pe;")
	public static Class65 aClass65_376 = aClass65_375;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!pe;")
	public static Class65 aClass65_377 = Static119.method1462("Registrierter Benutzer");

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public static final int anInt804 = 3353893;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[112];

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!pe;")
	public static Class65 aClass65_378 = Static119.method1462("::fpsoff");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public static void method640() {
		@Pc(1) Class39 local1 = Static49.aClass39_1;
		synchronized (Static49.aClass39_1) {
			Static17.anInt380 = Static103.anInt2333;
			Static66.anInt1586 = Static104.anInt2963;
			Static39.anInt837 = Static132.anInt2895;
			Static17.anInt390 = Static117.anInt2580;
			Static96.anInt2190 = Static124.anInt2641;
			Static100.anInt2282 = Static116.anInt2570;
			Static121.aLong88 = Static7.aLong10;
			Static117.anInt2580 = 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method641(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(10) String local10;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(15) RuntimeException_Sub1 local15 = (RuntimeException_Sub1) arg0;
			local10 = local15.aString4 + " | ";
			arg0 = local15.aThrowable1;
		} else {
			local10 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(53) BufferedReader local53 = new BufferedReader(new StringReader(local45));
		@Pc(56) String local56 = local53.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local53.readLine();
				if (local67 == null) {
					return local10 + "| " + local56;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(94) String local94 = local67.substring(local73 + 1, local80);
					@Pc(98) int local98 = local94.indexOf(".java:");
					if (local98 >= 0) {
						local94 = local94.substring(0, local98) + local94.substring(local98 + 5);
						local10 = local10 + local94 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local10 = local10 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!be;IIZIIII)V")
	public static void method642(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(22) int local22;
		if (arg4 < 0 || arg4 >= 104 || arg5 < 0 || arg5 >= 104) {
			while (true) {
				local22 = arg0.method933();
				if (local22 == 0) {
					break;
				}
				if (local22 == 1) {
					arg0.method933();
					break;
				}
				if (local22 <= 49) {
					arg0.method933();
				}
			}
			return;
		}
		Static88.aByteArrayArrayArray3[arg3][arg4][arg5] = 0;
		while (true) {
			local22 = arg0.method933();
			if (local22 == 0) {
				if (arg3 == 0) {
					Static67.anIntArrayArrayArray8[0][arg4][arg5] = -Static122.method1884(arg4 + arg2 + 932731, arg5 + 556238 + arg6) * 8;
				} else {
					Static67.anIntArrayArrayArray8[arg3][arg4][arg5] = Static67.anIntArrayArrayArray8[arg3 - 1][arg4][arg5] - 240;
				}
				break;
			}
			if (local22 == 1) {
				@Pc(121) int local121 = arg0.method933();
				if (local121 == 1) {
					local121 = 0;
				}
				if (arg3 == 0) {
					Static67.anIntArrayArrayArray8[0][arg4][arg5] = -local121 * 8;
				} else {
					Static67.anIntArrayArrayArray8[arg3][arg4][arg5] = Static67.anIntArrayArrayArray8[arg3 - 1][arg4][arg5] - local121 * 8;
				}
				break;
			}
			if (local22 <= 49) {
				Static66.aByteArrayArrayArray2[arg3][arg4][arg5] = arg0.method922();
				Static129.aByteArrayArrayArray7[arg3][arg4][arg5] = (byte) ((local22 - 2) / 4);
				Static53.aByteArrayArrayArray1[arg3][arg4][arg5] = (byte) (local22 + arg1 - 2 & 0x3);
			} else if (local22 <= 81) {
				Static88.aByteArrayArrayArray3[arg3][arg4][arg5] = (byte) (local22 - 49);
			} else {
				Static113.aByteArrayArrayArray5[arg3][arg4][arg5] = (byte) (local22 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public static void method643() {
		@Pc(6) Object local6 = Static10.anObject65;
		synchronized (Static10.anObject65) {
			if (Static119.anInt1927 == 0) {
				Static28.aClass20_2.method374(5, new Class50());
			}
			Static119.anInt1927 = 600;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method644() {
		if (!Static117.aBoolean103) {
			return;
		}
		@Pc(11) Class2_Sub22 local11 = Static84.method1365(Static117.anInt2577, Static113.anInt2532);
		if (local11 != null && local11.anObjectArray24 != null) {
			@Pc(20) Class2_Sub9 local20 = new Class2_Sub9();
			local20.anObjectArray2 = local11.anObjectArray24;
			local20.aClass2_Sub22_7 = local11;
			Static103.method1703(local20);
		}
		Static117.aBoolean103 = false;
		Static116.method1853(local11);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lclient!wa;")
	public static Class2_Sub22 method645(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0xFFFF;
		@Pc(16) int local16 = arg0 >> 16;
		if (Static95.aClass2_Sub22ArrayArray1[local16] == null || Static95.aClass2_Sub22ArrayArray1[local16][local12] == null) {
			@Pc(30) boolean local30 = Static94.method1566(local16);
			if (!local30) {
				return null;
			}
		}
		return Static95.aClass2_Sub22ArrayArray1[local16][local12];
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!be;B)V")
	public static void method646(@OriginalArg(0) Class2_Sub4 arg0) {
		if (Static81.aClass70_5 != null) {
			try {
				Static81.aClass70_5.method1607(0L);
				Static81.aClass70_5.method1609(arg0.anInt1298, 24, arg0.aByteArray20);
			} catch (@Pc(25) Exception local25) {
			}
		}
		arg0.anInt1298 += 24;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!pe;B)Lclient!pe;")
	public static Class65 method647(@OriginalArg(0) Class65[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static125.method1913(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
	public static void method648(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub20 local16 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg0);
		if (local16 != null) {
			for (@Pc(21) int local21 = 0; local21 < local16.anIntArray345.length; local21++) {
				local16.anIntArray345[local21] = -1;
				local16.anIntArray344[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method649() {
		aClass56_14 = null;
		aClass65_376 = null;
		aClass65_374 = null;
		aClass65_375 = null;
		aClass65_377 = null;
		aClass65_378 = null;
		aClass65_373 = null;
		aClass56_Sub1_11 = null;
		aBooleanArray6 = null;
	}
}
