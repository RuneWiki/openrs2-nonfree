import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static441 {

	@OriginalMember(owner = "client!wi", name = "B", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_163 = new Class256(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "[I")
	public static final int[] anIntArray506 = new int[32];

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "Z")
	public static boolean aBoolean660 = false;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZI)Z")
	public static boolean method5963(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
