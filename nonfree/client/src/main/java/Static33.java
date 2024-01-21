import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_17;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
	public static volatile int anInt1985 = 0;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!na;")
	private static Class53 aClass53_907 = Static109.method1737("Accept trade");

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_908 = Static109.method1737("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_909 = Static109.method1737("An");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_910 = aClass53_907;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "[Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4[] aClass3_Sub1_Sub5_Sub4Array11 = new Class3_Sub1_Sub5_Sub4[1000];

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_911 = Static109.method1737(" x");

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
	public static int anInt1998 = 0;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_912 = Static109.method1737("World");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!we;Lclient!we;Z)I")
	public static int method1393(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method1520(Static122.aClass53_1407, Static59.aClass53_691)) {
			local1++;
		}
		if (arg1.method1520(Static122.aClass53_1407, Static65.aClass53_735)) {
			local1++;
		}
		if (arg1.method1520(Static122.aClass53_1407, Static109.aClass53_1266)) {
			local1++;
		}
		if (arg1.method1520(Static122.aClass53_1407, Static104.aClass53_1281)) {
			local1++;
		}
		if (arg1.method1520(Static122.aClass53_1407, Static41.aClass53_533)) {
			local1++;
		}
		if (arg1.method1520(Static122.aClass53_1407, Static51.aClass53_623)) {
			local1++;
		}
		arg1.method1520(Static122.aClass53_1407, Static62.aClass53_717);
		arg1.method1520(Static122.aClass53_1407, Static81.aClass53_929);
		arg1.method1520(Static122.aClass53_1407, Static85.aClass53_941);
		arg1.method1520(Static122.aClass53_1407, Static104.aClass53_1277);
		arg1.method1520(Static122.aClass53_1407, Static75.aClass53_841);
		return local1;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BLclient!vb;)[I")
	public static int[] method1394(@OriginalArg(1) Class3_Sub1_Sub15 arg0) {
		@Pc(8) int local8 = arg0.anInt2686 >> 16;
		if (!Static98.method1633(local8)) {
			return null;
		}
		@Pc(17) int local17 = arg0.anInt2677;
		@Pc(20) int local20 = arg0.anInt2708;
		@Pc(23) int local23 = arg0.anInt2704;
		while (local23 != -1) {
			@Pc(36) Class3_Sub1_Sub15 local36 = Static107.aClass3_Sub1_Sub15ArrayArray1[local8][local23 & 0xFFFF];
			local23 = local36.anInt2704;
			local20 += local36.anInt2708 - local36.anInt2724;
			local17 += local36.anInt2677 - local36.anInt2691;
		}
		return new int[] { local17, local20 };
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public static void method1399() {
		aClass53_907 = null;
		aClass3_Sub1_Sub5_Sub3_17 = null;
		aClass53_911 = null;
		aClass3_Sub1_Sub5_Sub4Array11 = null;
		aClass53_908 = null;
		aClass53_909 = null;
		aClass53_910 = null;
		aClass53_912 = null;
	}
}
