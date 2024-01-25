import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "[I")
	public static final int[] anIntArray595 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
	public static boolean aBoolean515 = false;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray63 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "[S")
	public static final short[] aShortArray109 = new short[] { 8, 20, 57, 19, 25, 46, 15, 48 };

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
	public static int anInt6195 = -1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	public static void method5552() {
		@Pc(9) Class109 local9 = Static110.aClass109_25;
		synchronized (Static110.aClass109_25) {
			Static110.aClass109_25.method2859(5);
		}
		local9 = Static289.aClass109_51;
		synchronized (Static289.aClass109_51) {
			Static289.aClass109_51.method2859(5);
		}
		local9 = Static78.aClass109_21;
		synchronized (Static78.aClass109_21) {
			Static78.aClass109_21.method2859(5);
		}
		local9 = Static321.aClass109_58;
		synchronized (Static321.aClass109_58) {
			Static321.aClass109_58.method2859(5);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)V")
	public static void method5554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg2 << 1) - 3);
		@Pc(77) int local77 = local55;
		Static160.method2840(arg3, arg1 + arg4, arg1 - arg4, Static129.anIntArrayArray46[arg0]);
		@Pc(95) int local95 = local51 * (arg2 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local77 += local55;
					local63 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local77;
				local77 += local55;
				local63 += local55;
				local7++;
			}
			local47 += -local71;
			local38 += -local95;
			local9--;
			local71 -= local51;
			local95 -= local51;
			@Pc(166) int local166 = arg0 - local9;
			@Pc(170) int local170 = local9 + arg0;
			@Pc(174) int local174 = local7 + arg1;
			@Pc(179) int local179 = arg1 - local7;
			Static160.method2840(arg3, local174, local179, Static129.anIntArrayArray46[local166]);
			Static160.method2840(arg3, local174, local179, Static129.anIntArrayArray46[local170]);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZIIZ)I")
	public static int method5555(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(8) Class5_Sub14 local8 = Static319.method5550(false, arg1);
		if (local8 == null) {
			return 0;
		}
		@Pc(14) int local14 = 0;
		for (@Pc(21) int local21 = 0; local21 < local8.anIntArray129.length; local21++) {
			if (local8.anIntArray129[local21] >= 0 && Static102.anInt1937 > local8.anIntArray129[local21]) {
				@Pc(47) Class130 local47 = Static322.method544(local8.anIntArray129[local21]);
				@Pc(56) int local56 = local47.method3444(arg0, Static86.method1559(arg0).anInt5597);
				if (arg2) {
					local14 += local8.anIntArray128[local21] * local56;
				} else {
					local14 += local56;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(II)I")
	public static int method5556(@OriginalArg(1) int arg0) {
		@Pc(24) int local24 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(34) int local34 = (local24 >>> 2 & 0x33333333) + (local24 & 0x33333333);
		@Pc(42) int local42 = (local34 >>> 4) + local34 & 0xF0F0F0F;
		@Pc(48) int local48 = local42 + (local42 >>> 8);
		@Pc(54) int local54 = local48 + (local48 >>> 16);
		return local54 & 0xFF;
	}
}
