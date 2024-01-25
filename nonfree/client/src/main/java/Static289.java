import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "[I")
	public static final int[] anIntArray632 = new int[14];

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public static int anInt5124 = 0;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt5127 = 0;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "[I")
	public static final int[] anIntArray633 = new int[5];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZIII)V")
	public static void method4414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class251 local14 = Static362.aClass251ArrayArray1[arg1][arg0];
		Static5.method5743(local14 == null ? Static125.aClass251_2 : local14, 5000);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)I")
	public static int method4416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(42) int local42 = Static257.method5615(arg0 - 1, arg1 + -1) + Static257.method5615(arg0 - 1, arg1 + 1) + Static257.method5615(arg0 + 1, arg1 + -1) + Static257.method5615(arg0 + 1, arg1 + 1);
		@Pc(72) int local72 = Static257.method5615(arg0, arg1 - 1) + Static257.method5615(arg0, arg1 + 1) + Static257.method5615(arg0 - 1, arg1) + Static257.method5615(arg0 + 1, arg1);
		@Pc(82) int local82 = Static257.method5615(arg0, arg1);
		return local82 / 4 + local42 / 16 + local72 / 8;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([Ljava/lang/String;I[SZI)V")
	public static void method4417(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) String local16 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local16;
		@Pc(30) short local30 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg3; local42++) {
			if (local16 == null || arg0[local42] != null && arg0[local42].compareTo(local16) < (local42 & 0x1)) {
				@Pc(67) String local67 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local67;
				@Pc(81) short local81 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12++] = local81;
			}
		}
		arg0[arg3] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg3] = arg2[local12];
		arg2[local12] = local30;
		method4417(arg0, arg1, arg2, local12 - 1);
		method4417(arg0, local12 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "([[BLclient!uq;B)V")
	public static void method4418(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class134_Sub1 arg1) {
		@Pc(16) int[] local16 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(19) int local19 = arg0.length;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = 0; local21 < local19; local21++) {
			@Pc(27) byte[] local27 = arg0[local21];
			if (local27 != null) {
				@Pc(34) Class2_Sub13 local34 = new Class2_Sub13(local27);
				local40 = Static372.anIntArray785[local21] >> 8;
				@Pc(46) int local46 = Static372.anIntArray785[local21] & 0xFF;
				@Pc(53) int local53 = local40 * 64 - Static376.anInt6607;
				@Pc(60) int local60 = local46 * 64 - Static133.anInt2474;
				Static209.method3549();
				arg1.method5413(local60, Static376.anInt6607, local34, Static190.aClass239Array1, Static133.anInt2474, local53);
				arg1.method5434(Static304.aClass82_4, local16, local53, local60, local34);
				if (!arg1.aBoolean468 && Static226.anInt4218 / 8 == local40 && Static306.anInt5451 / 8 == local46) {
					if (local16[0] == -1) {
						Static250.aClass248_1 = null;
					} else {
						Static250.aClass248_1 = Static189.aClass119_3.method2673(Static80.aClass171_1, local16[0], local16[1], local16[2], local16[3]);
						Static208.anInt3857 = local16[4];
					}
				}
			}
		}
		for (@Pc(137) int local137 = 0; local137 < local19; local137++) {
			@Pc(150) int local150 = (Static372.anIntArray785[local137] >> 8) * 64 - Static376.anInt6607;
			local40 = (Static372.anIntArray785[local137] & 0xFF) * 64 - Static133.anInt2474;
			@Pc(165) byte[] local165 = arg0[local137];
			if (local165 == null && Static306.anInt5451 < 800) {
				Static209.method3549();
				arg1.method5422(local150, local40);
			}
		}
	}
}
