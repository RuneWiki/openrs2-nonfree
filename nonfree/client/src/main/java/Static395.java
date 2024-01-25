import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt6580;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!uv;")
	public static Class247 aClass247_2;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!mg;")
	public static Class160 aClass160_76;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public static int anInt6582;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "[[B")
	public static final byte[][] aByteArrayArray50 = new byte[250][];

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_124 = new Class142(4, 1, 1, 1);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILclient!co;II)V")
	public static void method5210(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class156 local9 = arg1.method4925();
		@Pc(23) int local23 = arg1.anInt6159 - arg1.aClass266_7.anInt7236 & 0x3FFF;
		if (arg3 == -1) {
			if (local23 != 0 || arg1.anInt6195 > 25) {
				arg1.aBoolean429 = false;
				if (arg0 < 0 && local9.anInt4460 != -1) {
					arg1.anInt6177 = local9.anInt4460;
				} else if (arg0 <= 0 || local9.anInt4456 == -1) {
					arg1.anInt6177 = local9.anInt4458;
				} else {
					arg1.anInt6177 = local9.anInt4456;
				}
			} else if (!arg1.aBoolean429 || !local9.method3602(arg1.anInt6177)) {
				arg1.anInt6177 = local9.method3603();
				arg1.aBoolean429 = arg1.anInt6177 != -1;
			}
		} else if (arg1.anInt6167 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(199) int local199 = Static419.anIntArray596[arg2] - arg1.aClass266_7.anInt7236 & 0x3FFF;
			arg1.aBoolean429 = false;
			if (arg3 == 2 && local9.anInt4438 != -1) {
				if (local199 > 2048 && local199 <= 6144 && local9.anInt4441 != -1) {
					arg1.anInt6177 = local9.anInt4441;
				} else if (local199 >= 10240 && local199 < 14336 && local9.anInt4433 != -1) {
					arg1.anInt6177 = local9.anInt4433;
				} else if (local199 <= 6144 || local199 >= 10240 || local9.anInt4469 == -1) {
					arg1.anInt6177 = local9.anInt4438;
				} else {
					arg1.anInt6177 = local9.anInt4469;
				}
			} else if (arg3 == 0 && local9.anInt4454 != -1) {
				if (local199 > 2048 && local199 <= 6144 && local9.anInt4449 != -1) {
					arg1.anInt6177 = local9.anInt4449;
				} else if (local199 >= 10240 && local199 < 14336 && local9.anInt4470 != -1) {
					arg1.anInt6177 = local9.anInt4470;
				} else if (local199 <= 6144 || local199 >= 10240 || local9.anInt4452 == -1) {
					arg1.anInt6177 = local9.anInt4454;
				} else {
					arg1.anInt6177 = local9.anInt4452;
				}
			} else if (local199 > 2048 && local199 <= 6144 && local9.anInt4474 != -1) {
				arg1.anInt6177 = local9.anInt4474;
			} else if (local199 >= 10240 && local199 < 14336 && local9.anInt4459 != -1) {
				arg1.anInt6177 = local9.anInt4459;
			} else if (local199 <= 6144 || local199 >= 10240 || local9.anInt4437 == -1) {
				arg1.anInt6177 = local9.anInt4458;
			} else {
				arg1.anInt6177 = local9.anInt4437;
			}
		} else if (local23 == 0 && arg1.anInt6195 <= 25) {
			if (arg3 == 2 && local9.anInt4438 != -1) {
				arg1.anInt6177 = local9.anInt4438;
			} else if (arg3 == 0 && local9.anInt4454 != -1) {
				arg1.anInt6177 = local9.anInt4454;
			} else {
				arg1.anInt6177 = local9.anInt4458;
			}
			arg1.aBoolean429 = false;
		} else {
			arg1.aBoolean429 = false;
			if (arg3 == 2 && local9.anInt4438 != -1) {
				if (arg0 < 0 && local9.anInt4445 != -1) {
					arg1.anInt6177 = local9.anInt4445;
				} else if (arg0 <= 0 || local9.anInt4468 == -1) {
					arg1.anInt6177 = local9.anInt4438;
				} else {
					arg1.anInt6177 = local9.anInt4468;
				}
			} else if (arg3 == 0 && local9.anInt4454 != -1) {
				if (arg0 < 0 && local9.anInt4453 != -1) {
					arg1.anInt6177 = local9.anInt4453;
				} else if (arg0 <= 0 || local9.anInt4473 == -1) {
					arg1.anInt6177 = local9.anInt4454;
				} else {
					arg1.anInt6177 = local9.anInt4473;
				}
			} else if (arg0 < 0 && local9.anInt4443 != -1) {
				arg1.anInt6177 = local9.anInt4443;
			} else if (arg0 <= 0 || local9.anInt4434 == -1) {
				arg1.anInt6177 = local9.anInt4458;
			} else {
				arg1.anInt6177 = local9.anInt4434;
			}
		}
	}
}
