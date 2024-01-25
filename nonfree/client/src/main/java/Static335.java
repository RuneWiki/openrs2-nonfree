import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "Lclient!cb;")
	public static Class50 aClass50_95;

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)Z")
	public static boolean method5147(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IBIIII)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static361.method5315(arg4, arg2, arg0, arg1);
		} else if (Static361.anInt6317 <= arg2 - arg0 && Static651.anInt10267 >= arg0 + arg2 && Static128.anInt2200 <= arg4 - arg3 && arg4 + arg3 <= Static380.anInt6585) {
			Static639.method8466(arg3, arg2, arg1, arg4, arg0);
		} else {
			Static409.method5976(arg4, arg1, arg0, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
	public static void method5149() {
		Static96.aClass143_3.xa(((float) Static655.aClass5_Sub36_29.aClass2_Sub7_1.method3489() * 0.1F + 0.7F) * 1.1523438F);
		Static96.aClass143_3.ZA(Static326.anInt5966, 0.69921875F, 1.2F, (float) -200, -240.0F, -200.0F);
		Static96.aClass143_3.L(Static424.anInt7534, -1, 0);
		Static96.aClass143_3.method6249(Static403.aClass11_3);
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method5151(@OriginalArg(1) Class143 arg0) {
		if (Static614.aClass124_100.method2568() == 0) {
			return;
		}
		@Pc(26) Class5_Sub55 local26;
		if (Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 0) {
			for (local26 = (Class5_Sub55) Static614.aClass124_100.method2572(); local26 != null; local26 = (Class5_Sub55) Static614.aClass124_100.method2569()) {
				Static259.aClass135_1.method2774(local26.anInt10300, local26.anInt10298, local26.aBoolean751 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null, local26.anInt10303, false, arg0, false, Static383.aClass72_10, arg0, local26.anInt10299, local26.anInt10302);
				local26.method8829();
			}
			Static212.method3058();
			return;
		}
		if (Static385.aClass143_9 == null) {
			@Pc(73) Canvas local73 = new Canvas();
			local73.setSize(36, 32);
			Static385.aClass143_9 = Static553.method7615(0, Static498.aClass50_149, local73, Static218.anInterface3_3, 0);
			Static404.aClass72_11 = Static385.aClass143_9.method6194(Static253.method3556(Static253.aClass50_66, Static551.anInt9039), Static684.method7227(Static471.aClass50_136, Static551.anInt9039));
		}
		for (local26 = (Class5_Sub55) Static614.aClass124_100.method2572(); local26 != null; local26 = (Class5_Sub55) Static614.aClass124_100.method2569()) {
			Static259.aClass135_1.method2774(local26.anInt10300, local26.anInt10298, local26.aBoolean751 ? Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 : null, local26.anInt10303, false, Static385.aClass143_9, false, Static404.aClass72_11, arg0, local26.anInt10299, local26.anInt10302);
			local26.method8829();
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method5152(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static53.method3585(arg1.length - 1, 0, arg1, arg0);
	}
}
