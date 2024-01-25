import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "F")
	public static float aFloat54;

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
	public static int anInt3592 = 0;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_47 = new Class276(13, -2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
	public static int method3152(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([[BLclient!iaa;B)V")
	public static void method3153(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class152_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt4295; local18++) {
			Static129.method8413();
			for (@Pc(24) int local24 = 0; local24 < Static460.anInt8640 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static292.anInt7682 >> 3; local28++) {
					@Pc(38) int local38 = Static270.anIntArrayArrayArray7[local18][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean335 || local47 == 0) {
							@Pc(61) int local61 = local38 >> 1 & 0x3;
							@Pc(67) int local67 = local38 >> 14 & 0x3FF;
							@Pc(73) int local73 = local38 >> 3 & 0x7FF;
							@Pc(83) int local83 = local73 / 8 + (local67 / 8 << 8);
							for (@Pc(85) int local85 = 0; local85 < Static478.anIntArray584.length; local85++) {
								if (local83 == Static478.anIntArray584[local85] && arg0[local85] != null) {
									@Pc(107) Class3_Sub7 local107 = new Class3_Sub7(arg0[local85]);
									arg1.method3660(local18, local107, local73, local24 * 8, Static403.aClass350Array1, local47, local61, local28 * 8, local67);
									arg1.method3666(local67, local73, local24 * 8, local28 * 8, local107, local61, local18, Static546.aClass15_16, local12[0] == -1 ? local12 : null, local47);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static429.aClass140_1 = Static271.aClass176_1.method4570(local12[2], local12[3], local12[0], Static136.aClass272_1, local12[1]);
			Static324.anInt6777 = local12[4];
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII[BI[BI)V")
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(21) int local21 = -(arg0 >> 2);
		@Pc(26) int local26 = -(arg0 & 0x3);
		for (@Pc(29) int local29 = -arg2; local29 < 0; local29++) {
			@Pc(37) int local37;
			for (@Pc(33) int local33 = local21; local33 < 0; local33++) {
				local37 = arg1++;
				arg6[local37] += arg4[arg7++];
				@Pc(49) int local49 = arg1++;
				arg6[local49] += arg4[arg7++];
				@Pc(61) int local61 = arg1++;
				arg6[local61] += arg4[arg7++];
				@Pc(73) int local73 = arg1++;
				arg6[local73] += arg4[arg7++];
			}
			for (@Pc(88) int local88 = local26; local88 < 0; local88++) {
				local37 = arg1++;
				arg6[local37] += arg4[arg7++];
			}
			arg1 += arg5;
			arg7 += arg3;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/String;IZIZLjava/lang/String;)V")
	public static void method3156(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) String arg5) {
		Static497.aClass254_125.anInt7731 = 1;
		@Pc(9) String local9 = arg5.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg2 != -1) {
			@Pc(24) Class240 local24 = Static299.aClass17_2.method758(arg2);
			if (local24 == null || arg3 != local24.method6075()) {
				return;
			}
			if (local24.method6075()) {
				local16 = local24.aString83;
			} else {
				local14 = local24.anInt7291;
			}
		}
		@Pc(53) int local53 = 0;
		for (@Pc(55) int local55 = 0; local55 < Static517.aClass23_2.anInt777; local55++) {
			@Pc(61) Class18 local61 = Static517.aClass23_2.method901(local55);
			if ((!arg4 || local61.aBoolean57) && local61.anInt676 == -1 && local61.anInt657 == -1 && local61.anInt662 == 0 && local61.aString6.toLowerCase().indexOf(local9) != -1) {
				if (arg2 != -1) {
					if (arg3) {
						if (!arg1.equals(local61.method764(arg2, local16))) {
							continue;
						}
					} else if (arg0 != local61.method763(local14, arg2)) {
						continue;
					}
				}
				if (local53 >= 250) {
					Static68.aShortArray21 = null;
					Static569.anInt10059 = -1;
					return;
				}
				if (local53 >= local12.length) {
					@Pc(131) short[] local131 = new short[local12.length * 2];
					for (@Pc(133) int local133 = 0; local133 < local53; local133++) {
						local131[local133] = local12[local133];
					}
					local12 = local131;
				}
				local12[local53++] = (short) local55;
			}
		}
		Static68.aShortArray21 = local12;
		Static319.anInt6594 = 0;
		Static569.anInt10059 = local53;
		@Pc(170) String[] local170 = new String[Static569.anInt10059];
		for (@Pc(172) int local172 = 0; local172 < Static569.anInt10059; local172++) {
			local170[local172] = Static517.aClass23_2.method901(local12[local172]).aString6;
		}
		Static593.method8377(local170, Static68.aShortArray21);
		Static497.aClass254_125.method6392();
		Static497.aClass254_125.anInt7731 = 2;
	}
}
