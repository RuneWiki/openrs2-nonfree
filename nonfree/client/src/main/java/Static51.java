import java.awt.Canvas;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas2;

	@OriginalMember(owner = "client!ic", name = "Eb", descriptor = "[I")
	public static int[] anIntArray313;

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1429 = Static72.method1077("");

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1430 = Static72.method1077("headicons_hint");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	public static void method1479() {
		try {
			@Pc(15) Graphics local15 = aCanvas2.getGraphics();
			Static99.aClass9_48.method1585(357, local15, 17);
		} catch (@Pc(25) Exception local25) {
			aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!bc;II)V")
	public static void method1483(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14 = arg2 * arg2 + arg0 * arg0;
		@Pc(20) int local20 = Static5.anInt62 + Static18.anInt562 & 0x7FF;
		if (local14 > 6400) {
			return;
		}
		@Pc(30) int local30 = Class2_Sub2_Sub1_Sub4.anIntArray119[local20];
		@Pc(38) int local38 = local30 * 256 / (Static41.anInt968 + 256);
		@Pc(42) int local42 = Class2_Sub2_Sub1_Sub4.anIntArray122[local20];
		@Pc(58) int local58 = local42 * 256 / (Static41.anInt968 + 256);
		@Pc(69) int local69 = arg2 * local58 + arg0 * local38 >> 16;
		@Pc(80) int local80 = local38 * arg2 - arg0 * local58 >> 16;
		if (local14 > 2500) {
			arg1.method211(Static42.aClass2_Sub2_Sub1_Sub1_21, local69 + 94 + 4 - arg1.anInt291 / 2, -(arg1.anInt288 / 2) + -4 + -local80 + 83);
		} else {
			arg1.method213(local69 + 4 + 94 - arg1.anInt291 / 2, -(arg1.anInt288 / 2) + 83 + (-local80 - 4));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
	public static String method1505(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(17) String local17;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(7) RuntimeException_Sub1 local7 = (RuntimeException_Sub1) arg0;
			local17 = local7.aString5 + " | ";
			arg0 = local7.aThrowable1;
		} else {
			local17 = "";
		}
		@Pc(40) StringWriter local40 = new StringWriter();
		@Pc(45) PrintWriter local45 = new PrintWriter(local40);
		arg0.printStackTrace(local45);
		local45.close();
		@Pc(53) String local53 = local40.toString();
		@Pc(61) BufferedReader local61 = new BufferedReader(new StringReader(local53));
		@Pc(64) String local64 = local61.readLine();
		while (true) {
			while (true) {
				@Pc(67) String local67 = local61.readLine();
				if (local67 == null) {
					return local17 + "| " + local64;
				}
				@Pc(73) int local73 = local67.indexOf(40);
				@Pc(80) int local80 = local67.indexOf(41, local73 + 1);
				if (local73 >= 0 && local80 >= 0) {
					@Pc(91) String local91 = local67.substring(local73 + 1, local80);
					@Pc(95) int local95 = local91.indexOf(".java:");
					if (local95 >= 0) {
						local91 = local91.substring(0, local95) + local91.substring(local95 + 5);
						local17 = local17 + local91 + ' ';
						continue;
					}
					local67 = local67.substring(0, local73);
				}
				local67 = local67.trim();
				local67 = local67.substring(local67.lastIndexOf(32) + 1);
				local67 = local67.substring(local67.lastIndexOf(9) + 1);
				local17 = local17 + local67 + ' ';
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIB)I")
	public static int method1519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg0 & arg2 - 1;
		@Pc(21) int local21 = arg0 / arg2;
		@Pc(25) int local25 = arg1 / arg2;
		@Pc(30) int local30 = Static5.method33(local25, local21);
		@Pc(37) int local37 = Static5.method33(local25, local21 + 1);
		@Pc(43) int local43 = arg2 - 1 & arg1;
		@Pc(50) int local50 = Static5.method33(local25 + 1, local21);
		@Pc(59) int local59 = Static5.method33(local25 + 1, local21 + 1);
		@Pc(66) int local66 = Static15.method357(local30, arg2, local9, local37);
		@Pc(73) int local73 = Static15.method357(local50, arg2, local9, local59);
		return Static15.method357(local66, arg2, local43, local73);
	}

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "(I)V")
	public static void method1523() {
		aClass74_1429 = null;
		anIntArray312 = null;
		anIntArray313 = null;
		aClass74_1430 = null;
		aCanvas2 = null;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;IILclient!de;)V")
	public static void method1526(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15 arg2) {
		@Pc(5) Class2_Sub11 local5 = new Class2_Sub11();
		local5.anInt1356 = arg0.method1514();
		local5.anInt1359 = arg0.method1532();
		local5.anIntArray153 = new int[local5.anInt1356];
		local5.aClass37Array1 = new Class37[local5.anInt1356];
		local5.anIntArray151 = new int[local5.anInt1356];
		local5.anIntArray152 = new int[local5.anInt1356];
		local5.aClass37Array2 = new Class37[local5.anInt1356];
		local5.aByteArrayArrayArray4 = new byte[local5.anInt1356][][];
		for (@Pc(51) int local51 = 0; local51 < local5.anInt1356; local51++) {
			try {
				@Pc(59) int local59 = arg0.method1514();
				@Pc(85) String local85;
				@Pc(94) String local94;
				@Pc(96) int local96;
				if (local59 == 0 || local59 == 1 || local59 == 2) {
					local85 = new String(arg0.method1530().method1725());
					local94 = new String(arg0.method1530().method1725());
					local96 = 0;
					if (local59 == 1) {
						local96 = arg0.method1532();
					}
					local5.anIntArray152[local51] = local59;
					local5.anIntArray153[local51] = local96;
					local5.aClass37Array1[local51] = arg2.method469(Static105.method1591(local85), local94);
				} else if (local59 == 3 || local59 == 4) {
					local85 = new String(arg0.method1530().method1725());
					local94 = new String(arg0.method1530().method1725());
					local96 = arg0.method1514();
					@Pc(161) String[] local161 = new String[local96];
					for (@Pc(163) int local163 = 0; local163 < local96; local163++) {
						local161[local163] = new String(arg0.method1530().method1725());
					}
					@Pc(185) byte[][] local185 = new byte[local96][];
					@Pc(198) int local198;
					if (local59 == 3) {
						for (@Pc(192) int local192 = 0; local192 < local96; local192++) {
							local198 = arg0.method1532();
							local185[local192] = new byte[local198];
							arg0.method1516(local198, local185[local192]);
						}
					}
					@Pc(222) Class[] local222 = new Class[local96];
					local5.anIntArray152[local51] = local59;
					for (local198 = 0; local198 < local96; local198++) {
						local222[local198] = Static105.method1591(local161[local198]);
					}
					local5.aClass37Array2[local51] = arg2.method464(Static105.method1591(local85), local222, local94);
					local5.aByteArrayArrayArray4[local51] = local185;
				}
			} catch (@Pc(266) ClassNotFoundException local266) {
				local5.anIntArray151[local51] = -1;
			} catch (@Pc(273) SecurityException local273) {
				local5.anIntArray151[local51] = -2;
			} catch (@Pc(280) NullPointerException local280) {
				local5.anIntArray151[local51] = -3;
			} catch (@Pc(287) Exception local287) {
				local5.anIntArray151[local51] = -4;
			} catch (@Pc(294) Throwable local294) {
				local5.anIntArray151[local51] = -5;
			}
		}
		Static3.aClass13_3.method418(local5);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBIII)V")
	public static void method1529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = arg0; local9 <= arg0 + arg1; local9++) {
			for (@Pc(12) int local12 = arg3; local12 <= arg3 + arg2; local12++) {
				if (local12 >= 0 && local12 < 104 && local9 >= 0 && local9 < 104) {
					Static45.aByteArrayArrayArray3[0][local12][local9] = 127;
					if (arg3 == local12 && local12 > 0) {
						Static56.anIntArrayArrayArray2[0][local12][local9] = Static56.anIntArrayArrayArray2[0][local12 - 1][local9];
					}
					if (local12 == arg2 + arg3 && local12 < 103) {
						Static56.anIntArrayArrayArray2[0][local12][local9] = Static56.anIntArrayArrayArray2[0][local12 + 1][local9];
					}
					if (local9 == arg0 && local9 > 0) {
						Static56.anIntArrayArrayArray2[0][local12][local9] = Static56.anIntArrayArrayArray2[0][local12][local9 - 1];
					}
					if (local9 == arg0 + arg1 && local9 < 103) {
						Static56.anIntArrayArrayArray2[0][local12][local9] = Static56.anIntArrayArrayArray2[0][local12][local9 + 1];
					}
				}
			}
		}
	}
}
