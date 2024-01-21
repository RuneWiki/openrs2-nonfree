import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!jf;")
	public static Class26_Sub1 aClass26_Sub1_6;

	@OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
	public static int anInt1103 = -1;

	@OriginalMember(owner = "client!gd", name = "W", descriptor = "Lclient!r;")
	private static Class61 aClass61_328 = Static129.method2060("Loaded input handler");

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lclient!r;")
	public static Class61 aClass61_329 = aClass61_328;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lclient!r;")
	public static Class61 aClass61_330 = Static129.method2060(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lclient!r;")
	private static Class61 aClass61_331 = Static129.method2060("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "Lclient!r;")
	private static Class61 aClass61_332 = Static129.method2060("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lclient!r;")
	public static Class61 aClass61_333 = aClass61_332;

	@OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lclient!r;")
	public static Class61 aClass61_334 = Static129.method2060("Lade Texturen )2 ");

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_335 = aClass61_331;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
	public static void method754() {
		aClass61_328 = null;
		aClass61_334 = null;
		aClass61_329 = null;
		aClass61_331 = null;
		aClass26_Sub1_6 = null;
		aClass61_335 = null;
		aClass61_330 = null;
		aClass61_332 = null;
		Class5_Sub2_Sub6.anIntArray179 = null;
		aClass61_333 = null;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lclient!ke;I)I")
	public static int method755(@OriginalArg(0) Class5_Sub11 arg0) {
		@Pc(17) Class5_Sub6 local17 = (Class5_Sub6) Static97.aClass20_9.method656(((long) arg0.anInt1614 << 32) + (long) arg0.anInt1645);
		return local17 == null ? arg0.anInt1646 : local17.anInt365;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method756() {
		Static57.aClass20_6 = new Class20(32);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
	public static int method757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 >> 7;
		@Pc(16) int local16 = arg2 >> 7;
		if (local12 < 0 || local16 < 0 || local12 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg0;
		if (arg0 < 3 && (Static30.aByteArrayArrayArray2[1][local12][local16] & 0x2) == 2) {
			local37 = arg0 + 1;
		}
		@Pc(58) int local58 = arg1 & 0x7F;
		@Pc(62) int local62 = arg2 & 0x7F;
		@Pc(89) int local89 = (128 - local58) * Static65.anIntArrayArrayArray3[local37][local12][local16] + Static65.anIntArrayArrayArray3[local37][local12 + 1][local16] * local58 >> 7;
		@Pc(120) int local120 = Static65.anIntArrayArrayArray3[local37][local12 + 1][local16 + 1] * local58 + Static65.anIntArrayArrayArray3[local37][local12][local16 + 1] * (128 - local58) >> 7;
		return local120 * local62 + local89 * (128 - local62) >> 7;
	}
}
