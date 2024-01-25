import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mr", name = "S", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!mr", name = "U", descriptor = "I")
	public static int anInt6932;

	@OriginalMember(owner = "client!mr", name = "R", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_4 = new Class103(4, 1);

	@OriginalMember(owner = "client!mr", name = "V", descriptor = "I")
	public static int anInt6933 = 0;

	@OriginalMember(owner = "client!mr", name = "W", descriptor = "I")
	public static int anInt6934 = 0;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILclient!fd;)Lclient!dp;")
	public static Class67 method5776(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(14) int local14 = arg0.method6535();
		return new Class67(local14);
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIIIIIII)V")
	public static void method5777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg5;
		@Pc(20) int local20 = arg3 - arg5;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg3 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(96) int local96 = local36 - (local60 - 1) * local52;
		@Pc(100) int local100 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local32 << 2;
		@Pc(117) int local117 = local36 << 2;
		@Pc(121) int local121 = local40 * 3;
		@Pc(127) int local127 = (local56 - 3) * local44;
		@Pc(131) int local131 = local48 * 3;
		@Pc(137) int local137 = (local60 - 3) * local52;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = (arg3 - 1) * local100;
		@Pc(147) int local147 = local117;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(194) int local194;
		if (arg6 >= Static55.anInt1303 && Static208.anInt4309 >= arg6) {
			@Pc(161) int[] local161 = anIntArrayArray56[arg6];
			local170 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - arg1);
			local178 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg1 + arg2);
			local186 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - local15);
			local194 = Static44.method1168(Static35.anInt993, Static535.anInt9696, local15 + arg2);
			Static426.method6794(local186, local161, local170, arg0);
			Static426.method6794(local194, local161, local186, arg4);
			Static426.method6794(local178, local161, local194, arg0);
		}
		@Pc(218) int local218 = (local20 - 1) * local113;
		while (local9 > 0) {
			@Pc(231) boolean local231 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local69 += local121;
					local78 += local139;
					local139 += local109;
					local121 += local109;
					local7++;
				}
			}
			if (local231) {
				if (local87 < 0) {
					while (local87 < 0) {
						local96 += local147;
						local87 += local131;
						local131 += local117;
						local147 += local117;
						local11++;
					}
				}
				if (local96 < 0) {
					local87 += local131;
					local96 += local147;
					local131 += local117;
					local147 += local117;
					local11++;
				}
				local87 += -local218;
				local96 += -local137;
				local137 -= local113;
				local218 -= local113;
			}
			if (local78 < 0) {
				local78 += local139;
				local69 += local121;
				local139 += local109;
				local121 += local109;
				local7++;
			}
			local78 += -local127;
			local69 += -local145;
			local127 -= local100;
			local145 -= local100;
			local9--;
			local170 = arg6 - local9;
			local178 = arg6 + local9;
			if (Static55.anInt1303 <= local178 && Static208.anInt4309 >= local170) {
				local186 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 + local7);
				local194 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - local7);
				if (local231) {
					@Pc(440) int local440 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 + local11);
					@Pc(448) int local448 = Static44.method1168(Static35.anInt993, Static535.anInt9696, arg2 - local11);
					@Pc(459) int[] local459;
					if (Static55.anInt1303 <= local170) {
						local459 = anIntArrayArray56[local170];
						Static426.method6794(local448, local459, local194, arg0);
						Static426.method6794(local440, local459, local448, arg4);
						Static426.method6794(local186, local459, local440, arg0);
					}
					if (local178 <= Static208.anInt4309) {
						local459 = anIntArrayArray56[local178];
						Static426.method6794(local448, local459, local194, arg0);
						Static426.method6794(local440, local459, local448, arg4);
						Static426.method6794(local186, local459, local440, arg0);
					}
				} else {
					if (local170 >= Static55.anInt1303) {
						Static426.method6794(local186, anIntArrayArray56[local170], local194, arg0);
					}
					if (local178 <= Static208.anInt4309) {
						Static426.method6794(local186, anIntArrayArray56[local178], local194, arg0);
					}
				}
			}
		}
	}
}
