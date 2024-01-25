import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static298 {

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage6;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	public static int anInt9334;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_152 = new Class67("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "[I")
	public static final int[] anIntArray775 = new int[200];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZI)V")
	public static void method7722(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static36.anInt940 = arg1;
		Static312.anInt6059 = 3;
		Static165.method3203(Static112.aClass319_9.aString85, Static112.aClass319_9.anInt9320);
		if (arg0) {
			Static434.method6593(false, "", "");
		} else {
			Static441.method6645();
			Static434.method6593(false, Static446.aString64, Static369.aString49);
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
	public static boolean method7723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static268.method4692(arg0, arg1) | (arg1 & 0x40000) != 0 || Static318.method4379(arg0, arg1);
	}
}
