import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "Lclient!kw;")
	public static Class185 aClass185_2;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Lclient!eg;")
	public static Class80 aClass80_1;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "Lclient!hb;")
	public static Class125 aClass125_2;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "J")
	public static long aLong259 = 0L;

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "Z")
	public static boolean aBoolean723 = false;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)V")
	public static void method7706(@OriginalArg(1) int arg0) {
		if (!Static508.method7071(arg0)) {
			return;
		}
		@Pc(14) Class292[] local14 = Static14.aClass292ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local14.length; local25++) {
			@Pc(31) Class292 local31 = local14[local25];
			if (local31 != null) {
				local31.anInt7941 = 0;
				local31.anInt7969 = 0;
				local31.anInt7886 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBII)I")
	public static int method7708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 & 0x3;
		if (local11 == 0) {
			return arg2;
		} else if (local11 == 1) {
			return 4095 - arg0;
		} else if (local11 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBI[IIIII)V")
	public static void method7711(@OriginalArg(2) int arg0, @OriginalArg(3) int[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg0 > 0 && !Static404.method5927(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static404.method5927(arg5)) {
			@Pc(43) int local43 = 0;
			@Pc(54) int local54 = arg5 > arg0 ? arg0 : arg5;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg5 >> 1;
			@Pc(64) int[] local64 = arg1;
			@Pc(75) int[] local75 = new int[local62 * local58];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local43, arg4, arg0, arg5, 0, 32993, arg2, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg0;
				@Pc(99) int[] local99 = local75;
				for (@Pc(101) int local101 = 0; local101 < local62; local101++) {
					for (@Pc(105) int local105 = 0; local105 < local58; local105++) {
						@Pc(112) int local112 = local64[local93++];
						@Pc(117) int local117 = local64[local97++];
						@Pc(122) int local122 = local64[local93++];
						@Pc(128) int local128 = local112 >> 16 & 0xFF;
						@Pc(134) int local134 = local112 >> 24 & 0xFF;
						@Pc(139) int local139 = local64[local97++];
						@Pc(145) int local145 = local112 >> 8 & 0xFF;
						@Pc(149) int local149 = local112 & 0xFF;
						@Pc(155) int local155 = local149 + (local122 & 0xFF);
						@Pc(163) int local163 = local145 + (local122 >> 8 & 0xFF);
						@Pc(171) int local171 = local134 + (local122 >> 24 & 0xFF);
						@Pc(179) int local179 = local128 + (local122 >> 16 & 0xFF);
						@Pc(187) int local187 = local163 + (local117 >> 8 & 0xFF);
						@Pc(195) int local195 = local179 + (local117 >> 16 & 0xFF);
						@Pc(201) int local201 = local155 + (local117 & 0xFF);
						@Pc(209) int local209 = local171 + (local117 >> 24 & 0xFF);
						@Pc(215) int local215 = local201 + (local139 & 0xFF);
						@Pc(223) int local223 = local209 + (local139 >> 24 & 0xFF);
						@Pc(231) int local231 = local187 + (local139 >> 8 & 0xFF);
						@Pc(239) int local239 = local195 + (local139 >> 16 & 0xFF);
						local75[local91++] = (local231 & 0x3FC) << 6 | (local223 & 0x3FC) << 22 | (local239 & 0x3FC) << 14 | local215 >> 2 & 0xFF;
					}
					local97 += arg0;
					local93 += arg0;
				}
				local75 = local64;
				arg0 = local58;
				local64 = local99;
				arg5 = local62;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local43++;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
