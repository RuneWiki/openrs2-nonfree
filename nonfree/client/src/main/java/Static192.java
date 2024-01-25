import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_33 = new Class73();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z")
	public static boolean method3671(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class local8 = (Class) Static417.aHashtable14.get(arg1);
		if (local8 == null) {
			@Pc(28) File local28 = (File) Static158.aHashtable6.get(arg1);
			if (local28 != null) {
				try {
					local28 = new File(local28.getCanonicalPath());
					@Pc(47) Class local47 = Class.forName("java.lang.Runtime");
					@Pc(50) Class local50 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(60) Method local60 = local50.getDeclaredMethod("setAccessible", Boolean.TYPE);
					@Pc(76) Method local76 = local47.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
					local60.invoke(local76, Boolean.TRUE);
					local76.invoke(Runtime.getRuntime(), arg0, local28.getPath());
					local60.invoke(local76, Boolean.FALSE);
					Static417.aHashtable14.put(arg1, arg0);
					return true;
				} catch (@Pc(119) NoSuchMethodException local119) {
					System.load(local28.getPath());
					Static417.aHashtable14.put(arg1, ub.class);
					return true;
				} catch (@Pc(137) Throwable local137) {
				}
			}
			return false;
		} else if (local8.getClassLoader() == arg0.getClassLoader()) {
			return true;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BILclient!qa;)Z")
	public static boolean method3673(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(11) int local11 = (Static37.anInt7512 - 104) / 2;
		@Pc(17) int local17 = (Static329.anInt6247 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static87.method1914(local21, arg0, local25, local29)) {
						local40 = local29;
						if (Static112.method2322(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static21.method6669(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static491.aClass84_24 = arg1.method5862(local90, 512, 512, 512);
		Static203.method3817();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(189) boolean[][] local189 = new boolean[Static232.anInt4889 + 1][Static232.anInt4889 + 1];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(219) int local219;
		@Pc(227) int local227;
		@Pc(253) int local253;
		@Pc(257) int local257;
		@Pc(315) int local315;
		@Pc(321) int local321;
		@Pc(325) int local325;
		@Pc(340) int local340;
		for (@Pc(191) int local191 = local11; local191 < local11 + 104; local191 += Static232.anInt4889) {
			for (local195 = local17; local195 < local17 + 104; local195 += Static232.anInt4889) {
				local199 = 0;
				local201 = 0;
				local203 = local191;
				if (local191 > 0) {
					local199 += 4;
					local203 = local191 - 1;
				}
				local212 = local195;
				if (local195 > 0) {
					local212 = local195 - 1;
				}
				local219 = Static232.anInt4889 + local191;
				if (local219 < 104) {
					local219++;
				}
				local227 = Static232.anInt4889 + local195;
				if (local227 < 104) {
					local201 += 4;
					local227++;
				}
				arg1.N(0, 0, Static232.anInt4889 * 4 + local199, local201 + Static232.anInt4889 * 4);
				arg1.Z(-16777216);
				@Pc(261) int local261;
				for (local253 = arg0; local253 <= 3; local253++) {
					for (local257 = 0; local257 <= Static232.anInt4889; local257++) {
						for (local261 = 0; local261 <= Static232.anInt4889; local261++) {
							local189[local257][local261] = Static87.method1914(local203 + local257, arg0, local261 + local212, local253);
						}
					}
					Static155.aClass215Array5[local253].method7836(local203, local212, local219, local227, local189);
					if (!Static385.aBoolean619) {
						for (local261 = -4; local261 < Static232.anInt4889; local261++) {
							for (local315 = -4; local315 < Static232.anInt4889; local315++) {
								local321 = local261 + local191;
								local325 = local315 + local195;
								if (local11 <= local321 && local17 <= local325 && Static87.method1914(local321, arg0, local325, local253)) {
									local340 = local253;
									if (Static112.method2322(local325, local321)) {
										local340 = local253 - 1;
									}
									if (local340 >= 0) {
										Static78.method1704(local162, local199 + local261 * 4, local340, arg1, local201 + (Static232.anInt4889 - local315) * 4 - 4, local325, local40, local321);
									}
								}
							}
						}
					}
				}
				if (Static385.aBoolean619) {
					@Pc(398) Class184 local398 = Static510.aClass184Array1[arg0];
					for (local261 = 0; local261 < Static232.anInt4889; local261++) {
						for (local315 = 0; local315 < Static232.anInt4889; local315++) {
							local321 = local191 + local261;
							local325 = local195 + local315;
							local340 = local398.anIntArrayArray51[local321 - local398.anInt5439][local325 - local398.anInt5440];
							if ((local340 & 0x40240000) != 0) {
								arg1.method5866((Static232.anInt4889 - local315) * 4 + local201 - 4, 4, 4, -1713569622, local261 * 4 + local199);
							} else if ((local340 & 0x800000) != 0) {
								arg1.method5827(-1713569622, 4, local201 + (Static232.anInt4889 - local315) * 4 - 4, local199 + local261 * 4);
							} else if ((local340 & 0x2000000) != 0) {
								arg1.method5840(local201 + (Static232.anInt4889 - local315) * 4 - 4, 4, -1713569622, local199 + local261 * 4 + 3);
							} else if ((local340 & 0x8000000) != 0) {
								arg1.method5827(-1713569622, 4, (Static232.anInt4889 - local315) * 4 + local201 + 3 - 4, local199 - -(local261 * 4));
							} else if ((local340 & 0x20000000) != 0) {
								arg1.method5840(local201 + (-local315 + Static232.anInt4889) * 4 - 4, 4, -1713569622, local199 + local261 * 4);
							}
						}
					}
				}
				arg1.f(local199, local201, Static232.anInt4889 * 4, Static232.anInt4889 * 4, local181, 2);
				Static491.aClass84_24.P((local191 - local11) * 4 + 48, -(Static232.anInt4889 * 4) + 464 + -((local195 + -local17) * 4), Static232.anInt4889 * 4, Static232.anInt4889 * 4, local199, local201);
			}
		}
		arg1.n();
		arg1.Z(-16777215);
		Static445.method6725();
		Static210.anInt4598 = 0;
		Static275.aClass73_45.method2014();
		if (!Static385.aBoolean619) {
			for (local195 = local11; local195 < local11 + 104; local195++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local201 = arg0; arg0 + 1 >= local201 && local201 <= 3; local201++) {
						if (Static87.method1914(local195, arg0, local199, local201)) {
							@Pc(688) Interface19 local688 = (Interface19) Static160.method3298(local201, local195, local199);
							if (local688 == null) {
								local688 = (Interface19) Static531.method7866(local201, local195, local199, wf.class);
							}
							if (local688 == null) {
								local688 = (Interface19) Static324.method5105(local201, local195, local199);
							}
							if (local688 == null) {
								local688 = (Interface19) Static533.method7882(local201, local195, local199);
							}
							if (local688 != null) {
								@Pc(729) Class279 local729 = Static49.aClass155_2.method4063(local688.method7915());
								if (!local729.aBoolean579 || Static105.aBoolean204) {
									local219 = local729.anInt8292;
									if (local729.anIntArray620 != null) {
										for (local227 = 0; local227 < local729.anIntArray620.length; local227++) {
											if (local729.anIntArray620[local227] != -1) {
												@Pc(759) Class279 local759 = Static49.aClass155_2.method4063(local729.anIntArray620[local227]);
												if (local759.anInt8292 >= 0) {
													local219 = local759.anInt8292;
												}
											}
										}
									}
									if (local219 >= 0) {
										@Pc(782) boolean local782 = false;
										if (local219 >= 0) {
											@Pc(792) Class152 local792 = Static293.aClass93_8.method2480(local219);
											if (local792 != null && local792.aBoolean377) {
												local782 = true;
											}
										}
										local253 = local195;
										local257 = local199;
										if (local782) {
											@Pc(810) int[][] local810 = Static510.aClass184Array1[local201].anIntArrayArray51;
											local315 = Static510.aClass184Array1[local201].anInt5439;
											local321 = Static510.aClass184Array1[local201].anInt5440;
											for (local325 = 0; local325 < 10; local325++) {
												local340 = (int) (Math.random() * 4.0D);
												if (local340 == 0 && local11 < local253 && local195 - 3 < local253 && (local810[local253 - local315 - 1][local257 - local321] & 0x2C0108) == 0) {
													local253--;
												}
												if (local340 == 1 && local253 < local11 + 103 && local195 + 3 > local253 && (local810[local253 + 1 - local315][local257 - local321] & 0x2C0180) == 0) {
													local253++;
												}
												if (local340 == 2 && local17 < local257 && local257 > local199 - 3 && (local810[local253 - local315][local257 - local321 - 1] & 0x2C0102) == 0) {
													local257--;
												}
												if (local340 == 3 && local257 < local17 + 104 - 1 && local257 < local199 + 3 && (local810[local253 - local315][local257 + 1 - local321] & 0x2C0120) == 0) {
													local257++;
												}
											}
										}
										Static367.anIntArray470[Static210.anInt4598] = local729.anInt8315;
										Static480.anIntArray649[Static210.anInt4598] = local253;
										Static400.anIntArray501[Static210.anInt4598] = local257;
										Static210.anInt4598++;
									}
								}
							}
						}
					}
				}
			}
			if (Static119.aClass159_2 != null) {
				Static539.aClass16_120.anInt295 = 1;
				Static293.aClass93_8.method2476(1024, 64);
				for (local199 = 0; local199 < Static119.aClass159_2.anInt4868; local199++) {
					local201 = Static119.aClass159_2.anIntArray346[local199];
					if (local201 >> 28 == Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99) {
						local203 = (local201 >> 14 & 0x3FFF) - Static61.anInt1459;
						local212 = (local201 & 0x3FFF) - Static203.anInt4534;
						if (local203 >= 0 && local203 < Static37.anInt7512 && local212 >= 0 && local212 < Static329.anInt6247) {
							Static275.aClass73_45.method2012(new Class12_Sub18(local199));
						} else {
							@Pc(1098) Class152 local1098 = Static293.aClass93_8.method2480(Static119.aClass159_2.anIntArray347[local199]);
							if (local1098.anIntArray344 != null && local203 + local1098.anInt4751 >= 0 && Static37.anInt7512 > local1098.anInt4734 + local203 && local1098.anInt4746 + local212 >= 0 && Static329.anInt6247 > local1098.anInt4739 + local212) {
								Static275.aClass73_45.method2012(new Class12_Sub18(local199));
							}
						}
					}
				}
				Static293.aClass93_8.method2476(128, 64);
				Static539.aClass16_120.anInt295 = 2;
				Static539.aClass16_120.method385();
			}
		}
		return true;
	}
}
