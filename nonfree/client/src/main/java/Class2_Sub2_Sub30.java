import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class2_Sub2_Sub30 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sr", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "[I")
	private final int[] anIntArray594 = new int[257];

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(25) int[] local25 = this.method7951(arg0, 0);
			@Pc(29) int[] local29 = local11[0];
			@Pc(33) int[] local33 = local11[1];
			@Pc(37) int[] local37 = local11[2];
			for (@Pc(39) int local39 = 0; local39 < Static153.anInt3070; local39++) {
				@Pc(47) int local47 = local25[local39] >> 4;
				if (local47 < 0) {
					local47 = 0;
				}
				if (local47 > 256) {
					local47 = 256;
				}
				local47 = this.anIntArray594[local47];
				local29[local39] = local47 >> 12 & 0xFF0;
				local33[local39] = local47 >> 4 & 0xFF0;
				local37[local39] = (local47 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)V")
	private void method6889(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray58 = new int[2][4];
			this.anIntArrayArray58[0][2] = 0;
			this.anIntArrayArray58[0][3] = 0;
			this.anIntArrayArray58[0][1] = 0;
			this.anIntArrayArray58[0][0] = 0;
			this.anIntArrayArray58[1][1] = 4096;
			this.anIntArrayArray58[1][2] = 4096;
			this.anIntArrayArray58[1][0] = 4096;
			this.anIntArrayArray58[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray58 = new int[8][4];
			this.anIntArrayArray58[0][1] = 2650;
			this.anIntArrayArray58[0][2] = 2602;
			this.anIntArrayArray58[0][3] = 2361;
			this.anIntArrayArray58[0][0] = 0;
			this.anIntArrayArray58[1][0] = 2867;
			this.anIntArrayArray58[1][3] = 1558;
			this.anIntArrayArray58[1][2] = 1799;
			this.anIntArrayArray58[1][1] = 2313;
			this.anIntArrayArray58[2][0] = 3072;
			this.anIntArrayArray58[2][2] = 1734;
			this.anIntArrayArray58[2][1] = 2618;
			this.anIntArrayArray58[2][3] = 1413;
			this.anIntArrayArray58[3][0] = 3276;
			this.anIntArrayArray58[3][1] = 2296;
			this.anIntArrayArray58[3][2] = 1220;
			this.anIntArrayArray58[3][3] = 947;
			this.anIntArrayArray58[4][2] = 963;
			this.anIntArrayArray58[4][1] = 2072;
			this.anIntArrayArray58[4][3] = 722;
			this.anIntArrayArray58[4][0] = 3481;
			this.anIntArrayArray58[5][2] = 2152;
			this.anIntArrayArray58[5][1] = 2730;
			this.anIntArrayArray58[5][3] = 1766;
			this.anIntArrayArray58[5][0] = 3686;
			this.anIntArrayArray58[6][3] = 915;
			this.anIntArrayArray58[6][2] = 1060;
			this.anIntArrayArray58[6][0] = 3891;
			this.anIntArrayArray58[6][1] = 2232;
			this.anIntArrayArray58[7][0] = 4096;
			this.anIntArrayArray58[7][3] = 1140;
			this.anIntArrayArray58[7][2] = 1413;
			this.anIntArrayArray58[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray58 = new int[7][4];
			this.anIntArrayArray58[0][1] = 0;
			this.anIntArrayArray58[0][2] = 0;
			this.anIntArrayArray58[0][3] = 4096;
			this.anIntArrayArray58[0][0] = 0;
			this.anIntArrayArray58[1][2] = 4096;
			this.anIntArrayArray58[1][0] = 663;
			this.anIntArrayArray58[1][3] = 4096;
			this.anIntArrayArray58[1][1] = 0;
			this.anIntArrayArray58[2][0] = 1363;
			this.anIntArrayArray58[2][3] = 0;
			this.anIntArrayArray58[2][2] = 4096;
			this.anIntArrayArray58[2][1] = 0;
			this.anIntArrayArray58[3][1] = 4096;
			this.anIntArrayArray58[3][3] = 0;
			this.anIntArrayArray58[3][2] = 4096;
			this.anIntArrayArray58[3][0] = 2048;
			this.anIntArrayArray58[4][1] = 4096;
			this.anIntArrayArray58[4][2] = 0;
			this.anIntArrayArray58[4][0] = 2727;
			this.anIntArrayArray58[4][3] = 0;
			this.anIntArrayArray58[5][1] = 4096;
			this.anIntArrayArray58[5][3] = 4096;
			this.anIntArrayArray58[5][0] = 3411;
			this.anIntArrayArray58[5][2] = 0;
			this.anIntArrayArray58[6][1] = 0;
			this.anIntArrayArray58[6][3] = 4096;
			this.anIntArrayArray58[6][0] = 4096;
			this.anIntArrayArray58[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray58 = new int[6][4];
			this.anIntArrayArray58[0][3] = 0;
			this.anIntArrayArray58[0][0] = 0;
			this.anIntArrayArray58[0][2] = 0;
			this.anIntArrayArray58[0][1] = 0;
			this.anIntArrayArray58[1][1] = 0;
			this.anIntArrayArray58[1][3] = 1493;
			this.anIntArrayArray58[1][0] = 1843;
			this.anIntArrayArray58[1][2] = 0;
			this.anIntArrayArray58[2][3] = 2939;
			this.anIntArrayArray58[2][2] = 0;
			this.anIntArrayArray58[2][1] = 0;
			this.anIntArrayArray58[2][0] = 2457;
			this.anIntArrayArray58[3][3] = 3565;
			this.anIntArrayArray58[3][2] = 1124;
			this.anIntArrayArray58[3][0] = 2781;
			this.anIntArrayArray58[3][1] = 0;
			this.anIntArrayArray58[4][0] = 3481;
			this.anIntArrayArray58[4][1] = 546;
			this.anIntArrayArray58[4][2] = 3084;
			this.anIntArrayArray58[4][3] = 4031;
			this.anIntArrayArray58[5][3] = 4096;
			this.anIntArrayArray58[5][2] = 4096;
			this.anIntArrayArray58[5][1] = 4096;
			this.anIntArrayArray58[5][0] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray58 = new int[16][4];
			this.anIntArrayArray58[0][0] = 0;
			this.anIntArrayArray58[0][3] = 321;
			this.anIntArrayArray58[0][1] = 80;
			this.anIntArrayArray58[0][2] = 192;
			this.anIntArrayArray58[1][0] = 155;
			this.anIntArrayArray58[1][3] = 562;
			this.anIntArrayArray58[1][2] = 449;
			this.anIntArrayArray58[1][1] = 321;
			this.anIntArrayArray58[2][2] = 690;
			this.anIntArrayArray58[2][1] = 578;
			this.anIntArrayArray58[2][0] = 389;
			this.anIntArrayArray58[2][3] = 803;
			this.anIntArrayArray58[3][3] = 1140;
			this.anIntArrayArray58[3][2] = 995;
			this.anIntArrayArray58[3][1] = 947;
			this.anIntArrayArray58[3][0] = 671;
			this.anIntArrayArray58[4][0] = 897;
			this.anIntArrayArray58[4][1] = 1285;
			this.anIntArrayArray58[4][2] = 1397;
			this.anIntArrayArray58[4][3] = 1509;
			this.anIntArrayArray58[5][3] = 1413;
			this.anIntArrayArray58[5][0] = 1175;
			this.anIntArrayArray58[5][2] = 1429;
			this.anIntArrayArray58[5][1] = 1525;
			this.anIntArrayArray58[6][3] = 1333;
			this.anIntArrayArray58[6][0] = 1368;
			this.anIntArrayArray58[6][2] = 1461;
			this.anIntArrayArray58[6][1] = 1734;
			this.anIntArrayArray58[7][3] = 1702;
			this.anIntArrayArray58[7][2] = 1525;
			this.anIntArrayArray58[7][0] = 1507;
			this.anIntArrayArray58[7][1] = 1413;
			this.anIntArrayArray58[8][2] = 1590;
			this.anIntArrayArray58[8][3] = 2056;
			this.anIntArrayArray58[8][1] = 1108;
			this.anIntArrayArray58[8][0] = 1736;
			this.anIntArrayArray58[9][1] = 1766;
			this.anIntArrayArray58[9][0] = 2088;
			this.anIntArrayArray58[9][2] = 2056;
			this.anIntArrayArray58[9][3] = 2666;
			this.anIntArrayArray58[10][1] = 2409;
			this.anIntArrayArray58[10][0] = 2355;
			this.anIntArrayArray58[10][2] = 2586;
			this.anIntArrayArray58[10][3] = 3276;
			this.anIntArrayArray58[11][3] = 3228;
			this.anIntArrayArray58[11][1] = 3116;
			this.anIntArrayArray58[11][0] = 2691;
			this.anIntArrayArray58[11][2] = 3148;
			this.anIntArrayArray58[12][0] = 3031;
			this.anIntArrayArray58[12][3] = 3196;
			this.anIntArrayArray58[12][2] = 3710;
			this.anIntArrayArray58[12][1] = 3806;
			this.anIntArrayArray58[13][1] = 3437;
			this.anIntArrayArray58[13][0] = 3522;
			this.anIntArrayArray58[13][3] = 3019;
			this.anIntArrayArray58[13][2] = 3421;
			this.anIntArrayArray58[14][0] = 3727;
			this.anIntArrayArray58[14][3] = 3228;
			this.anIntArrayArray58[14][2] = 3148;
			this.anIntArrayArray58[14][1] = 3116;
			this.anIntArrayArray58[15][0] = 4096;
			this.anIntArrayArray58[15][3] = 2746;
			this.anIntArrayArray58[15][1] = 2377;
			this.anIntArrayArray58[15][2] = 2505;
		} else if (arg0 == 6) {
			this.anIntArrayArray58 = new int[4][4];
			this.anIntArrayArray58[0][0] = 2048;
			this.anIntArrayArray58[0][1] = 0;
			this.anIntArrayArray58[0][2] = 4096;
			this.anIntArrayArray58[0][3] = 0;
			this.anIntArrayArray58[1][3] = 0;
			this.anIntArrayArray58[1][1] = 4096;
			this.anIntArrayArray58[1][0] = 2867;
			this.anIntArrayArray58[1][2] = 4096;
			this.anIntArrayArray58[2][2] = 4096;
			this.anIntArrayArray58[2][1] = 4096;
			this.anIntArrayArray58[2][0] = 3276;
			this.anIntArrayArray58[2][3] = 0;
			this.anIntArrayArray58[3][2] = 0;
			this.anIntArrayArray58[3][3] = 0;
			this.anIntArrayArray58[3][0] = 4096;
			this.anIntArrayArray58[3][1] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		if (this.anIntArrayArray58 == null) {
			this.method6889(1);
		}
		this.method6892();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(18) int local18 = arg0.method4325();
		if (local18 != 0) {
			this.method6889(local18);
			return;
		}
		this.anIntArrayArray58 = new int[arg0.method4325()][4];
		for (@Pc(29) int local29 = 0; local29 < this.anIntArrayArray58.length; local29++) {
			this.anIntArrayArray58[local29][0] = arg0.method4294();
			this.anIntArrayArray58[local29][1] = arg0.method4325() << 4;
			this.anIntArrayArray58[local29][2] = arg0.method4325() << 4;
			this.anIntArrayArray58[local29][3] = arg0.method4325() << 4;
		}
	}

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "(I)V")
	private void method6892() {
		@Pc(9) int local9 = this.anIntArrayArray58.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local26 < local9 && this.anIntArrayArray58[local26][0] <= local24; local26++) {
				local20++;
			}
			@Pc(118) int local118;
			@Pc(132) int local132;
			@Pc(104) int local104;
			@Pc(57) int[] local57;
			if (local9 > local20) {
				local57 = this.anIntArrayArray58[local20];
				if (local20 > 0) {
					@Pc(69) int[] local69 = this.anIntArrayArray58[local20 - 1];
					@Pc(86) int local86 = (local24 - local69[0] << 12) / (local57[0] - local69[0]);
					@Pc(90) int local90 = 4096 - local86;
					local104 = local86 * local57[3] + local69[3] * local90 >> 12;
					local118 = local90 * local69[1] + local57[1] * local86 >> 12;
					local132 = local69[2] * local90 + local57[2] * local86 >> 12;
				} else {
					local132 = local57[2];
					local104 = local57[3];
					local118 = local57[1];
				}
			} else {
				local57 = this.anIntArrayArray58[local9 - 1];
				local104 = local57[3];
				local118 = local57[1];
				local132 = local57[2];
			}
			local118 >>= 0x4;
			local104 >>= 0x4;
			local132 >>= 0x4;
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 255) {
				local118 = 255;
			}
			if (local132 < 0) {
				local132 = 0;
			} else if (local132 > 255) {
				local132 = 255;
			}
			if (local104 < 0) {
				local104 = 0;
			} else if (local104 > 255) {
				local104 = 255;
			}
			this.anIntArray594[local16] = local118 << 16 | local132 << 8 | local104;
		}
	}
}
