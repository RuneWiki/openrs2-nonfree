import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public static int anInt7136;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
	public static boolean aBoolean620;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public static int anInt7138;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
	public static int anInt7135 = -1;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Lclient!bt;")
	public static final Class48 aClass48_14 = new Class48(13, 4);

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public static int anInt7137 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
	public static void method5908() {
		Static300.aClass340_65.method7987();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5910(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static79.method1039(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static264.anInt4921; local23++) {
			@Pc(28) String local28 = Static593.aStringArray55[local23];
			if (local28.startsWith("*")) {
				local28 = local28.substring(1);
			}
			local28 = Static79.method1039(local28);
			if (local28 != null && local28.equals(local18)) {
				Static264.anInt4921--;
				for (@Pc(52) int local52 = local23; local52 < Static264.anInt4921; local52++) {
					Static593.aStringArray55[local52] = Static593.aStringArray55[local52 + 1];
					Static340.aStringArray35[local52] = Static340.aStringArray35[local52 + 1];
					Static650.aStringArray57[local52] = Static650.aStringArray57[local52 + 1];
					Static505.aStringArray49[local52] = Static505.aStringArray49[local52 + 1];
					Static392.aBooleanArray29[local52] = Static392.aBooleanArray29[local52 + 1];
				}
				Static467.anInt7868 = Static370.anInt8567;
				@Pc(108) Class5_Sub21 local108 = Static64.method905(Static263.aClass49_1, Static658.aClass305_105);
				local108.aClass5_Sub41_Sub2_1.method7798(Static314.method4952(arg0));
				local108.aClass5_Sub41_Sub2_1.method7854(arg0);
				Static495.method7092(local108);
				break;
			}
		}
	}
}
