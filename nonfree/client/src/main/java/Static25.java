import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "Lclient!sa;")
	public static Class72 aClass72_4 = new Class72(64);

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "Lclient!cd;")
	public static Class10 aClass10_327 = Static51.method932(")2");

	@OriginalMember(owner = "client!ch", name = "Z", descriptor = "Lclient!cd;")
	private static Class10 aClass10_329 = Static51.method932("New User");

	@OriginalMember(owner = "client!ch", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_328 = aClass10_329;

	@OriginalMember(owner = "client!ch", name = "ab", descriptor = "I")
	public static int anInt670 = 0;

	@OriginalMember(owner = "client!ch", name = "bb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_330 = Static51.method932("<col=00ffff>");

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "(I)V")
	public static void method550() {
		aClass10_329 = null;
		aClass10_330 = null;
		aClass10_328 = null;
		aClass10_327 = null;
		aClass72_4 = null;
		aCanvas1 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!fa;I)Lclient!fa;")
	public static Class23 method552(@OriginalArg(0) Class23 arg0) {
		@Pc(12) Class23 local12 = Static68.method1155(arg0);
		if (local12 == null) {
			local12 = arg0.aClass23_3;
		}
		return local12;
	}
}
