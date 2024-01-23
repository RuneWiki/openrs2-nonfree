import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!q", name = "Z", descriptor = "[B")
	public static byte[] aByteArray48 = new byte[32896];

	@OriginalMember(owner = "client!q", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!q", name = "W", descriptor = "[I")
	private int[] anIntArray369 = new int[257];

	static {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			for (@Pc(17) int local17 = 0; local17 <= local14; local17++) {
				aByteArray48[local12++] = (byte) (255.0D / Math.sqrt((double) ((float) (local17 * local17 + local14 * local14 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(10) int local10 = arg1.method2142();
		if (local10 != 0) {
			this.method2781(local10);
			return;
		}
		this.anIntArrayArray25 = new int[arg1.method2142()][4];
		for (@Pc(27) int local27 = 0; local27 < this.anIntArrayArray25.length; local27++) {
			this.anIntArrayArray25[local27][0] = arg1.method2178();
			this.anIntArrayArray25[local27][1] = arg1.method2142() << 4;
			this.anIntArrayArray25[local27][2] = arg1.method2142() << 4;
			this.anIntArrayArray25[local27][3] = arg1.method2142() << 4;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)V")
	private void method2781(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray25 = new int[2][4];
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[1][0] = 4096;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray25 = new int[8][4];
			this.anIntArrayArray25[0][1] = 2650;
			this.anIntArrayArray25[1][1] = 2313;
			this.anIntArrayArray25[0][3] = 2361;
			this.anIntArrayArray25[0][2] = 2602;
			this.anIntArrayArray25[2][1] = 2618;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[3][1] = 2296;
			this.anIntArrayArray25[1][2] = 1799;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[2][2] = 1734;
			this.anIntArrayArray25[3][2] = 1220;
			this.anIntArrayArray25[4][2] = 963;
			this.anIntArrayArray25[2][0] = 3072;
			this.anIntArrayArray25[4][1] = 2072;
			this.anIntArrayArray25[1][3] = 1558;
			this.anIntArrayArray25[5][2] = 2152;
			this.anIntArrayArray25[6][2] = 1060;
			this.anIntArrayArray25[5][1] = 2730;
			this.anIntArrayArray25[2][3] = 1413;
			this.anIntArrayArray25[7][2] = 1413;
			this.anIntArrayArray25[3][0] = 3276;
			this.anIntArrayArray25[3][3] = 947;
			this.anIntArrayArray25[6][1] = 2232;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[5][0] = 3686;
			this.anIntArrayArray25[4][3] = 722;
			this.anIntArrayArray25[5][3] = 1766;
			this.anIntArrayArray25[7][1] = 1686;
			this.anIntArrayArray25[6][3] = 915;
			this.anIntArrayArray25[6][0] = 3891;
			this.anIntArrayArray25[7][3] = 1140;
			this.anIntArrayArray25[7][0] = 4096;
		} else if (arg0 == 3) {
			this.anIntArrayArray25 = new int[7][4];
			this.anIntArrayArray25[0][3] = 4096;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][3] = 4096;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[1][0] = 663;
			this.anIntArrayArray25[2][0] = 1363;
			this.anIntArrayArray25[3][0] = 2048;
			this.anIntArrayArray25[4][0] = 2727;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[4][3] = 0;
			this.anIntArrayArray25[5][3] = 4096;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[6][3] = 4096;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[5][0] = 3411;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[4][1] = 4096;
			this.anIntArrayArray25[6][0] = 4096;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[6][1] = 0;
			this.anIntArrayArray25[3][2] = 4096;
			this.anIntArrayArray25[4][2] = 0;
			this.anIntArrayArray25[5][2] = 0;
			this.anIntArrayArray25[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray25 = new int[6][4];
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[1][0] = 1843;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[2][0] = 2457;
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][2] = 0;
			this.anIntArrayArray25[3][0] = 2781;
			this.anIntArrayArray25[1][1] = 0;
			this.anIntArrayArray25[1][2] = 0;
			this.anIntArrayArray25[4][0] = 3481;
			this.anIntArrayArray25[5][0] = 4096;
			this.anIntArrayArray25[2][2] = 0;
			this.anIntArrayArray25[1][3] = 1493;
			this.anIntArrayArray25[3][2] = 1124;
			this.anIntArrayArray25[2][1] = 0;
			this.anIntArrayArray25[3][1] = 0;
			this.anIntArrayArray25[4][1] = 546;
			this.anIntArrayArray25[2][3] = 2939;
			this.anIntArrayArray25[4][2] = 3084;
			this.anIntArrayArray25[3][3] = 3565;
			this.anIntArrayArray25[5][2] = 4096;
			this.anIntArrayArray25[4][3] = 4031;
			this.anIntArrayArray25[5][1] = 4096;
			this.anIntArrayArray25[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray25 = new int[16][4];
			this.anIntArrayArray25[0][3] = 321;
			this.anIntArrayArray25[0][1] = 80;
			this.anIntArrayArray25[0][0] = 0;
			this.anIntArrayArray25[0][2] = 192;
			this.anIntArrayArray25[1][0] = 155;
			this.anIntArrayArray25[1][3] = 562;
			this.anIntArrayArray25[2][3] = 803;
			this.anIntArrayArray25[1][1] = 321;
			this.anIntArrayArray25[1][2] = 449;
			this.anIntArrayArray25[2][2] = 690;
			this.anIntArrayArray25[3][3] = 1140;
			this.anIntArrayArray25[2][0] = 389;
			this.anIntArrayArray25[2][1] = 578;
			this.anIntArrayArray25[4][3] = 1509;
			this.anIntArrayArray25[3][2] = 995;
			this.anIntArrayArray25[4][2] = 1397;
			this.anIntArrayArray25[3][1] = 947;
			this.anIntArrayArray25[5][2] = 1429;
			this.anIntArrayArray25[4][1] = 1285;
			this.anIntArrayArray25[3][0] = 671;
			this.anIntArrayArray25[6][2] = 1461;
			this.anIntArrayArray25[5][1] = 1525;
			this.anIntArrayArray25[5][3] = 1413;
			this.anIntArrayArray25[6][3] = 1333;
			this.anIntArrayArray25[7][2] = 1525;
			this.anIntArrayArray25[8][2] = 1590;
			this.anIntArrayArray25[9][2] = 2056;
			this.anIntArrayArray25[10][2] = 2586;
			this.anIntArrayArray25[7][3] = 1702;
			this.anIntArrayArray25[4][0] = 897;
			this.anIntArrayArray25[11][2] = 3148;
			this.anIntArrayArray25[12][2] = 3710;
			this.anIntArrayArray25[13][2] = 3421;
			this.anIntArrayArray25[14][2] = 3148;
			this.anIntArrayArray25[8][3] = 2056;
			this.anIntArrayArray25[9][3] = 2666;
			this.anIntArrayArray25[10][3] = 3276;
			this.anIntArrayArray25[11][3] = 3228;
			this.anIntArrayArray25[6][1] = 1734;
			this.anIntArrayArray25[12][3] = 3196;
			this.anIntArrayArray25[7][1] = 1413;
			this.anIntArrayArray25[5][0] = 1175;
			this.anIntArrayArray25[6][0] = 1368;
			this.anIntArrayArray25[15][2] = 2505;
			this.anIntArrayArray25[13][3] = 3019;
			this.anIntArrayArray25[7][0] = 1507;
			this.anIntArrayArray25[8][1] = 1108;
			this.anIntArrayArray25[8][0] = 1736;
			this.anIntArrayArray25[14][3] = 3228;
			this.anIntArrayArray25[9][0] = 2088;
			this.anIntArrayArray25[9][1] = 1766;
			this.anIntArrayArray25[10][1] = 2409;
			this.anIntArrayArray25[15][3] = 2746;
			this.anIntArrayArray25[10][0] = 2355;
			this.anIntArrayArray25[11][1] = 3116;
			this.anIntArrayArray25[12][1] = 3806;
			this.anIntArrayArray25[13][1] = 3437;
			this.anIntArrayArray25[11][0] = 2691;
			this.anIntArrayArray25[12][0] = 3031;
			this.anIntArrayArray25[14][1] = 3116;
			this.anIntArrayArray25[15][1] = 2377;
			this.anIntArrayArray25[13][0] = 3522;
			this.anIntArrayArray25[14][0] = 3727;
			this.anIntArrayArray25[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray25 = new int[4][4];
			this.anIntArrayArray25[0][3] = 0;
			this.anIntArrayArray25[0][1] = 0;
			this.anIntArrayArray25[1][1] = 4096;
			this.anIntArrayArray25[2][1] = 4096;
			this.anIntArrayArray25[1][3] = 0;
			this.anIntArrayArray25[3][1] = 4096;
			this.anIntArrayArray25[2][3] = 0;
			this.anIntArrayArray25[0][2] = 4096;
			this.anIntArrayArray25[1][2] = 4096;
			this.anIntArrayArray25[3][3] = 0;
			this.anIntArrayArray25[0][0] = 2048;
			this.anIntArrayArray25[2][2] = 4096;
			this.anIntArrayArray25[1][0] = 2867;
			this.anIntArrayArray25[3][2] = 0;
			this.anIntArrayArray25[2][0] = 3276;
			this.anIntArrayArray25[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		if (this.anIntArrayArray25 == null) {
			this.method2781(1);
		}
		this.method2783();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(31) int[] local31 = this.method3468(arg0, 0);
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local11[0];
			for (@Pc(45) int local45 = 0; local45 < Static76.anInt1531; local45++) {
				@Pc(53) int local53 = local31[local45] >> 4;
				if (local53 < 0) {
					local53 = 0;
				}
				if (local53 > 256) {
					local53 = 256;
				}
				local53 = this.anIntArray369[local53];
				local43[local45] = local53 >> 12 & 0xFF0;
				local35[local45] = local53 >> 4 & 0xFF0;
				local39[local45] = (local53 & 0xFF) << 4;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)V")
	private void method2783() {
		@Pc(14) int local14 = this.anIntArrayArray25.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < 257; local18++) {
			@Pc(24) int local24 = local18 << 4;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local14 > local28 && local24 >= this.anIntArrayArray25[local28][0]; local28++) {
				local26++;
			}
			@Pc(69) int local69;
			@Pc(65) int local65;
			@Pc(73) int local73;
			@Pc(61) int[] local61;
			if (local26 >= local14) {
				local61 = this.anIntArrayArray25[local14 - 1];
				local65 = local61[2];
				local69 = local61[1];
				local73 = local61[3];
			} else {
				local61 = this.anIntArrayArray25[local26];
				if (local26 <= 0) {
					local65 = local61[2];
					local69 = local61[1];
					local73 = local61[3];
				} else {
					@Pc(106) int[] local106 = this.anIntArrayArray25[local26 - 1];
					@Pc(123) int local123 = (local24 - local106[0] << 12) / (local61[0] - local106[0]);
					@Pc(127) int local127 = 4096 - local123;
					local65 = local123 * local61[2] + local106[2] * local127 >> 12;
					local73 = local123 * local61[3] + local127 * local106[3] >> 12;
					local69 = local106[1] * local127 + local61[1] * local123 >> 12;
				}
			}
			local73 >>= 0x4;
			if (local73 < 0) {
				local73 = 0;
			} else if (local73 > 255) {
				local73 = 255;
			}
			local65 >>= 0x4;
			if (local65 < 0) {
				local65 = 0;
			} else if (local65 > 255) {
				local65 = 255;
			}
			local69 >>= 0x4;
			if (local69 < 0) {
				local69 = 0;
			} else if (local69 > 255) {
				local69 = 255;
			}
			this.anIntArray369[local18] = local65 << 8 | local69 << 16 | local73;
		}
	}
}
