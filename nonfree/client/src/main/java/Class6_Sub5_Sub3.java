import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class6_Sub5_Sub3 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ls", name = "Cb", descriptor = "I")
	private int anInt4004;

	@OriginalMember(owner = "client!ls", name = "Db", descriptor = "Z")
	private boolean aBoolean261;

	@OriginalMember(owner = "client!ls", name = "Eb", descriptor = "I")
	private int anInt4005;

	@OriginalMember(owner = "client!ls", name = "Fb", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!ls", name = "Hb", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!ls", name = "Ib", descriptor = "Z")
	private boolean aBoolean262;

	@OriginalMember(owner = "client!ls", name = "Jb", descriptor = "I")
	private int anInt4006;

	@OriginalMember(owner = "client!ls", name = "Kb", descriptor = "Lclient!tj;")
	private Class6_Sub37 aClass6_Sub37_2;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "[I")
	private final int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
	private final int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "[I")
	private final int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!ls", name = "H", descriptor = "[I")
	private final int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!ls", name = "T", descriptor = "[I")
	private final int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!ls", name = "db", descriptor = "[I")
	public final int[] anIntArray350 = new int[16];

	@OriginalMember(owner = "client!ls", name = "bb", descriptor = "[[Lclient!pl;")
	private final Class6_Sub26[][] aClass6_Sub26ArrayArray1 = new Class6_Sub26[16][128];

	@OriginalMember(owner = "client!ls", name = "nb", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!ls", name = "O", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!ls", name = "mb", descriptor = "[I")
	private final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!ls", name = "P", descriptor = "[I")
	private final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!ls", name = "fb", descriptor = "[I")
	private final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
	private int anInt3975 = 256;

	@OriginalMember(owner = "client!ls", name = "ub", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!ls", name = "Z", descriptor = "[I")
	public final int[] anIntArray349 = new int[16];

	@OriginalMember(owner = "client!ls", name = "xb", descriptor = "I")
	private final int anInt4002 = 1000000;

	@OriginalMember(owner = "client!ls", name = "yb", descriptor = "[I")
	public final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!ls", name = "vb", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!ls", name = "zb", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!ls", name = "Ab", descriptor = "[[Lclient!pl;")
	private final Class6_Sub26[][] aClass6_Sub26ArrayArray2 = new Class6_Sub26[16][128];

	@OriginalMember(owner = "client!ls", name = "ab", descriptor = "Lclient!bs;")
	private final Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!ls", name = "Gb", descriptor = "Lclient!ct;")
	private final Class6_Sub5_Sub1 aClass6_Sub5_Sub1_1 = new Class6_Sub5_Sub1(this);

	@OriginalMember(owner = "client!ls", name = "R", descriptor = "Lclient!ke;")
	private final Class137 aClass137_25 = new Class137(128);

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub3() {
		this.method3655();
		this.method3648(true);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	private void method3629() {
		@Pc(8) int local8 = this.anInt4005;
		@Pc(11) int local11 = this.anInt4004;
		@Pc(14) long local14 = this.aLong130;
		if (this.aClass6_Sub37_2 != null && this.anInt4006 == local11) {
			this.method3636(this.aBoolean262, this.aBoolean261, this.aClass6_Sub37_2);
			this.method3629();
			return;
		}
		while (this.anInt4004 == local11) {
			while (local11 == this.aClass33_1.anIntArray51[local8]) {
				this.aClass33_1.method791(local8);
				@Pc(47) int local47 = this.aClass33_1.method790(local8);
				if (local47 == 1) {
					this.aClass33_1.method784();
					this.aClass33_1.method796(local8);
					if (this.aClass33_1.method795()) {
						if (this.aClass6_Sub37_2 != null) {
							this.method3654(this.aBoolean261, this.aClass6_Sub37_2);
							this.method3629();
							return;
						}
						if (!this.aBoolean261 || local11 == 0) {
							this.method3648(true);
							this.aClass33_1.method792();
							return;
						}
						this.aClass33_1.method793(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method3641(local47);
				}
				this.aClass33_1.method783(local8);
				this.aClass33_1.method796(local8);
			}
			local8 = this.aClass33_1.method787();
			local11 = this.aClass33_1.anIntArray51[local8];
			local14 = this.aClass33_1.method785(local11);
		}
		this.anInt4005 = local8;
		this.aLong130 = local14;
		this.anInt4004 = local11;
		if (this.aClass6_Sub37_2 != null && this.anInt4006 < local11) {
			this.anInt4005 = -1;
			this.anInt4004 = this.anInt4006;
			this.aLong130 = this.aClass33_1.method785(this.anInt4004);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)V")
	public synchronized void method3630(@OriginalArg(0) int arg0) {
		this.anInt3975 = arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)V")
	private void method3631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray357[arg0] = arg1;
		this.anIntArray349[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
	private void method3632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIZ)V")
	private void method3633() {
		this.anIntArray354[9] = 128;
		this.anIntArray355[9] = 128;
		this.method3650(9, 128);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!pl;B)I")
	private int method3634(@OriginalArg(0) Class6_Sub26 arg0) {
		if (this.anIntArray347[arg0.anInt5056] == 0) {
			return 0;
		}
		@Pc(17) Class150 local17 = arg0.aClass150_1;
		@Pc(33) int local33 = this.anIntArray353[arg0.anInt5056] * this.anIntArray352[arg0.anInt5056] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt5049 * local41 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt3975 * local50 + 128 >> 8;
		local33 = local65 * this.anIntArray347[arg0.anInt5056] + 128 >> 8;
		if (local17.anInt3826 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt5043 * 1.953125E-5D * (double) local17.anInt3826) * (double) local33 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local17.aByteArray54 != null) {
			local104 = arg0.anInt5052;
			local112 = local17.aByteArray54[arg0.anInt5058 + 1];
			if (arg0.anInt5058 < local17.aByteArray54.length - 2) {
				local134 = (local17.aByteArray54[arg0.anInt5058] & 0xFF) << 8;
				local146 = (local17.aByteArray54[arg0.anInt5058 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (-local112 + local17.aByteArray54[arg0.anInt5058 + 3]) / (local146 - local134);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		if (arg0.anInt5042 > 0 && local17.aByteArray53 != null) {
			local104 = arg0.anInt5042;
			local112 = local17.aByteArray53[arg0.anInt5044 + 1];
			if (local17.aByteArray53.length - 2 > arg0.anInt5044) {
				local134 = (local17.aByteArray53[arg0.anInt5044] & 0xFF) << 8;
				local146 = (local17.aByteArray53[arg0.anInt5044 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (-local112 + local17.aByteArray53[arg0.anInt5044 + 3]) / (local146 - local134);
			}
			local33 = local112 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Z)V")
	public synchronized void method3635() {
		for (@Pc(17) Class6_Sub19 local17 = (Class6_Sub19) this.aClass137_25.method3181(); local17 != null; local17 = (Class6_Sub19) this.aClass137_25.method3182()) {
			local17.method3065();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZZLclient!tj;)V")
	private synchronized void method3636(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub37 arg2) {
		this.method3663(arg0);
		this.aClass33_1.method797(arg2.aByteArray79);
		this.aBoolean261 = arg1;
		this.aLong129 = 0L;
		@Pc(30) int local30 = this.aClass33_1.method789();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass33_1.method791(local32);
			this.aClass33_1.method783(local32);
			this.aClass33_1.method796(local32);
		}
		this.anInt4005 = this.aClass33_1.method787();
		this.anInt4004 = this.aClass33_1.anIntArray51[this.anInt4005];
		this.aLong130 = this.aClass33_1.method785(this.anInt4004);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)V")
	private void method3637(@OriginalArg(1) int arg0) {
		if ((this.anIntArray356[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub26 local22 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1882(); local22 != null; local22 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1891()) {
			if (arg0 == local22.anInt5056 && this.aClass6_Sub26ArrayArray1[arg0][local22.anInt5054] == null && local22.anInt5042 < 0) {
				local22.anInt5042 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(II)V")
	private void method3639(@OriginalArg(1) int arg0) {
		if ((this.anIntArray356[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class6_Sub26 local20 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1882(); local20 != null; local20 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1891()) {
			if (arg0 == local20.anInt5056) {
				local20.anInt5053 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!pl;I)Z")
	public boolean method3640(@OriginalArg(0) Class6_Sub26 arg0) {
		if (arg0.aClass6_Sub5_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt5042 >= 0) {
			arg0.method5977();
			if (arg0.anInt5057 > 0 && this.aClass6_Sub26ArrayArray2[arg0.anInt5056][arg0.anInt5057] == arg0) {
				this.aClass6_Sub26ArrayArray2[arg0.anInt5056][arg0.anInt5057] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)V")
	private void method3641(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3647(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method3651(local24, local30, local18);
			} else {
				this.method3647(64, local24, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3658(local24, local18, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray355[local18] = (this.anIntArray355[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray355[local18] = (this.anIntArray355[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray344[local18] = (this.anIntArray344[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray344[local18] = local30 + (this.anIntArray344[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray351[local18] = (local30 << 7) + (this.anIntArray351[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray351[local18] = (this.anIntArray351[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray353[local18] = (local30 << 7) + (this.anIntArray353[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray343[local18] = (local30 << 7) + (this.anIntArray343[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray343[local18] = local30 + (this.anIntArray343[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray352[local18] = (this.anIntArray352[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray352[local18] = local30 + (this.anIntArray352[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray356[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray356[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray356[local18] |= 0x2;
				} else {
					this.method3637(local18);
					this.anIntArray356[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray346[local18] = (this.anIntArray346[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray346[local18] = local30 + (this.anIntArray346[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray346[local18] = (this.anIntArray346[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray346[local18] = (this.anIntArray346[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method3649(local18);
			}
			if (local24 == 121) {
				this.method3659(local18);
			}
			if (local24 == 123) {
				this.method3662(local18);
			}
			@Pc(498) int local498;
			if (local24 == 6) {
				local498 = this.anIntArray346[local18];
				if (local498 == 16384) {
					this.anIntArray342[local18] = (local30 << 7) + (this.anIntArray342[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local498 = this.anIntArray346[local18];
				if (local498 == 16384) {
					this.anIntArray342[local18] = local30 + (this.anIntArray342[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray350[local18] = (local30 << 7) + (this.anIntArray350[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray350[local18] = (this.anIntArray350[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray356[local18] |= 0x4;
				} else {
					this.method3639(local18);
					this.anIntArray356[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method3631(local18, (this.anIntArray357[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method3631(local18, (this.anIntArray357[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method3650(local18, local24 + this.anIntArray355[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method3632(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method3665(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3648(true);
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method5730(@OriginalArg(0) int arg0) {
		if (this.aClass33_1.method794()) {
			@Pc(18) int local18 = this.anInt4002 * this.aClass33_1.anInt878 / Static203.anInt3580;
			do {
				@Pc(28) long local28 = this.aLong129 + (long) local18 * (long) arg0;
				if (this.aLong130 - local28 >= 0L) {
					this.aLong129 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong130 + (long) local18 - this.aLong129 - 1L) / (long) local18);
				this.aLong129 += (long) local58 * (long) local18;
				this.aClass6_Sub5_Sub1_1.method5730(local58);
				arg0 -= local58;
				this.method3629();
			} while (this.aClass33_1.method794());
		}
		this.aClass6_Sub5_Sub1_1.method5730(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)I")
	public int method3642() {
		return this.anInt3975;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(Lclient!pl;I)I")
	private int method3643(@OriginalArg(0) Class6_Sub26 arg0) {
		@Pc(9) int local9 = this.anIntArray343[arg0.anInt5056];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt5047) * (16384 - local9) + 32 >> 6) : local9 * arg0.anInt5047 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([IIIILclient!pl;)Z")
	public boolean method3644(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub26 arg3) {
		arg3.anInt5048 = Static203.anInt3580 / 100;
		if (arg3.anInt5042 >= 0 && (arg3.aClass6_Sub5_Sub4_4 == null || arg3.aClass6_Sub5_Sub4_4.method5735())) {
			arg3.method4447();
			arg3.method5977();
			if (arg3.anInt5057 > 0 && arg3 == this.aClass6_Sub26ArrayArray2[arg3.anInt5056][arg3.anInt5057]) {
				this.aClass6_Sub26ArrayArray2[arg3.anInt5056][arg3.anInt5057] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt5055;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray351[arg3.anInt5056] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt5055 = local59;
		}
		arg3.aClass6_Sub5_Sub4_4.method5769(this.method3660(arg3));
		@Pc(96) Class150 local96 = arg3.aClass150_1;
		@Pc(98) boolean local98 = false;
		arg3.anInt5051 += local96.anInt3828;
		arg3.anInt5046++;
		@Pc(129) double local129 = (double) ((arg3.anInt5055 * arg3.anInt5050 >> 12) + (arg3.anInt5054 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt3826 > 0) {
			if (local96.anInt3820 > 0) {
				arg3.anInt5043 += (int) (Math.pow(2.0D, (double) local96.anInt3820 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt5043 += 128;
			}
			if (local96.anInt3826 * arg3.anInt5043 >= 819200) {
				local98 = true;
			}
		}
		if (local96.aByteArray54 != null) {
			if (local96.anInt3827 <= 0) {
				arg3.anInt5052 += 128;
			} else {
				arg3.anInt5052 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt3827) * 128.0D + 0.5D);
			}
			while (local96.aByteArray54.length - 2 > arg3.anInt5058 && (local96.aByteArray54[arg3.anInt5058 + 2] & 0xFF) << 8 < arg3.anInt5052) {
				arg3.anInt5058 += 2;
			}
			if (arg3.anInt5058 == local96.aByteArray54.length - 2 && local96.aByteArray54[arg3.anInt5058 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg3.anInt5042 >= 0 && local96.aByteArray53 != null && (this.anIntArray356[arg3.anInt5056] & 0x1) == 0 && (arg3.anInt5057 < 0 || this.aClass6_Sub26ArrayArray2[arg3.anInt5056][arg3.anInt5057] != arg3)) {
			if (local96.anInt3824 <= 0) {
				arg3.anInt5042 += 128;
			} else {
				arg3.anInt5042 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt3824) * 128.0D + 0.5D);
			}
			while (arg3.anInt5044 < local96.aByteArray53.length - 2 && arg3.anInt5042 > (local96.aByteArray53[arg3.anInt5044 + 2] & 0xFF) << 8) {
				arg3.anInt5044 += 2;
			}
			if (local96.aByteArray53.length - 2 == arg3.anInt5044) {
				local98 = true;
			}
		}
		if (!local98) {
			arg3.aClass6_Sub5_Sub4_4.method5760(arg3.anInt5048, this.method3634(arg3), this.method3643(arg3));
			return false;
		}
		arg3.aClass6_Sub5_Sub4_4.method5773(arg3.anInt5048);
		if (arg0 == null) {
			arg3.aClass6_Sub5_Sub4_4.method5730(arg1);
		} else {
			arg3.aClass6_Sub5_Sub4_4.method5734(arg0, arg2, arg1);
		}
		if (arg3.aClass6_Sub5_Sub4_4.method5749()) {
			this.aClass6_Sub5_Sub1_1.aClass6_Sub5_Sub2_1.method2166(arg3.aClass6_Sub5_Sub4_4);
		}
		arg3.method4447();
		if (arg3.anInt5042 >= 0) {
			arg3.method5977();
			if (arg3.anInt5057 > 0 && arg3 == this.aClass6_Sub26ArrayArray2[arg3.anInt5056][arg3.anInt5057]) {
				this.aClass6_Sub26ArrayArray2[arg3.anInt5056][arg3.anInt5057] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(BII)V")
	public synchronized void method3645() {
		this.method3633();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5728() {
		return 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIZ)V")
	private void method3647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class6_Sub26 local18 = this.aClass6_Sub26ArrayArray1[arg2][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass6_Sub26ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray356[arg2] & 0x2) == 0) {
			local18.anInt5042 = 0;
			return;
		}
		for (@Pc(45) Class6_Sub26 local45 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1882(); local45 != null; local45 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1891()) {
			if (local45.anInt5056 == local18.anInt5056 && local45.anInt5042 < 0 && local18 != local45) {
				local18.anInt5042 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZI)V")
	private void method3648(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3649(-1);
		} else {
			this.method3662(-1);
		}
		this.method3659(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray345[local23] = this.anIntArray354[local23];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray355[local49] = this.anIntArray354[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(ZI)V")
	private void method3649(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class6_Sub26 local8 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1882(); local8 != null; local8 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1891()) {
			if (arg0 < 0 || arg0 == local8.anInt5056) {
				if (local8.aClass6_Sub5_Sub4_4 != null) {
					local8.aClass6_Sub5_Sub4_4.method5773(Static203.anInt3580 / 100);
					if (local8.aClass6_Sub5_Sub4_4.method5749()) {
						this.aClass6_Sub5_Sub1_1.aClass6_Sub5_Sub2_1.method2166(local8.aClass6_Sub5_Sub4_4);
					}
					local8.method4447();
				}
				if (local8.anInt5042 < 0) {
					this.aClass6_Sub26ArrayArray1[local8.anInt5056][local8.anInt5054] = null;
				}
				local8.method5977();
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5734(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass33_1.method794()) {
			@Pc(18) int local18 = this.anInt4002 * this.aClass33_1.anInt878 / Static203.anInt3580;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong129;
				if (this.aLong130 - local27 >= 0L) {
					this.aLong129 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong130 + (long) local18 - this.aLong129 - 1L) / (long) local18);
				this.aLong129 += (long) local18 * (long) local56;
				this.aClass6_Sub5_Sub1_1.method5734(arg0, arg1, local56);
				arg2 -= local56;
				arg1 += local56;
				this.method3629();
			} while (this.aClass33_1.method794());
		}
		this.aClass6_Sub5_Sub1_1.method5734(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBI)V")
	private void method3650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray345[arg0]) {
			this.anIntArray345[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass6_Sub26ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)V")
	private void method3651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3647(64, arg0, arg2);
		if ((this.anIntArray356[arg2] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub26 local28 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1883(); local28 != null; local28 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1884()) {
				if (arg2 == local28.anInt5056 && local28.anInt5042 < 0) {
					this.aClass6_Sub26ArrayArray1[arg2][local28.anInt5054] = null;
					this.aClass6_Sub26ArrayArray1[arg2][arg0] = local28;
					@Pc(63) int local63 = local28.anInt5041 + (local28.anInt5055 * local28.anInt5050 >> 12);
					local28.anInt5041 += arg0 - local28.anInt5054 << 8;
					local28.anInt5054 = arg0;
					local28.anInt5055 = 4096;
					local28.anInt5050 = local63 - local28.anInt5041;
					return;
				}
			}
		}
		@Pc(109) Class6_Sub19 local109 = (Class6_Sub19) this.aClass137_25.method3175((long) this.anIntArray345[arg2]);
		if (local109 == null) {
			return;
		}
		@Pc(121) Class6_Sub4_Sub1 local121 = local109.aClass6_Sub4_Sub1Array1[arg0];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class6_Sub26 local128 = new Class6_Sub26();
		local128.aClass6_Sub19_1 = local109;
		local128.aClass6_Sub4_Sub1_2 = local121;
		local128.anInt5056 = arg2;
		local128.aClass150_1 = local109.aClass150Array1[arg0];
		local128.anInt5057 = local109.aByteArray50[arg0];
		local128.anInt5054 = arg0;
		local128.anInt5049 = local109.aByteArray49[arg0] * arg1 * arg1 * local109.anInt3417 + 1024 >> 11;
		local128.anInt5047 = local109.aByteArray48[arg0] & 0xFF;
		local128.anInt5041 = (arg0 << 8) - (local109.aShortArray60[arg0] & 0x7FFF);
		local128.anInt5052 = 0;
		local128.anInt5044 = 0;
		local128.anInt5042 = -1;
		local128.anInt5043 = 0;
		local128.anInt5058 = 0;
		if (this.anIntArray350[arg2] == 0) {
			local128.aClass6_Sub5_Sub4_4 = Static460.method5740(local121, this.method3660(local128), this.method3634(local128), this.method3643(local128));
		} else {
			local128.aClass6_Sub5_Sub4_4 = Static460.method5740(local121, this.method3660(local128), 0, this.method3643(local128));
			this.method3653(local109.aShortArray60[arg0] < 0, local128);
		}
		if (local109.aShortArray60[arg0] < 0) {
			local128.aClass6_Sub5_Sub4_4.method5745(-1);
		}
		if (local128.anInt5057 >= 0) {
			@Pc(287) Class6_Sub26 local287 = this.aClass6_Sub26ArrayArray2[arg2][local128.anInt5057];
			if (local287 != null && local287.anInt5042 < 0) {
				this.aClass6_Sub26ArrayArray1[arg2][local287.anInt5054] = null;
				local287.anInt5042 = 0;
			}
			this.aClass6_Sub26ArrayArray2[arg2][local128.anInt5057] = local128;
		}
		this.aClass6_Sub5_Sub1_1.aClass88_13.method1878(local128);
		this.aClass6_Sub26ArrayArray1[arg2][arg0] = local128;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)V")
	public synchronized void method3652() {
		for (@Pc(11) Class6_Sub19 local11 = (Class6_Sub19) this.aClass137_25.method3181(); local11 != null; local11 = (Class6_Sub19) this.aClass137_25.method3182()) {
			local11.method5977();
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BZLclient!pl;)V")
	public void method3653(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		@Pc(12) int local12 = arg1.aClass6_Sub4_Sub1_2.aByteArray34.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass6_Sub4_Sub1_2.aBoolean184) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass6_Sub4_Sub1_2.anInt2444;
			local12 <<= 0x8;
			local44 = (int) ((long) this.anIntArray350[arg1.anInt5056] * (long) local27 >> 6);
			if (local12 <= local44) {
				local44 = local12 + local12 - local44 - 1;
				arg1.aClass6_Sub5_Sub4_4.method5774();
			}
		} else {
			local44 = (int) ((long) local12 * (long) this.anIntArray350[arg1.anInt5056] >> 6);
		}
		arg1.aClass6_Sub5_Sub4_4.method5736(local44);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZILclient!tj;)V")
	public synchronized void method3654(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub37 arg1) {
		this.method3636(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(IBI)V")
	private synchronized void method3655() {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			this.anIntArray347[local5] = 256;
		}
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "()Lclient!wg;")
	@Override
	public synchronized Class6_Sub5 method5732() {
		return null;
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(B)Z")
	public synchronized boolean method3656() {
		return this.aClass33_1.method794();
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "()Lclient!wg;")
	@Override
	public synchronized Class6_Sub5 method5729() {
		return this.aClass6_Sub5_Sub1_1;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!iv;Lclient!lt;ILclient!tj;)Z")
	public synchronized boolean method3657(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Class158 arg1, @OriginalArg(4) Class6_Sub37 arg2) {
		arg2.method5285();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class6_Sub8 local29 = (Class6_Sub8) arg2.aClass137_31.method3181(); local29 != null; local29 = (Class6_Sub8) arg2.aClass137_31.method3182()) {
			@Pc(35) int local35 = (int) local29.aLong217;
			@Pc(43) Class6_Sub19 local43 = (Class6_Sub19) this.aClass137_25.method3175((long) local35);
			if (local43 == null) {
				local43 = Static70.method1388(arg1, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass137_25.method3179((long) local35, local43);
			}
			if (!local43.method3064(local23, local29.aByteArray22, arg0)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method5287();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBII)V")
	private void method3658(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(IZ)V")
	private void method3659(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method3659(local9);
			}
			return;
		}
		this.anIntArray353[arg0] = 12800;
		this.anIntArray343[arg0] = 8192;
		this.anIntArray352[arg0] = 16383;
		this.anIntArray348[arg0] = 8192;
		this.anIntArray344[arg0] = 0;
		this.anIntArray351[arg0] = 8192;
		this.method3637(arg0);
		this.method3639(arg0);
		this.anIntArray356[arg0] = 0;
		this.anIntArray346[arg0] = 32767;
		this.anIntArray342[arg0] = 256;
		this.anIntArray350[arg0] = 0;
		this.method3631(arg0, 8192);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILclient!pl;)I")
	private int method3660(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(14) int local14 = (arg0.anInt5055 * arg0.anInt5050 >> 12) + arg0.anInt5041;
		local14 += (this.anIntArray348[arg0.anInt5056] - 8192) * this.anIntArray342[arg0.anInt5056] >> 12;
		@Pc(42) Class150 local42 = arg0.aClass150_1;
		@Pc(68) int local68;
		if (local42.anInt3828 > 0 && (local42.anInt3822 > 0 || this.anIntArray344[arg0.anInt5056] > 0)) {
			local68 = local42.anInt3822 << 2;
			@Pc(73) int local73 = local42.anInt3819 << 1;
			if (local73 > arg0.anInt5046) {
				local68 = local68 * arg0.anInt5046 / local73;
			}
			local68 += this.anIntArray344[arg0.anInt5056] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt5051 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local103 * (double) local68);
		}
		local68 = (int) ((double) (arg0.aClass6_Sub4_Sub1_2.anInt2442 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static203.anInt3580 + 0.5D);
		return local68 >= 1 ? local68 : 1;
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(II)V")
	private void method3662(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class6_Sub26 local14 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1882(); local14 != null; local14 = (Class6_Sub26) this.aClass6_Sub5_Sub1_1.aClass88_13.method1891()) {
			if ((arg0 < 0 || arg0 == local14.anInt5056) && local14.anInt5042 < 0) {
				this.aClass6_Sub26ArrayArray1[local14.anInt5056][local14.anInt5054] = null;
				local14.anInt5042 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(ZI)V")
	private synchronized void method3663(@OriginalArg(0) boolean arg0) {
		this.aClass33_1.method792();
		this.aClass6_Sub37_2 = null;
		this.method3648(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V")
	public synchronized void method3664() {
		this.method3663(true);
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(III)V")
	private void method3665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray348[arg0] = arg1;
	}
}
