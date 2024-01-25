import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!lt;")
	public static Class179 aClass179_28;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_154 = new Class239(75, 1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!wca;I)V")
	public static void method6461(@OriginalArg(0) Class310 arg0) {
		if (!Static21.aBoolean31) {
			return;
		}
		if (arg0.anObjectArray32 != null) {
			@Pc(14) Class310 local14 = Static519.method7538(Static116.anInt2332, Static55.anInt970);
			if (local14 != null) {
				@Pc(20) Class2_Sub28 local20 = new Class2_Sub28();
				local20.anObjectArray2 = arg0.anObjectArray32;
				local20.aClass310_9 = local14;
				local20.aClass310_8 = arg0;
				Static258.method4037(local20);
			}
		}
		Static93.method1721(Static108.aClass243_27);
		Static381.aClass2_Sub29_Sub2_2.method5185(arg0.anInt9226);
		Static381.aClass2_Sub29_Sub2_2.method5217(Static357.anInt6796);
		Static381.aClass2_Sub29_Sub2_2.method5188(Static55.anInt970);
		Static381.aClass2_Sub29_Sub2_2.method5228(arg0.anInt9170);
		Static381.aClass2_Sub29_Sub2_2.method5204(Static116.anInt2332);
		Static381.aClass2_Sub29_Sub2_2.method5188(arg0.anInt9224);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
	public static void method6463(@OriginalArg(1) boolean arg0) {
		if (Static497.aClass173_2 != null) {
			Static497.aClass173_2.method7261();
			Static497.aClass173_2 = null;
		}
		Static528.anInt9122 = 0;
		Static209.method3332();
		Static53.method968();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static207.aClass99Array1[local19].method2648();
		}
		Static499.method7335(false);
		System.gc();
		Static198.method3201();
		Static294.anInt5419 = -1;
		Static539.aBoolean675 = false;
		Static195.method3163(true);
		Static46.anInt834 = 0;
		Static238.anInt4280 = 0;
		Static425.anInt6885 = 0;
		Static481.anInt8570 = 0;
		Static367.anInt6894 = 0;
		Static371.anInt6936 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static286.aClass132Array1.length; local62++) {
			Static286.aClass132Array1[local62] = null;
		}
		Static376.method5913();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static278.aClass1_Sub1_Sub2_Sub1Array1[local81] = null;
		}
		Static520.anInt1936 = 0;
		Static71.aClass127_13.method3204();
		Static61.anInt1174 = 0;
		Static357.aClass127_36.method3204();
		Static522.method7565();
		Static199.anInt3587 = 0;
		Static84.aClass302_1.method7515();
		Static435.method6665();
		Static363.method1120();
		Static374.aClass2_Sub51_1 = null;
		Static340.aLong160 = 0L;
		if (arg0) {
			Static301.method4738(11);
			return;
		}
		Static301.method4738(2);
		try {
			Static559.method6631("loggedout", Static531.aClass283_6.anApplet1);
		} catch (@Pc(133) Throwable local133) {
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIB)V")
	public static void method6464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 11);
		local8.method6968();
		local8.anInt8318 = arg0;
		local8.anInt8320 = arg2;
	}
}
