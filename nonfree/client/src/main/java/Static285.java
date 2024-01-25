import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static285 {

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame4;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_115 = new Class7("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_57 = new Class179(72, 4);

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
	public static int anInt4984 = -2;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Z")
	public static boolean method4143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static248.method3744(arg0, arg1) | Static393.method5260(arg1, arg0) | Static102.method1860(arg1, arg0)) & Static129.method3338(arg1, arg0);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(III)Z")
	public static boolean method4144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
