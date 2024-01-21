import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kf", name = "Hb", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!kf", name = "Ib", descriptor = "I")
	private int anInt2453;

	@OriginalMember(owner = "client!kf", name = "Jb", descriptor = "J")
	private long aLong77;

	@OriginalMember(owner = "client!kf", name = "Kb", descriptor = "I")
	private int anInt2454;

	@OriginalMember(owner = "client!kf", name = "Lb", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "[I")
	private final int[] anIntArray395 = new int[16];

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "[[Lclient!od;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray1 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "[I")
	private final int[] anIntArray398 = new int[16];

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "[I")
	private final int[] anIntArray399 = new int[16];

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
	private final int anInt2428 = 1000000;

	@OriginalMember(owner = "client!kf", name = "db", descriptor = "[I")
	private final int[] anIntArray401 = new int[16];

	@OriginalMember(owner = "client!kf", name = "gb", descriptor = "[I")
	public final int[] anIntArray402 = new int[16];

	@OriginalMember(owner = "client!kf", name = "bb", descriptor = "[I")
	private final int[] anIntArray400 = new int[16];

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "[I")
	private final int[] anIntArray396 = new int[16];

	@OriginalMember(owner = "client!kf", name = "pb", descriptor = "[I")
	private final int[] anIntArray405 = new int[16];

	@OriginalMember(owner = "client!kf", name = "ub", descriptor = "[I")
	private final int[] anIntArray407 = new int[16];

	@OriginalMember(owner = "client!kf", name = "tb", descriptor = "[I")
	private final int[] anIntArray406 = new int[16];

	@OriginalMember(owner = "client!kf", name = "nb", descriptor = "[I")
	public final int[] anIntArray404 = new int[16];

	@OriginalMember(owner = "client!kf", name = "kb", descriptor = "[I")
	private final int[] anIntArray403 = new int[16];

	@OriginalMember(owner = "client!kf", name = "Q", descriptor = "[I")
	public final int[] anIntArray397 = new int[16];

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	private int anInt2423 = 256;

	@OriginalMember(owner = "client!kf", name = "Eb", descriptor = "[[Lclient!od;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray2 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!kf", name = "Cb", descriptor = "[I")
	private final int[] anIntArray408 = new int[16];

	@OriginalMember(owner = "client!kf", name = "Fb", descriptor = "[I")
	private final int[] anIntArray409 = new int[16];

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Lclient!ha;")
	private final Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!kf", name = "Mb", descriptor = "Lclient!kg;")
	private final Class3_Sub3_Sub3 aClass3_Sub3_Sub3_1 = new Class3_Sub3_Sub3(this);

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "Lclient!wf;")
	private final Class87 aClass87_8 = new Class87(128);

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub2() {
		this.method1904();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	private void method1897(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class3_Sub16 local14 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method858(); local14 != null; local14 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method861()) {
			if (arg0 < 0 || arg0 == local14.anInt2870) {
				if (local14.aClass3_Sub3_Sub1_1 != null) {
					local14.aClass3_Sub3_Sub1_1.method465(Static96.anInt4194 / 100);
					if (local14.aClass3_Sub3_Sub1_1.method467()) {
						this.aClass3_Sub3_Sub3_1.aClass3_Sub3_Sub4_1.method2850(local14.aClass3_Sub3_Sub1_1);
					}
					local14.method2250();
				}
				if (local14.anInt2861 < 0) {
					this.aClass3_Sub16ArrayArray2[local14.anInt2870][local14.anInt2864] = null;
				}
				local14.method3167();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
	public synchronized void method1898(@OriginalArg(1) int arg0) {
		this.anInt2423 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)V")
	public synchronized void method1899() {
		this.method1909();
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
	private void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray401[arg1]) {
			this.anIntArray401[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass3_Sub16ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!od;B)I")
	private int method1901(@OriginalArg(0) Class3_Sub16 arg0) {
		@Pc(10) int local10 = this.anIntArray407[arg0.anInt2870];
		return local10 >= 8192 ? 16384 - ((128 - arg0.anInt2855) * (-local10 + 16384) + 32 >> 6) : local10 * arg0.anInt2855 + 32 >> 6;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZII)V")
	private void method1902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)V")
	private void method1903(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (local5 == 128) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method1926(local35, local29, local23);
		} else if (local5 == 144) {
			local23 = arg0 & 0xF;
			local35 = arg0 >> 16 & 0x7F;
			local29 = arg0 >> 8 & 0x7F;
			if (local35 > 0) {
				this.method1919(local23, local35, local29);
			} else {
				this.method1926(64, local29, local23);
			}
		} else if (local5 == 160) {
			local29 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			local35 = arg0 >> 16 & 0x7F;
			this.method1902(local23, local29, local35);
		} else if (local5 == 176) {
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			local23 = arg0 & 0xF;
			if (local29 == 0) {
				this.anIntArray406[local23] = (local35 << 14) + (this.anIntArray406[local23] & 0xFFE03FFF);
			}
			if (local29 == 32) {
				this.anIntArray406[local23] = (local35 << 7) + (this.anIntArray406[local23] & 0xFFFFC07F);
			}
			if (local29 == 1) {
				this.anIntArray409[local23] = (local35 << 7) + (this.anIntArray409[local23] & 0xFFFFC07F);
			}
			if (local29 == 33) {
				this.anIntArray409[local23] = (this.anIntArray409[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 5) {
				this.anIntArray403[local23] = (local35 << 7) + (this.anIntArray403[local23] & 0xFFFFC07F);
			}
			if (local29 == 37) {
				this.anIntArray403[local23] = (this.anIntArray403[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 7) {
				this.anIntArray395[local23] = (local35 << 7) + (this.anIntArray395[local23] & 0xFFFFC07F);
			}
			if (local29 == 39) {
				this.anIntArray395[local23] = (this.anIntArray395[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 10) {
				this.anIntArray407[local23] = (local35 << 7) + (this.anIntArray407[local23] & 0xFFFFC07F);
			}
			if (local29 == 42) {
				this.anIntArray407[local23] = local35 + (this.anIntArray407[local23] & 0xFFFFFF80);
			}
			if (local29 == 11) {
				this.anIntArray408[local23] = (local35 << 7) + (this.anIntArray408[local23] & 0xFFFFC07F);
			}
			if (local29 == 43) {
				this.anIntArray408[local23] = (this.anIntArray408[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 64) {
				if (local35 >= 64) {
					this.anIntArray402[local23] |= 0x1;
				} else {
					this.anIntArray402[local23] &= 0xFFFFFFFE;
				}
			}
			if (local29 == 65) {
				if (local35 < 64) {
					this.method1928(local23);
					this.anIntArray402[local23] &= 0xFFFFFFFD;
				} else {
					this.anIntArray402[local23] |= 0x2;
				}
			}
			if (local29 == 99) {
				this.anIntArray399[local23] = (local35 << 7) + (this.anIntArray399[local23] & 0x7F);
			}
			if (local29 == 98) {
				this.anIntArray399[local23] = local35 + (this.anIntArray399[local23] & 0x3F80);
			}
			if (local29 == 101) {
				this.anIntArray399[local23] = (local35 << 7) + (this.anIntArray399[local23] & 0x7F) + 16384;
			}
			if (local29 == 100) {
				this.anIntArray399[local23] = (this.anIntArray399[local23] & 0x3F80) + local35 + 16384;
			}
			if (local29 == 120) {
				this.method1897(local23);
			}
			if (local29 == 121) {
				this.method1921(local23);
			}
			if (local29 == 123) {
				this.method1907(local23);
			}
			@Pc(514) int local514;
			if (local29 == 6) {
				local514 = this.anIntArray399[local23];
				if (local514 == 16384) {
					this.anIntArray405[local23] = (this.anIntArray405[local23] & 0xFFFFC07F) + (local35 << 7);
				}
			}
			if (local29 == 38) {
				local514 = this.anIntArray399[local23];
				if (local514 == 16384) {
					this.anIntArray405[local23] = (this.anIntArray405[local23] & 0xFFFFFF80) + local35;
				}
			}
			if (local29 == 16) {
				this.anIntArray404[local23] = (this.anIntArray404[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 48) {
				this.anIntArray404[local23] = local35 + (this.anIntArray404[local23] & 0xFFFFFF80);
			}
			if (local29 == 81) {
				if (local35 < 64) {
					this.method1925(local23);
					this.anIntArray402[local23] &= 0xFFFFFFFB;
				} else {
					this.anIntArray402[local23] |= 0x4;
				}
			}
			if (local29 == 17) {
				this.method1913(local23, (this.anIntArray396[local23] & 0xFFFFC07F) + (local35 << 7));
			}
			if (local29 == 49) {
				this.method1913(local23, (this.anIntArray396[local23] & 0xFFFFFF80) + local35);
			}
		} else if (local5 == 192) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method1900(local29 + this.anIntArray406[local23], local23);
		} else if (local5 == 208) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method1914(local23, local29);
		} else if (local5 == 224) {
			local23 = arg0 & 0xF;
			local29 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F01E1) >> 9);
			this.method1912(local23, local29);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method1904();
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
	private void method1904() {
		this.method1897(-1);
		this.method1921(-1);
		for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
			this.anIntArray401[local9] = this.anIntArray398[local9];
		}
		for (@Pc(36) int local36 = 0; local36 < 16; local36++) {
			this.anIntArray406[local36] = this.anIntArray398[local36] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
	public synchronized void method1905() {
		for (@Pc(11) Class3_Sub21 local11 = (Class3_Sub21) this.aClass87_8.method3203(); local11 != null; local11 = (Class3_Sub21) this.aClass87_8.method3199()) {
			local11.method3167();
		}
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(BI)V")
	private void method1907(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method858(); local12 != null; local12 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method861()) {
			if ((arg0 < 0 || local12.anInt2870 == arg0) && local12.anInt2861 < 0) {
				this.aClass3_Sub16ArrayArray2[local12.anInt2870][local12.anInt2864] = null;
				local12.anInt2861 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)Z")
	public synchronized boolean method1908() {
		return this.aClass36_1.method1234();
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "()Lclient!ch;")
	@Override
	public synchronized Class3_Sub3 method2844() {
		return this.aClass3_Sub3_Sub3_1;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(BII)V")
	private void method1909() {
		this.anIntArray398[9] = 128;
		this.anIntArray406[9] = 128;
		this.method1900(128, 9);
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2839(@OriginalArg(0) int arg0) {
		if (this.aClass36_1.method1234()) {
			@Pc(14) int local14 = this.anInt2428 * this.aClass36_1.anInt1561 / Static96.anInt4194;
			do {
				@Pc(23) long local23 = this.aLong77 + (long) arg0 * (long) local14;
				if (this.aLong78 - local23 >= 0L) {
					this.aLong77 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong78 + (long) local14 - this.aLong77 - 1L) / (long) local14);
				this.aLong77 += (long) local14 * (long) local53;
				arg0 -= local53;
				this.aClass3_Sub3_Sub3_1.method2839(local53);
				this.method1918();
			} while (this.aClass36_1.method1234());
		}
		this.aClass3_Sub3_Sub3_1.method2839(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public synchronized void method1911() {
		for (@Pc(19) Class3_Sub21 local19 = (Class3_Sub21) this.aClass87_8.method3203(); local19 != null; local19 = (Class3_Sub21) this.aClass87_8.method3199()) {
			local19.method2891();
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()Lclient!ch;")
	@Override
	public synchronized Class3_Sub3 method2843() {
		return null;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(III)V")
	private void method1912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray400[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIB)V")
	private void method1913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray396[arg0] = arg1;
		this.anIntArray397[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIB)V")
	private void method1914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Lclient!od;B)I")
	private int method1915(@OriginalArg(0) Class3_Sub16 arg0) {
		@Pc(2) Class18 local2 = arg0.aClass18_1;
		@Pc(18) int local18 = this.anIntArray395[arg0.anInt2870] * this.anIntArray408[arg0.anInt2870] + 4096 >> 13;
		@Pc(30) int local30 = local18 * local18 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt2865 + 16384 >> 15;
		local18 = this.anInt2423 * local39 + 128 >> 8;
		if (local2.anInt896 > 0) {
			local18 = (int) ((double) local18 * Math.pow(0.5D, (double) local2.anInt896 * (double) arg0.anInt2877 * 1.953125E-5D) + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (local2.aByteArray8 != null) {
			local75 = arg0.anInt2874;
			local83 = local2.aByteArray8[arg0.anInt2866 + 1];
			if (local2.aByteArray8.length - 2 > arg0.anInt2866) {
				local101 = (local2.aByteArray8[arg0.anInt2866] & 0xFF) << 8;
				local113 = (local2.aByteArray8[arg0.anInt2866 + 2] & 0xFF) << 8;
				local83 += (local75 - local101) * (local2.aByteArray8[arg0.anInt2866 + 3] - local83) / (local113 - local101);
			}
			local18 = local83 * local18 + 32 >> 6;
		}
		if (arg0.anInt2861 > 0 && local2.aByteArray9 != null) {
			local83 = local2.aByteArray9[arg0.anInt2878 + 1];
			local75 = arg0.anInt2861;
			if (arg0.anInt2878 < local2.aByteArray9.length - 2) {
				local101 = (local2.aByteArray9[arg0.anInt2878] & 0xFF) << 8;
				local113 = (local2.aByteArray9[arg0.anInt2878 + 2] & 0xFF) << 8;
				local83 += (local75 - local101) * (local2.aByteArray9[arg0.anInt2878 + 3] - local83) / (local113 - local101);
			}
			local18 = local18 * local83 + 32 >> 6;
		}
		return local18;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZLclient!od;)V")
	public void method1916(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub16 arg1) {
		@Pc(14) int local14 = arg1.aClass3_Sub13_Sub1_1.aByteArray32.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass3_Sub13_Sub1_1.aBoolean130) {
			@Pc(44) int local44 = local14 + local14 - arg1.aClass3_Sub13_Sub1_1.anInt2595;
			local33 = (int) ((long) local44 * (long) this.anIntArray404[arg1.anInt2870] >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				arg1.aClass3_Sub3_Sub1_1.method463();
				local33 = local14 + local14 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray404[arg1.anInt2870] * (long) local14 >> 6);
		}
		arg1.aClass3_Sub3_Sub1_1.method468(local33);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!od;I)Z")
	public boolean method1917(@OriginalArg(0) Class3_Sub16 arg0) {
		if (arg0.aClass3_Sub3_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt2861 >= 0) {
			arg0.method3167();
			if (arg0.anInt2868 > 0 && arg0 == this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868]) {
				this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
	private void method1918() {
		@Pc(8) int local8 = this.anInt2454;
		@Pc(11) long local11 = this.aLong78;
		@Pc(14) int local14 = this.anInt2453;
		while (local14 == this.anInt2453) {
			while (this.aClass36_1.anIntArray275[local8] == local14) {
				this.aClass36_1.method1244(local8);
				@Pc(25) int local25 = this.aClass36_1.method1239(local8);
				if (local25 == 1) {
					this.aClass36_1.method1232();
					this.aClass36_1.method1229(local8);
					if (this.aClass36_1.method1231()) {
						if (!this.aBoolean123 || local14 == 0) {
							this.method1904();
							this.aClass36_1.method1236();
							return;
						}
						this.aClass36_1.method1233(local11);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method1903(local25);
				}
				this.aClass36_1.method1240(local8);
				this.aClass36_1.method1229(local8);
			}
			local8 = this.aClass36_1.method1235();
			local14 = this.aClass36_1.anIntArray275[local8];
			local11 = this.aClass36_1.method1242(local14);
		}
		this.aLong78 = local11;
		this.anInt2453 = local14;
		this.anInt2454 = local8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIB)V")
	private void method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1926(64, arg2, arg0);
		if ((this.anIntArray402[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method857(); local25 != null; local25 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method853()) {
				if (arg0 == local25.anInt2870 && local25.anInt2861 < 0) {
					this.aClass3_Sub16ArrayArray2[arg0][local25.anInt2864] = null;
					this.aClass3_Sub16ArrayArray2[arg0][arg2] = local25;
					@Pc(60) int local60 = local25.anInt2875 + (local25.anInt2858 * local25.anInt2859 >> 12);
					local25.anInt2859 = 4096;
					local25.anInt2875 += arg2 - local25.anInt2864 << 8;
					local25.anInt2864 = arg2;
					local25.anInt2858 = local60 - local25.anInt2875;
					return;
				}
			}
		}
		@Pc(106) Class3_Sub21 local106 = (Class3_Sub21) this.aClass87_8.method3201((long) this.anIntArray401[arg0]);
		if (local106 == null) {
			return;
		}
		@Pc(114) Class3_Sub13_Sub1 local114 = local106.aClass3_Sub13_Sub1Array1[arg2];
		if (local114 == null) {
			return;
		}
		@Pc(132) Class3_Sub16 local132 = new Class3_Sub16();
		local132.aClass3_Sub21_1 = local106;
		local132.aClass3_Sub13_Sub1_1 = local114;
		local132.anInt2870 = arg0;
		local132.aClass18_1 = local106.aClass18Array1[arg2];
		local132.anInt2868 = local106.aByteArray38[arg2];
		local132.anInt2864 = arg2;
		local132.anInt2865 = local106.anInt3781 * arg1 * arg1 * local106.aByteArray37[arg2] + 1024 >> 11;
		local132.anInt2855 = local106.aByteArray36[arg2] & 0xFF;
		local132.anInt2875 = (arg2 << 8) - (local106.aShortArray35[arg2] & 0x7FFF);
		local132.anInt2878 = 0;
		local132.anInt2861 = -1;
		local132.anInt2874 = 0;
		local132.anInt2877 = 0;
		local132.anInt2866 = 0;
		if (this.anIntArray404[arg0] == 0) {
			local132.aClass3_Sub3_Sub1_1 = Static183.method451(local114, this.method1920(local132), this.method1915(local132), this.method1901(local132));
		} else {
			local132.aClass3_Sub3_Sub1_1 = Static183.method451(local114, this.method1920(local132), 0, this.method1901(local132));
			this.method1916(local106.aShortArray35[arg2] < 0, local132);
		}
		if (local106.aShortArray35[arg2] < 0) {
			local132.aClass3_Sub3_Sub1_1.method460(-1);
		}
		if (local132.anInt2868 >= 0) {
			@Pc(276) Class3_Sub16 local276 = this.aClass3_Sub16ArrayArray1[arg0][local132.anInt2868];
			if (local276 != null && local276.anInt2861 < 0) {
				this.aClass3_Sub16ArrayArray2[arg0][local276.anInt2864] = null;
				local276.anInt2861 = 0;
			}
			this.aClass3_Sub16ArrayArray1[arg0][local132.anInt2868] = local132;
		}
		this.aClass3_Sub3_Sub3_1.aClass23_9.method850(local132);
		this.aClass3_Sub16ArrayArray2[arg0][arg2] = local132;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!od;)I")
	private int method1920(@OriginalArg(1) Class3_Sub16 arg0) {
		@Pc(16) int local16 = arg0.anInt2875 + (arg0.anInt2859 * arg0.anInt2858 >> 12);
		local16 += (this.anIntArray400[arg0.anInt2870] - 8192) * this.anIntArray405[arg0.anInt2870] >> 12;
		@Pc(41) Class18 local41 = arg0.aClass18_1;
		@Pc(61) int local61;
		if (local41.anInt898 > 0 && (local41.anInt895 > 0 || this.anIntArray409[arg0.anInt2870] > 0)) {
			local61 = local41.anInt895 << 2;
			@Pc(66) int local66 = local41.anInt899 << 1;
			if (arg0.anInt2863 < local66) {
				local61 = local61 * arg0.anInt2863 / local66;
			}
			local61 += this.anIntArray409[arg0.anInt2870] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt2867 & 0x1FF) * 0.01227184630308513D);
			local16 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass3_Sub13_Sub1_1.anInt2597 * 256) * Math.pow(2.0D, (double) local16 * 3.255208333333333E-4D) / (double) Static96.anInt4194 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)V")
	private void method1921(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method1921(local10);
			}
			return;
		}
		this.anIntArray395[arg0] = 12800;
		this.anIntArray407[arg0] = 8192;
		this.anIntArray408[arg0] = 16383;
		this.anIntArray400[arg0] = 8192;
		this.anIntArray409[arg0] = 0;
		this.anIntArray403[arg0] = 8192;
		this.method1928(arg0);
		this.method1925(arg0);
		this.anIntArray402[arg0] = 0;
		this.anIntArray399[arg0] = 32767;
		this.anIntArray405[arg0] = 256;
		this.anIntArray404[arg0] = 0;
		this.method1913(arg0, 8192);
	}

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)I")
	public int method1923() {
		return this.anInt2423;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ah;ILclient!qd;Lclient!hg;I)Z")
	public synchronized boolean method1924(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class3_Sub9 arg2) {
		arg2.method1411();
		@Pc(18) int[] local18 = new int[] { 22050 };
		@Pc(20) boolean local20 = true;
		for (@Pc(31) Class3_Sub14 local31 = (Class3_Sub14) arg2.aClass87_7.method3203(); local31 != null; local31 = (Class3_Sub14) arg2.aClass87_7.method3199()) {
			@Pc(37) int local37 = (int) local31.aLong144;
			@Pc(45) Class3_Sub21 local45 = (Class3_Sub21) this.aClass87_8.method3201((long) local37);
			if (local45 == null) {
				local45 = Static59.method1333(arg0, local37);
				if (local45 == null) {
					local20 = false;
					continue;
				}
				this.aClass87_8.method3200((long) local37, local45);
			}
			if (!local45.method2894(local18, arg1, local31.aByteArray33)) {
				local20 = false;
			}
		}
		if (local20) {
			arg2.method1412();
		}
		return local20;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)V")
	private void method1925(@OriginalArg(0) int arg0) {
		if ((this.anIntArray402[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class3_Sub16 local16 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method858(); local16 != null; local16 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method861()) {
			if (local16.anInt2870 == arg0) {
				local16.anInt2873 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass36_1.method1234()) {
			@Pc(18) int local18 = this.aClass36_1.anInt1561 * this.anInt2428 / Static96.anInt4194;
			do {
				@Pc(28) long local28 = this.aLong77 + (long) arg2 * (long) local18;
				if (this.aLong78 - local28 >= 0L) {
					this.aLong77 = local28;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong78 - this.aLong77 - 1L) / (long) local18);
				this.aLong77 += (long) local56 * (long) local18;
				arg2 -= local56;
				this.aClass3_Sub3_Sub3_1.method2838(arg0, arg1, local56);
				arg1 += local56;
				this.method1918();
			} while (this.aClass36_1.method1234());
		}
		this.aClass3_Sub3_Sub3_1.method2838(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
	private void method1926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub16 local12 = this.aClass3_Sub16ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub16ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray402[arg2] & 0x2) == 0) {
			local12.anInt2861 = 0;
			return;
		}
		for (@Pc(44) Class3_Sub16 local44 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method858(); local44 != null; local44 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method861()) {
			if (local44.anInt2870 == local12.anInt2870 && local44.anInt2861 < 0 && local44 != local12) {
				local12.anInt2861 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!hg;ZZ)V")
	public synchronized void method1927(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) boolean arg1) {
		this.method1930();
		this.aClass36_1.method1237(arg0.aByteArray18);
		this.aLong77 = 0L;
		this.aBoolean123 = arg1;
		@Pc(27) int local27 = this.aClass36_1.method1241();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass36_1.method1244(local29);
			this.aClass36_1.method1240(local29);
			this.aClass36_1.method1229(local29);
		}
		this.anInt2454 = this.aClass36_1.method1235();
		this.anInt2453 = this.aClass36_1.anIntArray275[this.anInt2454];
		this.aLong78 = this.aClass36_1.method1242(this.anInt2453);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2841() {
		return 0;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(II)V")
	private void method1928(@OriginalArg(1) int arg0) {
		if ((this.anIntArray402[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method858(); local25 != null; local25 = (Class3_Sub16) this.aClass3_Sub3_Sub3_1.aClass23_9.method861()) {
			if (arg0 == local25.anInt2870 && this.aClass3_Sub16ArrayArray2[arg0][local25.anInt2864] == null && local25.anInt2861 < 0) {
				local25.anInt2861 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!od;[III)Z")
	public boolean method1929(@OriginalArg(1) Class3_Sub16 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt2879 = Static96.anInt4194 / 100;
		if (arg0.anInt2861 >= 0 && (arg0.aClass3_Sub3_Sub1_1 == null || arg0.aClass3_Sub3_Sub1_1.method443())) {
			arg0.method2250();
			arg0.method3167();
			if (arg0.anInt2868 > 0 && arg0 == this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868]) {
				this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt2859;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray403[arg0.anInt2870] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt2859 = local53;
		}
		arg0.aClass3_Sub3_Sub1_1.method447(this.method1920(arg0));
		@Pc(93) Class18 local93 = arg0.aClass18_1;
		arg0.anInt2863++;
		@Pc(117) double local117 = (double) ((arg0.anInt2858 * arg0.anInt2859 >> 12) + (arg0.anInt2864 - 60 << 8)) * 5.086263020833333E-6D;
		arg0.anInt2867 += local93.anInt898;
		@Pc(134) boolean local134 = false;
		if (local93.anInt896 > 0) {
			if (local93.anInt902 > 0) {
				arg0.anInt2877 += (int) (Math.pow(2.0D, (double) local93.anInt902 * local117) * 128.0D + 0.5D);
			} else {
				arg0.anInt2877 += 128;
			}
			if (arg0.anInt2877 * local93.anInt896 >= 819200) {
				local134 = true;
			}
		}
		if (local93.aByteArray8 != null) {
			if (local93.anInt903 > 0) {
				arg0.anInt2874 += (int) (Math.pow(2.0D, local117 * (double) local93.anInt903) * 128.0D + 0.5D);
			} else {
				arg0.anInt2874 += 128;
			}
			while (arg0.anInt2866 < local93.aByteArray8.length - 2 && arg0.anInt2874 > (local93.aByteArray8[arg0.anInt2866 + 2] & 0xFF) << 8) {
				arg0.anInt2866 += 2;
			}
			if (local93.aByteArray8.length - 2 == arg0.anInt2866 && local93.aByteArray8[arg0.anInt2866 + 1] == 0) {
				local134 = true;
			}
		}
		if (arg0.anInt2861 >= 0 && local93.aByteArray9 != null && (this.anIntArray402[arg0.anInt2870] & 0x1) == 0 && (arg0.anInt2868 < 0 || this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868] != arg0)) {
			if (local93.anInt897 > 0) {
				arg0.anInt2861 += (int) (Math.pow(2.0D, (double) local93.anInt897 * local117) * 128.0D + 0.5D);
			} else {
				arg0.anInt2861 += 128;
			}
			while (arg0.anInt2878 < local93.aByteArray9.length - 2 && arg0.anInt2861 > (local93.aByteArray9[arg0.anInt2878 + 2] & 0xFF) << 8) {
				arg0.anInt2878 += 2;
			}
			if (local93.aByteArray9.length - 2 == arg0.anInt2878) {
				local134 = true;
			}
		}
		if (!local134) {
			arg0.aClass3_Sub3_Sub1_1.method433(arg0.anInt2879, this.method1915(arg0), this.method1901(arg0));
			return false;
		}
		arg0.aClass3_Sub3_Sub1_1.method465(arg0.anInt2879);
		if (arg1 == null) {
			arg0.aClass3_Sub3_Sub1_1.method2839(arg2);
		} else {
			arg0.aClass3_Sub3_Sub1_1.method2838(arg1, arg3, arg2);
		}
		if (arg0.aClass3_Sub3_Sub1_1.method467()) {
			this.aClass3_Sub3_Sub3_1.aClass3_Sub3_Sub4_1.method2850(arg0.aClass3_Sub3_Sub1_1);
		}
		arg0.method2250();
		if (arg0.anInt2861 >= 0) {
			arg0.method3167();
			if (arg0.anInt2868 > 0 && this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868] == arg0) {
				this.aClass3_Sub16ArrayArray1[arg0.anInt2870][arg0.anInt2868] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
	public synchronized void method1930() {
		this.aClass36_1.method1236();
		this.method1904();
	}
}
