import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!mh", name = "V", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!mh", name = "Y", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
	public static int anInt3993 = 0;

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!mh", name = "W", descriptor = "[I")
	public static final int[] anIntArray338 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!ne;)Ljava/lang/String;")
	public static String method3696(@OriginalArg(1) Class146 arg0) {
		if (Static42.method1040(arg0).method2584() == 0) {
			return null;
		} else if (arg0.aString147 == null || arg0.aString147.trim().length() == 0) {
			return Static195.aBoolean248 ? "Hidden-use" : null;
		} else {
			return arg0.aString147;
		}
	}
}
