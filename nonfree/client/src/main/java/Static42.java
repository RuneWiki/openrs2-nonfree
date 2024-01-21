import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!fe;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_536 = Static109.method1737("backbase2");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!ud;")
	public static Class77 aClass77_5 = new Class77(32);

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_537 = Static109.method1737("Loading )2 please wait)3");

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	public static int anInt1217 = 0;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_538 = aClass53_537;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_539 = Static109.method1737("@cya@");

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
	public static int anInt1219 = 0;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!na;")
	private static Class53 aClass53_541 = Static109.method1737("Loading)3)3)3");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_540 = aClass53_541;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public static int anInt1220 = 2;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Z")
	public static boolean method842(@OriginalArg(0) int arg0) {
		if (!Static98.method1633(arg0)) {
			return false;
		}
		@Pc(18) boolean local18 = false;
		@Pc(22) Class3_Sub1_Sub15[] local22 = Static107.aClass3_Sub1_Sub15ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class3_Sub1_Sub15 local30 = local22[local24];
			if (local30 != null && local30.anInt2707 == 6) {
				@Pc(56) int local56;
				if (local30.anInt2716 != -1 || local30.anInt2694 != -1) {
					@Pc(51) boolean local51 = Static61.method1104(local30);
					if (local51) {
						local56 = local30.anInt2694;
					} else {
						local56 = local30.anInt2716;
					}
					if (local56 != -1) {
						@Pc(69) Class3_Sub1_Sub11 local69 = Static97.method1629(local56);
						local30.anInt2698 += Static37.anInt2215;
						while (local30.anInt2698 > local69.anIntArray305[local30.anInt2697]) {
							local30.anInt2698 -= local69.anIntArray305[local30.anInt2697];
							local30.anInt2697++;
							if (local30.anInt2697 >= local69.anIntArray306.length) {
								local30.anInt2697 -= local69.anInt2251;
								if (local30.anInt2697 < 0 || local69.anIntArray306.length <= local30.anInt2697) {
									local30.anInt2697 = 0;
								}
							}
							local18 = true;
						}
					}
				}
				if (local30.anInt2663 != 0 && !local30.aBoolean112) {
					local18 = true;
					@Pc(152) int local152 = local30.anInt2663 >> 16;
					@Pc(156) int local156 = local152 * Static37.anInt2215;
					local30.anInt2723 = local156 + local30.anInt2723 & 0x7FF;
					local56 = local30.anInt2663 << 16 >> 16;
					local56 *= Static37.anInt2215;
					local30.anInt2717 = local30.anInt2717 + local56 & 0x7FF;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method843() {
		Static55.aBoolean52 = true;
		Static45.aBoolean47 = true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method844() {
		aClass53_540 = null;
		aClass53_536 = null;
		aClass77_5 = null;
		aClass1_1 = null;
		aClass53_541 = null;
		aClass53_539 = null;
		aClass53_537 = null;
		aClass53_538 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!we;II)Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 method845(@OriginalArg(0) Class62 arg0, @OriginalArg(2) int arg1) {
		return Static50.method1917(arg1, arg0) ? Static87.method1452() : null;
	}
}
