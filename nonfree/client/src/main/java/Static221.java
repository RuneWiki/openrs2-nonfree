import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
	public static int anInt4282;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	public static volatile int anInt4280 = 0;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!ll;")
	public static Class114 aClass114_27 = new Class114();

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString262 = null;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)V")
	public static void method3571(@OriginalArg(1) int arg0) {
		Static138.method2063();
		Static255.method4033();
		@Pc(20) int local20 = Static58.method935(arg0).anInt2191;
		if (local20 == 0) {
			return;
		}
		@Pc(27) int local27 = Static2.anIntArray2[arg0];
		if (local20 == 9) {
			Static308.anInt5939 = local27;
		}
		if (local20 == 5) {
			Static107.anInt5401 = local27;
		}
		if (local20 == 6) {
			Static72.anInt1599 = local27;
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(IIIIII)V")
	public static void method3573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3;
		@Pc(15) int local15;
		for (local3 = arg3; local3 <= arg3 + arg4; local3++) {
			for (local15 = arg0; local15 <= arg0 + arg2; local15++) {
				if (local15 >= 0 && local15 < 104 && local3 >= 0 && local3 < 104) {
					Static206.aByteArrayArrayArray18[arg1][local15][local3] = 127;
				}
			}
		}
		for (local3 = arg3; local3 < arg4 + arg3; local3++) {
			for (local15 = arg0; local15 < arg2 + arg0; local15++) {
				if (local15 >= 0 && local15 < 104 && local3 >= 0 && local3 < 104) {
					Static243.anIntArrayArrayArray13[arg1][local15][local3] = arg1 > 0 ? Static243.anIntArrayArrayArray13[arg1 - 1][local15][local3] : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < 104) {
			for (local3 = arg3 + 1; local3 < arg3 + arg4; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static243.anIntArrayArrayArray13[arg1][arg0][local3] = Static243.anIntArrayArrayArray13[arg1][arg0 - 1][local3];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local3 = arg0 + 1; local3 < arg0 + arg2; local3++) {
				if (local3 >= 0 && local3 < 104) {
					Static243.anIntArrayArrayArray13[arg1][local3][arg3] = Static243.anIntArrayArrayArray13[arg1][local3][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg1 == 0) {
			if (arg0 > 0 && Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3] != 0) {
				Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3];
			} else if (arg3 > 0 && Static243.anIntArrayArrayArray13[arg1][arg0][arg3 - 1] != 0) {
				Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0][arg3 - 1];
			} else if (arg0 > 0 && arg3 > 0 && Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3 - 1] != 0) {
				Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3 - 1];
			}
		} else if (arg0 > 0 && Static243.anIntArrayArrayArray13[arg1 - 1][arg0 - 1][arg3] != Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3]) {
			Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3];
		} else if (arg3 > 0 && Static243.anIntArrayArrayArray13[arg1 - 1][arg0][arg3 - 1] != Static243.anIntArrayArrayArray13[arg1][arg0][arg3 - 1]) {
			Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0][arg3 - 1];
		} else if (arg0 > 0 && arg3 > 0 && Static243.anIntArrayArrayArray13[arg1 - 1][arg0 - 1][arg3 - 1] != Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3 - 1]) {
			Static243.anIntArrayArrayArray13[arg1][arg0][arg3] = Static243.anIntArrayArrayArray13[arg1][arg0 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZILclient!fd;)Ljava/lang/String;")
	public static String method3574(@OriginalArg(2) Class4_Sub10 arg0) {
		try {
			@Pc(12) int local12 = arg0.method4616();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local12];
			arg0.anInt5713 += Static62.aClass131_1.method3246(0, arg0.anInt5713, arg0.aByteArray71, local24, local12);
			return Static277.method4308(0, local24, local12);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method3575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return local7 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
