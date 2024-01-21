import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2471 = Static118.method2249("Versteckt");

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2472 = Static118.method2249("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2473 = Static118.method2249(":assistreq:");

	@OriginalMember(owner = "client!v", name = "k", descriptor = "I")
	public static int anInt4167 = 0;

	@OriginalMember(owner = "client!v", name = "l", descriptor = "[I")
	public static final int[] anIntArray474 = new int[2048];

	@OriginalMember(owner = "client!v", name = "r", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2474 = Static118.method2249("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
	public static void method3143(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < Static33.anInt973; local12++) {
			if (arg0 == Static206.aLongArray10[local12]) {
				Static33.anInt973--;
				for (@Pc(29) int local29 = local12; local29 < Static33.anInt973; local29++) {
					Static125.aClass65Array41[local29] = Static125.aClass65Array41[local29 + 1];
					Static9.anIntArray16[local29] = Static9.anIntArray16[local29 + 1];
					Static53.aClass65Array19[local29] = Static53.aClass65Array19[local29 + 1];
					Static206.aLongArray10[local29] = Static206.aLongArray10[local29 + 1];
					Static46.anIntArray116[local29] = Static46.anIntArray116[local29 + 1];
				}
				Static68.anInt1494 = Static1.anInt4459;
				Static45.aClass1_Sub14_Sub1_8.method1761(46);
				Static45.aClass1_Sub14_Sub1_8.method1721(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIILclient!wg;IZJ)Z")
	public static boolean method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) long arg11) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= Static201.anInt3978 || local4 >= Static198.anInt4264) {
					return false;
				}
				@Pc(25) Class1_Sub7 local25 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][local1][local4];
				if (local25 != null && local25.anInt1677 >= 5) {
					return false;
				}
			}
		}
		@Pc(49) Class54 local49 = new Class54();
		local49.aLong83 = arg11;
		local49.anInt2638 = arg0;
		local49.anInt2641 = arg5;
		local49.anInt2633 = arg6;
		local49.anInt2646 = arg7;
		local49.aClass6_5 = arg8;
		local49.anInt2635 = arg9;
		local49.anInt2639 = arg1;
		local49.anInt2632 = arg2;
		local49.anInt2636 = arg1 + arg3 - 1;
		local49.anInt2640 = arg2 + arg4 - 1;
		for (@Pc(92) int local92 = arg1; local92 < arg1 + arg3; local92++) {
			for (@Pc(95) int local95 = arg2; local95 < arg2 + arg4; local95++) {
				@Pc(98) int local98 = 0;
				if (local92 > arg1) {
					local98++;
				}
				if (local92 < arg1 + arg3 - 1) {
					local98 += 4;
				}
				if (local95 > arg2) {
					local98 += 8;
				}
				if (local95 < arg2 + arg4 - 1) {
					local98 += 2;
				}
				for (@Pc(124) int local124 = arg0; local124 >= 0; local124--) {
					if (Static83.aClass1_Sub7ArrayArrayArray1[local124][local92][local95] == null) {
						Static83.aClass1_Sub7ArrayArrayArray1[local124][local92][local95] = new Class1_Sub7(local124, local92, local95);
					}
				}
				@Pc(157) Class1_Sub7 local157 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][local92][local95];
				local157.aClass54Array2[local157.anInt1677] = local49;
				local157.anIntArray161[local157.anInt1677] = local98;
				local157.anInt1676 |= local98;
				local157.anInt1677++;
			}
		}
		if (arg10) {
			Static192.aClass54Array3[Static41.anInt1103++] = local49;
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	public static void method3154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class88 local13 = local7.aClass88_1;
		if (local13 != null) {
			local13.anInt4105 = local13.anInt4105 * arg3 / 16;
			local13.anInt4106 = local13.anInt4106 * arg3 / 16;
		}
	}
}
