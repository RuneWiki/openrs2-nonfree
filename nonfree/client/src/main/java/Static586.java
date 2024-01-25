import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static586 {

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public static int anInt10135;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public static int anInt10143;

	@OriginalMember(owner = "client!wg", name = "wb", descriptor = "I")
	public static int anInt10185;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "[I")
	public static final int[] anIntArray586 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIILclient!pca;)V")
	public static void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class251 arg2) {
		if (arg2.aByte111 == 0) {
			arg2.anInt7224 = arg2.anInt7217;
		} else if (arg2.aByte111 == 1) {
			arg2.anInt7224 = (arg1 - arg2.anInt7285) / 2 + arg2.anInt7217;
		} else if (arg2.aByte111 == 2) {
			arg2.anInt7224 = arg1 - arg2.anInt7285 - arg2.anInt7217;
		} else if (arg2.aByte111 == 3) {
			arg2.anInt7224 = arg1 * arg2.anInt7217 >> 14;
		} else if (arg2.aByte111 == 4) {
			arg2.anInt7224 = (arg2.anInt7217 * arg1 >> 14) + (arg1 - arg2.anInt7285) / 2;
		} else {
			arg2.anInt7224 = arg1 - arg2.anInt7285 - (arg2.anInt7217 * arg1 >> 14);
		}
		if (arg2.aByte112 == 0) {
			arg2.anInt7281 = arg2.anInt7289;
		} else if (arg2.aByte112 == 1) {
			arg2.anInt7281 = arg2.anInt7289 + (arg0 - arg2.anInt7215) / 2;
		} else if (arg2.aByte112 == 2) {
			arg2.anInt7281 = arg0 - arg2.anInt7215 - arg2.anInt7289;
		} else if (arg2.aByte112 == 3) {
			arg2.anInt7281 = arg2.anInt7289 * arg0 >> 14;
		} else if (arg2.aByte112 == 4) {
			arg2.anInt7281 = (arg0 - arg2.anInt7215) / 2 + (arg0 * arg2.anInt7289 >> 14);
		} else {
			arg2.anInt7281 = arg0 - arg2.anInt7215 - (arg2.anInt7289 * arg0 >> 14);
		}
		if (!Static355.aBoolean446) {
			return;
		}
		if (Static70.method1716(arg2).anInt3988 == 0 && arg2.anInt7231 != 0) {
			return;
		}
		if (arg2.anInt7224 < 0) {
			arg2.anInt7224 = 0;
		} else if (arg1 < arg2.anInt7285 + arg2.anInt7224) {
			arg2.anInt7224 = arg1 - arg2.anInt7285;
		}
		if (arg2.anInt7281 < 0) {
			arg2.anInt7281 = 0;
			return;
		}
		if (arg0 < arg2.anInt7215 + arg2.anInt7281) {
			arg2.anInt7281 = arg0 - arg2.anInt7215;
			return;
		}
	}
}
