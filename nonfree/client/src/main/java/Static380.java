import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public static void method5645() {
		Static567.aClass340_58.method7987();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBII)Z")
	public static boolean method5646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static37.aBoolean43 || !Static521.aBoolean738) {
			return false;
		} else if (Static383.anInt6814 < 100) {
			return false;
		} else {
			@Pc(29) int local29 = Static276.anIntArrayArrayArray49[arg0][arg1][arg2];
			if (local29 == -Static196.anInt3768) {
				return false;
			} else if (Static196.anInt3768 == local29) {
				return true;
			} else if (Static495.aClass109Array4 == Static111.aClass109Array3) {
				return false;
			} else {
				@Pc(49) int local49 = arg1 << Static588.anInt9672;
				@Pc(53) int local53 = arg2 << Static588.anInt9672;
				if (Static395.method5806(Static495.aClass109Array4[arg0].method7695(arg2 + 1, arg1 - -1), local49 + 1, Static495.aClass109Array4[arg0].method7695(arg2, arg1), local53 + 1, local53 + Static671.anInt10769 + -1, Static495.aClass109Array4[arg0].method7695(arg2 + 1, arg1), local49 + 1, local53 + -1 + Static671.anInt10769, Static671.anInt10769 + local49 - 1) && Static395.method5806(Static495.aClass109Array4[arg0].method7695(arg2, arg1 + 1), local49 + 1, Static495.aClass109Array4[arg0].method7695(arg2, arg1), local53 + 1, local53 - -Static671.anInt10769 + -1, Static495.aClass109Array4[arg0].method7695(arg2 + 1, arg1 + 1), local49 + Static671.anInt10769 - 1, local53 + 1, Static671.anInt10769 + local49 - 1)) {
					Static156.anInt3155++;
					Static276.anIntArrayArrayArray49[arg0][arg1][arg2] = Static196.anInt3768;
					return true;
				} else {
					Static276.anIntArrayArrayArray49[arg0][arg1][arg2] = -Static196.anInt3768;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5648(@OriginalArg(1) String arg0) {
		Static89.aString11 = arg0;
		if (Static639.anApplet2 == null) {
			return;
		}
		try {
			@Pc(12) String local12 = Static639.anApplet2.getParameter("cookieprefix");
			@Pc(20) String local20 = Static639.anApplet2.getParameter("cookiehost");
			@Pc(35) String local35 = local12 + "settings=" + arg0 + "; version=1; path=/; domain=" + local20;
			if (arg0.length() == 0) {
				local35 = local35 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local35 = local35 + "; Expires=" + Static213.method8050(Static547.method7619() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static682.method3656("document.cookie=\"" + local35 + "\"", Static639.anApplet2);
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
