import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
	public static int anInt2650;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_32 = new Class306(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!qa;I)V")
	public static void method2251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		Static487.aClass122_8 = arg2;
		Static251.aClass283ArrayArray1 = new Class283[arg0][arg1];
		if (Static82.anIntArray424 != null) {
			Static181.aClass45_3 = Static393.method5946(Static82.anIntArray424[3], Static82.anIntArray424[4], Static82.anIntArray424[5], Static82.anIntArray424[1], Static82.anIntArray424[2], Static82.anIntArray424[0]);
		}
		Static85.aClass283_1 = new Class283();
		Static131.method2183();
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method2253(@OriginalArg(0) Class1_Sub6 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static491.anInt8153; local7++) {
			@Pc(19) int local19 = arg0.method3936();
			@Pc(23) int local23 = arg0.method3967();
			if (local23 == 65535) {
				local23 = -1;
			}
			if (Static320.aClass185_Sub1Array2[local19] != null) {
				Static320.aClass185_Sub1Array2[local19].anInt7763 = local23;
			}
		}
	}
}
