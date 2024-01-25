import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Lclient!gj;")
	public static Class143 aClass143_24;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt2206;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!gj;")
	public static Class143 aClass143_25;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_36 = new Class126(16, 4);

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "[Lclient!fca;")
	public static final Class3_Sub17[] aClass3_Sub17Array1 = new Class3_Sub17[2048];

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method2041(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(26) boolean local26 = false;
		@Pc(28) boolean local28 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local26 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local46 >= '0' && local46 <= '9') {
				local74 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local74 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local74 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local74 >= arg1) {
				throw new NumberFormatException();
			}
			if (local26) {
				local74 = -local74;
			}
			@Pc(126) int local126 = local74 + local35 * arg1;
			if (local126 / arg1 != local35) {
				throw new NumberFormatException();
			}
			local35 = local126;
			local28 = true;
		}
		if (!local28) {
			throw new NumberFormatException();
		}
		return local35;
	}
}
