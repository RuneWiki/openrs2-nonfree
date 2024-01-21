import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_75;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_35 = new Class86(64);

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_673 = Static81.method1507("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!dj;")
	public static Class24 aClass24_674 = aClass24_673;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_677 = Static81.method1507("M");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!dj;")
	public static Class24 aClass24_675 = aClass24_677;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[5][5000];

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!dj;")
	public static Class24 aClass24_676 = aClass24_677;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!vc;II)V")
	public static void method1739(@OriginalArg(1) Class98 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static103.anInt2308 != 0 && Static103.anInt2308 != 3) {
			return;
		}
		@Pc(18) int local18 = arg2 - arg0.anInt4403 / 2;
		@Pc(33) int local33 = arg1 - arg0.anInt4400 / 2;
		@Pc(39) int local39 = Static66.anInt1655 + Static115.anInt2586 & 0x7FF;
		@Pc(43) int local43 = Class1_Sub2_Sub8_Sub4.anIntArray355[local39];
		@Pc(51) int local51 = (Static192.anInt4308 + 256) * local43 >> 8;
		@Pc(55) int local55 = Class1_Sub2_Sub8_Sub4.anIntArray350[local39];
		@Pc(63) int local63 = (Static192.anInt4308 + 256) * local55 >> 8;
		@Pc(73) int local73 = local33 * local51 + local63 * local18 >> 11;
		@Pc(83) int local83 = local51 * local18 - local63 * local33 >> 11;
		@Pc(90) int local90 = local73 + Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7;
		@Pc(98) int local98 = Static87.aClass5_Sub2_Sub1_1.anInt2448 - local83 >> 7;
		@Pc(118) boolean local118 = Static115.method1988(0, Static87.aClass5_Sub2_Sub1_1.anIntArray199[0], 1, 0, Static87.aClass5_Sub2_Sub1_1.anIntArray196[0], true, local98, local90, 0, 0, 0);
		if (!local118) {
			return;
		}
		Static176.aClass1_Sub7_Sub1_34.method2753(local33);
		Static176.aClass1_Sub7_Sub1_34.method2753(local18);
		Static176.aClass1_Sub7_Sub1_34.method2775(Static66.anInt1655);
		Static176.aClass1_Sub7_Sub1_34.method2753(57);
		Static176.aClass1_Sub7_Sub1_34.method2753(Static115.anInt2586);
		Static176.aClass1_Sub7_Sub1_34.method2753(Static192.anInt4308);
		Static176.aClass1_Sub7_Sub1_34.method2753(89);
		Static176.aClass1_Sub7_Sub1_34.method2775(Static87.aClass5_Sub2_Sub1_1.anInt2501);
		Static176.aClass1_Sub7_Sub1_34.method2775(Static87.aClass5_Sub2_Sub1_1.anInt2448);
		Static176.aClass1_Sub7_Sub1_34.method2753(Static181.anInt4045);
		Static176.aClass1_Sub7_Sub1_34.method2753(63);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZLclient!af;ILclient!nf;)V")
	public static void method1741(@OriginalArg(1) Class6 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class69_Sub1 arg2) {
		@Pc(3) Class1_Sub25 local3 = new Class1_Sub25();
		local3.anInt4438 = 1;
		local3.aClass6_4 = arg0;
		local3.aLong149 = arg1;
		local3.aClass69_Sub1_147 = arg2;
		@Pc(22) Class87 local22 = Static12.aClass87_6;
		synchronized (Static12.aClass87_6) {
			Static12.aClass87_6.method2823(local3);
		}
		Static200.method3379();
	}
}
