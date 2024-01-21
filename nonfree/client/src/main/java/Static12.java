import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
	public static boolean aBoolean16;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public static int anInt319;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_90 = Static151.method2243(" has logged in)3");

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public static int anInt314 = 1;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_91 = Static151.method2243("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "Lclient!mb;")
	public static Class62 aClass62_92 = aClass62_90;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_94 = Static151.method2243("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Lclient!mb;")
	public static Class62 aClass62_93 = aClass62_94;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZB)V")
	public static void method224(@OriginalArg(0) boolean arg0) {
		if (Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7 == Static11.anInt310 && Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7 == Static76.anInt1575) {
			Static11.anInt310 = 0;
		}
		@Pc(17) int local17 = Static145.anInt3126;
		if (arg0) {
			local17 = 1;
		}
		for (@Pc(23) int local23 = 0; local23 < local17; local23++) {
			@Pc(29) Class7_Sub2_Sub2 local29;
			@Pc(31) long local31;
			if (arg0) {
				local29 = Static186.aClass7_Sub2_Sub2_1;
				local31 = 8791798054912L;
			} else {
				local29 = Static62.aClass7_Sub2_Sub2Array1[Static28.anIntArray60[local23]];
				local31 = (long) Static28.anIntArray60[local23] << 32;
			}
			if (local29 != null && local29.method2177()) {
				local29.aBoolean136 = false;
				@Pc(60) int local60 = local29.anInt3046 >> 7;
				if ((Static60.aBoolean52 && Static145.anInt3126 > 50 || Static145.anInt3126 > 200) && !arg0 && local29.anInt3096 == local29.anInt3077) {
					local29.aBoolean136 = true;
				}
				@Pc(83) int local83 = local29.anInt3085 >> 7;
				if (local60 >= 0 && local60 < 104 && local83 >= 0 && local83 < 104) {
					if (local29.aClass7_Sub7_1 == null || Static25.anInt581 < local29.anInt3122 || local29.anInt3120 <= Static25.anInt581) {
						if ((local29.anInt3046 & 0x7F) == 64 && (local29.anInt3085 & 0x7F) == 64) {
							if (Static185.anInt3845 == Static107.anIntArrayArray19[local60][local83]) {
								continue;
							}
							Static107.anIntArrayArray19[local60][local83] = Static185.anInt3845;
						}
						local29.anInt3081 = Static175.method2548(local29.anInt3085, Static126.anInt2806, local29.anInt3046);
						Static31.method536(Static126.anInt2806, local29.anInt3046, local29.anInt3085, local29.anInt3081, 60, local29, local29.anInt3071, local31, local29.aBoolean135);
					} else {
						local29.aBoolean136 = false;
						local29.anInt3081 = Static175.method2548(local29.anInt3085, Static126.anInt2806, local29.anInt3046);
						Static172.method507(Static126.anInt2806, local29.anInt3046, local29.anInt3085, local29.anInt3081, local29, local29.anInt3071, local31, local29.anInt3106, local29.anInt3112, local29.anInt3107, local29.anInt3113);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lclient!gi;IIB)V")
	public static void method229(@OriginalArg(0) Class38[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(12) int local12 = arg1 - 1;
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(23) int local23 = arg2 + 1;
		@Pc(27) Class38 local27 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local27;
		while (local12 < local23) {
			@Pc(41) boolean local41 = true;
			@Pc(44) int local44;
			@Pc(56) int local56;
			@Pc(59) int local59;
			do {
				local23--;
				for (local44 = 0; local44 < 4; local44++) {
					if (Static209.anIntArray395[local44] == 2) {
						local56 = arg0[local23].anInt1433;
						local59 = local27.anInt1433;
					} else if (Static209.anIntArray395[local44] == 1) {
						local56 = arg0[local23].anInt1436;
						local59 = local27.anInt1436;
						if (local59 == -1 && Static131.anIntArray129[local44] == 1) {
							local59 = 2001;
						}
						if (local56 == -1 && Static131.anIntArray129[local44] == 1) {
							local56 = 2001;
						}
					} else if (Static209.anIntArray395[local44] == 3) {
						local56 = arg0[local23].aBoolean62 ? 1 : 0;
						local59 = local27.aBoolean62 ? 1 : 0;
					} else {
						local59 = local27.anInt1432;
						local56 = arg0[local23].anInt1432;
					}
					if (local56 != local59) {
						if ((Static131.anIntArray129[local44] != 1 || local56 <= local59) && (Static131.anIntArray129[local44] != 0 || local59 <= local56)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			local41 = true;
			do {
				local12++;
				for (local44 = 0; local44 < 4; local44++) {
					if (Static209.anIntArray395[local44] == 2) {
						local56 = arg0[local12].anInt1433;
						local59 = local27.anInt1433;
					} else if (Static209.anIntArray395[local44] == 1) {
						local59 = local27.anInt1436;
						if (local59 == -1 && Static131.anIntArray129[local44] == 1) {
							local59 = 2001;
						}
						local56 = arg0[local12].anInt1436;
						if (local56 == -1 && Static131.anIntArray129[local44] == 1) {
							local56 = 2001;
						}
					} else if (Static209.anIntArray395[local44] == 3) {
						local59 = local27.aBoolean62 ? 1 : 0;
						local56 = arg0[local12].aBoolean62 ? 1 : 0;
					} else {
						local56 = arg0[local12].anInt1432;
						local59 = local27.anInt1432;
					}
					if (local59 != local56) {
						if ((Static131.anIntArray129[local44] != 1 || local56 >= local59) && (Static131.anIntArray129[local44] != 0 || local59 >= local56)) {
							local41 = false;
						}
						break;
					}
					if (local44 == 3) {
						local41 = false;
					}
				}
			} while (local41);
			if (local23 > local12) {
				@Pc(331) Class38 local331 = arg0[local12];
				arg0[local12] = arg0[local23];
				arg0[local23] = local331;
			}
		}
		method229(arg0, arg1, local23);
		method229(arg0, local23 + 1, arg2);
	}
}
