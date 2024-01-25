import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_1 = new Class13(0, 3, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_2 = new Class13(1, 3, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_3 = new Class13(2, 4, Static336.aClass220_12);

	@OriginalMember(owner = "client!ai", name = "k", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_4 = new Class13(3, 1, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_5 = new Class13(4, 2, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!ai;")
	public static final Class13 aClass13_6 = new Class13(5, 3, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!ai;")
	private static final Class13 aClass13_7 = new Class13(6, 4, Static336.aClass220_16);

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public static final int anInt546 = Static330.method5267(16);

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
	public static boolean method625() {
		@Pc(12) Class6 local12 = Static207.aClass211_29.aClass6_154.aClass6_284;
		if (local12 == null || Static207.aClass211_29.aClass6_154 == local12) {
			return false;
		}
		@Pc(23) Class6_Sub42 local23 = (Class6_Sub42) local12;
		if (local23.anInt8285 >= 2000) {
			local23.anInt8285 -= 2000;
		}
		return local23.anInt8285 == 1002;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)[Lclient!ai;")
	public static Class13[] method626() {
		return new Class13[] { aClass13_1, aClass13_2, aClass13_3, aClass13_4, aClass13_5, aClass13_6, aClass13_7 };
	}
}
