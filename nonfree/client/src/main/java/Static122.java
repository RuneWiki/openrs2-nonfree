import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
	public static int anInt2142 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1944(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(18) String local18 = Static555.method7630(arg0);
		if (local18 == null) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < Static529.anInt8750; local23++) {
			@Pc(33) String local33 = Static562.aStringArray36[local23];
			if (local33.startsWith("*")) {
				local33 = local33.substring(1);
			}
			local33 = Static555.method7630(local33);
			if (local33 != null && local33.equals(local18)) {
				Static529.anInt8750--;
				for (@Pc(57) int local57 = local23; local57 < Static529.anInt8750; local57++) {
					Static562.aStringArray36[local57] = Static562.aStringArray36[local57 + 1];
					Static128.aStringArray6[local57] = Static128.aStringArray6[local57 + 1];
					Static640.anIntArray587[local57] = Static640.anIntArray587[local57 + 1];
					Static377.aStringArray24[local57] = Static377.aStringArray24[local57 + 1];
					Static374.anIntArray425[local57] = Static374.anIntArray425[local57 + 1];
					Static211.aBooleanArray5[local57] = Static211.aBooleanArray5[local57 + 1];
				}
				Static223.anInt3567 = Static293.anInt4549;
				@Pc(121) Class5_Sub16 local121 = Static455.method6717(Static261.aClass187_51, Static16.aClass332_8);
				local121.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(arg0));
				local121.aClass5_Sub15_Sub2_1.method3680(arg0);
				Static479.method7038(local121);
				return;
			}
		}
	}
}
