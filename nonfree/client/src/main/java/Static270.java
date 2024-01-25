import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "[Lclient!l;")
	public static Class14_Sub8[] aClass14_Sub8Array1;

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet5;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!wu;")
	public static Class384 aClass384_70;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_42 = new Class181(70, -1);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIII)V")
	public static void method4080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static627.aClass5_Sub46_31.aClass11_Sub17_2.method5908() != 0 && arg3 != 0 && Static44.anInt730 < 50 && arg4 != -1) {
			Static113.aClass59Array1[Static44.anInt730++] = new Class59((byte) 1, arg4, arg3, arg1, arg5, arg2, arg0, (Class14_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIZ)I")
	public static int method4081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 / arg2;
		@Pc(13) int local13 = arg2 - 1 & arg1;
		@Pc(17) int local17 = arg0 / arg2;
		@Pc(23) int local23 = arg0 & arg2 - 1;
		@Pc(33) int local33 = Static132.method1985(local7, local17);
		@Pc(40) int local40 = Static132.method1985(local7 + 1, local17);
		@Pc(47) int local47 = Static132.method1985(local7, local17 + 1);
		@Pc(56) int local56 = Static132.method1985(local7 + 1, local17 - -1);
		@Pc(63) int local63 = Static144.method2150(arg2, local40, local13, local33);
		@Pc(70) int local70 = Static144.method2150(arg2, local56, local13, local47);
		return Static144.method2150(arg2, local70, local23, local63);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!la;ILclient!kf;Z)V")
	public static void method4083(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub1 arg2) {
		if (Static44.anInt730 >= 50 || (arg0 == null || arg0.anIntArrayArray23 == null || arg1 >= arg0.anIntArrayArray23.length || arg0.anIntArrayArray23[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray23[arg1][0];
		@Pc(49) int local49 = local36 >> 8;
		@Pc(55) int local55 = local36 >> 5 & 0x7;
		@Pc(72) int local72;
		if (arg0.anIntArrayArray23[arg1].length > 1) {
			local72 = (int) (Math.random() * (double) arg0.anIntArrayArray23[arg1].length);
			if (local72 > 0) {
				local49 = arg0.anIntArrayArray23[arg1][local72];
			}
		}
		@Pc(85) int local85 = local36 & 0x1F;
		local72 = 256;
		if (arg0.anIntArray387 != null && arg0.anIntArray390 != null) {
			local72 = arg0.anIntArray387[arg1] + (int) (Math.random() * (double) (arg0.anIntArray390[arg1] - arg0.anIntArray387[arg1]));
		}
		@Pc(123) int local123 = arg0.anIntArray392 == null ? 255 : arg0.anIntArray392[arg1];
		if (local85 == 0) {
			if (arg2 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1) {
				if (!arg0.aBoolean404) {
					Static301.method4383(local72, local49, 0, local123, local55);
					return;
				}
				Static392.method6102(local123, local55, local49, local72, false, 0);
			}
		} else if (Static627.aClass5_Sub46_31.aClass11_Sub17_1.method5908() != 0) {
			@Pc(168) int local168 = arg2.anInt9317 - 256 >> 9;
			@Pc(175) int local175 = arg2.anInt9315 - 256 >> 9;
			@Pc(195) int local195 = arg2 == Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1 ? 0 : local85 + (local168 << 16) + (arg2.aByte125 << 24) + (local175 << 8);
			Static113.aClass59Array1[Static44.anInt730++] = new Class59((byte) (arg0.aBoolean404 ? 2 : 1), local49, local55, 0, local123, local195, local72, arg2);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public static void method4084() {
		if (Static467.anInt7868 == -1 || Static229.anInt3965 == -1) {
			return;
		}
		@Pc(25) int local25 = Static200.anInt3571 + (Static614.anInt10020 * (Static517.anInt8636 - Static200.anInt3571) >> 16);
		Static614.anInt10020 += local25;
		if (Static614.anInt10020 < 65535) {
			Static299.aBoolean392 = false;
			Class14_Sub1_Sub5_Sub2.lb = false;
		} else {
			Static614.anInt10020 = 65535;
			if (Static299.aBoolean392) {
				Class14_Sub1_Sub5_Sub2.lb = false;
			} else {
				Class14_Sub1_Sub5_Sub2.lb = true;
			}
			Static299.aBoolean392 = true;
		}
		@Pc(57) float local57 = (float) Static614.anInt10020 / 65535.0F;
		@Pc(60) float[] local60 = new float[3];
		@Pc(64) int local64 = Static282.anInt4631 * 2;
		@Pc(90) int local90;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(161) int local161;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static100.anIntArrayArrayArray3[Static467.anInt7868][local64][local66] * 3;
			local90 = Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 1][local66] * 3;
			local122 = (Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 2][local66] + Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 2][local66] - Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 3][local66]) * 3;
			local130 = Static100.anIntArrayArrayArray3[Static467.anInt7868][local64][local66];
			local135 = local90 - local78;
			local144 = local122 + local78 - local90 * 2;
			local161 = Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 2][local66] + local90 - local130 - local122;
			local60[local66] = ((float) local135 + ((float) local144 + local57 * (float) local161) * local57) * local57 + (float) local130;
		}
		Static216.anInt3726 = (int) local60[1] * -1;
		Static646.anInt10445 = (int) local60[2] - Static622.anInt10087 * 512;
		Static70.anInt9231 = (int) local60[0] - Static113.anInt1785 * 512;
		@Pc(217) float[] local217 = new float[3];
		local90 = Static71.anInt1126 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static100.anIntArrayArrayArray3[Static229.anInt3965][local90][local122] * 3;
			local135 = Static100.anIntArrayArrayArray3[Static229.anInt3965][local90 + 1][local122] * 3;
			local144 = (Static100.anIntArrayArrayArray3[Static229.anInt3965][local90 + 2][local122] + Static100.anIntArrayArrayArray3[Static229.anInt3965][local90 + 2][local122] - Static100.anIntArrayArrayArray3[Static229.anInt3965][local90 + 3][local122]) * 3;
			local161 = Static100.anIntArrayArrayArray3[Static229.anInt3965][local90][local122];
			@Pc(293) int local293 = local135 - local130;
			@Pc(302) int local302 = local144 + local130 - local135 * 2;
			@Pc(320) int local320 = Static100.anIntArrayArrayArray3[Static229.anInt3965][local90 + 2][local122] + local135 - local161 - local144;
			local217[local122] = (float) local161 + local57 * (local57 * ((float) local320 * local57 + (float) local302) + (float) local293);
		}
		@Pc(355) float local355 = local217[0] - local60[0];
		@Pc(366) float local366 = (local217[1] - local60[1]) * -1.0F;
		@Pc(374) float local374 = local217[2] - local60[2];
		@Pc(384) double local384 = Math.sqrt((double) (local355 * local355 + local374 * local374));
		Static218.anInt3744 = (int) (Math.atan2((double) local366, local384) * 2607.5945876176133D) & 0x3FFF;
		Static608.anInt9971 = (int) (-Math.atan2((double) local355, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static21.anInt457 = Static100.anIntArrayArrayArray3[Static467.anInt7868][local64][3] + ((Static100.anIntArrayArrayArray3[Static467.anInt7868][local64 + 2][3] - Static100.anIntArrayArrayArray3[Static467.anInt7868][local64][3]) * Static614.anInt10020 >> 16);
	}
}
