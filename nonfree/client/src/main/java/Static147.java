import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!km", name = "p", descriptor = "Lclient!ag;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!km", name = "g", descriptor = "Lclient!th;")
	public static Class169 aClass169_84 = new Class169(32);

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	public static void method2364() {
		Static88.aClass169_57.method4018();
		Static267.aClass169_139.method4018();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!sb;I)V")
	public static void method2365(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(9) byte[] local9 = new byte[24];
		if (Static2.aClass187_1 != null) {
			try {
				Static2.aClass187_1.method4487(0L);
				Static2.aClass187_1.method4486(local9);
				@Pc(27) int local27;
				for (local27 = 0; local27 < 24 && local9[local27] == 0; local27++) {
				}
				if (local27 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(46) Exception local46) {
				for (@Pc(48) int local48 = 0; local48 < 24; local48++) {
					local9[local48] = -1;
				}
			}
		}
		arg0.method2625(24, local9);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)I")
	public static int method2366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local3 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local3 * arg1;
		} else {
			return local3;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!qf;)I")
	public static int method2367(@OriginalArg(0) int arg0, @OriginalArg(2) Class146 arg1) {
		if (arg1.anIntArrayArray30 == null || arg1.anIntArrayArray30.length <= arg0) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg1.anIntArrayArray30[arg0];
			@Pc(32) int local32 = 0;
			@Pc(34) int local34 = 0;
			@Pc(36) byte local36 = 0;
			while (true) {
				@Pc(41) int local41 = local25[local32++];
				@Pc(43) int local43 = 0;
				@Pc(45) byte local45 = 0;
				if (local41 == 0) {
					return local34;
				}
				if (local41 == 1) {
					local43 = Static217.anIntArray342[local25[local32++]];
				}
				if (local41 == 2) {
					local43 = Static97.anIntArray146[local25[local32++]];
				}
				if (local41 == 15) {
					local45 = 1;
				}
				if (local41 == 16) {
					local45 = 2;
				}
				if (local41 == 17) {
					local45 = 3;
				}
				if (local41 == 3) {
					local43 = Static31.anIntArray48[local25[local32++]];
				}
				@Pc(115) int local115;
				@Pc(126) Class146 local126;
				@Pc(131) int local131;
				@Pc(144) int local144;
				if (local41 == 4) {
					local115 = local25[local32++] << 16;
					@Pc(122) int local122 = local115 + local25[local32++];
					local126 = Static259.method3908(local122);
					local131 = local25[local32++];
					if (local131 != -1 && (!Static271.method4006(local131).aBoolean343 || Static235.aBoolean341)) {
						for (local144 = 0; local144 < local126.anIntArray358.length; local144++) {
							if (local131 + 1 == local126.anIntArray358[local144]) {
								local43 += local126.anIntArray353[local144];
							}
						}
					}
				}
				if (local41 == 5) {
					local43 = Static46.anIntArray78[local25[local32++]];
				}
				if (local41 == 6) {
					local43 = Class1_Sub1_Sub23.anIntArray492[Static97.anIntArray146[local25[local32++]] - 1];
				}
				if (local41 == 7) {
					local43 = Static46.anIntArray78[local25[local32++]] * 100 / 46875;
				}
				if (local41 == 8) {
					local43 = Static229.aClass22_Sub3_Sub2_2.anInt4674;
				}
				if (local41 == 9) {
					for (local115 = 0; local115 < 25; local115++) {
						if (Static220.aBooleanArray66[local115]) {
							local43 += Static97.anIntArray146[local115];
						}
					}
				}
				if (local41 == 10) {
					local115 = local25[local32++] << 16;
					local115 += local25[local32++];
					local126 = Static259.method3908(local115);
					local131 = local25[local32++];
					if (local131 != -1 && (!Static271.method4006(local131).aBoolean343 || Static235.aBoolean341)) {
						for (local144 = 0; local144 < local126.anIntArray358.length; local144++) {
							if (local131 + 1 == local126.anIntArray358[local144]) {
								local43 = 999999999;
								break;
							}
						}
					}
				}
				if (local41 == 11) {
					local43 = Static54.anInt1049;
				}
				if (local41 == 12) {
					local43 = Static224.anInt4401;
				}
				if (local41 == 13) {
					local115 = Static46.anIntArray78[local25[local32++]];
					@Pc(331) int local331 = local25[local32++];
					local43 = (0x1 << local331 & local115) == 0 ? 0 : 1;
				}
				if (local41 == 14) {
					local115 = local25[local32++];
					local43 = Static298.method4459(local115);
				}
				if (local41 == 18) {
					local43 = (Static229.aClass22_Sub3_Sub2_2.anInt4601 >> 7) + Static290.anInt5497;
				}
				if (local41 == 19) {
					local43 = (Static229.aClass22_Sub3_Sub2_2.anInt4623 >> 7) + Static118.anInt2409;
				}
				if (local41 == 20) {
					local43 = local25[local32++];
				}
				if (local45 == 0) {
					if (local36 == 0) {
						local34 += local43;
					}
					if (local36 == 1) {
						local34 -= local43;
					}
					if (local36 == 2 && local43 != 0) {
						local34 /= local43;
					}
					if (local36 == 3) {
						local34 *= local43;
					}
					local36 = 0;
				} else {
					local36 = local45;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}
}
