import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "I")
	public static int anInt3222;

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_75 = new Class150(76, -1);

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_50 = new Class40("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIB)Z")
	public static boolean method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)V")
	public static void method2864(@OriginalArg(0) int arg0) {
		@Pc(12) Class5_Sub2_Sub7 local12 = Static144.method2728(arg0, 1);
		local12.method1324();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method2865(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static144.aHashtable4.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = (File) Static540.aHashtable7.get(arg1);
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(42) Class local42 = Class.forName("java.lang.Runtime");
				@Pc(45) Class local45 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(55) Method local55 = local45.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(71) Method local71 = local42.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local55.invoke(local71, Boolean.TRUE);
				local71.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local55.invoke(local71, Boolean.FALSE);
				Static144.aHashtable4.put(arg1, arg0);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local26.getPath());
				Static144.aHashtable4.put(arg1, cr.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}
}
