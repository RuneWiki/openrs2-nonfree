import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!js", name = "n", descriptor = "I")
	public static int anInt4955 = -1;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static519.method6752(arg3);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg3;
		@Pc(27) int local27 = -arg3;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(83) int local83;
		if (arg2 >= Static617.anInt6260 && Static229.anInt4089 >= arg2) {
			@Pc(48) int[] local48 = Static276.anIntArrayArray32[arg2];
			local57 = Static166.method2620(arg1 - arg3, Static629.anInt10412, Static300.anInt5091);
			local65 = Static166.method2620(arg3 + arg1, Static629.anInt10412, Static300.anInt5091);
			local74 = Static166.method2620(arg1 - local15, Static629.anInt10412, Static300.anInt5091);
			local83 = Static166.method2620(arg1 + local15, Static629.anInt10412, Static300.anInt5091);
			Static578.method7640(arg0, local57, local74, local48);
			Static578.method7640(arg5, local74, local83, local48);
			Static578.method7640(arg0, local83, local65, local48);
		}
		@Pc(111) int local111 = -1;
		while (local24 > local10) {
			local111 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local111;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static531.anIntArray443[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(253) int local253;
			@Pc(261) int local261;
			@Pc(272) int[] local272;
			@Pc(157) int local157;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local157 = arg2 - local24;
				local57 = local24 + arg2;
				if (local57 >= Static617.anInt6260 && local157 <= Static229.anInt4089) {
					if (local15 <= local24) {
						local65 = Static166.method2620(arg1 + local10, Static629.anInt10412, Static300.anInt5091);
						local74 = Static166.method2620(arg1 - local10, Static629.anInt10412, Static300.anInt5091);
						if (local57 <= Static229.anInt4089) {
							Static578.method7640(arg0, local74, local65, Static276.anIntArrayArray32[local57]);
						}
						if (Static617.anInt6260 <= local157) {
							Static578.method7640(arg0, local74, local65, Static276.anIntArrayArray32[local157]);
						}
					} else {
						local65 = Static531.anIntArray443[local24];
						local74 = Static166.method2620(local10 + arg1, Static629.anInt10412, Static300.anInt5091);
						local83 = Static166.method2620(arg1 - local10, Static629.anInt10412, Static300.anInt5091);
						local253 = Static166.method2620(arg1 + local65, Static629.anInt10412, Static300.anInt5091);
						local261 = Static166.method2620(arg1 - local65, Static629.anInt10412, Static300.anInt5091);
						if (local57 <= Static229.anInt4089) {
							local272 = Static276.anIntArrayArray32[local57];
							Static578.method7640(arg0, local83, local261, local272);
							Static578.method7640(arg5, local261, local253, local272);
							Static578.method7640(arg0, local253, local74, local272);
						}
						if (local157 >= Static617.anInt6260) {
							local272 = Static276.anIntArrayArray32[local157];
							Static578.method7640(arg0, local83, local261, local272);
							Static578.method7640(arg5, local261, local253, local272);
							Static578.method7640(arg0, local253, local74, local272);
						}
					}
				}
			}
			local157 = arg2 - local10;
			local57 = local10 + arg2;
			if (local57 >= Static617.anInt6260 && Static229.anInt4089 >= local157) {
				local65 = local24 + arg1;
				local74 = arg1 - local24;
				if (local65 >= Static300.anInt5091 && local74 <= Static629.anInt10412) {
					local65 = Static166.method2620(local65, Static629.anInt10412, Static300.anInt5091);
					local74 = Static166.method2620(local74, Static629.anInt10412, Static300.anInt5091);
					if (local15 <= local10) {
						if (Static229.anInt4089 >= local57) {
							Static578.method7640(arg0, local74, local65, Static276.anIntArrayArray32[local57]);
						}
						if (Static617.anInt6260 <= local157) {
							Static578.method7640(arg0, local74, local65, Static276.anIntArrayArray32[local157]);
						}
					} else {
						local83 = local29 < local10 ? Static531.anIntArray443[local10] : local29;
						local253 = Static166.method2620(arg1 + local83, Static629.anInt10412, Static300.anInt5091);
						local261 = Static166.method2620(arg1 - local83, Static629.anInt10412, Static300.anInt5091);
						if (local57 <= Static229.anInt4089) {
							local272 = Static276.anIntArrayArray32[local57];
							Static578.method7640(arg0, local74, local261, local272);
							Static578.method7640(arg5, local261, local253, local272);
							Static578.method7640(arg0, local253, local65, local272);
						}
						if (local157 >= Static617.anInt6260) {
							local272 = Static276.anIntArrayArray32[local157];
							Static578.method7640(arg0, local74, local261, local272);
							Static578.method7640(arg5, local261, local253, local272);
							Static578.method7640(arg0, local253, local65, local272);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Lclient!iga;")
	public static Class34_Sub1_Sub5 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class368 local7 = Static254.aClass368ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass34_Sub1_Sub5_1;
	}
}
