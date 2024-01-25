import java.awt.Canvas;
import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	public static int anInt8325;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!fc;")
	public static Class100 aClass100_13;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "F")
	public static float aFloat148;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!qg;")
	public static final Class286 aClass286_9 = new Class286();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_89 = new Class46(58, 8);

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[6][];

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
	public static int anInt8329 = 500;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_142 = new Class337(28, 4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
	public static void method7250(@OriginalArg(1) int arg0) {
		Static152.aLong77 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILjava/awt/Canvas;ZLclient!d;ILclient!la;)Lclient!ha;")
	public static synchronized Class133 method7280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Canvas arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class207 arg6) {
		if (arg0 == 0) {
			return Static336.method5075(arg5, arg3, arg4, arg2);
		} else if (arg0 == 2) {
			return Static510.method8534(arg4, arg5, arg3, arg2);
		} else if (arg0 == 1) {
			return Static53.method911(arg1, arg4, arg3);
		} else if (arg0 == 5) {
			return Static323.method4917(arg3, arg6, arg1, arg4);
		} else if (arg0 == 3) {
			return Static650.method3594(arg6, arg3, arg1, arg4);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lclient!ab;")
	public static Class3 method7294(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class3_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class3) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class3_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[F)[F")
	public static float[] method7301(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static652.method4543(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(CI)I")
	public static int method7306(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && arg0 < Class230.anIntArray314.length ? Class230.anIntArray314[arg0] : -1;
	}
}
