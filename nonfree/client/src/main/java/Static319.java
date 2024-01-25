import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "Lclient!mea;")
	public static Class237 aClass237_7;

	@OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
	public static int anInt10907 = 0;

	@OriginalMember(owner = "client!jw", name = "n", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_127 = new Class286(57, 4);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)V")
	public static void method9110() {
		try {
			@Pc(10) int local10;
			if (Static112.anInt2244 == 1) {
				local10 = Static671.aClass3_Sub22_Sub5_3.method9323();
				if (local10 > 0 && Static671.aClass3_Sub22_Sub5_3.method9325()) {
					local10 -= Static172.anInt3134;
					if (local10 < 0) {
						local10 = 0;
					}
					Static671.aClass3_Sub22_Sub5_3.method9343(32023, local10);
					return;
				}
				Static671.aClass3_Sub22_Sub5_3.method9327();
				Static671.aClass3_Sub22_Sub5_3.method9318();
				Static305.aClass3_Sub32_2 = null;
				Static595.aClass86_1 = null;
				if (Static481.aClass221_127 == null) {
					Static112.anInt2244 = 0;
				} else {
					Static112.anInt2244 = 2;
				}
			}
			if (Static112.anInt2244 == 3) {
				local10 = Static671.aClass3_Sub22_Sub5_3.method9323();
				if (Static554.anInt9248 > local10 && Static671.aClass3_Sub22_Sub5_3.method9325()) {
					local10 += Static89.anInt1479;
					if (Static554.anInt9248 < local10) {
						local10 = Static554.anInt9248;
					}
					Static671.aClass3_Sub22_Sub5_3.method9343(32023, local10);
					return;
				}
				Static89.anInt1479 = 0;
				Static112.anInt2244 = 0;
			}
		} catch (@Pc(99) Exception local99) {
			local99.printStackTrace();
			Static671.aClass3_Sub22_Sub5_3.method9327();
			Static481.aClass221_127 = null;
			Static305.aClass3_Sub32_2 = null;
			Static713.aClass3_Sub22_Sub5_4 = null;
			Static595.aClass86_1 = null;
			Static112.anInt2244 = 0;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIII)V")
	public static void method9113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static383.method5756(arg2);
		@Pc(23) int local23 = 0;
		@Pc(28) int local28 = arg2 - arg4;
		if (local28 < 0) {
			local28 = 0;
		}
		@Pc(34) int local34 = arg2;
		@Pc(37) int local37 = -arg2;
		@Pc(39) int local39 = local28;
		@Pc(42) int local42 = -local28;
		@Pc(44) int local44 = -1;
		@Pc(46) int local46 = -1;
		@Pc(67) int local67;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(94) int local94;
		if (Static280.anInt5114 <= arg5 && Static356.anInt6028 >= arg5) {
			@Pc(58) int[] local58 = Static384.anIntArrayArray38[arg5];
			local67 = Static27.method393(arg1 - arg2, Static85.anInt1313, Static316.anInt6313);
			local77 = Static27.method393(arg2 + arg1, Static85.anInt1313, Static316.anInt6313);
			local86 = Static27.method393(arg1 - local28, Static85.anInt1313, Static316.anInt6313);
			local94 = Static27.method393(local28 + arg1, Static85.anInt1313, Static316.anInt6313);
			Static482.method7040(arg3, local67, local58, local86);
			Static482.method7040(arg0, local86, local58, local94);
			Static482.method7040(arg3, local94, local58, local77);
		}
		while (local23 < local34) {
			local46 += 2;
			local44 += 2;
			local42 += local46;
			local37 += local44;
			if (local42 >= 0 && local39 >= 1) {
				local39--;
				Static394.anIntArray381[local39] = local23;
				local42 -= local39 << 1;
			}
			local23++;
			@Pc(258) int local258;
			@Pc(269) int local269;
			@Pc(276) int[] local276;
			@Pc(162) int local162;
			if (local37 >= 0) {
				local34--;
				local37 -= local34 << 1;
				local162 = arg5 - local34;
				local67 = local34 + arg5;
				if (local67 >= Static280.anInt5114 && local162 <= Static356.anInt6028) {
					if (local34 >= local28) {
						local77 = Static27.method393(arg1 + local23, Static85.anInt1313, Static316.anInt6313);
						local86 = Static27.method393(arg1 - local23, Static85.anInt1313, Static316.anInt6313);
						if (local67 <= Static356.anInt6028) {
							Static482.method7040(arg3, local86, Static384.anIntArrayArray38[local67], local77);
						}
						if (Static280.anInt5114 <= local162) {
							Static482.method7040(arg3, local86, Static384.anIntArrayArray38[local162], local77);
						}
					} else {
						local77 = Static394.anIntArray381[local34];
						local86 = Static27.method393(local23 + arg1, Static85.anInt1313, Static316.anInt6313);
						local94 = Static27.method393(arg1 - local23, Static85.anInt1313, Static316.anInt6313);
						local258 = Static27.method393(arg1 + local77, Static85.anInt1313, Static316.anInt6313);
						local269 = Static27.method393(arg1 - local77, Static85.anInt1313, Static316.anInt6313);
						if (Static356.anInt6028 >= local67) {
							local276 = Static384.anIntArrayArray38[local67];
							Static482.method7040(arg3, local94, local276, local269);
							Static482.method7040(arg0, local269, local276, local258);
							Static482.method7040(arg3, local258, local276, local86);
						}
						if (local162 >= Static280.anInt5114) {
							local276 = Static384.anIntArrayArray38[local162];
							Static482.method7040(arg3, local94, local276, local269);
							Static482.method7040(arg0, local269, local276, local258);
							Static482.method7040(arg3, local258, local276, local86);
						}
					}
				}
			}
			local162 = arg5 - local23;
			local67 = local23 + arg5;
			if (local67 >= Static280.anInt5114 && local162 <= Static356.anInt6028) {
				local77 = local34 + arg1;
				local86 = arg1 - local34;
				if (local77 >= Static85.anInt1313 && Static316.anInt6313 >= local86) {
					local77 = Static27.method393(local77, Static85.anInt1313, Static316.anInt6313);
					local86 = Static27.method393(local86, Static85.anInt1313, Static316.anInt6313);
					if (local28 > local23) {
						local94 = local39 < local23 ? Static394.anIntArray381[local23] : local39;
						local258 = Static27.method393(arg1 + local94, Static85.anInt1313, Static316.anInt6313);
						local269 = Static27.method393(arg1 - local94, Static85.anInt1313, Static316.anInt6313);
						if (local67 <= Static356.anInt6028) {
							local276 = Static384.anIntArrayArray38[local67];
							Static482.method7040(arg3, local86, local276, local269);
							Static482.method7040(arg0, local269, local276, local258);
							Static482.method7040(arg3, local258, local276, local77);
						}
						if (local162 >= Static280.anInt5114) {
							local276 = Static384.anIntArrayArray38[local162];
							Static482.method7040(arg3, local86, local276, local269);
							Static482.method7040(arg0, local269, local276, local258);
							Static482.method7040(arg3, local258, local276, local77);
						}
					} else {
						if (Static356.anInt6028 >= local67) {
							Static482.method7040(arg3, local86, Static384.anIntArrayArray38[local67], local77);
						}
						if (local162 >= Static280.anInt5114) {
							Static482.method7040(arg3, local86, Static384.anIntArrayArray38[local162], local77);
						}
					}
				}
			}
		}
	}
}
