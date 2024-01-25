import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!jo", name = "J", descriptor = "I")
	public static int anInt5748;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Lclient!uh;")
	public static Class341 aClass341_41 = new Class341();

	@OriginalMember(owner = "client!jo", name = "I", descriptor = "[I")
	public static final int[] anIntArray332 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method4966(@OriginalArg(1) Class20 arg0) {
		if (Static65.aBoolean754) {
			Static637.method9205(arg0);
		} else {
			Static86.method2435(arg0);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIIIIII)V")
	public static void method4967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static99.anInt2777 = arg5;
		Static557.anInt9973 = arg4;
		Static100.anInt2830 = arg2;
		Static617.anInt10794 = arg0;
		Static596.anInt10492 = arg3;
		Static242.anInt5255 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
	public static void method4968() {
		if (Static268.aClass370_3.aBoolean739 && Static331.aClass255_4.anInt7912 != -1) {
			Static268.method4935(Static331.aClass255_4.aString89, Static331.aClass255_4.anInt7912);
		}
	}
}
