import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_132 = new Class36(39, -1);

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_262 = new Class186(44, 4);

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_133 = new Class36(25, 8);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIIII[III)V")
	public static void method5620(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg3 > 0 && !Static315.method4350(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static315.method4350(arg5)) {
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg3 < arg5 ? arg3 : arg5;
			@Pc(55) int local55 = arg3 >> 1;
			@Pc(59) int local59 = arg5 >> 1;
			@Pc(61) int[] local61 = arg4;
			@Pc(66) int[] local66 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local44, arg0, arg3, arg5, 0, 32993, arg2, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(84) int local84 = 0;
				@Pc(86) int local86 = 0;
				@Pc(91) int local91 = arg3;
				for (@Pc(93) int local93 = 0; local93 < local59; local93++) {
					for (@Pc(97) int local97 = 0; local97 < local55; local97++) {
						@Pc(104) int local104 = local61[local86++];
						@Pc(109) int local109 = local61[local86++];
						@Pc(114) int local114 = local61[local91++];
						@Pc(119) int local119 = local61[local91++];
						@Pc(125) int local125 = local104 >> 16 & 0xFF;
						@Pc(131) int local131 = local104 >> 24 & 0xFF;
						@Pc(137) int local137 = local104 >> 8 & 0xFF;
						@Pc(141) int local141 = local104 & 0xFF;
						@Pc(149) int local149 = local131 + (local109 >> 24 & 0xFF);
						@Pc(157) int local157 = local137 + (local109 >> 8 & 0xFF);
						@Pc(163) int local163 = local141 + (local109 & 0xFF);
						@Pc(171) int local171 = local125 + (local109 >> 16 & 0xFF);
						@Pc(179) int local179 = local157 + (local114 >> 8 & 0xFF);
						@Pc(187) int local187 = local149 + (local114 >> 24 & 0xFF);
						@Pc(193) int local193 = local163 + (local114 & 0xFF);
						@Pc(201) int local201 = local171 + (local114 >> 16 & 0xFF);
						@Pc(209) int local209 = local201 + (local119 >> 16 & 0xFF);
						@Pc(217) int local217 = local187 + (local119 >> 24 & 0xFF);
						@Pc(225) int local225 = local179 + (local119 >> 8 & 0xFF);
						@Pc(231) int local231 = local193 + (local119 & 0xFF);
						local66[local84++] = (local225 & 0x3FC) << 6 | (local209 & 0x3FC) << 14 | (local217 & 0x3FC) << 22 | local231 >> 2 & 0xFF;
					}
					local86 += arg3;
					local91 += arg3;
				}
				@Pc(276) int[] local276 = local66;
				local66 = local61;
				arg5 = local59;
				local61 = local276;
				arg3 = local55;
				local59 >>= 0x1;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIILclient!eu;)V")
	public static void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3) {
		for (@Pc(15) Class4_Sub44 local15 = (Class4_Sub44) Static177.aClass258_26.method5538(); local15 != null; local15 = (Class4_Sub44) Static177.aClass258_26.method5528()) {
			if (local15.anInt7344 == arg1 && local15.anInt7342 == arg0 << 7 && local15.anInt7348 == arg2 << 7 && local15.aClass71_1.anInt2158 == arg3.anInt2158) {
				if (local15.aClass4_Sub18_Sub2_3 != null) {
					Static393.aClass4_Sub18_Sub1_1.method2789(local15.aClass4_Sub18_Sub2_3);
					local15.aClass4_Sub18_Sub2_3 = null;
				}
				if (local15.aClass4_Sub18_Sub2_2 != null) {
					Static393.aClass4_Sub18_Sub1_1.method2789(local15.aClass4_Sub18_Sub2_2);
					local15.aClass4_Sub18_Sub2_2 = null;
				}
				local15.method5854();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(III)V")
	public static void method5625(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg1, 13);
		local8.method2762();
		local8.anInt3611 = arg0;
	}
}
