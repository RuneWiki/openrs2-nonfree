import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_164 = new Class7("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[Lclient!cl;")
	public static final Class31_Sub2_Sub1_Sub1[] aClass31_Sub2_Sub1_Sub1Array1 = new Class31_Sub2_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_96 = new Class179(26, 7);

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "[F")
	public static final float[] aFloatArray33 = new float[4];

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[I")
	public static final int[] anIntArray663 = new int[5];

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_165 = new Class7(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "([IIIIIIII)V")
	public static void method6014(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static400.method5337(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static400.method5337(arg4)) {
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg2 >= arg4 ? arg4 : arg2;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(59) int local59 = arg4 >> 1;
			@Pc(61) int[] local61 = arg0;
			@Pc(66) int[] local66 = new int[local55 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local35, arg5, arg2, arg4, 0, 32993, arg1, local61, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(85) int local85 = 0;
				@Pc(87) int local87 = 0;
				@Pc(91) int local91 = arg2;
				for (@Pc(93) int local93 = 0; local93 < local59; local93++) {
					for (@Pc(96) int local96 = 0; local96 < local55; local96++) {
						@Pc(102) int local102 = local61[local87++];
						@Pc(107) int local107 = local61[local87++];
						@Pc(112) int local112 = local61[local91++];
						@Pc(117) int local117 = local61[local91++];
						@Pc(123) int local123 = local102 >> 8 & 0xFF;
						@Pc(129) int local129 = local102 >> 24 & 0xFF;
						@Pc(133) int local133 = local102 & 0xFF;
						@Pc(139) int local139 = local102 >> 16 & 0xFF;
						@Pc(147) int local147 = local139 + (local107 >> 16 & 0xFF);
						@Pc(155) int local155 = local123 + (local107 >> 8 & 0xFF);
						@Pc(163) int local163 = local129 + (local107 >> 24 & 0xFF);
						@Pc(169) int local169 = local133 + (local107 & 0xFF);
						@Pc(177) int local177 = local163 + (local112 >> 24 & 0xFF);
						@Pc(185) int local185 = local155 + (local112 >> 8 & 0xFF);
						@Pc(191) int local191 = local169 + (local112 & 0xFF);
						@Pc(199) int local199 = local147 + (local112 >> 16 & 0xFF);
						@Pc(207) int local207 = local185 + (local117 >> 8 & 0xFF);
						@Pc(215) int local215 = local199 + (local117 >> 16 & 0xFF);
						@Pc(223) int local223 = local177 + (local117 >> 24 & 0xFF);
						@Pc(229) int local229 = local191 + (local117 & 0xFF);
						local66[local85++] = local229 >> 2 & 0xFF | (local207 & 0x3FC) << 6 | (local215 & 0x3FC) << 14 | (local223 & 0x3FC) << 22;
					}
					local87 += arg2;
					local91 += arg2;
				}
				@Pc(274) int[] local274 = local66;
				local66 = local61;
				arg4 = local59;
				arg2 = local55;
				local61 = local274;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local35++;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IB)V")
	public static void method6015(@OriginalArg(0) int arg0) {
		Static372.anInt6090 = 1000 / arg0;
	}
}
