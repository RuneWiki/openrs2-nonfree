import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "Lclient!rh;")
	public static Class256 aClass256_2;

	@OriginalMember(owner = "client!cl", name = "L", descriptor = "Ljava/lang/Object;")
	public static Object anObject2;

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "Lclient!im;")
	public static final Class140 aClass140_22 = new Class140(12, 2);

	@OriginalMember(owner = "client!cl", name = "J", descriptor = "[I")
	public static int[] anIntArray151 = new int[1];

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public static void method1183() {
		Static255.method4299();
		Static340.method5162(Static544.aClass1_Sub22_Sub1_1.aBoolean381);
		Static314.aClass183_2 = Static469.method7461(Static105.aCanvas3, 22050, 0, Static466.aClass102_4);
		Static314.aClass183_2.method7419(Static541.aClass1_Sub16_Sub3_3);
		Static203.aClass183_1 = Static469.method7461(Static105.aCanvas3, 2048, 1, Static466.aClass102_4);
		Static203.aClass183_1.method7419(Static411.aClass1_Sub16_Sub1_2);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)I")
	public static int method1184(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([BI)Z")
	public static boolean method1185(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub6 local8 = new Class1_Sub6(arg0);
		@Pc(17) int local17 = local8.method3922();
		if (local17 != 2) {
			return false;
		}
		@Pc(33) boolean local33 = local8.method3922() == 1;
		if (local33) {
			Static477.method6613(local8);
		}
		Static135.method2253(local8);
		return true;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)I")
	public static int method1187() {
		if ((double) Static118.aFloat11 == 3.0D) {
			return 37;
		} else if ((double) Static118.aFloat11 == 4.0D) {
			return 50;
		} else if ((double) Static118.aFloat11 == 6.0D) {
			return 75;
		} else if ((double) Static118.aFloat11 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}
}
