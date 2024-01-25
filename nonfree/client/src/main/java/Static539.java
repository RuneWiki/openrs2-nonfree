import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tb", name = "E", descriptor = "I")
	public static int anInt9345;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_102 = new Class185(37, -1);

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "[I")
	public static final int[] anIntArray486 = new int[4];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!oi;II)V")
	public static void method7624(@OriginalArg(0) int arg0, @OriginalArg(2) Class9_Sub4_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class303 local9 = arg1.method3625();
		@Pc(23) int local23 = arg1.anInt4343 - arg1.aClass332_7.anInt9691 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg1.anInt4335 > 25) {
				if (arg3 < 0 && local9.anInt8956 != -1) {
					arg1.aBoolean349 = false;
					arg1.anInt4312 = local9.anInt8956;
				} else if (arg3 <= 0 || local9.anInt8968 == -1) {
					arg1.anInt4312 = local9.anInt8979;
				} else {
					arg1.anInt4312 = local9.anInt8968;
				}
				arg1.aBoolean349 = false;
			} else if (!arg1.aBoolean349 || !local9.method7367(arg1.anInt4312)) {
				arg1.anInt4312 = local9.method7365();
				arg1.aBoolean349 = arg1.anInt4312 != -1;
			}
		} else if (arg1.anInt4293 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(286) int local286 = Static69.anIntArray75[arg0] - arg1.aClass332_7.anInt9691 & 0x3FFF;
			if (arg2 == 2 && local9.anInt8969 != -1) {
				if (local286 > 2048 && local286 <= 6144 && local9.anInt8981 != -1) {
					arg1.anInt4312 = local9.anInt8981;
				} else if (local286 >= 10240 && local286 < 14336 && local9.anInt8938 != -1) {
					arg1.anInt4312 = local9.anInt8938;
				} else if (local286 <= 6144 || local286 >= 10240 || local9.anInt8943 == -1) {
					arg1.anInt4312 = local9.anInt8969;
				} else {
					arg1.anInt4312 = local9.anInt8943;
				}
			} else if (arg2 == 0 && local9.anInt8948 != -1) {
				if (local286 > 2048 && local286 <= 6144 && local9.anInt8982 != -1) {
					arg1.anInt4312 = local9.anInt8982;
				} else if (local286 >= 10240 && local286 < 14336 && local9.anInt8957 != -1) {
					arg1.anInt4312 = local9.anInt8957;
				} else if (local286 <= 6144 || local286 >= 10240 || local9.anInt8976 == -1) {
					arg1.anInt4312 = local9.anInt8948;
				} else {
					arg1.anInt4312 = local9.anInt8976;
				}
			} else if (local286 > 2048 && local286 <= 6144 && local9.anInt8952 != -1) {
				arg1.anInt4312 = local9.anInt8952;
			} else if (local286 >= 10240 && local286 < 14336 && local9.anInt8940 != -1) {
				arg1.anInt4312 = local9.anInt8940;
			} else if (local286 <= 6144 || local286 >= 10240 || local9.anInt8946 == -1) {
				arg1.anInt4312 = local9.anInt8979;
			} else {
				arg1.anInt4312 = local9.anInt8946;
			}
			arg1.aBoolean349 = false;
		} else if (local23 == 0 && arg1.anInt4335 <= 25) {
			if (arg2 == 2 && local9.anInt8969 != -1) {
				arg1.anInt4312 = local9.anInt8969;
			} else if (arg2 == 0 && local9.anInt8948 != -1) {
				arg1.anInt4312 = local9.anInt8948;
			} else {
				arg1.anInt4312 = local9.anInt8979;
			}
			arg1.aBoolean349 = false;
		} else {
			if (arg2 == 2 && local9.anInt8969 != -1) {
				if (arg3 < 0 && local9.anInt8964 != -1) {
					arg1.anInt4312 = local9.anInt8964;
				} else if (arg3 <= 0 || local9.anInt8950 == -1) {
					arg1.anInt4312 = local9.anInt8969;
				} else {
					arg1.anInt4312 = local9.anInt8950;
				}
			} else if (arg2 == 0 && local9.anInt8948 != -1) {
				if (arg3 < 0 && local9.anInt8984 != -1) {
					arg1.anInt4312 = local9.anInt8984;
				} else if (arg3 <= 0 || local9.anInt8983 == -1) {
					arg1.anInt4312 = local9.anInt8948;
				} else {
					arg1.anInt4312 = local9.anInt8983;
				}
			} else if (arg3 < 0 && local9.anInt8958 != -1) {
				arg1.anInt4312 = local9.anInt8958;
			} else if (arg3 <= 0 || local9.anInt8949 == -1) {
				arg1.anInt4312 = local9.anInt8979;
			} else {
				arg1.anInt4312 = local9.anInt8949;
			}
			arg1.aBoolean349 = false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method7625() {
		Static507.method7291();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)Z")
	public static boolean method7627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}
}
