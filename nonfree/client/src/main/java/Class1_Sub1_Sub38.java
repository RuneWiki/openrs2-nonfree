import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		if (this.anIntArrayArray37 == null) {
			this.method2967(1);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(26) int local26 = this.anIntArrayArray37.length;
			@Pc(32) int[] local32 = this.method3012(0, arg0);
			@Pc(36) int[] local36 = local18[0];
			@Pc(40) int[] local40 = local18[1];
			@Pc(44) int[] local44 = local18[2];
			@Pc(51) int local51;
			if (local26 <= 0) {
				for (local51 = 0; local51 < Static65.anInt1933; local51++) {
					local36[local51] = 0;
					local40[local51] = 0;
					local44[local51] = 0;
				}
			} else {
				for (local51 = 0; local51 < Static65.anInt1933; local51++) {
					@Pc(81) int local81 = 0;
					@Pc(85) int local85 = local32[local51];
					for (@Pc(87) int local87 = 0; local87 < local26 && local85 >= this.anIntArrayArray37[local87][0]; local87++) {
						local81++;
					}
					@Pc(110) int[] local110;
					if (local26 > local81) {
						local110 = this.anIntArrayArray37[local81];
						if (local81 <= 0) {
							local36[local51] = local110[1];
							local40[local51] = local110[2];
							local44[local51] = local110[3];
						} else {
							@Pc(142) int[] local142 = this.anIntArrayArray37[local81 - 1];
							@Pc(160) int local160 = (local85 - local142[0] << 12) / (local110[0] - local142[0]);
							@Pc(165) int local165 = 4096 - local160;
							local36[local51] = local160 * local110[1] + local165 * local142[1] >> 12;
							local40[local51] = local110[2] * local160 + local142[2] * local165 >> 12;
							local44[local51] = local142[3] * local165 + local160 * local110[3] >> 12;
						}
					} else {
						local110 = this.anIntArrayArray37[local26 - 1];
						local36[local51] = local110[1];
						local40[local51] = local110[2];
						local44[local51] = local110[3];
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(11) int local11 = arg1.method1607();
		if (local11 != 0) {
			this.method2967(local11);
			return;
		}
		this.anIntArrayArray37 = new int[arg1.method1607()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray37.length; local31++) {
			this.anIntArrayArray37[local31][0] = arg1.method1642();
			this.anIntArrayArray37[local31][1] = arg1.method1607() << 4;
			this.anIntArrayArray37[local31][2] = arg1.method1607() << 4;
			this.anIntArrayArray37[local31][3] = arg1.method1607() << 4;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(BI)V")
	private void method2967(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[7][3] = 1140;
			this.anIntArrayArray37[7][1] = 1686;
			this.anIntArrayArray37[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[6][1] = 0;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[6][2] = 0;
			this.anIntArrayArray37[6][0] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][0] = 4096;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[15][2] = 2505;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
