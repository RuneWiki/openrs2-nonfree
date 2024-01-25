import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ama", name = "v", descriptor = "I")
	public static int anInt294;

	@OriginalMember(owner = "client!ama", name = "B", descriptor = "I")
	public static int anInt300;

	@OriginalMember(owner = "client!ama", name = "o", descriptor = "Lclient!nca;")
	public static Class254 aClass254_16;

	@OriginalMember(owner = "client!ama", name = "w", descriptor = "Lclient!al;")
	public static final Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(I)V")
	public static void method305() {
		if (Static129.aFileOutputStream1 != null) {
			try {
				Static129.aFileOutputStream1.close();
			} catch (@Pc(10) IOException local10) {
			}
		}
		Static129.aFileOutputStream1 = null;
	}
}
