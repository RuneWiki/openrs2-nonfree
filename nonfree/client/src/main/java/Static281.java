import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
	public static int anInt5279;

	@OriginalMember(owner = "client!lo", name = "Y", descriptor = "[Lclient!ha;")
	public static Class2[] aClass2Array8;

	@OriginalMember(owner = "client!lo", name = "E", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_55 = new Class37();

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILclient!jq;B)V")
	public static void method4559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2) {
		Static537.anInt9065 = arg1;
		Static263.aClass156_10 = arg2;
		Static414.anInt7301 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method4560(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static88.aHashtable1.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(31) File local31 = (File) Static341.aHashtable5.get(arg1);
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
				Static88.aHashtable1.put(arg1, arg0);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local31.getPath());
				Static88.aHashtable1.put(arg1, dba.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!jj;I)V")
	public static void method4562(@OriginalArg(1) Class1_Sub6_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static103.anInt2066 = 0;
		Static150.aBoolean180 = false;
		Static101.method6347(arg0);
		Static448.method6399(arg0);
		if (Static150.aBoolean180) {
			System.out.println("---endgpp---");
		}
		if (arg1 != arg0.anInt4555) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt4555 + " psize:" + arg1);
		}
	}
}
