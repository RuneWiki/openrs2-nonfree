import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!et", name = "O", descriptor = "I")
	public static int anInt3045;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "Lclient!ng;")
	public static Class6_Sub17_Sub4 aClass6_Sub17_Sub4_2;

	@OriginalMember(owner = "client!et", name = "P", descriptor = "F")
	public static float aFloat52 = 0.0F;

	@OriginalMember(owner = "client!et", name = "X", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_47 = new Class322(93, 2);

	@OriginalMember(owner = "client!et", name = "V", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[4];

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(II)I")
	public static int method2850(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(54) double local54 = local14;
		if (local14 < local23) {
			local54 = local23;
		}
		if (local54 < local30) {
			local54 = local30;
		}
		@Pc(68) double local68 = 0.0D;
		@Pc(70) double local70 = 0.0D;
		@Pc(76) double local76 = (local54 + local32) / 2.0D;
		if (local32 != local54) {
			if (local76 < 0.5D) {
				local70 = (local54 - local32) / (local32 + local54);
			}
			if (local54 == local14) {
				local68 = (local23 - local30) / (local54 - local32);
			} else if (local23 == local54) {
				local68 = (local30 - local14) / (-local32 + local54) + 2.0D;
			} else if (local54 == local30) {
				local68 = (local14 - local23) / (local54 - local32) + 4.0D;
			}
			if (local76 >= 0.5D) {
				local70 = (local54 - local32) / (2.0D - local32 - local54);
			}
		}
		local68 /= 6.0D;
		@Pc(169) int local169 = (int) (local68 * 256.0D);
		@Pc(174) int local174 = (int) (local70 * 256.0D);
		@Pc(179) int local179 = (int) (local76 * 256.0D);
		if (local174 < 0) {
			local174 = 0;
		} else if (local174 > 255) {
			local174 = 255;
		}
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local174 >>= 0x4;
		} else if (local179 > 217) {
			local174 >>= 0x3;
		} else if (local179 > 192) {
			local174 >>= 0x2;
		} else if (local179 > 179) {
			local174 >>= 0x1;
		}
		return (local179 >> 1) + (((local169 & 0xFF) >> 2 << 10) + (local174 >> 5 << 7));
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method2851(@OriginalArg(0) byte[] arg0) {
		return Static420.method6420(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(I)V")
	public static void method2852() {
		Static19.method237();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!jj;[II[II)Lclient!wga;")
	public static Class1_Sub3 method2853(@OriginalArg(1) Class75_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (!arg0.method6786(Static435.aClass274_13, Static212.aClass155_46)) {
			@Pc(84) int[] local84 = new int[arg4 * arg2];
			for (local31 = 0; local31 < arg4; local31++) {
				local41 = local31 * arg2 + arg3[local31];
				for (local43 = 0; local43 < arg1[local31]; local43++) {
					local84[local41++] = -16777216;
				}
			}
			return new Class1_Sub3(arg0, arg2, arg4, local84);
		}
		@Pc(29) byte[] local29 = new byte[arg4 * arg2];
		for (local31 = 0; local31 < arg4; local31++) {
			local41 = arg3[local31] + arg2 * local31;
			for (local43 = 0; local43 < arg1[local31]; local43++) {
				local29[local41++] = -1;
			}
		}
		return new Class1_Sub3(arg0, arg2, arg4, local29);
	}
}
