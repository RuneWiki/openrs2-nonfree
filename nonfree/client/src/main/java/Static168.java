import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
	public static int anInt2972;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_10 = new Class320(2);

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	public static int anInt2983 = 0;

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_49 = new Class397(117, 2);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Z")
	public static boolean method2721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 || arg1 == 5;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ika;)Lclient!pa;")
	public static Class55_Sub4 method2727(@OriginalArg(1) Class3_Sub2 arg0) {
		return new Class55_Sub4(arg0.method2017(), arg0.method2017(), arg0.method2017(), arg0.method2017(), arg0.method2061(), arg0.method2061(), arg0.method2048(255));
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method2728() {
		for (@Pc(8) Class3_Sub7_Sub10 local8 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7644(); local8 != null; local8 = (Class3_Sub7_Sub10) Static419.aClass342_81.method7650()) {
			if (Static348.method4922(local8.anInt3913)) {
				Static144.method2454(local8);
			}
		}
		if (false) {
			anInt2983 = -65;
		}
	}
}
