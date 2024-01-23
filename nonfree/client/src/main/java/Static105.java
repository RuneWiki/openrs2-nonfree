import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!nm;")
	public static Class119 aClass119_40;

	@OriginalMember(owner = "client!hl", name = "r", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "Lclient!wg;")
	public static Class189 aClass189_1 = new Class189();

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public static int anInt2225 = 0;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "[Lclient!hl;")
	public static Class77[] aClass77Array1 = new Class77[6];

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	public static int anInt2226 = -1;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLclient!re;)V")
	public static void method1989(@OriginalArg(1) Class11_Sub4 arg0) {
		if (arg0.anInt3807 == Static167.anInt637 || arg0.anInt3864 == -1 || arg0.anInt3798 != 0 || arg0.anInt3850 + 1 > Static107.method2016(arg0.anInt3864).anIntArray512[arg0.anInt3847]) {
			@Pc(43) int local43 = arg0.anInt3807 - arg0.anInt3867;
			@Pc(49) int local49 = Static167.anInt637 - arg0.anInt3867;
			@Pc(60) int local60 = arg0.anInt3844 * 128 + arg0.method3347() * 64;
			@Pc(71) int local71 = arg0.anInt3827 * 128 + arg0.method3347() * 64;
			@Pc(83) int local83 = arg0.anInt3834 * 128 + arg0.method3347() * 64;
			@Pc(94) int local94 = arg0.anInt3810 * 128 + arg0.method3347() * 64;
			arg0.anInt3865 = (local49 * local83 + local60 * (local43 - local49)) / local43;
			arg0.anInt3856 = (local71 * (local43 - local49) + local49 * local94) / local43;
		}
		if (arg0.anInt3819 == 0) {
			arg0.anInt3853 = 1024;
		}
		arg0.anInt3806 = 0;
		if (arg0.anInt3819 == 1) {
			arg0.anInt3853 = 1536;
		}
		if (arg0.anInt3819 == 2) {
			arg0.anInt3853 = 0;
		}
		if (arg0.anInt3819 == 3) {
			arg0.anInt3853 = 512;
		}
		arg0.anInt3852 = arg0.anInt3853;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public static void method1991() {
		for (@Pc(6) Class1_Sub4 local6 = (Class1_Sub4) Static273.aClass96_27.method2340(); local6 != null; local6 = (Class1_Sub4) Static273.aClass96_27.method2342()) {
			if (local6.anInt329 == -1) {
				local6.anInt318 = 0;
				Static186.method3148(local6);
			} else {
				local6.method4573();
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
	public static boolean method1993() {
		return Static63.anInt1315 == 0 ? Static292.aClass1_Sub7_Sub2_3.method2785() : true;
	}
}
