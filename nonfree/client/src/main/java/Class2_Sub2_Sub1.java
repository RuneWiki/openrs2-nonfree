import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ca", name = "Ib", descriptor = "I")
	private int anInt503;

	@OriginalMember(owner = "client!ca", name = "Jb", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!ca", name = "Kb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!ca", name = "Lb", descriptor = "I")
	private int anInt504;

	@OriginalMember(owner = "client!ca", name = "Nb", descriptor = "Z")
	private boolean aBoolean19;

	@OriginalMember(owner = "client!ca", name = "E", descriptor = "[I")
	private final int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "[I")
	public final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!ca", name = "ab", descriptor = "[I")
	private final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!ca", name = "sb", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!ca", name = "pb", descriptor = "[[Lclient!ib;")
	private final Class2_Sub9[][] aClass2_Sub9ArrayArray2 = new Class2_Sub9[16][128];

	@OriginalMember(owner = "client!ca", name = "lb", descriptor = "[I")
	private final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!ca", name = "ub", descriptor = "I")
	private final int anInt493 = 1000000;

	@OriginalMember(owner = "client!ca", name = "P", descriptor = "[I")
	private final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!ca", name = "O", descriptor = "[I")
	private final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!ca", name = "yb", descriptor = "[I")
	private final int[] anIntArray52 = new int[16];

	@OriginalMember(owner = "client!ca", name = "qb", descriptor = "I")
	private int anInt491 = 256;

	@OriginalMember(owner = "client!ca", name = "jb", descriptor = "[I")
	private final int[] anIntArray48 = new int[16];

	@OriginalMember(owner = "client!ca", name = "Y", descriptor = "[[Lclient!ib;")
	private final Class2_Sub9[][] aClass2_Sub9ArrayArray1 = new Class2_Sub9[16][128];

	@OriginalMember(owner = "client!ca", name = "tb", descriptor = "[I")
	public final int[] anIntArray51 = new int[16];

	@OriginalMember(owner = "client!ca", name = "Ab", descriptor = "[I")
	private final int[] anIntArray53 = new int[16];

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "[I")
	private final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!ca", name = "hb", descriptor = "[I")
	private final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!ca", name = "Cb", descriptor = "[I")
	private final int[] anIntArray54 = new int[16];

	@OriginalMember(owner = "client!ca", name = "L", descriptor = "[I")
	public final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!ca", name = "zb", descriptor = "Lclient!th;")
	private final Class97 aClass97_1 = new Class97();

	@OriginalMember(owner = "client!ca", name = "Mb", descriptor = "Lclient!gh;")
	private final Class2_Sub2_Sub2 aClass2_Sub2_Sub2_1 = new Class2_Sub2_Sub2(this);

	@OriginalMember(owner = "client!ca", name = "S", descriptor = "Lclient!lc;")
	private final Class58 aClass58_3 = new Class58(128);

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		this.method360();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
	public synchronized void method358(@OriginalArg(1) int arg0) {
		this.anInt491 = arg0;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
	private void method359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray45[arg1] = arg0;
		this.anIntArray40[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
	private void method360() {
		this.method365(-1);
		this.method383(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray47[local23] = this.anIntArray52[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray41[local41] = this.anIntArray52[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
	private void method361(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = arg0 & 0xF0;
		@Pc(30) int local30;
		@Pc(26) int local26;
		@Pc(36) int local36;
		if (local11 == 128) {
			local26 = arg0 >> 8 & 0x7F;
			local30 = arg0 & 0xF;
			local36 = arg0 >> 16 & 0x7F;
			this.method385(local30, local26, local36);
		} else if (local11 == 144) {
			local26 = arg0 >> 8 & 0x7F;
			local30 = arg0 & 0xF;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method379(local26, local36, local30);
			} else {
				this.method385(local30, local26, 64);
			}
		} else if (local11 == 160) {
			local36 = arg0 >> 16 & 0x7F;
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method389(local36, local26, local30);
		} else if (local11 == 176) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray41[local30] = (local36 << 14) + (this.anIntArray41[local30] & 0xFFE03FFF);
			}
			if (local26 == 32) {
				this.anIntArray41[local30] = (this.anIntArray41[local30] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local26 == 1) {
				this.anIntArray48[local30] = (local36 << 7) + (this.anIntArray48[local30] & 0xFFFFC07F);
			}
			if (local26 == 33) {
				this.anIntArray48[local30] = (this.anIntArray48[local30] & 0xFFFFFF80) + local36;
			}
			if (local26 == 5) {
				this.anIntArray42[local30] = (this.anIntArray42[local30] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local26 == 37) {
				this.anIntArray42[local30] = local36 + (this.anIntArray42[local30] & 0xFFFFFF80);
			}
			if (local26 == 7) {
				this.anIntArray49[local30] = (this.anIntArray49[local30] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local26 == 39) {
				this.anIntArray49[local30] = local36 + (this.anIntArray49[local30] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray54[local30] = (local36 << 7) + (this.anIntArray54[local30] & 0xFFFFC07F);
			}
			if (local26 == 42) {
				this.anIntArray54[local30] = local36 + (this.anIntArray54[local30] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.anIntArray44[local30] = (local36 << 7) + (this.anIntArray44[local30] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.anIntArray44[local30] = (this.anIntArray44[local30] & 0xFFFFFF80) + local36;
			}
			if (local26 == 64) {
				if (local36 < 64) {
					this.anIntArray51[local30] &= 0xFFFFFFFE;
				} else {
					this.anIntArray51[local30] |= 0x1;
				}
			}
			if (local26 == 65) {
				if (local36 >= 64) {
					this.anIntArray51[local30] |= 0x2;
				} else {
					this.method378(local30);
					this.anIntArray51[local30] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray46[local30] = (this.anIntArray46[local30] & 0x7F) + (local36 << 7);
			}
			if (local26 == 98) {
				this.anIntArray46[local30] = (this.anIntArray46[local30] & 0x3F80) + local36;
			}
			if (local26 == 101) {
				this.anIntArray46[local30] = (local36 << 7) + (this.anIntArray46[local30] & 0x7F) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray46[local30] = local36 + (this.anIntArray46[local30] & 0x3F80) + 16384;
			}
			if (local26 == 120) {
				this.method365(local30);
			}
			if (local26 == 121) {
				this.method383(local30);
			}
			if (local26 == 123) {
				this.method390(local30);
			}
			@Pc(507) int local507;
			if (local26 == 6) {
				local507 = this.anIntArray46[local30];
				if (local507 == 16384) {
					this.anIntArray53[local30] = (local36 << 7) + (this.anIntArray53[local30] & 0xFFFFC07F);
				}
			}
			if (local26 == 38) {
				local507 = this.anIntArray46[local30];
				if (local507 == 16384) {
					this.anIntArray53[local30] = local36 + (this.anIntArray53[local30] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray43[local30] = (local36 << 7) + (this.anIntArray43[local30] & 0xFFFFC07F);
			}
			if (local26 == 48) {
				this.anIntArray43[local30] = (this.anIntArray43[local30] & 0xFFFFFF80) + local36;
			}
			if (local26 == 81) {
				if (local36 < 64) {
					this.method364(local30);
					this.anIntArray51[local30] &= 0xFFFFFFFB;
				} else {
					this.anIntArray51[local30] |= 0x4;
				}
			}
			if (local26 == 17) {
				this.method359((this.anIntArray45[local30] & 0xFFFFC07F) + (local36 << 7), local30);
			}
			if (local26 == 49) {
				this.method359((this.anIntArray45[local30] & 0xFFFFFF80) + local36, local30);
			}
		} else if (local11 == 192) {
			local26 = arg0 >> 8 & 0x7F;
			local30 = arg0 & 0xF;
			this.method381(local26 + this.anIntArray41[local30], local30);
		} else if (local11 == 208) {
			local30 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method370(local26, local30);
		} else if (local11 == 224) {
			local30 = arg0 & 0xF;
			local26 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method392(local30, local26);
		} else {
			local11 = arg0 & 0xFF;
			if (local11 == 255) {
				this.method360();
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ne;ILclient!ei;ILclient!pb;)Z")
	public synchronized boolean method363(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(4) Class71 arg2) {
		arg0.method2009();
		@Pc(15) boolean local15 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class2_Sub6 local32 = (Class2_Sub6) arg0.aClass58_12.method1709(); local32 != null; local32 = (Class2_Sub6) arg0.aClass58_12.method1705()) {
			@Pc(38) int local38 = (int) local32.aLong148;
			@Pc(48) Class2_Sub15 local48 = (Class2_Sub15) this.aClass58_3.method1704((long) local38);
			if (local48 == null) {
				local48 = Static202.method2943(arg2, local38);
				if (local48 == null) {
					local15 = false;
					continue;
				}
				this.aClass58_3.method1708(local48, (long) local38);
			}
			if (!local48.method2003(arg1, local26, local32.aByteArray9)) {
				local15 = false;
			}
		}
		if (local15) {
			arg0.method2011();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V")
	private void method364(@OriginalArg(0) int arg0) {
		if ((this.anIntArray51[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub9 local23 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method303(); local23 != null; local23 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method309()) {
			if (local23.anInt1725 == arg0) {
				local23.anInt1724 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(II)V")
	private void method365(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub9 local8 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method303(); local8 != null; local8 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method309()) {
			if (arg0 < 0 || arg0 == local8.anInt1725) {
				if (local8.aClass2_Sub2_Sub4_3 != null) {
					local8.aClass2_Sub2_Sub4_3.method2863(Static88.anInt1852 / 100);
					if (local8.aClass2_Sub2_Sub4_3.method2868()) {
						this.aClass2_Sub2_Sub2_1.aClass2_Sub2_Sub3_2.method2608(local8.aClass2_Sub2_Sub4_3);
					}
					local8.method1170();
				}
				if (local8.anInt1727 < 0) {
					this.aClass2_Sub9ArrayArray2[local8.anInt1725][local8.anInt1729] = null;
				}
				local8.method3183();
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
	public synchronized void method366() {
		for (@Pc(13) Class2_Sub15 local13 = (Class2_Sub15) this.aClass58_3.method1709(); local13 != null; local13 = (Class2_Sub15) this.aClass58_3.method1705()) {
			local13.method3183();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2853(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass97_1.method2698()) {
			@Pc(18) int local18 = this.anInt493 * this.aClass97_1.anInt3893 / Static88.anInt1852;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong29;
				if (this.aLong28 - local27 >= 0L) {
					this.aLong29 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong28 - this.aLong29 - 1L) / (long) local18);
				arg2 -= local55;
				this.aLong29 += (long) local55 * (long) local18;
				this.aClass2_Sub2_Sub2_1.method2853(arg0, arg1, local55);
				arg1 += local55;
				this.method382();
			} while (this.aClass97_1.method2698());
		}
		this.aClass2_Sub2_Sub2_1.method2853(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ne;ZI)V")
	public synchronized void method367(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		this.method387();
		this.aClass97_1.method2694(arg0.aByteArray33);
		this.aBoolean19 = arg1;
		this.aLong29 = 0L;
		@Pc(31) int local31 = this.aClass97_1.method2687();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass97_1.method2684(local33);
			this.aClass97_1.method2685(local33);
			this.aClass97_1.method2692(local33);
		}
		this.anInt504 = this.aClass97_1.method2696();
		this.anInt503 = this.aClass97_1.anIntArray358[this.anInt504];
		this.aLong28 = this.aClass97_1.method2695(this.anInt503);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ib;I)Z")
	public boolean method368(@OriginalArg(0) Class2_Sub9 arg0) {
		if (arg0.aClass2_Sub2_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt1727 >= 0) {
			arg0.method3183();
			if (arg0.anInt1732 > 0 && arg0 == this.aClass2_Sub9ArrayArray1[arg0.anInt1725][arg0.anInt1732]) {
				this.aClass2_Sub9ArrayArray1[arg0.anInt1725][arg0.anInt1732] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILclient!ib;[I)Z")
	public boolean method369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub9 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt1728 = Static88.anInt1852 / 100;
		if (arg2.anInt1727 >= 0 && (arg2.aClass2_Sub2_Sub4_3 == null || arg2.aClass2_Sub2_Sub4_3.method2890())) {
			arg2.method1170();
			arg2.method3183();
			if (arg2.anInt1732 > 0 && this.aClass2_Sub9ArrayArray1[arg2.anInt1725][arg2.anInt1732] == arg2) {
				this.aClass2_Sub9ArrayArray1[arg2.anInt1725][arg2.anInt1732] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt1723;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray42[arg2.anInt1725] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt1723 = local56;
		}
		arg2.aClass2_Sub2_Sub4_3.method2891(this.method380(arg2));
		@Pc(96) Class29 local96 = arg2.aClass29_1;
		arg2.anInt1716 += local96.anInt1038;
		@Pc(105) boolean local105 = false;
		arg2.anInt1719++;
		@Pc(129) double local129 = (double) ((arg2.anInt1729 - 60 << 8) + (arg2.anInt1721 * arg2.anInt1723 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt1036 > 0) {
			if (local96.anInt1035 > 0) {
				arg2.anInt1736 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt1035) * 128.0D + 0.5D);
			} else {
				arg2.anInt1736 += 128;
			}
			if (local96.anInt1036 * arg2.anInt1736 >= 819200) {
				local105 = true;
			}
		}
		if (local96.aByteArray7 != null) {
			if (local96.anInt1037 <= 0) {
				arg2.anInt1714 += 128;
			} else {
				arg2.anInt1714 += (int) (Math.pow(2.0D, (double) local96.anInt1037 * local129) * 128.0D + 0.5D);
			}
			while (arg2.anInt1731 < local96.aByteArray7.length - 2 && (local96.aByteArray7[arg2.anInt1731 + 2] & 0xFF) << 8 < arg2.anInt1714) {
				arg2.anInt1731 += 2;
			}
			if (arg2.anInt1731 == local96.aByteArray7.length - 2 && local96.aByteArray7[arg2.anInt1731 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg2.anInt1727 >= 0 && local96.aByteArray8 != null && (this.anIntArray51[arg2.anInt1725] & 0x1) == 0 && (arg2.anInt1732 < 0 || arg2 != this.aClass2_Sub9ArrayArray1[arg2.anInt1725][arg2.anInt1732])) {
			if (local96.anInt1042 > 0) {
				arg2.anInt1727 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt1042) * 128.0D + 0.5D);
			} else {
				arg2.anInt1727 += 128;
			}
			while (local96.aByteArray8.length - 2 > arg2.anInt1720 && (local96.aByteArray8[arg2.anInt1720 + 2] & 0xFF) << 8 < arg2.anInt1727) {
				arg2.anInt1720 += 2;
			}
			if (local96.aByteArray8.length - 2 == arg2.anInt1720) {
				local105 = true;
			}
		}
		if (!local105) {
			arg2.aClass2_Sub2_Sub4_3.method2866(arg2.anInt1728, this.method373(arg2), this.method376(arg2));
			return false;
		}
		arg2.aClass2_Sub2_Sub4_3.method2863(arg2.anInt1728);
		if (arg3 == null) {
			arg2.aClass2_Sub2_Sub4_3.method2850(arg0);
		} else {
			arg2.aClass2_Sub2_Sub4_3.method2853(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub2_Sub4_3.method2868()) {
			this.aClass2_Sub2_Sub2_1.aClass2_Sub2_Sub3_2.method2608(arg2.aClass2_Sub2_Sub4_3);
		}
		arg2.method1170();
		if (arg2.anInt1727 >= 0) {
			arg2.method3183();
			if (arg2.anInt1732 > 0 && this.aClass2_Sub9ArrayArray1[arg2.anInt1725][arg2.anInt1732] == arg2) {
				this.aClass2_Sub9ArrayArray1[arg2.anInt1725][arg2.anInt1732] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
	private void method370(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)I")
	public int method372() {
		return this.anInt491;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "()Lclient!af;")
	@Override
	public synchronized Class2_Sub2 method2848() {
		return this.aClass2_Sub2_Sub2_1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ib;B)I")
	private int method373(@OriginalArg(0) Class2_Sub9 arg0) {
		@Pc(6) Class29 local6 = arg0.aClass29_1;
		@Pc(22) int local22 = this.anIntArray44[arg0.anInt1725] * this.anIntArray49[arg0.anInt1725] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt1722 + 16384 >> 15;
		local22 = local39 * this.anInt491 + 128 >> 8;
		if (local6.anInt1036 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt1036 * 1.953125E-5D * (double) arg0.anInt1736) * (double) local22 + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(125) int local125;
		@Pc(115) int local115;
		if (local6.aByteArray7 != null) {
			local83 = arg0.anInt1714;
			local91 = local6.aByteArray7[arg0.anInt1731 + 1];
			if (arg0.anInt1731 < local6.aByteArray7.length - 2) {
				local115 = (local6.aByteArray7[arg0.anInt1731 + 2] & 0xFF) << 8;
				local125 = (local6.aByteArray7[arg0.anInt1731] & 0xFF) << 8;
				local91 += (local83 - local125) * (local6.aByteArray7[arg0.anInt1731 + 3] - local91) / (local115 - local125);
			}
			local22 = local91 * local22 + 32 >> 6;
		}
		if (arg0.anInt1727 > 0 && local6.aByteArray8 != null) {
			local83 = arg0.anInt1727;
			local91 = local6.aByteArray8[arg0.anInt1720 + 1];
			if (arg0.anInt1720 < local6.aByteArray8.length - 2) {
				local125 = (local6.aByteArray8[arg0.anInt1720] & 0xFF) << 8;
				local115 = (local6.aByteArray8[arg0.anInt1720 + 2] & 0xFF) << 8;
				local91 += (local83 - local125) * (local6.aByteArray8[arg0.anInt1720 + 3] - local91) / (local115 - local125);
			}
			local22 = local22 * local91 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)Z")
	public synchronized boolean method374() {
		return this.aClass97_1.method2698();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ib;)I")
	private int method376(@OriginalArg(1) Class2_Sub9 arg0) {
		@Pc(9) int local9 = this.anIntArray54[arg0.anInt1725];
		return local9 < 8192 ? arg0.anInt1715 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt1715 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()Lclient!af;")
	@Override
	public synchronized Class2_Sub2 method2847() {
		return null;
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
	public synchronized void method377() {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass58_3.method1709(); local11 != null; local11 = (Class2_Sub15) this.aClass58_3.method1705()) {
			local11.method2004();
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(II)V")
	private void method378(@OriginalArg(0) int arg0) {
		if ((this.anIntArray51[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub9 local15 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method303(); local15 != null; local15 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method309()) {
			if (arg0 == local15.anInt1725 && this.aClass2_Sub9ArrayArray2[arg0][local15.anInt1729] == null && local15.anInt1727 < 0) {
				local15.anInt1727 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)V")
	private void method379(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method385(arg2, arg0, 64);
		if ((this.anIntArray51[arg2] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub9 local25 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method308(); local25 != null; local25 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method313()) {
				if (arg2 == local25.anInt1725 && local25.anInt1727 < 0) {
					this.aClass2_Sub9ArrayArray2[arg2][local25.anInt1729] = null;
					this.aClass2_Sub9ArrayArray2[arg2][arg0] = local25;
					@Pc(63) int local63 = (local25.anInt1721 * local25.anInt1723 >> 12) + local25.anInt1713;
					local25.anInt1723 = 4096;
					local25.anInt1713 += arg0 - local25.anInt1729 << 8;
					local25.anInt1721 = local63 - local25.anInt1713;
					local25.anInt1729 = arg0;
					return;
				}
			}
		}
		@Pc(109) Class2_Sub15 local109 = (Class2_Sub15) this.aClass58_3.method1704((long) this.anIntArray47[arg2]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class2_Sub20_Sub1 local117 = local109.aClass2_Sub20_Sub1Array1[arg0];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class2_Sub9 local124 = new Class2_Sub9();
		local124.aClass2_Sub20_Sub1_1 = local117;
		local124.aClass2_Sub15_1 = local109;
		local124.anInt1725 = arg2;
		local124.aClass29_1 = local109.aClass29Array1[arg0];
		local124.anInt1732 = local109.aByteArray31[arg0];
		local124.anInt1729 = arg0;
		local124.anInt1722 = local109.aByteArray30[arg0] * arg1 * arg1 * local109.anInt2826 + 1024 >> 11;
		local124.anInt1715 = local109.aByteArray32[arg0] & 0xFF;
		local124.anInt1713 = (arg0 << 8) - (local109.aShortArray102[arg0] & 0x7FFF);
		local124.anInt1731 = 0;
		local124.anInt1736 = 0;
		local124.anInt1714 = 0;
		local124.anInt1727 = -1;
		local124.anInt1720 = 0;
		if (this.anIntArray43[arg2] == 0) {
			local124.aClass2_Sub2_Sub4_3 = Static223.method2875(local117, this.method380(local124), this.method373(local124), this.method376(local124));
		} else {
			local124.aClass2_Sub2_Sub4_3 = Static223.method2875(local117, this.method380(local124), 0, this.method376(local124));
			this.method386(local109.aShortArray102[arg0] < 0, local124);
		}
		if (local109.aShortArray102[arg0] < 0) {
			local124.aClass2_Sub2_Sub4_3.method2888(-1);
		}
		if (local124.anInt1732 >= 0) {
			@Pc(284) Class2_Sub9 local284 = this.aClass2_Sub9ArrayArray1[arg2][local124.anInt1732];
			if (local284 != null && local284.anInt1727 < 0) {
				this.aClass2_Sub9ArrayArray2[arg2][local284.anInt1729] = null;
				local284.anInt1727 = 0;
			}
			this.aClass2_Sub9ArrayArray1[arg2][local124.anInt1732] = local124;
		}
		this.aClass2_Sub2_Sub2_1.aClass13_2.method304(local124);
		this.aClass2_Sub9ArrayArray2[arg2][arg0] = local124;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2850(@OriginalArg(0) int arg0) {
		if (this.aClass97_1.method2698()) {
			@Pc(18) int local18 = this.aClass97_1.anInt3893 * this.anInt493 / Static88.anInt1852;
			do {
				@Pc(28) long local28 = this.aLong29 + (long) local18 * (long) arg0;
				if (this.aLong28 - local28 >= 0L) {
					this.aLong29 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong28 - this.aLong29 - 1L) / (long) local18);
				this.aLong29 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass2_Sub2_Sub2_1.method2850(local57);
				this.method382();
			} while (this.aClass97_1.method2698());
		}
		this.aClass2_Sub2_Sub2_1.method2850(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Lclient!ib;I)I")
	private int method380(@OriginalArg(0) Class2_Sub9 arg0) {
		@Pc(14) int local14 = (arg0.anInt1721 * arg0.anInt1723 >> 12) + arg0.anInt1713;
		local14 += this.anIntArray53[arg0.anInt1725] * (this.anIntArray50[arg0.anInt1725] - 8192) >> 12;
		@Pc(35) Class29 local35 = arg0.aClass29_1;
		@Pc(61) int local61;
		if (local35.anInt1038 > 0 && (local35.anInt1040 > 0 || this.anIntArray48[arg0.anInt1725] > 0)) {
			local61 = local35.anInt1040 << 2;
			@Pc(66) int local66 = local35.anInt1039 << 1;
			if (local66 > arg0.anInt1719) {
				local61 = local61 * arg0.anInt1719 / local66;
			}
			local61 += this.anIntArray48[arg0.anInt1725] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt1716 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local61 * local96);
		}
		local61 = (int) ((double) (arg0.aClass2_Sub20_Sub1_1.anInt3409 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static88.anInt1852 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)V")
	private void method381(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray47[arg1]) {
			this.anIntArray47[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub9ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(B)V")
	private void method382() {
		@Pc(15) int local15 = this.anInt504;
		@Pc(18) int local18 = this.anInt503;
		@Pc(21) long local21 = this.aLong28;
		while (local18 == this.anInt503) {
			while (local18 == this.aClass97_1.anIntArray358[local15]) {
				this.aClass97_1.method2684(local15);
				@Pc(32) int local32 = this.aClass97_1.method2697(local15);
				if (local32 == 1) {
					this.aClass97_1.method2691();
					this.aClass97_1.method2692(local15);
					if (this.aClass97_1.method2686()) {
						if (!this.aBoolean19 || local18 == 0) {
							this.method360();
							this.aClass97_1.method2693();
							return;
						}
						this.aClass97_1.method2699(local21);
					}
					break;
				}
				if ((local32 & 0x80) != 0) {
					this.method361(local32);
				}
				this.aClass97_1.method2685(local15);
				this.aClass97_1.method2692(local15);
			}
			local15 = this.aClass97_1.method2696();
			local18 = this.aClass97_1.anIntArray358[local15];
			local21 = this.aClass97_1.method2695(local18);
		}
		this.aLong28 = local21;
		this.anInt504 = local15;
		this.anInt503 = local18;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(II)V")
	private void method383(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
				this.method383(local18);
			}
			return;
		}
		this.anIntArray49[arg0] = 12800;
		this.anIntArray54[arg0] = 8192;
		this.anIntArray44[arg0] = 16383;
		this.anIntArray50[arg0] = 8192;
		this.anIntArray48[arg0] = 0;
		this.anIntArray42[arg0] = 8192;
		this.method378(arg0);
		this.method364(arg0);
		this.anIntArray51[arg0] = 0;
		this.anIntArray46[arg0] = 32767;
		this.anIntArray53[arg0] = 256;
		this.anIntArray43[arg0] = 0;
		this.method359(8192, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(III)V")
	private void method384() {
		this.anIntArray52[9] = 128;
		this.anIntArray41[9] = 128;
		this.method381(128, 9);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(IIII)V")
	private void method385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub9 local15 = this.aClass2_Sub9ArrayArray2[arg0][arg1];
		if (local15 == null) {
			return;
		}
		this.aClass2_Sub9ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray51[arg0] & 0x2) == 0) {
			local15.anInt1727 = 0;
			return;
		}
		for (@Pc(42) Class2_Sub9 local42 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method303(); local42 != null; local42 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method309()) {
			if (local42.anInt1725 == local15.anInt1725 && local42.anInt1727 < 0 && local15 != local42) {
				local15.anInt1727 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZBLclient!ib;)V")
	public void method386(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub9 arg1) {
		@Pc(16) int local16 = arg1.aClass2_Sub20_Sub1_1.aByteArray35.length;
		@Pc(48) int local48;
		if (arg0 && arg1.aClass2_Sub20_Sub1_1.aBoolean146) {
			@Pc(31) int local31 = local16 + local16 - arg1.aClass2_Sub20_Sub1_1.anInt3410;
			local16 <<= 0x8;
			local48 = (int) ((long) this.anIntArray43[arg1.anInt1725] * (long) local31 >> 6);
			if (local48 >= local16) {
				local48 = local16 + local16 - local48 - 1;
				arg1.aClass2_Sub2_Sub4_3.method2889();
			}
		} else {
			local48 = (int) ((long) local16 * (long) this.anIntArray43[arg1.anInt1725] >> 6);
		}
		arg1.aClass2_Sub2_Sub4_3.method2867(local48);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2849() {
		return 0;
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(B)V")
	public synchronized void method387() {
		this.aClass97_1.method2693();
		this.method360();
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(IIII)V")
	private void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(II)V")
	private void method390(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub9 local12 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method303(); local12 != null; local12 = (Class2_Sub9) this.aClass2_Sub2_Sub2_1.aClass13_2.method309()) {
			if ((arg0 < 0 || local12.anInt1725 == arg0) && local12.anInt1727 < 0) {
				this.aClass2_Sub9ArrayArray2[local12.anInt1725][local12.anInt1729] = null;
				local12.anInt1727 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(III)V")
	public synchronized void method391() {
		this.method384();
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "(III)V")
	private void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray50[arg0] = arg1;
	}
}
