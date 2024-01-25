import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "F")
	public static float aFloat35 = 0.0F;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!am;Lclient!am;BLclient!am;Lclient!am;)V")
	public static void method2736(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) Class11 arg3) {
		Static108.aClass11_48 = arg3;
		Static289.aClass11_127 = arg1;
		Static135.aClass11_62 = arg2;
		Static280.aClass11_122 = arg0;
		Static158.aClass72ArrayArray1 = new Class72[Static108.aClass11_48.method277()][];
		Static115.aBooleanArray17 = new boolean[Static108.aClass11_48.method277()];
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
	public static int method2737(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class4_Sub41 local19 = (Class4_Sub41) Static301.aClass198_34.method5261((long) arg0);
		if (local19 == null) {
			return Static223.method3818(arg0).anInt5604;
		}
		@Pc(36) int local36 = 0;
		for (@Pc(38) int local38 = 0; local38 < local19.anIntArray538.length; local38++) {
			if (local19.anIntArray538[local38] == -1) {
				local36++;
			}
		}
		return local36 + Static223.method3818(arg0).anInt5604 - local19.anIntArray538.length;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public static void method2738() {
		if (!Static247.aBoolean436) {
			return;
		}
		@Pc(19) Class72 local19 = Static289.method4934(Static301.anInt6084, Static58.anInt1259);
		if (local19 != null && local19.anObjectArray28 != null) {
			@Pc(28) Class4_Sub22 local28 = new Class4_Sub22();
			local28.anObjectArray34 = local19.anObjectArray28;
			local28.aClass72_12 = local19;
			Static97.method1756(local28);
		}
		Static247.aBoolean436 = false;
		Static23.anInt410 = -1;
		Static238.method4097(local19);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!am;Lclient!am;ZLclient!vm;)V")
	public static void method2739(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class92 arg2) {
		Static259.aClass106_8 = Static191.method3463(arg0, Static223.anInt4634);
		Static14.aClass78_1 = arg2.method4476(Static259.aClass106_8, Static367.method5454(arg1, Static223.anInt4634));
		Static232.aClass106_5 = Static191.method3463(arg0, Static202.anInt4261);
		Static118.aClass78_3 = arg2.method4476(Static232.aClass106_5, Static367.method5454(arg1, Static202.anInt4261));
		Static242.aClass106_7 = Static191.method3463(arg0, Static55.anInt1221);
		Static81.aClass78_2 = arg2.method4476(Static242.aClass106_7, Static367.method5454(arg1, Static55.anInt1221));
	}
}
