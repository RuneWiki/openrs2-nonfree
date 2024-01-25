import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Z")
	public static boolean aBoolean339 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)I")
	public static int method4032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public static void method4033() {
		@Pc(7) Class208 local7 = null;
		try {
			@Pc(13) Class311 local13 = Static473.aClass229_14.method6071("2", true);
			while (local13.anInt9169 == 0) {
				Static265.method3147(1L);
			}
			if (local13.anInt9169 == 1) {
				local7 = (Class208) local13.anObject17;
				@Pc(44) byte[] local44 = new byte[(int) local7.method5702()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local7.method5705(local44, local46, local44.length - local46);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static227.method4090(new Class1_Sub17(local44));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method5704();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V")
	public static void method4034() {
		Static259.anInt5037 = -1;
		Static14.anInt321 = -1;
		Static52.anInt4659 = -1;
		Static235.anInt4528 = 0;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
	public static void method4035() {
		if (Static64.anInt1610 < 0) {
			Static313.anInt5997 = -1;
			Static162.anInt3142 = -1;
			Static64.anInt1610 = 0;
		}
		if (Static335.anInt4943 < Static64.anInt1610) {
			Static64.anInt1610 = Static335.anInt4943;
			Static162.anInt3142 = -1;
			Static313.anInt5997 = -1;
		}
		if (Static32.anInt1050 < 0) {
			Static32.anInt1050 = 0;
			Static313.anInt5997 = -1;
			Static162.anInt3142 = -1;
		}
		if (Static32.anInt1050 > Static335.anInt4938) {
			Static313.anInt5997 = -1;
			Static162.anInt3142 = -1;
			Static32.anInt1050 = Static335.anInt4938;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static232.anIntArrayArrayArray11[arg0][local16][local20] == -Static332.anInt6224) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static275.anInt5260) + 1;
			@Pc(142) int local142 = (arg3 << Static275.anInt5260) + 2;
			@Pc(151) int local151 = Static296.aClass7Array11[arg0].ba(arg1, arg3) + arg5;
			if (!Static188.method3617(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static275.anInt5260) - 1;
			if (!Static188.method3617(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static275.anInt5260) - 1;
			if (!Static188.method3617(local20, local151, local177)) {
				return false;
			} else if (Static188.method3617(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static529.method8238(arg0, arg1, arg3)) {
			local16 = arg1 << Static275.anInt5260;
			local20 = arg3 << Static275.anInt5260;
			return Static188.method3617(local16 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg3) + arg5, local20 + 1) && Static188.method3617(local16 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg3) + arg5, local20 + 1) && Static188.method3617(local16 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg3 + 1) + arg5, local20 + Static382.anInt6794 - 1) && Static188.method3617(local16 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg3 + 1) + arg5, local20 + Static382.anInt6794 - 1);
		} else {
			return false;
		}
	}
}
