import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!mj", name = "L", descriptor = "Lclient!km;")
	public static Class91 aClass91_134;

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "Lclient!km;")
	public static Class91 aClass91_135;

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "Z")
	public static boolean aBoolean261;

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString208 = "Loading defaults - ";

	@OriginalMember(owner = "client!mj", name = "O", descriptor = "Z")
	public static boolean aBoolean260 = false;

	@OriginalMember(owner = "client!mj", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString209 = "Hidden";

	@OriginalMember(owner = "client!mj", name = "cb", descriptor = "[I")
	public static int[] anIntArray317 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!mj", name = "hb", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZZIII)V")
	public static void method2877(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 <= arg5) {
			return;
		}
		@Pc(7) int local7 = arg5;
		@Pc(13) int local13 = (arg0 + arg5) / 2;
		@Pc(17) Class41_Sub1 local17 = Static62.aClass41_Sub1Array1[local13];
		Static62.aClass41_Sub1Array1[local13] = Static62.aClass41_Sub1Array1[arg0];
		Static62.aClass41_Sub1Array1[arg0] = local17;
		for (@Pc(29) int local29 = arg5; local29 < arg0; local29++) {
			if (Static194.method3208(arg1, arg3, arg4, arg2, local17, Static62.aClass41_Sub1Array1[local29]) <= 0) {
				@Pc(55) Class41_Sub1 local55 = Static62.aClass41_Sub1Array1[local29];
				Static62.aClass41_Sub1Array1[local29] = Static62.aClass41_Sub1Array1[local7];
				Static62.aClass41_Sub1Array1[local7++] = local55;
			}
		}
		Static62.aClass41_Sub1Array1[arg0] = Static62.aClass41_Sub1Array1[local7];
		Static62.aClass41_Sub1Array1[local7] = local17;
		method2877(local7 - 1, arg1, arg2, arg3, arg4, arg5);
		method2877(arg0, arg1, arg2, arg3, arg4, local7 + 1);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)I")
	public static int method2880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(II)V")
	public static void method2881(@OriginalArg(1) int arg0) {
		if (!Static83.aBoolean132) {
			arg0 = -1;
		}
		if (Static233.anInt4581 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class131 local23 = Static29.method566(arg0);
			@Pc(27) Class1_Sub2_Sub11_Sub2 local27 = local23.method3296();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static253.aClass175_4.method4329(Static156.aCanvas2, local27.method3789(), local27.anInt4875, local27.anInt4871, new Point(local23.anInt4145, local23.anInt4149));
				Static233.anInt4581 = arg0;
			}
		}
		if (arg0 == -1 && Static233.anInt4581 != -1) {
			Static253.aClass175_4.method4329(Static156.aCanvas2, null, -1, -1, new Point());
			Static233.anInt4581 = -1;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLclient!cg;)V")
	public static void method2882(@OriginalArg(1) Class1_Sub11 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static139.anInt3029; local3++) {
			@Pc(16) int local16 = arg0.method2664();
			@Pc(20) int local20 = arg0.method2691();
			if (local20 == 65535) {
				local20 = -1;
			}
			if (Static82.aClass41_Sub1Array2[local16] != null) {
				Static82.aClass41_Sub1Array2[local16].anInt1448 = local20;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZBJ)V")
	public static void method2883(@OriginalArg(0) boolean arg0, @OriginalArg(2) long arg1) {
		if (arg1 == 0L) {
			return;
		}
		if (Static148.anInt3198 >= 100) {
			Static196.method1924(0, Static123.aString162, "");
			return;
		}
		@Pc(25) String local25 = Static24.method3641(arg1);
		@Pc(27) int local27;
		for (local27 = 0; local27 < Static148.anInt3198; local27++) {
			if (arg1 == Static255.aLongArray8[local27]) {
				Static196.method1924(0, local25 + Static105.aString142, "");
				return;
			}
		}
		for (local27 = 0; local27 < Static49.anInt1128; local27++) {
			if (Static298.aLongArray11[local27] == arg1) {
				Static196.method1924(0, Static7.aString129 + local25 + Static255.aString297, "");
				return;
			}
		}
		if (local25.equals(Static197.aClass14_Sub2_Sub1_2.aString99)) {
			Static196.method1924(0, Static190.aString233, "");
			return;
		}
		Static255.aLongArray8[Static148.anInt3198] = arg1;
		Static270.aStringArray55[Static148.anInt3198] = Static259.method3976(arg1);
		Static273.aBooleanArray51[Static148.anInt3198++] = arg0;
		Static67.anInt1414 = Static23.anInt471;
		Static283.aClass1_Sub11_Sub1_3.method2697(131);
		Static283.aClass1_Sub11_Sub1_3.method2673(arg1);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method2884(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return "<col=ffff00>" + arg0 + "</col>";
		} else if (arg0 < 10000000) {
			return "<col=ffffff>" + arg0 / 1000 + Static1.aString253 + "</col>";
		} else {
			return "<col=00ff80>" + arg0 / 1000000 + Static75.aString92 + "</col>";
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IC)Z")
	public static boolean method2885(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
