import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!me", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "[I")
	public static final int[] anIntArray430 = new int[3];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method5876(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(31) int local31 = -arg4; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local10; local35 < 0; local35++) {
				local39 = arg5++;
				arg1[local39] += arg2[arg3++];
				@Pc(51) int local51 = arg5++;
				arg1[local51] += arg2[arg3++];
				@Pc(63) int local63 = arg5++;
				arg1[local63] += arg2[arg3++];
				@Pc(75) int local75 = arg5++;
				arg1[local75] += arg2[arg3++];
			}
			for (@Pc(93) int local93 = local15; local93 < 0; local93++) {
				local39 = arg5++;
				arg1[local39] += arg2[arg3++];
			}
			arg5 += arg6;
			arg3 += arg7;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!vq;IZI)V")
	public static void method5877(@OriginalArg(0) Class2_Sub6_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!Static65.aBoolean754) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(22) int local22;
		for (@Pc(16) Class2_Sub6_Sub3 local16 = (Class2_Sub6_Sub3) arg0.aClass211_12.method6008(); local16 != null; local16 = (Class2_Sub6_Sub3) arg0.aClass211_12.method6000()) {
			local22 = Static546.method8164(local16);
			if (local10 < local22) {
				local10 = local22;
			}
		}
		local10 += 8;
		Static440.anInt8157 = arg0.anInt10705 * 16 + (Static292.aBoolean464 ? 26 : 22);
		local22 = arg0.anInt10705 * 16 + 21;
		@Pc(66) int local66 = Static278.anInt5905 + Static274.anInt5852;
		if (local10 + local66 > Static81.anInt2497) {
			local66 = Static274.anInt5852 - local10;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		@Pc(89) int local89 = Static292.aBoolean464 ? 33 : 31;
		@Pc(96) int local96 = arg2 + 13 - local89;
		if (Static423.anInt7984 < local96 + local22) {
			local96 = Static423.anInt7984 - local22;
		}
		Static202.anInt4656 = local66;
		if (local96 < 0) {
			local96 = 0;
		}
		Static532.aClass2_Sub6_Sub21_1 = arg0;
		Static40.anInt1336 = local10;
		Static169.anInt731 = local96;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method5878() {
		Static631.aClass24ArrayArray2 = new Class24[Static517.aClass157_255.method4568()][];
		Static410.aClass24ArrayArray1 = new Class24[Static517.aClass157_255.method4568()][];
		Static421.aBooleanArray19 = new boolean[Static517.aClass157_255.method4568()];
	}
}
