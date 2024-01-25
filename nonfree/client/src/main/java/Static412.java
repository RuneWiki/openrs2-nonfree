import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oba", name = "E", descriptor = "[I")
	public static final int[] anIntArray442 = new int[4];

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZB)V")
	public static void method6205(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static561.anInt9357 != -1) {
				Static582.method8066(Static561.anInt9357);
			}
			for (@Pc(19) Class6_Sub51 local19 = (Class6_Sub51) Static262.aClass209_35.method5037(); local19 != null; local19 = (Class6_Sub51) Static262.aClass209_35.method5036()) {
				if (!local19.method9176()) {
					local19 = (Class6_Sub51) Static262.aClass209_35.method5037();
					if (local19 == null) {
						break;
					}
				}
				Static199.method2913(true, false, local19);
			}
			Static561.anInt9357 = -1;
			Static262.aClass209_35 = new Class209(8);
			Static370.method5331();
			Static561.anInt9357 = Static474.anInt7340;
			Static420.method6263(false);
			Static509.method7248();
			Static295.method4219(Static561.anInt9357);
		}
		Static618.aBoolean708 = false;
		Static633.aString140 = "";
		Static12.aString10 = "";
		Static672.method8760();
		Static357.anInt6124 = -1;
		Static226.method3295(Static471.anInt8114);
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 = new Class2_Sub1_Sub1_Sub3_Sub1();
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 = Static393.anInt6574 * 512 / 2;
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 = Static491.anInt9856 * 512 / 2;
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray302[0] = Static491.anInt9856 / 2;
		Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anIntArray301[0] = Static393.anInt6574 / 2;
		Static542.anInt9140 = 0;
		Static23.anInt564 = 0;
		if (Static407.anInt6820 == 2) {
			Static542.anInt9140 = Static400.anInt6733 << 9;
			Static23.anInt564 = Static667.anInt10667 << 9;
		} else {
			Static246.method3615();
		}
		Static139.method2087();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIII[BI)V")
	public static void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static177.method2498(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static177.method2498(arg1)) {
			@Pc(37) int local37 = Static545.method7723(arg2);
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg5 >= arg1 ? arg1 : arg5;
			@Pc(50) int local50 = arg5 >> 1;
			@Pc(54) int local54 = arg1 >> 1;
			@Pc(56) byte[] local56 = arg4;
			@Pc(63) byte[] local63 = new byte[local37 * local50 * local54];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local39, arg3, arg5, arg1, 0, arg2, 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(81) int local81 = arg5 * local37;
				@Pc(83) byte[] local83 = local63;
				for (@Pc(85) int local85 = 0; local85 < local37; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(96) int local96 = local85 + local81;
					for (@Pc(98) int local98 = 0; local98 < local54; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local50; local102++) {
							@Pc(108) byte local108 = local56[local91];
							local91 += local37;
							@Pc(118) int local118 = local108 + local56[local91];
							local91 += local37;
							@Pc(128) int local128 = local118 + local56[local96];
							local96 += local37;
							@Pc(138) int local138 = local128 + local56[local96];
							local63[local89] = (byte) (local138 >> 2);
							local96 += local37;
							local89 += local37;
						}
						local91 += local81;
						local96 += local81;
					}
				}
				local63 = local56;
				arg1 = local54;
				arg5 = local50;
				local56 = local83;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local46 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
