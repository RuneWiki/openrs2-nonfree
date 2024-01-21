import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class3_Sub9_Sub2 extends Class3_Sub9 {

	@OriginalMember(owner = "client!g", name = "Rb", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!g", name = "Sb", descriptor = "I")
	private int anInt1186;

	@OriginalMember(owner = "client!g", name = "Tb", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!g", name = "Ub", descriptor = "J")
	private long aLong60;

	@OriginalMember(owner = "client!g", name = "Vb", descriptor = "I")
	private int anInt1187;

	@OriginalMember(owner = "client!g", name = "G", descriptor = "[I")
	private final int[] anIntArray110 = new int[16];

	@OriginalMember(owner = "client!g", name = "E", descriptor = "[I")
	public final int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "[I")
	private final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!g", name = "X", descriptor = "[[Lclient!ee;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray1 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[I")
	private final int[] anIntArray111 = new int[16];

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	private int anInt1154 = 256;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[I")
	private final int[] anIntArray108 = new int[16];

	@OriginalMember(owner = "client!g", name = "U", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!g", name = "nb", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!g", name = "Bb", descriptor = "[[Lclient!ee;")
	private final Class3_Sub8[][] aClass3_Sub8ArrayArray2 = new Class3_Sub8[16][128];

	@OriginalMember(owner = "client!g", name = "Cb", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
	private final int anInt1160 = 1000000;

	@OriginalMember(owner = "client!g", name = "kb", descriptor = "[I")
	public final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!g", name = "Kb", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!g", name = "Y", descriptor = "[I")
	private final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!g", name = "Jb", descriptor = "[I")
	public final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!g", name = "Mb", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!g", name = "sb", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!g", name = "Nb", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!g", name = "Db", descriptor = "Lclient!c;")
	private final Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!g", name = "Qb", descriptor = "Lclient!ig;")
	private final Class3_Sub9_Sub3 aClass3_Sub9_Sub3_1 = new Class3_Sub9_Sub3(this);

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!d;")
	private final Class16 aClass16_4 = new Class16(128);

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub2() {
		this.method900();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ee;I)I")
	private int method888(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(2) Class82 local2 = arg0.aClass82_1;
		@Pc(13) int local13 = (arg0.anInt915 * arg0.anInt919 >> 12) + arg0.anInt921;
		local13 += (this.anIntArray111[arg0.anInt912] - 8192) * this.anIntArray114[arg0.anInt912] >> 12;
		@Pc(62) int local62;
		if (local2.anInt3664 > 0 && (local2.anInt3663 > 0 || this.anIntArray115[arg0.anInt912] > 0)) {
			@Pc(57) int local57 = local2.anInt3657 << 1;
			local62 = local2.anInt3663 << 2;
			if (local57 > arg0.anInt920) {
				local62 = local62 * arg0.anInt920 / local57;
			}
			local62 += this.anIntArray115[arg0.anInt912] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt927 & 0x1FF) * 0.01227184630308513D);
			local13 += (int) ((double) local62 * local96);
		}
		local62 = (int) ((double) (arg0.aClass3_Sub4_Sub1_1.anInt308 * 256) * Math.pow(2.0D, (double) local13 * 3.255208333333333E-4D) / (double) Static143.anInt3288 + 0.5D);
		return local62 < 1 ? 1 : local62;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BIII)V")
	private void method889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method921(arg2, 64, arg0);
		if ((this.anIntArray122[arg0] & 0x2) != 0) {
			for (@Pc(27) Class3_Sub8 local27 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2403(); local27 != null; local27 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2398()) {
				if (local27.anInt912 == arg0 && local27.anInt926 < 0) {
					this.aClass3_Sub8ArrayArray1[arg0][local27.anInt911] = null;
					this.aClass3_Sub8ArrayArray1[arg0][arg2] = local27;
					@Pc(69) int local69 = (local27.anInt915 * local27.anInt919 >> 12) + local27.anInt921;
					local27.anInt921 += arg2 - local27.anInt911 << 8;
					local27.anInt915 = local69 - local27.anInt921;
					local27.anInt919 = 4096;
					local27.anInt911 = arg2;
					return;
				}
			}
		}
		@Pc(117) Class3_Sub20 local117 = (Class3_Sub20) this.aClass16_4.method554((long) this.anIntArray118[arg0]);
		if (local117 == null) {
			return;
		}
		@Pc(125) Class3_Sub4_Sub1 local125 = local117.aClass3_Sub4_Sub1Array1[arg2];
		if (local125 == null) {
			return;
		}
		@Pc(132) Class3_Sub8 local132 = new Class3_Sub8();
		local132.aClass3_Sub20_1 = local117;
		local132.anInt912 = arg0;
		local132.aClass3_Sub4_Sub1_1 = local125;
		local132.aClass82_1 = local117.aClass82Array1[arg2];
		local132.anInt916 = local117.aByteArray37[arg2];
		local132.anInt911 = arg2;
		local132.anInt922 = local117.aByteArray40[arg2] * local117.anInt3381 * arg1 * arg1 + 1024 >> 11;
		local132.anInt924 = local117.aByteArray39[arg2] & 0xFF;
		local132.anInt921 = (arg2 << 8) - (local117.aShortArray35[arg2] & 0x7FFF);
		local132.anInt926 = -1;
		local132.anInt925 = 0;
		local132.anInt917 = 0;
		local132.anInt909 = 0;
		local132.anInt928 = 0;
		if (this.anIntArray117[arg0] == 0) {
			local132.aClass3_Sub9_Sub1_3 = Static183.method715(local125, this.method888(local132), this.method901(local132), this.method905(local132));
		} else {
			local132.aClass3_Sub9_Sub1_3 = Static183.method715(local125, this.method888(local132), 0, this.method905(local132));
			this.method911(local117.aShortArray35[arg2] < 0, local132);
		}
		if (local117.aShortArray35[arg2] < 0) {
			local132.aClass3_Sub9_Sub1_3.method741(-1);
		}
		if (local132.anInt916 >= 0) {
			@Pc(290) Class3_Sub8 local290 = this.aClass3_Sub8ArrayArray2[arg0][local132.anInt916];
			if (local290 != null && local290.anInt926 < 0) {
				this.aClass3_Sub8ArrayArray1[arg0][local290.anInt911] = null;
				local290.anInt926 = 0;
			}
			this.aClass3_Sub8ArrayArray2[arg0][local132.anInt916] = local132;
		}
		this.aClass3_Sub9_Sub3_1.aClass72_23.method2404(local132);
		this.aClass3_Sub8ArrayArray1[arg0][arg2] = local132;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(III)V")
	private void method890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray118[arg1] != arg0) {
			this.anIntArray118[arg1] = arg0;
			for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
				this.aClass3_Sub8ArrayArray2[arg1][local27] = null;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)V")
	private void method891(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class3_Sub8 local18 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2401(); local18 != null; local18 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2407()) {
			if ((arg0 < 0 || arg0 == local18.anInt912) && local18.anInt926 < 0) {
				this.aClass3_Sub8ArrayArray1[local18.anInt912][local18.anInt911] = null;
				local18.anInt926 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public synchronized void method892() {
		for (@Pc(20) Class3_Sub20 local20 = (Class3_Sub20) this.aClass16_4.method551(); local20 != null; local20 = (Class3_Sub20) this.aClass16_4.method552()) {
			local20.method2783();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2214() {
		return 0;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(III)V")
	private void method893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2220(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass11_1.method312()) {
			@Pc(14) int local14 = this.aClass11_1.anInt438 * this.anInt1160 / Static143.anInt3288;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong60;
				if (this.aLong59 - local23 >= 0L) {
					this.aLong60 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong59 + (long) local14 - this.aLong60 - 1L) / (long) local14);
				this.aLong60 += (long) local51 * (long) local14;
				arg2 -= local51;
				this.aClass3_Sub9_Sub3_1.method2220(arg0, arg1, local51);
				arg1 += local51;
				this.method906();
			} while (this.aClass11_1.method312());
		}
		this.aClass3_Sub9_Sub3_1.method2220(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
	private void method894(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub8 local12 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2401(); local12 != null; local12 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2407()) {
			if (arg0 < 0 || local12.anInt912 == arg0) {
				if (local12.aClass3_Sub9_Sub1_3 != null) {
					local12.aClass3_Sub9_Sub1_3.method735(Static143.anInt3288 / 100);
					if (local12.aClass3_Sub9_Sub1_3.method743()) {
						this.aClass3_Sub9_Sub3_1.aClass3_Sub9_Sub4_2.method2223(local12.aClass3_Sub9_Sub1_3);
					}
					local12.method690();
				}
				if (local12.anInt926 < 0) {
					this.aClass3_Sub8ArrayArray1[local12.anInt912][local12.anInt911] = null;
				}
				local12.method2783();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public synchronized void method895() {
		for (@Pc(11) Class3_Sub20 local11 = (Class3_Sub20) this.aClass16_4.method551(); local11 != null; local11 = (Class3_Sub20) this.aClass16_4.method552()) {
			local11.method2461();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!ee;[IIB)Z")
	public boolean method896(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg1.anInt913 = Static143.anInt3288 / 100;
		if (arg1.anInt926 >= 0 && (arg1.aClass3_Sub9_Sub1_3 == null || arg1.aClass3_Sub9_Sub1_3.method747())) {
			arg1.method690();
			arg1.method2783();
			if (arg1.anInt916 > 0 && arg1 == this.aClass3_Sub8ArrayArray2[arg1.anInt912][arg1.anInt916]) {
				this.aClass3_Sub8ArrayArray2[arg1.anInt912][arg1.anInt916] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt919;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray119[arg1.anInt912] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt919 = local56;
		}
		@Pc(91) boolean local91 = false;
		arg1.aClass3_Sub9_Sub1_3.method748(this.method888(arg1));
		@Pc(116) double local116 = (double) ((arg1.anInt911 - 60 << 8) + (arg1.anInt915 * arg1.anInt919 >> 12)) * 5.086263020833333E-6D;
		@Pc(119) Class82 local119 = arg1.aClass82_1;
		arg1.anInt927 += local119.anInt3664;
		arg1.anInt920++;
		if (local119.anInt3658 > 0) {
			if (local119.anInt3656 > 0) {
				arg1.anInt909 += (int) (Math.pow(2.0D, local116 * (double) local119.anInt3656) * 128.0D + 0.5D);
			} else {
				arg1.anInt909 += 128;
			}
			if (local119.anInt3658 * arg1.anInt909 >= 819200) {
				local91 = true;
			}
		}
		if (local119.aByteArray47 != null) {
			if (local119.anInt3662 <= 0) {
				arg1.anInt925 += 128;
			} else {
				arg1.anInt925 += (int) (Math.pow(2.0D, local116 * (double) local119.anInt3662) * 128.0D + 0.5D);
			}
			while (local119.aByteArray47.length - 2 > arg1.anInt917 && arg1.anInt925 > (local119.aByteArray47[arg1.anInt917 + 2] & 0xFF) << 8) {
				arg1.anInt917 += 2;
			}
			if (local119.aByteArray47.length - 2 == arg1.anInt917 && local119.aByteArray47[arg1.anInt917 + 1] == 0) {
				local91 = true;
			}
		}
		if (arg1.anInt926 >= 0 && local119.aByteArray48 != null && (this.anIntArray122[arg1.anInt912] & 0x1) == 0 && (arg1.anInt916 < 0 || this.aClass3_Sub8ArrayArray2[arg1.anInt912][arg1.anInt916] != arg1)) {
			if (local119.anInt3661 > 0) {
				arg1.anInt926 += (int) (Math.pow(2.0D, (double) local119.anInt3661 * local116) * 128.0D + 0.5D);
			} else {
				arg1.anInt926 += 128;
			}
			while (arg1.anInt928 < local119.aByteArray48.length - 2 && (local119.aByteArray48[arg1.anInt928 + 2] & 0xFF) << 8 < arg1.anInt926) {
				arg1.anInt928 += 2;
			}
			if (arg1.anInt928 == local119.aByteArray48.length - 2) {
				local91 = true;
			}
		}
		if (!local91) {
			arg1.aClass3_Sub9_Sub1_3.method718(arg1.anInt913, this.method901(arg1), this.method905(arg1));
			return false;
		}
		arg1.aClass3_Sub9_Sub1_3.method735(arg1.anInt913);
		if (arg2 == null) {
			arg1.aClass3_Sub9_Sub1_3.method2215(arg0);
		} else {
			arg1.aClass3_Sub9_Sub1_3.method2220(arg2, arg3, arg0);
		}
		if (arg1.aClass3_Sub9_Sub1_3.method743()) {
			this.aClass3_Sub9_Sub3_1.aClass3_Sub9_Sub4_2.method2223(arg1.aClass3_Sub9_Sub1_3);
		}
		arg1.method690();
		if (arg1.anInt926 >= 0) {
			arg1.method2783();
			if (arg1.anInt916 > 0 && this.aClass3_Sub8ArrayArray2[arg1.anInt912][arg1.anInt916] == arg1) {
				this.aClass3_Sub8ArrayArray2[arg1.anInt912][arg1.anInt916] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)V")
	private void method897(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local5 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method921(local24, local30, local18);
		} else if (local5 == 144) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method889(local18, local30, local24);
			} else {
				this.method921(local24, 64, local18);
			}
		} else if (local5 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method899(local24, local30, local18);
		} else if (local5 == 176) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			if (local24 == 0) {
				this.anIntArray113[local18] = (this.anIntArray113[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray113[local18] = (this.anIntArray113[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray115[local18] = (this.anIntArray115[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray115[local18] = (this.anIntArray115[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray119[local18] = (local30 << 7) + (this.anIntArray119[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray119[local18] = (this.anIntArray119[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray108[local18] = (local30 << 7) + (this.anIntArray108[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray108[local18] = (this.anIntArray108[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray123[local18] = (local30 << 7) + (this.anIntArray123[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray123[local18] = (this.anIntArray123[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray124[local18] = (local30 << 7) + (this.anIntArray124[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray124[local18] = local30 + (this.anIntArray124[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray122[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray122[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray122[local18] |= 0x2;
				} else {
					this.method922(local18);
					this.anIntArray122[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray121[local18] = (local30 << 7) + (this.anIntArray121[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray121[local18] = local30 + (this.anIntArray121[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray121[local18] = (local30 << 7) + (this.anIntArray121[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray121[local18] = (this.anIntArray121[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method894(local18);
			}
			if (local24 == 121) {
				this.method913(local18);
			}
			if (local24 == 123) {
				this.method891(local18);
			}
			@Pc(494) int local494;
			if (local24 == 6) {
				local494 = this.anIntArray121[local18];
				if (local494 == 16384) {
					this.anIntArray114[local18] = (local30 << 7) + (this.anIntArray114[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local494 = this.anIntArray121[local18];
				if (local494 == 16384) {
					this.anIntArray114[local18] = (this.anIntArray114[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray117[local18] = (local30 << 7) + (this.anIntArray117[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray117[local18] = (this.anIntArray117[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray122[local18] |= 0x4;
				} else {
					this.method903(local18);
					this.anIntArray122[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method915(local18, (local30 << 7) + (this.anIntArray125[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method915(local18, (this.anIntArray125[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local5 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method890(local24 + this.anIntArray113[local18], local18);
		} else if (local5 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method893(local24, local18);
		} else if (local5 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F008A) >> 9);
			this.method917(local24, local18);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method900();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
	public synchronized void method898() {
		this.aClass11_1.method315();
		this.method900();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
	private void method899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	private void method900() {
		this.method894(-1);
		this.method913(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray118[local23] = this.anIntArray110[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray113[local41] = this.anIntArray110[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ee;Z)I")
	private int method901(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(25) int local25 = this.anIntArray124[arg0.anInt912] * this.anIntArray108[arg0.anInt912] + 4096 >> 13;
		@Pc(33) int local33 = local25 * local25 + 16384 >> 15;
		@Pc(42) int local42 = arg0.anInt922 * local33 + 16384 >> 15;
		@Pc(45) Class82 local45 = arg0.aClass82_1;
		local25 = local42 * this.anInt1154 + 128 >> 8;
		if (local45.anInt3658 > 0) {
			local25 = (int) ((double) local25 * Math.pow(0.5D, (double) local45.anInt3658 * 1.953125E-5D * (double) arg0.anInt909) + 0.5D);
		}
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(112) int local112;
		if (local45.aByteArray47 != null) {
			local89 = local45.aByteArray47[arg0.anInt917 + 1];
			local92 = arg0.anInt925;
			if (local45.aByteArray47.length - 2 > arg0.anInt917) {
				local112 = (local45.aByteArray47[arg0.anInt917 + 2] & 0xFF) << 8;
				local122 = (local45.aByteArray47[arg0.anInt917] & 0xFF) << 8;
				local89 += (local92 - local122) * (local45.aByteArray47[arg0.anInt917 + 3] - local89) / (local112 - local122);
			}
			local25 = local89 * local25 + 32 >> 6;
		}
		if (arg0.anInt926 > 0 && local45.aByteArray48 != null) {
			local92 = arg0.anInt926;
			local89 = local45.aByteArray48[arg0.anInt928 + 1];
			if (local45.aByteArray48.length - 2 > arg0.anInt928) {
				local122 = (local45.aByteArray48[arg0.anInt928] & 0xFF) << 8;
				local112 = (local45.aByteArray48[arg0.anInt928 + 2] & 0xFF) << 8;
				local89 += (local92 - local122) * (local45.aByteArray48[arg0.anInt928 + 3] - local89) / (local112 - local122);
			}
			local25 = local25 * local89 + 32 >> 6;
		}
		return local25;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(ZI)V")
	private void method903(@OriginalArg(1) int arg0) {
		if ((this.anIntArray122[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class3_Sub8 local26 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2401(); local26 != null; local26 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2407()) {
			if (local26.anInt912 == arg0) {
				local26.anInt914 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Lclient!ee;I)I")
	private int method905(@OriginalArg(0) Class3_Sub8 arg0) {
		@Pc(17) int local17 = this.anIntArray123[arg0.anInt912];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt924) * (-local17 + 16384) + 32 >> 6) : arg0.anInt924 * local17 + 32 >> 6;
	}

	@OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
	private void method906() {
		@Pc(8) int local8 = this.anInt1187;
		@Pc(11) int local11 = this.anInt1186;
		@Pc(14) long local14 = this.aLong59;
		while (local8 == this.anInt1187) {
			while (this.aClass11_1.anIntArray30[local11] == local8) {
				this.aClass11_1.method313(local11);
				@Pc(25) int local25 = this.aClass11_1.method307(local11);
				if (local25 == 1) {
					this.aClass11_1.method305();
					this.aClass11_1.method308(local11);
					if (this.aClass11_1.method301()) {
						if (!this.aBoolean81 || local8 == 0) {
							this.method900();
							this.aClass11_1.method315();
							return;
						}
						this.aClass11_1.method314(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method897(local25);
				}
				this.aClass11_1.method306(local11);
				this.aClass11_1.method308(local11);
			}
			local11 = this.aClass11_1.method303();
			local8 = this.aClass11_1.anIntArray30[local11];
			local14 = this.aClass11_1.method311(local8);
		}
		this.anInt1187 = local8;
		this.anInt1186 = local11;
		this.aLong59 = local14;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Lclient!ee;Z)Z")
	public boolean method907(@OriginalArg(0) Class3_Sub8 arg0) {
		if (arg0.aClass3_Sub9_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt926 >= 0) {
			arg0.method2783();
			if (arg0.anInt916 > 0 && arg0 == this.aClass3_Sub8ArrayArray2[arg0.anInt912][arg0.anInt916]) {
				this.aClass3_Sub8ArrayArray2[arg0.anInt912][arg0.anInt916] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
	public synchronized void method908() {
		this.method914();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLclient!ee;B)V")
	public void method911(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub4_Sub1_1.aByteArray2.length;
		@Pc(39) int local39;
		if (arg0 && arg1.aClass3_Sub4_Sub1_1.aBoolean21) {
			@Pc(26) int local26 = local8 + local8 - arg1.aClass3_Sub4_Sub1_1.anInt309;
			local39 = (int) ((long) local26 * (long) this.anIntArray117[arg1.anInt912] >> 6);
			local8 <<= 0x8;
			if (local8 <= local39) {
				arg1.aClass3_Sub9_Sub1_3.method729();
				local39 = local8 + local8 - local39 - 1;
			}
		} else {
			local39 = (int) ((long) local8 * (long) this.anIntArray117[arg1.anInt912] >> 6);
		}
		arg1.aClass3_Sub9_Sub1_3.method716(local39);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)I")
	public int method912() {
		return this.anInt1154;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)V")
	private void method913(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method913(local9);
			}
			return;
		}
		this.anIntArray108[arg0] = 12800;
		this.anIntArray123[arg0] = 8192;
		this.anIntArray124[arg0] = 16383;
		this.anIntArray111[arg0] = 8192;
		this.anIntArray115[arg0] = 0;
		this.anIntArray119[arg0] = 8192;
		this.method922(arg0);
		this.method903(arg0);
		this.anIntArray122[arg0] = 0;
		this.anIntArray121[arg0] = 32767;
		this.anIntArray114[arg0] = 256;
		this.anIntArray117[arg0] = 0;
		this.method915(arg0, 8192);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2215(@OriginalArg(0) int arg0) {
		if (this.aClass11_1.method312()) {
			@Pc(18) int local18 = this.anInt1160 * this.aClass11_1.anInt438 / Static143.anInt3288;
			do {
				@Pc(27) long local27 = this.aLong60 + (long) arg0 * (long) local18;
				if (this.aLong59 - local27 >= 0L) {
					this.aLong60 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong59 - this.aLong60 - 1L) / (long) local18);
				arg0 -= local55;
				this.aLong60 += (long) local18 * (long) local55;
				this.aClass3_Sub9_Sub3_1.method2215(local55);
				this.method906();
			} while (this.aClass11_1.method312());
		}
		this.aClass3_Sub9_Sub3_1.method2215(arg0);
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(III)V")
	private void method914() {
		this.anIntArray110[9] = 128;
		this.anIntArray113[9] = 128;
		this.method890(128, 9);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZI)V")
	private void method915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray125[arg0] = arg1;
		this.anIntArray109[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!g", name = "h", descriptor = "(I)Z")
	public synchronized boolean method916() {
		return this.aClass11_1.method312();
	}

	@OriginalMember(owner = "client!g", name = "e", descriptor = "(III)V")
	private void method917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray111[arg1] = arg0;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ILclient!f;Lclient!ie;ILclient!wa;)Z")
	public synchronized boolean method918(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class3_Sub14 arg1, @OriginalArg(4) Class87 arg2) {
		arg1.method1209();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class3_Sub15 local26 = (Class3_Sub15) arg1.aClass16_5.method551(); local26 != null; local26 = (Class3_Sub15) arg1.aClass16_5.method552()) {
			@Pc(32) int local32 = (int) local26.aLong183;
			@Pc(40) Class3_Sub20 local40 = (Class3_Sub20) this.aClass16_4.method554((long) local32);
			if (local40 == null) {
				local40 = Static164.method2577(arg0, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass16_4.method546(local40, (long) local32);
			}
			if (!local40.method2457(local20, arg2, local26.aByteArray33)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method1211();
		}
		return local9;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!ie;ZZ)V")
	public synchronized void method920(@OriginalArg(0) Class3_Sub14 arg0, @OriginalArg(2) boolean arg1) {
		this.method898();
		this.aClass11_1.method316(arg0.aByteArray15);
		this.aBoolean81 = arg1;
		this.aLong60 = 0L;
		@Pc(29) int local29 = this.aClass11_1.method309();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass11_1.method313(local31);
			this.aClass11_1.method306(local31);
			this.aClass11_1.method308(local31);
		}
		this.anInt1186 = this.aClass11_1.method303();
		this.anInt1187 = this.aClass11_1.anIntArray30[this.anInt1186];
		this.aLong59 = this.aClass11_1.method311(this.anInt1187);
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "()Lclient!tb;")
	@Override
	public synchronized Class3_Sub9 method2218() {
		return null;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "()Lclient!tb;")
	@Override
	public synchronized Class3_Sub9 method2219() {
		return this.aClass3_Sub9_Sub3_1;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(IIII)V")
	private void method921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub8 local12 = this.aClass3_Sub8ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub8ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray122[arg2] & 0x2) == 0) {
			local12.anInt926 = 0;
			return;
		}
		for (@Pc(40) Class3_Sub8 local40 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2401(); local40 != null; local40 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2407()) {
			if (local12.anInt912 == local40.anInt912 && local40.anInt926 < 0 && local12 != local40) {
				local12.anInt926 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(II)V")
	private void method922(@OriginalArg(0) int arg0) {
		if ((this.anIntArray122[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) Class3_Sub8 local20 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2401(); local20 != null; local20 = (Class3_Sub8) this.aClass3_Sub9_Sub3_1.aClass72_23.method2407()) {
			if (arg0 == local20.anInt912 && this.aClass3_Sub8ArrayArray1[arg0][local20.anInt911] == null && local20.anInt926 < 0) {
				local20.anInt926 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(IB)V")
	public synchronized void method923(@OriginalArg(0) int arg0) {
		this.anInt1154 = arg0;
	}
}
