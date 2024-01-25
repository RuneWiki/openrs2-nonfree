import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
	public static int anInt3198 = 0;

	@OriginalMember(owner = "client!jj", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString115 = "level: ";

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ne;I)V")
	public static void method2971(@OriginalArg(0) Class146 arg0) {
		@Pc(7) Class146 local7 = Static78.method1945(arg0);
		@Pc(11) int local11;
		@Pc(13) int local13;
		if (local7 == null) {
			local11 = Static294.anInt5659;
			local13 = Static46.anInt1173;
		} else {
			local13 = local7.anInt4199;
			local11 = local7.anInt4133;
		}
		Static220.method3966(false, arg0, local11, local13);
		Static42.method1039(local11, arg0, local13);
	}

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
	public static void method2972() {
		if (Static12.aString9.toLowerCase().indexOf("microsoft") != -1) {
			Static138.anIntArray268[221] = 43;
			Static138.anIntArray268[223] = 28;
			Static138.anIntArray268[220] = 74;
			Static138.anIntArray268[222] = 59;
			Static138.anIntArray268[190] = 72;
			Static138.anIntArray268[188] = 71;
			Static138.anIntArray268[219] = 42;
			Static138.anIntArray268[187] = 27;
			Static138.anIntArray268[189] = 26;
			Static138.anIntArray268[186] = 57;
			Static138.anIntArray268[192] = 58;
			Static138.anIntArray268[191] = 73;
			return;
		}
		Static138.anIntArray268[93] = 43;
		Static138.anIntArray268[59] = 57;
		Static138.anIntArray268[44] = 71;
		Static138.anIntArray268[46] = 72;
		Static138.anIntArray268[45] = 26;
		Static138.anIntArray268[61] = 27;
		if (Static12.aMethod1 == null) {
			Static138.anIntArray268[222] = 59;
			Static138.anIntArray268[192] = 58;
		} else {
			Static138.anIntArray268[222] = 58;
			Static138.anIntArray268[520] = 59;
			Static138.anIntArray268[192] = 28;
		}
		Static138.anIntArray268[47] = 73;
		Static138.anIntArray268[91] = 42;
		Static138.anIntArray268[92] = 74;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method2973(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static279.aString199 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static8.aString6 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "([IZI)[I")
	public static int[] method2975(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[1152];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			for (@Pc(21) int local21 = 0; local21 < 36; local21++) {
				@Pc(27) int local27 = arg0[local10];
				if (local27 == 0) {
					if (local21 > 0 && arg0[local10 - 1] != 0) {
						local27 = arg1;
					} else if (local17 > 0 && arg0[local10 - 36] != 0) {
						local27 = arg1;
					} else if (local21 < 35 && arg0[local10 + 1] != 0) {
						local27 = arg1;
					} else if (local17 < 31 && arg0[local10 + 36] != 0) {
						local27 = arg1;
					}
				}
				local8[local10++] = local27;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II[II)V")
	public static void method2976(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg0) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) int local16 = arg1[local10];
		arg1[local10] = arg1[arg0];
		arg1[arg0] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg0];
		arg2[arg0] = local30;
		for (@Pc(42) int local42 = arg3; local42 < arg0; local42++) {
			if (arg1[local42] < local16 + (local42 & 0x1)) {
				@Pc(57) int local57 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local57;
				@Pc(71) int local71 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local71;
			}
		}
		arg1[arg0] = arg1[local12];
		arg1[local12] = local16;
		arg2[arg0] = arg2[local12];
		arg2[local12] = local30;
		method2976(local12 - 1, arg1, arg2, arg3);
		method2976(arg0, arg1, arg2, local12 + 1);
	}
}
