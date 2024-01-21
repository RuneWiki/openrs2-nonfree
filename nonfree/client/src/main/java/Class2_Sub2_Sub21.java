import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class2_Sub2_Sub21 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)V")
	private void method1624(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray25 = new int[2][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[1][0] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray25 = new int[8][4];
			this.anIntArrayArray25[0][3] = 2361;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][1] = 2650;
			this.anIntArrayArray25[1][3] = 1558;
			this.anIntArrayArray25[2][3] = 1413;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[0][2] = 2602;
			this.anIntArrayArray25[1][1] = 2313;
			this.anIntArrayArray25[1][2] = 1799;
			this.anIntArrayArray25[2][1] = 2618;
			this.anIntArrayArray25[3][3] = 947;
			this.anIntArrayArray25[2][2] = 1734;
			this.anIntArrayArray25[3][1] = 2296;
			this.anIntArrayArray25[3][2] = 1220;
			this.anIntArrayArray25[4][2] = 963;
			this.anIntArrayArray25[4][3] = 722;
			this.anIntArrayArray25[4][1] = 2072;
			this.anIntArrayArray25[5][1] = 2730;
			this.anIntArrayArray25[5][2] = 2152;
			this.anIntArrayArray25[2][0] = 3072;
			this.anIntArrayArray25[6][1] = 2232;
			this.anIntArrayArray25[7][1] = 1686;
			this.anIntArrayArray25[3][0] = 3276;
			this.anIntArrayArray25[6][2] = 1060;
			this.anIntArrayArray25[7][2] = 1413;
			this.anIntArrayArray25[5][3] = 1766;
			this.anIntArrayArray25[6][3] = 915;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[7][3] = 1140;
			this.anIntArrayArray25[5][0] = 3686;
			this.anIntArrayArray25[6][0] = 3891;
			this.anIntArrayArray25[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray25 = new int[7][4];
			this.anIntArrayArray25[0][3] = 4096;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[1][0] = 663;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[2][0] = 1363;
			this.anIntArrayArray25[3][2] = 4096;
			this.anIntArrayArray25[4][2] = 0;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[5][2] = 0;
			this.anIntArrayArray25[4][1] = 4096;
			this.anIntArrayArray25[6][2] = 0;
			this.anIntArrayArray25[3][0] = 2048;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[4][3] = 0;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[4][0] = 2727;
			this.anIntArrayArray25[6][3] = 4096;
			this.anIntArrayArray25[6][1] = 0;
			this.anIntArrayArray25[5][0] = 3411;
			this.anIntArrayArray25[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray25 = new int[6][4];
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][3] = 1493;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[2][3] = 2939;
			this.anIntArrayArray25[3][3] = 3565;
			this.anIntArrayArray25[1][0] = 1843;
			this.anIntArrayArray25[2][0] = 2457;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[4][3] = 4031;
			this.anIntArrayArray25[3][0] = 2781;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[3][1] = 0;
			this.anIntArrayArray25[4][1] = 546;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[1][2] = 0;
			this.anIntArrayArray25[2][2] = 0;
			this.anIntArrayArray25[5][0] = 4096;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[3][2] = 1124;
			this.anIntArrayArray25[4][2] = 3084;
			this.anIntArrayArray25[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray25 = new int[16][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][1] = 80;
			this.anIntArrayArray25[0][3] = 321;
			this.anIntArrayArray25[1][1] = 321;
			this.anIntArrayArray25[2][1] = 578;
			this.anIntArrayArray25[1][3] = 562;
			this.anIntArrayArray25[3][1] = 947;
			this.anIntArrayArray25[1][0] = 155;
			this.anIntArrayArray25[2][3] = 803;
			this.anIntArrayArray25[2][0] = 389;
			this.anIntArrayArray25[4][1] = 1285;
			this.anIntArrayArray25[0][2] = 192;
			this.anIntArrayArray25[3][3] = 1140;
			this.anIntArrayArray25[1][2] = 449;
			this.anIntArrayArray25[4][3] = 1509;
			this.anIntArrayArray25[2][2] = 690;
			this.anIntArrayArray25[3][2] = 995;
			this.anIntArrayArray25[4][2] = 1397;
			this.anIntArrayArray25[3][0] = 671;
			this.anIntArrayArray25[5][2] = 1429;
			this.anIntArrayArray25[4][0] = 897;
			this.anIntArrayArray25[5][1] = 1525;
			this.anIntArrayArray25[6][1] = 1734;
			this.anIntArrayArray25[5][3] = 1413;
			this.anIntArrayArray25[7][1] = 1413;
			this.anIntArrayArray25[8][1] = 1108;
			this.anIntArrayArray25[6][3] = 1333;
			this.anIntArrayArray25[7][3] = 1702;
			this.anIntArrayArray25[5][0] = 1175;
			this.anIntArrayArray25[9][1] = 1766;
			this.anIntArrayArray25[6][2] = 1461;
			this.anIntArrayArray25[10][1] = 2409;
			this.anIntArrayArray25[7][2] = 1525;
			this.anIntArrayArray25[6][0] = 1368;
			this.anIntArrayArray25[8][2] = 1590;
			this.anIntArrayArray25[8][3] = 2056;
			this.anIntArrayArray25[11][1] = 3116;
			this.anIntArrayArray25[9][2] = 2056;
			this.anIntArrayArray25[9][3] = 2666;
			this.anIntArrayArray25[12][1] = 3806;
			this.anIntArrayArray25[13][1] = 3437;
			this.anIntArrayArray25[14][1] = 3116;
			this.anIntArrayArray25[10][3] = 3276;
			this.anIntArrayArray25[15][1] = 2377;
			this.anIntArrayArray25[10][2] = 2586;
			this.anIntArrayArray25[7][0] = 1507;
			this.anIntArrayArray25[11][2] = 3148;
			this.anIntArrayArray25[8][0] = 1736;
			this.anIntArrayArray25[12][2] = 3710;
			this.anIntArrayArray25[11][3] = 3228;
			this.anIntArrayArray25[12][3] = 3196;
			this.anIntArrayArray25[13][2] = 3421;
			this.anIntArrayArray25[13][3] = 3019;
			this.anIntArrayArray25[14][3] = 3228;
			this.anIntArrayArray25[9][0] = 2088;
			this.anIntArrayArray25[15][3] = 2746;
			this.anIntArrayArray25[14][2] = 3148;
			this.anIntArrayArray25[15][2] = 2505;
			this.anIntArrayArray25[10][0] = 2355;
			this.anIntArrayArray25[11][0] = 2691;
			this.anIntArrayArray25[12][0] = 3031;
			this.anIntArrayArray25[13][0] = 3522;
			this.anIntArrayArray25[14][0] = 3727;
			this.anIntArrayArray25[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray25 = new int[4][4];
			this.anIntArrayArray25[0][2] = 4096;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][0] = 2048;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 0;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[2][0] = 3276;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[3][2] = 0;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[2][1] = 4096;
			this.anIntArrayArray25[3][0] = 4096;
			this.anIntArrayArray25[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(22) int local22 = arg1.method1461();
		if (local22 != 0) {
			this.method1624(local22);
			return;
		}
		this.anIntArrayArray25 = new int[arg1.method1461()][4];
		for (@Pc(41) int local41 = 0; local41 < this.anIntArrayArray25.length; local41++) {
			this.anIntArrayArray25[local41][0] = arg1.method1456();
			this.anIntArrayArray25[local41][1] = arg1.method1461() << 4;
			this.anIntArrayArray25[local41][2] = arg1.method1461() << 4;
			this.anIntArrayArray25[local41][3] = arg1.method1461() << 4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		if (this.anIntArrayArray25 == null) {
			this.method1624(1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2579(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass62_38.method1904(arg0);
		if (super.aClass62_38.aBoolean118) {
			@Pc(29) int local29 = this.anIntArrayArray25.length;
			@Pc(35) int[] local35 = this.method2573(arg0, 0);
			@Pc(39) int[] local39 = local21[0];
			@Pc(43) int[] local43 = local21[1];
			@Pc(47) int[] local47 = local21[2];
			@Pc(54) int local54;
			if (local29 <= 0) {
				for (local54 = 0; local54 < Static149.anInt3233; local54++) {
					local39[local54] = 0;
					local43[local54] = 0;
					local47[local54] = 0;
				}
			} else {
				for (local54 = 0; local54 < Static149.anInt3233; local54++) {
					@Pc(86) int local86 = local35[local54];
					@Pc(88) int local88 = 0;
					for (@Pc(90) int local90 = 0; local90 < local29 && this.anIntArrayArray25[local90][0] <= local86; local90++) {
						local88++;
					}
					@Pc(119) int[] local119;
					if (local29 <= local88) {
						local119 = this.anIntArrayArray25[local29 - 1];
						local39[local54] = local119[1];
						local43[local54] = local119[2];
						local47[local54] = local119[3];
					} else {
						local119 = this.anIntArrayArray25[local88];
						if (local88 > 0) {
							@Pc(153) int[] local153 = this.anIntArrayArray25[local88 - 1];
							@Pc(170) int local170 = (local86 - local153[0] << 12) / (local119[0] - local153[0]);
							@Pc(175) int local175 = 4096 - local170;
							local39[local54] = local170 * local119[1] + local175 * local153[1] >> 12;
							local43[local54] = local119[2] * local170 + local153[2] * local175 >> 12;
							local47[local54] = local153[3] * local175 + local119[3] * local170 >> 12;
						} else {
							local39[local54] = local119[1];
							local43[local54] = local119[2];
							local47[local54] = local119[3];
						}
					}
				}
			}
		}
		return local21;
	}
}
