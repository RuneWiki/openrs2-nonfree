import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	public static int anInt6435;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!sg;)V")
	public static void method5250(@OriginalArg(1) Class11_Sub5_Sub2_Sub2 arg0) {
		for (@Pc(15) Class4_Sub6 local15 = (Class4_Sub6) Static429.aClass91_52.method2584(); local15 != null; local15 = (Class4_Sub6) Static429.aClass91_52.method2586()) {
			if (local15.aClass11_Sub5_Sub2_Sub2_1 == arg0) {
				if (local15.aClass4_Sub7_Sub1_3 != null) {
					Static132.aClass4_Sub7_Sub4_1.method5474(local15.aClass4_Sub7_Sub1_3);
					local15.aClass4_Sub7_Sub1_3 = null;
				}
				local15.method6330();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!sg;Z)I")
	public static int method5251(@OriginalArg(0) Class11_Sub5_Sub2_Sub2 arg0) {
		@Pc(8) Class241 local8 = arg0.aClass241_1;
		if (local8.anIntArray565 != null) {
			local8 = local8.method5593(Static67.aClass224_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt7018;
		@Pc(32) Class231 local32 = arg0.method5306();
		if (arg0.aBoolean475) {
			local23 = local8.anInt7020;
		} else if (local32.anInt6389 == arg0.anInt6484 || arg0.anInt6484 == local32.anInt6423 || local32.anInt6397 == arg0.anInt6484 || arg0.anInt6484 == local32.anInt6404) {
			local23 = local8.anInt6987;
		} else if (arg0.anInt6484 == local32.anInt6422 || local32.anInt6414 == arg0.anInt6484 || local32.anInt6396 == arg0.anInt6484 || local32.anInt6412 == arg0.anInt6484) {
			local23 = local8.anInt7023;
		}
		return local23;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method5252() {
		if (Static70.anInt1726 == 8) {
			Static382.method3540(4);
		} else if (Static70.anInt1726 == 4 || Static70.anInt1726 == 5) {
			Static382.method3540(2);
		} else if (Static70.anInt1726 == 11) {
			Static382.method3540(2);
			return;
		}
	}
}
