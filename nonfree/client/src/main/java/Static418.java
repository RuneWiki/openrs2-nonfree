import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "I")
	public static int anInt7259;

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "Lclient!aba;")
	public static Class3 aClass3_4;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public static int anInt7258 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
	public static void method5985() {
		Static522.aClass136_101.method3470();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	public static String method5986(@OriginalArg(1) String arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			@Pc(25) char local25 = arg0.charAt(local19);
			if (local25 == '%' && local19 + 2 < local17) {
				local25 = arg0.charAt(local19 + 1);
				@Pc(59) int local59;
				if (local25 >= '0' && local25 <= '9') {
					local59 = local25 - 48;
				} else if (local25 >= 'a' && local25 <= 'f') {
					local59 = local25 + '\n' - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local59 = local25 - 55;
				}
				local25 = arg0.charAt(local19 + 2);
				local59 *= 16;
				if (local25 >= '0' && local25 <= '9') {
					local59 += local25 - '0';
				} else if (local25 >= 'a' && local25 <= 'f') {
					local59 += local25 + 10 - 97;
				} else {
					if (local25 < 'A' || local25 > 'F') {
						local14.append('%');
						continue;
					}
					local59 += local25 + '\n' - 65;
				}
				local19 += 2;
				if (local59 != 0 && Static274.method4522((byte) local59)) {
					local14.append(Static439.method6249((byte) local59));
				}
			} else if (local25 == '+') {
				local14.append(' ');
			} else {
				local14.append(local25);
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public static void method5988() {
		if (Static3.aClass11_1 != null) {
			Static3.aClass11_1.method6283();
		}
		if (Static35.aClass11_3 != null) {
			Static35.aClass11_3.method6283();
		}
	}
}
