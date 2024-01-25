import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_63 = new Class119("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_57 = new Class12(65, -1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZB)V")
	public static void method1849(@OriginalArg(0) boolean arg0) {
		Static383.anInt6392 = 0;
		Static78.anInt3517 = 0;
		Static372.method4930();
		Static429.method5668(arg0);
		Static253.method3630();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static78.anInt3517; local26++) {
			local32 = Static334.anIntArray391[local26];
			if (Static17.aBoolean39 && Static310.method4221(local32)) {
				Static145.method1627();
			}
			if (Static236.anInt4213 != Static87.aClass25_Sub5_Sub1_Sub1Array6[local32].anInt4298) {
				if (Static87.aClass25_Sub5_Sub1_Sub1Array6[local32].aClass54_1.method1155()) {
					Static329.method4419(Static87.aClass25_Sub5_Sub1_Sub1Array6[local32]);
				}
				Static87.aClass25_Sub5_Sub1_Sub1Array6[local32].method2590(null);
				Static87.aClass25_Sub5_Sub1_Sub1Array6[local32] = null;
			}
		}
		if (Static336.aClass1_Sub28_Sub1_2.anInt6812 != Static245.anInt4432) {
			throw new RuntimeException("gnp1 pos:" + Static336.aClass1_Sub28_Sub1_2.anInt6812 + " psize:" + Static245.anInt4432);
		}
		for (local32 = 0; local32 < Static328.anInt5608; local32++) {
			if (Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local32]] == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static328.anInt5608);
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static216.method3149(arg1, arg3, arg5, arg2, arg4, 0, arg0);
	}

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)I")
	public static int method1852() {
		if (Static371.aClass124_10 == null) {
			if (!Static17.aBoolean39 && Static118.anInt2201 > 0) {
				if (Static345.aBoolean678 && Static160.aClass123_1.method2750(81) && Static118.anInt2201 > 2) {
					return ((Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262.aClass1_262).anInt2418;
				}
				return ((Class1_Sub19) Static202.aClass227_21.aClass1_225.aClass1_262).anInt2418;
			}
			@Pc(45) int local45 = Static62.aClass96_1.method3872();
			@Pc(49) int local49 = Static62.aClass96_1.method3870();
			@Pc(51) int local51 = Static129.anInt2365;
			@Pc(53) int local53 = Static187.anInt3228;
			@Pc(55) int local55 = Static413.anInt6778;
			if (local45 > local51 && local51 + local55 > local45) {
				@Pc(70) int local70 = -1;
				@Pc(89) int local89;
				for (@Pc(72) int local72 = 0; local72 < Static118.anInt2201; local72++) {
					if (Static382.aBoolean780) {
						local89 = local53 + (-local72 + Static118.anInt2201 + -1) * 16 + 33;
						if (local89 - 13 < local49 && local89 + 3 >= local49) {
							local70 = local72;
						}
					} else {
						local89 = (Static118.anInt2201 - local72 - 1) * 16 + local53 + 31;
						if (local49 > local89 - 13 && local89 + 3 >= local49) {
							local70 = local72;
						}
					}
				}
				if (local70 != -1) {
					local89 = 0;
					@Pc(159) Class149 local159 = new Class149(Static202.aClass227_21);
					for (@Pc(164) Class1_Sub19 local164 = (Class1_Sub19) local159.method3487(); local164 != null; local164 = (Class1_Sub19) local159.method3484()) {
						if (local89++ == local70) {
							return local164.anInt2418;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V")
	public static void method1853() {
		if (Static207.anInt6026 == -1) {
			return;
		}
		@Pc(16) int local16 = Static62.aClass96_1.method3872();
		@Pc(20) int local20 = Static62.aClass96_1.method3870();
		@Pc(25) Class1_Sub24 local25 = (Class1_Sub24) Static130.aClass227_19.method4967();
		if (local25 != null) {
			local16 = local25.method2418();
			local20 = local25.method2421();
		}
		Static352.method4765(Static69.anInt1304, Static338.anInt5777, local20, 0, 0, 0, Static207.anInt6026, local16, 0);
		if (Static253.aClass124_7 != null) {
			Static136.method5269(local20, local16);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[BBIII)V")
	public static void method1854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		arg3 += arg2;
		@Pc(20) int local20 = arg0 - arg2 >> 2;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg0 - arg2 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(30) int local30 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg1[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg1[local35] = 1;
			arg3 = local40 + 1;
			arg1[local40] = 1;
		}
	}
}
