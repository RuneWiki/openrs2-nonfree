import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public static int anInt2078;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Z")
	public static boolean method1722(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) {
		@Pc(13) Class local13 = (Class) Static442.aHashtable7.get(arg0);
		if (local13 != null) {
			return local13.getClassLoader() == arg1.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static10.aHashtable1.get(arg0);
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
				Static442.aHashtable7.put(arg0, arg1);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static442.aHashtable7.put(arg0, eea.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method1723() {
		Static446.method6667();
		Static86.method7758(Static32.aClass3_Sub41_3.aClass7_Sub5_1.method2834() == 1);
		Static189.aClass89_3 = Static505.method7344(Static617.aCanvas13, 0, 22050, Static48.aClass298_12);
		Static378.method5965(Static280.method4566((Class3_Sub3_Sub1) null));
		Static320.aClass89_5 = Static505.method7344(Static617.aCanvas13, 1, 2048, Static48.aClass298_12);
		Static320.aClass89_5.method4218(Static304.aClass3_Sub3_Sub3_3);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
	public static int method1724(@OriginalArg(1) int arg0) {
		@Pc(10) byte local10;
		if (arg0 > 12000) {
			local10 = 4;
			Static303.method7244();
		} else if (arg0 > 5000) {
			local10 = 3;
			Static407.method6323();
		} else if (arg0 > 2000) {
			local10 = 2;
			Static339.method915();
		} else {
			Static499.method7252();
			local10 = 1;
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != 2) {
			Static32.aClass3_Sub41_3.method6773(2, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
			Static230.method3973(2, false);
		}
		Static124.method2223();
		return local10;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "([BIB)[B")
	public static byte[] method1725(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[arg1];
		Static651.method749(arg0, 0, local14, 0, arg1);
		return local14;
	}
}
