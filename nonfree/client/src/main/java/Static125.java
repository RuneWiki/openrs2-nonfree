import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	public static int anInt2059 = 64;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V")
	public static void method1885(@OriginalArg(0) boolean arg0) {
		Static142.aClass117_8.method7253(Static512.aClass126_22.method7037());
		@Pc(15) int[] local15 = Static512.aClass126_22.Y();
		Static173.anInt3123 = local15[3];
		Static461.anInt7790 = local15[1];
		Static596.anInt9736 = local15[2];
		Static637.anInt10333 = local15[0];
		if (arg0) {
			Static512.aClass126_22.DA(Static29.anInt572, Static649.anInt10498, Static442.anInt7458, Static402.anInt9328);
			Static293.method4314(Static134.aDouble14);
		} else {
			Static512.aClass126_22.DA(Static218.anInt3743, Static394.anInt6874, Static443.anInt7472, Static587.anInt9616);
			Static293.method4314(Static400.aDouble21);
		}
	}
}
