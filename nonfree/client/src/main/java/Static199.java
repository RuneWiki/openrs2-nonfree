import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
	public static int anInt4056;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!in;")
	public static Class71 aClass71_18;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Z")
	public static boolean aBoolean308 = true;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "[S")
	public static short[] aShortArray73 = new short[] { 19, 48, 5, 2, 11, 9, 15, 34 };

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
	public static volatile int anInt4055 = -1;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
	public static int anInt4060 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lclient!in;II)V")
	public static void method3241(@OriginalArg(0) Class71[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(19) Class71 local19 = arg0[local7];
			if (local19 != null) {
				if (local19.anInt2712 == 0) {
					if (local19.aClass71Array1 != null) {
						method3241(local19.aClass71Array1, arg1);
					}
					@Pc(44) Class1_Sub17 local44 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local19.anInt2655);
					if (local44 != null) {
						Static90.method1588(arg1, local44.anInt2431);
					}
				}
				@Pc(62) Class1_Sub14 local62;
				if (arg1 == 0 && local19.anObjectArray31 != null) {
					local62 = new Class1_Sub14();
					local62.anObjectArray1 = local19.anObjectArray31;
					local62.aClass71_8 = local19;
					Static188.method3144(local62);
				}
				if (arg1 == 1 && local19.anObjectArray19 != null) {
					if (local19.anInt2689 >= 0) {
						@Pc(88) Class71 local88 = Static56.method1058(local19.anInt2655);
						if (local88 == null || local88.aClass71Array1 == null || local88.aClass71Array1.length <= local19.anInt2689 || local88.aClass71Array1[local19.anInt2689] != local19) {
							continue;
						}
					}
					local62 = new Class1_Sub14();
					local62.anObjectArray1 = local19.anObjectArray19;
					local62.aClass71_8 = local19;
					Static188.method3144(local62);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method3242() {
		while (true) {
			if (Static187.aClass1_Sub11_Sub1_2.method2693(Static33.anInt762) >= 11) {
				@Pc(20) int local20 = Static187.aClass1_Sub11_Sub1_2.method2701(11);
				if (local20 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static98.aClass14_Sub2_Sub1Array1[local20] == null) {
						local25 = true;
						Static98.aClass14_Sub2_Sub1Array1[local20] = new Class14_Sub2_Sub1();
						if (Static76.aClass1_Sub11Array1[local20] != null) {
							Static98.aClass14_Sub2_Sub1Array1[local20].method1348(Static76.aClass1_Sub11Array1[local20]);
						}
					}
					Static17.anIntArray444[Static278.anInt5374++] = local20;
					@Pc(62) Class14_Sub2_Sub1 local62 = Static98.aClass14_Sub2_Sub1Array1[local20];
					local62.anInt4645 = Static237.anInt4710;
					@Pc(74) int local74 = Static111.anIntArray230[Static187.aClass1_Sub11_Sub1_2.method2701(3)];
					if (local25) {
						local62.anInt4618 = local62.anInt4681 = local74;
					}
					@Pc(88) int local88 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
					if (local88 == 1) {
						Static226.anIntArray399[Static1.anInt4241++] = local20;
					}
					@Pc(105) int local105 = Static187.aClass1_Sub11_Sub1_2.method2701(1);
					@Pc(110) int local110 = Static187.aClass1_Sub11_Sub1_2.method2701(5);
					@Pc(115) int local115 = Static187.aClass1_Sub11_Sub1_2.method2701(5);
					if (local115 > 15) {
						local115 -= 32;
					}
					if (local110 > 15) {
						local110 -= 32;
					}
					local62.method1349(local110 + Static197.aClass14_Sub2_Sub1_2.anIntArray415[0], local115 + Static197.aClass14_Sub2_Sub1_2.anIntArray418[0], local105 == 1);
					continue;
				}
			}
			Static187.aClass1_Sub11_Sub1_2.method2692();
			return;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/Object;Lclient!wa;I)V")
	public static void method3244(@OriginalArg(0) Object arg0, @OriginalArg(1) Class175 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < 50 && arg1.anEventQueue1.peekEvent() != null; local12++) {
			Static48.method934(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}
}
