import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fi", name = "bd", descriptor = "I")
	public static int anInt2132;

	@OriginalMember(owner = "client!fi", name = "Pb", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_58 = new Class129(112, -1);

	@OriginalMember(owner = "client!fi", name = "Mc", descriptor = "[I")
	public static final int[] anIntArray112 = new int[6];

	@OriginalMember(owner = "client!fi", name = "Nc", descriptor = "[I")
	public static final int[] anIntArray113 = new int[1000];

	@OriginalMember(owner = "client!fi", name = "Wc", descriptor = "Z")
	public static boolean aBoolean152 = false;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	public static boolean method1679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static452.aByteArrayArrayArray16[1][arg1][arg0] & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method1682(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static419.anInt6980 = 7;
		Static92.anInt1592 = 0x1 << Static419.anInt6980;
		Static301.anInt4709 = Static92.anInt1592 >> 1;
		Static371.anInt6075 = (int) Math.sqrt((double) (Static301.anInt4709 * Static301.anInt4709 + Static301.anInt4709 * Static301.anInt4709));
		Static134.anInt2381 = Static92.anInt1592 >> 2;
		Static124.anInt2196 = Static92.anInt1592;
		Static439.anInt7318 = arg0;
		Static459.anInt4775 = arg1;
		Static70.anInt1271 = arg2;
		Static107.aClass258ArrayArrayArray2 = new Class258[4][Static439.anInt7318][Static459.anInt4775];
		Static110.aClass125Array1 = new Class125[4];
		if (arg3) {
			Static419.anIntArrayArray62 = new int[Static439.anInt7318][Static459.anInt4775];
			Static145.aByteArrayArray5 = new byte[Static439.anInt7318][Static459.anInt4775];
			Static130.aShortArrayArray6 = new short[Static439.anInt7318][Static459.anInt4775];
			Static102.aClass258ArrayArrayArray1 = new Class258[1][Static439.anInt7318][Static459.anInt4775];
			Static408.aClass125Array2 = new Class125[1];
		} else {
			Static419.anIntArrayArray62 = null;
			Static145.aByteArrayArray5 = null;
			Static130.aShortArrayArray6 = null;
			Static102.aClass258ArrayArrayArray1 = null;
			Static408.aClass125Array2 = null;
		}
		if (arg4) {
			Static76.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static68.aClass111Array1 = new Class111[65535];
			Static381.aBooleanArray14 = new boolean[65535];
			Static70.anInt1276 = 0;
		} else {
			Static76.aLongArrayArrayArray1 = null;
			Static68.aClass111Array1 = null;
			Static381.aBooleanArray14 = null;
			Static70.anInt1276 = 0;
		}
		Static423.method5618(false);
		Static243.aClass247Array1 = new Class247[1000];
		Static188.anInt3158 = 0;
		Static323.aClass247Array2 = new Class247[1000];
		Static20.anInt423 = 0;
		Static239.anIntArrayArrayArray15 = new int[4][Static439.anInt7318 + 1][Static459.anInt4775 + 1];
		Static430.aClass2_Sub1Array3 = new Class2_Sub1[5000];
		Static371.anInt6082 = 0;
		Static309.aBooleanArrayArray6 = new boolean[Static70.anInt1271 + Static70.anInt1271 + 1][Static70.anInt1271 + Static70.anInt1271 + 1];
		Static37.aBooleanArrayArray1 = new boolean[Static70.anInt1271 + Static70.anInt1271 + 2][Static70.anInt1271 + Static70.anInt1271 + 2];
		Static449.aClass77_1 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIII)I")
	public static int method1693(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static410.aClass125Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(19) int local19 = arg3 >> 7;
			@Pc(23) int local23 = arg1 >> 7;
			if (arg2 < 0 || arg4 < 0 || Static433.anInt7210 - 1 < arg2 || arg4 > Static418.anInt6969 - 1) {
				return 0;
			} else if (local19 >= 1 && local23 >= 1 && local19 <= Static433.anInt7210 - 1 && local23 <= Static418.anInt6969 - 1) {
				@Pc(92) boolean local92 = (Static452.aByteArrayArrayArray16[1][arg3 >> 7][arg1 >> 7] & 0x2) != 0;
				@Pc(117) boolean local117;
				@Pc(133) boolean local133;
				if ((arg3 & 0x7F) == 0) {
					local117 = (Static452.aByteArrayArrayArray16[1][local19 - 1][arg1 >> 7] & 0x2) != 0;
					local133 = (Static452.aByteArrayArrayArray16[1][local19][arg1 >> 7] & 0x2) != 0;
					if (local133 != local117) {
						local92 = (Static452.aByteArrayArrayArray16[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x7F) == 0) {
					local117 = (Static452.aByteArrayArrayArray16[1][arg3 >> 7][local23 - 1] & 0x2) != 0;
					local133 = (Static452.aByteArrayArrayArray16[1][arg3 >> 7][local23] & 0x2) != 0;
					if (local133 != local117) {
						local92 = (Static452.aByteArrayArrayArray16[1][arg2][arg4] & 0x2) != 0;
					}
				}
				if (local92) {
					arg0++;
				}
				return Static410.aClass125Array3[arg0].ca(arg3, arg1);
			} else {
				return 0;
			}
		} else {
			return Static410.aClass125Array3[arg0].ca(arg3, arg1);
		}
	}
}
