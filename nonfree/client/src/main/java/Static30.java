import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_13;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_2 = new Class328(2, 4);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "Lclient!jd;")
	public static final Class153 aClass153_3 = new Class153(8, 1);

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public static int anInt863 = 0;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public static int anInt864 = 0;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public static int anInt865 = 0;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public static int anInt866 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method891() {
		@Pc(1) Class136 local1 = Static579.aClass136_107;
		synchronized (Static579.aClass136_107) {
			Static579.aClass136_107.method3470();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;Lclient!ub;ILclient!ta;Lclient!oa;Z)V")
	public static void method892(@OriginalArg(0) String arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(3) Class92 arg2, @OriginalArg(4) Class14 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(20) int local20;
		@Pc(29) int local29;
		if (Static186.aBoolean265 && Static474.method7124()) {
			@Pc(128) Class327 local128 = Static543.aClass327_12;
			@Pc(134) Class92 local134 = arg3.method6854(local128, Static507.aClass140Array1);
			local20 = local128.method7189(250, arg0, null);
			local29 = local128.method7188(local128.anInt8788, 250, arg0, null);
			@Pc(153) int local153 = Static543.aClass140_3.anInt4127;
			@Pc(157) int local157 = local153 + 4;
			local20 += local157 * 2;
			local29 += local157 * 2;
			if (local20 < Static445.anInt7718) {
				local20 = Static445.anInt7718;
			}
			if (local29 < Static179.anInt7703) {
				local29 = Static179.anInt7703;
			}
			@Pc(187) int local187 = Static339.aClass319_9.method7077(Static592.anInt9585, local20) + Static508.anInt8641;
			@Pc(195) int local195 = Static311.aClass247_8.method5723(Static579.anInt9514, local29) + Static156.anInt3343;
			arg3.method6889(Static202.aClass140_1, false).method7661(local187 + Static496.aClass140_2.anInt4127, Static496.aClass140_2.anInt4129 + local195, local20 - Static496.aClass140_2.anInt4127 * 2, -(Static496.aClass140_2.anInt4129 * 2) + local29);
			arg3.method6889(Static496.aClass140_2, true).method7666(local187, local195);
			Static496.aClass140_2.method3620();
			arg3.method6889(Static496.aClass140_2, true).method7666(local187 + local20 - local153, local195);
			Static496.aClass140_2.method3617();
			arg3.method6889(Static496.aClass140_2, true).method7666(local187 + local20 - local153, -local153 + local29 + local195);
			Static496.aClass140_2.method3620();
			arg3.method6889(Static496.aClass140_2, true).method7666(local187, local195 + local29 - local153);
			Static496.aClass140_2.method3617();
			arg3.method6889(Static543.aClass140_3, true).method7661(local187, Static496.aClass140_2.anInt4129 + local195, local153, local29 - Static496.aClass140_2.anInt4129 * 2);
			Static543.aClass140_3.method3616();
			arg3.method6889(Static543.aClass140_3, true).method7661(local187 + Static496.aClass140_2.anInt4127, local195, local20 - Static496.aClass140_2.anInt4127 * 2, local153);
			Static543.aClass140_3.method3616();
			arg3.method6889(Static543.aClass140_3, true).method7661(local20 + local187 - local153, local195 + Static496.aClass140_2.anInt4129, local153, local29 - Static496.aClass140_2.anInt4129 * 2);
			Static543.aClass140_3.method3616();
			arg3.method6889(Static543.aClass140_3, true).method7661(Static496.aClass140_2.anInt4127 + local187, local195 - -local29 - local153, local20 - Static496.aClass140_2.anInt4127 * 2, local153);
			Static543.aClass140_3.method3616();
			local134.method6401(Static56.anInt1228 | 0xFF000000, 0, arg0, local29 - local157 * 2, 1, null, local187 + local157, null, 0, local195 + local157, local20 - local157 * 2, 1, 0, -1, null);
			Static586.method7778(local187, local20, local29, local195);
		} else {
			local20 = arg1.method7189(250, arg0, null);
			local29 = arg1.method7192(250, arg0, null) * 13;
			arg3.C(6, 6, local20 + 4 + 4, local29 + 4 - -4, -16777216, 0);
			arg3.method6875(6, 6, local20 + 4 + 4, local29 + 4 + 4, -1, 0);
			arg2.method6401(-1, 0, arg0, local29, 1, null, 10, null, 0, 10, local20, 1, 0, -1, null);
			Static586.method7778(6, local20 + 8, local29 + 4 + 4, 6);
		}
		if (arg4) {
			try {
				arg3.method6848();
			} catch (@Pc(415) Exception_Sub1 local415) {
			}
		}
	}
}
