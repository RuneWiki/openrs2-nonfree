import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public static int anInt1245 = 100;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z")
	public static boolean method935() {
		@Pc(6) Class171 local6 = Static1.aClass171_1;
		synchronized (Static1.aClass171_1) {
			if (Static14.anInt390 == Static299.anInt6234) {
				return false;
			} else {
				Static1.anInt77 = Static54.anIntArray150[Static14.anInt390];
				Static81.aChar1 = Static167.aCharArray4[Static14.anInt390];
				Static14.anInt390 = Static14.anInt390 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I")
	public static int method936(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local3 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local3 == 19 || local3 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)C")
	public static char method937(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method939() {
		Static262.aClass155_42.method4364(5);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)I")
	public static int method941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 >= arg2 ? (arg0 > arg1 ? arg1 : arg0) : arg2;
	}
}
