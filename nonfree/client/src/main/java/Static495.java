import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Z")
	public static boolean method7452(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(13) Class local13 = (Class) Static197.aHashtable4.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(31) File local31 = (File) Static524.aHashtable7.get(arg1);
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
				Static197.aHashtable4.put(arg1, arg0);
				return true;
			} catch (@Pc(114) NoSuchMethodException local114) {
				System.load(local31.getPath());
				Static197.aHashtable4.put(arg1, tw.class);
				return true;
			} catch (@Pc(132) Throwable local132) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZI)Z")
	public static boolean method7453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static63.method1064(arg0, arg1) || Static515.method7276(arg1, arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!eh;)Lclient!sd;")
	public static Class301 method7461(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(7) Class301 local7 = new Class301();
		local7.anInt8051 = arg0.method5982();
		local7.aClass4_Sub7_Sub16_1 = Static320.aClass363_1.method8038(local7.anInt8051);
		return local7;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)Z")
	public static boolean method7463(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static426.aCharArray8[local7 - 128] != '\u0000';
		}
	}
}
