import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	public static int anInt3760;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "I")
	public static int anInt3761 = 0;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[2][][];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method2734() {
		Static2.aClass1_Sub10_Sub3_1.method3175();
		Static9.anInt285 = 1;
		Static254.aClass168_172 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V")
	public static void method2736(@OriginalArg(0) boolean arg0) {
		@Pc(10) Class1_Sub16 local10;
		for (local10 = (Class1_Sub16) Static80.aClass26_14.method666(); local10 != null; local10 = (Class1_Sub16) Static80.aClass26_14.method672()) {
			if (local10.aClass1_Sub10_Sub4_2 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_2);
				local10.aClass1_Sub10_Sub4_2 = null;
			}
			if (local10.aClass1_Sub10_Sub4_1 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_1);
				local10.aClass1_Sub10_Sub4_1 = null;
			}
			local10.method4767();
		}
		if (!arg0) {
			return;
		}
		for (local10 = (Class1_Sub16) Static13.aClass26_3.method666(); local10 != null; local10 = (Class1_Sub16) Static13.aClass26_3.method672()) {
			if (local10.aClass1_Sub10_Sub4_2 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_2);
				local10.aClass1_Sub10_Sub4_2 = null;
			}
			local10.method4767();
		}
		for (local10 = (Class1_Sub16) Static125.aClass186_10.method4567(); local10 != null; local10 = (Class1_Sub16) Static125.aClass186_10.method4579()) {
			if (local10.aClass1_Sub10_Sub4_2 != null) {
				Static101.aClass1_Sub10_Sub2_2.method1864(local10.aClass1_Sub10_Sub4_2);
				local10.aClass1_Sub10_Sub4_2 = null;
			}
			local10.method4767();
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(1, arg0);
		local8.method4468();
		local8.anInt5852 = arg1;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method2738() {
		if (Static46.anInt1108 != Static185.anInt4085 && Static158.method1929(Static185.anInt4085)) {
			Static46.anInt1108 = Static185.anInt4085;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!fc;II)V")
	public static void method2739(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt2822 == arg2 && arg2 != -1) {
			@Pc(24) Class32 local24 = Static202.method3231(arg2);
			@Pc(27) int local27 = local24.anInt972;
			if (local27 == 1) {
				arg1.anInt2811 = 0;
				arg1.anInt2800 = 0;
				arg1.anInt2830 = arg0;
				arg1.anInt2829 = 0;
				arg1.anInt2845 = 1;
				Static154.method2507(false, arg1.anInt2846, arg1.anInt2794, arg1.anInt2800, local24);
			}
			if (local27 == 2) {
				arg1.anInt2811 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt2822 == -1 || Static202.method3231(arg2).anInt967 >= Static202.method3231(arg1.anInt2822).anInt967) {
			arg1.anInt2830 = arg0;
			arg1.anInt2811 = 0;
			arg1.anInt2822 = arg2;
			arg1.anInt2829 = 0;
			arg1.anInt2845 = 1;
			arg1.anInt2778 = arg1.anInt2787;
			arg1.anInt2800 = 0;
			if (arg1.anInt2822 != -1) {
				Static154.method2507(false, arg1.anInt2846, arg1.anInt2794, arg1.anInt2800, Static202.method3231(arg1.anInt2822));
			}
		}
	}
}
