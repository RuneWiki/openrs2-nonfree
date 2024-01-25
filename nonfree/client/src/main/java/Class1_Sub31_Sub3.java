import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class1_Sub31_Sub3 extends Class1_Sub31 {

	@OriginalMember(owner = "client!rh", name = "Gb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!rh", name = "Hb", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!rh", name = "Ib", descriptor = "I")
	private int anInt5403;

	@OriginalMember(owner = "client!rh", name = "Jb", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!rh", name = "Kb", descriptor = "I")
	private int anInt5404;

	@OriginalMember(owner = "client!rh", name = "Mb", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!rh", name = "Nb", descriptor = "Lclient!o;")
	private Class1_Sub30 aClass1_Sub30_2;

	@OriginalMember(owner = "client!rh", name = "Ob", descriptor = "I")
	private int anInt5405;

	@OriginalMember(owner = "client!rh", name = "B", descriptor = "[I")
	private final int[] anIntArray514 = new int[16];

	@OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
	public final int[] anIntArray512 = new int[16];

	@OriginalMember(owner = "client!rh", name = "O", descriptor = "[I")
	private final int[] anIntArray517 = new int[16];

	@OriginalMember(owner = "client!rh", name = "J", descriptor = "[I")
	private final int[] anIntArray515 = new int[16];

	@OriginalMember(owner = "client!rh", name = "X", descriptor = "[I")
	private final int[] anIntArray519 = new int[16];

	@OriginalMember(owner = "client!rh", name = "Z", descriptor = "[I")
	public final int[] anIntArray520 = new int[16];

	@OriginalMember(owner = "client!rh", name = "Q", descriptor = "[[Lclient!dd;")
	private final Class1_Sub10[][] aClass1_Sub10ArrayArray1 = new Class1_Sub10[16][128];

	@OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
	private final int anInt5356 = 1000000;

	@OriginalMember(owner = "client!rh", name = "S", descriptor = "[I")
	private final int[] anIntArray518 = new int[16];

	@OriginalMember(owner = "client!rh", name = "vb", descriptor = "[I")
	private final int[] anIntArray522 = new int[16];

	@OriginalMember(owner = "client!rh", name = "K", descriptor = "[I")
	private final int[] anIntArray516 = new int[16];

	@OriginalMember(owner = "client!rh", name = "hb", descriptor = "I")
	private int anInt5386 = 256;

	@OriginalMember(owner = "client!rh", name = "wb", descriptor = "[I")
	private final int[] anIntArray523 = new int[16];

	@OriginalMember(owner = "client!rh", name = "gb", descriptor = "[I")
	private final int[] anIntArray521 = new int[16];

	@OriginalMember(owner = "client!rh", name = "zb", descriptor = "[I")
	public final int[] anIntArray524 = new int[16];

	@OriginalMember(owner = "client!rh", name = "x", descriptor = "[I")
	private final int[] anIntArray513 = new int[16];

	@OriginalMember(owner = "client!rh", name = "Bb", descriptor = "[I")
	private final int[] anIntArray525 = new int[16];

	@OriginalMember(owner = "client!rh", name = "Cb", descriptor = "[[Lclient!dd;")
	private final Class1_Sub10[][] aClass1_Sub10ArrayArray2 = new Class1_Sub10[16][128];

	@OriginalMember(owner = "client!rh", name = "Fb", descriptor = "[I")
	private final int[] anIntArray527 = new int[16];

	@OriginalMember(owner = "client!rh", name = "Db", descriptor = "[I")
	private final int[] anIntArray526 = new int[16];

	@OriginalMember(owner = "client!rh", name = "bb", descriptor = "Lclient!fg;")
	private final Class68 aClass68_1 = new Class68();

	@OriginalMember(owner = "client!rh", name = "Lb", descriptor = "Lclient!ve;")
	private final Class1_Sub31_Sub4 aClass1_Sub31_Sub4_1 = new Class1_Sub31_Sub4(this);

	@OriginalMember(owner = "client!rh", name = "db", descriptor = "Lclient!vk;")
	private final Class207 aClass207_32 = new Class207(128);

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class1_Sub31_Sub3() {
		this.method4734();
		this.method4704(true);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!dd;)I")
	private int method4696(@OriginalArg(1) Class1_Sub10 arg0) {
		if (this.anIntArray523[arg0.anInt1249] == 0) {
			return 0;
		}
		@Pc(14) Class208 local14 = arg0.aClass208_1;
		@Pc(38) int local38 = this.anIntArray515[arg0.anInt1249] * this.anIntArray519[arg0.anInt1249] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt1238 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt5386 + 128 >> 8;
		local38 = this.anIntArray523[arg0.anInt1249] * local64 + 128 >> 8;
		if (local14.anInt6469 > 0) {
			local38 = (int) (Math.pow(0.5D, (double) local14.anInt6469 * 1.953125E-5D * (double) arg0.anInt1252) * (double) local38 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local14.aByteArray74 != null) {
			local106 = arg0.anInt1243;
			local114 = local14.aByteArray74[arg0.anInt1241 + 1];
			if (arg0.anInt1241 < local14.aByteArray74.length - 2) {
				local136 = (local14.aByteArray74[arg0.anInt1241] & 0xFF) << 8;
				local148 = (local14.aByteArray74[arg0.anInt1241 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local14.aByteArray74[arg0.anInt1241 + 3]) / (local148 - local136);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		if (arg0.anInt1242 > 0 && local14.aByteArray73 != null) {
			local106 = arg0.anInt1242;
			local114 = local14.aByteArray73[arg0.anInt1237 + 1];
			if (local14.aByteArray73.length - 2 > arg0.anInt1237) {
				local136 = (local14.aByteArray73[arg0.anInt1237] & 0xFF) << 8;
				local148 = (local14.aByteArray73[arg0.anInt1237 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (local14.aByteArray73[arg0.anInt1237 - -3] + -local114) / (local148 - local136);
			}
			local38 = local114 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BIII)V")
	private void method4697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4730(arg0, arg2, 64);
		if ((this.anIntArray524[arg0] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub10 local28 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method303(); local28 != null; local28 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method312()) {
				if (local28.anInt1249 == arg0 && local28.anInt1242 < 0) {
					this.aClass1_Sub10ArrayArray2[arg0][local28.anInt1255] = null;
					this.aClass1_Sub10ArrayArray2[arg0][arg2] = local28;
					@Pc(63) int local63 = (local28.anInt1257 * local28.anInt1244 >> 12) + local28.anInt1239;
					local28.anInt1239 += arg2 - local28.anInt1255 << 8;
					local28.anInt1255 = arg2;
					local28.anInt1244 = 4096;
					local28.anInt1257 = local63 - local28.anInt1239;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub33 local108 = (Class1_Sub33) this.aClass207_32.method5555((long) this.anIntArray518[arg0]);
		if (local108 == null) {
			return;
		}
		@Pc(120) Class1_Sub20_Sub1 local120 = local108.aClass1_Sub20_Sub1Array1[arg2];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class1_Sub10 local127 = new Class1_Sub10();
		local127.aClass1_Sub20_Sub1_1 = local120;
		local127.aClass1_Sub33_1 = local108;
		local127.anInt1249 = arg0;
		local127.aClass208_1 = local108.aClass208Array1[arg2];
		local127.anInt1251 = local108.aByteArray54[arg2];
		local127.anInt1255 = arg2;
		local127.anInt1238 = local108.aByteArray52[arg2] * local108.anInt4640 * arg1 * arg1 + 1024 >> 11;
		local127.anInt1240 = local108.aByteArray53[arg2] & 0xFF;
		local127.anInt1239 = (arg2 << 8) - (local108.aShortArray60[arg2] & 0x7FFF);
		local127.anInt1237 = 0;
		local127.anInt1242 = -1;
		local127.anInt1252 = 0;
		local127.anInt1241 = 0;
		local127.anInt1243 = 0;
		if (this.anIntArray520[arg0] == 0) {
			local127.aClass1_Sub31_Sub1_1 = Static366.method3921(local120, this.method4718(local127), this.method4696(local127), this.method4709(local127));
		} else {
			local127.aClass1_Sub31_Sub1_1 = Static366.method3921(local120, this.method4718(local127), 0, this.method4709(local127));
			this.method4714(local127, local108.aShortArray60[arg2] < 0);
		}
		if (local108.aShortArray60[arg2] < 0) {
			local127.aClass1_Sub31_Sub1_1.method3919(-1);
		}
		if (local127.anInt1251 >= 0) {
			@Pc(272) Class1_Sub10 local272 = this.aClass1_Sub10ArrayArray1[arg0][local127.anInt1251];
			if (local272 != null && local272.anInt1242 < 0) {
				this.aClass1_Sub10ArrayArray2[arg0][local272.anInt1255] = null;
				local272.anInt1242 = 0;
			}
			this.aClass1_Sub10ArrayArray1[arg0][local127.anInt1251] = local127;
		}
		this.aClass1_Sub31_Sub4_1.aClass14_34.method300(local127);
		this.aClass1_Sub10ArrayArray2[arg0][arg2] = local127;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "()Lclient!pl;")
	@Override
	public synchronized Class1_Sub31 method5513() {
		return null;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method5514(@OriginalArg(0) int arg0) {
		if (this.aClass68_1.method1336()) {
			@Pc(18) int local18 = this.anInt5356 * this.aClass68_1.anInt1602 / Static348.anInt6162;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong163;
				if (this.aLong164 - local27 >= 0L) {
					this.aLong163 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong164 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local56 * (long) local18;
				this.aClass1_Sub31_Sub4_1.method5514(local56);
				arg0 -= local56;
				this.method4727();
			} while (this.aClass68_1.method1336());
		}
		this.aClass1_Sub31_Sub4_1.method5514(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(B)V")
	public synchronized void method4699() {
		for (@Pc(19) Class1_Sub33 local19 = (Class1_Sub33) this.aClass207_32.method5560(); local19 != null; local19 = (Class1_Sub33) this.aClass207_32.method5559()) {
			local19.method4035();
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
	private void method4700(@OriginalArg(1) int arg0) {
		if ((this.anIntArray524[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub10 local22 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method302(); local22 != null; local22 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method313()) {
			if (arg0 == local22.anInt1249 && this.aClass1_Sub10ArrayArray2[arg0][local22.anInt1255] == null && local22.anInt1242 < 0) {
				local22.anInt1242 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZI)V")
	private void method4701(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4701(local12);
			}
			return;
		}
		this.anIntArray515[arg0] = 12800;
		this.anIntArray521[arg0] = 8192;
		this.anIntArray519[arg0] = 16383;
		this.anIntArray525[arg0] = 8192;
		this.anIntArray517[arg0] = 0;
		this.anIntArray526[arg0] = 8192;
		this.method4700(arg0);
		this.method4720(arg0);
		this.anIntArray524[arg0] = 0;
		this.anIntArray527[arg0] = 32767;
		this.anIntArray513[arg0] = 256;
		this.anIntArray520[arg0] = 0;
		this.method4708(8192, arg0);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BZ)V")
	private void method4704(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method4706(-1);
		} else {
			this.method4725(-1);
		}
		this.method4701(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray518[local31] = this.anIntArray514[local31];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray522[local49] = this.anIntArray514[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	private void method4705() {
		this.anIntArray514[9] = 128;
		this.anIntArray522[9] = 128;
		this.method4716(128, 9);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
	private void method4706(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method302(); local12 != null; local12 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method313()) {
			if (arg0 < 0 || local12.anInt1249 == arg0) {
				if (local12.aClass1_Sub31_Sub1_1 != null) {
					local12.aClass1_Sub31_Sub1_1.method3886(Static348.anInt6162 / 100);
					if (local12.aClass1_Sub31_Sub1_1.method3890()) {
						this.aClass1_Sub31_Sub4_1.aClass1_Sub31_Sub2_2.method4448(local12.aClass1_Sub31_Sub1_1);
					}
					local12.method1013();
				}
				if (local12.anInt1242 < 0) {
					this.aClass1_Sub10ArrayArray2[local12.anInt1249][local12.anInt1255] = null;
				}
				local12.method5796();
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZLclient!o;)V")
	public synchronized void method4707(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub30 arg1) {
		this.method4733(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII)V")
	private void method4708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray516[arg1] = arg0;
		this.anIntArray512[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dd;Z)I")
	private int method4709(@OriginalArg(0) Class1_Sub10 arg0) {
		@Pc(15) int local15 = this.anIntArray521[arg0.anInt1249];
		return local15 < 8192 ? arg0.anInt1240 * local15 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt1240 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
	private void method4710(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4730(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method4697(local16, local28, local22);
			} else {
				this.method4730(local16, local22, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4722(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray522[local16] = (this.anIntArray522[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray522[local16] = (this.anIntArray522[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray517[local16] = (this.anIntArray517[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray517[local16] = local28 + (this.anIntArray517[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray515[local16] = (this.anIntArray515[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray515[local16] = local28 + (this.anIntArray515[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray521[local16] = (local28 << 7) + (this.anIntArray521[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray521[local16] = local28 + (this.anIntArray521[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray519[local16] = (local28 << 7) + (this.anIntArray519[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray519[local16] = local28 + (this.anIntArray519[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray524[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray524[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray524[local16] |= 0x2;
				} else {
					this.method4700(local16);
					this.anIntArray524[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray527[local16] = (local28 << 7) + (this.anIntArray527[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray527[local16] = local28 + (this.anIntArray527[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray527[local16] = (local28 << 7) + (this.anIntArray527[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray527[local16] = local28 + (this.anIntArray527[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method4706(local16);
			}
			if (local22 == 121) {
				this.method4701(local16);
			}
			if (local22 == 123) {
				this.method4725(local16);
			}
			@Pc(500) int local500;
			if (local22 == 6) {
				local500 = this.anIntArray527[local16];
				if (local500 == 16384) {
					this.anIntArray513[local16] = (local28 << 7) + (this.anIntArray513[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local500 = this.anIntArray527[local16];
				if (local500 == 16384) {
					this.anIntArray513[local16] = (this.anIntArray513[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray520[local16] = (local28 << 7) + (this.anIntArray520[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray520[local16] = (this.anIntArray520[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method4720(local16);
					this.anIntArray524[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray524[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method4708((this.anIntArray516[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method4708(local28 + (this.anIntArray516[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4716(local28 + this.anIntArray522[local22], local22);
		} else if (local9 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method4732(local22, local28);
		} else if (local9 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4712(local28, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4704(true);
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(I)Z")
	public synchronized boolean method4711() {
		return this.aClass68_1.method1336();
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)V")
	private void method4712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray525[arg1] = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILclient!dd;Z)V")
	public void method4714(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass1_Sub20_Sub1_1.aByteArray23.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass1_Sub20_Sub1_1.aBoolean206) {
			@Pc(47) int local47 = local16 + local16 - arg0.aClass1_Sub20_Sub1_1.anInt2541;
			local35 = (int) ((long) this.anIntArray520[arg0.anInt1249] * (long) local47 >> 6);
			local16 <<= 0x8;
			if (local35 >= local16) {
				local35 = local16 + local16 - local35 - 1;
				arg0.aClass1_Sub31_Sub1_1.method3898();
			}
		} else {
			local35 = (int) ((long) local16 * (long) this.anIntArray520[arg0.anInt1249] >> 6);
		}
		arg0.aClass1_Sub31_Sub1_1.method3902(local35);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLclient!dd;)Z")
	public boolean method4715(@OriginalArg(1) Class1_Sub10 arg0) {
		if (arg0.aClass1_Sub31_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt1242 >= 0) {
			arg0.method5796();
			if (arg0.anInt1251 > 0 && this.aClass1_Sub10ArrayArray1[arg0.anInt1249][arg0.anInt1251] == arg0) {
				this.aClass1_Sub10ArrayArray1[arg0.anInt1249][arg0.anInt1251] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "(III)V")
	private void method4716(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray518[arg1]) {
			this.anIntArray518[arg1] = arg0;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass1_Sub10ArrayArray1[arg1][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "()I")
	@Override
	public synchronized int method5518() {
		return 0;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!cp;Lclient!o;IBLclient!lm;)Z")
	public synchronized boolean method4717(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class1_Sub30 arg1, @OriginalArg(4) Class134 arg2) {
		arg1.method3773();
		@Pc(16) boolean local16 = true;
		@Pc(30) int[] local30 = new int[] { 22050 };
		for (@Pc(36) Class1_Sub6 local36 = (Class1_Sub6) arg1.aClass207_29.method5560(); local36 != null; local36 = (Class1_Sub6) arg1.aClass207_29.method5559()) {
			@Pc(42) int local42 = (int) local36.aLong214;
			@Pc(50) Class1_Sub33 local50 = (Class1_Sub33) this.aClass207_32.method5555((long) local42);
			if (local50 == null) {
				local50 = Static215.method3991(local42, arg2);
				if (local50 == null) {
					local16 = false;
					continue;
				}
				this.aClass207_32.method5552(local50, (long) local42);
			}
			if (!local50.method4034(local36.aByteArray2, arg0, local30)) {
				local16 = false;
			}
		}
		if (local16) {
			arg1.method3774();
		}
		return local16;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!dd;I)I")
	private int method4718(@OriginalArg(0) Class1_Sub10 arg0) {
		@Pc(15) int local15 = arg0.anInt1239 + (arg0.anInt1244 * arg0.anInt1257 >> 12);
		local15 += this.anIntArray513[arg0.anInt1249] * (this.anIntArray525[arg0.anInt1249] - 8192) >> 12;
		@Pc(36) Class208 local36 = arg0.aClass208_1;
		@Pc(53) int local53;
		if (local36.anInt6467 > 0 && (local36.anInt6468 > 0 || this.anIntArray517[arg0.anInt1249] > 0)) {
			local53 = local36.anInt6468 << 2;
			@Pc(58) int local58 = local36.anInt6471 << 1;
			if (local58 > arg0.anInt1247) {
				local53 = local53 * arg0.anInt1247 / local58;
			}
			local53 += this.anIntArray517[arg0.anInt1249] >> 7;
			@Pc(88) double local88 = Math.sin((double) (arg0.anInt1245 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local53 * local88);
		}
		local53 = (int) ((double) (arg0.aClass1_Sub20_Sub1_1.anInt2542 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static348.anInt6162 + 0.5D);
		return local53 < 1 ? 1 : local53;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
	public synchronized void method4719(@OriginalArg(0) int arg0) {
		this.anInt5386 = arg0;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V")
	private void method4720(@OriginalArg(1) int arg0) {
		if ((this.anIntArray524[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method302(); local18 != null; local18 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method313()) {
			if (arg0 == local18.anInt1249) {
				local18.anInt1248 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5516(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass68_1.method1336()) {
			@Pc(18) int local18 = this.aClass68_1.anInt1602 * this.anInt5356 / Static348.anInt6162;
			do {
				@Pc(28) long local28 = this.aLong163 + (long) arg2 * (long) local18;
				if (this.aLong164 - local28 >= 0L) {
					this.aLong163 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong164 + (long) local18 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local58 * (long) local18;
				this.aClass1_Sub31_Sub4_1.method5516(arg0, arg1, local58);
				arg2 -= local58;
				this.method4727();
				arg1 += local58;
			} while (this.aClass68_1.method1336());
		}
		this.aClass1_Sub31_Sub4_1.method5516(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)V")
	private void method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)V")
	private void method4725(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class1_Sub10 local18 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method302(); local18 != null; local18 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method313()) {
			if ((arg0 < 0 || arg0 == local18.anInt1249) && local18.anInt1242 < 0) {
				this.aClass1_Sub10ArrayArray2[local18.anInt1249][local18.anInt1255] = null;
				local18.anInt1242 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "()Lclient!pl;")
	@Override
	public synchronized Class1_Sub31 method5517() {
		return this.aClass1_Sub31_Sub4_1;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(BZ)V")
	private synchronized void method4726(@OriginalArg(1) boolean arg0) {
		this.aClass68_1.method1331();
		this.aClass1_Sub30_2 = null;
		this.method4704(arg0);
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(I)V")
	private void method4727() {
		@Pc(8) int local8 = this.anInt5403;
		@Pc(11) int local11 = this.anInt5404;
		@Pc(14) long local14 = this.aLong164;
		if (this.aClass1_Sub30_2 != null && this.anInt5405 == local11) {
			this.method4733(this.aBoolean447, this.aBoolean448, this.aClass1_Sub30_2);
			this.method4727();
			return;
		}
		while (local11 == this.anInt5404) {
			while (this.aClass68_1.anIntArray123[local8] == local11) {
				this.aClass68_1.method1329(local8);
				@Pc(47) int local47 = this.aClass68_1.method1325(local8);
				if (local47 == 1) {
					this.aClass68_1.method1334();
					this.aClass68_1.method1327(local8);
					if (this.aClass68_1.method1339()) {
						if (this.aClass1_Sub30_2 != null) {
							this.method4707(this.aBoolean447, this.aClass1_Sub30_2);
							this.method4727();
							return;
						}
						if (!this.aBoolean447 || local11 == 0) {
							this.method4704(true);
							this.aClass68_1.method1331();
							return;
						}
						this.aClass68_1.method1338(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4710(local47);
				}
				this.aClass68_1.method1326(local8);
				this.aClass68_1.method1327(local8);
			}
			local8 = this.aClass68_1.method1328();
			local11 = this.aClass68_1.anIntArray123[local8];
			local14 = this.aClass68_1.method1330(local11);
		}
		this.anInt5404 = local11;
		this.anInt5403 = local8;
		this.aLong164 = local14;
		if (this.aClass1_Sub30_2 != null && local11 > this.anInt5405) {
			this.anInt5403 = -1;
			this.anInt5404 = this.anInt5405;
			this.aLong164 = this.aClass68_1.method1330(this.anInt5404);
		}
	}

	@OriginalMember(owner = "client!rh", name = "f", descriptor = "(I)I")
	public int method4728() {
		return this.anInt5386;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII[ILclient!dd;)Z")
	public boolean method4729(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub10 arg3) {
		arg3.anInt1250 = Static348.anInt6162 / 100;
		if (arg3.anInt1242 >= 0 && (arg3.aClass1_Sub31_Sub1_1 == null || arg3.aClass1_Sub31_Sub1_1.method3908())) {
			arg3.method1013();
			arg3.method5796();
			if (arg3.anInt1251 > 0 && this.aClass1_Sub10ArrayArray1[arg3.anInt1249][arg3.anInt1251] == arg3) {
				this.aClass1_Sub10ArrayArray1[arg3.anInt1249][arg3.anInt1251] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt1244;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray526[arg3.anInt1249] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt1244 = local53;
		}
		arg3.aClass1_Sub31_Sub1_1.method3911(this.method4718(arg3));
		@Pc(102) Class208 local102 = arg3.aClass208_1;
		arg3.anInt1245 += local102.anInt6467;
		arg3.anInt1247++;
		@Pc(117) boolean local117 = false;
		@Pc(135) double local135 = (double) ((arg3.anInt1257 * arg3.anInt1244 >> 12) + (arg3.anInt1255 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt6469 > 0) {
			if (local102.anInt6465 > 0) {
				arg3.anInt1252 += (int) (Math.pow(2.0D, local135 * (double) local102.anInt6465) * 128.0D + 0.5D);
			} else {
				arg3.anInt1252 += 128;
			}
			if (arg3.anInt1252 * local102.anInt6469 >= 819200) {
				local117 = true;
			}
		}
		if (local102.aByteArray74 != null) {
			if (local102.anInt6472 <= 0) {
				arg3.anInt1243 += 128;
			} else {
				arg3.anInt1243 += (int) (Math.pow(2.0D, (double) local102.anInt6472 * local135) * 128.0D + 0.5D);
			}
			while (local102.aByteArray74.length - 2 > arg3.anInt1241 && arg3.anInt1243 > (local102.aByteArray74[arg3.anInt1241 + 2] & 0xFF) << 8) {
				arg3.anInt1241 += 2;
			}
			if (arg3.anInt1241 == local102.aByteArray74.length - 2 && local102.aByteArray74[arg3.anInt1241 + 1] == 0) {
				local117 = true;
			}
		}
		if (arg3.anInt1242 >= 0 && local102.aByteArray73 != null && (this.anIntArray524[arg3.anInt1249] & 0x1) == 0 && (arg3.anInt1251 < 0 || arg3 != this.aClass1_Sub10ArrayArray1[arg3.anInt1249][arg3.anInt1251])) {
			if (local102.anInt6466 <= 0) {
				arg3.anInt1242 += 128;
			} else {
				arg3.anInt1242 += (int) (Math.pow(2.0D, (double) local102.anInt6466 * local135) * 128.0D + 0.5D);
			}
			while (local102.aByteArray73.length - 2 > arg3.anInt1237 && (local102.aByteArray73[arg3.anInt1237 + 2] & 0xFF) << 8 < arg3.anInt1242) {
				arg3.anInt1237 += 2;
			}
			if (arg3.anInt1237 == local102.aByteArray73.length - 2) {
				local117 = true;
			}
		}
		if (!local117) {
			arg3.aClass1_Sub31_Sub1_1.method3894(arg3.anInt1250, this.method4696(arg3), this.method4709(arg3));
			return false;
		}
		arg3.aClass1_Sub31_Sub1_1.method3886(arg3.anInt1250);
		if (arg2 == null) {
			arg3.aClass1_Sub31_Sub1_1.method5514(arg1);
		} else {
			arg3.aClass1_Sub31_Sub1_1.method5516(arg2, arg0, arg1);
		}
		if (arg3.aClass1_Sub31_Sub1_1.method3890()) {
			this.aClass1_Sub31_Sub4_1.aClass1_Sub31_Sub2_2.method4448(arg3.aClass1_Sub31_Sub1_1);
		}
		arg3.method1013();
		if (arg3.anInt1242 >= 0) {
			arg3.method5796();
			if (arg3.anInt1251 > 0 && this.aClass1_Sub10ArrayArray1[arg3.anInt1249][arg3.anInt1251] == arg3) {
				this.aClass1_Sub10ArrayArray1[arg3.anInt1249][arg3.anInt1251] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)V")
	private void method4730(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub10 local12 = this.aClass1_Sub10ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub10ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray524[arg0] & 0x2) == 0) {
			local12.anInt1242 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub10 local43 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method302(); local43 != null; local43 = (Class1_Sub10) this.aClass1_Sub31_Sub4_1.aClass14_34.method313()) {
			if (local43.anInt1249 == local12.anInt1249 && local43.anInt1242 < 0 && local12 != local43) {
				local12.anInt1242 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "g", descriptor = "(I)V")
	public synchronized void method4731() {
		this.method4726(true);
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(III)V")
	private void method4732(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZIZLclient!o;)V")
	private synchronized void method4733(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub30 arg2) {
		this.method4726(arg1);
		this.aClass68_1.method1335(arg2.aByteArray50);
		this.aBoolean447 = arg0;
		this.aLong163 = 0L;
		@Pc(24) int local24 = this.aClass68_1.method1333();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass68_1.method1329(local34);
			this.aClass68_1.method1326(local34);
			this.aClass68_1.method1327(local34);
		}
		this.anInt5403 = this.aClass68_1.method1328();
		this.anInt5404 = this.aClass68_1.anIntArray123[this.anInt5403];
		this.aLong164 = this.aClass68_1.method1330(this.anInt5404);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZI)V")
	private synchronized void method4734() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray523[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!rh", name = "d", descriptor = "(B)V")
	public synchronized void method4735() {
		for (@Pc(11) Class1_Sub33 local11 = (Class1_Sub33) this.aClass207_32.method5560(); local11 != null; local11 = (Class1_Sub33) this.aClass207_32.method5559()) {
			local11.method5796();
		}
	}

	@OriginalMember(owner = "client!rh", name = "e", descriptor = "(III)V")
	public synchronized void method4736() {
		this.method4705();
	}
}
