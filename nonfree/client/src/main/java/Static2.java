import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
	public static int anInt69;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!em;")
	public static final Class83 aClass83_1 = new Class83(62, 6);

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public static int anInt65 = -1;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
	public static int anInt71 = 0;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Lclient!em;")
	public static final Class83 aClass83_2 = new Class83(35, 3);

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V")
	public static void method68() {
		Static319.aClass160Array2 = null;
		Static185.method3005(0, 0, Static594.anInt9806, 0, -1, Static349.anInt6422, 0, Static165.anInt3165);
		if (Static319.aClass160Array2 != null) {
			Static377.method5460(Static121.anInt2503, Static319.aClass160Array2, 0, -1412584499, Static6.aClass160_45.anInt4165, Static568.anInt8904, Static349.anInt6422, Static594.anInt9806, 0);
			Static319.aClass160Array2 = null;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IFFF)F")
	public static float method69(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + arg2 * (arg0 - arg1);
	}
}
