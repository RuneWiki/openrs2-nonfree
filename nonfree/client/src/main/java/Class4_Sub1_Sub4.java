import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mn", name = "Lb", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!mn", name = "Mb", descriptor = "I")
	private int anInt4203;

	@OriginalMember(owner = "client!mn", name = "Nb", descriptor = "Z")
	private boolean aBoolean323;

	@OriginalMember(owner = "client!mn", name = "Ob", descriptor = "I")
	private int anInt4204;

	@OriginalMember(owner = "client!mn", name = "Pb", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!mn", name = "Qb", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!mn", name = "Rb", descriptor = "Lclient!um;")
	private Class4_Sub43 aClass4_Sub43_1;

	@OriginalMember(owner = "client!mn", name = "Sb", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!mn", name = "u", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "[[Lclient!oa;")
	private final Class4_Sub30[][] aClass4_Sub30ArrayArray1 = new Class4_Sub30[16][128];

	@OriginalMember(owner = "client!mn", name = "ab", descriptor = "[I")
	public final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!mn", name = "U", descriptor = "[I")
	private final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!mn", name = "t", descriptor = "[I")
	private final int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!mn", name = "Q", descriptor = "[I")
	private final int[] anIntArray349 = new int[16];

	@OriginalMember(owner = "client!mn", name = "db", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!mn", name = "lb", descriptor = "I")
	private final int lb = 1000000;

	@OriginalMember(owner = "client!mn", name = "kb", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!mn", name = "zb", descriptor = "[[Lclient!oa;")
	private final Class4_Sub30[][] aClass4_Sub30ArrayArray2 = new Class4_Sub30[16][128];

	@OriginalMember(owner = "client!mn", name = "Z", descriptor = "I")
	private int anInt4180 = 256;

	@OriginalMember(owner = "client!mn", name = "R", descriptor = "[I")
	private final int[] anIntArray350 = new int[16];

	@OriginalMember(owner = "client!mn", name = "ob", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!mn", name = "hb", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!mn", name = "Eb", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!mn", name = "C", descriptor = "[I")
	public final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!mn", name = "sb", descriptor = "[I")
	public final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!mn", name = "nb", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!mn", name = "Bb", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!mn", name = "Jb", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!mn", name = "gb", descriptor = "Lclient!in;")
	private final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!mn", name = "Kb", descriptor = "Lclient!gb;")
	private final Class4_Sub1_Sub2 aClass4_Sub1_Sub2_1 = new Class4_Sub1_Sub2(this);

	@OriginalMember(owner = "client!mn", name = "N", descriptor = "Lclient!dj;")
	private final Class43 aClass43_24 = new Class43(128);

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub4() {
		this.method3823();
		this.method3798(true);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class4_Sub1 method3784() {
		return this.aClass4_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	private void method3788(@OriginalArg(0) int arg0) {
		if ((this.anIntArray358[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub30 local18 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3270(); local18 != null; local18 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3272()) {
			if (local18.anInt4530 == arg0) {
				local18.anInt4531 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLclient!oa;)I")
	private int method3789(@OriginalArg(1) Class4_Sub30 arg0) {
		@Pc(15) int local15 = arg0.anInt4521 + (arg0.anInt4513 * arg0.anInt4526 >> 12);
		local15 += this.anIntArray349[arg0.anInt4530] * (this.anIntArray346[arg0.anInt4530] - 8192) >> 12;
		@Pc(36) Class204 local36 = arg0.aClass204_1;
		@Pc(59) int local59;
		if (local36.anInt6246 > 0 && (local36.anInt6250 > 0 || this.anIntArray354[arg0.anInt4530] > 0)) {
			local59 = local36.anInt6250 << 2;
			@Pc(64) int local64 = local36.anInt6249 << 1;
			if (local64 > arg0.anInt4529) {
				local59 = local59 * arg0.anInt4529 / local64;
			}
			local59 += this.anIntArray354[arg0.anInt4530] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt4517 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local59 * local98);
		}
		local59 = (int) ((double) (arg0.aClass4_Sub7_Sub1_1.anInt482 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static251.anInt5134 + 0.5D);
		return local59 < 1 ? 1 : local59;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "()I")
	@Override
	public synchronized int method3786() {
		return 0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V")
	private void method3790(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	private void method3791(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class4_Sub30 local18 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3270(); local18 != null; local18 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3272()) {
			if (arg0 < 0 || local18.anInt4530 == arg0) {
				if (local18.aClass4_Sub1_Sub1_3 != null) {
					local18.aClass4_Sub1_Sub1_3.method77(Static251.anInt5134 / 100);
					if (local18.aClass4_Sub1_Sub1_3.method106()) {
						this.aClass4_Sub1_Sub2_1.aClass4_Sub1_Sub3_1.method3505(local18.aClass4_Sub1_Sub1_3);
					}
					local18.method4009();
				}
				if (local18.anInt4516 < 0) {
					this.aClass4_Sub30ArrayArray2[local18.anInt4530][local18.anInt4520] = null;
				}
				local18.method5687();
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)V")
	private void method3792(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 & 0xF0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(37) int local37;
		if (local18 == 128) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method3801(local25, local31, local37);
		} else if (local18 == 144) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local37 <= 0) {
				this.method3801(local25, local31, 64);
			} else {
				this.method3802(local31, local37, local25);
			}
		} else if (local18 == 160) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			this.method3804(local37, local25, local31);
		} else if (local18 == 176) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			local37 = arg0 >> 16 & 0x7F;
			if (local31 == 0) {
				this.anIntArray357[local25] = (this.anIntArray357[local25] & 0xFFE03FFF) + (local37 << 14);
			}
			if (local31 == 32) {
				this.anIntArray357[local25] = (local37 << 7) + (this.anIntArray357[local25] & 0xFFFFC07F);
			}
			if (local31 == 1) {
				this.anIntArray354[local25] = (local37 << 7) + (this.anIntArray354[local25] & 0xFFFFC07F);
			}
			if (local31 == 33) {
				this.anIntArray354[local25] = (this.anIntArray354[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 5) {
				this.anIntArray353[local25] = (local37 << 7) + (this.anIntArray353[local25] & 0xFFFFC07F);
			}
			if (local31 == 37) {
				this.anIntArray353[local25] = local37 + (this.anIntArray353[local25] & 0xFFFFFF80);
			}
			if (local31 == 7) {
				this.anIntArray360[local25] = (this.anIntArray360[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 39) {
				this.anIntArray360[local25] = (this.anIntArray360[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 10) {
				this.anIntArray351[local25] = (this.anIntArray351[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 42) {
				this.anIntArray351[local25] = (this.anIntArray351[local25] & 0xFFFFFF80) + local37;
			}
			if (local31 == 11) {
				this.anIntArray361[local25] = (local37 << 7) + (this.anIntArray361[local25] & 0xFFFFC07F);
			}
			if (local31 == 43) {
				this.anIntArray361[local25] = local37 + (this.anIntArray361[local25] & 0xFFFFFF80);
			}
			if (local31 == 64) {
				if (local37 < 64) {
					this.anIntArray358[local25] &= 0xFFFFFFFE;
				} else {
					this.anIntArray358[local25] |= 0x1;
				}
			}
			if (local31 == 65) {
				if (local37 < 64) {
					this.method3814(local25);
					this.anIntArray358[local25] &= 0xFFFFFFFD;
				} else {
					this.anIntArray358[local25] |= 0x2;
				}
			}
			if (local31 == 99) {
				this.anIntArray345[local25] = (local37 << 7) + (this.anIntArray345[local25] & 0x7F);
			}
			if (local31 == 98) {
				this.anIntArray345[local25] = local37 + (this.anIntArray345[local25] & 0x3F80);
			}
			if (local31 == 101) {
				this.anIntArray345[local25] = (this.anIntArray345[local25] & 0x7F) + (local37 << 7) + 16384;
			}
			if (local31 == 100) {
				this.anIntArray345[local25] = (this.anIntArray345[local25] & 0x3F80) + local37 + 16384;
			}
			if (local31 == 120) {
				this.method3791(local25);
			}
			if (local31 == 121) {
				this.method3800(local25);
			}
			if (local31 == 123) {
				this.method3796(local25);
			}
			@Pc(507) int local507;
			if (local31 == 6) {
				local507 = this.anIntArray345[local25];
				if (local507 == 16384) {
					this.anIntArray349[local25] = (this.anIntArray349[local25] & 0xFFFFC07F) + (local37 << 7);
				}
			}
			if (local31 == 38) {
				local507 = this.anIntArray345[local25];
				if (local507 == 16384) {
					this.anIntArray349[local25] = local37 + (this.anIntArray349[local25] & 0xFFFFFF80);
				}
			}
			if (local31 == 16) {
				this.anIntArray347[local25] = (this.anIntArray347[local25] & 0xFFFFC07F) + (local37 << 7);
			}
			if (local31 == 48) {
				this.anIntArray347[local25] = local37 + (this.anIntArray347[local25] & 0xFFFFFF80);
			}
			if (local31 == 81) {
				if (local37 < 64) {
					this.method3788(local25);
					this.anIntArray358[local25] &= 0xFFFFFFFB;
				} else {
					this.anIntArray358[local25] |= 0x4;
				}
			}
			if (local31 == 17) {
				this.method3803(local25, (local37 << 7) + (this.anIntArray359[local25] & 0xFFFFC07F));
			}
			if (local31 == 49) {
				this.method3803(local25, (this.anIntArray359[local25] & 0xFFFFFF80) + local37);
			}
		} else if (local18 == 192) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method3817(local31 + this.anIntArray357[local25], local25);
		} else if (local18 == 208) {
			local25 = arg0 & 0xF;
			local31 = arg0 >> 8 & 0x7F;
			this.method3790(local25, local31);
		} else if (local18 == 224) {
			local25 = arg0 & 0xF;
			local31 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F94) >> 8);
			this.method3821(local31, local25);
		} else {
			local18 = arg0 & 0xFF;
			if (local18 == 255) {
				this.method3798(true);
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
	private void method3793() {
		@Pc(8) int local8 = this.anInt4204;
		@Pc(11) int local11 = this.anInt4203;
		@Pc(14) long local14 = this.aLong129;
		if (this.aClass4_Sub43_1 != null && this.anInt4205 == local11) {
			this.method3816(this.aBoolean324, this.aBoolean323, this.aClass4_Sub43_1);
			this.method3793();
			return;
		}
		while (local11 == this.anInt4203) {
			while (local11 == this.aClass98_1.anIntArray274[local8]) {
				this.aClass98_1.method2907(local8);
				@Pc(47) int local47 = this.aClass98_1.method2920(local8);
				if (local47 == 1) {
					this.aClass98_1.method2918();
					this.aClass98_1.method2908(local8);
					if (this.aClass98_1.method2912()) {
						if (this.aClass4_Sub43_1 != null) {
							this.method3799(this.aClass4_Sub43_1, this.aBoolean323);
							this.method3793();
							return;
						}
						if (!this.aBoolean323 || local11 == 0) {
							this.method3798(true);
							this.aClass98_1.method2910();
							return;
						}
						this.aClass98_1.method2922(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method3792(local47);
				}
				this.aClass98_1.method2915(local8);
				this.aClass98_1.method2908(local8);
			}
			local8 = this.aClass98_1.method2919();
			local11 = this.aClass98_1.anIntArray274[local8];
			local14 = this.aClass98_1.method2921(local11);
		}
		this.anInt4203 = local11;
		this.anInt4204 = local8;
		this.aLong129 = local14;
		if (this.aClass4_Sub43_1 != null && local11 > this.anInt4205) {
			this.anInt4203 = this.anInt4205;
			this.anInt4204 = -1;
			this.aLong129 = this.aClass98_1.method2921(this.anInt4203);
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(II)V")
	public synchronized void method3794(@OriginalArg(0) int arg0) {
		this.anInt4180 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[IILclient!oa;)Z")
	public boolean method3795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class4_Sub30 arg3) {
		arg3.anInt4511 = Static251.anInt5134 / 100;
		if (arg3.anInt4516 >= 0 && (arg3.aClass4_Sub1_Sub1_3 == null || arg3.aClass4_Sub1_Sub1_3.method79())) {
			arg3.method4009();
			arg3.method5687();
			if (arg3.anInt4527 > 0 && this.aClass4_Sub30ArrayArray1[arg3.anInt4530][arg3.anInt4527] == arg3) {
				this.aClass4_Sub30ArrayArray1[arg3.anInt4530][arg3.anInt4527] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt4526;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray353[arg3.anInt4530] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt4526 = local53;
		}
		arg3.aClass4_Sub1_Sub1_3.method98(this.method3789(arg3));
		@Pc(99) Class204 local99 = arg3.aClass204_1;
		arg3.anInt4517 += local99.anInt6246;
		arg3.anInt4529++;
		@Pc(114) boolean local114 = false;
		@Pc(132) double local132 = (double) ((arg3.anInt4520 - 60 << 8) + (arg3.anInt4513 * arg3.anInt4526 >> 12)) * 5.086263020833333E-6D;
		if (local99.anInt6251 > 0) {
			if (local99.anInt6247 <= 0) {
				arg3.anInt4519 += 128;
			} else {
				arg3.anInt4519 += (int) (Math.pow(2.0D, (double) local99.anInt6247 * local132) * 128.0D + 0.5D);
			}
			if (arg3.anInt4519 * local99.anInt6251 >= 819200) {
				local114 = true;
			}
		}
		if (local99.aByteArray86 != null) {
			if (local99.anInt6243 > 0) {
				arg3.anInt4532 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt6243) * 128.0D + 0.5D);
			} else {
				arg3.anInt4532 += 128;
			}
			while (arg3.anInt4515 < local99.aByteArray86.length - 2 && arg3.anInt4532 > (local99.aByteArray86[arg3.anInt4515 + 2] & 0xFF) << 8) {
				arg3.anInt4515 += 2;
			}
			if (arg3.anInt4515 == local99.aByteArray86.length - 2 && local99.aByteArray86[arg3.anInt4515 + 1] == 0) {
				local114 = true;
			}
		}
		if (arg3.anInt4516 >= 0 && local99.aByteArray85 != null && (this.anIntArray358[arg3.anInt4530] & 0x1) == 0 && (arg3.anInt4527 < 0 || arg3 != this.aClass4_Sub30ArrayArray1[arg3.anInt4530][arg3.anInt4527])) {
			if (local99.anInt6248 > 0) {
				arg3.anInt4516 += (int) (Math.pow(2.0D, (double) local99.anInt6248 * local132) * 128.0D + 0.5D);
			} else {
				arg3.anInt4516 += 128;
			}
			while (local99.aByteArray85.length - 2 > arg3.anInt4510 && arg3.anInt4516 > (local99.aByteArray85[arg3.anInt4510 + 2] & 0xFF) << 8) {
				arg3.anInt4510 += 2;
			}
			if (arg3.anInt4510 == local99.aByteArray85.length - 2) {
				local114 = true;
			}
		}
		if (!local114) {
			arg3.aClass4_Sub1_Sub1_3.method76(arg3.anInt4511, this.method3805(arg3), this.method3812(arg3));
			return false;
		}
		arg3.aClass4_Sub1_Sub1_3.method77(arg3.anInt4511);
		if (arg2 == null) {
			arg3.aClass4_Sub1_Sub1_3.method3783(arg0);
		} else {
			arg3.aClass4_Sub1_Sub1_3.method3781(arg2, arg1, arg0);
		}
		if (arg3.aClass4_Sub1_Sub1_3.method106()) {
			this.aClass4_Sub1_Sub2_1.aClass4_Sub1_Sub3_1.method3505(arg3.aClass4_Sub1_Sub1_3);
		}
		arg3.method4009();
		if (arg3.anInt4516 >= 0) {
			arg3.method5687();
			if (arg3.anInt4527 > 0 && this.aClass4_Sub30ArrayArray1[arg3.anInt4530][arg3.anInt4527] == arg3) {
				this.aClass4_Sub30ArrayArray1[arg3.anInt4530][arg3.anInt4527] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)V")
	private void method3796(@OriginalArg(1) int arg0) {
		for (@Pc(13) Class4_Sub30 local13 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3270(); local13 != null; local13 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3272()) {
			if ((arg0 < 0 || arg0 == local13.anInt4530) && local13.anInt4516 < 0) {
				this.aClass4_Sub30ArrayArray2[local13.anInt4530][local13.anInt4520] = null;
				local13.anInt4516 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public synchronized void method3797() {
		this.method3819(true);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V")
	private void method3798(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3791(-1);
		} else {
			this.method3796(-1);
		}
		this.method3800(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray350[local29] = this.anIntArray356[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray357[local47] = this.anIntArray356[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!um;BZ)V")
	public synchronized void method3799(@OriginalArg(0) Class4_Sub43 arg0, @OriginalArg(2) boolean arg1) {
		this.method3816(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(BI)V")
	private void method3800(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method3800(local12);
			}
			return;
		}
		this.anIntArray360[arg0] = 12800;
		this.anIntArray351[arg0] = 8192;
		this.anIntArray361[arg0] = 16383;
		this.anIntArray346[arg0] = 8192;
		this.anIntArray354[arg0] = 0;
		this.anIntArray353[arg0] = 8192;
		this.method3814(arg0);
		this.method3788(arg0);
		this.anIntArray358[arg0] = 0;
		this.anIntArray345[arg0] = 32767;
		this.anIntArray349[arg0] = 256;
		this.anIntArray347[arg0] = 0;
		this.method3803(arg0, 8192);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)V")
	private void method3801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class4_Sub30 local12 = this.aClass4_Sub30ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub30ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray358[arg0] & 0x2) == 0) {
			local12.anInt4516 = 0;
			return;
		}
		for (@Pc(51) Class4_Sub30 local51 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3270(); local51 != null; local51 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3272()) {
			if (local12.anInt4530 == local51.anInt4530 && local51.anInt4516 < 0 && local12 != local51) {
				local12.anInt4516 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IIII)V")
	private void method3802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3801(arg2, arg0, 64);
		if ((this.anIntArray358[arg2] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub30 local28 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3278(); local28 != null; local28 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3271()) {
				if (local28.anInt4530 == arg2 && local28.anInt4516 < 0) {
					this.aClass4_Sub30ArrayArray2[arg2][local28.anInt4520] = null;
					this.aClass4_Sub30ArrayArray2[arg2][arg0] = local28;
					@Pc(66) int local66 = local28.anInt4521 + (local28.anInt4513 * local28.anInt4526 >> 12);
					local28.anInt4521 += arg0 - local28.anInt4520 << 8;
					local28.anInt4513 = local66 - local28.anInt4521;
					local28.anInt4526 = 4096;
					local28.anInt4520 = arg0;
					return;
				}
			}
		}
		@Pc(112) Class4_Sub16 local112 = (Class4_Sub16) this.aClass43_24.method1273((long) this.anIntArray350[arg2]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class4_Sub7_Sub1 local120 = local112.aClass4_Sub7_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class4_Sub30 local127 = new Class4_Sub30();
		local127.aClass4_Sub7_Sub1_1 = local120;
		local127.anInt4530 = arg2;
		local127.aClass4_Sub16_1 = local112;
		local127.aClass204_1 = local112.aClass204Array1[arg0];
		local127.anInt4527 = local112.aByteArray38[arg0];
		local127.anInt4520 = arg0;
		local127.anInt4528 = local112.aByteArray37[arg0] * arg1 * arg1 * local112.anInt2132 + 1024 >> 11;
		local127.anInt4512 = local112.aByteArray39[arg0] & 0xFF;
		local127.anInt4521 = (arg0 << 8) - (local112.aShortArray44[arg0] & 0x7FFF);
		local127.anInt4519 = 0;
		local127.anInt4516 = -1;
		local127.anInt4510 = 0;
		local127.anInt4532 = 0;
		local127.anInt4515 = 0;
		if (this.anIntArray347[arg2] == 0) {
			local127.aClass4_Sub1_Sub1_3 = Static358.method96(local120, this.method3789(local127), this.method3805(local127), this.method3812(local127));
		} else {
			local127.aClass4_Sub1_Sub1_3 = Static358.method96(local120, this.method3789(local127), 0, this.method3812(local127));
			this.method3811(local127, local112.aShortArray44[arg0] < 0);
		}
		if (local112.aShortArray44[arg0] < 0) {
			local127.aClass4_Sub1_Sub1_3.method108(-1);
		}
		if (local127.anInt4527 >= 0) {
			@Pc(274) Class4_Sub30 local274 = this.aClass4_Sub30ArrayArray1[arg2][local127.anInt4527];
			if (local274 != null && local274.anInt4516 < 0) {
				this.aClass4_Sub30ArrayArray2[arg2][local274.anInt4520] = null;
				local274.anInt4516 = 0;
			}
			this.aClass4_Sub30ArrayArray1[arg2][local127.anInt4527] = local127;
		}
		this.aClass4_Sub1_Sub2_1.aClass116_12.method3274(local127);
		this.aClass4_Sub30ArrayArray2[arg2][arg0] = local127;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIZ)V")
	private void method3803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray359[arg0] = arg1;
		this.anIntArray352[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(IIII)V")
	private void method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLclient!oa;)I")
	private int method3805(@OriginalArg(1) Class4_Sub30 arg0) {
		if (this.anIntArray355[arg0.anInt4530] == 0) {
			return 0;
		}
		@Pc(21) Class204 local21 = arg0.aClass204_1;
		@Pc(37) int local37 = this.anIntArray361[arg0.anInt4530] * this.anIntArray360[arg0.anInt4530] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = arg0.anInt4528 * local45 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt4180 + 128 >> 8;
		local37 = local63 * this.anIntArray355[arg0.anInt4530] + 128 >> 8;
		if (local21.anInt6251 > 0) {
			local37 = (int) (Math.pow(0.5D, (double) arg0.anInt4519 * 1.953125E-5D * (double) local21.anInt6251) * (double) local37 + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local21.aByteArray86 != null) {
			local102 = arg0.anInt4532;
			local110 = local21.aByteArray86[arg0.anInt4515 + 1];
			if (arg0.anInt4515 < local21.aByteArray86.length - 2) {
				local132 = (local21.aByteArray86[arg0.anInt4515] & 0xFF) << 8;
				local144 = (local21.aByteArray86[arg0.anInt4515 + 2] & 0xFF) << 8;
				local110 += (local102 - local132) * (local21.aByteArray86[arg0.anInt4515 + 3] + -local110) / (local144 - local132);
			}
			local37 = local37 * local110 + 32 >> 6;
		}
		if (arg0.anInt4516 > 0 && local21.aByteArray85 != null) {
			local102 = arg0.anInt4516;
			local110 = local21.aByteArray85[arg0.anInt4510 + 1];
			if (arg0.anInt4510 < local21.aByteArray85.length - 2) {
				local132 = (local21.aByteArray85[arg0.anInt4510] & 0xFF) << 8;
				local144 = (local21.aByteArray85[arg0.anInt4510 + 2] & 0xFF) << 8;
				local110 += (local21.aByteArray85[arg0.anInt4510 + 3] - local110) * (local102 + -local132) / (local144 - local132);
			}
			local37 = local37 * local110 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Z")
	public synchronized boolean method3806() {
		return this.aClass98_1.method2914();
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class4_Sub1 method3787() {
		return null;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIB)V")
	private void method3808() {
		this.anIntArray356[9] = 128;
		this.anIntArray357[9] = 128;
		this.method3817(128, 9);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!oa;Z)Z")
	public boolean method3809(@OriginalArg(0) Class4_Sub30 arg0) {
		if (arg0.aClass4_Sub1_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt4516 >= 0) {
			arg0.method5687();
			if (arg0.anInt4527 > 0 && this.aClass4_Sub30ArrayArray1[arg0.anInt4530][arg0.anInt4527] == arg0) {
				this.aClass4_Sub30ArrayArray1[arg0.anInt4530][arg0.anInt4527] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(B)V")
	public synchronized void method3810() {
		for (@Pc(18) Class4_Sub16 local18 = (Class4_Sub16) this.aClass43_24.method1283(); local18 != null; local18 = (Class4_Sub16) this.aClass43_24.method1278()) {
			local18.method2006();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!oa;Z)V")
	public void method3811(@OriginalArg(1) Class4_Sub30 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass4_Sub7_Sub1_1.aByteArray5.length;
		@Pc(37) int local37;
		if (arg1 && arg0.aClass4_Sub7_Sub1_1.aBoolean36) {
			@Pc(24) int local24 = local8 + local8 - arg0.aClass4_Sub7_Sub1_1.anInt483;
			local37 = (int) ((long) local24 * (long) this.anIntArray347[arg0.anInt4530] >> 6);
			local8 <<= 0x8;
			if (local37 >= local8) {
				local37 = local8 + local8 - local37 - 1;
				arg0.aClass4_Sub1_Sub1_3.method103();
			}
		} else {
			local37 = (int) ((long) this.anIntArray347[arg0.anInt4530] * (long) local8 >> 6);
		}
		arg0.aClass4_Sub1_Sub1_3.method105(local37);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(Lclient!oa;Z)I")
	private int method3812(@OriginalArg(0) Class4_Sub30 arg0) {
		@Pc(14) int local14 = this.anIntArray351[arg0.anInt4530];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt4512) * (-local14 + 16384) + 32 >> 6) : arg0.anInt4512 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)I")
	public int method3813() {
		return this.anInt4180;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(II)V")
	private void method3814(@OriginalArg(1) int arg0) {
		if ((this.anIntArray358[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class4_Sub30 local19 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3270(); local19 != null; local19 = (Class4_Sub30) this.aClass4_Sub1_Sub2_1.aClass116_12.method3272()) {
			if (local19.anInt4530 == arg0 && this.aClass4_Sub30ArrayArray2[arg0][local19.anInt4520] == null && local19.anInt4516 < 0) {
				local19.anInt4516 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3783(@OriginalArg(0) int arg0) {
		if (this.aClass98_1.method2914()) {
			@Pc(14) int local14 = this.aClass98_1.anInt3196 * this.lb / Static251.anInt5134;
			do {
				@Pc(24) long local24 = this.aLong130 + (long) local14 * (long) arg0;
				if (this.aLong129 - local24 >= 0L) {
					this.aLong130 = local24;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong129 - this.aLong130 - 1L) / (long) local14);
				this.aLong130 += (long) local14 * (long) local54;
				this.aClass4_Sub1_Sub2_1.method3783(local54);
				arg0 -= local54;
				this.method3793();
			} while (this.aClass98_1.method2914());
		}
		this.aClass4_Sub1_Sub2_1.method3783(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZLclient!um;Z)V")
	private synchronized void method3816(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class4_Sub43 arg2) {
		this.method3819(arg0);
		this.aClass98_1.method2916(arg2.aByteArray84);
		this.aLong130 = 0L;
		this.aBoolean323 = arg1;
		@Pc(28) int local28 = this.aClass98_1.method2913();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass98_1.method2907(local30);
			this.aClass98_1.method2915(local30);
			this.aClass98_1.method2908(local30);
		}
		this.anInt4204 = this.aClass98_1.method2919();
		this.anInt4203 = this.aClass98_1.anIntArray274[this.anInt4204];
		this.aLong129 = this.aClass98_1.method2921(this.anInt4203);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(IIB)V")
	private void method3817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray350[arg1] != arg0) {
			this.anIntArray350[arg1] = arg0;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass4_Sub30ArrayArray1[arg1][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!tj;ILclient!um;ILclient!ij;)Z")
	public synchronized boolean method3818(@OriginalArg(0) Class193 arg0, @OriginalArg(2) Class4_Sub43 arg1, @OriginalArg(4) Class96 arg2) {
		arg1.method5292();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class4_Sub22 local34 = (Class4_Sub22) arg1.aClass43_33.method1283(); local34 != null; local34 = (Class4_Sub22) arg1.aClass43_33.method1278()) {
			@Pc(40) int local40 = (int) local34.aLong223;
			@Pc(48) Class4_Sub16 local48 = (Class4_Sub16) this.aClass43_24.method1273((long) local40);
			if (local48 == null) {
				local48 = Static277.method4745(local40, arg0);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass43_24.method1276(local48, (long) local40);
			}
			if (!local48.method2003(local34.aByteArray51, arg2, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5291();
		}
		return local9;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BZ)V")
	private synchronized void method3819(@OriginalArg(1) boolean arg0) {
		this.aClass98_1.method2910();
		this.aClass4_Sub43_1 = null;
		this.method3798(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass98_1.method2914()) {
			@Pc(14) int local14 = this.aClass98_1.anInt3196 * this.lb / Static251.anInt5134;
			do {
				@Pc(23) long local23 = this.aLong130 + (long) local14 * (long) arg2;
				if (this.aLong129 - local23 >= 0L) {
					this.aLong130 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong129 - this.aLong130 - 1L) / (long) local14);
				this.aLong130 += (long) local14 * (long) local54;
				this.aClass4_Sub1_Sub2_1.method3781(arg0, arg1, local54);
				this.method3793();
				arg2 -= local54;
				arg1 += local54;
			} while (this.aClass98_1.method2914());
		}
		this.aClass4_Sub1_Sub2_1.method3781(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)V")
	public synchronized void method3820() {
		this.method3808();
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(III)V")
	private void method3821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray346[arg1] = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V")
	public synchronized void method3822() {
		for (@Pc(7) Class4_Sub16 local7 = (Class4_Sub16) this.aClass43_24.method1283(); local7 != null; local7 = (Class4_Sub16) this.aClass43_24.method1278()) {
			local7.method5687();
		}
	}

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "(III)V")
	private synchronized void method3823() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray355[local19] = 256;
		}
	}
}
