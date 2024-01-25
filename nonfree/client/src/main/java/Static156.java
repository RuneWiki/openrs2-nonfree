import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread1;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "Lclient!bt;")
	public static final Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
	public static int anInt3931 = 0;

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_40 = new Class71(2, 1);

	@OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
	public static int anInt3935 = 1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method3173(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class local8 = (Class) Static585.aHashtable7.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static505.aHashtable6.get(arg1);
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
				Static585.aHashtable7.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static585.aHashtable7.put(arg1, mi.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
