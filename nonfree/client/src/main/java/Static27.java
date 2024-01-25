import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!dn;")
	public static Class56 aClass56_11;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public static int anInt771;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public static final int anInt769 = 1337;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_2 = new Class180("", 13);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZB)V")
	public static void method719(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static337.anInt6221 != -1) {
				Static410.method5505(Static337.anInt6221);
			}
			for (@Pc(17) Class3_Sub40 local17 = (Class3_Sub40) Static30.aClass127_3.method3248(); local17 != null; local17 = (Class3_Sub40) Static30.aClass127_3.method3252()) {
				if (!local17.method5985()) {
					local17 = (Class3_Sub40) Static30.aClass127_3.method3248();
					if (local17 == null) {
						break;
					}
				}
				Static316.method4612(false, true, local17);
			}
			Static337.anInt6221 = -1;
			Static30.aClass127_3 = new Class127(8);
			Static43.method938();
			Static337.anInt6221 = Static242.anInt4628;
			Static300.method4442(false);
			Static357.method5085();
			Static272.method4043(Static337.anInt6221);
		}
		Static202.method3295();
		Static332.anInt6029 = -1;
		Static166.method2898(Static287.anInt5247);
		Static113.aClass1_Sub3_Sub3_Sub1_4 = new Class1_Sub3_Sub3_Sub1();
		Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 = Static399.anInt6923 * 128 / 2;
		Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0] = Static399.anInt6923 / 2;
		Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 = Static127.anInt2696 * 128 / 2;
		Static80.anInt1722 = 0;
		Static398.anInt6901 = 0;
		Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0] = Static127.anInt2696 / 2;
		if (Static107.anInt2382 == 2) {
			Static398.anInt6901 = Static243.anInt4634 << 7;
			Static80.anInt1722 = Static267.anInt5000 << 7;
		} else {
			Static238.method3733();
		}
		Static373.method5169();
		if (Static398.anInt6901 == 0 || Static80.anInt1722 == 0) {
			Static293.method2805(10);
		} else {
			Static437.method5855();
			Static293.method2805(28);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	public static void method721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1 * Static123.aClass21_Sub1_1.anInt871 >> 8;
		if (arg0 == -1 && !Static358.aBoolean419) {
			Static36.method853();
		} else if (arg0 != -1 && (Static257.anInt4778 != arg0 || !Static78.method1395()) && local10 != 0 && !Static358.aBoolean419) {
			Static374.method5172(arg2, local10, Static160.aClass56_39, arg0);
		}
		Static257.anInt4778 = arg0;
	}
}
