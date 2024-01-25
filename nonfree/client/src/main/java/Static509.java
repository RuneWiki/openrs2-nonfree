import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II[B[[B[I[[BI[I)I")
	public static int method6644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(15) int local15 = arg4[arg1];
		@Pc(22) int local22 = local15 + arg6[arg1];
		@Pc(26) int local26 = arg4[arg0];
		@Pc(32) int local32 = local26 + arg6[arg0];
		@Pc(34) int local34 = local15;
		if (local26 > local15) {
			local34 = local26;
		}
		@Pc(41) int local41 = local22;
		if (local22 > local32) {
			local41 = local32;
		}
		@Pc(52) int local52 = arg2[arg1] & 0xFF;
		if ((arg2[arg0] & 0xFF) < local52) {
			local52 = arg2[arg0] & 0xFF;
		}
		@Pc(69) byte[] local69 = arg5[arg1];
		@Pc(73) byte[] local73 = arg3[arg0];
		@Pc(78) int local78 = local34 - local15;
		@Pc(83) int local83 = local34 - local26;
		for (@Pc(85) int local85 = local34; local85 < local41; local85++) {
			@Pc(99) int local99 = local73[local83++] + local69[local78++];
			if (local52 > local99) {
				local52 = local99;
			}
		}
		return -local52;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
	public static void method6646() {
		Static486.aBoolean517 = true;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)V")
	public static void method6648(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static716.anInt11157 - Static520.anInt8157;
		if (local8 >= 100) {
			Static358.anInt5640 = -1;
			Static494.anInt7853 = -1;
			Static262.anInt4081 = 1;
			return;
		}
		@Pc(22) int local22 = (int) Static447.aFloat107;
		if (Static13.anInt569 >> 8 > local22) {
			local22 = Static13.anInt569 >> 8;
		}
		if (Static508.aBooleanArray21[4] && local22 < Static502.anIntArray582[4] + 128) {
			local22 = Static502.anIntArray582[4] + 128;
		}
		@Pc(61) int local61 = Static88.anInt2043 + (int) Static382.aFloat40 & 0x3FFF;
		Static325.method4734(arg0, local22, Static77.method1633(Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695, Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694, Static723.anInt11225) - 200, Static690.anInt10754, Static504.anInt8040, local61, (local22 >> 3) * 3 + 600 << 2);
		@Pc(105) float local105 = 1.0F - (float) ((100 - local8) * (100 - local8) * (100 - local8)) / 1000000.0F;
		Static305.anInt4908 = (int) ((float) Static522.anInt8177 + (float) (Static305.anInt4908 - Static522.anInt8177) * local105);
		Static171.anInt8707 = (int) (local105 * (float) (Static171.anInt8707 - Static530.anInt8261) + (float) Static530.anInt8261);
		Static263.anInt4101 = (int) (local105 * (float) (Static263.anInt4101 - Static169.anInt2994) + (float) Static169.anInt2994);
		Static490.anInt7687 = (int) (local105 * (float) (Static490.anInt7687 - Static181.anInt3159) + (float) Static181.anInt3159);
		@Pc(157) int local157 = Static46.anInt1301 - Static552.anInt8475;
		if (local157 > 8192) {
			local157 -= 16384;
		} else if (local157 < -8192) {
			local157 += 16384;
		}
		Static46.anInt1301 = (int) ((float) local157 * local105 + (float) Static552.anInt8475);
		Static46.anInt1301 &= 0x3FFF;
	}
}
