import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!em", name = "v", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
	public static void method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class2_Sub5_Sub10 local10 = Static594.method8175(arg1, 5);
		local10.method4393();
		local10.anInt5255 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIB)V")
	public static void method2531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static167.aClass87_3 == null) {
			return;
		}
		@Pc(12) int local12 = Static466.anInt4483;
		@Pc(14) int local14 = Static207.anInt4335;
		Static472.method6788(arg0, arg1);
		if (Static244.anInt4841 == 0) {
			Static401.anInterface24_1 = null;
			Static401.anInterface24_1 = Static167.aClass87_3.method7900(Static167.aClass87_3.method7973(Static250.anInt8280, Static326.anInt5898), Static167.aClass87_3.method7905(Static250.anInt8280, Static326.anInt5898));
		} else if (Static244.anInt4841 == 1 && (Static5.anInterface24Array1 == null || Static466.anInt4483 != local12 || local14 != Static207.anInt4335)) {
			Static5.anInterface24Array1 = new Interface24[Static466.anInt4483 * Static207.anInt4335];
			for (@Pc(42) int local42 = 0; local42 < Static5.anInterface24Array1.length; local42++) {
				Static5.anInterface24Array1[local42] = Static167.aClass87_3.method7900(Static167.aClass87_3.method7973(Static531.anInt8888, Static155.anInt3544), Static167.aClass87_3.method7905(Static531.anInt8888, Static155.anInt3544));
			}
			Static315.anIntArray429 = new int[Static207.anInt4335 * Static466.anInt4483];
			Static250.anInt8281 = 1;
		}
		Static445.aBoolean594 = true;
	}
}
