import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class60_Sub8 extends Class60 {

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "[J")
	public static final long[] aLongArray13 = new long[11];

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "Lclient!qda;")
	private Class271 aClass271_6;

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
	private boolean aBoolean649 = false;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "[Lclient!mda;")
	private Class34_Sub4[] aClass34_Sub4Array1;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local10 / 2);
			@Pc(30) long local30 = (long) ((local10 & 0x1) == 0 ? local17 >>> 8 : local17 & 0xFF);
			@Pc(34) long local34 = local30 << 1;
			if (local34 >= 256L) {
				local34 ^= 0x11DL;
			}
			@Pc(48) long local48 = local34 << 1;
			if (local48 >= 256L) {
				local48 ^= 0x11DL;
			}
			@Pc(60) long local60 = local30 ^ local48;
			@Pc(64) long local64 = local48 << 1;
			if (local64 >= 256L) {
				local64 ^= 0x11DL;
			}
			@Pc(78) long local78 = local64 ^ local30;
			aLongArrayArray1[0][local10] = Static111.method2347(local78, Static111.method2347(Static111.method2347(Static111.method2347(Static111.method2347(Static111.method2347(Static111.method2347(local30 << 48, local30 << 56), local48 << 40), local30 << 32), local64 << 24), local60 << 16), local34 << 8));
			for (@Pc(114) int local114 = 1; local114 < 8; local114++) {
				aLongArrayArray1[local114][local10] = Static111.method2347(aLongArrayArray1[local114 - 1][local10] << 56, aLongArrayArray1[local114 - 1][local10] >>> 8);
			}
		}
		aLongArray13[0] = 0L;
		for (@Pc(157) int local157 = 1; local157 <= 10; local157++) {
			@Pc(164) int local164 = local157 * 8 - 8;
			aLongArray13[local157] = Static325.method5043(Static325.method5043(Static535.method7038(65280L, aLongArrayArray1[6][local164 + 6]), Static325.method5043(Static325.method5043(Static325.method5043(Static325.method5043(Static325.method5043(Static535.method7038(-72057594037927936L, aLongArrayArray1[0][local164]), Static535.method7038(71776119061217280L, aLongArrayArray1[1][local164 + 1])), Static535.method7038(280375465082880L, aLongArrayArray1[2][local164 + 2])), Static535.method7038(1095216660480L, aLongArrayArray1[3][local164 + 3])), Static535.method7038(aLongArrayArray1[4][local164 + 4], 4278190080L)), Static535.method7038(aLongArrayArray1[5][local164 + 5], 16711680L))), Static535.method7038(aLongArrayArray1[7][local164 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!us;)V")
	public Class60_Sub8(@OriginalArg(0) Class43_Sub3 arg0) {
		super(arg0);
		if (arg0.aBoolean685) {
			this.aBoolean650 = arg0.anInt8757 < 3;
			@Pc(26) int local26 = this.aBoolean650 ? 48 : 127;
			@Pc(30) byte[][] local30 = new byte[6][4096];
			@Pc(34) byte[][] local34 = new byte[6][4096];
			@Pc(38) byte[][] local38 = new byte[6][4096];
			@Pc(40) int local40 = 0;
			for (@Pc(42) int local42 = 0; local42 < 64; local42++) {
				for (@Pc(46) int local46 = 0; local46 < 64; local46++) {
					@Pc(57) float local57 = (float) local42 * 2.0F / 64.0F - 1.0F;
					@Pc(66) float local66 = (float) local46 * 2.0F / 64.0F - 1.0F;
					@Pc(81) float local81 = (float) (1.0D / Math.sqrt((double) (local57 * local57 + local66 * local66 + 1.0F)));
					@Pc(85) float local85 = local57 * local81;
					@Pc(89) float local89 = local66 * local81;
					for (@Pc(91) int local91 = 0; local91 < 6; local91++) {
						@Pc(98) float local98;
						if (local91 == 0) {
							local98 = -local89;
						} else if (local91 == 1) {
							local98 = local89;
						} else if (local91 == 2) {
							local98 = local85;
						} else if (local91 == 3) {
							local98 = -local85;
						} else if (local91 == 4) {
							local98 = local81;
						} else {
							local98 = -local81;
						}
						@Pc(149) int local149;
						@Pc(158) int local158;
						@Pc(167) int local167;
						if (local98 > 0.0F) {
							local149 = (int) ((double) local26 * Math.pow((double) local98, 96.0D));
							local158 = (int) ((double) local26 * Math.pow((double) local98, 36.0D));
							local167 = (int) ((double) local26 * Math.pow((double) local98, 12.0D));
						} else {
							local167 = 0;
							local158 = 0;
							local149 = 0;
						}
						local34[local91][local40] = (byte) local149;
						local38[local91][local40] = (byte) local158;
						local30[local91][local40] = (byte) local167;
					}
					local40++;
				}
			}
			this.aClass34_Sub4Array1 = new Class34_Sub4[3];
			this.aClass34_Sub4Array1[0] = new Class34_Sub4(super.aClass43_Sub3_43, 6406, 64, false, local34, 6406);
			this.aClass34_Sub4Array1[1] = new Class34_Sub4(super.aClass43_Sub3_43, 6406, 64, false, local38, 6406);
			this.aClass34_Sub4Array1[2] = new Class34_Sub4(super.aClass43_Sub3_43, 6406, 64, false, local30, 6406);
			this.method7029();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean649) {
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(this.aClass34_Sub4Array1[arg1 - 1]);
			super.aClass43_Sub3_43.method7277(0);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IBLclient!um;)V")
	@Override
	public void method7737(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		super.aClass43_Sub3_43.method7220(arg1);
		super.aClass43_Sub3_43.method7281(arg0);
	}

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "(I)V")
	private void method7029() {
		this.aClass271_6 = new Class271(super.aClass43_Sub3_43, 2);
		this.aClass271_6.method6059(0);
		super.aClass43_Sub3_43.method7277(1);
		OpenGL.glTexGeni(8192, 9472, 34065);
		OpenGL.glTexGeni(8193, 9472, 34065);
		OpenGL.glTexGeni(8194, 9472, 34065);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		OpenGL.glEnable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean650) {
			super.aClass43_Sub3_43.method7287(7681, 260);
			super.aClass43_Sub3_43.method7225(0, 770, 5890);
			super.aClass43_Sub3_43.method7282(34167, 0);
		} else {
			super.aClass43_Sub3_43.method7287(8448, 7681);
			super.aClass43_Sub3_43.method7225(0, 768, 34168);
			super.aClass43_Sub3_43.method7277(2);
			super.aClass43_Sub3_43.method7287(7681, 260);
			super.aClass43_Sub3_43.method7225(0, 768, 34168);
			super.aClass43_Sub3_43.method7225(1, 770, 34168);
			super.aClass43_Sub3_43.method7282(34167, 0);
		}
		super.aClass43_Sub3_43.method7277(0);
		this.aClass271_6.method6054();
		this.aClass271_6.method6059(1);
		super.aClass43_Sub3_43.method7277(1);
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		OpenGL.glDisable(3170);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		if (this.aBoolean650) {
			super.aClass43_Sub3_43.method7287(8448, 8448);
			super.aClass43_Sub3_43.method7225(0, 768, 5890);
			super.aClass43_Sub3_43.method7282(5890, 0);
		} else {
			super.aClass43_Sub3_43.method7287(8448, 8448);
			super.aClass43_Sub3_43.method7225(0, 768, 5890);
			super.aClass43_Sub3_43.method7277(2);
			super.aClass43_Sub3_43.method7287(8448, 8448);
			super.aClass43_Sub3_43.method7225(0, 768, 5890);
			super.aClass43_Sub3_43.method7225(1, 768, 34168);
			super.aClass43_Sub3_43.method7282(5890, 0);
		}
		super.aClass43_Sub3_43.method7277(0);
		this.aClass271_6.method6054();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7730(@OriginalArg(0) boolean arg0) {
		if (this.aClass271_6 == null || !arg0) {
			super.aClass43_Sub3_43.method7282(34168, 0);
			return;
		}
		if (!this.aBoolean650) {
			super.aClass43_Sub3_43.method7277(2);
			super.aClass43_Sub3_43.method7220(super.aClass43_Sub3_43.aClass34_Sub2_5);
			super.aClass43_Sub3_43.method7277(0);
		}
		this.aClass271_6.method6056('\u0000');
		this.aBoolean649 = true;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7735() {
		return true;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7733(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub3_43.method7287(7681, 8448);
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	@Override
	public void method7732() {
		if (this.aBoolean649) {
			if (!this.aBoolean650) {
				super.aClass43_Sub3_43.method7277(2);
				super.aClass43_Sub3_43.method7220(null);
			}
			super.aClass43_Sub3_43.method7277(1);
			super.aClass43_Sub3_43.method7220(null);
			super.aClass43_Sub3_43.method7277(0);
			this.aClass271_6.method6056('\u0001');
			this.aBoolean649 = false;
		} else {
			super.aClass43_Sub3_43.method7282(5890, 0);
		}
		super.aClass43_Sub3_43.method7287(8448, 8448);
	}
}
