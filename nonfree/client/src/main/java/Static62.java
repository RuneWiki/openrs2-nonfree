import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
	public static int anInt1307;

	@OriginalMember(owner = "client!cu", name = "N", descriptor = "[Lclient!ig;")
	public static Class12[] aClass12Array4;

	@OriginalMember(owner = "client!cu", name = "O", descriptor = "Lclient!jg;")
	public static Class128 aClass128_2;

	@OriginalMember(owner = "client!cu", name = "F", descriptor = "Lclient!bd;")
	public static final Class23 aClass23_1 = Static16.method251();

	@OriginalMember(owner = "client!cu", name = "K", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!cu", name = "M", descriptor = "[I")
	public static final int[] anIntArray111 = new int[4];

	@OriginalMember(owner = "client!cu", name = "P", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[8];

	@OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
	public static int anInt1308 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZ)V")
	public static void method1175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static36.aFloat46 > Static36.aFloat47) {
			Static36.aFloat47 = (float) ((double) Static36.aFloat47 + (double) Static36.aFloat47 / 30.0D);
			if (Static36.aFloat46 < Static36.aFloat47) {
				Static36.aFloat47 = Static36.aFloat46;
			}
			Static380.method5244();
			Static36.anInt2237 = (int) Static36.aFloat47 >> 1;
			Static36.aByteArrayArrayArray2 = Static338.method4783(Static36.anInt2237);
		} else if (Static36.aFloat46 < Static36.aFloat47) {
			Static36.aFloat47 = (float) ((double) Static36.aFloat47 - (double) Static36.aFloat47 / 30.0D);
			if (Static36.aFloat47 < Static36.aFloat46) {
				Static36.aFloat47 = Static36.aFloat46;
			}
			Static380.method5244();
			Static36.anInt2237 = (int) Static36.aFloat47 >> 1;
			Static36.aByteArrayArrayArray2 = Static338.method4783(Static36.anInt2237);
		}
		if (Static212.anInt3671 != -1 && Static340.anInt5720 != -1) {
			@Pc(78) int local78 = Static212.anInt3671 - Static187.anInt3261;
			if (local78 < 2 || local78 > 2) {
				local78 /= 8;
			}
			@Pc(95) int local95 = Static340.anInt5720 - Static70.anInt1464;
			Static187.anInt3261 += local78;
			if (local95 < 2 || local95 > 2) {
				local95 /= 8;
			}
			if (local78 == 0 && local95 == 0) {
				Static340.anInt5720 = -1;
				Static212.anInt3671 = -1;
			}
			Static70.anInt1464 += local95;
			Static380.method5244();
		}
		if (Static71.anInt1487 <= 0) {
			Static18.anInt316 = -1;
			Static26.anInt2329 = -1;
		} else {
			Static119.anInt2070--;
			if (Static119.anInt2070 == 0) {
				Static119.anInt2070 = 100;
				Static71.anInt1487--;
			}
		}
		if (!Static93.aBoolean145 || Static200.aClass88_31 == null) {
			return;
		}
		for (@Pc(162) Class6_Sub31 local162 = (Class6_Sub31) Static200.aClass88_31.method1882(); local162 != null; local162 = (Class6_Sub31) Static200.aClass88_31.method1891()) {
			@Pc(171) Class94 local171 = Static36.aClass254_5.method5834(local162.aClass6_Sub24_1.anInt4802);
			if (local162.method4950(arg1, arg0)) {
				if (local171.aStringArray20 != null) {
					if (local171.aStringArray20[4] != null) {
						Static361.method5112(local171.aString19, 1001, 0, local171.anInt2178, -1, true, local171.aStringArray20[4], -1, (long) local162.aClass6_Sub24_1.anInt4802, false);
					}
					if (local171.aStringArray20[3] != null) {
						Static361.method5112(local171.aString19, 1004, 0, local171.anInt2178, -1, true, local171.aStringArray20[3], -1, (long) local162.aClass6_Sub24_1.anInt4802, false);
					}
					if (local171.aStringArray20[2] != null) {
						Static361.method5112(local171.aString19, 1002, 0, local171.anInt2178, -1, true, local171.aStringArray20[2], -1, (long) local162.aClass6_Sub24_1.anInt4802, false);
					}
					if (local171.aStringArray20[1] != null) {
						Static361.method5112(local171.aString19, 1003, 0, local171.anInt2178, -1, true, local171.aStringArray20[1], -1, (long) local162.aClass6_Sub24_1.anInt4802, false);
					}
					if (local171.aStringArray20[0] != null) {
						Static361.method5112(local171.aString19, 1010, 0, local171.anInt2178, -1, true, local171.aStringArray20[0], -1, (long) local162.aClass6_Sub24_1.anInt4802, false);
					}
				}
				if (!local162.aClass6_Sub24_1.aBoolean340) {
					local162.aClass6_Sub24_1.aBoolean340 = true;
					Static308.method4421(Static250.aClass193_4, local162.aClass6_Sub24_1.anInt4802, local171.anInt2178);
				}
				if (local162.aClass6_Sub24_1.aBoolean340) {
					Static308.method4421(Static359.aClass193_7, local162.aClass6_Sub24_1.anInt4802, local171.anInt2178);
				}
			} else if (local162.aClass6_Sub24_1.aBoolean340) {
				local162.aClass6_Sub24_1.aBoolean340 = false;
				Static308.method4421(Static107.aClass193_3, local162.aClass6_Sub24_1.anInt4802, local171.anInt2178);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "(I)V")
	public static void method1176() {
		Static205.aClass12Array3 = null;
		Static60.aClass92_2 = null;
		Static63.aClass12Array6 = null;
		Static252.aClass12Array13 = null;
		Static228.aClass12_10 = null;
		Static273.aClass12Array15 = null;
		Static344.aClass12Array16 = null;
		Static63.aClass12Array5 = null;
		Static260.aClass12Array14 = null;
		Static139.aClass12Array11 = null;
		aClass12Array4 = null;
		Static396.aClass12Array18 = null;
		Static45.aClass92_1 = null;
		Static357.aClass12Array17 = null;
		Static165.aClass12Array10 = null;
		Static441.aClass12_20 = null;
		Static120.aClass92_3 = null;
		Static33.aClass12Array1 = null;
	}
}
