import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub21_Sub2 extends Class2_Sub21 {

	@OriginalMember(owner = "client!pc", name = "Qb", descriptor = "Z")
	private boolean aBoolean157;

	@OriginalMember(owner = "client!pc", name = "Rb", descriptor = "I")
	private int anInt3600;

	@OriginalMember(owner = "client!pc", name = "Sb", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!pc", name = "Ub", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!pc", name = "Vb", descriptor = "I")
	private int anInt3601;

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "[[Lclient!j;")
	private Class2_Sub20[][] aClass2_Sub20ArrayArray1 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "[I")
	private int[] anIntArray587 = new int[16];

	@OriginalMember(owner = "client!pc", name = "eb", descriptor = "[I")
	public int[] anIntArray588 = new int[16];

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "[I")
	private int[] anIntArray585 = new int[16];

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "[I")
	private int[] anIntArray582 = new int[16];

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "[I")
	private int[] anIntArray583 = new int[16];

	@OriginalMember(owner = "client!pc", name = "rb", descriptor = "[I")
	private int[] anIntArray591 = new int[16];

	@OriginalMember(owner = "client!pc", name = "wb", descriptor = "[I")
	private int[] anIntArray594 = new int[16];

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "[I")
	public int[] anIntArray584 = new int[16];

	@OriginalMember(owner = "client!pc", name = "sb", descriptor = "[I")
	public int[] anIntArray592 = new int[16];

	@OriginalMember(owner = "client!pc", name = "Db", descriptor = "[I")
	private int[] anIntArray595 = new int[16];

	@OriginalMember(owner = "client!pc", name = "qb", descriptor = "[I")
	private int[] anIntArray590 = new int[16];

	@OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
	private int anInt3580 = 1000000;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "[I")
	private int[] anIntArray581 = new int[16];

	@OriginalMember(owner = "client!pc", name = "vb", descriptor = "[I")
	private int[] anIntArray593 = new int[16];

	@OriginalMember(owner = "client!pc", name = "U", descriptor = "[I")
	private int[] anIntArray586 = new int[16];

	@OriginalMember(owner = "client!pc", name = "Jb", descriptor = "I")
	private int anInt3594 = 256;

	@OriginalMember(owner = "client!pc", name = "Mb", descriptor = "[I")
	private int[] anIntArray596 = new int[16];

	@OriginalMember(owner = "client!pc", name = "Ib", descriptor = "[[Lclient!j;")
	private Class2_Sub20[][] aClass2_Sub20ArrayArray2 = new Class2_Sub20[16][128];

	@OriginalMember(owner = "client!pc", name = "E", descriptor = "Lclient!fh;")
	private Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!pc", name = "Tb", descriptor = "Lclient!jg;")
	private Class2_Sub21_Sub1 aClass2_Sub21_Sub1_1 = new Class2_Sub21_Sub1(this);

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "Lclient!ui;")
	private Class103 aClass103_18 = new Class103(128);

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class2_Sub21_Sub2() {
		this.method2781();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "([IIILclient!j;I)Z")
	public boolean method2768(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub20 arg3) {
		arg3.anInt2120 = Static161.anInt3727 / 100;
		if (arg3.anInt2121 >= 0 && (arg3.aClass2_Sub21_Sub4_3 == null || arg3.aClass2_Sub21_Sub4_3.method3854())) {
			arg3.method1683();
			arg3.method3986();
			if (arg3.anInt2131 > 0 && arg3 == this.aClass2_Sub20ArrayArray2[arg3.anInt2124][arg3.anInt2131]) {
				this.aClass2_Sub20ArrayArray2[arg3.anInt2124][arg3.anInt2131] = null;
			}
			return true;
		}
		@Pc(65) int local65 = arg3.anInt2114;
		@Pc(67) boolean local67 = false;
		if (local65 > 0) {
			local65 -= (int) (Math.pow(2.0D, (double) this.anIntArray581[arg3.anInt2124] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local65 < 0) {
				local65 = 0;
			}
			arg3.anInt2114 = local65;
		}
		arg3.aClass2_Sub21_Sub4_3.method3878(this.method2774(arg3));
		@Pc(119) double local119 = (double) ((arg3.anInt2114 * arg3.anInt2129 >> 12) + (arg3.anInt2130 - 60 << 8)) * 5.086263020833333E-6D;
		arg3.anInt2115++;
		@Pc(128) Class69 local128 = arg3.aClass69_1;
		arg3.anInt2128 += local128.anInt3192;
		if (local128.anInt3195 > 0) {
			if (local128.anInt3188 <= 0) {
				arg3.anInt2117 += 128;
			} else {
				arg3.anInt2117 += (int) (Math.pow(2.0D, (double) local128.anInt3188 * local119) * 128.0D + 0.5D);
			}
			if (local128.anInt3195 * arg3.anInt2117 >= 819200) {
				local67 = true;
			}
		}
		if (local128.aByteArray44 != null) {
			if (local128.anInt3190 > 0) {
				arg3.anInt2112 += (int) (Math.pow(2.0D, (double) local128.anInt3190 * local119) * 128.0D + 0.5D);
			} else {
				arg3.anInt2112 += 128;
			}
			while (local128.aByteArray44.length - 2 > arg3.anInt2132 && (local128.aByteArray44[arg3.anInt2132 + 2] & 0xFF) << 8 < arg3.anInt2112) {
				arg3.anInt2132 += 2;
			}
			if (local128.aByteArray44.length - 2 == arg3.anInt2132 && local128.aByteArray44[arg3.anInt2132 + 1] == 0) {
				local67 = true;
			}
		}
		if (arg3.anInt2121 >= 0 && local128.aByteArray43 != null && (this.anIntArray588[arg3.anInt2124] & 0x1) == 0 && (arg3.anInt2131 < 0 || arg3 != this.aClass2_Sub20ArrayArray2[arg3.anInt2124][arg3.anInt2131])) {
			if (local128.anInt3194 <= 0) {
				arg3.anInt2121 += 128;
			} else {
				arg3.anInt2121 += (int) (Math.pow(2.0D, local119 * (double) local128.anInt3194) * 128.0D + 0.5D);
			}
			while (local128.aByteArray43.length - 2 > arg3.anInt2116 && arg3.anInt2121 > (local128.aByteArray43[arg3.anInt2116 + 2] & 0xFF) << 8) {
				arg3.anInt2116 += 2;
			}
			if (arg3.anInt2116 == local128.aByteArray43.length - 2) {
				local67 = true;
			}
		}
		if (!local67) {
			arg3.aClass2_Sub21_Sub4_3.method3866(arg3.anInt2120, this.method2794(arg3), this.method2801(arg3));
			return false;
		}
		arg3.aClass2_Sub21_Sub4_3.method3885(arg3.anInt2120);
		if (arg0 == null) {
			arg3.aClass2_Sub21_Sub4_3.method3845(arg2);
		} else {
			arg3.aClass2_Sub21_Sub4_3.method3844(arg0, arg1, arg2);
		}
		if (arg3.aClass2_Sub21_Sub4_3.method3883()) {
			this.aClass2_Sub21_Sub1_1.aClass2_Sub21_Sub3_2.method3388(arg3.aClass2_Sub21_Sub4_3);
		}
		arg3.method1683();
		if (arg3.anInt2121 >= 0) {
			arg3.method3986();
			if (arg3.anInt2131 > 0 && arg3 == this.aClass2_Sub20ArrayArray2[arg3.anInt2124][arg3.anInt2131]) {
				this.aClass2_Sub20ArrayArray2[arg3.anInt2124][arg3.anInt2131] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)V")
	private void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray596[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3845(@OriginalArg(0) int arg0) {
		if (this.aClass39_1.method1018()) {
			@Pc(14) int local14 = this.aClass39_1.anInt1233 * this.anInt3580 / Static161.anInt3727;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong134;
				if (this.aLong135 - local23 >= 0L) {
					this.aLong134 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong135 - this.aLong134 - 1L) / (long) local14);
				arg0 -= local53;
				this.aLong134 += (long) local14 * (long) local53;
				this.aClass2_Sub21_Sub1_1.method3845(local53);
				this.method2799();
			} while (this.aClass39_1.method1018());
		}
		this.aClass2_Sub21_Sub1_1.method3845(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIB)V")
	private void method2772() {
		this.anIntArray582[9] = 128;
		this.anIntArray583[9] = 128;
		this.method2783(9, 128);
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)Z")
	public synchronized boolean method2773() {
		return this.aClass39_1.method1018();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!j;B)I")
	private int method2774(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(14) int local14 = arg0.anInt2123 + (arg0.anInt2114 * arg0.anInt2129 >> 12);
		@Pc(17) Class69 local17 = arg0.aClass69_1;
		local14 += this.anIntArray587[arg0.anInt2124] * (this.anIntArray596[arg0.anInt2124] - 8192) >> 12;
		@Pc(71) int local71;
		if (local17.anInt3192 > 0 && (local17.anInt3189 > 0 || this.anIntArray585[arg0.anInt2124] > 0)) {
			@Pc(66) int local66 = local17.anInt3191 << 1;
			local71 = local17.anInt3189 << 2;
			if (arg0.anInt2115 < local66) {
				local71 = local71 * arg0.anInt2115 / local66;
			}
			local71 += this.anIntArray585[arg0.anInt2124] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt2128 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local71 * local105);
		}
		local71 = (int) ((double) (arg0.aClass2_Sub22_Sub1_1.anInt2518 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static161.anInt3727 + 0.5D);
		return local71 < 1 ? 1 : local71;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!cd;ZB)V")
	public synchronized void method2775(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		this.method2800();
		this.aClass39_1.method1009(arg0.aByteArray9);
		this.aLong134 = 0L;
		this.aBoolean157 = arg1;
		@Pc(23) int local23 = this.aClass39_1.method1015();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass39_1.method1010(local25);
			this.aClass39_1.method1016(local25);
			this.aClass39_1.method1014(local25);
		}
		this.anInt3601 = this.aClass39_1.method1020();
		this.anInt3600 = this.aClass39_1.anIntArray218[this.anInt3601];
		this.aLong135 = this.aClass39_1.method1019(this.anInt3600);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(IIB)V")
	private void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray586[arg0] = arg1;
		this.anIntArray584[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	private void method2777(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub20 local6 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1359(); local6 != null; local6 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1356()) {
			if (arg0 < 0 || arg0 == local6.anInt2124) {
				if (local6.aClass2_Sub21_Sub4_3 != null) {
					local6.aClass2_Sub21_Sub4_3.method3885(Static161.anInt3727 / 100);
					if (local6.aClass2_Sub21_Sub4_3.method3883()) {
						this.aClass2_Sub21_Sub1_1.aClass2_Sub21_Sub3_2.method3388(local6.aClass2_Sub21_Sub4_3);
					}
					local6.method1683();
				}
				if (local6.anInt2121 < 0) {
					this.aClass2_Sub20ArrayArray1[local6.anInt2124][local6.anInt2130] = null;
				}
				local6.method3986();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public synchronized void method2778() {
		for (@Pc(20) Class2_Sub13 local20 = (Class2_Sub13) this.aClass103_18.method3668(); local20 != null; local20 = (Class2_Sub13) this.aClass103_18.method3666()) {
			local20.method3986();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)V")
	private void method2779(@OriginalArg(1) int arg0) {
		if ((this.anIntArray588[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(31) Class2_Sub20 local31 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1359(); local31 != null; local31 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1356()) {
			if (arg0 == local31.anInt2124) {
				local31.anInt2118 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!lc;")
	@Override
	public synchronized Class2_Sub21 method3840() {
		return this.aClass2_Sub21_Sub1_1;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(II)V")
	private void method2780(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(38) int local38;
		if (local9 == 128) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			this.method2790(local38, local26, local32);
		} else if (local9 == 144) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			if (local38 > 0) {
				this.method2785(local26, local32, local38);
			} else {
				this.method2790(64, local26, local32);
			}
		} else if (local9 == 160) {
			local26 = arg0 & 0xF;
			local38 = arg0 >> 16 & 0x7F;
			local32 = arg0 >> 8 & 0x7F;
			this.method2789(local38, local32, local26);
		} else if (local9 == 176) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			if (local32 == 0) {
				this.anIntArray583[local26] = (this.anIntArray583[local26] & 0xFFE03FFF) + (local38 << 14);
			}
			if (local32 == 32) {
				this.anIntArray583[local26] = (this.anIntArray583[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 1) {
				this.anIntArray585[local26] = (local38 << 7) + (this.anIntArray585[local26] & 0xFFFFC07F);
			}
			if (local32 == 33) {
				this.anIntArray585[local26] = (this.anIntArray585[local26] & 0xFFFFFF80) + local38;
			}
			if (local32 == 5) {
				this.anIntArray581[local26] = (this.anIntArray581[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 37) {
				this.anIntArray581[local26] = (this.anIntArray581[local26] & 0xFFFFFF80) + local38;
			}
			if (local32 == 7) {
				this.anIntArray590[local26] = (this.anIntArray590[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 39) {
				this.anIntArray590[local26] = local38 + (this.anIntArray590[local26] & 0xFFFFFF80);
			}
			if (local32 == 10) {
				this.anIntArray595[local26] = (local38 << 7) + (this.anIntArray595[local26] & 0xFFFFC07F);
			}
			if (local32 == 42) {
				this.anIntArray595[local26] = (this.anIntArray595[local26] & 0xFFFFFF80) + local38;
			}
			if (local32 == 11) {
				this.anIntArray594[local26] = (local38 << 7) + (this.anIntArray594[local26] & 0xFFFFC07F);
			}
			if (local32 == 43) {
				this.anIntArray594[local26] = local38 + (this.anIntArray594[local26] & 0xFFFFFF80);
			}
			if (local32 == 64) {
				if (local38 >= 64) {
					this.anIntArray588[local26] |= 0x1;
				} else {
					this.anIntArray588[local26] &= 0xFFFFFFFE;
				}
			}
			if (local32 == 65) {
				if (local38 < 64) {
					this.method2786(local26);
					this.anIntArray588[local26] &= 0xFFFFFFFD;
				} else {
					this.anIntArray588[local26] |= 0x2;
				}
			}
			if (local32 == 99) {
				this.anIntArray591[local26] = (local38 << 7) + (this.anIntArray591[local26] & 0x7F);
			}
			if (local32 == 98) {
				this.anIntArray591[local26] = local38 + (this.anIntArray591[local26] & 0x3F80);
			}
			if (local32 == 101) {
				this.anIntArray591[local26] = (local38 << 7) + (this.anIntArray591[local26] & 0x7F) + 16384;
			}
			if (local32 == 100) {
				this.anIntArray591[local26] = local38 + (this.anIntArray591[local26] & 0x3F80) + 16384;
			}
			if (local32 == 120) {
				this.method2777(local26);
			}
			if (local32 == 121) {
				this.method2798(local26);
			}
			if (local32 == 123) {
				this.method2787(local26);
			}
			@Pc(511) int local511;
			if (local32 == 6) {
				local511 = this.anIntArray591[local26];
				if (local511 == 16384) {
					this.anIntArray587[local26] = (this.anIntArray587[local26] & 0xFFFFC07F) + (local38 << 7);
				}
			}
			if (local32 == 38) {
				local511 = this.anIntArray591[local26];
				if (local511 == 16384) {
					this.anIntArray587[local26] = (this.anIntArray587[local26] & 0xFFFFFF80) + local38;
				}
			}
			if (local32 == 16) {
				this.anIntArray592[local26] = (this.anIntArray592[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 48) {
				this.anIntArray592[local26] = local38 + (this.anIntArray592[local26] & 0xFFFFFF80);
			}
			if (local32 == 81) {
				if (local38 < 64) {
					this.method2779(local26);
					this.anIntArray588[local26] &= 0xFFFFFFFB;
				} else {
					this.anIntArray588[local26] |= 0x4;
				}
			}
			if (local32 == 17) {
				this.method2776(local26, (local38 << 7) + (this.anIntArray586[local26] & 0xFFFFC07F));
			}
			if (local32 == 49) {
				this.method2776(local26, local38 + (this.anIntArray586[local26] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local32 = arg0 >> 8 & 0x7F;
			local26 = arg0 & 0xF;
			this.method2783(local26, local32 + this.anIntArray583[local26]);
		} else if (local9 == 208) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			this.method2795(local26, local32);
		} else if (local9 == 224) {
			local32 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00BA) >> 9);
			local26 = arg0 & 0xF;
			this.method2770(local26, local32);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2781();
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	private void method2781() {
		this.method2777(-1);
		this.method2798(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray593[local15] = this.anIntArray582[local15];
		}
		for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
			this.anIntArray583[local32] = this.anIntArray582[local32] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIZ)V")
	private void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray593[arg0] != arg1) {
			this.anIntArray593[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass2_Sub20ArrayArray2[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!cd;IILclient!oe;Lclient!ic;)Z")
	public synchronized boolean method2784(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(3) Class72 arg1, @OriginalArg(4) Class46 arg2) {
		arg0.method379();
		@Pc(7) boolean local7 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class2_Sub18 local27 = (Class2_Sub18) arg0.aClass103_5.method3668(); local27 != null; local27 = (Class2_Sub18) arg0.aClass103_5.method3666()) {
			@Pc(32) int local32 = (int) local27.aLong188;
			@Pc(40) Class2_Sub13 local40 = (Class2_Sub13) this.aClass103_18.method3659((long) local32);
			if (local40 == null) {
				local40 = Static87.method1551(local32, arg1);
				if (local40 == null) {
					local7 = false;
					continue;
				}
				this.aClass103_18.method3665((long) local32, local40);
			}
			if (!local40.method584(local27.aByteArray32, local21, arg2)) {
				local7 = false;
			}
		}
		if (local7) {
			arg0.method381();
		}
		return local7;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass39_1.method1018()) {
			@Pc(18) int local18 = this.anInt3580 * this.aClass39_1.anInt1233 / Static161.anInt3727;
			do {
				@Pc(28) long local28 = this.aLong134 + (long) local18 * (long) arg2;
				if (this.aLong135 - local28 >= 0L) {
					this.aLong134 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong135 - this.aLong134 - 1L) / (long) local18);
				arg2 -= local58;
				this.aLong134 += (long) local58 * (long) local18;
				this.aClass2_Sub21_Sub1_1.method3844(arg0, arg1, local58);
				this.method2799();
				arg1 += local58;
			} while (this.aClass39_1.method1018());
		}
		this.aClass2_Sub21_Sub1_1.method3844(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)V")
	private void method2785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2790(64, arg0, arg1);
		if ((this.anIntArray588[arg0] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub20 local28 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1366(); local28 != null; local28 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1360()) {
				if (arg0 == local28.anInt2124 && local28.anInt2121 < 0) {
					this.aClass2_Sub20ArrayArray1[arg0][local28.anInt2130] = null;
					this.aClass2_Sub20ArrayArray1[arg0][arg1] = local28;
					@Pc(71) int local71 = local28.anInt2123 + (local28.anInt2114 * local28.anInt2129 >> 12);
					local28.anInt2114 = 4096;
					local28.anInt2123 += arg1 - local28.anInt2130 << 8;
					local28.anInt2129 = local71 - local28.anInt2123;
					local28.anInt2130 = arg1;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub13 local116 = (Class2_Sub13) this.aClass103_18.method3659((long) this.anIntArray593[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class2_Sub22_Sub1 local124 = local116.aClass2_Sub22_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class2_Sub20 local131 = new Class2_Sub20();
		local131.anInt2124 = arg0;
		local131.aClass2_Sub22_Sub1_1 = local124;
		local131.aClass2_Sub13_1 = local116;
		local131.aClass69_1 = local116.aClass69Array1[arg1];
		local131.anInt2131 = local116.aByteArray11[arg1];
		local131.anInt2130 = arg1;
		local131.anInt2127 = local116.aByteArray10[arg1] * local116.anInt792 * arg2 * arg2 + 1024 >> 11;
		local131.anInt2111 = local116.aByteArray12[arg1] & 0xFF;
		local131.anInt2123 = (arg1 << 8) - (local116.aShortArray24[arg1] & 0x7FFF);
		local131.anInt2112 = 0;
		local131.anInt2132 = 0;
		local131.anInt2117 = 0;
		local131.anInt2116 = 0;
		local131.anInt2121 = -1;
		if (this.anIntArray592[arg0] == 0) {
			local131.aClass2_Sub21_Sub4_3 = Static237.method3884(local124, this.method2774(local131), this.method2794(local131), this.method2801(local131));
		} else {
			local131.aClass2_Sub21_Sub4_3 = Static237.method3884(local124, this.method2774(local131), 0, this.method2801(local131));
			this.method2791(local131, local116.aShortArray24[arg1] < 0);
		}
		if (local116.aShortArray24[arg1] < 0) {
			local131.aClass2_Sub21_Sub4_3.method3849(-1);
		}
		if (local131.anInt2131 >= 0) {
			@Pc(287) Class2_Sub20 local287 = this.aClass2_Sub20ArrayArray2[arg0][local131.anInt2131];
			if (local287 != null && local287.anInt2121 < 0) {
				this.aClass2_Sub20ArrayArray1[arg0][local287.anInt2130] = null;
				local287.anInt2121 = 0;
			}
			this.aClass2_Sub20ArrayArray2[arg0][local131.anInt2131] = local131;
		}
		this.aClass2_Sub21_Sub1_1.aClass44_24.method1355(local131);
		this.aClass2_Sub20ArrayArray1[arg0][arg1] = local131;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)V")
	private void method2786(@OriginalArg(1) int arg0) {
		if ((this.anIntArray588[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class2_Sub20 local26 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1359(); local26 != null; local26 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1356()) {
			if (arg0 == local26.anInt2124 && this.aClass2_Sub20ArrayArray1[arg0][local26.anInt2130] == null && local26.anInt2121 < 0) {
				local26.anInt2121 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(II)V")
	private void method2787(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1359(); local12 != null; local12 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1356()) {
			if ((arg0 < 0 || local12.anInt2124 == arg0) && local12.anInt2121 < 0) {
				this.aClass2_Sub20ArrayArray1[local12.anInt2124][local12.anInt2130] = null;
				local12.anInt2121 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!j;)Z")
	public boolean method2788(@OriginalArg(1) Class2_Sub20 arg0) {
		if (arg0.aClass2_Sub21_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt2121 >= 0) {
			arg0.method3986();
			if (arg0.anInt2131 > 0 && arg0 == this.aClass2_Sub20ArrayArray2[arg0.anInt2124][arg0.anInt2131]) {
				this.aClass2_Sub20ArrayArray2[arg0.anInt2124][arg0.anInt2131] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIII)V")
	private void method2789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIII)V")
	private void method2790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub20 local14 = this.aClass2_Sub20ArrayArray1[arg1][arg2];
		if (local14 == null) {
			return;
		}
		this.aClass2_Sub20ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray588[arg1] & 0x2) == 0) {
			local14.anInt2121 = 0;
			return;
		}
		for (@Pc(49) Class2_Sub20 local49 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1359(); local49 != null; local49 = (Class2_Sub20) this.aClass2_Sub21_Sub1_1.aClass44_24.method1356()) {
			if (local14.anInt2124 == local49.anInt2124 && local49.anInt2121 < 0 && local49 != local14) {
				local14.anInt2121 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!j;ZI)V")
	public void method2791(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(10) int local10 = arg0.aClass2_Sub22_Sub1_1.aByteArray39.length;
		@Pc(38) int local38;
		if (arg1 && arg0.aClass2_Sub22_Sub1_1.aBoolean108) {
			@Pc(25) int local25 = local10 + local10 - arg0.aClass2_Sub22_Sub1_1.anInt2519;
			local38 = (int) ((long) local25 * (long) this.anIntArray592[arg0.anInt2124] >> 6);
			local10 <<= 0x8;
			if (local10 <= local38) {
				local38 = local10 + local10 - local38 - 1;
				arg0.aClass2_Sub21_Sub4_3.method3858();
			}
		} else {
			local38 = (int) ((long) local10 * (long) this.anIntArray592[arg0.anInt2124] >> 6);
		}
		arg0.aClass2_Sub21_Sub4_3.method3865(local38);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	public synchronized void method2792() {
		for (@Pc(11) Class2_Sub13 local11 = (Class2_Sub13) this.aClass103_18.method3668(); local11 != null; local11 = (Class2_Sub13) this.aClass103_18.method3666()) {
			local11.method583();
		}
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)I")
	public int method2793() {
		return this.anInt3594;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!j;)I")
	private int method2794(@OriginalArg(1) Class2_Sub20 arg0) {
		@Pc(6) Class69 local6 = arg0.aClass69_1;
		@Pc(28) int local28 = this.anIntArray594[arg0.anInt2124] * this.anIntArray590[arg0.anInt2124] + 4096 >> 13;
		@Pc(36) int local36 = local28 * local28 + 16384 >> 15;
		@Pc(45) int local45 = arg0.anInt2127 * local36 + 16384 >> 15;
		local28 = this.anInt3594 * local45 + 128 >> 8;
		if (local6.anInt3195 > 0) {
			local28 = (int) ((double) local28 * Math.pow(0.5D, (double) local6.anInt3195 * 1.953125E-5D * (double) arg0.anInt2117) + 0.5D);
		}
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(119) int local119;
		@Pc(109) int local109;
		if (local6.aByteArray44 != null) {
			local81 = arg0.anInt2112;
			local89 = local6.aByteArray44[arg0.anInt2132 + 1];
			if (local6.aByteArray44.length - 2 > arg0.anInt2132) {
				local109 = (local6.aByteArray44[arg0.anInt2132 + 2] & 0xFF) << 8;
				local119 = (local6.aByteArray44[arg0.anInt2132] & 0xFF) << 8;
				local89 += (local81 - local119) * (local6.aByteArray44[arg0.anInt2132 + 3] - local89) / (local109 - local119);
			}
			local28 = local89 * local28 + 32 >> 6;
		}
		if (arg0.anInt2121 > 0 && local6.aByteArray43 != null) {
			local81 = arg0.anInt2121;
			local89 = local6.aByteArray43[arg0.anInt2116 + 1];
			if (local6.aByteArray43.length - 2 > arg0.anInt2116) {
				local119 = (local6.aByteArray43[arg0.anInt2116] & 0xFF) << 8;
				local109 = (local6.aByteArray43[arg0.anInt2116 + 2] & 0xFF) << 8;
				local89 += (local81 - local119) * (local6.aByteArray43[arg0.anInt2116 + 3] - local89) / (local109 - local119);
			}
			local28 = local89 * local28 + 32 >> 6;
		}
		return local28;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
	private void method2795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
	public synchronized void method2796() {
		this.method2772();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)V")
	public synchronized void method2797(@OriginalArg(1) int arg0) {
		this.anInt3594 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3843() {
		return 0;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(II)V")
	private void method2798(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method2798(local7);
			}
			return;
		}
		this.anIntArray590[arg0] = 12800;
		this.anIntArray595[arg0] = 8192;
		this.anIntArray594[arg0] = 16383;
		this.anIntArray596[arg0] = 8192;
		this.anIntArray585[arg0] = 0;
		this.anIntArray581[arg0] = 8192;
		this.method2786(arg0);
		this.method2779(arg0);
		this.anIntArray588[arg0] = 0;
		this.anIntArray591[arg0] = 32767;
		this.anIntArray587[arg0] = 256;
		this.anIntArray592[arg0] = 0;
		this.method2776(arg0, 8192);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "()Lclient!lc;")
	@Override
	public synchronized Class2_Sub21 method3842() {
		return null;
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	private void method2799() {
		@Pc(16) int local16 = this.anInt3601;
		@Pc(19) int local19 = this.anInt3600;
		@Pc(22) long local22 = this.aLong135;
		while (local19 == this.anInt3600) {
			while (this.aClass39_1.anIntArray218[local16] == local19) {
				this.aClass39_1.method1010(local16);
				@Pc(33) int local33 = this.aClass39_1.method1013(local16);
				if (local33 == 1) {
					this.aClass39_1.method1008();
					this.aClass39_1.method1014(local16);
					if (this.aClass39_1.method1017()) {
						if (!this.aBoolean157 || local19 == 0) {
							this.method2781();
							this.aClass39_1.method1011();
							return;
						}
						this.aClass39_1.method1007(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method2780(local33);
				}
				this.aClass39_1.method1016(local16);
				this.aClass39_1.method1014(local16);
			}
			local16 = this.aClass39_1.method1020();
			local19 = this.aClass39_1.anIntArray218[local16];
			local22 = this.aClass39_1.method1019(local19);
		}
		this.aLong135 = local22;
		this.anInt3600 = local19;
		this.anInt3601 = local16;
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
	public synchronized void method2800() {
		this.aClass39_1.method1011();
		this.method2781();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!j;I)I")
	private int method2801(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(9) int local9 = this.anIntArray595[arg0.anInt2124];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt2111) * (-local9 + 16384) + 32 >> 6) : arg0.anInt2111 * local9 + 32 >> 6;
	}
}
