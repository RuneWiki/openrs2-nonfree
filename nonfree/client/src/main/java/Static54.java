import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "[I")
	public static int[] anIntArray131;

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "Lclient!tb;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!gh", name = "T", descriptor = "[I")
	public static int[] anIntArray134;

	@OriginalMember(owner = "client!gh", name = "W", descriptor = "I")
	public static int anInt1417;

	@OriginalMember(owner = "client!gh", name = "ab", descriptor = "Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2 aClass3_Sub2_Sub3_Sub2_2;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_471 = Static65.method1172("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "Lclient!kb;")
	public static Class46 aClass46_472 = Static65.method1172("blinken2:");

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[250][];

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "Lclient!kb;")
	public static Class46 aClass46_473 = Static65.method1172("swe");

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "Lclient!kb;")
	public static Class46 aClass46_474 = Static65.method1172("(U3");

	@OriginalMember(owner = "client!gh", name = "N", descriptor = "I")
	public static int anInt1412 = -1;

	@OriginalMember(owner = "client!gh", name = "O", descriptor = "[I")
	public static int[] anIntArray133 = new int[100];

	@OriginalMember(owner = "client!gh", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_475 = Static65.method1172("<col=ff9040>");

	@OriginalMember(owner = "client!gh", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_476 = Static65.method1172("(Y<)4col>");

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!me;Lclient!ge;II)V")
	public static void method1018(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = new Class3_Sub20();
		local7.anInt3200 = 1;
		local7.aClass44_Sub1_12 = arg0;
		local7.aLong143 = arg2;
		local7.aClass30_3 = arg1;
		@Pc(22) Class59 local22 = Static161.aClass59_13;
		synchronized (Static161.aClass59_13) {
			Static161.aClass59_13.method1730(local7);
		}
		Static22.method409();
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(B)V")
	public static void method1019() {
		if (!Static88.aBoolean91) {
			return;
		}
		Static165.aClass3_Sub2_Sub3_Sub2Array8 = null;
		Static63.anIntArray157 = null;
		Static65.anIntArray165 = null;
		Static85.aClass3_Sub2_Sub3_Sub3_7 = null;
		anIntArray134 = null;
		Static99.aClass3_Sub2_Sub3_Sub2_3 = null;
		Static122.aClass3_Sub2_Sub3_Sub2Array5 = null;
		Static137.aClass3_Sub2_Sub3_Sub2_5 = null;
		Static2.anIntArray2 = null;
		Static31.anIntArray66 = null;
		Static98.aClass3_Sub2_Sub3_Sub3Array7 = null;
		Static171.aClass3_Sub2_Sub3_Sub2Array9 = null;
		Static1.anIntArray1 = null;
		Static41.aClass3_Sub2_Sub3_Sub3_39 = null;
		Static130.aClass3_Sub2_Sub3_Sub2Array6 = null;
		Static146.aClass3_Sub2_Sub3_Sub2Array7 = null;
		Static124.aClass3_Sub2_Sub3_Sub2_4 = null;
		Static128.aClass3_Sub2_Sub3_Sub3_32 = null;
		Static78.anIntArray240 = null;
		Static89.aClass3_Sub2_Sub3_Sub3_23 = null;
		Static153.anIntArray398 = null;
		Static9.aClass3_Sub2_Sub3_Sub2_1 = null;
		Static102.method1680();
		Static89.method1481(true);
		Static88.aBoolean91 = false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method1020(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static3.method56(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local41 >= local38);
			return Static90.method1503(arg0, local41);
		}
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(B)V")
	public static void method1021() {
		Static133.aClass3_Sub4_Sub1_3.method233(86);
		Static133.aClass3_Sub4_Sub1_3.method201(0L);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = 2048 - arg5 & 0x7FF;
		@Pc(21) int local21 = 2048 - arg0 & 0x7FF;
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = arg2;
		@Pc(27) int local27 = 0;
		@Pc(40) int local40;
		@Pc(36) int local36;
		@Pc(51) int local51;
		if (local21 != 0) {
			local36 = Class3_Sub2_Sub3_Sub4.anIntArray346[local21];
			local40 = Class3_Sub2_Sub3_Sub4.anIntArray347[local21];
			local51 = local36 * 0 - local40 * arg2 >> 16;
			local25 = local40 * 0 + arg2 * local36 >> 16;
			local27 = local51;
		}
		if (local14 != 0) {
			local40 = Class3_Sub2_Sub3_Sub4.anIntArray347[local14];
			local36 = Class3_Sub2_Sub3_Sub4.anIntArray346[local14];
			local51 = local25 * local40 + local36 * 0 >> 16;
			local25 = local25 * local36 - local40 * 0 >> 16;
			local23 = local51;
		}
		Static94.anInt2298 = arg4 - local27;
		Static70.anInt1833 = arg1 - local25;
		Static124.anInt2967 = arg5;
		Static134.anInt3130 = arg3 - local23;
		Static163.anInt3624 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V")
	public static void method1023() {
		aClass75_1 = null;
		aClass46_474 = null;
		aClass46_472 = null;
		aByteArrayArray9 = null;
		anIntArray134 = null;
		anIntArray133 = null;
		anIntArray131 = null;
		aClass46_476 = null;
		aClass46_471 = null;
		aClass46_473 = null;
		aClass3_Sub2_Sub3_Sub2_2 = null;
		aClass46_475 = null;
	}
}
