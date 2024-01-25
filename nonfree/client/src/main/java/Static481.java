import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "[I")
	public static final int[] anIntArray636 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!qha", name = "B", descriptor = "Lclient!js;")
	public static final Class14_Sub29_Sub1 aClass14_Sub29_Sub1_2 = new Class14_Sub29_Sub1(15000);

	@OriginalMember(owner = "client!qha", name = "nb", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIIII)V")
	public static void method7124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static599.anInt6161; local3++) {
			@Pc(9) Rectangle local9 = Class334.aRectangleArray1[local3];
			if (local9.width + local9.x > arg3 && local9.x < arg3 + arg2 && local9.height + local9.y > arg1 && arg0 + arg1 > local9.y) {
				Static446.aBooleanArray18[local3] = true;
			}
		}
		Static357.method5407(arg3, arg1, arg0 + arg1, arg3 + arg2);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method7135(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class local13 = (Class) Static621.aHashtable8.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static32.aHashtable6.get(arg1);
		}
		if (local26 != null) {
			try {
				local26 = new File(local26.getCanonicalPath());
				@Pc(44) Class local44 = Class.forName("java.lang.Runtime");
				@Pc(47) Class local47 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(57) Method local57 = local47.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(73) Method local73 = local44.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local57.invoke(local73, Boolean.TRUE);
				local73.invoke(Runtime.getRuntime(), arg0, local26.getPath());
				local57.invoke(local73, Boolean.FALSE);
				Static621.aHashtable8.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static621.aHashtable8.put(arg1, aea.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
