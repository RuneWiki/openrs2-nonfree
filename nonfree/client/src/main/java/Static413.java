import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method6771(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class local8 = (Class) Static609.aHashtable7.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static48.aHashtable1.get(arg1);
		}
		if (local29 != null) {
			try {
				local29 = new File(local29.getCanonicalPath());
				@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
				@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local60.invoke(local76, Boolean.TRUE);
				local76.invoke(Runtime.getRuntime(), arg0, local29.getPath());
				local60.invoke(local76, Boolean.FALSE);
				Static609.aHashtable7.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static609.aHashtable7.put(arg1, sw.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!ol;Z)Lclient!vba;")
	public static Class369 method6772(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(15) int local15 = arg0.method5211();
		return new Class369(local15);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method6773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
