import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "Lclient!c;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "Lclient!tn;")
	public static Class240 aClass240_5;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "Z")
	public static boolean aBoolean401 = false;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
	public static final int anInt6198 = 50;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[anInt6198];

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
	public static int anInt6194 = 0;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "[I")
	public static final int[] anIntArray601 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "[I")
	public static final int[] anIntArray602 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "[I")
	public static final int[] anIntArray603 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "[I")
	public static final int[] anIntArray604 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "[I")
	public static final int[] anIntArray605 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "K", descriptor = "[I")
	public static final int[] anIntArray606 = new int[anInt6198];

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public static void method4876() {
		Static294.aClass267_84.method6007(5);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!tu;")
	public static Class245 method4883(@OriginalArg(0) Component arg0) {
		return new Class245_Sub1(arg0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg3);
		@Pc(17) int local17 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg6);
		@Pc(23) int local23 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg4);
		@Pc(29) int local29 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg5);
		@Pc(37) int local37 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg0 + arg3);
		@Pc(46) int local46 = Static360.method4841(Static160.anInt3220, Static319.anInt5496, arg6 - arg0);
		for (@Pc(56) int local56 = local11; local56 < local37; local56++) {
			Static212.method3267(local23, local29, arg1, Class10_Sub10_Sub1.lb[local56]);
		}
		for (@Pc(76) int local76 = local17; local76 > local46; local76--) {
			Static212.method3267(local23, local29, arg1, Class10_Sub10_Sub1.lb[local76]);
		}
		@Pc(99) int local99 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg4 + arg0);
		@Pc(108) int local108 = Static360.method4841(Static146.anInt3034, Static115.anInt2362, arg5 - arg0);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Class10_Sub10_Sub1.lb[local110];
			Static212.method3267(local23, local99, arg1, local116);
			Static212.method3267(local99, local108, arg2, local116);
			Static212.method3267(local108, local29, arg1, local116);
		}
	}
}
