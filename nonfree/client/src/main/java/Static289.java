import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_111 = new Class140("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
	public static int anInt4725 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;)I")
	public static int method4069(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local13 - local17 >= local8) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg2.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(76) char local76;
			if (local19 == '\u0000') {
				local76 = arg0.charAt(local15++);
			} else {
				local76 = local19;
			}
			local17 = Static307.method5139(local60);
			local19 = Static307.method5139(local76);
			local60 = Static221.method4170(local60, arg1);
			local76 = Static221.method4170(local76, arg1);
			if (local76 != local60 && Character.toUpperCase(local60) != Character.toUpperCase(local76)) {
				local60 = Character.toLowerCase(local60);
				local76 = Character.toLowerCase(local76);
				if (local76 != local60) {
					return Static317.method5266(local60, arg1) - Static317.method5266(local76, arg1);
				}
			}
		}
		@Pc(139) int local139 = Math.min(local8, local11);
		for (@Pc(146) int local146 = 0; local146 < local139; local146++) {
			if (arg1 == 2) {
				local13 = local8 - local146 - 1;
				local15 = local11 - local146 - 1;
			} else {
				local15 = local146;
				local13 = local146;
			}
			@Pc(175) char local175 = arg2.charAt(local13);
			@Pc(179) char local179 = arg0.charAt(local15);
			if (local179 != local175 && Character.toUpperCase(local175) != Character.toUpperCase(local179)) {
				local175 = Character.toLowerCase(local175);
				local179 = Character.toLowerCase(local179);
				if (local175 != local179) {
					return Static317.method5266(local175, arg1) - Static317.method5266(local179, arg1);
				}
			}
		}
		@Pc(219) int local219 = local8 - local11;
		if (local219 != 0) {
			return local219;
		}
		for (@Pc(225) int local225 = 0; local225 < local139; local225++) {
			@Pc(231) char local231 = arg2.charAt(local225);
			@Pc(235) char local235 = arg0.charAt(local225);
			if (local231 != local235) {
				return Static317.method5266(local231, arg1) - Static317.method5266(local235, arg1);
			}
		}
		return 0;
	}
}
