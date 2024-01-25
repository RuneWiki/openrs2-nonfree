import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array27;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "Lclient!lh;")
	public static Class58 aClass58_4;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
	public static void method4466() {
		Static142.method2486();
		Static336.method5335(Static281.aClass2_Sub19_Sub1_1.aBoolean195);
		Static281.aClass104_1 = Static501.method7373(Static531.aClass283_6, 0, Static517.aCanvas14, 22050);
		Static281.aClass104_1.method7813(Static217.aClass2_Sub12_Sub1_1);
		Static465.aClass104_2 = Static501.method7373(Static531.aClass283_6, 1, Static517.aCanvas14, 2048);
		Static465.aClass104_2.method7813(Static288.aClass2_Sub12_Sub2_5);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIII)V")
	public static void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static537.anInt9322 = arg2;
		Static68.anInt1456 = arg1;
		Static284.anInt9395 = arg3;
		Static269.anInt4939 = arg0;
		Static274.anInt4992 = arg4;
		if (Static537.anInt9322 >= 100) {
			@Pc(30) int local30 = Static274.anInt4992 * 128 + 64;
			@Pc(36) int local36 = Static68.anInt1456 * 128 + 64;
			@Pc(44) int local44 = Static200.method3233(Static208.anInt3742, local30, local36) - Static269.anInt4939;
			@Pc(49) int local49 = local30 - Static187.anInt3432;
			@Pc(54) int local54 = local44 - Static329.anInt3848;
			@Pc(59) int local59 = local36 - Static353.anInt5258;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static209.anInt3769 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static429.anInt7997 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			if (Static209.anInt3769 < 1024) {
				Static209.anInt3769 = 1024;
			}
			Static344.anInt6362 = 0;
			if (Static209.anInt3769 > 3072) {
				Static209.anInt3769 = 3072;
			}
		}
		Static427.anInt7875 = 2;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ps;I)Lclient!rf;")
	public static Class116_Sub4 method4469(@OriginalArg(0) Class2_Sub29 arg0) {
		return new Class116_Sub4(arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5231(), arg0.method5210(), arg0.method5210(), arg0.method5170());
	}
}
