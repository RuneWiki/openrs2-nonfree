import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "F")
	public static float aFloat121;

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_63 = new Class98(99, 7);

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!maa;")
	public static final Class195 aClass195_7 = new Class195("", 17);

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "F")
	public static float aFloat120 = 0.0F;

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public static void method3970() {
		if (Static171.anInt9039 != -1) {
			Static515.method7057(-1, false, Static171.anInt9039, -1);
			Static171.anInt9039 = -1;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(III)V")
	public static void method3972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static113.aClass133ArrayArrayArray1[0][arg1][arg2] != null && Static113.aClass133ArrayArrayArray1[0][arg1][arg2].aClass133_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static113.aClass133ArrayArrayArray1[local22][arg1][arg2] == null) {
				@Pc(46) Class133 local46 = Static113.aClass133ArrayArrayArray1[local22][arg1][arg2] = new Class133(local22, arg1, arg2);
				if (local20) {
					local46.aByte49++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "(B)Lclient!jd;")
	public static Class6_Sub22 method3973() {
		if (Static490.aClass298_38 == null || Static43.aClass95_1 == null) {
			return null;
		}
		for (@Pc(16) Class6_Sub22 local16 = (Class6_Sub22) Static43.aClass95_1.method2272(); local16 != null; local16 = (Class6_Sub22) Static43.aClass95_1.method2272()) {
			@Pc(24) Class336 local24 = Static490.aClass320_2.method7209(local16.anInt4399);
			if (local24 != null && local24.aBoolean662 && local24.method7783(Static490.anInterface17_2)) {
				return local16;
			}
		}
		return null;
	}
}
