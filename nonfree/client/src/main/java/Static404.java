import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
	public static int anInt6677;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "[I")
	public static final int[] anIntArray420 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5524(@OriginalArg(1) String arg0) {
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
		for (@Pc(25) int local25 = 0; local25 < Static12.anInt180; local25++) {
			@Pc(31) String local31 = Static296.aStringArray32[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static30.method547(local31);
			if (local31 != null && local31.equals(local20)) {
				Static12.anInt180--;
				for (@Pc(57) int local57 = local25; local57 < Static12.anInt180; local57++) {
					Static296.aStringArray32[local57] = Static296.aStringArray32[local57 + 1];
					Static347.aStringArray35[local57] = Static347.aStringArray35[local57 + 1];
					Static216.anIntArray238[local57] = Static216.anIntArray238[local57 + 1];
					Static77.aStringArray10[local57] = Static77.aStringArray10[local57 + 1];
					Static83.anIntArray74[local57] = Static83.anIntArray74[local57 + 1];
					Static122.aBooleanArray8[local57] = Static122.aBooleanArray8[local57 + 1];
				}
				Static414.anInt7474 = Static125.anInt2284;
				Static307.method4633(Static385.aClass163_167);
				Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg0));
				Static243.aClass3_Sub25_Sub1_7.method4080(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
	public static int method5525(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
