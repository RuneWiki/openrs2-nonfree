import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!lla", name = "L", descriptor = "I")
	public static int anInt6367;

	@OriginalMember(owner = "client!lla", name = "cb", descriptor = "Lclient!lb;")
	public static Class221 aClass221_104;

	@OriginalMember(owner = "client!lla", name = "pb", descriptor = "Lclient!m;")
	public static final Class235 aClass235_36 = new Class235(2);

	@OriginalMember(owner = "client!lla", name = "nb", descriptor = "[Lclient!oaa;")
	public static Class256_Sub1[] aClass256_Sub1Array1 = new Class256_Sub1[0];

	@OriginalMember(owner = "client!lla", name = "T", descriptor = "Lclient!kia;")
	public static final Class206 aClass206_12 = new Class206(6, -1);

	@OriginalMember(owner = "client!lla", name = "hb", descriptor = "I")
	public static int anInt6365 = 0;

	@OriginalMember(owner = "client!lla", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString96 = null;

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(ZIIIBIIII)Z")
	public static boolean method5394(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0];
		@Pc(13) int local13 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0];
		if (local8 < 0 || Static362.anInt8653 <= local8 || local13 < 0 || local13 >= Static206.anInt11291) {
			return false;
		} else if (arg3 >= 0 && Static362.anInt8653 > arg3 && arg2 >= 0 && Static206.anInt11291 > arg2) {
			@Pc(82) int local82 = Static135.method2225(arg7, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6592(), Static298.anIntArray221, arg3, Static678.aClass360Array5[Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146], local13, arg6, arg0, arg5, Static104.anIntArray97, arg4, arg2, arg1, local8);
			if (local82 < 1) {
				return false;
			}
			Static482.anInt8391 = Static298.anIntArray221[local82 - 1];
			Static493.anInt8491 = Static104.anIntArray97[local82 - 1];
			Static352.aBoolean479 = false;
			Static639.method8670();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(IIIII)Lclient!op;")
	public static Class275 method5395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(40) long local40 = 0xFFFFL << 16 & (long) arg1 << 16 | ((long) arg2 & 0xFFFFL) << 48 | 0xFFFFL << 32 & (long) arg0 << 32 | (long) arg3 & 0xFFFFL;
		@Pc(46) Class275 local46 = (Class275) Static190.aClass338_16.method8049(local40);
		if (local46 == null) {
			local46 = Static103.aClass114_1.method2786(arg0, Static102.aClass126_1, arg2, arg1, arg3);
			Static190.aClass338_16.method8044(local40, local46);
		}
		return local46;
	}

	@OriginalMember(owner = "client!lla", name = "g", descriptor = "(B)V")
	public static void method5396() {
		Static384.aClass338_36.method8051();
	}

	@OriginalMember(owner = "client!lla", name = "j", descriptor = "(I)V")
	public static void method5397() {
		for (@Pc(7) int local7 = 0; local7 < Static458.anInt8069; local7++) {
			Static345.aClass79Array1[local7] = null;
		}
		if (-1 != -1) {
			aClass221_104 = null;
		}
		Static458.anInt8069 = 0;
		@Pc(38) int local38;
		@Pc(42) int local42;
		for (@Pc(34) int local34 = 0; local34 < Static241.anInt4521; local34++) {
			for (local38 = 0; local38 < Static509.anInt8656; local38++) {
				for (local42 = 0; local42 < Static164.anInt3059; local42++) {
					@Pc(52) Class262 local52 = Static584.aClass262ArrayArrayArray2[local34][local42][local38];
					if (local52 != null) {
						if (local52.aShort99 > 0) {
							local52.aShort99 = (short) (local52.aShort99 * -1);
						}
						if (local52.aShort100 > 0) {
							local52.aShort100 = (short) (local52.aShort100 * -1);
						}
					}
				}
			}
		}
		for (local38 = 0; local38 < Static241.anInt4521; local38++) {
			for (local42 = 0; local42 < Static509.anInt8656; local42++) {
				for (@Pc(120) int local120 = 0; local120 < Static164.anInt3059; local120++) {
					@Pc(130) Class262 local130 = Static584.aClass262ArrayArrayArray2[local38][local120][local42];
					if (local130 != null) {
						@Pc(156) boolean local156 = Static584.aClass262ArrayArrayArray2[0][local120][local42] != null && Static584.aClass262ArrayArrayArray2[0][local120][local42].aClass262_1 != null;
						@Pc(164) int local164;
						@Pc(166) int local166;
						@Pc(180) Class262 local180;
						@Pc(188) int local188;
						@Pc(375) int local375;
						@Pc(390) int local390;
						@Pc(398) int local398;
						@Pc(417) int local417;
						@Pc(425) int local425;
						@Pc(429) int local429;
						@Pc(433) int local433;
						@Pc(439) int local439;
						@Pc(477) int local477;
						@Pc(481) int local481;
						if (local130.aShort99 < 0) {
							local164 = local42;
							local166 = local42;
							local180 = Static584.aClass262ArrayArrayArray2[local38][local120][local42 - 1];
							local188 = Static167.aClass313Array1[local38].method9095(local42, local120);
							while (local164 > 0 && local180 != null && local180.aShort99 < 0 && local130.aShort99 == local180.aShort99 && local130.aShort98 == local180.aShort98 && Static167.aClass313Array1[local38].method9095(local164 - 1, local120) == local188 && (local164 - 1 <= 0 || local188 == Static167.aClass313Array1[local38].method9095(local164 - 2, local120))) {
								local164--;
								local180 = Static584.aClass262ArrayArrayArray2[local38][local120][local164 - 1];
							}
							for (local180 = Static584.aClass262ArrayArrayArray2[local38][local120][local42 + 1]; local166 < Static164.anInt3059 && local180 != null && local180.aShort99 < 0 && local130.aShort99 == local180.aShort99 && local180.aShort98 == local130.aShort98 && local188 == Static167.aClass313Array1[local38].method9095(local166 + 1, local120) && (local166 + 1 >= Static164.anInt3059 || local188 == Static167.aClass313Array1[local38].method9095(local166 + 2, local120)); local180 = Static584.aClass262ArrayArrayArray2[local38][local120][local166 + 1]) {
								local166++;
							}
							local375 = local38 + 1 - local38;
							local390 = Static167.aClass313Array1[local156 ? local38 + 1 : local38].method9095(local164, local120);
							local398 = local390 + local375 * local130.aShort99;
							local417 = Static167.aClass313Array1[local156 ? local38 + 1 : local38].method9095(local166 + 1, local120);
							local425 = local417 + local130.aShort99 * local375;
							local429 = local120 << Static394.anInt7067;
							local433 = local164 << Static394.anInt7067;
							local439 = Static495.anInt8508 + (local166 << Static394.anInt7067);
							Static345.aClass79Array1[Static458.anInt8069++] = new Class79(1, local38, local429 + local130.aShort98, local429 + local130.aShort98, local130.aShort98 + local429, local130.aShort98 + local429, local390, local417, local425, local398, local433, local439, local439, local433);
							for (local477 = local38; local477 <= local38; local477++) {
								for (local481 = local164; local481 <= local166; local481++) {
									Static584.aClass262ArrayArrayArray2[local477][local120][local481].aShort99 = (short) (Static584.aClass262ArrayArrayArray2[local477][local120][local481].aShort99 * -1);
								}
							}
						}
						if (local130.aShort100 < 0) {
							local164 = local120;
							local166 = local120;
							local180 = Static584.aClass262ArrayArrayArray2[local38][local120 - 1][local42];
							local188 = Static167.aClass313Array1[local38].method9095(local42, local120);
							while (local164 > 0 && local180 != null && local180.aShort100 < 0 && local180.aShort100 == local130.aShort100 && local130.aShort101 == local180.aShort101 && local188 == Static167.aClass313Array1[local38].method9095(local42, local164 - 1) && (local164 - 1 <= 0 || local188 == Static167.aClass313Array1[local38].method9095(local42, local164 - 2))) {
								local164--;
								local180 = Static584.aClass262ArrayArrayArray2[local38][local164 - 1][local42];
							}
							for (local180 = Static584.aClass262ArrayArrayArray2[local38][local120 + 1][local42]; Static509.anInt8656 > local166 && local180 != null && local180.aShort100 < 0 && local180.aShort100 == local130.aShort100 && local180.aShort101 == local130.aShort101 && Static167.aClass313Array1[local38].method9095(local42, local166 + 1) == local188 && (Static509.anInt8656 <= local166 + 1 || Static167.aClass313Array1[local38].method9095(local42, local166 + 2) == local188); local180 = Static584.aClass262ArrayArrayArray2[local38][local166 + 1][local42]) {
								local166++;
							}
							local375 = local38 + 1 - local38;
							local390 = Static167.aClass313Array1[local156 ? local38 + 1 : local38].method9095(local42, local164);
							local398 = local390 + local130.aShort100 * local375;
							local417 = Static167.aClass313Array1[local156 ? local38 + 1 : local38].method9095(local42, local166 + 1);
							local425 = local130.aShort100 * local375 + local417;
							local429 = local164 << Static394.anInt7067;
							local433 = (local166 << Static394.anInt7067) + Static495.anInt8508;
							local439 = local42 << Static394.anInt7067;
							Static345.aClass79Array1[Static458.anInt8069++] = new Class79(2, local38, local429, local433, local433, local429, local390, local417, local425, local398, local439 + local130.aShort101, local130.aShort101 + local439, local130.aShort101 + local439, local130.aShort101 + local439);
							for (local477 = local38; local477 <= local38; local477++) {
								for (local481 = local164; local481 <= local166; local481++) {
									Static584.aClass262ArrayArrayArray2[local477][local481][local42].aShort100 = (short) (Static584.aClass262ArrayArrayArray2[local477][local481][local42].aShort100 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static522.aBoolean658 = true;
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(IIIZI)V")
	public static void method5400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(14) int local14 = 0; local14 < Static583.anInt9536; local14++) {
			@Pc(20) Rectangle local20 = Class320.aRectangleArray2[local14];
			if (arg0 < local20.width + local20.x && arg2 + arg0 > local20.x && arg3 < local20.y + local20.height && local20.y < arg3 + arg1) {
				Static565.aBooleanArray24[local14] = true;
			}
		}
		Static30.method402(arg3, arg2 + arg0, arg0, arg1 + arg3);
	}
}
