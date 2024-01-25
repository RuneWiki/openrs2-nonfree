import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "Lclient!oaa;")
	public static Class224 aClass224_5;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public static int anInt2867;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "[I")
	public static int[] anIntArray283;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	public static int anInt2878;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Z")
	public static boolean aBoolean217 = false;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	public static int anInt2875 = 0;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method2448(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class local13 = (Class) Static426.aHashtable5.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(31) File local31 = (File) Static497.aHashtable6.get(arg1);
		if (local31 != null) {
			try {
				local31 = new File(local31.getCanonicalPath());
				@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
				@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local55.invoke(local71, Boolean.TRUE);
				local71.invoke(Runtime.getRuntime(), arg0, local31.getPath());
				local55.invoke(local71, Boolean.FALSE);
				Static426.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local31.getPath());
				Static426.aHashtable5.put(arg1, lo.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBI)I")
	public static int method2452(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = arg1 & 0x1 | local12 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
