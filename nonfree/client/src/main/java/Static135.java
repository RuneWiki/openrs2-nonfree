import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jn", name = "V", descriptor = "Z")
	public static boolean aBoolean191;

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "Lclient!jl;")
	public static Class89 aClass89_17 = new Class89(30);

	@OriginalMember(owner = "client!jn", name = "T", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBII)V")
	public static void method2293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			Static98.method3942(arg1, Static121.anIntArrayArray33[arg0], arg3, arg2);
		} else {
			Static98.method3942(arg2, Static121.anIntArrayArray33[arg0], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIZLclient!d;ILclient!o;IIBII)Lclient!o;")
	public static Class2_Sub1 method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class32 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(26) long local26 = ((long) arg3 << 48) + ((long) arg7 << 32) + (long) ((arg0 << 24) + arg4 + (arg10 << 16));
		@Pc(32) Class2_Sub1 local32 = (Class2_Sub1) Static289.aClass89_47.method2268(local26);
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(122) int local122;
		@Pc(126) int local126;
		@Pc(152) int local152;
		if (local32 == null) {
			@Pc(40) byte local40;
			if (arg4 == 1) {
				local40 = 9;
			} else if (arg4 == 2) {
				local40 = 12;
			} else if (arg4 == 3) {
				local40 = 15;
			} else if (arg4 == 4) {
				local40 = 18;
			} else {
				local40 = 21;
			}
			@Pc(84) Class2_Sub3 local84 = new Class2_Sub3(local40 * 3 + 1, 2 * 3 * local40 - local40, 0);
			@Pc(88) int[][] local88 = new int[3][local40];
			local94 = local84.method644(0, 0);
			@Pc(109) int[] local109 = new int[] { 64, 96, 128 };
			for (local111 = 0; local111 < 3; local111++) {
				local122 = local109[local111];
				local126 = local109[local111];
				for (@Pc(128) int local128 = 0; local128 < local40; local128++) {
					@Pc(141) int local141 = (local128 << 11) / local40;
					local152 = arg12 + local122 * Class146.anIntArray461[local141] >> 16;
					@Pc(162) int local162 = arg1 + local126 * Class146.anIntArray463[local141] >> 16;
					local88[local111][local128] = local84.method644(local152, local162);
				}
			}
			for (local111 = 0; local111 < 3; local111++) {
				local122 = (local111 * 256 + 128) / 3;
				local126 = 256 - local122;
				@Pc(207) byte local207 = (byte) (local122 * arg0 + arg10 * local126 >> 8);
				@Pc(252) short local252 = (short) ((local126 * (arg7 & 0xFC00) + local122 * (arg3 & 0xFC00) & 0xFC0000) + (local122 * (arg3 & 0x380) + local126 * (arg7 & 0x380) & 0x38000) + (local126 * (arg7 & 0x7F) + local122 * (arg3 & 0x7F) & 0x7F00) >> 8);
				for (local152 = 0; local152 < local40; local152++) {
					if (local111 == 0) {
						local84.method646(local94, local88[0][(local152 + 1) % local40], local88[0][local152], local252, local207);
					} else {
						local84.method646(local88[local111 - 1][local152], local88[local111 - 1][(local152 + 1) % local40], local88[local111][(local152 + 1) % local40], local252, local207);
						local84.method646(local88[local111 - 1][local152], local88[local111][(local152 + 1) % local40], local88[local111][local152], local252, local207);
					}
				}
			}
			local32 = local84.method651(64, 768, -50, -10, -50);
			Static289.aClass89_47.method2272(local26, local32);
		}
		@Pc(374) int local374 = arg4 * 64 - 1;
		@Pc(377) int local377 = -local374;
		@Pc(379) int local379 = local374;
		local94 = local374;
		@Pc(384) int local384 = -local374;
		if (arg5) {
			if (arg2 > 1152 && arg2 < 1920) {
				local379 = local374 + 128;
			}
			if (arg2 > 128 && arg2 < 896) {
				local377 -= 128;
			}
			if (arg2 > 1664 || arg2 < 384) {
				local384 -= 128;
			}
			if (arg2 > 640 && arg2 < 1408) {
				local94 = local374 + 128;
			}
		}
		@Pc(424) int local424 = arg8.method575();
		if (local424 < local377) {
			local424 = local377;
		}
		local111 = arg8.method558();
		if (local379 < local111) {
			local111 = local379;
		}
		local122 = arg8.method573();
		local126 = arg8.method549();
		if (local122 < local384) {
			local122 = local384;
		}
		@Pc(462) Class1_Sub3_Sub21 local462 = null;
		if (local126 > local94) {
			local126 = local94;
		}
		if (arg6 != null) {
			@Pc(480) int local480 = arg6.anIntArray123[arg11];
			local462 = Static256.method3953(local480 >> 16);
			arg11 = local480 & 0xFFFF;
		}
		if (local462 == null) {
			local32 = local32.method564(true, true, true);
			local32.method571((local111 - local424) / 2, 128, (local126 - local122) / 2);
			local32.method572((local111 + local424) / 2, 0, (local122 + local126) / 2);
		} else {
			local32 = local32.method564(!local462.method4307(arg11), !local462.method4311(arg11), true);
			local32.method571((local111 - local424) / 2, 128, (local126 - local122) / 2);
			local32.method572((local111 + local424) / 2, 0, (local126 + local122) / 2);
			local32.method548(local462, arg11);
		}
		if (arg2 != 0) {
			local32.method556(arg2);
		}
		if (Static294.aBoolean367) {
			@Pc(668) Class2_Sub1_Sub1 local668 = (Class2_Sub1_Sub1) local32;
			if (Static93.method1576(arg1 + local122, arg12 + local424, Static185.anInt4085) != arg9 || arg9 != Static93.method1576(arg1 + local126, arg12 - -local111, Static185.anInt4085)) {
				for (local152 = 0; local152 < local668.anInt79; local152++) {
					local668.anIntArray9[local152] += Static93.method1576(arg1 + local668.anIntArray4[local152], arg12 + local668.anIntArray6[local152], Static185.anInt4085) - arg9;
				}
				local668.aClass165_4.aBoolean331 = false;
				local668.aClass77_1.aBoolean154 = false;
			}
		} else {
			@Pc(593) Class2_Sub1_Sub2 local593 = (Class2_Sub1_Sub2) local32;
			if (Static93.method1576(local122 + arg1, arg12 - -local424, Static185.anInt4085) != arg9 || arg9 != Static93.method1576(arg1 + local126, arg12 - -local111, Static185.anInt4085)) {
				for (local152 = 0; local152 < local593.anInt704; local152++) {
					local593.anIntArray60[local152] += Static93.method1576(arg1 + local593.anIntArray67[local152], local593.anIntArray61[local152] - -arg12, Static185.anInt4085) - arg9;
				}
				local593.aBoolean41 = false;
			}
		}
		return local32;
	}
}
