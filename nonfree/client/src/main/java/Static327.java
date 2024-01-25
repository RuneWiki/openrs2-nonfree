import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
	public static int anInt5862;

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_137 = new Class25(43, -2);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([JIB[Ljava/lang/Object;I)V")
	public static void method4670(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg3;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg1];
		arg0[arg1] = local25;
		@Pc(39) Object local39 = arg2[local19];
		arg2[local19] = arg2[arg1];
		arg2[arg1] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg3; local59 < arg1; local59++) {
			if (arg0[local59] < (long) (local59 & local57) + local25) {
				@Pc(76) long local76 = arg0[local59];
				arg0[local59] = arg0[local21];
				arg0[local21] = local76;
				@Pc(90) Object local90 = arg2[local59];
				arg2[local59] = arg2[local21];
				arg2[local21++] = local90;
			}
		}
		arg0[arg1] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg1] = arg2[local21];
		arg2[local21] = local39;
		method4670(arg0, local21 - 1, arg2, arg3);
		method4670(arg0, arg1, arg2, local21 + 1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
	public static void method4672(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static277.anInt5022 - Static212.anInt3638;
		if (local8 >= 100) {
			Static25.anInt7273 = 1;
			return;
		}
		@Pc(27) int local27 = (int) Static234.aFloat30;
		if (local27 < Static415.anInt7125 >> 8) {
			local27 = Static415.anInt7125 >> 8;
		}
		if (Static333.aBooleanArray21[4] && Static386.anIntArray584[4] + 128 > local27) {
			local27 = Static386.anIntArray584[4] + 128;
		}
		@Pc(60) int local60 = Static289.anInt5181 + (int) Static37.aFloat9 & 0x3FFF;
		Static172.method2527(Static365.method3535(Static204.anInt3498, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622) - 50, Static184.anInt3246, Static82.anInt3899, (local27 >> 3) * 3 + 600 << 0, local27, arg0, local60);
		@Pc(106) float local106 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static263.anInt4619 = (int) ((float) Static459.anInt7730 + (float) (Static263.anInt4619 - Static459.anInt7730) * local106);
		Static120.anInt2052 = (int) (local106 * (float) (Static120.anInt2052 - Static456.anInt7596) + (float) Static456.anInt7596);
		Static260.anInt4601 = (int) ((float) Static430.anInt7302 + (float) (Static260.anInt4601 - Static430.anInt7302) * local106);
		Static213.anInt3662 = (int) ((float) (Static213.anInt3662 - Static409.anInt695) * local106 + (float) Static409.anInt695);
		@Pc(155) int local155 = Static144.anInt2665 - Static361.anInt6401;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static144.anInt2665 = (int) ((float) Static361.anInt6401 + local106 * (float) local155);
		Static144.anInt2665 &= 0x3FFF;
	}
}
