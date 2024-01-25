import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "I")
	public static int anInt5530 = 0;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)V")
	public static void method4534(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static95.aString32 = arg0;
		Static108.aBoolean216 = arg1;
		Static191.aString57 = arg2;
		if (!Static108.aBoolean216 && (Static95.aString32.equals("") || Static191.aString57.equals(""))) {
			Static590.method8155(3);
			return;
		}
		Static306.aBoolean441 = false;
		if (Static475.anInt8512 != 1) {
			Static9.anInt129 = -1;
			Static643.anInt10695 = 0;
		}
		Static590.method8155(-3);
		Static64.anInt2001 = 0;
		Static453.anInt8320 = 1;
		Static478.anInt8582 = 0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public static void method4535() {
		Static55.anInt1863 = 0;
		Static63.aClass230Array1 = new Class230[50];
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBILclient!ha;)V")
	public static void method4536(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class16 arg2) {
		Static239.aClass216ArrayArray1 = new Class216[arg0][arg1];
		Static274.aClass16_12 = arg2;
		if (Static291.anIntArray345 != null) {
			Static542.aClass40_4 = Static287.method4819(Static291.anIntArray345[2], Static291.anIntArray345[4], Static291.anIntArray345[1], Static291.anIntArray345[5], Static291.anIntArray345[3], Static291.anIntArray345[0]);
		}
		Static605.aClass216_3 = new Class216();
		Static592.method8179();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(FB)F")
	public static float method4538(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIIZ)V")
	public static void method4539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 0) {
			Static590.method8160(false);
		} else {
			Static80.anInt9237 = Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358();
			Static553.method7773(true, 0);
		}
		Static129.anInt3455 = arg2;
		Static610.aBoolean739 = arg3;
		Static538.anInt9295 = arg0;
		Static110.method6396(arg1);
	}
}
