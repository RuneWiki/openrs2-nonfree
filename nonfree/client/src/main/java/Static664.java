import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!wja", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_111 = new Class187(81, 8);

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(III)Lclient!bq;")
	public static Class41_Sub1_Sub2 method8675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class313 local7 = Static129.aClass313ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class41_Sub1_Sub2 local14 = local7.aClass41_Sub1_Sub2_1;
			local7.aClass41_Sub1_Sub2_1 = null;
			Static65.method949(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(Lclient!bg;I[[B)V")
	public static void method8677(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(43) int local43;
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt566; local14++) {
			Static491.method7177();
			for (local20 = 0; local20 < Static124.anInt2150 >> 3; local20++) {
				for (local24 = 0; local24 < Static64.anInt1015 >> 3; local24++) {
					local34 = Static301.anIntArrayArrayArray5[local14][local20][local24];
					if (local34 != -1) {
						local43 = local34 >> 24 & 0x3;
						if (!arg0.aBoolean26 || local43 == 0) {
							@Pc(54) int local54 = local34 >> 1 & 0x3;
							@Pc(60) int local60 = local34 >> 14 & 0x3FF;
							@Pc(66) int local66 = local34 >> 3 & 0x7FF;
							@Pc(76) int local76 = (local60 / 8 << 8) + local66 / 8;
							for (@Pc(78) int local78 = 0; local78 < Static249.anIntArray245.length; local78++) {
								if (local76 == Static249.anIntArray245[local78] && arg1[local78] != null) {
									@Pc(100) Class5_Sub15 local100 = new Class5_Sub15(arg1[local78]);
									arg0.method526(local54, local20 * 8, local100, local14, Static137.aClass234Array1, local43, local24 * 8, local66, local60);
									arg0.method540(local20 * 8, local66, local54, local60, local12[0] == -1 ? local12 : null, local100, local14, Static563.aClass143_13, local24 * 8, local43);
									break;
								}
							}
						}
					}
				}
			}
		}
		for (local20 = 0; local20 < arg0.anInt566; local20++) {
			Static491.method7177();
			for (local24 = 0; local24 < Static124.anInt2150 >> 3; local24++) {
				for (local34 = 0; local34 < Static64.anInt1015 >> 3; local34++) {
					local43 = Static301.anIntArrayArrayArray5[local20][local24][local34];
					if (local43 == -1) {
						arg0.method532(local20, local34 * 8, 8, local24 * 8, 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static366.aClass116_2 = Static117.aClass64_1.method1294(local12[0], local12[3], local12[2], Static1.aClass286_5, local12[1]);
			Static635.anInt10119 = local12[4];
		}
	}
}
