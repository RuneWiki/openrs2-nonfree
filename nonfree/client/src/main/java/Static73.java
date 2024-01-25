import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!di", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6;

	@OriginalMember(owner = "client!di", name = "e", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_16 = new Class142("M", "M", "M", "M");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg3 && arg7 == arg1 && arg4 == arg6 && arg5 == arg2) {
			Static87.method1047(arg4, arg2, arg8, arg1, arg3);
			return;
		}
		@Pc(26) int local26 = arg3;
		@Pc(28) int local28 = arg1;
		@Pc(32) int local32 = arg3 * 3;
		@Pc(36) int local36 = arg1 * 3;
		@Pc(40) int local40 = arg0 * 3;
		@Pc(44) int local44 = arg7 * 3;
		@Pc(48) int local48 = arg6 * 3;
		@Pc(52) int local52 = arg5 * 3;
		@Pc(62) int local62 = local40 + arg4 - local48 - arg3;
		@Pc(72) int local72 = local44 + arg2 - arg1 - local52;
		@Pc(82) int local82 = local48 + local32 - local40 - local40;
		@Pc(92) int local92 = local36 + local52 - local44 - local44;
		@Pc(97) int local97 = local40 - local32;
		@Pc(102) int local102 = local44 - local36;
		for (@Pc(104) int local104 = 128; local104 <= 4096; local104 += 128) {
			@Pc(112) int local112 = local104 * local104 >> 12;
			@Pc(118) int local118 = local104 * local112 >> 12;
			@Pc(122) int local122 = local118 * local62;
			@Pc(126) int local126 = local72 * local118;
			@Pc(130) int local130 = local82 * local112;
			@Pc(134) int local134 = local92 * local112;
			@Pc(138) int local138 = local104 * local97;
			@Pc(142) int local142 = local102 * local104;
			@Pc(155) int local155 = arg3 + (local122 + local130 + local138 >> 12);
			@Pc(165) int local165 = (local142 + local134 + local126 >> 12) + arg1;
			Static87.method1047(local155, local165, arg8, local28, local26);
			local28 = local165;
			local26 = local155;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[B)[B")
	public static byte[] method931(@OriginalArg(1) byte[] arg0) {
		@Pc(13) Class1_Sub19 local13 = new Class1_Sub19(arg0);
		@Pc(17) int local17 = local13.method2915();
		@Pc(21) int local21 = local13.method2877();
		if (local21 < 0 || Static417.anInt6745 != 0 && Static417.anInt6745 < local21) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(41) byte[] local41 = new byte[local21];
			local13.method2937(local21, local41);
			return local41;
		} else {
			@Pc(53) int local53 = local13.method2877();
			if (local53 < 0 || Static417.anInt6745 != 0 && Static417.anInt6745 < local53) {
				throw new RuntimeException();
			}
			@Pc(67) byte[] local67 = new byte[local53];
			if (local17 == 1) {
				Static310.method4104(local67, local53, arg0, local21);
			} else {
				Static452.aClass236_1.method5059(local13, local67);
			}
			return local67;
		}
	}
}
