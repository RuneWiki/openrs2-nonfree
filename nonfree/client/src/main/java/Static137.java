import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public static int anInt2718;

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "Lclient!ph;")
	public static Class138 aClass138_44;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!lf;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_6 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
	public static int anInt2717 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[I")
	public static int[] anIntArray223 = new int[2];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ph;I)V")
	public static void method2202(@OriginalArg(0) Class138 arg0) {
		Static191.aClass138_50 = arg0;
		Static189.anInt3778 = Static191.aClass138_50.method3365(16);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method2203(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static9.method2421();
		} else if (arg0 == 2) {
			Static80.method1223();
		} else if (arg0 == 3) {
			Static76.method1198();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!ph;I)V")
	public static void method2206(@OriginalArg(0) Class138 arg0) {
		Static296.anInt5600 = arg0.method3331("runes");
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ)I")
	public static int method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}
}
