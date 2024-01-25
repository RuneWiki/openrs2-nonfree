import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "[I")
	public static final int[] anIntArray160 = new int[4096];

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method2849(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static130.aString22 = arg2;
		Static398.aBoolean548 = arg1;
		Static251.aString51 = arg0;
		if (!Static398.aBoolean548 && Static133.anInt2648 != 3 && (Static251.aString51.equals("") || Static130.aString22.equals(""))) {
			Static501.method7054(3);
			return;
		}
		if (Static133.anInt2648 != 1) {
			Static83.anInt1568 = 0;
			Static397.anInt7112 = -1;
		}
		Static303.aBoolean438 = false;
		Static501.method7054(-3);
		Static73.anInt1421 = 0;
		Static517.anInt8881 = 1;
		Static178.anInt3319 = 0;
	}
}
