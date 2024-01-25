import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_303 = new Class194(59, 10);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIC)C")
	public static char method8519(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
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

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZIII)V")
	public static void method8521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static630.anInt10046;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static220.anInt4532 = arg1;
			Static630.anInt10046 = 2;
			Static374.anInt6010 = arg0;
			Static579.anInt9459 = arg2;
			Static279.anInt5374 = arg3;
		} else if (local5 == 2) {
			if (Static279.anInt5374 < arg3) {
				Static279.anInt5374 = arg3;
			}
			if (arg2 > Static579.anInt9459) {
				Static579.anInt9459 = arg2;
			}
			if (Static374.anInt6010 > arg0) {
				Static374.anInt6010 = arg0;
			}
			if (Static220.anInt4532 > arg1) {
				Static220.anInt4532 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)I")
	public static int method8522(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static424.anInt7715;
		if (local10 == 0) {
			return arg0 ? 0 : Static520.anInt8806;
		} else if (local10 == 1) {
			return Static520.anInt8806;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
	public static int method8523(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
