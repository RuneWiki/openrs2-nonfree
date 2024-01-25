import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!rs", name = "T", descriptor = "I")
	public static int anInt5557;

	@OriginalMember(owner = "client!rs", name = "U", descriptor = "Lclient!s;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!rs", name = "K", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_202 = new Class198(100);

	@OriginalMember(owner = "client!rs", name = "Q", descriptor = "I")
	public static int anInt5555 = -1;

	@OriginalMember(owner = "client!rs", name = "R", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!rs", name = "W", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)Z")
	public static boolean method4796() {
		if (Static302.aBoolean427) {
			try {
				Static366.method4253("showVideoAd", Static1.aClass134_7.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(CI)C")
	public static char method4797(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "([IB[J)V")
	public static void method4799(@OriginalArg(0) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static344.method2721(arg1, arg0, arg1.length - 1, 0);
	}
}
