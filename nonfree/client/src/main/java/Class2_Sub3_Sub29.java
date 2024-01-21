import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!rh", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		if (this.anIntArrayArray32 == null) {
			this.method2422(1);
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
	private void method2422(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray32 = new int[2][4];
			this.anIntArrayArray32[0][0] = 0;
			this.anIntArrayArray32[0][1] = 0;
			this.anIntArrayArray32[0][2] = 0;
			this.anIntArrayArray32[0][3] = 0;
			this.anIntArrayArray32[1][3] = 4096;
			this.anIntArrayArray32[1][1] = 4096;
			this.anIntArrayArray32[1][0] = 4096;
			this.anIntArrayArray32[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray32 = new int[8][4];
			this.anIntArrayArray32[0][1] = 2650;
			this.anIntArrayArray32[0][3] = 2361;
			this.anIntArrayArray32[1][3] = 1558;
			this.anIntArrayArray32[2][3] = 1413;
			this.anIntArrayArray32[1][1] = 2313;
			this.anIntArrayArray32[0][0] = 0;
			this.anIntArrayArray32[1][0] = 2867;
			this.anIntArrayArray32[2][1] = 2618;
			this.anIntArrayArray32[2][0] = 3072;
			this.anIntArrayArray32[3][3] = 947;
			this.anIntArrayArray32[3][1] = 2296;
			this.anIntArrayArray32[4][3] = 722;
			this.anIntArrayArray32[3][0] = 3276;
			this.anIntArrayArray32[4][0] = 3481;
			this.anIntArrayArray32[4][1] = 2072;
			this.anIntArrayArray32[5][0] = 3686;
			this.anIntArrayArray32[5][3] = 1766;
			this.anIntArrayArray32[6][3] = 915;
			this.anIntArrayArray32[0][2] = 2602;
			this.anIntArrayArray32[1][2] = 1799;
			this.anIntArrayArray32[6][0] = 3891;
			this.anIntArrayArray32[7][3] = 1140;
			this.anIntArrayArray32[2][2] = 1734;
			this.anIntArrayArray32[3][2] = 1220;
			this.anIntArrayArray32[5][1] = 2730;
			this.anIntArrayArray32[7][0] = 4096;
			this.anIntArrayArray32[6][1] = 2232;
			this.anIntArrayArray32[7][1] = 1686;
			this.anIntArrayArray32[4][2] = 963;
			this.anIntArrayArray32[5][2] = 2152;
			this.anIntArrayArray32[6][2] = 1060;
			this.anIntArrayArray32[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray32 = new int[7][4];
			this.anIntArrayArray32[0][3] = 4096;
			this.anIntArrayArray32[0][1] = 0;
			this.anIntArrayArray32[0][0] = 0;
			this.anIntArrayArray32[1][1] = 0;
			this.anIntArrayArray32[2][1] = 0;
			this.anIntArrayArray32[1][3] = 4096;
			this.anIntArrayArray32[2][3] = 0;
			this.anIntArrayArray32[0][2] = 0;
			this.anIntArrayArray32[3][3] = 0;
			this.anIntArrayArray32[3][1] = 4096;
			this.anIntArrayArray32[4][3] = 0;
			this.anIntArrayArray32[4][1] = 4096;
			this.anIntArrayArray32[1][0] = 663;
			this.anIntArrayArray32[5][3] = 4096;
			this.anIntArrayArray32[5][1] = 4096;
			this.anIntArrayArray32[1][2] = 4096;
			this.anIntArrayArray32[6][3] = 4096;
			this.anIntArrayArray32[2][2] = 4096;
			this.anIntArrayArray32[6][1] = 0;
			this.anIntArrayArray32[3][2] = 4096;
			this.anIntArrayArray32[4][2] = 0;
			this.anIntArrayArray32[2][0] = 1363;
			this.anIntArrayArray32[5][2] = 0;
			this.anIntArrayArray32[6][2] = 0;
			this.anIntArrayArray32[3][0] = 2048;
			this.anIntArrayArray32[4][0] = 2727;
			this.anIntArrayArray32[5][0] = 3411;
			this.anIntArrayArray32[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray32 = new int[6][4];
			this.anIntArrayArray32[0][2] = 0;
			this.anIntArrayArray32[0][3] = 0;
			this.anIntArrayArray32[0][0] = 0;
			this.anIntArrayArray32[1][0] = 1843;
			this.anIntArrayArray32[2][0] = 2457;
			this.anIntArrayArray32[0][1] = 0;
			this.anIntArrayArray32[1][2] = 0;
			this.anIntArrayArray32[1][1] = 0;
			this.anIntArrayArray32[2][1] = 0;
			this.anIntArrayArray32[3][0] = 2781;
			this.anIntArrayArray32[4][0] = 3481;
			this.anIntArrayArray32[2][2] = 0;
			this.anIntArrayArray32[3][2] = 1124;
			this.anIntArrayArray32[5][0] = 4096;
			this.anIntArrayArray32[1][3] = 1493;
			this.anIntArrayArray32[2][3] = 2939;
			this.anIntArrayArray32[4][2] = 3084;
			this.anIntArrayArray32[5][2] = 4096;
			this.anIntArrayArray32[3][1] = 0;
			this.anIntArrayArray32[4][1] = 546;
			this.anIntArrayArray32[3][3] = 3565;
			this.anIntArrayArray32[5][1] = 4096;
			this.anIntArrayArray32[4][3] = 4031;
			this.anIntArrayArray32[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray32 = new int[16][4];
			this.anIntArrayArray32[0][1] = 80;
			this.anIntArrayArray32[0][3] = 321;
			this.anIntArrayArray32[1][1] = 321;
			this.anIntArrayArray32[1][3] = 562;
			this.anIntArrayArray32[2][1] = 578;
			this.anIntArrayArray32[3][1] = 947;
			this.anIntArrayArray32[0][0] = 0;
			this.anIntArrayArray32[1][0] = 155;
			this.anIntArrayArray32[2][0] = 389;
			this.anIntArrayArray32[4][1] = 1285;
			this.anIntArrayArray32[0][2] = 192;
			this.anIntArrayArray32[5][1] = 1525;
			this.anIntArrayArray32[1][2] = 449;
			this.anIntArrayArray32[2][3] = 803;
			this.anIntArrayArray32[2][2] = 690;
			this.anIntArrayArray32[3][0] = 671;
			this.anIntArrayArray32[3][2] = 995;
			this.anIntArrayArray32[4][0] = 897;
			this.anIntArrayArray32[4][2] = 1397;
			this.anIntArrayArray32[6][1] = 1734;
			this.anIntArrayArray32[5][0] = 1175;
			this.anIntArrayArray32[7][1] = 1413;
			this.anIntArrayArray32[3][3] = 1140;
			this.anIntArrayArray32[4][3] = 1509;
			this.anIntArrayArray32[8][1] = 1108;
			this.anIntArrayArray32[5][3] = 1413;
			this.anIntArrayArray32[6][0] = 1368;
			this.anIntArrayArray32[6][3] = 1333;
			this.anIntArrayArray32[9][1] = 1766;
			this.anIntArrayArray32[5][2] = 1429;
			this.anIntArrayArray32[10][1] = 2409;
			this.anIntArrayArray32[7][0] = 1507;
			this.anIntArrayArray32[11][1] = 3116;
			this.anIntArrayArray32[12][1] = 3806;
			this.anIntArrayArray32[13][1] = 3437;
			this.anIntArrayArray32[6][2] = 1461;
			this.anIntArrayArray32[7][2] = 1525;
			this.anIntArrayArray32[8][0] = 1736;
			this.anIntArrayArray32[9][0] = 2088;
			this.anIntArrayArray32[7][3] = 1702;
			this.anIntArrayArray32[8][3] = 2056;
			this.anIntArrayArray32[8][2] = 1590;
			this.anIntArrayArray32[10][0] = 2355;
			this.anIntArrayArray32[14][1] = 3116;
			this.anIntArrayArray32[9][3] = 2666;
			this.anIntArrayArray32[15][1] = 2377;
			this.anIntArrayArray32[9][2] = 2056;
			this.anIntArrayArray32[11][0] = 2691;
			this.anIntArrayArray32[12][0] = 3031;
			this.anIntArrayArray32[10][2] = 2586;
			this.anIntArrayArray32[11][2] = 3148;
			this.anIntArrayArray32[12][2] = 3710;
			this.anIntArrayArray32[10][3] = 3276;
			this.anIntArrayArray32[13][0] = 3522;
			this.anIntArrayArray32[13][2] = 3421;
			this.anIntArrayArray32[14][2] = 3148;
			this.anIntArrayArray32[15][2] = 2505;
			this.anIntArrayArray32[11][3] = 3228;
			this.anIntArrayArray32[14][0] = 3727;
			this.anIntArrayArray32[12][3] = 3196;
			this.anIntArrayArray32[15][0] = 4096;
			this.anIntArrayArray32[13][3] = 3019;
			this.anIntArrayArray32[14][3] = 3228;
			this.anIntArrayArray32[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray32 = new int[4][4];
			this.anIntArrayArray32[0][1] = 0;
			this.anIntArrayArray32[0][2] = 4096;
			this.anIntArrayArray32[0][3] = 0;
			this.anIntArrayArray32[1][2] = 4096;
			this.anIntArrayArray32[0][0] = 2048;
			this.anIntArrayArray32[1][0] = 2867;
			this.anIntArrayArray32[2][2] = 4096;
			this.anIntArrayArray32[1][1] = 4096;
			this.anIntArrayArray32[2][1] = 4096;
			this.anIntArrayArray32[3][1] = 4096;
			this.anIntArrayArray32[1][3] = 0;
			this.anIntArrayArray32[2][0] = 3276;
			this.anIntArrayArray32[3][2] = 0;
			this.anIntArrayArray32[3][0] = 4096;
			this.anIntArrayArray32[2][3] = 0;
			this.anIntArrayArray32[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3023(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass43_41.method1439(arg0);
		if (super.aClass43_41.aBoolean77) {
			@Pc(27) int local27 = this.anIntArrayArray32.length;
			@Pc(33) int[] local33 = this.method3011(arg0, 0);
			@Pc(37) int[] local37 = local19[1];
			@Pc(41) int[] local41 = local19[0];
			@Pc(45) int[] local45 = local19[2];
			@Pc(49) int local49;
			if (local27 <= 0) {
				for (local49 = 0; local49 < Static53.anInt1184; local49++) {
					local41[local49] = 0;
					local37[local49] = 0;
					local45[local49] = 0;
				}
			} else {
				for (local49 = 0; local49 < Static53.anInt1184; local49++) {
					@Pc(75) int local75 = 0;
					@Pc(79) int local79 = local33[local49];
					for (@Pc(81) int local81 = 0; local27 > local81 && local79 >= this.anIntArrayArray32[local81][0]; local81++) {
						local75++;
					}
					@Pc(108) int[] local108;
					if (local27 > local75) {
						local108 = this.anIntArrayArray32[local75];
						if (local75 <= 0) {
							local41[local49] = local108[1];
							local37[local49] = local108[2];
							local45[local49] = local108[3];
						} else {
							@Pc(137) int[] local137 = this.anIntArrayArray32[local75 - 1];
							@Pc(154) int local154 = (local79 - local137[0] << 12) / (local108[0] - local137[0]);
							@Pc(159) int local159 = 4096 - local154;
							local41[local49] = local159 * local137[1] + local108[1] * local154 >> 12;
							local37[local49] = local137[2] * local159 + local154 * local108[2] >> 12;
							local45[local49] = local154 * local108[3] + local159 * local137[3] >> 12;
						}
					} else {
						local108 = this.anIntArrayArray32[local27 - 1];
						local41[local49] = local108[1];
						local37[local49] = local108[2];
						local45[local49] = local108[3];
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(11) int local11 = arg1.method2962();
		if (local11 != 0) {
			this.method2422(local11);
			return;
		}
		this.anIntArrayArray32 = new int[arg1.method2962()][4];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArrayArray32.length; local25++) {
			this.anIntArrayArray32[local25][0] = arg1.method2933();
			this.anIntArrayArray32[local25][1] = arg1.method2962() << 4;
			this.anIntArrayArray32[local25][2] = arg1.method2962() << 4;
			this.anIntArrayArray32[local25][3] = arg1.method2962() << 4;
		}
	}
}
