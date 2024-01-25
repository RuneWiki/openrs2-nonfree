import java.awt.Canvas;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hea", name = "lc", descriptor = "I")
	public static int anInt8345;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!r;)V")
	public static void method6744(@OriginalArg(1) Class134 arg0) {
		if (Static86.aClass353_10.method7682() == 0) {
			return;
		}
		@Pc(25) Class1_Sub4 local25;
		if (Static113.anInt2222 == 0) {
			for (local25 = (Class1_Sub4) Static86.aClass353_10.method7677(); local25 != null; local25 = (Class1_Sub4) Static86.aClass353_10.method7687()) {
				Static175.aClass114_4.method2209(local25.anInt216, local25.aBoolean21 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null, false, local25.anInt217, local25.anInt218, arg0, arg0, Static28.aClass64_1, local25.anInt212, local25.anInt214, false);
				local25.method7859();
			}
			Static164.method7470();
			return;
		}
		if (Static503.aClass134_14 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static503.aClass134_14 = Static441.method6960(Static584.anInterface7_12, local72, Static398.aClass270_78, 0, 0);
			Static348.aClass64_10 = Static503.aClass134_14.method6899(Static358.method4885(Static412.aClass270_85, Static480.anInt8096), Static601.method2079(Static463.aClass270_98, Static480.anInt8096));
		}
		for (local25 = (Class1_Sub4) Static86.aClass353_10.method7677(); local25 != null; local25 = (Class1_Sub4) Static86.aClass353_10.method7687()) {
			Static175.aClass114_4.method2209(local25.anInt216, local25.aBoolean21 ? Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aClass190_1 : null, false, local25.anInt217, local25.anInt218, Static503.aClass134_14, arg0, Static348.aClass64_10, local25.anInt212, local25.anInt214, false);
			local25.method7859();
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIII[BI)V")
	public static void method6776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		arg0 += arg3;
		@Pc(24) int local24 = arg1 - arg3 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg3 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(36) int local36 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg2[local36] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg2[local41] = 1;
			arg0 = local46 + 1;
			arg2[local46] = 1;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/String;)Z")
	public static boolean method6838(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static134.aHashtable1.get(arg1);
		if (local8 != null) {
			return local8.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static393.aHashtable6.get(arg1);
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
				Static134.aHashtable1.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static134.aHashtable1.put(arg1, hq.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}
}
