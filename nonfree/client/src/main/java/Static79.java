import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "Lclient!eda;")
	public static Class90 aClass90_29;

	@OriginalMember(owner = "client!cw", name = "q", descriptor = "Lclient!lq;")
	public static Class202 aClass202_1;

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!qj;")
	public static final Class277 aClass277_2 = new Class277(0, 8);

	@OriginalMember(owner = "client!cw", name = "j", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_28 = new Class90(34, 6);

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!du;")
	public static Class83 method1615(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class83_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class83) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class83_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(III)V")
	public static void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static173.method2881(local7.aClass21_Sub1_Sub2_1);
		Static173.method2881(local7.aClass21_Sub1_Sub2_2);
		if (local7.aClass21_Sub1_Sub2_1 != null) {
			local7.aClass21_Sub1_Sub2_1 = null;
		}
		if (local7.aClass21_Sub1_Sub2_2 != null) {
			local7.aClass21_Sub1_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(II)Lclient!gi;")
	public static Class126 method1620(@OriginalArg(0) int arg0) {
		@Pc(15) Class126 local15 = (Class126) Static5.aClass167_1.method3966((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static382.aClass348_89.method7964(arg0, 0);
		local15 = new Class126();
		if (local27 != null) {
			local15.method2772(new Class4_Sub13(local27));
		}
		local15.method2771();
		Static5.aClass167_1.method3974((long) arg0, local15);
		return local15;
	}
}
