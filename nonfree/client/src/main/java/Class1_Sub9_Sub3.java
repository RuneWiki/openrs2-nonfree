import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class1_Sub9_Sub3 extends Class1_Sub9 {

	@OriginalMember(owner = "client!ri", name = "Nb", descriptor = "I")
	private int anInt5770;

	@OriginalMember(owner = "client!ri", name = "Pb", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!ri", name = "Qb", descriptor = "Z")
	private boolean aBoolean516;

	@OriginalMember(owner = "client!ri", name = "Rb", descriptor = "J")
	private long aLong190;

	@OriginalMember(owner = "client!ri", name = "Sb", descriptor = "J")
	private long aLong191;

	@OriginalMember(owner = "client!ri", name = "Ub", descriptor = "I")
	private int anInt5772;

	@OriginalMember(owner = "client!ri", name = "Vb", descriptor = "Lclient!fo;")
	private Class1_Sub14 aClass1_Sub14_2;

	@OriginalMember(owner = "client!ri", name = "Wb", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private int anInt5727 = 256;

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "[I")
	private final int[] anIntArray425 = new int[16];

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
	private final int[] anIntArray424 = new int[16];

	@OriginalMember(owner = "client!ri", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!ri", name = "cb", descriptor = "[I")
	private final int[] anIntArray428 = new int[16];

	@OriginalMember(owner = "client!ri", name = "jb", descriptor = "[I")
	private final int[] anIntArray429 = new int[16];

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[I")
	private final int[] anIntArray423 = new int[16];

	@OriginalMember(owner = "client!ri", name = "qb", descriptor = "I")
	private final int anInt5756 = 1000000;

	@OriginalMember(owner = "client!ri", name = "ob", descriptor = "[I")
	private final int[] anIntArray430 = new int[16];

	@OriginalMember(owner = "client!ri", name = "pb", descriptor = "[I")
	public final int[] anIntArray431 = new int[16];

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "[I")
	private final int[] anIntArray422 = new int[16];

	@OriginalMember(owner = "client!ri", name = "xb", descriptor = "[I")
	private final int[] anIntArray432 = new int[16];

	@OriginalMember(owner = "client!ri", name = "wb", descriptor = "[[Lclient!ss;")
	private final Class1_Sub43[][] aClass1_Sub43ArrayArray1 = new Class1_Sub43[16][128];

	@OriginalMember(owner = "client!ri", name = "N", descriptor = "[I")
	public final int[] anIntArray427 = new int[16];

	@OriginalMember(owner = "client!ri", name = "Eb", descriptor = "[I")
	private final int[] anIntArray434 = new int[16];

	@OriginalMember(owner = "client!ri", name = "Ib", descriptor = "[I")
	private final int[] anIntArray435 = new int[16];

	@OriginalMember(owner = "client!ri", name = "Gb", descriptor = "[[Lclient!ss;")
	private final Class1_Sub43[][] aClass1_Sub43ArrayArray2 = new Class1_Sub43[16][128];

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "[I")
	private final int[] anIntArray426 = new int[16];

	@OriginalMember(owner = "client!ri", name = "Jb", descriptor = "[I")
	public final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!ri", name = "Lb", descriptor = "[I")
	private final int[] anIntArray437 = new int[16];

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "Lclient!gd;")
	private final Class91 aClass91_1 = new Class91();

	@OriginalMember(owner = "client!ri", name = "Tb", descriptor = "Lclient!ps;")
	private final Class1_Sub9_Sub2 aClass1_Sub9_Sub2_1 = new Class1_Sub9_Sub2(this);

	@OriginalMember(owner = "client!ri", name = "rb", descriptor = "Lclient!qi;")
	private final Class208 aClass208_34 = new Class208(128);

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class1_Sub9_Sub3() {
		this.method4665();
		this.method4664(true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)V")
	private void method4628(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4630(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method4630(local18, local24, 64);
			} else {
				this.method4667(local18, local30, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method4661(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray434[local18] = (local30 << 14) + (this.anIntArray434[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray434[local18] = (local30 << 7) + (this.anIntArray434[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray424[local18] = (this.anIntArray424[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray424[local18] = (this.anIntArray424[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.lb[local18] = (this.lb[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.lb[local18] = local30 + (this.lb[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray423[local18] = (local30 << 7) + (this.anIntArray423[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray423[local18] = (this.anIntArray423[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray430[local18] = (local30 << 7) + (this.anIntArray430[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray430[local18] = local30 + (this.anIntArray430[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray422[local18] = (local30 << 7) + (this.anIntArray422[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray422[local18] = local30 + (this.anIntArray422[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray431[local18] |= 0x1;
				} else {
					this.anIntArray431[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray431[local18] |= 0x2;
				} else {
					this.method4637(local18);
					this.anIntArray431[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray425[local18] = (local30 << 7) + (this.anIntArray425[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray425[local18] = local30 + (this.anIntArray425[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray425[local18] = (local30 << 7) + (this.anIntArray425[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray425[local18] = local30 + (this.anIntArray425[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method4649(local18);
			}
			if (local24 == 121) {
				this.method4645(local18);
			}
			if (local24 == 123) {
				this.method4639(local18);
			}
			@Pc(493) int local493;
			if (local24 == 6) {
				local493 = this.anIntArray425[local18];
				if (local493 == 16384) {
					this.anIntArray435[local18] = (this.anIntArray435[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local493 = this.anIntArray425[local18];
				if (local493 == 16384) {
					this.anIntArray435[local18] = (this.anIntArray435[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray436[local18] = (this.anIntArray436[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray436[local18] = local30 + (this.anIntArray436[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray431[local18] |= 0x4;
				} else {
					this.method4648(local18);
					this.anIntArray431[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method4634(local18, (this.anIntArray437[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method4634(local18, (this.anIntArray437[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4631(local24 + this.anIntArray434[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method4654(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FDD) >> 8);
			this.method4655(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4664(true);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public synchronized void method4629() {
		this.method4636(true);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZIII)V")
	private void method4630(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub43 local12 = this.aClass1_Sub43ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub43ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray431[arg0] & 0x2) == 0) {
			local12.anInt6163 = 0;
			return;
		}
		for (@Pc(44) Class1_Sub43 local44 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method203(); local44 != null; local44 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method208()) {
			if (local12.anInt6147 == local44.anInt6147 && local44.anInt6163 < 0 && local44 != local12) {
				local12.anInt6163 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIZ)V")
	private void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray432[arg1] != arg0) {
			this.anIntArray432[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass1_Sub43ArrayArray2[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
	public synchronized void method4632() {
		for (@Pc(19) Class1_Sub7 local19 = (Class1_Sub7) this.aClass208_34.method4414(); local19 != null; local19 = (Class1_Sub7) this.aClass208_34.method4410()) {
			local19.method542();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZILclient!fo;)V")
	public synchronized void method4633(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		this.method4656(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	private void method4634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray437[arg0] = arg1;
		this.anIntArray427[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZI)V")
	private synchronized void method4636(@OriginalArg(0) boolean arg0) {
		this.aClass91_1.method1669();
		this.aClass1_Sub14_2 = null;
		this.method4664(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private void method4637(@OriginalArg(1) int arg0) {
		if ((this.anIntArray431[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub43 local18 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method203(); local18 != null; local18 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method208()) {
			if (arg0 == local18.anInt6147 && this.aClass1_Sub43ArrayArray1[arg0][local18.anInt6144] == null && local18.anInt6163 < 0) {
				local18.anInt6163 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)V")
	private void method4639(@OriginalArg(1) int arg0) {
		for (@Pc(19) Class1_Sub43 local19 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method203(); local19 != null; local19 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method208()) {
			if ((arg0 < 0 || arg0 == local19.anInt6147) && local19.anInt6163 < 0) {
				this.aClass1_Sub43ArrayArray1[local19.anInt6147][local19.anInt6144] = null;
				local19.anInt6163 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!dn;Lclient!fo;ILclient!oi;)Z")
	public synchronized boolean method4640(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(4) Class185 arg2) {
		arg1.method1505();
		@Pc(15) boolean local15 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class1_Sub45 local32 = (Class1_Sub45) arg1.aClass208_9.method4414(); local32 != null; local32 = (Class1_Sub45) arg1.aClass208_9.method4410()) {
			@Pc(38) int local38 = (int) local32.aLong236;
			@Pc(46) Class1_Sub7 local46 = (Class1_Sub7) this.aClass208_34.method4405((long) local38);
			if (local46 == null) {
				local46 = Static240.method3459(arg2, local38);
				if (local46 == null) {
					local15 = false;
					continue;
				}
				this.aClass208_34.method4413((long) local38, local46);
			}
			if (!local46.method544(arg0, local26, local32.aByteArray91)) {
				local15 = false;
			}
		}
		if (local15) {
			arg1.method1506();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(III)V")
	private void method4641() {
		this.anIntArray429[9] = 128;
		this.anIntArray434[9] = 128;
		this.method4631(128, 9);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)V")
	public synchronized void method4642(@OriginalArg(1) int arg0) {
		this.anInt5727 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!ss;)Z")
	public boolean method4643(@OriginalArg(1) Class1_Sub43 arg0) {
		if (arg0.aClass1_Sub9_Sub4_4 != null) {
			return false;
		}
		if (arg0.anInt6163 >= 0) {
			arg0.method5953();
			if (arg0.anInt6156 > 0 && arg0 == this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156]) {
				this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
	private void method4644() {
		@Pc(8) int local8 = this.anInt5771;
		@Pc(11) int local11 = this.anInt5770;
		@Pc(14) long local14 = this.aLong190;
		if (this.aClass1_Sub14_2 != null && this.anInt5772 == local11) {
			this.method4656(this.aBoolean517, this.aBoolean516, this.aClass1_Sub14_2);
			this.method4644();
			return;
		}
		while (local11 == this.anInt5770) {
			while (local11 == this.aClass91_1.anIntArray175[local8]) {
				this.aClass91_1.method1676(local8);
				@Pc(47) int local47 = this.aClass91_1.method1661(local8);
				if (local47 == 1) {
					this.aClass91_1.method1675();
					this.aClass91_1.method1673(local8);
					if (this.aClass91_1.method1670()) {
						if (this.aClass1_Sub14_2 != null) {
							this.method4633(this.aBoolean516, this.aClass1_Sub14_2);
							this.method4644();
							return;
						}
						if (!this.aBoolean516 || local11 == 0) {
							this.method4664(true);
							this.aClass91_1.method1669();
							return;
						}
						this.aClass91_1.method1662(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method4628(local47);
				}
				this.aClass91_1.method1668(local8);
				this.aClass91_1.method1673(local8);
			}
			local8 = this.aClass91_1.method1667();
			local11 = this.aClass91_1.anIntArray175[local8];
			local14 = this.aClass91_1.method1666(local11);
		}
		this.anInt5770 = local11;
		this.aLong190 = local14;
		this.anInt5771 = local8;
		if (this.aClass1_Sub14_2 != null && local11 > this.anInt5772) {
			this.anInt5770 = this.anInt5772;
			this.anInt5771 = -1;
			this.aLong190 = this.aClass91_1.method1666(this.anInt5770);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V")
	private void method4645(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method4645(local9);
			}
			return;
		}
		this.anIntArray423[arg0] = 12800;
		this.anIntArray430[arg0] = 8192;
		this.anIntArray422[arg0] = 16383;
		this.anIntArray426[arg0] = 8192;
		this.anIntArray424[arg0] = 0;
		this.lb[arg0] = 8192;
		this.method4637(arg0);
		this.method4648(arg0);
		this.anIntArray431[arg0] = 0;
		this.anIntArray425[arg0] = 32767;
		this.anIntArray435[arg0] = 256;
		this.anIntArray436[arg0] = 0;
		this.method4634(arg0, 8192);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLclient!ss;)I")
	private int method4646(@OriginalArg(1) Class1_Sub43 arg0) {
		@Pc(15) int local15 = arg0.anInt6151 + (arg0.anInt6153 * arg0.anInt6145 >> 12);
		local15 += (this.anIntArray426[arg0.anInt6147] - 8192) * this.anIntArray435[arg0.anInt6147] >> 12;
		@Pc(36) Class221 local36 = arg0.aClass221_1;
		@Pc(62) int local62;
		if (local36.anInt5829 > 0 && (local36.anInt5826 > 0 || this.anIntArray424[arg0.anInt6147] > 0)) {
			local62 = local36.anInt5826 << 2;
			@Pc(67) int local67 = local36.anInt5827 << 1;
			if (local67 > arg0.anInt6152) {
				local62 = arg0.anInt6152 * local62 / local67;
			}
			local62 += this.anIntArray424[arg0.anInt6147] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt6161 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local97 * (double) local62);
		}
		local62 = (int) ((double) (arg0.aClass1_Sub8_Sub1_2.anInt755 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static234.anInt4244 + 0.5D);
		return local62 < 1 ? 1 : local62;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)Z")
	public synchronized boolean method4647() {
		return this.aClass91_1.method1671();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass91_1.method1671()) {
			@Pc(18) int local18 = this.anInt5756 * this.aClass91_1.anInt2051 / Static234.anInt4244;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong191;
				if (this.aLong190 - local27 >= 0L) {
					this.aLong191 = local27;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong190 + (long) local18 - this.aLong191 - 1L) / (long) local18);
				this.aLong191 += (long) local18 * (long) local59;
				this.aClass1_Sub9_Sub2_1.method5012(arg0, arg1, local59);
				arg1 += local59;
				arg2 -= local59;
				this.method4644();
			} while (this.aClass91_1.method1671());
		}
		this.aClass1_Sub9_Sub2_1.method5012(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)V")
	private void method4648(@OriginalArg(1) int arg0) {
		if ((this.anIntArray431[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class1_Sub43 local25 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method203(); local25 != null; local25 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method208()) {
			if (local25.anInt6147 == arg0) {
				local25.anInt6150 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()Lclient!cv;")
	@Override
	public synchronized Class1_Sub9 method5013() {
		return this.aClass1_Sub9_Sub2_1;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)V")
	private void method4649(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class1_Sub43 local14 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method203(); local14 != null; local14 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method208()) {
			if (arg0 < 0 || local14.anInt6147 == arg0) {
				if (local14.aClass1_Sub9_Sub4_4 != null) {
					local14.aClass1_Sub9_Sub4_4.method5045(Static234.anInt4244 / 100);
					if (local14.aClass1_Sub9_Sub4_4.method5023()) {
						this.aClass1_Sub9_Sub2_1.aClass1_Sub9_Sub1_2.method4260(local14.aClass1_Sub9_Sub4_4);
					}
					local14.method4937();
				}
				if (local14.anInt6163 < 0) {
					this.aClass1_Sub43ArrayArray1[local14.anInt6147][local14.anInt6144] = null;
				}
				local14.method5953();
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4650() {
		this.method4641();
	}

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
	public synchronized void method4652() {
		for (@Pc(18) Class1_Sub7 local18 = (Class1_Sub7) this.aClass208_34.method4414(); local18 != null; local18 = (Class1_Sub7) this.aClass208_34.method4410()) {
			local18.method5953();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ss;IZ)V")
	public void method4653(@OriginalArg(0) Class1_Sub43 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.aClass1_Sub8_Sub1_2.aByteArray12.length;
		@Pc(34) int local34;
		if (arg1 && arg0.aClass1_Sub8_Sub1_2.aBoolean105) {
			@Pc(45) int local45 = local15 + local15 - arg0.aClass1_Sub8_Sub1_2.anInt753;
			local15 <<= 0x8;
			local34 = (int) ((long) local45 * (long) this.anIntArray436[arg0.anInt6147] >> 6);
			if (local15 <= local34) {
				local34 = local15 + local15 - local34 - 1;
				arg0.aClass1_Sub9_Sub4_4.method5031();
			}
		} else {
			local34 = (int) ((long) this.anIntArray436[arg0.anInt6147] * (long) local15 >> 6);
		}
		arg0.aClass1_Sub9_Sub4_4.method5048(local34);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BII)V")
	private void method4654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(III)V")
	private void method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray426[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()Lclient!cv;")
	@Override
	public synchronized Class1_Sub9 method5014() {
		return null;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZILclient!fo;)V")
	private synchronized void method4656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class1_Sub14 arg2) {
		this.method4636(arg0);
		this.aClass91_1.method1665(arg2.aByteArray19);
		this.aLong191 = 0L;
		this.aBoolean516 = arg1;
		@Pc(32) int local32 = this.aClass91_1.method1663();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass91_1.method1676(local34);
			this.aClass91_1.method1668(local34);
			this.aClass91_1.method1673(local34);
		}
		this.anInt5771 = this.aClass91_1.method1667();
		this.anInt5770 = this.aClass91_1.anIntArray175[this.anInt5771];
		this.aLong190 = this.aClass91_1.method1666(this.anInt5770);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLclient!ss;II[I)Z")
	public boolean method4657(@OriginalArg(1) Class1_Sub43 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt6154 = Static234.anInt4244 / 100;
		if (arg0.anInt6163 >= 0 && (arg0.aClass1_Sub9_Sub4_4 == null || arg0.aClass1_Sub9_Sub4_4.method5029())) {
			arg0.method4937();
			arg0.method5953();
			if (arg0.anInt6156 > 0 && arg0 == this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156]) {
				this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt6145;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.lb[arg0.anInt6147] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt6145 = local53;
		}
		arg0.aClass1_Sub9_Sub4_4.method5042(this.method4646(arg0));
		@Pc(93) Class221 local93 = arg0.aClass221_1;
		arg0.anInt6152++;
		arg0.anInt6161 += local93.anInt5829;
		@Pc(108) boolean local108 = false;
		@Pc(126) double local126 = (double) ((arg0.anInt6144 - 60 << 8) + (arg0.anInt6153 * arg0.anInt6145 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt5830 > 0) {
			if (local93.anInt5823 <= 0) {
				arg0.anInt6149 += 128;
			} else {
				arg0.anInt6149 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5823) * 128.0D + 0.5D);
			}
			if (local93.anInt5830 * arg0.anInt6149 >= 819200) {
				local108 = true;
			}
		}
		if (local93.aByteArray82 != null) {
			if (local93.anInt5828 > 0) {
				arg0.anInt6160 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5828) * 128.0D + 0.5D);
			} else {
				arg0.anInt6160 += 128;
			}
			while (arg0.anInt6146 < local93.aByteArray82.length - 2 && arg0.anInt6160 > (local93.aByteArray82[arg0.anInt6146 + 2] & 0xFF) << 8) {
				arg0.anInt6146 += 2;
			}
			if (local93.aByteArray82.length - 2 == arg0.anInt6146 && local93.aByteArray82[arg0.anInt6146 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg0.anInt6163 >= 0 && local93.aByteArray83 != null && (this.anIntArray431[arg0.anInt6147] & 0x1) == 0 && (arg0.anInt6156 < 0 || this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156] != arg0)) {
			if (local93.anInt5825 > 0) {
				arg0.anInt6163 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt5825) * 128.0D + 0.5D);
			} else {
				arg0.anInt6163 += 128;
			}
			while (arg0.anInt6155 < local93.aByteArray83.length - 2 && (local93.aByteArray83[arg0.anInt6155 + 2] & 0xFF) << 8 < arg0.anInt6163) {
				arg0.anInt6155 += 2;
			}
			if (local93.aByteArray83.length - 2 == arg0.anInt6155) {
				local108 = true;
			}
		}
		if (!local108) {
			arg0.aClass1_Sub9_Sub4_4.method5030(arg0.anInt6154, this.method4662(arg0), this.method4666(arg0));
			return false;
		}
		arg0.aClass1_Sub9_Sub4_4.method5045(arg0.anInt6154);
		if (arg3 == null) {
			arg0.aClass1_Sub9_Sub4_4.method5016(arg2);
		} else {
			arg0.aClass1_Sub9_Sub4_4.method5012(arg3, arg1, arg2);
		}
		if (arg0.aClass1_Sub9_Sub4_4.method5023()) {
			this.aClass1_Sub9_Sub2_1.aClass1_Sub9_Sub1_2.method4260(arg0.aClass1_Sub9_Sub4_4);
		}
		arg0.method4937();
		if (arg0.anInt6163 >= 0) {
			arg0.method5953();
			if (arg0.anInt6156 > 0 && this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156] == arg0) {
				this.aClass1_Sub43ArrayArray2[arg0.anInt6147][arg0.anInt6156] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5016(@OriginalArg(0) int arg0) {
		if (this.aClass91_1.method1671()) {
			@Pc(18) int local18 = this.anInt5756 * this.aClass91_1.anInt2051 / Static234.anInt4244;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong191;
				if (this.aLong190 - local27 >= 0L) {
					this.aLong191 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong190 - this.aLong191 - 1L) / (long) local18);
				this.aLong191 += (long) local18 * (long) local58;
				arg0 -= local58;
				this.aClass1_Sub9_Sub2_1.method5016(local58);
				this.method4644();
			} while (this.aClass91_1.method1671());
		}
		this.aClass1_Sub9_Sub2_1.method5016(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)V")
	private void method4661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ss;I)I")
	private int method4662(@OriginalArg(0) Class1_Sub43 arg0) {
		if (this.anIntArray428[arg0.anInt6147] == 0) {
			return 0;
		}
		@Pc(23) Class221 local23 = arg0.aClass221_1;
		@Pc(39) int local39 = this.anIntArray422[arg0.anInt6147] * this.anIntArray423[arg0.anInt6147] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt6162 * local47 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt5727 * local56 + 128 >> 8;
		local39 = this.anIntArray428[arg0.anInt6147] * local65 + 128 >> 8;
		if (local23.anInt5830 > 0) {
			local39 = (int) ((double) local39 * Math.pow(0.5D, (double) local23.anInt5830 * (double) arg0.anInt6149 * 1.953125E-5D) + 0.5D);
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(137) int local137;
		@Pc(149) int local149;
		if (local23.aByteArray82 != null) {
			local107 = arg0.anInt6160;
			local115 = local23.aByteArray82[arg0.anInt6146 + 1];
			if (local23.aByteArray82.length - 2 > arg0.anInt6146) {
				local137 = (local23.aByteArray82[arg0.anInt6146] & 0xFF) << 8;
				local149 = (local23.aByteArray82[arg0.anInt6146 + 2] & 0xFF) << 8;
				local115 += (local107 - local137) * (-local115 + local23.aByteArray82[arg0.anInt6146 + 3]) / (local149 - local137);
			}
			local39 = local115 * local39 + 32 >> 6;
		}
		if (arg0.anInt6163 > 0 && local23.aByteArray83 != null) {
			local107 = arg0.anInt6163;
			local115 = local23.aByteArray83[arg0.anInt6155 + 1];
			if (local23.aByteArray83.length - 2 > arg0.anInt6155) {
				local137 = (local23.aByteArray83[arg0.anInt6155] & 0xFF) << 8;
				local149 = (local23.aByteArray83[arg0.anInt6155 + 2] & 0xFF) << 8;
				local115 += (local107 - local137) * (local23.aByteArray83[arg0.anInt6155 - -3] + -local115) / (local149 - local137);
			}
			local39 = local115 * local39 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)I")
	public int method4663() {
		return this.anInt5727;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(ZI)V")
	private void method4664(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4649(-1);
		} else {
			this.method4639(-1);
		}
		this.method4645(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray432[local23] = this.anIntArray429[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray434[local41] = this.anIntArray429[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)V")
	private synchronized void method4665() {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			this.anIntArray428[local5] = 256;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ss;B)I")
	private int method4666(@OriginalArg(0) Class1_Sub43 arg0) {
		@Pc(15) int local15 = this.anIntArray430[arg0.anInt6147];
		return local15 < 8192 ? arg0.anInt6157 * local15 + 32 >> 6 : 16384 - ((128 - arg0.anInt6157) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()I")
	@Override
	public synchronized int method5011() {
		return 0;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIII)V")
	private void method4667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method4630(arg0, arg2, 64);
		if ((this.anIntArray431[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub43 local25 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method210(); local25 != null; local25 = (Class1_Sub43) this.aClass1_Sub9_Sub2_1.aClass14_37.method215()) {
				if (local25.anInt6147 == arg0 && local25.anInt6163 < 0) {
					this.aClass1_Sub43ArrayArray1[arg0][local25.anInt6144] = null;
					this.aClass1_Sub43ArrayArray1[arg0][arg2] = local25;
					@Pc(60) int local60 = local25.anInt6151 + (local25.anInt6153 * local25.anInt6145 >> 12);
					local25.anInt6151 += arg2 - local25.anInt6144 << 8;
					local25.anInt6153 = local60 - local25.anInt6151;
					local25.anInt6144 = arg2;
					local25.anInt6145 = 4096;
					return;
				}
			}
		}
		@Pc(105) Class1_Sub7 local105 = (Class1_Sub7) this.aClass208_34.method4405((long) this.anIntArray432[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(117) Class1_Sub8_Sub1 local117 = local105.aClass1_Sub8_Sub1Array1[arg2];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class1_Sub43 local124 = new Class1_Sub43();
		local124.anInt6147 = arg0;
		local124.aClass1_Sub8_Sub1_2 = local117;
		local124.aClass1_Sub7_1 = local105;
		local124.aClass221_1 = local105.aClass221Array1[arg2];
		local124.anInt6156 = local105.aByteArray8[arg2];
		local124.anInt6144 = arg2;
		local124.anInt6162 = arg1 * arg1 * local105.anInt592 * local105.aByteArray9[arg2] + 1024 >> 11;
		local124.anInt6157 = local105.aByteArray7[arg2] & 0xFF;
		local124.anInt6151 = (arg2 << 8) - (local105.aShortArray11[arg2] & 0x7FFF);
		local124.anInt6160 = 0;
		local124.anInt6155 = 0;
		local124.anInt6146 = 0;
		local124.anInt6163 = -1;
		local124.anInt6149 = 0;
		if (this.anIntArray436[arg0] == 0) {
			local124.aClass1_Sub9_Sub4_4 = Static474.method5028(local117, this.method4646(local124), this.method4662(local124), this.method4666(local124));
		} else {
			local124.aClass1_Sub9_Sub4_4 = Static474.method5028(local117, this.method4646(local124), 0, this.method4666(local124));
			this.method4653(local124, local105.aShortArray11[arg2] < 0);
		}
		if (local105.aShortArray11[arg2] < 0) {
			local124.aClass1_Sub9_Sub4_4.method5040(-1);
		}
		if (local124.anInt6156 >= 0) {
			@Pc(280) Class1_Sub43 local280 = this.aClass1_Sub43ArrayArray2[arg0][local124.anInt6156];
			if (local280 != null && local280.anInt6163 < 0) {
				this.aClass1_Sub43ArrayArray1[arg0][local280.anInt6144] = null;
				local280.anInt6163 = 0;
			}
			this.aClass1_Sub43ArrayArray2[arg0][local124.anInt6156] = local124;
		}
		this.aClass1_Sub9_Sub2_1.aClass14_37.method205(local124);
		this.aClass1_Sub43ArrayArray1[arg0][arg2] = local124;
	}
}
