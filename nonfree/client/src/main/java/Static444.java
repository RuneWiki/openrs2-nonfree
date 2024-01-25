import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!nj;")
	public static Class179 aClass179_1;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_132 = new Class15("M", "M", "M", "M");

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V")
	public static void method5913(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub17 local8 = Static34.method1709(4, arg0);
		local8.method5523();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[[[Lclient!ev;)V")
	public static void method5916(@OriginalArg(1) Class75[][][] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class75[][] local9 = arg0[local3];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < local9[local11].length; local15++) {
					@Pc(23) Class75 local23 = local9[local11][local15];
					if (local23 != null) {
						if (local23.aClass8_Sub4_1 instanceof Interface4) {
							((Interface4) local23.aClass8_Sub4_1).method5607();
						}
						if (local23.aClass8_Sub5_2 instanceof Interface4) {
							((Interface4) local23.aClass8_Sub5_2).method5607();
						}
						if (local23.aClass8_Sub5_1 instanceof Interface4) {
							((Interface4) local23.aClass8_Sub5_1).method5607();
						}
						if (local23.aClass8_Sub2_1 instanceof Interface4) {
							((Interface4) local23.aClass8_Sub2_1).method5607();
						}
						if (local23.aClass8_Sub2_2 instanceof Interface4) {
							((Interface4) local23.aClass8_Sub2_2).method5607();
						}
						for (@Pc(73) Class251 local73 = local23.aClass251_2; local73 != null; local73 = local73.aClass251_3) {
							@Pc(78) Class8_Sub3 local78 = local73.aClass8_Sub3_2;
							if (local78 instanceof Interface4) {
								((Interface4) local78).method5607();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII)V")
	public static void method5919(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub25 local12 = Static242.method3222(arg0, arg1);
		if (local12 != null) {
			local12.method6059();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIBII)V")
	public static void method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg3 - arg2;
		@Pc(23) int local23 = arg0 - arg1;
		if (local18 == 0) {
			if (local23 != 0) {
				Static107.method1590(arg1, arg0, arg2, arg4);
			}
		} else if (local23 == 0) {
			Static303.method3951(arg4, arg1, arg3, arg2);
		} else {
			@Pc(55) int local55 = (local23 << 12) / local18;
			@Pc(64) int local64 = arg1 - (arg2 * local55 >> 12);
			@Pc(76) int local76;
			@Pc(78) int local78;
			if (Static62.anInt1114 > arg3) {
				local78 = (Static62.anInt1114 * local55 >> 12) + local64;
				local76 = Static62.anInt1114;
			} else if (arg3 <= Static207.anInt3632) {
				local76 = arg3;
				local78 = arg0;
			} else {
				local76 = Static207.anInt3632;
				local78 = local64 + (local55 * Static207.anInt3632 >> 12);
			}
			@Pc(120) int local120;
			@Pc(118) int local118;
			if (Static62.anInt1114 > arg2) {
				local118 = local64 + (Static62.anInt1114 * local55 >> 12);
				local120 = Static62.anInt1114;
			} else if (arg2 <= Static207.anInt3632) {
				local118 = arg1;
				local120 = arg2;
			} else {
				local120 = Static207.anInt3632;
				local118 = local64 + (Static207.anInt3632 * local55 >> 12);
			}
			if (local118 < Static254.anInt4211) {
				local120 = (Static254.anInt4211 - local64 << 12) / local55;
				local118 = Static254.anInt4211;
			} else if (local118 > Static275.anInt4594) {
				local120 = (Static275.anInt4594 - local64 << 12) / local55;
				local118 = Static275.anInt4594;
			}
			if (Static254.anInt4211 > local78) {
				local78 = Static254.anInt4211;
				local76 = (Static254.anInt4211 - local64 << 12) / local55;
			} else if (local78 > Static275.anInt4594) {
				local76 = (Static275.anInt4594 - local64 << 12) / local55;
				local78 = Static275.anInt4594;
			}
			Static398.method4985(local118, local78, local120, local76, arg4);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I")
	public static int method5922(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
