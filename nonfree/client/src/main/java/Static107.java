import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_17;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array9;

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] aClass4_Sub3_Sub6_Sub2Array10;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "Lclient!od;")
	public static Class60 aClass60_995 = Static41.method597(")1j");

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
	public static int[] anIntArray323 = new int[256];

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "[I")
	public static int[] anIntArray324 = new int[100];

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "[J")
	public static long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "Lclient!od;")
	public static Class60 aClass60_996 = Static41.method597("mapmarker");

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "I")
	public static int anInt2530 = 0;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method1753() {
		Static49.aClass12_9.method284();
		Static109.aClass12_25.method284();
		Static102.aClass12_24.method284();
		Static81.aClass12_17.method284();
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	public static void method1755() {
		aClass4_Sub3_Sub6_Sub2Array9 = null;
		anIntArray324 = null;
		aClass60_995 = null;
		anIntArray323 = null;
		aClass4_Sub3_Sub6_Sub2Array10 = null;
		aClass10_Sub1_17 = null;
		aClass60_996 = null;
		aLongArray6 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIB)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg0; local7++) {
			for (@Pc(11) int local11 = arg2; local11 <= arg2 + arg3; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static66.aByteArrayArrayArray4[0][local11][local7] = 127;
					if (arg2 == local11 && local11 > 0) {
						Static16.anIntArrayArrayArray1[0][local11][local7] = Static16.anIntArrayArrayArray1[0][local11 - 1][local7];
					}
					if (local11 == arg3 + arg2 && local11 < 103) {
						Static16.anIntArrayArrayArray1[0][local11][local7] = Static16.anIntArrayArrayArray1[0][local11 + 1][local7];
					}
					if (arg1 == local7 && local7 > 0) {
						Static16.anIntArrayArrayArray1[0][local11][local7] = Static16.anIntArrayArrayArray1[0][local11][local7 - 1];
					}
					if (local7 == arg1 + arg0 && local7 < 103) {
						Static16.anIntArrayArrayArray1[0][local11][local7] = Static16.anIntArrayArrayArray1[0][local11][local7 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!hc;)V")
	public static void method1758(@OriginalArg(1) Class31 arg0) {
		Static5.aClass31_1 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILclient!c;ILclient!c;)Lclient!v;")
	public static Class4_Sub3_Sub15 method1760(@OriginalArg(2) Class10 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class10 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method1773(arg1);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(24) byte[] local24 = arg0.method1783(arg1, local12[local14]);
			if (local24 == null) {
				local7 = false;
			} else {
				@Pc(44) int local44 = local24[1] & 0xFF | (local24[0] & 0xFF) << 8;
				@Pc(52) byte[] local52 = arg2.method1783(local44, 0);
				if (local52 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class4_Sub3_Sub15(arg0, arg2, arg1, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}
}
