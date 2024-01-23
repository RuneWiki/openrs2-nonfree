import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub7_Sub3 extends Class1_Sub7 {

	@OriginalMember(owner = "client!wd", name = "uc", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!wd", name = "vc", descriptor = "I")
	private int anInt4642;

	@OriginalMember(owner = "client!wd", name = "wc", descriptor = "J")
	private long aLong145;

	@OriginalMember(owner = "client!wd", name = "yc", descriptor = "I")
	private int anInt4643;

	@OriginalMember(owner = "client!wd", name = "zc", descriptor = "J")
	private long aLong146;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "[I")
	private int[] anIntArray631 = new int[16];

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "[I")
	private int[] anIntArray636 = new int[16];

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "[I")
	private int[] anIntArray633 = new int[16];

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "[I")
	private int[] anIntArray634 = new int[16];

	@OriginalMember(owner = "client!wd", name = "tb", descriptor = "[[Lclient!hg;")
	private Class1_Sub13[][] aClass1_Sub13ArrayArray1 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!wd", name = "Pb", descriptor = "[I")
	private int[] anIntArray640 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Sb", descriptor = "[I")
	public int[] anIntArray642 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Xb", descriptor = "[I")
	private int[] anIntArray643 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Y", descriptor = "[I")
	private int[] anIntArray635 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Yb", descriptor = "[I")
	public int[] anIntArray644 = new int[16];

	@OriginalMember(owner = "client!wd", name = "ob", descriptor = "[I")
	private int[] anIntArray637 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
	private int anInt4612 = 256;

	@OriginalMember(owner = "client!wd", name = "oc", descriptor = "[[Lclient!hg;")
	private Class1_Sub13[][] aClass1_Sub13ArrayArray2 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!wd", name = "qc", descriptor = "I")
	private int anInt4640 = 1000000;

	@OriginalMember(owner = "client!wd", name = "Qb", descriptor = "[I")
	public int[] anIntArray641 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Gb", descriptor = "[I")
	private int[] anIntArray638 = new int[16];

	@OriginalMember(owner = "client!wd", name = "sc", descriptor = "[I")
	private int[] anIntArray645 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Nb", descriptor = "[I")
	private int[] anIntArray639 = new int[16];

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "[I")
	private int[] anIntArray632 = new int[16];

	@OriginalMember(owner = "client!wd", name = "Ib", descriptor = "Lclient!bj;")
	private Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!wd", name = "xc", descriptor = "Lclient!de;")
	private Class1_Sub7_Sub1 aClass1_Sub7_Sub1_1 = new Class1_Sub7_Sub1(this);

	@OriginalMember(owner = "client!wd", name = "Eb", descriptor = "Lclient!ff;")
	private Class33 aClass33_18 = new Class33(128);

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class1_Sub7_Sub3() {
		this.method3419();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!hg;)I")
	private int method3396(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(11) int local11 = this.anIntArray632[arg0.anInt1867];
		return local11 >= 8192 ? 16384 - ((16384 - local11) * (-arg0.anInt1857 + 128) + 32 >> 6) : local11 * arg0.anInt1857 + 32 >> 6;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	private void method3397(@OriginalArg(0) int arg0) {
		if ((this.anIntArray642[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class1_Sub13 local26 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method609(); local26 != null; local26 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method615()) {
			if (arg0 == local26.anInt1867) {
				local26.anInt1874 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I")
	public int method3398() {
		return this.anInt4612;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZBLclient!hg;)V")
	public void method3399(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(13) int local13 = arg1.aClass1_Sub19_Sub1_1.aByteArray42.length;
		@Pc(45) int local45;
		if (arg0 && arg1.aClass1_Sub19_Sub1_1.aBoolean182) {
			@Pc(28) int local28 = local13 + local13 - arg1.aClass1_Sub19_Sub1_1.anInt3296;
			local13 <<= 0x8;
			local45 = (int) ((long) this.anIntArray644[arg1.anInt1867] * (long) local28 >> 6);
			if (local45 >= local13) {
				local45 = local13 + local13 - local45 - 1;
				arg1.aClass1_Sub7_Sub4_1.method3455();
			}
		} else {
			local45 = (int) ((long) this.anIntArray644[arg1.anInt1867] * (long) local13 >> 6);
		}
		arg1.aClass1_Sub7_Sub4_1.method3471(local45);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZII)V")
	private void method3400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray637[arg0] = arg1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!qh;BZ)V")
	public synchronized void method3401(@OriginalArg(0) Class1_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		this.method3404();
		this.aClass14_1.method344(arg0.aByteArray46);
		this.aLong145 = 0L;
		this.aBoolean260 = arg1;
		@Pc(23) int local23 = this.aClass14_1.method349();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass14_1.method342(local25);
			this.aClass14_1.method340(local25);
			this.aClass14_1.method346(local25);
		}
		this.anInt4642 = this.aClass14_1.method336();
		this.anInt4643 = this.aClass14_1.anIntArray74[this.anInt4642];
		this.aLong146 = this.aClass14_1.method339(this.anInt4643);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
	private void method3403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()Lclient!li;")
	@Override
	public synchronized Class1_Sub7 method3452() {
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(B)V")
	public synchronized void method3404() {
		this.aClass14_1.method343();
		this.method3419();
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()Lclient!li;")
	@Override
	public synchronized Class1_Sub7 method3454() {
		return this.aClass1_Sub7_Sub1_1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III[ILclient!hg;)Z")
	public boolean method3405(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub13 arg3) {
		arg3.anInt1858 = Static191.anInt4086 / 100;
		if (arg3.anInt1879 >= 0 && (arg3.aClass1_Sub7_Sub4_1 == null || arg3.aClass1_Sub7_Sub4_1.method3457())) {
			arg3.method1383();
			arg3.method3530();
			if (arg3.anInt1862 > 0 && arg3 == this.aClass1_Sub13ArrayArray2[arg3.anInt1867][arg3.anInt1862]) {
				this.aClass1_Sub13ArrayArray2[arg3.anInt1867][arg3.anInt1862] = null;
			}
			return true;
		}
		@Pc(67) int local67 = arg3.anInt1861;
		if (local67 > 0) {
			local67 -= (int) (Math.pow(2.0D, (double) this.anIntArray639[arg3.anInt1867] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local67 < 0) {
				local67 = 0;
			}
			arg3.anInt1861 = local67;
		}
		arg3.aClass1_Sub7_Sub4_1.method3491(this.method3412(arg3));
		arg3.anInt1863++;
		@Pc(110) Class80 local110 = arg3.aClass80_1;
		arg3.anInt1877 += local110.anInt3569;
		@Pc(135) double local135 = (double) ((arg3.anInt1865 - 60 << 8) + (arg3.anInt1861 * arg3.anInt1859 >> 12)) * 5.086263020833333E-6D;
		@Pc(137) boolean local137 = false;
		if (local110.anInt3573 > 0) {
			if (local110.anInt3561 <= 0) {
				arg3.anInt1866 += 128;
			} else {
				arg3.anInt1866 += (int) (Math.pow(2.0D, (double) local110.anInt3561 * local135) * 128.0D + 0.5D);
			}
			if (local110.anInt3573 * arg3.anInt1866 >= 819200) {
				local137 = true;
			}
		}
		if (local110.aByteArray45 != null) {
			if (local110.anInt3568 <= 0) {
				arg3.anInt1875 += 128;
			} else {
				arg3.anInt1875 += (int) (Math.pow(2.0D, local135 * (double) local110.anInt3568) * 128.0D + 0.5D);
			}
			while (arg3.anInt1860 < local110.aByteArray45.length - 2 && (local110.aByteArray45[arg3.anInt1860 + 2] & 0xFF) << 8 < arg3.anInt1875) {
				arg3.anInt1860 += 2;
			}
			if (local110.aByteArray45.length - 2 == arg3.anInt1860 && local110.aByteArray45[arg3.anInt1860 + 1] == 0) {
				local137 = true;
			}
		}
		if (arg3.anInt1879 >= 0 && local110.aByteArray44 != null && (this.anIntArray642[arg3.anInt1867] & 0x1) == 0 && (arg3.anInt1862 < 0 || this.aClass1_Sub13ArrayArray2[arg3.anInt1867][arg3.anInt1862] != arg3)) {
			if (local110.anInt3562 > 0) {
				arg3.anInt1879 += (int) (Math.pow(2.0D, (double) local110.anInt3562 * local135) * 128.0D + 0.5D);
			} else {
				arg3.anInt1879 += 128;
			}
			while (arg3.anInt1872 < local110.aByteArray44.length - 2 && (local110.aByteArray44[arg3.anInt1872 + 2] & 0xFF) << 8 < arg3.anInt1879) {
				arg3.anInt1872 += 2;
			}
			if (local110.aByteArray44.length - 2 == arg3.anInt1872) {
				local137 = true;
			}
		}
		if (!local137) {
			arg3.aClass1_Sub7_Sub4_1.method3467(arg3.anInt1858, this.method3425(arg3), this.method3396(arg3));
			return false;
		}
		arg3.aClass1_Sub7_Sub4_1.method3465(arg3.anInt1858);
		if (arg2 == null) {
			arg3.aClass1_Sub7_Sub4_1.method3450(arg1);
		} else {
			arg3.aClass1_Sub7_Sub4_1.method3448(arg2, arg0, arg1);
		}
		if (arg3.aClass1_Sub7_Sub4_1.method3484()) {
			this.aClass1_Sub7_Sub1_1.aClass1_Sub7_Sub2_1.method3378(arg3.aClass1_Sub7_Sub4_1);
		}
		arg3.method1383();
		if (arg3.anInt1879 >= 0) {
			arg3.method3530();
			if (arg3.anInt1862 > 0 && arg3 == this.aClass1_Sub13ArrayArray2[arg3.anInt1867][arg3.anInt1862]) {
				this.aClass1_Sub13ArrayArray2[arg3.anInt1867][arg3.anInt1862] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)V")
	private void method3406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method3424(arg0, 64, arg1);
		if ((this.anIntArray642[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub13 local25 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method613(); local25 != null; local25 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method617()) {
				if (local25.anInt1867 == arg0 && local25.anInt1879 < 0) {
					this.aClass1_Sub13ArrayArray1[arg0][local25.anInt1865] = null;
					this.aClass1_Sub13ArrayArray1[arg0][arg1] = local25;
					@Pc(64) int local64 = (local25.anInt1861 * local25.anInt1859 >> 12) + local25.anInt1876;
					local25.anInt1876 += arg1 - local25.anInt1865 << 8;
					local25.anInt1859 = local64 - local25.anInt1876;
					local25.anInt1861 = 4096;
					local25.anInt1865 = arg1;
					return;
				}
			}
		}
		@Pc(109) Class1_Sub3 local109 = (Class1_Sub3) this.aClass33_18.method1071((long) this.anIntArray633[arg0]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class1_Sub19_Sub1 local117 = local109.aClass1_Sub19_Sub1Array1[arg1];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class1_Sub13 local124 = new Class1_Sub13();
		local124.aClass1_Sub19_Sub1_1 = local117;
		local124.aClass1_Sub3_1 = local109;
		local124.anInt1867 = arg0;
		local124.aClass80_1 = local109.aClass80Array1[arg1];
		local124.anInt1862 = local109.aByteArray2[arg1];
		local124.anInt1865 = arg1;
		local124.anInt1878 = local109.aByteArray3[arg1] * arg2 * arg2 * local109.anInt180 + 1024 >> 11;
		local124.anInt1857 = local109.aByteArray1[arg1] & 0xFF;
		local124.anInt1876 = (arg1 << 8) - (local109.aShortArray2[arg1] & 0x7FFF);
		local124.anInt1879 = -1;
		local124.anInt1866 = 0;
		local124.anInt1875 = 0;
		local124.anInt1860 = 0;
		local124.anInt1872 = 0;
		if (this.anIntArray644[arg0] == 0) {
			local124.aClass1_Sub7_Sub4_1 = Static229.method3480(local117, this.method3412(local124), this.method3425(local124), this.method3396(local124));
		} else {
			local124.aClass1_Sub7_Sub4_1 = Static229.method3480(local117, this.method3412(local124), 0, this.method3396(local124));
			this.method3399(local109.aShortArray2[arg1] < 0, local124);
		}
		if (local109.aShortArray2[arg1] < 0) {
			local124.aClass1_Sub7_Sub4_1.method3470(-1);
		}
		if (local124.anInt1862 >= 0) {
			@Pc(287) Class1_Sub13 local287 = this.aClass1_Sub13ArrayArray2[arg0][local124.anInt1862];
			if (local287 != null && local287.anInt1879 < 0) {
				this.aClass1_Sub13ArrayArray1[arg0][local287.anInt1865] = null;
				local287.anInt1879 = 0;
			}
			this.aClass1_Sub13ArrayArray2[arg0][local124.anInt1862] = local124;
		}
		this.aClass1_Sub7_Sub1_1.aClass19_3.method620(local124);
		this.aClass1_Sub13ArrayArray1[arg0][arg1] = local124;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V")
	private void method3407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray633[arg0]) {
			this.anIntArray633[arg0] = arg1;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass1_Sub13ArrayArray2[arg0][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(B)V")
	private void method3408() {
		@Pc(8) int local8 = this.anInt4642;
		@Pc(19) long local19 = this.aLong146;
		@Pc(22) int local22 = this.anInt4643;
		while (local22 == this.anInt4643) {
			while (local22 == this.aClass14_1.anIntArray74[local8]) {
				this.aClass14_1.method342(local8);
				@Pc(33) int local33 = this.aClass14_1.method345(local8);
				if (local33 == 1) {
					this.aClass14_1.method348();
					this.aClass14_1.method346(local8);
					if (this.aClass14_1.method335()) {
						if (!this.aBoolean260 || local22 == 0) {
							this.method3419();
							this.aClass14_1.method343();
							return;
						}
						this.aClass14_1.method337(local19);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method3414(local33);
				}
				this.aClass14_1.method340(local8);
				this.aClass14_1.method346(local8);
			}
			local8 = this.aClass14_1.method336();
			local22 = this.aClass14_1.anIntArray74[local8];
			local19 = this.aClass14_1.method339(local22);
		}
		this.anInt4643 = local22;
		this.anInt4642 = local8;
		this.aLong146 = local19;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	private void method3409(@OriginalArg(1) int arg0) {
		if ((this.anIntArray642[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(27) Class1_Sub13 local27 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method609(); local27 != null; local27 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method615()) {
			if (local27.anInt1867 == arg0 && this.aClass1_Sub13ArrayArray1[arg0][local27.anInt1865] == null && local27.anInt1879 < 0) {
				local27.anInt1879 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method3410() {
		return this.aClass14_1.method334();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	private void method3411(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method609(); local8 != null; local8 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method615()) {
			if ((arg0 < 0 || arg0 == local8.anInt1867) && local8.anInt1879 < 0) {
				this.aClass1_Sub13ArrayArray1[local8.anInt1867][local8.anInt1865] = null;
				local8.anInt1879 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hg;I)I")
	private int method3412(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(11) Class80 local11 = arg0.aClass80_1;
		@Pc(22) int local22 = (arg0.anInt1859 * arg0.anInt1861 >> 12) + arg0.anInt1876;
		local22 += (this.anIntArray637[arg0.anInt1867] - 8192) * this.anIntArray635[arg0.anInt1867] >> 12;
		@Pc(57) int local57;
		if (local11.anInt3569 > 0 && (local11.anInt3567 > 0 || this.anIntArray631[arg0.anInt1867] > 0)) {
			local57 = local11.anInt3567 << 2;
			@Pc(62) int local62 = local11.anInt3564 << 1;
			if (arg0.anInt1863 < local62) {
				local57 = local57 * arg0.anInt1863 / local62;
			}
			local57 += this.anIntArray631[arg0.anInt1867] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt1877 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) ((double) local57 * local96);
		}
		local57 = (int) ((double) (arg0.aClass1_Sub19_Sub1_1.anInt3298 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static191.anInt4086 + 0.5D);
		return local57 >= 1 ? local57 : 1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hg;B)Z")
	public boolean method3413(@OriginalArg(0) Class1_Sub13 arg0) {
		if (arg0.aClass1_Sub7_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1879 >= 0) {
			arg0.method3530();
			if (arg0.anInt1862 > 0 && this.aClass1_Sub13ArrayArray2[arg0.anInt1867][arg0.anInt1862] == arg0) {
				this.aClass1_Sub13ArrayArray2[arg0.anInt1867][arg0.anInt1862] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
	private void method3414(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local5 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3424(local18, local30, local24);
		} else if (local5 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method3424(local18, 64, local24);
			} else {
				this.method3406(local18, local24, local30);
			}
		} else if (local5 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method3415(local24, local30, local18);
		} else if (local5 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray645[local18] = (this.anIntArray645[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray645[local18] = (local30 << 7) + (this.anIntArray645[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray631[local18] = (this.anIntArray631[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray631[local18] = local30 + (this.anIntArray631[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray639[local18] = (this.anIntArray639[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray639[local18] = local30 + (this.anIntArray639[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray636[local18] = (this.anIntArray636[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray636[local18] = (this.anIntArray636[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray632[local18] = (this.anIntArray632[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray632[local18] = local30 + (this.anIntArray632[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray640[local18] = (this.anIntArray640[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray640[local18] = (this.anIntArray640[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray642[local18] |= 0x1;
				} else {
					this.anIntArray642[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray642[local18] |= 0x2;
				} else {
					this.method3409(local18);
					this.anIntArray642[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray634[local18] = (local30 << 7) + (this.anIntArray634[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray634[local18] = (this.anIntArray634[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray634[local18] = (this.anIntArray634[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray634[local18] = local30 + (this.anIntArray634[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method3417(local18);
			}
			if (local24 == 121) {
				this.method3420(local18);
			}
			if (local24 == 123) {
				this.method3411(local18);
			}
			@Pc(507) int local507;
			if (local24 == 6) {
				local507 = this.anIntArray634[local18];
				if (local507 == 16384) {
					this.anIntArray635[local18] = (this.anIntArray635[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local507 = this.anIntArray634[local18];
				if (local507 == 16384) {
					this.anIntArray635[local18] = (this.anIntArray635[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray644[local18] = (local30 << 7) + (this.anIntArray644[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray644[local18] = (this.anIntArray644[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method3397(local18);
					this.anIntArray642[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray642[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method3423(local18, (this.anIntArray638[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method3423(local18, (this.anIntArray638[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local5 == 192) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method3407(local18, local24 + this.anIntArray645[local18]);
		} else if (local5 == 208) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method3403(local18, local24);
		} else if (local5 == 224) {
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			local18 = arg0 & 0xF;
			this.method3400(local18, local24);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method3419();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBI)V")
	private void method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public synchronized void method3416() {
		this.method3418();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IB)V")
	private void method3417(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub13 local8 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method609(); local8 != null; local8 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method615()) {
			if (arg0 < 0 || arg0 == local8.anInt1867) {
				if (local8.aClass1_Sub7_Sub4_1 != null) {
					local8.aClass1_Sub7_Sub4_1.method3465(Static191.anInt4086 / 100);
					if (local8.aClass1_Sub7_Sub4_1.method3484()) {
						this.aClass1_Sub7_Sub1_1.aClass1_Sub7_Sub2_1.method3378(local8.aClass1_Sub7_Sub4_1);
					}
					local8.method1383();
				}
				if (local8.anInt1879 < 0) {
					this.aClass1_Sub13ArrayArray1[local8.anInt1867][local8.anInt1865] = null;
				}
				local8.method3530();
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3450(@OriginalArg(0) int arg0) {
		if (this.aClass14_1.method334()) {
			@Pc(14) int local14 = this.aClass14_1.anInt476 * this.anInt4640 / Static191.anInt4086;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong145;
				if (this.aLong146 - local23 >= 0L) {
					this.aLong145 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong146 - this.aLong145 - 1L) / (long) local14);
				this.aLong145 += (long) local54 * (long) local14;
				this.aClass1_Sub7_Sub1_1.method3450(local54);
				arg0 -= local54;
				this.method3408();
			} while (this.aClass14_1.method334());
		}
		this.aClass1_Sub7_Sub1_1.method3450(arg0);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)V")
	private void method3418() {
		this.anIntArray643[9] = 128;
		this.anIntArray645[9] = 128;
		this.method3407(9, 128);
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()I")
	@Override
	public synchronized int method3453() {
		return 0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	private void method3419() {
		this.method3417(-1);
		this.method3420(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray633[local15] = this.anIntArray643[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray645[local33] = this.anIntArray643[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3448(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass14_1.method334()) {
			@Pc(18) int local18 = this.anInt4640 * this.aClass14_1.anInt476 / Static191.anInt4086;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong145;
				if (this.aLong146 - local27 >= 0L) {
					this.aLong145 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong146 - this.aLong145 - 1L) / (long) local18);
				this.aLong145 += (long) local57 * (long) local18;
				arg2 -= local57;
				this.aClass1_Sub7_Sub1_1.method3448(arg0, arg1, local57);
				this.method3408();
				arg1 += local57;
			} while (this.aClass14_1.method334());
		}
		this.aClass1_Sub7_Sub1_1.method3448(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(II)V")
	private void method3420(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method3420(local12);
			}
			return;
		}
		this.anIntArray636[arg0] = 12800;
		this.anIntArray632[arg0] = 8192;
		this.anIntArray640[arg0] = 16383;
		this.anIntArray637[arg0] = 8192;
		this.anIntArray631[arg0] = 0;
		this.anIntArray639[arg0] = 8192;
		this.method3409(arg0);
		this.method3397(arg0);
		this.anIntArray642[arg0] = 0;
		this.anIntArray634[arg0] = 32767;
		this.anIntArray635[arg0] = 256;
		this.anIntArray644[arg0] = 0;
		this.method3423(arg0, 8192);
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(B)V")
	public synchronized void method3421() {
		for (@Pc(11) Class1_Sub3 local11 = (Class1_Sub3) this.aClass33_18.method1067(); local11 != null; local11 = (Class1_Sub3) this.aClass33_18.method1070()) {
			local11.method3530();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ai;Lclient!qh;Lclient!pa;IZ)Z")
	public synchronized boolean method3422(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class1_Sub23 arg1, @OriginalArg(2) Class75 arg2) {
		arg1.method2703();
		@Pc(18) int[] local18 = new int[] { 22050 };
		@Pc(20) boolean local20 = true;
		for (@Pc(26) Class1_Sub12 local26 = (Class1_Sub12) arg1.aClass33_12.method1067(); local26 != null; local26 = (Class1_Sub12) arg1.aClass33_12.method1070()) {
			@Pc(32) int local32 = (int) local26.aLong150;
			@Pc(40) Class1_Sub3 local40 = (Class1_Sub3) this.aClass33_18.method1071((long) local32);
			if (local40 == null) {
				local40 = Static52.method1016(local32, arg0);
				if (local40 == null) {
					local20 = false;
					continue;
				}
				this.aClass33_18.method1072((long) local32, local40);
			}
			if (!local40.method141(arg2, local26.aByteArray25, local18)) {
				local20 = false;
			}
		}
		if (local20) {
			arg1.method2705();
		}
		return local20;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)V")
	private void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray638[arg0] = arg1;
		this.anIntArray641[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIII)V")
	private void method3424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) Class1_Sub13 local20 = this.aClass1_Sub13ArrayArray1[arg0][arg2];
		if (local20 == null) {
			return;
		}
		this.aClass1_Sub13ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray642[arg0] & 0x2) == 0) {
			local20.anInt1879 = 0;
			return;
		}
		for (@Pc(48) Class1_Sub13 local48 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method609(); local48 != null; local48 = (Class1_Sub13) this.aClass1_Sub7_Sub1_1.aClass19_3.method615()) {
			if (local48.anInt1867 == local20.anInt1867 && local48.anInt1879 < 0 && local48 != local20) {
				local20.anInt1879 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hg;Z)I")
	private int method3425(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(11) Class80 local11 = arg0.aClass80_1;
		@Pc(27) int local27 = this.anIntArray636[arg0.anInt1867] * this.anIntArray640[arg0.anInt1867] + 4096 >> 13;
		@Pc(35) int local35 = local27 * local27 + 16384 >> 15;
		@Pc(44) int local44 = local35 * arg0.anInt1878 + 16384 >> 15;
		local27 = local44 * this.anInt4612 + 128 >> 8;
		if (local11.anInt3573 > 0) {
			local27 = (int) (Math.pow(0.5D, (double) arg0.anInt1866 * 1.953125E-5D * (double) local11.anInt3573) * (double) local27 + 0.5D);
		}
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(106) int local106;
		@Pc(118) int local118;
		if (local11.aByteArray45 != null) {
			local80 = arg0.anInt1875;
			local88 = local11.aByteArray45[arg0.anInt1860 + 1];
			if (local11.aByteArray45.length - 2 > arg0.anInt1860) {
				local106 = (local11.aByteArray45[arg0.anInt1860] & 0xFF) << 8;
				local118 = (local11.aByteArray45[arg0.anInt1860 + 2] & 0xFF) << 8;
				local88 += (local11.aByteArray45[arg0.anInt1860 + 3] - local88) * (local80 - local106) / (local118 - local106);
			}
			local27 = local88 * local27 + 32 >> 6;
		}
		if (arg0.anInt1879 > 0 && local11.aByteArray44 != null) {
			local80 = arg0.anInt1879;
			local88 = local11.aByteArray44[arg0.anInt1872 + 1];
			if (local11.aByteArray44.length - 2 > arg0.anInt1872) {
				local106 = (local11.aByteArray44[arg0.anInt1872] & 0xFF) << 8;
				local118 = (local11.aByteArray44[arg0.anInt1872 + 2] & 0xFF) << 8;
				local88 += (local11.aByteArray44[arg0.anInt1872 + 3] - local88) * (local80 - local106) / (local118 - local106);
			}
			local27 = local27 * local88 + 32 >> 6;
		}
		return local27;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(II)V")
	public synchronized void method3426(@OriginalArg(0) int arg0) {
		this.anInt4612 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public synchronized void method3427() {
		for (@Pc(11) Class1_Sub3 local11 = (Class1_Sub3) this.aClass33_18.method1067(); local11 != null; local11 = (Class1_Sub3) this.aClass33_18.method1070()) {
			local11.method145();
		}
	}
}
