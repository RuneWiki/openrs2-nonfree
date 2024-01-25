import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class3_Sub9_Sub1 extends Class3_Sub9 {

	@OriginalMember(owner = "client!ci", name = "Bb", descriptor = "J")
	private long aLong43;

	@OriginalMember(owner = "client!ci", name = "Cb", descriptor = "I")
	private int anInt1280;

	@OriginalMember(owner = "client!ci", name = "Eb", descriptor = "J")
	private long aLong44;

	@OriginalMember(owner = "client!ci", name = "Fb", descriptor = "I")
	private int anInt1281;

	@OriginalMember(owner = "client!ci", name = "Gb", descriptor = "Z")
	private boolean aBoolean94;

	@OriginalMember(owner = "client!ci", name = "Hb", descriptor = "Z")
	private boolean aBoolean95;

	@OriginalMember(owner = "client!ci", name = "Ib", descriptor = "I")
	private int anInt1282;

	@OriginalMember(owner = "client!ci", name = "Jb", descriptor = "Lclient!qh;")
	private Class3_Sub39 aClass3_Sub39_1;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
	private final int[] anIntArray160 = new int[16];

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
	private final int[] anIntArray161 = new int[16];

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "[I")
	private final int[] anIntArray164 = new int[16];

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "[I")
	private final int[] anIntArray168 = new int[16];

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "[I")
	private final int[] anIntArray162 = new int[16];

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "[I")
	public final int[] anIntArray159 = new int[16];

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
	private int anInt1239 = 256;

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "[I")
	private final int[] anIntArray163 = new int[16];

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "[I")
	public final int[] anIntArray158 = new int[16];

	@OriginalMember(owner = "client!ci", name = "ub", descriptor = "[I")
	private final int[] anIntArray172 = new int[16];

	@OriginalMember(owner = "client!ci", name = "yb", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "[I")
	private final int[] anIntArray165 = new int[16];

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "[I")
	private final int[] anIntArray169 = new int[16];

	@OriginalMember(owner = "client!ci", name = "hb", descriptor = "[I")
	private final int[] anIntArray170 = new int[16];

	@OriginalMember(owner = "client!ci", name = "zb", descriptor = "I")
	private final int anInt1278 = 1000000;

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "[[Lclient!kv;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray1 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!ci", name = "ib", descriptor = "[I")
	public final int[] anIntArray171 = new int[16];

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "[I")
	private final int[] anIntArray167 = new int[16];

	@OriginalMember(owner = "client!ci", name = "N", descriptor = "[I")
	private final int[] anIntArray166 = new int[16];

	@OriginalMember(owner = "client!ci", name = "ob", descriptor = "[[Lclient!kv;")
	private final Class3_Sub28[][] aClass3_Sub28ArrayArray2 = new Class3_Sub28[16][128];

	@OriginalMember(owner = "client!ci", name = "D", descriptor = "Lclient!ml;")
	private final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!ci", name = "Db", descriptor = "Lclient!th;")
	private final Class3_Sub9_Sub4 aClass3_Sub9_Sub4_1 = new Class3_Sub9_Sub4(this);

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!sd;")
	private final Class267 aClass267_7 = new Class267(128);

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub1() {
		this.method1210();
		this.method1213(true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	private void method1179(@OriginalArg(0) int arg0) {
		if ((this.anIntArray159[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class3_Sub28 local19 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2089(); local19 != null; local19 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2086()) {
			if (local19.anInt5447 == arg0) {
				local19.anInt5440 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6930(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass193_1.method5002()) {
			@Pc(14) int local14 = this.aClass193_1.anInt5987 * this.anInt1278 / Static361.anInt6755;
			do {
				@Pc(23) long local23 = this.aLong43 + (long) local14 * (long) arg2;
				if (this.aLong44 - local23 >= 0L) {
					this.aLong43 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong44 - this.aLong43 - 1L) / (long) local14);
				this.aLong43 += (long) local52 * (long) local14;
				this.aClass3_Sub9_Sub4_1.method6930(arg0, arg1, local52);
				arg1 += local52;
				arg2 -= local52;
				this.method1191();
			} while (this.aClass193_1.method5002());
		}
		this.aClass3_Sub9_Sub4_1.method6930(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)V")
	public synchronized void method1180() {
		for (@Pc(16) Class3_Sub26 local16 = (Class3_Sub26) this.aClass267_7.method6643(); local16 != null; local16 = (Class3_Sub26) this.aClass267_7.method6650()) {
			local16.method4352();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public synchronized void method1181() {
		for (@Pc(5) Class3_Sub26 local5 = (Class3_Sub26) this.aClass267_7.method6643(); local5 != null; local5 = (Class3_Sub26) this.aClass267_7.method6650()) {
			local5.method7820();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
	private void method1182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray164[arg1] = arg0;
		this.anIntArray171[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)V")
	private void method1183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray172[arg1] != arg0) {
			this.anIntArray172[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub28ArrayArray2[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Z")
	public synchronized boolean method1184() {
		return this.aClass193_1.method5002();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	private void method1185(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class3_Sub28 local10 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2089(); local10 != null; local10 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2086()) {
			if (arg0 < 0 || local10.anInt5447 == arg0) {
				if (local10.aClass3_Sub9_Sub2_4 != null) {
					local10.aClass3_Sub9_Sub2_4.method5360(Static361.anInt6755 / 100);
					if (local10.aClass3_Sub9_Sub2_4.method5366()) {
						this.aClass3_Sub9_Sub4_1.aClass3_Sub9_Sub3_1.method5654(local10.aClass3_Sub9_Sub2_4);
					}
					local10.method4580();
				}
				if (local10.anInt5438 < 0) {
					this.aClass3_Sub28ArrayArray1[local10.anInt5447][local10.anInt5446] = null;
				}
				local10.method7820();
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I")
	public int method1186() {
		return this.anInt1239;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V")
	private void method1187(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub28 local16 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2089(); local16 != null; local16 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2086()) {
			if ((arg0 < 0 || arg0 == local16.anInt5447) && local16.anInt5438 < 0) {
				this.aClass3_Sub28ArrayArray1[local16.anInt5447][local16.anInt5446] = null;
				local16.anInt5438 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)V")
	private void method1188(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1188(local12);
			}
			return;
		}
		this.anIntArray173[arg0] = 12800;
		this.anIntArray160[arg0] = 8192;
		this.anIntArray163[arg0] = 16383;
		this.anIntArray170[arg0] = 8192;
		this.anIntArray168[arg0] = 0;
		this.anIntArray169[arg0] = 8192;
		this.method1201(arg0);
		this.method1179(arg0);
		this.anIntArray159[arg0] = 0;
		this.anIntArray165[arg0] = 32767;
		this.anIntArray166[arg0] = 256;
		this.anIntArray158[arg0] = 0;
		this.method1182(8192, arg0);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)V")
	private void method1190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray170[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V")
	private void method1191() {
		@Pc(16) int local16 = this.anInt1281;
		@Pc(19) int local19 = this.anInt1280;
		@Pc(22) long local22 = this.aLong44;
		if (this.aClass3_Sub39_1 != null && this.anInt1282 == local19) {
			this.method1206(this.aBoolean95, this.aClass3_Sub39_1, this.aBoolean94);
			this.method1191();
			return;
		}
		while (local19 == this.anInt1280) {
			while (local19 == this.aClass193_1.anIntArray532[local16]) {
				this.aClass193_1.method5005(local16);
				@Pc(55) int local55 = this.aClass193_1.method5008(local16);
				if (local55 == 1) {
					this.aClass193_1.method5010();
					this.aClass193_1.method4999(local16);
					if (this.aClass193_1.method5009()) {
						if (this.aClass3_Sub39_1 != null) {
							this.method1214(this.aBoolean94, this.aClass3_Sub39_1);
							this.method1191();
							return;
						}
						if (!this.aBoolean94 || local19 == 0) {
							this.method1213(true);
							this.aClass193_1.method5006();
							return;
						}
						this.aClass193_1.method5012(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method1198(local55);
				}
				this.aClass193_1.method5000(local16);
				this.aClass193_1.method4999(local16);
			}
			local16 = this.aClass193_1.method5001();
			local19 = this.aClass193_1.anIntArray532[local16];
			local22 = this.aClass193_1.method5011(local19);
		}
		this.anInt1281 = local16;
		this.aLong44 = local22;
		this.anInt1280 = local19;
		if (this.aClass3_Sub39_1 != null && local19 > this.anInt1282) {
			this.anInt1280 = this.anInt1282;
			this.anInt1281 = -1;
			this.aLong44 = this.aClass193_1.method5011(this.anInt1280);
		}
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V")
	private void method1193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!kv;Z)V")
	public void method1194(@OriginalArg(1) Class3_Sub28 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass3_Sub42_Sub1_4.aByteArray97.length;
		@Pc(36) int local36;
		if (arg1 && arg0.aClass3_Sub42_Sub1_4.aBoolean589) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass3_Sub42_Sub1_4.anInt8317;
			local36 = (int) ((long) local23 * (long) this.anIntArray158[arg0.anInt5447] >> 6);
			local8 <<= 0x8;
			if (local36 >= local8) {
				arg0.aClass3_Sub9_Sub2_4.method5337();
				local36 = local8 + local8 - local36 - 1;
			}
		} else {
			local36 = (int) ((long) this.anIntArray158[arg0.anInt5447] * (long) local8 >> 6);
		}
		arg0.aClass3_Sub9_Sub2_4.method5347(local36);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IBI)V")
	private void method1196() {
		this.anIntArray167[9] = 128;
		this.anIntArray162[9] = 128;
		this.method1183(128, 9);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "()Lclient!bk;")
	@Override
	public synchronized Class3_Sub9 method6929() {
		return this.aClass3_Sub9_Sub4_1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!kv;Z)I")
	private int method1197(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(14) int local14 = this.anIntArray160[arg0.anInt5447];
		return local14 < 8192 ? local14 * arg0.anInt5431 + 32 >> 6 : 16384 - ((128 - arg0.anInt5431) * (-local14 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZI)V")
	private void method1198(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1215(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1215(64, local24, local18);
			} else {
				this.method1199(local18, local30, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1205(local30, local18, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray162[local18] = (local30 << 14) + (this.anIntArray162[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray162[local18] = (local30 << 7) + (this.anIntArray162[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray168[local18] = (this.anIntArray168[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray168[local18] = (this.anIntArray168[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray169[local18] = (local30 << 7) + (this.anIntArray169[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray169[local18] = local30 + (this.anIntArray169[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray173[local18] = (local30 << 7) + (this.anIntArray173[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray173[local18] = (this.anIntArray173[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray160[local18] = (this.anIntArray160[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray160[local18] = (this.anIntArray160[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray163[local18] = (local30 << 7) + (this.anIntArray163[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray163[local18] = (this.anIntArray163[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray159[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray159[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1201(local18);
					this.anIntArray159[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray159[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray165[local18] = (local30 << 7) + (this.anIntArray165[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray165[local18] = (this.anIntArray165[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray165[local18] = (this.anIntArray165[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray165[local18] = (this.anIntArray165[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1185(local18);
			}
			if (local24 == 121) {
				this.method1188(local18);
			}
			if (local24 == 123) {
				this.method1187(local18);
			}
			@Pc(511) int local511;
			if (local24 == 6) {
				local511 = this.anIntArray165[local18];
				if (local511 == 16384) {
					this.anIntArray166[local18] = (local30 << 7) + (this.anIntArray166[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local511 = this.anIntArray165[local18];
				if (local511 == 16384) {
					this.anIntArray166[local18] = local30 + (this.anIntArray166[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray158[local18] = (local30 << 7) + (this.anIntArray158[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray158[local18] = (this.anIntArray158[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method1179(local18);
					this.anIntArray159[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray159[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method1182((local30 << 7) + (this.anIntArray164[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method1182(local30 + (this.anIntArray164[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1183(this.anIntArray162[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1193(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1190(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1213(true);
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIB)V")
	private void method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1215(64, arg2, arg0);
		if ((this.anIntArray159[arg0] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub28 local28 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2081(); local28 != null; local28 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2082()) {
				if (local28.anInt5447 == arg0 && local28.anInt5438 < 0) {
					this.aClass3_Sub28ArrayArray1[arg0][local28.anInt5446] = null;
					this.aClass3_Sub28ArrayArray1[arg0][arg2] = local28;
					@Pc(70) int local70 = (local28.anInt5435 * local28.anInt5444 >> 12) + local28.anInt5434;
					local28.anInt5434 += arg2 - local28.anInt5446 << 8;
					local28.anInt5435 = 4096;
					local28.anInt5444 = local70 - local28.anInt5434;
					local28.anInt5446 = arg2;
					return;
				}
			}
		}
		@Pc(116) Class3_Sub26 local116 = (Class3_Sub26) this.aClass267_7.method6644((long) this.anIntArray172[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class3_Sub42_Sub1 local124 = local116.aClass3_Sub42_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class3_Sub28 local131 = new Class3_Sub28();
		local131.anInt5447 = arg0;
		local131.aClass3_Sub42_Sub1_4 = local124;
		local131.aClass3_Sub26_1 = local116;
		local131.aClass287_1 = local116.aClass287Array1[arg2];
		local131.anInt5445 = local116.aByteArray50[arg2];
		local131.anInt5446 = arg2;
		local131.anInt5436 = local116.aByteArray48[arg2] * arg1 * arg1 * local116.anInt5187 + 1024 >> 11;
		local131.anInt5431 = local116.aByteArray49[arg2] & 0xFF;
		local131.anInt5434 = (arg2 << 8) - (local116.aShortArray96[arg2] & 0x7FFF);
		local131.anInt5450 = 0;
		local131.anInt5438 = -1;
		local131.anInt5439 = 0;
		local131.anInt5432 = 0;
		local131.anInt5449 = 0;
		if (this.anIntArray158[arg0] == 0) {
			local131.aClass3_Sub9_Sub2_4 = Static556.method5376(local124, this.method1200(local131), this.method1212(local131), this.method1197(local131));
		} else {
			local131.aClass3_Sub9_Sub2_4 = Static556.method5376(local124, this.method1200(local131), 0, this.method1197(local131));
			this.method1194(local131, local116.aShortArray96[arg2] < 0);
		}
		if (local116.aShortArray96[arg2] < 0) {
			local131.aClass3_Sub9_Sub2_4.method5365(-1);
		}
		if (local131.anInt5445 >= 0) {
			@Pc(289) Class3_Sub28 local289 = this.aClass3_Sub28ArrayArray2[arg0][local131.anInt5445];
			if (local289 != null && local289.anInt5438 < 0) {
				this.aClass3_Sub28ArrayArray1[arg0][local289.anInt5446] = null;
				local289.anInt5438 = 0;
			}
			this.aClass3_Sub28ArrayArray2[arg0][local131.anInt5445] = local131;
		}
		this.aClass3_Sub9_Sub4_1.aClass71_63.method2076(local131);
		this.aClass3_Sub28ArrayArray1[arg0][arg2] = local131;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lclient!kv;Z)I")
	private int method1200(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(14) int local14 = (arg0.anInt5435 * arg0.anInt5444 >> 12) + arg0.anInt5434;
		local14 += this.anIntArray166[arg0.anInt5447] * (this.anIntArray170[arg0.anInt5447] - 8192) >> 12;
		@Pc(35) Class287 local35 = arg0.aClass287_1;
		@Pc(58) int local58;
		if (local35.anInt8631 > 0 && (local35.anInt8625 > 0 || this.anIntArray168[arg0.anInt5447] > 0)) {
			local58 = local35.anInt8625 << 2;
			@Pc(63) int local63 = local35.anInt8623 << 1;
			if (arg0.anInt5441 < local63) {
				local58 = local58 * arg0.anInt5441 / local63;
			}
			local58 += this.anIntArray168[arg0.anInt5447] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt5448 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local93);
		}
		local58 = (int) ((double) (arg0.aClass3_Sub42_Sub1_4.anInt8318 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static361.anInt6755 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
	private void method1201(@OriginalArg(1) int arg0) {
		if ((this.anIntArray159[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class3_Sub28 local23 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2089(); local23 != null; local23 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2086()) {
			if (local23.anInt5447 == arg0 && this.aClass3_Sub28ArrayArray1[arg0][local23.anInt5446] == null && local23.anInt5438 < 0) {
				local23.anInt5438 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)V")
	public synchronized void method1202() {
		this.method1207(true);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(IBI)V")
	public synchronized void method1203() {
		this.method1196();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!kv;)Z")
	public boolean method1204(@OriginalArg(1) Class3_Sub28 arg0) {
		if (arg0.aClass3_Sub9_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt5438 >= 0) {
			arg0.method7820();
			if (arg0.anInt5445 > 0 && this.aClass3_Sub28ArrayArray2[arg0.anInt5447][arg0.anInt5445] == arg0) {
				this.aClass3_Sub28ArrayArray2[arg0.anInt5447][arg0.anInt5445] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)V")
	private void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZBLclient!qh;Z)V")
	private synchronized void method1206(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub39 arg1, @OriginalArg(3) boolean arg2) {
		this.method1207(arg0);
		this.aClass193_1.method5007(arg1.aByteArray85);
		this.aBoolean94 = arg2;
		this.aLong43 = 0L;
		@Pc(24) int local24 = this.aClass193_1.method5004();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass193_1.method5005(local34);
			this.aClass193_1.method5000(local34);
			this.aClass193_1.method4999(local34);
		}
		this.anInt1281 = this.aClass193_1.method5001();
		this.anInt1280 = this.aClass193_1.anIntArray532[this.anInt1281];
		this.aLong44 = this.aClass193_1.method5011(this.anInt1280);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6931(@OriginalArg(0) int arg0) {
		if (this.aClass193_1.method5002()) {
			@Pc(14) int local14 = this.aClass193_1.anInt5987 * this.anInt1278 / Static361.anInt6755;
			do {
				@Pc(23) long local23 = this.aLong43 + (long) arg0 * (long) local14;
				if (this.aLong44 - local23 >= 0L) {
					this.aLong43 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong44 + (long) local14 - this.aLong43 - 1L) / (long) local14);
				this.aLong43 += (long) local14 * (long) local53;
				this.aClass3_Sub9_Sub4_1.method6931(local53);
				arg0 -= local53;
				this.method1191();
			} while (this.aClass193_1.method5002());
		}
		this.aClass3_Sub9_Sub4_1.method6931(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	private synchronized void method1207(@OriginalArg(1) boolean arg0) {
		this.aClass193_1.method5006();
		this.aClass3_Sub39_1 = null;
		this.method1213(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II[ILclient!kv;B)Z")
	public boolean method1208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class3_Sub28 arg3) {
		arg3.anInt5437 = Static361.anInt6755 / 100;
		if (arg3.anInt5438 >= 0 && (arg3.aClass3_Sub9_Sub2_4 == null || arg3.aClass3_Sub9_Sub2_4.method5341())) {
			arg3.method4580();
			arg3.method7820();
			if (arg3.anInt5445 > 0 && this.aClass3_Sub28ArrayArray2[arg3.anInt5447][arg3.anInt5445] == arg3) {
				this.aClass3_Sub28ArrayArray2[arg3.anInt5447][arg3.anInt5445] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt5435;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray169[arg3.anInt5447] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt5435 = local56;
		}
		arg3.aClass3_Sub9_Sub2_4.method5352(this.method1200(arg3));
		@Pc(99) Class287 local99 = arg3.aClass287_1;
		arg3.anInt5448 += local99.anInt8631;
		arg3.anInt5441++;
		@Pc(114) boolean local114 = false;
		@Pc(132) double local132 = (double) ((arg3.anInt5444 * arg3.anInt5435 >> 12) + (arg3.anInt5446 - 60 << 8)) * 5.086263020833333E-6D;
		if (local99.anInt8624 > 0) {
			if (local99.anInt8627 <= 0) {
				arg3.anInt5449 += 128;
			} else {
				arg3.anInt5449 += (int) (Math.pow(2.0D, (double) local99.anInt8627 * local132) * 128.0D + 0.5D);
			}
			if (arg3.anInt5449 * local99.anInt8624 >= 819200) {
				local114 = true;
			}
		}
		if (local99.aByteArray101 != null) {
			if (local99.anInt8632 <= 0) {
				arg3.anInt5450 += 128;
			} else {
				arg3.anInt5450 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt8632) * 128.0D + 0.5D);
			}
			while (arg3.anInt5439 < local99.aByteArray101.length - 2 && arg3.anInt5450 > (local99.aByteArray101[arg3.anInt5439 + 2] & 0xFF) << 8) {
				arg3.anInt5439 += 2;
			}
			if (local99.aByteArray101.length - 2 == arg3.anInt5439 && local99.aByteArray101[arg3.anInt5439 + 1] == 0) {
				local114 = true;
			}
		}
		if (arg3.anInt5438 >= 0 && local99.aByteArray100 != null && (this.anIntArray159[arg3.anInt5447] & 0x1) == 0 && (arg3.anInt5445 < 0 || this.aClass3_Sub28ArrayArray2[arg3.anInt5447][arg3.anInt5445] != arg3)) {
			if (local99.anInt8626 <= 0) {
				arg3.anInt5438 += 128;
			} else {
				arg3.anInt5438 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt8626) * 128.0D + 0.5D);
			}
			while (arg3.anInt5432 < local99.aByteArray100.length - 2 && arg3.anInt5438 > (local99.aByteArray100[arg3.anInt5432 + 2] & 0xFF) << 8) {
				arg3.anInt5432 += 2;
			}
			if (local99.aByteArray100.length - 2 == arg3.anInt5432) {
				local114 = true;
			}
		}
		if (!local114) {
			arg3.aClass3_Sub9_Sub2_4.method5374(arg3.anInt5437, this.method1212(arg3), this.method1197(arg3));
			return false;
		}
		arg3.aClass3_Sub9_Sub2_4.method5360(arg3.anInt5437);
		if (arg2 == null) {
			arg3.aClass3_Sub9_Sub2_4.method6931(arg0);
		} else {
			arg3.aClass3_Sub9_Sub2_4.method6930(arg2, arg1, arg0);
		}
		if (arg3.aClass3_Sub9_Sub2_4.method5366()) {
			this.aClass3_Sub9_Sub4_1.aClass3_Sub9_Sub3_1.method5654(arg3.aClass3_Sub9_Sub2_4);
		}
		arg3.method4580();
		if (arg3.anInt5438 >= 0) {
			arg3.method7820();
			if (arg3.anInt5445 > 0 && this.aClass3_Sub28ArrayArray2[arg3.anInt5447][arg3.anInt5445] == arg3) {
				this.aClass3_Sub28ArrayArray2[arg3.anInt5447][arg3.anInt5445] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)V")
	public synchronized void method1209(@OriginalArg(0) int arg0) {
		this.anInt1239 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6926() {
		return 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)V")
	private synchronized void method1210() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray161[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "()Lclient!bk;")
	@Override
	public synchronized Class3_Sub9 method6928() {
		return null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!qh;ILclient!kea;Lclient!ts;)Z")
	public synchronized boolean method1211(@OriginalArg(1) Class3_Sub39 arg0, @OriginalArg(3) Class161 arg1, @OriginalArg(4) Class286 arg2) {
		arg0.method6027();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub48 local26 = (Class3_Sub48) arg0.aClass267_36.method6643(); local26 != null; local26 = (Class3_Sub48) arg0.aClass267_36.method6650()) {
			@Pc(32) int local32 = (int) local26.aLong285;
			@Pc(40) Class3_Sub26 local40 = (Class3_Sub26) this.aClass267_7.method6644((long) local32);
			if (local40 == null) {
				local40 = Static45.method980(arg1, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass267_7.method6640(local40, (long) local32);
			}
			if (!local40.method4355(arg2, local26.aByteArray110, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method6026();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!kv;)I")
	private int method1212(@OriginalArg(1) Class3_Sub28 arg0) {
		if (this.anIntArray161[arg0.anInt5447] == 0) {
			return 0;
		}
		@Pc(17) Class287 local17 = arg0.aClass287_1;
		@Pc(33) int local33 = this.anIntArray163[arg0.anInt5447] * this.anIntArray173[arg0.anInt5447] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt5436 * local41 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt1239 * local50 + 128 >> 8;
		local33 = local59 * this.anIntArray161[arg0.anInt5447] + 128 >> 8;
		if (local17.anInt8624 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt8624 * (double) arg0.anInt5449 * 1.953125E-5D) * (double) local33 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local17.aByteArray101 != null) {
			local104 = arg0.anInt5450;
			local112 = local17.aByteArray101[arg0.anInt5439 + 1];
			if (arg0.anInt5439 < local17.aByteArray101.length - 2) {
				local134 = (local17.aByteArray101[arg0.anInt5439] & 0xFF) << 8;
				local146 = (local17.aByteArray101[arg0.anInt5439 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (-local112 + local17.aByteArray101[arg0.anInt5439 + 3]) / (local146 - local134);
			}
			local33 = local112 * local33 + 32 >> 6;
		}
		if (arg0.anInt5438 > 0 && local17.aByteArray100 != null) {
			local104 = arg0.anInt5438;
			local112 = local17.aByteArray100[arg0.anInt5432 + 1];
			if (local17.aByteArray100.length - 2 > arg0.anInt5432) {
				local134 = (local17.aByteArray100[arg0.anInt5432] & 0xFF) << 8;
				local146 = (local17.aByteArray100[arg0.anInt5432 + 2] & 0xFF) << 8;
				local112 += (local17.aByteArray100[arg0.anInt5432 + 3] - local112) * (-local134 + local104) / (local146 - local134);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IZ)V")
	private void method1213(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1185(-1);
		} else {
			this.method1187(-1);
		}
		this.method1188(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray172[local31] = this.anIntArray167[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray162[local47] = this.anIntArray167[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!qh;I)V")
	public synchronized void method1214(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub39 arg1) {
		this.method1206(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIII)V")
	private void method1215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub28 local12 = this.aClass3_Sub28ArrayArray1[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub28ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray159[arg2] & 0x2) == 0) {
			local12.anInt5438 = 0;
			return;
		}
		for (@Pc(45) Class3_Sub28 local45 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2089(); local45 != null; local45 = (Class3_Sub28) this.aClass3_Sub9_Sub4_1.aClass71_63.method2086()) {
			if (local12.anInt5447 == local45.anInt5447 && local45.anInt5438 < 0 && local12 != local45) {
				local12.anInt5438 = 0;
				return;
			}
		}
	}
}
