import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class2_Sub3_Sub37 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wh", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(18) int local18 = arg1.method1698();
		if (local18 != 0) {
			this.method2907(local18);
			return;
		}
		this.anIntArrayArray37 = new int[arg1.method1698()][4];
		for (@Pc(34) int local34 = 0; local34 < this.anIntArrayArray37.length; local34++) {
			this.anIntArrayArray37[local34][0] = arg1.method1680();
			this.anIntArrayArray37[local34][1] = arg1.method1698() << 4;
			this.anIntArrayArray37[local34][2] = arg1.method1698() << 4;
			this.anIntArrayArray37[local34][3] = arg1.method1698() << 4;
		}
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		if (this.anIntArrayArray37 == null) {
			this.method2907(1);
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(24) int local24 = this.anIntArrayArray37.length;
			@Pc(30) int[] local30 = this.method2901(0, arg0);
			@Pc(34) int[] local34 = local16[0];
			@Pc(38) int[] local38 = local16[2];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int local46;
			if (local24 > 0) {
				for (local46 = 0; local46 < Static54.anInt1423; local46++) {
					@Pc(50) int local50 = 0;
					@Pc(54) int local54 = local30[local46];
					for (@Pc(56) int local56 = 0; local56 < local24 && local54 >= this.anIntArrayArray37[local56][0]; local56++) {
						local50++;
					}
					@Pc(81) int[] local81;
					if (local50 >= local24) {
						local81 = this.anIntArrayArray37[local24 - 1];
						local34[local46] = local81[1];
						local42[local46] = local81[2];
						local38[local46] = local81[3];
					} else {
						local81 = this.anIntArrayArray37[local50];
						if (local50 > 0) {
							@Pc(115) int[] local115 = this.anIntArrayArray37[local50 - 1];
							@Pc(133) int local133 = (local54 - local115[0] << 12) / (local81[0] - local115[0]);
							@Pc(137) int local137 = 4096 - local133;
							local34[local46] = local137 * local115[1] + local133 * local81[1] >> 12;
							local42[local46] = local81[2] * local133 + local115[2] * local137 >> 12;
							local38[local46] = local81[3] * local133 + local137 * local115[3] >> 12;
						} else {
							local34[local46] = local81[1];
							local42[local46] = local81[2];
							local38[local46] = local81[3];
						}
					}
				}
			} else {
				for (local46 = 0; local46 < Static54.anInt1423; local46++) {
					local34[local46] = 0;
					local42[local46] = 0;
					local38[local46] = 0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(II)V")
	private void method2907(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray37 = new int[2][4];
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][0] = 4096;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[1][1] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray37 = new int[8][4];
			this.anIntArrayArray37[0][2] = 2602;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][2] = 1799;
			this.anIntArrayArray37[2][0] = 3072;
			this.anIntArrayArray37[0][1] = 2650;
			this.anIntArrayArray37[0][3] = 2361;
			this.anIntArrayArray37[1][1] = 2313;
			this.anIntArrayArray37[3][0] = 3276;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[2][2] = 1734;
			this.anIntArrayArray37[1][3] = 1558;
			this.anIntArrayArray37[2][3] = 1413;
			this.anIntArrayArray37[5][0] = 3686;
			this.anIntArrayArray37[3][3] = 947;
			this.anIntArrayArray37[6][0] = 3891;
			this.anIntArrayArray37[7][0] = 4096;
			this.anIntArrayArray37[2][1] = 2618;
			this.anIntArrayArray37[4][3] = 722;
			this.anIntArrayArray37[3][2] = 1220;
			this.anIntArrayArray37[5][3] = 1766;
			this.anIntArrayArray37[3][1] = 2296;
			this.anIntArrayArray37[4][2] = 963;
			this.anIntArrayArray37[4][1] = 2072;
			this.anIntArrayArray37[6][3] = 915;
			this.anIntArrayArray37[5][2] = 2152;
			this.anIntArrayArray37[6][2] = 1060;
			this.anIntArrayArray37[5][1] = 2730;
			this.anIntArrayArray37[6][1] = 2232;
			this.anIntArrayArray37[7][2] = 1413;
			this.anIntArrayArray37[7][1] = 1686;
			this.anIntArrayArray37[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray37 = new int[7][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][3] = 4096;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][3] = 4096;
			this.anIntArrayArray37[1][0] = 663;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[4][3] = 0;
			this.anIntArrayArray37[2][0] = 1363;
			this.anIntArrayArray37[5][3] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[6][3] = 4096;
			this.anIntArrayArray37[3][2] = 4096;
			this.anIntArrayArray37[3][0] = 2048;
			this.anIntArrayArray37[4][0] = 2727;
			this.anIntArrayArray37[4][2] = 0;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[5][2] = 0;
			this.anIntArrayArray37[5][0] = 3411;
			this.anIntArrayArray37[6][0] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[4][1] = 4096;
			this.anIntArrayArray37[6][2] = 0;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray37 = new int[6][4];
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[0][2] = 0;
			this.anIntArrayArray37[1][2] = 0;
			this.anIntArrayArray37[2][2] = 0;
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[1][0] = 1843;
			this.anIntArrayArray37[1][1] = 0;
			this.anIntArrayArray37[2][0] = 2457;
			this.anIntArrayArray37[1][3] = 1493;
			this.anIntArrayArray37[2][3] = 2939;
			this.anIntArrayArray37[2][1] = 0;
			this.anIntArrayArray37[3][0] = 2781;
			this.anIntArrayArray37[3][2] = 1124;
			this.anIntArrayArray37[3][3] = 3565;
			this.anIntArrayArray37[4][2] = 3084;
			this.anIntArrayArray37[3][1] = 0;
			this.anIntArrayArray37[4][0] = 3481;
			this.anIntArrayArray37[5][2] = 4096;
			this.anIntArrayArray37[4][3] = 4031;
			this.anIntArrayArray37[4][1] = 546;
			this.anIntArrayArray37[5][1] = 4096;
			this.anIntArrayArray37[5][0] = 4096;
			this.anIntArrayArray37[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray37 = new int[16][4];
			this.anIntArrayArray37[0][2] = 192;
			this.anIntArrayArray37[0][3] = 321;
			this.anIntArrayArray37[0][0] = 0;
			this.anIntArrayArray37[1][3] = 562;
			this.anIntArrayArray37[2][3] = 803;
			this.anIntArrayArray37[3][3] = 1140;
			this.anIntArrayArray37[1][2] = 449;
			this.anIntArrayArray37[4][3] = 1509;
			this.anIntArrayArray37[2][2] = 690;
			this.anIntArrayArray37[1][0] = 155;
			this.anIntArrayArray37[3][2] = 995;
			this.anIntArrayArray37[5][3] = 1413;
			this.anIntArrayArray37[4][2] = 1397;
			this.anIntArrayArray37[0][1] = 80;
			this.anIntArrayArray37[2][0] = 389;
			this.anIntArrayArray37[1][1] = 321;
			this.anIntArrayArray37[2][1] = 578;
			this.anIntArrayArray37[5][2] = 1429;
			this.anIntArrayArray37[3][0] = 671;
			this.anIntArrayArray37[4][0] = 897;
			this.anIntArrayArray37[6][2] = 1461;
			this.anIntArrayArray37[7][2] = 1525;
			this.anIntArrayArray37[8][2] = 1590;
			this.anIntArrayArray37[9][2] = 2056;
			this.anIntArrayArray37[5][0] = 1175;
			this.anIntArrayArray37[6][3] = 1333;
			this.anIntArrayArray37[10][2] = 2586;
			this.anIntArrayArray37[11][2] = 3148;
			this.anIntArrayArray37[3][1] = 947;
			this.anIntArrayArray37[4][1] = 1285;
			this.anIntArrayArray37[12][2] = 3710;
			this.anIntArrayArray37[7][3] = 1702;
			this.anIntArrayArray37[8][3] = 2056;
			this.anIntArrayArray37[6][0] = 1368;
			this.anIntArrayArray37[5][1] = 1525;
			this.anIntArrayArray37[7][0] = 1507;
			this.anIntArrayArray37[8][0] = 1736;
			this.anIntArrayArray37[13][2] = 3421;
			this.anIntArrayArray37[6][1] = 1734;
			this.anIntArrayArray37[7][1] = 1413;
			this.anIntArrayArray37[8][1] = 1108;
			this.anIntArrayArray37[9][0] = 2088;
			this.anIntArrayArray37[14][2] = 3148;
			this.anIntArrayArray37[9][1] = 1766;
			this.anIntArrayArray37[10][0] = 2355;
			this.anIntArrayArray37[10][1] = 2409;
			this.anIntArrayArray37[15][2] = 2505;
			this.anIntArrayArray37[11][1] = 3116;
			this.anIntArrayArray37[12][1] = 3806;
			this.anIntArrayArray37[9][3] = 2666;
			this.anIntArrayArray37[10][3] = 3276;
			this.anIntArrayArray37[11][0] = 2691;
			this.anIntArrayArray37[13][1] = 3437;
			this.anIntArrayArray37[12][0] = 3031;
			this.anIntArrayArray37[11][3] = 3228;
			this.anIntArrayArray37[13][0] = 3522;
			this.anIntArrayArray37[12][3] = 3196;
			this.anIntArrayArray37[14][1] = 3116;
			this.anIntArrayArray37[13][3] = 3019;
			this.anIntArrayArray37[14][0] = 3727;
			this.anIntArrayArray37[14][3] = 3228;
			this.anIntArrayArray37[15][3] = 2746;
			this.anIntArrayArray37[15][0] = 4096;
			this.anIntArrayArray37[15][1] = 2377;
		} else if (arg0 == 6) {
			this.anIntArrayArray37 = new int[4][4];
			this.anIntArrayArray37[0][3] = 0;
			this.anIntArrayArray37[0][1] = 0;
			this.anIntArrayArray37[0][0] = 2048;
			this.anIntArrayArray37[1][1] = 4096;
			this.anIntArrayArray37[2][1] = 4096;
			this.anIntArrayArray37[1][0] = 2867;
			this.anIntArrayArray37[1][3] = 0;
			this.anIntArrayArray37[0][2] = 4096;
			this.anIntArrayArray37[3][1] = 4096;
			this.anIntArrayArray37[2][3] = 0;
			this.anIntArrayArray37[2][0] = 3276;
			this.anIntArrayArray37[1][2] = 4096;
			this.anIntArrayArray37[3][3] = 0;
			this.anIntArrayArray37[3][0] = 4096;
			this.anIntArrayArray37[2][2] = 4096;
			this.anIntArrayArray37[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}
}
