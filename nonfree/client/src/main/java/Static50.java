import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "[I")
	public static int[] anIntArray28 = new int[2];

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "[[B")
	public static final byte[][] aByteArrayArray4 = new byte[1000][];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ec;IIIB)V")
	public static void method664(@OriginalArg(0) Class1_Sub4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class316 local16 = arg0.method6921();
		@Pc(26) int local26 = arg0.anInt8364 - arg0.aClass229_7.anInt6650 & 0x3FFF;
		if (arg1 == -1) {
			if (local26 != 0 || arg0.anInt8407 > 25) {
				if (arg2 < 0 && local16.anInt9160 != -1) {
					arg0.anInt8409 = local16.anInt9160;
					arg0.aBoolean589 = false;
				} else if (arg2 <= 0 || local16.anInt9145 == -1) {
					arg0.anInt8409 = local16.anInt9128;
				} else {
					arg0.anInt8409 = local16.anInt9145;
				}
				arg0.aBoolean589 = false;
			} else if (!arg0.aBoolean589 || !local16.method7457(arg0.anInt8409)) {
				arg0.anInt8409 = local16.method7462();
				arg0.aBoolean589 = arg0.anInt8409 != -1;
			}
		} else if (arg0.anInt8405 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(282) int local282 = Static178.anIntArray180[arg3] - arg0.aClass229_7.anInt6650 & 0x3FFF;
			arg0.aBoolean589 = false;
			if (arg1 == 2 && local16.anInt9146 != -1) {
				if (local282 > 2048 && local282 <= 6144 && local16.anInt9157 != -1) {
					arg0.anInt8409 = local16.anInt9157;
				} else if (local282 >= 10240 && local282 < 14336 && local16.anInt9121 != -1) {
					arg0.anInt8409 = local16.anInt9121;
				} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt9142 == -1) {
					arg0.anInt8409 = local16.anInt9146;
				} else {
					arg0.anInt8409 = local16.anInt9142;
				}
			} else if (arg1 == 0 && local16.anInt9149 != -1) {
				if (local282 > 2048 && local282 <= 6144 && local16.anInt9162 != -1) {
					arg0.anInt8409 = local16.anInt9162;
				} else if (local282 >= 10240 && local282 < 14336 && local16.anInt9138 != -1) {
					arg0.anInt8409 = local16.anInt9138;
				} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt9151 == -1) {
					arg0.anInt8409 = local16.anInt9149;
				} else {
					arg0.anInt8409 = local16.anInt9151;
				}
			} else if (local282 > 2048 && local282 <= 6144 && local16.anInt9119 != -1) {
				arg0.anInt8409 = local16.anInt9119;
			} else if (local282 >= 10240 && local282 < 14336 && local16.anInt9124 != -1) {
				arg0.anInt8409 = local16.anInt9124;
			} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt9155 == -1) {
				arg0.anInt8409 = local16.anInt9128;
			} else {
				arg0.anInt8409 = local16.anInt9155;
			}
		} else if (local26 == 0 && arg0.anInt8407 <= 25) {
			if (arg1 == 2 && local16.anInt9146 != -1) {
				arg0.anInt8409 = local16.anInt9146;
			} else if (arg1 == 0 && local16.anInt9149 != -1) {
				arg0.anInt8409 = local16.anInt9149;
			} else {
				arg0.anInt8409 = local16.anInt9128;
			}
			arg0.aBoolean589 = false;
		} else {
			arg0.aBoolean589 = false;
			if (arg1 == 2 && local16.anInt9146 != -1) {
				if (arg2 < 0 && local16.anInt9152 != -1) {
					arg0.anInt8409 = local16.anInt9152;
				} else if (arg2 <= 0 || local16.anInt9158 == -1) {
					arg0.anInt8409 = local16.anInt9146;
				} else {
					arg0.anInt8409 = local16.anInt9158;
				}
			} else if (arg1 == 0 && local16.anInt9149 != -1) {
				if (arg2 < 0 && local16.anInt9156 != -1) {
					arg0.anInt8409 = local16.anInt9156;
				} else if (arg2 <= 0 || local16.anInt9131 == -1) {
					arg0.anInt8409 = local16.anInt9149;
				} else {
					arg0.anInt8409 = local16.anInt9131;
				}
			} else if (arg2 < 0 && local16.anInt9143 != -1) {
				arg0.anInt8409 = local16.anInt9143;
			} else if (arg2 <= 0 || local16.anInt9135 == -1) {
				arg0.anInt8409 = local16.anInt9128;
			} else {
				arg0.anInt8409 = local16.anInt9135;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)Lclient!se;")
	public static Class4_Sub5_Sub16 method666() {
		@Pc(16) Class4_Sub5_Sub16 local16 = (Class4_Sub5_Sub16) Static469.aClass18_6.method221();
		if (local16 != null) {
			local16.method8379();
			local16.method8015();
			return local16;
		}
		do {
			local16 = (Class4_Sub5_Sub16) Static482.aClass18_7.method221();
			if (local16 == null) {
				return null;
			}
			if (local16.method7131() > Static574.method8210()) {
				return null;
			}
			local16.method8379();
			local16.method8015();
		} while ((Long.MIN_VALUE & local16.aLong257) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(III)Z")
	public static boolean method667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static232.method3741(arg1, arg0) & Static264.method4446(arg1, arg0);
	}
}
