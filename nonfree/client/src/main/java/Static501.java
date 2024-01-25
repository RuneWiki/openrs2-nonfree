import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!pu", name = "d", descriptor = "Ljava/lang/Class;")
	private static Class aClass19;

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "[I")
	public static final int[] anIntArray467 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
	public static int anInt8589 = -60;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method7208(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static607.aHashtable6.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(24) File local24 = null;
		if (local24 == null) {
			local24 = (File) Static308.aHashtable4.get(arg0);
		}
		if (local24 != null) {
			try {
				local24 = new File(local24.getCanonicalPath());
				@Pc(51) Class local51 = Class.forName("java.lang.Runtime");
				@Pc(56) Class local56 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(68) Method local68 = local56.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(90) Method local90 = local51.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local68.invoke(local90, Boolean.TRUE);
				local90.invoke(Runtime.getRuntime(), arg1, local24.getPath());
				local68.invoke(local90, Boolean.FALSE);
				Static607.aHashtable6.put(arg0, arg1);
				return true;
			} catch (@Pc(133) NoSuchMethodException local133) {
				System.load(local24.getPath());
				Static607.aHashtable6.put(arg0, aClass19 == null ? (aClass19 = Class294.a("fg")) : aClass19);
				return true;
			} catch (@Pc(154) Throwable local154) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	public static void method7209() {
		Static510.aClass67_17.L(Static636.anInt10300, Static713.aClass3_Sub55_31.aClass15_Sub11_1.method4066() == 1 ? Static312.anInt5545 + 256 << 2 : -1, 0);
	}
}
