import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public class Class303 {

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "[J")
	public static final long[] aLongArray18 = new long[11];

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "[[J")
	public static final long[][] aLongArrayArray3 = new long[8][256];

	@OriginalMember(owner = "client!sr", name = "o", descriptor = "Lclient!sda;")
	private Class4_Sub13 aClass4_Sub13_8;

	@OriginalMember(owner = "client!sr", name = "u", descriptor = "[I")
	public int[] anIntArray722;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "I")
	private int anInt9746;

	@OriginalMember(owner = "client!sr", name = "H", descriptor = "I")
	public int anInt9750;

	@OriginalMember(owner = "client!sr", name = "J", descriptor = "I")
	public int anInt9752;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	private final int anInt9730 = 32;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "Z")
	private boolean aBoolean683 = false;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "J")
	private long aLong304 = Static184.method3422();

	@OriginalMember(owner = "client!sr", name = "B", descriptor = "J")
	private long aLong305 = 0L;

	@OriginalMember(owner = "client!sr", name = "C", descriptor = "I")
	private int anInt9749 = 0;

	@OriginalMember(owner = "client!sr", name = "D", descriptor = "[Lclient!sda;")
	private final Class4_Sub13[] aClass4_Sub13Array5 = new Class4_Sub13[8];

	@OriginalMember(owner = "client!sr", name = "z", descriptor = "I")
	private int anInt9747 = 0;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "I")
	private int anInt9748 = 0;

	@OriginalMember(owner = "client!sr", name = "G", descriptor = "[Lclient!sda;")
	private final Class4_Sub13[] aClass4_Sub13Array6 = new Class4_Sub13[8];

	@OriginalMember(owner = "client!sr", name = "I", descriptor = "I")
	private int anInt9751 = 0;

	@OriginalMember(owner = "client!sr", name = "K", descriptor = "J")
	private long aLong306 = 0L;

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "Z")
	private boolean aBoolean684 = true;

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(22) char local22 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local15 / 2);
			@Pc(38) long local38 = (long) ((local15 & 0x1) == 0 ? local22 >>> 8 : local22 & 0xFF);
			@Pc(42) long local42 = local38 << 1;
			if (local42 >= 256L) {
				local42 ^= 0x11DL;
			}
			@Pc(54) long local54 = local42 << 1;
			if (local54 >= 256L) {
				local54 ^= 0x11DL;
			}
			@Pc(68) long local68 = local38 ^ local54;
			@Pc(72) long local72 = local54 << 1;
			if (local72 >= 256L) {
				local72 ^= 0x11DL;
			}
			@Pc(84) long local84 = local38 ^ local72;
			aLongArrayArray3[0][local15] = Static174.method3323(local84, Static174.method3323(local42 << 8, Static174.method3323(local68 << 16, Static174.method3323(Static174.method3323(local38 << 32, Static174.method3323(local54 << 40, Static174.method3323(local38 << 56, local38 << 48))), local72 << 24))));
			for (@Pc(120) int local120 = 1; local120 < 8; local120++) {
				aLongArrayArray3[local120][local15] = Static174.method3323(aLongArrayArray3[local120 - 1][local15] >>> 8, aLongArrayArray3[local120 - 1][local15] << 56);
			}
		}
		aLongArray18[0] = 0L;
		for (@Pc(161) int local161 = 1; local161 <= 10; local161++) {
			@Pc(168) int local168 = (local161 - 1) * 8;
			aLongArray18[local161] = Static550.method7600(Static550.method7600(Static550.method7600(Static218.method3781(aLongArrayArray3[5][local168 + 5], 16711680L), Static550.method7600(Static550.method7600(Static218.method3781(1095216660480L, aLongArrayArray3[3][local168 + 3]), Static550.method7600(Static550.method7600(Static218.method3781(aLongArrayArray3[0][local168], -72057594037927936L), Static218.method3781(71776119061217280L, aLongArrayArray3[1][local168 + 1])), Static218.method3781(aLongArrayArray3[2][local168 + 2], 280375465082880L))), Static218.method3781(4278190080L, aLongArrayArray3[4][local168 + 4]))), Static218.method3781(aLongArrayArray3[6][local168 + 6], 65280L)), Static218.method3781(aLongArrayArray3[7][local168 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZLclient!sda;)V")
	private void method7973(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class4_Sub13 local12 = this.aClass4_Sub13Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub13Array6[local7] = arg1;
		} else {
			local12.aClass4_Sub13_5 = arg1;
		}
		this.aClass4_Sub13Array5[local7] = arg1;
		arg1.anInt7510 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "([II)V")
	private void method7974(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static558.aBoolean667) {
			local1 = 512;
		}
		Static602.method1583(arg0, 0, local1);
		this.anInt9751 -= 256;
		if (this.aClass4_Sub13_8 != null && this.anInt9751 <= 0) {
			this.anInt9751 += Static379.anInt7010 >> 4;
			Static353.method5228(this.aClass4_Sub13_8);
			this.method7973(this.aClass4_Sub13_8.method6218(), this.aClass4_Sub13_8);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class4_Sub13 local88 = null;
						@Pc(93) Class4_Sub13 local93 = this.aClass4_Sub13Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub16 local97 = local93.aClass4_Sub16_5;
								if (local97 == null || local97.anInt3113 <= local61) {
									local93.aBoolean532 = true;
									@Pc(121) int local121 = local93.method6217();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3113 += local121;
									}
									if (local45 >= this.anInt9730) {
										break label103;
									}
									@Pc(140) Class4_Sub13 local140 = local93.method6220();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7510;
										while (local140 != null) {
											this.method7973(local145 * local140.method6218() >> 8, local140);
											local140 = local93.method6216();
										}
									}
									@Pc(164) Class4_Sub13 local164 = local93.aClass4_Sub13_5;
									local93.aClass4_Sub13_5 = null;
									if (local88 == null) {
										this.aClass4_Sub13Array6[local56] = local164;
									} else {
										local88.aClass4_Sub13_5 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub13Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub13_5;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class4_Sub13 local207 = this.aClass4_Sub13Array6[local56];
				this.aClass4_Sub13Array6[local56] = this.aClass4_Sub13Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub13 local221 = local207.aClass4_Sub13_5;
					local207.aClass4_Sub13_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9751 < 0) {
			this.anInt9751 = 0;
		}
		if (this.aClass4_Sub13_8 != null) {
			this.aClass4_Sub13_8.method6221(arg0, 0, 256);
		}
		this.aLong304 = Static184.method3422();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZLclient!sda;)V")
	public final synchronized void method7975(@OriginalArg(1) Class4_Sub13 arg0) {
		this.aClass4_Sub13_8 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
	protected void method7976() throws Exception {
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	public final synchronized void method7977() {
		if (Static141.aClass229_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static141.aClass229_1.aClass303Array1[local11] == this) {
					Static141.aClass229_1.aClass303Array1[local11] = null;
				}
				if (Static141.aClass229_1.aClass303Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static141.aClass229_1.aBoolean443 = true;
				while (Static141.aClass229_1.aBoolean442) {
					Static55.method845(50L);
				}
				Static141.aClass229_1 = null;
			}
		}
		this.method7984();
		this.anIntArray722 = null;
		this.aBoolean683 = true;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public final synchronized void method7978() {
		this.aBoolean684 = true;
		try {
			this.method7976();
		} catch (@Pc(14) Exception local14) {
			this.method7984();
			this.aLong305 = Static184.method3422() + 2000L;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	private void method7979() {
		this.anInt9751 -= 256;
		if (this.anInt9751 < 0) {
			this.anInt9751 = 0;
		}
		if (this.aClass4_Sub13_8 != null) {
			this.aClass4_Sub13_8.method6215(256);
		}
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V")
	public final synchronized void method7980() {
		if (this.aBoolean683) {
			return;
		}
		@Pc(12) long local12 = Static184.method3422();
		try {
			if (this.aLong304 + 500000L < local12) {
				this.aLong304 = local12 - 500000L;
			}
			while (this.aLong304 + 5000L < local12) {
				this.method7979();
				this.aLong304 += 256000 / Static379.anInt7010;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong304 = local12;
		}
		if (this.anIntArray722 == null) {
			return;
		}
		try {
			if (this.aLong305 != 0L) {
				if (this.aLong305 > local12) {
					return;
				}
				this.method7985(this.anInt9750);
				this.aLong305 = 0L;
				this.aBoolean684 = true;
			}
			@Pc(91) int local91 = this.method7986();
			if (this.anInt9748 < this.anInt9749 - local91) {
				this.anInt9748 = this.anInt9749 - local91;
			}
			@Pc(126) int local126 = this.anInt9752 + this.anInt9746;
			if (local126 + 256 > 16384) {
				local126 = 16128;
			}
			if (local126 + 256 > this.anInt9750) {
				this.anInt9750 += 1024;
				if (this.anInt9750 > 16384) {
					this.anInt9750 = 16384;
				}
				this.method7984();
				this.method7985(this.anInt9750);
				local91 = 0;
				this.aBoolean684 = true;
				if (this.anInt9750 < local126 + 256) {
					local126 = this.anInt9750 - 256;
					this.anInt9746 = local126 - this.anInt9752;
				}
			}
			while (local126 > local91) {
				this.method7974(this.anIntArray722);
				local91 += 256;
				this.method7981();
			}
			if (this.aLong306 < local12) {
				if (this.aBoolean684) {
					this.aBoolean684 = false;
				} else if (this.anInt9748 == 0 && this.anInt9747 == 0) {
					this.method7984();
					this.aLong305 = local12 + 2000L;
					return;
				} else {
					this.anInt9746 = Math.min(this.anInt9747, this.anInt9748);
					this.anInt9747 = this.anInt9748;
				}
				this.aLong306 = local12 + 2000L;
				this.anInt9748 = 0;
			}
			this.anInt9749 = local91;
		} catch (@Pc(265) Exception local265) {
			this.method7984();
			this.aLong305 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "()V")
	protected void method7981() throws Exception {
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7982(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "()V")
	protected void method7984() {
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V")
	public void method7985(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "()I")
	protected int method7986() throws Exception {
		return this.anInt9750;
	}
}
