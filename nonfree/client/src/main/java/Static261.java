import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[BIIII)V")
	public static void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 > 0 && !Static315.method4350(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static315.method4350(arg0)) {
			@Pc(37) int local37 = Static21.method450(arg1);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg0 <= arg3 ? arg0 : arg3;
			@Pc(58) int local58 = arg3 >> 1;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(64) byte[] local64 = arg2;
			@Pc(71) byte[] local71 = new byte[local37 * local62 * local58];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local39, arg4, arg3, arg0, 0, arg1, 5121, local64, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(92) int local92 = local37 * arg3;
				@Pc(94) byte[] local94 = local71;
				for (@Pc(96) int local96 = 0; local96 < local37; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local62; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local58; local112++) {
							@Pc(118) byte local118 = local64[local102];
							local102 += local37;
							@Pc(128) int local128 = local118 + local64[local102];
							@Pc(134) int local134 = local128 + local64[local106];
							local102 += local37;
							local106 += local37;
							@Pc(148) int local148 = local134 + local64[local106];
							local71[local100] = (byte) (local148 >> 2);
							local106 += local37;
							local100 += local37;
						}
						local102 += local92;
						local106 += local92;
					}
				}
				local71 = local64;
				arg3 = local58;
				local64 = local94;
				arg0 = local62;
				local46 >>= 0x1;
				local39++;
				local62 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V")
	public static void method3572() {
		Static323.anInt5755 = 0;
		@Pc(13) int local13 = Static349.aClass4_Sub30_Sub1_2.method4877();
		@Pc(24) boolean local24 = Static349.aClass4_Sub30_Sub1_2.method4882() == 1;
		@Pc(28) int local28 = Static349.aClass4_Sub30_Sub1_2.method4829();
		@Pc(32) int local32 = Static349.aClass4_Sub30_Sub1_2.method4852();
		Static310.method4278(local28);
		@Pc(42) int local42 = (Static106.anInt2242 - Static349.aClass4_Sub30_Sub1_2.anInt6244) / 16;
		Static205.anIntArrayArray33 = new int[local42][4];
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < local42; local48++) {
			for (local52 = 0; local52 < 4; local52++) {
				Static205.anIntArrayArray33[local48][local52] = Static349.aClass4_Sub30_Sub1_2.method4872();
			}
		}
		Static196.aByteArrayArray6 = new byte[local42][];
		Static100.anIntArray134 = new int[local42];
		Static104.aByteArrayArray1 = new byte[local42][];
		Static70.anIntArray647 = new int[local42];
		Static310.anIntArray475 = new int[local42];
		Static288.aByteArrayArray13 = null;
		Static325.aByteArrayArray16 = new byte[local42][];
		Static80.anIntArray115 = new int[local42];
		Static66.anIntArray102 = new int[local42];
		Static389.anIntArray592 = null;
		Static435.aByteArrayArray20 = new byte[local42][];
		local42 = 0;
		for (local52 = (local13 - (Static126.anInt2569 >> 4)) / 8; local52 <= (local13 + (Static126.anInt2569 >> 4)) / 8; local52++) {
			for (@Pc(129) int local129 = (local32 - (Static190.anInt3697 >> 4)) / 8; local129 <= (local32 + (Static190.anInt3697 >> 4)) / 8; local129++) {
				Static100.anIntArray134[local42] = (local52 << 8) + local129;
				Static70.anIntArray647[local42] = Static193.aClass166_291.method3698("m" + local52 + "_" + local129);
				Static66.anIntArray102[local42] = Static193.aClass166_291.method3698("l" + local52 + "_" + local129);
				Static310.anIntArray475[local42] = Static193.aClass166_291.method3698("um" + local52 + "_" + local129);
				Static80.anIntArray115[local42] = Static193.aClass166_291.method3698("ul" + local52 + "_" + local129);
				local42++;
			}
		}
		Static5.method158(local32, false, local24, local13);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIB)V")
	public static void method3573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static327.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}
}
