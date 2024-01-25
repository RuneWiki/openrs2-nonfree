import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_75 = new Class186(81, 8);

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_33 = new Class316(200);

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_80 = new Class6(30, 1);

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray34 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
	public static int anInt5137 = 10;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
	public static boolean method4385(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static302.aHashtable8.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(31) File local31 = (File) Static241.aHashtable6.get(arg0);
		if (local31 != null) {
			try {
				local31 = new File(local31.getCanonicalPath());
				@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
				@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local55.invoke(local71, Boolean.TRUE);
				local71.invoke(Runtime.getRuntime(), arg1, local31.getPath());
				local55.invoke(local71, Boolean.FALSE);
				Static302.aHashtable8.put(arg0, arg1);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local31.getPath());
				Static302.aHashtable8.put(arg0, fu.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}
}
