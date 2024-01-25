import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
	public static int[] anIntArray268;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_23 = new Class25(32);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIZIZI)V")
	public static void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static355.aFrame7 != null && (arg1 != 3 || arg4 != Static25.anInt363 || arg2 != Static213.anInt4406)) {
			Static647.method8678(Static355.aFrame7, Static48.aClass298_12);
			Static355.aFrame7 = null;
		}
		if (arg1 == 3 && Static355.aFrame7 == null) {
			Static355.aFrame7 = Static532.method7713(arg4, 0, Static48.aClass298_12, arg2);
			if (Static355.aFrame7 != null) {
				Static25.anInt363 = arg4;
				Static213.anInt4406 = arg2;
				Static124.method2223();
			}
		}
		if (arg1 == 3 && Static355.aFrame7 == null) {
			method4166(arg0, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, true, -1);
			return;
		}
		@Pc(96) Container local96;
		@Pc(74) Insets local74;
		if (Static355.aFrame7 != null) {
			local96 = Static355.aFrame7;
			Static136.anInt2830 = arg4;
			Static155.anInt3159 = arg2;
		} else if (Static190.aFrame1 == null) {
			if (Static303.anApplet3 == null) {
				local96 = Static467.anApplet_Sub1_1;
			} else {
				local96 = Static303.anApplet3;
			}
			Static136.anInt2830 = local96.getSize().width;
			Static155.anInt3159 = local96.getSize().height;
		} else {
			local74 = Static190.aFrame1.getInsets();
			@Pc(82) int local82 = local74.right + local74.left;
			Static136.anInt2830 = Static190.aFrame1.getSize().width - local82;
			@Pc(92) int local92 = local74.top + local74.bottom;
			Static155.anInt3159 = Static190.aFrame1.getSize().height - local92;
			local96 = Static190.aFrame1;
		}
		if (arg1 == 1) {
			Static294.anInt5875 = (Static136.anInt2830 - Static623.anInt9971) / 2;
			Static330.anInt6254 = Static623.anInt9971;
			Static190.anInt3576 = Static269.anInt5258;
			Static303.anInt8406 = 0;
		} else {
			Static571.method8271();
		}
		if (Static508.aClass220_11 != Static38.aClass220_2) {
			@Pc(153) boolean local153;
			if (Static330.anInt6254 < 1024 && Static190.anInt3576 < 768) {
				local153 = true;
			} else {
				local153 = false;
			}
		}
		if (arg3) {
			Static188.method3055();
		} else {
			Static617.aCanvas13.setSize(Static330.anInt6254, Static190.anInt3576);
			if (Static80.aBoolean118) {
				Static326.method5367(Static617.aCanvas13);
			} else {
				Static266.aClass82_8.method6149(Static617.aCanvas13, Static330.anInt6254, Static190.anInt3576);
			}
			if (local96 == Static190.aFrame1) {
				local74 = Static190.aFrame1.getInsets();
				Static617.aCanvas13.setLocation(local74.left + Static294.anInt5875, Static303.anInt8406 + local74.top);
			} else {
				Static617.aCanvas13.setLocation(Static294.anInt5875, Static303.anInt8406);
			}
		}
		if (arg1 >= 2) {
			Static481.aBoolean591 = true;
		} else {
			Static481.aBoolean591 = false;
		}
		if (Static528.anInt8950 != -1) {
			Static228.method3952(true);
		}
		if (Static547.aClass197_1 != null && Static26.method368(Static82.anInt1653)) {
			Static636.method8566();
		}
		for (@Pc(227) int local227 = 0; local227 < 100; local227++) {
			Static110.aBooleanArray5[local227] = true;
		}
		Static343.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public static void method4167() {
		if (Static133.aClass291ArrayArray30 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < Static133.aClass291ArrayArray30.length; local5++) {
			for (@Pc(9) int local9 = 0; local9 < Static133.aClass291ArrayArray30[local5].length; local9++) {
				Static133.aClass291ArrayArray30[local5][local9] = Static304.aClass291_5;
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!ha;Lclient!hw;I)V")
	public static void method4168(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) Class153 arg2) {
		@Pc(17) int local17;
		if (Static29.anIntArray34 != null && arg2.aByte60 >= arg0) {
			for (local17 = 0; local17 < Static29.anIntArray34.length; local17++) {
				if (Static29.anIntArray34[local17] != -1000000 && (arg2.anIntArray249[0] <= Static29.anIntArray34[local17] || arg2.anIntArray249[1] <= Static29.anIntArray34[local17] || Static29.anIntArray34[local17] >= arg2.anIntArray249[2] || Static29.anIntArray34[local17] >= arg2.anIntArray249[3]) && (Static611.anIntArray633[local17] >= arg2.anIntArray248[0] || Static611.anIntArray633[local17] >= arg2.anIntArray248[1] || Static611.anIntArray633[local17] >= arg2.anIntArray248[2] || arg2.anIntArray248[3] <= Static611.anIntArray633[local17]) && (Static317.anIntArray335[local17] <= arg2.anIntArray248[0] || arg2.anIntArray248[1] >= Static317.anIntArray335[local17] || Static317.anIntArray335[local17] <= arg2.anIntArray248[2] || Static317.anIntArray335[local17] <= arg2.anIntArray248[3]) && (arg2.anIntArray247[0] <= Static12.anIntArray25[local17] || Static12.anIntArray25[local17] >= arg2.anIntArray247[1] || Static12.anIntArray25[local17] >= arg2.anIntArray247[2] || Static12.anIntArray25[local17] >= arg2.anIntArray247[3]) && (arg2.anIntArray247[0] >= Static336.anIntArray345[local17] || Static336.anIntArray345[local17] <= arg2.anIntArray247[1] || Static336.anIntArray345[local17] <= arg2.anIntArray247[2] || Static336.anIntArray345[local17] <= arg2.anIntArray247[3])) {
					return;
				}
			}
		}
		@Pc(261) int local261;
		@Pc(282) int local282;
		@Pc(303) boolean local303;
		@Pc(335) float local335;
		if (arg2.aByte61 == 1) {
			local17 = Static361.anInt6683 + arg2.aShort50 - Static281.anInt5392;
			if (local17 >= 0 && local17 <= Static361.anInt6683 + Static361.anInt6683) {
				local261 = Static361.anInt6683 + arg2.aShort53 - Static394.anInt7055;
				if (local261 < 0) {
					local261 = 0;
				} else if (local261 > Static361.anInt6683 + Static361.anInt6683) {
					return;
				}
				local282 = Static361.anInt6683 + arg2.aShort52 - Static394.anInt7055;
				if (local282 > Static361.anInt6683 + Static361.anInt6683) {
					local282 = Static361.anInt6683 + Static361.anInt6683;
				} else if (local282 < 0) {
					return;
				}
				local303 = false;
				while (local282 >= local261) {
					if (Static140.aBooleanArrayArray2[local17][local261++]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local335 = (float) (Static540.anInt9068 - arg2.anIntArray248[0]);
					if (local335 < 0.0F) {
						local335 *= -1.0F;
					}
					if (!local335 < (float) Static161.anInt2907 && (Static582.method8111(0, arg2) && (Static582.method8111(1, arg2) && (Static582.method8111(2, arg2) && Static582.method8111(3, arg2))))) {
						Static291.aClass153Array2[Static292.anInt5626++] = arg2;
					}
				}
			}
		} else if (arg2.aByte61 == 2) {
			local17 = arg2.aShort53 + Static361.anInt6683 - Static394.anInt7055;
			if (local17 >= 0 && Static361.anInt6683 + Static361.anInt6683 >= local17) {
				local261 = arg2.aShort50 + Static361.anInt6683 - Static281.anInt5392;
				if (local261 < 0) {
					local261 = 0;
				} else if (Static361.anInt6683 + Static361.anInt6683 < local261) {
					return;
				}
				local282 = Static361.anInt6683 + arg2.aShort51 - Static281.anInt5392;
				if (local282 > Static361.anInt6683 + Static361.anInt6683) {
					local282 = Static361.anInt6683 + Static361.anInt6683;
				} else if (local282 < 0) {
					return;
				}
				local303 = false;
				while (local282 >= local261) {
					if (Static140.aBooleanArrayArray2[local261++][local17]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local335 = (float) (Static536.anInt9043 - arg2.anIntArray247[0]);
					if (local335 < 0.0F) {
						local335 *= -1.0F;
					}
					if (!((float) Static161.anInt2907 > local335) && (Static582.method8111(0, arg2) && (Static582.method8111(1, arg2) && (Static582.method8111(2, arg2) && Static582.method8111(3, arg2))))) {
						Static291.aClass153Array2[Static292.anInt5626++] = arg2;
					}
				}
			}
		} else if (arg2.aByte61 == 16 || arg2.aByte61 == 8) {
			local17 = Static361.anInt6683 + arg2.aShort50 - Static281.anInt5392;
			if (local17 >= 0 && Static361.anInt6683 + Static361.anInt6683 >= local17) {
				local261 = Static361.anInt6683 + arg2.aShort53 - Static394.anInt7055;
				if (local261 >= 0 && Static361.anInt6683 + Static361.anInt6683 >= local261 && Static140.aBooleanArrayArray2[local17][local261]) {
					@Pc(589) float local589 = (float) (Static540.anInt9068 - arg2.anIntArray248[0]);
					if (local589 < 0.0F) {
						local589 *= -1.0F;
					}
					@Pc(606) float local606 = (float) (Static536.anInt9043 - arg2.anIntArray247[0]);
					if (local606 < 0.0F) {
						local606 *= -1.0F;
					}
					if ((!((float) Static161.anInt2907 > local589) || !((float) Static161.anInt2907 > local606)) && (Static582.method8111(0, arg2) && (Static582.method8111(1, arg2) && (Static582.method8111(2, arg2) && Static582.method8111(3, arg2))))) {
						Static291.aClass153Array2[Static292.anInt5626++] = arg2;
					}
				}
			}
		} else if (arg2.aByte61 == 4) {
			@Pc(673) float local673 = (float) (arg2.anIntArray249[0] - Static486.anInt8250);
			if (!(local673 <= (float) Static609.anInt9813)) {
				local261 = arg2.aShort53 + Static361.anInt6683 - Static394.anInt7055;
				if (local261 < 0) {
					local261 = 0;
				} else if (local261 > Static361.anInt6683 + Static361.anInt6683) {
					return;
				}
				local282 = arg2.aShort52 + Static361.anInt6683 - Static394.anInt7055;
				if (local282 > Static361.anInt6683 + Static361.anInt6683) {
					local282 = Static361.anInt6683 + Static361.anInt6683;
				} else if (local282 < 0) {
					return;
				}
				@Pc(739) int local739 = arg2.aShort50 + Static361.anInt6683 - Static281.anInt5392;
				if (local739 < 0) {
					local739 = 0;
				} else if (Static361.anInt6683 + Static361.anInt6683 < local739) {
					return;
				}
				@Pc(762) int local762 = arg2.aShort51 + Static361.anInt6683 - Static281.anInt5392;
				if (Static361.anInt6683 + Static361.anInt6683 < local762) {
					local762 = Static361.anInt6683 + Static361.anInt6683;
				} else if (local762 < 0) {
					return;
				}
				@Pc(779) boolean local779 = false;
				label283: for (@Pc(781) int local781 = local739; local781 <= local762; local781++) {
					for (@Pc(785) int local785 = local261; local785 <= local282; local785++) {
						if (Static140.aBooleanArrayArray2[local781][local785]) {
							local779 = true;
							break label283;
						}
					}
				}
				if (local779 && (Static582.method8111(0, arg2) && (Static582.method8111(1, arg2) && (Static582.method8111(2, arg2) && Static582.method8111(3, arg2))))) {
					Static291.aClass153Array2[Static292.anInt5626++] = arg2;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
	public static void method4170() {
		@Pc(1) Class136 local1 = Static89.aClass136_40;
		synchronized (Static89.aClass136_40) {
			Static89.aClass136_40.method3132(5);
		}
	}
}
