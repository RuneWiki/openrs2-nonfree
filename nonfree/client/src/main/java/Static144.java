import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!eq", name = "s", descriptor = "[I")
	public static int[] anIntArray235;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "Lclient!wt;")
	public static final Class393 aClass393_1 = new Class393();

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_58 = new Class180(45, 2);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I[BIBIII)V")
	public static void method2634(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static129.method2437(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static129.method2437(arg0)) {
			@Pc(35) int local35 = Static336.method5063(arg3);
			@Pc(37) int local37 = 0;
			@Pc(49) int local49 = arg0 > arg2 ? arg2 : arg0;
			@Pc(53) int local53 = arg2 >> 1;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(59) byte[] local59 = arg1;
			@Pc(66) byte[] local66 = new byte[local57 * local53 * local35];
			while (true) {
				OpenGL.glTexImage2Dub(arg4, local37, arg5, arg2, arg0, 0, arg3, 5121, local59, 0);
				if (local49 <= 1) {
					return;
				}
				@Pc(85) int local85 = local35 * arg2;
				for (@Pc(87) int local87 = 0; local87 < local35; local87++) {
					@Pc(90) int local90 = local87;
					@Pc(92) int local92 = local87;
					@Pc(96) int local96 = local85 + local87;
					for (@Pc(98) int local98 = 0; local98 < local57; local98++) {
						for (@Pc(101) int local101 = 0; local101 < local53; local101++) {
							@Pc(106) byte local106 = local59[local92];
							local92 += local35;
							@Pc(116) int local116 = local106 + local59[local92];
							@Pc(122) int local122 = local116 + local59[local96];
							local92 += local35;
							local96 += local35;
							@Pc(136) int local136 = local122 + local59[local96];
							local96 += local35;
							local66[local90] = (byte) (local136 >> 2);
							local90 += local35;
						}
						local92 += local85;
						local96 += local85;
					}
				}
				@Pc(181) byte[] local181 = local66;
				local66 = local59;
				arg0 = local57;
				local59 = local181;
				arg2 = local53;
				local37++;
				local57 >>= 0x1;
				local49 >>= 0x1;
				local53 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(II)I")
	public static int method2636(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
