import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
	public static int anInt7041;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray42 = new boolean[100];

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!be;")
	public static final Class22 aClass22_5 = new Class22();

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIII)V")
	public static void method5887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(39) int local39 = (1 - local29) * local13 + local21;
		@Pc(48) int local48 = local17 - (local29 - 1) * local25;
		@Pc(52) int local52 = local13 << 2;
		@Pc(56) int local56 = local17 << 2;
		@Pc(64) int local64 = local21 * 3;
		@Pc(72) int local72 = local25 * ((arg0 << 1) - 3);
		@Pc(78) int local78 = local56;
		@Pc(84) int local84 = local52 * (arg0 - 1);
		@Pc(110) int local110;
		if (arg2 >= Static99.anInt1988 && Static205.anInt4042 >= arg2) {
			@Pc(102) int local102 = Static400.method6041(arg4 + arg1, Static216.anInt4203, Static358.anInt8908);
			local110 = Static400.method6041(arg4 - arg1, Static216.anInt4203, Static358.anInt8908);
			Static424.method6216(local102, arg3, local110, Static447.anIntArrayArray99[arg2]);
		}
		while (local9 > 0) {
			if (local39 < 0) {
				while (local39 < 0) {
					local48 += local78;
					local39 += local64;
					local78 += local56;
					local64 += local56;
					local7++;
				}
			}
			if (local48 < 0) {
				local48 += local78;
				local39 += local64;
				local78 += local56;
				local64 += local56;
				local7++;
			}
			local48 += -local72;
			local39 += -local84;
			local72 -= local52;
			local9--;
			local84 -= local52;
			local110 = arg2 - local9;
			@Pc(201) int local201 = local9 + arg2;
			if (local201 >= Static99.anInt1988 && Static205.anInt4042 >= local110) {
				@Pc(224) int local224 = Static400.method6041(arg4 + local7, Static216.anInt4203, Static358.anInt8908);
				@Pc(233) int local233 = Static400.method6041(arg4 - local7, Static216.anInt4203, Static358.anInt8908);
				if (local110 >= Static99.anInt1988) {
					Static424.method6216(local224, arg3, local233, Static447.anIntArrayArray99[local110]);
				}
				if (local201 <= Static205.anInt4042) {
					Static424.method6216(local224, arg3, local233, Static447.anIntArrayArray99[local201]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
	public static void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - (local29 - 1) * local25;
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg2 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(86) int local86 = (arg2 - 1) * local50;
		Static424.method6216(arg1 + arg3, arg0, arg3 - arg1, Static447.anIntArrayArray99[arg4]);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local46 += local76;
					local38 += local62;
					local76 += local54;
					local62 += local54;
					local7++;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local38 += local62;
				local7++;
				local62 += local54;
				local76 += local54;
			}
			local46 += -local70;
			local38 += -local86;
			local9--;
			local70 -= local50;
			local86 -= local50;
			@Pc(170) int local170 = arg4 - local9;
			@Pc(174) int local174 = local9 + arg4;
			@Pc(178) int local178 = local7 + arg3;
			@Pc(183) int local183 = arg3 - local7;
			Static424.method6216(local178, arg0, local183, Static447.anIntArrayArray99[local170]);
			Static424.method6216(local178, arg0, local183, Static447.anIntArrayArray99[local174]);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
	public static boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}
}
