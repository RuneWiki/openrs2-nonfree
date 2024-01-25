import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_106 = new Class181(53, 7);

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_107 = new Class181(26, 8);

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "[I")
	public static final int[] anIntArray800 = new int[500];

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIBI)Lclient!fp;")
	public static Class11_Sub1_Sub1 method7660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class224 local11 = Static256.aClass224ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class11_Sub1_Sub1 local17 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class270 local27 = local11.aClass270_1; local27 != null; local27 = local27.aClass270_2) {
			@Pc(31) Class11_Sub1 local31 = local27.aClass11_Sub1_2;
			if (local31 instanceof Class11_Sub1_Sub1) {
				@Pc(37) Class11_Sub1_Sub1 local37 = (Class11_Sub1_Sub1) local31;
				@Pc(45) int local45 = local37.method6212() * 256 - 4;
				@Pc(52) int local52 = local37.anInt7347 - local45 >> 9;
				@Pc(60) int local60 = local37.anInt7351 - local45 >> 9;
				@Pc(67) int local67 = local45 + local37.anInt7347 >> 9;
				@Pc(74) int local74 = local37.anInt7351 + local45 >> 9;
				if (local52 <= arg2 && arg0 >= local60 && local67 >= arg2 && arg0 <= local74) {
					@Pc(103) int local103 = (local67 + 1 - arg2) * (-arg0 + 1 + local74);
					if (local24 < local103) {
						local24 = local103;
						local17 = local37;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZILclient!ag;)V")
	public static void method7664(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub1 arg1) {
		if (Static205.anInt4369 >= 400) {
			return;
		}
		@Pc(12) Class222 local12 = arg1.aClass222_1;
		if (local12.anIntArray464 != null) {
			local12 = local12.method5329(Static435.aClass234_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean460) {
			return;
		}
		@Pc(35) String local35 = local12.aString72;
		if (local12.anInt6249 != 0) {
			@Pc(51) String local51 = Static303.aClass162_2 == Static38.aClass162_1 ? Static222.aClass152_75.method4002(Static286.anInt5468) : Static222.aClass152_73.method4002(Static286.anInt5468);
			local35 = local35 + Static453.method6920(Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453, local12.anInt6249) + " (" + local51 + local12.anInt6249 + ")";
		}
		if (Static25.aBoolean80 && !arg0) {
			@Pc(88) Class99 local88 = Static121.anInt2623 == -1 ? null : Static499.aClass118_2.method3497(Static121.anInt2623);
			if ((Static429.anInt7864 & 0x2) != 0 && (local88 == null || local12.method5323(Static121.anInt2623, local88.anInt2851) != local88.anInt2851)) {
				Static232.method4112(false, -1, Static568.aString113 + " -> <col=ffff00>" + local35, 0, true, 0, (long) arg1.anInt7392, Static467.aString104, 23, Static567.anInt7672);
			}
		}
		if (!arg0) {
			@Pc(142) String[] local142 = local12.aStringArray38;
			if (Static286.aBoolean409) {
				local142 = Static240.method4637(local142);
			}
			@Pc(152) int local152;
			if (local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && (local12.aByte60 == 0 || !local142[local152].equalsIgnoreCase(Static222.aClass152_68.method4002(Static286.anInt5468)))) {
						@Pc(175) byte local175 = 0;
						@Pc(177) int local177 = Static553.anInt9423;
						if (local152 == 0) {
							local175 = 12;
						}
						if (local152 == 1) {
							local175 = 25;
						}
						if (local152 == 2) {
							local175 = 15;
						}
						if (local152 == 3) {
							local175 = 22;
						}
						if (local152 == 4) {
							local175 = 10;
						}
						if (local12.anInt6246 == local152) {
							local177 = local12.anInt6265;
						}
						if (local12.anInt6242 == local152) {
							local177 = local12.anInt6260;
						}
						Static232.method4112(false, -1, "<col=ffff00>" + local35, 0, true, 0, (long) arg1.anInt7392, local142[local152], local175, local142[local152].equalsIgnoreCase(Static222.aClass152_68.method4002(Static286.anInt5468)) ? local12.anInt6251 : local177);
					}
				}
			}
			if (local12.aByte60 == 1 && local142 != null) {
				for (local152 = 4; local152 >= 0; local152--) {
					if (local142[local152] != null && local142[local152].equalsIgnoreCase(Static222.aClass152_68.method4002(Static286.anInt5468))) {
						@Pc(298) short local298 = 0;
						if (local12.anInt6249 > Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7453) {
							local298 = 2000;
						}
						@Pc(311) short local311 = 0;
						if (local152 == 0) {
							local311 = 12;
						}
						if (local152 == 1) {
							local311 = 25;
						}
						if (local152 == 2) {
							local311 = 15;
						}
						if (local152 == 3) {
							local311 = 22;
						}
						if (local152 == 4) {
							local311 = 10;
						}
						if (local311 != 0) {
							local311 += local298;
						}
						Static232.method4112(false, -1, "<col=ffff00>" + local35, 0, true, 0, (long) arg1.anInt7392, local142[local152], local311, local12.anInt6251);
					}
				}
			}
		}
		Static232.method4112(arg0, -1, "<col=ffff00>" + local35, 0, true, 0, (long) arg1.anInt7392, Static222.aClass152_67.method4002(Static286.anInt5468), 1012, Static557.anInt9493);
	}
}
