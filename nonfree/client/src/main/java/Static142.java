import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Z")
	public static boolean method3162(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		@Pc(8) Class local8 = (Class) Static595.aHashtable12.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(33) File local33 = null;
		if (local33 == null) {
			local33 = (File) Static173.aHashtable13.get(arg0);
		}
		if (local33 != null) {
			try {
				local33 = new File(local33.getCanonicalPath());
				@Pc(51) Class local51 = Class.forName("java.lang.Runtime");
				@Pc(54) Class local54 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(64) Method local64 = local54.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(80) Method local80 = local51.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local64.invoke(local80, Boolean.TRUE);
				local80.invoke(Runtime.getRuntime(), arg1, local33.getPath());
				local64.invoke(local80, Boolean.FALSE);
				Static595.aHashtable12.put(arg0, arg1);
				return true;
			} catch (@Pc(123) NoSuchMethodException local123) {
				System.load(local33.getPath());
				Static595.aHashtable12.put(arg0, ws.class);
				return true;
			} catch (@Pc(141) Throwable local141) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIBIII)Z")
	public static boolean method3163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 + arg5;
		@Pc(11) int local11 = arg1 + arg3;
		@Pc(15) int local15 = arg0 + arg4;
		if (!Static531.method7550(local11, arg5, local7, local11, arg4, arg5, local15, local11, local15)) {
			return false;
		} else if (Static531.method7550(local11, local7, local7, local11, arg4, arg5, arg4, local11, local15)) {
			if (arg5 < Static452.anInt8205) {
				if (!Static531.method7550(local11, arg5, arg5, arg3, local15, arg5, arg4, local11, local15)) {
					return false;
				}
				if (!Static531.method7550(local11, arg5, arg5, arg3, local15, arg5, arg4, arg3, arg4)) {
					return false;
				}
			} else if (!Static531.method7550(local11, local7, local7, arg3, local15, local7, arg4, local11, local15)) {
				return false;
			} else if (!Static531.method7550(local11, local7, local7, arg3, local15, local7, arg4, arg3, arg4)) {
				return false;
			}
			if (arg4 < Static576.anInt9705) {
				if (!Static531.method7550(local11, arg5, local7, arg3, arg4, arg5, arg4, local11, arg4)) {
					return false;
				}
				if (!Static531.method7550(local11, local7, local7, arg3, arg4, arg5, arg4, arg3, arg4)) {
					return false;
				}
			} else if (!Static531.method7550(local11, arg5, local7, arg3, local15, arg5, local15, local11, local15)) {
				return false;
			} else if (!Static531.method7550(local11, local7, local7, arg3, local15, arg5, local15, arg3, local15)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)V")
	public static void method3164(@OriginalArg(1) int arg0) {
		if (Static331.anInt6610 == 1) {
			Static520.anInt9063 = arg0;
		} else if (Static331.anInt6610 == 2) {
			Static30.anInt570 = arg0;
		}
	}
}
