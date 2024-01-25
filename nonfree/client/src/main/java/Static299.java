import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!jd;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!iq;")
	public static Class104 aClass104_153;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Lclient!kr;")
	public static Class46 aClass46_22;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "[I")
	public static final int[] anIntArray459 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIZLjava/awt/Canvas;Lclient!sc;Lclient!ec;)Lclient!dr;")
	public static Class37 method5042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) Class179 arg3, @OriginalArg(5) Interface3 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class37_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, ec.class, Integer.TYPE, Integer.TYPE, sc.class);
			return (Class37) local57.newInstance(arg2, arg4, Integer.valueOf(arg0), new Integer(arg1), arg3);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5046(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static323.method5332(Static223.method4182(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)V")
	public static void method5048(@OriginalArg(1) int arg0) {
		Static328.anInt6685 = 100;
		Static286.anInt5744 = -1;
		Static314.anInt6200 = 3;
		Static308.anInt6109 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)Lclient!of;")
	public static Class6 method5050() {
		try {
			return new Class6_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class6_Sub2();
			}
		}
	}
}
