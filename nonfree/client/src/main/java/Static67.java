import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public static int anInt1777;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_33 = new Class256("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Z")
	public static boolean method1264(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
