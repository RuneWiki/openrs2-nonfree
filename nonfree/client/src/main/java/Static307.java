import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray35;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public static int anInt5014 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!pc;II)I")
	public static int method4004(@OriginalArg(0) Class196 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIC)C")
	public static char method4005(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!ho;)V")
	public static void method4006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class114 arg3) {
		for (@Pc(14) Class4_Sub22 local14 = (Class4_Sub22) Static125.aClass244_10.method5263(); local14 != null; local14 = (Class4_Sub22) Static125.aClass244_10.method5271()) {
			if (arg2 == local14.anInt3855 && local14.anInt3852 == arg1 << 7 && local14.anInt3854 == arg0 << 7 && arg3.anInt2875 == local14.aClass114_1.anInt2875) {
				if (local14.aClass4_Sub14_Sub4_2 != null) {
					Static406.aClass4_Sub14_Sub2_2.method2420(local14.aClass4_Sub14_Sub4_2);
					local14.aClass4_Sub14_Sub4_2 = null;
				}
				if (local14.aClass4_Sub14_Sub4_3 != null) {
					Static406.aClass4_Sub14_Sub2_2.method2420(local14.aClass4_Sub14_Sub4_3);
					local14.aClass4_Sub14_Sub4_3 = null;
				}
				local14.method6059();
				return;
			}
		}
	}
}
