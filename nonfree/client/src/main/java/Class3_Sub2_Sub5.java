import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class3_Sub2_Sub5 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ec", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(ZI)V")
	private void method685(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray5 = new int[2][4];
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[1][0] = 4096;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray5 = new int[8][4];
			this.anIntArrayArray5[0][1] = 2650;
			this.anIntArrayArray5[0][3] = 2361;
			this.anIntArrayArray5[1][3] = 1558;
			this.anIntArrayArray5[2][3] = 1413;
			this.anIntArrayArray5[1][1] = 2313;
			this.anIntArrayArray5[3][3] = 947;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 2602;
			this.anIntArrayArray5[4][3] = 722;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[2][0] = 3072;
			this.anIntArrayArray5[2][1] = 2618;
			this.anIntArrayArray5[3][1] = 2296;
			this.anIntArrayArray5[4][1] = 2072;
			this.anIntArrayArray5[3][0] = 3276;
			this.anIntArrayArray5[1][2] = 1799;
			this.anIntArrayArray5[2][2] = 1734;
			this.anIntArrayArray5[3][2] = 1220;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[5][1] = 2730;
			this.anIntArrayArray5[6][1] = 2232;
			this.anIntArrayArray5[5][3] = 1766;
			this.anIntArrayArray5[6][3] = 915;
			this.anIntArrayArray5[4][2] = 963;
			this.anIntArrayArray5[7][3] = 1140;
			this.anIntArrayArray5[5][2] = 2152;
			this.anIntArrayArray5[5][0] = 3686;
			this.anIntArrayArray5[6][2] = 1060;
			this.anIntArrayArray5[7][1] = 1686;
			this.anIntArrayArray5[6][0] = 3891;
			this.anIntArrayArray5[7][0] = 4096;
			this.anIntArrayArray5[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray5 = new int[7][4];
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][3] = 4096;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][0] = 663;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[3][2] = 4096;
			this.anIntArrayArray5[2][0] = 1363;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[4][2] = 0;
			this.anIntArrayArray5[1][3] = 4096;
			this.anIntArrayArray5[4][1] = 4096;
			this.anIntArrayArray5[5][2] = 0;
			this.anIntArrayArray5[6][2] = 0;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[3][0] = 2048;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[4][3] = 0;
			this.anIntArrayArray5[4][0] = 2727;
			this.anIntArrayArray5[6][1] = 0;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[5][0] = 3411;
			this.anIntArrayArray5[6][0] = 4096;
			this.anIntArrayArray5[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray5 = new int[6][4];
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[0][2] = 0;
			this.anIntArrayArray5[1][0] = 1843;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[2][0] = 2457;
			this.anIntArrayArray5[3][0] = 2781;
			this.anIntArrayArray5[4][0] = 3481;
			this.anIntArrayArray5[5][0] = 4096;
			this.anIntArrayArray5[1][1] = 0;
			this.anIntArrayArray5[1][2] = 0;
			this.anIntArrayArray5[2][1] = 0;
			this.anIntArrayArray5[3][1] = 0;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][3] = 1493;
			this.anIntArrayArray5[4][1] = 546;
			this.anIntArrayArray5[2][2] = 0;
			this.anIntArrayArray5[5][1] = 4096;
			this.anIntArrayArray5[2][3] = 2939;
			this.anIntArrayArray5[3][2] = 1124;
			this.anIntArrayArray5[3][3] = 3565;
			this.anIntArrayArray5[4][3] = 4031;
			this.anIntArrayArray5[5][3] = 4096;
			this.anIntArrayArray5[4][2] = 3084;
			this.anIntArrayArray5[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray5 = new int[16][4];
			this.anIntArrayArray5[0][1] = 80;
			this.anIntArrayArray5[0][0] = 0;
			this.anIntArrayArray5[1][0] = 155;
			this.anIntArrayArray5[1][1] = 321;
			this.anIntArrayArray5[2][0] = 389;
			this.anIntArrayArray5[0][3] = 321;
			this.anIntArrayArray5[2][1] = 578;
			this.anIntArrayArray5[0][2] = 192;
			this.anIntArrayArray5[3][1] = 947;
			this.anIntArrayArray5[3][0] = 671;
			this.anIntArrayArray5[1][3] = 562;
			this.anIntArrayArray5[4][0] = 897;
			this.anIntArrayArray5[5][0] = 1175;
			this.anIntArrayArray5[4][1] = 1285;
			this.anIntArrayArray5[5][1] = 1525;
			this.anIntArrayArray5[2][3] = 803;
			this.anIntArrayArray5[1][2] = 449;
			this.anIntArrayArray5[2][2] = 690;
			this.anIntArrayArray5[3][2] = 995;
			this.anIntArrayArray5[4][2] = 1397;
			this.anIntArrayArray5[3][3] = 1140;
			this.anIntArrayArray5[5][2] = 1429;
			this.anIntArrayArray5[6][0] = 1368;
			this.anIntArrayArray5[4][3] = 1509;
			this.anIntArrayArray5[6][2] = 1461;
			this.anIntArrayArray5[5][3] = 1413;
			this.anIntArrayArray5[7][0] = 1507;
			this.anIntArrayArray5[7][2] = 1525;
			this.anIntArrayArray5[8][2] = 1590;
			this.anIntArrayArray5[6][3] = 1333;
			this.anIntArrayArray5[6][1] = 1734;
			this.anIntArrayArray5[8][0] = 1736;
			this.anIntArrayArray5[9][0] = 2088;
			this.anIntArrayArray5[7][1] = 1413;
			this.anIntArrayArray5[7][3] = 1702;
			this.anIntArrayArray5[8][3] = 2056;
			this.anIntArrayArray5[8][1] = 1108;
			this.anIntArrayArray5[9][2] = 2056;
			this.anIntArrayArray5[10][2] = 2586;
			this.anIntArrayArray5[9][1] = 1766;
			this.anIntArrayArray5[11][2] = 3148;
			this.anIntArrayArray5[9][3] = 2666;
			this.anIntArrayArray5[12][2] = 3710;
			this.anIntArrayArray5[10][3] = 3276;
			this.anIntArrayArray5[10][1] = 2409;
			this.anIntArrayArray5[11][3] = 3228;
			this.anIntArrayArray5[11][1] = 3116;
			this.anIntArrayArray5[13][2] = 3421;
			this.anIntArrayArray5[10][0] = 2355;
			this.anIntArrayArray5[12][3] = 3196;
			this.anIntArrayArray5[11][0] = 2691;
			this.anIntArrayArray5[12][1] = 3806;
			this.anIntArrayArray5[14][2] = 3148;
			this.anIntArrayArray5[13][3] = 3019;
			this.anIntArrayArray5[15][2] = 2505;
			this.anIntArrayArray5[12][0] = 3031;
			this.anIntArrayArray5[13][0] = 3522;
			this.anIntArrayArray5[13][1] = 3437;
			this.anIntArrayArray5[14][3] = 3228;
			this.anIntArrayArray5[15][3] = 2746;
			this.anIntArrayArray5[14][0] = 3727;
			this.anIntArrayArray5[14][1] = 3116;
			this.anIntArrayArray5[15][0] = 4096;
			this.anIntArrayArray5[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray5 = new int[4][4];
			this.anIntArrayArray5[0][2] = 4096;
			this.anIntArrayArray5[0][1] = 0;
			this.anIntArrayArray5[1][1] = 4096;
			this.anIntArrayArray5[1][2] = 4096;
			this.anIntArrayArray5[2][1] = 4096;
			this.anIntArrayArray5[2][2] = 4096;
			this.anIntArrayArray5[0][0] = 2048;
			this.anIntArrayArray5[0][3] = 0;
			this.anIntArrayArray5[1][3] = 0;
			this.anIntArrayArray5[1][0] = 2867;
			this.anIntArrayArray5[2][0] = 3276;
			this.anIntArrayArray5[3][1] = 4096;
			this.anIntArrayArray5[2][3] = 0;
			this.anIntArrayArray5[3][3] = 0;
			this.anIntArrayArray5[3][2] = 0;
			this.anIntArrayArray5[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	public void method2786() {
		if (this.anIntArrayArray5 == null) {
			this.method685(1);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ff;BI)V")
	@Override
	public void method2789(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(10) int local10 = arg0.method1354();
		if (local10 != 0) {
			this.method685(local10);
			return;
		}
		this.anIntArrayArray5 = new int[arg0.method1354()][4];
		for (@Pc(21) int local21 = 0; local21 < this.anIntArrayArray5.length; local21++) {
			this.anIntArrayArray5[local21][0] = arg0.method1359();
			this.anIntArrayArray5[local21][1] = arg0.method1354() << 4;
			this.anIntArrayArray5[local21][2] = arg0.method1354() << 4;
			this.anIntArrayArray5[local21][3] = arg0.method1354() << 4;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method2796(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass28_39.method997(arg0);
		if (super.aClass28_39.aBoolean89) {
			@Pc(23) int local23 = this.anIntArrayArray5.length;
			@Pc(29) int[] local29 = this.method2787(arg0, 0);
			@Pc(33) int[] local33 = local15[0];
			@Pc(37) int[] local37 = local15[1];
			@Pc(41) int[] local41 = local15[2];
			@Pc(48) int local48;
			if (local23 > 0) {
				for (local48 = 0; local48 < Static86.anInt1942; local48++) {
					@Pc(52) int local52 = 0;
					@Pc(56) int local56 = local29[local48];
					for (@Pc(58) int local58 = 0; local58 < local23 && this.anIntArrayArray5[local58][0] <= local56; local58++) {
						local52++;
					}
					@Pc(91) int[] local91;
					if (local52 >= local23) {
						local91 = this.anIntArrayArray5[local23 - 1];
						local33[local48] = local91[1];
						local37[local48] = local91[2];
						local41[local48] = local91[3];
					} else {
						local91 = this.anIntArrayArray5[local52];
						if (local52 <= 0) {
							local33[local48] = local91[1];
							local37[local48] = local91[2];
							local41[local48] = local91[3];
						} else {
							@Pc(145) int[] local145 = this.anIntArrayArray5[local52 - 1];
							@Pc(162) int local162 = (local56 - local145[0] << 12) / (local91[0] - local145[0]);
							@Pc(167) int local167 = 4096 - local162;
							local33[local48] = local167 * local145[1] + local162 * local91[1] >> 12;
							local37[local48] = local167 * local145[2] + local162 * local91[2] >> 12;
							local41[local48] = local167 * local145[3] + local162 * local91[3] >> 12;
						}
					}
				}
			} else {
				for (local48 = 0; local48 < Static86.anInt1942; local48++) {
					local33[local48] = 0;
					local37[local48] = 0;
					local41[local48] = 0;
				}
			}
		}
		return local15;
	}
}
