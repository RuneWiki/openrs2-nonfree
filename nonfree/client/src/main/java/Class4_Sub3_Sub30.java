import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class4_Sub3_Sub30 extends Class4_Sub3 {

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(B)V")
	@Override
	public void method3148() {
		if (this.anIntArrayArray26 == null) {
			this.method2445(1);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(24) int local24 = this.anIntArrayArray26.length;
			@Pc(30) int[] local30 = this.method3149(arg0, 0);
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[1];
			@Pc(42) int[] local42 = local16[2];
			@Pc(49) int local49;
			if (local24 <= 0) {
				for (local49 = 0; local49 < Static134.anInt3188; local49++) {
					local34[local49] = 0;
					local38[local49] = 0;
					local42[local49] = 0;
				}
			} else {
				for (local49 = 0; local49 < Static134.anInt3188; local49++) {
					@Pc(81) int local81 = local30[local49];
					@Pc(83) int local83 = 0;
					for (@Pc(85) int local85 = 0; local24 > local85 && this.anIntArrayArray26[local85][0] <= local81; local85++) {
						local83++;
					}
					@Pc(122) int[] local122;
					if (local83 >= local24) {
						local122 = this.anIntArrayArray26[local24 - 1];
						local34[local49] = local122[1];
						local38[local49] = local122[2];
						local42[local49] = local122[3];
					} else {
						local122 = this.anIntArrayArray26[local83];
						if (local83 > 0) {
							@Pc(159) int[] local159 = this.anIntArrayArray26[local83 - 1];
							@Pc(177) int local177 = (local81 - local159[0] << 12) / (local122[0] - local159[0]);
							@Pc(182) int local182 = 4096 - local177;
							local34[local49] = local182 * local159[1] + local177 * local122[1] >> 12;
							local38[local49] = local122[2] * local177 + local159[2] * local182 >> 12;
							local42[local49] = local182 * local159[3] + local122[3] * local177 >> 12;
						} else {
							local34[local49] = local122[1];
							local38[local49] = local122[2];
							local42[local49] = local122[3];
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(8) int local8 = arg1.method1253();
		if (local8 != 0) {
			this.method2445(local8);
			return;
		}
		this.anIntArrayArray26 = new int[arg1.method1253()][4];
		for (@Pc(28) int local28 = 0; local28 < this.anIntArrayArray26.length; local28++) {
			this.anIntArrayArray26[local28][0] = arg1.method1252();
			this.anIntArrayArray26[local28][1] = arg1.method1253() << 4;
			this.anIntArrayArray26[local28][2] = arg1.method1253() << 4;
			this.anIntArrayArray26[local28][3] = arg1.method1253() << 4;
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(II)V")
	private void method2445(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray26 = new int[2][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][0] = 4096;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray26 = new int[8][4];
			this.anIntArrayArray26[0][2] = 2602;
			this.anIntArrayArray26[1][2] = 1799;
			this.anIntArrayArray26[0][1] = 2650;
			this.anIntArrayArray26[0][3] = 2361;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][0] = 3072;
			this.anIntArrayArray26[1][1] = 2313;
			this.anIntArrayArray26[2][1] = 2618;
			this.anIntArrayArray26[3][1] = 2296;
			this.anIntArrayArray26[4][1] = 2072;
			this.anIntArrayArray26[2][2] = 1734;
			this.anIntArrayArray26[3][2] = 1220;
			this.anIntArrayArray26[3][0] = 3276;
			this.anIntArrayArray26[1][3] = 1558;
			this.anIntArrayArray26[5][1] = 2730;
			this.anIntArrayArray26[4][2] = 963;
			this.anIntArrayArray26[5][2] = 2152;
			this.anIntArrayArray26[6][1] = 2232;
			this.anIntArrayArray26[2][3] = 1413;
			this.anIntArrayArray26[3][3] = 947;
			this.anIntArrayArray26[4][3] = 722;
			this.anIntArrayArray26[5][3] = 1766;
			this.anIntArrayArray26[7][1] = 1686;
			this.anIntArrayArray26[6][2] = 1060;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[5][0] = 3686;
			this.anIntArrayArray26[6][3] = 915;
			this.anIntArrayArray26[6][0] = 3891;
			this.anIntArrayArray26[7][3] = 1140;
			this.anIntArrayArray26[7][2] = 1413;
			this.anIntArrayArray26[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray26 = new int[7][4];
			this.anIntArrayArray26[0][3] = 4096;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[1][0] = 663;
			this.anIntArrayArray26[1][3] = 4096;
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[2][0] = 1363;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][0] = 2048;
			this.anIntArrayArray26[4][0] = 2727;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[4][3] = 0;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[3][2] = 4096;
			this.anIntArrayArray26[4][1] = 4096;
			this.anIntArrayArray26[5][0] = 3411;
			this.anIntArrayArray26[6][3] = 4096;
			this.anIntArrayArray26[4][2] = 0;
			this.anIntArrayArray26[5][2] = 0;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[6][0] = 4096;
			this.anIntArrayArray26[6][1] = 0;
			this.anIntArrayArray26[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray26 = new int[6][4];
			this.anIntArrayArray26[0][2] = 0;
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[1][1] = 0;
			this.anIntArrayArray26[2][1] = 0;
			this.anIntArrayArray26[3][1] = 0;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[1][3] = 1493;
			this.anIntArrayArray26[1][2] = 0;
			this.anIntArrayArray26[2][2] = 0;
			this.anIntArrayArray26[2][3] = 2939;
			this.anIntArrayArray26[3][2] = 1124;
			this.anIntArrayArray26[3][3] = 3565;
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[4][2] = 3084;
			this.anIntArrayArray26[4][1] = 546;
			this.anIntArrayArray26[1][0] = 1843;
			this.anIntArrayArray26[4][3] = 4031;
			this.anIntArrayArray26[5][2] = 4096;
			this.anIntArrayArray26[5][3] = 4096;
			this.anIntArrayArray26[2][0] = 2457;
			this.anIntArrayArray26[5][1] = 4096;
			this.anIntArrayArray26[3][0] = 2781;
			this.anIntArrayArray26[4][0] = 3481;
			this.anIntArrayArray26[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray26 = new int[16][4];
			this.anIntArrayArray26[0][0] = 0;
			this.anIntArrayArray26[0][3] = 321;
			this.anIntArrayArray26[0][2] = 192;
			this.anIntArrayArray26[1][2] = 449;
			this.anIntArrayArray26[1][3] = 562;
			this.anIntArrayArray26[2][3] = 803;
			this.anIntArrayArray26[0][1] = 80;
			this.anIntArrayArray26[3][3] = 1140;
			this.anIntArrayArray26[4][3] = 1509;
			this.anIntArrayArray26[2][2] = 690;
			this.anIntArrayArray26[1][1] = 321;
			this.anIntArrayArray26[3][2] = 995;
			this.anIntArrayArray26[4][2] = 1397;
			this.anIntArrayArray26[5][3] = 1413;
			this.anIntArrayArray26[5][2] = 1429;
			this.anIntArrayArray26[1][0] = 155;
			this.anIntArrayArray26[2][0] = 389;
			this.anIntArrayArray26[3][0] = 671;
			this.anIntArrayArray26[2][1] = 578;
			this.anIntArrayArray26[4][0] = 897;
			this.anIntArrayArray26[5][0] = 1175;
			this.anIntArrayArray26[3][1] = 947;
			this.anIntArrayArray26[6][3] = 1333;
			this.anIntArrayArray26[6][0] = 1368;
			this.anIntArrayArray26[4][1] = 1285;
			this.anIntArrayArray26[7][0] = 1507;
			this.anIntArrayArray26[8][0] = 1736;
			this.anIntArrayArray26[5][1] = 1525;
			this.anIntArrayArray26[6][1] = 1734;
			this.anIntArrayArray26[7][3] = 1702;
			this.anIntArrayArray26[6][2] = 1461;
			this.anIntArrayArray26[8][3] = 2056;
			this.anIntArrayArray26[9][0] = 2088;
			this.anIntArrayArray26[9][3] = 2666;
			this.anIntArrayArray26[10][3] = 3276;
			this.anIntArrayArray26[7][2] = 1525;
			this.anIntArrayArray26[11][3] = 3228;
			this.anIntArrayArray26[8][2] = 1590;
			this.anIntArrayArray26[7][1] = 1413;
			this.anIntArrayArray26[9][2] = 2056;
			this.anIntArrayArray26[8][1] = 1108;
			this.anIntArrayArray26[12][3] = 3196;
			this.anIntArrayArray26[10][2] = 2586;
			this.anIntArrayArray26[13][3] = 3019;
			this.anIntArrayArray26[14][3] = 3228;
			this.anIntArrayArray26[10][0] = 2355;
			this.anIntArrayArray26[11][0] = 2691;
			this.anIntArrayArray26[12][0] = 3031;
			this.anIntArrayArray26[11][2] = 3148;
			this.anIntArrayArray26[12][2] = 3710;
			this.anIntArrayArray26[15][3] = 2746;
			this.anIntArrayArray26[13][0] = 3522;
			this.anIntArrayArray26[14][0] = 3727;
			this.anIntArrayArray26[9][1] = 1766;
			this.anIntArrayArray26[15][0] = 4096;
			this.anIntArrayArray26[10][1] = 2409;
			this.anIntArrayArray26[11][1] = 3116;
			this.anIntArrayArray26[12][1] = 3806;
			this.anIntArrayArray26[13][1] = 3437;
			this.anIntArrayArray26[13][2] = 3421;
			this.anIntArrayArray26[14][2] = 3148;
			this.anIntArrayArray26[14][1] = 3116;
			this.anIntArrayArray26[15][1] = 2377;
			this.anIntArrayArray26[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray26 = new int[4][4];
			this.anIntArrayArray26[0][1] = 0;
			this.anIntArrayArray26[0][2] = 4096;
			this.anIntArrayArray26[1][1] = 4096;
			this.anIntArrayArray26[0][3] = 0;
			this.anIntArrayArray26[2][1] = 4096;
			this.anIntArrayArray26[1][3] = 0;
			this.anIntArrayArray26[1][2] = 4096;
			this.anIntArrayArray26[2][2] = 4096;
			this.anIntArrayArray26[3][2] = 0;
			this.anIntArrayArray26[0][0] = 2048;
			this.anIntArrayArray26[2][3] = 0;
			this.anIntArrayArray26[3][3] = 0;
			this.anIntArrayArray26[3][1] = 4096;
			this.anIntArrayArray26[1][0] = 2867;
			this.anIntArrayArray26[2][0] = 3276;
			this.anIntArrayArray26[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
