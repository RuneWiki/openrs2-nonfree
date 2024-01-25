import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!jk;")
	public static Class122 aClass122_4;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
	public static final int[] anIntArray382 = new int[1000];

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_155 = new Class214(56, 6);

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_67 = new Class212(52, 7);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public static void method4225() {
		if (Static419.anInt7272 == 2) {
			Static263.anInt5007 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static263.anInt5007 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
