import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	public static int anInt6296;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_36 = new Class265(5);

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_37 = new Class265(8);

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
	public static boolean aBoolean457 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method5289() {
		if (Static539.anInt8853 == 7) {
			Static162.method6698(false);
		} else {
			Static616.aClass240_32 = Static537.aClass240_34;
			Static537.aClass240_34 = null;
			Static42.method560(13);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!pb;I)Z")
	public static boolean method5291(@OriginalArg(0) Class267 arg0) {
		return arg0 == Static206.aClass267_4 || arg0 == Static67.aClass267_1 || Static619.aClass267_7 == arg0 || Static578.aClass267_6 == arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Z")
	public static boolean method5294(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(13) Class local13 = (Class) Static552.aHashtable37.get(arg0);
		if (local13 != null) {
			return local13.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static621.aHashtable35.get(arg0);
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
				Static552.aHashtable37.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static552.aHashtable37.put(arg0, jia.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z")
	public static boolean method5299() {
		if (Static480.aClass5_Sub2_Sub13_4 == null) {
			return false;
		} else {
			if (Static480.aClass5_Sub2_Sub13_4.anInt6711 >= 2000) {
				Static480.aClass5_Sub2_Sub13_4.anInt6711 -= 2000;
			}
			return Static480.aClass5_Sub2_Sub13_4.anInt6711 == 1009;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)Lclient!dd;")
	public static Class5_Sub16 method5300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class5_Sub16 local5 = null;
		if (arg1 == 0) {
			local5 = Static455.method6717(Static175.aClass187_41, Static16.aClass332_8);
		}
		if (arg1 == 1) {
			local5 = Static455.method6717(Static637.aClass187_105, Static16.aClass332_8);
		}
		local5.aClass5_Sub15_Sub2_1.method3640(Static176.aClass157_1.method3300(82) ? 1 : 0);
		local5.aClass5_Sub15_Sub2_1.method3632(arg0 + Static454.anInt7910);
		local5.aClass5_Sub15_Sub2_1.method3632(arg2 + Static48.anInt750);
		Static390.aBoolean744 = false;
		Static154.anInt2536 = arg2;
		Static443.anInt7790 = arg0;
		Static394.method5730();
		return local5;
	}
}
