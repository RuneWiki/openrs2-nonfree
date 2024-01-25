import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_8 = new Class117("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt281 = 0;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static int anInt285 = 0;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "Lclient!ec;")
	public static final Class58 aClass58_2 = new Class58(32);

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
	public static boolean aBoolean12 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg4 - arg0;
		@Pc(20) int local20 = arg2 - arg0;
		@Pc(24) int local24 = arg4 * arg4;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(70) int local70 = local24 * (1 - local56) + local40;
		@Pc(79) int local79 = local28 - local44 * (local56 - 1);
		@Pc(88) int local88 = local32 * (1 - local60) + local48;
		@Pc(97) int local97 = local36 - local52 * (local60 - 1);
		@Pc(101) int local101 = local24 << 2;
		@Pc(105) int local105 = local28 << 2;
		@Pc(109) int local109 = local32 << 2;
		@Pc(113) int local113 = local36 << 2;
		@Pc(117) int local117 = local40 * 3;
		@Pc(123) int local123 = local44 * (local56 - 3);
		@Pc(127) int local127 = local48 * 3;
		@Pc(133) int local133 = (local60 - 3) * local52;
		@Pc(135) int local135 = local105;
		@Pc(141) int local141 = (arg2 - 1) * local101;
		@Pc(143) int local143 = local113;
		@Pc(149) int local149 = (local20 - 1) * local109;
		@Pc(153) int[] local153 = Static73.anIntArrayArray6[arg5];
		Static224.method5303(local153, arg1 - local16, arg3, arg1 - arg4);
		Static224.method5303(local153, arg1 + local16, arg6, arg1 - local16);
		Static224.method5303(local153, arg1 + arg4, arg3, local16 + arg1);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local9 <= local20;
			if (local200) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local143;
						local11++;
						local127 += local113;
						local143 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local143;
					local88 += local127;
					local143 += local113;
					local11++;
					local127 += local113;
				}
				local88 += -local149;
				local97 += -local133;
				local133 -= local109;
				local149 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local79 += local135;
					local70 += local117;
					local135 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local135;
				local135 += local105;
				local117 += local105;
				local7++;
			}
			local70 += -local141;
			local79 += -local123;
			local141 -= local101;
			local123 -= local101;
			local9--;
			@Pc(334) int local334 = arg5 - local9;
			@Pc(339) int local339 = arg5 + local9;
			@Pc(343) int local343 = local7 + arg1;
			@Pc(348) int local348 = arg1 - local7;
			if (local200) {
				@Pc(374) int local374 = local11 + arg1;
				@Pc(379) int local379 = arg1 - local11;
				Static224.method5303(Static73.anIntArrayArray6[local334], local379, arg3, local348);
				Static224.method5303(Static73.anIntArrayArray6[local334], local374, arg6, local379);
				Static224.method5303(Static73.anIntArrayArray6[local334], local343, arg3, local374);
				Static224.method5303(Static73.anIntArrayArray6[local339], local379, arg3, local348);
				Static224.method5303(Static73.anIntArrayArray6[local339], local374, arg6, local379);
				Static224.method5303(Static73.anIntArrayArray6[local339], local343, arg3, local374);
			} else {
				Static224.method5303(Static73.anIntArrayArray6[local334], local343, arg3, local348);
				Static224.method5303(Static73.anIntArrayArray6[local339], local343, arg3, local348);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;BZ)I")
	public static int method226(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = arg1.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(46) char local46 = arg1.charAt(local35);
			if (local35 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(93) int local93;
			if (local46 >= '0' && local46 <= '9') {
				local93 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local93 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local93 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local93 >= arg0) {
				throw new NumberFormatException();
			}
			if (local26) {
				local93 = -local93;
			}
			@Pc(121) int local121 = local93 + local30 * arg0;
			if (local30 != local121 / arg0) {
				throw new NumberFormatException();
			}
			local30 = local121;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local30;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lclient!gs;")
	public static Class89 method227(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static91.aClass26_16;
		@Pc(14) Class89 local14;
		synchronized (Static91.aClass26_16) {
			local14 = (Class89) Static91.aClass26_16.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static136.aClass144_109.method3896(arg0, 16);
		local14 = new Class89();
		if (local30 != null) {
			local14.method1664(new Class11_Sub25(local30));
		}
		@Pc(50) Class26 local50 = Static91.aClass26_16;
		synchronized (Static91.aClass26_16) {
			Static91.aClass26_16.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method228(@OriginalArg(0) String arg0) {
		Static260.method4521(0, "", 0, "", arg0);
	}
}
