import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "Lclient!ko;")
	public static Class118 aClass118_7;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "Lclient!no;")
	public static final Class142 aClass142_12 = new Class142(128);

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public static int anInt6706 = 2;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_121 = new Class117("white:", "weiss:", "blanc:", "branco:");

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
	public static int anInt6707 = -50;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!uo;[[B[[BBLclient!ij;IZ[[III[[BLclient!ij;[[B)V")
	public static void method5669(@OriginalArg(0) Class129 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(4) Class77 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class77 arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(15) int local15 = 0; local15 < arg8; local15++) {
			for (@Pc(19) int local19 = 0; local19 < arg4; local19++) {
				if (Static283.method4712() || Static14.method210(Static141.anInt2602, local19, arg7, local15)) {
					@Pc(39) byte local39 = arg1[local15][local19];
					@Pc(45) byte local45 = arg11[local15][local19];
					@Pc(53) int local53 = arg2[local15][local19] & 0xFF;
					@Pc(61) int local61 = arg9[local15][local19] & 0xFF;
					@Pc(74) Class34 local74 = local53 == 0 ? null : Static59.method892(local53 - 1);
					@Pc(87) Class167 local87 = local61 == 0 ? null : Static8.method76(local61 - 1);
					@Pc(89) int local89 = 0;
					@Pc(91) int local91 = 0;
					if (local39 != 0) {
						local91 = local74 == null ? 0 : Static38.anIntArray51[local39];
						local89 = local87 == null ? 0 : Static22.anIntArray24[local39];
					} else if (local74 != null) {
						local91 = Static38.anIntArray51[local39];
					} else if (local87 != null) {
						local89 = Static38.anIntArray51[local39];
					}
					@Pc(129) int local129 = local89 + local91;
					@Pc(131) int local131 = 0;
					if (local129 != 0) {
						@Pc(136) int[] local136 = new int[local129];
						@Pc(139) int[] local139 = new int[local129];
						@Pc(142) int[] local142 = new int[local129];
						@Pc(145) int[] local145 = new int[local129];
						@Pc(147) boolean local147 = false;
						@Pc(164) int local164;
						@Pc(196) int local196;
						if (local74 == null || local74.anInt684 == -1 && local74.anInt689 == -1 && local74.anInt686 == -1) {
							for (local164 = 0; local164 < local91; local164++) {
								local136[local131] = -1;
								local131++;
							}
						} else {
							local164 = arg0.method4927() ? local74.anInt686 : local74.anInt690;
							if (!Static107.aBoolean127) {
								local164 = -1;
							}
							for (local196 = 0; local196 < local91; local196++) {
								local142[local131] = local164;
								local145[local131] = local74.anInt692;
								if (local74.anInt684 == -1) {
									local136[local131] = -1;
								} else {
									local136[local131] = local74.anInt684;
								}
								if (local74.anInt689 == -1) {
									local139[local131] = -1;
								} else {
									local147 = true;
									local139[local131] = local74.anInt689;
								}
								local131++;
							}
							if (!arg5 && arg7 == 0) {
								Static264.method4576(local15, local19, local74.anInt685, local74.anInt683 * 8);
							}
						}
						if (!local147) {
							local139 = null;
						}
						if (local87 == null) {
							for (local164 = 0; local164 < local89; local164++) {
								local136[local131] = -1;
								local131++;
							}
						} else {
							local164 = local87.anInt5188;
							if (!Static107.aBoolean127) {
								local164 = -1;
							}
							for (local196 = 0; local196 < local89; local196++) {
								local142[local131] = local164;
								local145[local131] = local87.anInt5195;
								local136[local131] = arg6[local15][local19];
								if (local139 != null) {
									local139[local131] = -1;
								}
								local131++;
							}
						}
						local164 = Static206.anIntArray326.length;
						@Pc(341) int[] local341 = arg5 ? new int[local164] : null;
						@Pc(344) int[] local344 = new int[local164];
						@Pc(347) int[] local347 = new int[local164];
						@Pc(355) int local355;
						@Pc(359) int local359;
						@Pc(446) int local446;
						@Pc(455) int local455;
						for (@Pc(349) int local349 = 0; local349 < local164; local349++) {
							local355 = Static206.anIntArray326[local349];
							local359 = Static7.anIntArray9[local349];
							if (local45 == 0) {
								local344[local349] = local355;
								local347[local349] = local359;
							} else if (local45 == 1) {
								local344[local349] = local359;
								local347[local349] = 128 - local355;
							} else if (local45 == 2) {
								local344[local349] = 128 - local355;
								local347[local349] = 128 - local359;
							} else if (local45 == 3) {
								local344[local349] = 128 - local359;
								local347[local349] = local355;
							}
							if (arg5 && Static286.aBooleanArrayArray7[local39][local349]) {
								local446 = (local15 << 7) + local344[local349];
								local455 = (local19 << 7) + local347[local349];
								local341[local349] = arg10.method4133(local446, local455) - arg3.method4133(local446, local455);
							}
						}
						local355 = arg3.method4122(local15, local19);
						local359 = arg3.method4122(local15 + 1, local19);
						local446 = arg3.method4122(local15 + 1, local19 + 1);
						local455 = arg3.method4122(local15, local19 + 1);
						if (arg7 > 0) {
							@Pc(510) boolean local510 = true;
							if (local61 == 0 && local39 != 0) {
								local510 = false;
							}
							if (local53 > 0 && local74 != null && !local74.aBoolean37) {
								local510 = false;
							}
							if (local510 && local355 == local359 && local355 == local446 && local355 == local455) {
								Static277.aByteArrayArrayArray11[arg7][local15][local19] = (byte) (Static277.aByteArrayArrayArray11[arg7][local15][local19] | 0x4);
							}
						}
						@Pc(564) int local564 = 0;
						@Pc(566) int local566 = 0;
						if (arg5) {
							local564 = Static164.method2606(local15, local19);
							local566 = Static197.method3595(local15, local19);
						}
						arg3.method4119(local15, local19, local344, local341, local347, Static278.anIntArrayArray74[local39], Static58.anIntArrayArray2[local39], Static309.anIntArrayArray72[local39], local136, local139, local142, local145, local564, local566);
						Static112.method1688(arg7, local15, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
	public static void method5671() {
		for (@Pc(8) int local8 = 0; local8 < Static1.aByteArrayArrayArray1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < Static1.aByteArrayArrayArray1[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static1.aByteArrayArrayArray1[0][0].length; local16++) {
					Static1.aByteArrayArrayArray1[local8][local12][local16] = 0;
				}
			}
		}
	}
}
