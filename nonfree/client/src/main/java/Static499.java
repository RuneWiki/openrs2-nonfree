import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!qja", name = "p", descriptor = "Lclient!rg;")
	public static Class310 aClass310_101;

	@OriginalMember(owner = "client!qja", name = "t", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_206 = new Class251(22, 3);

	@OriginalMember(owner = "client!qja", name = "f", descriptor = "(I)V")
	public static void method7526() {
		if (!Static438.aBoolean518) {
			Static5.aBoolean5 = true;
			Static193.aFloat190 += (12.0F - Static193.aFloat190) / 2.0F;
			Static438.aBoolean518 = true;
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(JII)Lclient!hw;")
	public static Class14_Sub2_Sub9 method7527(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class14_Sub2_Sub9 local20 = (Class14_Sub2_Sub9) Static541.aClass125_36.method2630(arg0 | (long) arg1 << 56);
		if (local20 == null) {
			local20 = new Class14_Sub2_Sub9(arg1, arg0);
			Static541.aClass125_36.method2626(local20, local20.aLong324);
		}
		return local20;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZZ)V")
	public static void method7528(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static358.anInt6145 != -1) {
				Static37.method652(Static358.anInt6145);
			}
			for (@Pc(21) Class14_Sub13 local21 = (Class14_Sub13) Static27.aClass125_3.method2633(); local21 != null; local21 = (Class14_Sub13) Static27.aClass125_3.method2627()) {
				if (!local21.method9512()) {
					local21 = (Class14_Sub13) Static27.aClass125_3.method2633();
					if (local21 == null) {
						break;
					}
				}
				Static69.method1092(local21, false, true);
			}
			Static358.anInt6145 = -1;
			Static27.aClass125_3 = new Class125(8);
			Static155.method2235();
			Static358.anInt6145 = Static551.aClass355_1.anInt9851;
			Static379.method5835(false);
			Static438.method6532();
			Static672.method9294(Static358.anInt6145);
		}
		Static356.method5410();
		Static669.aBoolean764 = false;
		Static306.method5438();
		Static573.anInt9481 = -1;
		Static114.method1816(Static292.anInt5309);
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 = new Class4_Sub3_Sub3_Sub3_Sub2();
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 = Static542.anInt9214 * 512 / 2;
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray200[0] = Static380.anInt6689 / 2;
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 = Static380.anInt6689 * 512 / 2;
		Static229.anInt4393 = 0;
		Static70.anInt1085 = 0;
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anIntArray201[0] = Static542.anInt9214 / 2;
		if (Static304.anInt5410 == 2) {
			Static70.anInt1085 = Static24.anInt330 << 9;
			Static229.anInt4393 = Static470.anInt8102 << 9;
		} else {
			Static267.method4408();
		}
		Static452.method6681();
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(II)Z")
	public static boolean method7530(@OriginalArg(1) int arg0) {
		return arg0 == 23 || arg0 == 12 || arg0 == 60 || arg0 == 4 || arg0 == 13 || arg0 == 50 || arg0 == 47;
	}
}
