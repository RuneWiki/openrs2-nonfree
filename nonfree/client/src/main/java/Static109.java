import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "I")
	public static int anInt2397;

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 aClass2_Sub2_Sub1_Sub2_7;

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "Lclient!oe;")
	public static Class58 aClass58_60 = new Class58(4096);

	@OriginalMember(owner = "client!se", name = "eb", descriptor = "I")
	public static volatile int anInt2395 = 0;

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1524 = Static72.method1077("Trade)4compete");

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Lclient!u;")
	public static Class74 aClass74_1525 = aClass74_1524;

	@OriginalMember(owner = "client!se", name = "jb", descriptor = "[I")
	public static int[] anIntArray344 = new int[25];

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "Lclient!dc;")
	public static Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "Lclient!e;")
	public static Class16 aClass16_81 = new Class16(64);

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1526 = Static72.method1077("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!se", name = "qb", descriptor = "I")
	public static int anInt2400 = 99;

	@OriginalMember(owner = "client!se", name = "rb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1527 = Static72.method1077("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		@Pc(9) boolean local9 = true;
		@Pc(14) Class2_Sub10 local14 = new Class2_Sub10(arg2);
		label54: while (true) {
			@Pc(23) int local23 = local14.method1484();
			if (local23 == 0) {
				return local9;
			}
			@Pc(30) int local30 = 0;
			local7 += local23;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local14.method1484();
					if (local42 == 0) {
						continue label54;
					}
					local30 += local42 - 1;
					@Pc(66) int local66 = local30 & 0x3F;
					@Pc(72) int local72 = local30 >> 6 & 0x3F;
					@Pc(78) int local78 = local14.method1514() >> 2;
					@Pc(82) int local82 = arg0 + local72;
					@Pc(86) int local86 = arg1 + local66;
					if (local82 > 0 && local86 > 0 && local82 < 103 && local86 < 103) {
						@Pc(103) Class2_Sub2_Sub14 local103 = Static2.method19(local7);
						if (local78 != 22 || !Static84.aBoolean73 || local103.anInt2271 != 0 || local103.anInt2242 == 1 || local103.aBoolean91) {
							local36 = true;
							if (!local103.method1554()) {
								Static61.anInt1576++;
								local9 = false;
							}
						}
					}
				}
				local42 = local14.method1484();
				if (local42 == 0) {
					break;
				}
				local14.method1514();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
	public static void method1668() {
		aClass16_81 = null;
		anIntArray344 = null;
		aClass74_1527 = null;
		aClass74_1526 = null;
		aClass58_60 = null;
		aClass74_1525 = null;
		aClass74_1524 = null;
		aClass14_1 = null;
		aClass2_Sub2_Sub1_Sub2_7 = null;
	}
}
