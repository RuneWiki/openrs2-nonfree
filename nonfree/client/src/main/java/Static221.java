import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Z")
	public static boolean method3263(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) {
		@Pc(8) Class local8 = (Class) Static515.aHashtable6.get(arg0);
		if (local8 != null) {
			return local8.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(28) File local28 = null;
		if (local28 == null) {
			local28 = (File) Static502.aHashtable5.get(arg0);
		}
		if (local28 != null) {
			try {
				local28 = new File(local28.getCanonicalPath());
				@Pc(46) Class local46 = Class.forName("java.lang.Runtime");
				@Pc(49) Class local49 = Class.forName("java.lang.reflect.AccessibleObject");
				@Pc(59) Method local59 = local49.getDeclaredMethod("setAccessible", Boolean.TYPE);
				@Pc(75) Method local75 = local46.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
				local59.invoke(local75, Boolean.TRUE);
				local75.invoke(Runtime.getRuntime(), arg1, local28.getPath());
				local59.invoke(local75, Boolean.FALSE);
				Static515.aHashtable6.put(arg0, arg1);
				return true;
			} catch (@Pc(118) NoSuchMethodException local118) {
				System.load(local28.getPath());
				Static515.aHashtable6.put(arg0, jh.class);
				return true;
			} catch (@Pc(136) Throwable local136) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	public static void method3264() {
		if (Static239.aClass207_2.aBoolean399 && Static203.aClass382_2.anInt10282 != -1) {
			Static606.method7952(Static203.aClass382_2.anInt10282, Static203.aClass382_2.aString122);
		}
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
	public static void method3265() {
		@Pc(9) int local9;
		if (Static529.aClass292Array50 != null) {
			for (local9 = 0; local9 < Static530.anInt8208; local9++) {
				Static529.aClass292Array50[local9] = null;
			}
			Static529.aClass292Array50 = null;
		}
		if (Static220.aClass292Array62 != null) {
			for (local9 = 0; local9 < Static658.anInt10393; local9++) {
				Static220.aClass292Array62[local9] = null;
			}
			Static220.aClass292Array62 = null;
		}
		if (Static649.aClass292Array157 != null) {
			for (local9 = 0; local9 < Static1.anInt6849; local9++) {
				Static649.aClass292Array157[local9] = null;
			}
			Static649.aClass292Array157 = null;
		}
		Static581.anIntArray637 = null;
		Static233.anIntArrayArrayArray10 = null;
		Static441.aClass292Array170 = null;
		Static148.anInt2693 = -1;
		Static491.anInt7688 = -1;
	}
}
