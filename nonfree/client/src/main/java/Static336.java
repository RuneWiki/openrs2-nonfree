import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt6340;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
	public static int[] anIntArray458;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "Lclient!lj;")
	public static final Class214 aClass214_1 = new Class214();

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!lj;")
	public static final Class214 aClass214_2 = new Class214();

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "Lclient!lj;")
	public static final Class214 aClass214_3 = new Class214();

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!lj;")
	public static final Class214 aClass214_4 = new Class214();

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
	public static int anInt6341 = -1;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method5256() {
		if (Static16.aFileOutputStream3 != null) {
			try {
				Static16.aFileOutputStream3.close();
			} catch (@Pc(17) IOException local17) {
			}
		}
		Static16.aFileOutputStream3 = null;
	}
}
