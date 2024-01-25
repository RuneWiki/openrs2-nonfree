import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_119 = new Class40("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_120 = new Class40("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "[Lclient!co;")
	public static final Class5_Sub3[] aClass5_Sub3Array2 = new Class5_Sub3[2048];

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II[BIIII)V")
	public static void method6014(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static281.method4574(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static281.method4574(arg5)) {
			@Pc(35) int local35 = Static541.method7392(arg0);
			@Pc(37) int local37 = 0;
			@Pc(48) int local48 = arg3 < arg5 ? arg3 : arg5;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(56) int local56 = arg5 >> 1;
			@Pc(58) byte[] local58 = arg1;
			@Pc(65) byte[] local65 = new byte[local35 * local52 * local56];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local37, arg4, arg3, arg5, 0, arg0, 5121, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(83) int local83 = arg3 * local35;
				@Pc(85) byte[] local85 = local65;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(91) int local91 = local87;
					@Pc(93) int local93 = local87;
					@Pc(97) int local97 = local83 + local87;
					for (@Pc(99) int local99 = 0; local99 < local56; local99++) {
						for (@Pc(103) int local103 = 0; local103 < local52; local103++) {
							@Pc(109) byte local109 = local58[local93];
							local93 += local35;
							@Pc(119) int local119 = local109 + local58[local93];
							local93 += local35;
							@Pc(129) int local129 = local119 + local58[local97];
							local97 += local35;
							@Pc(139) int local139 = local129 + local58[local97];
							local65[local91] = (byte) (local139 >> 2);
							local97 += local35;
							local91 += local35;
						}
						local97 += local83;
						local93 += local83;
					}
				}
				local65 = local58;
				arg5 = local56;
				local58 = local85;
				arg3 = local52;
				local56 >>= 0x1;
				local37++;
				local48 >>= 0x1;
				local52 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	public static void method6015() {
		Static142.aClass42_9.method1108();
		Static445.aClass42_33.method1108();
	}
}
