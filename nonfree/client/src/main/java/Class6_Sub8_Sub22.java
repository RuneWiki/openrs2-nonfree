import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class6_Sub8_Sub22 extends Class6_Sub8 {

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "[J")
	public static final long[] aLongArray16 = new long[11];

	@OriginalMember(owner = "client!lk", name = "C", descriptor = "I")
	private int anInt5960 = 4096;

	@OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
	private int anInt5963 = 0;

	static {
		for (@Pc(65) int local65 = 0; local65 < 256; local65++) {
			@Pc(74) char local74 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local65 / 2);
			@Pc(88) long local88 = (long) ((local65 & 0x1) == 0 ? local74 >>> 8 : local74 & 0xFF);
			@Pc(92) long local92 = local88 << 1;
			if (local92 >= 256L) {
				local92 ^= 0x11DL;
			}
			@Pc(104) long local104 = local92 << 1;
			if (local104 >= 256L) {
				local104 ^= 0x11DL;
			}
			@Pc(116) long local116 = local104 ^ local88;
			@Pc(120) long local120 = local104 << 1;
			if (local120 >= 256L) {
				local120 ^= 0x11DL;
			}
			@Pc(134) long local134 = local120 ^ local88;
			aLongArrayArray1[0][local65] = Static215.method3944(local134, Static215.method3944(Static215.method3944(local116 << 16, Static215.method3944(Static215.method3944(local88 << 32, Static215.method3944(local104 << 40, Static215.method3944(local88 << 48, local88 << 56))), local120 << 24)), local92 << 8));
			for (@Pc(170) int local170 = 1; local170 < 8; local170++) {
				aLongArrayArray1[local170][local65] = Static215.method3944(aLongArrayArray1[local170 - 1][local65] >>> 8, aLongArrayArray1[local170 - 1][local65] << 56);
			}
		}
		aLongArray16[0] = 0L;
		for (@Pc(213) int local213 = 1; local213 <= 10; local213++) {
			@Pc(220) int local220 = local213 * 8 - 8;
			aLongArray16[local213] = Static671.method8896(Static671.method8896(Static671.method8896(Static671.method8896(Static493.method7297(4278190080L, aLongArrayArray1[4][local220 + 4]), Static671.method8896(Static493.method7297(aLongArrayArray1[3][local220 + 3], 1095216660480L), Static671.method8896(Static493.method7297(280375465082880L, aLongArrayArray1[2][local220 + 2]), Static671.method8896(Static493.method7297(71776119061217280L, aLongArrayArray1[1][local220 + 1]), Static493.method7297(aLongArrayArray1[0][local220], -72057594037927936L))))), Static493.method7297(16711680L, aLongArrayArray1[5][local220 + 5])), Static493.method7297(65280L, aLongArrayArray1[6][local220 + 6])), Static493.method7297(255L, aLongArrayArray1[7][local220 + 7]));
		}
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(29) int[] local29 = this.method8930(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static83.anInt1268; local31++) {
				@Pc(37) int local37 = local29[local31];
				if (local37 < this.anInt5963) {
					local19[local31] = this.anInt5963;
				} else if (this.anInt5960 < local37) {
					local19[local31] = this.anInt5960;
				} else {
					local19[local31] = local37;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(29) int[][] local29 = this.method8928(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static83.anInt1268; local55++) {
				@Pc(61) int local61 = local33[local55];
				@Pc(65) int local65 = local37[local55];
				@Pc(69) int local69 = local41[local55];
				if (this.anInt5963 > local61) {
					local45[local55] = this.anInt5963;
				} else if (this.anInt5960 >= local61) {
					local45[local55] = local61;
				} else {
					local45[local55] = this.anInt5960;
				}
				if (this.anInt5963 > local65) {
					local49[local55] = this.anInt5963;
				} else if (this.anInt5960 < local65) {
					local49[local55] = this.anInt5960;
				} else {
					local49[local55] = local65;
				}
				if (this.anInt5963 > local69) {
					local53[local55] = this.anInt5963;
				} else if (this.anInt5960 < local69) {
					local53[local55] = this.anInt5960;
				} else {
					local53[local55] = local69;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt5963 = arg1.method3018();
		} else if (arg0 == 1) {
			this.anInt5960 = arg1.method3018();
		} else if (arg0 == 2) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}
}
