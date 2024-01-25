import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
	public static int anInt8963;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "Lclient!iga;")
	public static final Class169 aClass169_5 = new Class169("game3", "Game 3", 2);

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_153 = new Class186(117, 10);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "()V")
	public static void method7490() {
		for (@Pc(1) int local1 = 0; local1 < Static150.aClass240Array1.length; local1++) {
			Static150.aClass240Array1[local1].method5944();
		}
		Static150.aClass240Array1 = null;
	}
}
