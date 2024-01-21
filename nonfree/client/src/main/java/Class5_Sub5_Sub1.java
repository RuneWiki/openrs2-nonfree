import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class5_Sub5_Sub1 extends Class5_Sub5 {

	@OriginalMember(owner = "client!bf", name = "bc", descriptor = "I")
	private int anInt345;

	@OriginalMember(owner = "client!bf", name = "cc", descriptor = "J")
	private long aLong17;

	@OriginalMember(owner = "client!bf", name = "ec", descriptor = "J")
	private long aLong18;

	@OriginalMember(owner = "client!bf", name = "fc", descriptor = "Z")
	private boolean aBoolean9;

	@OriginalMember(owner = "client!bf", name = "gc", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!bf", name = "T", descriptor = "[I")
	private final int[] anIntArray63 = new int[16];

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "[[Lclient!od;")
	private final Class5_Sub16[][] aClass5_Sub16ArrayArray1 = new Class5_Sub16[16][128];

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "[I")
	private final int[] anIntArray58 = new int[16];

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "[I")
	private final int[] anIntArray61 = new int[16];

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "[I")
	public final int[] anIntArray59 = new int[16];

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[I")
	private final int[] anIntArray56 = new int[16];

	@OriginalMember(owner = "client!bf", name = "U", descriptor = "[I")
	private final int[] anIntArray64 = new int[16];

	@OriginalMember(owner = "client!bf", name = "nb", descriptor = "I")
	private int anInt319 = 256;

	@OriginalMember(owner = "client!bf", name = "S", descriptor = "[I")
	private final int[] anIntArray62 = new int[16];

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
	private final int[] anIntArray66 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "[I")
	public final int[] anIntArray65 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "[I")
	private final int[] anIntArray69 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Eb", descriptor = "[[Lclient!od;")
	private final Class5_Sub16[][] aClass5_Sub16ArrayArray2 = new Class5_Sub16[16][128];

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "[I")
	private final int[] anIntArray60 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Lb", descriptor = "I")
	private final int anInt335 = 1000000;

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "[I")
	public final int[] anIntArray67 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Qb", descriptor = "[I")
	private final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "[I")
	private final int[] anIntArray70 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[I")
	private final int[] anIntArray72 = new int[16];

	@OriginalMember(owner = "client!bf", name = "lb", descriptor = "Lclient!fb;")
	private final Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!bf", name = "ac", descriptor = "Lclient!he;")
	private final Class5_Sub5_Sub3 aClass5_Sub5_Sub3_1 = new Class5_Sub5_Sub3(this);

	@OriginalMember(owner = "client!bf", name = "pb", descriptor = "Lclient!ef;")
	private final Class20 aClass20_1 = new Class20(128);

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class5_Sub5_Sub1() {
		this.method261();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	private void method230(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class5_Sub16 local8 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1669(); local8 != null; local8 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1664()) {
			if (arg0 < 0 || arg0 == local8.anInt2379) {
				if (local8.aClass5_Sub5_Sub2_3 != null) {
					local8.aClass5_Sub5_Sub2_3.method823(Static78.anInt1981 / 100);
					if (local8.aClass5_Sub5_Sub2_3.method833()) {
						this.aClass5_Sub5_Sub3_1.aClass5_Sub5_Sub4_1.method1563(local8.aClass5_Sub5_Sub2_3);
					}
					local8.method1582();
				}
				if (local8.anInt2386 < 0) {
					this.aClass5_Sub16ArrayArray1[local8.anInt2379][local8.anInt2388] = null;
				}
				local8.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	private void method231(@OriginalArg(1) int arg0) {
		if ((this.anIntArray59[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub16 local18 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1669(); local18 != null; local18 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1664()) {
			if (arg0 == local18.anInt2379) {
				local18.anInt2396 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!pe;ZB)V")
	public synchronized void method232(@OriginalArg(0) Class5_Sub18 arg0, @OriginalArg(1) boolean arg1) {
		this.method244();
		this.aClass22_1.method686(arg0.aByteArray36);
		this.aLong17 = 0L;
		this.aBoolean9 = arg1;
		@Pc(23) int local23 = this.aClass22_1.method681();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass22_1.method691(local25);
			this.aClass22_1.method687(local25);
			this.aClass22_1.method692(local25);
		}
		this.anInt345 = this.aClass22_1.method688();
		this.anInt347 = this.aClass22_1.anIntArray161[this.anInt345];
		this.aLong18 = this.aClass22_1.method693(this.anInt347);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!od;[II)Z")
	public boolean method233(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub16 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt2401 = Static78.anInt1981 / 100;
		if (arg1.anInt2386 >= 0 && (arg1.aClass5_Sub5_Sub2_3 == null || arg1.aClass5_Sub5_Sub2_3.method798())) {
			arg1.method1582();
			arg1.method2189();
			if (arg1.anInt2383 > 0 && arg1 == this.aClass5_Sub16ArrayArray2[arg1.anInt2379][arg1.anInt2383]) {
				this.aClass5_Sub16ArrayArray2[arg1.anInt2379][arg1.anInt2383] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg1.anInt2380;
		@Pc(60) boolean local60 = false;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray70[arg1.anInt2379] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg1.anInt2380 = local58;
		}
		arg1.aClass5_Sub5_Sub2_3.method828(this.method256(arg1));
		@Pc(102) Class50 local102 = arg1.aClass50_1;
		arg1.anInt2389 += local102.anInt2269;
		@Pc(127) double local127 = (double) ((arg1.anInt2380 * arg1.anInt2384 >> 12) + (arg1.anInt2388 - 60 << 8)) * 5.086263020833333E-6D;
		arg1.anInt2390++;
		if (local102.anInt2273 > 0) {
			if (local102.anInt2268 <= 0) {
				arg1.anInt2393 += 128;
			} else {
				arg1.anInt2393 += (int) (Math.pow(2.0D, local127 * (double) local102.anInt2268) * 128.0D + 0.5D);
			}
			if (local102.anInt2273 * arg1.anInt2393 >= 819200) {
				local60 = true;
			}
		}
		if (local102.aByteArray35 != null) {
			if (local102.anInt2267 > 0) {
				arg1.anInt2387 += (int) (Math.pow(2.0D, local127 * (double) local102.anInt2267) * 128.0D + 0.5D);
			} else {
				arg1.anInt2387 += 128;
			}
			while (local102.aByteArray35.length - 2 > arg1.anInt2385 && arg1.anInt2387 > (local102.aByteArray35[arg1.anInt2385 + 2] & 0xFF) << 8) {
				arg1.anInt2385 += 2;
			}
			if (local102.aByteArray35.length - 2 == arg1.anInt2385 && local102.aByteArray35[arg1.anInt2385 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg1.anInt2386 >= 0 && local102.aByteArray34 != null && (this.anIntArray59[arg1.anInt2379] & 0x1) == 0 && (arg1.anInt2383 < 0 || arg1 != this.aClass5_Sub16ArrayArray2[arg1.anInt2379][arg1.anInt2383])) {
			if (local102.anInt2271 <= 0) {
				arg1.anInt2386 += 128;
			} else {
				arg1.anInt2386 += (int) (Math.pow(2.0D, local127 * (double) local102.anInt2271) * 128.0D + 0.5D);
			}
			while (arg1.anInt2400 < local102.aByteArray34.length - 2 && arg1.anInt2386 > (local102.aByteArray34[arg1.anInt2400 + 2] & 0xFF) << 8) {
				arg1.anInt2400 += 2;
			}
			if (local102.aByteArray34.length - 2 == arg1.anInt2400) {
				local60 = true;
			}
		}
		if (!local60) {
			arg1.aClass5_Sub5_Sub2_3.method817(arg1.anInt2401, this.method247(arg1), this.method260(arg1));
			return false;
		}
		arg1.aClass5_Sub5_Sub2_3.method823(arg1.anInt2401);
		if (arg2 == null) {
			arg1.aClass5_Sub5_Sub2_3.method1556(arg0);
		} else {
			arg1.aClass5_Sub5_Sub2_3.method1561(arg2, arg3, arg0);
		}
		if (arg1.aClass5_Sub5_Sub2_3.method833()) {
			this.aClass5_Sub5_Sub3_1.aClass5_Sub5_Sub4_1.method1563(arg1.aClass5_Sub5_Sub2_3);
		}
		arg1.method1582();
		if (arg1.anInt2386 >= 0) {
			arg1.method2189();
			if (arg1.anInt2383 > 0 && this.aClass5_Sub16ArrayArray2[arg1.anInt2379][arg1.anInt2383] == arg1) {
				this.aClass5_Sub16ArrayArray2[arg1.anInt2379][arg1.anInt2383] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	private void method236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
	private void method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method253(64, arg0, arg2);
		if ((this.anIntArray59[arg0] & 0x2) != 0) {
			for (@Pc(25) Class5_Sub16 local25 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1666(); local25 != null; local25 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1659()) {
				if (local25.anInt2379 == arg0 && local25.anInt2386 < 0) {
					this.aClass5_Sub16ArrayArray1[arg0][local25.anInt2388] = null;
					this.aClass5_Sub16ArrayArray1[arg0][arg2] = local25;
					@Pc(63) int local63 = (local25.anInt2384 * local25.anInt2380 >> 12) + local25.anInt2398;
					local25.anInt2380 = 4096;
					local25.anInt2398 += arg2 - local25.anInt2388 << 8;
					local25.anInt2384 = local63 - local25.anInt2398;
					local25.anInt2388 = arg2;
					return;
				}
			}
		}
		@Pc(108) Class5_Sub10 local108 = (Class5_Sub10) this.aClass20_1.method656((long) this.anIntArray61[arg0]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class5_Sub21_Sub1 local116 = local108.aClass5_Sub21_Sub1Array1[arg2];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class5_Sub16 local123 = new Class5_Sub16();
		local123.aClass5_Sub10_1 = local108;
		local123.aClass5_Sub21_Sub1_1 = local116;
		local123.anInt2379 = arg0;
		local123.aClass50_1 = local108.aClass50Array1[arg2];
		local123.anInt2383 = local108.aByteArray29[arg2];
		local123.anInt2388 = arg2;
		local123.anInt2394 = local108.aByteArray28[arg2] * local108.anInt1551 * arg1 * arg1 + 1024 >> 11;
		local123.anInt2382 = local108.aByteArray30[arg2] & 0xFF;
		local123.anInt2398 = (arg2 << 8) - (local108.aShortArray20[arg2] & 0x7FFF);
		local123.anInt2386 = -1;
		local123.anInt2387 = 0;
		local123.anInt2385 = 0;
		local123.anInt2400 = 0;
		local123.anInt2393 = 0;
		if (this.anIntArray67[arg0] == 0) {
			local123.aClass5_Sub5_Sub2_3 = Static135.method836(local116, this.method256(local123), this.method247(local123), this.method260(local123));
		} else {
			local123.aClass5_Sub5_Sub2_3 = Static135.method836(local116, this.method256(local123), 0, this.method260(local123));
			this.method262(local123, local108.aShortArray20[arg2] < 0);
		}
		if (local108.aShortArray20[arg2] < 0) {
			local123.aClass5_Sub5_Sub2_3.method831(-1);
		}
		if (local123.anInt2383 >= 0) {
			@Pc(269) Class5_Sub16 local269 = this.aClass5_Sub16ArrayArray2[arg0][local123.anInt2383];
			if (local269 != null && local269.anInt2386 < 0) {
				this.aClass5_Sub16ArrayArray1[arg0][local269.anInt2388] = null;
				local269.anInt2386 = 0;
			}
			this.aClass5_Sub16ArrayArray2[arg0][local123.anInt2383] = local123;
		}
		this.aClass5_Sub5_Sub3_1.aClass58_27.method1663(local123);
		this.aClass5_Sub16ArrayArray1[arg0][arg2] = local123;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public synchronized Class5_Sub5 method1560() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
	private void method239(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method239(local9);
			}
			return;
		}
		this.anIntArray71[arg0] = 12800;
		this.anIntArray66[arg0] = 8192;
		this.anIntArray72[arg0] = 16383;
		this.anIntArray58[arg0] = 8192;
		this.anIntArray63[arg0] = 0;
		this.anIntArray70[arg0] = 8192;
		this.method264(arg0);
		this.method231(arg0);
		this.anIntArray59[arg0] = 0;
		this.anIntArray64[arg0] = 32767;
		this.anIntArray69[arg0] = 256;
		this.anIntArray67[arg0] = 0;
		this.method241(8192, arg0);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)Z")
	public synchronized boolean method240() {
		return this.aClass22_1.method694();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	private void method241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray62[arg1] = arg0;
		this.anIntArray65[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	private void method243(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray61[arg1]) {
			this.anIntArray61[arg1] = arg0;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass5_Sub16ArrayArray2[arg1][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public synchronized void method244() {
		this.aClass22_1.method682();
		this.method261();
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	private void method245() {
		@Pc(8) int local8 = this.anInt345;
		@Pc(11) int local11 = this.anInt347;
		@Pc(14) long local14 = this.aLong18;
		while (this.anInt347 == local11) {
			while (local11 == this.aClass22_1.anIntArray161[local8]) {
				this.aClass22_1.method691(local8);
				@Pc(25) int local25 = this.aClass22_1.method685(local8);
				if (local25 == 1) {
					this.aClass22_1.method683();
					this.aClass22_1.method692(local8);
					if (this.aClass22_1.method680()) {
						if (!this.aBoolean9 || local11 == 0) {
							this.method261();
							this.aClass22_1.method682();
							return;
						}
						this.aClass22_1.method684(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method248(local25);
				}
				this.aClass22_1.method687(local8);
				this.aClass22_1.method692(local8);
			}
			local8 = this.aClass22_1.method688();
			local11 = this.aClass22_1.anIntArray161[local8];
			local14 = this.aClass22_1.method693(local11);
		}
		this.aLong18 = local14;
		this.anInt347 = local11;
		this.anInt345 = local8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIB)V")
	private void method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!od;)I")
	private int method247(@OriginalArg(1) Class5_Sub16 arg0) {
		@Pc(2) Class50 local2 = arg0.aClass50_1;
		@Pc(22) int local22 = this.anIntArray72[arg0.anInt2379] * this.anIntArray71[arg0.anInt2379] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2394 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt319 + 128 >> 8;
		if (local2.anInt2273 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) arg0.anInt2393 * 1.953125E-5D * (double) local2.anInt2273) + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(83) int local83;
		@Pc(120) int local120;
		@Pc(110) int local110;
		if (local2.aByteArray35 != null) {
			local83 = local2.aByteArray35[arg0.anInt2385 + 1];
			local86 = arg0.anInt2387;
			if (arg0.anInt2385 < local2.aByteArray35.length - 2) {
				local110 = (local2.aByteArray35[arg0.anInt2385 + 2] & 0xFF) << 8;
				local120 = (local2.aByteArray35[arg0.anInt2385] & 0xFF) << 8;
				local83 += (local86 - local120) * (local2.aByteArray35[arg0.anInt2385 + 3] - local83) / (local110 - local120);
			}
			local22 = local22 * local83 + 32 >> 6;
		}
		if (arg0.anInt2386 > 0 && local2.aByteArray34 != null) {
			local86 = arg0.anInt2386;
			local83 = local2.aByteArray34[arg0.anInt2400 + 1];
			if (arg0.anInt2400 < local2.aByteArray34.length - 2) {
				local120 = (local2.aByteArray34[arg0.anInt2400] & 0xFF) << 8;
				local110 = (local2.aByteArray34[arg0.anInt2400 + 2] & 0xFF) << 8;
				local83 += (local86 - local120) * (local2.aByteArray34[arg0.anInt2400 + 3] - local83) / (local110 - local120);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(II)V")
	private void method248(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(20) int local20;
		if (local5 == 128) {
			local20 = arg0 >> 16 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method253(local20, local24, local30);
		} else if (local5 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local20 = arg0 >> 16 & 0x7F;
			if (local20 > 0) {
				this.method237(local24, local20, local30);
			} else {
				this.method253(64, local24, local30);
			}
		} else if (local5 == 160) {
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local20 = arg0 >> 16 & 0x7F;
			this.method246(local30, local24, local20);
		} else if (local5 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local20 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray60[local24] = (this.anIntArray60[local24] & 0xFFE03FFF) + (local20 << 14);
			}
			if (local30 == 32) {
				this.anIntArray60[local24] = (this.anIntArray60[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 1) {
				this.anIntArray63[local24] = (local20 << 7) + (this.anIntArray63[local24] & 0xFFFFC07F);
			}
			if (local30 == 33) {
				this.anIntArray63[local24] = local20 + (this.anIntArray63[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray70[local24] = (this.anIntArray70[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 37) {
				this.anIntArray70[local24] = local20 + (this.anIntArray70[local24] & 0xFFFFFF80);
			}
			if (local30 == 7) {
				this.anIntArray71[local24] = (this.anIntArray71[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 39) {
				this.anIntArray71[local24] = (this.anIntArray71[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 10) {
				this.anIntArray66[local24] = (local20 << 7) + (this.anIntArray66[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray66[local24] = local20 + (this.anIntArray66[local24] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray72[local24] = (this.anIntArray72[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 43) {
				this.anIntArray72[local24] = (this.anIntArray72[local24] & 0xFFFFFF80) + local20;
			}
			if (local30 == 64) {
				if (local20 < 64) {
					this.anIntArray59[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray59[local24] |= 0x1;
				}
			}
			if (local30 == 65) {
				if (local20 < 64) {
					this.method264(local24);
					this.anIntArray59[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray59[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray64[local24] = (this.anIntArray64[local24] & 0x7F) + (local20 << 7);
			}
			if (local30 == 98) {
				this.anIntArray64[local24] = (this.anIntArray64[local24] & 0x3F80) + local20;
			}
			if (local30 == 101) {
				this.anIntArray64[local24] = (local20 << 7) + (this.anIntArray64[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray64[local24] = local20 + (this.anIntArray64[local24] & 0x3F80) + 16384;
			}
			if (local30 == 120) {
				this.method230(local24);
			}
			if (local30 == 121) {
				this.method239(local24);
			}
			if (local30 == 123) {
				this.method251(local24);
			}
			@Pc(500) int local500;
			if (local30 == 6) {
				local500 = this.anIntArray64[local24];
				if (local500 == 16384) {
					this.anIntArray69[local24] = (local20 << 7) + (this.anIntArray69[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local500 = this.anIntArray64[local24];
				if (local500 == 16384) {
					this.anIntArray69[local24] = (this.anIntArray69[local24] & 0xFFFFFF80) + local20;
				}
			}
			if (local30 == 16) {
				this.anIntArray67[local24] = (this.anIntArray67[local24] & 0xFFFFC07F) + (local20 << 7);
			}
			if (local30 == 48) {
				this.anIntArray67[local24] = local20 + (this.anIntArray67[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local20 >= 64) {
					this.anIntArray59[local24] |= 0x4;
				} else {
					this.method231(local24);
					this.anIntArray59[local24] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method241((this.anIntArray62[local24] & 0xFFFFC07F) + (local20 << 7), local24);
			}
			if (local30 == 49) {
				this.method241((this.anIntArray62[local24] & 0xFFFFFF80) + local20, local24);
			}
		} else if (local5 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method243(local30 + this.anIntArray60[local24], local24);
		} else if (local5 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method236(local24, local30);
		} else if (local5 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method265(local24, local30);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method261();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public synchronized void method249(@OriginalArg(0) int arg0) {
		this.anInt319 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1556(@OriginalArg(0) int arg0) {
		if (this.aClass22_1.method694()) {
			@Pc(14) int local14 = this.anInt335 * this.aClass22_1.anInt1008 / Static78.anInt1981;
			do {
				@Pc(24) long local24 = this.aLong17 + (long) arg0 * (long) local14;
				if (this.aLong18 - local24 >= 0L) {
					this.aLong17 = local24;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong18 - this.aLong17 - 1L) / (long) local14);
				arg0 -= local53;
				this.aLong17 += (long) local14 * (long) local53;
				this.aClass5_Sub5_Sub3_1.method1556(local53);
				this.method245();
			} while (this.aClass22_1.method694());
		}
		this.aClass5_Sub5_Sub3_1.method1556(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
	private void method250() {
		this.anIntArray56[9] = 128;
		this.anIntArray60[9] = 128;
		this.method243(128, 9);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)V")
	private void method251(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class5_Sub16 local18 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1669(); local18 != null; local18 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1664()) {
			if ((arg0 < 0 || arg0 == local18.anInt2379) && local18.anInt2386 < 0) {
				this.aClass5_Sub16ArrayArray1[local18.anInt2379][local18.anInt2388] = null;
				local18.anInt2386 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!od;I)Z")
	public boolean method252(@OriginalArg(0) Class5_Sub16 arg0) {
		if (arg0.aClass5_Sub5_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt2386 >= 0) {
			arg0.method2189();
			if (arg0.anInt2383 > 0 && this.aClass5_Sub16ArrayArray2[arg0.anInt2379][arg0.anInt2383] == arg0) {
				this.aClass5_Sub16ArrayArray2[arg0.anInt2379][arg0.anInt2383] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)V")
	private void method253(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub16 local12 = this.aClass5_Sub16ArrayArray1[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub16ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray59[arg1] & 0x2) == 0) {
			local12.anInt2386 = 0;
			return;
		}
		for (@Pc(47) Class5_Sub16 local47 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1669(); local47 != null; local47 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1664()) {
			if (local12.anInt2379 == local47.anInt2379 && local47.anInt2386 < 0 && local47 != local12) {
				local12.anInt2386 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
	public synchronized void method254() {
		this.method250();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!ff;ZLclient!s;Lclient!pe;)Z")
	public synchronized boolean method255(@OriginalArg(1) Class26 arg0, @OriginalArg(3) Class65 arg1, @OriginalArg(4) Class5_Sub18 arg2) {
		arg2.method1619();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class5_Sub8 local26 = (Class5_Sub8) arg2.aClass20_8.method655(); local26 != null; local26 = (Class5_Sub8) arg2.aClass20_8.method649()) {
			@Pc(35) int local35 = (int) local26.aLong100;
			@Pc(43) Class5_Sub10 local43 = (Class5_Sub10) this.aClass20_1.method656((long) local35);
			if (local43 == null) {
				local43 = Static82.method1494(local35, arg0);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass20_1.method647(local43, (long) local35);
			}
			if (!local43.method1081(local26.aByteArray16, arg1, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method1618();
		}
		return local9;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!od;I)I")
	private int method256(@OriginalArg(0) Class5_Sub16 arg0) {
		@Pc(10) int local10 = arg0.anInt2398 + (arg0.anInt2384 * arg0.anInt2380 >> 12);
		@Pc(17) Class50 local17 = arg0.aClass50_1;
		local10 += this.anIntArray69[arg0.anInt2379] * (this.anIntArray58[arg0.anInt2379] - 8192) >> 12;
		@Pc(66) int local66;
		if (local17.anInt2269 > 0 && (local17.anInt2277 > 0 || this.anIntArray63[arg0.anInt2379] > 0)) {
			local66 = local17.anInt2277 << 2;
			@Pc(71) int local71 = local17.anInt2270 << 1;
			if (local71 > arg0.anInt2390) {
				local66 = arg0.anInt2390 * local66 / local71;
			}
			local66 += this.anIntArray63[arg0.anInt2379] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt2389 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) ((double) local66 * local101);
		}
		local66 = (int) ((double) (arg0.aClass5_Sub21_Sub1_1.anInt2647 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static78.anInt1981 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lclient!sd;")
	@Override
	public synchronized Class5_Sub5 method1558() {
		return this.aClass5_Sub5_Sub3_1;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
	public synchronized void method258() {
		for (@Pc(12) Class5_Sub10 local12 = (Class5_Sub10) this.aClass20_1.method655(); local12 != null; local12 = (Class5_Sub10) this.aClass20_1.method649()) {
			local12.method1083();
		}
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)I")
	public int method259() {
		return this.anInt319;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!od;B)I")
	private int method260(@OriginalArg(0) Class5_Sub16 arg0) {
		@Pc(14) int local14 = this.anIntArray66[arg0.anInt2379];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt2382 + 128) + 32 >> 6) : local14 * arg0.anInt2382 + 32 >> 6;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
	private void method261() {
		this.method230(-1);
		this.method239(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray61[local15] = this.anIntArray56[local15];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray60[local37] = this.anIntArray56[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!od;ZI)V")
	public void method262(@OriginalArg(0) Class5_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(19) int local19 = arg0.aClass5_Sub21_Sub1_1.aByteArray37.length;
		@Pc(51) int local51;
		if (arg1 && arg0.aClass5_Sub21_Sub1_1.aBoolean96) {
			@Pc(34) int local34 = local19 + local19 - arg0.aClass5_Sub21_Sub1_1.anInt2645;
			local19 <<= 0x8;
			local51 = (int) ((long) this.anIntArray67[arg0.anInt2379] * (long) local34 >> 6);
			if (local19 <= local51) {
				arg0.aClass5_Sub5_Sub2_3.method815();
				local51 = local19 + local19 - local51 - 1;
			}
		} else {
			local51 = (int) ((long) this.anIntArray67[arg0.anInt2379] * (long) local19 >> 6);
		}
		arg0.aClass5_Sub5_Sub2_3.method821(local51);
	}

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "(I)V")
	public synchronized void method263() {
		for (@Pc(11) Class5_Sub10 local11 = (Class5_Sub10) this.aClass20_1.method655(); local11 != null; local11 = (Class5_Sub10) this.aClass20_1.method649()) {
			local11.method2189();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	private void method264(@OriginalArg(0) int arg0) {
		if ((this.anIntArray59[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class5_Sub16 local15 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1669(); local15 != null; local15 = (Class5_Sub16) this.aClass5_Sub5_Sub3_1.aClass58_27.method1664()) {
			if (arg0 == local15.anInt2379 && this.aClass5_Sub16ArrayArray1[arg0][local15.anInt2388] == null && local15.anInt2386 < 0) {
				local15.anInt2386 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(III)V")
	private void method265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray58[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1561(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass22_1.method694()) {
			@Pc(18) int local18 = this.aClass22_1.anInt1008 * this.anInt335 / Static78.anInt1981;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong17;
				if (this.aLong18 - local27 >= 0L) {
					this.aLong17 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong18 - this.aLong17 - 1L) / (long) local18);
				arg2 -= local56;
				this.aLong17 += (long) local56 * (long) local18;
				this.aClass5_Sub5_Sub3_1.method1561(arg0, arg1, local56);
				this.method245();
				arg1 += local56;
			} while (this.aClass22_1.method694());
		}
		this.aClass5_Sub5_Sub3_1.method1561(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1557() {
		return 0;
	}
}
