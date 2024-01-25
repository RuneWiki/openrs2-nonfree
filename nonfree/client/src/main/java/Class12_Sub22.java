import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class12_Sub22 extends Class12 {

	@OriginalMember(owner = "client!iaa", name = "u", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!iaa", name = "t", descriptor = "[J")
	public static final long[] aLongArray8 = new long[11];

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "Lclient!vn;")
	public Class12_Sub13_Sub4 aClass12_Sub13_Sub4_2;

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lclient!vn;")
	public Class12_Sub13_Sub4 aClass12_Sub13_Sub4_3;

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "Lclient!ss;")
	public Class279 aClass279_1;

	@OriginalMember(owner = "client!iaa", name = "p", descriptor = "I")
	public int anInt4475;

	@OriginalMember(owner = "client!iaa", name = "q", descriptor = "Lclient!bea;")
	public Class30_Sub1_Sub1_Sub1 aClass30_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!iaa", name = "r", descriptor = "I")
	public int anInt4476;

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
	public int anInt4477;

	@OriginalMember(owner = "client!iaa", name = "v", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!iaa", name = "w", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "I")
	public int anInt4479;

	@OriginalMember(owner = "client!iaa", name = "y", descriptor = "I")
	public int anInt4480;

	@OriginalMember(owner = "client!iaa", name = "z", descriptor = "I")
	public int anInt4481;

	@OriginalMember(owner = "client!iaa", name = "C", descriptor = "I")
	public int anInt4484;

	@OriginalMember(owner = "client!iaa", name = "D", descriptor = "Lclient!hh;")
	public Class30_Sub1_Sub1_Sub2 aClass30_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!iaa", name = "E", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!iaa", name = "F", descriptor = "I")
	public int anInt4485;

	@OriginalMember(owner = "client!iaa", name = "G", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!iaa", name = "H", descriptor = "I")
	public int anInt4487;

	@OriginalMember(owner = "client!iaa", name = "B", descriptor = "I")
	public int anInt4483 = 0;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(15) char local15 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(31) long local31 = (long) ((local8 & 0x1) == 0 ? local15 >>> 8 : local15 & 0xFF);
			@Pc(35) long local35 = local31 << 1;
			if (local35 >= 256L) {
				local35 ^= 0x11DL;
			}
			@Pc(47) long local47 = local35 << 1;
			if (local47 >= 256L) {
				local47 ^= 0x11DL;
			}
			@Pc(61) long local61 = local31 ^ local47;
			@Pc(65) long local65 = local47 << 1;
			if (local65 >= 256L) {
				local65 ^= 0x11DL;
			}
			@Pc(79) long local79 = local31 ^ local65;
			aLongArrayArray1[0][local8] = Static382.method6046(local79, Static382.method6046(local35 << 8, Static382.method6046(Static382.method6046(Static382.method6046(Static382.method6046(Static382.method6046(local31 << 48, local31 << 56), local47 << 40), local31 << 32), local65 << 24), local61 << 16)));
			for (@Pc(115) int local115 = 1; local115 < 8; local115++) {
				aLongArrayArray1[local115][local8] = Static382.method6046(aLongArrayArray1[local115 - 1][local8] << 56, aLongArrayArray1[local115 - 1][local8] >>> 8);
			}
		}
		aLongArray8[0] = 0L;
		for (@Pc(154) int local154 = 1; local154 <= 10; local154++) {
			@Pc(161) int local161 = (local154 - 1) * 8;
			aLongArray8[local154] = Static534.method7450(Static522.method7749(255L, aLongArrayArray1[7][local161 + 7]), Static534.method7450(Static534.method7450(Static522.method7749(16711680L, aLongArrayArray1[5][local161 + 5]), Static534.method7450(Static522.method7749(aLongArrayArray1[4][local161 + 4], 4278190080L), Static534.method7450(Static534.method7450(Static534.method7450(Static522.method7749(aLongArrayArray1[1][local161 + 1], 71776119061217280L), Static522.method7749(aLongArrayArray1[0][local161], -72057594037927936L)), Static522.method7749(aLongArrayArray1[2][local161 + 2], 280375465082880L)), Static522.method7749(1095216660480L, aLongArrayArray1[3][local161 + 3])))), Static522.method7749(65280L, aLongArrayArray1[6][local161 + 6])));
		}
		new Class88(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
	public void method3775() {
		@Pc(8) int local8 = this.anInt4480;
		if (this.aClass279_1 != null) {
			@Pc(92) Class279 local92 = this.aClass279_1.method6881(Static393.aClass31_1);
			if (local92 == null) {
				this.anInt4484 = 0;
				this.anInt4480 = -1;
				this.anInt4476 = 0;
				this.anInt4487 = 0;
				this.anIntArray332 = null;
				this.anInt4481 = 0;
			} else {
				this.anInt4487 = local92.anInt8316;
				this.anInt4476 = local92.anInt8312;
				this.anInt4480 = local92.anInt8285;
				this.anInt4484 = local92.anInt8307;
				this.anInt4481 = local92.anInt8320 << 7;
				this.anIntArray332 = local92.anIntArray619;
			}
		} else if (this.aClass30_Sub1_Sub1_Sub2_1 != null) {
			@Pc(19) int local19 = Static418.method6471(this.aClass30_Sub1_Sub1_Sub2_1);
			if (local8 != local19) {
				this.anInt4480 = local19;
				@Pc(33) Class130 local33 = this.aClass30_Sub1_Sub1_Sub2_1.aClass130_1;
				if (local33.anIntArray308 != null) {
					local33 = local33.method3570(Static393.aClass31_1);
				}
				if (local33 == null) {
					this.anInt4476 = this.anInt4481 = 0;
				} else {
					this.anInt4481 = local33.anInt4076 << 7;
					this.anInt4476 = local33.anInt4081;
				}
			}
		} else if (this.aClass30_Sub1_Sub1_Sub1_1 != null) {
			this.anInt4480 = Static53.method1408(this.aClass30_Sub1_Sub1_Sub1_1);
			this.anInt4481 = this.aClass30_Sub1_Sub1_Sub1_1.anInt754 << 7;
			this.anInt4476 = this.aClass30_Sub1_Sub1_Sub1_1.anInt733;
		}
		if (local8 != this.anInt4480 && this.aClass12_Sub13_Sub4_3 != null) {
			Static328.aClass12_Sub13_Sub1_1.method2443(this.aClass12_Sub13_Sub4_3);
			this.aClass12_Sub13_Sub4_3 = null;
		}
	}
}
