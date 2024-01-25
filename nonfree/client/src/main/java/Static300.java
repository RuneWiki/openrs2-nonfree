import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public static int anInt4681;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "Lclient!bn;")
	public static Class24 aClass24_2;

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
	public static int anInt4682;

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "[I")
	public static final int[] anIntArray352 = new int[14];

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!oi", name = "s", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_127 = new Class129(88, 7);

	@OriginalMember(owner = "client!oi", name = "t", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_82 = new Class198(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([BB)Z")
	public static boolean method3720(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(19) int local19 = local8.method5539();
		if (local19 != 2) {
			return false;
		}
		@Pc(37) boolean local37 = local8.method5539() == 1;
		if (local37) {
			Static184.method2505(local8);
		}
		Static154.method5147(local8);
		return true;
	}
}
