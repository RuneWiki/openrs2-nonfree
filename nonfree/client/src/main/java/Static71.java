import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!md", name = "Cb", descriptor = "I")
	public static int anInt1493;

	@OriginalMember(owner = "client!md", name = "ec", descriptor = "I")
	public static int anInt1516;

	@OriginalMember(owner = "client!md", name = "jc", descriptor = "J")
	public static long aLong49;

	@OriginalMember(owner = "client!md", name = "qb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_655 = Static59.method1195("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!md", name = "Bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_657 = Static59.method1195("Benutzername: ");

	@OriginalMember(owner = "client!md", name = "kc", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!md", name = "oc", descriptor = "Lclient!qf;")
	private static Class60 aClass60_658 = Static59.method1195("Please enter your username)3");

	@OriginalMember(owner = "client!md", name = "tc", descriptor = "Z")
	public static volatile boolean aBoolean50 = true;

	@OriginalMember(owner = "client!md", name = "Cc", descriptor = "[I")
	public static int[] anIntArray186 = new int[1000];

	@OriginalMember(owner = "client!md", name = "Hc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_659 = Static59.method1195("Abbrechen");

	@OriginalMember(owner = "client!md", name = "Jc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_660 = aClass60_658;

	@OriginalMember(owner = "client!md", name = "Oc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_661 = null;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIB)V")
	public static void method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static30.anInt1041 = -1;
			Static65.anInt2053 = -1;
			return;
		}
		@Pc(41) int local41 = Static66.method1353(arg0, Static119.anInt3243, arg2) - arg1;
		@Pc(45) int local45 = arg0 - anInt1493;
		@Pc(49) int local49 = arg2 - Static98.anInt2824;
		@Pc(53) int local53 = Class3_Sub1_Sub2_Sub1.anIntArray41[Static63.anInt2908];
		@Pc(57) int local57 = Class3_Sub1_Sub2_Sub1.anIntArray39[Static63.anInt2908];
		@Pc(61) int local61 = Class3_Sub1_Sub2_Sub1.anIntArray41[Static22.anInt871];
		@Pc(65) int local65 = local41 - Static115.anInt3199;
		@Pc(69) int local69 = Class3_Sub1_Sub2_Sub1.anIntArray39[Static22.anInt871];
		@Pc(79) int local79 = local45 * local69 + local61 * local49 >> 16;
		@Pc(90) int local90 = local69 * local49 - local45 * local61 >> 16;
		@Pc(92) int local92 = local79;
		@Pc(103) int local103 = local57 * local65 - local53 * local90 >> 16;
		@Pc(113) int local113 = local57 * local90 + local53 * local65 >> 16;
		if (local113 >= 50) {
			Static30.anInt1041 = (local103 << 9) / local113 + 167;
			Static65.anInt2053 = (local92 << 9) / local113 + 256;
		} else {
			Static30.anInt1041 = -1;
			Static65.anInt2053 = -1;
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public static void method1019() {
		Class3_Sub1_Sub1_Sub3.anIntArray185 = null;
		aClass60_661 = null;
		aClass60_659 = null;
		aClass60_657 = null;
		aClass60_658 = null;
		anIntArray186 = null;
		aClass60_655 = null;
		aClass60_660 = null;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIZ)Lclient!qf;")
	public static Class60 method1020(@OriginalArg(1) int arg0) {
		return Static39.method879(true, arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)I")
	public static int method1021(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
	public static void method1022() {
		Static85.aClass16_62.method1668();
	}
}
