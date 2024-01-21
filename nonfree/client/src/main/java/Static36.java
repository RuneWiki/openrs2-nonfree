import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Lclient!he;")
	public static Class3_Sub10_Sub1 aClass3_Sub10_Sub1_1;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Z")
	public static boolean aBoolean39 = true;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Z")
	public static boolean aBoolean40 = false;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_486 = Static109.method1737("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_487 = Static109.method1737("");

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "Lclient!na;")
	private static Class53 aClass53_489 = Static109.method1737("Enter name:");

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_488 = aClass53_489;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "Lclient!na;")
	private static Class53 aClass53_490 = Static109.method1737("Hidden");

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	public static int anInt1122 = 0;

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "Lclient!na;")
	public static Class53 aClass53_491 = aClass53_490;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
	public static void method767() {
		Class3_Sub9.anIntArray125 = null;
		aClass53_487 = null;
		aClass53_491 = null;
		aClass3_Sub10_Sub1_1 = null;
		aClass53_488 = null;
		aClass53_489 = null;
		aClass53_486 = null;
		aClass53_490 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BILclient!we;)Lclient!la;")
	public static Class3_Sub12 method768(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(13) byte[] local13 = arg1.method1509(arg0);
		return local13 == null ? null : new Class3_Sub12(local13);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!bd;[BIIIIIIBI)V")
	public static void method769(@OriginalArg(0) Class9[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (local7 + arg5 > 0 && local7 + arg5 < 103 && arg2 + local11 > 0 && local11 + arg2 < 103) {
					arg0[arg4].anIntArrayArray1[local7 + arg5][local11 + arg2] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(82) Class3_Sub7 local82 = new Class3_Sub7(arg1);
		for (@Pc(84) int local84 = 0; local84 < 4; local84++) {
			for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
				for (@Pc(92) int local92 = 0; local92 < 64; local92++) {
					if (local84 == arg8 && arg6 <= local88 && arg6 + 8 > local88 && arg3 <= local92 && local92 < arg3 + 8) {
						Static120.method1920(arg5 + Static94.method1561(arg7, local88 & 0x7, local92 & 0x7), 0, 0, arg7, arg4, local82, Static49.method940(arg7, local92 & 0x7, local88 & 0x7) + arg2);
					} else {
						Static120.method1920(-1, 0, 0, 0, 0, local82, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method770() {
		if (Static73.anInt1832 != 1) {
			return;
		}
		if (Static56.anInt1504 >= 539 && Static56.anInt1504 <= 573 && Static54.anInt2854 >= 169 && Static54.anInt2854 < 205 && Static60.anIntArray194[0] != -1) {
			Static12.aBoolean18 = true;
			Static22.anInt713 = 0;
			aBoolean40 = true;
		}
		if (Static56.anInt1504 >= 569 && Static56.anInt1504 <= 599 && Static54.anInt2854 >= 168 && Static54.anInt2854 < 205 && Static60.anIntArray194[1] != -1) {
			aBoolean40 = true;
			Static22.anInt713 = 1;
			Static12.aBoolean18 = true;
		}
		if (Static56.anInt1504 >= 597 && Static56.anInt1504 <= 627 && Static54.anInt2854 >= 168 && Static54.anInt2854 < 205 && Static60.anIntArray194[2] != -1) {
			aBoolean40 = true;
			Static22.anInt713 = 2;
			Static12.aBoolean18 = true;
		}
		if (Static56.anInt1504 >= 625 && Static56.anInt1504 <= 669 && Static54.anInt2854 >= 168 && Static54.anInt2854 < 203 && Static60.anIntArray194[3] != -1) {
			Static12.aBoolean18 = true;
			aBoolean40 = true;
			Static22.anInt713 = 3;
		}
		if (Static56.anInt1504 >= 666 && Static56.anInt1504 <= 696 && Static54.anInt2854 >= 168 && Static54.anInt2854 < 205 && Static60.anIntArray194[4] != -1) {
			aBoolean40 = true;
			Static12.aBoolean18 = true;
			Static22.anInt713 = 4;
		}
		if (Static56.anInt1504 >= 694 && Static56.anInt1504 <= 724 && Static54.anInt2854 >= 168 && Static54.anInt2854 < 205 && Static60.anIntArray194[5] != -1) {
			aBoolean40 = true;
			Static22.anInt713 = 5;
			Static12.aBoolean18 = true;
		}
		if (Static56.anInt1504 >= 722 && Static56.anInt1504 <= 756 && Static54.anInt2854 >= 169 && Static54.anInt2854 < 205 && Static60.anIntArray194[6] != -1) {
			Static12.aBoolean18 = true;
			aBoolean40 = true;
			Static22.anInt713 = 6;
		}
		if (Static56.anInt1504 >= 540 && Static56.anInt1504 <= 574 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 502 && Static60.anIntArray194[7] != -1) {
			Static22.anInt713 = 7;
			Static12.aBoolean18 = true;
			aBoolean40 = true;
		}
		if (Static56.anInt1504 >= 572 && Static56.anInt1504 <= 602 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 503 && Static60.anIntArray194[8] != -1) {
			aBoolean40 = true;
			Static22.anInt713 = 8;
			Static12.aBoolean18 = true;
		}
		if (Static56.anInt1504 >= 599 && Static56.anInt1504 <= 629 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 503 && Static60.anIntArray194[9] != -1) {
			Static12.aBoolean18 = true;
			aBoolean40 = true;
			Static22.anInt713 = 9;
		}
		if (Static56.anInt1504 >= 627 && Static56.anInt1504 <= 671 && Static54.anInt2854 >= 467 && Static54.anInt2854 < 502 && Static60.anIntArray194[10] != -1) {
			Static22.anInt713 = 10;
			aBoolean40 = true;
			Static12.aBoolean18 = true;
		}
		if (Static56.anInt1504 >= 669 && Static56.anInt1504 <= 699 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 503 && Static60.anIntArray194[11] != -1) {
			aBoolean40 = true;
			Static12.aBoolean18 = true;
			Static22.anInt713 = 11;
		}
		if (Static56.anInt1504 >= 696 && Static56.anInt1504 <= 726 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 503 && Static60.anIntArray194[12] != -1) {
			Static22.anInt713 = 12;
			Static12.aBoolean18 = true;
			aBoolean40 = true;
		}
		if (Static56.anInt1504 >= 724 && Static56.anInt1504 <= 758 && Static54.anInt2854 >= 466 && Static54.anInt2854 < 502 && Static60.anIntArray194[13] != -1) {
			Static22.anInt713 = 13;
			aBoolean40 = true;
			Static12.aBoolean18 = true;
			return;
		}
	}
}
