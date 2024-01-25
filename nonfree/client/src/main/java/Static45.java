import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
	public static int anInt666;

	@OriginalMember(owner = "client!bw", name = "F", descriptor = "[[Lclient!hm;")
	public static Class107[][] aClass107ArrayArray1;

	@OriginalMember(owner = "client!bw", name = "J", descriptor = "Lclient!fo;")
	public static Class1_Sub14 aClass1_Sub14_1;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_9 = new Class142("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "I")
	public static int anInt669 = 64;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZLjava/lang/String;I)I")
	public static int method604(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(28) boolean local28 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = arg1.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg1.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local28 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(78) int local78;
			if (local48 >= '0' && local48 <= '9') {
				local78 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local78 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local78 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local78 >= arg0) {
				throw new NumberFormatException();
			}
			if (local28) {
				local78 = -local78;
			}
			@Pc(123) int local123 = arg0 * local37 + local78;
			if (local123 / arg0 != local37) {
				throw new NumberFormatException();
			}
			local35 = true;
			local37 = local123;
		}
		if (!local35) {
			throw new NumberFormatException();
		}
		return local37;
	}
}
