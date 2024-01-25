import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ht", name = "gb", descriptor = "I")
	public static int anInt2841;

	@OriginalMember(owner = "client!ht", name = "hb", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array26;

	@OriginalMember(owner = "client!ht", name = "O", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_95 = new Class157(77, 0);

	@OriginalMember(owner = "client!ht", name = "cb", descriptor = "Lclient!ik;")
	public static final Class102 aClass102_56 = new Class102("", 13);

	@OriginalMember(owner = "client!ht", name = "db", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!ht", name = "eb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray6 = new int[2][][];

	@OriginalMember(owner = "client!ht", name = "ib", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_97 = new Class221(28, 6);

	@OriginalMember(owner = "client!ht", name = "jb", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ht", name = "kb", descriptor = "Lclient!fh;")
	public static Class68 aClass68_20 = null;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIII)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(13) int local13 = arg0 - arg4;
		if (local13 == 0) {
			if (local9 != 0) {
				Static137.method2632(arg1, arg4, arg2, arg3);
			}
		} else if (local9 == 0) {
			Static212.method3987(arg0, arg3, arg4, arg1);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(66) boolean local66 = local9 > local13;
			@Pc(70) int local70;
			@Pc(74) int local74;
			if (local66) {
				local70 = arg4;
				arg4 = arg1;
				local74 = arg0;
				arg0 = arg2;
				arg1 = local70;
				arg2 = local74;
			}
			if (arg4 > arg0) {
				local70 = arg4;
				arg4 = arg0;
				local74 = arg1;
				arg0 = local70;
				arg1 = arg2;
				arg2 = local74;
			}
			local70 = arg1;
			local74 = arg0 - arg4;
			@Pc(106) int local106 = arg2 - arg1;
			@Pc(111) int local111 = -(local74 >> 1);
			@Pc(122) int local122 = arg1 < arg2 ? 1 : -1;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(132) int local132;
			if (local66) {
				for (local132 = arg4; local132 <= arg0; local132++) {
					Static364.anIntArrayArray57[local132][local70] = arg3;
					local111 += local106;
					if (local111 > 0) {
						local111 -= local74;
						local70 += local122;
					}
				}
			} else {
				for (local132 = arg4; local132 <= arg0; local132++) {
					Static364.anIntArrayArray57[local70][local132] = arg3;
					local111 += local106;
					if (local111 > 0) {
						local111 -= local74;
						local70 += local122;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIBIILjava/lang/String;II)V")
	public static void method2563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class57_Sub2 local7 = new Class57_Sub2();
		local7.anInt1270 = arg5;
		local7.anInt1267 = arg3;
		local7.anInt1271 = arg2;
		local7.anInt1274 = arg0;
		local7.anInt1269 = arg6 + Static6.anInt91;
		local7.anInt1266 = arg1;
		local7.aString11 = arg4;
		Static8.aClass193_1.method5222(local7);
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)I")
	public static int method2566(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIIIB)V")
	public static void method2571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static202.anInt4957 / (float) Static202.anInt4956;
		@Pc(16) int local16 = arg0;
		@Pc(18) int local18 = arg3;
		if (local9 < 1.0F) {
			local18 = (int) (local9 * (float) arg0);
		} else {
			local16 = (int) ((float) arg3 / local9);
		}
		@Pc(44) int local44 = arg1 - (arg0 - local16) / 2;
		@Pc(53) int local53 = arg2 - (arg3 - local18) / 2;
		Static105.anInt2196 = Static202.anInt4957 - Static202.anInt4957 * local53 / local18;
		Static49.anInt819 = -1;
		Static160.anInt3750 = -1;
		Static298.anInt5924 = Static202.anInt4956 * local44 / local16;
		Static220.method4160();
	}
}
