import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static293 {

	@OriginalMember(owner = "client!k", name = "K", descriptor = "Lclient!pn;")
	public static Class274 aClass274_1;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	public static int anInt4943;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame3;

	@OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
	public static final int[] anIntArray281 = new int[256];

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "[I")
	public static final int[] anIntArray282 = new int[32];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!sha;)V")
	public static void method4206(@OriginalArg(1) Class321 arg0) {
		if (arg0.anInt9089 == Static188.anInt3222) {
			Static224.aBooleanArray12[arg0.anInt9043] = true;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([I[Ljava/lang/String;B)V")
	public static void method4212(@OriginalArg(0) int[] arg0, @OriginalArg(1) String[] arg1) {
		Static35.method853(arg1, arg1.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Z")
	public static boolean method4213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static310.method4425(arg1, arg0) | Static352.method5121(arg1, arg0) | Static590.method8953(arg1, arg0)) & Static405.method5834(arg1, arg0);
	}
}
