import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	public static int anInt3237 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method2701(@OriginalArg(0) Class132 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static594.aBoolean693) {
			local7 = Static234.method3562();
			local9 = Static314.method4504();
		}
		Static49.method968(Static279.anInt4804, local9 + Static32.anInt784, Static643.anInt10391 + local7, arg0, Static122.anInt2157);
		Static51.aClass19_4.method6336(Static32.anInt784 + local9 + 14, -10660793, -1, local7 + Static643.anInt10391 + 3, Static52.aClass41_24.method1007(Static616.anInt10077));
		@Pc(63) int local63 = local7 + Static193.aClass128_1.method5191();
		@Pc(69) int local69 = local9 + Static193.aClass128_1.method5188();
		@Pc(73) int local73;
		@Pc(92) int local92;
		if (Static217.aBoolean218) {
			local73 = 0;
			for (@Pc(78) Class6_Sub4_Sub10 local78 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8910(); local78 != null; local78 = (Class6_Sub4_Sub10) Static258.aClass384_7.method8908()) {
				local92 = Static32.anInt784 + local9 + local73 * 16 + 31;
				if (local78.anInt5448 == 1) {
					Static503.method6620(Static643.anInt10391 + local7, local69, (Class6_Sub4_Sub12) local78.aClass384_11.aClass6_Sub4_62.aClass6_Sub4_67, local92, -1, -256, Static122.anInt2157, local63, Static279.anInt4804, arg0, Static32.anInt784 + local9);
				} else {
					Static229.method3319(local69, Static32.anInt784 + local9, local7 + Static643.anInt10391, arg0, local92, local63, -256, Static279.anInt4804, -1, Static122.anInt2157, local78);
				}
				local73++;
			}
			if (Static275.aClass6_Sub4_Sub10_1 != null) {
				Static49.method968(Static314.anInt5338, Static166.anInt2811, Static347.anInt10656, arg0, Static494.anInt8391);
				local73 = 0;
				Static51.aClass19_4.method6336(Static166.anInt2811 + 14, -10660793, -1, Static347.anInt10656 + 3, Static275.aClass6_Sub4_Sub10_1.aString71);
				for (@Pc(179) Class6_Sub4_Sub12 local179 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8910(); local179 != null; local179 = (Class6_Sub4_Sub12) Static275.aClass6_Sub4_Sub10_1.aClass384_11.method8908()) {
					@Pc(189) int local189 = local73 * 16 + Static166.anInt2811 + 31;
					local73++;
					Static503.method6620(Static347.anInt10656, local69, local179, local189, -1, -256, Static494.anInt8391, local63, Static314.anInt5338, arg0, Static166.anInt2811);
				}
				Static103.method1674(Static314.anInt5338, Static494.anInt8391, Static166.anInt2811, Static347.anInt10656);
			}
		} else {
			local73 = 0;
			for (@Pc(226) Class6_Sub4_Sub12 local226 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8538(); local226 != null; local226 = (Class6_Sub4_Sub12) Static31.aClass362_3.method8530()) {
				local92 = Static32.anInt784 + local9 + (-local73 + Static183.anInt3155 + -1) * 16 + 31;
				local73++;
				Static503.method6620(local7 + Static643.anInt10391, local69, local226, local92, -1, -256, Static122.anInt2157, local63, Static279.anInt4804, arg0, Static32.anInt784 + local9);
			}
		}
		Static103.method1674(Static279.anInt4804, Static122.anInt2157, local9 + Static32.anInt784, Static643.anInt10391 - -local7);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z")
	public static boolean method2702(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class local13 = (Class) Static189.aHashtable2.get(arg1);
		if (local13 != null) {
			return local13.getClassLoader() == arg0.getClassLoader();
		}
		@Pc(26) File local26 = null;
		if (local26 == null) {
			local26 = (File) Static136.aHashtable1.get(arg1);
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
				Static189.aHashtable2.put(arg1, arg0);
				return true;
			} catch (@Pc(116) NoSuchMethodException local116) {
				System.load(local26.getPath());
				Static189.aHashtable2.put(arg1, dv.class);
				return true;
			} catch (@Pc(134) Throwable local134) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
	public static void method2703() {
		@Pc(11) Class10 local11 = Static278.aClass10_58;
		synchronized (Static278.aClass10_58) {
			Static278.aClass10_58.method375();
		}
	}
}
