import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!tf", name = "G", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!tf", name = "H", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_250 = new Class88("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "Lclient!hu;")
	public static final Class138 aClass138_6 = new Class138("runescape", 0);

	@OriginalMember(owner = "client!tf", name = "J", descriptor = "Z")
	public static final boolean aBoolean608 = false;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method7048(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(40) int local40 = arg0.length();
		for (@Pc(42) int local42 = 0; local42 < local40; local42++) {
			@Pc(48) char local48 = arg0.charAt(local42);
			if (local42 == 0) {
				if (local48 == '-') {
					local24 = true;
					continue;
				}
				if (local48 == '+') {
					continue;
				}
			}
			@Pc(91) int local91;
			if (local48 >= '0' && local48 <= '9') {
				local91 = local48 - '0';
			} else if (local48 >= 'A' && local48 <= 'Z') {
				local91 = local48 - '7';
			} else if (local48 >= 'a' && local48 <= 'z') {
				local91 = local48 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local91) {
				throw new NumberFormatException();
			}
			if (local24) {
				local91 = -local91;
			}
			@Pc(120) int local120 = arg1 * local28 + local91;
			if (local120 / arg1 != local28) {
				throw new NumberFormatException();
			}
			local28 = local120;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}
}
