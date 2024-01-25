import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "[Lclient!wn;")
	public static Class265[] aClass265Array1;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_22 = new Class87(4, 6);

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
	public static int anInt7550 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void method5925() {
		Static381.method2283(Static123.aClass21_Sub1_1.aBoolean81);
		Static228.aClass3_Sub5_Sub1_130 = new Class3_Sub5_Sub1();
		Static228.aClass3_Sub5_Sub1_130.method3615();
		Static183.aClass33_4 = Static336.method4877(22050, 0, Static351.aCanvas6, Static295.aClass103_5);
		Static183.aClass33_4.method3057(Static228.aClass3_Sub5_Sub1_130);
		Static344.method4924(Static405.aClass56_84, Static144.aClass56_36, Static228.aClass3_Sub5_Sub1_130, Static95.aClass56_23);
		Static14.aClass33_1 = Static336.method4877(2048, 1, Static351.aCanvas6, Static295.aClass103_5);
		Static251.aClass3_Sub5_Sub4_1 = new Class3_Sub5_Sub4();
		Static14.aClass33_1.method3057(Static251.aClass3_Sub5_Sub4_1);
		Static19.aClass199_1 = new Class199(22050, Static94.anInt2028);
		Static251.anInt4729 = Static160.aClass56_39.method1368("scape main");
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIII[BI)V")
	public static void method5926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 > 0 && !Static39.method920(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static39.method920(arg3)) {
			@Pc(35) int local35 = Static265.method3997(arg0);
			@Pc(37) int local37 = 0;
			@Pc(44) int local44 = arg1 < arg3 ? arg1 : arg3;
			@Pc(48) int local48 = arg1 >> 1;
			@Pc(52) int local52 = arg3 >> 1;
			@Pc(54) byte[] local54 = arg4;
			@Pc(61) byte[] local61 = new byte[local52 * local48 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg5, local37, arg2, arg1, arg3, 0, arg0, 5121, local54, 0);
				if (local44 <= 1) {
					return;
				}
				@Pc(84) int local84 = arg1 * local35;
				@Pc(86) byte[] local86 = local61;
				for (@Pc(88) int local88 = 0; local88 < local35; local88++) {
					@Pc(91) int local91 = local88;
					@Pc(93) int local93 = local88;
					@Pc(97) int local97 = local88 + local84;
					for (@Pc(99) int local99 = 0; local99 < local52; local99++) {
						for (@Pc(102) int local102 = 0; local102 < local48; local102++) {
							@Pc(107) byte local107 = local54[local93];
							local93 += local35;
							@Pc(117) int local117 = local107 + local54[local93];
							@Pc(123) int local123 = local117 + local54[local97];
							local93 += local35;
							local97 += local35;
							@Pc(137) int local137 = local123 + local54[local97];
							local61[local91] = (byte) (local137 >> 2);
							local97 += local35;
							local91 += local35;
						}
						local97 += local84;
						local93 += local84;
					}
				}
				local61 = local54;
				local54 = local86;
				arg3 = local52;
				arg1 = local48;
				local37++;
				local52 >>= 0x1;
				local44 >>= 0x1;
				local48 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
