import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!sg;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3 aClass3_Sub2_Sub3_Sub3_37;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	public static int anInt3353 = 127;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
	public static int anInt3355 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static volatile int anInt3357 = -1;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1169 = Static65.method1172("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1171 = Static65.method1172("Close");

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1170 = aClass46_1171;

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public static void method2434() {
		aClass28_1 = null;
		aClass46_1170 = null;
		aClass46_1169 = null;
		aClass3_Sub2_Sub3_Sub3_37 = null;
		aClass46_1171 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BJ)V")
	public static void method2435(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static25.anInt3983 >= 100) {
			Static168.method2686(0, Static38.aClass46_298, Static13.aClass46_93);
			return;
		}
		@Pc(35) Class46 local35 = Static116.method1961(arg0).method1371();
		for (@Pc(37) int local37 = 0; local37 < Static25.anInt3983; local37++) {
			if (Static146.aLongArray3[local37] == arg0) {
				Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { local35, Static126.aClass46_1034 }));
				return;
			}
		}
		for (@Pc(72) int local72 = 0; local72 < Static52.anInt1391; local72++) {
			if (arg0 == Static133.aLongArray2[local72]) {
				Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { Static161.aClass46_1293, local35, Static13.aClass46_92 }));
				return;
			}
		}
		if (local35.method1351(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.aClass46_233)) {
			Static168.method2686(0, Static38.aClass46_298, Static119.aClass46_975);
			return;
		}
		Static146.aLongArray3[Static25.anInt3983] = arg0;
		Static120.aClass46Array17[Static25.anInt3983++] = Static116.method1961(arg0);
		Static16.anInt418 = Static178.anInt3928;
		Static133.aClass3_Sub4_Sub1_3.method233(98);
		Static133.aClass3_Sub4_Sub1_3.method201(arg0);
	}
}
