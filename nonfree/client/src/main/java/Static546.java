import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "I")
	public static int anInt9536;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "F")
	public static float aFloat212;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
	public static boolean method7485(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class local13 = (Class) Static208.aHashtable5.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static94.aHashtable3.get(arg1);
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
				Static208.aHashtable5.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static208.aHashtable5.put(arg1, wl.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIIIBIZ)Z")
	public static boolean method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(13) int local13 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray512[0];
		@Pc(18) int local18 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anIntArray513[0];
		if (local13 < 0 || Static345.anInt6228 <= local13 || local18 < 0 || Static535.anInt9341 <= local18) {
			return false;
		} else if (arg2 >= 0 && arg2 < Static345.anInt6228 && arg0 >= 0 && Static535.anInt9341 > arg0) {
			@Pc(74) int local74 = Static544.method7464(arg4, arg5, arg2, arg6, Static499.anIntArray272, arg3, Static187.aClass220Array1[Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117], Static59.anIntArray44, local13, arg0, arg7, local18, Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668(), arg1);
			if (local74 < 1) {
				return false;
			}
			Static349.anInt6239 = Static59.anIntArray44[local74 - 1];
			Static262.anInt5041 = Static499.anIntArray272[local74 - 1];
			Static46.aBoolean102 = false;
			Static28.method333();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I")
	public static int method7487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static363.anIntArray261[arg1 & 0x3] : Static457.anIntArray472[arg1 & 0x3];
	}
}
