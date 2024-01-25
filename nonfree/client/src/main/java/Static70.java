import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cca", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method3127(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static393.aHashtable4.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(34) File local34 = null;
		if (local34 == null) {
			local34 = (File) Static687.aHashtable7.get(arg1);
		}
		if (local34 != null) {
			try {
				local34 = new File(local34.getCanonicalPath());
				@Pc(54) Class local54 = Class.forName("java.lang.Runtime");
				@Pc(59) Class local59 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(71) Method local71 = local59.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(93) Method local93 = local54.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local71.invoke(local93, Boolean.TRUE);
				local93.invoke(Runtime.getRuntime(), arg0, local34.getPath());
				local71.invoke(local93, Boolean.FALSE);
				Static393.aHashtable4.put(arg1, arg0);
				return true;
			} catch (@Pc(136) NoSuchMethodException local136) {
				System.load(local34.getPath());
				Static393.aHashtable4.put(arg1, aClass15 == null ? (aClass15 = Class3_Sub13.a("kla")) : aClass15);
				return true;
			} catch (@Pc(157) Throwable local157) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public static void method3129() {
		Static604.aClass214_3.method4925();
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)Z")
	public static boolean method3134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static275.method4891(arg0, arg1) & Static630.method8286(arg0, arg1);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZI)I")
	public static int method3137(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 1;
		@Pc(25) int local25 = local19 | local19 >>> 2;
		@Pc(31) int local31 = local25 | local25 >>> 4;
		@Pc(37) int local37 = local31 | local31 >>> 8;
		@Pc(43) int local43 = local37 | local37 >>> 16;
		return arg0 & ~local43;
	}
}
