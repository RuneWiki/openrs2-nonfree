import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_64 = new Class154(57, -1);

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "Lclient!pb;")
	public static final Class262 aClass262_9 = new Class262(13, 17);

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	public static final int anInt5091 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!mv;II)Lclient!fo;")
	public static Class112 method4410(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method4966(arg1);
		return local16 == null ? null : new Class112(local16);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method4413(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local33 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(87) int local87;
			if (local48 >= '0' && local48 <= '9') {
				local87 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local87 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local87 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local87 >= arg1) {
				throw new NumberFormatException();
			}
			if (local33) {
				local87 = -local87;
			}
			@Pc(119) int local119 = local87 + arg1 * local37;
			if (local37 != local119 / arg1) {
				throw new NumberFormatException();
			}
			local37 = local119;
			local35 = true;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local37;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)Lclient!nb;")
	public static Class232 method4414(@OriginalArg(1) int arg0) {
		@Pc(8) Class232[] local8 = Static434.method5704();
		for (@Pc(18) int local18 = 0; local18 < local8.length; local18++) {
			@Pc(24) Class232 local24 = local8[local18];
			if (local24.anInt5969 == arg0) {
				return local24;
			}
		}
		return null;
	}
}
