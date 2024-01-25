import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ag", name = "cc", descriptor = "I")
	public static int anInt359 = 0;

	@OriginalMember(owner = "client!ag", name = "uc", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_4 = new Class361();

	@OriginalMember(owner = "client!ag", name = "ed", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_6 = new Class319(75, 6);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
	public static boolean method437(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static171.aHashtable3.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static457.aHashtable7.get(arg1);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static171.aHashtable3.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static171.aHashtable3.put(arg1, lh.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
