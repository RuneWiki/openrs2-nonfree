import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static383 {

	@OriginalMember(owner = "client!lma", name = "e", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_8 = new Class344(6, 7);

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "(Lclient!ee;)V")
	public static void method5136(@OriginalArg(0) Class9_Sub1 arg0) {
		Static404.aClass22_6.H(arg0.anInt10694, arg0.anInt10690 + (arg0.method9081() >> 1), arg0.anInt10695, Static394.anIntArray469);
		arg0.anInt10686 = Static394.anIntArray469[0];
		arg0.anInt10697 = Static394.anIntArray469[1];
		arg0.anInt10693 = Static394.anIntArray469[2];
	}

	@OriginalMember(owner = "client!lma", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub16_1.method5404() != 0 && arg4 != 0 && Static385.anInt5974 < 50 && arg3 != -1) {
			Static149.aClass398Array1[Static385.anInt5974++] = new Class398((byte) 1, arg3, arg4, arg5, arg0, arg1, arg2, (Class9_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!lma", name = "c", descriptor = "(I)V")
	public static void method5139() {
		if (Static74.anInt1708 != 0) {
			Static265.aClass292_3.method6852();
			Static55.method1309();
			Static27.method978();
		}
	}

	@OriginalMember(owner = "client!lma", name = "b", descriptor = "(I)V")
	public static void method5140() {
		Static385.anInt5974 = 0;
		Static149.aClass398Array1 = new Class398[50];
	}
}
