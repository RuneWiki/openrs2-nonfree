import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!rha", name = "L", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!rha", name = "H", descriptor = "[I")
	public static final int[] anIntArray559 = new int[14];

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZZ)V")
	public static void method7241(@OriginalArg(0) boolean arg0) {
		Static35.method857();
		if (!Static126.method8985(Static556.anInt9319)) {
			return;
		}
		Static145.anInt2484++;
		if (Static145.anInt2484 < 50 && !arg0) {
			return;
		}
		Static145.anInt2484 = 0;
		if (!Static84.aBoolean106 && Static163.aClass170_1 != null) {
			@Pc(35) Class6_Sub26 local35 = Static268.method3981(Static377.aClass15_2, Static55.aClass289_58);
			Static670.method9077(local35);
			try {
				Static356.method5157();
			} catch (@Pc(42) IOException local42) {
				Static84.aBoolean106 = true;
			}
		}
		Static35.method857();
	}
}
