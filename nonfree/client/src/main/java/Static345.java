import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nu", name = "x", descriptor = "Lclient!xa;")
	public static Class4 aClass4_19;

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "[I")
	public static final int[] anIntArray530 = new int[13];

	@OriginalMember(owner = "client!nu", name = "A", descriptor = "J")
	public static long aLong160 = 0L;

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
	public static int anInt6135 = 0;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method5200(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static219.aHashtable3.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(33) File local33 = (File) Static144.aHashtable2.get(arg1);
		if (local33 != null) {
			try {
				local33 = new File(local33.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local33.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static219.aHashtable3.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local33.getPath());
				Static219.aHashtable3.put(arg1, ai.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IZ)V")
	public static void method5202() {
		Static136.method2051(Static479.aClass160_125);
		for (@Pc(17) Class6_Sub31 local17 = (Class6_Sub31) Static564.aClass212_39.method5099(); local17 != null; local17 = (Class6_Sub31) Static564.aClass212_39.method5103()) {
			if (!local17.method7848()) {
				local17 = (Class6_Sub31) Static564.aClass212_39.method5099();
				if (local17 == null) {
					break;
				}
			}
			if (local17.anInt4562 == 0) {
				Static160.method2336(true, true, local17);
			}
		}
		if (Static473.aClass97_13 != null) {
			Static390.method5794(Static473.aClass97_13);
			Static473.aClass97_13 = null;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	public static void method5203() {
		Static246.aClass121_7.method7137(Static2.aFloat3, Static236.aFloat55, Static334.aFloat135);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lclient!tk;Z)I")
	public static int method5204(@OriginalArg(0) Class305 arg0) {
		if (arg0 == Static67.aClass305_1) {
			return 5890;
		} else if (arg0 == Static121.aClass305_2) {
			return 34167;
		} else if (arg0 == Static197.aClass305_3) {
			return 34168;
		} else if (Static257.aClass305_4 == arg0) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method5205(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
