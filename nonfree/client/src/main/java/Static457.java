import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pfa", name = "m", descriptor = "Lclient!al;")
	public static Class17 aClass17_6;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
	public static long aLong203 = 1L;

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)Z")
	public static boolean method6144(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method6148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class95 arg4) {
		arg4.KA(arg3, arg2, arg0 + arg3, arg2 + arg1);
		arg4.method8054(arg1, arg2, arg0, arg3, -16777216);
		if (Static306.anInt5140 < 100) {
			return;
		}
		@Pc(35) float local35 = (float) Static671.anInt9360 / (float) Static671.anInt9356;
		@Pc(37) int local37 = arg0;
		@Pc(39) int local39 = arg1;
		if (local35 < 1.0F) {
			local39 = (int) ((float) arg0 * local35);
		} else {
			local37 = (int) ((float) arg1 / local35);
		}
		@Pc(66) int local66 = arg3 + (arg0 - local37) / 2;
		@Pc(75) int local75 = arg2 + (arg1 - local39) / 2;
		if (Static30.aClass6_7 == null || arg0 != Static30.aClass6_7.method5119() || arg1 != Static30.aClass6_7.method5136()) {
			Static671.method7639(Static671.anInt9357, Static671.anInt9358 + Static671.anInt9360, Static671.anInt9357 - -Static671.anInt9356, Static671.anInt9358, local66, local75, local66 + local37, local39 + local75);
			Static671.method7634(arg4);
			Static30.aClass6_7 = arg4.method7998(local66, local75, local37, local39, false);
		}
		Static30.aClass6_7.method5115(local66, local75);
		@Pc(123) int local123 = local37 * Static377.anInt7878 / Static671.anInt9356;
		@Pc(129) int local129 = Static127.anInt2265 * local39 / Static671.anInt9360;
		@Pc(137) int local137 = local66 + Static64.anInt1327 * local37 / Static671.anInt9356;
		@Pc(152) int local152 = local75 + local39 - Static27.anInt680 * local39 / Static671.anInt9360 - local129;
		@Pc(159) int local159 = -1996554240;
		if (Static499.aClass203_8 == Static227.aClass203_4) {
			local159 = -1996488705;
		}
		arg4.aa(local137, local152, local123, local129, local159, 1);
		arg4.method8062(local137, local152, local123, local129, local159, 0);
		if (Static270.anInt4659 <= 0) {
			return;
		}
		@Pc(195) int local195;
		if (Static258.anInt4526 > 50) {
			local195 = (100 - Static258.anInt4526) * 5;
		} else {
			local195 = Static258.anInt4526 * 5;
		}
		for (@Pc(206) Class3_Sub46 local206 = (Class3_Sub46) Static671.aClass302_68.method6603(); local206 != null; local206 = (Class3_Sub46) Static671.aClass302_68.method6605()) {
			@Pc(214) Class188 local214 = Static671.aClass378_4.method8708(local206.anInt9112);
			if (Static140.method2324(local214)) {
				@Pc(235) int local235;
				@Pc(246) int local246;
				if (local206.anInt9112 == Static329.anInt5459) {
					local235 = local66 + local37 * local206.anInt9116 / Static671.anInt9356;
					local246 = (Static671.anInt9360 - local206.anInt9118) * local39 / Static671.anInt9360 + local75;
					arg4.method8054(4, local246 - 2, 4, local235 - 2, local195 << 24 | 0xFFFF00);
				} else if (Static28.anInt691 != -1 && local214.anInt4980 == Static28.anInt691) {
					local235 = local206.anInt9116 * local37 / Static671.anInt9356 + local66;
					local246 = local39 * (Static671.anInt9360 - local206.anInt9118) / Static671.anInt9360 + local75;
					arg4.method8054(4, local246 - 2, 4, local235 - 2, local195 << 24 | 0xFFFF00);
				}
			}
		}
	}
}
