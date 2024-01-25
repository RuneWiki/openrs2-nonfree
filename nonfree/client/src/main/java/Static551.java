import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!eq;")
	public static Class97 aClass97_136;

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_13 = new Class266(9, 4);

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_88 = new Class269(60, 7);

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Z")
	public static final boolean aBoolean668 = true;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method7658(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static352.aHashtable5.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static605.aHashtable7.get(arg0);
		}
		if (local21 != null) {
			try {
				local21 = new File(local21.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg1, local21.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static352.aHashtable5.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local21.getPath());
				Static352.aHashtable5.put(arg0, dca.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
