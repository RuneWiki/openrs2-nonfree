import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	public static int anInt1358;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_23 = new Class289(19, -1);

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1248(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static96.anInt1739 >= 200 && !Static272.aBoolean295 || Static96.anInt1739 >= 200) {
			Static270.method3991(Static52.aClass41_11.method1007(Static616.anInt10077));
			return;
		}
		@Pc(28) String local28 = Static573.method4494(arg0);
		if (local28 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static96.anInt1739; local33++) {
			@Pc(41) String local41 = Static573.method4494(Static480.aStringArray50[local33]);
			if (local41 != null && local41.equals(local28)) {
				Static270.method3991(arg0 + Static52.aClass41_38.method1007(Static616.anInt10077));
				return;
			}
			if (Static306.aStringArray38[local33] != null) {
				@Pc(72) String local72 = Static573.method4494(Static306.aStringArray38[local33]);
				if (local72 != null && local72.equals(local28)) {
					Static270.method3991(arg0 + Static52.aClass41_38.method1007(Static616.anInt10077));
					return;
				}
			}
		}
		for (@Pc(111) int local111 = 0; local111 < Static477.anInt8198; local111++) {
			@Pc(119) String local119 = Static573.method4494(Static572.aStringArray58[local111]);
			if (local119 != null && local119.equals(local28)) {
				Static270.method3991(Static52.aClass41_43.method1007(Static616.anInt10077) + arg0 + Static52.aClass41_44.method1007(Static616.anInt10077));
				return;
			}
			if (Static602.aStringArray63[local111] != null) {
				@Pc(155) String local155 = Static573.method4494(Static602.aStringArray63[local111]);
				if (local155 != null && local155.equals(local28)) {
					Static270.method3991(Static52.aClass41_43.method1007(Static616.anInt10077) + arg0 + Static52.aClass41_44.method1007(Static616.anInt10077));
					return;
				}
			}
		}
		if (Static573.method4494(Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aString45).equals(local28)) {
			Static270.method3991(Static52.aClass41_41.method1007(Static616.anInt10077));
		} else {
			@Pc(209) Class6_Sub26 local209 = Static268.method3981(Static377.aClass15_2, Static621.aClass289_146);
			local209.aClass6_Sub23_Sub1_2.method8366(Static622.method8568(arg0));
			local209.aClass6_Sub23_Sub1_2.method8398(arg0);
			Static670.method9077(local209);
		}
	}
}
