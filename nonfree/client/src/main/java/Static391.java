import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!fa;")
	public static Interface5 anInterface5_8;

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!pl;")
	public static Class259 aClass259_124;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "F")
	public static float aFloat201;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	public static int anInt6845 = 0;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public static int anInt6846 = -1;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIII[BI[BB)V")
	public static void method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7) {
		@Pc(10) int local10 = -(arg0 >> 2);
		@Pc(15) int local15 = -(arg0 & 0x3);
		for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg4++;
				arg7[local33] = (byte) (arg7[local33] - arg5[arg2++]);
				@Pc(46) int local46 = arg4++;
				arg7[local46] = (byte) (arg7[local46] - arg5[arg2++]);
				@Pc(59) int local59 = arg4++;
				arg7[local59] = (byte) (arg7[local59] - arg5[arg2++]);
				@Pc(72) int local72 = arg4++;
				arg7[local72] = (byte) (arg7[local72] - arg5[arg2++]);
			}
			for (@Pc(88) int local88 = local15; local88 < 0; local88++) {
				local33 = arg4++;
				arg7[local33] = (byte) (arg7[local33] - arg5[arg2++]);
			}
			arg2 += arg6;
			arg4 += arg3;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I[Lclient!kp;I)V")
	public static void method5731(@OriginalArg(1) Class196[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class196 local21 = arg0[local15];
			if (local21 != null && local21.anInt5089 == arg1 && !Static67.method1092(local21)) {
				if (local21.anInt5098 == 0) {
					method5731(arg0, local21.anInt5112);
					if (local21.aClass196Array2 != null) {
						method5731(local21.aClass196Array2, local21.anInt5112);
					}
					@Pc(59) Class2_Sub44 local59 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local21.anInt5112);
					if (local59 != null) {
						Static362.method5087(local59.anInt8608);
					}
				}
				if (local21.anInt5098 == 6 && local21.anInt5103 != -1) {
					@Pc(81) Class84 local81 = Static116.aClass140_2.method3287(local21.anInt5103);
					if (local81 != null) {
						local21.anInt5101 += Static367.anInt6534;
						@Pc(92) int local92 = local21.anInt5087;
						while (local21.anInt5101 > local81.anIntArray110[local21.anInt5087]) {
							local21.anInt5101 -= local81.anIntArray110[local21.anInt5087];
							local21.anInt5087++;
							if (local21.anInt5087 >= local81.anIntArray108.length) {
								local21.anInt5087 -= local81.anInt2068;
								if (local21.anInt5087 < 0 || local21.anInt5087 >= local81.anIntArray108.length) {
									local21.anInt5087 = 0;
								}
							}
							local21.anInt5147 = local21.anInt5087 + 1;
							if (local81.anIntArray108.length <= local21.anInt5147) {
								local21.anInt5147 -= local81.anInt2068;
								if (local21.anInt5147 < 0 || local81.anIntArray108.length <= local21.anInt5147) {
									local21.anInt5147 = -1;
								}
							}
							Static515.method7134(local21);
						}
						if (local92 != local21.anInt5087) {
							Static58.method951(local81, local21.anInt5087);
						}
					}
				}
			}
		}
	}
}
