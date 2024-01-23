import java.awt.Frame;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!di", name = "j", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "I")
	public static int anInt1347;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!di", name = "s", descriptor = "I")
	public static int anInt1350;

	@OriginalMember(owner = "client!di", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString45 = "green:";

	@OriginalMember(owner = "client!di", name = "g", descriptor = "Lclient!pm;")
	public static Class125 aClass125_2 = new Class125(64);

	@OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
	public static int[] anIntArray138 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIBII)V")
	public static void method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static253.anInt5521 = arg4;
		Static202.anInt4499 = arg3;
		Static171.anInt3879 = arg2;
		Static130.anInt2891 = arg1;
		Static144.anInt3375 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	public static void method1024() {
		if (Static279.anInt5968 == 10 && Static296.aBoolean335) {
			Static140.method2511(28);
		}
		if (Static279.anInt5968 == 30) {
			Static140.method2511(25);
		}
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V")
	public static void method1025() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static98.anInt2197 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIILclient!h;IZJ)Z")
	public static boolean method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class25 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		@Pc(6) boolean local6 = Static287.anIntArrayArrayArray18 == Static298.anIntArrayArrayArray19;
		@Pc(8) int local8 = 0;
		@Pc(17) int local17;
		for (@Pc(10) int local10 = arg1; local10 < arg1 + arg3; local10++) {
			for (local17 = arg2; local17 < arg2 + arg4; local17++) {
				if (local10 < 0 || local17 < 0 || local10 >= Static212.anInt4717 || local17 >= Static293.anInt6189) {
					return false;
				}
				@Pc(42) Class1_Sub14 local42 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][local10][local17];
				if (local42 != null && local42.anInt2332 >= 5) {
					return false;
				}
			}
		}
		@Pc(58) Class152 local58 = new Class152();
		local58.aLong181 = arg11;
		local58.anInt5515 = arg0;
		local58.anInt5526 = arg5;
		local58.anInt5522 = arg6;
		local58.anInt5516 = arg7;
		local58.aClass25_6 = arg8;
		local58.anInt5511 = arg9;
		local58.anInt5509 = arg1;
		local58.anInt5519 = arg2;
		local58.anInt5510 = arg1 + arg3 - 1;
		local58.anInt5512 = arg2 + arg4 - 1;
		@Pc(108) int local108;
		for (local17 = arg1; local17 < arg1 + arg3; local17++) {
			for (local108 = arg2; local108 < arg2 + arg4; local108++) {
				@Pc(115) int local115 = 0;
				if (local17 > arg1) {
					local115++;
				}
				if (local17 < arg1 + arg3 - 1) {
					local115 += 4;
				}
				if (local108 > arg2) {
					local115 += 8;
				}
				if (local108 < arg2 + arg4 - 1) {
					local115 += 2;
				}
				for (@Pc(141) int local141 = arg0; local141 >= 0; local141--) {
					if (Static132.aClass1_Sub14ArrayArrayArray2[local141][local17][local108] == null) {
						Static132.aClass1_Sub14ArrayArrayArray2[local141][local17][local108] = new Class1_Sub14(local141, local17, local108);
					}
				}
				@Pc(174) Class1_Sub14 local174 = Static132.aClass1_Sub14ArrayArrayArray2[arg0][local17][local108];
				local174.aClass152Array1[local174.anInt2332] = local58;
				local174.anIntArray234[local174.anInt2332] = local115;
				local174.anInt2333 |= local115;
				local174.anInt2332++;
				if (local6 && Static57.anIntArrayArray10[local17][local108] != 0) {
					local8 = Static57.anIntArrayArray10[local17][local108];
				}
			}
		}
		if (local6 && local8 != 0) {
			for (local17 = arg1; local17 < arg1 + arg3; local17++) {
				for (local108 = arg2; local108 < arg2 + arg4; local108++) {
					if (Static57.anIntArrayArray10[local17][local108] == 0) {
						Static57.anIntArrayArray10[local17][local108] = local8;
					}
				}
			}
		}
		if (arg10) {
			Static178.aClass152Array3[Static38.anInt1149++] = local58;
		}
		return true;
	}
}
