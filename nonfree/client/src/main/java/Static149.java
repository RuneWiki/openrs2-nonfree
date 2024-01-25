import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!js", name = "Q", descriptor = "[Lclient!c;")
	public static Class5[] aClass5Array12;

	@OriginalMember(owner = "client!js", name = "T", descriptor = "Lclient!wo;")
	public static Class216 aClass216_54;

	@OriginalMember(owner = "client!js", name = "V", descriptor = "J")
	public static long aLong107;

	@OriginalMember(owner = "client!js", name = "O", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_106 = new Class34(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V")
	public static void method2980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static268.anInt5477 <= arg0 - arg3 && Static342.anInt3000 >= arg0 + arg3 && arg1 - arg3 >= Static197.anInt4211 && Static326.anInt2469 >= arg1 + arg3) {
			Static212.method4086(arg0, arg1, arg3, arg2);
		} else {
			Static141.method5358(arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(II)V")
	public static void method2982(@OriginalArg(0) int arg0) {
		Static300.anInt5956 = arg0;
		Static329.aClass87_59.method2485();
	}

	@OriginalMember(owner = "client!js", name = "d", descriptor = "(II)V")
	public static void method2983() {
		Static133.aClass87_27.method2473(5);
		Static237.aClass87_41.method2473(5);
	}

	@OriginalMember(owner = "client!js", name = "c", descriptor = "(Z)V")
	public static void method2984() {
		@Pc(1) Class87 local1 = Static314.aClass87_55;
		synchronized (Static314.aClass87_55) {
			Static314.aClass87_55.method2485();
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!wo;ILclient!wo;Lclient!wo;)V")
	public static void method2985(@OriginalArg(0) Class216 arg0, @OriginalArg(2) Class216 arg1, @OriginalArg(3) Class216 arg2) {
		Static144.aClass216_51 = arg2;
		Static73.method1689(arg0, arg1);
	}
}
