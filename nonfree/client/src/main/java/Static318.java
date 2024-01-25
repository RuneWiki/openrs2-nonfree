import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kn", name = "eb", descriptor = "Lclient!fs;")
	public static Class134 aClass134_28;

	// $FF: synthetic field
	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
	public static int anInt5634 = 0;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
	public static int anInt5640 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method4841(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static648.aHashtable14.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(31) File local31 = null;
		if (local31 == null) {
			local31 = (File) Static357.aHashtable8.get(arg1);
		}
		if (local31 != null) {
			try {
				local31 = new File(local31.getCanonicalPath());
				@Pc(51) Class local51 = Class.forName("java.lang.Runtime");
				@Pc(56) Class local56 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(68) Method local68 = local56.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(90) Method local90 = local51.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local68.invoke(local90, Boolean.TRUE);
				local90.invoke(Runtime.getRuntime(), arg0, local31.getPath());
				local68.invoke(local90, Boolean.FALSE);
				Static648.aHashtable14.put(arg1, arg0);
				return true;
			} catch (@Pc(133) NoSuchMethodException local133) {
				System.load(local31.getPath());
				Static648.aHashtable14.put(arg1, aClass15 == null ? (aClass15 = Class203_Sub1.a("qi")) : aClass15);
				return true;
			} catch (@Pc(154) Throwable local154) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "(I)I")
	public static int method4842(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static193.anInt8198 - 1; local3++) {
			if (arg0 < Static464.anIntArray473[local3] + Static106.anIntArray92[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static193.anInt8198 - 1;
		}
		return local1;
	}
}
