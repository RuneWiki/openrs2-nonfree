import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "Lclient!ib;")
	public static Class5_Sub23 aClass5_Sub23_8;

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread6;

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZLjava/awt/Component;)Lclient!ej;")
	public static Class107 method8143(@OriginalArg(2) Component arg0) {
		try {
			@Pc(28) Constructor local28 = Class.forName("gp").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class107) local28.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(46) Throwable local46) {
			return new Class107_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
	public static void method8144(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class73 local8 = Static506.method9206(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray31 != null) {
			@Pc(19) Class5_Sub3 local19 = new Class5_Sub3();
			local19.anInt325 = arg3;
			local19.anObjectArray1 = local8.anObjectArray31;
			local19.aClass73_1 = local8;
			local19.aString8 = arg0;
			Static173.method2520(local19);
		}
		if (Static107.anInt1746 != 10 || !Static81.method1252(local8).method7126(arg3 - 1)) {
			return;
		}
		@Pc(74) Class5_Sub50 local74;
		if (arg3 == 1) {
			local74 = Static457.method6722(Static300.aClass387_57, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 2) {
			local74 = Static457.method6722(Static526.aClass387_97, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 3) {
			local74 = Static457.method6722(Static646.aClass387_91, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 4) {
			local74 = Static457.method6722(Static669.aClass387_128, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 5) {
			local74 = Static457.method6722(Static226.aClass387_44, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 6) {
			local74 = Static457.method6722(Static315.aClass387_58, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 7) {
			local74 = Static457.method6722(Static448.aClass387_80, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 8) {
			local74 = Static457.method6722(Static662.aClass387_126, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 9) {
			local74 = Static457.method6722(Static419.aClass387_76, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
		if (arg3 == 10) {
			local74 = Static457.method6722(Static75.aClass387_20, Static80.aClass313_1);
			Static546.method8410(arg1, local74, arg2, local8.anInt1419);
			Static494.method7120(local74);
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIIIIB)V")
	public static void method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static291.anInt5067 = arg3;
		Static455.anInt7797 = arg4;
		Static330.anInt5899 = arg2;
		Static674.anInt10793 = arg5;
		Static361.anInt6291 = arg0;
		Static65.anInt1064 = arg1;
	}
}
