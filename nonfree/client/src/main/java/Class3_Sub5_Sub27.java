import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class3_Sub5_Sub27 extends Class3_Sub5 {

	@OriginalMember(owner = "client!re", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
	@Override
	public void method3164() {
		if (this.anIntArrayArray37 == null) {
			this.method2490(1);
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
	private void method2490(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[7][3] = 1140;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[7][2] = 1413;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[6][2] = 0;
			this.anIntArrayArray37[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[15][1] = 2377;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[3][2] = 0;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[3][3] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(7) int local7 = arg1.method2107();
		if (local7 != 0) {
			this.method2490(local7);
			return;
		}
		this.anIntArrayArray37 = new int[arg1.method2107()][4];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArrayArray37.length; local24++) {
			this.anIntArrayArray37[local24][0] = arg1.method2111();
			this.anIntArrayArray37[local24][1] = arg1.method2107() << 4;
			this.anIntArrayArray37[local24][2] = arg1.method2107() << 4;
			this.anIntArrayArray37[local24][3] = arg1.method2107() << 4;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(24) int local24 = this.anIntArrayArray37.length;
			@Pc(30) int[] local30 = this.method3167(arg0, 0);
			@Pc(34) int[] local34 = local7[0];
			@Pc(38) int[] local38 = local7[1];
			@Pc(42) int[] local42 = local7[2];
			@Pc(49) int local49;
			if (local24 > 0) {
				for (local49 = 0; local49 < Static104.anInt2195; local49++) {
					@Pc(55) int local55 = local30[local49];
					@Pc(57) int local57 = 0;
					for (@Pc(59) int local59 = 0; local24 > local59 && local55 >= this.anIntArrayArray37[local59][0]; local59++) {
						local57++;
					}
					@Pc(94) int[] local94;
					if (local24 > local57) {
						local94 = this.anIntArrayArray37[local57];
						if (local57 > 0) {
							@Pc(106) int[] local106 = this.anIntArrayArray37[local57 - 1];
							@Pc(124) int local124 = (local55 - local106[0] << 12) / (local94[0] - local106[0]);
							@Pc(129) int local129 = 4096 - local124;
							local34[local49] = local94[1] * local124 + local106[1] * local129 >> 12;
							local38[local49] = local106[2] * local129 + local94[2] * local124 >> 12;
							local42[local49] = local94[3] * local124 + local129 * local106[3] >> 12;
						} else {
							local34[local49] = local94[1];
							local38[local49] = local94[2];
							local42[local49] = local94[3];
						}
					} else {
						local94 = this.anIntArrayArray37[local24 - 1];
						local34[local49] = local94[1];
						local38[local49] = local94[2];
						local42[local49] = local94[3];
					}
				}
			} else {
				for (local49 = 0; local49 < Static104.anInt2195; local49++) {
					local34[local49] = 0;
					local38[local49] = 0;
					local42[local49] = 0;
				}
			}
		}
		return local7;
	}
}
