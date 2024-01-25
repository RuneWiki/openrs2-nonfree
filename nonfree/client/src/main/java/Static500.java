import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "Lclient!cc;")
	public static final Class44 aClass44_1 = Static126.method2495();

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "Z")
	public static boolean aBoolean598 = true;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BI)V")
	public static void method7393(@OriginalArg(1) int arg0) {
		@Pc(16) Class3_Sub4_Sub12 local16 = Static556.method8018(9, arg0);
		local16.method3607();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
	public static boolean method7397(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static318.aHashtable4.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static340.aHashtable6.get(arg0);
		}
		if (local21 != null) {
			try {
				local21 = new File(local21.getCanonicalPath());
				@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
				@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local52.invoke(local68, Boolean.TRUE);
				local68.invoke(Runtime.getRuntime(), arg1, local21.getPath());
				local52.invoke(local68, Boolean.FALSE);
				Static318.aHashtable4.put(arg0, arg1);
				return true;
			} catch (@Pc(111) NoSuchMethodException local111) {
				System.load(local21.getPath());
				Static318.aHashtable4.put(arg0, jca.class);
				return true;
			} catch (@Pc(129) Throwable local129) {
			}
		}
		return false;
	}
}
