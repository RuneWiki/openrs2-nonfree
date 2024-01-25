import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!dt", name = "Fb", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!dt", name = "Gb", descriptor = "I")
	private int anInt2126;

	@OriginalMember(owner = "client!dt", name = "Hb", descriptor = "I")
	private int anInt2127;

	@OriginalMember(owner = "client!dt", name = "Ib", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!dt", name = "Kb", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "client!dt", name = "Lb", descriptor = "I")
	private int anInt2128;

	@OriginalMember(owner = "client!dt", name = "Mb", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!dt", name = "Nb", descriptor = "Lclient!vw;")
	private Class2_Sub49 aClass2_Sub49_2;

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "[[Lclient!hb;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray1 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!dt", name = "gb", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "[I")
	public final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!dt", name = "jb", descriptor = "[I")
	public final int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!dt", name = "cb", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!dt", name = "K", descriptor = "[I")
	public final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!dt", name = "qb", descriptor = "I")
	private final int anInt2119 = 1000000;

	@OriginalMember(owner = "client!dt", name = "W", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!dt", name = "G", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!dt", name = "bb", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!dt", name = "wb", descriptor = "[I")
	private final int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!dt", name = "yb", descriptor = "[I")
	private final int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!dt", name = "pb", descriptor = "[I")
	private final int[] anIntArray129 = new int[16];

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!dt", name = "E", descriptor = "[[Lclient!hb;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray2 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!dt", name = "Bb", descriptor = "I")
	private int anInt2125 = 256;

	@OriginalMember(owner = "client!dt", name = "sb", descriptor = "[I")
	private final int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!dt", name = "Ab", descriptor = "[I")
	private final int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!dt", name = "C", descriptor = "Lclient!si;")
	private final Class305 aClass305_1 = new Class305();

	@OriginalMember(owner = "client!dt", name = "Eb", descriptor = "Lclient!eba;")
	private final Class2_Sub10_Sub3 aClass2_Sub10_Sub3_1 = new Class2_Sub10_Sub3(this);

	@OriginalMember(owner = "client!dt", name = "v", descriptor = "Lclient!il;")
	private final Class162 aClass162_15 = new Class162(128);

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub2() {
		this.method1541();
		this.method1544(true);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	private void method1527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray124[arg0] != arg1) {
			this.anIntArray124[arg0] = arg1;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass2_Sub21ArrayArray2[arg0][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass305_1.method6814()) {
			@Pc(14) int local14 = this.anInt2119 * this.aClass305_1.anInt8229 / Static162.anInt3474;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong61;
				if (this.aLong62 - local23 >= 0L) {
					this.aLong61 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong62 - this.aLong61 - 1L) / (long) local14);
				this.aLong61 += (long) local54 * (long) local14;
				this.aClass2_Sub10_Sub3_1.method3363(arg0, arg1, local54);
				arg2 -= local54;
				arg1 += local54;
				this.method1548();
			} while (this.aClass305_1.method6814());
		}
		this.aClass2_Sub10_Sub3_1.method3363(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "()Lclient!pn;")
	@Override
	public synchronized Class2_Sub10 method3360() {
		return this.aClass2_Sub10_Sub3_1;
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(III)V")
	public synchronized void method1528() {
		this.method1549();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(JLclient!vw;IZZ)V")
	public synchronized void method1529(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub49 arg1, @OriginalArg(3) boolean arg2) {
		this.method1547(true, arg2, arg1);
		this.method1559(arg0 * (long) this.aClass305_1.anInt8229);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)V")
	private void method1530(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method210(); local12 != null; local12 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method218()) {
			if ((arg0 < 0 || local12.anInt3828 == arg0) && local12.anInt3844 < 0) {
				this.aClass2_Sub21ArrayArray1[local12.anInt3828][local12.anInt3840] = null;
				local12.anInt3844 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3361(@OriginalArg(0) int arg0) {
		if (this.aClass305_1.method6814()) {
			@Pc(18) int local18 = this.aClass305_1.anInt8229 * this.anInt2119 / Static162.anInt3474;
			do {
				@Pc(28) long local28 = this.aLong61 + (long) arg0 * (long) local18;
				if (this.aLong62 - local28 >= 0L) {
					this.aLong61 = local28;
					break;
				}
				@Pc(60) int local60 = (int) ((this.aLong62 + (long) local18 - this.aLong61 - 1L) / (long) local18);
				this.aLong61 += (long) local60 * (long) local18;
				this.aClass2_Sub10_Sub3_1.method3361(local60);
				arg0 -= local60;
				this.method1548();
			} while (this.aClass305_1.method6814());
		}
		this.aClass2_Sub10_Sub3_1.method3361(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)V")
	public synchronized void method1531(@OriginalArg(1) int arg0) {
		this.anInt2125 = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public synchronized void method1532() {
		for (@Pc(11) Class2_Sub45 local11 = (Class2_Sub45) this.aClass162_15.method3527(); local11 != null; local11 = (Class2_Sub45) this.aClass162_15.method3523()) {
			local11.method7966();
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public synchronized void method1533() {
		this.method1556(true);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!vw;ZI)V")
	public synchronized void method1534(@OriginalArg(0) Class2_Sub49 arg0, @OriginalArg(1) boolean arg1) {
		this.method1547(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BLclient!hb;)Z")
	public boolean method1535(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.aClass2_Sub10_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt3844 >= 0) {
			arg0.method7966();
			if (arg0.anInt3826 > 0 && this.aClass2_Sub21ArrayArray2[arg0.anInt3828][arg0.anInt3826] == arg0) {
				this.aClass2_Sub21ArrayArray2[arg0.anInt3828][arg0.anInt3826] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!hb;)I")
	private int method1536(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(14) int local14 = arg0.anInt3842 + (arg0.anInt3845 * arg0.anInt3839 >> 12);
		local14 += (this.anIntArray125[arg0.anInt3828] - 8192) * this.anIntArray122[arg0.anInt3828] >> 12;
		@Pc(35) Class226 local35 = arg0.aClass226_1;
		@Pc(58) int local58;
		if (local35.anInt6249 > 0 && (local35.anInt6250 > 0 || this.anIntArray133[arg0.anInt3828] > 0)) {
			local58 = local35.anInt6250 << 2;
			@Pc(63) int local63 = local35.anInt6251 << 1;
			if (arg0.anInt3838 < local63) {
				local58 = local58 * arg0.anInt3838 / local63;
			}
			local58 += this.anIntArray133[arg0.anInt3828] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt3833 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local97 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub7_Sub1_1.anInt6608 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static162.anInt3474 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZII)V")
	private void method1537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIII)V")
	private void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub21 local12 = this.aClass2_Sub21ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub21ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray123[arg2] & 0x2) == 0) {
			local12.anInt3844 = 0;
			return;
		}
		for (@Pc(43) Class2_Sub21 local43 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method210(); local43 != null; local43 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method218()) {
			if (local12.anInt3828 == local43.anInt3828 && local43.anInt3844 < 0 && local43 != local12) {
				local12.anInt3844 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([ILclient!hb;III)Z")
	public boolean method1539(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg1.anInt3830 = Static162.anInt3474 / 100;
		if (arg1.anInt3844 >= 0 && (arg1.aClass2_Sub10_Sub4_1 == null || arg1.aClass2_Sub10_Sub4_1.method3378())) {
			arg1.method3178();
			arg1.method7966();
			if (arg1.anInt3826 > 0 && this.aClass2_Sub21ArrayArray2[arg1.anInt3828][arg1.anInt3826] == arg1) {
				this.aClass2_Sub21ArrayArray2[arg1.anInt3828][arg1.anInt3826] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt3845;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray118[arg1.anInt3828] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt3845 = local56;
		}
		arg1.aClass2_Sub10_Sub4_1.method3383(this.method1536(arg1));
		@Pc(96) Class226 local96 = arg1.aClass226_1;
		@Pc(98) boolean local98 = false;
		arg1.anInt3833 += local96.anInt6249;
		arg1.anInt3838++;
		@Pc(129) double local129 = (double) ((arg1.anInt3839 * arg1.anInt3845 >> 12) + (arg1.anInt3840 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt6248 > 0) {
			if (local96.anInt6256 <= 0) {
				arg1.anInt3829 += 128;
			} else {
				arg1.anInt3829 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt6256) * 128.0D + 0.5D);
			}
			if (arg1.anInt3829 * local96.anInt6248 >= 819200) {
				local98 = true;
			}
		}
		if (local96.aByteArray66 != null) {
			if (local96.anInt6252 <= 0) {
				arg1.anInt3827 += 128;
			} else {
				arg1.anInt3827 += (int) (Math.pow(2.0D, (double) local96.anInt6252 * local129) * 128.0D + 0.5D);
			}
			while (arg1.anInt3836 < local96.aByteArray66.length - 2 && arg1.anInt3827 > (local96.aByteArray66[arg1.anInt3836 + 2] & 0xFF) << 8) {
				arg1.anInt3836 += 2;
			}
			if (local96.aByteArray66.length - 2 == arg1.anInt3836 && local96.aByteArray66[arg1.anInt3836 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg1.anInt3844 >= 0 && local96.aByteArray65 != null && (this.anIntArray123[arg1.anInt3828] & 0x1) == 0 && (arg1.anInt3826 < 0 || this.aClass2_Sub21ArrayArray2[arg1.anInt3828][arg1.anInt3826] != arg1)) {
			if (local96.anInt6254 > 0) {
				arg1.anInt3844 += (int) (Math.pow(2.0D, (double) local96.anInt6254 * local129) * 128.0D + 0.5D);
			} else {
				arg1.anInt3844 += 128;
			}
			while (local96.aByteArray65.length - 2 > arg1.anInt3831 && (local96.aByteArray65[arg1.anInt3831 + 2] & 0xFF) << 8 < arg1.anInt3844) {
				arg1.anInt3831 += 2;
			}
			if (local96.aByteArray65.length - 2 == arg1.anInt3831) {
				local98 = true;
			}
		}
		if (!local98) {
			arg1.aClass2_Sub10_Sub4_1.method3372(arg1.anInt3830, this.method1545(arg1), this.method1551(arg1));
			return false;
		}
		arg1.aClass2_Sub10_Sub4_1.method3399(arg1.anInt3830);
		if (arg0 == null) {
			arg1.aClass2_Sub10_Sub4_1.method3361(arg3);
		} else {
			arg1.aClass2_Sub10_Sub4_1.method3363(arg0, arg2, arg3);
		}
		if (arg1.aClass2_Sub10_Sub4_1.method3405()) {
			this.aClass2_Sub10_Sub3_1.aClass2_Sub10_Sub1_1.method1013(arg1.aClass2_Sub10_Sub4_1);
		}
		arg1.method3178();
		if (arg1.anInt3844 >= 0) {
			arg1.method7966();
			if (arg1.anInt3826 > 0 && arg1 == this.aClass2_Sub21ArrayArray2[arg1.anInt3828][arg1.anInt3826]) {
				this.aClass2_Sub21ArrayArray2[arg1.anInt3828][arg1.anInt3826] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZ)V")
	private synchronized void method1541() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray119[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(II)V")
	private void method1542(@OriginalArg(0) int arg0) {
		if ((this.anIntArray123[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method210(); local16 != null; local16 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method218()) {
			if (arg0 == local16.anInt3828) {
				local16.anInt3834 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)V")
	private void method1543(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1538(local24, local30, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method1557(local30, local24, local18);
			} else {
				this.method1538(local24, 64, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1564(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray127[local18] = (local30 << 14) + (this.anIntArray127[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray127[local18] = (local30 << 7) + (this.anIntArray127[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray133[local18] = (local30 << 7) + (this.anIntArray133[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray133[local18] = (this.anIntArray133[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray118[local18] = (this.anIntArray118[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray118[local18] = (this.anIntArray118[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray126[local18] = (this.anIntArray126[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray126[local18] = (this.anIntArray126[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray129[local18] = (this.anIntArray129[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray129[local18] = local30 + (this.anIntArray129[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray120[local18] = (this.anIntArray120[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray120[local18] = (this.anIntArray120[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray123[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray123[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray123[local18] |= 0x2;
				} else {
					this.method1553(local18);
					this.anIntArray123[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray130[local18] = (local30 << 7) + (this.anIntArray130[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray130[local18] = (this.anIntArray130[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray130[local18] = (this.anIntArray130[local18] & 0x7F) + ((local30 << 7) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray130[local18] = (this.anIntArray130[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1561(local18);
			}
			if (local24 == 121) {
				this.method1555(local18);
			}
			if (local24 == 123) {
				this.method1530(local18);
			}
			@Pc(517) int local517;
			if (local24 == 6) {
				local517 = this.anIntArray130[local18];
				if (local517 == 16384) {
					this.anIntArray122[local18] = (this.anIntArray122[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local517 = this.anIntArray130[local18];
				if (local517 == 16384) {
					this.anIntArray122[local18] = (this.anIntArray122[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray128[local18] = (local30 << 7) + (this.anIntArray128[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray128[local18] = local30 + (this.anIntArray128[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray123[local18] |= 0x4;
				} else {
					this.method1542(local18);
					this.anIntArray123[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1554((this.anIntArray132[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method1554(local30 + (this.anIntArray132[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1527(local18, local24 + this.anIntArray127[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1537(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1562(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1544(true);
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V")
	private void method1544(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1561(-1);
		} else {
			this.method1530(-1);
		}
		this.method1555(-1);
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			this.anIntArray124[local28] = this.anIntArray131[local28];
		}
		for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
			this.anIntArray127[local44] = this.anIntArray131[local44] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ILclient!hb;)I")
	private int method1545(@OriginalArg(1) Class2_Sub21 arg0) {
		if (this.anIntArray119[arg0.anInt3828] == 0) {
			return 0;
		}
		@Pc(17) Class226 local17 = arg0.aClass226_1;
		@Pc(33) int local33 = this.anIntArray120[arg0.anInt3828] * this.anIntArray126[arg0.anInt3828] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = local41 * arg0.anInt3843 + 16384 >> 15;
		@Pc(59) int local59 = local50 * this.anInt2125 + 128 >> 8;
		local33 = local59 * this.anIntArray119[arg0.anInt3828] + 128 >> 8;
		if (local17.anInt6248 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt6248 * 1.953125E-5D * (double) arg0.anInt3829) * (double) local33 + 0.5D);
		}
		@Pc(98) int local98;
		@Pc(106) int local106;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local17.aByteArray66 != null) {
			local98 = arg0.anInt3827;
			local106 = local17.aByteArray66[arg0.anInt3836 + 1];
			if (arg0.anInt3836 < local17.aByteArray66.length - 2) {
				local128 = (local17.aByteArray66[arg0.anInt3836] & 0xFF) << 8;
				local140 = (local17.aByteArray66[arg0.anInt3836 + 2] & 0xFF) << 8;
				local106 += (local98 - local128) * (-local106 + local17.aByteArray66[arg0.anInt3836 + 3]) / (local140 - local128);
			}
			local33 = local106 * local33 + 32 >> 6;
		}
		if (arg0.anInt3844 > 0 && local17.aByteArray65 != null) {
			local98 = arg0.anInt3844;
			local106 = local17.aByteArray65[arg0.anInt3831 + 1];
			if (local17.aByteArray65.length - 2 > arg0.anInt3831) {
				local128 = (local17.aByteArray65[arg0.anInt3831] & 0xFF) << 8;
				local140 = (local17.aByteArray65[arg0.anInt3831 + 2] & 0xFF) << 8;
				local106 += (local98 - local128) * (local17.aByteArray65[arg0.anInt3831 + 3] - local106) / (local140 - local128);
			}
			local33 = local33 * local106 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIZLclient!vw;)V")
	private synchronized void method1547(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub49 arg2) {
		this.method1556(arg0);
		this.aClass305_1.method6823(arg2.aByteArray99);
		this.aBoolean189 = arg1;
		this.aLong61 = 0L;
		@Pc(24) int local24 = this.aClass305_1.method6811();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass305_1.method6813(local34);
			this.aClass305_1.method6818(local34);
			this.aClass305_1.method6819(local34);
		}
		this.anInt2126 = this.aClass305_1.method6812();
		this.anInt2127 = this.aClass305_1.anIntArray586[this.anInt2126];
		this.aLong62 = this.aClass305_1.method6825(this.anInt2127);
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(B)V")
	private void method1548() {
		@Pc(15) int local15 = this.anInt2126;
		@Pc(18) int local18 = this.anInt2127;
		@Pc(21) long local21 = this.aLong62;
		if (this.aClass2_Sub49_2 != null && this.anInt2128 == local18) {
			this.method1547(this.aBoolean190, this.aBoolean189, this.aClass2_Sub49_2);
			this.method1548();
			return;
		}
		while (local18 == this.anInt2127) {
			while (local18 == this.aClass305_1.anIntArray586[local15]) {
				this.aClass305_1.method6813(local15);
				@Pc(50) int local50 = this.aClass305_1.method6822(local15);
				if (local50 == 1) {
					this.aClass305_1.method6826();
					this.aClass305_1.method6819(local15);
					if (this.aClass305_1.method6817()) {
						if (this.aClass2_Sub49_2 != null) {
							this.method1534(this.aClass2_Sub49_2, this.aBoolean189);
							this.method1548();
							return;
						}
						if (!this.aBoolean189 || local18 == 0) {
							this.method1544(true);
							this.aClass305_1.method6821();
							return;
						}
						this.aClass305_1.method6824(local21);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method1543(local50);
				}
				this.aClass305_1.method6818(local15);
				this.aClass305_1.method6819(local15);
			}
			local15 = this.aClass305_1.method6812();
			local18 = this.aClass305_1.anIntArray586[local15];
			local21 = this.aClass305_1.method6825(local18);
		}
		this.anInt2127 = local18;
		this.aLong62 = local21;
		this.anInt2126 = local15;
		if (this.aClass2_Sub49_2 != null && local18 > this.anInt2128) {
			this.anInt2126 = -1;
			this.anInt2127 = this.anInt2128;
			this.aLong62 = this.aClass305_1.method6825(this.anInt2127);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)V")
	private void method1549() {
		this.anIntArray131[9] = 128;
		this.anIntArray127[9] = 128;
		this.method1527(9, 128);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "()Lclient!pn;")
	@Override
	public synchronized Class2_Sub10 method3364() {
		return null;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!hb;Z)V")
	public void method1550(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub7_Sub1_1.aByteArray68.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass2_Sub7_Sub1_1.aBoolean517) {
			@Pc(38) int local38 = local8 + local8 - arg0.aClass2_Sub7_Sub1_1.anInt6607;
			local8 <<= 0x8;
			local27 = (int) ((long) local38 * (long) this.anIntArray128[arg0.anInt3828] >> 6);
			if (local8 <= local27) {
				local27 = local8 + local8 - local27 - 1;
				arg0.aClass2_Sub10_Sub4_1.method3385();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray128[arg0.anInt3828] >> 6);
		}
		arg0.aClass2_Sub10_Sub4_1.method3387(local27);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!hb;B)I")
	private int method1551(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(15) int local15 = this.anIntArray129[arg0.anInt3828];
		return local15 < 8192 ? arg0.anInt3841 * local15 + 32 >> 6 : 16384 - ((16384 - local15) * (128 - arg0.anInt3841) + 32 >> 6);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lclient!pl;Lclient!vw;BILclient!pj;)Z")
	public synchronized boolean method1552(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class2_Sub49 arg1, @OriginalArg(4) Class257 arg2) {
		arg1.method7744();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub27 local34 = (Class2_Sub27) arg1.aClass162_43.method3527(); local34 != null; local34 = (Class2_Sub27) arg1.aClass162_43.method3523()) {
			@Pc(40) int local40 = (int) local34.aLong268;
			@Pc(48) Class2_Sub45 local48 = (Class2_Sub45) this.aClass162_15.method3519((long) local40);
			if (local48 == null) {
				local48 = Static514.method235(local40, arg0);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass162_15.method3522(local48, (long) local40);
			}
			if (!local48.method7379(local28, arg2, local34.aByteArray54)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method7746();
		}
		return local9;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IB)V")
	private void method1553(@OriginalArg(0) int arg0) {
		if ((this.anIntArray123[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub21 local23 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method210(); local23 != null; local23 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method218()) {
			if (local23.anInt3828 == arg0 && this.aClass2_Sub21ArrayArray1[arg0][local23.anInt3840] == null && local23.anInt3844 < 0) {
				local23.anInt3844 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(III)V")
	private void method1554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray132[arg1] = arg0;
		this.anIntArray121[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(II)V")
	private void method1555(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1555(local12);
			}
			return;
		}
		this.anIntArray126[arg0] = 12800;
		this.anIntArray129[arg0] = 8192;
		this.anIntArray120[arg0] = 16383;
		this.anIntArray125[arg0] = 8192;
		this.anIntArray133[arg0] = 0;
		this.anIntArray118[arg0] = 8192;
		this.method1553(arg0);
		this.method1542(arg0);
		this.anIntArray123[arg0] = 0;
		this.anIntArray130[arg0] = 32767;
		this.anIntArray122[arg0] = 256;
		this.anIntArray128[arg0] = 0;
		this.method1554(8192, arg0);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(IZ)V")
	private synchronized void method1556(@OriginalArg(1) boolean arg0) {
		this.aClass305_1.method6821();
		this.aClass2_Sub49_2 = null;
		this.method1544(arg0);
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(IIII)V")
	private void method1557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1538(arg1, 64, arg2);
		if ((this.anIntArray123[arg2] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub21 local28 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method221(); local28 != null; local28 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method216()) {
				if (local28.anInt3828 == arg2 && local28.anInt3844 < 0) {
					this.aClass2_Sub21ArrayArray1[arg2][local28.anInt3840] = null;
					this.aClass2_Sub21ArrayArray1[arg2][arg1] = local28;
					@Pc(66) int local66 = local28.anInt3842 + (local28.anInt3839 * local28.anInt3845 >> 12);
					local28.anInt3842 += arg1 - local28.anInt3840 << 8;
					local28.anInt3839 = local66 - local28.anInt3842;
					local28.anInt3845 = 4096;
					local28.anInt3840 = arg1;
					return;
				}
			}
		}
		@Pc(110) Class2_Sub45 local110 = (Class2_Sub45) this.aClass162_15.method3519((long) this.anIntArray124[arg2]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class2_Sub7_Sub1 local118 = local110.aClass2_Sub7_Sub1Array1[arg1];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class2_Sub21 local125 = new Class2_Sub21();
		local125.anInt3828 = arg2;
		local125.aClass2_Sub7_Sub1_1 = local118;
		local125.aClass2_Sub45_1 = local110;
		local125.aClass226_1 = local110.aClass226Array1[arg1];
		local125.anInt3826 = local110.aByteArray88[arg1];
		local125.anInt3840 = arg1;
		local125.anInt3843 = arg0 * arg0 * local110.anInt8833 * local110.aByteArray90[arg1] + 1024 >> 11;
		local125.anInt3841 = local110.aByteArray89[arg1] & 0xFF;
		local125.anInt3842 = (arg1 << 8) - (local110.aShortArray120[arg1] & 0x7FFF);
		local125.anInt3829 = 0;
		local125.anInt3844 = -1;
		local125.anInt3831 = 0;
		local125.anInt3836 = 0;
		local125.anInt3827 = 0;
		if (this.anIntArray128[arg2] == 0) {
			local125.aClass2_Sub10_Sub4_1 = Static600.method3398(local118, this.method1536(local125), this.method1545(local125), this.method1551(local125));
		} else {
			local125.aClass2_Sub10_Sub4_1 = Static600.method3398(local118, this.method1536(local125), 0, this.method1551(local125));
			this.method1550(local125, local110.aShortArray120[arg1] < 0);
		}
		if (local110.aShortArray120[arg1] < 0) {
			local125.aClass2_Sub10_Sub4_1.method3403(-1);
		}
		if (local125.anInt3826 >= 0) {
			@Pc(289) Class2_Sub21 local289 = this.aClass2_Sub21ArrayArray2[arg2][local125.anInt3826];
			if (local289 != null && local289.anInt3844 < 0) {
				this.aClass2_Sub21ArrayArray1[arg2][local289.anInt3840] = null;
				local289.anInt3844 = 0;
			}
			this.aClass2_Sub21ArrayArray2[arg2][local125.anInt3826] = local125;
		}
		this.aClass2_Sub10_Sub3_1.aClass8_14.method212(local125);
		this.aClass2_Sub21ArrayArray1[arg2][arg1] = local125;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method1558() {
		return this.aClass305_1.method6814();
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(JI)V")
	private void method1559(@OriginalArg(0) long arg0) {
		while (this.aLong62 <= arg0) {
			@Pc(12) int local12 = this.anInt2126;
			@Pc(15) int local15 = this.anInt2127;
			@Pc(18) long local18 = this.aLong62;
			while (local15 == this.anInt2127) {
				while (local15 == this.aClass305_1.anIntArray586[local12]) {
					this.aClass305_1.method6813(local12);
					@Pc(29) int local29 = this.aClass305_1.method6822(local12);
					if (local29 == 1) {
						this.aClass305_1.method6826();
						this.aClass305_1.method6819(local12);
						if (this.aClass305_1.method6817()) {
							if (!this.aBoolean189 || local15 == 0) {
								this.method1544(true);
								this.aClass305_1.method6821();
								return;
							}
							this.aClass305_1.method6824(local18);
						}
						break;
					}
					if ((local29 & 0x80) != 0 && (local29 & 0xF0) != 144) {
						this.method1543(local29);
					}
					this.aClass305_1.method6818(local12);
					this.aClass305_1.method6819(local12);
				}
				this.aLong61 = local18;
				local12 = this.aClass305_1.method6812();
				local15 = this.aClass305_1.anIntArray586[local12];
				local18 = this.aClass305_1.method6825(local15);
			}
			this.anInt2127 = local15;
			this.aLong62 = local18;
			this.anInt2126 = local12;
		}
	}

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)I")
	public int method1560() {
		return this.anInt2125;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(II)V")
	private void method1561(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub21 local12 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method210(); local12 != null; local12 = (Class2_Sub21) this.aClass2_Sub10_Sub3_1.aClass8_14.method218()) {
			if (arg0 < 0 || arg0 == local12.anInt3828) {
				if (local12.aClass2_Sub10_Sub4_1 != null) {
					local12.aClass2_Sub10_Sub4_1.method3399(Static162.anInt3474 / 100);
					if (local12.aClass2_Sub10_Sub4_1.method3405()) {
						this.aClass2_Sub10_Sub3_1.aClass2_Sub10_Sub1_1.method1013(local12.aClass2_Sub10_Sub4_1);
					}
					local12.method3178();
				}
				if (local12.anInt3844 < 0) {
					this.aClass2_Sub21ArrayArray1[local12.anInt3828][local12.anInt3840] = null;
				}
				local12.method7966();
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(ZII)V")
	private void method1562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray125[arg1] = arg0;
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "(B)V")
	public synchronized void method1563() {
		for (@Pc(7) Class2_Sub45 local7 = (Class2_Sub45) this.aClass162_15.method3527(); local7 != null; local7 = (Class2_Sub45) this.aClass162_15.method3523()) {
			local7.method7380();
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIZI)V")
	private void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3366() {
		return 0;
	}
}
