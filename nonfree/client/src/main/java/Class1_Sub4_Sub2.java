import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!el", name = "Rb", descriptor = "I")
	private int anInt1780;

	@OriginalMember(owner = "client!el", name = "Sb", descriptor = "J")
	private long aLong55;

	@OriginalMember(owner = "client!el", name = "Tb", descriptor = "Z")
	private boolean aBoolean97;

	@OriginalMember(owner = "client!el", name = "Ub", descriptor = "J")
	private long aLong56;

	@OriginalMember(owner = "client!el", name = "Vb", descriptor = "I")
	private int anInt1781;

	@OriginalMember(owner = "client!el", name = "Xb", descriptor = "I")
	private int anInt1782;

	@OriginalMember(owner = "client!el", name = "Yb", descriptor = "Z")
	private boolean aBoolean98;

	@OriginalMember(owner = "client!el", name = "Zb", descriptor = "Lclient!sg;")
	private Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!el", name = "F", descriptor = "[[Lclient!ne;")
	private Class1_Sub19[][] aClass1_Sub19ArrayArray1 = new Class1_Sub19[16][128];

	@OriginalMember(owner = "client!el", name = "P", descriptor = "I")
	private int anInt1747 = 1000000;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "[I")
	private int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!el", name = "W", descriptor = "[I")
	private int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!el", name = "z", descriptor = "[I")
	private int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!el", name = "ib", descriptor = "[I")
	private int[] anIntArray129 = new int[16];

	@OriginalMember(owner = "client!el", name = "lb", descriptor = "[I")
	public int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!el", name = "fb", descriptor = "[I")
	private int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!el", name = "jb", descriptor = "[I")
	public int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!el", name = "y", descriptor = "[I")
	private int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!el", name = "D", descriptor = "[I")
	private int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!el", name = "gb", descriptor = "[I")
	public int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!el", name = "V", descriptor = "[I")
	private int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!el", name = "A", descriptor = "[I")
	private int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!el", name = "Db", descriptor = "[I")
	private int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!el", name = "Ab", descriptor = "[I")
	private int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!el", name = "Ib", descriptor = "I")
	private int anInt1777 = 256;

	@OriginalMember(owner = "client!el", name = "tb", descriptor = "[I")
	private int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!el", name = "Kb", descriptor = "[I")
	private int[] anIntArray136 = new int[16];

	@OriginalMember(owner = "client!el", name = "Qb", descriptor = "[[Lclient!ne;")
	private Class1_Sub19[][] aClass1_Sub19ArrayArray2 = new Class1_Sub19[16][128];

	@OriginalMember(owner = "client!el", name = "O", descriptor = "Lclient!ik;")
	private Class63 aClass63_1 = new Class63();

	@OriginalMember(owner = "client!el", name = "Wb", descriptor = "Lclient!ck;")
	private Class1_Sub4_Sub1 aClass1_Sub4_Sub1_1 = new Class1_Sub4_Sub1(this);

	@OriginalMember(owner = "client!el", name = "S", descriptor = "Lclient!vd;")
	private Class140 aClass140_4 = new Class140(128);

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub2() {
		this.method1236();
		this.method1227(true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V")
	private void method1215(@OriginalArg(1) int arg0) {
		if ((this.anIntArray131[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class1_Sub19 local28 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method30(); local28 != null; local28 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method33()) {
			if (arg0 == local28.anInt3730 && this.aClass1_Sub19ArrayArray2[arg0][local28.anInt3737] == null && local28.anInt3726 < 0) {
				local28.anInt3726 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V")
	public synchronized void method1216() {
		for (@Pc(19) Class1_Sub29 local19 = (Class1_Sub29) this.aClass140_4.method4012(); local19 != null; local19 = (Class1_Sub29) this.aClass140_4.method4013()) {
			local19.method4186();
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZILclient!ne;)V")
	public void method1217(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub7_Sub1_1.aByteArray21.length;
		@Pc(43) int local43;
		if (arg0 && arg1.aClass1_Sub7_Sub1_1.aBoolean88) {
			@Pc(26) int local26 = local8 + local8 - arg1.aClass1_Sub7_Sub1_1.anInt1533;
			local8 <<= 0x8;
			local43 = (int) ((long) local26 * (long) this.anIntArray130[arg1.anInt3730] >> 6);
			if (local8 <= local43) {
				local43 = local8 + local8 - local43 - 1;
				arg1.aClass1_Sub4_Sub3_1.method1410();
			}
		} else {
			local43 = (int) ((long) local8 * (long) this.anIntArray130[arg1.anInt3730] >> 6);
		}
		arg1.aClass1_Sub4_Sub3_1.method1401(local43);
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V")
	public synchronized void method1220() {
		this.method1247(true);
	}

	@OriginalMember(owner = "client!el", name = "f", descriptor = "(I)I")
	public int method1221() {
		return this.anInt1777;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V")
	private void method1222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
	private void method1223() {
		@Pc(8) int local8 = this.anInt1780;
		@Pc(11) int local11 = this.anInt1781;
		@Pc(22) long local22 = this.aLong56;
		if (this.aClass1_Sub26_1 != null && this.anInt1782 == local11) {
			this.method1250(this.aClass1_Sub26_1, this.aBoolean97, this.aBoolean98);
			this.method1223();
			return;
		}
		while (local11 == this.anInt1781) {
			while (local11 == this.aClass63_1.anIntArray206[local8]) {
				this.aClass63_1.method2152(local8);
				@Pc(51) int local51 = this.aClass63_1.method2141(local8);
				if (local51 == 1) {
					this.aClass63_1.method2140();
					this.aClass63_1.method2143(local8);
					if (this.aClass63_1.method2149()) {
						if (this.aClass1_Sub26_1 != null) {
							this.method1231(this.aBoolean97, this.aClass1_Sub26_1);
							this.method1223();
							return;
						}
						if (!this.aBoolean97 || local11 == 0) {
							this.method1227(true);
							this.aClass63_1.method2150();
							return;
						}
						this.aClass63_1.method2153(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method1225(local51);
				}
				this.aClass63_1.method2146(local8);
				this.aClass63_1.method2143(local8);
			}
			local8 = this.aClass63_1.method2147();
			local11 = this.aClass63_1.anIntArray206[local8];
			local22 = this.aClass63_1.method2139(local11);
		}
		this.anInt1781 = local11;
		this.anInt1780 = local8;
		this.aLong56 = local22;
		if (this.aClass1_Sub26_1 != null && local11 > this.anInt1782) {
			this.anInt1781 = this.anInt1782;
			this.anInt1780 = -1;
			this.aLong56 = this.aClass63_1.method2139(this.anInt1781);
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V")
	private void method1224(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1_Sub19 local14 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method30(); local14 != null; local14 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method33()) {
			if (arg0 < 0 || arg0 == local14.anInt3730) {
				if (local14.aClass1_Sub4_Sub3_1 != null) {
					local14.aClass1_Sub4_Sub3_1.method1386(Static107.anInt2862 / 100);
					if (local14.aClass1_Sub4_Sub3_1.method1413()) {
						this.aClass1_Sub4_Sub1_1.aClass1_Sub4_Sub4_2.method3080(local14.aClass1_Sub4_Sub3_1);
					}
					local14.method2773();
				}
				if (local14.anInt3726 < 0) {
					this.aClass1_Sub19ArrayArray2[local14.anInt3730][local14.anInt3737] = null;
				}
				local14.method4186();
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(II)V")
	private void method1225(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(28) int local28;
		if (local9 == 128) {
			local18 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method1238(local22, local18, local28);
		} else if (local9 == 144) {
			local18 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method1237(local18, local22, local28);
			} else {
				this.method1238(local22, local18, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method1222(local28, local22, local18);
		} else if (local9 == 176) {
			local18 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			if (local18 == 0) {
				this.anIntArray120[local22] = (local28 << 14) + (this.anIntArray120[local22] & 0xFFE03FFF);
			}
			if (local18 == 32) {
				this.anIntArray120[local22] = (local28 << 7) + (this.anIntArray120[local22] & 0xFFFFC07F);
			}
			if (local18 == 1) {
				this.anIntArray129[local22] = (local28 << 7) + (this.anIntArray129[local22] & 0xFFFFC07F);
			}
			if (local18 == 33) {
				this.anIntArray129[local22] = (this.anIntArray129[local22] & 0xFFFFFF80) + local28;
			}
			if (local18 == 5) {
				this.anIntArray134[local22] = (local28 << 7) + (this.anIntArray134[local22] & 0xFFFFC07F);
			}
			if (local18 == 37) {
				this.anIntArray134[local22] = local28 + (this.anIntArray134[local22] & 0xFFFFFF80);
			}
			if (local18 == 7) {
				this.anIntArray123[local22] = (this.anIntArray123[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 39) {
				this.anIntArray123[local22] = (this.anIntArray123[local22] & 0xFFFFFF80) + local28;
			}
			if (local18 == 10) {
				this.anIntArray127[local22] = (this.anIntArray127[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 42) {
				this.anIntArray127[local22] = (this.anIntArray127[local22] & 0xFFFFFF80) + local28;
			}
			if (local18 == 11) {
				this.anIntArray133[local22] = (this.anIntArray133[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 43) {
				this.anIntArray133[local22] = local28 + (this.anIntArray133[local22] & 0xFFFFFF80);
			}
			if (local18 == 64) {
				if (local28 >= 64) {
					this.anIntArray131[local22] |= 0x1;
				} else {
					this.anIntArray131[local22] &= 0xFFFFFFFE;
				}
			}
			if (local18 == 65) {
				if (local28 >= 64) {
					this.anIntArray131[local22] |= 0x2;
				} else {
					this.method1215(local22);
					this.anIntArray131[local22] &= 0xFFFFFFFD;
				}
			}
			if (local18 == 99) {
				this.anIntArray124[local22] = (this.anIntArray124[local22] & 0x7F) + (local28 << 7);
			}
			if (local18 == 98) {
				this.anIntArray124[local22] = (this.anIntArray124[local22] & 0x3F80) + local28;
			}
			if (local18 == 101) {
				this.anIntArray124[local22] = (this.anIntArray124[local22] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local18 == 100) {
				this.anIntArray124[local22] = (this.anIntArray124[local22] & 0x3F80) + local28 + 16384;
			}
			if (local18 == 120) {
				this.method1224(local22);
			}
			if (local18 == 121) {
				this.method1242(local22);
			}
			if (local18 == 123) {
				this.method1243(local22);
			}
			@Pc(497) int local497;
			if (local18 == 6) {
				local497 = this.anIntArray124[local22];
				if (local497 == 16384) {
					this.anIntArray122[local22] = (this.anIntArray122[local22] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local18 == 38) {
				local497 = this.anIntArray124[local22];
				if (local497 == 16384) {
					this.anIntArray122[local22] = (this.anIntArray122[local22] & 0xFFFFFF80) + local28;
				}
			}
			if (local18 == 16) {
				this.anIntArray130[local22] = (this.anIntArray130[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 48) {
				this.anIntArray130[local22] = local28 + (this.anIntArray130[local22] & 0xFFFFFF80);
			}
			if (local18 == 81) {
				if (local28 >= 64) {
					this.anIntArray131[local22] |= 0x4;
				} else {
					this.method1253(local22);
					this.anIntArray131[local22] &= 0xFFFFFFFB;
				}
			}
			if (local18 == 17) {
				this.method1240(local22, (this.anIntArray132[local22] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local18 == 49) {
				this.method1240(local22, local28 + (this.anIntArray132[local22] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			this.method1233(this.anIntArray120[local22] + local18, local22);
		} else if (local9 == 208) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			this.method1234(local22, local18);
		} else if (local9 == 224) {
			local22 = arg0 & 0xF;
			local18 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1244(local22, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1227(true);
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V")
	private void method1226() {
		this.anIntArray126[9] = 128;
		this.anIntArray120[9] = 128;
		this.method1233(128, 9);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZB)V")
	private void method1227(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1224(-1);
		} else {
			this.method1243(-1);
		}
		this.method1242(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray125[local23] = this.anIntArray126[local23];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray120[local49] = this.anIntArray126[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZ)V")
	public synchronized void method1228() {
		this.method1226();
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V")
	@Override
	public synchronized void method3074(@OriginalArg(0) int arg0) {
		if (this.aClass63_1.method2145()) {
			@Pc(18) int local18 = this.aClass63_1.anInt2798 * this.anInt1747 / Static107.anInt2862;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong55;
				if (this.aLong56 - local27 >= 0L) {
					this.aLong55 = local27;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local18 + this.aLong56 - this.aLong55 - 1L) / (long) local18);
				arg0 -= local54;
				this.aLong55 += (long) local54 * (long) local18;
				this.aClass1_Sub4_Sub1_1.method3074(local54);
				this.method1223();
			} while (this.aClass63_1.method2145());
		}
		this.aClass1_Sub4_Sub1_1.method3074(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!sg;Lclient!wg;Lclient!hc;I)Z")
	public synchronized boolean method1230(@OriginalArg(1) Class1_Sub26 arg0, @OriginalArg(2) Class149 arg1, @OriginalArg(3) Class51 arg2) {
		arg0.method3544();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub14 local34 = (Class1_Sub14) arg0.aClass140_14.method4012(); local34 != null; local34 = (Class1_Sub14) arg0.aClass140_14.method4013()) {
			@Pc(40) int local40 = (int) local34.aLong184;
			@Pc(48) Class1_Sub29 local48 = (Class1_Sub29) this.aClass140_4.method4014((long) local40);
			if (local48 == null) {
				local48 = Static247.method4021(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass140_4.method4011(local48, (long) local40);
			}
			if (!local48.method3927(local34.aByteArray30, arg1, local28)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method3546();
		}
		return local9;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLclient!sg;I)V")
	public synchronized void method1231(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub26 arg1) {
		this.method1250(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3072(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass63_1.method2145()) {
			@Pc(18) int local18 = this.aClass63_1.anInt2798 * this.anInt1747 / Static107.anInt2862;
			do {
				@Pc(28) long local28 = this.aLong55 + (long) arg2 * (long) local18;
				if (this.aLong56 - local28 >= 0L) {
					this.aLong55 = local28;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong56 + (long) local18 - this.aLong55 - 1L) / (long) local18);
				arg2 -= local57;
				this.aLong55 += (long) local57 * (long) local18;
				this.aClass1_Sub4_Sub1_1.method3072(arg0, arg1, local57);
				arg1 += local57;
				this.method1223();
			} while (this.aClass63_1.method2145());
		}
		this.aClass1_Sub4_Sub1_1.method3072(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ne;)I")
	private int method1232(@OriginalArg(1) Class1_Sub19 arg0) {
		@Pc(14) int local14 = this.anIntArray127[arg0.anInt3730];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt3725 + 128) + 32 >> 6) : local14 * arg0.anInt3725 + 32 >> 6;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "()Lclient!ta;")
	@Override
	public synchronized Class1_Sub4 method3073() {
		return this.aClass1_Sub4_Sub1_1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)V")
	private void method1233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray125[arg1] != arg0) {
			this.anIntArray125[arg1] = arg0;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass1_Sub19ArrayArray1[arg1][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)V")
	private void method1234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V")
	private synchronized void method1236() {
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			this.anIntArray136[local18] = 256;
		}
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3076() {
		return 0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(IIII)V")
	private void method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1238(arg1, arg0, 64);
		if ((this.anIntArray131[arg1] & 0x2) != 0) {
			for (@Pc(31) Class1_Sub19 local31 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method32(); local31 != null; local31 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method34()) {
				if (local31.anInt3730 == arg1 && local31.anInt3726 < 0) {
					this.aClass1_Sub19ArrayArray2[arg1][local31.anInt3737] = null;
					this.aClass1_Sub19ArrayArray2[arg1][arg0] = local31;
					@Pc(66) int local66 = (local31.anInt3727 * local31.anInt3739 >> 12) + local31.anInt3724;
					local31.anInt3724 += arg0 - local31.anInt3737 << 8;
					local31.anInt3727 = 4096;
					local31.anInt3739 = local66 - local31.anInt3724;
					local31.anInt3737 = arg0;
					return;
				}
			}
		}
		@Pc(112) Class1_Sub29 local112 = (Class1_Sub29) this.aClass140_4.method4014((long) this.anIntArray125[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class1_Sub7_Sub1 local120 = local112.aClass1_Sub7_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class1_Sub19 local127 = new Class1_Sub19();
		local127.aClass1_Sub7_Sub1_1 = local120;
		local127.anInt3730 = arg1;
		local127.aClass1_Sub29_1 = local112;
		local127.aClass38_1 = local112.aClass38Array1[arg0];
		local127.anInt3731 = local112.aByteArray60[arg0];
		local127.anInt3737 = arg0;
		local127.anInt3740 = local112.aByteArray61[arg0] * arg2 * arg2 * local112.anInt5139 + 1024 >> 11;
		local127.anInt3725 = local112.aByteArray62[arg0] & 0xFF;
		local127.anInt3724 = (arg0 << 8) - (local112.aShortArray67[arg0] & 0x7FFF);
		local127.anInt3734 = 0;
		local127.anInt3738 = 0;
		local127.anInt3733 = 0;
		local127.anInt3726 = -1;
		local127.anInt3729 = 0;
		if (this.anIntArray130[arg1] == 0) {
			local127.aClass1_Sub4_Sub3_1 = Static269.method1420(local120, this.method1248(local127), this.method1251(local127), this.method1232(local127));
		} else {
			local127.aClass1_Sub4_Sub3_1 = Static269.method1420(local120, this.method1248(local127), 0, this.method1232(local127));
			this.method1217(local112.aShortArray67[arg0] < 0, local127);
		}
		if (local112.aShortArray67[arg0] < 0) {
			local127.aClass1_Sub4_Sub3_1.method1422(-1);
		}
		if (local127.anInt3731 >= 0) {
			@Pc(283) Class1_Sub19 local283 = this.aClass1_Sub19ArrayArray1[arg1][local127.anInt3731];
			if (local283 != null && local283.anInt3726 < 0) {
				this.aClass1_Sub19ArrayArray2[arg1][local283.anInt3737] = null;
				local283.anInt3726 = 0;
			}
			this.aClass1_Sub19ArrayArray1[arg1][local127.anInt3731] = local127;
		}
		this.aClass1_Sub4_Sub1_1.aClass3_7.method28(local127);
		this.aClass1_Sub19ArrayArray2[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZI)V")
	private void method1238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub19 local16 = this.aClass1_Sub19ArrayArray2[arg0][arg1];
		if (local16 == null) {
			return;
		}
		this.aClass1_Sub19ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray131[arg0] & 0x2) == 0) {
			local16.anInt3726 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub19 local47 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method30(); local47 != null; local47 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method33()) {
			if (local16.anInt3730 == local47.anInt3730 && local47.anInt3726 < 0 && local47 != local16) {
				local16.anInt3726 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZI)V")
	public synchronized void method1239(@OriginalArg(1) int arg0) {
		this.anInt1777 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(III)V")
	private void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray132[arg0] = arg1;
		this.anIntArray128[arg0] = (int) (Math.pow((double) 2, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()Lclient!ta;")
	@Override
	public synchronized Class1_Sub4 method3075() {
		return null;
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(B)Z")
	public synchronized boolean method1241() {
		return this.aClass63_1.method2145();
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(II)V")
	private void method1242(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1242(local9);
			}
			return;
		}
		this.anIntArray123[arg0] = 12800;
		this.anIntArray127[arg0] = 8192;
		this.anIntArray133[arg0] = 16383;
		this.anIntArray121[arg0] = 8192;
		this.anIntArray129[arg0] = 0;
		this.anIntArray134[arg0] = 8192;
		this.method1215(arg0);
		this.method1253(arg0);
		this.anIntArray131[arg0] = 0;
		this.anIntArray124[arg0] = 32767;
		this.anIntArray122[arg0] = 256;
		this.anIntArray130[arg0] = 0;
		this.method1240(arg0, 8192);
	}

	@OriginalMember(owner = "client!el", name = "e", descriptor = "(II)V")
	private void method1243(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub19 local8 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method30(); local8 != null; local8 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method33()) {
			if ((arg0 < 0 || local8.anInt3730 == arg0) && local8.anInt3726 < 0) {
				this.aClass1_Sub19ArrayArray2[local8.anInt3730][local8.anInt3737] = null;
				local8.anInt3726 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "d", descriptor = "(III)V")
	private void method1244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray121[arg0] = arg1;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(ILclient!ne;)Z")
	public boolean method1245(@OriginalArg(1) Class1_Sub19 arg0) {
		if (arg0.aClass1_Sub4_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt3726 >= 0) {
			arg0.method4186();
			if (arg0.anInt3731 > 0 && arg0 == this.aClass1_Sub19ArrayArray1[arg0.anInt3730][arg0.anInt3731]) {
				this.aClass1_Sub19ArrayArray1[arg0.anInt3730][arg0.anInt3731] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ILclient!ne;I[II)Z")
	public boolean method1246(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt3728 = Static107.anInt2862 / 100;
		if (arg1.anInt3726 >= 0 && (arg1.aClass1_Sub4_Sub3_1 == null || arg1.aClass1_Sub4_Sub3_1.method1409())) {
			arg1.method2773();
			arg1.method4186();
			if (arg1.anInt3731 > 0 && this.aClass1_Sub19ArrayArray1[arg1.anInt3730][arg1.anInt3731] == arg1) {
				this.aClass1_Sub19ArrayArray1[arg1.anInt3730][arg1.anInt3731] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg1.anInt3727;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray134[arg1.anInt3730] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg1.anInt3727 = local58;
		}
		arg1.aClass1_Sub4_Sub3_1.method1402(this.method1248(arg1));
		@Pc(101) Class38 local101 = arg1.aClass38_1;
		@Pc(120) double local120 = (double) ((arg1.anInt3737 - 60 << 8) + (arg1.anInt3739 * arg1.anInt3727 >> 12)) * 5.086263020833333E-6D;
		arg1.anInt3741++;
		@Pc(128) boolean local128 = false;
		arg1.anInt3723 += local101.anInt1540;
		if (local101.anInt1544 > 0) {
			if (local101.anInt1539 <= 0) {
				arg1.anInt3733 += 128;
			} else {
				arg1.anInt3733 += (int) (Math.pow(2.0D, (double) local101.anInt1539 * local120) * 128.0D + 0.5D);
			}
			if (arg1.anInt3733 * local101.anInt1544 >= 819200) {
				local128 = true;
			}
		}
		if (local101.aByteArray23 != null) {
			if (local101.anInt1537 <= 0) {
				arg1.anInt3738 += 128;
			} else {
				arg1.anInt3738 += (int) (Math.pow(2.0D, local120 * (double) local101.anInt1537) * 128.0D + 0.5D);
			}
			while (local101.aByteArray23.length - 2 > arg1.anInt3734 && (local101.aByteArray23[arg1.anInt3734 + 2] & 0xFF) << 8 < arg1.anInt3738) {
				arg1.anInt3734 += 2;
			}
			if (local101.aByteArray23.length - 2 == arg1.anInt3734 && local101.aByteArray23[arg1.anInt3734 + 1] == 0) {
				local128 = true;
			}
		}
		if (arg1.anInt3726 >= 0 && local101.aByteArray22 != null && (this.anIntArray131[arg1.anInt3730] & 0x1) == 0 && (arg1.anInt3731 < 0 || this.aClass1_Sub19ArrayArray1[arg1.anInt3730][arg1.anInt3731] != arg1)) {
			if (local101.anInt1536 <= 0) {
				arg1.anInt3726 += 128;
			} else {
				arg1.anInt3726 += (int) (Math.pow(2.0D, local120 * (double) local101.anInt1536) * 128.0D + 0.5D);
			}
			while (local101.aByteArray22.length - 2 > arg1.anInt3729 && (local101.aByteArray22[arg1.anInt3729 + 2] & 0xFF) << 8 < arg1.anInt3726) {
				arg1.anInt3729 += 2;
			}
			if (local101.aByteArray22.length - 2 == arg1.anInt3729) {
				local128 = true;
			}
		}
		if (!local128) {
			arg1.aClass1_Sub4_Sub3_1.method1423(arg1.anInt3728, this.method1251(arg1), this.method1232(arg1));
			return false;
		}
		arg1.aClass1_Sub4_Sub3_1.method1386(arg1.anInt3728);
		if (arg2 == null) {
			arg1.aClass1_Sub4_Sub3_1.method3074(arg0);
		} else {
			arg1.aClass1_Sub4_Sub3_1.method3072(arg2, arg3, arg0);
		}
		if (arg1.aClass1_Sub4_Sub3_1.method1413()) {
			this.aClass1_Sub4_Sub1_1.aClass1_Sub4_Sub4_2.method3080(arg1.aClass1_Sub4_Sub3_1);
		}
		arg1.method2773();
		if (arg1.anInt3726 >= 0) {
			arg1.method4186();
			if (arg1.anInt3731 > 0 && this.aClass1_Sub19ArrayArray1[arg1.anInt3730][arg1.anInt3731] == arg1) {
				this.aClass1_Sub19ArrayArray1[arg1.anInt3730][arg1.anInt3731] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(ZI)V")
	private synchronized void method1247(@OriginalArg(0) boolean arg0) {
		this.aClass63_1.method2150();
		this.aClass1_Sub26_1 = null;
		this.method1227(arg0);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ne;Z)I")
	private int method1248(@OriginalArg(0) Class1_Sub19 arg0) {
		@Pc(14) int local14 = (arg0.anInt3727 * arg0.anInt3739 >> 12) + arg0.anInt3724;
		local14 += (this.anIntArray121[arg0.anInt3730] - 8192) * this.anIntArray122[arg0.anInt3730] >> 12;
		@Pc(41) Class38 local41 = arg0.aClass38_1;
		@Pc(69) int local69;
		if (local41.anInt1540 > 0 && (local41.anInt1541 > 0 || this.anIntArray129[arg0.anInt3730] > 0)) {
			@Pc(64) int local64 = local41.anInt1545 << 1;
			local69 = local41.anInt1541 << 2;
			if (arg0.anInt3741 < local64) {
				local69 = arg0.anInt3741 * local69 / local64;
			}
			local69 += this.anIntArray129[arg0.anInt3730] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt3723 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local103 * (double) local69);
		}
		local69 = (int) ((double) (arg0.aClass1_Sub7_Sub1_1.anInt1534 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static107.anInt2862 + 0.5D);
		return local69 >= 1 ? local69 : 1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!sg;ZIZ)V")
	private synchronized void method1250(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method1247(arg2);
		this.aClass63_1.method2138(arg0.aByteArray53);
		this.aBoolean97 = arg1;
		this.aLong55 = 0L;
		@Pc(24) int local24 = this.aClass63_1.method2148();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass63_1.method2152(local26);
			this.aClass63_1.method2146(local26);
			this.aClass63_1.method2143(local26);
		}
		this.anInt1780 = this.aClass63_1.method2147();
		this.anInt1781 = this.aClass63_1.anIntArray206[this.anInt1780];
		this.aLong56 = this.aClass63_1.method2139(this.anInt1781);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Lclient!ne;I)I")
	private int method1251(@OriginalArg(0) Class1_Sub19 arg0) {
		if (this.anIntArray136[arg0.anInt3730] == 0) {
			return 0;
		}
		@Pc(14) Class38 local14 = arg0.aClass38_1;
		@Pc(35) int local35 = this.anIntArray133[arg0.anInt3730] * this.anIntArray123[arg0.anInt3730] + 4096 >> 13;
		@Pc(43) int local43 = local35 * local35 + 16384 >> 15;
		@Pc(52) int local52 = arg0.anInt3740 * local43 + 16384 >> 15;
		@Pc(61) int local61 = this.anInt1777 * local52 + 128 >> 8;
		local35 = this.anIntArray136[arg0.anInt3730] * local61 + 128 >> 8;
		if (local14.anInt1544 > 0) {
			local35 = (int) ((double) local35 * Math.pow(0.5D, (double) arg0.anInt3733 * 1.953125E-5D * (double) local14.anInt1544) + 0.5D);
		}
		@Pc(108) int local108;
		@Pc(105) int local105;
		@Pc(126) int local126;
		@Pc(138) int local138;
		if (local14.aByteArray23 != null) {
			local105 = local14.aByteArray23[arg0.anInt3734 + 1];
			local108 = arg0.anInt3738;
			if (arg0.anInt3734 < local14.aByteArray23.length - 2) {
				local126 = (local14.aByteArray23[arg0.anInt3734] & 0xFF) << 8;
				local138 = (local14.aByteArray23[arg0.anInt3734 + 2] & 0xFF) << 8;
				local105 += (local14.aByteArray23[arg0.anInt3734 + 3] - local105) * (local108 - local126) / (local138 - local126);
			}
			local35 = local35 * local105 + 32 >> 6;
		}
		if (arg0.anInt3726 > 0 && local14.aByteArray22 != null) {
			local108 = arg0.anInt3726;
			local105 = local14.aByteArray22[arg0.anInt3729 + 1];
			if (arg0.anInt3729 < local14.aByteArray22.length - 2) {
				local138 = (local14.aByteArray22[arg0.anInt3729 + 2] & 0xFF) << 8;
				local126 = (local14.aByteArray22[arg0.anInt3729] & 0xFF) << 8;
				local105 += (local14.aByteArray22[arg0.anInt3729 + 3] - local105) * (local108 + -local126) / (local138 - local126);
			}
			local35 = local35 * local105 + 32 >> 6;
		}
		return local35;
	}

	@OriginalMember(owner = "client!el", name = "i", descriptor = "(I)V")
	public synchronized void method1252() {
		for (@Pc(11) Class1_Sub29 local11 = (Class1_Sub29) this.aClass140_4.method4012(); local11 != null; local11 = (Class1_Sub29) this.aClass140_4.method4013()) {
			local11.method3925();
		}
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(BI)V")
	private void method1253(@OriginalArg(1) int arg0) {
		if ((this.anIntArray131[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub19 local22 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method30(); local22 != null; local22 = (Class1_Sub19) this.aClass1_Sub4_Sub1_1.aClass3_7.method33()) {
			if (arg0 == local22.anInt3730) {
				local22.anInt3732 = 0;
			}
		}
	}
}
