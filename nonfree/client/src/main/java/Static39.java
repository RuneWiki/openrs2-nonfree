import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "S")
	public static short aShort19 = 1;

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "[I")
	public static final int[] anIntArray56 = new int[13];

	@OriginalMember(owner = "client!bi", name = "nb", descriptor = "Lclient!qfa;")
	public static final Class269 aClass269_2 = new Class269("", 13);

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
	public static boolean method695(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(16) Class local16 = (Class) Static405.aHashtable6.get(arg0);
		if (local16 != null) {
			return local16.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static9.aHashtable1.get(arg0);
		}
		if (local29 != null) {
			try {
				local29 = new File(local29.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg1, local29.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static405.aHashtable6.put(arg0, arg1);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static405.aHashtable6.put(arg0, ka.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}
}
