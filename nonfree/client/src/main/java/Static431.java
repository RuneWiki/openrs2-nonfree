import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public static int anInt7507;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_19 = new Class264(4);

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_15 = new Class264(1);

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_12 = new Class264(1);

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_13 = new Class264(2);

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_14 = new Class264(4);

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_16 = new Class264(2);

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_17 = new Class264(4);

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!sb;")
	public static final Class264 aClass264_18 = new Class264(2);

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!ei;")
	public static final Class79 aClass79_12 = new Class79();

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
	public static boolean aBoolean542 = false;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!wg;")
	public static final Class313 aClass313_56 = new Class313(8);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
	public static void method6279(@OriginalArg(0) int arg0) {
		Static103.anInt2070 = arg0;
		Static351.anInt6257 = -1;
		Static340.anInt6093 = -1;
		Static64.method1152();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method6280(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method6281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg0 - arg3;
		@Pc(20) int local20 = arg5 - arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + (1 - local56) * local24;
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local48 + local32 * (1 - local60);
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = local44 * (local56 - 3);
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(133) int local133 = local103;
		@Pc(139) int local139 = local99 * (arg5 - 1);
		@Pc(141) int local141 = local111;
		@Pc(147) int local147 = local107 * (local20 - 1);
		@Pc(151) int[] local151 = Static447.anIntArrayArray99[arg2];
		Static424.method6216(arg1 - local15, arg6, arg1 - arg0, local151);
		Static424.method6216(arg1 + local15, arg4, arg1 - local15, local151);
		Static424.method6216(arg0 + arg1, arg6, local15 + arg1, local151);
		while (local9 > 0) {
			@Pc(202) boolean local202 = local20 >= local9;
			if (local202) {
				if (local86 < 0) {
					while (local86 < 0) {
						local95 += local141;
						local86 += local125;
						local125 += local111;
						local11++;
						local141 += local111;
					}
				}
				if (local95 < 0) {
					local95 += local141;
					local86 += local125;
					local11++;
					local125 += local111;
					local141 += local111;
				}
				local95 += -local131;
				local86 += -local147;
				local147 -= local107;
				local131 -= local107;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local133;
					local68 += local115;
					local115 += local103;
					local7++;
					local133 += local103;
				}
			}
			if (local77 < 0) {
				local68 += local115;
				local77 += local133;
				local133 += local103;
				local7++;
				local115 += local103;
			}
			local77 += -local121;
			local68 += -local139;
			local9--;
			local121 -= local99;
			local139 -= local99;
			@Pc(341) int local341 = arg2 - local9;
			@Pc(345) int local345 = local9 + arg2;
			@Pc(349) int local349 = local7 + arg1;
			@Pc(354) int local354 = arg1 - local7;
			if (local202) {
				@Pc(378) int local378 = arg1 + local11;
				@Pc(383) int local383 = arg1 - local11;
				Static424.method6216(local383, arg6, local354, Static447.anIntArrayArray99[local341]);
				Static424.method6216(local378, arg4, local383, Static447.anIntArrayArray99[local341]);
				Static424.method6216(local349, arg6, local378, Static447.anIntArrayArray99[local341]);
				Static424.method6216(local383, arg6, local354, Static447.anIntArrayArray99[local345]);
				Static424.method6216(local378, arg4, local383, Static447.anIntArrayArray99[local345]);
				Static424.method6216(local349, arg6, local378, Static447.anIntArrayArray99[local345]);
			} else {
				Static424.method6216(local349, arg6, local354, Static447.anIntArrayArray99[local341]);
				Static424.method6216(local349, arg6, local354, Static447.anIntArrayArray99[local345]);
			}
		}
	}
}
