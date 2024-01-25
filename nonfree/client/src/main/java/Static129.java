import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!faa", name = "m", descriptor = "F")
	public static float aFloat77;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
	public static int anInt2578 = 2;

	@OriginalMember(owner = "client!faa", name = "n", descriptor = "I")
	public static int anInt2583 = -1;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
	public static void method2274(@OriginalArg(0) int arg0) {
		Static549.method7482();
		@Pc(19) int local19 = Static433.aClass117_2.method2696(arg0).anInt543;
		if (local19 == 0) {
			return;
		}
		@Pc(27) int local27 = Static390.aClass353_29.anIntArray589[arg0];
		if (local19 == 6) {
			Static416.anInt7352 = local27;
		}
		if (local19 == 5) {
			Static579.anInt9553 = local27;
		}
	}
}
