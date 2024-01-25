import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public static int anInt9733 = -1;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "()V")
	public static void method7963() {
		for (@Pc(1) int local1 = 0; local1 < Static375.anInt7259; local1++) {
			@Pc(6) Class1_Sub4_Sub2 local6 = Static384.aClass1_Sub4_Sub2Array1[local1];
			Static466.method7865(local6, true);
			Static384.aClass1_Sub4_Sub2Array1[local1] = null;
		}
		Static375.anInt7259 = 0;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)I")
	public static int method7967() {
		return Static335.method5483(false);
	}
}
