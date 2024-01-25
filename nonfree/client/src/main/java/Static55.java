import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Lclient!ud;")
	public static Class7_Sub38 aClass7_Sub38_1;

	@OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
	public static int anInt1452 = 0;

	@OriginalMember(owner = "client!de", name = "S", descriptor = "I")
	public static int anInt1454 = 1;

	@OriginalMember(owner = "client!de", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString108 = "Connected to update server";

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	public static void method1157(@OriginalArg(0) int arg0) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(4, arg0);
		local13.method4788();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!rk;I)V")
	public static void method1158(@OriginalArg(0) Class180 arg0) {
		Static308.aClass180_86 = arg0;
		Static84.anInt2190 = Static308.aClass180_86.method4553(16);
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public static void method1159() {
		for (@Pc(18) Class7_Sub29 local18 = (Class7_Sub29) Static79.aClass74_9.method1793(); local18 != null; local18 = (Class7_Sub29) Static79.aClass74_9.method1798()) {
			if (local18.anInt4635 == -1) {
				local18.anInt4643 = 0;
				Static253.method4301(local18);
			} else {
				local18.method5648();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(II)I")
	public static int method1160(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ICB)C")
	public static char method1162(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
		if (arg1 >= 'À' && arg1 <= 'ÿ') {
			if (arg1 >= 'À' && arg1 <= 'Æ') {
				return 'A';
			}
			if (arg1 == 'Ç') {
				return 'C';
			}
			if (arg1 >= 'È' && arg1 <= 'Ë') {
				return 'E';
			}
			if (arg1 >= 'Ì' && arg1 <= 'Ï') {
				return 'I';
			}
			if (arg1 == 'Ñ' && arg0 != 0) {
				return 'N';
			}
			if (arg1 >= 'Ò' && arg1 <= 'Ö') {
				return 'O';
			}
			if (arg1 >= 'Ù' && arg1 <= 'Ü') {
				return 'U';
			}
			if (arg1 == 'Ý') {
				return 'Y';
			}
			if (arg1 == 'ß') {
				return 's';
			}
			if (arg1 >= 'à' && arg1 <= 'æ') {
				return 'a';
			}
			if (arg1 == 'ç') {
				return 'c';
			}
			if (arg1 >= 'è' && arg1 <= 'ë') {
				return 'e';
			}
			if (arg1 >= 'ì' && arg1 <= 'ï') {
				return 'i';
			}
			if (arg1 == 'ñ' && arg0 != 0) {
				return 'n';
			}
			if (arg1 >= 'ò' && arg1 <= 'ö') {
				return 'o';
			}
			if (arg1 >= 'ù' && arg1 <= 'ü') {
				return 'u';
			}
			if (arg1 == 'ý' || arg1 == 'ÿ') {
				return 'y';
			}
		}
		if (arg1 == 'Œ') {
			return 'O';
		} else if (arg1 == 'œ') {
			return 'o';
		} else if (arg1 == 'Ÿ') {
			return 'Y';
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILclient!cc;)V")
	public static void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class22_Sub2_Sub1_Sub1 arg2) {
		if (arg1 == arg2.anInt5133 && arg1 != -1) {
			@Pc(83) Class170 local83 = Static261.method4379(arg1);
			@Pc(86) int local86 = local83.anInt4968;
			if (local86 == 1) {
				arg2.anInt5143 = 1;
				arg2.anInt5093 = arg0;
				arg2.anInt5117 = 0;
				arg2.anInt5137 = 0;
				arg2.anInt5120 = 0;
				Static219.method3870(local83, arg2.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg2, arg2.anInt5117, arg2.anInt5973);
			}
			if (local86 == 2) {
				arg2.anInt5120 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt5133 == -1 || Static261.method4379(arg1).anInt4963 >= Static261.method4379(arg2.anInt5133).anInt4963) {
			arg2.anInt5144 = arg2.anInt5151;
			arg2.anInt5137 = 0;
			arg2.anInt5120 = 0;
			arg2.anInt5117 = 0;
			arg2.anInt5093 = arg0;
			arg2.anInt5143 = 1;
			arg2.anInt5133 = arg1;
			if (arg2.anInt5133 != -1) {
				Static219.method3870(Static261.method4379(arg2.anInt5133), arg2.anInt5967, Static252.aClass22_Sub2_Sub1_Sub1_4 == arg2, arg2.anInt5117, arg2.anInt5973);
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public static void method1164() {
		if (Static133.anInt2882 != -1) {
			Static2.method12(-1, false, Static133.anInt2882, -1);
			Static133.anInt2882 = -1;
		}
	}
}
