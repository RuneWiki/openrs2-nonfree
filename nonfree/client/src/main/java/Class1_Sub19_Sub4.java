import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub19_Sub4 extends Class1_Sub19 {

	@OriginalMember(owner = "client!mf", name = "Cb", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!mf", name = "Db", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!mf", name = "Eb", descriptor = "I")
	private int anInt4467;

	@OriginalMember(owner = "client!mf", name = "Fb", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!mf", name = "Gb", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!mf", name = "Ib", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!mf", name = "Jb", descriptor = "Lclient!a;")
	private Class1_Sub1 aClass1_Sub1_3;

	@OriginalMember(owner = "client!mf", name = "Kb", descriptor = "I")
	private int anInt4468;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "[I")
	public final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "[I")
	private final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[I")
	private final int[] anIntArray370 = new int[16];

	@OriginalMember(owner = "client!mf", name = "R", descriptor = "[I")
	private final int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!mf", name = "T", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "[[Lclient!ej;")
	private final Class1_Sub16[][] aClass1_Sub16ArrayArray1 = new Class1_Sub16[16][128];

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	private int anInt4452 = 256;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "[I")
	public final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "[I")
	public final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!mf", name = "sb", descriptor = "[I")
	private final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "[[Lclient!ej;")
	private final Class1_Sub16[][] lb = new Class1_Sub16[16][128];

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "[I")
	private final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!mf", name = "ob", descriptor = "[I")
	private final int[] anIntArray378 = new int[16];

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "[I")
	private final int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!mf", name = "ub", descriptor = "[I")
	private final int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!mf", name = "wb", descriptor = "[I")
	private final int[] anIntArray381 = new int[16];

	@OriginalMember(owner = "client!mf", name = "xb", descriptor = "[I")
	private final int[] anIntArray382 = new int[16];

	@OriginalMember(owner = "client!mf", name = "Bb", descriptor = "I")
	private final int anInt4465 = 1000000;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!al;")
	private final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!mf", name = "Hb", descriptor = "Lclient!kq;")
	private final Class1_Sub19_Sub3 aClass1_Sub19_Sub3_1 = new Class1_Sub19_Sub3(this);

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!gu;")
	private final Class96 aClass96_28 = new Class96(128);

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub19_Sub4() {
		this.method3674();
		this.method3659(true);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIB)V")
	private void method3652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray381[arg1] = arg0;
		this.anIntArray377[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3650(@OriginalArg(0) int arg0) {
		if (this.aClass8_1.method348()) {
			@Pc(14) int local14 = this.aClass8_1.anInt365 * this.anInt4465 / Static247.anInt7108;
			do {
				@Pc(24) long local24 = this.aLong133 + (long) local14 * (long) arg0;
				if (this.aLong134 - local24 >= 0L) {
					this.aLong133 = local24;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong134 + (long) local14 - this.aLong133 - 1L) / (long) local14);
				this.aLong133 += (long) local14 * (long) local54;
				this.aClass1_Sub19_Sub3_1.method3650(local54);
				arg0 -= local54;
				this.method3658();
			} while (this.aClass8_1.method348());
		}
		this.aClass1_Sub19_Sub3_1.method3650(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
	private void method3653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub16 local12 = this.lb[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.lb[arg2][arg0] = null;
		if ((this.anIntArray376[arg2] & 0x2) == 0) {
			local12.anInt1966 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub16 local44 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4112(); local44 != null; local44 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4104()) {
			if (local44.anInt1963 == local12.anInt1963 && local44.anInt1966 < 0 && local44 != local12) {
				local12.anInt1966 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	private void method3654(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub16 local15 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4112(); local15 != null; local15 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4104()) {
			if ((arg0 < 0 || arg0 == local15.anInt1963) && local15.anInt1966 < 0) {
				this.lb[local15.anInt1963][local15.anInt1967] = null;
				local15.anInt1966 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Z")
	public synchronized boolean method3655() {
		return this.aClass8_1.method348();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public synchronized void method3656() {
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) this.aClass96_28.method2342(); local15 != null; local15 = (Class1_Sub10) this.aClass96_28.method2339()) {
			local15.method1382();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V")
	public synchronized void method3657() {
		this.method3679();
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
	@Override
	public synchronized int method3646() {
		return 0;
	}

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "(I)V")
	private void method3658() {
		@Pc(17) int local17 = this.anInt4466;
		@Pc(20) int local20 = this.anInt4467;
		@Pc(23) long local23 = this.aLong134;
		if (this.aClass1_Sub1_3 != null && local20 == this.anInt4468) {
			this.method3666(this.aBoolean303, this.aClass1_Sub1_3, this.aBoolean304);
			this.method3658();
			return;
		}
		while (this.anInt4467 == local20) {
			while (this.aClass8_1.anIntArray26[local17] == local20) {
				this.aClass8_1.method349(local17);
				@Pc(52) int local52 = this.aClass8_1.method344(local17);
				if (local52 == 1) {
					this.aClass8_1.method345();
					this.aClass8_1.method343(local17);
					if (this.aClass8_1.method335()) {
						if (this.aClass1_Sub1_3 != null) {
							this.method3682(this.aBoolean303, this.aClass1_Sub1_3);
							this.method3658();
							return;
						}
						if (!this.aBoolean303 || local20 == 0) {
							this.method3659(true);
							this.aClass8_1.method338();
							return;
						}
						this.aClass8_1.method342(local23);
					}
					break;
				}
				if ((local52 & 0x80) != 0) {
					this.method3680(local52);
				}
				this.aClass8_1.method336(local17);
				this.aClass8_1.method343(local17);
			}
			local17 = this.aClass8_1.method334();
			local20 = this.aClass8_1.anIntArray26[local17];
			local23 = this.aClass8_1.method337(local20);
		}
		this.anInt4466 = local17;
		this.anInt4467 = local20;
		this.aLong134 = local23;
		if (this.aClass1_Sub1_3 != null && local20 > this.anInt4468) {
			this.anInt4466 = -1;
			this.anInt4467 = this.anInt4468;
			this.aLong134 = this.aClass8_1.method337(this.anInt4467);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)V")
	private void method3659(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3670(-1);
		} else {
			this.method3654(-1);
		}
		this.method3672(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray382[local20] = this.anIntArray371[local20];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray367[local35] = this.anIntArray371[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ej;Z)I")
	private int method3660(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(14) int local14 = (arg0.anInt1972 * arg0.anInt1964 >> 12) + arg0.anInt1959;
		local14 += (this.anIntArray379[arg0.anInt1963] - 8192) * this.anIntArray374[arg0.anInt1963] >> 12;
		@Pc(35) Class175 local35 = arg0.aClass175_1;
		@Pc(55) int local55;
		if (local35.anInt4862 > 0 && (local35.anInt4858 > 0 || this.anIntArray378[arg0.anInt1963] > 0)) {
			local55 = local35.anInt4858 << 2;
			@Pc(60) int local60 = local35.anInt4859 << 1;
			if (arg0.anInt1976 < local60) {
				local55 = local55 * arg0.anInt1976 / local60;
			}
			local55 += this.anIntArray378[arg0.anInt1963] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt1962 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local55 * local90);
		}
		local55 = (int) ((double) (arg0.aClass1_Sub20_Sub1_1.anInt2447 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static247.anInt7108 + 0.5D);
		return local55 >= 1 ? local55 : 1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!ej;I[II)Z")
	public boolean method3662(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt1957 = Static247.anInt7108 / 100;
		if (arg0.anInt1966 >= 0 && (arg0.aClass1_Sub19_Sub1_1 == null || arg0.aClass1_Sub19_Sub1_1.method2050())) {
			arg0.method1700();
			arg0.method6020();
			if (arg0.anInt1974 > 0 && this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974] == arg0) {
				this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt1972;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray370[arg0.anInt1963] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt1972 = local56;
		}
		arg0.aClass1_Sub19_Sub1_1.method2046(this.method3660(arg0));
		@Pc(96) Class175 local96 = arg0.aClass175_1;
		arg0.anInt1962 += local96.anInt4862;
		@Pc(105) boolean local105 = false;
		arg0.anInt1976++;
		@Pc(129) double local129 = (double) ((arg0.anInt1972 * arg0.anInt1964 >> 12) + (arg0.anInt1967 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt4861 > 0) {
			if (local96.anInt4857 <= 0) {
				arg0.anInt1958 += 128;
			} else {
				arg0.anInt1958 += (int) (Math.pow(2.0D, (double) local96.anInt4857 * local129) * 128.0D + 0.5D);
			}
			if (arg0.anInt1958 * local96.anInt4861 >= 819200) {
				local105 = true;
			}
		}
		if (local96.aByteArray68 != null) {
			if (local96.anInt4860 > 0) {
				arg0.anInt1973 += (int) (Math.pow(2.0D, (double) local96.anInt4860 * local129) * 128.0D + 0.5D);
			} else {
				arg0.anInt1973 += 128;
			}
			while (arg0.anInt1968 < local96.aByteArray68.length - 2 && arg0.anInt1973 > (local96.aByteArray68[arg0.anInt1968 + 2] & 0xFF) << 8) {
				arg0.anInt1968 += 2;
			}
			if (arg0.anInt1968 == local96.aByteArray68.length - 2 && local96.aByteArray68[arg0.anInt1968 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg0.anInt1966 >= 0 && local96.aByteArray67 != null && (this.anIntArray376[arg0.anInt1963] & 0x1) == 0 && (arg0.anInt1974 < 0 || arg0 != this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974])) {
			if (local96.anInt4863 > 0) {
				arg0.anInt1966 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt4863) * 128.0D + 0.5D);
			} else {
				arg0.anInt1966 += 128;
			}
			while (local96.aByteArray67.length - 2 > arg0.anInt1969 && arg0.anInt1966 > (local96.aByteArray67[arg0.anInt1969 + 2] & 0xFF) << 8) {
				arg0.anInt1969 += 2;
			}
			if (arg0.anInt1969 == local96.aByteArray67.length - 2) {
				local105 = true;
			}
		}
		if (!local105) {
			arg0.aClass1_Sub19_Sub1_1.method2017(arg0.anInt1957, this.method3668(arg0), this.method3676(arg0));
			return false;
		}
		arg0.aClass1_Sub19_Sub1_1.method2029(arg0.anInt1957);
		if (arg2 == null) {
			arg0.aClass1_Sub19_Sub1_1.method3650(arg3);
		} else {
			arg0.aClass1_Sub19_Sub1_1.method3647(arg2, arg1, arg3);
		}
		if (arg0.aClass1_Sub19_Sub1_1.method2048()) {
			this.aClass1_Sub19_Sub3_1.aClass1_Sub19_Sub2_2.method2188(arg0.aClass1_Sub19_Sub1_1);
		}
		arg0.method1700();
		if (arg0.anInt1966 >= 0) {
			arg0.method6020();
			if (arg0.anInt1974 > 0 && arg0 == this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974]) {
				this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!bk;ILclient!a;Lclient!ul;I)Z")
	public synchronized boolean method3663(@OriginalArg(0) Class24 arg0, @OriginalArg(2) Class1_Sub1 arg1, @OriginalArg(3) Class246 arg2) {
		arg1.method11();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub8 local29 = (Class1_Sub8) arg1.aClass96_1.method2342(); local29 != null; local29 = (Class1_Sub8) arg1.aClass96_1.method2339()) {
			@Pc(35) int local35 = (int) local29.aLong222;
			@Pc(43) Class1_Sub10 local43 = (Class1_Sub10) this.aClass96_28.method2335((long) local35);
			if (local43 == null) {
				local43 = Static278.method4056(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass96_28.method2341((long) local35, local43);
			}
			if (!local43.method1383(local23, arg0, local29.aByteArray19)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method12();
		}
		return local9;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	public synchronized void method3664() {
		this.method3675(true);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IIII)V")
	private void method3665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!a;ZI)V")
	private synchronized void method3666(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) boolean arg2) {
		this.method3675(arg2);
		this.aClass8_1.method347(arg1.aByteArray1);
		this.aLong133 = 0L;
		this.aBoolean303 = arg0;
		@Pc(24) int local24 = this.aClass8_1.method340();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass8_1.method349(local34);
			this.aClass8_1.method336(local34);
			this.aClass8_1.method343(local34);
		}
		this.anInt4466 = this.aClass8_1.method334();
		this.anInt4467 = this.aClass8_1.anIntArray26[this.anInt4466];
		this.aLong134 = this.aClass8_1.method337(this.anInt4467);
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()Lclient!fp;")
	@Override
	public synchronized Class1_Sub19 method3651() {
		return null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)V")
	private void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ej;)I")
	private int method3668(@OriginalArg(1) Class1_Sub16 arg0) {
		if (this.anIntArray380[arg0.anInt1963] == 0) {
			return 0;
		}
		@Pc(20) Class175 local20 = arg0.aClass175_1;
		@Pc(36) int local36 = this.anIntArray368[arg0.anInt1963] * this.anIntArray375[arg0.anInt1963] + 4096 >> 13;
		@Pc(44) int local44 = local36 * local36 + 16384 >> 15;
		@Pc(53) int local53 = arg0.anInt1960 * local44 + 16384 >> 15;
		@Pc(62) int local62 = local53 * this.anInt4452 + 128 >> 8;
		local36 = this.anIntArray380[arg0.anInt1963] * local62 + 128 >> 8;
		if (local20.anInt4861 > 0) {
			local36 = (int) (Math.pow(0.5D, (double) arg0.anInt1958 * 1.953125E-5D * (double) local20.anInt4861) * (double) local36 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local20.aByteArray68 != null) {
			local101 = arg0.anInt1973;
			local109 = local20.aByteArray68[arg0.anInt1968 + 1];
			if (local20.aByteArray68.length - 2 > arg0.anInt1968) {
				local131 = (local20.aByteArray68[arg0.anInt1968] & 0xFF) << 8;
				local143 = (local20.aByteArray68[arg0.anInt1968 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (local20.aByteArray68[arg0.anInt1968 + 3] + -local109) / (local143 - local131);
			}
			local36 = local109 * local36 + 32 >> 6;
		}
		if (arg0.anInt1966 > 0 && local20.aByteArray67 != null) {
			local101 = arg0.anInt1966;
			local109 = local20.aByteArray67[arg0.anInt1969 + 1];
			if (arg0.anInt1969 < local20.aByteArray67.length - 2) {
				local131 = (local20.aByteArray67[arg0.anInt1969] & 0xFF) << 8;
				local143 = (local20.aByteArray67[arg0.anInt1969 + 2] & 0xFF) << 8;
				local109 += (local101 - local131) * (local20.aByteArray67[arg0.anInt1969 + 3] + -local109) / (local143 - local131);
			}
			local36 = local109 * local36 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)V")
	private void method3669(@OriginalArg(0) int arg0) {
		if ((this.anIntArray376[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub16 local13 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4112(); local13 != null; local13 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4104()) {
			if (local13.anInt1963 == arg0) {
				local13.anInt1970 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IB)V")
	private void method3670(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4112(); local10 != null; local10 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4104()) {
			if (arg0 < 0 || arg0 == local10.anInt1963) {
				if (local10.aClass1_Sub19_Sub1_1 != null) {
					local10.aClass1_Sub19_Sub1_1.method2029(Static247.anInt7108 / 100);
					if (local10.aClass1_Sub19_Sub1_1.method2048()) {
						this.aClass1_Sub19_Sub3_1.aClass1_Sub19_Sub2_2.method2188(local10.aClass1_Sub19_Sub1_1);
					}
					local10.method1700();
				}
				if (local10.anInt1966 < 0) {
					this.lb[local10.anInt1963][local10.anInt1967] = null;
				}
				local10.method6020();
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "(I)I")
	public int method3671() {
		return this.anInt4452;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
	private void method3672(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method3672(local10);
			}
			return;
		}
		this.anIntArray375[arg0] = 12800;
		this.anIntArray372[arg0] = 8192;
		this.anIntArray368[arg0] = 16383;
		this.anIntArray379[arg0] = 8192;
		this.anIntArray378[arg0] = 0;
		this.anIntArray370[arg0] = 8192;
		this.method3685(arg0);
		this.method3669(arg0);
		this.anIntArray376[arg0] = 0;
		this.anIntArray373[arg0] = 32767;
		this.anIntArray374[arg0] = 256;
		this.anIntArray369[arg0] = 0;
		this.method3652(8192, arg0);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(III)V")
	private void method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray382[arg1] != arg0) {
			this.anIntArray382[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub16ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBI)V")
	private synchronized void method3674() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray380[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()Lclient!fp;")
	@Override
	public synchronized Class1_Sub19 method3649() {
		return this.aClass1_Sub19_Sub3_1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZ)V")
	private synchronized void method3675(@OriginalArg(1) boolean arg0) {
		this.aClass8_1.method338();
		this.aClass1_Sub1_3 = null;
		this.method3659(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ej;I)I")
	private int method3676(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(9) int local9 = this.anIntArray372[arg0.anInt1963];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt1965) * (-local9 + 16384) + 32 >> 6) : local9 * arg0.anInt1965 + 32 >> 6;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(III)V")
	private void method3677(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray379[arg0] = arg1;
	}

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "(I)V")
	public synchronized void method3678() {
		for (@Pc(11) Class1_Sub10 local11 = (Class1_Sub10) this.aClass96_28.method2342(); local11 != null; local11 = (Class1_Sub10) this.aClass96_28.method2339()) {
			local11.method6020();
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(IBI)V")
	private void method3679() {
		this.anIntArray371[9] = 128;
		this.anIntArray367[9] = 128;
		this.method3673(128, 9);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
	private void method3680(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3653(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method3653(local22, 64, local16);
			} else {
				this.method3683(local16, local22, local28);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method3665(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray367[local16] = (local28 << 14) + (this.anIntArray367[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray367[local16] = (this.anIntArray367[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray378[local16] = (this.anIntArray378[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray378[local16] = local28 + (this.anIntArray378[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray370[local16] = (local28 << 7) + (this.anIntArray370[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray370[local16] = (this.anIntArray370[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray375[local16] = (local28 << 7) + (this.anIntArray375[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray375[local16] = local28 + (this.anIntArray375[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray372[local16] = (this.anIntArray372[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray372[local16] = (this.anIntArray372[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray368[local16] = (this.anIntArray368[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray368[local16] = (this.anIntArray368[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray376[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray376[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray376[local16] |= 0x2;
				} else {
					this.method3685(local16);
					this.anIntArray376[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray373[local16] = (this.anIntArray373[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray373[local16] = local28 + (this.anIntArray373[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray373[local16] = (local28 << 7) + ((this.anIntArray373[local16] & 0x7F) + 16384);
			}
			if (local22 == 100) {
				this.anIntArray373[local16] = local28 + (this.anIntArray373[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method3670(local16);
			}
			if (local22 == 121) {
				this.method3672(local16);
			}
			if (local22 == 123) {
				this.method3654(local16);
			}
			@Pc(503) int local503;
			if (local22 == 6) {
				local503 = this.anIntArray373[local16];
				if (local503 == 16384) {
					this.anIntArray374[local16] = (local28 << 7) + (this.anIntArray374[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local503 = this.anIntArray373[local16];
				if (local503 == 16384) {
					this.anIntArray374[local16] = (this.anIntArray374[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray369[local16] = (local28 << 7) + (this.anIntArray369[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray369[local16] = local28 + (this.anIntArray369[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray376[local16] |= 0x4;
				} else {
					this.method3669(local16);
					this.anIntArray376[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method3652((this.anIntArray381[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method3652((this.anIntArray381[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3673(this.anIntArray367[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method3667(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FFD) >> 8);
			this.method3677(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method3659(true);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLclient!ej;)Z")
	public boolean method3681(@OriginalArg(1) Class1_Sub16 arg0) {
		if (arg0.aClass1_Sub19_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt1966 >= 0) {
			arg0.method6020();
			if (arg0.anInt1974 > 0 && arg0 == this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974]) {
				this.aClass1_Sub16ArrayArray1[arg0.anInt1963][arg0.anInt1974] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZBLclient!a;)V")
	public synchronized void method3682(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		this.method3666(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(IIII)V")
	private void method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method3653(arg1, 64, arg0);
		if ((this.anIntArray376[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub16 local25 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4110(); local25 != null; local25 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4111()) {
				if (local25.anInt1963 == arg0 && local25.anInt1966 < 0) {
					this.lb[arg0][local25.anInt1967] = null;
					this.lb[arg0][arg1] = local25;
					@Pc(67) int local67 = (local25.anInt1972 * local25.anInt1964 >> 12) + local25.anInt1959;
					local25.anInt1959 += arg1 - local25.anInt1967 << 8;
					local25.anInt1967 = arg1;
					local25.anInt1964 = local67 - local25.anInt1959;
					local25.anInt1972 = 4096;
					return;
				}
			}
		}
		@Pc(112) Class1_Sub10 local112 = (Class1_Sub10) this.aClass96_28.method2335((long) this.anIntArray382[arg0]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class1_Sub20_Sub1 local120 = local112.aClass1_Sub20_Sub1Array1[arg1];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class1_Sub16 local127 = new Class1_Sub16();
		local127.aClass1_Sub20_Sub1_1 = local120;
		local127.aClass1_Sub10_1 = local112;
		local127.anInt1963 = arg0;
		local127.aClass175_1 = local112.aClass175Array1[arg1];
		local127.anInt1974 = local112.aByteArray39[arg1];
		local127.anInt1967 = arg1;
		local127.anInt1960 = arg2 * arg2 * local112.anInt1561 * local112.aByteArray38[arg1] + 1024 >> 11;
		local127.anInt1965 = local112.aByteArray37[arg1] & 0xFF;
		local127.anInt1959 = (arg1 << 8) - (local112.aShortArray19[arg1] & 0x7FFF);
		local127.anInt1968 = 0;
		local127.anInt1958 = 0;
		local127.anInt1966 = -1;
		local127.anInt1969 = 0;
		local127.anInt1973 = 0;
		if (this.anIntArray369[arg0] == 0) {
			local127.aClass1_Sub19_Sub1_1 = Static462.method2042(local120, this.method3660(local127), this.method3668(local127), this.method3676(local127));
		} else {
			local127.aClass1_Sub19_Sub1_1 = Static462.method2042(local120, this.method3660(local127), 0, this.method3676(local127));
			this.method3686(local112.aShortArray19[arg1] < 0, local127);
		}
		if (local112.aShortArray19[arg1] < 0) {
			local127.aClass1_Sub19_Sub1_1.method2038(-1);
		}
		if (local127.anInt1974 >= 0) {
			@Pc(284) Class1_Sub16 local284 = this.aClass1_Sub16ArrayArray1[arg0][local127.anInt1974];
			if (local284 != null && local284.anInt1966 < 0) {
				this.lb[arg0][local284.anInt1967] = null;
				local284.anInt1966 = 0;
			}
			this.aClass1_Sub16ArrayArray1[arg0][local127.anInt1974] = local127;
		}
		this.aClass1_Sub19_Sub3_1.aClass181_39.method4102(local127);
		this.lb[arg0][arg1] = local127;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(IB)V")
	public synchronized void method3684(@OriginalArg(0) int arg0) {
		this.anInt4452 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(II)V")
	private void method3685(@OriginalArg(0) int arg0) {
		if ((this.anIntArray376[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class1_Sub16 local13 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4112(); local13 != null; local13 = (Class1_Sub16) this.aClass1_Sub19_Sub3_1.aClass181_39.method4104()) {
			if (arg0 == local13.anInt1963 && this.lb[arg0][local13.anInt1967] == null && local13.anInt1966 < 0) {
				local13.anInt1966 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass8_1.method348()) {
			@Pc(18) int local18 = this.aClass8_1.anInt365 * this.anInt4465 / Static247.anInt7108;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong133;
				if (this.aLong134 - local27 >= 0L) {
					this.aLong133 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong134 - this.aLong133 - 1L) / (long) local18);
				this.aLong133 += (long) local55 * (long) local18;
				this.aClass1_Sub19_Sub3_1.method3647(arg0, arg1, local55);
				arg1 += local55;
				this.method3658();
				arg2 -= local55;
			} while (this.aClass8_1.method348());
		}
		this.aClass1_Sub19_Sub3_1.method3647(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZILclient!ej;)V")
	public void method3686(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub20_Sub1_1.aByteArray46.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass1_Sub20_Sub1_1.aBoolean148) {
			@Pc(38) int local38 = local8 + local8 - arg1.aClass1_Sub20_Sub1_1.anInt2446;
			local8 <<= 0x8;
			local27 = (int) ((long) this.anIntArray369[arg1.anInt1963] * (long) local38 >> 6);
			if (local8 <= local27) {
				arg1.aClass1_Sub19_Sub1_1.method2047();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray369[arg1.anInt1963] >> 6);
		}
		arg1.aClass1_Sub19_Sub1_1.method2041(local27);
	}
}
