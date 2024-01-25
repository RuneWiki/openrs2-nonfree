import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
	public static int anInt8639 = 0;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	public static int anInt8643 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BIIIII)V")
	public static void method7105(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static78.method1703(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static78.method1703(arg0)) {
			@Pc(37) int local37 = Static129.method7912(arg4);
			@Pc(39) int local39 = 0;
			@Pc(58) int local58 = arg5 >= arg0 ? arg0 : arg5;
			@Pc(62) int local62 = arg5 >> 1;
			@Pc(66) int local66 = arg0 >> 1;
			@Pc(68) byte[] local68 = arg1;
			@Pc(75) byte[] local75 = new byte[local37 * local66 * local62];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local39, arg3, arg5, arg0, 0, arg4, 5121, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(96) int local96 = local37 * arg5;
				@Pc(98) byte[] local98 = local75;
				for (@Pc(100) int local100 = 0; local100 < local37; local100++) {
					@Pc(104) int local104 = local100;
					@Pc(106) int local106 = local100;
					@Pc(110) int local110 = local100 + local96;
					for (@Pc(112) int local112 = 0; local112 < local66; local112++) {
						for (@Pc(116) int local116 = 0; local116 < local62; local116++) {
							@Pc(122) byte local122 = local68[local106];
							local106 += local37;
							@Pc(132) int local132 = local122 + local68[local106];
							@Pc(138) int local138 = local132 + local68[local110];
							local106 += local37;
							local110 += local37;
							@Pc(152) int local152 = local138 + local68[local110];
							local75[local104] = (byte) (local152 >> 2);
							local110 += local37;
							local104 += local37;
						}
						local106 += local96;
						local110 += local96;
					}
				}
				local75 = local68;
				arg0 = local66;
				arg5 = local62;
				local68 = local98;
				local58 >>= 0x1;
				local62 >>= 0x1;
				local66 >>= 0x1;
				local39++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBII)Lclient!be;")
	public static Class30_Sub1_Sub1 method7106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class37 local11 = Static120.aClass37ArrayArrayArray1[arg1][arg2][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class30_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class243 local22 = local11.aClass243_3; local22 != null; local22 = local22.aClass243_11) {
			@Pc(26) Class30_Sub1 local26 = local22.aClass30_Sub1_2;
			if (local26 instanceof Class30_Sub1_Sub1) {
				@Pc(32) Class30_Sub1_Sub1 local32 = (Class30_Sub1_Sub1) local26;
				@Pc(44) int local44 = local32.method3591() * 64 + 60 - 64;
				@Pc(51) int local51 = local32.anInt9418 - local44 >> 7;
				@Pc(59) int local59 = local32.anInt9416 - local44 >> 7;
				@Pc(66) int local66 = local44 + local32.anInt9418 >> 7;
				@Pc(73) int local73 = local44 + local32.anInt9416 >> 7;
				if (local51 <= arg2 && arg0 >= local59 && arg2 <= local66 && arg0 <= local73) {
					@Pc(107) int local107 = (local66 + 1 - arg2) * (-arg0 + 1 + local73);
					if (local107 > local19) {
						local19 = local107;
						local17 = local32;
					}
				}
			}
		}
		return local17;
	}
}
