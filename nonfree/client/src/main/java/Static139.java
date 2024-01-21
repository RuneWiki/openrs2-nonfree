import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lclient!ae;")
	public static final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_32 = new Class2_Sub3_Sub1(5000);

	@OriginalMember(owner = "client!pg", name = "bb", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1003 = Static158.method3034("scrollbar");

	@OriginalMember(owner = "client!pg", name = "cb", descriptor = "I")
	public static int anInt3670 = -1;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(Z)V")
	public static void method2830() {
		@Pc(1) Class85 local1 = Static186.aClass85_1;
		synchronized (Static186.aClass85_1) {
			Static125.anInt3413++;
			Static113.anInt3165 = Static57.anInt1793;
			Static131.anInt215 = Static54.anInt1756;
			Static157.anInt3985 = Static31.anInt993;
			Static147.anInt3820 = Static153.anInt3901;
			Static74.anInt2294 = Static82.anInt2420;
			Static174.anInt4254 = Static111.anInt3123;
			Static39.aLong34 = Static70.aLong71;
			Static153.anInt3901 = 0;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)V")
	public static void method2831(@OriginalArg(0) int arg0) {
		if (Static144.anInt3778 == arg0) {
			return;
		}
		if (Static144.anInt3778 == 0) {
			Static84.method1984();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static42.anInt1306 = 0;
			Static155.anInt3943 = 0;
			Static26.anInt785 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static105.aClass66_34 != null) {
			Static105.aClass66_34.method2834();
			Static105.aClass66_34 = null;
		}
		if (Static144.anInt3778 == 25) {
			Static24.anInt752 = 0;
			Static165.anInt4099 = 1;
			Static140.anInt3673 = 0;
			Static157.anInt3983 = 1;
			Static72.anInt2167 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static35.method2414(Static99.aClass13_Sub1_13, Static159.aCanvas36, Static56.aClass13_Sub1_3);
		} else {
			Static79.method1889();
		}
		Static144.anInt3778 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)Z")
	public static boolean method2832(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
