import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public static int anInt1439 = 0;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "Lclient!co;")
	public static final Class35 aClass35_1 = new Class35("LIVE", 0);

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method1438(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static30.method547(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < Static79.anInt1430; local30++) {
			@Pc(36) String local36 = Static47.aStringArray7[local30];
			if (local36.startsWith("*")) {
				local36 = local36.substring(1);
			}
			local36 = Static30.method547(local36);
			if (local36 != null && local36.equals(local20)) {
				Static79.anInt1430--;
				for (@Pc(60) int local60 = local30; local60 < Static79.anInt1430; local60++) {
					Static47.aStringArray7[local60] = Static47.aStringArray7[local60 + 1];
					Static331.aStringArray45[local60] = Static331.aStringArray45[local60 + 1];
					Static334.aStringArray34[local60] = Static334.aStringArray34[local60 + 1];
					Static141.aStringArray14[local60] = Static141.aStringArray14[local60 + 1];
					Static173.aBooleanArray16[local60] = Static173.aBooleanArray16[local60 + 1];
				}
				Static414.anInt7474 = Static125.anInt2284;
				Static307.method4633(Static331.aClass163_187);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg0));
				Static243.aClass3_Sub25_Sub1_7.method4080(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZZI)V")
	public static void method1439(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static203.anInt3630--;
			if (Static203.anInt3630 == 0) {
				Static329.anIntArray346 = null;
			}
		}
		if (arg0) {
			Static129.anInt2347--;
			if (Static129.anInt2347 == 0) {
				Static225.anIntArray253 = null;
			}
		}
	}
}
