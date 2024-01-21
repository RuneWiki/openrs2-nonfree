import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub8_Sub4 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qe", name = "Xb", descriptor = "I")
	private int anInt2444;

	@OriginalMember(owner = "client!qe", name = "Yb", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!qe", name = "Zb", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!qe", name = "ac", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!qe", name = "bc", descriptor = "I")
	private int anInt2445;

	@OriginalMember(owner = "client!qe", name = "I", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	private int anInt2410 = 256;

	@OriginalMember(owner = "client!qe", name = "F", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!qe", name = "db", descriptor = "[I")
	private final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "[[Lclient!ob;")
	private final Class1_Sub15[][] aClass1_Sub15ArrayArray1 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "[I")
	private final int[] anIntArray370 = new int[16];

	@OriginalMember(owner = "client!qe", name = "lb", descriptor = "[[Lclient!ob;")
	private final Class1_Sub15[][] aClass1_Sub15ArrayArray2 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "[I")
	public final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "[I")
	public final int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!qe", name = "S", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
	private final int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!qe", name = "mb", descriptor = "[I")
	private final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!qe", name = "wb", descriptor = "[I")
	public final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Ib", descriptor = "[I")
	private final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!qe", name = "ub", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Tb", descriptor = "[I")
	private final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Hb", descriptor = "[I")
	private final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!qe", name = "Db", descriptor = "Lclient!me;")
	private final Class49 aClass49_1 = new Class49();

	@OriginalMember(owner = "client!qe", name = "Wb", descriptor = "Lclient!jd;")
	private final Class1_Sub8_Sub2 aClass1_Sub8_Sub2_1 = new Class1_Sub8_Sub2(this);

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "Lclient!ta;")
	private final Class70 aClass70_10 = new Class70(128);

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub4() {
		this.method1756();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ob;I)I")
	private int method1740(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(7) Class73 local7 = arg0.aClass73_1;
		@Pc(27) int local27 = this.anIntArray364[arg0.anInt2045] * this.anIntArray369[arg0.anInt2045] + 4096 >> 13;
		@Pc(35) int local35 = local27 * local27 + 16384 >> 15;
		@Pc(44) int local44 = local35 * arg0.anInt2053 + 16384 >> 15;
		local27 = this.anInt2410 * local44 + 128 >> 8;
		if (local7.anInt2935 > 0) {
			local27 = (int) ((double) local27 * Math.pow(0.5D, (double) local7.anInt2935 * (double) arg0.anInt2047 * 1.953125E-5D) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(109) int local109;
		@Pc(121) int local121;
		if (local7.aByteArray91 != null) {
			local83 = arg0.anInt2058;
			local91 = local7.aByteArray91[arg0.anInt2055 + 1];
			if (local7.aByteArray91.length - 2 > arg0.anInt2055) {
				local109 = (local7.aByteArray91[arg0.anInt2055] & 0xFF) << 8;
				local121 = (local7.aByteArray91[arg0.anInt2055 + 2] & 0xFF) << 8;
				local91 += (local7.aByteArray91[arg0.anInt2055 + 3] - local91) * (local83 - local109) / (local121 - local109);
			}
			local27 = local91 * local27 + 32 >> 6;
		}
		if (arg0.anInt2056 > 0 && local7.aByteArray92 != null) {
			local83 = arg0.anInt2056;
			local91 = local7.aByteArray92[arg0.anInt2057 + 1];
			if (arg0.anInt2057 < local7.aByteArray92.length - 2) {
				local109 = (local7.aByteArray92[arg0.anInt2057] & 0xFF) << 8;
				local121 = (local7.aByteArray92[arg0.anInt2057 + 2] & 0xFF) << 8;
				local91 += (local7.aByteArray92[arg0.anInt2057 + 3] - local91) * (local83 - local109) / (local121 - local109);
			}
			local27 = local91 * local27 + 32 >> 6;
		}
		return local27;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
	private void method1741() {
		@Pc(8) int local8 = this.anInt2444;
		@Pc(11) int local11 = this.anInt2445;
		@Pc(18) long local18 = this.aLong79;
		while (local11 == this.anInt2445) {
			while (local11 == this.aClass49_1.anIntArray271[local8]) {
				this.aClass49_1.method1334(local8);
				@Pc(29) int local29 = this.aClass49_1.method1324(local8);
				if (local29 == 1) {
					this.aClass49_1.method1332();
					this.aClass49_1.method1325(local8);
					if (this.aClass49_1.method1323()) {
						if (!this.aBoolean199 || local11 == 0) {
							this.method1756();
							this.aClass49_1.method1331();
							return;
						}
						this.aClass49_1.method1336(local18);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1755(local29);
				}
				this.aClass49_1.method1333(local8);
				this.aClass49_1.method1325(local8);
			}
			local8 = this.aClass49_1.method1330();
			local11 = this.aClass49_1.anIntArray271[local8];
			local18 = this.aClass49_1.method1335(local11);
		}
		this.aLong79 = local18;
		this.anInt2445 = local11;
		this.anInt2444 = local8;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)V")
	private void method1742(@OriginalArg(0) int arg0) {
		if ((this.anIntArray366[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub15 local28 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1000(); local28 != null; local28 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1003()) {
			if (arg0 == local28.anInt2045) {
				local28.anInt2051 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)I")
	public int method1743() {
		return this.anInt2410;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIII)V")
	private void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub15 local16 = this.aClass1_Sub15ArrayArray2[arg2][arg1];
		if (local16 == null) {
			return;
		}
		this.aClass1_Sub15ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray366[arg2] & 0x2) == 0) {
			local16.anInt2056 = 0;
			return;
		}
		for (@Pc(43) Class1_Sub15 local43 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1000(); local43 != null; local43 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1003()) {
			if (local43.anInt2045 == local16.anInt2045 && local43.anInt2056 < 0 && local43 != local16) {
				local16.anInt2056 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZILclient!ob;)V")
	public void method1745(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub15 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub16_Sub1_1.aByteArray72.length;
		@Pc(47) int local47;
		if (arg0 && arg1.aClass1_Sub16_Sub1_1.aBoolean185) {
			@Pc(30) int local30 = local8 + local8 - arg1.aClass1_Sub16_Sub1_1.anInt2190;
			local8 <<= 0x8;
			local47 = (int) ((long) this.anIntArray373[arg1.anInt2045] * (long) local30 >> 6);
			if (local8 <= local47) {
				local47 = local8 + local8 - local47 - 1;
				arg1.aClass1_Sub8_Sub1_3.method949();
			}
		} else {
			local47 = (int) ((long) this.anIntArray373[arg1.anInt2045] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub8_Sub1_3.method921(local47);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
	public synchronized void method1746() {
		for (@Pc(7) Class1_Sub17 local7 = (Class1_Sub17) this.aClass70_10.method1958(); local7 != null; local7 = (Class1_Sub17) this.aClass70_10.method1956()) {
			local7.method1584();
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	private void method1747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "()Lclient!qf;")
	@Override
	public synchronized Class1_Sub8 method1738() {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ob;I[II)Z")
	public boolean method1748(@OriginalArg(1) Class1_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt2049 = Static44.anInt1243 / 100;
		if (arg0.anInt2056 >= 0 && (arg0.aClass1_Sub8_Sub1_3 == null || arg0.aClass1_Sub8_Sub1_3.method940())) {
			arg0.method1446();
			arg0.method2128();
			if (arg0.anInt2043 > 0 && arg0 == this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043]) {
				this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg0.anInt2054;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray368[arg0.anInt2045] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg0.anInt2054 = local58;
		}
		arg0.aClass1_Sub8_Sub1_3.method932(this.method1772(arg0));
		arg0.anInt2040++;
		@Pc(107) Class73 local107 = arg0.aClass73_1;
		arg0.anInt2046 += local107.anInt2947;
		@Pc(132) double local132 = (double) ((arg0.anInt2041 - 60 << 8) + (arg0.anInt2050 * arg0.anInt2054 >> 12)) * 5.086263020833333E-6D;
		@Pc(134) boolean local134 = false;
		if (local107.anInt2935 > 0) {
			if (local107.anInt2944 <= 0) {
				arg0.anInt2047 += 128;
			} else {
				arg0.anInt2047 += (int) (Math.pow(2.0D, (double) local107.anInt2944 * local132) * 128.0D + 0.5D);
			}
		}
		if (local107.aByteArray91 != null) {
			if (local107.anInt2948 <= 0) {
				arg0.anInt2058 += 128;
			} else {
				arg0.anInt2058 += (int) (Math.pow(2.0D, (double) local107.anInt2948 * local132) * 128.0D + 0.5D);
			}
			while (arg0.anInt2055 < local107.aByteArray91.length - 2 && arg0.anInt2058 > (local107.aByteArray91[arg0.anInt2055 + 2] & 0xFF) << 8) {
				arg0.anInt2055 += 2;
			}
			if (arg0.anInt2055 == local107.aByteArray91.length - 2 && local107.aByteArray91[arg0.anInt2055 + 1] == 0) {
				local134 = true;
			}
		}
		if (arg0.anInt2056 >= 0 && local107.aByteArray92 != null && (this.anIntArray366[arg0.anInt2045] & 0x1) == 0 && (arg0.anInt2043 < 0 || this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] != arg0)) {
			if (local107.anInt2933 <= 0) {
				arg0.anInt2056 += 128;
			} else {
				arg0.anInt2056 += (int) (Math.pow(2.0D, (double) local107.anInt2933 * local132) * 128.0D + 0.5D);
			}
			while (arg0.anInt2057 < local107.aByteArray92.length - 2 && arg0.anInt2056 > (local107.aByteArray92[arg0.anInt2057 + 2] & 0xFF) << 8) {
				arg0.anInt2057 += 2;
			}
			if (local107.aByteArray92.length - 2 == arg0.anInt2057) {
				local134 = true;
			}
		}
		if (!local134) {
			arg0.aClass1_Sub8_Sub1_3.method945(arg0.anInt2049, this.method1740(arg0), this.method1762(arg0));
			return false;
		}
		arg0.aClass1_Sub8_Sub1_3.method951(arg0.anInt2049);
		if (arg2 == null) {
			arg0.aClass1_Sub8_Sub1_3.method1739(arg3);
		} else {
			arg0.aClass1_Sub8_Sub1_3.method1736(arg2, arg1, arg3);
		}
		if (arg0.aClass1_Sub8_Sub1_3.method952()) {
			this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub3_2.method1640(arg0.aClass1_Sub8_Sub1_3);
		}
		arg0.method1446();
		if (arg0.anInt2056 >= 0) {
			arg0.method2128();
			if (arg0.anInt2043 > 0 && this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] == arg0) {
				this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!ob;)Z")
	public boolean method1749(@OriginalArg(1) Class1_Sub15 arg0) {
		if (arg0.aClass1_Sub8_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt2056 >= 0) {
			arg0.method2128();
			if (arg0.anInt2043 > 0 && this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] == arg0) {
				this.aClass1_Sub15ArrayArray1[arg0.anInt2045][arg0.anInt2043] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
	public synchronized void method1750() {
		this.aClass49_1.method1331();
		this.method1756();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1736(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass49_1.method1328()) {
			@Pc(17) int local17 = this.aClass49_1.anInt1938 * 1000000 / Static44.anInt1243;
			do {
				@Pc(27) long local27 = this.aLong80 + (long) arg2 * (long) local17;
				if (this.aLong79 - local27 >= 0L) {
					this.aLong80 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local17 + this.aLong79 - this.aLong80 - 1L) / (long) local17);
				arg2 -= local56;
				this.aLong80 += (long) local56 * (long) local17;
				this.aClass1_Sub8_Sub2_1.method1736(arg0, arg1, local56);
				this.method1741();
				arg1 += local56;
			} while (this.aClass49_1.method1328());
		}
		this.aClass1_Sub8_Sub2_1.method1736(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI)V")
	private void method1751(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray379[arg1]) {
			this.anIntArray379[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub15ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V")
	private void method1752() {
		this.anIntArray377[9] = 128;
		this.anIntArray376[9] = 128;
		this.method1751(128, 9);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	public synchronized void method1753() {
		for (@Pc(15) Class1_Sub17 local15 = (Class1_Sub17) this.aClass70_10.method1958(); local15 != null; local15 = (Class1_Sub17) this.aClass70_10.method1956()) {
			local15.method2128();
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(IIII)V")
	private void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(II)V")
	private void method1755(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1744(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1744(64, local24, local18);
			} else {
				this.method1761(local18, local24, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1754(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			if (local24 == 0) {
				this.anIntArray376[local18] = (this.anIntArray376[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray376[local18] = (this.anIntArray376[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray367[local18] = (local30 << 7) + (this.anIntArray367[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray367[local18] = (this.anIntArray367[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray368[local18] = (local30 << 7) + (this.anIntArray368[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray368[local18] = local30 + (this.anIntArray368[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray364[local18] = (this.anIntArray364[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray364[local18] = (this.anIntArray364[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray372[local18] = (local30 << 7) + (this.anIntArray372[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray372[local18] = local30 + (this.anIntArray372[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray369[local18] = (local30 << 7) + (this.anIntArray369[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray369[local18] = (this.anIntArray369[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray366[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray366[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1769(local18);
					this.anIntArray366[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray366[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray370[local18] = (local30 << 7) + (this.anIntArray370[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray370[local18] = local30 + (this.anIntArray370[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray370[local18] = (local30 << 7) + (this.anIntArray370[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray370[local18] = local30 + (this.anIntArray370[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1760(local18);
			}
			if (local24 == 121) {
				this.method1770(local18);
			}
			if (local24 == 123) {
				this.method1765(local18);
			}
			@Pc(502) int local502;
			if (local24 == 6) {
				local502 = this.anIntArray370[local18];
				if (local502 == 16384) {
					this.anIntArray365[local18] = (this.anIntArray365[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local502 = this.anIntArray370[local18];
				if (local502 == 16384) {
					this.anIntArray365[local18] = local30 + (this.anIntArray365[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray373[local18] = (this.anIntArray373[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray373[local18] = local30 + (this.anIntArray373[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray366[local18] |= 0x4;
				} else {
					this.method1742(local18);
					this.anIntArray366[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1763(local18, (this.anIntArray371[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method1763(local18, (this.anIntArray371[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1751(this.anIntArray376[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1747(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1759(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1756();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
	private void method1756() {
		this.method1760(-1);
		this.method1770(-1);
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			this.anIntArray379[local17] = this.anIntArray377[local17];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray376[local41] = this.anIntArray377[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method1758() {
		return this.aClass49_1.method1328();
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V")
	private void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray374[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(II)V")
	private void method1760(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1000(); local8 != null; local8 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1003()) {
			if (arg0 < 0 || local8.anInt2045 == arg0) {
				if (local8.aClass1_Sub8_Sub1_3 != null) {
					local8.aClass1_Sub8_Sub1_3.method951(Static44.anInt1243 / 100);
					if (local8.aClass1_Sub8_Sub1_3.method952()) {
						this.aClass1_Sub8_Sub2_1.aClass1_Sub8_Sub3_2.method1640(local8.aClass1_Sub8_Sub1_3);
					}
					local8.method1446();
				}
				if (local8.anInt2056 < 0) {
					this.aClass1_Sub15ArrayArray2[local8.anInt2045][local8.anInt2041] = null;
				}
				local8.method2128();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BIII)V")
	private void method1761(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1744(64, arg1, arg0);
		if ((this.anIntArray366[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub15 local25 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1004(); local25 != null; local25 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1002()) {
				if (local25.anInt2045 == arg0 && local25.anInt2056 < 0) {
					this.aClass1_Sub15ArrayArray2[arg0][local25.anInt2041] = null;
					this.aClass1_Sub15ArrayArray2[arg0][arg1] = local25;
					@Pc(63) int local63 = (local25.anInt2050 * local25.anInt2054 >> 12) + local25.anInt2042;
					local25.anInt2042 += arg1 - local25.anInt2041 << 8;
					local25.anInt2050 = local63 - local25.anInt2042;
					local25.anInt2054 = 4096;
					local25.anInt2041 = arg1;
					return;
				}
			}
		}
		@Pc(108) Class1_Sub17 local108 = (Class1_Sub17) this.aClass70_10.method1961((long) this.anIntArray379[arg0]);
		if (local108 == null) {
			return;
		}
		@Pc(124) Class1_Sub16_Sub1 local124 = local108.aClass1_Sub16_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class1_Sub15 local131 = new Class1_Sub15();
		local131.aClass1_Sub17_1 = local108;
		local131.anInt2045 = arg0;
		local131.aClass1_Sub16_Sub1_1 = local124;
		local131.aClass73_1 = local108.aClass73Array1[arg1];
		local131.anInt2043 = local108.aByteArray76[arg1];
		local131.anInt2041 = arg1;
		local131.anInt2053 = arg2 * arg2 * local108.anInt2221 * local108.aByteArray75[arg1] + 1024 >> 11;
		local131.anInt2044 = local108.aByteArray74[arg1] & 0xFF;
		local131.anInt2042 = (arg1 << 8) - (local108.aShortArray7[arg1] & 0x7FFF);
		local131.anInt2047 = 0;
		local131.anInt2055 = 0;
		local131.anInt2056 = -1;
		local131.anInt2057 = 0;
		local131.anInt2058 = 0;
		if (this.anIntArray373[arg0] == 0) {
			local131.aClass1_Sub8_Sub1_3 = Static131.method920(local124, this.method1772(local131), this.method1740(local131), this.method1762(local131));
		} else {
			local131.aClass1_Sub8_Sub1_3 = Static131.method920(local124, this.method1772(local131), 0, this.method1762(local131));
			this.method1745(local108.aShortArray7[arg1] < 0, local131);
		}
		if (local108.aShortArray7[arg1] < 0) {
			local131.aClass1_Sub8_Sub1_3.method923(-1);
		}
		if (local131.anInt2043 >= 0) {
			@Pc(279) Class1_Sub15 local279 = this.aClass1_Sub15ArrayArray1[arg0][local131.anInt2043];
			if (local279 != null && local279.anInt2056 < 0) {
				this.aClass1_Sub15ArrayArray2[arg0][local279.anInt2041] = null;
				local279.anInt2056 = 0;
			}
			this.aClass1_Sub15ArrayArray1[arg0][local131.anInt2043] = local131;
		}
		this.aClass1_Sub8_Sub2_1.aClass31_36.method1005(local131);
		this.aClass1_Sub15ArrayArray2[arg0][arg1] = local131;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ZLclient!ob;)I")
	private int method1762(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(16) int local16 = this.anIntArray372[arg0.anInt2045];
		return local16 < 8192 ? local16 * arg0.anInt2044 + 32 >> 6 : 16384 - ((128 - arg0.anInt2044) * (16384 - local16) + 32 >> 6);
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(III)V")
	private void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray371[arg0] = arg1;
		this.anIntArray375[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	private void method1765(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub15 local8 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1000(); local8 != null; local8 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1003()) {
			if ((arg0 < 0 || arg0 == local8.anInt2045) && local8.anInt2056 < 0) {
				this.aClass1_Sub15ArrayArray2[local8.anInt2045][local8.anInt2041] = null;
				local8.anInt2056 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1733() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(BI)V")
	public synchronized void method1768(@OriginalArg(1) int arg0) {
		this.anInt2410 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	private void method1769(@OriginalArg(1) int arg0) {
		if ((this.anIntArray366[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) Class1_Sub15 local20 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1000(); local20 != null; local20 = (Class1_Sub15) this.aClass1_Sub8_Sub2_1.aClass31_36.method1003()) {
			if (local20.anInt2045 == arg0 && this.aClass1_Sub15ArrayArray2[arg0][local20.anInt2041] == null && local20.anInt2056 < 0) {
				local20.anInt2056 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "()Lclient!qf;")
	@Override
	public synchronized Class1_Sub8 method1734() {
		return this.aClass1_Sub8_Sub2_1;
	}

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(II)V")
	private void method1770(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1770(local9);
			}
			return;
		}
		this.anIntArray364[arg0] = 12800;
		this.anIntArray372[arg0] = 8192;
		this.anIntArray369[arg0] = 16383;
		this.anIntArray374[arg0] = 8192;
		this.anIntArray367[arg0] = 0;
		this.anIntArray368[arg0] = 8192;
		this.method1769(arg0);
		this.method1742(arg0);
		this.anIntArray366[arg0] = 0;
		this.anIntArray370[arg0] = 32767;
		this.anIntArray365[arg0] = 256;
		this.anIntArray373[arg0] = 0;
		this.method1763(arg0, 8192);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLclient!g;Lclient!jf;Lclient!q;)Z")
	public synchronized boolean method1771(@OriginalArg(2) Class21 arg0, @OriginalArg(3) Class1_Sub10 arg1, @OriginalArg(4) Class62 arg2) {
		arg1.method1114();
		@Pc(9) boolean local9 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class1_Sub20 local35 = (Class1_Sub20) arg1.aClass70_5.method1958(); local35 != null; local35 = (Class1_Sub20) arg1.aClass70_5.method1956()) {
			@Pc(41) int local41 = (int) local35.aLong98;
			@Pc(49) Class1_Sub17 local49 = (Class1_Sub17) this.aClass70_10.method1961((long) local41);
			if (local49 == null) {
				local49 = Static88.method1464(local41, arg2);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass70_10.method1955(local49, (long) local41);
			}
			if (!local49.method1585(local29, arg0, local35.aByteArray90)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method1116();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method1739(@OriginalArg(0) int arg0) {
		if (this.aClass49_1.method1328()) {
			@Pc(17) int local17 = this.aClass49_1.anInt1938 * 1000000 / Static44.anInt1243;
			do {
				@Pc(26) long local26 = this.aLong80 + (long) local17 * (long) arg0;
				if (this.aLong79 - local26 >= 0L) {
					this.aLong80 = local26;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong79 + (long) local17 - this.aLong80 - 1L) / (long) local17);
				this.aLong80 += (long) local17 * (long) local54;
				this.aClass1_Sub8_Sub2_1.method1739(local54);
				arg0 -= local54;
				this.method1741();
			} while (this.aClass49_1.method1328());
		}
		this.aClass1_Sub8_Sub2_1.method1739(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Lclient!ob;I)I")
	private int method1772(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(14) int local14 = (arg0.anInt2054 * arg0.anInt2050 >> 12) + arg0.anInt2042;
		local14 += this.anIntArray365[arg0.anInt2045] * (this.anIntArray374[arg0.anInt2045] - 8192) >> 12;
		@Pc(40) Class73 local40 = arg0.aClass73_1;
		@Pc(57) int local57;
		if (local40.anInt2947 > 0 && (local40.anInt2943 > 0 || this.anIntArray367[arg0.anInt2045] > 0)) {
			local57 = local40.anInt2943 << 2;
			@Pc(62) int local62 = local40.anInt2938 << 1;
			if (local62 > arg0.anInt2040) {
				local57 = arg0.anInt2040 * local57 / local62;
			}
			local57 += this.anIntArray367[arg0.anInt2045] >> 7;
			@Pc(92) double local92 = Math.sin((double) (arg0.anInt2046 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local92 * (double) local57);
		}
		local57 = (int) ((double) (arg0.aClass1_Sub16_Sub1_1.anInt2191 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static44.anInt1243 + 0.5D);
		return local57 >= 1 ? local57 : 1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)V")
	public synchronized void method1773() {
		this.method1752();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!jf;Z)V")
	public synchronized void method1774(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) boolean arg1) {
		this.method1750();
		this.aClass49_1.method1326(arg0.aByteArray47);
		this.aBoolean199 = arg1;
		this.aLong80 = 0L;
		@Pc(31) int local31 = this.aClass49_1.method1337();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass49_1.method1334(local33);
			this.aClass49_1.method1333(local33);
			this.aClass49_1.method1325(local33);
		}
		this.anInt2444 = this.aClass49_1.method1330();
		this.anInt2445 = this.aClass49_1.anIntArray271[this.anInt2444];
		this.aLong79 = this.aClass49_1.method1335(this.anInt2445);
	}
}
