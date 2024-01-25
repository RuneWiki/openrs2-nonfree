import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hc", name = "L", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "[I")
	private final int[] anIntArray381 = new int[257];

	static {
		for (@Pc(9) int local9 = 0; local9 < 26; local9++) {
			aCharArray6[local9] = (char) (local9 + 65);
		}
		for (@Pc(23) int local23 = 26; local23 < 52; local23++) {
			aCharArray6[local23] = (char) (local23 + 97 - 26);
		}
		for (@Pc(39) int local39 = 52; local39 < 62; local39++) {
			aCharArray6[local39] = (char) (local39 + 48 - 52);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub13() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		if (this.anIntArrayArray44 == null) {
			this.method3321(1);
		}
		this.method3322();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
	private void method3321(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray44 = new int[2][4];
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[1][1] = 4096;
			this.anIntArrayArray44[1][3] = 4096;
			this.anIntArrayArray44[1][0] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray44 = new int[8][4];
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][3] = 2361;
			this.anIntArrayArray44[0][2] = 2602;
			this.anIntArrayArray44[0][1] = 2650;
			this.anIntArrayArray44[1][1] = 2313;
			this.anIntArrayArray44[1][3] = 1558;
			this.anIntArrayArray44[1][2] = 1799;
			this.anIntArrayArray44[1][0] = 2867;
			this.anIntArrayArray44[2][3] = 1413;
			this.anIntArrayArray44[2][0] = 3072;
			this.anIntArrayArray44[2][1] = 2618;
			this.anIntArrayArray44[2][2] = 1734;
			this.anIntArrayArray44[3][0] = 3276;
			this.anIntArrayArray44[3][3] = 947;
			this.anIntArrayArray44[3][2] = 1220;
			this.anIntArrayArray44[3][1] = 2296;
			this.anIntArrayArray44[4][3] = 722;
			this.anIntArrayArray44[4][1] = 2072;
			this.anIntArrayArray44[4][2] = 963;
			this.anIntArrayArray44[4][0] = 3481;
			this.anIntArrayArray44[5][1] = 2730;
			this.anIntArrayArray44[5][3] = 1766;
			this.anIntArrayArray44[5][2] = 2152;
			this.anIntArrayArray44[5][0] = 3686;
			this.anIntArrayArray44[6][1] = 2232;
			this.anIntArrayArray44[6][0] = 3891;
			this.anIntArrayArray44[6][3] = 915;
			this.anIntArrayArray44[6][2] = 1060;
			this.anIntArrayArray44[7][2] = 1413;
			this.anIntArrayArray44[7][1] = 1686;
			this.anIntArrayArray44[7][0] = 4096;
			this.anIntArrayArray44[7][3] = 1140;
		} else if (arg0 == 3) {
			this.anIntArrayArray44 = new int[7][4];
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][3] = 4096;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[1][3] = 4096;
			this.anIntArrayArray44[1][1] = 0;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[1][0] = 663;
			this.anIntArrayArray44[2][2] = 4096;
			this.anIntArrayArray44[2][0] = 1363;
			this.anIntArrayArray44[2][1] = 0;
			this.anIntArrayArray44[2][3] = 0;
			this.anIntArrayArray44[3][1] = 4096;
			this.anIntArrayArray44[3][0] = 2048;
			this.anIntArrayArray44[3][2] = 4096;
			this.anIntArrayArray44[3][3] = 0;
			this.anIntArrayArray44[4][1] = 4096;
			this.anIntArrayArray44[4][2] = 0;
			this.anIntArrayArray44[4][0] = 2727;
			this.anIntArrayArray44[4][3] = 0;
			this.anIntArrayArray44[5][2] = 0;
			this.anIntArrayArray44[5][3] = 4096;
			this.anIntArrayArray44[5][1] = 4096;
			this.anIntArrayArray44[5][0] = 3411;
			this.anIntArrayArray44[6][1] = 0;
			this.anIntArrayArray44[6][3] = 4096;
			this.anIntArrayArray44[6][0] = 4096;
			this.anIntArrayArray44[6][2] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray44 = new int[6][4];
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][2] = 0;
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[1][1] = 0;
			this.anIntArrayArray44[1][3] = 1493;
			this.anIntArrayArray44[1][2] = 0;
			this.anIntArrayArray44[1][0] = 1843;
			this.anIntArrayArray44[2][2] = 0;
			this.anIntArrayArray44[2][1] = 0;
			this.anIntArrayArray44[2][0] = 2457;
			this.anIntArrayArray44[2][3] = 2939;
			this.anIntArrayArray44[3][2] = 1124;
			this.anIntArrayArray44[3][0] = 2781;
			this.anIntArrayArray44[3][3] = 3565;
			this.anIntArrayArray44[3][1] = 0;
			this.anIntArrayArray44[4][2] = 3084;
			this.anIntArrayArray44[4][1] = 546;
			this.anIntArrayArray44[4][3] = 4031;
			this.anIntArrayArray44[4][0] = 3481;
			this.anIntArrayArray44[5][3] = 4096;
			this.anIntArrayArray44[5][0] = 4096;
			this.anIntArrayArray44[5][2] = 4096;
			this.anIntArrayArray44[5][1] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray44 = new int[16][4];
			this.anIntArrayArray44[0][0] = 0;
			this.anIntArrayArray44[0][3] = 321;
			this.anIntArrayArray44[0][1] = 80;
			this.anIntArrayArray44[0][2] = 192;
			this.anIntArrayArray44[1][2] = 449;
			this.anIntArrayArray44[1][3] = 562;
			this.anIntArrayArray44[1][0] = 155;
			this.anIntArrayArray44[1][1] = 321;
			this.anIntArrayArray44[2][0] = 389;
			this.anIntArrayArray44[2][3] = 803;
			this.anIntArrayArray44[2][1] = 578;
			this.anIntArrayArray44[2][2] = 690;
			this.anIntArrayArray44[3][1] = 947;
			this.anIntArrayArray44[3][3] = 1140;
			this.anIntArrayArray44[3][2] = 995;
			this.anIntArrayArray44[3][0] = 671;
			this.anIntArrayArray44[4][3] = 1509;
			this.anIntArrayArray44[4][2] = 1397;
			this.anIntArrayArray44[4][0] = 897;
			this.anIntArrayArray44[4][1] = 1285;
			this.anIntArrayArray44[5][2] = 1429;
			this.anIntArrayArray44[5][3] = 1413;
			this.anIntArrayArray44[5][1] = 1525;
			this.anIntArrayArray44[5][0] = 1175;
			this.anIntArrayArray44[6][2] = 1461;
			this.anIntArrayArray44[6][3] = 1333;
			this.anIntArrayArray44[6][0] = 1368;
			this.anIntArrayArray44[6][1] = 1734;
			this.anIntArrayArray44[7][0] = 1507;
			this.anIntArrayArray44[7][3] = 1702;
			this.anIntArrayArray44[7][1] = 1413;
			this.anIntArrayArray44[7][2] = 1525;
			this.anIntArrayArray44[8][3] = 2056;
			this.anIntArrayArray44[8][2] = 1590;
			this.anIntArrayArray44[8][1] = 1108;
			this.anIntArrayArray44[8][0] = 1736;
			this.anIntArrayArray44[9][0] = 2088;
			this.anIntArrayArray44[9][2] = 2056;
			this.anIntArrayArray44[9][3] = 2666;
			this.anIntArrayArray44[9][1] = 1766;
			this.anIntArrayArray44[10][3] = 3276;
			this.anIntArrayArray44[10][0] = 2355;
			this.anIntArrayArray44[10][1] = 2409;
			this.anIntArrayArray44[10][2] = 2586;
			this.anIntArrayArray44[11][0] = 2691;
			this.anIntArrayArray44[11][2] = 3148;
			this.anIntArrayArray44[11][3] = 3228;
			this.anIntArrayArray44[11][1] = 3116;
			this.anIntArrayArray44[12][0] = 3031;
			this.anIntArrayArray44[12][2] = 3710;
			this.anIntArrayArray44[12][3] = 3196;
			this.anIntArrayArray44[12][1] = 3806;
			this.anIntArrayArray44[13][3] = 3019;
			this.anIntArrayArray44[13][0] = 3522;
			this.anIntArrayArray44[13][2] = 3421;
			this.anIntArrayArray44[13][1] = 3437;
			this.anIntArrayArray44[14][3] = 3228;
			this.anIntArrayArray44[14][0] = 3727;
			this.anIntArrayArray44[14][2] = 3148;
			this.anIntArrayArray44[14][1] = 3116;
			this.anIntArrayArray44[15][3] = 2746;
			this.anIntArrayArray44[15][1] = 2377;
			this.anIntArrayArray44[15][2] = 2505;
			this.anIntArrayArray44[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray44 = new int[4][4];
			this.anIntArrayArray44[0][3] = 0;
			this.anIntArrayArray44[0][0] = 2048;
			this.anIntArrayArray44[0][1] = 0;
			this.anIntArrayArray44[0][2] = 4096;
			this.anIntArrayArray44[1][3] = 0;
			this.anIntArrayArray44[1][2] = 4096;
			this.anIntArrayArray44[1][0] = 2867;
			this.anIntArrayArray44[1][1] = 4096;
			this.anIntArrayArray44[2][3] = 0;
			this.anIntArrayArray44[2][2] = 4096;
			this.anIntArrayArray44[2][0] = 3276;
			this.anIntArrayArray44[2][1] = 4096;
			this.anIntArrayArray44[3][1] = 4096;
			this.anIntArrayArray44[3][0] = 4096;
			this.anIntArrayArray44[3][3] = 0;
			this.anIntArrayArray44[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(19) int local19 = arg1.method7548();
		if (local19 != 0) {
			this.method3321(local19);
			return;
		}
		this.anIntArrayArray44 = new int[arg1.method7548()][4];
		for (@Pc(35) int local35 = 0; local35 < this.anIntArrayArray44.length; local35++) {
			this.anIntArrayArray44[local35][0] = arg1.method7591();
			this.anIntArrayArray44[local35][1] = arg1.method7548() << 4;
			this.anIntArrayArray44[local35][2] = arg1.method7548() << 4;
			this.anIntArrayArray44[local35][3] = arg1.method7548() << 4;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method7781(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass226_41.method5724(arg0);
		if (super.aClass226_41.aBoolean434) {
			@Pc(26) int[] local26 = this.method7778(0, arg0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static307.anInt4846; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray381[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
	private void method3322() {
		@Pc(14) int local14 = this.anIntArrayArray44.length;
		if (local14 <= 0) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < 257; local21++) {
			@Pc(25) int local25 = 0;
			@Pc(29) int local29 = local21 << 4;
			for (@Pc(31) int local31 = 0; local31 < local14 && local29 >= this.anIntArrayArray44[local31][0]; local31++) {
				local25++;
			}
			@Pc(75) int local75;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(58) int[] local58;
			if (local14 > local25) {
				local58 = this.anIntArrayArray44[local25];
				if (local25 <= 0) {
					local67 = local58[2];
					local71 = local58[3];
					local75 = local58[1];
				} else {
					@Pc(84) int[] local84 = this.anIntArrayArray44[local25 - 1];
					@Pc(101) int local101 = (local29 - local84[0] << 12) / (local58[0] - local84[0]);
					@Pc(106) int local106 = 4096 - local101;
					local71 = local106 * local84[3] + local101 * local58[3] >> 12;
					local67 = local84[2] * local106 + local58[2] * local101 >> 12;
					local75 = local84[1] * local106 + local101 * local58[1] >> 12;
				}
			} else {
				local58 = this.anIntArrayArray44[local14 - 1];
				local75 = local58[1];
				local71 = local58[3];
				local67 = local58[2];
			}
			local75 >>= 0x4;
			local71 >>= 0x4;
			local67 >>= 0x4;
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			if (local75 < 0) {
				local75 = 0;
			} else if (local75 > 255) {
				local75 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			this.anIntArray381[local21] = local71 | local67 << 8 | local75 << 16;
		}
	}
}
