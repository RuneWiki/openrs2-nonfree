import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jca", name = "k", descriptor = "[I")
	public static final int[] anIntArray262 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jca", name = "l", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!jca", name = "n", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_176 = new Class179(127, -1);

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "I")
	public static int anInt4658 = 0;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([[BLclient!tf;B)V")
	public static void method3972(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class310_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(44) int local44;
		for (@Pc(25) int local25 = 0; local25 < local15; local25++) {
			@Pc(31) byte[] local31 = arg0[local25];
			if (local31 != null) {
				@Pc(38) Class6_Sub23 local38 = new Class6_Sub23(local31);
				local44 = Static300.anIntArray289[local25] >> 8;
				@Pc(50) int local50 = Static300.anIntArray289[local25] & 0xFF;
				@Pc(57) int local57 = local44 * 64 - Static534.anInt8753;
				@Pc(63) int local63 = local50 * 64 - Static234.anInt4239;
				Static35.method857();
				arg1.method7910(local63, Static234.anInt4239, Static534.anInt8753, local38, Static83.aClass324Array1, local57);
				arg1.method7925(local57, Static546.aClass132_13, local38, local12, local63);
				if (!arg1.aBoolean682 && Static15.anInt438 / 8 == local44 && local50 == Static310.anInt5242 / 8 && local12[0] != -1) {
					Static312.aClass93_2 = Static399.aClass194_1.method4409(local12[0], local12[3], local12[2], local12[1], Static186.aClass147_1);
					Static428.anInt7354 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(144) int local144 = (Static300.anIntArray289[local131] >> 8) * 64 - Static534.anInt8753;
			local44 = (Static300.anIntArray289[local131] & 0xFF) * 64 - Static234.anInt4239;
			@Pc(158) byte[] local158 = arg0[local131];
			if (local158 == null && Static310.anInt5242 < 800) {
				Static35.method857();
				arg1.method7913(local144, local44);
			}
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(III[IIIII)Z")
	public static boolean method3973(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (Static312.anInt8379 < arg2) {
			arg2 = Static312.anInt8379;
		}
		if (arg4 >= arg2) {
			return true;
		}
		@Pc(34) int local34 = arg2 - arg4 >> 2;
		arg5 += arg0 * arg4;
		arg3 += arg4 - 1;
		@Pc(58) int local58;
		@Pc(60) int local60;
		@Pc(73) int local73;
		if (Static383.anInt6430 == 1) {
			Static339.anInt5857 += local34;
			while (true) {
				local34--;
				if (local34 < 0) {
					local34 = arg2 - arg4 & 0x3;
					while (true) {
						local34--;
						if (local34 < 0) {
							return true;
						}
						arg3++;
						if (arg5 < arg1[arg3]) {
							arg1[arg3] = arg5;
						}
						arg5 += arg0;
					}
				}
				local58 = ~arg5;
				local60 = arg3 + 1;
				if (local58 > ~arg1[local60]) {
					arg1[local60] = arg5;
				}
				local73 = arg5 + arg0;
				local60++;
				if (arg1[local60] > local73) {
					arg1[local60] = local73;
				}
				local73 += arg0;
				local60++;
				if (arg1[local60] > local73) {
					arg1[local60] = local73;
				}
				local73 += arg0;
				arg3 = local60 + 1;
				if (arg1[arg3] > local73) {
					arg1[arg3] = local73;
				}
				arg5 = local73 + arg0;
			}
		} else {
			arg5 -= 38400;
			while (true) {
				local34--;
				if (local34 < 0) {
					local34 = arg2 - arg4 & 0x3;
					while (true) {
						local34--;
						if (local34 < 0) {
							return true;
						}
						local58 = ~arg5;
						arg3++;
						if (local58 > ~arg1[arg3]) {
							return false;
						}
						arg5 += arg0;
					}
				}
				local60 = arg3 + 1;
				if (arg1[local60] > arg5) {
					return false;
				}
				local73 = arg5 + arg0;
				local60++;
				if (local73 < arg1[local60]) {
					return false;
				}
				local73 += arg0;
				local60++;
				if (arg1[local60] > local73) {
					return false;
				}
				local73 += arg0;
				arg3 = local60 + 1;
				if (arg1[arg3] > local73) {
					return false;
				}
				arg5 = local73 + arg0;
			}
		}
	}
}
