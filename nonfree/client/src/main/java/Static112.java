import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
	public static int anInt2457;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!qm;IZIIIIIIBLclient!uc;II)Lclient!uc;")
	public static Class12_Sub2 method1922(@OriginalArg(0) int arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class12_Sub2 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) long local27 = ((long) arg11 << 48) + (long) (arg2 - (-(arg9 << 16) - (arg0 << 24))) + ((long) arg5 << 32);
		@Pc(33) Class12_Sub2 local33 = (Class12_Sub2) Static18.aClass33_3.method841(local27);
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(156) int local156;
		if (local33 == null) {
			@Pc(48) byte local48;
			if (arg2 == 1) {
				local48 = 9;
			} else if (arg2 == 2) {
				local48 = 12;
			} else if (arg2 == 3) {
				local48 = 15;
			} else if (arg2 == 4) {
				local48 = 18;
			} else {
				local48 = 21;
			}
			@Pc(84) int[] local84 = new int[] { 64, 96, 128 };
			@Pc(104) Class12_Sub7 local104 = new Class12_Sub7(local48 * 3 + 1, -local48 + 2 * 3 * local48, 0);
			@Pc(108) int[][] local108 = new int[3][local48];
			local114 = local104.method3333(0, 0);
			for (local116 = 0; local116 < 3; local116++) {
				local127 = local84[local116];
				local131 = local84[local116];
				for (@Pc(133) int local133 = 0; local133 < local48; local133++) {
					@Pc(146) int local146 = (local133 << 11) / local48;
					local156 = local127 * Class131.anIntArray355[local146] + arg8 >> 16;
					@Pc(166) int local166 = Class131.anIntArray353[local146] * local131 + arg7 >> 16;
					local108[local116][local133] = local104.method3333(local156, local166);
				}
			}
			for (local116 = 0; local116 < 3; local116++) {
				local127 = (local116 * 256 + 128) / 3;
				local131 = 256 - local127;
				@Pc(249) short local249 = (short) ((local131 * (arg5 & 0x7F) + local127 * (arg11 & 0x7F) & 0x7F00) + (local127 * (arg11 & 0xFC00) + (arg5 & 0xFC00) * local131 & 0xFC0000) + ((arg5 & 0x380) * local131 + local127 * (arg11 & 0x380) & 0x38000) >> 8);
				@Pc(260) byte local260 = (byte) (local127 * arg0 + local131 * arg9 >> 8);
				for (local156 = 0; local156 < local48; local156++) {
					if (local116 == 0) {
						local104.method3328(local114, local108[0][(local156 + 1) % local48], local108[0][local156], local249, local260);
					} else {
						local104.method3328(local108[local116 - 1][local156], local108[local116 - 1][(local156 + 1) % local48], local108[local116][(local156 + 1) % local48], local249, local260);
						local104.method3328(local108[local116 - 1][local156], local108[local116][(local156 + 1) % local48], local108[local116][local156], local249, local260);
					}
				}
			}
			local33 = local104.method3325(64, 768, -50, -10, -50);
			Static18.aClass33_3.method845(local33, local27);
		}
		@Pc(382) int local382 = arg2 * 64 - 1;
		@Pc(385) int local385 = -local382;
		@Pc(388) int local388 = -local382;
		@Pc(390) int local390 = local382;
		local114 = local382;
		@Pc(401) int local401 = arg10.method3148();
		local116 = arg10.method3146();
		local127 = arg10.method3147();
		if (arg3) {
			if (arg4 > 1152 && arg4 < 1920) {
				local390 = local382 + 128;
			}
			if (arg4 > 1664 || arg4 < 384) {
				local388 -= 128;
			}
			if (arg4 > 128 && arg4 < 896) {
				local385 -= 128;
			}
			if (arg4 > 640 && arg4 < 1408) {
				local114 = local382 + 128;
			}
		}
		if (local388 > local127) {
			local127 = local388;
		}
		if (local401 < local385) {
			local401 = local385;
		}
		local131 = arg10.method3153();
		if (local390 < local116) {
			local116 = local390;
		}
		@Pc(471) Class4_Sub2_Sub19 local471 = null;
		if (local131 > local114) {
			local131 = local114;
		}
		if (arg1 != null) {
			@Pc(484) int local484 = arg1.anIntArray390[arg12];
			local471 = Static57.method928(local484 >> 16);
			arg12 = local484 & 0xFFFF;
		}
		if (local471 == null) {
			local33 = local33.method3156(true, true, true);
			local33.method3151((local116 - local401) / 2, 128, (local131 - local127) / 2);
			local33.method3155((local401 + local116) / 2, 0, (local131 + local127) / 2);
		} else {
			local33 = local33.method3156(!local471.method3716(arg12), !local471.method3714(arg12), true);
			local33.method3151((local116 - local401) / 2, 128, (local131 - local127) / 2);
			local33.method3155((local116 + local401) / 2, 0, (local131 + local127) / 2);
			local33.method3165(local471, arg12);
		}
		if (arg4 != 0) {
			local33.method3144(arg4);
		}
		if (Static178.aBoolean216) {
			@Pc(671) Class12_Sub2_Sub2 local671 = (Class12_Sub2_Sub2) local33;
			if (arg6 != Static96.method1559(Static210.anInt4103, local127 + arg7, arg8 + local401) || arg6 != Static96.method1559(Static210.anInt4103, arg7 + local131, local116 + arg8)) {
				for (local156 = 0; local156 < local671.anInt3964; local156++) {
					local671.anIntArray340[local156] += Static96.method1559(Static210.anInt4103, arg7 + local671.anIntArray343[local156], arg8 + local671.anIntArray344[local156]) - arg6;
				}
				local671.aClass174_1.aBoolean339 = false;
				local671.aClass165_1.aBoolean323 = false;
			}
		} else {
			@Pc(598) Class12_Sub2_Sub1 local598 = (Class12_Sub2_Sub1) local33;
			if (arg6 != Static96.method1559(Static210.anInt4103, arg7 + local127, arg8 + local401) || arg6 != Static96.method1559(Static210.anInt4103, local131 + arg7, arg8 - -local116)) {
				for (local156 = 0; local156 < local598.anInt732; local156++) {
					local598.anIntArray81[local156] += Static96.method1559(Static210.anInt4103, local598.anIntArray77[local156] + arg7, local598.anIntArray84[local156] - -arg8) - arg6;
				}
				local598.aBoolean56 = false;
			}
		}
		return local33;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!lc;III)Lclient!bi;")
	public static Class4_Sub2_Sub1 method1923(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1) {
		return Static292.method4344(arg1, 0, arg0) ? Static22.method367() : null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Lclient!in;")
	public static Class73 method1925(@OriginalArg(1) int arg0) {
		@Pc(10) Class73 local10 = (Class73) Static49.aClass33_9.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static174.aClass98_98.method2396(Static15.method262(arg0), Static88.method1413(arg0));
		local10 = new Class73();
		if (local25 != null) {
			local10.method2007(new Class4_Sub17(local25));
		}
		Static49.aClass33_9.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public static void method1926() {
		aStringArray18 = null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)V")
	public static void method1927(@OriginalArg(0) int arg0) {
		@Pc(16) Class4_Sub32 local16 = (Class4_Sub32) Static105.aClass97_9.method2360((long) arg0);
		if (local16 != null) {
			local16.method4391();
		}
	}
}
