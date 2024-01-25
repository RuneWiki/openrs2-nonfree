import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "[Lclient!oh;")
	public static Class220[] aClass220Array7;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "Lclient!bg;")
	public static final Class28 aClass28_12 = new Class28();

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "[I")
	public static final int[] anIntArray502 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!aba", name = "x", descriptor = "I")
	public static int anInt6709 = 0;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BII)Z")
	public static boolean method5492(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static431.method6139(arg0, arg1) || Static311.method5050(arg0, arg1);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class108 local13 = local7.aClass108_1; local13 != null; local13 = local13.aClass108_3) {
			@Pc(17) Class15_Sub2 local17 = local13.aClass15_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort110 == arg1 && local17.aShort109 == arg2) {
				Static223.method3541(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lclient!nu;")
	public static Class214 method5498(@OriginalArg(0) Component arg0) {
		try {
			@Pc(29) Constructor local29 = Class.forName("Class214_Sub2").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class214) local29.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(47) Throwable local47) {
			return new Class214_Sub1(arg0, true);
		}
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
	public static void method5500() {
		Static412.method5990();
		Static206.method4278(Static300.aClass5_Sub28_Sub1_1.aBoolean338);
		Static164.aClass146_1 = Static542.method7399(22050, 0, Static159.aClass9_10, Static209.aCanvas6);
		Static164.aClass146_1.method5761(Static336.aClass5_Sub15_Sub4_3);
		Static301.aClass146_2 = Static542.method7399(2048, 1, Static159.aClass9_10, Static209.aCanvas6);
		Static301.aClass146_2.method5761(Static373.aClass5_Sub15_Sub2_1);
	}
}
