import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2 aClass2_Sub2_Sub3_Sub2_1;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "Lclient!sa;")
	public static Class74 aClass74_5 = new Class74(4096);

	@OriginalMember(owner = "client!fg", name = "hb", descriptor = "[I")
	public static int[] anIntArray211 = new int[128];

	@OriginalMember(owner = "client!fg", name = "ib", descriptor = "[Lclient!vh;")
	public static Class2_Sub2_Sub1_Sub6_Sub2[] aClass2_Sub2_Sub1_Sub6_Sub2Array1 = new Class2_Sub2_Sub1_Sub6_Sub2[32768];

	@OriginalMember(owner = "client!fg", name = "jb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_512 = Static146.method2172("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!fg", name = "ob", descriptor = "Lclient!sg;")
	private static Class77 aClass77_515 = Static146.method2172("flash3:");

	@OriginalMember(owner = "client!fg", name = "kb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_513 = aClass77_515;

	@OriginalMember(owner = "client!fg", name = "lb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_514 = aClass77_515;

	@OriginalMember(owner = "client!fg", name = "mb", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!fg", name = "nb", descriptor = "[I")
	public static int[] anIntArray212 = new int[128];

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	public static void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static159.anInt3921 = -1;
			Static57.anInt4543 = -1;
			return;
		}
		@Pc(33) int local33 = Static161.method2725(arg2, Static54.anInt1472, arg0) - arg1;
		@Pc(37) int local37 = local33 - Static160.anInt4578;
		@Pc(41) int local41 = Class2_Sub2_Sub3_Sub1.anIntArray50[Static130.anInt3165];
		@Pc(45) int local45 = arg0 - Static121.anInt2979;
		@Pc(49) int local49 = arg2 - Static7.anInt215;
		@Pc(53) int local53 = Class2_Sub2_Sub3_Sub1.anIntArray52[Static130.anInt3165];
		@Pc(57) int local57 = Class2_Sub2_Sub3_Sub1.anIntArray50[Static155.anInt3844];
		@Pc(61) int local61 = Class2_Sub2_Sub3_Sub1.anIntArray52[Static155.anInt3844];
		@Pc(71) int local71 = local61 * local49 + local57 * local45 >> 16;
		@Pc(82) int local82 = local45 * local61 - local49 * local57 >> 16;
		@Pc(84) int local84 = local71;
		@Pc(95) int local95 = local37 * local53 - local82 * local41 >> 16;
		@Pc(106) int local106 = local41 * local37 + local82 * local53 >> 16;
		if (local106 < 50) {
			Static159.anInt3921 = -1;
			Static57.anInt4543 = -1;
		} else {
			Static57.anInt4543 = (local95 << 9) / local106 + 167;
			Static159.anInt3921 = (local84 << 9) / local106 + 256;
		}
	}

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)V")
	public static void method920() {
		aClass2_Sub2_Sub1_Sub6_Sub2Array1 = null;
		anIntArray211 = null;
		aClass77_513 = null;
		aClass2_Sub2_Sub3_Sub2_1 = null;
		aClass77_512 = null;
		anIntArray212 = null;
		aClass74_5 = null;
		aClass77_514 = null;
		aClass77_515 = null;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method921() {
		Static179.aClass82_64.method2698();
		Static80.aClass82_33.method2698();
	}
}
