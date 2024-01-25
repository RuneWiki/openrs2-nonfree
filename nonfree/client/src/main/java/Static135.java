import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public static int anInt3077;

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "Lclient!am;")
	public static Class11 aClass11_62;

	@OriginalMember(owner = "client!ir", name = "s", descriptor = "Lclient!am;")
	public static Class11 aClass11_63;

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "Lclient!ok;")
	public static Class147 aClass147_4;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
	public static boolean aBoolean259 = false;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "Z")
	public static boolean aBoolean261 = true;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "J")
	public static long aLong107 = 0L;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!am;Z)I")
	public static int method2710(@OriginalArg(0) Class11 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method274(Static58.anInt1260)) {
			local10++;
		}
		if (arg0.method274(Static186.anInt5633)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V")
	public static void method2712() {
		Static52.anInt1189 = 0;
		Static104.anInt6829 = 0;
		Static347.method5632();
		Static107.method5707();
		Static194.method3526();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static52.anInt1189; local21++) {
			local27 = Static19.anIntArray539[local21];
			if (Static342.anInt6706 != Static101.aClass2_Sub2_Sub1_Sub2Array6[local27].anInt6515) {
				if (Static101.aClass2_Sub2_Sub1_Sub2Array6[local27].aClass34_1.method734()) {
					Static235.method5579(Static101.aClass2_Sub2_Sub1_Sub2Array6[local27]);
				}
				Static101.aClass2_Sub2_Sub1_Sub2Array6[local27].method5445(null);
				Static101.aClass2_Sub2_Sub1_Sub2Array6[local27] = null;
			}
		}
		if (Static302.anInt6099 != Static200.aClass4_Sub7_Sub1_2.anInt2667) {
			throw new RuntimeException("gnp1 pos:" + Static200.aClass4_Sub7_Sub1_2.anInt2667 + " psize:" + Static302.anInt6099);
		}
		for (local27 = 0; local27 < Static282.anInt5712; local27++) {
			if (Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static282.anInt5712);
			}
		}
	}
}
