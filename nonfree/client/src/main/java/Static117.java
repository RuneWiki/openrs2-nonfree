import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	public static int anInt2193;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt2189 = 0;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!p;")
	public static final Class11_Sub31 aClass11_Sub31_1 = new Class11_Sub31(0, 0);

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
	public static boolean aBoolean145 = true;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 < 128 || arg0 < 128 || Static24.anInt454 * 128 - 256 < arg3 || arg0 > Static240.anInt4832 * 128 - 256) {
			Static267.anIntArray414[0] = Static267.anIntArray414[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static168.method2721(arg3, Static322.anInt6250, arg0) - arg1;
		Static319.aClass61_5.method3665(arg2, 0, 0);
		Static107.aClass129_4.method4971(Static319.aClass61_5);
		Static107.aClass129_4.method4972(arg3, local51, arg0, Static267.anIntArray414);
		Static319.aClass61_5.method3665(-arg2, 0, 0);
		Static107.aClass129_4.method4971(Static319.aClass61_5);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)V")
	public static void method1776(@OriginalArg(1) int arg0) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(2, arg0);
		local13.method3864();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZ)Lclient!rc;")
	public static Class11_Sub4_Sub16 method1777(@OriginalArg(0) int arg0) {
		@Pc(23) Class11_Sub4_Sub16 local23 = (Class11_Sub4_Sub16) Static311.aClass142_3.method3874((long) arg0);
		if (local23 != null) {
			return local23;
		}
		@Pc(36) byte[] local36;
		if (arg0 < 32768) {
			local36 = Static258.aClass144_88.method3896(arg0, 1);
		} else {
			local36 = Static321.aClass144_102.method3896(arg0 & 0x7FFF, 1);
		}
		local23 = new Class11_Sub4_Sub16();
		if (local36 != null) {
			local23.method4597(new Class11_Sub25(local36));
		}
		if (arg0 >= 32768) {
			local23.method4604();
		}
		Static311.aClass142_3.method3870(local23, (long) arg0);
		return local23;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
	public static void method1778() {
		Static330.aClass26_57.method329(5);
		Static313.aClass26_56.method329(5);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static171.anIntArrayArrayArray11[arg0][local16][local20] == -Static212.anInt4350) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static108.aClass77Array2[arg0].method4122(arg1, arg3) + arg5;
			if (!Static153.method2460(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static153.method2460(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static153.method2460(local20, local151, local177)) {
				return false;
			} else if (Static153.method2460(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static259.method4515(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static153.method2460(local16 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg3) + arg5, local20 + 1) && Static153.method2460(local16 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg3) + arg5, local20 + 1) && Static153.method2460(local16 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static153.method2460(local16 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBII)V")
	public static void method1781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static346.method5618(true, local35);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Z")
	public static boolean method1782() {
		@Pc(13) Class11_Sub14 local13 = (Class11_Sub14) Static119.aClass16_21.aClass11_9.aClass11_252;
		if (local13 == null || local13 == Static119.aClass16_21.aClass11_9) {
			return false;
		} else {
			if (local13.anInt1765 >= 2000) {
				local13.anInt1765 -= 2000;
			}
			return local13.anInt1765 == 1002;
		}
	}
}
