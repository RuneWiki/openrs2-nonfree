import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	public static int anInt1404;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_2 = new Class94();

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
	public static boolean aBoolean102 = false;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method1426(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(13) Class local13 = (Class) Static162.aHashtable3.get(arg0);
		if (local13 != null) {
			return local13.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static590.aHashtable6.get(arg0);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg1, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static162.aHashtable3.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static162.aHashtable3.put(arg0, ou.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method1428(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZFIIIIII)[I")
	public static int[] method1429(@OriginalArg(1) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class3_Sub9_Sub7 local10 = new Class3_Sub9_Sub7();
		local10.anInt2251 = 35;
		local10.anInt2253 = 4;
		local10.anInt2261 = 8;
		local10.anInt2252 = 8;
		local10.aBoolean186 = true;
		local10.anInt2250 = (int) (arg0 * 4096.0F);
		local10.method9163();
		Static230.method3909(2048, 1);
		local10.method2076(local6, 0);
		return local6;
	}
}
