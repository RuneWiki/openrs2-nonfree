import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!bc", name = "Rb", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!bc", name = "Sb", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!bc", name = "Ub", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!bc", name = "Vb", descriptor = "Z")
	private boolean aBoolean5;

	@OriginalMember(owner = "client!bc", name = "Wb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt107 = 256;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "[I")
	private final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "[I")
	private final int[] anIntArray13 = new int[16];

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "[I")
	private final int[] anIntArray17 = new int[16];

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "[I")
	private final int[] anIntArray15 = new int[16];

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "[I")
	private final int[] anIntArray19 = new int[16];

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[I")
	public final int[] anIntArray14 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "[I")
	private final int[] anIntArray16 = new int[16];

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "[I")
	private final int[] anIntArray18 = new int[16];

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "[I")
	private final int[] anIntArray21 = new int[16];

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
	private final int anInt131 = 1000000;

	@OriginalMember(owner = "client!bc", name = "yb", descriptor = "[I")
	private final int[] anIntArray22 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Fb", descriptor = "[I")
	public final int[] anIntArray24 = new int[16];

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "[I")
	private final int[] anIntArray20 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Ib", descriptor = "[[Lclient!tc;")
	private final Class4_Sub19[][] aClass4_Sub19ArrayArray1 = new Class4_Sub19[16][128];

	@OriginalMember(owner = "client!bc", name = "Mb", descriptor = "[I")
	private final int[] anIntArray25 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Bb", descriptor = "[I")
	public final int[] anIntArray23 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Ob", descriptor = "[I")
	private final int[] anIntArray26 = new int[16];

	@OriginalMember(owner = "client!bc", name = "Nb", descriptor = "[[Lclient!tc;")
	private final Class4_Sub19[][] aClass4_Sub19ArrayArray2 = new Class4_Sub19[16][128];

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Lclient!pe;")
	private final Class65 aClass65_1 = new Class65();

	@OriginalMember(owner = "client!bc", name = "Tb", descriptor = "Lclient!tb;")
	private final Class4_Sub1_Sub4 aClass4_Sub1_Sub4_1 = new Class4_Sub1_Sub4(this);

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "Lclient!ud;")
	private final Class75 aClass75_1 = new Class75(128);

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1() {
		this.method117();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)V")
	private void method89(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray26[arg1]) {
			this.anIntArray26[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass4_Sub19ArrayArray1[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public synchronized Class4_Sub1 method1814() {
		return this.aClass4_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1817(@OriginalArg(0) int arg0) {
		if (this.aClass65_1.method1401()) {
			@Pc(14) int local14 = this.aClass65_1.anInt2055 * this.anInt131 / Static115.anInt2690;
			do {
				@Pc(24) long local24 = this.aLong8 + (long) local14 * (long) arg0;
				if (this.aLong7 - local24 >= 0L) {
					this.aLong8 = local24;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong7 + (long) local14 - this.aLong8 - 1L) / (long) local14);
				this.aLong8 += (long) local14 * (long) local56;
				this.aClass4_Sub1_Sub4_1.method1817(local56);
				arg0 -= local56;
				this.method93();
			} while (this.aClass65_1.method1401());
		}
		this.aClass4_Sub1_Sub4_1.method1817(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IBI)V")
	private void method90() {
		this.anIntArray13[9] = 128;
		this.anIntArray16[9] = 128;
		this.method89(128, 9);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!tc;)Z")
	public boolean method91(@OriginalArg(1) Class4_Sub19 arg0) {
		if (arg0.aClass4_Sub1_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2645 >= 0) {
			arg0.method1989();
			if (arg0.anInt2631 > 0 && arg0 == this.aClass4_Sub19ArrayArray1[arg0.anInt2650][arg0.anInt2631]) {
				this.aClass4_Sub19ArrayArray1[arg0.anInt2650][arg0.anInt2631] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	private void method93() {
		@Pc(8) int local8 = this.anInt153;
		@Pc(11) int local11 = this.anInt154;
		@Pc(14) long local14 = this.aLong7;
		while (local11 == this.anInt154) {
			while (local11 == this.aClass65_1.anIntArray236[local8]) {
				this.aClass65_1.method1406(local8);
				@Pc(25) int local25 = this.aClass65_1.method1403(local8);
				if (local25 == 1) {
					this.aClass65_1.method1415();
					this.aClass65_1.method1405(local8);
					if (this.aClass65_1.method1408()) {
						if (!this.aBoolean5 || local11 == 0) {
							this.method117();
							this.aClass65_1.method1402();
							return;
						}
						this.aClass65_1.method1409(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method95(local25);
				}
				this.aClass65_1.method1407(local8);
				this.aClass65_1.method1405(local8);
			}
			local8 = this.aClass65_1.method1416();
			local11 = this.aClass65_1.anIntArray236[local8];
			local14 = this.aClass65_1.method1410(local11);
		}
		this.aLong7 = local14;
		this.anInt153 = local8;
		this.anInt154 = local11;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	private void method95(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local9 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method114(local20, local32, local26);
		} else if (local9 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 <= 0) {
				this.method114(local20, 64, local26);
			} else {
				this.method105(local32, local20, local26);
			}
		} else if (local9 == 160) {
			local32 = arg0 >> 16 & 0x7F;
			local26 = arg0 >> 8 & 0x7F;
			local20 = arg0 & 0xF;
			this.method106(local32, local26, local20);
		} else if (local9 == 176) {
			local32 = arg0 >> 16 & 0x7F;
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			if (local26 == 0) {
				this.anIntArray16[local20] = (this.anIntArray16[local20] & 0xFFE03FFF) + (local32 << 14);
			}
			if (local26 == 32) {
				this.anIntArray16[local20] = (local32 << 7) + (this.anIntArray16[local20] & 0xFFFFC07F);
			}
			if (local26 == 1) {
				this.anIntArray22[local20] = (this.anIntArray22[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 33) {
				this.anIntArray22[local20] = local32 + (this.anIntArray22[local20] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray12[local20] = (this.anIntArray12[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 37) {
				this.anIntArray12[local20] = local32 + (this.anIntArray12[local20] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray18[local20] = (local32 << 7) + (this.anIntArray18[local20] & 0xFFFFC07F);
			}
			if (local26 == 39) {
				this.anIntArray18[local20] = local32 + (this.anIntArray18[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray19[local20] = (this.anIntArray19[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 42) {
				this.anIntArray19[local20] = local32 + (this.anIntArray19[local20] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray25[local20] = (local32 << 7) + (this.anIntArray25[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray25[local20] = local32 + (this.anIntArray25[local20] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local32 >= 64) {
					this.anIntArray14[local20] |= 0x1;
				} else {
					this.anIntArray14[local20] &= 0xFFFFFFFE;
				}
			}
			if (local26 == 65) {
				if (local32 < 64) {
					this.method100(local20);
					this.anIntArray14[local20] &= 0xFFFFFFFD;
				} else {
					this.anIntArray14[local20] |= 0x2;
				}
			}
			if (local26 == 99) {
				this.anIntArray17[local20] = (local32 << 7) + (this.anIntArray17[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray17[local20] = local32 + (this.anIntArray17[local20] & 0x3F80);
			}
			if (local26 == 101) {
				this.anIntArray17[local20] = (local32 << 7) + (this.anIntArray17[local20] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray17[local20] = local32 + (this.anIntArray17[local20] & 0x3F80) + 16384;
			}
			if (local26 == 120) {
				this.method101(local20);
			}
			if (local26 == 121) {
				this.method119(local20);
			}
			if (local26 == 123) {
				this.method104(local20);
			}
			@Pc(513) int local513;
			if (local26 == 6) {
				local513 = this.anIntArray17[local20];
				if (local513 == 16384) {
					this.anIntArray20[local20] = (this.anIntArray20[local20] & 0xFFFFC07F) + (local32 << 7);
				}
			}
			if (local26 == 38) {
				local513 = this.anIntArray17[local20];
				if (local513 == 16384) {
					this.anIntArray20[local20] = (this.anIntArray20[local20] & 0xFFFFFF80) + local32;
				}
			}
			if (local26 == 16) {
				this.anIntArray24[local20] = (this.anIntArray24[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 48) {
				this.anIntArray24[local20] = (this.anIntArray24[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 81) {
				if (local32 >= 64) {
					this.anIntArray14[local20] |= 0x4;
				} else {
					this.method124(local20);
					this.anIntArray14[local20] &= 0xFFFFFFFB;
				}
			}
			if (local26 == 17) {
				this.method115(local20, (local32 << 7) + (this.anIntArray15[local20] & 0xFFFFC07F));
			}
			if (local26 == 49) {
				this.method115(local20, (this.anIntArray15[local20] & 0xFFFFFF80) + local32);
			}
		} else if (local9 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method89(local26 + this.anIntArray16[local20], local20);
		} else if (local9 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method96(local26, local20);
		} else if (local9 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method118(local20, local26);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method117();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZ)V")
	private void method96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)Z")
	public synchronized boolean method97() {
		return this.aClass65_1.method1401();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tc;B)I")
	private int method99(@OriginalArg(0) Class4_Sub19 arg0) {
		@Pc(11) int local11 = this.anIntArray19[arg0.anInt2650];
		return local11 < 8192 ? arg0.anInt2647 * local11 + 32 >> 6 : 16384 - ((16384 - local11) * (128 - arg0.anInt2647) + 32 >> 6);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	private void method100(@OriginalArg(1) int arg0) {
		if ((this.anIntArray14[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(19) Class4_Sub19 local19 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method982(); local19 != null; local19 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method986()) {
			if (arg0 == local19.anInt2650 && this.aClass4_Sub19ArrayArray2[arg0][local19.anInt2630] == null && local19.anInt2645 < 0) {
				local19.anInt2645 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
	private void method101(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method982(); local12 != null; local12 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method986()) {
			if (arg0 < 0 || local12.anInt2650 == arg0) {
				if (local12.aClass4_Sub1_Sub2_1 != null) {
					local12.aClass4_Sub1_Sub2_1.method906(Static115.anInt2690 / 100);
					if (local12.aClass4_Sub1_Sub2_1.method902()) {
						this.aClass4_Sub1_Sub4_1.aClass4_Sub1_Sub3_2.method967(local12.aClass4_Sub1_Sub2_1);
					}
					local12.method1830();
				}
				if (local12.anInt2645 < 0) {
					this.aClass4_Sub19ArrayArray2[local12.anInt2650][local12.anInt2630] = null;
				}
				local12.method1989();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public synchronized void method103() {
		for (@Pc(18) Class4_Sub15 local18 = (Class4_Sub15) this.aClass75_1.method1897(); local18 != null; local18 = (Class4_Sub15) this.aClass75_1.method1891()) {
			local18.method1989();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(II)V")
	private void method104(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class4_Sub19 local8 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method982(); local8 != null; local8 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method986()) {
			if ((arg0 < 0 || local8.anInt2650 == arg0) && local8.anInt2645 < 0) {
				this.aClass4_Sub19ArrayArray2[local8.anInt2650][local8.anInt2630] = null;
				local8.anInt2645 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
	private void method105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method114(arg1, 64, arg2);
		if ((this.anIntArray14[arg1] & 0x2) != 0) {
			for (@Pc(27) Class4_Sub19 local27 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method985(); local27 != null; local27 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method989()) {
				if (arg1 == local27.anInt2650 && local27.anInt2645 < 0) {
					this.aClass4_Sub19ArrayArray2[arg1][local27.anInt2630] = null;
					this.aClass4_Sub19ArrayArray2[arg1][arg2] = local27;
					@Pc(69) int local69 = (local27.anInt2629 * local27.anInt2639 >> 12) + local27.anInt2641;
					local27.anInt2641 += arg2 - local27.anInt2630 << 8;
					local27.anInt2639 = local69 - local27.anInt2641;
					local27.anInt2630 = arg2;
					local27.anInt2629 = 4096;
					return;
				}
			}
		}
		@Pc(115) Class4_Sub15 local115 = (Class4_Sub15) this.aClass75_1.method1896((long) this.anIntArray26[arg1]);
		if (local115 == null) {
			return;
		}
		@Pc(123) Class4_Sub6_Sub1 local123 = local115.aClass4_Sub6_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(130) Class4_Sub19 local130 = new Class4_Sub19();
		local130.aClass4_Sub15_1 = local115;
		local130.anInt2650 = arg1;
		local130.aClass4_Sub6_Sub1_1 = local123;
		local130.aClass80_1 = local115.aClass80Array1[arg2];
		local130.anInt2631 = local115.aByteArray38[arg2];
		local130.anInt2630 = arg2;
		local130.anInt2634 = arg0 * arg0 * local115.anInt2453 * local115.aByteArray37[arg2] + 1024 >> 11;
		local130.anInt2647 = local115.aByteArray39[arg2] & 0xFF;
		local130.anInt2641 = (arg2 << 8) - (local115.aShortArray35[arg2] & 0x7FFF);
		local130.anInt2625 = 0;
		local130.anInt2635 = 0;
		local130.anInt2626 = 0;
		local130.anInt2645 = -1;
		local130.anInt2646 = 0;
		if (this.anIntArray24[arg1] == 0) {
			local130.aClass4_Sub1_Sub2_1 = Static137.method904(local123, this.method108(local130), this.method125(local130), this.method99(local130));
		} else {
			local130.aClass4_Sub1_Sub2_1 = Static137.method904(local123, this.method108(local130), 0, this.method99(local130));
			this.method126(local115.aShortArray35[arg2] < 0, local130);
		}
		if (local115.aShortArray35[arg2] < 0) {
			local130.aClass4_Sub1_Sub2_1.method899(-1);
		}
		if (local130.anInt2631 >= 0) {
			@Pc(280) Class4_Sub19 local280 = this.aClass4_Sub19ArrayArray1[arg1][local130.anInt2631];
			if (local280 != null && local280.anInt2645 < 0) {
				this.aClass4_Sub19ArrayArray2[arg1][local280.anInt2630] = null;
				local280.anInt2645 = 0;
			}
			this.aClass4_Sub19ArrayArray1[arg1][local130.anInt2631] = local130;
		}
		this.aClass4_Sub1_Sub4_1.aClass45_15.method988(local130);
		this.aClass4_Sub19ArrayArray2[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIII)V")
	private void method106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ka;ZI)V")
	public synchronized void method107(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		this.method122();
		this.aClass65_1.method1404(arg0.aByteArray14);
		this.aLong8 = 0L;
		this.aBoolean5 = arg1;
		@Pc(23) int local23 = this.aClass65_1.method1414();
		for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
			this.aClass65_1.method1406(local33);
			this.aClass65_1.method1407(local33);
			this.aClass65_1.method1405(local33);
		}
		this.anInt153 = this.aClass65_1.method1416();
		this.anInt154 = this.aClass65_1.anIntArray236[this.anInt153];
		this.aLong7 = this.aClass65_1.method1410(this.anInt154);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!tc;)I")
	private int method108(@OriginalArg(1) Class4_Sub19 arg0) {
		@Pc(14) int local14 = arg0.anInt2641 + (arg0.anInt2639 * arg0.anInt2629 >> 12);
		local14 += (this.anIntArray21[arg0.anInt2650] - 8192) * this.anIntArray20[arg0.anInt2650] >> 12;
		@Pc(35) Class80 local35 = arg0.aClass80_1;
		@Pc(60) int local60;
		if (local35.anInt2818 > 0 && (local35.anInt2826 > 0 || this.anIntArray22[arg0.anInt2650] > 0)) {
			@Pc(55) int local55 = local35.anInt2826 << 2;
			local60 = local35.anInt2819 << 1;
			if (local60 > arg0.anInt2640) {
				local55 = local55 * arg0.anInt2640 / local60;
			}
			local55 += this.anIntArray22[arg0.anInt2650] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt2628 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local90 * (double) local55);
		}
		local60 = (int) ((double) (arg0.aClass4_Sub6_Sub1_1.anInt2326 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static115.anInt2690 + 0.5D);
		return local60 < 1 ? 1 : local60;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)V")
	public synchronized void method109() {
		this.method90();
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)I")
	public int method110() {
		return this.anInt107;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III[ILclient!tc;)Z")
	public boolean method111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub19 arg3) {
		arg3.anInt2643 = Static115.anInt2690 / 100;
		if (arg3.anInt2645 >= 0 && (arg3.aClass4_Sub1_Sub2_1 == null || arg3.aClass4_Sub1_Sub2_1.method900())) {
			arg3.method1830();
			arg3.method1989();
			if (arg3.anInt2631 > 0 && this.aClass4_Sub19ArrayArray1[arg3.anInt2650][arg3.anInt2631] == arg3) {
				this.aClass4_Sub19ArrayArray1[arg3.anInt2650][arg3.anInt2631] = null;
			}
			return true;
		}
		@Pc(69) int local69 = arg3.anInt2629;
		if (local69 > 0) {
			local69 -= (int) (Math.pow(2.0D, (double) this.anIntArray12[arg3.anInt2650] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local69 < 0) {
				local69 = 0;
			}
			arg3.anInt2629 = local69;
		}
		arg3.aClass4_Sub1_Sub2_1.method912(this.method108(arg3));
		@Pc(108) boolean local108 = false;
		@Pc(111) Class80 local111 = arg3.aClass80_1;
		@Pc(129) double local129 = (double) ((arg3.anInt2639 * arg3.anInt2629 >> 12) + (arg3.anInt2630 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt2628 += local111.anInt2818;
		arg3.anInt2640++;
		if (local111.anInt2820 > 0) {
			if (local111.anInt2824 > 0) {
				arg3.anInt2626 += (int) (Math.pow(2.0D, (double) local111.anInt2824 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt2626 += 128;
			}
		}
		if (local111.aByteArray44 != null) {
			if (local111.anInt2823 > 0) {
				arg3.anInt2625 += (int) (Math.pow(2.0D, local129 * (double) local111.anInt2823) * 128.0D + 0.5D);
			} else {
				arg3.anInt2625 += 128;
			}
			while (local111.aByteArray44.length - 2 > arg3.anInt2646 && arg3.anInt2625 > (local111.aByteArray44[arg3.anInt2646 + 2] & 0xFF) << 8) {
				arg3.anInt2646 += 2;
			}
			if (arg3.anInt2646 == local111.aByteArray44.length - 2 && local111.aByteArray44[arg3.anInt2646 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg3.anInt2645 >= 0 && local111.aByteArray43 != null && (this.anIntArray14[arg3.anInt2650] & 0x1) == 0 && (arg3.anInt2631 < 0 || arg3 != this.aClass4_Sub19ArrayArray1[arg3.anInt2650][arg3.anInt2631])) {
			if (local111.anInt2822 > 0) {
				arg3.anInt2645 += (int) (Math.pow(2.0D, (double) local111.anInt2822 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt2645 += 128;
			}
			while (arg3.anInt2635 < local111.aByteArray43.length - 2 && arg3.anInt2645 > (local111.aByteArray43[arg3.anInt2635 + 2] & 0xFF) << 8) {
				arg3.anInt2635 += 2;
			}
			if (arg3.anInt2635 == local111.aByteArray43.length - 2) {
				local108 = true;
			}
		}
		if (!local108) {
			arg3.aClass4_Sub1_Sub2_1.method929(arg3.anInt2643, this.method125(arg3), this.method99(arg3));
			return false;
		}
		arg3.aClass4_Sub1_Sub2_1.method906(arg3.anInt2643);
		if (arg2 == null) {
			arg3.aClass4_Sub1_Sub2_1.method1817(arg1);
		} else {
			arg3.aClass4_Sub1_Sub2_1.method1813(arg2, arg0, arg1);
		}
		if (arg3.aClass4_Sub1_Sub2_1.method902()) {
			this.aClass4_Sub1_Sub4_1.aClass4_Sub1_Sub3_2.method967(arg3.aClass4_Sub1_Sub2_1);
		}
		arg3.method1830();
		if (arg3.anInt2645 >= 0) {
			arg3.method1989();
			if (arg3.anInt2631 > 0 && arg3 == this.aClass4_Sub19ArrayArray1[arg3.anInt2650][arg3.anInt2631]) {
				this.aClass4_Sub19ArrayArray1[arg3.anInt2650][arg3.anInt2631] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(IIII)V")
	private void method114(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class4_Sub19 local18 = this.aClass4_Sub19ArrayArray2[arg0][arg2];
		if (local18 == null) {
			return;
		}
		this.aClass4_Sub19ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray14[arg0] & 0x2) == 0) {
			local18.anInt2645 = 0;
			return;
		}
		for (@Pc(45) Class4_Sub19 local45 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method982(); local45 != null; local45 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method986()) {
			if (local45.anInt2650 == local18.anInt2650 && local45.anInt2645 < 0 && local45 != local18) {
				local18.anInt2645 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()Lclient!ac;")
	@Override
	public synchronized Class4_Sub1 method1811() {
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V")
	private void method115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray15[arg0] = arg1;
		this.anIntArray23[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass65_1.method1401()) {
			@Pc(14) int local14 = this.aClass65_1.anInt2055 * this.anInt131 / Static115.anInt2690;
			do {
				@Pc(24) long local24 = this.aLong8 + (long) local14 * (long) arg2;
				if (this.aLong7 - local24 >= 0L) {
					this.aLong8 = local24;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong7 + (long) local14 - this.aLong8 - 1L) / (long) local14);
				this.aLong8 += (long) local14 * (long) local54;
				arg2 -= local54;
				this.aClass4_Sub1_Sub4_1.method1813(arg0, arg1, local54);
				this.method93();
				arg1 += local54;
			} while (this.aClass65_1.method1401());
		}
		this.aClass4_Sub1_Sub4_1.method1813(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!c;Lclient!ka;ILclient!pa;I)Z")
	public synchronized boolean method116(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(3) Class62 arg2) {
		arg1.method951();
		@Pc(11) boolean local11 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub13 local29 = (Class4_Sub13) arg1.aClass75_9.method1897(); local29 != null; local29 = (Class4_Sub13) arg1.aClass75_9.method1891()) {
			@Pc(35) int local35 = (int) local29.aLong100;
			@Pc(43) Class4_Sub15 local43 = (Class4_Sub15) this.aClass75_1.method1896((long) local35);
			if (local43 == null) {
				local43 = Static42.method604(local35, arg0);
				if (local43 == null) {
					local11 = false;
					continue;
				}
				this.aClass75_1.method1892((long) local35, local43);
			}
			if (!local43.method1709(local29.aByteArray16, local23, arg2)) {
				local11 = false;
			}
		}
		if (local11) {
			arg1.method952();
		}
		return local11;
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	private void method117() {
		this.method101(-1);
		this.method119(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray26[local23] = this.anIntArray13[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray16[local39] = this.anIntArray13[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()I")
	@Override
	public synchronized int method1816() {
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZI)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray21[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(II)V")
	private void method119(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method119(local12);
			}
			return;
		}
		this.anIntArray18[arg0] = 12800;
		this.anIntArray19[arg0] = 8192;
		this.anIntArray25[arg0] = 16383;
		this.anIntArray21[arg0] = 8192;
		this.anIntArray22[arg0] = 0;
		this.anIntArray12[arg0] = 8192;
		this.method100(arg0);
		this.method124(arg0);
		this.anIntArray14[arg0] = 0;
		this.anIntArray17[arg0] = 32767;
		this.anIntArray20[arg0] = 256;
		this.anIntArray24[arg0] = 0;
		this.method115(arg0, 8192);
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V")
	public synchronized void method120() {
		for (@Pc(19) Class4_Sub15 local19 = (Class4_Sub15) this.aClass75_1.method1897(); local19 != null; local19 = (Class4_Sub15) this.aClass75_1.method1891()) {
			local19.method1710();
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(II)V")
	public synchronized void method121(@OriginalArg(0) int arg0) {
		this.anInt107 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
	public synchronized void method122() {
		this.aClass65_1.method1402();
		this.method117();
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(II)V")
	private void method124(@OriginalArg(0) int arg0) {
		if ((this.anIntArray14[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class4_Sub19 local19 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method982(); local19 != null; local19 = (Class4_Sub19) this.aClass4_Sub1_Sub4_1.aClass45_15.method986()) {
			if (local19.anInt2650 == arg0) {
				local19.anInt2642 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tc;Z)I")
	private int method125(@OriginalArg(0) Class4_Sub19 arg0) {
		@Pc(6) Class80 local6 = arg0.aClass80_1;
		@Pc(22) int local22 = this.anIntArray25[arg0.anInt2650] * this.anIntArray18[arg0.anInt2650] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2634 * local30 + 16384 >> 15;
		local22 = local39 * this.anInt107 + 128 >> 8;
		if (local6.anInt2820 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) arg0.anInt2626 * 1.953125E-5D * (double) local6.anInt2820) * (double) local22 + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(105) int local105;
		@Pc(117) int local117;
		if (local6.aByteArray44 != null) {
			local75 = arg0.anInt2625;
			local83 = local6.aByteArray44[arg0.anInt2646 + 1];
			if (arg0.anInt2646 < local6.aByteArray44.length - 2) {
				local105 = (local6.aByteArray44[arg0.anInt2646] & 0xFF) << 8;
				local117 = (local6.aByteArray44[arg0.anInt2646 + 2] & 0xFF) << 8;
				local83 += (local6.aByteArray44[arg0.anInt2646 + 3] - local83) * (local75 - local105) / (local117 - local105);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt2645 > 0 && local6.aByteArray43 != null) {
			local75 = arg0.anInt2645;
			local83 = local6.aByteArray43[arg0.anInt2635 + 1];
			if (arg0.anInt2635 < local6.aByteArray43.length - 2) {
				local105 = (local6.aByteArray43[arg0.anInt2635] & 0xFF) << 8;
				local117 = (local6.aByteArray43[arg0.anInt2635 + 2] & 0xFF) << 8;
				local83 += (local75 - local105) * (local6.aByteArray43[arg0.anInt2635 + 3] - local83) / (local117 - local105);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLclient!tc;)V")
	public void method126(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub19 arg1) {
		@Pc(8) int local8 = arg1.aClass4_Sub6_Sub1_1.aByteArray36.length;
		@Pc(40) int local40;
		if (arg0 && arg1.aClass4_Sub6_Sub1_1.aBoolean85) {
			@Pc(23) int local23 = local8 + local8 - arg1.aClass4_Sub6_Sub1_1.anInt2327;
			local8 <<= 0x8;
			local40 = (int) ((long) this.anIntArray24[arg1.anInt2650] * (long) local23 >> 6);
			if (local40 >= local8) {
				arg1.aClass4_Sub1_Sub2_1.method928();
				local40 = local8 + local8 - local40 - 1;
			}
		} else {
			local40 = (int) ((long) local8 * (long) this.anIntArray24[arg1.anInt2650] >> 6);
		}
		arg1.aClass4_Sub1_Sub2_1.method936(local40);
	}
}
