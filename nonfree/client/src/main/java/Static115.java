import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "Lclient!mu;")
	public static Class176 aClass176_2;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Lclient!pb;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_24 = new Class208(82, 3);

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "[[S")
	public static final short[][] aShortArrayArray2 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public static int anInt1938 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!wq;I)V")
	public static void method1881(@OriginalArg(0) Class11_Sub5_Sub2_Sub2 arg0) {
		for (@Pc(15) Class2_Sub3 local15 = (Class2_Sub3) Static294.aClass181_27.method3972(); local15 != null; local15 = (Class2_Sub3) Static294.aClass181_27.method3975()) {
			if (arg0 == local15.aClass11_Sub5_Sub2_Sub2_1) {
				if (local15.aClass2_Sub8_Sub4_2 != null) {
					Static414.aClass2_Sub8_Sub1_2.method1041(local15.aClass2_Sub8_Sub4_2);
					local15.aClass2_Sub8_Sub4_2 = null;
				}
				local15.method6260();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Lclient!ds;")
	public static Class11_Sub3 method1883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub3_1 == null ? null : local7.aClass11_Sub3_1;
	}
}
