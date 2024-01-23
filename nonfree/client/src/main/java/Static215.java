import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public static int anInt4426;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	public static int anInt4428 = 0;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
	public static int anInt4429 = 0;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public static int anInt4430 = 0;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method3367() {
		while (true) {
			@Pc(16) Class8_Sub16 local16 = (Class8_Sub16) Static229.aClass182_25.method4326();
			if (local16 == null) {
				return;
			}
			@Pc(37) Class36_Sub3 local37;
			@Pc(30) int local30;
			if (local16.anInt2732 < 0) {
				local30 = -local16.anInt2732 - 1;
				if (local30 == Static34.anInt765) {
					local37 = Static21.aClass36_Sub3_Sub1_1;
				} else {
					local37 = Static230.aClass36_Sub3_Sub1Array1[local30];
				}
			} else {
				local30 = local16.anInt2732 - 1;
				local37 = Static48.aClass36_Sub3_Sub2Array1[local30];
			}
			if (local37 != null) {
				@Pc(60) Class70 local60 = Static235.method3578(local16.anInt2726);
				@Pc(73) int local73;
				@Pc(76) int local76;
				if (local16.anInt2736 == 1 || local16.anInt2736 == 3) {
					local73 = local60.anInt2063;
					local76 = local60.anInt2065;
				} else {
					local73 = local60.anInt2065;
					local76 = local60.anInt2063;
				}
				if (Static34.anInt770 < 3) {
				}
				@Pc(96) int local96 = (local73 >> 1) + local16.anInt2735;
				@Pc(105) int local105 = local16.anInt2735 + (local73 + 1 >> 1);
				@Pc(112) int local112 = local16.anInt2722 + (local76 >> 1);
				@Pc(122) int local122 = local16.anInt2722 + (local76 + 1 >> 1);
				@Pc(126) int[][] local126 = Static195.anIntArrayArrayArray7[Static34.anInt770];
				@Pc(152) int local152 = local126[local105][local122] + local126[local96][local122] + local126[local105][local112] + local126[local96][local112] >> 2;
				@Pc(154) Class36 local154 = null;
				@Pc(159) int local159 = Static156.anIntArray250[local16.anInt2723];
				if (local159 == 0) {
					@Pc(168) Class134 local168 = Static169.method2663(Static34.anInt770, local16.anInt2735, local16.anInt2722);
					if (local168 != null) {
						local154 = local168.aClass36_6;
					}
				} else if (local159 == 1) {
					@Pc(223) Class141 local223 = Static11.method2357(Static34.anInt770, local16.anInt2735, local16.anInt2722);
					if (local223 != null) {
						local154 = local223.aClass36_8;
					}
				} else if (local159 == 2) {
					@Pc(209) Class170 local209 = Static234.method3559(Static34.anInt770, local16.anInt2735, local16.anInt2722);
					if (local209 != null) {
						local154 = local209.aClass36_10;
					}
				} else if (local159 == 3) {
					@Pc(195) Class120 local195 = Static176.method2710(Static34.anInt770, local16.anInt2735, local16.anInt2722);
					if (local195 != null) {
						local154 = local195.aClass36_5;
					}
				}
				if (local154 != null) {
					Static68.method1240(Static34.anInt770, local16.anInt2735, local159, local16.anInt2733 + 1, -1, 0, 0, local16.anInt2734 + 1, local16.anInt2722);
					local37.anObject4 = local154;
					local37.anInt4071 = local16.anInt2733 + Static183.anInt3590;
					local37.anInt4111 = local76 * 64 + local16.anInt2722 * 128;
					local37.anInt4108 = local16.anInt2734 + Static183.anInt3590;
					local37.anInt4091 = local73 * 64 + local16.anInt2735 * 128;
					@Pc(290) int local290 = local16.anInt2731;
					@Pc(293) int local293 = local16.anInt2737;
					@Pc(296) int local296 = local16.anInt2728;
					@Pc(302) int local302;
					if (local290 > local293) {
						local302 = local290;
						local290 = local293;
						local293 = local302;
					}
					local37.anInt4109 = local16.anInt2735 + local290;
					@Pc(315) int local315 = local16.anInt2730;
					local37.anInt4140 = local16.anInt2735 + local293;
					local37.anInt4150 = local152;
					if (local296 > local315) {
						local302 = local296;
						local296 = local315;
						local315 = local302;
					}
					local37.anInt4075 = local16.anInt2722 + local296;
					local37.anInt4080 = local315 + local16.anInt2722;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!tk;)Lclient!tk;")
	public static Class159 method3368(@OriginalArg(1) Class159 arg0) {
		if (arg0.anInt5116 != -1) {
			return Static82.method1361(arg0.anInt5116);
		}
		@Pc(21) int local21 = arg0.anInt5199 >>> 16;
		@Pc(31) Class106 local31 = new Class106(Static213.aClass129_22);
		for (@Pc(38) Class8_Sub32 local38 = (Class8_Sub32) local31.method2446(); local38 != null; local38 = (Class8_Sub32) local31.method2445()) {
			if (local38.anInt5295 == local21) {
				return Static82.method1361((int) local38.aLong203);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)I")
	public static int method3370(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIB)I")
	public static int method3371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class8_Sub23 local10 = (Class8_Sub23) Static188.aClass129_20.method3043((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray270.length > arg0) {
			return local10.anIntArray270[arg0];
		} else {
			return -1;
		}
	}
}
