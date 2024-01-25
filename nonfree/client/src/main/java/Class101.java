import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class101 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[J")
	public static final long[] aLongArray7 = new long[11];

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
	private int anInt2515;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	private int anInt2523;

	static {
		for (@Pc(147) int local147 = 0; local147 < 256; local147++) {
			@Pc(154) char local154 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local147 / 2);
			@Pc(170) long local170 = (long) ((local147 & 0x1) == 0 ? local154 >>> 8 : local154 & 0xFF);
			@Pc(174) long local174 = local170 << 1;
			if (local174 >= 256L) {
				local174 ^= 0x11DL;
			}
			@Pc(186) long local186 = local174 << 1;
			if (local186 >= 256L) {
				local186 ^= 0x11DL;
			}
			@Pc(198) long local198 = local186 ^ local170;
			@Pc(202) long local202 = local186 << 1;
			if (local202 >= 256L) {
				local202 ^= 0x11DL;
			}
			@Pc(214) long local214 = local202 ^ local170;
			aLongArrayArray1[0][local147] = Static320.method4600(Static320.method4600(local174 << 8, Static320.method4600(Static320.method4600(local202 << 24, Static320.method4600(Static320.method4600(local186 << 40, Static320.method4600(local170 << 48, local170 << 56)), local170 << 32)), local198 << 16)), local214);
			for (@Pc(250) int local250 = 1; local250 < 8; local250++) {
				aLongArrayArray1[local250][local147] = Static320.method4600(aLongArrayArray1[local250 - 1][local147] >>> 8, aLongArrayArray1[local250 - 1][local147] << 56);
			}
		}
		aLongArray7[0] = 0L;
		for (@Pc(291) int local291 = 1; local291 <= 10; local291++) {
			@Pc(298) int local298 = (local291 - 1) * 8;
			aLongArray7[local291] = Static27.method6635(Static45.method946(255L, aLongArrayArray1[7][local298 + 7]), Static27.method6635(Static45.method946(65280L, aLongArrayArray1[6][local298 + 6]), Static27.method6635(Static45.method946(16711680L, aLongArrayArray1[5][local298 + 5]), Static27.method6635(Static27.method6635(Static45.method946(1095216660480L, aLongArrayArray1[3][local298 + 3]), Static27.method6635(Static45.method946(aLongArrayArray1[2][local298 + 2], 280375465082880L), Static27.method6635(Static45.method946(aLongArrayArray1[0][local298], -72057594037927936L), Static45.method946(71776119061217280L, aLongArrayArray1[1][local298 + 1])))), Static45.method946(4278190080L, aLongArrayArray1[4][local298 + 4])))));
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != arg0) {
			@Pc(12) int local12 = Static181.method2624(arg0, arg1);
			@Pc(16) int local16 = arg1 / local12;
			@Pc(20) int local20 = arg0 / local12;
			this.anInt2515 = local16;
			this.anIntArrayArray13 = new int[local20][14];
			this.anInt2523 = local20;
			for (@Pc(33) int local33 = 0; local33 < local20; local33++) {
				@Pc(40) int[] local40 = this.anIntArrayArray13[local33];
				@Pc(48) double local48 = (double) local33 / (double) local20 + 6.0D;
				@Pc(56) int local56 = (int) Math.floor(local48 + 1.0D - 7.0D);
				if (local56 < 0) {
					local56 = 0;
				}
				@Pc(66) int local66 = (int) Math.ceil(local48 + 7.0D);
				if (local66 > 14) {
					local66 = 14;
				}
				@Pc(79) double local79 = (double) local16 / (double) local20;
				while (local66 > local56) {
					@Pc(89) double local89 = ((double) local56 - local48) * 3.141592653589793D;
					@Pc(91) double local91 = local79;
					if (local89 < -1.0E-4D || local89 > 1.0E-4D) {
						local91 = local79 * (Math.sin(local89) / local89);
					}
					local91 *= Math.cos(((double) local56 - local48) * 0.2243994752564138D) * 0.46D + 0.54D;
					local40[local56] = (int) Math.floor(local91 * 65536.0D + 0.5D);
					local56++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
	public int method2135(@OriginalArg(0) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) this.anInt2515 * (long) arg0 / (long) this.anInt2523);
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[B)[B")
	public byte[] method2137(@OriginalArg(1) byte[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(23) int local23 = (int) ((long) arg0.length * (long) this.anInt2515 / (long) this.anInt2523) + 14;
			@Pc(26) int[] local26 = new int[local23];
			@Pc(28) int local28 = 0;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < arg0.length; local32++) {
				@Pc(38) byte local38 = arg0[local32];
				@Pc(43) int[] local43 = this.anIntArrayArray13[local30];
				for (@Pc(45) int local45 = 0; local45 < 14; local45++) {
					local26[local45 + local28] += local38 * local43[local45];
				}
				local30 += this.anInt2515;
				@Pc(74) int local74 = local30 / this.anInt2523;
				local28 += local74;
				local30 -= local74 * this.anInt2523;
			}
			arg0 = new byte[local23];
			for (@Pc(95) int local95 = 0; local95 < local23; local95++) {
				@Pc(105) int local105 = local26[local95] + 32768 >> 16;
				if (local105 < -128) {
					arg0[local95] = -128;
				} else if (local105 > 127) {
					arg0[local95] = 127;
				} else {
					arg0[local95] = (byte) local105;
				}
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
	public int method2138(@OriginalArg(1) int arg0) {
		if (this.anIntArrayArray13 != null) {
			arg0 = (int) ((long) arg0 * (long) this.anInt2515 / (long) this.anInt2523) + 6;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[S)[S")
	public short[] method2142(@OriginalArg(1) short[] arg0) {
		if (this.anIntArrayArray13 != null) {
			@Pc(19) int local19 = (int) ((long) arg0.length * (long) this.anInt2515 / (long) this.anInt2523) + 14;
			@Pc(22) int[] local22 = new int[local19];
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
				@Pc(34) short local34 = arg0[local28];
				@Pc(39) int[] local39 = this.anIntArrayArray13[local26];
				for (@Pc(41) int local41 = 0; local41 < 14; local41++) {
					local22[local41 + local24] += local34 * local39[local41] >> 2;
				}
				local26 += this.anInt2515;
				@Pc(72) int local72 = local26 / this.anInt2523;
				local26 -= local72 * this.anInt2523;
				local24 += local72;
			}
			arg0 = new short[local19];
			for (@Pc(93) int local93 = 0; local93 < local19; local93++) {
				@Pc(103) int local103 = local22[local93] + 8192 >> 14;
				if (local103 < -32768) {
					arg0[local93] = -32768;
				} else if (local103 > 32767) {
					arg0[local93] = 32767;
				} else {
					arg0[local93] = (short) local103;
				}
			}
		}
		return arg0;
	}
}
