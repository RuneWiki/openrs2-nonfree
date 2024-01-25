import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!iea", name = "I", descriptor = "I")
	public static int anInt5229;

	@OriginalMember(owner = "client!iea", name = "J", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!iea", name = "z", descriptor = "Lclient!tn;")
	public static final Class3_Sub15 aClass3_Sub15_4 = new Class3_Sub15(1350);

	@OriginalMember(owner = "client!iea", name = "E", descriptor = "Z")
	public static boolean aBoolean458 = false;

	@OriginalMember(owner = "client!iea", name = "H", descriptor = "I")
	public static final int anInt5228 = 52;

	@OriginalMember(owner = "client!iea", name = "K", descriptor = "I")
	public static int anInt5230 = -1;

	@OriginalMember(owner = "client!iea", name = "L", descriptor = "Lclient!qu;")
	public static Class282 aClass282_1 = new Class282();

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(BLclient!nga;Ljava/lang/Object;)V")
	public static void method4411(@OriginalArg(1) Class228 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg0.anEventQueue1.peekEvent() != null; local19++) {
			Static500.method7308(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(45) Exception local45) {
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ICI)C")
	public static char method4412(@OriginalArg(0) int arg0, @OriginalArg(1) char arg1) {
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

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(IIIII)V")
	public static void method4414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static246.anInt5506 <= arg1 && Static583.anInt9761 >= arg1) {
			@Pc(27) int local27 = Static429.method6586(arg2, Static202.anInt4720, Static472.anInt6105);
			@Pc(33) int local33 = Static429.method6586(arg3, Static202.anInt4720, Static472.anInt6105);
			Static105.method2572(local27, arg1, local33, arg0);
		}
	}

	@OriginalMember(owner = "client!iea", name = "f", descriptor = "(I)[Lclient!ofa;")
	public static Class244[] method4415() {
		return new Class244[] { Static559.aClass244_5, Static115.aClass244_4, Static447.aClass244_3 };
	}
}
