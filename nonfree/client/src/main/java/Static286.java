import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
	public static int anInt4776;

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "F")
	public static float aFloat79;

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray33 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IILjava/lang/String;)I")
	public static int method3912(@OriginalArg(2) String arg0) {
		return Static229.method3303(16, arg0);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V")
	public static void method3914(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg0, 4);
		local8.method28();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIIIII[II)V")
	public static void method3915(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static362.method5163(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static362.method5163(arg0)) {
			@Pc(47) int local47 = 0;
			@Pc(58) int local58 = arg3 < arg0 ? arg3 : arg0;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(66) int local66 = arg0 >> 1;
			@Pc(68) int[] local68 = arg4;
			@Pc(73) int[] local73 = new int[local66 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local47, arg5, arg3, arg0, 0, 32993, arg2, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(97) int local97 = arg3;
				for (@Pc(99) int local99 = 0; local99 < local66; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local62; local103++) {
						@Pc(110) int local110 = local68[local92++];
						@Pc(115) int local115 = local68[local97++];
						@Pc(120) int local120 = local68[local92++];
						@Pc(126) int local126 = local110 >> 8 & 0xFF;
						@Pc(132) int local132 = local110 >> 16 & 0xFF;
						@Pc(137) int local137 = local68[local97++];
						@Pc(141) int local141 = local110 & 0xFF;
						@Pc(147) int local147 = local110 >> 24 & 0xFF;
						@Pc(155) int local155 = local147 + (local120 >> 24 & 0xFF);
						@Pc(163) int local163 = local126 + (local120 >> 8 & 0xFF);
						@Pc(171) int local171 = local132 + (local120 >> 16 & 0xFF);
						@Pc(177) int local177 = local141 + (local120 & 0xFF);
						@Pc(183) int local183 = local177 + (local115 & 0xFF);
						@Pc(191) int local191 = local171 + (local115 >> 16 & 0xFF);
						@Pc(199) int local199 = local163 + (local115 >> 8 & 0xFF);
						@Pc(207) int local207 = local155 + (local115 >> 24 & 0xFF);
						@Pc(213) int local213 = local183 + (local137 & 0xFF);
						@Pc(221) int local221 = local207 + (local137 >> 24 & 0xFF);
						@Pc(229) int local229 = local199 + (local137 >> 8 & 0xFF);
						@Pc(237) int local237 = local191 + (local137 >> 16 & 0xFF);
						local73[local90++] = local213 >> 2 & 0xFF | (local221 & 0x3FC) << 22 | (local237 & 0x3FC) << 14 | (local229 & 0x3FC) << 6;
					}
					local97 += arg3;
					local92 += arg3;
				}
				@Pc(290) int[] local290 = local73;
				local73 = local68;
				arg3 = local62;
				arg0 = local66;
				local68 = local290;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local47++;
				local66 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIB)I")
	public static int method3916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(37) int local37 = ((arg0 & 0xFF00FF) * local7 & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(42) int local42 = 255 - local7;
		return ((local42 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local42 & 0xFF0000) >>> 8) + local37;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!tp;")
	public static Class47_Sub1 method3918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class137 local7 = Static131.aClass137ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class167 local14 = local7.aClass167_1; local14 != null; local14 = local14.aClass167_2) {
			@Pc(18) Class47_Sub1 local18 = local14.aClass47_Sub1_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort104 == arg1 && local18.aShort105 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
