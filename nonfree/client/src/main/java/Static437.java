import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pha", name = "o", descriptor = "I")
	public static int anInt7179;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z")
	public static boolean method6295(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class local8 = (Class) Static621.aHashtable7.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(25) File local25 = null;
		if (local25 == null) {
			local25 = (File) Static184.aHashtable2.get(arg1);
		}
		if (local25 != null) {
			try {
				local25 = new File(local25.getCanonicalPath());
				@Pc(43) Class local43 = Class.forName("java.lang.Runtime");
				@Pc(46) Class local46 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(56) Method local56 = local46.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(72) Method local72 = local43.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local56.invoke(local72, Boolean.TRUE);
				local72.invoke(Runtime.getRuntime(), arg0, local25.getPath());
				local56.invoke(local72, Boolean.FALSE);
				Static621.aHashtable7.put(arg1, arg0);
				return true;
			} catch (@Pc(115) NoSuchMethodException local115) {
				System.load(local25.getPath());
				Static621.aHashtable7.put(arg1, fha.class);
				return true;
			} catch (@Pc(133) Throwable local133) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIIII)V")
	public static void method6296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static509.anInt8223; local5++) {
			@Pc(10) Rectangle local10 = Class2_Sub18.aRectangleArray1[local5];
			if (local10.x + local10.width > arg3 && arg1 + arg3 > local10.x && local10.y + local10.height > arg0 && local10.y < arg2 + arg0) {
				Static377.aBooleanArray14[local5] = true;
			}
		}
		Static103.method1953(arg0, arg1 + arg3, arg3, arg0 + arg2);
	}

	@OriginalMember(owner = "client!pha", name = "b", descriptor = "(IIIII)V")
	public static void method6297(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class2_Sub7_Sub2 local10 = Static188.method3210(10, arg1);
		local10.method925();
		local10.anInt855 = arg0;
		local10.anInt852 = arg2;
		local10.anInt858 = arg3;
	}
}
