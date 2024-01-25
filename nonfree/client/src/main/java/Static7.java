import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
	public static final int[] anIntArray24 = new int[2048];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public static void method242() {
		if (Static243.aClass155_26 != null) {
			Static184.anInt6290 = 1;
		}
		if (Static251.aBoolean337 && Static129.aClass149_1.method3685(81) && Static379.anInt1192 > 2) {
			if (Static243.aClass155_26 == null) {
				Static294.method4660((Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243.aClass2_243);
			} else {
				Static298.aClass2_Sub7_1 = (Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243.aClass2_243;
			}
		} else if (Static243.aClass155_26 == null) {
			Static294.method4660((Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243);
		} else {
			Static298.aClass2_Sub7_1 = (Class2_Sub7) Static66.aClass210_43.aClass2_199.aClass2_243;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
	public static void method243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(39) int local39 = arg2 << 1;
		@Pc(48) int local48 = local21 + local13 * (1 - local39);
		@Pc(57) int local57 = local17 - (local39 - 1) * local25;
		@Pc(61) int local61 = local13 << 2;
		@Pc(65) int local65 = local17 << 2;
		@Pc(73) int local73 = local21 * 3;
		@Pc(81) int local81 = local25 * ((arg2 << 1) - 3);
		@Pc(87) int local87 = local65;
		@Pc(93) int local93 = local61 * (arg2 - 1);
		@Pc(107) int local107;
		@Pc(116) int local116;
		if (Static313.anInt5542 <= arg3 && Static345.anInt6084 >= arg3) {
			local107 = Static355.method5388(Static332.anInt5823, arg1 + arg4, Static202.anInt3722);
			local116 = Static355.method5388(Static332.anInt5823, arg4 - arg1, Static202.anInt3722);
			Static264.method4096(Static267.anIntArrayArray38[arg3], arg0, local107, local116);
		}
		while (local9 > 0) {
			if (local48 < 0) {
				while (local48 < 0) {
					local57 += local87;
					local48 += local73;
					local73 += local65;
					local87 += local65;
					local7++;
				}
			}
			if (local57 < 0) {
				local48 += local73;
				local57 += local87;
				local7++;
				local87 += local65;
				local73 += local65;
			}
			local48 += -local93;
			local57 += -local81;
			local9--;
			local93 -= local61;
			local81 -= local61;
			local107 = arg3 - local9;
			local116 = arg3 + local9;
			if (local116 >= Static313.anInt5542 && Static345.anInt6084 >= local107) {
				@Pc(220) int local220 = Static355.method5388(Static332.anInt5823, arg4 + local7, Static202.anInt3722);
				@Pc(228) int local228 = Static355.method5388(Static332.anInt5823, arg4 - local7, Static202.anInt3722);
				if (Static313.anInt5542 <= local107) {
					Static264.method4096(Static267.anIntArrayArray38[local107], arg0, local220, local228);
				}
				if (local116 <= Static345.anInt6084) {
					Static264.method4096(Static267.anIntArrayArray38[local116], arg0, local220, local228);
				}
			}
		}
	}
}
