import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!oe;")
	public static Class45 aClass45_4 = new Class45();

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt1609 = -1;

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray5 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
	public static int[] anIntArray184 = new int[2000];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIILclient!ee;IIB)V")
	public static void method982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub7 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static42.aBoolean71) {
			Static82.anInt2312 = 32;
		} else {
			Static82.anInt2312 = 0;
		}
		Static42.aBoolean71 = false;
		if (arg7 <= arg1 && arg7 + 16 > arg1 && arg2 <= arg0 && arg2 + 16 > arg0) {
			if (arg4 == 1) {
				Static34.aBoolean60 = true;
			}
			arg5.anInt822 -= Static41.anInt1432 * 4;
			if (arg4 == 2 || arg4 == 3) {
				Static102.aBoolean123 = true;
			}
		} else if (arg7 <= arg1 && arg7 + 16 > arg1 && arg6 + arg2 - 16 <= arg0 && arg0 < arg2 + arg6) {
			if (arg4 == 1) {
				Static34.aBoolean60 = true;
			}
			if (arg4 == 2 || arg4 == 3) {
				Static102.aBoolean123 = true;
			}
			arg5.anInt822 += Static41.anInt1432 * 4;
		} else if (arg7 - Static82.anInt2312 <= arg1 && arg7 + Static82.anInt2312 + 16 > arg1 && arg2 + 16 <= arg0 && arg2 + arg6 - 16 > arg0 && Static41.anInt1432 > 0) {
			if (arg4 == 2 || arg4 == 3) {
				Static102.aBoolean123 = true;
			}
			Static42.aBoolean71 = true;
			if (arg4 == 1) {
				Static34.aBoolean60 = true;
			}
			@Pc(163) int local163 = arg6 * (arg6 - 32) / arg3;
			if (local163 < 8) {
				local163 = 8;
			}
			@Pc(175) int local175 = arg6 - local163 - 32;
			@Pc(186) int local186 = arg0 - arg2 - local163 / 2 - 16;
			arg5.anInt822 = local186 * (arg3 - arg6) / local175;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!rb;III)[Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3[] method983(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static106.method1796(arg2, arg0, arg1) ? Static105.method1782() : null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLclient!rb;ZLclient!rb;Lclient!he;)V")
	public static void method984(@OriginalArg(1) Class55 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) Class1_Sub1_Sub6_Sub2 arg3) {
		Static88.aBoolean64 = arg1;
		Static32.aClass55_17 = arg2;
		Static39.aClass55_20 = arg0;
		Static5.anInt142 = Static32.aClass55_17.method1865(10);
		Static28.aClass1_Sub1_Sub6_Sub2_12 = arg3;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!ib;")
	public static Class1_Sub1_Sub9 method985(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub9 local10 = (Class1_Sub1_Sub9) Static40.aClass5_34.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static11.aClass55_4.method1867(arg0, 13);
		local10 = new Class1_Sub1_Sub9();
		local10.anInt1422 = arg0;
		if (local25 != null) {
			local10.method890(new Class1_Sub5(local25));
		}
		Static40.aClass5_34.method97(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method986() {
		Static92.aClass34_84.method1138();
		Static67.aClass1_Sub1_Sub6_Sub3_18.method1194(0, 0);
		Static44.anIntArray175 = Static93.method1588(Static44.anIntArray175);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZI)I")
	public static int method987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 >> 7;
		@Pc(16) int local16 = arg0 >> 7;
		if (local3 < 0 || local16 < 0 || local3 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg2;
		if (arg2 < 3 && (Static95.aByteArrayArrayArray5[1][local3][local16] & 0x2) == 2) {
			local33 = arg2 + 1;
		}
		@Pc(54) int local54 = arg1 & 0x7F;
		@Pc(85) int local85 = (128 - local54) * Static72.anIntArrayArrayArray5[local33][local3][local16 + 1] + local54 * Static72.anIntArrayArrayArray5[local33][local3 + 1][local16 + 1] >> 7;
		@Pc(89) int local89 = arg0 & 0x7F;
		@Pc(117) int local117 = Static72.anIntArrayArrayArray5[local33][local3][local16] * (128 - local54) + Static72.anIntArrayArrayArray5[local33][local3 + 1][local16] * local54 >> 7;
		return local89 * local85 + (128 - local89) * local117 >> 7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method988() {
		aClass45_4 = null;
		aBooleanArray5 = null;
		anIntArray184 = null;
	}
}
