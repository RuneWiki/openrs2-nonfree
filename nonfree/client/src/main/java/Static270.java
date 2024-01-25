import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "B")
	public static byte aByte59;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
	public static int anInt4850 = -1;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)I")
	public static int method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static184.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static184.aByteArrayArrayArray3[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	public static void method3939() {
		Static327.aClass1_Sub7_Sub3_3.method5007();
		Static32.aClass250_7 = null;
		Static144.anInt2452 = 1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III[BIII)V")
	public static void method3941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 > 0 && !Static304.method4356(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static304.method4356(arg5)) {
			@Pc(32) int local32 = Static368.method5070(arg1);
			@Pc(34) int local34 = 0;
			@Pc(45) int local45 = arg4 < arg5 ? arg4 : arg5;
			@Pc(49) int local49 = arg4 >> 1;
			@Pc(53) int local53 = arg5 >> 1;
			@Pc(55) byte[] local55 = arg3;
			@Pc(62) byte[] local62 = new byte[local32 * local53 * local49];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local34, arg0, arg4, arg5, 0, arg1, 5121, local55, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(83) int local83 = arg4 * local32;
				for (@Pc(85) int local85 = 0; local85 < local32; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(95) int local95 = local83 + local85;
					for (@Pc(97) int local97 = 0; local97 < local53; local97++) {
						for (@Pc(101) int local101 = 0; local101 < local49; local101++) {
							@Pc(107) byte local107 = local55[local91];
							local91 += local32;
							@Pc(117) int local117 = local107 + local55[local91];
							@Pc(123) int local123 = local117 + local55[local95];
							local91 += local32;
							local95 += local32;
							@Pc(137) int local137 = local123 + local55[local95];
							local62[local89] = (byte) (local137 >> 2);
							local95 += local32;
							local89 += local32;
						}
						local91 += local83;
						local95 += local83;
					}
				}
				@Pc(178) byte[] local178 = local62;
				local62 = local55;
				arg5 = local53;
				arg4 = local49;
				local55 = local178;
				local53 >>= 0x1;
				local45 >>= 0x1;
				local49 >>= 0x1;
				local34++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII)I")
	public static int method3943(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static306.anIntArray431[arg0 & 0x3] : Static194.anIntArray288[arg0 & 0x3];
	}
}
