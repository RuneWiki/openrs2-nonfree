import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!cea", name = "gb", descriptor = "[J")
	public static final long[] aLongArray2 = new long[11];

	@OriginalMember(owner = "client!cea", name = "Bb", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!cea", name = "Ab", descriptor = "J")
	private long aLong45;

	@OriginalMember(owner = "client!cea", name = "Cb", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!cea", name = "Db", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!cea", name = "Fb", descriptor = "I")
	private int anInt1800;

	@OriginalMember(owner = "client!cea", name = "Gb", descriptor = "I")
	private int anInt1801;

	@OriginalMember(owner = "client!cea", name = "Nb", descriptor = "Lclient!vv;")
	private Class2_Sub48 aClass2_Sub48_1;

	@OriginalMember(owner = "client!cea", name = "Ob", descriptor = "I")
	private int anInt1805;

	@OriginalMember(owner = "client!cea", name = "Pb", descriptor = "Z")
	private boolean aBoolean155;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!cea", name = "u", descriptor = "[I")
	public final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!cea", name = "K", descriptor = "[I")
	private final int[] anIntArray129 = new int[16];

	@OriginalMember(owner = "client!cea", name = "Y", descriptor = "[I")
	private final int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "[I")
	private final int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!cea", name = "L", descriptor = "[I")
	private final int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!cea", name = "U", descriptor = "[[Lclient!gga;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray1 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!cea", name = "cb", descriptor = "[I")
	public final int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!cea", name = "S", descriptor = "[I")
	private final int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!cea", name = "ib", descriptor = "[I")
	public final int[] anIntArray135 = new int[16];

	@OriginalMember(owner = "client!cea", name = "kb", descriptor = "[I")
	private final int[] anIntArray136 = new int[16];

	@OriginalMember(owner = "client!cea", name = "sb", descriptor = "[[Lclient!gga;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray2 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!cea", name = "W", descriptor = "[I")
	private final int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!cea", name = "R", descriptor = "I")
	private final int anInt1775 = 1000000;

	@OriginalMember(owner = "client!cea", name = "fb", descriptor = "I")
	private int anInt1784 = 256;

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!cea", name = "E", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!cea", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "Lclient!rd;")
	private final Class297 aClass297_1 = new Class297();

	@OriginalMember(owner = "client!cea", name = "Eb", descriptor = "Lclient!ov;")
	private final Class2_Sub11_Sub5 aClass2_Sub11_Sub5_1 = new Class2_Sub11_Sub5(this);

	@OriginalMember(owner = "client!cea", name = "N", descriptor = "Lclient!tba;")
	private final Class323 aClass323_7;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(44) long local44 = local32 << 1;
			if (local44 >= 256L) {
				local44 ^= 0x11DL;
			}
			@Pc(56) long local56 = local28 ^ local44;
			@Pc(60) long local60 = local44 << 1;
			if (local60 >= 256L) {
				local60 ^= 0x11DL;
			}
			@Pc(74) long local74 = local60 ^ local28;
			aLongArrayArray1[0][local8] = Static527.method7323(Static527.method7323(Static527.method7323(local56 << 16, Static527.method7323(Static527.method7323(Static527.method7323(local44 << 40, Static527.method7323(local28 << 56, local28 << 48)), local28 << 32), local60 << 24)), local32 << 8), local74);
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static527.method7323(aLongArrayArray1[local110 - 1][local8] << 56, aLongArrayArray1[local110 - 1][local8] >>> 8);
			}
		}
		aLongArray2[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = (local151 - 1) * 8;
			aLongArray2[local151] = Static31.method729(Static31.method729(Static225.method3619(aLongArrayArray1[6][local158 + 6], 65280L), Static31.method729(Static31.method729(Static225.method3619(4278190080L, aLongArrayArray1[4][local158 + 4]), Static31.method729(Static225.method3619(1095216660480L, aLongArrayArray1[3][local158 + 3]), Static31.method729(Static31.method729(Static225.method3619(aLongArrayArray1[0][local158], -72057594037927936L), Static225.method3619(71776119061217280L, aLongArrayArray1[1][local158 + 1])), Static225.method3619(aLongArrayArray1[2][local158 + 2], 280375465082880L)))), Static225.method3619(aLongArrayArray1[5][local158 + 5], 16711680L))), Static225.method3619(aLongArrayArray1[7][local158 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub1() {
		this.aClass323_7 = new Class323(128);
		this.method1528(-1, 256);
		this.method1511(true);
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!cea;)V")
	public Class2_Sub11_Sub1(@OriginalArg(0) Class2_Sub11_Sub1 arg0) {
		this.aClass323_7 = arg0.aClass323_7;
		this.method1528(-1, 256);
		this.method1511(true);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!gga;)I")
	private int method1501(@OriginalArg(1) Class2_Sub21 arg0) {
		if (this.anIntArray124[arg0.anInt3656] == 0) {
			return 0;
		}
		@Pc(25) Class109 local25 = arg0.aClass109_1;
		@Pc(41) int local41 = this.anIntArray128[arg0.anInt3656] * this.anIntArray132[arg0.anInt3656] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = local49 * arg0.anInt3664 + 16384 >> 15;
		@Pc(67) int local67 = local58 * this.anInt1784 + 128 >> 8;
		local41 = local67 * this.anIntArray124[arg0.anInt3656] + 128 >> 8;
		if (local25.anInt3101 > 0) {
			local41 = (int) (Math.pow(0.5D, (double) local25.anInt3101 * (double) arg0.anInt3647 * 1.953125E-5D) * (double) local41 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local25.aByteArray24 != null) {
			local106 = arg0.anInt3662;
			local114 = local25.aByteArray24[arg0.anInt3653 + 1];
			if (arg0.anInt3653 < local25.aByteArray24.length - 2) {
				local132 = (local25.aByteArray24[arg0.anInt3653] & 0xFF) << 8;
				local144 = (local25.aByteArray24[arg0.anInt3653 + 2] & 0xFF) << 8;
				local114 += (local25.aByteArray24[arg0.anInt3653 + 3] - local114) * (local106 + -local132) / (local144 - local132);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		if (arg0.anInt3646 > 0 && local25.aByteArray23 != null) {
			local106 = arg0.anInt3646;
			local114 = local25.aByteArray23[arg0.anInt3657 + 1];
			if (arg0.anInt3657 < local25.aByteArray23.length - 2) {
				local132 = (local25.aByteArray23[arg0.anInt3657] & 0xFF) << 8;
				local144 = (local25.aByteArray23[arg0.anInt3657 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (local25.aByteArray23[arg0.anInt3657 + 3] + -local114) / (local144 - local132);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[ILclient!gga;IB)Z")
	public boolean method1502(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub21 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt3663 = Static489.anInt8544 / 100;
		if (arg2.anInt3646 >= 0 && (arg2.aClass2_Sub11_Sub4_1 == null || arg2.aClass2_Sub11_Sub4_1.method3346())) {
			arg2.method3127();
			arg2.method8920();
			if (arg2.anInt3661 > 0 && arg2 == this.aClass2_Sub21ArrayArray2[arg2.anInt3656][arg2.anInt3661]) {
				this.aClass2_Sub21ArrayArray2[arg2.anInt3656][arg2.anInt3661] = null;
			}
			return true;
		}
		@Pc(62) int local62 = arg2.anInt3651;
		if (local62 > 0) {
			local62 -= (int) (Math.pow(2.0D, (double) this.lb[arg2.anInt3656] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local62 < 0) {
				local62 = 0;
			}
			arg2.anInt3651 = local62;
		}
		arg2.aClass2_Sub11_Sub4_1.method3357(this.method1504(arg2));
		@Pc(99) Class109 local99 = arg2.aClass109_1;
		arg2.anInt3648++;
		arg2.anInt3655 += local99.anInt3103;
		@Pc(114) boolean local114 = false;
		@Pc(132) double local132 = (double) ((arg2.anInt3651 * arg2.anInt3666 >> 12) + (arg2.anInt3654 - 60 << 8)) * 5.086263020833333E-6D;
		if (local99.anInt3101 > 0) {
			if (local99.anInt3104 > 0) {
				arg2.anInt3647 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt3104) * 128.0D + 0.5D);
			} else {
				arg2.anInt3647 += 128;
			}
			if (local99.anInt3101 * arg2.anInt3647 >= 819200) {
				local114 = true;
			}
		}
		if (local99.aByteArray24 != null) {
			if (local99.anInt3095 > 0) {
				arg2.anInt3662 += (int) (Math.pow(2.0D, (double) local99.anInt3095 * local132) * 128.0D + 0.5D);
			} else {
				arg2.anInt3662 += 128;
			}
			while (local99.aByteArray24.length - 2 > arg2.anInt3653 && (local99.aByteArray24[arg2.anInt3653 + 2] & 0xFF) << 8 < arg2.anInt3662) {
				arg2.anInt3653 += 2;
			}
			if (local99.aByteArray24.length - 2 == arg2.anInt3653 && local99.aByteArray24[arg2.anInt3653 + 1] == 0) {
				local114 = true;
			}
		}
		if (arg2.anInt3646 >= 0 && local99.aByteArray23 != null && (this.anIntArray134[arg2.anInt3656] & 0x1) == 0 && (arg2.anInt3661 < 0 || this.aClass2_Sub21ArrayArray2[arg2.anInt3656][arg2.anInt3661] != arg2)) {
			if (local99.anInt3096 > 0) {
				arg2.anInt3646 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt3096) * 128.0D + 0.5D);
			} else {
				arg2.anInt3646 += 128;
			}
			while (local99.aByteArray23.length - 2 > arg2.anInt3657 && arg2.anInt3646 > (local99.aByteArray23[arg2.anInt3657 + 2] & 0xFF) << 8) {
				arg2.anInt3657 += 2;
			}
			if (arg2.anInt3657 == local99.aByteArray23.length - 2) {
				local114 = true;
			}
		}
		if (!local114) {
			arg2.aClass2_Sub11_Sub4_1.method3337(arg2.anInt3663, this.method1501(arg2), this.method1515(arg2));
			return false;
		}
		arg2.aClass2_Sub11_Sub4_1.method3348(arg2.anInt3663);
		if (arg1 == null) {
			arg2.aClass2_Sub11_Sub4_1.method6159(arg0);
		} else {
			arg2.aClass2_Sub11_Sub4_1.method6155(arg1, arg3, arg0);
		}
		if (arg2.aClass2_Sub11_Sub4_1.method3361()) {
			this.aClass2_Sub11_Sub5_1.aClass2_Sub11_Sub2_1.method2952(arg2.aClass2_Sub11_Sub4_1);
		}
		arg2.method3127();
		if (arg2.anInt3646 >= 0) {
			arg2.method8920();
			if (arg2.anInt3661 > 0 && this.aClass2_Sub21ArrayArray2[arg2.anInt3656][arg2.anInt3661] == arg2) {
				this.aClass2_Sub21ArrayArray2[arg2.anInt3656][arg2.anInt3661] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)I")
	public int method1503() {
		return this.anInt1784;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLclient!gga;)I")
	private int method1504(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(19) int local19 = (arg0.anInt3666 * arg0.anInt3651 >> 12) + arg0.anInt3649;
		local19 += this.anIntArray130[arg0.anInt3656] * (this.anIntArray122[arg0.anInt3656] - 8192) >> 12;
		@Pc(40) Class109 local40 = arg0.aClass109_1;
		@Pc(66) int local66;
		if (local40.anInt3103 > 0 && (local40.anInt3107 > 0 || this.anIntArray123[arg0.anInt3656] > 0)) {
			local66 = local40.anInt3107 << 2;
			@Pc(71) int local71 = local40.anInt3098 << 1;
			if (local71 > arg0.anInt3648) {
				local66 = arg0.anInt3648 * local66 / local71;
			}
			local66 += this.anIntArray123[arg0.anInt3656] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt3655 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) (local105 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass2_Sub14_Sub1_1.anInt2196 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static489.anInt8544 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IBI)V")
	private void method1505() {
		this.anIntArray136[9] = 128;
		this.anIntArray127[9] = 128;
		this.method1513(128, 9);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IB)V")
	private void method1506(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local7 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1522(local22, local16, local28);
		} else if (local7 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1520(local22, local16, local28);
			} else {
				this.method1522(local22, local16, 64);
			}
		} else if (local7 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1532(local28, local16, local22);
		} else if (local7 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray127[local16] = (local28 << 14) + (this.anIntArray127[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray127[local16] = (this.anIntArray127[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray123[local16] = (this.anIntArray123[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray123[local16] = local28 + (this.anIntArray123[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.lb[local16] = (local28 << 7) + (this.lb[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.lb[local16] = local28 + (this.lb[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray132[local16] = (this.anIntArray132[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray132[local16] = (this.anIntArray132[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray131[local16] = (this.anIntArray131[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray131[local16] = (this.anIntArray131[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray128[local16] = (this.anIntArray128[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray128[local16] = (this.anIntArray128[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray134[local16] |= 0x1;
				} else {
					this.anIntArray134[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method1527(local16);
					this.anIntArray134[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray134[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray129[local16] = (this.anIntArray129[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray129[local16] = local28 + (this.anIntArray129[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray129[local16] = (this.anIntArray129[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray129[local16] = local28 + (this.anIntArray129[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method1535(local16);
			}
			if (local22 == 121) {
				this.method1512(local16);
			}
			if (local22 == 123) {
				this.method1523(local16);
			}
			@Pc(522) int local522;
			if (local22 == 6) {
				local522 = this.anIntArray129[local16];
				if (local522 == 16384) {
					this.anIntArray130[local16] = (local28 << 7) + (this.anIntArray130[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local522 = this.anIntArray129[local16];
				if (local522 == 16384) {
					this.anIntArray130[local16] = (this.anIntArray130[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray125[local16] = (this.anIntArray125[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray125[local16] = (this.anIntArray125[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method1507(local16);
					this.anIntArray134[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray134[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method1534((local28 << 7) + (this.anIntArray133[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method1534(local28 + (this.anIntArray133[local16] & 0xFFFFFF80), local16);
			}
		} else if (local7 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1513(this.anIntArray127[local16] + local22, local16);
		} else if (local7 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1521(local22, local16);
		} else if (local7 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F5F) >> 8);
			this.method1536(local22, local16);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method1511(true);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)V")
	private void method1507(@OriginalArg(0) int arg0) {
		if ((this.anIntArray134[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) Class2_Sub21 local17 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2772(); local17 != null; local17 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2762()) {
			if (arg0 == local17.anInt3656) {
				local17.anInt3658 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BZ)V")
	private synchronized void method1508(@OriginalArg(1) boolean arg0) {
		this.aClass297_1.method6868();
		this.aClass2_Sub48_1 = null;
		this.method1511(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "()I")
	@Override
	public synchronized int method6161() {
		return 0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZLclient!gga;I)V")
	public void method1509(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		@Pc(8) int local8 = arg1.aClass2_Sub14_Sub1_1.aByteArray17.length;
		@Pc(46) int local46;
		if (arg0 && arg1.aClass2_Sub14_Sub1_1.aBoolean184) {
			@Pc(29) int local29 = local8 + local8 - arg1.aClass2_Sub14_Sub1_1.anInt2197;
			local8 <<= 0x8;
			local46 = (int) ((long) this.anIntArray125[arg1.anInt3656] * (long) local29 >> 6);
			if (local8 <= local46) {
				arg1.aClass2_Sub11_Sub4_1.method3352();
				local46 = local8 + local8 - local46 - 1;
			}
		} else {
			local46 = (int) ((long) local8 * (long) this.anIntArray125[arg1.anInt3656] >> 6);
		}
		arg1.aClass2_Sub11_Sub4_1.method3334(local46);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZI)V")
	public synchronized void method1510(@OriginalArg(1) int arg0) {
		this.anInt1784 = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)V")
	private void method1511(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1535(-1);
		} else {
			this.method1523(-1);
		}
		this.method1512(-1);
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			this.anIntArray126[local28] = this.anIntArray136[local28];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray127[local45] = this.anIntArray136[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)V")
	private void method1512(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1512(local10);
			}
			return;
		}
		this.anIntArray132[arg0] = 12800;
		this.anIntArray131[arg0] = 8192;
		this.anIntArray128[arg0] = 16383;
		this.anIntArray122[arg0] = 8192;
		this.anIntArray123[arg0] = 0;
		this.lb[arg0] = 8192;
		this.method1527(arg0);
		this.method1507(arg0);
		this.anIntArray134[arg0] = 0;
		this.anIntArray129[arg0] = 32767;
		this.anIntArray130[arg0] = 256;
		this.anIntArray125[arg0] = 0;
		this.method1534(8192, arg0);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(III)V")
	private void method1513(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray126[arg1]) {
			this.anIntArray126[arg1] = arg0;
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				this.aClass2_Sub21ArrayArray2[arg1][local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZZILclient!vv;)V")
	private synchronized void method1514(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class2_Sub48 arg2) {
		this.method1508(arg0);
		this.aClass297_1.method6870(arg2.aByteArray105);
		this.aBoolean154 = arg1;
		this.aLong45 = 0L;
		@Pc(22) int local22 = this.aClass297_1.method6869();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			this.aClass297_1.method6862(local24);
			this.aClass297_1.method6867(local24);
			this.aClass297_1.method6865(local24);
		}
		this.anInt1801 = this.aClass297_1.method6864();
		this.anInt1800 = this.aClass297_1.anIntArray563[this.anInt1801];
		this.aLong46 = this.aClass297_1.method6860(this.anInt1800);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!gga;Z)I")
	private int method1515(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(17) int local17 = this.anIntArray131[arg0.anInt3656];
		return local17 < 8192 ? local17 * arg0.anInt3650 + 32 >> 6 : 16384 - ((16384 - local17) * (-arg0.anInt3650 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!vv;ZJZZ)V")
	public synchronized void method1516(@OriginalArg(0) Class2_Sub48 arg0, @OriginalArg(2) long arg1, @OriginalArg(4) boolean arg2) {
		this.method1514(true, arg2, arg0);
		this.method1524((long) this.aClass297_1.anInt7847 * arg1);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!vv;IILclient!nd;Lclient!cm;)Z")
	public synchronized boolean method1517(@OriginalArg(0) Class2_Sub48 arg0, @OriginalArg(3) Class238 arg1, @OriginalArg(4) Class58 arg2) {
		arg0.method8654();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub5 local34 = (Class2_Sub5) arg0.aClass323_42.method7480(); local34 != null; local34 = (Class2_Sub5) arg0.aClass323_42.method7482()) {
			@Pc(40) int local40 = (int) local34.aLong278;
			@Pc(48) Class2_Sub9 local48 = (Class2_Sub9) this.aClass323_7.method7484((long) local40);
			if (local48 == null) {
				local48 = Static345.method8055(arg1, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass323_7.method7477(local48, (long) local40);
			}
			if (!local48.method1216(local28, local34.aByteArray4, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method8655();
		}
		return local9;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
	private void method1518() {
		@Pc(6) int local6 = this.anInt1801;
		@Pc(15) int local15 = this.anInt1800;
		@Pc(18) long local18 = this.aLong46;
		if (this.aClass2_Sub48_1 != null && this.anInt1805 == local15) {
			this.method1514(this.aBoolean155, this.aBoolean154, this.aClass2_Sub48_1);
			this.method1518();
			return;
		}
		while (local15 == this.anInt1800) {
			while (this.aClass297_1.anIntArray563[local6] == local15) {
				this.aClass297_1.method6862(local6);
				@Pc(51) int local51 = this.aClass297_1.method6866(local6);
				if (local51 == 1) {
					this.aClass297_1.method6871();
					this.aClass297_1.method6865(local6);
					if (this.aClass297_1.method6872()) {
						if (this.aClass2_Sub48_1 != null) {
							this.method1539(this.aClass2_Sub48_1, this.aBoolean154);
							this.method1518();
							return;
						}
						if (!this.aBoolean154 || local15 == 0) {
							this.method1511(true);
							this.aClass297_1.method6868();
							return;
						}
						this.aClass297_1.method6859(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method1506(local51);
				}
				this.aClass297_1.method6867(local6);
				this.aClass297_1.method6865(local6);
			}
			local6 = this.aClass297_1.method6864();
			local15 = this.aClass297_1.anIntArray563[local6];
			local18 = this.aClass297_1.method6860(local15);
		}
		this.anInt1801 = local6;
		this.anInt1800 = local15;
		this.aLong46 = local18;
		if (this.aClass2_Sub48_1 != null && local15 > this.anInt1805) {
			this.anInt1801 = -1;
			this.anInt1800 = this.anInt1805;
			this.aLong46 = this.aClass297_1.method6860(this.anInt1800);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)V")
	private void method1520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1522(arg0, arg1, 64);
		if ((this.anIntArray134[arg1] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub21 local25 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2758(); local25 != null; local25 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2770()) {
				if (arg1 == local25.anInt3656 && local25.anInt3646 < 0) {
					this.aClass2_Sub21ArrayArray1[arg1][local25.anInt3654] = null;
					this.aClass2_Sub21ArrayArray1[arg1][arg0] = local25;
					@Pc(67) int local67 = local25.anInt3649 + (local25.anInt3651 * local25.anInt3666 >> 12);
					local25.anInt3649 += arg0 - local25.anInt3654 << 8;
					local25.anInt3666 = local67 - local25.anInt3649;
					local25.anInt3651 = 4096;
					local25.anInt3654 = arg0;
					return;
				}
			}
		}
		@Pc(115) Class2_Sub9 local115 = (Class2_Sub9) this.aClass323_7.method7484((long) this.anIntArray126[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class2_Sub14_Sub1 local123 = local115.aClass2_Sub14_Sub1Array1[arg0];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class2_Sub21 local130 = new Class2_Sub21();
		local130.aClass2_Sub9_1 = local115;
		local130.anInt3656 = arg1;
		local130.aClass2_Sub14_Sub1_1 = local123;
		local130.aClass109_1 = local115.aClass109Array1[arg0];
		local130.anInt3661 = local115.aByteArray10[arg0];
		local130.anInt3654 = arg0;
		local130.anInt3664 = local115.aByteArray8[arg0] * local115.anInt1306 * arg2 * arg2 + 1024 >> 11;
		local130.anInt3650 = local115.aByteArray9[arg0] & 0xFF;
		local130.anInt3649 = (arg0 << 8) - (local115.aShortArray17[arg0] & 0x7FFF);
		local130.anInt3647 = 0;
		local130.anInt3662 = 0;
		local130.anInt3657 = 0;
		local130.anInt3653 = 0;
		local130.anInt3646 = -1;
		if (this.anIntArray125[arg1] == 0) {
			local130.aClass2_Sub11_Sub4_1 = Static653.method3343(local123, this.method1504(local130), this.method1501(local130), this.method1515(local130));
		} else {
			local130.aClass2_Sub11_Sub4_1 = Static653.method3343(local123, this.method1504(local130), 0, this.method1515(local130));
			this.method1509(local115.aShortArray17[arg0] < 0, local130);
		}
		if (local115.aShortArray17[arg0] < 0) {
			local130.aClass2_Sub11_Sub4_1.method3341(-1);
		}
		if (local130.anInt3661 >= 0) {
			@Pc(285) Class2_Sub21 local285 = this.aClass2_Sub21ArrayArray2[arg1][local130.anInt3661];
			if (local285 != null && local285.anInt3646 < 0) {
				this.aClass2_Sub21ArrayArray1[arg1][local285.anInt3654] = null;
				local285.anInt3646 = 0;
			}
			this.aClass2_Sub21ArrayArray2[arg1][local130.anInt3661] = local130;
		}
		this.aClass2_Sub11_Sub5_1.aClass114_37.method2771(local130);
		this.aClass2_Sub21ArrayArray1[arg1][arg0] = local130;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIB)V")
	private void method1521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZII)V")
	private void method1522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2_Sub21 local16 = this.aClass2_Sub21ArrayArray1[arg1][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass2_Sub21ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray134[arg1] & 0x2) == 0) {
			local16.anInt3646 = 0;
			return;
		}
		for (@Pc(40) Class2_Sub21 local40 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2772(); local40 != null; local40 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2762()) {
			if (local40.anInt3656 == local16.anInt3656 && local40.anInt3646 < 0 && local16 != local40) {
				local16.anInt3646 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(II)V")
	private void method1523(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class2_Sub21 local6 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2772(); local6 != null; local6 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2762()) {
			if ((arg0 < 0 || local6.anInt3656 == arg0) && local6.anInt3646 < 0) {
				this.aClass2_Sub21ArrayArray1[local6.anInt3656][local6.anInt3654] = null;
				local6.anInt3646 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IJ)V")
	private void method1524(@OriginalArg(1) long arg0) {
		while (this.aLong46 <= arg0) {
			@Pc(13) int local13 = this.anInt1801;
			@Pc(16) int local16 = this.anInt1800;
			@Pc(19) long local19 = this.aLong46;
			while (local16 == this.anInt1800) {
				while (this.aClass297_1.anIntArray563[local13] == local16) {
					this.aClass297_1.method6862(local13);
					@Pc(29) int local29 = this.aClass297_1.method6866(local13);
					if (local29 == 1) {
						this.aClass297_1.method6871();
						this.aClass297_1.method6865(local13);
						if (this.aClass297_1.method6872()) {
							if (!this.aBoolean154 || local16 == 0) {
								this.method1511(true);
								this.aClass297_1.method6868();
								return;
							}
							this.aClass297_1.method6859(local19);
						}
						break;
					}
					if ((local29 & 0x80) != 0 && (local29 & 0xF0) != 144) {
						this.method1506(local29);
					}
					this.aClass297_1.method6867(local13);
					this.aClass297_1.method6865(local13);
				}
				this.aLong45 = local19;
				local13 = this.aClass297_1.method6864();
				local16 = this.aClass297_1.anIntArray563[local13];
				local19 = this.aClass297_1.method6860(local16);
			}
			this.anInt1800 = local16;
			this.anInt1801 = local13;
			this.aLong46 = local19;
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "()Lclient!lea;")
	@Override
	public synchronized Class2_Sub11 method6157() {
		return null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass297_1.method6863()) {
			@Pc(14) int local14 = this.anInt1775 * this.aClass297_1.anInt7847 / Static489.anInt8544;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong45;
				if (this.aLong46 - local23 >= 0L) {
					this.aLong45 = local23;
					break;
				}
				@Pc(50) int local50 = (int) (((long) local14 + this.aLong46 - this.aLong45 - 1L) / (long) local14);
				this.aLong45 += (long) local14 * (long) local50;
				this.aClass2_Sub11_Sub5_1.method6155(arg0, arg1, local50);
				arg2 -= local50;
				arg1 += local50;
				this.method1518();
			} while (this.aClass297_1.method6863());
		}
		this.aClass2_Sub11_Sub5_1.method6155(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Z)V")
	public synchronized void method1525() {
		this.method1508(true);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6159(@OriginalArg(0) int arg0) {
		if (this.aClass297_1.method6863()) {
			@Pc(12) int local12 = this.aClass297_1.anInt7847 * this.anInt1775 / Static489.anInt8544;
			do {
				@Pc(21) long local21 = (long) local12 * (long) arg0 + this.aLong45;
				if (this.aLong46 - local21 >= 0L) {
					this.aLong45 = local21;
					break;
				}
				@Pc(49) int local49 = (int) (((long) local12 + this.aLong46 - this.aLong45 - 1L) / (long) local12);
				this.aLong45 += (long) local49 * (long) local12;
				this.aClass2_Sub11_Sub5_1.method6159(local49);
				arg0 -= local49;
				this.method1518();
			} while (this.aClass297_1.method6863());
		}
		this.aClass2_Sub11_Sub5_1.method6159(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(B)V")
	public synchronized void method1526() {
		for (@Pc(7) Class2_Sub9 local7 = (Class2_Sub9) this.aClass323_7.method7480(); local7 != null; local7 = (Class2_Sub9) this.aClass323_7.method7482()) {
			local7.method1217();
		}
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(II)V")
	private void method1527(@OriginalArg(0) int arg0) {
		if ((this.anIntArray134[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub21 local24 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2772(); local24 != null; local24 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2762()) {
			if (local24.anInt3656 == arg0 && this.aClass2_Sub21ArrayArray1[arg0][local24.anInt3654] == null && local24.anInt3646 < 0) {
				local24.anInt3646 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(III)V")
	public synchronized void method1528(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray124[arg0] = arg1;
		} else {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.anIntArray124[local13] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ILclient!gga;)Z")
	public boolean method1529(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.aClass2_Sub11_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt3646 >= 0) {
			arg0.method8920();
			if (arg0.anInt3661 > 0 && this.aClass2_Sub21ArrayArray2[arg0.anInt3656][arg0.anInt3661] == arg0) {
				this.aClass2_Sub21ArrayArray2[arg0.anInt3656][arg0.anInt3661] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(B)Z")
	public synchronized boolean method1530() {
		return this.aClass297_1.method6863();
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(IIB)V")
	public synchronized void method1531() {
		this.method1505();
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(IIII)V")
	private void method1532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "()Lclient!lea;")
	@Override
	public synchronized Class2_Sub11 method6156() {
		return this.aClass2_Sub11_Sub5_1;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(III)V")
	private void method1534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray133[arg1] = arg0;
		this.anIntArray135[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(IB)V")
	private void method1535(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class2_Sub21 local6 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2772(); local6 != null; local6 = (Class2_Sub21) this.aClass2_Sub11_Sub5_1.aClass114_37.method2762()) {
			if (arg0 < 0 || local6.anInt3656 == arg0) {
				if (local6.aClass2_Sub11_Sub4_1 != null) {
					local6.aClass2_Sub11_Sub4_1.method3348(Static489.anInt8544 / 100);
					if (local6.aClass2_Sub11_Sub4_1.method3361()) {
						this.aClass2_Sub11_Sub5_1.aClass2_Sub11_Sub2_1.method2952(local6.aClass2_Sub11_Sub4_1);
					}
					local6.method3127();
				}
				if (local6.anInt3646 < 0) {
					this.aClass2_Sub21ArrayArray1[local6.anInt3656][local6.anInt3654] = null;
				}
				local6.method8920();
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(III)V")
	private void method1536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray122[arg1] = arg0;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V")
	public synchronized void method1537() {
		for (@Pc(15) Class2_Sub9 local15 = (Class2_Sub9) this.aClass323_7.method7480(); local15 != null; local15 = (Class2_Sub9) this.aClass323_7.method7482()) {
			local15.method8920();
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!vv;ZZ)V")
	public synchronized void method1539(@OriginalArg(0) Class2_Sub48 arg0, @OriginalArg(1) boolean arg1) {
		this.method1514(true, arg1, arg0);
	}
}
