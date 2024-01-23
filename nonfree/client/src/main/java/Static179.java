import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "[Lclient!lh;")
	public static Class63[] aClass63Array3;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt4184 = 0;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public static int anInt4185 = -1;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Lclient!kh;")
	private static Class60 aClass60_1424 = Static200.method3116("Welcome to RuneScape");

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1425 = aClass60_1424;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1426 = Static200.method3116(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method3057(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static176.aClass51_2);
		arg0.addMouseMotionListener(Static176.aClass51_2);
		arg0.addFocusListener(Static176.aClass51_2);
	}
}
