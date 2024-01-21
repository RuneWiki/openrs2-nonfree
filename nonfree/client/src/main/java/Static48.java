import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!he", name = "P", descriptor = "B")
	public static byte aByte3;

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "Lclient!t;")
	public static Class10_Sub1 aClass10_Sub1_9;

	@OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
	public static int anInt1182;

	@OriginalMember(owner = "client!he", name = "mb", descriptor = "I")
	public static int anInt1187;

	@OriginalMember(owner = "client!he", name = "F", descriptor = "Lclient!od;")
	public static Class60 aClass60_443 = Static41.method597("blinken1:");

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!od;")
	public static Class60 aClass60_444 = Static41.method597(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	public static int anInt1170 = 500;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "[[[Lclient!lb;")
	public static Class45[][][] aClass45ArrayArrayArray1 = new Class45[4][104][104];

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "Lclient!od;")
	private static Class60 aClass60_452 = Static41.method597("Free world");

	@OriginalMember(owner = "client!he", name = "L", descriptor = "Lclient!od;")
	public static Class60 aClass60_445 = aClass60_452;

	@OriginalMember(owner = "client!he", name = "N", descriptor = "Lclient!od;")
	public static Class60 aClass60_446 = Static41.method597("<col=ff3000>");

	@OriginalMember(owner = "client!he", name = "R", descriptor = "I")
	public static int anInt1174 = 128;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Lclient!od;")
	private static Class60 aClass60_447 = Static41.method597("glow1:");

	@OriginalMember(owner = "client!he", name = "T", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!od;")
	public static Class60 aClass60_448 = Static41.method597("Benutzername: ");

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!od;")
	private static Class60 aClass60_449 = Static41.method597("Create a free account");

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!od;")
	public static Class60 aClass60_450 = aClass60_447;

	@OriginalMember(owner = "client!he", name = "eb", descriptor = "Lclient!od;")
	public static Class60 aClass60_451 = Static41.method597(")1");

	@OriginalMember(owner = "client!he", name = "hb", descriptor = "Lclient!od;")
	public static Class60 aClass60_453 = aClass60_447;

	@OriginalMember(owner = "client!he", name = "jb", descriptor = "I")
	public static int anInt1184 = 0;

	@OriginalMember(owner = "client!he", name = "kb", descriptor = "I")
	public static int anInt1185 = 0;

	@OriginalMember(owner = "client!he", name = "ob", descriptor = "Lclient!od;")
	public static Class60 aClass60_454 = Static41.method597("sch-Utteln:");

	@OriginalMember(owner = "client!he", name = "pb", descriptor = "Lclient!od;")
	public static Class60 aClass60_455 = Static41.method597("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!he", name = "tb", descriptor = "Lclient!od;")
	public static Class60 aClass60_456 = aClass60_449;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!ta;B)V")
	public static void method661(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub18 arg1) {
		@Pc(2) int local2 = arg1.anInt2589;
		@Pc(6) int local6 = (int) arg1.aLong100;
		arg1.method1989();
		if (arg0) {
			Static23.method426(local2);
		}
		Static121.method1917(local2);
		@Pc(25) Class4_Sub14 local25 = Static61.method991(local6);
		if (local25 != null) {
			Static36.method558(local25);
		}
		Static12.aBoolean107 = false;
		anInt1184 = 0;
		Static97.method1576(anInt1182, Static25.anInt848, Static22.anInt800, Static60.anInt2966);
		if (Static52.anInt1452 != -1) {
			Static113.method818(1, Static52.anInt1452);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
	public static int method662(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static21.method400(arg1 - 1, arg0 + -1) + Static21.method400(arg1 - 1, arg0 + 1) + Static21.method400(arg1 + 1, arg0 + -1) + Static21.method400(arg1 - -1, arg0 + 1);
		@Pc(76) int local76 = Static21.method400(arg1, arg0 - 1) + Static21.method400(arg1, arg0 + 1) + Static21.method400(arg1 + -1, arg0) + Static21.method400(arg1 + 1, arg0);
		@Pc(81) int local81 = Static21.method400(arg1, arg0);
		return local47 / 16 + local76 / 8 + local81 / 4;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)I")
	public static int method664(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(36) int local36 = Static106.method1741(arg1 + 91923, 4, arg0 + 45365) + (Static106.method1741(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static106.method1741(arg1, 1, arg0) + -128 >> 2) - 128;
		local36 = (int) ((double) local36 * 0.3D) + 35;
		if (local36 < 10) {
			local36 = 10;
		} else if (local36 > 60) {
			local36 = 60;
		}
		return local36;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
	public static void method665() {
		if (Static11.aClass37_2 != null) {
			Static11.aClass37_2.method877();
		}
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)V")
	public static void method666() {
		aClass60_454 = null;
		aClass60_456 = null;
		aClass60_443 = null;
		aClass60_444 = null;
		aClass60_452 = null;
		aClass60_445 = null;
		aClass60_448 = null;
		aClass10_Sub1_9 = null;
		aClass60_449 = null;
		aClass60_447 = null;
		aClass60_446 = null;
		aClass60_450 = null;
		aClass60_451 = null;
		aClass60_453 = null;
		aClass60_455 = null;
		anIntArray120 = null;
		aClass45ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)Lclient!od;")
	public static Class60 method668(@OriginalArg(1) int arg0) {
		return Static128.aClass60Array20[arg0].method1345() > 0 ? Static12.method1761(new Class60[] { Static80.aClass60Array14[arg0], Static83.aClass60_814, Static128.aClass60Array20[arg0] }) : Static80.aClass60Array14[arg0];
	}
}
