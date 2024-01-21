import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_18;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!kc;")
	private static Class36 aClass36_882 = Static14.method2017("glow1:");

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "Lclient!kc;")
	public static Class36 aClass36_879 = aClass36_882;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public static int anInt1789 = 0;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public static int anInt1790 = 2;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!kc;")
	public static Class36 aClass36_880 = Static14.method2017(" (X");

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	public static int anInt1793 = 0;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
	public static boolean aBoolean77 = false;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_881 = Static14.method2017("backbase2");

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	public static int[] anIntArray225 = new int[2048];

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZ)V")
	public static synchronized void method1257() {
		if (Static92.aClass2_Sub3_1 != null) {
			Static92.aClass2_Sub3_1.method2059(256);
		}
		Static53.method1039(256);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method1258() {
		aClass36_882 = null;
		aClass36_880 = null;
		aClass36_881 = null;
		aClass36_879 = null;
		aClass2_Sub1_Sub1_Sub1_18 = null;
		anIntArray225 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([II)V")
	public static synchronized void method1260(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		if (Static35.aBoolean50) {
			local1 = arg1 << 1;
		}
		@Pc(9) int local9 = 0;
		local1 -= 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
		}
		local1 += 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
		}
		if (Static92.aClass2_Sub3_1 != null) {
			Static92.aClass2_Sub3_1.method2057(arg0, 0, arg1);
		}
		Static53.method1039(arg1);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!dd;I)V")
	public static synchronized void method1261(@OriginalArg(0) Class2_Sub3 arg0) {
		Static92.aClass2_Sub3_1 = arg0;
	}
}
