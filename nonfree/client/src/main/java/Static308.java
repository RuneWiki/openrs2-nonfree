import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
	public static int anInt4721 = 0;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Z)V")
	public static void method4290() {
		@Pc(8) Class2_Sub20_Sub2 local8 = Static487.aClass221_2.aClass2_Sub20_Sub2_2;
		local8.method8607();
		@Pc(21) int local21 = local8.method8608(8);
		@Pc(30) int local30;
		if (Static217.anInt3445 > local21) {
			for (local30 = local21; local30 < Static217.anInt3445; local30++) {
				Static169.anIntArray220[Static682.anInt11016++] = Static266.anIntArray305[local30];
			}
		}
		if (local21 > Static217.anInt3445) {
			throw new RuntimeException("gnpov1");
		}
		Static217.anInt3445 = 0;
		for (local30 = 0; local30 < local21; local30++) {
			@Pc(79) int local79 = Static266.anIntArray305[local30];
			@Pc(87) Class4_Sub2_Sub1_Sub2_Sub2 local87 = ((Class2_Sub49) Static467.aClass218_37.method5095((long) local79, 0)).aClass4_Sub2_Sub1_Sub2_Sub2_3;
			@Pc(92) int local92 = local8.method8608(1);
			if (local92 == 0) {
				Static266.anIntArray305[Static217.anInt3445++] = local79;
				local87.anInt2360 = Static646.anInt9915;
			} else {
				@Pc(114) int local114 = local8.method8608(2);
				if (local114 == 0) {
					Static266.anIntArray305[Static217.anInt3445++] = local79;
					local87.anInt2360 = Static646.anInt9915;
					Static45.anIntArray57[Static584.anInt9206++] = local79;
				} else {
					@Pc(162) int local162;
					@Pc(172) int local172;
					if (local114 == 1) {
						Static266.anIntArray305[Static217.anInt3445++] = local79;
						local87.anInt2360 = Static646.anInt9915;
						local162 = local8.method8608(3);
						local87.method2069(1, local162);
						local172 = local8.method8608(1);
						if (local172 == 1) {
							Static45.anIntArray57[Static584.anInt9206++] = local79;
						}
					} else if (local114 == 2) {
						Static266.anIntArray305[Static217.anInt3445++] = local79;
						local87.anInt2360 = Static646.anInt9915;
						if (local8.method8608(1) == 1) {
							local162 = local8.method8608(3);
							local87.method2069(2, local162);
							local172 = local8.method8608(3);
							local87.method2069(2, local172);
						} else {
							local162 = local8.method8608(3);
							local87.method2069(0, local162);
						}
						local162 = local8.method8608(1);
						if (local162 == 1) {
							Static45.anIntArray57[Static584.anInt9206++] = local79;
						}
					} else if (local114 == 3) {
						Static169.anIntArray220[Static682.anInt11016++] = local79;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([BI)Z")
	public static boolean method4291(@OriginalArg(0) byte[] arg0) {
		@Pc(15) Class2_Sub20 local15 = new Class2_Sub20(arg0);
		@Pc(19) int local19 = local15.method8581(-17416);
		if (local19 != 2) {
			return false;
		}
		@Pc(39) boolean local39 = local15.method8581(-17416) == 1;
		if (local39) {
			Static704.method9422(local15);
		}
		Static276.method7841(local15);
		return true;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
	public static int method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static217.anIntArrayArray28 == null ? 0 : Static217.anIntArrayArray28[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I")
	public static int method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6;
		if (arg0 > arg1) {
			local6 = arg1;
			arg1 = arg0;
			arg0 = local6;
		}
		while (arg0 != 0) {
			local6 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local6;
		}
		return arg1;
	}
}
