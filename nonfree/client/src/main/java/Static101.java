import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljava/lang/String;")
	public static final String aString79 = "glow1:";

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString80 = "Loaded fonts";

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!ue;)V")
	public static void method1908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub5 arg3) {
		if (Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static148.method4534(arg0, arg1, arg2);
		}
		Static138.aClass204ArrayArrayArray1[arg0][arg1][arg2].aClass5_Sub5_1 = arg3;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!aa;IIILclient!tc;)V")
	public static void method1909(@OriginalArg(0) Class2 arg0, @OriginalArg(4) Class195 arg1) {
		Static185.aClass195_5.method5032();
		if (Static20.aBoolean42) {
			return;
		}
		for (@Pc(21) Class1_Sub25 local21 = (Class1_Sub25) arg1.method5029(); local21 != null; local21 = (Class1_Sub25) arg1.method5021()) {
			@Pc(28) Class202 local28 = Static221.method4034(local21.anInt4124);
			if (Static151.method3579(local28)) {
				@Pc(40) boolean local40 = Static35.method932(arg0, local21, local28);
				if (local40) {
					Static66.method1370(local21, arg0, local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI[[BZ[[ILclient!sm;[[B[[BI[[BILclient!aa;Lclient!sm;)V")
	public static void method1910(@OriginalArg(1) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class41 arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class2 arg10, @OriginalArg(12) Class41 arg11) {
		for (@Pc(15) int local15 = 0; local15 < arg9; local15++) {
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				if (Static123.method2195() || Static350.method5668(Static47.anInt1095, local15, arg7, local19)) {
					@Pc(39) byte local39 = arg5[local15][local19];
					@Pc(45) byte local45 = arg6[local15][local19];
					@Pc(53) int local53 = arg1[local15][local19] & 0xFF;
					@Pc(61) int local61 = arg8[local15][local19] & 0xFF;
					@Pc(74) Class199 local74 = local53 == 0 ? null : Static340.method3663(local53 - 1);
					@Pc(87) Class9 local87 = local61 == 0 ? null : Static33.method873(local61 - 1);
					@Pc(89) int local89 = 0;
					@Pc(91) int local91 = 0;
					if (local39 != 0) {
						local89 = local87 == null ? 0 : Static307.anIntArray743[local39];
						local91 = local74 == null ? 0 : Static138.anIntArray326[local39];
					} else if (local74 != null) {
						local91 = Static138.anIntArray326[local39];
					} else if (local87 != null) {
						local89 = Static138.anIntArray326[local39];
					}
					@Pc(129) int local129 = local91 + local89;
					@Pc(131) int local131 = 0;
					if (local129 != 0) {
						@Pc(139) int[] local139 = new int[local129];
						@Pc(142) int[] local142 = new int[local129];
						@Pc(145) int[] local145 = new int[local129];
						@Pc(148) int[] local148 = new int[local129];
						@Pc(150) boolean local150 = false;
						@Pc(175) int local175;
						@Pc(181) int local181;
						if (local74 == null || local74.anInt5865 == -1 && local74.anInt5853 == -1 && local74.anInt5861 == -1) {
							for (local175 = 0; local175 < local91; local175++) {
								local139[local131] = -1;
								local131++;
							}
						} else {
							local175 = arg10.method3305() ? local74.anInt5861 : local74.anInt5857;
							if (!Static127.aBoolean226) {
								local175 = -1;
							}
							for (local181 = 0; local181 < local91; local181++) {
								local145[local131] = local175;
								local148[local131] = local74.anInt5856;
								if (local74.anInt5865 == -1) {
									local139[local131] = -1;
								} else {
									local139[local131] = local74.anInt5865;
								}
								if (local74.anInt5853 == -1) {
									local142[local131] = -1;
								} else {
									local142[local131] = local74.anInt5853;
									local150 = true;
								}
								local131++;
							}
							if (!arg2 && arg7 == 0) {
								Static82.method1590(local15, local19, local74.anInt5864, local74.anInt5859 * 8);
							}
						}
						if (!local150) {
							local142 = null;
						}
						if (local87 == null) {
							for (local175 = 0; local175 < local89; local175++) {
								local139[local131] = -1;
								local131++;
							}
						} else {
							local175 = local87.anInt235;
							if (!Static127.aBoolean226) {
								local175 = -1;
							}
							for (local181 = 0; local181 < local89; local181++) {
								local145[local131] = local175;
								local148[local131] = local87.anInt238;
								local139[local131] = arg3[local15][local19];
								if (local142 != null) {
									local142[local131] = -1;
								}
								local131++;
							}
						}
						local175 = Static193.anIntArray472.length;
						@Pc(338) int[] local338 = arg2 ? new int[local175] : null;
						@Pc(341) int[] local341 = new int[local175];
						@Pc(344) int[] local344 = new int[local175];
						@Pc(352) int local352;
						@Pc(356) int local356;
						@Pc(438) int local438;
						@Pc(447) int local447;
						for (@Pc(346) int local346 = 0; local346 < local175; local346++) {
							local352 = Static193.anIntArray472[local346];
							local356 = Static102.anIntArray254[local346];
							if (local45 == 0) {
								local341[local346] = local352;
								local344[local346] = local356;
							} else if (local45 == 1) {
								local341[local346] = local356;
								local344[local346] = 128 - local352;
							} else if (local45 == 2) {
								local341[local346] = 128 - local352;
								local344[local346] = 128 - local356;
							} else if (local45 == 3) {
								local341[local346] = 128 - local356;
								local344[local346] = local352;
							}
							if (arg2 && Static100.aBooleanArrayArray11[local39][local346]) {
								local438 = local341[local346] + (local15 << 7);
								local447 = (local19 << 7) + local344[local346];
								local338[local346] = arg11.method5433(local438, local447) - arg4.method5433(local438, local447);
							}
						}
						local352 = arg4.method5434(local15, local19);
						local356 = arg4.method5434(local15 + 1, local19);
						local438 = arg4.method5434(local15 + 1, local19 + 1);
						local447 = arg4.method5434(local15, local19 + 1);
						if (arg7 > 0) {
							@Pc(500) boolean local500 = true;
							if (local61 == 0 && local39 != 0) {
								local500 = false;
							}
							if (local53 > 0 && local74 != null && !local74.aBoolean514) {
								local500 = false;
							}
							if (local500 && local356 == local352 && local438 == local352 && local447 == local352) {
								Static337.aByteArrayArrayArray12[arg7][local15][local19] = (byte) (Static337.aByteArrayArrayArray12[arg7][local15][local19] | 0x4);
							}
						}
						@Pc(558) int local558 = 0;
						@Pc(560) int local560 = 0;
						if (arg2) {
							local558 = Static125.method2398(local15, local19);
							local560 = Static245.method4328(local15, local19);
						}
						arg4.method5415(local15, local19, local341, local338, local344, Static299.anIntArrayArray59[local39], Static338.anIntArrayArray65[local39], Static45.anIntArrayArray4[local39], local139, local142, local145, local148, local558, local560);
						Static148.method4534(arg7, local15, local19);
					}
				}
			}
		}
	}
}
