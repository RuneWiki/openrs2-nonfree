import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static690 {

	@OriginalMember(owner = "client!za", name = "n", descriptor = "Lclient!om;")
	public static Class274 aClass274_7;

	@OriginalMember(owner = "client!za", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!za", name = "p", descriptor = "Lclient!rg;")
	public static Class310 aClass310_139;

	@OriginalMember(owner = "client!za", name = "o", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_279 = new Class251(32, 3);

	@OriginalMember(owner = "client!za", name = "l", descriptor = "Z")
	public static boolean aBoolean785 = false;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(B)V")
	public static void method9514() {
		if (Static501.aFileOutputStream1 != null) {
			try {
				Static501.aFileOutputStream1.close();
			} catch (@Pc(11) IOException local11) {
			}
		}
		Static501.aFileOutputStream1 = null;
	}
}
