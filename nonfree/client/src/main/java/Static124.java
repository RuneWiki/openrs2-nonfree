import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
	public static int anInt2268;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "Lclient!eaa;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!la;II)Lclient!it;")
	public static Class28 method1879(@OriginalArg(0) Class207 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class28 local15 = (Class28) Static12.aClass87_12.method1805((long) arg1);
		if (local15 == null) {
			if (Static315.aBoolean474) {
				local15 = Static213.aClass133_5.method7297(Static649.method2900(arg0, arg1), true);
			} else {
				local15 = Static207.method3585(arg0.method4690(arg1));
			}
			Static12.aClass87_12.method1792((long) arg1, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)I")
	public static int method1880() {
		if (Static443.aClass295_14 == null) {
			if (!Static142.aBoolean190 && Static12.aClass5_Sub5_Sub15_1 != null) {
				return Static12.aClass5_Sub5_Sub15_1.anInt6764;
			}
			@Pc(20) int local20 = Static3.aClass3_3.method8875();
			@Pc(24) int local24 = Static3.aClass3_3.method8879();
			@Pc(59) int local59;
			@Pc(61) int local61;
			@Pc(74) int local74;
			@Pc(137) Class5_Sub5_Sub15 local137;
			if (Static266.aBoolean355) {
				@Pc(130) Class165 local130;
				if (local20 > Static346.anInt4654 && local20 < Static115.anInt2157 + Static346.anInt4654) {
					local59 = -1;
					for (local61 = 0; local61 < Static140.anInt2437; local61++) {
						if (Static186.aBoolean231) {
							local74 = local61 * 16 + Static612.anInt10212 + 33;
							if (local24 > local74 - 13 && local24 <= local74 + 3) {
								local59 = local61;
							}
						} else {
							local74 = local61 * 16 + Static612.anInt10212 + 31;
							if (local74 - 13 < local24 && local24 <= local74 + 3) {
								local59 = local61;
							}
						}
					}
					if (local59 != -1) {
						local74 = 0;
						local130 = new Class165(Static601.aClass368_13);
						for (@Pc(243) Class5_Sub5_Sub4 local243 = (Class5_Sub5_Sub4) local130.method3911(); local243 != null; local243 = (Class5_Sub5_Sub4) local130.method3912()) {
							if (local74++ == local59) {
								return ((Class5_Sub5_Sub15) local243.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66).anInt6764;
							}
						}
					}
				} else if (Static281.aClass5_Sub5_Sub4_1 != null && Static129.anInt2304 < local20 && Static129.anInt2304 + Static565.anInt9564 > local20) {
					local59 = -1;
					for (local61 = 0; local61 < Static281.aClass5_Sub5_Sub4_1.anInt2287; local61++) {
						if (Static186.aBoolean231) {
							local74 = Static14.anInt240 + local61 * 16 + 33;
							if (local24 > local74 - 13 && local24 <= local74 + 3) {
								local59 = local61;
							}
						} else {
							local74 = Static14.anInt240 + local61 * 16 + 31;
							if (local74 - 13 < local24 && local74 + 3 >= local24) {
								local59 = local61;
							}
						}
					}
					if (local59 != -1) {
						local74 = 0;
						local130 = new Class165(Static281.aClass5_Sub5_Sub4_1.aClass368_2);
						for (local137 = (Class5_Sub5_Sub15) local130.method3911(); local137 != null; local137 = (Class5_Sub5_Sub15) local130.method3912()) {
							if (local74++ == local59) {
								return local137.anInt6764;
							}
						}
					}
				}
			} else if (local20 > Static346.anInt4654 && Static115.anInt2157 + Static346.anInt4654 > local20) {
				local59 = -1;
				for (local61 = 0; local61 < Static491.anInt8293; local61++) {
					if (Static186.aBoolean231) {
						local74 = (Static491.anInt8293 - local61 - 1) * 16 + Static612.anInt10212 + 33;
						if (local24 > local74 - 13 && local74 + 3 >= local24) {
							local59 = local61;
						}
					} else {
						local74 = (Static491.anInt8293 - local61 - 1) * 16 + Static612.anInt10212 + 31;
						if (local24 > local74 - 13 && local24 <= local74 + 3) {
							local59 = local61;
						}
					}
				}
				if (local59 != -1) {
					local74 = 0;
					@Pc(352) Class199 local352 = new Class199(Static84.aClass330_6);
					for (local137 = (Class5_Sub5_Sub15) local352.method4552(); local137 != null; local137 = (Class5_Sub5_Sub15) local352.method4554()) {
						if (local74++ == local59) {
							return local137.anInt6764;
						}
					}
				}
			}
		}
		return -1;
	}
}
