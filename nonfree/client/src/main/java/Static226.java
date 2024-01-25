import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public static final int anInt3905 = 1407;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3577(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(13) int local13 = arg0.indexOf("--> ");
		if (local13 >= 0) {
			local7 = arg0.substring(0, local13 + 4);
			arg0 = arg0.substring(local13 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(48) int local48 = arg0.indexOf(" ", "directlogin ".length());
			if (local48 >= 0) {
				@Pc(53) int local53 = arg0.length();
				arg0 = arg0.substring(0, local48) + " ";
				for (@Pc(69) int local69 = local48 + 1; local69 < local53; local69++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!wq;)Lclient!nk;")
	public static Class253 method3578(@OriginalArg(1) Class5_Sub36 arg0) {
		@Pc(7) int local7 = arg0.method7268();
		return new Class253(local7);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!rv;I)I")
	public static int method3579(@OriginalArg(0) Class5_Sub36_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method7343(2);
		@Pc(33) int local33;
		if (local10 == 0) {
			local33 = 0;
		} else if (local10 == 1) {
			local33 = arg0.method7343(5);
		} else if (local10 == 2) {
			local33 = arg0.method7343(8);
		} else {
			local33 = arg0.method7343(11);
		}
		return local33;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	public static int method3580() {
		return Static405.anInt10896;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z")
	public static boolean method3581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static469.method6633(arg0, arg1)) {
			return Static45.method787(arg1, arg0) | (arg0 & 0xB000) != 0 | Static540.method7411(arg1, arg0) ? true : (Static648.method8947(arg0, arg1) | Static509.method7018(arg0, arg1)) & (arg1 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
