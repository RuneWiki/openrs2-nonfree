import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt3229;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
	public static int anInt3230;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_52 = new Class194(48, 7);

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "[S")
	public static short[] aShortArray38 = new short[256];

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!tt;[III[II)Lclient!of;")
	public static Class97_Sub2 method2594(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg3 * arg2];
		for (@Pc(12) int local12 = 0; local12 < arg3; local12++) {
			@Pc(22) int local22 = arg1[local12] + arg2 * local12;
			for (@Pc(24) int local24 = 0; local24 < arg4[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class97_Sub2(arg0, arg2, arg3, local10);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!hd;")
	public static Class66 method2595(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class66_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class66) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class66_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method2596() {
		if (Static320.aClass268_7 == null) {
			return;
		}
		if (Static320.aClass268_7.anInt7420 == 1) {
			Static320.aClass268_7 = null;
			return;
		}
		if (Static320.aClass268_7.anInt7420 == 2) {
			Static3.method38(2, Static110.aString15, Static431.aClass93_5);
			Static320.aClass268_7 = null;
			return;
		}
	}
}
