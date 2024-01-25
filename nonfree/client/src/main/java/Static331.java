import java.awt.Color;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z")
	public static boolean method7986(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static263.aHashtable5.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(29) File local29 = null;
		if (local29 == null) {
			local29 = (File) Static36.aHashtable3.get(arg1);
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
				Static263.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(119) NoSuchMethodException local119) {
				System.load(local29.getPath());
				Static263.aHashtable5.put(arg1, ofa.class);
				return true;
			} catch (@Pc(137) Throwable local137) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBILclient!is;)V")
	public static void method7987(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray23 != null) {
			@Pc(13) Class4_Sub37 local13 = new Class4_Sub37();
			local13.aClass155_10 = arg2;
			local13.anObjectArray31 = arg2.anObjectArray23;
			Static471.method6884(local13);
		}
		Static264.anInt5328 = arg1;
		Static494.anInt9306 = arg0;
		Static117.anInt2703 = arg2.anInt4752;
		Static231.anInt4893 = arg2.anInt4785;
		Static398.anInt7799 = arg2.anInt4746;
		Static430.aBoolean586 = true;
		Static286.anInt6126 = arg2.anInt4793;
		Static569.anInt7644 = arg2.anInt4765;
		Static368.method5060(arg2);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V")
	public static void method7992(@OriginalArg(0) int arg0) {
		Static315.anInt6308 = -1;
		Static465.anInt8867 = -1;
		Static43.anInt2490 = arg0;
		Static279.method4473();
	}
}
