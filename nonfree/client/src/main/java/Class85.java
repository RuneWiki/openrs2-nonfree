import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class85 {

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "[J")
	public static final long[] aLongArray3 = new long[11];

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_3;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "[B")
	public static final byte[] aByteArray17;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
	private int anInt2549;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	public int anInt2551;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	private int anInt2555;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	private int anInt2557;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Lclient!am;")
	public Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt2563;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	public int anInt2564;

	static {
		@Pc(8) int local8;
		for (local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(28) long local28 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(32) long local32 = local28 << 1;
			if (local32 >= 256L) {
				local32 ^= 0x11DL;
			}
			@Pc(46) long local46 = local32 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(58) long local58 = local46 ^ local28;
			@Pc(62) long local62 = local46 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local28 ^ local62;
			aLongArrayArray1[0][local8] = Static552.method7774(local74, Static552.method7774(Static552.method7774(Static552.method7774(local62 << 24, Static552.method7774(local28 << 32, Static552.method7774(local46 << 40, Static552.method7774(local28 << 56, local28 << 48)))), local58 << 16), local32 << 8));
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local8] = Static552.method7774(aLongArrayArray1[local110 - 1][local8] >>> 8, aLongArrayArray1[local110 - 1][local8] << 56);
			}
		}
		aLongArray3[0] = 0L;
		@Pc(158) int local158;
		@Pc(151) int local151;
		for (local151 = 1; local151 <= 10; local151++) {
			local158 = local151 * 8 - 8;
			aLongArray3[local151] = Static403.method6130(Static564.method7997(255L, aLongArrayArray1[7][local158 + 7]), Static403.method6130(Static564.method7997(aLongArrayArray1[6][local158 + 6], 65280L), Static403.method6130(Static403.method6130(Static564.method7997(4278190080L, aLongArrayArray1[4][local158 + 4]), Static403.method6130(Static403.method6130(Static403.method6130(Static564.method7997(-72057594037927936L, aLongArrayArray1[0][local158]), Static564.method7997(71776119061217280L, aLongArrayArray1[1][local158 + 1])), Static564.method7997(aLongArrayArray1[2][local158 + 2], 280375465082880L)), Static564.method7997(aLongArrayArray1[3][local158 + 3], 1095216660480L))), Static564.method7997(aLongArrayArray1[5][local158 + 5], 16711680L))));
		}
		aClass322_3 = new Class322();
		aByteArray17 = new byte[32896];
		local8 = 0;
		for (local151 = 0; local151 < 256; local151++) {
			for (local158 = 0; local158 <= local151; local158++) {
				aByteArray17[local8++] = (byte) (255.0D / Math.sqrt((double) ((float) (local158 * local158 + local151 * local151 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	private Class85() {
		if (Static470.anIntArray518 == null) {
			Static445.method6559();
		}
		this.method2040();
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!r;Lclient!ek;I)V")
	public Class85(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class4_Sub13 arg1, @OriginalArg(2) int arg2) {
		if (Static470.anIntArray518 == null) {
			Static445.method6559();
		}
		this.anInt2551 = arg1.method7004();
		this.aBoolean197 = (this.anInt2551 & 0x8) != 0;
		this.aBoolean198 = (this.anInt2551 & 0x10) != 0;
		this.anInt2551 &= 0x7;
		@Pc(44) int local44 = arg1.method7054() << arg2;
		@Pc(50) int local50 = arg1.method7054() << arg2;
		@Pc(56) int local56 = arg1.method7054() << arg2;
		@Pc(60) int local60 = arg1.method7004();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray24 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray24.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method7054();
			local83 = local79 >>> 8;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			@Pc(94) int local94 = local79 & 0xFF;
			if (local66 - local83 < local94) {
				local94 = local66 - local83;
			}
			this.aShortArray24[local72] = (short) (local94 | local83 << 8);
		}
		local60 = Static209.anInt4422 + (local60 << Static392.anInt3635);
		@Pc(153) int local153 = Static394.anIntArray413 == null ? Static117.anIntArray125[Static369.method7613(arg1.method7054()) & 0xFFFF] : Static394.anIntArray413[arg1.method7054()];
		local83 = arg1.method7004();
		this.anInt2564 = local83 & 0x1F;
		this.anInt2555 = (local83 & 0xE0) << 3;
		if (this.anInt2564 != 31) {
			this.method2040();
		}
		this.method2039(local60, local153, local50, arg0, local44, local56);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
	public void method2037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt2549 = arg1;
		this.anInt2560 = arg3;
		this.anInt2557 = arg0;
		this.anInt2563 = arg2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILclient!r;III)V")
	private void method2039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass4_Sub3_1 = arg3.method7819(arg4, arg5, arg2, arg0, arg1, (float) 1);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	private void method2040() {
		@Pc(8) int local8 = this.anInt2564;
		if (local8 == 2) {
			this.anInt2549 = 0;
			this.anInt2560 = 1;
			this.anInt2557 = 2048;
			this.anInt2563 = 2048;
		} else if (local8 == 3) {
			this.anInt2563 = 4096;
			this.anInt2560 = 1;
			this.anInt2549 = 0;
			this.anInt2557 = 2048;
		} else if (local8 == 4) {
			this.anInt2557 = 2048;
			this.anInt2560 = 4;
			this.anInt2563 = 2048;
			this.anInt2549 = 0;
		} else if (local8 == 5) {
			this.anInt2560 = 4;
			this.anInt2549 = 0;
			this.anInt2557 = 2048;
			this.anInt2563 = 8192;
		} else if (local8 == 12) {
			this.anInt2557 = 2048;
			this.anInt2549 = 0;
			this.anInt2563 = 2048;
			this.anInt2560 = 2;
		} else if (local8 == 13) {
			this.anInt2549 = 0;
			this.anInt2563 = 8192;
			this.anInt2557 = 2048;
			this.anInt2560 = 2;
		} else if (local8 == 10) {
			this.anInt2549 = 1536;
			this.anInt2563 = 2048;
			this.anInt2557 = 512;
			this.anInt2560 = 3;
		} else if (local8 == 11) {
			this.anInt2549 = 1536;
			this.anInt2563 = 4096;
			this.anInt2557 = 512;
			this.anInt2560 = 3;
		} else if (local8 == 6) {
			this.anInt2549 = 1280;
			this.anInt2560 = 3;
			this.anInt2557 = 768;
			this.anInt2563 = 2048;
		} else if (local8 == 7) {
			this.anInt2560 = 3;
			this.anInt2563 = 4096;
			this.anInt2557 = 768;
			this.anInt2549 = 1280;
		} else if (local8 == 8) {
			this.anInt2560 = 3;
			this.anInt2557 = 1024;
			this.anInt2549 = 1024;
			this.anInt2563 = 2048;
		} else if (local8 == 9) {
			this.anInt2560 = 3;
			this.anInt2549 = 1024;
			this.anInt2563 = 4096;
			this.anInt2557 = 1024;
		} else if (local8 == 14) {
			this.anInt2549 = 1280;
			this.anInt2563 = 2048;
			this.anInt2557 = 768;
			this.anInt2560 = 1;
		} else if (local8 == 15) {
			this.anInt2557 = 512;
			this.anInt2560 = 1;
			this.anInt2549 = 1536;
			this.anInt2563 = 4096;
		} else if (local8 == 16) {
			this.anInt2560 = 1;
			this.anInt2563 = 8192;
			this.anInt2549 = 1792;
			this.anInt2557 = 256;
		} else {
			this.anInt2557 = 2048;
			this.anInt2549 = 0;
			this.anInt2563 = 2048;
			this.anInt2560 = 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BZI)V")
	public void method2044(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt2563 * arg1 / 50 + this.anInt2555 & 0x7FF;
			@Pc(26) int local26 = this.anInt2560;
			if (local26 == 1) {
				local9 = (Class262.anIntArray420[local23 << 3] >> 4) + 1024;
			} else if (local26 == 3) {
				local9 = Static470.anIntArray518[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass4_Sub3_1.method4956((float) ((this.anInt2557 * local9 >> 11) + this.anInt2549) / 2048.0F);
	}
}
