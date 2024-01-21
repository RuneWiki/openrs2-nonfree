import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bf", name = "bc", descriptor = "Z")
	private boolean aBoolean26;

	@OriginalMember(owner = "client!bf", name = "cc", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!bf", name = "ec", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!bf", name = "fc", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!bf", name = "gc", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!bf", name = "jb", descriptor = "[I")
	public final int[] anIntArray38 = new int[16];

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "[I")
	private final int[] anIntArray36 = new int[16];

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "[I")
	private final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!bf", name = "yb", descriptor = "[I")
	private final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!bf", name = "zb", descriptor = "[I")
	private final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "[I")
	private final int[] anIntArray37 = new int[16];

	@OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
	private final int anInt344 = 1000000;

	@OriginalMember(owner = "client!bf", name = "Nb", descriptor = "[I")
	private final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!bf", name = "wb", descriptor = "[I")
	private final int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!bf", name = "vb", descriptor = "[[Lclient!kc;")
	private final Class3_Sub12[][] aClass3_Sub12ArrayArray1 = new Class3_Sub12[16][128];

	@OriginalMember(owner = "client!bf", name = "Jb", descriptor = "[I")
	public final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!bf", name = "mb", descriptor = "[I")
	private final int[] anIntArray39 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Vb", descriptor = "[[Lclient!kc;")
	private final Class3_Sub12[][] aClass3_Sub12ArrayArray2 = new Class3_Sub12[16][128];

	@OriginalMember(owner = "client!bf", name = "Sb", descriptor = "[I")
	private final int[] anIntArray48 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Xb", descriptor = "[I")
	private final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!bf", name = "ac", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Rb", descriptor = "[I")
	private final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!bf", name = "Ub", descriptor = "I")
	private int anInt365 = 256;

	@OriginalMember(owner = "client!bf", name = "Ob", descriptor = "[I")
	public final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!bf", name = "X", descriptor = "Lclient!id;")
	private final Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!bf", name = "dc", descriptor = "Lclient!ue;")
	private final Class3_Sub3_Sub4 aClass3_Sub3_Sub4_1 = new Class3_Sub3_Sub4(this);

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "Lclient!ec;")
	private final Class17 aClass17_1 = new Class17(128);

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub1() {
		this.method236();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	public synchronized void method205() {
		this.method222();
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(III)V")
	private void method206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray37[arg1] != arg0) {
			this.anIntArray37[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub12ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)V")
	private void method207(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method216(local24, local30, local18);
		} else if (local9 == 144) {
			local30 = arg0 >> 16 & 0x7F;
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			if (local30 > 0) {
				this.method233(local18, local24, local30);
			} else {
				this.method216(local24, 64, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method211(local24, local18, local30);
		} else if (local9 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			@Pc(132) int local132 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray43[local24] = (local132 << 14) + (this.anIntArray43[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray43[local24] = (this.anIntArray43[local24] & 0xFFFFC07F) + (local132 << 7);
			}
			if (local30 == 1) {
				this.anIntArray40[local24] = (this.anIntArray40[local24] & 0xFFFFC07F) + (local132 << 7);
			}
			if (local30 == 33) {
				this.anIntArray40[local24] = (this.anIntArray40[local24] & 0xFFFFFF80) + local132;
			}
			if (local30 == 5) {
				this.anIntArray41[local24] = (this.anIntArray41[local24] & 0xFFFFC07F) + (local132 << 7);
			}
			if (local30 == 37) {
				this.anIntArray41[local24] = (this.anIntArray41[local24] & 0xFFFFFF80) + local132;
			}
			if (local30 == 7) {
				this.anIntArray50[local24] = (local132 << 7) + (this.anIntArray50[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray50[local24] = (this.anIntArray50[local24] & 0xFFFFFF80) + local132;
			}
			if (local30 == 10) {
				this.anIntArray47[local24] = (local132 << 7) + (this.anIntArray47[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray47[local24] = (this.anIntArray47[local24] & 0xFFFFFF80) + local132;
			}
			if (local30 == 11) {
				this.anIntArray48[local24] = (this.anIntArray48[local24] & 0xFFFFC07F) + (local132 << 7);
			}
			if (local30 == 43) {
				this.anIntArray48[local24] = (this.anIntArray48[local24] & 0xFFFFFF80) + local132;
			}
			if (local30 == 64) {
				if (local132 >= 64) {
					this.anIntArray38[local24] |= 0x1;
				} else {
					this.anIntArray38[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local132 < 64) {
					this.method218(local24);
					this.anIntArray38[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray38[local24] |= 0x2;
				}
			}
			if (local30 == 99) {
				this.anIntArray36[local24] = (this.anIntArray36[local24] & 0x7F) + (local132 << 7);
			}
			if (local30 == 98) {
				this.anIntArray36[local24] = (this.anIntArray36[local24] & 0x3F80) + local132;
			}
			if (local30 == 101) {
				this.anIntArray36[local24] = (local132 << 7) + (this.anIntArray36[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray36[local24] = (this.anIntArray36[local24] & 0x3F80) + local132 + 16384;
			}
			if (local30 == 120) {
				this.method224(local24);
			}
			if (local30 == 121) {
				this.method209(local24);
			}
			if (local30 == 123) {
				this.method210(local24);
			}
			@Pc(504) int local504;
			if (local30 == 6) {
				local504 = this.anIntArray36[local24];
				if (local504 == 16384) {
					this.anIntArray39[local24] = (local132 << 7) + (this.anIntArray39[local24] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local504 = this.anIntArray36[local24];
				if (local504 == 16384) {
					this.anIntArray39[local24] = (this.anIntArray39[local24] & 0xFFFFFF80) + local132;
				}
			}
			if (local30 == 16) {
				this.anIntArray44[local24] = (this.anIntArray44[local24] & 0xFFFFC07F) + (local132 << 7);
			}
			if (local30 == 48) {
				this.anIntArray44[local24] = local132 + (this.anIntArray44[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local132 >= 64) {
					this.anIntArray38[local24] |= 0x4;
				} else {
					this.method225(local24);
					this.anIntArray38[local24] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method208(local24, (this.anIntArray45[local24] & 0xFFFFC07F) + (local132 << 7));
			}
			if (local30 == 49) {
				this.method208(local24, (this.anIntArray45[local24] & 0xFFFFFF80) + local132);
			}
		} else if (local9 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method206(local30 + this.anIntArray43[local24], local24);
		} else if (local9 == 208) {
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			this.method238(local30, local24);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method231(local24, local30);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method236();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBI)V")
	private void method208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray45[arg0] = arg1;
		this.anIntArray46[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	private void method209(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method209(local9);
			}
			return;
		}
		this.anIntArray50[arg0] = 12800;
		this.anIntArray47[arg0] = 8192;
		this.anIntArray48[arg0] = 16383;
		this.anIntArray49[arg0] = 8192;
		this.anIntArray40[arg0] = 0;
		this.anIntArray41[arg0] = 8192;
		this.method218(arg0);
		this.method225(arg0);
		this.anIntArray38[arg0] = 0;
		this.anIntArray36[arg0] = 32767;
		this.anIntArray39[arg0] = 256;
		this.anIntArray44[arg0] = 0;
		this.method208(arg0, 8192);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void method210(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class3_Sub12 local16 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1958(); local16 != null; local16 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1962()) {
			if ((arg0 < 0 || arg0 == local16.anInt1817) && local16.anInt1818 < 0) {
				this.aClass3_Sub12ArrayArray2[local16.anInt1817][local16.anInt1836] = null;
				local16.anInt1818 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()Lclient!da;")
	@Override
	public synchronized Class3_Sub3 method2145() {
		return this.aClass3_Sub3_Sub4_1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIB)V")
	private void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2146(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass29_1.method1052()) {
			@Pc(18) int local18 = this.aClass29_1.anInt1588 * this.anInt344 / Static110.anInt2948;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong12;
				if (this.aLong11 - local27 >= 0L) {
					this.aLong12 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong11 + (long) local18 - this.aLong12 - 1L) / (long) local18);
				arg2 -= local56;
				this.aLong12 += (long) local18 * (long) local56;
				this.aClass3_Sub3_Sub4_1.method2146(arg0, arg1, local56);
				this.method221();
				arg1 += local56;
			} while (this.aClass29_1.method1052());
		}
		this.aClass3_Sub3_Sub4_1.method2146(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
	public synchronized void method215() {
		for (@Pc(11) Class3_Sub23 local11 = (Class3_Sub23) this.aClass17_1.method598(); local11 != null; local11 = (Class3_Sub23) this.aClass17_1.method597()) {
			local11.method2201();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2148(@OriginalArg(0) int arg0) {
		if (this.aClass29_1.method1052()) {
			@Pc(18) int local18 = this.aClass29_1.anInt1588 * this.anInt344 / Static110.anInt2948;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong12;
				if (this.aLong11 - local27 >= 0L) {
					this.aLong12 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong11 + (long) local18 - this.aLong12 - 1L) / (long) local18);
				arg0 -= local55;
				this.aLong12 += (long) local55 * (long) local18;
				this.aClass3_Sub3_Sub4_1.method2148(local55);
				this.method221();
			} while (this.aClass29_1.method1052());
		}
		this.aClass3_Sub3_Sub4_1.method2148(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIB)V")
	private void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class3_Sub12 local18 = this.aClass3_Sub12ArrayArray2[arg2][arg0];
		if (local18 == null) {
			return;
		}
		this.aClass3_Sub12ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray38[arg2] & 0x2) == 0) {
			local18.anInt1818 = 0;
			return;
		}
		for (@Pc(42) Class3_Sub12 local42 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1958(); local42 != null; local42 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1962()) {
			if (local42.anInt1817 == local18.anInt1817 && local42.anInt1818 < 0 && local42 != local18) {
				local18.anInt1818 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kc;I)I")
	private int method217(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(12) Class57 local12 = arg0.aClass57_1;
		@Pc(24) int local24 = arg0.anInt1833 + (arg0.anInt1834 * arg0.anInt1837 >> 12);
		local24 += this.anIntArray39[arg0.anInt1817] * (this.anIntArray49[arg0.anInt1817] - 8192) >> 12;
		@Pc(62) int local62;
		if (local12.anInt2526 > 0 && (local12.anInt2520 > 0 || this.anIntArray40[arg0.anInt1817] > 0)) {
			local62 = local12.anInt2520 << 2;
			@Pc(67) int local67 = local12.anInt2519 << 1;
			if (arg0.anInt1827 < local67) {
				local62 = local62 * arg0.anInt1827 / local67;
			}
			local62 += this.anIntArray40[arg0.anInt1817] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt1821 & 0x1FF) * 0.01227184630308513D);
			local24 += (int) (local101 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass3_Sub5_Sub1_1.anInt2121 * 256) * Math.pow(2.0D, (double) local24 * 3.255208333333333E-4D) / (double) Static110.anInt2948 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	private void method218(@OriginalArg(0) int arg0) {
		if ((this.anIntArray38[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub12 local18 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1958(); local18 != null; local18 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1962()) {
			if (arg0 == local18.anInt1817 && this.aClass3_Sub12ArrayArray2[arg0][local18.anInt1836] == null && local18.anInt1818 < 0) {
				local18.anInt1818 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!kc;[IBI)Z")
	public boolean method219(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub12 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1819 = Static110.anInt2948 / 100;
		if (arg1.anInt1818 >= 0 && (arg1.aClass3_Sub3_Sub3_1 == null || arg1.aClass3_Sub3_Sub3_1.method1823())) {
			arg1.method1199();
			arg1.method2201();
			if (arg1.anInt1830 > 0 && this.aClass3_Sub12ArrayArray1[arg1.anInt1817][arg1.anInt1830] == arg1) {
				this.aClass3_Sub12ArrayArray1[arg1.anInt1817][arg1.anInt1830] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt1837;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray41[arg1.anInt1817] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt1837 = local56;
		}
		arg1.aClass3_Sub3_Sub3_1.method1816(this.method217(arg1));
		arg1.anInt1827++;
		@Pc(101) boolean local101 = false;
		@Pc(104) Class57 local104 = arg1.aClass57_1;
		arg1.anInt1821 += local104.anInt2526;
		@Pc(137) double local137 = (double) ((arg1.anInt1836 - 60 << 8) + (arg1.anInt1834 * arg1.anInt1837 >> 12)) * 5.086263020833333E-6D;
		if (local104.anInt2535 > 0) {
			if (local104.anInt2528 > 0) {
				arg1.anInt1829 += (int) (Math.pow(2.0D, (double) local104.anInt2528 * local137) * 128.0D + 0.5D);
			} else {
				arg1.anInt1829 += 128;
			}
		}
		if (local104.aByteArray32 != null) {
			if (local104.anInt2534 <= 0) {
				arg1.anInt1841 += 128;
			} else {
				arg1.anInt1841 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt2534) * 128.0D + 0.5D);
			}
			while (arg1.anInt1832 < local104.aByteArray32.length - 2 && arg1.anInt1841 > (local104.aByteArray32[arg1.anInt1832 + 2] & 0xFF) << 8) {
				arg1.anInt1832 += 2;
			}
			if (arg1.anInt1832 == local104.aByteArray32.length - 2 && local104.aByteArray32[arg1.anInt1832 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg1.anInt1818 >= 0 && local104.aByteArray31 != null && (this.anIntArray38[arg1.anInt1817] & 0x1) == 0 && (arg1.anInt1830 < 0 || this.aClass3_Sub12ArrayArray1[arg1.anInt1817][arg1.anInt1830] != arg1)) {
			if (local104.anInt2521 <= 0) {
				arg1.anInt1818 += 128;
			} else {
				arg1.anInt1818 += (int) (Math.pow(2.0D, (double) local104.anInt2521 * local137) * 128.0D + 0.5D);
			}
			while (arg1.anInt1839 < local104.aByteArray31.length - 2 && arg1.anInt1818 > (local104.aByteArray31[arg1.anInt1839 + 2] & 0xFF) << 8) {
				arg1.anInt1839 += 2;
			}
			if (local104.aByteArray31.length - 2 == arg1.anInt1839) {
				local101 = true;
			}
		}
		if (!local101) {
			arg1.aClass3_Sub3_Sub3_1.method1844(arg1.anInt1819, this.method237(arg1), this.method235(arg1));
			return false;
		}
		arg1.aClass3_Sub3_Sub3_1.method1851(arg1.anInt1819);
		if (arg2 == null) {
			arg1.aClass3_Sub3_Sub3_1.method2148(arg3);
		} else {
			arg1.aClass3_Sub3_Sub3_1.method2146(arg2, arg0, arg3);
		}
		if (arg1.aClass3_Sub3_Sub3_1.method1845()) {
			this.aClass3_Sub3_Sub4_1.aClass3_Sub3_Sub2_62.method1072(arg1.aClass3_Sub3_Sub3_1);
		}
		arg1.method1199();
		if (arg1.anInt1818 >= 0) {
			arg1.method2201();
			if (arg1.anInt1830 > 0 && arg1 == this.aClass3_Sub12ArrayArray1[arg1.anInt1817][arg1.anInt1830]) {
				this.aClass3_Sub12ArrayArray1[arg1.anInt1817][arg1.anInt1830] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)V")
	private void method221() {
		@Pc(4) int local4 = this.anInt370;
		@Pc(18) int local18 = this.anInt369;
		@Pc(21) long local21 = this.aLong11;
		while (this.anInt369 == local18) {
			while (local18 == this.aClass29_1.anIntArray153[local4]) {
				this.aClass29_1.method1058(local4);
				@Pc(32) int local32 = this.aClass29_1.method1057(local4);
				if (local32 == 1) {
					this.aClass29_1.method1043();
					this.aClass29_1.method1048(local4);
					if (this.aClass29_1.method1045()) {
						if (!this.aBoolean26 || local18 == 0) {
							this.method236();
							this.aClass29_1.method1056();
							return;
						}
						this.aClass29_1.method1049(local21);
					}
					break;
				}
				if ((local32 & 0x80) != 0) {
					this.method207(local32);
				}
				this.aClass29_1.method1047(local4);
				this.aClass29_1.method1048(local4);
			}
			local4 = this.aClass29_1.method1054();
			local18 = this.aClass29_1.anIntArray153[local4];
			local21 = this.aClass29_1.method1046(local18);
		}
		this.anInt369 = local18;
		this.anInt370 = local4;
		this.aLong11 = local21;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BII)V")
	private void method222() {
		this.anIntArray42[9] = 128;
		this.anIntArray43[9] = 128;
		this.method206(128, 9);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!wc;ZLclient!qe;Lclient!ef;)Z")
	public synchronized boolean method223(@OriginalArg(1) Class81 arg0, @OriginalArg(3) Class3_Sub19 arg1, @OriginalArg(4) Class16 arg2) {
		arg1.method1785();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class3_Sub18 local34 = (Class3_Sub18) arg1.aClass17_17.method598(); local34 != null; local34 = (Class3_Sub18) arg1.aClass17_17.method597()) {
			@Pc(40) int local40 = (int) local34.aLong100;
			@Pc(48) Class3_Sub23 local48 = (Class3_Sub23) this.aClass17_1.method599((long) local40);
			if (local48 == null) {
				local48 = Static79.method1382(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass17_1.method594(local48, (long) local40);
			}
			if (!local48.method2098(local34.aByteArray33, arg0, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method1784();
		}
		return local9;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
	private void method224(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub12 local8 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1958(); local8 != null; local8 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1962()) {
			if (arg0 < 0 || local8.anInt1817 == arg0) {
				if (local8.aClass3_Sub3_Sub3_1 != null) {
					local8.aClass3_Sub3_Sub3_1.method1851(Static110.anInt2948 / 100);
					if (local8.aClass3_Sub3_Sub3_1.method1845()) {
						this.aClass3_Sub3_Sub4_1.aClass3_Sub3_Sub2_62.method1072(local8.aClass3_Sub3_Sub3_1);
					}
					local8.method1199();
				}
				if (local8.anInt1818 < 0) {
					this.aClass3_Sub12ArrayArray2[local8.anInt1817][local8.anInt1836] = null;
				}
				local8.method2201();
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
	private void method225(@OriginalArg(0) int arg0) {
		if ((this.anIntArray38[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class3_Sub12 local25 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1958(); local25 != null; local25 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1962()) {
			if (arg0 == local25.anInt1817) {
				local25.anInt1840 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)I")
	public int method226() {
		return this.anInt365;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Z)V")
	public synchronized void method227() {
		for (@Pc(5) Class3_Sub23 local5 = (Class3_Sub23) this.aClass17_1.method598(); local5 != null; local5 = (Class3_Sub23) this.aClass17_1.method597()) {
			local5.method2100();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!kc;I)Z")
	public boolean method228(@OriginalArg(0) Class3_Sub12 arg0) {
		if (arg0.aClass3_Sub3_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt1818 >= 0) {
			arg0.method2201();
			if (arg0.anInt1830 > 0 && this.aClass3_Sub12ArrayArray1[arg0.anInt1817][arg0.anInt1830] == arg0) {
				this.aClass3_Sub12ArrayArray1[arg0.anInt1817][arg0.anInt1830] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!qe;IZ)V")
	public synchronized void method229(@OriginalArg(0) Class3_Sub19 arg0, @OriginalArg(2) boolean arg1) {
		this.method230();
		this.aClass29_1.method1044(arg0.aByteArray34);
		this.aBoolean26 = arg1;
		this.aLong12 = 0L;
		@Pc(23) int local23 = this.aClass29_1.method1053();
		for (@Pc(31) int local31 = 0; local31 < local23; local31++) {
			this.aClass29_1.method1058(local31);
			this.aClass29_1.method1047(local31);
			this.aClass29_1.method1048(local31);
		}
		this.anInt370 = this.aClass29_1.method1054();
		this.anInt369 = this.aClass29_1.anIntArray153[this.anInt370];
		this.aLong11 = this.aClass29_1.method1046(this.anInt369);
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	public synchronized void method230() {
		this.aClass29_1.method1056();
		this.method236();
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
	private void method231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray49[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(II)V")
	public synchronized void method232(@OriginalArg(0) int arg0) {
		this.anInt365 = arg0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)V")
	private void method233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method216(arg1, 64, arg0);
		if ((this.anIntArray38[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub12 local25 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1965(); local25 != null; local25 = (Class3_Sub12) this.aClass3_Sub3_Sub4_1.aClass65_80.method1954()) {
				if (local25.anInt1817 == arg0 && local25.anInt1818 < 0) {
					this.aClass3_Sub12ArrayArray2[arg0][local25.anInt1836] = null;
					this.aClass3_Sub12ArrayArray2[arg0][arg1] = local25;
					@Pc(64) int local64 = (local25.anInt1834 * local25.anInt1837 >> 12) + local25.anInt1833;
					local25.anInt1837 = 4096;
					local25.anInt1833 += arg1 - local25.anInt1836 << 8;
					local25.anInt1836 = arg1;
					local25.anInt1834 = local64 - local25.anInt1833;
					return;
				}
			}
		}
		@Pc(110) Class3_Sub23 local110 = (Class3_Sub23) this.aClass17_1.method599((long) this.anIntArray37[arg0]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class3_Sub5_Sub1 local118 = local110.aClass3_Sub5_Sub1Array1[arg1];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class3_Sub12 local125 = new Class3_Sub12();
		local125.aClass3_Sub5_Sub1_1 = local118;
		local125.aClass3_Sub23_1 = local110;
		local125.anInt1817 = arg0;
		local125.aClass57_1 = local110.aClass57Array1[arg1];
		local125.anInt1830 = local110.aByteArray40[arg1];
		local125.anInt1836 = arg1;
		local125.anInt1820 = arg2 * arg2 * local110.anInt3076 * local110.aByteArray39[arg1] + 1024 >> 11;
		local125.anInt1838 = local110.aByteArray41[arg1] & 0xFF;
		local125.anInt1833 = (arg1 << 8) - (local110.aShortArray19[arg1] & 0x7FFF);
		local125.anInt1839 = 0;
		local125.anInt1818 = -1;
		local125.anInt1841 = 0;
		local125.anInt1829 = 0;
		local125.anInt1832 = 0;
		if (this.anIntArray44[arg0] == 0) {
			local125.aClass3_Sub3_Sub3_1 = Static139.method1826(local118, this.method217(local125), this.method237(local125), this.method235(local125));
		} else {
			local125.aClass3_Sub3_Sub3_1 = Static139.method1826(local118, this.method217(local125), 0, this.method235(local125));
			this.method234(local110.aShortArray19[arg1] < 0, local125);
		}
		if (local110.aShortArray19[arg1] < 0) {
			local125.aClass3_Sub3_Sub3_1.method1829(-1);
		}
		if (local125.anInt1830 >= 0) {
			@Pc(275) Class3_Sub12 local275 = this.aClass3_Sub12ArrayArray1[arg0][local125.anInt1830];
			if (local275 != null && local275.anInt1818 < 0) {
				this.aClass3_Sub12ArrayArray2[arg0][local275.anInt1836] = null;
				local275.anInt1818 = 0;
			}
			this.aClass3_Sub12ArrayArray1[arg0][local125.anInt1830] = local125;
		}
		this.aClass3_Sub3_Sub4_1.aClass65_80.method1955(local125);
		this.aClass3_Sub12ArrayArray2[arg0][arg1] = local125;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZBLclient!kc;)V")
	public void method234(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub5_Sub1_1.aByteArray23.length;
		@Pc(48) int local48;
		if (arg0 && arg1.aClass3_Sub5_Sub1_1.aBoolean107) {
			@Pc(31) int local31 = local8 + local8 - arg1.aClass3_Sub5_Sub1_1.anInt2122;
			local8 <<= 0x8;
			local48 = (int) ((long) this.anIntArray44[arg1.anInt1817] * (long) local31 >> 6);
			if (local48 >= local8) {
				arg1.aClass3_Sub3_Sub3_1.method1842();
				local48 = local8 + local8 - local48 - 1;
			}
		} else {
			local48 = (int) ((long) this.anIntArray44[arg1.anInt1817] * (long) local8 >> 6);
		}
		arg1.aClass3_Sub3_Sub3_1.method1834(local48);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!kc;B)I")
	private int method235(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(9) int local9 = this.anIntArray47[arg0.anInt1817];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt1838) * (-local9 + 16384) + 32 >> 6) : arg0.anInt1838 * local9 - -32 >> 6;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
	private void method236() {
		this.method224(-1);
		this.method209(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray37[local15] = this.anIntArray42[local15];
		}
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray43[local31] = this.anIntArray42[local31] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!kc;I)I")
	private int method237(@OriginalArg(0) Class3_Sub12 arg0) {
		@Pc(6) Class57 local6 = arg0.aClass57_1;
		@Pc(22) int local22 = this.anIntArray50[arg0.anInt1817] * this.anIntArray48[arg0.anInt1817] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt1820 + 16384 >> 15;
		local22 = this.anInt365 * local39 + 128 >> 8;
		if (local6.anInt2535 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) local6.anInt2535 * (double) arg0.anInt1829 * 1.953125E-5D) + 0.5D);
		}
		@Pc(93) int local93;
		@Pc(90) int local90;
		@Pc(111) int local111;
		@Pc(123) int local123;
		if (local6.aByteArray32 != null) {
			local90 = local6.aByteArray32[arg0.anInt1832 + 1];
			local93 = arg0.anInt1841;
			if (arg0.anInt1832 < local6.aByteArray32.length - 2) {
				local111 = (local6.aByteArray32[arg0.anInt1832] & 0xFF) << 8;
				local123 = (local6.aByteArray32[arg0.anInt1832 + 2] & 0xFF) << 8;
				local90 += (local93 - local111) * (local6.aByteArray32[arg0.anInt1832 + 3] - local90) / (local123 - local111);
			}
			local22 = local90 * local22 + 32 >> 6;
		}
		if (arg0.anInt1818 > 0 && local6.aByteArray31 != null) {
			local93 = arg0.anInt1818;
			local90 = local6.aByteArray31[arg0.anInt1839 + 1];
			if (local6.aByteArray31.length - 2 > arg0.anInt1839) {
				local123 = (local6.aByteArray31[arg0.anInt1839 + 2] & 0xFF) << 8;
				local111 = (local6.aByteArray31[arg0.anInt1839] & 0xFF) << 8;
				local90 += (local93 - local111) * (local6.aByteArray31[arg0.anInt1839 + 3] - local90) / (local123 - local111);
			}
			local22 = local90 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2144() {
		return 0;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "()Lclient!da;")
	@Override
	public synchronized Class3_Sub3 method2147() {
		return null;
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(III)V")
	private void method238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Z")
	public synchronized boolean method239() {
		return this.aClass29_1.method1052();
	}
}
