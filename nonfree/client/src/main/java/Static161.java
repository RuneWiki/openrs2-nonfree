import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static161 {

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Lclient!hv;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray10 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
	public static int anInt2909 = 2;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class223 method2385(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static5.aFloat88 == 3.0D) {
				return Static326.aClass223_6;
			}
			if ((double) Static5.aFloat88 == 4.0D) {
				return Static206.aClass223_3;
			}
			if ((double) Static5.aFloat88 == 6.0D) {
				return Static131.aClass223_2;
			}
			if ((double) Static5.aFloat88 >= 8.0D) {
				return Static78.aClass223_1;
			}
		} else if (arg0 == 1) {
			if ((double) Static5.aFloat88 == 3.0D) {
				return Static131.aClass223_2;
			}
			if ((double) Static5.aFloat88 == 4.0D) {
				return Static78.aClass223_1;
			}
			if ((double) Static5.aFloat88 == 6.0D) {
				return Static372.aClass223_7;
			}
			if ((double) Static5.aFloat88 >= 8.0D) {
				return Static306.aClass223_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static5.aFloat88 == 3.0D) {
				return Static372.aClass223_7;
			}
			if ((double) Static5.aFloat88 == 4.0D) {
				return Static306.aClass223_4;
			}
			if ((double) Static5.aFloat88 == 6.0D) {
				return Static399.aClass223_8;
			}
			if ((double) Static5.aFloat88 >= 8.0D) {
				return Static323.aClass223_5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
	public static int method2386() {
		return 6;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V")
	public static void method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 >= Static347.anInt6160 && arg1 <= Static385.anInt6686 && arg5 >= Static118.anInt2005 && arg0 <= Static123.anInt2069) {
			if (arg2 == 1) {
				Static435.method5888(arg5, arg0, arg4, arg1, arg3);
			} else {
				Static45.method704(arg4, arg2, arg0, arg5, arg1, arg3);
			}
		} else if (arg2 == 1) {
			Static164.method2401(arg3, arg1, arg0, arg5, arg4);
		} else {
			Static123.method1965(arg5, arg2, arg3, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method2389() {
		if (Static42.aBoolean410) {
			return;
		}
		if (Static434.aClass165_Sub1_1.aBoolean290) {
			Static234.aFloat30 = (int) Static234.aFloat30 - 17 & 0xFFFFFFF0;
		} else {
			Static104.aFloat13 += (-12.0F - Static104.aFloat13) / 2.0F;
		}
		Static42.aBoolean410 = true;
		Static94.aBoolean395 = true;
	}
}
