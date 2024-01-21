import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Lclient!jc;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	public static int anInt51;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "Lclient!kb;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
	public static int anInt56;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public static int anInt62;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!v;")
	private static Class62 aClass62_16 = Static45.method753("Invalid username or password)3");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_13 = aClass62_16;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "Lclient!v;")
	private static Class62 aClass62_20 = Static45.method753("Message");

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_14 = aClass62_20;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	public static int anInt50 = 0;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!v;")
	public static Class62 aClass62_15 = Static45.method753("m\u001c1chte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "Lclient!v;")
	public static Class62 aClass62_17 = Static45.method753("headicons_hint");

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_18 = Static45.method753("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "Lclient!v;")
	public static Class62 aClass62_19 = Static45.method753("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[BII)Z")
	public static boolean method67(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class3_Sub8 local17 = new Class3_Sub8(arg1);
		@Pc(19) int local19 = -1;
		label65: while (true) {
			@Pc(23) int local23 = local17.method1769();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(68) int local68;
				@Pc(97) Class3_Sub1_Sub9 local97;
				do {
					@Pc(72) int local72;
					@Pc(76) int local76;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local17.method1769();
										if (local42 == 0) {
											continue label65;
										}
										local17.method1803();
									}
									local42 = local17.method1769();
									if (local42 == 0) {
										continue label65;
									}
									local34 += local42 - 1;
									@Pc(56) int local56 = local34 >> 6 & 0x3F;
									@Pc(60) int local60 = local34 & 0x3F;
									local68 = local17.method1803() >> 2;
									local72 = arg2 + local56;
									local76 = arg0 + local60;
								} while (local72 <= 0);
							} while (local76 <= 0);
						} while (local72 >= 103);
					} while (local76 >= 103);
					local97 = Static10.method1322(local19);
				} while (local68 == 22 && Static92.aBoolean151 && local97.anInt1063 == 0 && !local97.aBoolean58);
				local36 = true;
				if (!local97.method650()) {
					local12 = false;
					Static6.anInt210++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public static void method68() {
		aClass9_1 = null;
		aClass62_17 = null;
		aClass3_Sub1_Sub1_Sub1_2 = null;
		aClass62_18 = null;
		aClass62_13 = null;
		aClass62_19 = null;
		aClass62_20 = null;
		aClass3_Sub1_Sub1_Sub1_1 = null;
		aClass35_1 = null;
		aClass62_16 = null;
		aClass62_15 = null;
		aClass62_14 = null;
	}
}
