import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "B")
	public static byte aByte38;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray4;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "Z")
	public static final boolean aBoolean126 = false;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!it;)Lclient!bt;")
	public static Class43 method1418(@OriginalArg(1) Class12_Sub2_Sub2 arg0) {
		@Pc(9) Class43 local9;
		if (Static640.aClass43_5 == null) {
			local9 = new Class43();
		} else {
			local9 = Static640.aClass43_5;
			Static640.aClass43_5 = Static640.aClass43_5.aClass43_3;
			Static561.anInt9756--;
			local9.aClass43_3 = null;
		}
		local9.aClass12_Sub2_Sub2_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)Z")
	public static boolean method1421() {
		@Pc(15) Class14_Sub28 local15 = (Class14_Sub28) Static663.aClass262_75.method6318();
		if (local15 == null) {
			return false;
		}
		for (@Pc(21) int local21 = 0; local21 < local15.anInt4734; local21++) {
			if (local15.aClass150Array1[local21] != null && local15.aClass150Array1[local21].anInt4247 == 0) {
				return false;
			}
			if (local15.aClass150Array2[local21] != null && local15.aClass150Array2[local21].anInt4247 == 0) {
				return false;
			}
		}
		return true;
	}
}
