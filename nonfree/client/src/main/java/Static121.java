import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!md", name = "D", descriptor = "Lclient!u;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!pb;")
	public static Class71 aClass71_23;

	@OriginalMember(owner = "client!md", name = "O", descriptor = "I")
	public static int anInt2684;

	@OriginalMember(owner = "client!md", name = "z", descriptor = "I")
	public static int anInt2679 = -1;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_944 = Static151.method2243("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!md", name = "B", descriptor = "Lclient!mb;")
	public static Class62 aClass62_940 = aClass62_944;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_941 = Static151.method2243("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!mb;")
	public static Class62 aClass62_942 = aClass62_941;

	@OriginalMember(owner = "client!md", name = "R", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_945 = Static151.method2243(" x ");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
	public static void method1899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass85_1 = null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II[BI)Z")
	public static boolean method1900(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		@Pc(12) Class2_Sub11 local12 = new Class2_Sub11(arg1);
		@Pc(14) boolean local14 = true;
		label70: while (true) {
			@Pc(18) int local18 = local12.method1574();
			if (local18 == 0) {
				return local14;
			}
			local7 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(55) int local55;
				@Pc(88) Class2_Sub1_Sub11 local88;
				do {
					@Pc(69) int local69;
					@Pc(59) int local59;
					do {
						do {
							do {
								do {
									@Pc(37) int local37;
									while (local31) {
										local37 = local12.method1572();
										if (local37 == 0) {
											continue label70;
										}
										local12.method1534();
									}
									local37 = local12.method1572();
									if (local37 == 0) {
										continue label70;
									}
									local29 += local37 - 1;
									@Pc(49) int local49 = local29 & 0x3F;
									local55 = local12.method1534() >> 2;
									local59 = arg0 + local49;
									@Pc(65) int local65 = local29 >> 6 & 0x3F;
									local69 = local65 + arg2;
								} while (local69 <= 0);
							} while (local59 <= 0);
						} while (local69 >= 103);
					} while (local59 >= 103);
					local88 = Static60.method844(local7);
				} while (local55 == 22 && Static60.aBoolean52 && local88.anInt1561 == 0 && local88.anInt1550 != 1 && !local88.aBoolean68);
				if (!local88.method1067()) {
					local14 = false;
					Static33.anInt787++;
				}
				local31 = true;
			}
		}
	}
}
