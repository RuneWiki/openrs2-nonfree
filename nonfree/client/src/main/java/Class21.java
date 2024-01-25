import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class21 {

	@OriginalMember(owner = "client!as", name = "r", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!as", name = "u", descriptor = "[J")
	public static final long[] aLongArray1 = new long[11];

	@OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray1;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray2;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "[I")
	private int[] anIntArray22;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "[I")
	private int[] anIntArray23;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "[I")
	private int[] anIntArray24;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!sga;")
	private Class307 aClass307_3;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!as", name = "s", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "[I")
	private int[] anIntArray26;

	@OriginalMember(owner = "client!as", name = "z", descriptor = "[I")
	private int[] anIntArray27;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "I")
	public int anInt379 = -1;

	static {
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(21) char local21 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local14 / 2);
			@Pc(37) long local37 = (long) ((local14 & 0x1) == 0 ? local21 >>> 8 : local21 & 0xFF);
			@Pc(41) long local41 = local37 << 1;
			if (local41 >= 256L) {
				local41 ^= 0x11DL;
			}
			@Pc(53) long local53 = local41 << 1;
			if (local53 >= 256L) {
				local53 ^= 0x11DL;
			}
			@Pc(65) long local65 = local53 ^ local37;
			@Pc(69) long local69 = local53 << 1;
			if (local69 >= 256L) {
				local69 ^= 0x11DL;
			}
			@Pc(81) long local81 = local37 ^ local69;
			aLongArrayArray1[0][local14] = Static369.method5901(Static369.method5901(local41 << 8, Static369.method5901(local65 << 16, Static369.method5901(Static369.method5901(Static369.method5901(Static369.method5901(local37 << 48, local37 << 56), local53 << 40), local37 << 32), local69 << 24))), local81);
			for (@Pc(117) int local117 = 1; local117 < 8; local117++) {
				aLongArrayArray1[local117][local14] = Static369.method5901(aLongArrayArray1[local117 - 1][local14] << 56, aLongArrayArray1[local117 - 1][local14] >>> 8);
			}
		}
		aLongArray1[0] = 0L;
		for (@Pc(158) int local158 = 1; local158 <= 10; local158++) {
			@Pc(165) int local165 = local158 * 8 - 8;
			aLongArray1[local158] = Static502.method7314(Static502.method7314(Static502.method7314(Static245.method4651(aLongArrayArray1[5][local165 + 5], 16711680L), Static502.method7314(Static502.method7314(Static502.method7314(Static245.method4651(aLongArrayArray1[2][local165 + 2], 280375465082880L), Static502.method7314(Static245.method4651(-72057594037927936L, aLongArrayArray1[0][local165]), Static245.method4651(aLongArrayArray1[1][local165 + 1], 71776119061217280L))), Static245.method4651(1095216660480L, aLongArrayArray1[3][local165 + 3])), Static245.method4651(4278190080L, aLongArrayArray1[4][local165 + 4]))), Static245.method4651(65280L, aLongArrayArray1[6][local165 + 6])), Static245.method4651(aLongArrayArray1[7][local165 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!tn;)V")
	public void method414(@OriginalArg(1) Class3_Sub15 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method8401();
			if (local15 == 0) {
				return;
			}
			this.method416(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	public void method415() {
		if (this.aString2 == null) {
			this.aString2 = this.aString3;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!tn;II)V")
	private void method416(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString3 = arg0.method8416();
		} else if (arg1 == 2) {
			this.aString2 = arg0.method8416();
		} else {
			@Pc(43) int local43;
			@Pc(50) int local50;
			if (arg1 == 3) {
				local43 = arg0.method8401();
				this.anIntArrayArray6 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray6[local50][0] = arg0.method8414();
					this.anIntArrayArray6[local50][1] = arg0.method8402();
					this.anIntArrayArray6[local50][2] = arg0.method8402();
				}
			} else if (arg1 == 4) {
				local43 = arg0.method8401();
				this.anIntArrayArray5 = new int[local43][3];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray5[local50][0] = arg0.method8414();
					this.anIntArrayArray5[local50][1] = arg0.method8402();
					this.anIntArrayArray5[local50][2] = arg0.method8402();
				}
			} else if (arg1 == 5) {
				arg0.method8414();
			} else if (arg1 == 6) {
				arg0.method8401();
			} else if (arg1 == 7) {
				arg0.method8401();
				return;
			} else if (arg1 != 8) {
				if (arg1 == 9) {
					arg0.method8401();
					return;
				}
				if (arg1 == 10) {
					local43 = arg0.method8401();
					this.anIntArray22 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray22[local50] = arg0.method8402();
					}
					return;
				}
				if (arg1 == 12) {
					arg0.method8402();
					return;
				}
				if (arg1 == 13) {
					local43 = arg0.method8401();
					this.anIntArray21 = new int[local43];
					for (local50 = 0; local50 < local43; local50++) {
						this.anIntArray21[local50] = arg0.method8414();
					}
					return;
				}
				if (arg1 != 14) {
					if (arg1 == 15) {
						arg0.method8414();
						return;
					}
					if (arg1 == 17) {
						this.anInt379 = arg0.method8414();
					} else if (arg1 == 18) {
						local43 = arg0.method8401();
						this.anIntArray24 = new int[local43];
						this.anIntArray25 = new int[local43];
						this.anIntArray20 = new int[local43];
						this.aStringArray1 = new String[local43];
						for (local50 = 0; local50 < local43; local50++) {
							this.anIntArray24[local50] = arg0.method8402();
							this.anIntArray25[local50] = arg0.method8402();
							this.anIntArray20[local50] = arg0.method8402();
							this.aStringArray1[local50] = arg0.method8413();
						}
						return;
					} else if (arg1 == 19) {
						local43 = arg0.method8401();
						this.aStringArray2 = new String[local43];
						this.anIntArray23 = new int[local43];
						this.anIntArray26 = new int[local43];
						this.anIntArray27 = new int[local43];
						for (local50 = 0; local50 < local43; local50++) {
							this.anIntArray27[local50] = arg0.method8402();
							this.anIntArray23[local50] = arg0.method8402();
							this.anIntArray26[local50] = arg0.method8402();
							this.aStringArray2[local50] = arg0.method8413();
						}
						return;
					} else if (arg1 == 249) {
						local43 = arg0.method8401();
						if (this.aClass307_3 == null) {
							local50 = Static95.method2482(local43);
							this.aClass307_3 = new Class307(local50);
						}
						for (local50 = 0; local50 < local43; local50++) {
							@Pc(347) boolean local347 = arg0.method8401() == 1;
							@Pc(353) int local353 = arg0.method8421();
							@Pc(362) Class3 local362;
							if (local347) {
								local362 = new Class3_Sub44(arg0.method8413());
							} else {
								local362 = new Class3_Sub8(arg0.method8402());
							}
							this.aClass307_3.method7425((long) local353, local362);
						}
						return;
					}
					return;
				}
				local43 = arg0.method8401();
				this.anIntArrayArray4 = new int[local43][2];
				for (local50 = 0; local50 < local43; local50++) {
					this.anIntArrayArray4[local50][0] = arg0.method8401();
					this.anIntArrayArray4[local50][1] = arg0.method8401();
				}
				return;
			}
		}
	}
}
