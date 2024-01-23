import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
	public static int anInt2549;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_751 = Static184.method2923("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_752 = Static184.method2923("scape main");

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public static int anInt2538 = 0;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_753 = Static184.method2923("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "[I")
	public static int[] anIntArray252 = new int[2000];

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Lclient!i;")
	public static Class41 aClass41_754 = Static184.method2923(")2");

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
	public static int anInt2543 = 127;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method1788(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static134.method2149(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local38 <= local41);
			return Static145.method2251(local41, arg0);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBLclient!bj;)V")
	public static void method1790(@OriginalArg(0) int arg0, @OriginalArg(2) Class15_Sub1 arg1) {
		if (Static69.aClass2_Sub3_4 == null) {
			Static166.method2402(null, 255, 255, (byte) 0, 0, true);
			Static9.aClass15_Sub1Array1[arg0] = arg1;
		} else {
			Static69.aClass2_Sub3_4.anInt239 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static69.aClass2_Sub3_4.method185();
			@Pc(20) int local20 = Static69.aClass2_Sub3_4.method185();
			arg1.method425(local16, local20);
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([IIIIII)V")
	public static void method1791(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class45 local13 = local7.aClass45_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2114;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class32 local58 = local7.aClass32_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1423;
		@Pc(67) int local67 = local58.anInt1424;
		@Pc(70) int local70 = local58.anInt1422;
		@Pc(73) int local73 = local58.anInt1425;
		@Pc(77) int[] local77 = Static199.anIntArrayArray39[local23];
		@Pc(81) int[] local81 = Static15.anIntArrayArray3[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}
}
