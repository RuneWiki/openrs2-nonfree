import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	public static int anInt1288;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "[I")
	public static final int[] anIntArray67 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZ)V")
	public static void method1234(@OriginalArg(1) boolean arg0) {
		Static25.method456();
		if (!Static259.method4507(Static579.anInt10049)) {
			return;
		}
		Static312.anInt5632++;
		if (Static312.anInt5632 < 50 && !arg0) {
			return;
		}
		Static312.anInt5632 = 0;
		if (!Static597.aBoolean749 && Static395.aClass207_2 != null) {
			@Pc(41) Class2_Sub52 local41 = Static311.method5098(Static536.aClass341_51, Static125.aClass179_1);
			Static38.method791(local41);
			try {
				Static355.method6354();
			} catch (@Pc(48) IOException local48) {
				Static597.aBoolean749 = true;
			}
		}
		Static25.method456();
	}
}
