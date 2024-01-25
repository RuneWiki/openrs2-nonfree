import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
	public static int anInt1394 = -50;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_28 = new Class37(64);

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString50 = "flash1:";

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public static int anInt1395 = 0;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString51 = null;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)V")
	public static void method1139() {
		Static142.aClass1_Sub21_Sub2_1.method5763();
		@Pc(13) int local13 = Static142.aClass1_Sub21_Sub2_1.method5756(8);
		@Pc(23) int local23;
		if (Static271.anInt5578 > local13) {
			for (local23 = local13; local23 < Static271.anInt5578; local23++) {
				Static127.anIntArray259[Static32.anInt565++] = Static79.anIntArray672[local23];
			}
		}
		if (Static271.anInt5578 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static271.anInt5578 = 0;
		for (local23 = 0; local23 < local13; local23++) {
			@Pc(57) int local57 = Static79.anIntArray672[local23];
			@Pc(61) Class10_Sub1_Sub2_Sub1 local61 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
			if (local66 == 0) {
				Static79.anIntArray672[Static271.anInt5578++] = local57;
				local61.anInt4071 = Static282.anInt3516;
			} else {
				@Pc(86) int local86 = Static142.aClass1_Sub21_Sub2_1.method5756(2);
				if (local86 == 0) {
					Static79.anIntArray672[Static271.anInt5578++] = local57;
					local61.anInt4071 = Static282.anInt3516;
					Static312.anIntArray623[Static62.anInt6674++] = local57;
				} else {
					@Pc(128) int local128;
					@Pc(138) int local138;
					if (local86 == 1) {
						Static79.anIntArray672[Static271.anInt5578++] = local57;
						local61.anInt4071 = Static282.anInt3516;
						local128 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
						local61.method3399(local128, 1);
						local138 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
						if (local138 == 1) {
							Static312.anIntArray623[Static62.anInt6674++] = local57;
						}
					} else if (local86 == 2) {
						Static79.anIntArray672[Static271.anInt5578++] = local57;
						local61.anInt4071 = Static282.anInt3516;
						if (Static142.aClass1_Sub21_Sub2_1.method5756(1) == 1) {
							local128 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local61.method3399(local128, 2);
							local138 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local61.method3399(local138, 2);
						} else {
							local128 = Static142.aClass1_Sub21_Sub2_1.method5756(3);
							local61.method3399(local128, 0);
						}
						local128 = Static142.aClass1_Sub21_Sub2_1.method5756(1);
						if (local128 == 1) {
							Static312.anIntArray623[Static62.anInt6674++] = local57;
						}
					} else if (local86 == 3) {
						Static127.anIntArray259[Static32.anInt565++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIILclient!vc;)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub5 arg4) {
		arg4.anInt2766 = (arg1 << 7) + 64;
		arg4.anInt2762 = arg3;
		arg4.anInt2761 = (arg2 << 7) + 64;
		@Pc(24) Class83 local24 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class59 local31 = local24.aClass59_2; local31 != null; local31 = local31.aClass59_1) {
				if (local31.aClass10_Sub1_1.aBoolean553) {
					@Pc(41) int local41 = local31.aClass10_Sub1_1.method5829();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt2762 += local28;
				arg4.aBoolean226 = true;
			}
		}
		if (Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2] == null) {
			Static313.method5368(arg0, arg1, arg2);
		}
		Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2].aClass10_Sub5_1 = arg4;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZI)V")
	public static void method1142(@OriginalArg(0) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local9 = Static263.aByteArrayArray19;
			local11 = 1;
		} else {
			local11 = 4;
			local9 = Static41.aByteArrayArray4;
		}
		@Pc(19) int[] local19 = null;
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static310.method5336();
			for (@Pc(26) int local26 = 0; local26 < Static43.anInt1151 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static260.anInt5348 >> 3; local30++) {
					@Pc(34) boolean local34 = false;
					@Pc(42) int local42 = Static320.anIntArrayArrayArray13[local21][local26][local30];
					if (local42 != -1) {
						@Pc(51) int local51 = local42 >> 24 & 0x3;
						if (!arg0 || local51 == 0) {
							@Pc(64) int local64 = local42 >> 1 & 0x3;
							@Pc(70) int local70 = local42 >> 14 & 0x3FF;
							@Pc(76) int local76 = local42 >> 3 & 0x7FF;
							@Pc(86) int local86 = (local70 / 8 << 8) + local76 / 8;
							for (@Pc(88) int local88 = 0; local88 < Static146.anIntArray446.length; local88++) {
								if (local86 == Static146.anIntArray446[local88] && local9[local88] != null) {
									@Pc(119) int[] local119 = Static114.method1829(arg0, local70, local30 * 8, local76, Static313.aClass17Array1, local64, local9[local88], local51, local21, local26 * 8, Static217.aClass105_5);
									if (local19 == null && local119 != null) {
										local19 = local119;
									}
									local34 = true;
									break;
								}
							}
						}
					}
					if (!local34) {
						Static253.method4539(local30 * 8, local21, 8, 8, local26 * 8);
					}
				}
			}
		}
		if (local19 == null) {
			Static126.aClass199_1 = null;
		} else {
			Static126.aClass199_1 = Static123.method4486(local19[3], local19[2], local19[1], local19[0]);
			Static161.anInt3358 = local19[4];
		}
	}
}
