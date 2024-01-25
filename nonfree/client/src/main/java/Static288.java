import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sd", name = "Vc", descriptor = "[I")
	public static int[] anIntArray503;

	@OriginalMember(owner = "client!sd", name = "Wc", descriptor = "I")
	public static int anInt5580;

	@OriginalMember(owner = "client!sd", name = "Zc", descriptor = "[I")
	public static int[] anIntArray504;

	@OriginalMember(owner = "client!sd", name = "Ec", descriptor = "I")
	public static int anInt5565 = 0;

	@OriginalMember(owner = "client!sd", name = "Gc", descriptor = "Lclient!gb;")
	public static final Class73 aClass73_1 = new Class73();

	@OriginalMember(owner = "client!sd", name = "Jc", descriptor = "I")
	public static int anInt5569 = 0;

	@OriginalMember(owner = "client!sd", name = "Uc", descriptor = "I")
	public static int anInt5579 = -1;

	@OriginalMember(owner = "client!sd", name = "Xc", descriptor = "I")
	public static final int anInt5581 = -11713997;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!mo;ILclient!mo;)V")
	public static void method4952(@OriginalArg(0) Class143 arg0, @OriginalArg(2) Class143 arg1) {
		Static183.aClass143_74 = arg0;
		Static310.aClass143_108 = arg1;
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(I)V")
	public static void method4954() {
		Static164.aClass14_Sub4_Sub2_3.method2557(36);
		Static164.aClass14_Sub4_Sub2_3.method2538(0);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method4958(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static28.aClass82_1);
		arg0.removeMouseMotionListener(Static28.aClass82_1);
		arg0.removeFocusListener(Static28.aClass82_1);
		Static85.anInt2084 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZIIII)V")
	public static void method4959(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static345.aLong213 = 0L;
		@Pc(13) int local13 = Static237.method4149();
		if (arg2 == 3 || local13 == 3) {
			arg0 = true;
		}
		if (!Static218.aClass46_5.method5088()) {
			arg0 = true;
		}
		Static345.method5872(arg0, arg3, arg1, arg2, local13);
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(I)Lclient!ok;")
	public static Class72 method4961() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}
}
