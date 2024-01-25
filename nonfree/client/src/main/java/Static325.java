import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!nca", name = "N", descriptor = "[Lclient!ji;")
	public static Class160[] aClass160Array1;

	@OriginalMember(owner = "client!nca", name = "D", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_95 = new Class40("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_155 = new Class150(106, 8);

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "I")
	public static int anInt6252 = 0;

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "Lclient!nn;")
	public static final Class212 aClass212_15 = new Class212(11, 17);

	@OriginalMember(owner = "client!nca", name = "K", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_96 = new Class40("flash3:", "blinken3:", "clignotant3:", "brilho3:");

	@OriginalMember(owner = "client!nca", name = "M", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg4;
		@Pc(21) int local21 = arg6 - arg4;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg6 * arg6;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(45) int local45 = local29 << 1;
		@Pc(49) int local49 = local25 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = local33 << 1;
		@Pc(61) int local61 = arg6 << 1;
		@Pc(65) int local65 = local21 << 1;
		@Pc(74) int local74 = local45 + local25 * (1 - local61);
		@Pc(83) int local83 = local29 - (local61 - 1) * local49;
		@Pc(92) int local92 = (1 - local65) * local33 + local53;
		@Pc(100) int local100 = local37 - (local65 - 1) * local57;
		@Pc(104) int local104 = local25 << 2;
		@Pc(108) int local108 = local29 << 2;
		@Pc(112) int local112 = local33 << 2;
		@Pc(116) int local116 = local37 << 2;
		@Pc(120) int local120 = local45 * 3;
		@Pc(126) int local126 = local49 * (local61 - 3);
		@Pc(130) int local130 = local53 * 3;
		@Pc(136) int local136 = local57 * (local65 - 3);
		@Pc(138) int local138 = local108;
		@Pc(144) int local144 = (arg6 - 1) * local104;
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (local21 - 1) * local112;
		@Pc(156) int[] local156 = Static352.anIntArrayArray51[arg2];
		Static321.method5153(arg5, arg3 - arg1, local156, arg3 - local16);
		Static321.method5153(arg0, arg3 - local16, local156, arg3 + local16);
		Static321.method5153(arg5, arg3 + local16, local156, arg1 + arg3);
		while (local9 > 0) {
			@Pc(203) boolean local203 = local9 <= local21;
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local138;
					local74 += local120;
					local7++;
					local138 += local108;
					local120 += local108;
				}
			}
			if (local203) {
				if (local92 < 0) {
					while (local92 < 0) {
						local100 += local146;
						local92 += local130;
						local11++;
						local146 += local116;
						local130 += local116;
					}
				}
				if (local100 < 0) {
					local100 += local146;
					local92 += local130;
					local146 += local116;
					local11++;
					local130 += local116;
				}
				local92 += -local152;
				local100 += -local136;
				local136 -= local112;
				local152 -= local112;
			}
			if (local83 < 0) {
				local83 += local138;
				local74 += local120;
				local138 += local108;
				local7++;
				local120 += local108;
			}
			local83 += -local126;
			local74 += -local144;
			local9--;
			local126 -= local104;
			local144 -= local104;
			@Pc(342) int local342 = arg2 - local9;
			@Pc(346) int local346 = local9 + arg2;
			@Pc(350) int local350 = arg3 + local7;
			@Pc(355) int local355 = arg3 - local7;
			if (local203) {
				@Pc(379) int local379 = local11 + arg3;
				@Pc(384) int local384 = arg3 - local11;
				Static321.method5153(arg5, local355, Static352.anIntArrayArray51[local342], local384);
				Static321.method5153(arg0, local384, Static352.anIntArrayArray51[local342], local379);
				Static321.method5153(arg5, local379, Static352.anIntArrayArray51[local342], local350);
				Static321.method5153(arg5, local355, Static352.anIntArrayArray51[local346], local384);
				Static321.method5153(arg0, local384, Static352.anIntArrayArray51[local346], local379);
				Static321.method5153(arg5, local379, Static352.anIntArrayArray51[local346], local350);
			} else {
				Static321.method5153(arg5, local355, Static352.anIntArrayArray51[local342], local350);
				Static321.method5153(arg5, local355, Static352.anIntArrayArray51[local346], local350);
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!gp;Z)V")
	public static void method5194(@OriginalArg(0) Class117 arg0) {
		Static310.aClass117_139 = arg0;
	}
}
