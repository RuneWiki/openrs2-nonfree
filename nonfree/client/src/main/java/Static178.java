import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "Lclient!hc;")
	public static Class51 aClass51_59;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "Z")
	public static boolean aBoolean200 = false;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "[I")
	public static int[] anIntArray306 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	public static void method3051(@OriginalArg(1) int arg0) {
		Static13.anIntArray45 = new int[arg0];
		Static101.anIntArray200 = new int[arg0];
		Static212.anIntArray355 = new int[arg0];
		Static86.anIntArray179 = new int[arg0];
		Static4.anIntArray5 = new int[arg0];
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZI)I")
	public static int method3052(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ql;B)V")
	public static void method3053(@OriginalArg(0) Class1_Sub13 arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static32.anInt932; local8++) {
			@Pc(14) int local14 = arg0.method1780();
			@Pc(18) int local18 = arg0.method1764();
			if (local18 == 65535) {
				local18 = -1;
			}
			if (Static62.aClass115_Sub1Array2[local14] != null) {
				Static62.aClass115_Sub1Array2[local14].anInt4591 = local18;
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method3055(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static40.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static240.aClass147_1);
		arg0.addFocusListener(Static240.aClass147_1);
	}
}
