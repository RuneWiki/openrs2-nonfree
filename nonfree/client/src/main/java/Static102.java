import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!dha", name = "m", descriptor = "I")
	public static int anInt2165 = 0;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V")
	public static void method1817() {
		Static432.method6333();
		@Pc(16) int local16 = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933();
		if (local16 == 2) {
			Static390.method5822(Static677.aClass137_47, Static639.anInt10685, Static561.anInt9759);
		} else if (local16 == 3) {
			Static36.method836(Static140.anInt2665, Static677.aClass137_47, Static620.anInt10426, Static561.anInt9759, Static639.anInt10685);
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1932()) {
			Static127.method2103(Static68.aCanvas2);
		}
		if (Static677.aClass137_47 != null) {
			Static541.method8228();
		}
		Static401.aBoolean511 = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1933() != 0;
		Static128.aBoolean202 = Static56.aClass14_Sub22_5.aClass21_Sub6_1.method1932();
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "()V")
	public static void method1818() {
		Static326.aClass23_1 = Static326.aClass23_2;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V")
	public static void method1820() {
		if (Static659.anIntArray816 != null) {
			return;
		}
		Static659.anIntArray816 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(38) double local38 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(76) double local76;
				if (local56 < 0.5D) {
					local76 = local56 * (local49 + 1.0D);
				} else {
					local76 = local49 + local56 - local49 * local56;
				}
				@Pc(93) double local93 = local56 * 2.0D - local76;
				@Pc(97) double local97 = local38 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local38 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local58 = (local76 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = local93 + (local76 - local93) * (-local97 + 0.6666666666666666D) * 6.0D;
				} else {
					local58 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = local93 + local38 * 6.0D * (local76 - local93);
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (0.6666666666666666D - local38) * (-local93 + local76) * 6.0D + local93;
				} else {
					local60 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = local111 * (local76 - local93) * 6.0D + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = local93 + (0.6666666666666666D - local111) * 6.0D * (local76 - local93);
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local23);
			local60 = Math.pow(local60, local23);
			local62 = Math.pow(local62, local23);
			@Pc(292) int local292 = (int) (local58 * 256.0D);
			@Pc(297) int local297 = (int) (local60 * 256.0D);
			@Pc(302) int local302 = (int) (local62 * 256.0D);
			@Pc(312) int local312 = local302 + (local292 << 16) + (local297 << 8);
			Static659.anIntArray816[local25] = local312;
		}
	}

	@OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)V")
	public static void method1821() {
		Static283.aClass14_Sub3_Sub11_2 = new Class14_Sub3_Sub11(Static514.aClass303_6.method7473(Static232.anInt4258), "", Static416.anInt7542, 1012, -1, 0L, 0, 0, true, false, 0L, true);
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BLclient!js;)V")
	public static void method1824(@OriginalArg(1) Class14_Sub29_Sub1 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static537.anInt9246; local7++) {
			@Pc(13) int local13 = Static403.anIntArray537[local7];
			@Pc(17) Class12_Sub2_Sub2_Sub1_Sub2 local17 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = arg0.method5866();
			if ((local21 & 0x20) != 0) {
				local21 += arg0.method5866() << 8;
			}
			if ((local21 & 0x2000) != 0) {
				local21 += arg0.method5866() << 16;
			}
			Static401.method5988(local13, arg0, local21, local17);
		}
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(BIIII)V")
	public static void method1825(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static215.anInt4074 = arg3;
		Static675.anInt11180 = arg2;
		Static528.anInt9165 = arg1;
		Static380.anInt6947 = arg0;
	}
}
