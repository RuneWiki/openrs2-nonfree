import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_174 = new Class298(59, -1);

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method7623(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static529.method6996(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static529.method6996(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(52) int local52 = local14 - local11;
		if (local52 < 1 || local52 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local52);
		for (@Pc(69) int local69 = local11; local69 < local14; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static522.method6947(local75)) {
				@Pc(83) char local83 = Static459.method6375(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLclient!og;)V")
	public static void method7625(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(16) Class3_Sub17 local16 = (Class3_Sub17) Static145.aClass310_11.method6601((long) arg0.anInt6429);
		if (local16 == null) {
			return;
		}
		if (local16.aClass3_Sub6_Sub2_2 != null) {
			Static164.aClass3_Sub6_Sub1_1.method291(local16.aClass3_Sub6_Sub2_2);
			local16.aClass3_Sub6_Sub2_2 = null;
		}
		local16.method7812();
	}
}
