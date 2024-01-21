import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!he", name = "C", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!he", name = "X", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "Lclient!r;")
	private static Class61 aClass61_379 = Static129.method2060("Please try again)3");

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!r;")
	public static Class61 aClass61_376 = aClass61_379;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!he", name = "J", descriptor = "I")
	public static int anInt1243 = 0;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_377 = Static129.method2060("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!r;")
	private static Class61 aClass61_382 = Static129.method2060("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_378 = aClass61_382;

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!r;")
	private static Class61 aClass61_381 = Static129.method2060("Drop");

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!r;")
	public static Class61 aClass61_380 = aClass61_381;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
	public static void method876() {
		aClass61_378 = null;
		aBooleanArray5 = null;
		aClass61_380 = null;
		aClass61_377 = null;
		aByteArrayArrayArray3 = null;
		anIntArray190 = null;
		aClass61_382 = null;
		aClass61_381 = null;
		aClass61_376 = null;
		aClass61_379 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIBIII)V")
	public static void method878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg0 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		@Pc(21) int local21 = 2048 - arg1 & 0x7FF;
		@Pc(23) int local23 = arg3;
		@Pc(33) int local33;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local10 != 0) {
			local29 = Class5_Sub2_Sub1_Sub2.anIntArray197[local10];
			local33 = Class5_Sub2_Sub1_Sub2.anIntArray198[local10];
			local44 = local29 * 0 - arg3 * local33 >> 16;
			local23 = arg3 * local29 + local33 * 0 >> 16;
			local14 = local44;
		}
		if (local21 != 0) {
			local29 = Class5_Sub2_Sub1_Sub2.anIntArray197[local21];
			local33 = Class5_Sub2_Sub1_Sub2.anIntArray198[local21];
			local44 = local29 * 0 + local23 * local33 >> 16;
			local23 = local23 * local29 - local33 * 0 >> 16;
			local12 = local44;
		}
		Static78.anInt1986 = arg4 - local14;
		Static78.anInt1985 = arg0;
		Static40.anInt1074 = arg2 - local23;
		Static22.anInt683 = arg5 - local12;
		Static1.anInt15 = arg1;
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	public static void method879() {
		if (Static108.aClass12_2 != null) {
			Static108.aClass12_2.method1512();
		}
		if (Static43.aClass12_3 != null) {
			Static43.aClass12_3.method1512();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!hd;)V")
	public static void method880(@OriginalArg(1) Class32 arg0) {
		Static91.aClass32_1 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZIZI)Lclient!jf;")
	public static Class26_Sub1 method881(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(6) Class40 local6 = null;
		if (Static108.aClass8_2 != null) {
			local6 = new Class40(arg3, Static108.aClass8_2, Static125.aClass8Array1[arg3], 1000000);
		}
		return new Class26_Sub1(local6, Static55.aClass40_2, arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	public static void method882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg1; local7 <= arg1 + arg0; local7++) {
			for (@Pc(11) int local11 = arg3; local11 <= arg3 + arg2; local11++) {
				if (local11 >= 0 && local11 < 104 && local7 >= 0 && local7 < 104) {
					Static20.aByteArrayArrayArray1[0][local11][local7] = 127;
					if (local11 == arg3 && local11 > 0) {
						Static65.anIntArrayArrayArray3[0][local11][local7] = Static65.anIntArrayArrayArray3[0][local11 - 1][local7];
					}
					if (arg2 + arg3 == local11 && local11 < 103) {
						Static65.anIntArrayArrayArray3[0][local11][local7] = Static65.anIntArrayArrayArray3[0][local11 + 1][local7];
					}
					if (local7 == arg1 && local7 > 0) {
						Static65.anIntArrayArrayArray3[0][local11][local7] = Static65.anIntArrayArrayArray3[0][local11][local7 - 1];
					}
					if (arg1 + arg0 == local7 && local7 < 103) {
						Static65.anIntArrayArrayArray3[0][local11][local7] = Static65.anIntArrayArrayArray3[0][local11][local7 + 1];
					}
				}
			}
		}
	}
}
