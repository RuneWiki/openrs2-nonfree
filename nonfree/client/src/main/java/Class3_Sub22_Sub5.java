import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class3_Sub22_Sub5 extends Class3_Sub22 {

	@OriginalMember(owner = "client!wk", name = "Fb", descriptor = "J")
	private long aLong378;

	@OriginalMember(owner = "client!wk", name = "Mb", descriptor = "I")
	private int anInt11184;

	@OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
	private int anInt11185;

	@OriginalMember(owner = "client!wk", name = "ob", descriptor = "Z")
	private boolean aBoolean805;

	@OriginalMember(owner = "client!wk", name = "M", descriptor = "J")
	private long aLong379;

	@OriginalMember(owner = "client!wk", name = "Jb", descriptor = "Z")
	private boolean aBoolean806;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	private int anInt11186;

	@OriginalMember(owner = "client!wk", name = "rb", descriptor = "Lclient!lv;")
	private Class3_Sub32 aClass3_Sub32_4;

	@OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
	private int anInt11138 = 256;

	@OriginalMember(owner = "client!wk", name = "wb", descriptor = "[I")
	private final int[] anIntArray622 = new int[16];

	@OriginalMember(owner = "client!wk", name = "L", descriptor = "[I")
	private final int[] anIntArray625 = new int[16];

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "[[Lclient!ow;")
	private final Class3_Sub41[][] aClass3_Sub41ArrayArray2 = new Class3_Sub41[16][128];

	@OriginalMember(owner = "client!wk", name = "y", descriptor = "[I")
	private int[] anIntArray620 = new int[16];

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "[I")
	public final int[] anIntArray621 = new int[16];

	@OriginalMember(owner = "client!wk", name = "yb", descriptor = "I")
	private final int anInt11169 = 1000000;

	@OriginalMember(owner = "client!wk", name = "G", descriptor = "[I")
	private final int[] anIntArray627 = new int[16];

	@OriginalMember(owner = "client!wk", name = "qb", descriptor = "[[Lclient!ow;")
	private final Class3_Sub41[][] aClass3_Sub41ArrayArray1 = new Class3_Sub41[16][128];

	@OriginalMember(owner = "client!wk", name = "O", descriptor = "[I")
	private final int[] anIntArray628 = new int[16];

	@OriginalMember(owner = "client!wk", name = "W", descriptor = "[I")
	private final int[] anIntArray629 = new int[16];

	@OriginalMember(owner = "client!wk", name = "Bb", descriptor = "[I")
	private final int[] anIntArray624 = new int[16];

	@OriginalMember(owner = "client!wk", name = "vb", descriptor = "[I")
	private final int[] anIntArray623 = new int[16];

	@OriginalMember(owner = "client!wk", name = "Ab", descriptor = "[I")
	private final int[] anIntArray630 = new int[16];

	@OriginalMember(owner = "client!wk", name = "kb", descriptor = "[I")
	public final int[] anIntArray633 = new int[16];

	@OriginalMember(owner = "client!wk", name = "V", descriptor = "[I")
	private final int[] anIntArray635 = new int[16];

	@OriginalMember(owner = "client!wk", name = "fb", descriptor = "[I")
	private final int[] anIntArray634 = new int[16];

	@OriginalMember(owner = "client!wk", name = "tb", descriptor = "[I")
	private final int[] anIntArray632 = new int[16];

	@OriginalMember(owner = "client!wk", name = "cb", descriptor = "[I")
	private final int[] anIntArray636 = new int[16];

	@OriginalMember(owner = "client!wk", name = "Eb", descriptor = "[I")
	public final int[] anIntArray631 = new int[16];

	@OriginalMember(owner = "client!wk", name = "B", descriptor = "Lclient!ap;")
	private final Class16 aClass16_1 = new Class16();

	@OriginalMember(owner = "client!wk", name = "ub", descriptor = "Lclient!ml;")
	private final Class3_Sub22_Sub2 aClass3_Sub22_Sub2_1 = new Class3_Sub22_Sub2(this);

	@OriginalMember(owner = "client!wk", name = "zb", descriptor = "Lclient!gn;")
	private final Class136 aClass136_51;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class3_Sub22_Sub5() {
		this.aClass136_51 = new Class136(128);
		this.method9315(256, -1);
		this.method9329(-17, true);
	}

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class3_Sub22_Sub5(@OriginalArg(0) Class3_Sub22_Sub5 arg0) {
		this.aClass136_51 = arg0.aClass136_51;
		this.method9315(256, -1);
		this.method9329(-17, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ow;B)I")
	private int method9308(@OriginalArg(0) Class3_Sub41 arg0) {
		if (this.anIntArray630[arg0.anInt8288] == 0) {
			return 0;
		}
		@Pc(24) Class381 local24 = arg0.aClass381_1;
		@Pc(40) int local40 = this.anIntArray620[arg0.anInt8288] * this.anIntArray625[arg0.anInt8288] + 4096 >> 13;
		@Pc(48) int local48 = local40 * local40 + 16384 >> 15;
		@Pc(57) int local57 = local48 * arg0.anInt8278 + 16384 >> 15;
		@Pc(66) int local66 = local57 * this.anInt11138 + 128 >> 8;
		local40 = local66 * this.anIntArray630[arg0.anInt8288] + 128 >> 8;
		if (local24.anInt10653 > 0) {
			local40 = (int) (Math.pow(0.5D, (double) local24.anInt10653 * (double) arg0.anInt8285 * 1.953125E-5D) * (double) local40 + 0.5D);
		}
		@Pc(108) int local108;
		@Pc(116) int local116;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local24.aByteArray107 != null) {
			local108 = arg0.anInt8283;
			local116 = local24.aByteArray107[arg0.anInt8293 + 1];
			if (arg0.anInt8293 < local24.aByteArray107.length - 2) {
				local134 = (local24.aByteArray107[arg0.anInt8293] & 0xFF) << 8;
				local146 = (local24.aByteArray107[arg0.anInt8293 + 2] & 0xFF) << 8;
				local116 += (local108 - local134) * (-local116 + local24.aByteArray107[arg0.anInt8293 + 3]) / (local146 - local134);
			}
			local40 = local116 * local40 + 32 >> 6;
		}
		if (arg0.anInt8284 > 0 && local24.aByteArray106 != null) {
			local108 = arg0.anInt8284;
			local116 = local24.aByteArray106[arg0.anInt8291 + 1];
			if (local24.aByteArray106.length - 2 > arg0.anInt8291) {
				local134 = (local24.aByteArray106[arg0.anInt8291] & 0xFF) << 8;
				local146 = (local24.aByteArray106[arg0.anInt8291 + 2] & 0xFF) << 8;
				local116 += (local24.aByteArray106[arg0.anInt8291 + 3] - local116) * (-local134 + local108) / (local146 - local134);
			}
			local40 = local40 * local116 + 32 >> 6;
		}
		return local40;
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(II)V")
	private void method9309(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class3_Sub41 local20 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8391(); local20 != null; local20 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8392()) {
			if (arg0 < 0 || local20.anInt8288 == arg0) {
				if (local20.aClass3_Sub22_Sub1_2 != null) {
					local20.aClass3_Sub22_Sub1_2.method3899(Static103.anInt1658 / 100);
					if (local20.aClass3_Sub22_Sub1_2.method3883()) {
						this.aClass3_Sub22_Sub2_1.aClass3_Sub22_Sub4_2.method9058(local20.aClass3_Sub22_Sub1_2);
					}
					local20.method6965();
				}
				if (local20.anInt8284 < 0) {
					this.aClass3_Sub41ArrayArray2[local20.anInt8288][local20.anInt8289] = null;
				}
				local20.method9446();
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
	private void method9310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray632[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V")
	private void method9311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(24) Class3_Sub41 local24 = this.aClass3_Sub41ArrayArray2[arg2][arg1];
		if (local24 == null) {
			return;
		}
		this.aClass3_Sub41ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray633[arg2] & 0x2) == 0) {
			local24.anInt8284 = 0;
			return;
		}
		for (@Pc(54) Class3_Sub41 local54 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8391(); local54 != null; local54 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8392()) {
			if (local54.anInt8288 == local24.anInt8288 && local54.anInt8284 < 0 && local24 != local54) {
				local24.anInt8284 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI[ILclient!ow;)Z")
	public boolean method9312(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class3_Sub41 arg3) {
		arg3.anInt8276 = Static103.anInt1658 / 100;
		if (arg3.anInt8284 >= 0 && (arg3.aClass3_Sub22_Sub1_2 == null || arg3.aClass3_Sub22_Sub1_2.method3901())) {
			arg3.method6965();
			arg3.method9446();
			if (arg3.anInt8286 > 0 && arg3 == this.aClass3_Sub41ArrayArray1[arg3.anInt8288][arg3.anInt8286]) {
				this.aClass3_Sub41ArrayArray1[arg3.anInt8288][arg3.anInt8286] = null;
			}
			return true;
		}
		@Pc(68) int local68 = arg3.anInt8277;
		if (local68 > 0) {
			local68 -= (int) (Math.pow(2.0D, (double) this.anIntArray635[arg3.anInt8288] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local68 < 0) {
				local68 = 0;
			}
			arg3.anInt8277 = local68;
		}
		arg3.aClass3_Sub22_Sub1_2.method3905(this.method9322(arg3));
		@Pc(108) Class381 local108 = arg3.aClass381_1;
		@Pc(110) boolean local110 = false;
		arg3.anInt8274++;
		arg3.anInt8292 += local108.anInt10657;
		@Pc(141) double local141 = (double) ((arg3.anInt8289 - 60 << 8) + (arg3.anInt8277 * arg3.anInt8294 >> 12)) * 5.086263020833333E-6D;
		if (local108.anInt10653 > 0) {
			if (local108.anInt10654 <= 0) {
				arg3.anInt8285 += 128;
			} else {
				arg3.anInt8285 += (int) (Math.pow(2.0D, (double) local108.anInt10654 * local141) * 128.0D + 0.5D);
			}
			if (local108.anInt10653 * arg3.anInt8285 >= 819200) {
				local110 = true;
			}
		}
		if (local108.aByteArray107 != null) {
			if (local108.anInt10649 > 0) {
				arg3.anInt8283 += (int) (Math.pow(2.0D, (double) local108.anInt10649 * local141) * 128.0D + 0.5D);
			} else {
				arg3.anInt8283 += 128;
			}
			while (local108.aByteArray107.length - 2 > arg3.anInt8293 && arg3.anInt8283 > (local108.aByteArray107[arg3.anInt8293 + 2] & 0xFF) << 8) {
				arg3.anInt8293 += 2;
			}
			if (local108.aByteArray107.length - 2 == arg3.anInt8293 && local108.aByteArray107[arg3.anInt8293 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg3.anInt8284 >= 0 && local108.aByteArray106 != null && (this.anIntArray633[arg3.anInt8288] & 0x1) == 0 && (arg3.anInt8286 < 0 || this.aClass3_Sub41ArrayArray1[arg3.anInt8288][arg3.anInt8286] != arg3)) {
			if (local108.anInt10659 <= 0) {
				arg3.anInt8284 += 128;
			} else {
				arg3.anInt8284 += (int) (Math.pow(2.0D, local141 * (double) local108.anInt10659) * 128.0D + 0.5D);
			}
			while (local108.aByteArray106.length - 2 > arg3.anInt8291 && (local108.aByteArray106[arg3.anInt8291 + 2] & 0xFF) << 8 < arg3.anInt8284) {
				arg3.anInt8291 += 2;
			}
			if (local108.aByteArray106.length - 2 == arg3.anInt8291) {
				local110 = true;
			}
		}
		if (!local110) {
			arg3.aClass3_Sub22_Sub1_2.method3916(arg3.anInt8276, this.method9308(arg3), this.method9328(arg3));
			return false;
		}
		arg3.aClass3_Sub22_Sub1_2.method3899(arg3.anInt8276);
		if (arg2 == null) {
			arg3.aClass3_Sub22_Sub1_2.method9304(arg1);
		} else {
			arg3.aClass3_Sub22_Sub1_2.method9302(arg2, arg0, arg1);
		}
		if (arg3.aClass3_Sub22_Sub1_2.method3883()) {
			this.aClass3_Sub22_Sub2_1.aClass3_Sub22_Sub4_2.method9058(arg3.aClass3_Sub22_Sub1_2);
		}
		arg3.method6965();
		if (arg3.anInt8284 >= 0) {
			arg3.method9446();
			if (arg3.anInt8286 > 0 && arg3 == this.aClass3_Sub41ArrayArray1[arg3.anInt8288][arg3.anInt8286]) {
				this.aClass3_Sub41ArrayArray1[arg3.anInt8288][arg3.anInt8286] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "()I")
	@Override
	public synchronized int method9307() {
		return 0;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(II)V")
	private void method9313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(8) Class3_Sub41 local8 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8391(); local8 != null; local8 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8392()) {
			if ((arg1 < 0 || local8.anInt8288 == arg1) && local8.anInt8284 < 0) {
				this.aClass3_Sub41ArrayArray2[local8.anInt8288][local8.anInt8289] = null;
				local8.anInt8284 = 0;
			}
		}
		if (arg0 <= 103) {
			this.method9307();
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "()Lclient!fga;")
	@Override
	public synchronized Class3_Sub22 method9305() {
		return this.aClass3_Sub22_Sub2_1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BII)V")
	private void method9314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(III)V")
	public synchronized void method9315(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
				this.anIntArray630[local13] = arg0;
			}
		} else {
			this.anIntArray630[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(III)V")
	private void method9316() {
		this.anIntArray622[9] = 128;
		this.anIntArray627[9] = 128;
		this.method9321(9, 128);
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(I)V")
	public synchronized void method9318() {
		for (@Pc(7) Class3_Sub54 local7 = (Class3_Sub54) this.aClass136_51.method3509(); local7 != null; local7 = (Class3_Sub54) this.aClass136_51.method3506()) {
			local7.method9446();
		}
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(B)V")
	private void method9319() {
		@Pc(8) int local8 = this.anInt11185;
		@Pc(11) int local11 = this.anInt11184;
		@Pc(14) long local14 = this.aLong379;
		if (this.aClass3_Sub32_4 != null && local11 == this.anInt11186) {
			this.method9320(this.aBoolean805, this.aClass3_Sub32_4, this.aBoolean806);
			this.method9319();
			return;
		}
		while (this.anInt11184 == local11) {
			while (local11 == this.aClass16_1.anIntArray15[local8]) {
				this.aClass16_1.method386(local8);
				@Pc(50) int local50 = this.aClass16_1.method381(local8);
				if (local50 == 1) {
					this.aClass16_1.method384();
					this.aClass16_1.method392(local8);
					if (this.aClass16_1.method377()) {
						if (this.aClass3_Sub32_4 != null) {
							this.method9335(this.aBoolean805, this.aClass3_Sub32_4);
							this.method9319();
							return;
						}
						if (!this.aBoolean805 || local11 == 0) {
							this.method9329(-17, true);
							this.aClass16_1.method387();
							return;
						}
						this.aClass16_1.method389(local14);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method9333(local50);
				}
				this.aClass16_1.method388(local8);
				this.aClass16_1.method392(local8);
			}
			local8 = this.aClass16_1.method390();
			local11 = this.aClass16_1.anIntArray15[local8];
			local14 = this.aClass16_1.method380(local11);
		}
		if (-41 != -41) {
			return;
		}
		this.anInt11184 = local11;
		this.aLong379 = local14;
		this.anInt11185 = local8;
		if (this.aClass3_Sub32_4 != null && this.anInt11186 < local11) {
			this.anInt11184 = this.anInt11186;
			this.anInt11185 = -1;
			this.aLong379 = this.aClass16_1.method380(this.anInt11184);
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BZLclient!lv;Z)V")
	private synchronized void method9320(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub32 arg1, @OriginalArg(3) boolean arg2) {
		this.method9345(arg2);
		this.aClass16_1.method385(arg1.aByteArray51);
		this.aBoolean805 = arg0;
		this.aLong378 = 0L;
		@Pc(24) int local24 = this.aClass16_1.method379();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass16_1.method386(local34);
			this.aClass16_1.method388(local34);
			this.aClass16_1.method392(local34);
		}
		this.anInt11185 = this.aClass16_1.method390();
		this.anInt11184 = this.aClass16_1.anIntArray15[this.anInt11185];
		this.aLong379 = this.aClass16_1.method380(this.anInt11184);
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(III)V")
	private void method9321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray624[arg0]) {
			this.anIntArray624[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub41ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILclient!ow;)I")
	private int method9322(@OriginalArg(1) Class3_Sub41 arg0) {
		@Pc(14) int local14 = (arg0.anInt8294 * arg0.anInt8277 >> 12) + arg0.anInt8287;
		local14 += (this.anIntArray632[arg0.anInt8288] - 8192) * this.anIntArray636[arg0.anInt8288] >> 12;
		@Pc(35) Class381 local35 = arg0.aClass381_1;
		@Pc(62) int local62;
		if (local35.anInt10657 > 0 && (local35.anInt10655 > 0 || this.anIntArray634[arg0.anInt8288] > 0)) {
			local62 = local35.anInt10655 << 2;
			@Pc(67) int local67 = local35.anInt10652 << 1;
			if (local67 > arg0.anInt8274) {
				local62 = arg0.anInt8274 * local62 / local67;
			}
			local62 += this.anIntArray634[arg0.anInt8288] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt8292 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local62 * local101);
		}
		local62 = (int) ((double) (arg0.aClass3_Sub33_Sub1_2.anInt6921 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static103.anInt1658 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	public int method9323() {
		return this.anInt11138;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)V")
	private void method9324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
	public synchronized boolean method9325() {
		return this.aClass16_1.method378();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)V")
	private void method9326(@OriginalArg(1) int arg0) {
		if ((this.anIntArray633[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class3_Sub41 local20 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8391(); local20 != null; local20 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8392()) {
			if (local20.anInt8288 == arg0) {
				local20.anInt8275 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9304(@OriginalArg(0) int arg0) {
		if (this.aClass16_1.method378()) {
			@Pc(18) int local18 = this.anInt11169 * this.aClass16_1.anInt417 / Static103.anInt1658;
			do {
				@Pc(28) long local28 = this.aLong378 + (long) arg0 * (long) local18;
				if (this.aLong379 - local28 >= 0L) {
					this.aLong378 = local28;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong379 + (long) local18 - this.aLong378 - 1L) / (long) local18);
				this.aLong378 += (long) local18 * (long) local57;
				arg0 -= local57;
				this.aClass3_Sub22_Sub2_1.method9304(local57);
				this.method9319();
			} while (this.aClass16_1.method378());
		}
		this.aClass3_Sub22_Sub2_1.method9304(arg0);
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
	public synchronized void method9327() {
		this.method9345(true);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lclient!ow;B)I")
	private int method9328(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(9) int local9 = this.anIntArray623[arg0.anInt8288];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt8290) * (16384 - local9) + 32 >> 6) : arg0.anInt8290 * local9 - -32 >> 6;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IZ)V")
	private void method9329(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method9309(-1);
		} else {
			this.method9313(109, -1);
		}
		this.method9341(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray624[local27] = this.anIntArray622[local27];
		}
		if (arg0 != -17) {
			this.method9329(-10, false);
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			this.anIntArray627[local60] = this.anIntArray622[local60] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(III)V")
	private void method9331(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray628[arg0] = arg1;
		this.anIntArray631[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(IIII)V")
	private void method9332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method9311(64, arg2, arg0);
		if ((this.anIntArray633[arg0] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub41 local28 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8390(); local28 != null; local28 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8405()) {
				if (arg0 == local28.anInt8288 && local28.anInt8284 < 0) {
					this.aClass3_Sub41ArrayArray2[arg0][local28.anInt8289] = null;
					this.aClass3_Sub41ArrayArray2[arg0][arg2] = local28;
					@Pc(70) int local70 = local28.anInt8287 + (local28.anInt8277 * local28.anInt8294 >> 12);
					local28.anInt8287 += arg2 - local28.anInt8289 << 8;
					local28.anInt8277 = 4096;
					local28.anInt8294 = local70 - local28.anInt8287;
					local28.anInt8289 = arg2;
					return;
				}
			}
		}
		@Pc(116) Class3_Sub54 local116 = (Class3_Sub54) this.aClass136_51.method3503((long) this.anIntArray624[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(125) Class3_Sub33_Sub1 local125 = local116.aClass3_Sub33_Sub1Array1[arg2];
		if (local125 == null) {
			return;
		}
		@Pc(133) Class3_Sub41 local133 = new Class3_Sub41();
		local133.aClass3_Sub33_Sub1_2 = local125;
		local133.aClass3_Sub54_1 = local116;
		local133.anInt8288 = arg0;
		local133.aClass381_1 = local116.aClass381Array1[arg2];
		local133.anInt8286 = local116.aByteArray103[arg2];
		local133.anInt8289 = arg2;
		local133.anInt8278 = arg1 * arg1 * local116.anInt10563 * local116.aByteArray105[arg2] + 1024 >> 11;
		local133.anInt8290 = local116.aByteArray104[arg2] & 0xFF;
		local133.anInt8287 = (arg2 << 8) - (local116.aShortArray152[arg2] & 0x7FFF);
		local133.anInt8291 = 0;
		local133.anInt8285 = 0;
		local133.anInt8293 = 0;
		local133.anInt8283 = 0;
		local133.anInt8284 = -1;
		if (this.anIntArray621[arg0] == 0) {
			local133.aClass3_Sub22_Sub1_2 = Static727.method3896(local125, this.method9322(local133), this.method9308(local133), this.method9328(local133));
		} else {
			local133.aClass3_Sub22_Sub1_2 = Static727.method3896(local125, this.method9322(local133), 0, this.method9328(local133));
			this.method9336(local116.aShortArray152[arg2] < 0, local133);
		}
		if (local116.aShortArray152[arg2] < 0) {
			local133.aClass3_Sub22_Sub1_2.method3881(-1);
		}
		if (local133.anInt8286 >= 0) {
			@Pc(297) Class3_Sub41 local297 = this.aClass3_Sub41ArrayArray1[arg0][local133.anInt8286];
			if (local297 != null && local297.anInt8284 < 0) {
				this.aClass3_Sub41ArrayArray2[arg0][local297.anInt8289] = null;
				local297.anInt8284 = 0;
			}
			this.aClass3_Sub41ArrayArray1[arg0][local133.anInt8286] = local133;
		}
		this.aClass3_Sub22_Sub2_1.aClass357_42.method8401(local133);
		this.aClass3_Sub41ArrayArray2[arg0][arg2] = local133;
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(II)V")
	private void method9333(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method9311(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method9332(local18, local30, local24);
			} else {
				this.method9311(64, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method9324(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray627[local18] = (this.anIntArray627[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray627[local18] = (this.anIntArray627[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray634[local18] = (local30 << 7) + (this.anIntArray634[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray634[local18] = local30 + (this.anIntArray634[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray635[local18] = (local30 << 7) + (this.anIntArray635[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray635[local18] = (this.anIntArray635[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray625[local18] = (this.anIntArray625[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray625[local18] = (this.anIntArray625[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray623[local18] = (local30 << 7) + (this.anIntArray623[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray623[local18] = local30 + (this.anIntArray623[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray620[local18] = (local30 << 7) + (this.anIntArray620[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray620[local18] = (this.anIntArray620[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray633[local18] |= 0x1;
				} else {
					this.anIntArray633[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray633[local18] |= 0x2;
				} else {
					this.method9342(local18);
					this.anIntArray633[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray629[local18] = (local30 << 7) + (this.anIntArray629[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray629[local18] = (this.anIntArray629[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray629[local18] = (local30 << 7) + (this.anIntArray629[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray629[local18] = local30 + (this.anIntArray629[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method9309(local18);
			}
			if (local24 == 121) {
				this.method9341(local18);
			}
			if (local24 == 123) {
				this.method9313(119, local18);
			}
			@Pc(569) int local569;
			if (local24 == 6) {
				local569 = this.anIntArray629[local18];
				if (local569 == 16384) {
					this.anIntArray636[local18] = (local30 << 7) + (this.anIntArray636[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local569 = this.anIntArray629[local18];
				if (local569 == 16384) {
					this.anIntArray636[local18] = (this.anIntArray636[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray621[local18] = (local30 << 7) + (this.anIntArray621[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray621[local18] = local30 + (this.anIntArray621[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray633[local18] |= 0x4;
				} else {
					this.method9326(local18);
					this.anIntArray633[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method9331(local18, (this.anIntArray628[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method9331(local18, local30 + (this.anIntArray628[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method9321(local18, local24 + this.anIntArray627[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method9314(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F01B0) >> 9);
			this.method9310(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method9329(-17, true);
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ec;Lclient!lv;Lclient!lb;II)Z")
	public synchronized boolean method9334(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class3_Sub32 arg1, @OriginalArg(2) Class221 arg2) {
		arg1.method5710();
		@Pc(9) boolean local9 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class3_Sub35 local32 = (Class3_Sub35) arg1.aClass136_30.method3509(); local32 != null; local32 = (Class3_Sub35) arg1.aClass136_30.method3506()) {
			@Pc(40) int local40 = (int) local32.aLong382;
			@Pc(48) Class3_Sub54 local48 = (Class3_Sub54) this.aClass136_51.method3503((long) local40);
			if (local48 == null) {
				local48 = Static389.method5888(arg2, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass136_51.method3508((long) local40, local48);
			}
			if (!local48.method8835(local26, local32.aByteArray64, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5711();
		}
		return local9;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!lv;)V")
	public synchronized void method9335(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub32 arg1) {
		this.method9320(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZLclient!ow;)V")
	public void method9336(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub41 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub33_Sub1_2.aByteArray53.length;
		@Pc(38) int local38;
		if (arg0 && arg1.aClass3_Sub33_Sub1_2.aBoolean542) {
			@Pc(25) int local25 = local8 + local8 - arg1.aClass3_Sub33_Sub1_2.anInt6922;
			local38 = (int) ((long) this.anIntArray621[arg1.anInt8288] * (long) local25 >> 6);
			local8 <<= 0x8;
			if (local8 <= local38) {
				local38 = local8 + local8 - local38 - 1;
				arg1.aClass3_Sub22_Sub1_2.method3908();
			}
		} else {
			local38 = (int) ((long) local8 * (long) this.anIntArray621[arg1.anInt8288] >> 6);
		}
		arg1.aClass3_Sub22_Sub1_2.method3889(local38);
	}

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
	public synchronized void method9337(@OriginalArg(0) int arg0) {
		if (arg0 != -7636) {
			this.anIntArray620 = null;
		}
		for (@Pc(15) Class3_Sub54 local15 = (Class3_Sub54) this.aClass136_51.method3509(); local15 != null; local15 = (Class3_Sub54) this.aClass136_51.method3506()) {
			local15.method8838();
		}
	}

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "(III)V")
	public synchronized void method9338() {
		this.method9316();
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BJ)V")
	private void method9339(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong379) {
			@Pc(18) int local18 = this.anInt11185;
			@Pc(21) int local21 = this.anInt11184;
			@Pc(24) long local24 = this.aLong379;
			while (local21 == this.anInt11184) {
				while (local21 == this.aClass16_1.anIntArray15[local18]) {
					this.aClass16_1.method386(local18);
					@Pc(37) int local37 = this.aClass16_1.method381(local18);
					if (local37 == 1) {
						this.aClass16_1.method384();
						this.aClass16_1.method392(local18);
						if (this.aClass16_1.method377()) {
							if (!this.aBoolean805 || local21 == 0) {
								this.method9329(-17, true);
								this.aClass16_1.method387();
								return;
							}
							this.aClass16_1.method389(local24);
						}
						break;
					}
					if ((local37 & 0x80) != 0 && (local37 & 0xF0) != 144) {
						this.method9333(local37);
					}
					this.aClass16_1.method388(local18);
					this.aClass16_1.method392(local18);
				}
				this.aLong378 = local24;
				local18 = this.aClass16_1.method390();
				local21 = this.aClass16_1.anIntArray15[local18];
				local24 = this.aClass16_1.method380(local21);
			}
			this.anInt11185 = local18;
			this.anInt11184 = local21;
			this.aLong379 = local24;
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ow;I)Z")
	public boolean method9340(@OriginalArg(0) Class3_Sub41 arg0) {
		if (arg0.aClass3_Sub22_Sub1_2 != null) {
			return false;
		}
		if (arg0.anInt8284 >= 0) {
			arg0.method9446();
			if (arg0.anInt8286 > 0 && arg0 == this.aClass3_Sub41ArrayArray1[arg0.anInt8288][arg0.anInt8286]) {
				this.aClass3_Sub41ArrayArray1[arg0.anInt8288][arg0.anInt8286] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)V")
	private void method9341(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method9341(local12);
			}
			return;
		}
		this.anIntArray625[arg0] = 12800;
		this.anIntArray623[arg0] = 8192;
		this.anIntArray620[arg0] = 16383;
		this.anIntArray632[arg0] = 8192;
		this.anIntArray634[arg0] = 0;
		this.anIntArray635[arg0] = 8192;
		this.method9342(arg0);
		this.method9326(arg0);
		this.anIntArray633[arg0] = 0;
		this.anIntArray629[arg0] = 32767;
		this.anIntArray636[arg0] = 256;
		this.anIntArray621[arg0] = 0;
		this.method9331(arg0, 8192);
	}

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(II)V")
	private void method9342(@OriginalArg(1) int arg0) {
		if ((this.anIntArray633[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub41 local15 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8391(); local15 != null; local15 = (Class3_Sub41) this.aClass3_Sub22_Sub2_1.aClass357_42.method8392()) {
			if (arg0 == local15.anInt8288 && this.aClass3_Sub41ArrayArray2[arg0][local15.anInt8289] == null && local15.anInt8284 < 0) {
				local15.anInt8284 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "()Lclient!fga;")
	@Override
	public synchronized Class3_Sub22 method9303() {
		return null;
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(II)V")
	public synchronized void method9343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != 32023) {
			this.anIntArray620 = null;
		}
		this.anInt11138 = arg1;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JZLclient!lv;ZZ)V")
	public synchronized void method9344(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub32 arg1, @OriginalArg(3) boolean arg2) {
		this.method9320(arg2, arg1, true);
		this.method9339((long) this.aClass16_1.anInt417 * arg0);
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass16_1.method378()) {
			@Pc(14) int local14 = this.anInt11169 * this.aClass16_1.anInt417 / Static103.anInt1658;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong378;
				if (this.aLong379 - local23 >= 0L) {
					this.aLong378 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong379 + (long) local14 - this.aLong378 - 1L) / (long) local14);
				this.aLong378 += (long) local52 * (long) local14;
				this.aClass3_Sub22_Sub2_1.method9302(arg0, arg1, local52);
				arg2 -= local52;
				arg1 += local52;
				this.method9319();
			} while (this.aClass16_1.method378());
		}
		this.aClass3_Sub22_Sub2_1.method9302(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)V")
	private synchronized void method9345(@OriginalArg(1) boolean arg0) {
		this.aClass16_1.method387();
		this.aClass3_Sub32_4 = null;
		this.method9329(-17, arg0);
	}
}
