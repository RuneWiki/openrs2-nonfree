import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
	public static int anInt5369;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_61 = new Class303(48, 11);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(JJ)J")
	public static long method4620(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
	public static boolean method4621(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static10.aHashtable1.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(21) File local21 = null;
		if (local21 == null) {
			local21 = (File) Static487.aHashtable9.get(arg1);
		}
		if (local21 != null) {
			try {
				local21 = new File(local21.getCanonicalPath());
				@Pc(39) Class local39 = Class.forName("java.lang.Runtime");
				@Pc(42) Class local42 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(52) Method local52 = local42.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(68) Method local68 = local39.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local52.invoke(local68, Boolean.TRUE);
				local68.invoke(Runtime.getRuntime(), arg0, local21.getPath());
				local52.invoke(local68, Boolean.FALSE);
				Static10.aHashtable1.put(arg1, arg0);
				return true;
			} catch (@Pc(111) NoSuchMethodException local111) {
				System.load(local21.getPath());
				Static10.aHashtable1.put(arg1, qga.class);
				return true;
			} catch (@Pc(129) Throwable local129) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!fa;ILjava/awt/Canvas;)Lclient!r;")
	public static Class45 method4623(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Canvas arg1) {
		return new l(arg1, arg0);
	}
}
