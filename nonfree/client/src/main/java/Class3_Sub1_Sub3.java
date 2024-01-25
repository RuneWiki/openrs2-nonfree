import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dr", name = "Jb", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!dr", name = "Lb", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!dr", name = "Mb", descriptor = "I")
	private int anInt2381;

	@OriginalMember(owner = "client!dr", name = "Nb", descriptor = "Z")
	private boolean aBoolean191;

	@OriginalMember(owner = "client!dr", name = "Ob", descriptor = "I")
	private int anInt2382;

	@OriginalMember(owner = "client!dr", name = "Pb", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!dr", name = "Qb", descriptor = "Lclient!an;")
	private Class3_Sub4 aClass3_Sub4_1;

	@OriginalMember(owner = "client!dr", name = "Rb", descriptor = "I")
	private int anInt2383;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "[I")
	public final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "[I")
	public final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!dr", name = "Q", descriptor = "[I")
	private final int[] anIntArray183 = new int[16];

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "[I")
	private final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "[I")
	private final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!dr", name = "O", descriptor = "[I")
	private final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "[I")
	private final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!dr", name = "fb", descriptor = "[[Lclient!sq;")
	private final Class3_Sub50[][] aClass3_Sub50ArrayArray1 = new Class3_Sub50[16][128];

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!dr", name = "X", descriptor = "[I")
	private final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!dr", name = "ib", descriptor = "[I")
	private final int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!dr", name = "kb", descriptor = "[I")
	private final int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!dr", name = "Ab", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!dr", name = "yb", descriptor = "[I")
	private final int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!dr", name = "Db", descriptor = "[[Lclient!sq;")
	private final Class3_Sub50[][] aClass3_Sub50ArrayArray2 = new Class3_Sub50[16][128];

	@OriginalMember(owner = "client!dr", name = "rb", descriptor = "I")
	private int anInt2367 = 256;

	@OriginalMember(owner = "client!dr", name = "qb", descriptor = "I")
	private final int anInt2366 = 1000000;

	@OriginalMember(owner = "client!dr", name = "db", descriptor = "[I")
	private final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!dr", name = "gb", descriptor = "[I")
	public final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!dr", name = "Hb", descriptor = "[I")
	private final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Lclient!kh;")
	private final Class188 aClass188_1 = new Class188();

	@OriginalMember(owner = "client!dr", name = "Kb", descriptor = "Lclient!lia;")
	private final Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1 = new Class3_Sub1_Sub4(this);

	@OriginalMember(owner = "client!dr", name = "hb", descriptor = "Lclient!ee;")
	private final Class83 aClass83_7;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub3() {
		this.aClass83_7 = new Class83(128);
		this.method2169(256, -1);
		this.method2146(true);
	}

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class3_Sub1_Sub3(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		this.aClass83_7 = arg0.aClass83_7;
		this.method2169(256, -1);
		this.method2146(true);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(III)V")
	private void method2143() {
		this.anIntArray180[9] = 128;
		this.anIntArray178[9] = 128;
		this.method2158(9, 128);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZLclient!sq;)V")
	public void method2144(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub50 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub35_Sub1_4.aByteArray56.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass3_Sub35_Sub1_4.aBoolean393) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass3_Sub35_Sub1_4.anInt5395;
			local36 = (int) ((long) this.anIntArray176[arg1.anInt9083] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local36 >= local8) {
				local36 = local8 + local8 - local36 - 1;
				arg1.aClass3_Sub1_Sub1_4.method87();
			}
		} else {
			local36 = (int) ((long) local8 * (long) this.anIntArray176[arg1.anInt9083] >> 6);
		}
		arg1.aClass3_Sub1_Sub1_4.method74(local36);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
	private void method2145(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2178(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method2178(local24, local18, 64);
			} else {
				this.method2156(local18, local24, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2155(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray178[local18] = (local30 << 14) + (this.anIntArray178[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray178[local18] = (this.anIntArray178[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray188[local18] = (this.anIntArray188[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray188[local18] = (this.anIntArray188[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray177[local18] = (this.anIntArray177[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray177[local18] = local30 + (this.anIntArray177[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray182[local18] = (this.anIntArray182[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray182[local18] = local30 + (this.anIntArray182[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray187[local18] = (this.anIntArray187[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray187[local18] = local30 + (this.anIntArray187[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray183[local18] = (local30 << 7) + (this.anIntArray183[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray183[local18] = (this.anIntArray183[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray186[local18] |= 0x1;
				} else {
					this.anIntArray186[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray186[local18] |= 0x2;
				} else {
					this.method2174(local18);
					this.anIntArray186[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray190[local18] = (this.anIntArray190[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray190[local18] = (this.anIntArray190[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray190[local18] = (local30 << 7) + (this.anIntArray190[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray190[local18] = (this.anIntArray190[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method2165(local18);
			}
			if (local24 == 121) {
				this.method2151(local18);
			}
			if (local24 == 123) {
				this.method2152(local18);
			}
			@Pc(509) int local509;
			if (local24 == 6) {
				local509 = this.anIntArray190[local18];
				if (local509 == 16384) {
					this.anIntArray189[local18] = (this.anIntArray189[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local509 = this.anIntArray190[local18];
				if (local509 == 16384) {
					this.anIntArray189[local18] = local30 + (this.anIntArray189[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray176[local18] = (this.anIntArray176[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray176[local18] = local30 + (this.anIntArray176[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray186[local18] |= 0x4;
				} else {
					this.method2163(local18);
					this.anIntArray186[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2164((this.anIntArray179[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method2164((this.anIntArray179[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2158(local18, this.anIntArray178[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2148(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F8D) >> 8);
			this.method2167(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2146(true);
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)V")
	private void method2146(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2165(-1);
		} else {
			this.method2152(-1);
		}
		this.method2151(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray185[local23] = this.anIntArray180[local23];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray178[local49] = this.anIntArray180[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!sq;B)I")
	private int method2147(@OriginalArg(0) Class3_Sub50 arg0) {
		@Pc(14) int local14 = (arg0.anInt9075 * arg0.anInt9079 >> 12) + arg0.anInt9076;
		local14 += this.anIntArray189[arg0.anInt9083] * (this.anIntArray184[arg0.anInt9083] - 8192) >> 12;
		@Pc(35) Class387 local35 = arg0.aClass387_1;
		@Pc(61) int local61;
		if (local35.anInt10599 > 0 && (local35.anInt10601 > 0 || this.anIntArray188[arg0.anInt9083] > 0)) {
			local61 = local35.anInt10601 << 2;
			@Pc(66) int local66 = local35.anInt10598 << 1;
			if (arg0.anInt9074 < local66) {
				local61 = arg0.anInt9074 * local61 / local66;
			}
			local61 += this.anIntArray188[arg0.anInt9083] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt9077 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local61 * local100);
		}
		local61 = (int) ((double) (arg0.aClass3_Sub35_Sub1_4.anInt5396 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static348.anInt5701 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(III)V")
	private void method2148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "()I")
	@Override
	public synchronized int method5780() {
		return 0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "()Lclient!sia;")
	@Override
	public synchronized Class3_Sub1 method5778() {
		return this.aClass3_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)V")
	public synchronized void method2149(@OriginalArg(1) int arg0) {
		this.anInt2367 = arg0;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public synchronized void method2150() {
		for (@Pc(15) Class3_Sub20 local15 = (Class3_Sub20) this.aClass83_7.method2375(); local15 != null; local15 = (Class3_Sub20) this.aClass83_7.method2370()) {
			local15.method9380();
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(IB)V")
	private void method2151(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2151(local9);
			}
			return;
		}
		this.anIntArray182[arg0] = 12800;
		this.anIntArray187[arg0] = 8192;
		this.anIntArray183[arg0] = 16383;
		this.anIntArray184[arg0] = 8192;
		this.anIntArray188[arg0] = 0;
		this.anIntArray177[arg0] = 8192;
		this.method2174(arg0);
		this.method2163(arg0);
		this.anIntArray186[arg0] = 0;
		this.anIntArray190[arg0] = 32767;
		this.anIntArray189[arg0] = 256;
		this.anIntArray176[arg0] = 0;
		this.method2164(8192, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)V")
	private void method2152(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub50 local12 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8177(); local12 != null; local12 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8168()) {
			if ((arg0 < 0 || local12.anInt9083 == arg0) && local12.anInt9081 < 0) {
				this.aClass3_Sub50ArrayArray1[local12.anInt9083][local12.anInt9065] = null;
				local12.anInt9081 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IZ)V")
	private synchronized void method2153(@OriginalArg(1) boolean arg0) {
		this.aClass188_1.method4725();
		this.aClass3_Sub4_1 = null;
		this.method2146(arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIII)V")
	private void method2155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBII)V")
	private void method2156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2178(arg1, arg0, 64);
		if ((this.anIntArray186[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub50 local25 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8167(); local25 != null; local25 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8174()) {
				if (arg0 == local25.anInt9083 && local25.anInt9081 < 0) {
					this.aClass3_Sub50ArrayArray1[arg0][local25.anInt9065] = null;
					this.aClass3_Sub50ArrayArray1[arg0][arg1] = local25;
					@Pc(60) int local60 = (local25.anInt9079 * local25.anInt9075 >> 12) + local25.anInt9076;
					local25.anInt9076 += arg1 - local25.anInt9065 << 8;
					local25.anInt9075 = 4096;
					local25.anInt9065 = arg1;
					local25.anInt9079 = local60 - local25.anInt9076;
					return;
				}
			}
		}
		@Pc(105) Class3_Sub20 local105 = (Class3_Sub20) this.aClass83_7.method2368((long) this.anIntArray185[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class3_Sub35_Sub1 local113 = local105.aClass3_Sub35_Sub1Array1[arg1];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class3_Sub50 local120 = new Class3_Sub50();
		local120.anInt9083 = arg0;
		local120.aClass3_Sub20_1 = local105;
		local120.aClass3_Sub35_Sub1_4 = local113;
		local120.aClass387_1 = local105.aClass387Array1[arg1];
		local120.anInt9082 = local105.aByteArray17[arg1];
		local120.anInt9065 = arg1;
		local120.anInt9073 = local105.aByteArray16[arg1] * local105.anInt2471 * arg2 * arg2 + 1024 >> 11;
		local120.anInt9070 = local105.aByteArray18[arg1] & 0xFF;
		local120.anInt9076 = (arg1 << 8) - (local105.aShortArray29[arg1] & 0x7FFF);
		local120.anInt9080 = 0;
		local120.anInt9071 = 0;
		local120.anInt9068 = 0;
		local120.anInt9066 = 0;
		local120.anInt9081 = -1;
		if (this.anIntArray176[arg0] == 0) {
			local120.aClass3_Sub1_Sub1_4 = Static679.method67(local113, this.method2147(local120), this.method2180(local120), this.method2157(local120));
		} else {
			local120.aClass3_Sub1_Sub1_4 = Static679.method67(local113, this.method2147(local120), 0, this.method2157(local120));
			this.method2144(local105.aShortArray29[arg1] < 0, local120);
		}
		if (local105.aShortArray29[arg1] < 0) {
			local120.aClass3_Sub1_Sub1_4.method100(-1);
		}
		if (local120.anInt9082 >= 0) {
			@Pc(278) Class3_Sub50 local278 = this.aClass3_Sub50ArrayArray2[arg0][local120.anInt9082];
			if (local278 != null && local278.anInt9081 < 0) {
				this.aClass3_Sub50ArrayArray1[arg0][local278.anInt9065] = null;
				local278.anInt9081 = 0;
			}
			this.aClass3_Sub50ArrayArray2[arg0][local120.anInt9082] = local120;
		}
		this.aClass3_Sub1_Sub4_1.aClass338_145.method8171(local120);
		this.aClass3_Sub50ArrayArray1[arg0][arg1] = local120;
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(Lclient!sq;B)I")
	private int method2157(@OriginalArg(0) Class3_Sub50 arg0) {
		@Pc(14) int local14 = this.anIntArray187[arg0.anInt9083];
		return local14 < 8192 ? arg0.anInt9070 * local14 + 32 >> 6 : 16384 - ((16384 - local14) * (-arg0.anInt9070 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(III)V")
	private void method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray185[arg0]) {
			this.anIntArray185[arg0] = arg1;
			for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
				this.aClass3_Sub50ArrayArray2[arg0][local27] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZILclient!an;Z)V")
	private synchronized void method2159(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub4 arg1, @OriginalArg(3) boolean arg2) {
		this.method2153(arg0);
		this.aClass188_1.method4724(arg1.aByteArray2);
		this.aBoolean191 = arg2;
		this.aLong69 = 0L;
		@Pc(24) int local24 = this.aClass188_1.method4715();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass188_1.method4721(local26);
			this.aClass188_1.method4723(local26);
			this.aClass188_1.method4718(local26);
		}
		this.anInt2382 = this.aClass188_1.method4714();
		this.anInt2381 = this.aClass188_1.anIntArray461[this.anInt2382];
		this.aLong68 = this.aClass188_1.method4727(this.anInt2381);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBI)V")
	public synchronized void method2160() {
		this.method2143();
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)Z")
	public synchronized boolean method2161() {
		return this.aClass188_1.method4720();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BJ)V")
	private void method2162(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong68) {
			@Pc(10) int local10 = this.anInt2382;
			@Pc(13) int local13 = this.anInt2381;
			@Pc(16) long local16 = this.aLong68;
			while (this.anInt2381 == local13) {
				while (this.aClass188_1.anIntArray461[local10] == local13) {
					this.aClass188_1.method4721(local10);
					@Pc(27) int local27 = this.aClass188_1.method4717(local10);
					if (local27 == 1) {
						this.aClass188_1.method4722();
						this.aClass188_1.method4718(local10);
						if (this.aClass188_1.method4719()) {
							if (!this.aBoolean191 || local13 == 0) {
								this.method2146(true);
								this.aClass188_1.method4725();
								return;
							}
							this.aClass188_1.method4728(local16);
						}
						break;
					}
					if ((local27 & 0x80) != 0 && (local27 & 0xF0) != 144) {
						this.method2145(local27);
					}
					this.aClass188_1.method4723(local10);
					this.aClass188_1.method4718(local10);
				}
				this.aLong69 = local16;
				local10 = this.aClass188_1.method4714();
				local13 = this.aClass188_1.anIntArray461[local10];
				local16 = this.aClass188_1.method4727(local13);
			}
			this.aLong68 = local16;
			this.anInt2381 = local13;
			this.anInt2382 = local10;
		}
	}

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(IB)V")
	private void method2163(@OriginalArg(0) int arg0) {
		if ((this.anIntArray186[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class3_Sub50 local19 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8177(); local19 != null; local19 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8168()) {
			if (arg0 == local19.anInt9083) {
				local19.anInt9072 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(III)V")
	private void method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray179[arg1] = arg0;
		this.anIntArray181[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(II)V")
	private void method2165(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class3_Sub50 local8 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8177(); local8 != null; local8 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8168()) {
			if (arg0 < 0 || local8.anInt9083 == arg0) {
				if (local8.aClass3_Sub1_Sub1_4 != null) {
					local8.aClass3_Sub1_Sub1_4.method104(Static348.anInt5701 / 100);
					if (local8.aClass3_Sub1_Sub1_4.method105()) {
						this.aClass3_Sub1_Sub4_1.aClass3_Sub1_Sub2_2.method934(local8.aClass3_Sub1_Sub1_4);
					}
					local8.method7930();
				}
				if (local8.anInt9081 < 0) {
					this.aClass3_Sub50ArrayArray1[local8.anInt9083][local8.anInt9065] = null;
				}
				local8.method9380();
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZ)V")
	private void method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray184[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!sq;I)Z")
	public boolean method2168(@OriginalArg(0) Class3_Sub50 arg0) {
		if (arg0.aClass3_Sub1_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt9081 >= 0) {
			arg0.method9380();
			if (arg0.anInt9082 > 0 && arg0 == this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082]) {
				this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(III)V")
	public synchronized void method2169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
				this.anIntArray191[local6] = arg0;
			}
		} else {
			this.anIntArray191[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(B)V")
	private void method2170() {
		@Pc(8) int local8 = this.anInt2382;
		@Pc(11) int local11 = this.anInt2381;
		@Pc(14) long local14 = this.aLong68;
		if (this.aClass3_Sub4_1 != null && this.anInt2383 == local11) {
			this.method2159(this.aBoolean192, this.aClass3_Sub4_1, this.aBoolean191);
			this.method2170();
			return;
		}
		while (local11 == this.anInt2381) {
			while (this.aClass188_1.anIntArray461[local8] == local11) {
				this.aClass188_1.method4721(local8);
				@Pc(43) int local43 = this.aClass188_1.method4717(local8);
				if (local43 == 1) {
					this.aClass188_1.method4722();
					this.aClass188_1.method4718(local8);
					if (this.aClass188_1.method4719()) {
						if (this.aClass3_Sub4_1 != null) {
							this.method2177(this.aBoolean191, this.aClass3_Sub4_1);
							this.method2170();
							return;
						}
						if (!this.aBoolean191 || local11 == 0) {
							this.method2146(true);
							this.aClass188_1.method4725();
							return;
						}
						this.aClass188_1.method4728(local14);
					}
					break;
				}
				if ((local43 & 0x80) != 0) {
					this.method2145(local43);
				}
				this.aClass188_1.method4723(local8);
				this.aClass188_1.method4718(local8);
			}
			local8 = this.aClass188_1.method4714();
			local11 = this.aClass188_1.anIntArray461[local8];
			local14 = this.aClass188_1.method4727(local11);
		}
		this.aLong68 = local14;
		this.anInt2381 = local11;
		this.anInt2382 = local8;
		if (this.aClass3_Sub4_1 != null && local11 > this.anInt2383) {
			this.anInt2382 = -1;
			this.anInt2381 = this.anInt2383;
			this.aLong68 = this.aClass188_1.method4727(this.anInt2381);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!mp;ZLclient!an;ILclient!aj;)Z")
	public synchronized boolean method2171(@OriginalArg(0) Class226 arg0, @OriginalArg(2) Class3_Sub4 arg1, @OriginalArg(4) Class15 arg2) {
		arg1.method615();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub6 local26 = (Class3_Sub6) arg1.aClass83_1.method2375(); local26 != null; local26 = (Class3_Sub6) arg1.aClass83_1.method2370()) {
			@Pc(32) int local32 = (int) local26.aLong311;
			@Pc(40) Class3_Sub20 local40 = (Class3_Sub20) this.aClass83_7.method2368((long) local32);
			if (local40 == null) {
				local40 = Static297.method4579(local32, arg2);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass83_7.method2377((long) local32, local40);
			}
			if (!local40.method2269(local26.aByteArray5, local20, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method613();
		}
		return local9;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass188_1.method4720()) {
			@Pc(14) int local14 = this.anInt2366 * this.aClass188_1.anInt5134 / Static348.anInt5701;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong69;
				if (this.aLong68 - local23 >= 0L) {
					this.aLong69 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong68 + (long) local14 - this.aLong69 - 1L) / (long) local14);
				this.aLong69 += (long) local54 * (long) local14;
				this.aClass3_Sub1_Sub4_1.method5783(arg0, arg1, local54);
				arg1 += local54;
				this.method2170();
				arg2 -= local54;
			} while (this.aClass188_1.method4720());
		}
		this.aClass3_Sub1_Sub4_1.method5783(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(JZZLclient!an;Z)V")
	public synchronized void method2173(@OriginalArg(0) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub4 arg2) {
		this.method2159(true, arg2, arg1);
		this.method2162((long) this.aClass188_1.anInt5134 * arg0);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(BI)V")
	private void method2174(@OriginalArg(1) int arg0) {
		if ((this.anIntArray186[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub50 local15 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8177(); local15 != null; local15 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8168()) {
			if (arg0 == local15.anInt9083 && this.aClass3_Sub50ArrayArray1[arg0][local15.anInt9065] == null && local15.anInt9081 < 0) {
				local15.anInt9081 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)I")
	public int method2175() {
		return this.anInt2367;
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V")
	public synchronized void method2176() {
		this.method2153(true);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZLclient!an;I)V")
	public synchronized void method2177(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		this.method2159(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIB)V")
	private void method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class3_Sub50 local16 = this.aClass3_Sub50ArrayArray1[arg1][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass3_Sub50ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray186[arg1] & 0x2) == 0) {
			local16.anInt9081 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub50 local44 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8177(); local44 != null; local44 = (Class3_Sub50) this.aClass3_Sub1_Sub4_1.aClass338_145.method8168()) {
			if (local44.anInt9083 == local16.anInt9083 && local44.anInt9081 < 0 && local44 != local16) {
				local16.anInt9081 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5779(@OriginalArg(0) int arg0) {
		if (this.aClass188_1.method4720()) {
			@Pc(18) int local18 = this.aClass188_1.anInt5134 * this.anInt2366 / Static348.anInt5701;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong69;
				if (this.aLong68 - local27 >= 0L) {
					this.aLong69 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong68 - this.aLong69 - 1L) / (long) local18);
				this.aLong69 += (long) local55 * (long) local18;
				this.aClass3_Sub1_Sub4_1.method5779(local55);
				arg0 -= local55;
				this.method2170();
			} while (this.aClass188_1.method4720());
		}
		this.aClass3_Sub1_Sub4_1.method5779(arg0);
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!sq;I[III)Z")
	public boolean method2179(@OriginalArg(0) Class3_Sub50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0.anInt9069 = Static348.anInt5701 / 100;
		if (arg0.anInt9081 >= 0 && (arg0.aClass3_Sub1_Sub1_4 == null || arg0.aClass3_Sub1_Sub1_4.method68())) {
			arg0.method7930();
			arg0.method9380();
			if (arg0.anInt9082 > 0 && arg0 == this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082]) {
				this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082] = null;
			}
			return true;
		}
		@Pc(63) int local63 = arg0.anInt9075;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray177[arg0.anInt9083] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg0.anInt9075 = local63;
		}
		arg0.aClass3_Sub1_Sub1_4.method90(this.method2147(arg0));
		@Pc(103) Class387 local103 = arg0.aClass387_1;
		@Pc(105) boolean local105 = false;
		arg0.anInt9077 += local103.anInt10599;
		arg0.anInt9074++;
		@Pc(137) double local137 = (double) ((arg0.anInt9065 - 60 << 8) + (arg0.anInt9079 * arg0.anInt9075 >> 12)) * 5.086263020833333E-6D;
		if (local103.anInt10600 > 0) {
			if (local103.anInt10605 <= 0) {
				arg0.anInt9080 += 128;
			} else {
				arg0.anInt9080 += (int) (Math.pow(2.0D, local137 * (double) local103.anInt10605) * 128.0D + 0.5D);
			}
			if (arg0.anInt9080 * local103.anInt10600 >= 819200) {
				local105 = true;
			}
		}
		if (local103.aByteArray109 != null) {
			if (local103.anInt10603 <= 0) {
				arg0.anInt9071 += 128;
			} else {
				arg0.anInt9071 += (int) (Math.pow(2.0D, (double) local103.anInt10603 * local137) * 128.0D + 0.5D);
			}
			while (arg0.anInt9066 < local103.aByteArray109.length - 2 && arg0.anInt9071 > (local103.aByteArray109[arg0.anInt9066 + 2] & 0xFF) << 8) {
				arg0.anInt9066 += 2;
			}
			if (arg0.anInt9066 == local103.aByteArray109.length - 2 && local103.aByteArray109[arg0.anInt9066 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg0.anInt9081 >= 0 && local103.aByteArray110 != null && (this.anIntArray186[arg0.anInt9083] & 0x1) == 0 && (arg0.anInt9082 < 0 || arg0 != this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082])) {
			if (local103.anInt10597 > 0) {
				arg0.anInt9081 += (int) (Math.pow(2.0D, local137 * (double) local103.anInt10597) * 128.0D + 0.5D);
			} else {
				arg0.anInt9081 += 128;
			}
			while (arg0.anInt9068 < local103.aByteArray110.length - 2 && (local103.aByteArray110[arg0.anInt9068 + 2] & 0xFF) << 8 < arg0.anInt9081) {
				arg0.anInt9068 += 2;
			}
			if (local103.aByteArray110.length - 2 == arg0.anInt9068) {
				local105 = true;
			}
		}
		if (!local105) {
			arg0.aClass3_Sub1_Sub1_4.method86(arg0.anInt9069, this.method2180(arg0), this.method2157(arg0));
			return false;
		}
		arg0.aClass3_Sub1_Sub1_4.method104(arg0.anInt9069);
		if (arg2 == null) {
			arg0.aClass3_Sub1_Sub1_4.method5779(arg3);
		} else {
			arg0.aClass3_Sub1_Sub1_4.method5783(arg2, arg1, arg3);
		}
		if (arg0.aClass3_Sub1_Sub1_4.method105()) {
			this.aClass3_Sub1_Sub4_1.aClass3_Sub1_Sub2_2.method934(arg0.aClass3_Sub1_Sub1_4);
		}
		arg0.method7930();
		if (arg0.anInt9081 >= 0) {
			arg0.method9380();
			if (arg0.anInt9082 > 0 && arg0 == this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082]) {
				this.aClass3_Sub50ArrayArray2[arg0.anInt9083][arg0.anInt9082] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!sq;)I")
	private int method2180(@OriginalArg(1) Class3_Sub50 arg0) {
		if (this.anIntArray191[arg0.anInt9083] == 0) {
			return 0;
		}
		@Pc(14) Class387 local14 = arg0.aClass387_1;
		@Pc(30) int local30 = this.anIntArray182[arg0.anInt9083] * this.anIntArray183[arg0.anInt9083] + 4096 >> 13;
		@Pc(43) int local43 = local30 * local30 + 16384 >> 15;
		@Pc(52) int local52 = local43 * arg0.anInt9073 + 16384 >> 15;
		@Pc(61) int local61 = this.anInt2367 * local52 + 128 >> 8;
		local30 = local61 * this.anIntArray191[arg0.anInt9083] + 128 >> 8;
		if (local14.anInt10600 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local14.anInt10600 * (double) arg0.anInt9080 * 1.953125E-5D) + 0.5D);
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local14.aByteArray109 != null) {
			local100 = arg0.anInt9071;
			local108 = local14.aByteArray109[arg0.anInt9066 + 1];
			if (arg0.anInt9066 < local14.aByteArray109.length - 2) {
				local130 = (local14.aByteArray109[arg0.anInt9066] & 0xFF) << 8;
				local142 = (local14.aByteArray109[arg0.anInt9066 + 2] & 0xFF) << 8;
				local108 += (local100 - local130) * (-local108 + local14.aByteArray109[arg0.anInt9066 + 3]) / (local142 - local130);
			}
			local30 = local30 * local108 + 32 >> 6;
		}
		if (arg0.anInt9081 > 0 && local14.aByteArray110 != null) {
			local100 = arg0.anInt9081;
			local108 = local14.aByteArray110[arg0.anInt9068 + 1];
			if (arg0.anInt9068 < local14.aByteArray110.length - 2) {
				local130 = (local14.aByteArray110[arg0.anInt9068] & 0xFF) << 8;
				local142 = (local14.aByteArray110[arg0.anInt9068 + 2] & 0xFF) << 8;
				local108 += (local14.aByteArray110[arg0.anInt9068 + 3] - local108) * (local100 - local130) / (local142 - local130);
			}
			local30 = local108 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "()Lclient!sia;")
	@Override
	public synchronized Class3_Sub1 method5782() {
		return null;
	}

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "(I)V")
	public synchronized void method2181() {
		for (@Pc(7) Class3_Sub20 local7 = (Class3_Sub20) this.aClass83_7.method2375(); local7 != null; local7 = (Class3_Sub20) this.aClass83_7.method2370()) {
			local7.method2270();
		}
	}
}
