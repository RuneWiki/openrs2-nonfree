import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
	public static int anInt774;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 aClass2_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!se;")
	public static Class76 aClass76_1 = new Class76();

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
	public static int anInt772 = 0;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	public static int anInt773 = 0;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!ai;")
	private static Class6 aClass6_216 = Static38.method685("No reply from loginserver)3");

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_214 = aClass6_216;

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!ai;")
	public static Class6 aClass6_215 = Static38.method685("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_217 = Static38.method685("0(U");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public static void method538() {
		aClass6_217 = null;
		aClass6_216 = null;
		aClass76_1 = null;
		aClass6_215 = null;
		aClass6_214 = null;
		aClass2_Sub3_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lclient!wa;IB)V")
	public static void method539(@OriginalArg(0) Class87[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class87 local13 = arg0[local7];
			if (local13 != null && local13.anInt4074 == arg1 && (!local13.aBoolean174 || !Static164.method2623(local13))) {
				if (local13.anInt4116 == 0) {
					if (!local13.aBoolean174 && Static164.method2623(local13) && local13 != Static67.aClass87_5) {
						continue;
					}
					method539(arg0, local13.anInt4085);
					if (local13.aClass87Array2 != null) {
						method539(local13.aClass87Array2, local13.anInt4085);
					}
					@Pc(64) Class2_Sub16 local64 = (Class2_Sub16) Static148.aClass16_10.method479((long) local13.anInt4085);
					if (local64 != null) {
						Static82.method1316(local64.anInt2551);
					}
				}
				if (local13.anInt4116 == 6) {
					@Pc(92) int local92;
					if (local13.anInt4132 != -1 || local13.anInt4059 != -1) {
						@Pc(87) boolean local87 = Static181.method1519(local13);
						if (local87) {
							local92 = local13.anInt4059;
						} else {
							local92 = local13.anInt4132;
						}
						if (local92 != -1) {
							@Pc(104) Class2_Sub3_Sub8 local104 = Static129.method2790(local92);
							local13.anInt4097 += Static131.anInt3038;
							while (local104.anIntArray113[local13.anInt4119] < local13.anInt4097) {
								local13.anInt4097 -= local104.anIntArray113[local13.anInt4119];
								local13.anInt4119++;
								if (local13.anInt4119 >= local104.anIntArray109.length) {
									local13.anInt4119 -= local104.anInt1694;
									if (local13.anInt4119 < 0 || local13.anInt4119 >= local104.anIntArray109.length) {
										local13.anInt4119 = 0;
									}
								}
								Static151.method2327(local13);
							}
						}
					}
					if (local13.anInt4077 != 0 && !local13.aBoolean174) {
						@Pc(189) int local189 = local13.anInt4077 >> 16;
						local92 = local13.anInt4077 << 16 >> 16;
						@Pc(200) int local200 = local189 * Static131.anInt3038;
						local13.anInt4081 = local13.anInt4081 + local200 & 0x7FF;
						local92 *= Static131.anInt3038;
						local13.anInt4126 = local13.anInt4126 + local92 & 0x7FF;
						Static151.method2327(local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	public static void method540() {
		Static89.aClass2_Sub10_Sub3_1.method2030();
		Static19.aClass10_21 = null;
		Static65.anInt1613 = 1;
	}
}
