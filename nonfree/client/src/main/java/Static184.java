import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "[I")
	public static final int[] anIntArray529 = new int[1000];

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray33 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method5383() {
		if (Static113.anInt6411 != 2) {
			try {
				Static361.method2055("tbrefresh", Static37.aClient2);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method5384(@OriginalArg(0) Class122 arg0) {
		if (Static163.anInt3184 != Static208.anInt4202 && (Static256.aClass45ArrayArrayArray2 != null && Static124.method2169(arg0, Static163.anInt3184))) {
			Static208.anInt4202 = Static163.anInt3184;
		}
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(I)V")
	public static void method5387() {
		Static134.aClass24_19.method608();
		Static90.aClass195_1.method5215();
		Static143.aClass195_11.method5215();
	}
}
