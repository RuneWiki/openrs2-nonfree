import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public static int anInt3747;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)Z")
	public static boolean method3504() {
		@Pc(14) Class1_Sub22 local14 = (Class1_Sub22) Static317.aClass42_43.aClass1_73.aClass1_252;
		if (local14 == null || Static317.aClass42_43.aClass1_73 == local14) {
			return false;
		} else {
			if (local14.anInt2822 >= 2000) {
				local14.anInt2822 -= 2000;
			}
			return local14.anInt2822 == 1004;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)I")
	public static int method3506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static279.anIntArray420[arg0 & 0x3] : Static66.anIntArray126[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	public static void method3507(@OriginalArg(0) int arg0) {
		Static225.method4176();
		Static283.method5049();
		Static121.method2546(true, arg0);
		Static54.method6034(Static9.aClass63_1, Static101.aClass30_30, Static280.aClass30_83);
		Static263.method4796(Static9.aClass63_1, Static280.aClass30_83);
		Static337.method5671(Static240.aClass4Array16);
		Static147.method2869();
		Static113.method2415();
		if (Static13.anInt334 == 10) {
			Static10.method318(false);
		} else if (Static13.anInt334 == 30) {
			Static44.method1064(25);
			return;
		} else if (Static13.anInt334 == 5) {
			Static242.method4517(Static280.aClass30_83, Static9.aClass63_1);
			return;
		}
	}
}
