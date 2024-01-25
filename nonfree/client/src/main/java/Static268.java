import java.io.IOException;
import java.lang.reflect.Method;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public static int anInt5370;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt5371 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method4614() {
		if (Static237.anInt6658 == 0) {
			return;
		}
		try {
			if (++Static191.anInt4006 > 1500) {
				if (Static155.aClass114_3 != null) {
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
				}
				if (Static272.anInt5418 >= 1) {
					Static42.anInt1131 = -5;
					Static237.anInt6658 = 0;
					return;
				}
				if (Static156.anInt5228 == Static207.anInt4331) {
					Static156.anInt5228 = Static100.anInt2562;
				} else {
					Static156.anInt5228 = Static207.anInt4331;
				}
				Static237.anInt6658 = 1;
				Static191.anInt4006 = 0;
				Static272.anInt5418++;
			}
			if (Static237.anInt6658 == 1) {
				Static113.aClass185_1 = Static1.aClass134_7.method3760(Static156.anInt5228, Static89.aString25);
				Static237.anInt6658 = 2;
			}
			@Pc(126) int local126;
			if (Static237.anInt6658 == 2) {
				if (Static113.aClass185_1.anInt5682 == 2) {
					throw new IOException();
				}
				if (Static113.aClass185_1.anInt5682 != 1) {
					return;
				}
				Static155.aClass114_3 = new Class114((Socket) Static113.aClass185_1.anObject4, Static1.aClass134_7);
				Static113.aClass185_1 = null;
				Static155.aClass114_3.method3163(Static15.aClass4_Sub11_Sub1_2.aByteArray55, Static15.aClass4_Sub11_Sub1_2.anInt3768);
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				local126 = Static155.aClass114_3.method3170();
				if (Static201.aClass35_1 != null) {
					Static201.aClass35_1.method2556();
				}
				if (Static261.aClass35_2 != null) {
					Static261.aClass35_2.method2556();
				}
				if (local126 != 101) {
					Static237.anInt6658 = 0;
					Static42.anInt1131 = local126;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					return;
				}
				Static237.anInt6658 = 3;
			}
			if (Static237.anInt6658 == 3 && Static155.aClass114_3.method3161() >= 2) {
				local126 = Static155.aClass114_3.method3170() << 8 | Static155.aClass114_3.method3170();
				Static340.method5462(local126);
				if (Static215.anInt4413 == -1) {
					Static237.anInt6658 = 0;
					Static42.anInt1131 = 6;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
				} else {
					Static237.anInt6658 = 0;
					Static155.aClass114_3.method3165();
					Static155.aClass114_3 = null;
					Static146.method2548();
				}
			}
		} catch (@Pc(202) IOException local202) {
			if (Static155.aClass114_3 != null) {
				Static155.aClass114_3.method3165();
				Static155.aClass114_3 = null;
			}
			if (Static272.anInt5418 < 1) {
				Static191.anInt4006 = 0;
				if (Static156.anInt5228 == Static207.anInt4331) {
					Static156.anInt5228 = Static100.anInt2562;
				} else {
					Static156.anInt5228 = Static207.anInt4331;
				}
				Static272.anInt5418++;
				Static237.anInt6658 = 1;
			} else {
				Static237.anInt6658 = 0;
				Static42.anInt1131 = -4;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	public static void method4615() {
		if (Static200.anInt4144 == 2) {
			Static286.anInt6700 = 96;
			return;
		}
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Long local31 = (Long) local21.invoke(local25, (Object[]) null);
					Static286.anInt6700 = (int) (local31 / 1048576L) + 1;
				} catch (@Pc(41) Throwable local41) {
				}
			}
		} catch (@Pc(43) Exception local43) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	public static void method4616() {
		Static199.aFont1 = null;
		Static224.anImage3 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method4617() {
		while (true) {
			@Pc(18) Class4_Sub21 local18 = (Class4_Sub21) Static136.aClass116_27.method3266();
			if (local18 == null) {
				return;
			}
			if (Static273.aClass128ArrayArrayArray4 != null) {
				@Pc(34) Class8_Sub1_Sub2 local34;
				@Pc(30) int local30;
				if (local18.anInt3243 >= 0) {
					local30 = local18.anInt3243 - 1;
					local34 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local30];
				} else {
					local30 = -local18.anInt3243 - 1;
					if (local30 == Static64.anInt1674) {
						local34 = Static158.aClass8_Sub1_Sub2_Sub1_1;
					} else {
						local34 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local30];
					}
				}
				if (local34 != null) {
					@Pc(64) Class18 local64 = Static113.method2380(local18.anInt3254);
					@Pc(80) int local80;
					@Pc(77) int local77;
					if (local18.anInt3252 == 1 || local18.anInt3252 == 3) {
						local77 = local64.anInt532;
						local80 = local64.anInt529;
					} else {
						local77 = local64.anInt529;
						local80 = local64.anInt532;
					}
					@Pc(95) int local95 = (local80 >> 1) + local18.anInt3246;
					@Pc(104) int local104 = (local80 + 1 >> 1) + local18.anInt3246;
					@Pc(112) int local112 = local18.anInt3242 + (local77 >> 1);
					@Pc(121) int local121 = (local77 + 1 >> 1) + local18.anInt3242;
					@Pc(126) Class60 local126 = Static261.aClass60Array2[local34.aByte77];
					@Pc(149) int local149 = local126.method2264(local95, local112) + local126.method2264(local104, local112) + local126.method2264(local95, local121) + local126.method2264(local104, local121) >> 2;
					@Pc(151) Interface7 local151 = null;
					@Pc(156) int local156 = Static217.anIntArray382[local18.anInt3250];
					if (local156 == 0) {
						local151 = (Interface7) Static354.method5631(local34.aByte77, local18.anInt3246, local18.anInt3242);
					} else if (local156 == 1) {
						local151 = (Interface7) Static43.method852(local34.aByte77, local18.anInt3246, local18.anInt3242);
					} else if (local156 == 2) {
						local151 = (Interface7) Static347.method5528(local34.aByte77, local18.anInt3246, local18.anInt3242, mb.class);
					} else if (local156 == 3) {
						local151 = (Interface7) Static172.method3324(local34.aByte77, local18.anInt3246, local18.anInt3242);
					}
					if (local151 != null) {
						Static315.method5198(0, local156, local18.anInt3245, local18.anInt3246, -1, local18.anInt3251 + 1, 0, local18.anInt3242, local34.aByte77);
						local34.anInt4984 = local18.anInt3242 * 128 + local77 * 64;
						local34.anInterface7_3 = local151;
						local34.anInt4991 = local18.anInt3246 * 128 + local80 * 64;
						local34.anInt4986 = Static199.anInt4137 + local18.anInt3245;
						local34.anInt4988 = local18.anInt3251 + Static199.anInt4137;
						local34.anInt4983 = local149;
						@Pc(278) int local278 = local18.anInt3248;
						@Pc(281) int local281 = local18.anInt3244;
						@Pc(284) int local284 = local18.anInt3249;
						@Pc(293) int local293;
						if (local278 > local281) {
							local293 = local278;
							local278 = local281;
							local281 = local293;
						}
						@Pc(300) int local300 = local18.anInt3241;
						local34.anInt4982 = local18.anInt3246 + local278;
						if (local284 > local300) {
							local293 = local284;
							local284 = local300;
							local300 = local293;
						}
						local34.anInt4992 = local18.anInt3246 + local281;
						local34.anInt4989 = local18.anInt3242 + local284;
						local34.anInt4993 = local300 + local18.anInt3242;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V")
	public static void method4618() {
		Static58.aClass198_53.method5213();
	}
}
