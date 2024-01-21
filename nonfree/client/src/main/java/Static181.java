import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!wg", name = "yb", descriptor = "Lclient!ga;")
	public static Class30 aClass30_66;

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "Lclient!td;")
	public static Class79 aClass79_30 = new Class79(100);

	@OriginalMember(owner = "client!wg", name = "nb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1657 = Static169.method2903("Untersuchen");

	@OriginalMember(owner = "client!wg", name = "ob", descriptor = "Z")
	public static volatile boolean aBoolean217 = true;

	@OriginalMember(owner = "client!wg", name = "ub", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1658 = Static169.method2903("Wordpack geladen)3");

	@OriginalMember(owner = "client!wg", name = "xb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1659 = Static169.method2903("T");

	@OriginalMember(owner = "client!wg", name = "zb", descriptor = "Lclient!vc;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!wg", name = "Ab", descriptor = "I")
	public static int anInt4352 = 1;

	@OriginalMember(owner = "client!wg", name = "Bb", descriptor = "I")
	public static int anInt4353 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	public static void method3131(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub21 local18 = (Class1_Sub21) Static82.aClass10_6.method256((long) arg0);
		if (local18 != null) {
			local18.method3141();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBI)Lclient!pa;")
	public static Class1_Sub16 method3132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub16 local9 = new Class1_Sub16();
		local9.anInt3202 = arg0;
		local9.anInt3207 = arg2;
		Static12.aClass10_1.method263(local9, (long) arg1);
		Static31.method544(arg2);
		Static84.method3154(arg2);
		@Pc(35) Class60 local35 = Static111.method1964(arg1);
		if (local35 != null) {
			Static39.method659(local35);
		}
		if (Static98.aClass60_5 != null) {
			Static39.method659(Static98.aClass60_5);
			Static98.aClass60_5 = null;
		}
		Static38.anInt1037 = 0;
		Static164.aBoolean201 = false;
		Static176.method2991(Static94.anInt2451, Static27.anInt864, Static112.anInt2868, Static141.anInt3598);
		if (Static165.anInt4050 != -1) {
			Static60.method3140(1, Static165.anInt4050);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILclient!ga;ZI)V")
	public static void method3134(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class30 arg2, @OriginalArg(5) int arg3) {
		Static95.anInt2455 = 10000;
		Static7.anInt331 = arg1;
		Static1.anInt221 = arg3;
		Static141.anInt3602 = 1;
		Static5.aClass30_67 = arg2;
		Static84.aBoolean219 = false;
		Static137.anInt3502 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	public static void method3135() {
		aClass23_1657 = null;
		aClass23_1659 = null;
		aClass79_30 = null;
		aClass30_66 = null;
		aClass23_1658 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!ga;II)Lclient!nb;")
	public static Class1_Sub1_Sub12_Sub1 method3138(@OriginalArg(0) int arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2) {
		return Static162.method2822(arg2, arg0, arg1) ? Static162.method2823() : null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!ga;Lclient!ga;B)V")
	public static void method3139(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		Static176.aClass30_62 = arg0;
		aClass30_66 = arg1;
		Static160.anInt3952 = aClass30_66.method1278(3);
	}
}
