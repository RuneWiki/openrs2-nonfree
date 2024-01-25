import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "Lclient!mv;")
	public static Class229 aClass229_119;

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "[I")
	public static int[] anIntArray540;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
	public static int anInt8011;

	@OriginalMember(owner = "client!tba", name = "m", descriptor = "Lclient!mca;")
	public static Class2_Sub31 aClass2_Sub31_2;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_112 = new Class154(73, 0);

	@OriginalMember(owner = "client!tba", name = "j", descriptor = "Lclient!nfa;")
	public static final Class236 aClass236_3 = new Class236(16);

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_113 = new Class154(42, 7);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6528(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(28) String local28 = Static273.method3974(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static107.anInt1861; local33++) {
			@Pc(39) String local39 = Static394.aStringArray33[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static273.method3974(local39);
			if (local39 != null && local39.equals(local28)) {
				Static107.anInt1861--;
				for (@Pc(63) int local63 = local33; local63 < Static107.anInt1861; local63++) {
					Static394.aStringArray33[local63] = Static394.aStringArray33[local63 + 1];
					Static197.aStringArray18[local63] = Static197.aStringArray18[local63 + 1];
					Static166.anIntArray213[local63] = Static166.anIntArray213[local63 + 1];
					Static74.aStringArray8[local63] = Static74.aStringArray8[local63 + 1];
					Static173.anIntArray219[local63] = Static173.anIntArray219[local63 + 1];
					Static282.aBooleanArray19[local63] = Static282.aBooleanArray19[local63 + 1];
				}
				Static586.anInt9519 = Static390.anInt6454;
				@Pc(128) Class2_Sub34 local128 = Static555.method7264(Static264.aClass154_52, Static551.aClass64_2);
				local128.aClass2_Sub7_Sub2_2.method4459(Static474.method6143(arg0));
				local128.aClass2_Sub7_Sub2_2.method4481(arg0);
				Static100.method1508(local128);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)Z")
	public static boolean method6531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
