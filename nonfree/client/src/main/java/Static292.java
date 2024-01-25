import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "Lclient!ks;")
	public static final Class182 aClass182_2 = new Class182(false);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "Lclient!ks;")
	public static Class182 aClass182_1 = aClass182_2;

	@OriginalMember(owner = "client!kga", name = "d", descriptor = "Z")
	public static boolean aBoolean464 = false;

	@OriginalMember(owner = "client!kga", name = "e", descriptor = "Lclient!ria;")
	public static final Class298 aClass298_5 = new Class298();

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_14 = new Class234(11, 0, 1, 2);

	@OriginalMember(owner = "client!kga", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIBLclient!kda;I)V")
	public static void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub3_Sub3 arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class311 local14 = arg2.method5200();
		@Pc(23) int local23 = arg2.anInt6076 - arg2.aClass343_7.anInt10249 & 0x3FFF;
		if (arg0 == -1) {
			if (local23 != 0 || arg2.anInt6048 > 25) {
				if (arg1 < 0 && local14.anInt9386 != -1) {
					arg2.aBoolean450 = false;
					arg2.anInt6064 = local14.anInt9386;
				} else if (arg1 <= 0 || local14.anInt9392 == -1) {
					arg2.anInt6064 = local14.anInt9416;
				} else {
					arg2.anInt6064 = local14.anInt9392;
				}
				arg2.aBoolean450 = false;
			} else if (!arg2.aBoolean450 || !local14.method7840(arg2.anInt6064)) {
				arg2.anInt6064 = local14.method7838();
				arg2.aBoolean450 = arg2.anInt6064 != -1;
			}
		} else if (arg2.anInt6070 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(216) int local216 = Static195.anIntArray227[arg3] - arg2.aClass343_7.anInt10249 & 0x3FFF;
			if (arg0 == 2 && local14.anInt9389 != -1) {
				if (local216 > 2048 && local216 <= 6144 && local14.anInt9414 != -1) {
					arg2.anInt6064 = local14.anInt9414;
				} else if (local216 >= 10240 && local216 < 14336 && local14.anInt9385 != -1) {
					arg2.anInt6064 = local14.anInt9385;
				} else if (local216 <= 6144 || local216 >= 10240 || local14.anInt9390 == -1) {
					arg2.anInt6064 = local14.anInt9389;
				} else {
					arg2.anInt6064 = local14.anInt9390;
				}
			} else if (arg0 == 0 && local14.anInt9406 != -1) {
				if (local216 > 2048 && local216 <= 6144 && local14.anInt9412 != -1) {
					arg2.anInt6064 = local14.anInt9412;
				} else if (local216 >= 10240 && local216 < 14336 && local14.anInt9422 != -1) {
					arg2.anInt6064 = local14.anInt9422;
				} else if (local216 <= 6144 || local216 >= 10240 || local14.anInt9394 == -1) {
					arg2.anInt6064 = local14.anInt9406;
				} else {
					arg2.anInt6064 = local14.anInt9394;
				}
			} else if (local216 > 2048 && local216 <= 6144 && local14.anInt9419 != -1) {
				arg2.anInt6064 = local14.anInt9419;
			} else if (local216 >= 10240 && local216 < 14336 && local14.anInt9404 != -1) {
				arg2.anInt6064 = local14.anInt9404;
			} else if (local216 <= 6144 || local216 >= 10240 || local14.anInt9405 == -1) {
				arg2.anInt6064 = local14.anInt9416;
			} else {
				arg2.anInt6064 = local14.anInt9405;
			}
			arg2.aBoolean450 = false;
		} else if (local23 == 0 && arg2.anInt6048 <= 25) {
			if (arg0 == 2 && local14.anInt9389 != -1) {
				arg2.anInt6064 = local14.anInt9389;
			} else if (arg0 == 0 && local14.anInt9406 != -1) {
				arg2.anInt6064 = local14.anInt9406;
			} else {
				arg2.anInt6064 = local14.anInt9416;
			}
			arg2.aBoolean450 = false;
		} else {
			if (arg0 == 2 && local14.anInt9389 != -1) {
				if (arg1 < 0 && local14.anInt9380 != -1) {
					arg2.anInt6064 = local14.anInt9380;
				} else if (arg1 <= 0 || local14.anInt9383 == -1) {
					arg2.anInt6064 = local14.anInt9389;
				} else {
					arg2.anInt6064 = local14.anInt9383;
				}
			} else if (arg0 == 0 && local14.anInt9406 != -1) {
				if (arg1 < 0 && local14.anInt9381 != -1) {
					arg2.anInt6064 = local14.anInt9381;
				} else if (arg1 <= 0 || local14.anInt9396 == -1) {
					arg2.anInt6064 = local14.anInt9406;
				} else {
					arg2.anInt6064 = local14.anInt9396;
				}
			} else if (arg1 < 0 && local14.anInt9401 != -1) {
				arg2.anInt6064 = local14.anInt9401;
			} else if (arg1 <= 0 || local14.anInt9418 == -1) {
				arg2.anInt6064 = local14.anInt9416;
			} else {
				arg2.anInt6064 = local14.anInt9418;
			}
			arg2.aBoolean450 = false;
		}
	}
}
