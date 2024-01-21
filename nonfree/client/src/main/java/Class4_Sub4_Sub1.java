import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!c", name = "Wb", descriptor = "Z")
	private boolean aBoolean33;

	@OriginalMember(owner = "client!c", name = "Xb", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!c", name = "Yb", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!c", name = "ac", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!c", name = "bc", descriptor = "J")
	private long aLong13;

	@OriginalMember(owner = "client!c", name = "L", descriptor = "[I")
	private final int[] anIntArray22 = new int[16];

	@OriginalMember(owner = "client!c", name = "D", descriptor = "[I")
	private final int[] anIntArray21 = new int[16];

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "[I")
	private final int[] anIntArray27 = new int[16];

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "[I")
	private final int[] anIntArray26 = new int[16];

	@OriginalMember(owner = "client!c", name = "R", descriptor = "[I")
	private final int[] anIntArray24 = new int[16];

	@OriginalMember(owner = "client!c", name = "Q", descriptor = "[[Lclient!la;")
	private final Class4_Sub15[][] aClass4_Sub15ArrayArray1 = new Class4_Sub15[16][128];

	@OriginalMember(owner = "client!c", name = "vb", descriptor = "[I")
	private final int[] anIntArray29 = new int[16];

	@OriginalMember(owner = "client!c", name = "xb", descriptor = "[I")
	private final int[] anIntArray31 = new int[16];

	@OriginalMember(owner = "client!c", name = "tb", descriptor = "[I")
	public final int[] anIntArray28 = new int[16];

	@OriginalMember(owner = "client!c", name = "N", descriptor = "[I")
	private final int[] anIntArray23 = new int[16];

	@OriginalMember(owner = "client!c", name = "sb", descriptor = "I")
	private int anInt274 = 256;

	@OriginalMember(owner = "client!c", name = "Gb", descriptor = "[I")
	public final int[] anIntArray32 = new int[16];

	@OriginalMember(owner = "client!c", name = "Ob", descriptor = "[[Lclient!la;")
	private final Class4_Sub15[][] aClass4_Sub15ArrayArray2 = new Class4_Sub15[16][128];

	@OriginalMember(owner = "client!c", name = "Sb", descriptor = "[I")
	private final int[] anIntArray36 = new int[16];

	@OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
	private final int anInt282 = 1000000;

	@OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
	private final int[] anIntArray34 = new int[16];

	@OriginalMember(owner = "client!c", name = "wb", descriptor = "[I")
	private final int[] anIntArray30 = new int[16];

	@OriginalMember(owner = "client!c", name = "jb", descriptor = "[I")
	public final int[] anIntArray25 = new int[16];

	@OriginalMember(owner = "client!c", name = "Lb", descriptor = "[I")
	private final int[] anIntArray35 = new int[16];

	@OriginalMember(owner = "client!c", name = "hb", descriptor = "Lclient!rb;")
	private final Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!c", name = "Zb", descriptor = "Lclient!fe;")
	private final Class4_Sub4_Sub2 aClass4_Sub4_Sub2_1 = new Class4_Sub4_Sub2(this);

	@OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lclient!wc;")
	private final Class81 aClass81_2 = new Class81(128);

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub1() {
		this.method230();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIB)V")
	private void method198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	private void method199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray26[arg1] = arg0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!la;)I")
	private int method200(@OriginalArg(1) Class4_Sub15 arg0) {
		@Pc(15) int local15 = this.anIntArray35[arg0.anInt1842] * this.anIntArray30[arg0.anInt1842] + 4096 >> 13;
		@Pc(18) Class38 local18 = arg0.aClass38_1;
		@Pc(30) int local30 = local15 * local15 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt1822 + 16384 >> 15;
		local15 = this.anInt274 * local39 + 128 >> 8;
		if (local18.anInt1770 > 0) {
			local15 = (int) (Math.pow(0.5D, (double) local18.anInt1770 * (double) arg0.anInt1827 * 1.953125E-5D) * (double) local15 + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (local18.aByteArray14 != null) {
			local75 = arg0.anInt1826;
			local83 = local18.aByteArray14[arg0.anInt1838 + 1];
			if (local18.aByteArray14.length - 2 > arg0.anInt1838) {
				local101 = (local18.aByteArray14[arg0.anInt1838] & 0xFF) << 8;
				local113 = (local18.aByteArray14[arg0.anInt1838 + 2] & 0xFF) << 8;
				local83 += (local75 - local101) * (local18.aByteArray14[arg0.anInt1838 + 3] - local83) / (local113 - local101);
			}
			local15 = local83 * local15 + 32 >> 6;
		}
		if (arg0.anInt1843 > 0 && local18.aByteArray15 != null) {
			local75 = arg0.anInt1843;
			local83 = local18.aByteArray15[arg0.anInt1824 + 1];
			if (arg0.anInt1824 < local18.aByteArray15.length - 2) {
				local101 = (local18.aByteArray15[arg0.anInt1824] & 0xFF) << 8;
				local113 = (local18.aByteArray15[arg0.anInt1824 + 2] & 0xFF) << 8;
				local83 += (local75 - local101) * (local18.aByteArray15[arg0.anInt1824 + 3] - local83) / (local113 - local101);
			}
			local15 = local15 * local83 + 32 >> 6;
		}
		return local15;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLclient!ae;)V")
	public synchronized void method201(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		this.method228();
		this.aClass63_1.method1687(arg1.aByteArray1);
		this.aLong13 = 0L;
		this.aBoolean33 = arg0;
		@Pc(27) int local27 = this.aClass63_1.method1681();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass63_1.method1688(local29);
			this.aClass63_1.method1686(local29);
			this.aClass63_1.method1675(local29);
		}
		this.anInt291 = this.aClass63_1.method1684();
		this.anInt292 = this.aClass63_1.anIntArray289[this.anInt291];
		this.aLong12 = this.aClass63_1.method1682(this.anInt292);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	private void method202(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method215(local24, local30, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method215(local24, 64, local18);
			} else {
				this.method210(local30, local18, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			this.method211(local24, local18, local30);
		} else if (local9 == 176) {
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			if (local24 == 0) {
				this.anIntArray22[local18] = (local30 << 14) + (this.anIntArray22[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray22[local18] = (local30 << 7) + (this.anIntArray22[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray34[local18] = (local30 << 7) + (this.anIntArray34[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray34[local18] = local30 + (this.anIntArray34[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray27[local18] = (this.anIntArray27[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray27[local18] = local30 + (this.anIntArray27[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray35[local18] = (this.anIntArray35[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray35[local18] = local30 + (this.anIntArray35[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray31[local18] = (this.anIntArray31[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray31[local18] = local30 + (this.anIntArray31[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray30[local18] = (local30 << 7) + (this.anIntArray30[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray30[local18] = local30 + (this.anIntArray30[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray28[local18] |= 0x1;
				} else {
					this.anIntArray28[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method209(local18);
					this.anIntArray28[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray28[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray23[local18] = (this.anIntArray23[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray23[local18] = local30 + (this.anIntArray23[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray23[local18] = (local30 << 7) + ((this.anIntArray23[local18] & 0x7F) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray23[local18] = (this.anIntArray23[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method224(local18);
			}
			if (local24 == 121) {
				this.method223(local18);
			}
			if (local24 == 123) {
				this.method216(local18);
			}
			@Pc(517) int local517;
			if (local24 == 6) {
				local517 = this.anIntArray23[local18];
				if (local517 == 16384) {
					this.anIntArray36[local18] = (local30 << 7) + (this.anIntArray36[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local517 = this.anIntArray23[local18];
				if (local517 == 16384) {
					this.anIntArray36[local18] = (this.anIntArray36[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray25[local18] = (local30 << 7) + (this.anIntArray25[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray25[local18] = (this.anIntArray25[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method214(local18);
					this.anIntArray28[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray28[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method229((this.anIntArray29[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method229(local30 + (this.anIntArray29[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method213(local18, local24 + this.anIntArray22[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method198(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0072) >> 9);
			this.method199(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method230();
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
	public synchronized void method203() {
		this.method231();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1635() {
		return 0;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V")
	private void method204() {
		@Pc(8) int local8 = this.anInt291;
		@Pc(11) int local11 = this.anInt292;
		@Pc(14) long local14 = this.aLong12;
		while (this.anInt292 == local11) {
			while (local11 == this.aClass63_1.anIntArray289[local8]) {
				this.aClass63_1.method1688(local8);
				@Pc(25) int local25 = this.aClass63_1.method1689(local8);
				if (local25 == 1) {
					this.aClass63_1.method1683();
					this.aClass63_1.method1675(local8);
					if (this.aClass63_1.method1680()) {
						if (!this.aBoolean33 || local11 == 0) {
							this.method230();
							this.aClass63_1.method1679();
							return;
						}
						this.aClass63_1.method1685(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method202(local25);
				}
				this.aClass63_1.method1686(local8);
				this.aClass63_1.method1675(local8);
			}
			local8 = this.aClass63_1.method1684();
			local11 = this.aClass63_1.anIntArray289[local8];
			local14 = this.aClass63_1.method1682(local11);
		}
		this.aLong12 = local14;
		this.anInt292 = local11;
		this.anInt291 = local8;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(II)V")
	public synchronized void method205(@OriginalArg(1) int arg0) {
		this.anInt274 = arg0;
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(I)Z")
	public synchronized boolean method206() {
		return this.aClass63_1.method1677();
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
	public synchronized void method207() {
		for (@Pc(11) Class4_Sub14 local11 = (Class4_Sub14) this.aClass81_2.method2017(); local11 != null; local11 = (Class4_Sub14) this.aClass81_2.method2013()) {
			local11.method1999();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZLclient!la;)V")
	public void method208(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub15 arg1) {
		@Pc(8) int local8 = arg1.aClass4_Sub13_Sub1_1.aByteArray12.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass4_Sub13_Sub1_1.aBoolean132) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass4_Sub13_Sub1_1.anInt1365;
			local8 <<= 0x8;
			local40 = (int) ((long) local23 * (long) this.anIntArray25[arg1.anInt1842] >> 6);
			if (local40 >= local8) {
				arg1.aClass4_Sub4_Sub3_1.method1260();
				local40 = local8 + local8 - local40 - 1;
			}
		} else {
			local40 = (int) ((long) local8 * (long) this.anIntArray25[arg1.anInt1842] >> 6);
		}
		arg1.aClass4_Sub4_Sub3_1.method1250(local40);
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(II)V")
	private void method209(@OriginalArg(0) int arg0) {
		if ((this.anIntArray28[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub15 local18 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2025(); local18 != null; local18 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2023()) {
			if (local18.anInt1842 == arg0 && this.aClass4_Sub15ArrayArray2[arg0][local18.anInt1833] == null && local18.anInt1843 < 0) {
				local18.anInt1843 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIZI)V")
	private void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method215(arg2, 64, arg1);
		if ((this.anIntArray28[arg1] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub15 local28 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2034(); local28 != null; local28 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2022()) {
				if (arg1 == local28.anInt1842 && local28.anInt1843 < 0) {
					this.aClass4_Sub15ArrayArray2[arg1][local28.anInt1833] = null;
					this.aClass4_Sub15ArrayArray2[arg1][arg2] = local28;
					@Pc(70) int local70 = (local28.anInt1834 * local28.anInt1840 >> 12) + local28.anInt1832;
					local28.anInt1832 += arg2 - local28.anInt1833 << 8;
					local28.anInt1833 = arg2;
					local28.anInt1840 = 4096;
					local28.anInt1834 = local70 - local28.anInt1832;
					return;
				}
			}
		}
		@Pc(126) Class4_Sub14 local126 = (Class4_Sub14) this.aClass81_2.method2010((long) this.anIntArray24[arg1]);
		if (local126 == null) {
			return;
		}
		@Pc(134) Class4_Sub13_Sub1 local134 = local126.aClass4_Sub13_Sub1Array1[arg2];
		if (local134 == null) {
			return;
		}
		@Pc(141) Class4_Sub15 local141 = new Class4_Sub15();
		local141.aClass4_Sub14_1 = local126;
		local141.aClass4_Sub13_Sub1_1 = local134;
		local141.anInt1842 = arg1;
		local141.aClass38_1 = local126.aClass38Array1[arg2];
		local141.anInt1825 = local126.aByteArray18[arg2];
		local141.anInt1833 = arg2;
		local141.anInt1822 = arg0 * arg0 * local126.anInt1785 * local126.aByteArray17[arg2] + 1024 >> 11;
		local141.anInt1841 = local126.aByteArray16[arg2] & 0xFF;
		local141.anInt1832 = (arg2 << 8) - (local126.aShortArray17[arg2] & 0x7FFF);
		local141.anInt1827 = 0;
		local141.anInt1824 = 0;
		local141.anInt1826 = 0;
		local141.anInt1843 = -1;
		local141.anInt1838 = 0;
		if (this.anIntArray25[arg1] == 0) {
			local141.aClass4_Sub4_Sub3_1 = Static140.method1229(local134, this.method232(local141), this.method200(local141), this.method220(local141));
		} else {
			local141.aClass4_Sub4_Sub3_1 = Static140.method1229(local134, this.method232(local141), 0, this.method220(local141));
			this.method208(local126.aShortArray17[arg2] < 0, local141);
		}
		if (local126.aShortArray17[arg2] < 0) {
			local141.aClass4_Sub4_Sub3_1.method1232(-1);
		}
		if (local141.anInt1825 >= 0) {
			@Pc(292) Class4_Sub15 local292 = this.aClass4_Sub15ArrayArray1[arg1][local141.anInt1825];
			if (local292 != null && local292.anInt1843 < 0) {
				this.aClass4_Sub15ArrayArray2[arg1][local292.anInt1833] = null;
				local292.anInt1843 = 0;
			}
			this.aClass4_Sub15ArrayArray1[arg1][local141.anInt1825] = local141;
		}
		this.aClass4_Sub4_Sub2_1.aClass82_3.method2028(local141);
		this.aClass4_Sub15ArrayArray2[arg1][arg2] = local141;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V")
	private void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(ILclient!ea;Lclient!jf;Lclient!ae;I)Z")
	public synchronized boolean method212(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) Class4_Sub2 arg2) {
		arg2.method51();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class4_Sub12 local26 = (Class4_Sub12) arg2.aClass81_1.method2017(); local26 != null; local26 = (Class4_Sub12) arg2.aClass81_1.method2013()) {
			@Pc(32) int local32 = (int) local26.aLong99;
			@Pc(40) Class4_Sub14 local40 = (Class4_Sub14) this.aClass81_2.method2010((long) local32);
			if (local40 == null) {
				local40 = Static49.method920(local32, arg0);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass81_2.method2015((long) local32, local40);
			}
			if (!local40.method1115(arg1, local26.aByteArray10, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method52();
		}
		return local9;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V")
	private void method213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray24[arg0]) {
			this.anIntArray24[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass4_Sub15ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
	private void method214(@OriginalArg(0) int arg0) {
		if ((this.anIntArray28[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub15 local18 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2025(); local18 != null; local18 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2023()) {
			if (arg0 == local18.anInt1842) {
				local18.anInt1831 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBI)V")
	private void method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class4_Sub15 local12 = this.aClass4_Sub15ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass4_Sub15ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray28[arg2] & 0x2) == 0) {
			local12.anInt1843 = 0;
			return;
		}
		for (@Pc(43) Class4_Sub15 local43 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2025(); local43 != null; local43 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2023()) {
			if (local12.anInt1842 == local43.anInt1842 && local43.anInt1843 < 0 && local43 != local12) {
				local12.anInt1843 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(II)V")
	private void method216(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class4_Sub15 local14 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2025(); local14 != null; local14 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2023()) {
			if ((arg0 < 0 || arg0 == local14.anInt1842) && local14.anInt1843 < 0) {
				this.aClass4_Sub15ArrayArray2[local14.anInt1842][local14.anInt1833] = null;
				local14.anInt1843 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1639(@OriginalArg(0) int arg0) {
		if (this.aClass63_1.method1677()) {
			@Pc(14) int local14 = this.anInt282 * this.aClass63_1.anInt2593 / Static116.anInt2873;
			do {
				@Pc(24) long local24 = this.aLong13 + (long) local14 * (long) arg0;
				if (this.aLong12 - local24 >= 0L) {
					this.aLong13 = local24;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong12 + (long) local14 - this.aLong13 - 1L) / (long) local14);
				arg0 -= local54;
				this.aLong13 += (long) local14 * (long) local54;
				this.aClass4_Sub4_Sub2_1.method1639(local54);
				this.method204();
			} while (this.aClass63_1.method1677());
		}
		this.aClass4_Sub4_Sub2_1.method1639(arg0);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!la;I)I")
	private int method220(@OriginalArg(0) Class4_Sub15 arg0) {
		@Pc(14) int local14 = this.anIntArray31[arg0.anInt1842];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt1841 + 128) + 32 >> 6) : local14 * arg0.anInt1841 + 32 >> 6;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "()Lclient!fd;")
	@Override
	public synchronized Class4_Sub4 method1640() {
		return this.aClass4_Sub4_Sub2_1;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!la;ZI[II)Z")
	public boolean method222(@OriginalArg(0) Class4_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1823 = Static116.anInt2873 / 100;
		if (arg0.anInt1843 >= 0 && (arg0.aClass4_Sub4_Sub3_1 == null || arg0.aClass4_Sub4_Sub3_1.method1247())) {
			arg0.method1140();
			arg0.method1999();
			if (arg0.anInt1825 > 0 && this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] == arg0) {
				this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt1840;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray27[arg0.anInt1842] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt1840 = local59;
		}
		arg0.aClass4_Sub4_Sub3_1.method1227(this.method232(arg0));
		arg0.anInt1830++;
		@Pc(120) double local120 = (double) ((arg0.anInt1834 * arg0.anInt1840 >> 12) + (arg0.anInt1833 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(123) Class38 local123 = arg0.aClass38_1;
		arg0.anInt1837 += local123.anInt1767;
		if (local123.anInt1770 > 0) {
			if (local123.anInt1768 > 0) {
				arg0.anInt1827 += (int) (Math.pow(2.0D, (double) local123.anInt1768 * local120) * 128.0D + 0.5D);
			} else {
				arg0.anInt1827 += 128;
			}
		}
		@Pc(166) boolean local166 = false;
		if (local123.aByteArray14 != null) {
			if (local123.anInt1764 > 0) {
				arg0.anInt1826 += (int) (Math.pow(2.0D, local120 * (double) local123.anInt1764) * 128.0D + 0.5D);
			} else {
				arg0.anInt1826 += 128;
			}
			while (arg0.anInt1838 < local123.aByteArray14.length - 2 && (local123.aByteArray14[arg0.anInt1838 + 2] & 0xFF) << 8 < arg0.anInt1826) {
				arg0.anInt1838 += 2;
			}
			if (local123.aByteArray14.length - 2 == arg0.anInt1838 && local123.aByteArray14[arg0.anInt1838 + 1] == 0) {
				local166 = true;
			}
		}
		if (arg0.anInt1843 >= 0 && local123.aByteArray15 != null && (this.anIntArray28[arg0.anInt1842] & 0x1) == 0 && (arg0.anInt1825 < 0 || arg0 != this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825])) {
			if (local123.anInt1772 <= 0) {
				arg0.anInt1843 += 128;
			} else {
				arg0.anInt1843 += (int) (Math.pow(2.0D, (double) local123.anInt1772 * local120) * 128.0D + 0.5D);
			}
			while (arg0.anInt1824 < local123.aByteArray15.length - 2 && arg0.anInt1843 > (local123.aByteArray15[arg0.anInt1824 + 2] & 0xFF) << 8) {
				arg0.anInt1824 += 2;
			}
			if (local123.aByteArray15.length - 2 == arg0.anInt1824) {
				local166 = true;
			}
		}
		if (!local166) {
			arg0.aClass4_Sub4_Sub3_1.method1257(arg0.anInt1823, this.method200(arg0), this.method220(arg0));
			return false;
		}
		arg0.aClass4_Sub4_Sub3_1.method1230(arg0.anInt1823);
		if (arg2 == null) {
			arg0.aClass4_Sub4_Sub3_1.method1639(arg3);
		} else {
			arg0.aClass4_Sub4_Sub3_1.method1637(arg2, arg1, arg3);
		}
		if (arg0.aClass4_Sub4_Sub3_1.method1264()) {
			this.aClass4_Sub4_Sub2_1.aClass4_Sub4_Sub4_2.method1647(arg0.aClass4_Sub4_Sub3_1);
		}
		arg0.method1140();
		if (arg0.anInt1843 >= 0) {
			arg0.method1999();
			if (arg0.anInt1825 > 0 && this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] == arg0) {
				this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "e", descriptor = "(II)V")
	private void method223(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method223(local9);
			}
			return;
		}
		this.anIntArray35[arg0] = 12800;
		this.anIntArray31[arg0] = 8192;
		this.anIntArray30[arg0] = 16383;
		this.anIntArray26[arg0] = 8192;
		this.anIntArray34[arg0] = 0;
		this.anIntArray27[arg0] = 8192;
		this.method209(arg0);
		this.method214(arg0);
		this.anIntArray28[arg0] = 0;
		this.anIntArray23[arg0] = 32767;
		this.anIntArray36[arg0] = 256;
		this.anIntArray25[arg0] = 0;
		this.method229(8192, arg0);
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(II)V")
	private void method224(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class4_Sub15 local15 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2025(); local15 != null; local15 = (Class4_Sub15) this.aClass4_Sub4_Sub2_1.aClass82_3.method2023()) {
			if (arg0 < 0 || arg0 == local15.anInt1842) {
				if (local15.aClass4_Sub4_Sub3_1 != null) {
					local15.aClass4_Sub4_Sub3_1.method1230(Static116.anInt2873 / 100);
					if (local15.aClass4_Sub4_Sub3_1.method1264()) {
						this.aClass4_Sub4_Sub2_1.aClass4_Sub4_Sub4_2.method1647(local15.aClass4_Sub4_Sub3_1);
					}
					local15.method1140();
				}
				if (local15.anInt1843 < 0) {
					this.aClass4_Sub15ArrayArray2[local15.anInt1842][local15.anInt1833] = null;
				}
				local15.method1999();
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "h", descriptor = "(I)I")
	public int method226() {
		return this.anInt274;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()Lclient!fd;")
	@Override
	public synchronized Class4_Sub4 method1638() {
		return null;
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(ILclient!la;)Z")
	public boolean method227(@OriginalArg(1) Class4_Sub15 arg0) {
		if (arg0.aClass4_Sub4_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt1843 >= 0) {
			arg0.method1999();
			if (arg0.anInt1825 > 0 && this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] == arg0) {
				this.aClass4_Sub15ArrayArray1[arg0.anInt1842][arg0.anInt1825] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!c", name = "i", descriptor = "(I)V")
	public synchronized void method228() {
		this.aClass63_1.method1679();
		this.method230();
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass63_1.method1677()) {
			@Pc(14) int local14 = this.anInt282 * this.aClass63_1.anInt2593 / Static116.anInt2873;
			do {
				@Pc(24) long local24 = this.aLong13 + (long) arg2 * (long) local14;
				if (this.aLong12 - local24 >= 0L) {
					this.aLong13 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong12 + (long) local14 - this.aLong13 - 1L) / (long) local14);
				arg2 -= local53;
				this.aLong13 += (long) local14 * (long) local53;
				this.aClass4_Sub4_Sub2_1.method1637(arg0, arg1, local53);
				arg1 += local53;
				this.method204();
			} while (this.aClass63_1.method1677());
		}
		this.aClass4_Sub4_Sub2_1.method1637(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(BII)V")
	private void method229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray29[arg1] = arg0;
		this.anIntArray32[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	private void method230() {
		this.method224(-1);
		this.method223(-1);
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			this.anIntArray24[local17] = this.anIntArray21[local17];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray22[local43] = this.anIntArray21[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V")
	private void method231() {
		this.anIntArray21[9] = 128;
		this.anIntArray22[9] = 128;
		this.method213(9, 128);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!la;B)I")
	private int method232(@OriginalArg(0) Class4_Sub15 arg0) {
		@Pc(23) int local23 = arg0.anInt1832 + (arg0.anInt1834 * arg0.anInt1840 >> 12);
		@Pc(26) Class38 local26 = arg0.aClass38_1;
		local23 += (this.anIntArray26[arg0.anInt1842] - 8192) * this.anIntArray36[arg0.anInt1842] >> 12;
		@Pc(64) int local64;
		if (local26.anInt1767 > 0 && (local26.anInt1774 > 0 || this.anIntArray34[arg0.anInt1842] > 0)) {
			local64 = local26.anInt1774 << 2;
			@Pc(69) int local69 = local26.anInt1763 << 1;
			if (arg0.anInt1830 < local69) {
				local64 = arg0.anInt1830 * local64 / local69;
			}
			local64 += this.anIntArray34[arg0.anInt1842] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt1837 & 0x1FF) * 0.01227184630308513D);
			local23 += (int) (local99 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass4_Sub13_Sub1_1.anInt1367 * 256) * Math.pow(2.0D, (double) local23 * 3.255208333333333E-4D) / (double) Static116.anInt2873 + 0.5D);
		return local64 < 1 ? 1 : local64;
	}

	@OriginalMember(owner = "client!c", name = "j", descriptor = "(I)V")
	public synchronized void method233() {
		for (@Pc(15) Class4_Sub14 local15 = (Class4_Sub14) this.aClass81_2.method2017(); local15 != null; local15 = (Class4_Sub14) this.aClass81_2.method2013()) {
			local15.method1112();
		}
	}
}
