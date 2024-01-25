import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V")
	public static void method6522(@OriginalArg(0) boolean arg0) {
		Static442.method6680();
		if (!Static471.method7030(Static512.anInt8932)) {
			return;
		}
		Static326.anInt6217++;
		if (Static326.anInt6217 < 50 && !arg0) {
			return;
		}
		Static326.anInt6217 = 0;
		if (!Static463.aBoolean590 && Static467.aClass41_1 != null) {
			Static278.method4791(Static219.aClass158_60);
			try {
				Static467.aClass41_1.method1065(Static515.aClass3_Sub27_Sub1_2.anInt9191, Static515.aClass3_Sub27_Sub1_2.aByteArray114);
				Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
			} catch (@Pc(50) IOException local50) {
				Static463.aBoolean590 = true;
			}
		}
		Static442.method6680();
	}
}
