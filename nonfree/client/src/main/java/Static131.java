import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public static int anInt2360;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "[B")
	public static final byte[] aByteArray47 = new byte[2048];

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([[BILclient!qq;)V")
	public static void method2036(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class22_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg0[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub25 local30 = new Class3_Sub25(local23);
				local36 = Static127.anIntArray115[local17] >> 8;
				@Pc(42) int local42 = Static127.anIntArray115[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static59.anInt1127;
				@Pc(56) int local56 = local42 * 64 - Static49.anInt873;
				Static44.method856();
				arg1.method4782(Static250.aClass128Array1, local49, local56, Static49.anInt873, local30, Static59.anInt1127);
				arg1.method4793(local56, local12, local49, local30, Static413.aClass167_11);
				if (!arg1.aBoolean407 && Static37.anInt629 / 8 == local36 && local42 == Static149.anInt2745 / 8 && local12[0] != -1) {
					Static460.aClass64_1 = Static335.aClass58_1.method1542(Static448.aClass172_1, local12[3], local12[2], local12[1], local12[0]);
					Static138.anInt2445 = local12[4];
				}
			}
		}
		for (@Pc(128) int local128 = 0; local128 < local15; local128++) {
			@Pc(141) int local141 = (Static127.anIntArray115[local128] >> 8) * 64 - Static59.anInt1127;
			local36 = (Static127.anIntArray115[local128] & 0xFF) * 64 - Static49.anInt873;
			@Pc(156) byte[] local156 = arg0[local128];
			if (local156 == null && Static149.anInt2745 < 800) {
				Static44.method856();
				arg1.method4788(local141, local36);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BZ)V")
	public static void method2038(@OriginalArg(1) boolean arg0) {
		if (Static121.aString29.length() == 0) {
			return;
		}
		Static61.method1151("--> " + Static121.aString29);
		Static199.method3075(false, Static121.aString29, arg0);
		Static73.anInt1339 = 0;
		Static367.anInt6206 = 0;
		Static121.aString29 = "";
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!nj;)Lclient!mm;")
	public static Class153 method2042(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(7) Class153 local7 = new Class153();
		local7.anInt4352 = arg0.method4083();
		local7.aClass3_Sub3_Sub18_1 = Static141.aClass61_1.method1599(local7.anInt4352);
		return local7;
	}
}
