import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
	public static int anInt7010;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_96;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
	public static final int[] anIntArray515 = new int[25];

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
	public static int anInt7014 = 0;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lclient!rr;IIILclient!oa;IILclient!fa;I)V")
	public static void method5852(@OriginalArg(0) Class292 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class86 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class176 local14 = Static245.aClass213_3.method5127(arg1);
		if (local14 == null || !local14.aBoolean358 || !local14.method4379(Static498.aClass101_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray385 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray385.length];
			@Pc(47) int local47;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static346.anInt6215 == 4) {
					local47 = (int) Static428.aFloat160 & 0x3FFF;
				} else {
					local47 = (int) Static428.aFloat160 + Static185.anInt3860 & 0x3FFF;
				}
				@Pc(58) int local58 = Class6_Sub2_Sub7.anIntArray178[local47];
				@Pc(62) int local62 = Class6_Sub2_Sub7.anIntArray177[local47];
				if (Static346.anInt6215 != 4) {
					local62 = local62 * 256 / (Static291.anInt5446 + 256);
					local58 = local58 * 256 / (Static291.anInt5446 + 256);
				}
				local32[local34 * 2] = ((local14.anIntArray385[local34 * 2 + 1] * 4 + arg2) * local58 + local62 * (local14.anIntArray385[local34 * 2] * 4 + arg5) >> 14) + arg0.anInt7963 / 2 + arg7;
				local32[local34 * 2 + 1] = arg4 + arg0.anInt7912 / 2 - (local62 * (local14.anIntArray385[local34 * 2 + 1] * 4 + arg2) - (local14.anIntArray385[local34 * 2] * 4 + arg5) * local58 >> 14);
			}
			Static469.method6546(arg3, local32, local14.anInt5062, arg0.anIntArray574, arg0.anIntArray572);
			for (local47 = 0; local47 < local32.length / 2 - 1; local47++) {
				arg3.method6877(local32[local47 * 2], local32[local47 * 2 + 1], local32[local47 * 2 + 2], local32[local47 * 2 + 3], local14.anInt5078, arg6, arg7, arg4);
			}
			arg3.method6877(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt5078, arg6, arg7, arg4);
		}
		@Pc(262) Class58 local262 = null;
		if (local14.anInt5058 != -1) {
			local262 = local14.method4380(false, arg3);
			if (local262 != null) {
				Static368.method5525(arg5, local262, arg2, arg4, arg7, arg6, arg0);
			}
		}
		if (local14.aString38 == null) {
			return;
		}
		local34 = 0;
		if (local262 != null) {
			local34 = local262.b();
		}
		@Pc(296) Class92 local296 = Static319.aClass92_11;
		@Pc(298) Class327 local298 = Static435.aClass327_10;
		if (local14.anInt5060 == 1) {
			local296 = Static101.aClass92_9;
			local298 = Static8.aClass327_1;
		}
		if (local14.anInt5060 == 2) {
			local298 = Static555.aClass327_13;
			local296 = Static114.aClass92_4;
		}
		Static283.method4641(arg4, local14.anInt5074, local296, arg0, arg7, local298, local14.aString38, local34, arg5, arg2, arg6);
		return;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Lclient!fc;")
	public static Class6_Sub2_Sub7 method5853() {
		@Pc(13) Class6_Sub2_Sub7 local13 = (Class6_Sub2_Sub7) Static463.aClass180_11.method4466();
		if (local13 != null) {
			local13.method7804();
			local13.method7405();
			return local13;
		}
		do {
			local13 = (Class6_Sub2_Sub7) Static304.aClass180_10.method4466();
			if (local13 == null) {
				return null;
			}
			if (local13.method2581() > Static8.method201()) {
				return null;
			}
			local13.method7804();
			local13.method7405();
		} while ((Long.MIN_VALUE & local13.aLong247) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "([II[J)V")
	public static void method5854(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static535.method7307(arg0, 0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII[BII)Z")
	public static boolean method5856(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg4 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(47) int local47 = local38; local47 < 0; local47++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local13;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}
}
