import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "Lclient!v;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	public static int anInt481 = 0;

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "Lclient!dd;")
	private static Class13 aClass13_211 = Static161.method2971("Please remove ");

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "Lclient!dd;")
	public static Class13 aClass13_208 = aClass13_211;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "Lclient!dd;")
	private static Class13 aClass13_209 = Static161.method2971("Loading sprites )2 ");

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Lclient!dd;")
	public static Class13 aClass13_210 = aClass13_209;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "Z")
	public static volatile boolean aBoolean44 = true;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "I")
	public static int anInt485 = 0;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
	public static volatile int anInt489 = 0;

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_212 = aClass13_211;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	public static void method531() {
		aClass13_212 = null;
		aClass13_211 = null;
		aClass13_210 = null;
		aClass13_209 = null;
		aClass88_1 = null;
		aClass13_208 = null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!fd;)V")
	public static void method532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2) {
		if (Static29.anInt1044 != 0 && Static29.anInt1044 != 3) {
			return;
		}
		@Pc(18) int local18 = arg1 - arg2.anInt1559 / 2;
		@Pc(24) int local24 = Static79.anInt2241 + Static2.anInt101 & 0x7FF;
		@Pc(28) int local28 = Class1_Sub2_Sub1_Sub2.anIntArray38[local24];
		@Pc(32) int local32 = Class1_Sub2_Sub1_Sub2.anIntArray41[local24];
		@Pc(40) int local40 = local28 * (Static60.anInt1871 + 256) >> 8;
		@Pc(48) int local48 = (Static60.anInt1871 + 256) * local32 >> 8;
		@Pc(55) int local55 = arg0 - arg2.anInt1603 / 2;
		@Pc(66) int local66 = local55 * local48 + local40 * local18 >> 11;
		@Pc(73) int local73 = local66 + Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596 >> 7;
		@Pc(84) int local84 = local40 * local55 - local48 * local18 >> 11;
		@Pc(91) int local91 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606 - local84 >> 7;
		@Pc(111) boolean local111 = Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 0, 0, true, local73, local91, 1, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 0);
		if (!local111) {
			return;
		}
		Static1.aClass1_Sub8_Sub1_1.method1643(local18);
		Static1.aClass1_Sub8_Sub1_1.method1643(local55);
		Static1.aClass1_Sub8_Sub1_1.method1650(Static2.anInt101);
		Static1.aClass1_Sub8_Sub1_1.method1643(57);
		Static1.aClass1_Sub8_Sub1_1.method1643(Static79.anInt2241);
		Static1.aClass1_Sub8_Sub1_1.method1643(Static60.anInt1871);
		Static1.aClass1_Sub8_Sub1_1.method1643(89);
		Static1.aClass1_Sub8_Sub1_1.method1650(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2596);
		Static1.aClass1_Sub8_Sub1_1.method1650(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anInt2606);
		Static1.aClass1_Sub8_Sub1_1.method1643(Static64.anInt1926);
		Static1.aClass1_Sub8_Sub1_1.method1643(63);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)Lclient!nb;")
	public static Class56 method533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub10 local7 = Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2];
		return local7 == null || local7.aClass56_1 == null ? null : local7.aClass56_1;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIII)Z")
	public static boolean method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = arg2 * Static35.anInt1194 + arg0 * Static125.anInt3233 >> 16;
		@Pc(19) int local19 = arg2 * Static125.anInt3233 - arg0 * Static35.anInt1194 >> 16;
		@Pc(29) int local29 = arg1 * Static1.anInt64 + local19 * Static179.anInt4051 >> 16;
		@Pc(39) int local39 = arg1 * Static179.anInt4051 - local19 * Static1.anInt64 >> 16;
		if (local29 >= 50 && local29 <= 3500) {
			@Pc(55) int local55 = Static125.anInt3240 + (local9 << 9) / local29;
			@Pc(63) int local63 = Static157.anInt3720 + (local39 << 9) / local29;
			return local55 >= Static108.anInt2952 && local55 <= Static25.anInt874 && local63 >= Static34.anInt1158 && local63 <= Static97.anInt4165;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIILclient!lc;Lclient!lc;IIJ)V")
	public static void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub2 arg4, @OriginalArg(5) Class1_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class7 local8 = new Class7();
		local8.aLong33 = arg8;
		local8.anInt736 = arg1 * 128 + 64;
		local8.anInt739 = arg2 * 128 + 64;
		local8.anInt737 = arg3;
		local8.aClass1_Sub2_Sub2_2 = arg4;
		local8.aClass1_Sub2_Sub2_1 = arg5;
		local8.anInt733 = arg6;
		local8.anInt732 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static170.aClass1_Sub10ArrayArrayArray35[local42][arg1][arg2] == null) {
				Static170.aClass1_Sub10ArrayArrayArray35[local42][arg1][arg2] = new Class1_Sub10(local42, arg1, arg2);
			}
		}
		Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass7_1 = local8;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	public static void method537() {
		@Pc(4) int[] local4 = new int[Static109.anInt2975];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < Static109.anInt2975; local8++) {
			@Pc(14) Class1_Sub2_Sub6 local14 = Static184.method2994(local8);
			if (local14.anInt1327 >= 0 || local14.anInt1317 >= 0) {
				local4[local6++] = local8;
			}
		}
		Static156.anIntArray382 = new int[local6];
		for (@Pc(45) int local45 = 0; local45 < local6; local45++) {
			Static156.anIntArray382[local45] = local4[local45];
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	public static void method538() {
		for (@Pc(8) Class1_Sub5 local8 = (Class1_Sub5) Static149.aClass82_14.method2849(); local8 != null; local8 = (Class1_Sub5) Static149.aClass82_14.method2855()) {
			if (local8.aClass1_Sub12_Sub1_2 != null) {
				Static77.aClass1_Sub12_Sub2_1.method2355(local8.aClass1_Sub12_Sub1_2);
				local8.aClass1_Sub12_Sub1_2 = null;
			}
			if (local8.aClass1_Sub12_Sub1_1 != null) {
				Static77.aClass1_Sub12_Sub2_1.method2355(local8.aClass1_Sub12_Sub1_1);
				local8.aClass1_Sub12_Sub1_1 = null;
			}
		}
		Static149.aClass82_14.method2847();
	}
}
