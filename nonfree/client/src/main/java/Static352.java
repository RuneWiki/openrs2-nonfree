import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!ra;")
	public static Class170 aClass170_124;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Lclient!la;")
	public static Class5_Sub17_Sub2 aClass5_Sub17_Sub2_3;

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "Lclient!cs;")
	public static Class42 aClass42_61 = new Class42(16);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)I")
	public static int method5793(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)S")
	public static short method5794(@OriginalArg(1) int arg0) {
		@Pc(16) int local16 = arg0 >> 10 & 0x3F;
		@Pc(22) int local22 = arg0 >> 3 & 0x70;
		@Pc(26) int local26 = arg0 & 0x7F;
		@Pc(44) int local44 = local26 <= 64 ? local22 * local26 >> 7 : local22 * (127 - local26) >> 7;
		@Pc(48) int local48 = local44 + local26;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local16 << 10 | local57 >> 4 << 7 | local48);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5795(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static31.anInt829; local11++) {
			if (arg0.equalsIgnoreCase(Static61.aStringArray8[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	public static void method5796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub9_Sub16 local12 = Static239.method4052(6, arg1);
		local12.method4140();
		local12.anInt4723 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!jf;BII)V")
	public static void method5797(@OriginalArg(0) Class96 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte33 == 0) {
			arg0.anInt2951 = arg0.anInt2917;
		} else if (arg0.aByte33 == 1) {
			arg0.anInt2951 = (arg1 - arg0.anInt2916) / 2 + arg0.anInt2917;
		} else if (arg0.aByte33 == 2) {
			arg0.anInt2951 = arg1 - arg0.anInt2916 - arg0.anInt2917;
		} else if (arg0.aByte33 == 3) {
			arg0.anInt2951 = arg1 * arg0.anInt2917 >> 14;
		} else if (arg0.aByte33 == 4) {
			arg0.anInt2951 = (arg1 - arg0.anInt2916) / 2 + (arg1 * arg0.anInt2917 >> 14);
		} else {
			arg0.anInt2951 = arg1 - arg0.anInt2916 - (arg1 * arg0.anInt2917 >> 14);
		}
		if (arg0.aByte35 == 0) {
			arg0.anInt2893 = arg0.anInt2870;
		} else if (arg0.aByte35 == 1) {
			arg0.anInt2893 = (arg2 - arg0.anInt2943) / 2 + arg0.anInt2870;
		} else if (arg0.aByte35 == 2) {
			arg0.anInt2893 = arg2 - arg0.anInt2943 - arg0.anInt2870;
		} else if (arg0.aByte35 == 3) {
			arg0.anInt2893 = arg0.anInt2870 * arg2 >> 14;
		} else if (arg0.aByte35 == 4) {
			arg0.anInt2893 = (arg2 - arg0.anInt2943) / 2 + (arg0.anInt2870 * arg2 >> 14);
		} else {
			arg0.anInt2893 = arg2 - arg0.anInt2943 - (arg2 * arg0.anInt2870 >> 14);
		}
		if (!Static213.aBoolean311 || Static43.method975(arg0).anInt1281 == 0 && arg0.anInt2933 != 0) {
			return;
		}
		if (arg0.anInt2951 < 0) {
			arg0.anInt2951 = 0;
		} else if (arg1 < arg0.anInt2916 + arg0.anInt2951) {
			arg0.anInt2951 = arg1 - arg0.anInt2916;
		}
		if (arg0.anInt2893 < 0) {
			arg0.anInt2893 = 0;
		} else if (arg0.anInt2893 + arg0.anInt2943 > arg2) {
			arg0.anInt2893 = arg2 - arg0.anInt2943;
			return;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZI)I")
	public static int method5798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
