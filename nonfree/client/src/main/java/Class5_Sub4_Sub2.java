import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class5_Sub4_Sub2 extends Class5_Sub4 {

	@OriginalMember(owner = "client!eg", name = "nb", descriptor = "J")
	private long aLong69;

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "Z")
	private boolean aBoolean139;

	@OriginalMember(owner = "client!eg", name = "Q", descriptor = "I")
	private int anInt2017;

	@OriginalMember(owner = "client!eg", name = "eb", descriptor = "J")
	private long aLong70;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	private int anInt2018;

	@OriginalMember(owner = "client!eg", name = "kb", descriptor = "I")
	private int anInt2019;

	@OriginalMember(owner = "client!eg", name = "mb", descriptor = "Lclient!jt;")
	private Class5_Sub28 aClass5_Sub28_2;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!eg", name = "A", descriptor = "[I")
	private final int[] anIntArray106 = new int[16];

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "[I")
	private final int[] anIntArray108 = new int[16];

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "[I")
	private final int[] anIntArray110 = new int[16];

	@OriginalMember(owner = "client!eg", name = "zb", descriptor = "[I")
	private final int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!eg", name = "Ib", descriptor = "[[Lclient!up;")
	private final Class5_Sub51[][] aClass5_Sub51ArrayArray1 = new Class5_Sub51[16][128];

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "[I")
	private final int[] anIntArray111 = new int[16];

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "[I")
	public final int[] anIntArray107 = new int[16];

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "[I")
	public final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!eg", name = "cb", descriptor = "[I")
	private final int[] anIntArray105 = new int[16];

	@OriginalMember(owner = "client!eg", name = "rb", descriptor = "[I")
	private int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!eg", name = "B", descriptor = "[I")
	private final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!eg", name = "ib", descriptor = "[I")
	private final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "[I")
	private final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!eg", name = "db", descriptor = "I")
	private final int anInt2012 = 1000000;

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "[I")
	private final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "[I")
	private final int[] anIntArray104 = new int[16];

	@OriginalMember(owner = "client!eg", name = "Bb", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!eg", name = "xb", descriptor = "I")
	private int anInt1976 = 256;

	@OriginalMember(owner = "client!eg", name = "hb", descriptor = "[[Lclient!up;")
	private final Class5_Sub51[][] aClass5_Sub51ArrayArray2 = new Class5_Sub51[16][128];

	@OriginalMember(owner = "client!eg", name = "wb", descriptor = "[I")
	public final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!eg", name = "vb", descriptor = "Lclient!sw;")
	private final Class341 aClass341_1 = new Class341();

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "Lclient!iq;")
	private final Class5_Sub4_Sub3 aClass5_Sub4_Sub3_1 = new Class5_Sub4_Sub3(this);

	@OriginalMember(owner = "client!eg", name = "Ab", descriptor = "Lclient!qr;")
	private final Class306 aClass306_11;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class5_Sub4_Sub2() {
		this.aClass306_11 = new Class306(128);
		this.method1825(256, -1);
		this.method1792(true);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!eg;)V")
	public Class5_Sub4_Sub2(@OriginalArg(0) Class5_Sub4_Sub2 arg0) {
		this.aClass306_11 = arg0.aClass306_11;
		this.method1825(256, -1);
		this.method1792(true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)V")
	private void method1788(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1788(local9);
			}
			return;
		}
		this.anIntArray116[arg0] = 12800;
		this.anIntArray112[arg0] = 8192;
		this.anIntArray110[arg0] = 16383;
		this.anIntArray117[arg0] = 8192;
		this.anIntArray105[arg0] = 0;
		this.anIntArray108[arg0] = 8192;
		this.method1821(arg0);
		this.method1796(arg0);
		this.anIntArray114[arg0] = 0;
		this.anIntArray115[arg0] = 32767;
		this.anIntArray118[arg0] = 256;
		this.anIntArray107[arg0] = 0;
		this.method1791(8192, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIII)V")
	private void method1789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1806(64, arg2, arg0);
		if ((this.anIntArray114[arg0] & 0x2) != 0) {
			for (@Pc(25) Class5_Sub51 local25 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method379(); local25 != null; local25 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method377()) {
				if (local25.anInt9869 == arg0 && local25.anInt9885 < 0) {
					this.aClass5_Sub51ArrayArray1[arg0][local25.anInt9882] = null;
					this.aClass5_Sub51ArrayArray1[arg0][arg2] = local25;
					@Pc(68) int local68 = local25.anInt9876 + (local25.anInt9870 * local25.anInt9879 >> 12);
					local25.anInt9876 += arg2 - local25.anInt9882 << 8;
					local25.anInt9882 = arg2;
					local25.anInt9870 = 4096;
					local25.anInt9879 = local68 - local25.anInt9876;
					return;
				}
			}
		}
		@Pc(114) Class5_Sub30 local114 = (Class5_Sub30) this.aClass306_11.method6943((long) this.anIntArray106[arg0]);
		if (local114 == null) {
			return;
		}
		@Pc(123) Class5_Sub27_Sub1 local123 = local114.aClass5_Sub27_Sub1Array1[arg2];
		if (local123 == null) {
			return;
		}
		@Pc(131) Class5_Sub51 local131 = new Class5_Sub51();
		local131.anInt9869 = arg0;
		local131.aClass5_Sub30_1 = local114;
		local131.aClass5_Sub27_Sub1_4 = local123;
		local131.aClass140_1 = local114.aClass140Array1[arg2];
		local131.anInt9875 = local114.aByteArray58[arg2];
		local131.anInt9882 = arg2;
		local131.anInt9866 = local114.anInt5321 * arg1 * arg1 * local114.aByteArray59[arg2] + 1024 >> 11;
		local131.anInt9871 = local114.aByteArray57[arg2] & 0xFF;
		local131.anInt9876 = (arg2 << 8) - (local114.aShortArray74[arg2] & 0x7FFF);
		local131.anInt9873 = 0;
		local131.anInt9884 = 0;
		local131.anInt9883 = 0;
		local131.anInt9880 = 0;
		local131.anInt9885 = -1;
		if (this.anIntArray107[arg0] == 0) {
			local131.aClass5_Sub4_Sub4_4 = Static688.method4172(local123, this.method1814(local131), this.method1824(local131), this.method1817(local131));
		} else {
			local131.aClass5_Sub4_Sub4_4 = Static688.method4172(local123, this.method1814(local131), 0, this.method1817(local131));
			this.method1811(local131, local114.aShortArray74[arg2] < 0);
		}
		if (local114.aShortArray74[arg2] < 0) {
			local131.aClass5_Sub4_Sub4_4.method4168(-1);
		}
		if (local131.anInt9875 >= 0) {
			@Pc(302) Class5_Sub51 local302 = this.aClass5_Sub51ArrayArray2[arg0][local131.anInt9875];
			if (local302 != null && local302.anInt9885 < 0) {
				this.aClass5_Sub51ArrayArray1[arg0][local302.anInt9882] = null;
				local302.anInt9885 = 0;
			}
			this.aClass5_Sub51ArrayArray2[arg0][local131.anInt9875] = local131;
		}
		this.aClass5_Sub4_Sub3_1.aClass20_16.method370(local131);
		this.aClass5_Sub51ArrayArray1[arg0][arg2] = local131;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass341_1.method7601()) {
			@Pc(14) int local14 = this.anInt2012 * this.aClass341_1.anInt8875 / Static417.anInt7038;
			do {
				@Pc(24) long local24 = this.aLong70 + (long) local14 * (long) arg2;
				if (this.aLong69 - local24 >= 0L) {
					this.aLong70 = local24;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong69 - this.aLong70 - 1L) / (long) local14);
				this.aLong70 += (long) local14 * (long) local51;
				this.aClass5_Sub4_Sub3_1.method4713(arg0, arg1, local51);
				this.method1815();
				arg1 += local51;
				arg2 -= local51;
			} while (this.aClass341_1.method7601());
		}
		this.aClass5_Sub4_Sub3_1.method4713(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(III)V")
	private void method1791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray111[arg1] = arg0;
		this.anIntArray119[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZ)V")
	private void method1792(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1819(-1);
		} else {
			this.method1812(-1);
		}
		this.method1788(-1);
		for (@Pc(42) int local42 = 0; local42 < 16; local42++) {
			this.anIntArray106[local42] = this.anIntArray104[local42];
		}
		for (@Pc(62) int local62 = 0; local62 < 16; local62++) {
			this.anIntArray113[local62] = this.anIntArray104[local62] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZI)V")
	private void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZJ)V")
	private void method1794(@OriginalArg(1) long arg0) {
		while (this.aLong69 <= arg0) {
			@Pc(12) int local12 = this.anInt2017;
			@Pc(15) int local15 = this.anInt2018;
			@Pc(18) long local18 = this.aLong69;
			while (local15 == this.anInt2018) {
				while (local15 == this.aClass341_1.anIntArray507[local12]) {
					this.aClass341_1.method7608(local12);
					@Pc(31) int local31 = this.aClass341_1.method7613(local12);
					if (local31 == 1) {
						this.aClass341_1.method7615();
						this.aClass341_1.method7603(local12);
						if (this.aClass341_1.method7612()) {
							if (!this.aBoolean139 || local15 == 0) {
								this.method1792(true);
								this.aClass341_1.method7611();
								return;
							}
							this.aClass341_1.method7605(local18);
						}
						break;
					}
					if ((local31 & 0x80) != 0 && (local31 & 0xF0) != 144) {
						this.method1813(local31);
					}
					this.aClass341_1.method7604(local12);
					this.aClass341_1.method7603(local12);
				}
				this.aLong70 = local18;
				local12 = this.aClass341_1.method7607();
				local15 = this.aClass341_1.anIntArray507[local12];
				local18 = this.aClass341_1.method7614(local15);
			}
			this.anInt2018 = local15;
			this.anInt2017 = local12;
			this.aLong69 = local18;
		}
		if (false) {
			this.anIntArray112 = null;
		}
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	public synchronized void method1795() {
		for (@Pc(11) Class5_Sub30 local11 = (Class5_Sub30) this.aClass306_11.method6941(); local11 != null; local11 = (Class5_Sub30) this.aClass306_11.method6940()) {
			local11.method4792();
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZI)V")
	private void method1796(@OriginalArg(1) int arg0) {
		if ((this.anIntArray114[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(29) Class5_Sub51 local29 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method378(); local29 != null; local29 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method366()) {
			if (arg0 == local29.anInt9869) {
				local29.anInt9877 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "(III)V")
	private void method1797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray117[arg0] = arg1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public synchronized void method1798() {
		for (@Pc(16) Class5_Sub30 local16 = (Class5_Sub30) this.aClass306_11.method6941(); local16 != null; local16 = (Class5_Sub30) this.aClass306_11.method6940()) {
			local16.method9222();
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	public synchronized void method1799() {
		this.method1800(true);
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "()I")
	@Override
	public synchronized int method4710() {
		return 0;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZB)V")
	private synchronized void method1800(@OriginalArg(0) boolean arg0) {
		this.aClass341_1.method7611();
		this.aClass5_Sub28_2 = null;
		this.method1792(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)V")
	public synchronized void method1801() {
		this.method1802();
	}

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "(III)V")
	private void method1802() {
		this.anIntArray104[9] = 128;
		this.anIntArray113[9] = 128;
		this.method1810(9, 128);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([ILclient!up;III)Z")
	public boolean method1803(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class5_Sub51 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt9878 = Static417.anInt7038 / 100;
		if (arg1.anInt9885 >= 0 && (arg1.aClass5_Sub4_Sub4_4 == null || arg1.aClass5_Sub4_Sub4_4.method4161())) {
			arg1.method8398();
			arg1.method9222();
			if (arg1.anInt9875 > 0 && arg1 == this.aClass5_Sub51ArrayArray2[arg1.anInt9869][arg1.anInt9875]) {
				this.aClass5_Sub51ArrayArray2[arg1.anInt9869][arg1.anInt9875] = null;
			}
			return true;
		}
		@Pc(69) int local69 = arg1.anInt9870;
		if (local69 > 0) {
			local69 -= (int) (Math.pow(2.0D, (double) this.anIntArray108[arg1.anInt9869] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local69 < 0) {
				local69 = 0;
			}
			arg1.anInt9870 = local69;
		}
		arg1.aClass5_Sub4_Sub4_4.method4169(this.method1814(arg1));
		@Pc(112) Class140 local112 = arg1.aClass140_1;
		arg1.anInt9867++;
		@Pc(130) boolean local130 = false;
		arg1.anInt9868 += local112.anInt3605;
		@Pc(156) double local156 = (double) ((arg1.anInt9882 - 60 << 8) + (arg1.anInt9879 * arg1.anInt9870 >> 12)) * 5.086263020833333E-6D;
		if (local112.anInt3604 > 0) {
			if (local112.anInt3607 <= 0) {
				arg1.anInt9880 += 128;
			} else {
				arg1.anInt9880 += (int) (Math.pow(2.0D, local156 * (double) local112.anInt3607) * 128.0D + 0.5D);
			}
			if (local112.anInt3604 * arg1.anInt9880 >= 819200) {
				local130 = true;
			}
		}
		if (local112.aByteArray35 != null) {
			if (local112.anInt3608 > 0) {
				arg1.anInt9884 += (int) (Math.pow(2.0D, (double) local112.anInt3608 * local156) * 128.0D + 0.5D);
			} else {
				arg1.anInt9884 += 128;
			}
			while (arg1.anInt9873 < local112.aByteArray35.length - 2 && arg1.anInt9884 > (local112.aByteArray35[arg1.anInt9873 + 2] & 0xFF) << 8) {
				arg1.anInt9873 += 2;
			}
			if (local112.aByteArray35.length - 2 == arg1.anInt9873 && local112.aByteArray35[arg1.anInt9873 + 1] == 0) {
				local130 = true;
			}
		}
		if (arg1.anInt9885 >= 0 && local112.aByteArray36 != null && (this.anIntArray114[arg1.anInt9869] & 0x1) == 0 && (arg1.anInt9875 < 0 || arg1 != this.aClass5_Sub51ArrayArray2[arg1.anInt9869][arg1.anInt9875])) {
			if (local112.anInt3603 <= 0) {
				arg1.anInt9885 += 128;
			} else {
				arg1.anInt9885 += (int) (Math.pow(2.0D, (double) local112.anInt3603 * local156) * 128.0D + 0.5D);
			}
			while (arg1.anInt9883 < local112.aByteArray36.length - 2 && (local112.aByteArray36[arg1.anInt9883 + 2] & 0xFF) << 8 < arg1.anInt9885) {
				arg1.anInt9883 += 2;
			}
			if (local112.aByteArray36.length - 2 == arg1.anInt9883) {
				local130 = true;
			}
		}
		if (!local130) {
			arg1.aClass5_Sub4_Sub4_4.method4164(arg1.anInt9878, this.method1824(arg1), this.method1817(arg1));
			return false;
		}
		arg1.aClass5_Sub4_Sub4_4.method4155(arg1.anInt9878);
		if (arg0 == null) {
			arg1.aClass5_Sub4_Sub4_4.method4712(arg2);
		} else {
			arg1.aClass5_Sub4_Sub4_4.method4713(arg0, arg3, arg2);
		}
		if (arg1.aClass5_Sub4_Sub4_4.method4149()) {
			this.aClass5_Sub4_Sub3_1.aClass5_Sub4_Sub1_1.method334(arg1.aClass5_Sub4_Sub4_4);
		}
		arg1.method8398();
		if (arg1.anInt9885 >= 0) {
			arg1.method9222();
			if (arg1.anInt9875 > 0 && arg1 == this.aClass5_Sub51ArrayArray2[arg1.anInt9869][arg1.anInt9875]) {
				this.aClass5_Sub51ArrayArray2[arg1.anInt9869][arg1.anInt9875] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
	private void method1804(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Lclient!up;I)Z")
	public boolean method1805(@OriginalArg(0) Class5_Sub51 arg0) {
		if (arg0.aClass5_Sub4_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt9885 >= 0) {
			arg0.method9222();
			if (arg0.anInt9875 > 0 && this.aClass5_Sub51ArrayArray2[arg0.anInt9869][arg0.anInt9875] == arg0) {
				this.aClass5_Sub51ArrayArray2[arg0.anInt9869][arg0.anInt9875] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZII)V")
	private void method1806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class5_Sub51 local22 = this.aClass5_Sub51ArrayArray1[arg2][arg1];
		if (local22 == null) {
			return;
		}
		this.aClass5_Sub51ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray114[arg2] & 0x2) == 0) {
			local22.anInt9885 = 0;
			return;
		}
		for (@Pc(52) Class5_Sub51 local52 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method378(); local52 != null; local52 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method366()) {
			if (local52.anInt9869 == local22.anInt9869 && local52.anInt9885 < 0 && local22 != local52) {
				local22.anInt9885 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4712(@OriginalArg(0) int arg0) {
		if (this.aClass341_1.method7601()) {
			@Pc(14) int local14 = this.aClass341_1.anInt8875 * this.anInt2012 / Static417.anInt7038;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong70;
				if (this.aLong69 - local23 >= 0L) {
					this.aLong70 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong69 + (long) local14 - this.aLong70 - 1L) / (long) local14);
				this.aLong70 += (long) local55 * (long) local14;
				this.aClass5_Sub4_Sub3_1.method4712(local55);
				arg0 -= local55;
				this.method1815();
			} while (this.aClass341_1.method7601());
		}
		this.aClass5_Sub4_Sub3_1.method4712(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZBJZLclient!jt;)V")
	public synchronized void method1807(@OriginalArg(2) long arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) Class5_Sub28 arg2) {
		this.method1823(true, arg1, arg2);
		this.method1794((long) this.aClass341_1.anInt8875 * arg0);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IZ)V")
	public synchronized void method1808(@OriginalArg(0) int arg0) {
		this.anInt1976 = arg0;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I")
	public int method1809() {
		return this.anInt1976;
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(III)V")
	private void method1810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray106[arg0]) {
			this.anIntArray106[arg0] = arg1;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass5_Sub51ArrayArray2[arg0][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!up;Z)V")
	public void method1811(@OriginalArg(1) Class5_Sub51 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass5_Sub27_Sub1_4.aByteArray46.length;
		@Pc(42) int local42;
		if (arg1 && arg0.aClass5_Sub27_Sub1_4.aBoolean316) {
			@Pc(25) int local25 = local8 + local8 - arg0.aClass5_Sub27_Sub1_4.anInt4766;
			local8 <<= 0x8;
			local42 = (int) ((long) local25 * (long) this.anIntArray107[arg0.anInt9869] >> 6);
			if (local42 >= local8) {
				local42 = local8 + local8 - local42 - 1;
				arg0.aClass5_Sub4_Sub4_4.method4157();
			}
		} else {
			local42 = (int) ((long) this.anIntArray107[arg0.anInt9869] * (long) local8 >> 6);
		}
		arg0.aClass5_Sub4_Sub4_4.method4165(local42);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
	private void method1812(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class5_Sub51 local8 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method378(); local8 != null; local8 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method366()) {
			if ((arg0 < 0 || arg0 == local8.anInt9869) && local8.anInt9885 < 0) {
				this.aClass5_Sub51ArrayArray1[local8.anInt9869][local8.anInt9882] = null;
				local8.anInt9885 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)V")
	private void method1813(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1806(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1789(local16, local28, local22);
			} else {
				this.method1806(64, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1793(local16, local28, local22);
		} else if (local9 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			@Pc(128) int local128 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray113[local22] = (local128 << 14) + (this.anIntArray113[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray113[local22] = (this.anIntArray113[local22] & 0xFFFFC07F) + (local128 << 7);
			}
			if (local28 == 1) {
				this.anIntArray105[local22] = (this.anIntArray105[local22] & 0xFFFFC07F) + (local128 << 7);
			}
			if (local28 == 33) {
				this.anIntArray105[local22] = local128 + (this.anIntArray105[local22] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray108[local22] = (local128 << 7) + (this.anIntArray108[local22] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray108[local22] = (this.anIntArray108[local22] & 0xFFFFFF80) + local128;
			}
			if (local28 == 7) {
				this.anIntArray116[local22] = (this.anIntArray116[local22] & 0xFFFFC07F) + (local128 << 7);
			}
			if (local28 == 39) {
				this.anIntArray116[local22] = (this.anIntArray116[local22] & 0xFFFFFF80) + local128;
			}
			if (local28 == 10) {
				this.anIntArray112[local22] = (this.anIntArray112[local22] & 0xFFFFC07F) + (local128 << 7);
			}
			if (local28 == 42) {
				this.anIntArray112[local22] = local128 + (this.anIntArray112[local22] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.anIntArray110[local22] = (this.anIntArray110[local22] & 0xFFFFC07F) + (local128 << 7);
			}
			if (local28 == 43) {
				this.anIntArray110[local22] = local128 + (this.anIntArray110[local22] & 0xFFFFFF80);
			}
			if (local28 == 64) {
				if (local128 >= 64) {
					this.anIntArray114[local22] |= 0x1;
				} else {
					this.anIntArray114[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local128 >= 64) {
					this.anIntArray114[local22] |= 0x2;
				} else {
					this.method1821(local22);
					this.anIntArray114[local22] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray115[local22] = (local128 << 7) + (this.anIntArray115[local22] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray115[local22] = (this.anIntArray115[local22] & 0x3F80) + local128;
			}
			if (local28 == 101) {
				this.anIntArray115[local22] = (this.anIntArray115[local22] & 0x7F) + (local128 << 7) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray115[local22] = local128 + (this.anIntArray115[local22] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method1819(local22);
			}
			if (local28 == 121) {
				this.method1788(local22);
			}
			if (local28 == 123) {
				this.method1812(local22);
			}
			@Pc(556) int local556;
			if (local28 == 6) {
				local556 = this.anIntArray115[local22];
				if (local556 == 16384) {
					this.anIntArray118[local22] = (this.anIntArray118[local22] & 0xFFFFC07F) + (local128 << 7);
				}
			}
			if (local28 == 38) {
				local556 = this.anIntArray115[local22];
				if (local556 == 16384) {
					this.anIntArray118[local22] = local128 + (this.anIntArray118[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray107[local22] = (local128 << 7) + (this.anIntArray107[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray107[local22] = local128 + (this.anIntArray107[local22] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local128 < 64) {
					this.method1796(local22);
					this.anIntArray114[local22] &= 0xFFFFFFFB;
				} else {
					this.anIntArray114[local22] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method1791((this.anIntArray111[local22] & 0xFFFFC07F) + (local128 << 7), local22);
			}
			if (local28 == 49) {
				this.method1791(local128 + (this.anIntArray111[local22] & 0xFFFFFF80), local22);
			}
		} else if (local9 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1810(local22, this.anIntArray113[local22] + local28);
		} else if (local9 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method1804(local22, local28);
		} else if (local9 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FC4) >> 8);
			this.method1797(local22, local28);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1792(true);
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!up;I)I")
	private int method1814(@OriginalArg(0) Class5_Sub51 arg0) {
		@Pc(14) int local14 = (arg0.anInt9879 * arg0.anInt9870 >> 12) + arg0.anInt9876;
		local14 += this.anIntArray118[arg0.anInt9869] * (this.anIntArray117[arg0.anInt9869] - 8192) >> 12;
		@Pc(45) Class140 local45 = arg0.aClass140_1;
		@Pc(72) int local72;
		if (local45.anInt3605 > 0 && (local45.anInt3609 > 0 || this.anIntArray105[arg0.anInt9869] > 0)) {
			local72 = local45.anInt3609 << 2;
			@Pc(77) int local77 = local45.anInt3611 << 1;
			if (local77 > arg0.anInt9867) {
				local72 = local72 * arg0.anInt9867 / local77;
			}
			local72 += this.anIntArray105[arg0.anInt9869] >> 7;
			@Pc(111) double local111 = Math.sin((double) (arg0.anInt9868 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local72 * local111);
		}
		local72 = (int) ((double) (arg0.aClass5_Sub27_Sub1_4.anInt4767 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static417.anInt7038 + 0.5D);
		return local72 < 1 ? 1 : local72;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
	private void method1815() {
		@Pc(8) int local8 = this.anInt2017;
		@Pc(11) int local11 = this.anInt2018;
		@Pc(26) long local26 = this.aLong69;
		if (this.aClass5_Sub28_2 != null && this.anInt2019 == local11) {
			this.method1823(this.aBoolean140, this.aBoolean139, this.aClass5_Sub28_2);
			this.method1815();
			return;
		}
		while (this.anInt2018 == local11) {
			while (local11 == this.aClass341_1.anIntArray507[local8]) {
				this.aClass341_1.method7608(local8);
				@Pc(58) int local58 = this.aClass341_1.method7613(local8);
				if (local58 == 1) {
					this.aClass341_1.method7615();
					this.aClass341_1.method7603(local8);
					if (this.aClass341_1.method7612()) {
						if (this.aClass5_Sub28_2 != null) {
							this.method1816(this.aClass5_Sub28_2, this.aBoolean139);
							this.method1815();
							return;
						}
						if (!this.aBoolean139 || local11 == 0) {
							this.method1792(true);
							this.aClass341_1.method7611();
							return;
						}
						this.aClass341_1.method7605(local26);
					}
					break;
				}
				if ((local58 & 0x80) != 0) {
					this.method1813(local58);
				}
				this.aClass341_1.method7604(local8);
				this.aClass341_1.method7603(local8);
			}
			local8 = this.aClass341_1.method7607();
			local11 = this.aClass341_1.anIntArray507[local8];
			local26 = this.aClass341_1.method7614(local11);
		}
		this.anInt2017 = local8;
		this.aLong69 = local26;
		this.anInt2018 = local11;
		if (this.aClass5_Sub28_2 != null && local11 > this.anInt2019) {
			this.anInt2018 = this.anInt2019;
			this.anInt2017 = -1;
			this.aLong69 = this.aClass341_1.method7614(this.anInt2018);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!jt;BZ)V")
	public synchronized void method1816(@OriginalArg(0) Class5_Sub28 arg0, @OriginalArg(2) boolean arg1) {
		this.method1823(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLclient!up;)I")
	private int method1817(@OriginalArg(1) Class5_Sub51 arg0) {
		@Pc(18) int local18 = this.anIntArray112[arg0.anInt9869];
		return local18 >= 8192 ? 16384 - ((128 - arg0.anInt9871) * (-local18 + 16384) + 32 >> 6) : local18 * arg0.anInt9871 + 32 >> 6;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILclient!ke;Lclient!gda;Lclient!jt;B)Z")
	public synchronized boolean method1818(@OriginalArg(1) Class199 arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class5_Sub28 arg2) {
		arg2.method4520();
		@Pc(18) boolean local18 = true;
		@Pc(32) int[] local32 = new int[] { 22050 };
		for (@Pc(38) Class5_Sub40 local38 = (Class5_Sub40) arg2.aClass306_20.method6941(); local38 != null; local38 = (Class5_Sub40) arg2.aClass306_20.method6940()) {
			@Pc(46) int local46 = (int) local38.aLong312;
			@Pc(54) Class5_Sub30 local54 = (Class5_Sub30) this.aClass306_11.method6943((long) local46);
			if (local54 == null) {
				local54 = Static284.method4548(local46, arg1);
				if (local54 == null) {
					local18 = false;
					continue;
				}
				this.aClass306_11.method6944(local54, (long) local46, -12002);
			}
			if (!local54.method4791(local38.aByteArray74, arg0, local32)) {
				local18 = false;
			}
		}
		if (local18) {
			arg2.method4521();
		}
		return local18;
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V")
	private void method1819(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class5_Sub51 local17 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method378(); local17 != null; local17 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method366()) {
			if (arg0 < 0 || local17.anInt9869 == arg0) {
				if (local17.aClass5_Sub4_Sub4_4 != null) {
					local17.aClass5_Sub4_Sub4_4.method4155(Static417.anInt7038 / 100);
					if (local17.aClass5_Sub4_Sub4_4.method4149()) {
						this.aClass5_Sub4_Sub3_1.aClass5_Sub4_Sub1_1.method334(local17.aClass5_Sub4_Sub4_4);
					}
					local17.method8398();
				}
				if (local17.anInt9885 < 0) {
					this.aClass5_Sub51ArrayArray1[local17.anInt9869][local17.anInt9882] = null;
				}
				local17.method9222();
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)V")
	private void method1821(@OriginalArg(1) int arg0) {
		if ((this.anIntArray114[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(21) Class5_Sub51 local21 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method378(); local21 != null; local21 = (Class5_Sub51) this.aClass5_Sub4_Sub3_1.aClass20_16.method366()) {
			if (arg0 == local21.anInt9869 && this.aClass5_Sub51ArrayArray1[arg0][local21.anInt9882] == null && local21.anInt9885 < 0) {
				local21.anInt9885 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "(I)Z")
	public synchronized boolean method1822() {
		return this.aClass341_1.method7601();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZZLclient!jt;B)V")
	private synchronized void method1823(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class5_Sub28 arg2) {
		this.method1800(arg0);
		this.aClass341_1.method7600(arg2.aByteArray47);
		this.aBoolean139 = arg1;
		this.aLong70 = 0L;
		@Pc(24) int local24 = this.aClass341_1.method7609();
		for (@Pc(35) int local35 = 0; local35 < local24; local35++) {
			this.aClass341_1.method7608(local35);
			this.aClass341_1.method7604(local35);
			this.aClass341_1.method7603(local35);
		}
		this.anInt2017 = this.aClass341_1.method7607();
		this.anInt2018 = this.aClass341_1.anIntArray507[this.anInt2017];
		this.aLong69 = this.aClass341_1.method7614(this.anInt2018);
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public synchronized Class5_Sub4 method4711() {
		return this.aClass5_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(Lclient!up;I)I")
	private int method1824(@OriginalArg(0) Class5_Sub51 arg0) {
		if (this.anIntArray109[arg0.anInt9869] == 0) {
			return 0;
		}
		@Pc(18) Class140 local18 = arg0.aClass140_1;
		@Pc(34) int local34 = this.anIntArray116[arg0.anInt9869] * this.anIntArray110[arg0.anInt9869] + 4096 >> 13;
		@Pc(42) int local42 = local34 * local34 + 16384 >> 15;
		@Pc(51) int local51 = arg0.anInt9866 * local42 + 16384 >> 15;
		@Pc(60) int local60 = this.anInt1976 * local51 + 128 >> 8;
		local34 = local60 * this.anIntArray109[arg0.anInt9869] + 128 >> 8;
		if (local18.anInt3604 > 0) {
			local34 = (int) (Math.pow(0.5D, (double) arg0.anInt9880 * 1.953125E-5D * (double) local18.anInt3604) * (double) local34 + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local18.aByteArray35 != null) {
			local105 = arg0.anInt9884;
			local113 = local18.aByteArray35[arg0.anInt9873 + 1];
			if (local18.aByteArray35.length - 2 > arg0.anInt9873) {
				local135 = (local18.aByteArray35[arg0.anInt9873] & 0xFF) << 8;
				local147 = (local18.aByteArray35[arg0.anInt9873 + 2] & 0xFF) << 8;
				local113 += (local105 - local135) * (local18.aByteArray35[arg0.anInt9873 + 3] + -local113) / (local147 - local135);
			}
			local34 = local113 * local34 + 32 >> 6;
		}
		if (arg0.anInt9885 > 0 && local18.aByteArray36 != null) {
			local105 = arg0.anInt9885;
			local113 = local18.aByteArray36[arg0.anInt9883 + 1];
			if (arg0.anInt9883 < local18.aByteArray36.length - 2) {
				local135 = (local18.aByteArray36[arg0.anInt9883] & 0xFF) << 8;
				local147 = (local18.aByteArray36[arg0.anInt9883 + 2] & 0xFF) << 8;
				local113 += (local105 - local135) * (-local113 + local18.aByteArray36[arg0.anInt9883 + 3]) / (local147 - local135);
			}
			local34 = local34 * local113 + 32 >> 6;
		}
		return local34;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public synchronized Class5_Sub4 method4714() {
		return null;
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(III)V")
	public synchronized void method1825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray109[arg1] = arg0;
		} else {
			for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
				this.anIntArray109[local24] = arg0;
			}
		}
	}
}
