import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Lclient!aia;")
	public static Class15 aClass15_2;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
	public static final int anInt4038 = 52;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_47 = new Class46(15, 3);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Z")
	public static boolean method3645(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(13) Class local13 = (Class) Static632.aHashtable7.get(arg0);
		if (local13 != null) {
			return local13.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static460.aHashtable5.get(arg0);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg1, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static632.aHashtable7.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static632.aHashtable7.put(arg0, lha.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
