import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dha", name = "t", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!dha", name = "q", descriptor = "Lclient!la;")
	public static Class208 aClass208_19;

	@OriginalMember(owner = "client!dha", name = "r", descriptor = "I")
	public static int anInt1729;

	@OriginalMember(owner = "client!dha", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_25 = new Class387(63, 3);

	@OriginalMember(owner = "client!dha", name = "p", descriptor = "I")
	public static int anInt1728 = 0;

	@OriginalMember(owner = "client!dha", name = "n", descriptor = "Lclient!eh;")
	public static final Class103 aClass103_2 = new Class103(0);

	@OriginalMember(owner = "client!dha", name = "s", descriptor = "[I")
	public static final int[] anIntArray93 = new int[50];

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)V")
	public static void method1540(@OriginalArg(0) int arg0) {
		if (Static637.aClass5_Sub20_31.aClass24_Sub15_1.method5534() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static581.anInt9736) {
			return;
		}
		if (arg0 != -1) {
			@Pc(31) Class6 local31 = Static575.aClass350_2.method8665(arg0);
			@Pc(35) Class173 local35 = local31.method91();
			if (local35 == null) {
				arg0 = -1;
			} else {
				Static294.aClass230_3.method5359(local35.method3650(), local35.method3658(), local35.method3654(), Static24.aCanvas1, new Point(local31.anInt75, local31.anInt82));
				Static581.anInt9736 = arg0;
			}
		}
		if (arg0 == -1 && Static581.anInt9736 != -1) {
			Static294.aClass230_3.method5359(-1, (int[]) null, -1, Static24.aCanvas1, new Point());
			Static581.anInt9736 = -1;
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIBIII)V")
	public static void method1542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg4;
		@Pc(21) int local21 = arg3 - arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + local25 * (1 - local57);
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local33 * (1 - local61) + local49;
		@Pc(97) int local97 = local37 - (local61 - 1) * local53;
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(124) int local124 = local41 * 3;
		@Pc(130) int local130 = local45 * (local57 - 3);
		@Pc(134) int local134 = local49 * 3;
		@Pc(140) int local140 = (local61 - 3) * local53;
		@Pc(142) int local142 = local105;
		@Pc(148) int local148 = local101 * (arg3 - 1);
		@Pc(150) int local150 = local113;
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(199) int local199;
		if (Static456.anInt7815 <= arg5 && arg5 <= Static604.anInt10083) {
			@Pc(162) int[] local162 = Static569.anIntArrayArray54[arg5];
			local170 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - arg2);
			local180 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg2 + arg0);
			local189 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local16);
			local199 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local16 + arg0);
			Static646.method7025(local162, local170, local189, arg6);
			Static646.method7025(local162, local189, local199, arg1);
			Static646.method7025(local162, local199, local180, arg6);
		}
		@Pc(223) int local223 = local109 * (local21 - 1);
		while (local9 > 0) {
			@Pc(238) boolean local238 = local21 >= local9;
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local124;
					local79 += local142;
					local7++;
					local142 += local105;
					local124 += local105;
				}
			}
			if (local238) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local134;
						local97 += local150;
						local150 += local113;
						local134 += local113;
						local11++;
					}
				}
				if (local97 < 0) {
					local97 += local150;
					local88 += local134;
					local134 += local113;
					local11++;
					local150 += local113;
				}
				local97 += -local140;
				local88 += -local223;
				local223 -= local109;
				local140 -= local109;
			}
			if (local79 < 0) {
				local79 += local142;
				local70 += local124;
				local7++;
				local142 += local105;
				local124 += local105;
			}
			local79 += -local130;
			local70 += -local148;
			local148 -= local101;
			local9--;
			local130 -= local101;
			local170 = arg5 - local9;
			local180 = arg5 + local9;
			if (Static456.anInt7815 <= local180 && local170 <= Static604.anInt10083) {
				local189 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, local7 + arg0);
				local199 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local7);
				if (local238) {
					@Pc(429) int local429 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 + local11);
					@Pc(438) int local438 = Static83.method1286(Static642.anInt10429, Static456.anInt7806, arg0 - local11);
					@Pc(445) int[] local445;
					if (local170 >= Static456.anInt7815) {
						local445 = Static569.anIntArrayArray54[local170];
						Static646.method7025(local445, local199, local438, arg6);
						Static646.method7025(local445, local438, local429, arg1);
						Static646.method7025(local445, local429, local189, arg6);
					}
					if (Static604.anInt10083 >= local180) {
						local445 = Static569.anIntArrayArray54[local180];
						Static646.method7025(local445, local199, local438, arg6);
						Static646.method7025(local445, local438, local429, arg1);
						Static646.method7025(local445, local429, local189, arg6);
					}
				} else {
					if (local170 >= Static456.anInt7815) {
						Static646.method7025(Static569.anIntArrayArray54[local170], local199, local189, arg6);
					}
					if (local180 <= Static604.anInt10083) {
						Static646.method7025(Static569.anIntArrayArray54[local180], local199, local189, arg6);
					}
				}
			}
		}
	}
}
