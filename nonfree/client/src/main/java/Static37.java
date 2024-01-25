import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
	public static boolean aBoolean434;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!client;")
	public static client aClient2;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public static int anInt6455;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_60 = new Class198(256);

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
	public static int anInt6452 = 2;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public static int anInt6453 = 0;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
	public static final int[] anIntArray538 = new int[50];

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString240 = "Loading wordpack - ";

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIII)V")
	public static void method5457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg4; local3 < arg4 + arg3; local3++) {
			for (local7 = arg1; local7 < arg2 + arg1; local7++) {
				if (local7 >= 0 && local7 < Static162.anInt2152 && local3 >= 0 && local3 < Static122.anInt2632) {
					Static105.anIntArrayArrayArray2[arg0][local7][local3] = arg0 <= 0 ? 0 : Static105.anIntArrayArrayArray2[arg0 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg1 > 0 && Static162.anInt2152 > arg1) {
			for (local7 = arg4 + 1; local7 < arg3 + arg4; local7++) {
				if (local7 >= 0 && local7 < Static122.anInt2632) {
					Static105.anIntArrayArrayArray2[arg0][arg1][local7] = Static105.anIntArrayArrayArray2[arg0][arg1 - 1][local7];
				}
			}
		}
		if (arg4 > 0 && arg4 < Static122.anInt2632) {
			for (local7 = arg1 + 1; local7 < arg1 + arg2; local7++) {
				if (local7 >= 0 && Static162.anInt2152 > local7) {
					Static105.anIntArrayArrayArray2[arg0][local7][arg4] = Static105.anIntArrayArrayArray2[arg0][local7][arg4 - 1];
				}
			}
		}
		if (arg1 < 0 || arg4 < 0 || Static162.anInt2152 <= arg1 || arg4 >= Static122.anInt2632) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4] != Static105.anIntArrayArrayArray2[arg0 - 1][arg1 - 1][arg4]) {
				Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4];
				return;
			}
			if (arg4 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1][arg4 - 1] != Static105.anIntArrayArrayArray2[arg0 - 1][arg1][arg4 - 1]) {
				Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1][arg4 - 1];
				return;
			}
			if (arg1 > 0 && arg4 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1] != Static105.anIntArrayArrayArray2[arg0 - 1][arg1 - 1][arg4 - 1]) {
				Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4] != 0) {
			Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4];
			return;
		}
		if (arg4 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1][arg4 - 1] != 0) {
			Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1][arg4 - 1];
			return;
		}
		if (arg1 > 0 && arg4 > 0 && Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1] != 0) {
			Static105.anIntArrayArrayArray2[arg0][arg1][arg4] = Static105.anIntArrayArrayArray2[arg0][arg1 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5458(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static220.anInt4548; local11++) {
			if (arg0.equalsIgnoreCase(Static12.aStringArray1[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I")
	public static int method5459(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
		@Pc(23) int local23 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCF) >>> 2);
		@Pc(31) int local31 = local23 + (local23 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}
}
