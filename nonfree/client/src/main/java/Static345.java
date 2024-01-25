import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mea", name = "Ab", descriptor = "Lclient!eq;")
	public static Class97 aClass97_91;

	@OriginalMember(owner = "client!mea", name = "Bb", descriptor = "Lclient!kr;")
	public static Class20 aClass20_28;

	@OriginalMember(owner = "client!mea", name = "Eb", descriptor = "F")
	public static float aFloat154;

	@OriginalMember(owner = "client!mea", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray417 = new int[500];

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ZILjava/lang/String;Ljava/awt/Color;)V")
	public static void method5394(@OriginalArg(0) Color arg0, @OriginalArg(1) Color arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) Color arg4) {
		try {
			@Pc(2) Graphics local2 = Static147.aCanvas5.getGraphics();
			if (Static295.aFont2 == null) {
				Static295.aFont2 = new Font("Helvetica", 1, 13);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg1 == null) {
				arg1 = new Color(255, 255, 255);
			}
			@Pc(63) int local63;
			try {
				if (Static263.anImage12 == null) {
					Static263.anImage12 = Static147.aCanvas5.createImage(Static571.anInt9399, Static585.anInt9606);
				}
				@Pc(48) Graphics local48 = Static263.anImage12.getGraphics();
				local48.setColor(Color.black);
				local48.fillRect(0, 0, Static571.anInt9399, Static585.anInt9606);
				local63 = Static571.anInt9399 / 2 - 152;
				@Pc(69) int local69 = Static585.anInt9606 / 2 - 18;
				local48.setColor(arg4);
				local48.drawRect(local63, local69, 303, 33);
				local48.setColor(arg0);
				local48.fillRect(local63 + 2, local69 - -2, arg2 * 3, 30);
				local48.setColor(Color.black);
				local48.drawRect(local63 + 1, local69 + 1, 301, 31);
				local48.fillRect(local63 + arg2 * 3 + 2, local69 - -2, 300 - arg2 * 3, 30);
				local48.setFont(Static295.aFont2);
				local48.setColor(arg1);
				local48.drawString(arg3, local63 + (304 - arg3.length() * 6) / 2, local69 + 22);
				if (Static226.aString50 != null) {
					local48.setFont(Static295.aFont2);
					local48.setColor(arg1);
					local48.drawString(Static226.aString50, Static571.anInt9399 / 2 - Static226.aString50.length() * 6 / 2, Static585.anInt9606 / 2 + -26);
				}
				local2.drawImage(Static263.anImage12, 0, 0, null);
			} catch (@Pc(189) Exception local189) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static571.anInt9399, Static585.anInt9606);
				@Pc(204) int local204 = Static571.anInt9399 / 2 - 152;
				local63 = Static585.anInt9606 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(local204, local63, 303, 33);
				local2.setColor(arg0);
				local2.fillRect(local204 + 2, local63 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local204 + 1, local63 + 1, 301, 31);
				local2.fillRect(local204 + arg2 * 3 + 2, local63 - -2, 300 - arg2 * 3, 30);
				local2.setFont(Static295.aFont2);
				local2.setColor(arg1);
				if (Static226.aString50 != null) {
					local2.setFont(Static295.aFont2);
					local2.setColor(arg1);
					local2.drawString(Static226.aString50, Static571.anInt9399 / 2 - Static226.aString50.length() * 6 / 2, Static585.anInt9606 / 2 - 26);
				}
				local2.drawString(arg3, (304 - arg3.length() * 6) / 2 + local204, local63 - -22);
			}
		} catch (@Pc(318) Exception local318) {
			Static147.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "(I)V")
	public static void method5395() {
		for (@Pc(7) int local7 = 0; local7 < Static74.anInt1598; local7++) {
			@Pc(13) Class208 local13 = Static492.aClass208Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(143) int local143;
			if (local13.aClass2_Sub2_Sub5_4 == null) {
				local13.anInt6158--;
				if (local13.anInt6158 >= (local13.method5168() ? -1500 : -10)) {
					if (local13.aByte89 == 1 && local13.aClass243_1 == null) {
						local13.aClass243_1 = Static650.method6254(Static560.aClass97_137, local13.anInt6163, 0);
						if (local13.aClass243_1 == null) {
							continue;
						}
						local13.anInt6158 += local13.aClass243_1.method6253();
					} else if (local13.method5168() && (local13.aClass2_Sub14_3 == null || local13.aClass2_Sub12_Sub1_4 == null)) {
						if (local13.aClass2_Sub14_3 == null) {
							local13.aClass2_Sub14_3 = Static83.method1542(Static333.aClass97_87, local13.anInt6163);
						}
						if (local13.aClass2_Sub14_3 == null) {
							continue;
						}
						if (local13.aClass2_Sub12_Sub1_4 == null) {
							local13.aClass2_Sub12_Sub1_4 = local13.aClass2_Sub14_3.method1537(new int[] { 22050 });
							if (local13.aClass2_Sub12_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local13.anInt6158 < 0) {
						@Pc(118) int local118 = 8192;
						if (local13.anInt6164 == 0) {
							local143 = local13.anInt6165 * (local13.aByte89 == 3 ? Static404.aClass2_Sub13_2.aClass33_Sub1_1.method810() : Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810()) >> 2;
						} else {
							@Pc(152) int local152 = local13.anInt6164 >> 24 & 0x3;
							if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 == local152) {
								@Pc(167) int local167 = (local13.anInt6164 & 0xFF) << 9;
								@Pc(173) int local173 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() << 8;
								@Pc(180) int local180 = local13.anInt6164 >> 16 & 0xFF;
								@Pc(192) int local192 = local173 + (local180 << 9) + 256 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925;
								@Pc(199) int local199 = local13.anInt6164 >> 8 & 0xFF;
								@Pc(211) int local211 = local173 + (local199 << 9) + 256 - Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929;
								@Pc(219) int local219 = Math.abs(local192) + Math.abs(local211) - 512;
								if (local167 < local219) {
									local13.anInt6158 = -99999;
									continue;
								}
								if (local219 < 0) {
									local219 = 0;
								}
								local143 = Static404.aClass2_Sub13_2.aClass33_Sub1_4.method810() * (local167 - local219) * local13.anInt6165 / local167 >> 2;
								if (local13.aClass11_Sub1_2 != null && local13.aClass11_Sub1_2 instanceof Class11_Sub1_Sub1) {
									@Pc(263) Class11_Sub1_Sub1 local263 = (Class11_Sub1_Sub1) local13.aClass11_Sub1_2;
									@Pc(266) short local266 = local263.aShort95;
									@Pc(269) short local269 = local263.aShort97;
								}
								if (local192 != 0 || local211 != 0) {
									@Pc(293) int local293 = -Static105.anInt2114 - (int) (Math.atan2((double) local192, (double) local211) * 2607.5945876176133D) - 4096 & 0x3FFF;
									if (local293 > 8192) {
										local293 = 16384 - local293;
									}
									@Pc(315) int local315;
									if (local219 <= 0) {
										local315 = 8192;
									} else if (local219 >= 4096) {
										local315 = 16384;
									} else {
										local315 = (8192 - local219) / 4096 + 8192;
									}
									local118 = (16384 - local315 >> 1) + local315 * local293 / 8192;
								}
							} else {
								local143 = 0;
							}
						}
						if (local143 > 0) {
							@Pc(347) Class2_Sub12_Sub1 local347 = null;
							if (local13.aByte89 == 1) {
								local347 = local13.aClass243_1.method6256().method1266(Static460.aClass101_2);
							} else if (local13.method5168()) {
								local347 = local13.aClass2_Sub12_Sub1_4;
							}
							@Pc(377) Class2_Sub2_Sub5 local377 = local13.aClass2_Sub2_Sub5_4 = Static652.method7560(local347, local13.anInt6162, local143, local118);
							local377.method7552(local13.anInt6161 - 1);
							Static1.aClass2_Sub2_Sub2_6.method1044(local377);
						}
					}
				} else {
					local15 = true;
				}
			} else if (!local13.aClass2_Sub2_Sub5_4.method8600()) {
				local15 = true;
			}
			if (local15) {
				Static74.anInt1598--;
				for (local143 = local7; local143 < Static74.anInt1598; local143++) {
					Static492.aClass208Array1[local143] = Static492.aClass208Array1[local143 + 1];
				}
				local7--;
			}
		}
		if (Static243.aBoolean394 && !Static500.method7112()) {
			if (Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810() != 0 && Static125.anInt2929 != -1) {
				if (Static322.aClass2_Sub2_Sub1_3 == null) {
					Static556.method7705(Static125.anInt2929, Static536.aClass97_133, Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810());
				} else {
					Static504.method7814(Static125.anInt2929, Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810(), Static322.aClass2_Sub2_Sub1_3, Static536.aClass97_133);
				}
			}
			Static322.aClass2_Sub2_Sub1_3 = null;
			Static243.aBoolean394 = false;
		} else if (Static404.aClass2_Sub13_2.aClass33_Sub1_2.method810() != 0 && Static125.anInt2929 != -1 && !Static500.method7112()) {
			@Pc(497) Class2_Sub50 local497 = Static595.method8194(Static610.aClass310_2, Static457.aClass269_76);
			local497.aClass2_Sub34_Sub2_2.method6864(Static125.anInt2929);
			Static311.method4754(local497);
			Static125.anInt2929 = -1;
		}
	}
}
