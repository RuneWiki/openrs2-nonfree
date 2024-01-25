import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
	public static int anInt5269;

	@OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
	public static int anInt5271;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "Lclient!c;")
	public static Class40 aClass40_3;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_134 = new Class158("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
	public static int anInt5276 = 0;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	public static boolean method4041(@OriginalArg(3) String arg0) {
		@Pc(29) boolean local29 = false;
		@Pc(31) boolean local31 = false;
		@Pc(33) int local33 = 0;
		@Pc(36) int local36 = arg0.length();
		for (@Pc(38) int local38 = 0; local38 < local36; local38++) {
			@Pc(43) char local43 = arg0.charAt(local38);
			if (local38 == 0) {
				if (local43 == '-') {
					local29 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local43 >= '0' && local43 <= '9') {
				local80 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local80 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local80 = local43 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local29) {
				local80 = -local80;
			}
			@Pc(117) int local117 = local33 * 10 + local80;
			if (local117 / 10 != local33) {
				return false;
			}
			local33 = local117;
			local31 = true;
		}
		return local31;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
	public static void method4042(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static67.aClass252ArrayArrayArray2 = Static53.aClass252ArrayArrayArray1;
			Static396.aClass96Array5 = Static221.aClass96Array4;
		} else {
			Static67.aClass252ArrayArrayArray2 = Static409.aClass252ArrayArrayArray3;
			Static396.aClass96Array5 = Static262.aClass96Array3;
		}
		Static220.anInt4418 = Static67.aClass252ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lclient!vi;")
	public static Class256 method4043(@OriginalArg(0) int arg0) {
		@Pc(6) Class256[] local6 = Static115.method1867();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			@Pc(17) Class256 local17 = local6[local8];
			if (local17.anInt7552 == arg0) {
				return local17;
			}
		}
		return null;
	}
}
