import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "Lclient!pc;")
	public static Class196 aClass196_3;

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "S")
	public static short aShort17 = 1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIII)V")
	public static void method586(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static247.aClass4_Sub9_Sub2_2.method5047(arg0);
		Static247.aClass4_Sub9_Sub2_2.method5018(arg2);
		Static247.aClass4_Sub9_Sub2_2.method5053(arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ya;Lclient!hd;B)V")
	public static void method587(@OriginalArg(0) Class135 arg0, @OriginalArg(1) Class110 arg1) {
		@Pc(36) boolean local36 = Static416.aClass64_2.method1364(arg1.anInt2661 | 0xFF000000, arg1.anInt2610, arg1.anInt2616, arg1.aBoolean183 ? Static401.aClass8_Sub3_Sub1_Sub1_2.aClass60_1 : null, arg0, arg1.anInt2588, arg1.anInt2628) == null;
		if (local36) {
			Static388.aClass244_38.method5273(new Class4_Sub19(arg1.anInt2588, arg1.anInt2610, arg1.anInt2616, arg1.anInt2661 | 0xFF000000, arg1.anInt2628, arg1.aBoolean183));
			Static118.method1693(arg1);
		}
	}
}
