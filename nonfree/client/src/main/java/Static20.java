import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!vb;")
	public static Class82 aClass82_8;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!tg;")
	public static Class81 aClass81_167 = Static120.method2057("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!tg;")
	private static Class81 aClass81_170 = Static120.method2057("red:");

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!tg;")
	public static Class81 aClass81_168 = aClass81_170;

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_169 = Static120.method2057("(U2");

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	public static int[] anIntArray23 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt506 = 0;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "I")
	public static int anInt507 = -1;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public static int anInt510 = 0;

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Lclient!tg;")
	public static Class81 aClass81_171 = aClass81_170;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
	public static void method403() {
		anIntArray23 = null;
		aClass81_171 = null;
		aClass82_8 = null;
		aClass81_169 = null;
		aClass81_167 = null;
		aClass81_170 = null;
		aClass81_168 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!de;B)V")
	public static void method404(@OriginalArg(0) Class1_Sub2_Sub1_Sub3 arg0) {
		if (arg0.anInt3041 == 0) {
			return;
		}
		@Pc(47) int local47;
		@Pc(40) int local40;
		if (arg0.anInt3052 != -1 && arg0.anInt3052 < 32768) {
			@Pc(31) Class1_Sub2_Sub1_Sub3_Sub2 local31 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[arg0.anInt3052];
			if (local31 != null) {
				local40 = arg0.anInt3026 - local31.anInt3026;
				local47 = arg0.anInt3040 - local31.anInt3040;
				if (local47 != 0 || local40 != 0) {
					arg0.anInt3049 = (int) (Math.atan2((double) local47, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(80) int local80;
		if (arg0.anInt3052 >= 32768) {
			local80 = arg0.anInt3052 - 32768;
			if (local80 == Static110.anInt2514) {
				local80 = 2047;
			}
			@Pc(89) Class1_Sub2_Sub1_Sub3_Sub1 local89 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local80];
			if (local89 != null) {
				local40 = arg0.anInt3040 - local89.anInt3040;
				@Pc(103) int local103 = arg0.anInt3026 - local89.anInt3026;
				if (local40 != 0 || local103 != 0) {
					arg0.anInt3049 = (int) (Math.atan2((double) local40, (double) local103) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3018 != 0 || arg0.anInt3053 != 0) && (arg0.anInt3011 == 0 || arg0.anInt3062 > 0)) {
			local80 = arg0.anInt3040 - (arg0.anInt3018 - Static51.anInt1219 - Static51.anInt1219) * 64;
			local47 = arg0.anInt3026 - (arg0.anInt3053 - Static114.anInt2140 - Static114.anInt2140) * 64;
			if (local80 != 0 || local47 != 0) {
				arg0.anInt3049 = (int) (Math.atan2((double) local80, (double) local47) * 325.949D) & 0x7FF;
			}
			arg0.anInt3053 = 0;
			arg0.anInt3018 = 0;
		}
		local80 = arg0.anInt3049 - arg0.anInt3048 & 0x7FF;
		if (local80 == 0) {
			arg0.anInt3047 = 0;
			return;
		}
		arg0.anInt3047++;
		@Pc(229) boolean local229;
		if (local80 > 1024) {
			arg0.anInt3048 -= arg0.anInt3041;
			local229 = true;
			if (local80 < arg0.anInt3041 || 2048 - arg0.anInt3041 < local80) {
				arg0.anInt3048 = arg0.anInt3049;
				local229 = false;
			}
			if (arg0.anInt3009 == arg0.anInt3054 && (arg0.anInt3047 > 25 || local229)) {
				if (arg0.anInt3061 == -1) {
					arg0.anInt3054 = arg0.anInt3034;
				} else {
					arg0.anInt3054 = arg0.anInt3061;
				}
			}
		} else {
			arg0.anInt3048 += arg0.anInt3041;
			local229 = true;
			if (arg0.anInt3041 > local80 || local80 > 2048 - arg0.anInt3041) {
				local229 = false;
				arg0.anInt3048 = arg0.anInt3049;
			}
			if (arg0.anInt3054 == arg0.anInt3009 && (arg0.anInt3047 > 25 || local229)) {
				if (arg0.anInt3055 == -1) {
					arg0.anInt3054 = arg0.anInt3034;
				} else {
					arg0.anInt3054 = arg0.anInt3055;
				}
			}
		}
		arg0.anInt3048 &= 0x7FF;
	}
}
