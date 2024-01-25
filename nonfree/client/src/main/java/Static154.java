import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!iia;")
	public static final Class142 aClass142_4 = new Class142();

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)I")
	public static int method3057() {
		if (Static448.aClass302_13 == null) {
			if (!Static199.aBoolean358 && Static469.aClass6_Sub5_Sub9_2 != null) {
				return Static469.aClass6_Sub5_Sub9_2.anInt3238;
			}
			@Pc(20) int local20 = Static6.aClass96_1.method8026();
			@Pc(24) int local24 = Static6.aClass96_1.method8019();
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(59) int local59;
			@Pc(133) Class6_Sub5_Sub9 local133;
			if (Static437.aBoolean633) {
				@Pc(248) Class266 local248;
				if (Static76.anInt2536 < local20 && Static76.anInt2536 + Static498.anInt8705 > local20) {
					local40 = -1;
					for (local42 = 0; local42 < Static223.anInt5025; local42++) {
						if (Static319.aBoolean495) {
							local59 = Static189.anInt4113 + local42 * 16 + 33;
							if (local59 - 13 < local24 && local59 + 3 >= local24) {
								local40 = local42;
							}
						} else {
							local59 = Static189.anInt4113 + local42 * 16 + 31;
							if (local59 - 13 < local24 && local59 + 3 >= local24) {
								local40 = local42;
							}
						}
					}
					if (local40 != -1) {
						local59 = 0;
						local248 = new Class266(Static224.aClass231_5);
						for (@Pc(355) Class6_Sub5_Sub11 local355 = (Class6_Sub5_Sub11) local248.method6762(); local355 != null; local355 = (Class6_Sub5_Sub11) local248.method6763()) {
							if (local59++ == local40) {
								return ((Class6_Sub5_Sub9) local355.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66).anInt3238;
							}
						}
					}
				} else if (Static535.aClass6_Sub5_Sub11_1 != null && local20 > Static497.anInt8646 && Static9.anInt525 + Static497.anInt8646 > local20) {
					local40 = -1;
					for (local42 = 0; local42 < Static535.aClass6_Sub5_Sub11_1.anInt3423; local42++) {
						if (Static319.aBoolean495) {
							local59 = Static303.anInt6146 + local42 * 16 + 33;
							if (local59 - 13 < local24 && local59 + 3 >= local24) {
								local40 = local42;
							}
						} else {
							local59 = Static303.anInt6146 + local42 * 16 + 31;
							if (local59 - 13 < local24 && local59 + 3 >= local24) {
								local40 = local42;
							}
						}
					}
					if (local40 != -1) {
						local59 = 0;
						local248 = new Class266(Static535.aClass6_Sub5_Sub11_1.aClass231_2);
						for (local133 = (Class6_Sub5_Sub9) local248.method6762(); local133 != null; local133 = (Class6_Sub5_Sub9) local248.method6763()) {
							if (local40 == local59++) {
								return local133.anInt3238;
							}
						}
					}
				}
			} else if (Static76.anInt2536 < local20 && local20 < Static498.anInt8705 + Static76.anInt2536) {
				local40 = -1;
				for (local42 = 0; local42 < Static611.anInt10324; local42++) {
					if (Static319.aBoolean495) {
						local59 = Static189.anInt4113 + (-local42 + Static611.anInt10324 - 1) * 16 + 33;
						if (local24 > local59 - 13 && local24 <= local59 + 3) {
							local40 = local42;
						}
					} else {
						local59 = (Static611.anInt10324 - local42 - 1) * 16 + Static189.anInt4113 + 31;
						if (local59 - 13 < local24 && local59 + 3 >= local24) {
							local40 = local42;
						}
					}
				}
				if (local40 != -1) {
					local59 = 0;
					@Pc(128) Class171 local128 = new Class171(Static68.aClass163_14);
					for (local133 = (Class6_Sub5_Sub9) local128.method5092(); local133 != null; local133 = (Class6_Sub5_Sub9) local128.method5091()) {
						if (local59++ == local40) {
							return local133.anInt3238;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public static void method3058(@OriginalArg(0) int arg0) {
		Static494.anInt8615 = arg0;
	}

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "(I)Lclient!jga;")
	public static Class6_Sub4_Sub2 method3064() {
		return Static623.aClass6_Sub4_Sub2_4;
	}
}
