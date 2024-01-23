import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!km", name = "Z", descriptor = "I")
	public static int anInt3461;

	@OriginalMember(owner = "client!km", name = "T", descriptor = "Lclient!sf;")
	public static Class157 aClass157_28 = new Class157(500);

	@OriginalMember(owner = "client!km", name = "ab", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!km", name = "bb", descriptor = "I")
	public static int anInt3463 = 1;

	@OriginalMember(owner = "client!km", name = "cb", descriptor = "Z")
	public static boolean aBoolean236 = true;

	@OriginalMember(owner = "client!km", name = "db", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!km", name = "eb", descriptor = "[I")
	public static int[] anIntArray350 = new int[2];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V")
	public static void method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13;
		@Pc(24) int local24;
		for (local13 = arg1; local13 <= arg1 + arg3; local13++) {
			for (local24 = arg0; local24 <= arg0 + arg4; local24++) {
				if (local24 >= 0 && local24 < 104 && local13 >= 0 && local13 < 104) {
					Static209.aByteArrayArrayArray18[arg2][local24][local13] = 127;
				}
			}
		}
		for (local13 = arg1; local13 < arg1 + arg3; local13++) {
			for (local24 = arg0; local24 < arg0 + arg4; local24++) {
				if (local24 >= 0 && local24 < 104 && local13 >= 0 && local13 < 104) {
					Static9.anIntArrayArrayArray7[arg2][local24][local13] = arg2 > 0 ? Static9.anIntArrayArrayArray7[arg2 - 1][local24][local13] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local13 = arg1 + 1; local13 < arg3 + arg1; local13++) {
				if (local13 >= 0 && local13 < 104) {
					Static9.anIntArrayArrayArray7[arg2][arg0][local13] = Static9.anIntArrayArrayArray7[arg2][arg0 - 1][local13];
				}
			}
		}
		if (arg1 > 0 && arg1 < 104) {
			for (local13 = arg0 + 1; local13 < arg4 + arg0; local13++) {
				if (local13 >= 0 && local13 < 104) {
					Static9.anIntArrayArrayArray7[arg2][local13][arg1] = Static9.anIntArrayArrayArray7[arg2][local13][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || arg0 >= 104 || arg1 >= 104) {
			return;
		}
		if (arg2 == 0) {
			if (arg0 > 0 && Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1] != 0) {
				Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1];
			} else if (arg1 > 0 && Static9.anIntArrayArrayArray7[arg2][arg0][arg1 - 1] != 0) {
				Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0][arg1 - 1];
			} else if (arg0 > 0 && arg1 > 0 && Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1] != 0) {
				Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1];
			}
		} else if (arg0 > 0 && Static9.anIntArrayArrayArray7[arg2 - 1][arg0 - 1][arg1] != Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1]) {
			Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1];
		} else if (arg1 > 0 && Static9.anIntArrayArrayArray7[arg2][arg0][arg1 - 1] != Static9.anIntArrayArrayArray7[arg2 - 1][arg0][arg1 - 1]) {
			Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0][arg1 - 1];
		} else if (arg0 > 0 && arg1 > 0 && Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1] != Static9.anIntArrayArrayArray7[arg2 - 1][arg0 - 1][arg1 - 1]) {
			Static9.anIntArrayArrayArray7[arg2][arg0][arg1] = Static9.anIntArrayArrayArray7[arg2][arg0 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!km", name = "h", descriptor = "(I)V")
	public static void method2844() {
		if (Static142.anInt3132 > 0) {
			Static11.method197();
		} else {
			Static305.aClass34_4 = Static253.aClass34_3;
			Static253.aClass34_3 = null;
			Static305.method4624(40);
		}
	}
}
