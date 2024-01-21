import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!ub", name = "Zb", descriptor = "Z")
	private boolean aBoolean228;

	@OriginalMember(owner = "client!ub", name = "ac", descriptor = "J")
	private long aLong78;

	@OriginalMember(owner = "client!ub", name = "cc", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!ub", name = "dc", descriptor = "I")
	private int anInt2756;

	@OriginalMember(owner = "client!ub", name = "ec", descriptor = "I")
	private int anInt2757;

	@OriginalMember(owner = "client!ub", name = "F", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
	private int anInt2717 = 256;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "[I")
	public final int[] anIntArray312 = new int[16];

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "[I")
	public final int[] anIntArray313 = new int[16];

	@OriginalMember(owner = "client!ub", name = "I", descriptor = "[I")
	private final int[] anIntArray311 = new int[16];

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "[I")
	private final int[] anIntArray314 = new int[16];

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "[I")
	public final int[] anIntArray315 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Eb", descriptor = "[I")
	private final int[] anIntArray317 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Kb", descriptor = "[I")
	private final int[] anIntArray320 = new int[16];

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Pb", descriptor = "[I")
	private final int[] anIntArray322 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Jb", descriptor = "[I")
	private final int[] anIntArray319 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Ob", descriptor = "[I")
	private final int[] anIntArray321 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Tb", descriptor = "[I")
	private final int[] anIntArray324 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Xb", descriptor = "[[Lclient!uc;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray1 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!ub", name = "Yb", descriptor = "[[Lclient!uc;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray2 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!ub", name = "zb", descriptor = "[I")
	private final int[] anIntArray316 = new int[16];

	@OriginalMember(owner = "client!ub", name = "ub", descriptor = "I")
	private final int anInt2738 = 1000000;

	@OriginalMember(owner = "client!ub", name = "Fb", descriptor = "[I")
	private final int[] anIntArray318 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Gb", descriptor = "Lclient!td;")
	private final Class73 aClass73_1 = new Class73();

	@OriginalMember(owner = "client!ub", name = "bc", descriptor = "Lclient!qe;")
	private final Class2_Sub5_Sub3 aClass2_Sub5_Sub3_1 = new Class2_Sub5_Sub3(this);

	@OriginalMember(owner = "client!ub", name = "kb", descriptor = "Lclient!uf;")
	private final Class77 aClass77_13 = new Class77(128);

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class2_Sub5_Sub4() {
		this.method1990();
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	private void method1961() {
		@Pc(8) int local8 = this.anInt2757;
		@Pc(11) int local11 = this.anInt2756;
		@Pc(14) long local14 = this.aLong79;
		while (local11 == this.anInt2756) {
			while (local11 == this.aClass73_1.anIntArray301[local8]) {
				this.aClass73_1.method1886(local8);
				@Pc(25) int local25 = this.aClass73_1.method1888(local8);
				if (local25 == 1) {
					this.aClass73_1.method1879();
					this.aClass73_1.method1876(local8);
					if (this.aClass73_1.method1881()) {
						if (!this.aBoolean228 || local11 == 0) {
							this.method1990();
							this.aClass73_1.method1884();
							return;
						}
						this.aClass73_1.method1889(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method1975(local25);
				}
				this.aClass73_1.method1882(local8);
				this.aClass73_1.method1876(local8);
			}
			local8 = this.aClass73_1.method1890();
			local11 = this.aClass73_1.anIntArray301[local8];
			local14 = this.aClass73_1.method1877(local11);
		}
		this.anInt2757 = local8;
		this.anInt2756 = local11;
		this.aLong79 = local14;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	private void method1962() {
		this.anIntArray309[9] = 128;
		this.anIntArray321[9] = 128;
		this.method1977(9, 128);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!fd;Lclient!pe;IBLclient!aa;)Z")
	public synchronized boolean method1963(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class2_Sub18 arg1, @OriginalArg(4) Class1 arg2) {
		arg1.method1617();
		@Pc(11) boolean local11 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class2_Sub8 local29 = (Class2_Sub8) arg1.aClass77_9.method2031(); local29 != null; local29 = (Class2_Sub8) arg1.aClass77_9.method2039()) {
			@Pc(35) int local35 = (int) local29.aLong100;
			@Pc(43) Class2_Sub6 local43 = (Class2_Sub6) this.aClass77_13.method2034((long) local35);
			if (local43 == null) {
				local43 = Static7.method172(local35, arg0);
				if (local43 == null) {
					local11 = false;
					continue;
				}
				this.aClass77_13.method2030((long) local35, local43);
			}
			if (!local43.method425(local29.aByteArray14, arg2, local23)) {
				local11 = false;
			}
		}
		if (local11) {
			arg1.method1615();
		}
		return local11;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
	private void method1964(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray322[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public synchronized void method1965() {
		for (@Pc(13) Class2_Sub6 local13 = (Class2_Sub6) this.aClass77_13.method2031(); local13 != null; local13 = (Class2_Sub6) this.aClass77_13.method2039()) {
			local13.method2209();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!uc;Z)V")
	public void method1966(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass2_Sub4_Sub1_1.aByteArray35.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass2_Sub4_Sub1_1.aBoolean201) {
			@Pc(39) int local39 = local4 + local4 - arg0.aClass2_Sub4_Sub1_1.anInt2501;
			local4 <<= 0x8;
			local27 = (int) ((long) local39 * (long) this.anIntArray313[arg0.anInt2780] >> 6);
			if (local27 >= local4) {
				local27 = local4 + local4 - local27 - 1;
				arg0.aClass2_Sub5_Sub2_3.method1292();
			}
		} else {
			local27 = (int) ((long) local4 * (long) this.anIntArray313[arg0.anInt2780] >> 6);
		}
		arg0.aClass2_Sub5_Sub2_3.method1299(local27);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public synchronized void method1967() {
		this.aClass73_1.method1884();
		this.method1990();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!uc;)I")
	private int method1968(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(14) int local14 = (arg0.anInt2777 * arg0.anInt2768 >> 12) + arg0.anInt2773;
		local14 += (this.anIntArray322[arg0.anInt2780] - 8192) * this.anIntArray319[arg0.anInt2780] >> 12;
		@Pc(40) Class47 local40 = arg0.aClass47_1;
		@Pc(65) int local65;
		if (local40.anInt1727 > 0 && (local40.anInt1717 > 0 || this.anIntArray324[arg0.anInt2780] > 0)) {
			@Pc(60) int local60 = local40.anInt1716 << 1;
			local65 = local40.anInt1717 << 2;
			if (arg0.anInt2766 < local60) {
				local65 = local65 * arg0.anInt2766 / local60;
			}
			local65 += this.anIntArray324[arg0.anInt2780] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt2775 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local99 * (double) local65);
		}
		local65 = (int) ((double) (arg0.aClass2_Sub4_Sub1_1.anInt2500 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static68.anInt1863 + 0.5D);
		return local65 < 1 ? 1 : local65;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([IBIILclient!uc;)Z")
	public boolean method1970(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub23 arg3) {
		arg3.anInt2774 = Static68.anInt1863 / 100;
		if (arg3.anInt2771 >= 0 && (arg3.aClass2_Sub5_Sub2_3 == null || arg3.aClass2_Sub5_Sub2_3.method1309())) {
			arg3.method2005();
			arg3.method2209();
			if (arg3.anInt2781 > 0 && arg3 == this.aClass2_Sub23ArrayArray1[arg3.anInt2780][arg3.anInt2781]) {
				this.aClass2_Sub23ArrayArray1[arg3.anInt2780][arg3.anInt2781] = null;
			}
			return true;
		}
		@Pc(62) int local62 = arg3.anInt2777;
		if (local62 > 0) {
			local62 -= (int) (Math.pow(2.0D, (double) this.anIntArray311[arg3.anInt2780] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local62 < 0) {
				local62 = 0;
			}
			arg3.anInt2777 = local62;
		}
		@Pc(94) boolean local94 = false;
		arg3.aClass2_Sub5_Sub2_3.method1316(this.method1968(arg3));
		@Pc(104) Class47 local104 = arg3.aClass47_1;
		arg3.anInt2775 += local104.anInt1727;
		@Pc(129) double local129 = (double) ((arg3.anInt2777 * arg3.anInt2768 >> 12) + (arg3.anInt2767 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt2766++;
		if (local104.anInt1726 > 0) {
			if (local104.anInt1724 <= 0) {
				arg3.anInt2783 += 128;
			} else {
				arg3.anInt2783 += (int) (Math.pow(2.0D, local129 * (double) local104.anInt1724) * 128.0D + 0.5D);
			}
		}
		if (local104.aByteArray26 != null) {
			if (local104.anInt1728 <= 0) {
				arg3.anInt2786 += 128;
			} else {
				arg3.anInt2786 += (int) (Math.pow(2.0D, (double) local104.anInt1728 * local129) * 128.0D + 0.5D);
			}
			while (arg3.anInt2770 < local104.aByteArray26.length - 2 && (local104.aByteArray26[arg3.anInt2770 + 2] & 0xFF) << 8 < arg3.anInt2786) {
				arg3.anInt2770 += 2;
			}
			if (arg3.anInt2770 == local104.aByteArray26.length - 2 && local104.aByteArray26[arg3.anInt2770 + 1] == 0) {
				local94 = true;
			}
		}
		if (arg3.anInt2771 >= 0 && local104.aByteArray27 != null && (this.anIntArray312[arg3.anInt2780] & 0x1) == 0 && (arg3.anInt2781 < 0 || arg3 != this.aClass2_Sub23ArrayArray1[arg3.anInt2780][arg3.anInt2781])) {
			if (local104.anInt1718 > 0) {
				arg3.anInt2771 += (int) (Math.pow(2.0D, (double) local104.anInt1718 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt2771 += 128;
			}
			while (arg3.anInt2785 < local104.aByteArray27.length - 2 && (local104.aByteArray27[arg3.anInt2785 + 2] & 0xFF) << 8 < arg3.anInt2771) {
				arg3.anInt2785 += 2;
			}
			if (local104.aByteArray27.length - 2 == arg3.anInt2785) {
				local94 = true;
			}
		}
		if (!local94) {
			arg3.aClass2_Sub5_Sub2_3.method1321(arg3.anInt2774, this.method1984(arg3), this.method1991(arg3));
			return false;
		}
		arg3.aClass2_Sub5_Sub2_3.method1300(arg3.anInt2774);
		if (arg0 == null) {
			arg3.aClass2_Sub5_Sub2_3.method1959(arg1);
		} else {
			arg3.aClass2_Sub5_Sub2_3.method1957(arg0, arg2, arg1);
		}
		if (arg3.aClass2_Sub5_Sub2_3.method1296()) {
			this.aClass2_Sub5_Sub3_1.aClass2_Sub5_Sub1_2.method1138(arg3.aClass2_Sub5_Sub2_3);
		}
		arg3.method2005();
		if (arg3.anInt2771 >= 0) {
			arg3.method2209();
			if (arg3.anInt2781 > 0 && this.aClass2_Sub23ArrayArray1[arg3.anInt2780][arg3.anInt2781] == arg3) {
				this.aClass2_Sub23ArrayArray1[arg3.anInt2780][arg3.anInt2781] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIB)V")
	private void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)Z")
	public synchronized boolean method1972() {
		return this.aClass73_1.method1885();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ILclient!uc;)Z")
	public boolean method1973(@OriginalArg(1) Class2_Sub23 arg0) {
		if (arg0.aClass2_Sub5_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt2771 >= 0) {
			arg0.method2209();
			if (arg0.anInt2781 > 0 && this.aClass2_Sub23ArrayArray1[arg0.anInt2780][arg0.anInt2781] == arg0) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt2780][arg0.anInt2781] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()I")
	@Override
	public synchronized int method1955() {
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public synchronized void method1974(@OriginalArg(0) int arg0) {
		this.anInt2717 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	private void method1975(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (local9 == 128) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method1986(local24, local30, local20);
		} else if (local9 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local20 = arg0 >> 8 & 0x7F;
			if (local30 > 0) {
				this.method1976(local20, local24, local30);
			} else {
				this.method1986(local24, 64, local20);
			}
		} else if (local9 == 160) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1971(local24, local30, local20);
		} else if (local9 == 176) {
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 & 0xF;
			if (local20 == 0) {
				this.anIntArray321[local24] = (this.anIntArray321[local24] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local20 == 32) {
				this.anIntArray321[local24] = (local30 << 7) + (this.anIntArray321[local24] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray324[local24] = (this.anIntArray324[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 33) {
				this.anIntArray324[local24] = (this.anIntArray324[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 5) {
				this.anIntArray311[local24] = (this.anIntArray311[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 37) {
				this.anIntArray311[local24] = (this.anIntArray311[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 7) {
				this.anIntArray316[local24] = (local30 << 7) + (this.anIntArray316[local24] & 0xFFFFC07F);
			}
			if (local20 == 39) {
				this.anIntArray316[local24] = local30 + (this.anIntArray316[local24] & 0xFFFFFF80);
			}
			if (local20 == 10) {
				this.anIntArray318[local24] = (this.anIntArray318[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 42) {
				this.anIntArray318[local24] = local30 + (this.anIntArray318[local24] & 0xFFFFFF80);
			}
			if (local20 == 11) {
				this.anIntArray320[local24] = (local30 << 7) + (this.anIntArray320[local24] & 0xFFFFC07F);
			}
			if (local20 == 43) {
				this.anIntArray320[local24] = local30 + (this.anIntArray320[local24] & 0xFFFFFF80);
			}
			if (local20 == 64) {
				if (local30 >= 64) {
					this.anIntArray312[local24] |= 0x1;
				} else {
					this.anIntArray312[local24] &= 0xFFFFFFFE;
				}
			}
			if (local20 == 65) {
				if (local30 < 64) {
					this.method1988(local24);
					this.anIntArray312[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray312[local24] |= 0x2;
				}
			}
			if (local20 == 99) {
				this.anIntArray310[local24] = (this.anIntArray310[local24] & 0x7F) + (local30 << 7);
			}
			if (local20 == 98) {
				this.anIntArray310[local24] = (this.anIntArray310[local24] & 0x3F80) + local30;
			}
			if (local20 == 101) {
				this.anIntArray310[local24] = (local30 << 7) + ((this.anIntArray310[local24] & 0x7F) + 16384);
			}
			if (local20 == 100) {
				this.anIntArray310[local24] = (this.anIntArray310[local24] & 0x3F80) + local30 + 16384;
			}
			if (local20 == 120) {
				this.method1985(local24);
			}
			if (local20 == 121) {
				this.method1979(local24);
			}
			if (local20 == 123) {
				this.method1989(local24);
			}
			@Pc(512) int local512;
			if (local20 == 6) {
				local512 = this.anIntArray310[local24];
				if (local512 == 16384) {
					this.anIntArray319[local24] = (local30 << 7) + (this.anIntArray319[local24] & 0xFFFFC07F);
				}
			}
			if (local20 == 38) {
				local512 = this.anIntArray310[local24];
				if (local512 == 16384) {
					this.anIntArray319[local24] = (this.anIntArray319[local24] & 0xFFFFFF80) + local30;
				}
			}
			if (local20 == 16) {
				this.anIntArray313[local24] = (this.anIntArray313[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 48) {
				this.anIntArray313[local24] = (this.anIntArray313[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 81) {
				if (local30 < 64) {
					this.method1978(local24);
					this.anIntArray312[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray312[local24] |= 0x4;
				}
			}
			if (local20 == 17) {
				this.method1994((local30 << 7) + (this.anIntArray317[local24] & 0xFFFFC07F), local24);
			}
			if (local20 == 49) {
				this.method1994((this.anIntArray317[local24] & 0xFFFFFF80) + local30, local24);
			}
		} else if (local9 == 192) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1977(local24, this.anIntArray321[local24] + local20);
		} else if (local9 == 208) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			this.method1981(local24, local20);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local20 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F26) >> 8);
			this.method1964(local20, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1990();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIII)V")
	private void method1976(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1986(arg1, 64, arg0);
		if ((this.anIntArray312[arg1] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub23 local28 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method80(); local28 != null; local28 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method73()) {
				if (local28.anInt2780 == arg1 && local28.anInt2771 < 0) {
					this.aClass2_Sub23ArrayArray2[arg1][local28.anInt2767] = null;
					this.aClass2_Sub23ArrayArray2[arg1][arg0] = local28;
					@Pc(66) int local66 = local28.anInt2773 + (local28.anInt2768 * local28.anInt2777 >> 12);
					local28.anInt2777 = 4096;
					local28.anInt2773 += arg0 - local28.anInt2767 << 8;
					local28.anInt2768 = local66 - local28.anInt2773;
					local28.anInt2767 = arg0;
					return;
				}
			}
		}
		@Pc(110) Class2_Sub6 local110 = (Class2_Sub6) this.aClass77_13.method2034((long) this.anIntArray314[arg1]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class2_Sub4_Sub1 local118 = local110.aClass2_Sub4_Sub1Array1[arg0];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class2_Sub23 local125 = new Class2_Sub23();
		local125.anInt2780 = arg1;
		local125.aClass2_Sub6_1 = local110;
		local125.aClass2_Sub4_Sub1_1 = local118;
		local125.aClass47_1 = local110.aClass47Array1[arg0];
		local125.anInt2781 = local110.aByteArray10[arg0];
		local125.anInt2767 = arg0;
		local125.anInt2772 = local110.anInt663 * arg2 * arg2 * local110.aByteArray9[arg0] + 1024 >> 11;
		local125.anInt2769 = local110.aByteArray8[arg0] & 0xFF;
		local125.anInt2773 = (arg0 << 8) - (local110.aShortArray4[arg0] & 0x7FFF);
		local125.anInt2770 = 0;
		local125.anInt2783 = 0;
		local125.anInt2771 = -1;
		local125.anInt2785 = 0;
		local125.anInt2786 = 0;
		if (this.anIntArray313[arg1] == 0) {
			local125.aClass2_Sub5_Sub2_3 = Static137.method1294(local118, this.method1968(local125), this.method1984(local125), this.method1991(local125));
		} else {
			local125.aClass2_Sub5_Sub2_3 = Static137.method1294(local118, this.method1968(local125), 0, this.method1991(local125));
			this.method1966(local125, local110.aShortArray4[arg0] < 0);
		}
		if (local110.aShortArray4[arg0] < 0) {
			local125.aClass2_Sub5_Sub2_3.method1326(-1);
		}
		if (local125.anInt2781 >= 0) {
			@Pc(287) Class2_Sub23 local287 = this.aClass2_Sub23ArrayArray1[arg1][local125.anInt2781];
			if (local287 != null && local287.anInt2771 < 0) {
				this.aClass2_Sub23ArrayArray2[arg1][local287.anInt2767] = null;
				local287.anInt2771 = 0;
			}
			this.aClass2_Sub23ArrayArray1[arg1][local125.anInt2781] = local125;
		}
		this.aClass2_Sub5_Sub3_1.aClass3_15.method75(local125);
		this.aClass2_Sub23ArrayArray2[arg1][arg0] = local125;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BII)V")
	private void method1977(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray314[arg0]) {
			this.anIntArray314[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub23ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IB)V")
	private void method1978(@OriginalArg(0) int arg0) {
		if ((this.anIntArray312[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method82(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method74()) {
			if (local18.anInt2780 == arg0) {
				local18.anInt2787 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZI)V")
	private void method1979(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1979(local12);
			}
			return;
		}
		this.anIntArray316[arg0] = 12800;
		this.anIntArray318[arg0] = 8192;
		this.anIntArray320[arg0] = 16383;
		this.anIntArray322[arg0] = 8192;
		this.anIntArray324[arg0] = 0;
		this.anIntArray311[arg0] = 8192;
		this.method1988(arg0);
		this.method1978(arg0);
		this.anIntArray312[arg0] = 0;
		this.anIntArray310[arg0] = 32767;
		this.anIntArray319[arg0] = 256;
		this.anIntArray313[arg0] = 0;
		this.method1994(8192, arg0);
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public synchronized void method1980() {
		for (@Pc(13) Class2_Sub6 local13 = (Class2_Sub6) this.aClass77_13.method2031(); local13 != null; local13 = (Class2_Sub6) this.aClass77_13.method2039()) {
			local13.method423();
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)V")
	private void method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!pe;Z)V")
	public synchronized void method1982(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) boolean arg1) {
		this.method1967();
		this.aClass73_1.method1875(arg0.aByteArray32);
		this.aLong78 = 0L;
		this.aBoolean228 = arg1;
		@Pc(23) int local23 = this.aClass73_1.method1880();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass73_1.method1886(local25);
			this.aClass73_1.method1882(local25);
			this.aClass73_1.method1876(local25);
		}
		this.anInt2757 = this.aClass73_1.method1890();
		this.anInt2756 = this.aClass73_1.anIntArray301[this.anInt2757];
		this.aLong79 = this.aClass73_1.method1877(this.anInt2756);
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)I")
	public int method1983() {
		return this.anInt2717;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!uc;B)I")
	private int method1984(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(19) int local19 = this.anIntArray316[arg0.anInt2780] * this.anIntArray320[arg0.anInt2780] + 4096 >> 13;
		@Pc(22) Class47 local22 = arg0.aClass47_1;
		@Pc(30) int local30 = local19 * local19 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2772 * local30 + 16384 >> 15;
		local19 = local39 * this.anInt2717 + 128 >> 8;
		if (local22.anInt1726 > 0) {
			local19 = (int) ((double) local19 * Math.pow(0.5D, (double) local22.anInt1726 * (double) arg0.anInt2783 * 1.953125E-5D) + 0.5D);
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(108) int local108;
		@Pc(120) int local120;
		if (local22.aByteArray26 != null) {
			local78 = arg0.anInt2786;
			local86 = local22.aByteArray26[arg0.anInt2770 + 1];
			if (arg0.anInt2770 < local22.aByteArray26.length - 2) {
				local108 = (local22.aByteArray26[arg0.anInt2770] & 0xFF) << 8;
				local120 = (local22.aByteArray26[arg0.anInt2770 + 2] & 0xFF) << 8;
				local86 += (local78 - local108) * (local22.aByteArray26[arg0.anInt2770 + 3] - local86) / (local120 - local108);
			}
			local19 = local19 * local86 + 32 >> 6;
		}
		if (arg0.anInt2771 > 0 && local22.aByteArray27 != null) {
			local86 = local22.aByteArray27[arg0.anInt2785 + 1];
			local78 = arg0.anInt2771;
			if (local22.aByteArray27.length - 2 > arg0.anInt2785) {
				local108 = (local22.aByteArray27[arg0.anInt2785] & 0xFF) << 8;
				local120 = (local22.aByteArray27[arg0.anInt2785 + 2] & 0xFF) << 8;
				local86 += (local22.aByteArray27[arg0.anInt2785 + 3] - local86) * (local78 - local108) / (local120 - local108);
			}
			local19 = local19 * local86 + 32 >> 6;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	private void method1985(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class2_Sub23 local14 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method82(); local14 != null; local14 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method74()) {
			if (arg0 < 0 || arg0 == local14.anInt2780) {
				if (local14.aClass2_Sub5_Sub2_3 != null) {
					local14.aClass2_Sub5_Sub2_3.method1300(Static68.anInt1863 / 100);
					if (local14.aClass2_Sub5_Sub2_3.method1296()) {
						this.aClass2_Sub5_Sub3_1.aClass2_Sub5_Sub1_2.method1138(local14.aClass2_Sub5_Sub2_3);
					}
					local14.method2005();
				}
				if (local14.anInt2771 < 0) {
					this.aClass2_Sub23ArrayArray2[local14.anInt2780][local14.anInt2767] = null;
				}
				local14.method2209();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
	private void method1986(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub23 local12 = this.aClass2_Sub23ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub23ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray312[arg0] & 0x2) == 0) {
			local12.anInt2771 = 0;
			return;
		}
		for (@Pc(51) Class2_Sub23 local51 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method82(); local51 != null; local51 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method74()) {
			if (local12.anInt2780 == local51.anInt2780 && local51.anInt2771 < 0 && local51 != local12) {
				local12.anInt2771 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()Lclient!d;")
	@Override
	public synchronized Class2_Sub5 method1954() {
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)V")
	public synchronized void method1987() {
		this.method1962();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass73_1.method1885()) {
			@Pc(14) int local14 = this.aClass73_1.anInt2618 * this.anInt2738 / Static68.anInt1863;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong78;
				if (this.aLong79 - local23 >= 0L) {
					this.aLong78 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong79 - this.aLong78 - 1L) / (long) local14);
				arg2 -= local52;
				this.aLong78 += (long) local14 * (long) local52;
				this.aClass2_Sub5_Sub3_1.method1957(arg0, arg1, local52);
				this.method1961();
				arg1 += local52;
			} while (this.aClass73_1.method1885());
		}
		this.aClass2_Sub5_Sub3_1.method1957(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(IB)V")
	private void method1988(@OriginalArg(0) int arg0) {
		if ((this.anIntArray312[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method82(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method74()) {
			if (arg0 == local18.anInt2780 && this.aClass2_Sub23ArrayArray2[arg0][local18.anInt2767] == null && local18.anInt2771 < 0) {
				local18.anInt2771 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()Lclient!d;")
	@Override
	public synchronized Class2_Sub5 method1960() {
		return this.aClass2_Sub5_Sub3_1;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZI)V")
	private void method1989(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method82(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub5_Sub3_1.aClass3_15.method74()) {
			if ((arg0 < 0 || local18.anInt2780 == arg0) && local18.anInt2771 < 0) {
				this.aClass2_Sub23ArrayArray2[local18.anInt2780][local18.anInt2767] = null;
				local18.anInt2771 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1959(@OriginalArg(0) int arg0) {
		if (this.aClass73_1.method1885()) {
			@Pc(14) int local14 = this.aClass73_1.anInt2618 * this.anInt2738 / Static68.anInt1863;
			do {
				@Pc(23) long local23 = this.aLong78 + (long) arg0 * (long) local14;
				if (this.aLong79 - local23 >= 0L) {
					this.aLong78 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong79 - this.aLong78 - 1L) / (long) local14);
				arg0 -= local53;
				this.aLong78 += (long) local53 * (long) local14;
				this.aClass2_Sub5_Sub3_1.method1959(local53);
				this.method1961();
			} while (this.aClass73_1.method1885());
		}
		this.aClass2_Sub5_Sub3_1.method1959(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	private void method1990() {
		this.method1985(-1);
		this.method1979(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray314[local21] = this.anIntArray309[local21];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray321[local37] = this.anIntArray309[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!uc;B)I")
	private int method1991(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(15) int local15 = this.anIntArray318[arg0.anInt2780];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt2769) * (-local15 + 16384) + 32 >> 6) : arg0.anInt2769 * local15 - -32 >> 6;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(III)V")
	private void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray317[arg1] = arg0;
		this.anIntArray315[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
