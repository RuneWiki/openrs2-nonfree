import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class155 implements Interface22 {

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "[J")
	public static final long[] aLongArray6 = new long[11];

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
	private int anInt3752;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
	private int anInt3761;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	private int anInt3769;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "I")
	private int anInt3754 = -1;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "[Lclient!ou;")
	private final Interface19[] anInterface19Array1 = new Interface19[9];

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	private int anInt3767 = 0;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_17;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	private final int anInt3760;

	static {
		for (@Pc(149) int local149 = 0; local149 < 256; local149++) {
			@Pc(158) char local158 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local149 / 2);
			@Pc(172) long local172 = (long) ((local149 & 0x1) == 0 ? local158 >>> 8 : local158 & 0xFF);
			@Pc(176) long local176 = local172 << 1;
			if (local176 >= 256L) {
				local176 ^= 0x11DL;
			}
			@Pc(190) long local190 = local176 << 1;
			if (local190 >= 256L) {
				local190 ^= 0x11DL;
			}
			@Pc(204) long local204 = local190 ^ local172;
			@Pc(208) long local208 = local190 << 1;
			if (local208 >= 256L) {
				local208 ^= 0x11DL;
			}
			@Pc(220) long local220 = local172 ^ local208;
			aLongArrayArray1[0][local149] = Static376.method5450(Static376.method5450(Static376.method5450(local204 << 16, Static376.method5450(Static376.method5450(local172 << 32, Static376.method5450(Static376.method5450(local172 << 48, local172 << 56), local190 << 40)), local208 << 24)), local176 << 8), local220);
			for (@Pc(256) int local256 = 1; local256 < 8; local256++) {
				aLongArrayArray1[local256][local149] = Static376.method5450(aLongArrayArray1[local256 - 1][local149] >>> 8, aLongArrayArray1[local256 - 1][local149] << 56);
			}
		}
		aLongArray6[0] = 0L;
		for (@Pc(297) int local297 = 1; local297 <= 10; local297++) {
			@Pc(304) int local304 = (local297 - 1) * 8;
			aLongArray6[local297] = Static491.method7040(Static519.method7354(aLongArrayArray1[7][local304 + 7], 255L), Static491.method7040(Static491.method7040(Static491.method7040(Static491.method7040(Static519.method7354(aLongArrayArray1[3][local304 + 3], 1095216660480L), Static491.method7040(Static491.method7040(Static519.method7354(-72057594037927936L, aLongArrayArray1[0][local304]), Static519.method7354(71776119061217280L, aLongArrayArray1[1][local304 + 1])), Static519.method7354(280375465082880L, aLongArrayArray1[2][local304 + 2]))), Static519.method7354(aLongArrayArray1[4][local304 + 4], 4278190080L)), Static519.method7354(aLongArrayArray1[5][local304 + 5], 16711680L)), Static519.method7354(aLongArrayArray1[6][local304 + 6], 65280L)));
		}
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class155(@OriginalArg(0) Class145_Sub3 arg0) {
		if (!arg0.aBoolean876) {
			throw new IllegalStateException("");
		}
		this.aClass145_Sub3_17 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static184.anIntArray229, 0);
		this.anInt3760 = Static184.anIntArray229[0];
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	@Override
	public void method3379() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3767 &= 0xFFFFFFFE;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	public void method3380(@OriginalArg(1) int arg0) {
		if (this.anInterface19Array1[arg0] != null) {
			this.anInterface19Array1[arg0].method4536();
		}
		this.anInt3752 &= ~(0x1 << arg0);
		this.anInterface19Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)V")
	public void method3381() {
		if (this.anInt3754 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static257.anIntArray300[0]);
	}

	@OriginalMember(owner = "client!hi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub3_17.method8899(this.anInt3760);
		super.finalize();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILclient!eb;)V")
	public void method3382(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6_Sub4 arg1) {
		if (this.anInt3754 == -1) {
			throw new RuntimeException();
		}
		@Pc(25) int local25 = 0x1 << arg0;
		if ((~local25 & this.anInt3752) == 0) {
			this.anInt3769 = arg1.anInt2244;
			this.anInt3761 = arg1.anInt2245;
		} else if (arg1.anInt2245 != this.anInt3761 || arg1.anInt2244 != this.anInt3769) {
			throw new RuntimeException();
		}
		arg1.method1975(Static257.anIntArray300[arg0], this.anInt3754);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt3752 |= local25;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	@Override
	public void method3377() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3760);
		this.anInt3767 |= 0x2;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)Z")
	public boolean method3383() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3754);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILclient!el;I)V")
	private void method3385(@OriginalArg(3) Class64_Sub2 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt3754 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3752 & 0xFFFFFFFE) == 0) {
			this.anInt3761 = arg0.anInt2502;
			this.anInt3769 = arg0.anInt2502;
		} else if (arg0.anInt2502 != this.anInt3761 || arg0.anInt2502 != this.anInt3769) {
			throw new RuntimeException();
		}
		arg0.method2164(this.anInt3754, Static257.anIntArray300[0], arg1);
		this.anInterface19Array1[0] = arg0;
		this.anInt3752 |= 0x1;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)I")
	private int method3387() {
		if ((this.anInt3767 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3767 & 0x2) == 0) {
			return (this.anInt3767 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!el;II)V")
	public void method3388(@OriginalArg(1) Class64_Sub2 arg0, @OriginalArg(3) int arg1) {
		this.method3385(arg0, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)V")
	@Override
	public void method3376() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3760);
		this.anInt3767 |= 0x1;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	public void method3389(@OriginalArg(0) int arg0) {
		if (this.anInt3754 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static257.anIntArray300[arg0]);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	@Override
	public void method3378() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3767 &= 0xFFFFFFFB;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	@Override
	public void method3375() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3760);
		this.anInt3767 |= 0x4;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ng;II)V")
	public void method3391(@OriginalArg(0) Class64_Sub4 arg0, @OriginalArg(1) int arg1) {
		this.method3392(arg1, arg0);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V")
	@Override
	public void method3374() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3767 &= 0xFFFFFFFD;
		this.anInt3754 = this.method3387();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ng;II)V")
	private void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) Class64_Sub4 arg1) {
		if (this.anInt3754 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt3752) == 0) {
			this.anInt3761 = arg1.anInt5008;
			this.anInt3769 = arg1.anInt5007;
		} else if (arg1.anInt5008 != this.anInt3761 || this.anInt3769 != arg1.anInt5007) {
			throw new RuntimeException();
		}
		arg1.method4549(Static257.anIntArray300[arg0], this.anInt3754);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt3752 |= local16;
	}
}
