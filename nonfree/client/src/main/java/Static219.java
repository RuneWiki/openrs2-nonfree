import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Z")
	public static boolean method3986(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(16) Class local16 = (Class) Static325.aHashtable5.get(arg1);
		if (local16 != null) {
			return local16.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(34) File local34 = (File) Static116.aHashtable2.get(arg1);
		if (local34 != null) {
			try {
				local34 = new File(local34.getCanonicalPath());
				@Pc(45) Class local45 = Class.forName("java.lang.Runtime");
				@Pc(48) Class local48 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(58) Method local58 = local48.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(74) Method local74 = local45.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local58.invoke(local74, Boolean.TRUE);
				local74.invoke(Runtime.getRuntime(), arg0, local34.getPath());
				local58.invoke(local74, Boolean.FALSE);
				Static325.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(117) NoSuchMethodException local117) {
				System.load(local34.getPath());
				Static325.aHashtable5.put(arg1, hw.class);
				return true;
			} catch (@Pc(135) Throwable local135) {
			}
		}
		return false;
	}
}
