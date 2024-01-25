import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!nd;")
	public static Class225 aClass225_1;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array5;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!em;")
	public static final Class82 aClass82_3 = new Class82(1);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIBIII)V")
	public static void method2562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg5;
		@Pc(20) int local20 = arg2 - arg5;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg2 << 1;
		@Pc(68) int local68 = local20 << 1;
		@Pc(77) int local77 = local40 + local24 * (1 - local56);
		@Pc(85) int local85 = local28 - local44 * (local56 - 1);
		@Pc(95) int local95 = (1 - local68) * local32 + local48;
		@Pc(104) int local104 = local36 - (local68 - 1) * local52;
		@Pc(108) int local108 = local24 << 2;
		@Pc(112) int local112 = local28 << 2;
		@Pc(116) int local116 = local32 << 2;
		@Pc(120) int local120 = local36 << 2;
		@Pc(124) int local124 = local40 * 3;
		@Pc(130) int local130 = local44 * (local56 - 3);
		@Pc(134) int local134 = local48 * 3;
		@Pc(140) int local140 = local52 * (local68 - 3);
		@Pc(142) int local142 = local112;
		@Pc(148) int local148 = local108 * (arg2 - 1);
		@Pc(150) int local150 = local120;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(194) int local194;
		@Pc(202) int local202;
		if (Static246.anInt5506 <= arg4 && Static583.anInt9761 >= arg4) {
			@Pc(168) int[] local168 = anIntArrayArray24[arg4];
			local177 = Static429.method6586(arg0 - arg3, Static202.anInt4720, Static472.anInt6105);
			local185 = Static429.method6586(arg3 + arg0, Static202.anInt4720, Static472.anInt6105);
			local194 = Static429.method6586(arg0 - local16, Static202.anInt4720, Static472.anInt6105);
			local202 = Static429.method6586(local16 + arg0, Static202.anInt4720, Static472.anInt6105);
			Static580.method8027(local168, local194, local177, arg6);
			Static580.method8027(local168, local202, local194, arg1);
			Static580.method8027(local168, local185, local202, arg6);
		}
		@Pc(226) int local226 = (local20 - 1) * local116;
		while (local9 > 0) {
			@Pc(235) boolean local235 = local9 <= local20;
			if (local77 < 0) {
				while (local77 < 0) {
					local85 += local142;
					local77 += local124;
					local7++;
					local142 += local112;
					local124 += local112;
				}
			}
			if (local235) {
				if (local95 < 0) {
					while (local95 < 0) {
						local104 += local150;
						local95 += local134;
						local150 += local120;
						local11++;
						local134 += local120;
					}
				}
				if (local104 < 0) {
					local95 += local134;
					local104 += local150;
					local11++;
					local134 += local120;
					local150 += local120;
				}
				local95 += -local226;
				local104 += -local140;
				local226 -= local116;
				local140 -= local116;
			}
			if (local85 < 0) {
				local77 += local124;
				local85 += local142;
				local124 += local112;
				local7++;
				local142 += local112;
			}
			local85 += -local130;
			local77 += -local148;
			local148 -= local108;
			local130 -= local108;
			local9--;
			local177 = arg4 - local9;
			local185 = local9 + arg4;
			if (Static246.anInt5506 <= local185 && Static583.anInt9761 >= local177) {
				local194 = Static429.method6586(arg0 + local7, Static202.anInt4720, Static472.anInt6105);
				local202 = Static429.method6586(arg0 - local7, Static202.anInt4720, Static472.anInt6105);
				if (local235) {
					@Pc(407) int local407 = Static429.method6586(arg0 + local11, Static202.anInt4720, Static472.anInt6105);
					@Pc(416) int local416 = Static429.method6586(arg0 - local11, Static202.anInt4720, Static472.anInt6105);
					@Pc(423) int[] local423;
					if (local177 >= Static246.anInt5506) {
						local423 = anIntArrayArray24[local177];
						Static580.method8027(local423, local416, local202, arg6);
						Static580.method8027(local423, local407, local416, arg1);
						Static580.method8027(local423, local194, local407, arg6);
					}
					if (local185 <= Static583.anInt9761) {
						local423 = anIntArrayArray24[local185];
						Static580.method8027(local423, local416, local202, arg6);
						Static580.method8027(local423, local407, local416, arg1);
						Static580.method8027(local423, local194, local407, arg6);
					}
				} else {
					if (local177 >= Static246.anInt5506) {
						Static580.method8027(anIntArrayArray24[local177], local194, local202, arg6);
					}
					if (Static583.anInt9761 >= local185) {
						Static580.method8027(anIntArrayArray24[local185], local194, local202, arg6);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BII)V")
	public static void method2563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub26 local17 = Static640.method8636(Static214.aClass344_84, Static403.aClass294_3);
		local17.aClass3_Sub15_Sub1_3.method8408(arg1);
		local17.aClass3_Sub15_Sub1_3.method8454(arg0);
		Static472.method5189(local17);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!sv;")
	public static Class59 method2564(@OriginalArg(2) Component arg0) {
		try {
			@Pc(24) Constructor local24 = Class.forName("Class59_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class59) local24.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(42) Throwable local42) {
			return new Class59_Sub2(arg0, true);
		}
	}
}
