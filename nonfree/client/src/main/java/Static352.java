import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lka", name = "y", descriptor = "Lclient!fw;")
	public static final Class125 aClass125_41 = new Class125(16);

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IZLclient!qga;II)V")
	public static void method8325(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class299 arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6 = arg2.anInt8573;
		@Pc(9) int local9 = arg2.anInt8547;
		if (arg2.aByte108 == 0) {
			arg2.anInt8573 = arg2.anInt8583;
		} else if (arg2.aByte108 == 1) {
			arg2.anInt8573 = arg0 - arg2.anInt8583;
		} else if (arg2.aByte108 == 2) {
			arg2.anInt8573 = arg2.anInt8583 * arg0 >> 14;
		}
		if (arg2.aByte110 == 0) {
			arg2.anInt8547 = arg2.anInt8608;
		} else if (arg2.aByte110 == 1) {
			arg2.anInt8547 = arg3 - arg2.anInt8608;
		} else if (arg2.aByte110 == 2) {
			arg2.anInt8547 = arg2.anInt8608 * arg3 >> 14;
		}
		if (arg2.aByte108 == 4) {
			arg2.anInt8573 = arg2.anInt8547 * arg2.anInt8577 / arg2.anInt8594;
		}
		if (arg2.aByte110 == 4) {
			arg2.anInt8547 = arg2.anInt8594 * arg2.anInt8573 / arg2.anInt8577;
		}
		if (Static123.aBoolean140 && (Static80.method1360(arg2).anInt453 != 0 || arg2.anInt8610 == 0)) {
			if (arg2.anInt8547 < 5 && arg2.anInt8573 < 5) {
				arg2.anInt8573 = 5;
				arg2.anInt8547 = 5;
			} else {
				if (arg2.anInt8547 <= 0) {
					arg2.anInt8547 = 5;
				}
				if (arg2.anInt8573 <= 0) {
					arg2.anInt8573 = 5;
				}
			}
		}
		if (arg2.anInt8542 == Static353.anInt10726) {
			Static76.aClass299_3 = arg2;
		}
		if (arg1 && arg2.anObjectArray25 != null && (arg2.anInt8573 != local6 || arg2.anInt8547 != local9)) {
			@Pc(225) Class14_Sub10 local225 = new Class14_Sub10();
			local225.anObjectArray1 = arg2.anObjectArray25;
			local225.aClass299_2 = arg2;
			Static97.aClass32_6.method582(local225);
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IIIIIII)V")
	public static void method8326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static105.method8317(arg5);
		@Pc(8) int local8 = 0;
		@Pc(12) int local12 = arg5 - arg4;
		if (local12 < 0) {
			local12 = 0;
		}
		@Pc(18) int local18 = arg5;
		@Pc(21) int local21 = -arg5;
		@Pc(23) int local23 = local12;
		@Pc(26) int local26 = -local12;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(86) int local86;
		if (Static410.anInt7068 <= arg3 && arg3 <= Static281.anInt5188) {
			@Pc(53) int[] local53 = Static144.anIntArrayArray30[arg3];
			local61 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - arg5);
			local69 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg5 + arg1);
			local78 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local12);
			local86 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 + local12);
			Static240.method4038(local78, local53, arg0, local61);
			Static240.method4038(local86, local53, arg2, local78);
			Static240.method4038(local69, local53, arg0, local86);
		}
		while (local8 < local18) {
			local35 += 2;
			local37 += 2;
			local26 += local37;
			local21 += local35;
			if (local26 >= 0 && local23 >= 1) {
				local23--;
				local26 -= local23 << 1;
				Static318.anIntArray311[local23] = local8;
			}
			local8++;
			@Pc(247) int local247;
			@Pc(256) int local256;
			@Pc(267) int[] local267;
			@Pc(153) int local153;
			if (local21 >= 0) {
				local18--;
				local21 -= local18 << 1;
				local153 = arg3 - local18;
				local61 = arg3 + local18;
				if (local61 >= Static410.anInt7068 && local153 <= Static281.anInt5188) {
					if (local12 <= local18) {
						local69 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local8 + arg1);
						local78 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local8);
						if (Static281.anInt5188 >= local61) {
							Static240.method4038(local69, Static144.anIntArrayArray30[local61], arg0, local78);
						}
						if (Static410.anInt7068 <= local153) {
							Static240.method4038(local69, Static144.anIntArrayArray30[local153], arg0, local78);
						}
					} else {
						local69 = Static318.anIntArray311[local18];
						local78 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local8 + arg1);
						local86 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local8);
						local247 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local69 + arg1);
						local256 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local69);
						if (Static281.anInt5188 >= local61) {
							local267 = Static144.anIntArrayArray30[local61];
							Static240.method4038(local256, local267, arg0, local86);
							Static240.method4038(local247, local267, arg2, local256);
							Static240.method4038(local78, local267, arg0, local247);
						}
						if (Static410.anInt7068 <= local153) {
							local267 = Static144.anIntArrayArray30[local153];
							Static240.method4038(local256, local267, arg0, local86);
							Static240.method4038(local247, local267, arg2, local256);
							Static240.method4038(local78, local267, arg0, local247);
						}
					}
				}
			}
			local153 = arg3 - local8;
			local61 = local8 + arg3;
			if (Static410.anInt7068 <= local61 && Static281.anInt5188 >= local153) {
				local69 = arg1 + local18;
				local78 = arg1 - local18;
				if (Static468.anInt7895 <= local69 && Static382.anInt6719 >= local78) {
					local69 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local69);
					local78 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local78);
					if (local12 <= local8) {
						if (Static281.anInt5188 >= local61) {
							Static240.method4038(local69, Static144.anIntArrayArray30[local61], arg0, local78);
						}
						if (Static410.anInt7068 <= local153) {
							Static240.method4038(local69, Static144.anIntArrayArray30[local153], arg0, local78);
						}
					} else {
						local86 = local8 <= local23 ? local23 : Static318.anIntArray311[local8];
						local247 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, local86 + arg1);
						local256 = Static301.method5308(Static468.anInt7895, Static382.anInt6719, arg1 - local86);
						if (local61 <= Static281.anInt5188) {
							local267 = Static144.anIntArrayArray30[local61];
							Static240.method4038(local256, local267, arg0, local78);
							Static240.method4038(local247, local267, arg2, local256);
							Static240.method4038(local69, local267, arg0, local247);
						}
						if (local153 >= Static410.anInt7068) {
							local267 = Static144.anIntArrayArray30[local153];
							Static240.method4038(local256, local267, arg0, local78);
							Static240.method4038(local247, local267, arg2, local256);
							Static240.method4038(local69, local267, arg0, local247);
						}
					}
				}
			}
		}
	}
}
