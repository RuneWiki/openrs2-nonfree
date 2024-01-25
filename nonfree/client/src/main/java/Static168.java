import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
	public static int anInt3084 = 765;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "[Lclient!rm;")
	public static final Class279[] aClass279Array1 = new Class279[8];

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)I")
	public static int method2673(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static483.method6798(arg0 - 1, arg1 - 1) + Static483.method6798(arg0 - 1, arg1 + 1) + Static483.method6798(arg0 - -1, arg1 - 1) + Static483.method6798(arg0 - -1, arg1 + 1);
		@Pc(73) int local73 = Static483.method6798(arg0, arg1 - 1) + Static483.method6798(arg0, arg1 + 1) + Static483.method6798(arg0 - 1, arg1) + Static483.method6798(arg0 + 1, arg1);
		@Pc(80) int local80 = Static483.method6798(arg0, arg1);
		return local41 / 16 + local73 / 8 + local80 / 4;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[BIIII[B)V")
	public static void method2674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(20) int local20 = -(arg1 & 0x3);
		for (@Pc(23) int local23 = -arg4; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg3[local31] += arg7[arg2++];
				@Pc(43) int local43 = arg6++;
				arg3[local43] += arg7[arg2++];
				@Pc(55) int local55 = arg6++;
				arg3[local55] += arg7[arg2++];
				@Pc(67) int local67 = arg6++;
				arg3[local67] += arg7[arg2++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg6++;
				arg3[local31] += arg7[arg2++];
			}
			arg6 += arg0;
			arg2 += arg5;
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "([I[I[IBLclient!kw;)V")
	public static void method2675(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class15_Sub2_Sub4_Sub1 arg3) {
		for (@Pc(11) int local11 = 0; local11 < arg2.length; local11++) {
			@Pc(17) int local17 = arg2[local11];
			@Pc(21) int local21 = arg1[local11];
			@Pc(25) int local25 = arg0[local11];
			@Pc(27) int local27 = 0;
			while (local21 != 0 && arg3.aClass140Array3.length > local27) {
				if ((local21 & 0x1) != 0) {
					if (local17 == -1) {
						arg3.aClass140Array3[local27] = null;
					} else {
						@Pc(50) Class63 local50 = Static388.aClass324_2.method7265(local17);
						@Pc(53) int local53 = local50.anInt1379;
						@Pc(58) Class140 local58 = arg3.aClass140Array3[local27];
						if (local58 != null) {
							if (local58.anInt4049 == local17) {
								if (local53 == 0) {
									local58 = arg3.aClass140Array3[local27] = null;
								} else if (local53 == 1) {
									local58.anInt4048 = 0;
									local58.anInt4044 = local25;
									local58.anInt4042 = 0;
									local58.anInt4040 = 1;
									local58.anInt4045 = 0;
									Static32.method514(false, arg3.anInt8911, arg3.aByte98, local50, arg3.anInt8913, 0);
								} else if (local53 == 2) {
									local58.anInt4042 = 0;
								}
							} else if (local50.anInt1377 >= Static388.aClass324_2.method7265(local58.anInt4049).anInt1377) {
								local58 = arg3.aClass140Array3[local27] = null;
							}
						}
						if (local58 == null) {
							local58 = arg3.aClass140Array3[local27] = new Class140();
							local58.anInt4040 = 1;
							local58.anInt4042 = 0;
							local58.anInt4049 = local17;
							local58.anInt4048 = 0;
							local58.anInt4045 = 0;
							local58.anInt4044 = local25;
							Static32.method514(false, arg3.anInt8911, arg3.aByte98, local50, arg3.anInt8913, 0);
						}
					}
				}
				local27++;
				local21 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!faa;)V")
	public static void method2677(@OriginalArg(1) Class97 arg0) {
		@Pc(16) Class97 local16 = Static464.method6495(arg0);
		@Pc(20) int local20;
		@Pc(22) int local22;
		if (local16 == null) {
			local20 = Static367.anInt6719;
			local22 = Static154.anInt2867;
		} else {
			local20 = local16.anInt2690;
			local22 = local16.anInt2670;
		}
		Static257.method5659(false, local20, arg0, local22);
		Static570.method7831(local20, arg0, local22);
	}
}
