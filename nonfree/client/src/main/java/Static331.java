import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	public static int anInt6307 = 0;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "[I")
	public static final int[] anIntArray436 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
	public static final int anInt6313 = 1407;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZBLjava/lang/String;Ljava/lang/String;)V")
	public static void method5281(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		Static88.aBoolean146 = arg0;
		Static172.aString92 = arg2;
		Static262.aString56 = arg1;
		if (!Static88.aBoolean146 && Static445.anInt8114 != 3 && (Static172.aString92.equals("") || Static262.aString56.equals(""))) {
			Static269.method4556(3);
			return;
		}
		if (Static445.anInt8114 != 1) {
			Static435.anInt8019 = 0;
			Static253.anInt5215 = -1;
		}
		Static491.aBoolean628 = false;
		Static269.method4556(-3);
		Static466.anInt8511 = 0;
		Static145.anInt3193 = 1;
		Static433.anInt7998 = 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method5282(@OriginalArg(0) Class198 arg0) {
		if (Static308.anInt5972 == arg0.anInt5769) {
			Static154.aBooleanArray31[arg0.anInt5714] = true;
		}
	}
}
