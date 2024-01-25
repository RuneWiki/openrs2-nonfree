import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
	public static int anInt5280;

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_90 = new Class70(64);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method4786(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) char[] local15 = new char[arg0];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
			@Pc(29) int local29 = arg1[arg2 + local19] & 0xFF;
			if (local29 != 0) {
				if (local29 >= 128 && local29 < 160) {
					@Pc(43) char local43 = Static240.aCharArray6[local29 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local29 = local43;
				}
				local15[local17++] = (char) local29;
			}
		}
		return new String(local15, 0, local17);
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	public static void method4787() {
		Static162.anInt3066 = 0;
		Static15.anInt281 = 0;
		Static323.method5374();
		Static113.method2276();
		Static354.method5813();
		@Pc(25) int local25;
		for (@Pc(17) int local17 = 0; local17 < Static162.anInt3066; local17++) {
			local25 = Static105.anIntArray264[local17];
			if (Static76.anInt2853 != Static239.aClass44_Sub4_Sub4_Sub2Array8[local25].anInt5105) {
				if (Static239.aClass44_Sub4_Sub4_Sub2Array8[local25].aClass18_1.method365()) {
					Static91.method3104(Static239.aClass44_Sub4_Sub4_Sub2Array8[local25]);
				}
				Static239.aClass44_Sub4_Sub4_Sub2Array8[local25].method4726(null);
				Static239.aClass44_Sub4_Sub4_Sub2Array8[local25] = null;
			}
		}
		if (Static142.aClass6_Sub10_Sub1_3.anInt4188 != Static31.anInt578) {
			throw new RuntimeException("gnp1 pos:" + Static142.aClass6_Sub10_Sub1_3.anInt4188 + " psize:" + Static31.anInt578);
		}
		for (local25 = 0; local25 < Static149.anInt2759; local25++) {
			if (Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static149.anInt2759);
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
	public static void method4789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub8 local13 = Static239.method5786(13, arg1);
		local13.method2648();
		local13.anInt2511 = arg0;
	}
}
