import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!f;")
	public static Class10 aClass10_15;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "[Lclient!wn;")
	public static Class360[] aClass360Array1;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!gba;")
	public static Class114 aClass114_4;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!mo;")
	public static final Class218 aClass218_5 = new Class218("WTRC", 1);

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public static void method3968() {
		if (Static316.anInt5682 == 6) {
			Static316.anInt5682 = 7;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method3970(@OriginalArg(0) int arg0) {
		if (Static177.anInt2101 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static210.aString41 == null) {
				Static543.method7366(Static77.aString86, Static315.aString63, Static326.anInt5840);
			} else {
				Static240.method3955(Static326.anInt5840);
			}
		}
		if (arg0 != 13 && Static479.aClass75_2 != null) {
			Static479.aClass75_2.method1850();
			Static479.aClass75_2 = null;
		}
		if (arg0 == 3) {
			Static218.method3611(Static219.anInt4263 != Static390.anInt6785);
		}
		if (arg0 == 7) {
			Static406.method5724(Static573.anInt9329 != Static219.anInt4263);
		}
		if (arg0 == 5) {
			if (Static210.aString41 == null) {
				Static350.method5172(Static315.aString63, Static77.aString86);
			} else {
				Static298.method4692();
			}
		} else if (arg0 == 6) {
			if (Static210.aString41 == null) {
				Static543.method7366(Static77.aString86, Static315.aString63, Static326.anInt5840);
			} else {
				Static240.method3955(Static326.anInt5840);
			}
		} else if (arg0 == 9) {
			if (Static210.aString41 == null) {
				Static543.method7366(Static77.aString86, Static315.aString63, Static326.anInt5840);
			} else {
				Static240.method3955(Static326.anInt5840);
			}
		} else if (arg0 == 12) {
			if (Static210.aString41 == null) {
				Static350.method5172(Static315.aString63, Static77.aString86);
			} else {
				Static298.method4692();
			}
		}
		if (Static460.method6537(Static177.anInt2101)) {
			Static333.aClass111_77.anInt2898 = 2;
			Static59.aClass111_109.anInt2898 = 2;
			Static331.aClass111_76.anInt2898 = 2;
			Static440.aClass111_102.anInt2898 = 2;
			Static356.aClass111_99.anInt2898 = 2;
			Static351.aClass111_82.anInt2898 = 2;
			Static587.aClass111_127.anInt2898 = 2;
		}
		if (Static460.method6537(arg0)) {
			Static30.anInt868 = 0;
			Static580.anInt9408 = 0;
			Static377.anInt6653 = 1;
			Static180.anInt3231 = 0;
			Static336.anInt5967 = 1;
			Static370.method5403(true);
			Static333.aClass111_77.anInt2898 = 1;
			Static59.aClass111_109.anInt2898 = 1;
			Static331.aClass111_76.anInt2898 = 1;
			Static440.aClass111_102.anInt2898 = 1;
			Static356.aClass111_99.anInt2898 = 1;
			Static351.aClass111_82.anInt2898 = 1;
			Static587.aClass111_127.anInt2898 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static184.method4622();
		}
		@Pc(232) boolean local232 = arg0 == 2 || Static391.method5585(arg0) || Static463.method6576(arg0);
		@Pc(253) boolean local253 = Static177.anInt2101 == 2 || Static391.method5585(Static177.anInt2101) || Static463.method6576(Static177.anInt2101);
		if (local253 != local232) {
			if (local232) {
				Static525.anInt8671 = Static492.anInt8283;
				if (Static479.aClass1_Sub7_Sub1_1.anInt3111 == 0) {
					Static224.method3680();
				} else {
					Static125.method2143(Static492.anInt8283, Static153.aClass111_34, Static479.aClass1_Sub7_Sub1_1.anInt3111);
				}
				Static543.aClass113_2.method2484(false);
			} else {
				Static224.method3680();
				Static543.aClass113_2.method2484(true);
			}
		}
		if (Static460.method6537(arg0) || arg0 == 13) {
			Static136.aClass12_8.method6440();
		}
		Static177.anInt2101 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(JZ)V")
	public static void method3971(@OriginalArg(0) long arg0) {
		@Pc(11) Class1_Sub48 local11 = Static240.method3953();
		local11.aClass1_Sub20_Sub1_2.method4378(Static189.aClass232_8.anInt6494);
		local11.aClass1_Sub20_Sub1_2.method4380(arg0);
		local11.aClass1_Sub20_Sub1_2.method4378(Static562.anInt9127);
		Static34.method813(local11);
		Static446.anInt7727 = 0;
		Static31.anInt879 = 1;
		Static403.anInt6918 = -3;
		Static17.anInt564 = 0;
	}
}
