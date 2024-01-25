import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public static int anInt5938 = 0;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public static int anInt5940 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)Lclient!mf;")
	public static Class6_Sub4 method4959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class290 local7 = Static279.aClass290ArrayArrayArray7[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub4_3;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/Class;)Z")
	public static boolean method4960(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static514.aHashtable7.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = (File) Static471.aHashtable6.get(arg0);
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(45) Class local45 = Class.forName("java.lang.Runtime");
				@Pc(48) Class local48 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(58) Method local58 = local48.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(74) Method local74 = local45.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local58.invoke(local74, Boolean.TRUE);
				local74.invoke(Runtime.getRuntime(), arg1, local26.getPath());
				local58.invoke(local74, Boolean.FALSE);
				Static514.aHashtable7.put(arg0, arg1);
				return true;
			} catch (@Pc(117) NoSuchMethodException local117) {
				System.load(local26.getPath());
				Static514.aHashtable7.put(arg0, mi.class);
				return true;
			} catch (@Pc(135) Throwable local135) {
			}
		}
		return false;
	}
}
