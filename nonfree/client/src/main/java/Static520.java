import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_50 = new Class166(64);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method7763(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static71.aBoolean94) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static605.aClass302ArrayArray4[local18] == null || Static605.aClass302ArrayArray4[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class302 local40 = Static605.aClass302ArrayArray4[local18][local22];
		@Pc(54) Class6_Sub2_Sub4 local54;
		if (arg0 == -1 && local40.anInt8816 == 0) {
			for (local54 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local54 != null; local54 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				if (local54.anInt1738 == 16 || local54.anInt1738 == 1003 || local54.anInt1738 == 47 || local54.anInt1738 == 44 || local54.anInt1738 == 15) {
					for (@Pc(87) Class302 local87 = Static386.method4914(local54.anInt1735); local87 != null; local87 = Static129.method2117(local87)) {
						if (local87.anInt8838 == local40.anInt8838) {
							return true;
						}
					}
				}
			}
		} else {
			for (local54 = (Class6_Sub2_Sub4) Static298.aClass8_34.method149(); local54 != null; local54 = (Class6_Sub2_Sub4) Static298.aClass8_34.method155()) {
				if (arg0 == local54.anInt1733 && local40.anInt8838 == local54.anInt1735 && (local54.anInt1738 == 16 || local54.anInt1738 == 1003 || local54.anInt1738 == 47 || local54.anInt1738 == 44 || local54.anInt1738 == 15)) {
					return true;
				}
			}
		}
		return false;
	}
}
