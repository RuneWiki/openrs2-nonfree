import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ra", name = "z", descriptor = "Lclient!af;")
	private static Class5 aClass5_1199 = Static45.method1937("Loaded config");

	@OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
	public static int anInt2526 = 0;

	@OriginalMember(owner = "client!ra", name = "C", descriptor = "Lclient!af;")
	public static Class5 aClass5_1200 = Static45.method1937("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ra", name = "D", descriptor = "Lclient!af;")
	public static Class5 aClass5_1201 = Static45.method1937("::clientdrop");

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_1202 = aClass5_1199;

	@OriginalMember(owner = "client!ra", name = "H", descriptor = "[Z")
	public static boolean[] aBooleanArray24 = new boolean[112];

	@OriginalMember(owner = "client!ra", name = "I", descriptor = "Lclient!af;")
	public static Class5 aClass5_1203 = Static45.method1937("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "[I")
	public static int[] anIntArray389 = new int[128];

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method1744() {
		anIntArray389 = null;
		aClass5_1202 = null;
		aClass5_1203 = null;
		aBooleanArray24 = null;
		aClass5_1199 = null;
		aClass5_1200 = null;
		aClass5_1201 = null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public static void method1745() {
		for (@Pc(10) Class1_Sub5 local10 = (Class1_Sub5) Static66.aClass7_14.method288(); local10 != null; local10 = (Class1_Sub5) Static66.aClass7_14.method284()) {
			@Pc(15) int local15 = local10.anInt862;
			if (Static8.method244(local15)) {
				@Pc(23) Class1_Sub17[] local23 = Static49.aClass1_Sub17ArrayArray1[local15];
				@Pc(25) boolean local25 = true;
				for (@Pc(27) int local27 = 0; local27 < local23.length; local27++) {
					if (local23[local27] != null) {
						local25 = local23[local27].aBoolean89;
						break;
					}
				}
				if (!local25) {
					@Pc(51) int local51 = (int) local10.aLong95;
					@Pc(55) Class1_Sub17 local55 = Static36.method680(local51);
					if (local55 != null) {
						Static119.method2161(local55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)I")
	public static int method1746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(30) int local30 = arg1;
		@Pc(34) int local34 = arg2 & 0x7F;
		if (arg1 < 3 && (Static25.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
			local30 = arg1 + 1;
		}
		@Pc(53) int local53 = arg0 & 0x7F;
		@Pc(80) int local80 = (128 - local34) * Static95.anIntArrayArrayArray2[local30][local7][local11] + local34 * Static95.anIntArrayArrayArray2[local30][local7 + 1][local11] >> 7;
		@Pc(116) int local116 = Static95.anIntArrayArrayArray2[local30][local7 + 1][local11 + 1] * local34 + (128 - local34) * Static95.anIntArrayArrayArray2[local30][local7][local11 + 1] >> 7;
		return local116 * local53 + (128 - local53) * local80 >> 7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Z")
	public static boolean method1747(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
