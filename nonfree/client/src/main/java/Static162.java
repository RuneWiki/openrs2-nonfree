import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static162 {

	@OriginalMember(owner = "client!hv", name = "I", descriptor = "[Lclient!cs;")
	public static final Class44[] aClass44Array1 = new Class44[2048];

	@OriginalMember(owner = "client!hv", name = "X", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!hv", name = "e", descriptor = "(I)Lclient!u;")
	public static Class147_Sub1 method2356() {
		return Static22.aClass147_Sub1Array1.length > Static152.anInt2590 ? Static22.aClass147_Sub1Array1[Static152.anInt2590++] : null;
	}
}
