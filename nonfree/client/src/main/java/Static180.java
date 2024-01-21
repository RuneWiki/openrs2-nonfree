import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!w", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1477 = Static177.method3050("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!w", name = "V", descriptor = "[I")
	public static final int[] anIntArray432 = new int[100];

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_48 = new Class66(50);

	@OriginalMember(owner = "client!w", name = "ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1478 = Static177.method3050("Attack");

	@OriginalMember(owner = "client!w", name = "cb", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1479 = aClass46_1478;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)Lclient!jd;")
	public static Class46 method3091(@OriginalArg(1) int arg0) {
		return Static166.aClass46Array24[arg0].method1677() <= 0 ? Static83.aClass46Array15[arg0] : Static69.method1482(new Class46[] { Static83.aClass46Array15[arg0], Static122.aClass46_1083, Static166.aClass46Array24[arg0] });
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(III)V")
	public static void method3093(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static90.aClass4_Sub11_Sub1_1.method1285(138);
		Static90.aClass4_Sub11_Sub1_1.method1256(arg1);
		Static90.aClass4_Sub11_Sub1_1.method1260(arg0);
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(III)Z")
	public static boolean method3095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(25) Class4_Sub1_Sub19 local25 = Static113.method2090(arg0);
		return local25.method3188(arg1);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILjava/awt/Component;B)Lclient!id;")
	public static Class42 method3096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class42_Sub2");
			@Pc(10) Class42 local10 = (Class42) local6.getDeclaredConstructor().newInstance();
			local10.method3017(arg1, arg0, arg2);
			return local10;
		} catch (@Pc(27) Throwable local27) {
			@Pc(31) Class42_Sub1 local31 = new Class42_Sub1();
			local31.method3017(arg1, arg0, arg2);
			return local31;
		}
	}
}
