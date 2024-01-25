import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
	public static int anInt5065;

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "Lclient!vd;")
	public static Class286 aClass286_1;

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
	public static int anInt5077;

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "[I")
	public static final int[] anIntArray391 = new int[2048];

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!o;IIIII)V")
	public static void method4127(@OriginalArg(0) Class1_Sub38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt6097 == -1 && arg0.anIntArray497 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg3 > arg0.anInt6101) {
			local15 = arg3 - arg0.anInt6101;
		} else if (arg3 < arg0.anInt6099) {
			local15 = arg0.anInt6099 - arg3;
		}
		@Pc(52) int local52 = arg0.anInt6103 * Static348.aClass1_Sub30_Sub1_1.anInt4858 >> 8;
		if (arg2 > arg0.anInt6110) {
			local15 += arg2 - arg0.anInt6110;
		} else if (arg0.anInt6104 > arg2) {
			local15 += arg0.anInt6104 - arg2;
		}
		if (arg0.anInt6100 == 0 || local15 - 256 > arg0.anInt6100 || Static348.aClass1_Sub30_Sub1_1.anInt4858 == 0 || arg0.anInt6108 != arg1) {
			if (arg0.aClass1_Sub7_Sub4_4 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(arg0.aClass1_Sub7_Sub4_4);
				arg0.aClass1_Sub50_3 = null;
				arg0.aClass1_Sub7_Sub4_4 = null;
				arg0.aClass1_Sub17_Sub1_3 = null;
			}
			if (arg0.aClass1_Sub7_Sub4_3 != null) {
				Static309.aClass1_Sub7_Sub1_2.method477(arg0.aClass1_Sub7_Sub4_3);
				arg0.aClass1_Sub17_Sub1_4 = null;
				arg0.aClass1_Sub7_Sub4_3 = null;
				arg0.aClass1_Sub50_2 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(159) int local159 = (arg0.anInt6100 - local15) * local52 / arg0.anInt6100;
		@Pc(206) Class1_Sub7_Sub4 local206;
		if (arg0.aClass1_Sub7_Sub4_4 != null) {
			arg0.aClass1_Sub7_Sub4_4.method6139(local159);
		} else if (arg0.anInt6097 >= 0) {
			if (arg0.aBoolean482) {
				if (arg0.aClass1_Sub50_3 == null) {
					arg0.aClass1_Sub50_3 = Static582.method7788(Static360.aClass270_68, arg0.anInt6097);
				}
				if (arg0.aClass1_Sub50_3 != null) {
					if (arg0.aClass1_Sub17_Sub1_3 == null) {
						arg0.aClass1_Sub17_Sub1_3 = arg0.aClass1_Sub50_3.method7787(new int[] { 22050 });
					}
					if (arg0.aClass1_Sub17_Sub1_3 != null) {
						local206 = Static606.method6168(arg0.aClass1_Sub17_Sub1_3, local159);
						local206.method6178(-1);
						Static309.aClass1_Sub7_Sub1_2.method470(local206);
						arg0.aClass1_Sub7_Sub4_4 = local206;
					}
				}
			} else {
				@Pc(223) Class90 local223 = Static600.method1812(Static71.aClass270_14, arg0.anInt6097, 0);
				if (local223 != null) {
					@Pc(230) Class1_Sub17_Sub1 local230 = local223.method1814().method4526(Static205.aClass80_5);
					@Pc(235) Class1_Sub7_Sub4 local235 = Static606.method6168(local230, local159);
					local235.method6178(-1);
					Static309.aClass1_Sub7_Sub1_2.method470(local235);
					arg0.aClass1_Sub7_Sub4_4 = local235;
				}
			}
		}
		if (arg0.aClass1_Sub7_Sub4_3 != null) {
			arg0.aClass1_Sub7_Sub4_3.method6139(local159);
			if (arg0.aClass1_Sub7_Sub4_3.method7856()) {
				return;
			}
			arg0.aClass1_Sub17_Sub1_4 = null;
			arg0.aClass1_Sub50_2 = null;
			arg0.aClass1_Sub7_Sub4_3 = null;
		} else if (arg0.anIntArray497 != null && (arg0.anInt6102 -= arg4) <= 0) {
			@Pc(281) int local281;
			if (arg0.aBoolean484) {
				if (arg0.aClass1_Sub50_2 == null) {
					local281 = (int) ((double) arg0.anIntArray497.length * Math.random());
					arg0.aClass1_Sub50_2 = Static582.method7788(Static360.aClass270_68, arg0.anIntArray497[local281]);
				}
				if (arg0.aClass1_Sub50_2 != null) {
					if (arg0.aClass1_Sub17_Sub1_4 == null) {
						arg0.aClass1_Sub17_Sub1_4 = arg0.aClass1_Sub50_2.method7787(new int[] { 22050 });
					}
					if (arg0.aClass1_Sub17_Sub1_4 != null) {
						local206 = Static606.method6168(arg0.aClass1_Sub17_Sub1_4, local159);
						local206.method6178(0);
						Static309.aClass1_Sub7_Sub1_2.method470(local206);
						arg0.anInt6102 = (int) (Math.random() * (double) (arg0.anInt6095 - arg0.anInt6105)) + arg0.anInt6105;
						arg0.aClass1_Sub7_Sub4_3 = local206;
						return;
					}
				}
				return;
			}
			local281 = (int) (Math.random() * (double) arg0.anIntArray497.length);
			@Pc(356) Class90 local356 = Static600.method1812(Static71.aClass270_14, arg0.anIntArray497[local281], 0);
			if (local356 != null) {
				@Pc(363) Class1_Sub17_Sub1 local363 = local356.method1814().method4526(Static205.aClass80_5);
				@Pc(368) Class1_Sub7_Sub4 local368 = Static606.method6168(local363, local159);
				local368.method6178(0);
				Static309.aClass1_Sub7_Sub1_2.method470(local368);
				arg0.aClass1_Sub7_Sub4_3 = local368;
				arg0.anInt6102 = arg0.anInt6105 + (int) ((double) (arg0.anInt6095 - arg0.anInt6105) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)Lclient!np;")
	public static Class224 method4128() {
		try {
			return (Class224) Class.forName("Class224_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(III[BIZLclient!ok;I)Lclient!ot;")
	public static Class40_Sub3_Sub1 method4129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(6) Class134_Sub2 arg3) {
		if (arg3.aBoolean519 || Static230.method3483(arg1) && Static230.method3483(arg0)) {
			return new Class40_Sub3_Sub1(arg3, 3553, 6406, arg1, arg0, false, arg2, 6406);
		} else if (arg3.aBoolean505) {
			return new Class40_Sub3_Sub1(arg3, 34037, 6406, arg1, arg0, false, arg2, 6406);
		} else {
			return new Class40_Sub3_Sub1(arg3, 6406, arg1, arg0, Static457.method6299(arg1), Static457.method6299(arg0), arg2, 6406);
		}
	}
}
