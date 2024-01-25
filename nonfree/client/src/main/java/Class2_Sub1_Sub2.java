import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!br", name = "zb", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!br", name = "Ab", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!br", name = "Db", descriptor = "Z")
	private boolean aBoolean65;

	@OriginalMember(owner = "client!br", name = "Eb", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!br", name = "Gb", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!br", name = "Ib", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!br", name = "Jb", descriptor = "Lclient!nd;")
	private Class2_Sub32 aClass2_Sub32_1;

	@OriginalMember(owner = "client!br", name = "Kb", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!br", name = "p", descriptor = "[I")
	private final int[] anIntArray67 = new int[16];

	@OriginalMember(owner = "client!br", name = "s", descriptor = "[[Lclient!er;")
	private final Class2_Sub16[][] aClass2_Sub16ArrayArray1 = new Class2_Sub16[16][128];

	@OriginalMember(owner = "client!br", name = "M", descriptor = "[I")
	private final int[] anIntArray72 = new int[16];

	@OriginalMember(owner = "client!br", name = "V", descriptor = "[I")
	private final int[] anIntArray75 = new int[16];

	@OriginalMember(owner = "client!br", name = "X", descriptor = "I")
	private final int anInt731 = 1000000;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "[I")
	private final int[] anIntArray69 = new int[16];

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	private int anInt715 = 256;

	@OriginalMember(owner = "client!br", name = "T", descriptor = "[I")
	private final int[] anIntArray74 = new int[16];

	@OriginalMember(owner = "client!br", name = "t", descriptor = "[I")
	private final int[] anIntArray68 = new int[16];

	@OriginalMember(owner = "client!br", name = "O", descriptor = "[I")
	private final int[] anIntArray73 = new int[16];

	@OriginalMember(owner = "client!br", name = "nb", descriptor = "[I")
	public final int[] anIntArray78 = new int[16];

	@OriginalMember(owner = "client!br", name = "qb", descriptor = "[I")
	private final int[] anIntArray79 = new int[16];

	@OriginalMember(owner = "client!br", name = "db", descriptor = "[[Lclient!er;")
	private final Class2_Sub16[][] aClass2_Sub16ArrayArray2 = new Class2_Sub16[16][128];

	@OriginalMember(owner = "client!br", name = "ib", descriptor = "[I")
	private final int[] anIntArray77 = new int[16];

	@OriginalMember(owner = "client!br", name = "ub", descriptor = "[I")
	private final int[] anIntArray81 = new int[16];

	@OriginalMember(owner = "client!br", name = "sb", descriptor = "[I")
	private final int[] anIntArray80 = new int[16];

	@OriginalMember(owner = "client!br", name = "hb", descriptor = "[I")
	public final int[] anIntArray76 = new int[16];

	@OriginalMember(owner = "client!br", name = "H", descriptor = "[I")
	private final int[] anIntArray71 = new int[16];

	@OriginalMember(owner = "client!br", name = "x", descriptor = "[I")
	private final int[] anIntArray70 = new int[16];

	@OriginalMember(owner = "client!br", name = "wb", descriptor = "[I")
	public final int[] anIntArray82 = new int[16];

	@OriginalMember(owner = "client!br", name = "cb", descriptor = "Lclient!fr;")
	private final Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!br", name = "Fb", descriptor = "Lclient!ab;")
	private final Class2_Sub1_Sub1 aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1(this);

	@OriginalMember(owner = "client!br", name = "C", descriptor = "Lclient!ew;")
	private final Class72 aClass72_8 = new Class72(128);

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub2() {
		this.method578();
		this.method597(true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BLclient!er;)I")
	private int method570(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(14) int local14 = arg0.anInt1926 + (arg0.anInt1936 * arg0.anInt1922 >> 12);
		local14 += (this.anIntArray69[arg0.anInt1932] - 8192) * this.anIntArray81[arg0.anInt1932] >> 12;
		@Pc(41) Class221 local41 = arg0.aClass221_1;
		@Pc(64) int local64;
		if (local41.anInt6090 > 0 && (local41.anInt6083 > 0 || this.anIntArray79[arg0.anInt1932] > 0)) {
			local64 = local41.anInt6083 << 2;
			@Pc(69) int local69 = local41.anInt6084 << 1;
			if (local69 > arg0.anInt1920) {
				local64 = arg0.anInt1920 * local64 / local69;
			}
			local64 += this.anIntArray79[arg0.anInt1932] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt1919 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass2_Sub22_Sub1_2.anInt2622 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static333.anInt5628 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3229(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass81_1.method1824()) {
			@Pc(14) int local14 = this.aClass81_1.anInt2229 * this.anInt731 / Static333.anInt5628;
			do {
				@Pc(24) long local24 = this.aLong24 + (long) local14 * (long) arg2;
				if (this.aLong25 - local24 >= 0L) {
					this.aLong24 = local24;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local14 + this.aLong25 - this.aLong24 - 1L) / (long) local14);
				this.aLong24 += (long) local55 * (long) local14;
				this.aClass2_Sub1_Sub1_1.method3229(arg0, arg1, local55);
				arg2 -= local55;
				this.method575();
				arg1 += local55;
			} while (this.aClass81_1.method1824());
		}
		this.aClass2_Sub1_Sub1_1.method3229(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BI)V")
	private void method571(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
				this.method571(local17);
			}
			return;
		}
		this.anIntArray71[arg0] = 12800;
		this.anIntArray77[arg0] = 8192;
		this.anIntArray72[arg0] = 16383;
		this.anIntArray69[arg0] = 8192;
		this.anIntArray79[arg0] = 0;
		this.anIntArray68[arg0] = 8192;
		this.method596(arg0);
		this.method573(arg0);
		this.anIntArray76[arg0] = 0;
		this.anIntArray70[arg0] = 32767;
		this.anIntArray81[arg0] = 256;
		this.anIntArray82[arg0] = 0;
		this.method591(arg0, 8192);
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(B)V")
	public synchronized void method572() {
		this.method604(true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)V")
	private void method573(@OriginalArg(1) int arg0) {
		if ((this.anIntArray76[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class2_Sub16 local22 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3155(); local22 != null; local22 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3150()) {
			if (arg0 == local22.anInt1932) {
				local22.anInt1934 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V")
	public synchronized void method574(@OriginalArg(1) int arg0) {
		this.anInt715 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
	private void method575() {
		@Pc(8) int local8 = this.anInt749;
		@Pc(11) int local11 = this.anInt750;
		@Pc(19) long local19 = this.aLong25;
		if (this.aClass2_Sub32_1 != null && local11 == this.anInt752) {
			this.method576(this.aBoolean66, this.aClass2_Sub32_1, this.aBoolean65);
			this.method575();
			return;
		}
		while (this.anInt750 == local11) {
			while (local11 == this.aClass81_1.anIntArray176[local8]) {
				this.aClass81_1.method1828(local8);
				@Pc(48) int local48 = this.aClass81_1.method1825(local8);
				if (local48 == 1) {
					this.aClass81_1.method1823();
					this.aClass81_1.method1822(local8);
					if (this.aClass81_1.method1818()) {
						if (this.aClass2_Sub32_1 != null) {
							this.method577(this.aBoolean65, this.aClass2_Sub32_1);
							this.method575();
							return;
						}
						if (!this.aBoolean65 || local11 == 0) {
							this.method597(true);
							this.aClass81_1.method1831();
							return;
						}
						this.aClass81_1.method1830(local19);
					}
					break;
				}
				if ((local48 & 0x80) != 0) {
					this.method579(local48);
				}
				this.aClass81_1.method1826(local8);
				this.aClass81_1.method1822(local8);
			}
			local8 = this.aClass81_1.method1819();
			local11 = this.aClass81_1.anIntArray176[local8];
			local19 = this.aClass81_1.method1820(local11);
		}
		this.anInt749 = local8;
		this.anInt750 = local11;
		this.aLong25 = local19;
		if (this.aClass2_Sub32_1 != null && local11 > this.anInt752) {
			this.anInt749 = -1;
			this.anInt750 = this.anInt752;
			this.aLong25 = this.aClass81_1.method1820(this.anInt750);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "()I")
	@Override
	public synchronized int method3223() {
		return 0;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZLclient!nd;Z)V")
	private synchronized void method576(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub32 arg1, @OriginalArg(3) boolean arg2) {
		this.method604(arg0);
		this.aClass81_1.method1821(arg1.aByteArray51);
		this.aBoolean65 = arg2;
		this.aLong24 = 0L;
		@Pc(28) int local28 = this.aClass81_1.method1829();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass81_1.method1828(local30);
			this.aClass81_1.method1826(local30);
			this.aClass81_1.method1822(local30);
		}
		this.anInt749 = this.aClass81_1.method1819();
		this.anInt750 = this.aClass81_1.anIntArray176[this.anInt749];
		this.aLong25 = this.aClass81_1.method1820(this.anInt750);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZILclient!nd;)V")
	public synchronized void method577(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub32 arg1) {
		this.method576(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	private synchronized void method578() {
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.anIntArray80[local25] = 256;
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(BI)V")
	private void method579(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method603(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method603(local18, local24, 64);
			} else {
				this.method593(local24, local30, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method602(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray67[local18] = (local30 << 14) + (this.anIntArray67[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray67[local18] = (this.anIntArray67[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray79[local18] = (this.anIntArray79[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray79[local18] = (this.anIntArray79[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray68[local18] = (this.anIntArray68[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray68[local18] = (this.anIntArray68[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray71[local18] = (local30 << 7) + (this.anIntArray71[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray71[local18] = local30 + (this.anIntArray71[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray77[local18] = (local30 << 7) + (this.anIntArray77[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray77[local18] = local30 + (this.anIntArray77[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray72[local18] = (local30 << 7) + (this.anIntArray72[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray72[local18] = (this.anIntArray72[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray76[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray76[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method596(local18);
					this.anIntArray76[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray76[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray70[local18] = (local30 << 7) + (this.anIntArray70[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray70[local18] = (this.anIntArray70[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray70[local18] = (this.anIntArray70[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray70[local18] = (this.anIntArray70[local18] & 0x3F80) + (local30 + 16384);
			}
			if (local24 == 120) {
				this.method586(local18);
			}
			if (local24 == 121) {
				this.method571(local18);
			}
			if (local24 == 123) {
				this.method592(local18);
			}
			@Pc(501) int local501;
			if (local24 == 6) {
				local501 = this.anIntArray70[local18];
				if (local501 == 16384) {
					this.anIntArray81[local18] = (local30 << 7) + (this.anIntArray81[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local501 = this.anIntArray70[local18];
				if (local501 == 16384) {
					this.anIntArray81[local18] = (this.anIntArray81[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray82[local18] = (local30 << 7) + (this.anIntArray82[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray82[local18] = local30 + (this.anIntArray82[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray76[local18] |= 0x4;
				} else {
					this.method573(local18);
					this.anIntArray76[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method591(local18, (this.anIntArray75[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method591(local18, local30 + (this.anIntArray75[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method607(this.anIntArray67[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method580(local24, local18);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method584(local24, local30);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method597(true);
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(III)V")
	private void method580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(BLclient!er;)Z")
	public boolean method581(@OriginalArg(1) Class2_Sub16 arg0) {
		if (arg0.aClass2_Sub1_Sub3_2 != null) {
			return false;
		}
		if (arg0.anInt1931 >= 0) {
			arg0.method5703();
			if (arg0.anInt1923 > 0 && arg0 == this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923]) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(BII)V")
	private void method584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray69[arg0] = arg1;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(III)V")
	public synchronized void method585() {
		this.method606();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IB)V")
	private void method586(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub16 local8 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3155(); local8 != null; local8 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3150()) {
			if (arg0 < 0 || local8.anInt1932 == arg0) {
				if (local8.aClass2_Sub1_Sub3_2 != null) {
					local8.aClass2_Sub1_Sub3_2.method1566(Static333.anInt5628 / 100);
					if (local8.aClass2_Sub1_Sub3_2.method1567()) {
						this.aClass2_Sub1_Sub1_1.aClass2_Sub1_Sub4_1.method3232(local8.aClass2_Sub1_Sub3_2);
					}
					local8.method1554();
				}
				if (local8.anInt1931 < 0) {
					this.aClass2_Sub16ArrayArray1[local8.anInt1932][local8.anInt1937] = null;
				}
				local8.method5703();
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLclient!er;I)V")
	public void method587(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		@Pc(12) int local12 = arg1.aClass2_Sub22_Sub1_2.aByteArray18.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass2_Sub22_Sub1_2.aBoolean170) {
			@Pc(42) int local42 = local12 + local12 - arg1.aClass2_Sub22_Sub1_2.anInt2623;
			local31 = (int) ((long) this.anIntArray82[arg1.anInt1932] * (long) local42 >> 6);
			local12 <<= 0x8;
			if (local31 >= local12) {
				local31 = local12 + local12 - local31 - 1;
				arg1.aClass2_Sub1_Sub3_2.method1571();
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray82[arg1.anInt1932] >> 6);
		}
		arg1.aClass2_Sub1_Sub3_2.method1575(local31);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!er;I)I")
	private int method588(@OriginalArg(0) Class2_Sub16 arg0) {
		@Pc(15) int local15 = this.anIntArray77[arg0.anInt1932];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt1928) * (-local15 + 16384) + 32 >> 6) : arg0.anInt1928 * local15 + 32 >> 6;
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(B)V")
	public synchronized void method590() {
		for (@Pc(7) Class2_Sub23 local7 = (Class2_Sub23) this.aClass72_8.method1655(); local7 != null; local7 = (Class2_Sub23) this.aClass72_8.method1649()) {
			local7.method2201();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZ)V")
	private void method591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray75[arg0] = arg1;
		this.anIntArray78[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	private void method592(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub16 local8 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3155(); local8 != null; local8 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3150()) {
			if ((arg0 < 0 || local8.anInt1932 == arg0) && local8.anInt1931 < 0) {
				this.aClass2_Sub16ArrayArray1[local8.anInt1932][local8.anInt1937] = null;
				local8.anInt1931 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIII)V")
	private void method593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method603(arg2, arg0, 64);
		if ((this.anIntArray76[arg2] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub16 local30 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3163(); local30 != null; local30 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3160()) {
				if (arg2 == local30.anInt1932 && local30.anInt1931 < 0) {
					this.aClass2_Sub16ArrayArray1[arg2][local30.anInt1937] = null;
					this.aClass2_Sub16ArrayArray1[arg2][arg0] = local30;
					@Pc(65) int local65 = local30.anInt1926 + (local30.anInt1922 * local30.anInt1936 >> 12);
					local30.anInt1926 += arg0 - local30.anInt1937 << 8;
					local30.anInt1936 = local65 - local30.anInt1926;
					local30.anInt1937 = arg0;
					local30.anInt1922 = 4096;
					return;
				}
			}
		}
		@Pc(111) Class2_Sub23 local111 = (Class2_Sub23) this.aClass72_8.method1659((long) this.anIntArray73[arg2]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class2_Sub22_Sub1 local119 = local111.aClass2_Sub22_Sub1Array1[arg0];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class2_Sub16 local126 = new Class2_Sub16();
		local126.aClass2_Sub23_1 = local111;
		local126.anInt1932 = arg2;
		local126.aClass2_Sub22_Sub1_2 = local119;
		local126.aClass221_1 = local111.aClass221Array1[arg0];
		local126.anInt1923 = local111.aByteArray19[arg0];
		local126.anInt1937 = arg0;
		local126.anInt1938 = local111.aByteArray21[arg0] * local111.anInt2679 * arg1 * arg1 + 1024 >> 11;
		local126.anInt1928 = local111.aByteArray20[arg0] & 0xFF;
		local126.anInt1926 = (arg0 << 8) - (local111.aShortArray15[arg0] & 0x7FFF);
		local126.anInt1927 = 0;
		local126.anInt1921 = 0;
		local126.anInt1930 = 0;
		local126.anInt1931 = -1;
		local126.anInt1929 = 0;
		if (this.anIntArray82[arg2] == 0) {
			local126.aClass2_Sub1_Sub3_2 = Static462.method1581(local119, this.method570(local126), this.method594(local126), this.method588(local126));
		} else {
			local126.aClass2_Sub1_Sub3_2 = Static462.method1581(local119, this.method570(local126), 0, this.method588(local126));
			this.method587(local111.aShortArray15[arg0] < 0, local126);
		}
		if (local111.aShortArray15[arg0] < 0) {
			local126.aClass2_Sub1_Sub3_2.method1598(-1);
		}
		if (local126.anInt1923 >= 0) {
			@Pc(282) Class2_Sub16 local282 = this.aClass2_Sub16ArrayArray2[arg2][local126.anInt1923];
			if (local282 != null && local282.anInt1931 < 0) {
				this.aClass2_Sub16ArrayArray1[arg2][local282.anInt1937] = null;
				local282.anInt1931 = 0;
			}
			this.aClass2_Sub16ArrayArray2[arg2][local126.anInt1923] = local126;
		}
		this.aClass2_Sub1_Sub1_1.aClass156_2.method3157(local126);
		this.aClass2_Sub16ArrayArray1[arg2][arg0] = local126;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!er;Z)I")
	private int method594(@OriginalArg(0) Class2_Sub16 arg0) {
		if (this.anIntArray80[arg0.anInt1932] == 0) {
			return 0;
		}
		@Pc(22) Class221 local22 = arg0.aClass221_1;
		@Pc(38) int local38 = this.anIntArray71[arg0.anInt1932] * this.anIntArray72[arg0.anInt1932] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt1938 * local46 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt715 * local55 + 128 >> 8;
		local38 = local64 * this.anIntArray80[arg0.anInt1932] + 128 >> 8;
		if (local22.anInt6081 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) local22.anInt6081 * 1.953125E-5D * (double) arg0.anInt1930) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local22.aByteArray77 != null) {
			local103 = arg0.anInt1927;
			local111 = local22.aByteArray77[arg0.anInt1929 + 1];
			if (local22.aByteArray77.length - 2 > arg0.anInt1929) {
				local133 = (local22.aByteArray77[arg0.anInt1929] & 0xFF) << 8;
				local145 = (local22.aByteArray77[arg0.anInt1929 + 2] & 0xFF) << 8;
				local111 += (local22.aByteArray77[arg0.anInt1929 + 3] - local111) * (local103 + -local133) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		if (arg0.anInt1931 > 0 && local22.aByteArray78 != null) {
			local103 = arg0.anInt1931;
			local111 = local22.aByteArray78[arg0.anInt1921 + 1];
			if (arg0.anInt1921 < local22.aByteArray78.length - 2) {
				local133 = (local22.aByteArray78[arg0.anInt1921] & 0xFF) << 8;
				local145 = (local22.aByteArray78[arg0.anInt1921 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (local22.aByteArray78[arg0.anInt1921 - -3] + -local111) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(II)V")
	private void method596(@OriginalArg(1) int arg0) {
		if ((this.anIntArray76[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub16 local23 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3155(); local23 != null; local23 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3150()) {
			if (arg0 == local23.anInt1932 && this.aClass2_Sub16ArrayArray1[arg0][local23.anInt1937] == null && local23.anInt1931 < 0) {
				local23.anInt1931 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IZ)V")
	private void method597(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method586(-1);
		} else {
			this.method592(-1);
		}
		this.method571(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray73[local23] = this.anIntArray74[local23];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray67[local47] = this.anIntArray74[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "()Lclient!oo;")
	@Override
	public synchronized Class2_Sub1 method3226() {
		return null;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!dk;Lclient!sp;ILclient!nd;I)Z")
	public synchronized boolean method598(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class227 arg1, @OriginalArg(3) Class2_Sub32 arg2) {
		arg2.method3527();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub39 local34 = (Class2_Sub39) arg2.aClass72_32.method1655(); local34 != null; local34 = (Class2_Sub39) arg2.aClass72_32.method1649()) {
			@Pc(40) int local40 = (int) local34.aLong225;
			@Pc(48) Class2_Sub23 local48 = (Class2_Sub23) this.aClass72_8.method1659((long) local40);
			if (local48 == null) {
				local48 = Static303.method4018(arg0, local40);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass72_8.method1653(local48, (long) local40);
			}
			if (!local48.method2202(local34.aByteArray79, local23, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method3529();
		}
		return local9;
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(B)I")
	public int method599() {
		return this.anInt715;
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(I)Z")
	public synchronized boolean method600() {
		return this.aClass81_1.method1824();
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!er;[IIII)Z")
	public boolean method601(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1939 = Static333.anInt5628 / 100;
		if (arg0.anInt1931 >= 0 && (arg0.aClass2_Sub1_Sub3_2 == null || arg0.aClass2_Sub1_Sub3_2.method1573())) {
			arg0.method1554();
			arg0.method5703();
			if (arg0.anInt1923 > 0 && arg0 == this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923]) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923] = null;
			}
			return true;
		}
		@Pc(64) int local64 = arg0.anInt1922;
		if (local64 > 0) {
			local64 -= (int) (Math.pow(2.0D, (double) this.anIntArray68[arg0.anInt1932] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local64 < 0) {
				local64 = 0;
			}
			arg0.anInt1922 = local64;
		}
		arg0.aClass2_Sub1_Sub3_2.method1605(this.method570(arg0));
		@Pc(107) Class221 local107 = arg0.aClass221_1;
		arg0.anInt1920++;
		@Pc(115) boolean local115 = false;
		arg0.anInt1919 += local107.anInt6090;
		@Pc(140) double local140 = (double) ((arg0.anInt1937 - 60 << 8) + (arg0.anInt1922 * arg0.anInt1936 >> 12)) * 5.086263020833333E-6D;
		if (local107.anInt6081 > 0) {
			if (local107.anInt6086 <= 0) {
				arg0.anInt1930 += 128;
			} else {
				arg0.anInt1930 += (int) (Math.pow(2.0D, local140 * (double) local107.anInt6086) * 128.0D + 0.5D);
			}
			if (local107.anInt6081 * arg0.anInt1930 >= 819200) {
				local115 = true;
			}
		}
		if (local107.aByteArray77 != null) {
			if (local107.anInt6088 <= 0) {
				arg0.anInt1927 += 128;
			} else {
				arg0.anInt1927 += (int) (Math.pow(2.0D, (double) local107.anInt6088 * local140) * 128.0D + 0.5D);
			}
			while (arg0.anInt1929 < local107.aByteArray77.length - 2 && (local107.aByteArray77[arg0.anInt1929 + 2] & 0xFF) << 8 < arg0.anInt1927) {
				arg0.anInt1929 += 2;
			}
			if (arg0.anInt1929 == local107.aByteArray77.length - 2 && local107.aByteArray77[arg0.anInt1929 + 1] == 0) {
				local115 = true;
			}
		}
		if (arg0.anInt1931 >= 0 && local107.aByteArray78 != null && (this.anIntArray76[arg0.anInt1932] & 0x1) == 0 && (arg0.anInt1923 < 0 || arg0 != this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923])) {
			if (local107.anInt6085 > 0) {
				arg0.anInt1931 += (int) (Math.pow(2.0D, (double) local107.anInt6085 * local140) * 128.0D + 0.5D);
			} else {
				arg0.anInt1931 += 128;
			}
			while (arg0.anInt1921 < local107.aByteArray78.length - 2 && (local107.aByteArray78[arg0.anInt1921 + 2] & 0xFF) << 8 < arg0.anInt1931) {
				arg0.anInt1921 += 2;
			}
			if (local107.aByteArray78.length - 2 == arg0.anInt1921) {
				local115 = true;
			}
		}
		if (!local115) {
			arg0.aClass2_Sub1_Sub3_2.method1597(arg0.anInt1939, this.method594(arg0), this.method588(arg0));
			return false;
		}
		arg0.aClass2_Sub1_Sub3_2.method1566(arg0.anInt1939);
		if (arg1 == null) {
			arg0.aClass2_Sub1_Sub3_2.method3228(arg2);
		} else {
			arg0.aClass2_Sub1_Sub3_2.method3229(arg1, arg3, arg2);
		}
		if (arg0.aClass2_Sub1_Sub3_2.method1567()) {
			this.aClass2_Sub1_Sub1_1.aClass2_Sub1_Sub4_1.method3232(arg0.aClass2_Sub1_Sub3_2);
		}
		arg0.method1554();
		if (arg0.anInt1931 >= 0) {
			arg0.method5703();
			if (arg0.anInt1923 > 0 && arg0 == this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923]) {
				this.aClass2_Sub16ArrayArray2[arg0.anInt1932][arg0.anInt1923] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(IIII)V")
	private void method602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(IIII)V")
	private void method603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub16 local12 = this.aClass2_Sub16ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub16ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray76[arg0] & 0x2) == 0) {
			local12.anInt1931 = 0;
			return;
		}
		for (@Pc(38) Class2_Sub16 local38 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3155(); local38 != null; local38 = (Class2_Sub16) this.aClass2_Sub1_Sub1_1.aClass156_2.method3150()) {
			if (local38.anInt1932 == local12.anInt1932 && local38.anInt1931 < 0 && local38 != local12) {
				local12.anInt1931 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
	private synchronized void method604(@OriginalArg(0) boolean arg0) {
		this.aClass81_1.method1831();
		this.aClass2_Sub32_1 = null;
		this.method597(arg0);
	}

	@OriginalMember(owner = "client!br", name = "f", descriptor = "(I)V")
	public synchronized void method605() {
		for (@Pc(11) Class2_Sub23 local11 = (Class2_Sub23) this.aClass72_8.method1655(); local11 != null; local11 = (Class2_Sub23) this.aClass72_8.method1649()) {
			local11.method5703();
		}
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(III)V")
	private void method606() {
		this.anIntArray74[9] = 128;
		this.anIntArray67[9] = 128;
		this.method607(128, 9);
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(III)V")
	private void method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray73[arg1] != arg0) {
			this.anIntArray73[arg1] = arg0;
			for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
				this.aClass2_Sub16ArrayArray2[arg1][local27] = null;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "()Lclient!oo;")
	@Override
	public synchronized Class2_Sub1 method3224() {
		return this.aClass2_Sub1_Sub1_1;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3228(@OriginalArg(0) int arg0) {
		if (this.aClass81_1.method1824()) {
			@Pc(18) int local18 = this.anInt731 * this.aClass81_1.anInt2229 / Static333.anInt5628;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong24;
				if (this.aLong25 - local27 >= 0L) {
					this.aLong24 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong25 + (long) local18 - this.aLong24 - 1L) / (long) local18);
				this.aLong24 += (long) local18 * (long) local57;
				arg0 -= local57;
				this.aClass2_Sub1_Sub1_1.method3228(local57);
				this.method575();
			} while (this.aClass81_1.method1824());
		}
		this.aClass2_Sub1_Sub1_1.method3228(arg0);
	}
}
