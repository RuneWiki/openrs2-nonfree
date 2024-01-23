import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "I")
	public static int anInt205;

	@OriginalMember(owner = "client!an", name = "j", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!an", name = "m", descriptor = "I")
	public static int anInt213;

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Lclient!af;")
	public static Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "[Lclient!rc;")
	public static Class145[] aClass145Array1;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "[I")
	public static int[] anIntArray24 = new int[32];

	@OriginalMember(owner = "client!an", name = "i", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	public static int anInt216 = 0;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Z")
	public static boolean aBoolean8 = false;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([[II)V")
	public static void method179(@OriginalArg(0) int[][] arg0) {
		Static234.anIntArrayArray40 = arg0;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lclient!qa;")
	public static Class135 method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class135 local14 = local7.aClass135_1;
			local7.aClass135_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
	public static void method183() {
		anIntArray24 = null;
		aClass4_Sub2_Sub1_Sub1_1 = null;
		aClass145Array1 = null;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!lc;Lclient!fg;Lclient!lc;BLclient!lc;)Z")
	public static boolean method186(@OriginalArg(0) Class98 arg0, @OriginalArg(1) Class4_Sub9_Sub2 arg1, @OriginalArg(2) Class98 arg2, @OriginalArg(4) Class98 arg3) {
		Static67.aClass4_Sub9_Sub2_1 = arg1;
		Static182.aClass98_103 = arg2;
		Static206.aClass98_125 = arg0;
		Static137.aClass98_82 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(ZLclient!qm;BIII)V")
	public static void method188(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static7.anInt173 >= 50 || (arg1 == null || arg1.anIntArrayArray34 == null || arg1.anIntArrayArray34.length <= arg4 || arg1.anIntArrayArray34[arg4] == null)) {
			return;
		}
		@Pc(36) int local36 = arg1.anIntArrayArray34[arg4][0];
		@Pc(46) int local46 = local36 >> 8;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(70) int local70;
		if (arg1.anIntArrayArray34[arg4].length > 1) {
			local70 = (int) (Math.random() * (double) arg1.anIntArrayArray34[arg4].length);
			if (local70 > 0) {
				local46 = arg1.anIntArrayArray34[arg4][local70];
			}
		}
		@Pc(89) int local89 = local36 >> 5 & 0x7;
		if (local50 == 0) {
			if (arg0) {
				Static231.method3630(local46, local89, 255, 0);
			}
		} else if (Static71.anInt1312 != 0) {
			Static92.anIntArray205[Static7.anInt173] = local46;
			Static66.anIntArray137[Static7.anInt173] = local89;
			Static262.anIntArray440[Static7.anInt173] = 0;
			Static211.aClass60Array1[Static7.anInt173] = null;
			@Pc(130) int local130 = (arg3 - 64) / 128;
			Static10.anIntArray23[Static7.anInt173] = 255;
			local70 = (arg2 - 64) / 128;
			Static200.anIntArray336[Static7.anInt173] = local50 + (local130 << 8) + (local70 << 16);
			Static7.anInt173++;
		}
	}
}
