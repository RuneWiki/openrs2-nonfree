import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class2_Sub3_Sub4 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qu", name = "Ib", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!qu", name = "Jb", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!qu", name = "Kb", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!qu", name = "Mb", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!qu", name = "Nb", descriptor = "J")
	private long aLong163;

	@OriginalMember(owner = "client!qu", name = "Ob", descriptor = "I")
	private int anInt5773;

	@OriginalMember(owner = "client!qu", name = "Pb", descriptor = "Z")
	private boolean aBoolean408;

	@OriginalMember(owner = "client!qu", name = "Qb", descriptor = "Lclient!ne;")
	private Class2_Sub27 aClass2_Sub27_2;

	@OriginalMember(owner = "client!qu", name = "u", descriptor = "I")
	private int anInt5729 = 256;

	@OriginalMember(owner = "client!qu", name = "o", descriptor = "[I")
	private final int[] anIntArray479 = new int[16];

	@OriginalMember(owner = "client!qu", name = "v", descriptor = "[I")
	private final int[] anIntArray480 = new int[16];

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "[I")
	private final int[] anIntArray482 = new int[16];

	@OriginalMember(owner = "client!qu", name = "G", descriptor = "[I")
	private final int[] anIntArray485 = new int[16];

	@OriginalMember(owner = "client!qu", name = "K", descriptor = "[I")
	private final int[] anIntArray487 = new int[16];

	@OriginalMember(owner = "client!qu", name = "db", descriptor = "I")
	private final int anInt5752 = 1000000;

	@OriginalMember(owner = "client!qu", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!qu", name = "eb", descriptor = "[I")
	private final int[] anIntArray489 = new int[16];

	@OriginalMember(owner = "client!qu", name = "pb", descriptor = "[I")
	private final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!qu", name = "H", descriptor = "[I")
	public final int[] anIntArray486 = new int[16];

	@OriginalMember(owner = "client!qu", name = "tb", descriptor = "[I")
	private final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!qu", name = "y", descriptor = "[I")
	public final int[] anIntArray483 = new int[16];

	@OriginalMember(owner = "client!qu", name = "jb", descriptor = "[[Lclient!ps;")
	private final Class2_Sub34[][] aClass2_Sub34ArrayArray1 = new Class2_Sub34[16][128];

	@OriginalMember(owner = "client!qu", name = "gb", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "[I")
	private final int[] anIntArray481 = new int[16];

	@OriginalMember(owner = "client!qu", name = "A", descriptor = "[I")
	public final int[] anIntArray484 = new int[16];

	@OriginalMember(owner = "client!qu", name = "zb", descriptor = "[I")
	private final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!qu", name = "Ab", descriptor = "[[Lclient!ps;")
	private final Class2_Sub34[][] aClass2_Sub34ArrayArray2 = new Class2_Sub34[16][128];

	@OriginalMember(owner = "client!qu", name = "bb", descriptor = "[I")
	private final int[] anIntArray488 = new int[16];

	@OriginalMember(owner = "client!qu", name = "B", descriptor = "Lclient!ua;")
	private final Class238 aClass238_1 = new Class238();

	@OriginalMember(owner = "client!qu", name = "Lb", descriptor = "Lclient!gr;")
	private final Class2_Sub3_Sub2 aClass2_Sub3_Sub2_1 = new Class2_Sub3_Sub2(this);

	@OriginalMember(owner = "client!qu", name = "R", descriptor = "Lclient!mn;")
	private final Class163 aClass163_37 = new Class163(128);

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub4() {
		this.method4636();
		this.method4621(true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZZLclient!ne;)V")
	private synchronized void method4620(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub27 arg2) {
		this.method4629(arg1);
		this.aClass238_1.method5201(arg2.aByteArray99);
		this.aLong163 = 0L;
		this.aBoolean407 = arg0;
		@Pc(29) int local29 = this.aClass238_1.method5195();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass238_1.method5203(local31);
			this.aClass238_1.method5197(local31);
			this.aClass238_1.method5196(local31);
		}
		this.anInt5772 = this.aClass238_1.method5191();
		this.anInt5771 = this.aClass238_1.anIntArray556[this.anInt5772];
		this.aLong162 = this.aClass238_1.method5189(this.anInt5771);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZZ)V")
	private void method4621(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4633(-1);
		} else {
			this.method4640(-1);
		}
		this.method4635(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray479[local23] = this.anIntArray485[local23];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray488[local47] = this.anIntArray485[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)V")
	private void method4622(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local9 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method4631(local20, local32, local26);
		} else if (local9 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 > 0) {
				this.method4647(local32, local26, local20);
			} else {
				this.method4631(local20, 64, local26);
			}
		} else if (local9 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method4627(local26, local32, local20);
		} else if (local9 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray488[local20] = (this.anIntArray488[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray488[local20] = (this.anIntArray488[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray490[local20] = (this.anIntArray490[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray490[local20] = (this.anIntArray490[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 5) {
				this.anIntArray480[local20] = (local32 << 7) + (this.anIntArray480[local20] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray480[local20] = (this.anIntArray480[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 7) {
				this.anIntArray482[local20] = (local32 << 7) + (this.anIntArray482[local20] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray482[local20] = (this.anIntArray482[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 10) {
				this.anIntArray489[local20] = (local32 << 7) + (this.anIntArray489[local20] & 0xFFFFC07F);
			}
			if (local26 == 42) {
				this.anIntArray489[local20] = (this.anIntArray489[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 11) {
				this.anIntArray492[local20] = (this.anIntArray492[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 43) {
				this.anIntArray492[local20] = (this.anIntArray492[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 64) {
				if (local32 < 64) {
					this.anIntArray484[local20] &= 0xFFFFFFFE;
				} else {
					this.anIntArray484[local20] |= 0x1;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray484[local20] |= 0x2;
				} else {
					this.method4643(local20);
					this.anIntArray484[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray493[local20] = (local32 << 7) + (this.anIntArray493[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray493[local20] = local32 + (this.anIntArray493[local20] & 0x3F80);
			}
			if (local26 == 101) {
				this.anIntArray493[local20] = (local32 << 7) + (this.anIntArray493[local20] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray493[local20] = (this.anIntArray493[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method4633(local20);
			}
			if (local26 == 121) {
				this.method4635(local20);
			}
			if (local26 == 123) {
				this.method4640(local20);
			}
			@Pc(506) int local506;
			if (local26 == 6) {
				local506 = this.anIntArray493[local20];
				if (local506 == 16384) {
					this.anIntArray487[local20] = (local32 << 7) + (this.anIntArray487[local20] & 0xFFFFC07F);
				}
			}
			if (local26 == 38) {
				local506 = this.anIntArray493[local20];
				if (local506 == 16384) {
					this.anIntArray487[local20] = (this.anIntArray487[local20] & 0xFFFFFF80) + local32;
				}
			}
			if (local26 == 16) {
				this.anIntArray486[local20] = (this.anIntArray486[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray486[local20] = local32 + (this.anIntArray486[local20] & 0xFFFFFF80);
			}
			if (local26 == 81) {
				if (local32 < 64) {
					this.method4625(local20);
					this.anIntArray484[local20] &= 0xFFFFFFFB;
				} else {
					this.anIntArray484[local20] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method4651((local32 << 7) + (this.anIntArray481[local20] & 0xFFFFC07F), local20);
			}
			if (local26 == 49) {
				this.method4651(local32 + (this.anIntArray481[local20] & 0xFFFFFF80), local20);
			}
		} else if (local9 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method4656(local20, this.anIntArray488[local20] + local26);
		} else if (local9 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method4657(local20, local26);
		} else if (local9 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00A7) >> 9);
			this.method4642(local20, local26);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4621(true);
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(I)V")
	public synchronized void method4623() {
		for (@Pc(11) Class2_Sub12 local11 = (Class2_Sub12) this.aClass163_37.method3771(); local11 != null; local11 = (Class2_Sub12) this.aClass163_37.method3770()) {
			local11.method1471();
		}
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "()Lclient!ad;")
	@Override
	public synchronized Class2_Sub3 method4618() {
		return null;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)V")
	private void method4625(@OriginalArg(1) int arg0) {
		if ((this.anIntArray484[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class2_Sub34 local19 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method309(); local19 != null; local19 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method311()) {
			if (local19.anInt5496 == arg0) {
				local19.anInt5500 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass238_1.method5200()) {
			@Pc(18) int local18 = this.aClass238_1.anInt6564 * this.anInt5752 / Static410.anInt6842;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong163;
				if (this.aLong162 - local27 >= 0L) {
					this.aLong163 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong162 - this.aLong163 - 1L) / (long) local18);
				this.aLong163 += (long) local18 * (long) local56;
				this.aClass2_Sub3_Sub2_1.method4619(arg0, arg1, local56);
				arg1 += local56;
				arg2 -= local56;
				this.method4638();
			} while (this.aClass238_1.method5200());
		}
		this.aClass2_Sub3_Sub2_1.method4619(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(I)V")
	public synchronized void method4626() {
		this.method4629(true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IBII)V")
	private void method4627(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "(I)Z")
	public synchronized boolean method4628() {
		return this.aClass238_1.method5200();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)V")
	private synchronized void method4629(@OriginalArg(0) boolean arg0) {
		this.aClass238_1.method5194();
		this.aClass2_Sub27_2 = null;
		this.method4621(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ne;ZI)V")
	public synchronized void method4630(@OriginalArg(0) Class2_Sub27 arg0, @OriginalArg(1) boolean arg1) {
		this.method4620(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIII)V")
	private void method4631(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub34 local12 = this.aClass2_Sub34ArrayArray1[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub34ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray484[arg0] & 0x2) == 0) {
			local12.anInt5499 = 0;
			return;
		}
		for (@Pc(41) Class2_Sub34 local41 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method309(); local41 != null; local41 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method311()) {
			if (local12.anInt5496 == local41.anInt5496 && local41.anInt5499 < 0 && local12 != local41) {
				local12.anInt5499 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ps;I)I")
	private int method4632(@OriginalArg(0) Class2_Sub34 arg0) {
		@Pc(14) int local14 = (arg0.anInt5492 * arg0.anInt5507 >> 12) + arg0.anInt5493;
		local14 += (this.lb[arg0.anInt5496] - 8192) * this.anIntArray487[arg0.anInt5496] >> 12;
		@Pc(35) Class139 local35 = arg0.aClass139_1;
		@Pc(58) int local58;
		if (local35.anInt3809 > 0 && (local35.anInt3817 > 0 || this.anIntArray490[arg0.anInt5496] > 0)) {
			local58 = local35.anInt3817 << 2;
			@Pc(63) int local63 = local35.anInt3814 << 1;
			if (arg0.anInt5503 < local63) {
				local58 = arg0.anInt5503 * local58 / local63;
			}
			local58 += this.anIntArray490[arg0.anInt5496] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt5498 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local93 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub10_Sub1_1.anInt849 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static410.anInt6842 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)V")
	private void method4633(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub34 local18 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method309(); local18 != null; local18 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method311()) {
			if (arg0 < 0 || local18.anInt5496 == arg0) {
				if (local18.aClass2_Sub3_Sub3_3 != null) {
					local18.aClass2_Sub3_Sub3_3.method2498(Static410.anInt6842 / 100);
					if (local18.aClass2_Sub3_Sub3_3.method2503()) {
						this.aClass2_Sub3_Sub2_1.aClass2_Sub3_Sub1_1.method1827(local18.aClass2_Sub3_Sub3_3);
					}
					local18.method4386();
				}
				if (local18.anInt5499 < 0) {
					this.aClass2_Sub34ArrayArray1[local18.anInt5496][local18.anInt5491] = null;
				}
				local18.method5866();
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "(I)V")
	public synchronized void method4634() {
		for (@Pc(13) Class2_Sub12 local13 = (Class2_Sub12) this.aClass163_37.method3771(); local13 != null; local13 = (Class2_Sub12) this.aClass163_37.method3770()) {
			local13.method5866();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IB)V")
	private void method4635(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4635(local12);
			}
			return;
		}
		this.anIntArray482[arg0] = 12800;
		this.anIntArray489[arg0] = 8192;
		this.anIntArray492[arg0] = 16383;
		this.lb[arg0] = 8192;
		this.anIntArray490[arg0] = 0;
		this.anIntArray480[arg0] = 8192;
		this.method4643(arg0);
		this.method4625(arg0);
		this.anIntArray484[arg0] = 0;
		this.anIntArray493[arg0] = 32767;
		this.anIntArray487[arg0] = 256;
		this.anIntArray486[arg0] = 0;
		this.method4651(8192, arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	private synchronized void method4636() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray491[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!ps;)I")
	private int method4637(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(15) int local15 = this.anIntArray489[arg0.anInt5496];
		return local15 < 8192 ? local15 * arg0.anInt5510 + 32 >> 6 : 16384 - ((128 - arg0.anInt5510) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!qu", name = "h", descriptor = "(I)V")
	private void method4638() {
		@Pc(8) int local8 = this.anInt5772;
		@Pc(11) int local11 = this.anInt5771;
		@Pc(14) long local14 = this.aLong162;
		if (this.aClass2_Sub27_2 != null && this.anInt5773 == local11) {
			this.method4620(this.aBoolean407, this.aBoolean408, this.aClass2_Sub27_2);
			this.method4638();
			return;
		}
		while (this.anInt5771 == local11) {
			while (local11 == this.aClass238_1.anIntArray556[local8]) {
				this.aClass238_1.method5203(local8);
				@Pc(47) int local47 = this.aClass238_1.method5193(local8);
				if (local47 == 1) {
					this.aClass238_1.method5192();
					this.aClass238_1.method5196(local8);
					if (this.aClass238_1.method5198()) {
						if (this.aClass2_Sub27_2 != null) {
							this.method4630(this.aClass2_Sub27_2, this.aBoolean407);
							this.method4638();
							return;
						}
						if (!this.aBoolean407 || local11 == 0) {
							this.method4621(true);
							this.aClass238_1.method5194();
							return;
						}
						this.aClass238_1.method5202(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4622(local47);
				}
				this.aClass238_1.method5197(local8);
				this.aClass238_1.method5196(local8);
			}
			local8 = this.aClass238_1.method5191();
			local11 = this.aClass238_1.anIntArray556[local8];
			local14 = this.aClass238_1.method5189(local11);
		}
		this.aLong162 = local14;
		this.anInt5771 = local11;
		this.anInt5772 = local8;
		if (this.aClass2_Sub27_2 != null && this.anInt5773 < local11) {
			this.anInt5772 = -1;
			this.anInt5771 = this.anInt5773;
			this.aLong162 = this.aClass238_1.method5189(this.anInt5771);
		}
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(Lclient!ps;I)I")
	private int method4639(@OriginalArg(0) Class2_Sub34 arg0) {
		if (this.anIntArray491[arg0.anInt5496] == 0) {
			return 0;
		}
		@Pc(17) Class139 local17 = arg0.aClass139_1;
		@Pc(38) int local38 = this.anIntArray492[arg0.anInt5496] * this.anIntArray482[arg0.anInt5496] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt5505 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt5729 * local55 + 128 >> 8;
		local38 = this.anIntArray491[arg0.anInt5496] * local64 + 128 >> 8;
		if (local17.anInt3812 > 0) {
			local38 = (int) (Math.pow(0.5D, (double) local17.anInt3812 * (double) arg0.anInt5509 * 1.953125E-5D) * (double) local38 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local17.aByteArray73 != null) {
			local106 = arg0.anInt5494;
			local114 = local17.aByteArray73[arg0.anInt5501 + 1];
			if (arg0.anInt5501 < local17.aByteArray73.length - 2) {
				local132 = (local17.aByteArray73[arg0.anInt5501] & 0xFF) << 8;
				local144 = (local17.aByteArray73[arg0.anInt5501 + 2] & 0xFF) << 8;
				local114 += (local17.aByteArray73[arg0.anInt5501 + 3] - local114) * (-local132 + local106) / (local144 - local132);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		if (arg0.anInt5499 > 0 && local17.aByteArray72 != null) {
			local106 = arg0.anInt5499;
			local114 = local17.aByteArray72[arg0.anInt5504 + 1];
			if (arg0.anInt5504 < local17.aByteArray72.length - 2) {
				local132 = (local17.aByteArray72[arg0.anInt5504] & 0xFF) << 8;
				local144 = (local17.aByteArray72[arg0.anInt5504 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (-local114 + local17.aByteArray72[arg0.anInt5504 - -3]) / (local144 - local132);
			}
			local38 = local114 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "()I")
	@Override
	public synchronized int method4613() {
		return 0;
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(BI)V")
	private void method4640(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub34 local8 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method309(); local8 != null; local8 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method311()) {
			if ((arg0 < 0 || arg0 == local8.anInt5496) && local8.anInt5499 < 0) {
				this.aClass2_Sub34ArrayArray1[local8.anInt5496][local8.anInt5491] = null;
				local8.anInt5499 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "(I)I")
	public int method4641() {
		return this.anInt5729;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)V")
	private void method4642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.lb[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(II)V")
	private void method4643(@OriginalArg(0) int arg0) {
		if ((this.anIntArray484[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class2_Sub34 local26 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method309(); local26 != null; local26 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method311()) {
			if (local26.anInt5496 == arg0 && this.aClass2_Sub34ArrayArray1[arg0][local26.anInt5491] == null && local26.anInt5499 < 0) {
				local26.anInt5499 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IILclient!ps;I[I)Z")
	public boolean method4646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub34 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt5506 = Static410.anInt6842 / 100;
		if (arg2.anInt5499 >= 0 && (arg2.aClass2_Sub3_Sub3_3 == null || arg2.aClass2_Sub3_Sub3_3.method2501())) {
			arg2.method4386();
			arg2.method5866();
			if (arg2.anInt5502 > 0 && arg2 == this.aClass2_Sub34ArrayArray2[arg2.anInt5496][arg2.anInt5502]) {
				this.aClass2_Sub34ArrayArray2[arg2.anInt5496][arg2.anInt5502] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg2.anInt5492;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray480[arg2.anInt5496] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg2.anInt5492 = local58;
		}
		arg2.aClass2_Sub3_Sub3_3.method2486(this.method4632(arg2));
		@Pc(98) Class139 local98 = arg2.aClass139_1;
		arg2.anInt5503++;
		arg2.anInt5498 += local98.anInt3809;
		@Pc(113) boolean local113 = false;
		@Pc(131) double local131 = (double) ((arg2.anInt5507 * arg2.anInt5492 >> 12) + (arg2.anInt5491 - 60 << 8)) * 5.086263020833333E-6D;
		if (local98.anInt3812 > 0) {
			if (local98.anInt3813 <= 0) {
				arg2.anInt5509 += 128;
			} else {
				arg2.anInt5509 += (int) (Math.pow(2.0D, (double) local98.anInt3813 * local131) * 128.0D + 0.5D);
			}
			if (arg2.anInt5509 * local98.anInt3812 >= 819200) {
				local113 = true;
			}
		}
		if (local98.aByteArray73 != null) {
			if (local98.anInt3810 > 0) {
				arg2.anInt5494 += (int) (Math.pow(2.0D, local131 * (double) local98.anInt3810) * 128.0D + 0.5D);
			} else {
				arg2.anInt5494 += 128;
			}
			while (local98.aByteArray73.length - 2 > arg2.anInt5501 && arg2.anInt5494 > (local98.aByteArray73[arg2.anInt5501 + 2] & 0xFF) << 8) {
				arg2.anInt5501 += 2;
			}
			if (local98.aByteArray73.length - 2 == arg2.anInt5501 && local98.aByteArray73[arg2.anInt5501 + 1] == 0) {
				local113 = true;
			}
		}
		if (arg2.anInt5499 >= 0 && local98.aByteArray72 != null && (this.anIntArray484[arg2.anInt5496] & 0x1) == 0 && (arg2.anInt5502 < 0 || this.aClass2_Sub34ArrayArray2[arg2.anInt5496][arg2.anInt5502] != arg2)) {
			if (local98.anInt3811 <= 0) {
				arg2.anInt5499 += 128;
			} else {
				arg2.anInt5499 += (int) (Math.pow(2.0D, (double) local98.anInt3811 * local131) * 128.0D + 0.5D);
			}
			while (arg2.anInt5504 < local98.aByteArray72.length - 2 && (local98.aByteArray72[arg2.anInt5504 + 2] & 0xFF) << 8 < arg2.anInt5499) {
				arg2.anInt5504 += 2;
			}
			if (local98.aByteArray72.length - 2 == arg2.anInt5504) {
				local113 = true;
			}
		}
		if (!local113) {
			arg2.aClass2_Sub3_Sub3_3.method2494(arg2.anInt5506, this.method4639(arg2), this.method4637(arg2));
			return false;
		}
		arg2.aClass2_Sub3_Sub3_3.method2498(arg2.anInt5506);
		if (arg3 == null) {
			arg2.aClass2_Sub3_Sub3_3.method4616(arg0);
		} else {
			arg2.aClass2_Sub3_Sub3_3.method4619(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub3_Sub3_3.method2503()) {
			this.aClass2_Sub3_Sub2_1.aClass2_Sub3_Sub1_1.method1827(arg2.aClass2_Sub3_Sub3_3);
		}
		arg2.method4386();
		if (arg2.anInt5499 >= 0) {
			arg2.method5866();
			if (arg2.anInt5502 > 0 && this.aClass2_Sub34ArrayArray2[arg2.anInt5496][arg2.anInt5502] == arg2) {
				this.aClass2_Sub34ArrayArray2[arg2.anInt5496][arg2.anInt5502] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4616(@OriginalArg(0) int arg0) {
		if (this.aClass238_1.method5200()) {
			@Pc(14) int local14 = this.anInt5752 * this.aClass238_1.anInt6564 / Static410.anInt6842;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong163;
				if (this.aLong162 - local23 >= 0L) {
					this.aLong163 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong162 + (long) local14 - this.aLong163 - 1L) / (long) local14);
				this.aLong163 += (long) local14 * (long) local54;
				this.aClass2_Sub3_Sub2_1.method4616(local54);
				arg0 -= local54;
				this.method4638();
			} while (this.aClass238_1.method5200());
		}
		this.aClass2_Sub3_Sub2_1.method4616(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BIII)V")
	private void method4647(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4631(arg2, 64, arg1);
		if ((this.anIntArray484[arg2] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub34 local28 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method302(); local28 != null; local28 = (Class2_Sub34) this.aClass2_Sub3_Sub2_1.aClass14_26.method304()) {
				if (arg2 == local28.anInt5496 && local28.anInt5499 < 0) {
					this.aClass2_Sub34ArrayArray1[arg2][local28.anInt5491] = null;
					this.aClass2_Sub34ArrayArray1[arg2][arg1] = local28;
					@Pc(67) int local67 = local28.anInt5493 + (local28.anInt5492 * local28.anInt5507 >> 12);
					local28.anInt5493 += arg1 - local28.anInt5491 << 8;
					local28.anInt5492 = 4096;
					local28.anInt5507 = local67 - local28.anInt5493;
					local28.anInt5491 = arg1;
					return;
				}
			}
		}
		@Pc(111) Class2_Sub12 local111 = (Class2_Sub12) this.aClass163_37.method3769((long) this.anIntArray479[arg2]);
		if (local111 == null) {
			return;
		}
		@Pc(127) Class2_Sub10_Sub1 local127 = local111.aClass2_Sub10_Sub1Array1[arg1];
		if (local127 == null) {
			return;
		}
		@Pc(134) Class2_Sub34 local134 = new Class2_Sub34();
		local134.anInt5496 = arg2;
		local134.aClass2_Sub10_Sub1_1 = local127;
		local134.aClass2_Sub12_1 = local111;
		local134.aClass139_1 = local111.aClass139Array1[arg1];
		local134.anInt5502 = local111.aByteArray35[arg1];
		local134.anInt5491 = arg1;
		local134.anInt5505 = local111.aByteArray36[arg1] * arg0 * arg0 * local111.anInt1767 + 1024 >> 11;
		local134.anInt5510 = local111.aByteArray34[arg1] & 0xFF;
		local134.anInt5493 = (arg1 << 8) - (local111.aShortArray16[arg1] & 0x7FFF);
		local134.anInt5509 = 0;
		local134.anInt5499 = -1;
		local134.anInt5494 = 0;
		local134.anInt5504 = 0;
		local134.anInt5501 = 0;
		if (this.anIntArray486[arg2] == 0) {
			local134.aClass2_Sub3_Sub3_3 = Static460.method2502(local127, this.method4632(local134), this.method4639(local134), this.method4637(local134));
		} else {
			local134.aClass2_Sub3_Sub3_3 = Static460.method2502(local127, this.method4632(local134), 0, this.method4637(local134));
			this.method4649(local134, local111.aShortArray16[arg1] < 0);
		}
		if (local111.aShortArray16[arg1] < 0) {
			local134.aClass2_Sub3_Sub3_3.method2497(-1);
		}
		if (local134.anInt5502 >= 0) {
			@Pc(287) Class2_Sub34 local287 = this.aClass2_Sub34ArrayArray2[arg2][local134.anInt5502];
			if (local287 != null && local287.anInt5499 < 0) {
				this.aClass2_Sub34ArrayArray1[arg2][local287.anInt5491] = null;
				local287.anInt5499 = 0;
			}
			this.aClass2_Sub34ArrayArray2[arg2][local134.anInt5502] = local134;
		}
		this.aClass2_Sub3_Sub2_1.aClass14_26.method300(local134);
		this.aClass2_Sub34ArrayArray1[arg2][arg1] = local134;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZ)V")
	public synchronized void method4648(@OriginalArg(0) int arg0) {
		this.anInt5729 = arg0;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ps;ZZ)V")
	public void method4649(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) int local14 = arg0.aClass2_Sub10_Sub1_1.aByteArray23.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass2_Sub10_Sub1_1.aBoolean43) {
			@Pc(44) int local44 = local14 + local14 - arg0.aClass2_Sub10_Sub1_1.anInt848;
			local14 <<= 0x8;
			local33 = (int) ((long) this.anIntArray486[arg0.anInt5496] * (long) local44 >> 6);
			if (local14 <= local33) {
				local33 = local14 + local14 - local33 - 1;
				arg0.aClass2_Sub3_Sub3_3.method2475();
			}
		} else {
			local33 = (int) ((long) this.anIntArray486[arg0.anInt5496] * (long) local14 >> 6);
		}
		arg0.aClass2_Sub3_Sub3_3.method2467(local33);
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "()Lclient!ad;")
	@Override
	public synchronized Class2_Sub3 method4615() {
		return this.aClass2_Sub3_Sub2_1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZII)V")
	private void method4650() {
		this.anIntArray485[9] = 128;
		this.anIntArray488[9] = 128;
		this.method4656(9, 128);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZI)V")
	private void method4651(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray481[arg1] = arg0;
		this.anIntArray483[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!mg;Lclient!hf;IILclient!ne;)Z")
	public synchronized boolean method4652(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class105 arg1, @OriginalArg(4) Class2_Sub27 arg2) {
		arg2.method3895();
		@Pc(9) boolean local9 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class2_Sub39 local27 = (Class2_Sub39) arg2.aClass163_31.method3771(); local27 != null; local27 = (Class2_Sub39) arg2.aClass163_31.method3770()) {
			@Pc(33) int local33 = (int) local27.aLong227;
			@Pc(41) Class2_Sub12 local41 = (Class2_Sub12) this.aClass163_37.method3769((long) local33);
			if (local41 == null) {
				local41 = Static354.method4835(local33, arg0);
				if (local41 == null) {
					local9 = false;
					continue;
				}
				this.aClass163_37.method3764((long) local33, local41);
			}
			if (!local41.method1472(local21, local27.aByteArray116, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3894();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(III)V")
	public synchronized void method4653() {
		this.method4650();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ps;B)Z")
	public boolean method4654(@OriginalArg(0) Class2_Sub34 arg0) {
		if (arg0.aClass2_Sub3_Sub3_3 != null) {
			return false;
		}
		if (arg0.anInt5499 >= 0) {
			arg0.method5866();
			if (arg0.anInt5502 > 0 && this.aClass2_Sub34ArrayArray2[arg0.anInt5496][arg0.anInt5502] == arg0) {
				this.aClass2_Sub34ArrayArray2[arg0.anInt5496][arg0.anInt5502] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "(III)V")
	private void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray479[arg0] != arg1) {
			this.anIntArray479[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub34ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qu", name = "e", descriptor = "(III)V")
	private void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
