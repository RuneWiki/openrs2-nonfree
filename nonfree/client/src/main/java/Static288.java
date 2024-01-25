import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!io", name = "B", descriptor = "Lclient!eja;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)I")
	public static int method4036(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg2;
		}
		@Pc(14) int local14 = 128 - arg0;
		@Pc(28) int local28 = local14 * (arg2 & 0x7F) + arg0 * (arg1 & 0x7F) >> 7;
		@Pc(42) int local42 = (arg1 & 0x380) * arg0 + (arg2 & 0x380) * local14 >> 7;
		@Pc(57) int local57 = local14 * (arg2 & 0xFC00) + (arg1 & 0xFC00) * arg0 >> 7;
		return local57 & 0xFC00 | local42 & 0x380 | local28 & 0x7F;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)I")
	public static int method4037() {
		if (Static334.aClass270_10 == null) {
			if (!Static530.aBoolean556 && Static585.aClass3_Sub7_Sub10_3 != null) {
				return Static585.aClass3_Sub7_Sub10_3.anInt3910;
			}
			@Pc(30) int local30 = Static334.aClass18_1.method4192();
			@Pc(34) int local34 = Static334.aClass18_1.method4196();
			@Pc(58) int local58;
			@Pc(60) int local60;
			@Pc(75) int local75;
			@Pc(297) Class3_Sub7_Sub10 local297;
			if (Static228.aBoolean744) {
				@Pc(145) Class355 local145;
				if (Static123.anInt2492 < local30 && local30 < Static123.anInt2492 + Static332.anInt5338) {
					local58 = -1;
					for (local60 = 0; local60 < Static239.anInt3802; local60++) {
						if (Static477.aBoolean508) {
							local75 = Static177.anInt3132 + local60 * 16 + 33;
							if (local75 - 13 < local34 && local75 + 3 >= local34) {
								local58 = local60;
							}
						} else {
							local75 = Static177.anInt3132 + local60 * 16 + 31;
							if (local34 > local75 - 13 && local75 + 3 >= local34) {
								local58 = local60;
							}
						}
					}
					if (local58 != -1) {
						local75 = 0;
						local145 = new Class355(Static242.aClass147_2);
						for (@Pc(150) Class3_Sub7_Sub5 local150 = (Class3_Sub7_Sub5) local145.method7923(); local150 != null; local150 = (Class3_Sub7_Sub5) local145.method7921()) {
							if (local58 == local75++) {
								return ((Class3_Sub7_Sub10) local150.aClass147_1.aClass3_Sub7_28.aClass3_Sub7_67).anInt3910;
							}
						}
					}
				} else if (Static15.aClass3_Sub7_Sub5_1 != null && local30 > Static440.anInt6770 && local30 < Static331.anInt5337 + Static440.anInt6770) {
					local58 = -1;
					for (local60 = 0; local60 < Static15.aClass3_Sub7_Sub5_1.anInt2315; local60++) {
						if (Static477.aBoolean508) {
							local75 = local60 * 16 + Static225.anInt3682 + 33;
							if (local34 > local75 - 13 && local75 + 3 >= local34) {
								local58 = local60;
							}
						} else {
							local75 = Static225.anInt3682 + local60 * 16 + 31;
							if (local75 - 13 < local34 && local34 <= local75 + 3) {
								local58 = local60;
							}
						}
					}
					if (local58 != -1) {
						local75 = 0;
						local145 = new Class355(Static15.aClass3_Sub7_Sub5_1.aClass147_1);
						for (local297 = (Class3_Sub7_Sub10) local145.method7923(); local297 != null; local297 = (Class3_Sub7_Sub10) local145.method7921()) {
							if (local75++ == local58) {
								return local297.anInt3910;
							}
						}
					}
				}
			} else if (local30 > Static123.anInt2492 && Static332.anInt5338 + Static123.anInt2492 > local30) {
				local58 = -1;
				for (local60 = 0; local60 < Static716.anInt11158; local60++) {
					if (Static477.aBoolean508) {
						local75 = (Static716.anInt11158 - local60 - 1) * 16 + Static177.anInt3132 + 33;
						if (local75 - 13 < local34 && local75 + 3 >= local34) {
							local58 = local60;
						}
					} else {
						local75 = Static177.anInt3132 + (Static716.anInt11158 - local60 - 1) * 16 + 31;
						if (local75 - 13 < local34 && local34 <= local75 + 3) {
							local58 = local60;
						}
					}
				}
				if (local58 != -1) {
					local75 = 0;
					@Pc(435) Class304 local435 = new Class304(Static419.aClass342_81);
					for (local297 = (Class3_Sub7_Sub10) local435.method6983(); local297 != null; local297 = (Class3_Sub7_Sub10) local435.method6984()) {
						if (local75++ == local58) {
							return local297.anInt3910;
						}
					}
				}
			}
		}
		return -1;
	}
}
