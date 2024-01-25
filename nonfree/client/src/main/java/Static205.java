import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	public static int anInt3959;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_8 = new Class180(6, -1);

	@OriginalMember(owner = "client!kf", name = "j", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_33 = new Class129(5);

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "[I")
	public static final int[] anIntArray261 = new int[2];

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILclient!it;)V")
	public static void method3170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class4_Sub2_Sub2 arg3) {
		@Pc(14) Class12 local14 = arg3.method5131();
		@Pc(24) int local24 = arg3.anInt6497 - arg3.aClass157_7.anInt4471 & 0x3FFF;
		if (arg0 == -1) {
			if (local24 != 0 || arg3.anInt6466 > 25) {
				arg3.aBoolean561 = false;
				if (arg1 < 0 && local14.anInt331 != -1) {
					arg3.anInt6458 = local14.anInt331;
				} else if (arg1 <= 0 || local14.anInt342 == -1) {
					arg3.anInt6458 = local14.anInt346;
				} else {
					arg3.anInt6458 = local14.anInt342;
				}
			} else if (!arg3.aBoolean561 || !local14.method225(arg3.anInt6458)) {
				arg3.anInt6458 = local14.method223();
				arg3.aBoolean561 = arg3.anInt6458 != -1;
			}
		} else if (arg3.anInt6481 != -1 && (local24 >= 10240 || local24 <= 2048)) {
			@Pc(270) int local270 = Static253.anIntArray325[arg2] - arg3.aClass157_7.anInt4471 & 0x3FFF;
			if (arg0 == 2 && local14.anInt334 != -1) {
				if (local270 > 2048 && local270 <= 6144 && local14.anInt336 != -1) {
					arg3.anInt6458 = local14.anInt336;
				} else if (local270 >= 10240 && local270 < 14336 && local14.anInt361 != -1) {
					arg3.anInt6458 = local14.anInt361;
				} else if (local270 <= 6144 || local270 >= 10240 || local14.anInt330 == -1) {
					arg3.anInt6458 = local14.anInt334;
				} else {
					arg3.anInt6458 = local14.anInt330;
				}
			} else if (arg0 == 0 && local14.anInt335 != -1) {
				if (local270 > 2048 && local270 <= 6144 && local14.anInt351 != -1) {
					arg3.anInt6458 = local14.anInt351;
				} else if (local270 >= 10240 && local270 < 14336 && local14.anInt322 != -1) {
					arg3.anInt6458 = local14.anInt322;
				} else if (local270 <= 6144 || local270 >= 10240 || local14.anInt364 == -1) {
					arg3.anInt6458 = local14.anInt335;
				} else {
					arg3.anInt6458 = local14.anInt364;
				}
			} else if (local270 > 2048 && local270 <= 6144 && local14.anInt352 != -1) {
				arg3.anInt6458 = local14.anInt352;
			} else if (local270 >= 10240 && local270 < 14336 && local14.anInt363 != -1) {
				arg3.anInt6458 = local14.anInt363;
			} else if (local270 <= 6144 || local270 >= 10240 || local14.anInt360 == -1) {
				arg3.anInt6458 = local14.anInt346;
			} else {
				arg3.anInt6458 = local14.anInt360;
			}
			arg3.aBoolean561 = false;
		} else if (local24 == 0 && arg3.anInt6466 <= 25) {
			arg3.aBoolean561 = false;
			if (arg0 == 2 && local14.anInt334 != -1) {
				arg3.anInt6458 = local14.anInt334;
			} else if (arg0 == 0 && local14.anInt335 != -1) {
				arg3.anInt6458 = local14.anInt335;
			} else {
				arg3.anInt6458 = local14.anInt346;
			}
		} else {
			arg3.aBoolean561 = false;
			if (arg0 == 2 && local14.anInt334 != -1) {
				if (arg1 < 0 && local14.anInt340 != -1) {
					arg3.anInt6458 = local14.anInt340;
				} else if (arg1 <= 0 || local14.anInt327 == -1) {
					arg3.anInt6458 = local14.anInt334;
				} else {
					arg3.anInt6458 = local14.anInt327;
				}
			} else if (arg0 == 0 && local14.anInt335 != -1) {
				if (arg1 < 0 && local14.anInt343 != -1) {
					arg3.anInt6458 = local14.anInt343;
				} else if (arg1 <= 0 || local14.anInt324 == -1) {
					arg3.anInt6458 = local14.anInt335;
				} else {
					arg3.anInt6458 = local14.anInt324;
				}
			} else if (arg1 < 0 && local14.anInt362 != -1) {
				arg3.anInt6458 = local14.anInt362;
			} else if (arg1 <= 0 || local14.anInt328 == -1) {
				arg3.anInt6458 = local14.anInt346;
			} else {
				arg3.anInt6458 = local14.anInt328;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method3172(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}
}
