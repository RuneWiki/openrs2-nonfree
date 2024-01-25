import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qv")
public final class Class289 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!qv", name = "n", descriptor = "[J")
	public static final long[] aLongArray14 = new long[11];

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "Lclient!f;")
	private Class5 aClass5_33;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
	private int anInt7767;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "I")
	private int anInt7772;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	private int anInt7768 = -1;

	@OriginalMember(owner = "client!qv", name = "m", descriptor = "Z")
	private boolean aBoolean585 = true;

	@OriginalMember(owner = "client!qv", name = "p", descriptor = "I")
	private final int anInt7773;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "I")
	private final int anInt7766;

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "[Lclient!ju;")
	private final Class179[] aClass179Array1;

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
	private final int anInt7769;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
	private final int anInt7770;

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "[Lclient!ju;")
	private final Class179[] aClass179Array2;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "Lclient!ju;")
	private final Class179 aClass179_1;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local10 / 2);
			@Pc(30) long local30 = (long) ((local10 & 0x1) == 0 ? local17 >>> 8 : local17 & 0xFF);
			@Pc(34) long local34 = local30 << 1;
			if (local34 >= 256L) {
				local34 ^= 0x11DL;
			}
			@Pc(46) long local46 = local34 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(58) long local58 = local30 ^ local46;
			@Pc(62) long local62 = local46 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(76) long local76 = local62 ^ local30;
			aLongArrayArray1[0][local10] = Static258.method3753(Static258.method3753(local34 << 8, Static258.method3753(Static258.method3753(Static258.method3753(Static258.method3753(Static258.method3753(local30 << 48, local30 << 56), local46 << 40), local30 << 32), local62 << 24), local58 << 16)), local76);
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local10] = Static258.method3753(aLongArrayArray1[local112 - 1][local10] >>> 8, aLongArrayArray1[local112 - 1][local10] << 56);
			}
		}
		aLongArray14[0] = 0L;
		for (@Pc(151) int local151 = 1; local151 <= 10; local151++) {
			@Pc(158) int local158 = local151 * 8 - 8;
			aLongArray14[local151] = Static269.method3927(Static139.method2404(255L, aLongArrayArray1[7][local158 + 7]), Static269.method3927(Static139.method2404(65280L, aLongArrayArray1[6][local158 + 6]), Static269.method3927(Static139.method2404(16711680L, aLongArrayArray1[5][local158 + 5]), Static269.method3927(Static139.method2404(4278190080L, aLongArrayArray1[4][local158 + 4]), Static269.method3927(Static269.method3927(Static269.method3927(Static139.method2404(aLongArrayArray1[1][local158 + 1], 71776119061217280L), Static139.method2404(-72057594037927936L, aLongArrayArray1[0][local158])), Static139.method2404(aLongArrayArray1[2][local158 + 2], 280375465082880L)), Static139.method2404(aLongArrayArray1[3][local158 + 3], 1095216660480L))))));
		}
	}

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(I[Lclient!ju;IIII)V")
	public Class289(@OriginalArg(0) int arg0, @OriginalArg(1) Class179[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7773 = arg3;
		this.anInt7766 = arg5;
		this.aClass179Array1 = arg1;
		this.anInt7769 = arg4;
		this.anInt7770 = arg0;
		if (arg1 == null) {
			this.aClass179Array2 = null;
			this.aClass179_1 = null;
		} else {
			this.aClass179Array2 = new Class179[arg1.length];
			this.aClass179_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public void method6202() {
		if (this.aClass179Array1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.aClass179Array1.length; local6++) {
				this.aClass179Array1[local6].method3724();
			}
		}
		this.aClass5_33 = null;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!r;IIIIIIIII)V")
	public void method6205(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(12) int local12 = arg5 + arg7 & 0x3FFF;
		if (this.anInt7770 == -1 || this.anInt7767 == 0) {
			arg0.J(arg2, arg4, arg1, arg3, arg8, 0);
		} else {
			@Pc(30) Class17 local30 = Static231.anInterface9_5.method947(this.anInt7770);
			if (this.aClass5_33 == null && Static231.anInterface9_5.method949(this.anInt7770)) {
				@Pc(66) int[] local66 = local30.aBoolean27 ? Static231.anInterface9_5.method952(0.7F, this.anInt7767, this.anInt7767, this.anInt7770) : Static231.anInterface9_5.method948(false, this.anInt7770, this.anInt7767, 0.7F, this.anInt7767);
				this.aClass5_33 = arg0.method6842(local66, this.anInt7767, this.anInt7767, this.anInt7767);
			}
			if (local30.aBoolean27) {
				arg0.J(arg2, arg4, arg1, arg3, arg8, 0);
			}
			if (this.aClass5_33 != null) {
				@Pc(99) int local99 = local30.aBoolean27 ? 1 : 0;
				@Pc(105) int local105 = arg3 * arg6 / -4096;
				@Pc(118) int local118;
				for (local118 = (arg1 - arg3) / 2 + arg3 * local12 / 4096; local118 > arg3; local118 -= arg3) {
				}
				while (arg3 < local105) {
					local105 -= arg3;
				}
				while (local118 < 0) {
					local118 += arg3;
				}
				while (local105 < 0) {
					local105 += arg3;
				}
				for (@Pc(171) int local171 = local118 - arg3; local171 < arg1; local171 += arg3) {
					for (@Pc(178) int local178 = local105 - arg3; local178 < arg3; local178 += arg3) {
						this.aClass5_33.method7804(arg2 + local171, local178 - -arg4, arg3, arg3, 1, 0, local99);
					}
				}
			}
		}
		for (@Pc(232) int local232 = this.anInt7772 - 1; local232 >= 0; local232--) {
			this.aClass179Array2[local232].method3721(arg0, arg2, arg4, arg1, arg3, arg6, local12);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!r;BI)Z")
	public boolean method6206(@OriginalArg(0) Class78 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anInt7768) {
			this.anInt7768 = arg1;
			@Pc(21) int local21 = Static505.method7085(arg1);
			if (local21 > 512) {
				local21 = 512;
			}
			if (local21 <= 0) {
				local21 = 1;
			}
			if (local21 != this.anInt7767) {
				this.anInt7767 = local21;
				this.aClass5_33 = null;
			}
			if (this.aClass179Array1 != null) {
				this.anInt7772 = 0;
				@Pc(54) int[] local54 = new int[this.aClass179Array1.length];
				for (@Pc(56) int local56 = 0; local56 < this.aClass179Array1.length; local56++) {
					@Pc(63) Class179 local63 = this.aClass179Array1[local56];
					if (local63.method3725(this.anInt7773, this.anInt7769, this.anInt7766, this.anInt7768)) {
						local54[this.anInt7772] = local63.anInt4681;
						this.aClass179Array2[this.anInt7772++] = local63;
					}
				}
				Static122.method2188(0, this.aClass179Array2, local54, this.anInt7772 - 1);
			}
			this.aBoolean585 = true;
		}
		@Pc(116) boolean local116 = false;
		if (this.aBoolean585) {
			this.aBoolean585 = false;
			for (@Pc(127) int local127 = this.anInt7772 - 1; local127 >= 0; local127--) {
				@Pc(138) boolean local138 = this.aClass179Array2[local127].method3723(arg0, this.aClass179_1);
				local116 |= local138;
				this.aBoolean585 |= !local138;
			}
		}
		return local116;
	}
}
