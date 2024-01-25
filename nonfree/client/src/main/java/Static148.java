import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!jr", name = "ab", descriptor = "I")
	public static int anInt3246;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "Z")
	public static boolean aBoolean313 = false;

	@OriginalMember(owner = "client!jr", name = "T", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!jr", name = "U", descriptor = "I")
	public static int anInt3242 = 16777215;

	@OriginalMember(owner = "client!jr", name = "V", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_14 = new Class16();

	@OriginalMember(owner = "client!jr", name = "Y", descriptor = "I")
	public static int anInt3244 = 0;

	@OriginalMember(owner = "client!jr", name = "bb", descriptor = "I")
	public static int anInt3247 = 0;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZIIIZBII)V")
	public static void method2959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg4 && Static224.anInt4654 == arg3 && arg6 == Static124.anInt2811 && (arg2 == Static141.anInt6334 || Static40.method953())) {
			return;
		}
		Static141.anInt6334 = arg2;
		Static224.anInt4654 = arg3;
		Static124.anInt2811 = arg6;
		if (Static40.method953()) {
			Static141.anInt6334 = 0;
		}
		if (arg0) {
			Static232.method4269(28);
		} else {
			Static232.method4269(25);
		}
		Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907), true, Static212.aClass9_3);
		@Pc(55) int local55 = Static234.anInt4783;
		Static234.anInt4783 = (Static224.anInt4654 - (Static233.anInt5573 >> 4)) * 8;
		@Pc(65) int local65 = Static32.anInt2224;
		Static32.anInt2224 = (Static124.anInt2811 - (Static134.anInt2971 >> 4)) * 8;
		Static83.aClass1_Sub4_Sub1_2 = Static79.method3760(Static224.anInt4654 * 8, Static124.anInt2811 * 8);
		Static224.aClass207_3 = null;
		@Pc(93) int local93 = Static234.anInt4783 - local55;
		@Pc(98) int local98 = Static32.anInt2224 - local65;
		@Pc(108) int local108;
		@Pc(116) int local116;
		if (arg0) {
			Static5.anInt200 = 0;
			local108 = Static233.anInt5573 * 128 - 128;
			@Pc(114) int local114 = Static134.anInt2971 * 128 - 128;
			for (local116 = 0; local116 < 32768; local116++) {
				@Pc(122) Class17_Sub1_Sub1_Sub2 local122 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local116];
				if (local122 != null) {
					local122.anInt5109 -= local93 * 128;
					local122.anInt5108 -= local98 * 128;
					if (local122.anInt5109 >= 0 && local122.anInt5109 <= local108 && local122.anInt5108 >= 0 && local122.anInt5108 <= local114) {
						@Pc(171) boolean local171 = true;
						for (@Pc(173) int local173 = 0; local173 < 10; local173++) {
							local122.anIntArray438[local173] -= local93;
							local122.anIntArray439[local173] -= local98;
							if (local122.anIntArray438[local173] < 0 || local122.anIntArray438[local173] >= Static233.anInt5573 || local122.anIntArray439[local173] < 0 || local122.anIntArray439[local173] >= Static134.anInt2971) {
								local171 = false;
							}
						}
						if (local171) {
							Static171.anIntArray333[Static5.anInt200++] = local116;
						} else {
							Static140.aClass17_Sub1_Sub1_Sub2Array1[local116].method4332(null);
							Static140.aClass17_Sub1_Sub1_Sub2Array1[local116] = null;
						}
					} else {
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local116].method4332(null);
						Static140.aClass17_Sub1_Sub1_Sub2Array1[local116] = null;
					}
				}
			}
		} else {
			for (local108 = 0; local108 < 32768; local108++) {
				@Pc(262) Class17_Sub1_Sub1_Sub2 local262 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local108];
				if (local262 != null) {
					for (local116 = 0; local116 < 10; local116++) {
						local262.anIntArray438[local116] -= local93;
						local262.anIntArray439[local116] -= local98;
					}
					local262.anInt5108 -= local98 * 128;
					local262.anInt5109 -= local93 * 128;
				}
			}
		}
		for (local108 = 0; local108 < 2048; local108++) {
			@Pc(318) Class17_Sub1_Sub1_Sub1 local318 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local108];
			if (local318 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local318.anIntArray438[local116] -= local93;
					local318.anIntArray439[local116] -= local98;
				}
				local318.anInt5109 -= local93 * 128;
				local318.anInt5108 -= local98 * 128;
			}
		}
		Static242.anInt6745 = arg2;
		Static198.aClass17_Sub1_Sub1_Sub1_3.method560(false, arg5, Static242.anInt6745, arg1);
		Static251.method4210(local93, local98);
		for (@Pc(386) Class1_Sub25 local386 = (Class1_Sub25) Static290.aClass16_35.method410(); local386 != null; local386 = (Class1_Sub25) Static290.aClass16_35.method419()) {
			local386.anInt3971 -= local93;
			local386.anInt3977 -= local98;
			if (local386.anInt3971 < 0 || local386.anInt3977 < 0 || local386.anInt3971 >= Static233.anInt5573 || local386.anInt3977 >= Static134.anInt2971) {
				local386.method5628();
			}
		}
		Static225.anInt4698 = 0;
		if (Static99.anInt2377 != 0) {
			Static266.anInt5402 -= local98;
			Static99.anInt2377 -= local93;
		}
		if (arg0) {
			Static107.anInt2549 -= local93;
			Static354.anInt6757 -= local98;
			Static219.anInt4615 -= local98;
			Static320.anInt5326 -= local93 * 128;
			Static64.anInt1797 -= local98 * 128;
			Static301.anInt5960 -= local93;
			if (Math.abs(local93) > Static233.anInt5573 || Math.abs(local98) > Static134.anInt2971) {
				Static308.method2772();
			}
		} else if (Static147.anInt3204 == 4) {
			Static107.anInt2547 -= local93 * 128;
			Static77.anInt2010 -= local98 * 128;
			Static133.anInt2962 -= local93 * 128;
			Static87.anInt2179 -= local98 * 128;
		} else {
			Static147.anInt3204 = 1;
		}
		Static234.method4276();
		Static299.method1010();
		Static34.aClass16_3.method421();
		Static294.aClass16_36.method421();
		Static64.aClass217_2.method5688();
		Static124.method2605();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!aq;)V")
	public static void method2960(@OriginalArg(1) Class12 arg0) {
		if (!Static91.aBoolean214) {
			return;
		}
		Static342.aClass1_Sub8_Sub1_7.method3229(138);
		Static342.aClass1_Sub8_Sub1_7.method4529(arg0.anInt465);
		Static342.aClass1_Sub8_Sub1_7.method4515(arg0.anInt406);
		Static342.aClass1_Sub8_Sub1_7.method4529(Static349.anInt6682);
		Static342.aClass1_Sub8_Sub1_7.method4515(arg0.anInt410);
		Static342.aClass1_Sub8_Sub1_7.method4561(Static96.anInt6250);
		Static342.aClass1_Sub8_Sub1_7.method4561(Static97.anInt5544);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BD)V")
	public static void method2961(@OriginalArg(1) double arg0) {
		if (Static20.aDouble1 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static91.anIntArray214[local11] = local23 <= 255 ? local23 : 255;
		}
		Static20.aDouble1 = arg0;
	}
}
