import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "[I")
	public static int[] anIntArray44;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "[I")
	public static int[] anIntArray45;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_11 = new Class231(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_10 = new Class25(41, 6);

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[I")
	public static final int[] anIntArray46 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method463(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static127.anInt2142; local11++) {
			if (arg0.equalsIgnoreCase(Static296.aStringArray49[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static148.aStringArray32[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IILjava/lang/String;Z)I")
	public static int method464(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(45) char local45 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local45 == '-') {
					local31 = true;
					continue;
				}
				if (local45 == '+') {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local45 >= '0' && local45 <= '9') {
				local94 = local45 - '0';
			} else if (local45 >= 'A' && local45 <= 'Z') {
				local94 = local45 - '7';
			} else if (local45 >= 'a' && local45 <= 'z') {
				local94 = local45 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local94 >= arg0) {
				throw new NumberFormatException();
			}
			if (local31) {
				local94 = -local94;
			}
			@Pc(120) int local120 = local94 + local35 * arg0;
			if (local120 / arg0 != local35) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local120;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}
}
