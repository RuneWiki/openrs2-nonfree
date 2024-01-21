import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class5_Sub11_Sub2 extends Class5_Sub11 {

	@OriginalMember(owner = "client!kd", name = "Pb", descriptor = "Z")
	private boolean aBoolean91;

	@OriginalMember(owner = "client!kd", name = "Qb", descriptor = "I")
	private int anInt2115;

	@OriginalMember(owner = "client!kd", name = "Rb", descriptor = "J")
	private long aLong121;

	@OriginalMember(owner = "client!kd", name = "Sb", descriptor = "J")
	private long aLong122;

	@OriginalMember(owner = "client!kd", name = "Tb", descriptor = "I")
	private int anInt2116;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "[I")
	private final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "I")
	private final int anInt2076 = 1000000;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "[I")
	private final int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "[I")
	private final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "[I")
	private final int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "[I")
	private final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "[[Lclient!ee;")
	private final Class5_Sub8[][] aClass5_Sub8ArrayArray1 = new Class5_Sub8[16][128];

	@OriginalMember(owner = "client!kd", name = "rb", descriptor = "[I")
	private final int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!kd", name = "nb", descriptor = "[I")
	private final int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!kd", name = "wb", descriptor = "[I")
	public final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!kd", name = "pb", descriptor = "[I")
	public final int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Ib", descriptor = "[I")
	private final int[] anIntArray206 = new int[16];

	@OriginalMember(owner = "client!kd", name = "Db", descriptor = "[[Lclient!ee;")
	private final Class5_Sub8[][] aClass5_Sub8ArrayArray2 = new Class5_Sub8[16][128];

	@OriginalMember(owner = "client!kd", name = "Hb", descriptor = "[I")
	private final int[] anIntArray205 = new int[16];

	@OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
	private int anInt2098 = 256;

	@OriginalMember(owner = "client!kd", name = "Eb", descriptor = "[I")
	public final int[] anIntArray204 = new int[16];

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!ti;")
	private final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!kd", name = "Ob", descriptor = "Lclient!oj;")
	private final Class5_Sub11_Sub3 aClass5_Sub11_Sub3_1 = new Class5_Sub11_Sub3(this);

	@OriginalMember(owner = "client!kd", name = "vb", descriptor = "Lclient!oa;")
	private final Class75 aClass75_11 = new Class75(128);

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class5_Sub11_Sub2() {
		this.method1655();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	private void method1629(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local5 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1659(local24, local18, local30);
		} else if (local5 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1659(local24, local18, 64);
			} else {
				this.method1640(local18, local30, local24);
			}
		} else if (local5 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method1650(local18, local30, local24);
		} else if (local5 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray206[local18] = (local30 << 14) + (this.anIntArray206[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray206[local18] = (this.anIntArray206[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray197[local18] = (local30 << 7) + (this.anIntArray197[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray197[local18] = local30 + (this.anIntArray197[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray196[local18] = (this.anIntArray196[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray196[local18] = local30 + (this.anIntArray196[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray202[local18] = (this.anIntArray202[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray202[local18] = local30 + (this.anIntArray202[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray195[local18] = (local30 << 7) + (this.anIntArray195[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray195[local18] = local30 + (this.anIntArray195[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray193[local18] = (this.anIntArray193[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray193[local18] = local30 + (this.anIntArray193[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray203[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray203[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray203[local18] |= 0x2;
				} else {
					this.method1644(local18);
					this.anIntArray203[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray200[local18] = (this.anIntArray200[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray200[local18] = local30 + (this.anIntArray200[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray200[local18] = (this.anIntArray200[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray200[local18] = local30 + (this.anIntArray200[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1635(local18);
			}
			if (local24 == 121) {
				this.method1646(local18);
			}
			if (local24 == 123) {
				this.method1656(local18);
			}
			@Pc(508) int local508;
			if (local24 == 6) {
				local508 = this.anIntArray200[local18];
				if (local508 == 16384) {
					this.anIntArray199[local18] = (local30 << 7) + (this.anIntArray199[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local508 = this.anIntArray200[local18];
				if (local508 == 16384) {
					this.anIntArray199[local18] = local30 + (this.anIntArray199[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray204[local18] = (local30 << 7) + (this.anIntArray204[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray204[local18] = (this.anIntArray204[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray203[local18] |= 0x4;
				} else {
					this.method1648(local18);
					this.anIntArray203[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1634((local30 << 7) + (this.anIntArray198[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method1634(local30 + (this.anIntArray198[local18] & 0xFFFFFF80), local18);
			}
		} else if (local5 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1652(local18, local24 + this.anIntArray206[local18]);
		} else if (local5 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1636(local18, local24);
		} else if (local5 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1631(local18, local24);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method1655();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
	public synchronized void method1630() {
		this.method1638();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V")
	private void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray205[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
	public synchronized void method1632() {
		this.aClass98_1.method2839();
		this.method1655();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass98_1.method2836()) {
			@Pc(18) int local18 = this.anInt2076 * this.aClass98_1.anInt3759 / Static62.anInt1362;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong122;
				if (this.aLong121 - local27 >= 0L) {
					this.aLong122 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong121 - this.aLong122 - 1L) / (long) local18);
				arg2 -= local56;
				this.aLong122 += (long) local56 * (long) local18;
				this.aClass5_Sub11_Sub3_1.method2869(arg0, arg1, local56);
				arg1 += local56;
				this.method1661();
			} while (this.aClass98_1.method2836());
		}
		this.aClass5_Sub11_Sub3_1.method2869(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()Lclient!f;")
	@Override
	public synchronized Class5_Sub11 method2865() {
		return null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I[IILclient!ee;I)Z")
	public boolean method1633(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub8 arg3) {
		arg3.anInt981 = Static62.anInt1362 / 100;
		if (arg3.anInt979 >= 0 && (arg3.aClass5_Sub11_Sub1_1 == null || arg3.aClass5_Sub11_Sub1_1.method1597())) {
			arg3.method831();
			arg3.method3207();
			if (arg3.anInt993 > 0 && this.aClass5_Sub8ArrayArray1[arg3.anInt983][arg3.anInt993] == arg3) {
				this.aClass5_Sub8ArrayArray1[arg3.anInt983][arg3.anInt993] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt989;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray196[arg3.anInt983] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt989 = local56;
		}
		@Pc(92) boolean local92 = false;
		arg3.aClass5_Sub11_Sub1_1.method1598(this.method1654(arg3));
		arg3.anInt988++;
		@Pc(108) Class51 local108 = arg3.aClass51_1;
		arg3.anInt987 += local108.anInt1996;
		@Pc(133) double local133 = (double) ((arg3.anInt992 - 60 << 8) + (arg3.anInt1000 * arg3.anInt989 >> 12)) * 5.086263020833333E-6D;
		if (local108.anInt2000 > 0) {
			if (local108.anInt2004 > 0) {
				arg3.anInt998 += (int) (Math.pow(2.0D, local133 * (double) local108.anInt2004) * 128.0D + 0.5D);
			} else {
				arg3.anInt998 += 128;
			}
			if (arg3.anInt998 * local108.anInt2000 >= 819200) {
				local92 = true;
			}
		}
		if (local108.aByteArray26 != null) {
			if (local108.anInt1999 <= 0) {
				arg3.anInt994 += 128;
			} else {
				arg3.anInt994 += (int) (Math.pow(2.0D, local133 * (double) local108.anInt1999) * 128.0D + 0.5D);
			}
			while (local108.aByteArray26.length - 2 > arg3.anInt986 && arg3.anInt994 > (local108.aByteArray26[arg3.anInt986 + 2] & 0xFF) << 8) {
				arg3.anInt986 += 2;
			}
			if (arg3.anInt986 == local108.aByteArray26.length - 2 && local108.aByteArray26[arg3.anInt986 + 1] == 0) {
				local92 = true;
			}
		}
		if (arg3.anInt979 >= 0 && local108.aByteArray27 != null && (this.anIntArray203[arg3.anInt983] & 0x1) == 0 && (arg3.anInt993 < 0 || this.aClass5_Sub8ArrayArray1[arg3.anInt983][arg3.anInt993] != arg3)) {
			if (local108.anInt1994 > 0) {
				arg3.anInt979 += (int) (Math.pow(2.0D, (double) local108.anInt1994 * local133) * 128.0D + 0.5D);
			} else {
				arg3.anInt979 += 128;
			}
			while (local108.aByteArray27.length - 2 > arg3.anInt982 && (local108.aByteArray27[arg3.anInt982 + 2] & 0xFF) << 8 < arg3.anInt979) {
				arg3.anInt982 += 2;
			}
			if (arg3.anInt982 == local108.aByteArray27.length - 2) {
				local92 = true;
			}
		}
		if (!local92) {
			arg3.aClass5_Sub11_Sub1_1.method1617(arg3.anInt981, this.method1642(arg3), this.method1639(arg3));
			return false;
		}
		arg3.aClass5_Sub11_Sub1_1.method1589(arg3.anInt981);
		if (arg1 == null) {
			arg3.aClass5_Sub11_Sub1_1.method2870(arg0);
		} else {
			arg3.aClass5_Sub11_Sub1_1.method2869(arg1, arg2, arg0);
		}
		if (arg3.aClass5_Sub11_Sub1_1.method1596()) {
			this.aClass5_Sub11_Sub3_1.aClass5_Sub11_Sub4_2.method2872(arg3.aClass5_Sub11_Sub1_1);
		}
		arg3.method831();
		if (arg3.anInt979 >= 0) {
			arg3.method3207();
			if (arg3.anInt993 > 0 && this.aClass5_Sub8ArrayArray1[arg3.anInt983][arg3.anInt993] == arg3) {
				this.aClass5_Sub8ArrayArray1[arg3.anInt983][arg3.anInt993] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	private void method1634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray198[arg1] = arg0;
		this.anIntArray201[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	private void method1635(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub8 local12 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2684(); local12 != null; local12 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2678()) {
			if (arg0 < 0 || local12.anInt983 == arg0) {
				if (local12.aClass5_Sub11_Sub1_1 != null) {
					local12.aClass5_Sub11_Sub1_1.method1589(Static62.anInt1362 / 100);
					if (local12.aClass5_Sub11_Sub1_1.method1596()) {
						this.aClass5_Sub11_Sub3_1.aClass5_Sub11_Sub4_2.method2872(local12.aClass5_Sub11_Sub1_1);
					}
					local12.method831();
				}
				if (local12.anInt979 < 0) {
					this.aClass5_Sub8ArrayArray2[local12.anInt983][local12.anInt992] = null;
				}
				local12.method3207();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(BII)V")
	private void method1636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	public int method1637() {
		return this.anInt2098;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2870(@OriginalArg(0) int arg0) {
		if (this.aClass98_1.method2836()) {
			@Pc(18) int local18 = this.anInt2076 * this.aClass98_1.anInt3759 / Static62.anInt1362;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong122;
				if (this.aLong121 - local27 >= 0L) {
					this.aLong122 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong121 + (long) local18 - this.aLong122 - 1L) / (long) local18);
				this.aLong122 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass5_Sub11_Sub3_1.method2870(local58);
				this.method1661();
			} while (this.aClass98_1.method2836());
		}
		this.aClass5_Sub11_Sub3_1.method2870(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)V")
	private void method1638() {
		this.anIntArray192[9] = 128;
		this.anIntArray206[9] = 128;
		this.method1652(9, 128);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ee;B)I")
	private int method1639(@OriginalArg(0) Class5_Sub8 arg0) {
		@Pc(14) int local14 = this.anIntArray195[arg0.anInt983];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt991) * (-local14 + 16384) + 32 >> 6) : arg0.anInt991 * local14 - -32 >> 6;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIB)V")
	private void method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1659(arg2, arg0, 64);
		if ((this.anIntArray203[arg0] & 0x2) != 0) {
			for (@Pc(25) Class5_Sub8 local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2687(); local25 != null; local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2685()) {
				if (local25.anInt983 == arg0 && local25.anInt979 < 0) {
					this.aClass5_Sub8ArrayArray2[arg0][local25.anInt992] = null;
					this.aClass5_Sub8ArrayArray2[arg0][arg2] = local25;
					@Pc(60) int local60 = local25.anInt999 + (local25.anInt1000 * local25.anInt989 >> 12);
					local25.anInt999 += arg2 - local25.anInt992 << 8;
					local25.anInt1000 = local60 - local25.anInt999;
					local25.anInt992 = arg2;
					local25.anInt989 = 4096;
					return;
				}
			}
		}
		@Pc(106) Class5_Sub4 local106 = (Class5_Sub4) this.aClass75_11.method2072((long) this.anIntArray194[arg0]);
		if (local106 == null) {
			return;
		}
		@Pc(114) Class5_Sub7_Sub1 local114 = local106.aClass5_Sub7_Sub1Array1[arg2];
		if (local114 == null) {
			return;
		}
		@Pc(121) Class5_Sub8 local121 = new Class5_Sub8();
		local121.anInt983 = arg0;
		local121.aClass5_Sub4_1 = local106;
		local121.aClass5_Sub7_Sub1_1 = local114;
		local121.aClass51_1 = local106.aClass51Array1[arg2];
		local121.anInt993 = local106.aByteArray2[arg2];
		local121.anInt992 = arg2;
		local121.anInt996 = local106.aByteArray4[arg2] * arg1 * arg1 * local106.anInt345 + 1024 >> 11;
		local121.anInt991 = local106.aByteArray3[arg2] & 0xFF;
		local121.anInt999 = (arg2 << 8) - (local106.aShortArray4[arg2] & 0x7FFF);
		local121.anInt979 = -1;
		local121.anInt986 = 0;
		local121.anInt998 = 0;
		local121.anInt994 = 0;
		local121.anInt982 = 0;
		if (this.anIntArray204[arg0] == 0) {
			local121.aClass5_Sub11_Sub1_1 = Static222.method1599(local114, this.method1654(local121), this.method1642(local121), this.method1639(local121));
		} else {
			local121.aClass5_Sub11_Sub1_1 = Static222.method1599(local114, this.method1654(local121), 0, this.method1639(local121));
			this.method1647(local106.aShortArray4[arg2] < 0, local121);
		}
		if (local106.aShortArray4[arg2] < 0) {
			local121.aClass5_Sub11_Sub1_1.method1606(-1);
		}
		if (local121.anInt993 >= 0) {
			@Pc(277) Class5_Sub8 local277 = this.aClass5_Sub8ArrayArray1[arg0][local121.anInt993];
			if (local277 != null && local277.anInt979 < 0) {
				this.aClass5_Sub8ArrayArray2[arg0][local277.anInt992] = null;
				local277.anInt979 = 0;
			}
			this.aClass5_Sub8ArrayArray1[arg0][local121.anInt993] = local121;
		}
		this.aClass5_Sub11_Sub3_1.aClass91_12.method2686(local121);
		this.aClass5_Sub8ArrayArray2[arg0][arg2] = local121;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2864() {
		return 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ee;)I")
	private int method1642(@OriginalArg(1) Class5_Sub8 arg0) {
		@Pc(6) Class51 local6 = arg0.aClass51_1;
		@Pc(22) int local22 = this.anIntArray202[arg0.anInt983] * this.anIntArray193[arg0.anInt983] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt996 + 16384 >> 15;
		local22 = this.anInt2098 * local39 + 128 >> 8;
		if (local6.anInt2000 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt2000 * (double) arg0.anInt998 * 1.953125E-5D) * (double) local22 + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(117) int local117;
		@Pc(107) int local107;
		if (local6.aByteArray26 != null) {
			local75 = arg0.anInt994;
			local83 = local6.aByteArray26[arg0.anInt986 + 1];
			if (arg0.anInt986 < local6.aByteArray26.length - 2) {
				local107 = (local6.aByteArray26[arg0.anInt986 + 2] & 0xFF) << 8;
				local117 = (local6.aByteArray26[arg0.anInt986] & 0xFF) << 8;
				local83 += (local6.aByteArray26[arg0.anInt986 + 3] - local83) * (local75 - local117) / (local107 - local117);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt979 > 0 && local6.aByteArray27 != null) {
			local83 = local6.aByteArray27[arg0.anInt982 + 1];
			local75 = arg0.anInt979;
			if (arg0.anInt982 < local6.aByteArray27.length - 2) {
				local117 = (local6.aByteArray27[arg0.anInt982] & 0xFF) << 8;
				local107 = (local6.aByteArray27[arg0.anInt982 + 2] & 0xFF) << 8;
				local83 += (local75 - local117) * (local6.aByteArray27[arg0.anInt982 + 3] - local83) / (local107 - local117);
			}
			local22 = local22 * local83 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
	private void method1644(@OriginalArg(1) int arg0) {
		if ((this.anIntArray203[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class5_Sub8 local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2684(); local25 != null; local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2678()) {
			if (local25.anInt983 == arg0 && this.aClass5_Sub8ArrayArray2[arg0][local25.anInt992] == null && local25.anInt979 < 0) {
				local25.anInt979 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
	public synchronized void method1645() {
		for (@Pc(15) Class5_Sub4 local15 = (Class5_Sub4) this.aClass75_11.method2067(); local15 != null; local15 = (Class5_Sub4) this.aClass75_11.method2066()) {
			local15.method286();
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)V")
	private void method1646(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1646(local9);
			}
			return;
		}
		this.anIntArray202[arg0] = 12800;
		this.anIntArray195[arg0] = 8192;
		this.anIntArray193[arg0] = 16383;
		this.anIntArray205[arg0] = 8192;
		this.anIntArray197[arg0] = 0;
		this.anIntArray196[arg0] = 8192;
		this.method1644(arg0);
		this.method1648(arg0);
		this.anIntArray203[arg0] = 0;
		this.anIntArray200[arg0] = 32767;
		this.anIntArray199[arg0] = 256;
		this.anIntArray204[arg0] = 0;
		this.method1634(8192, arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZBLclient!ee;)V")
	public void method1647(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub8 arg1) {
		@Pc(4) int local4 = arg1.aClass5_Sub7_Sub1_1.aByteArray42.length;
		@Pc(36) int local36;
		if (arg0 && arg1.aClass5_Sub7_Sub1_1.aBoolean118) {
			@Pc(23) int local23 = local4 + local4 - arg1.aClass5_Sub7_Sub1_1.anInt2689;
			local36 = (int) ((long) local23 * (long) this.anIntArray204[arg1.anInt983] >> 6);
			local4 <<= 0x8;
			if (local4 <= local36) {
				arg1.aClass5_Sub11_Sub1_1.method1593();
				local36 = local4 + local4 - local36 - 1;
			}
		} else {
			local36 = (int) ((long) this.anIntArray204[arg1.anInt983] * (long) local4 >> 6);
		}
		arg1.aClass5_Sub11_Sub1_1.method1594(local36);
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(II)V")
	private void method1648(@OriginalArg(1) int arg0) {
		if ((this.anIntArray203[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class5_Sub8 local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2684(); local25 != null; local25 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2678()) {
			if (local25.anInt983 == arg0) {
				local25.anInt984 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)V")
	private void method1650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(I)Z")
	public synchronized boolean method1651() {
		return this.aClass98_1.method2836();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(III)V")
	private void method1652(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray194[arg0] != arg1) {
			this.anIntArray194[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass5_Sub8ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!m;IZ)V")
	public synchronized void method1653(@OriginalArg(0) Class5_Sub18 arg0, @OriginalArg(2) boolean arg1) {
		this.method1632();
		this.aClass98_1.method2832(arg0.aByteArray41);
		this.aBoolean91 = arg1;
		this.aLong122 = 0L;
		@Pc(23) int local23 = this.aClass98_1.method2835();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass98_1.method2827(local25);
			this.aClass98_1.method2841(local25);
			this.aClass98_1.method2829(local25);
		}
		this.anInt2116 = this.aClass98_1.method2831();
		this.anInt2115 = this.aClass98_1.anIntArray396[this.anInt2116];
		this.aLong121 = this.aClass98_1.method2842(this.anInt2115);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ee;I)I")
	private int method1654(@OriginalArg(0) Class5_Sub8 arg0) {
		@Pc(18) int local18 = arg0.anInt999 + (arg0.anInt1000 * arg0.anInt989 >> 12);
		@Pc(21) Class51 local21 = arg0.aClass51_1;
		local18 += (this.anIntArray205[arg0.anInt983] - 8192) * this.anIntArray199[arg0.anInt983] >> 12;
		@Pc(66) int local66;
		if (local21.anInt1996 > 0 && (local21.anInt1995 > 0 || this.anIntArray197[arg0.anInt983] > 0)) {
			local66 = local21.anInt1995 << 2;
			@Pc(71) int local71 = local21.anInt2001 << 1;
			if (local71 > arg0.anInt988) {
				local66 = local66 * arg0.anInt988 / local71;
			}
			local66 += this.anIntArray197[arg0.anInt983] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt987 & 0x1FF) * 0.01227184630308513D);
			local18 += (int) (local105 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass5_Sub7_Sub1_1.anInt2688 * 256) * Math.pow(2.0D, (double) local18 * 3.255208333333333E-4D) / (double) Static62.anInt1362 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	private void method1655() {
		this.method1635(-1);
		this.method1646(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray194[local20] = this.anIntArray192[local20];
		}
		for (@Pc(36) int local36 = 0; local36 < 16; local36++) {
			this.anIntArray206[local36] = this.anIntArray192[local36] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(II)V")
	private void method1656(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class5_Sub8 local8 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2684(); local8 != null; local8 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2678()) {
			if ((arg0 < 0 || arg0 == local8.anInt983) && local8.anInt979 < 0) {
				this.aClass5_Sub8ArrayArray2[local8.anInt983][local8.anInt992] = null;
				local8.anInt979 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ILclient!ee;)Z")
	public boolean method1657(@OriginalArg(1) Class5_Sub8 arg0) {
		if (arg0.aClass5_Sub11_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt979 >= 0) {
			arg0.method3207();
			if (arg0.anInt993 > 0 && this.aClass5_Sub8ArrayArray1[arg0.anInt983][arg0.anInt993] == arg0) {
				this.aClass5_Sub8ArrayArray1[arg0.anInt983][arg0.anInt993] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IIII)V")
	private void method1659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub8 local12 = this.aClass5_Sub8ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub8ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray203[arg1] & 0x2) == 0) {
			local12.anInt979 = 0;
			return;
		}
		for (@Pc(41) Class5_Sub8 local41 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2684(); local41 != null; local41 = (Class5_Sub8) this.aClass5_Sub11_Sub3_1.aClass91_12.method2678()) {
			if (local12.anInt983 == local41.anInt983 && local41.anInt979 < 0 && local12 != local41) {
				local12.anInt979 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "()Lclient!f;")
	@Override
	public synchronized Class5_Sub11 method2866() {
		return this.aClass5_Sub11_Sub3_1;
	}

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(II)V")
	public synchronized void method1660(@OriginalArg(1) int arg0) {
		this.anInt2098 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "(I)V")
	private void method1661() {
		@Pc(4) int local4 = this.anInt2116;
		@Pc(11) int local11 = this.anInt2115;
		@Pc(14) long local14 = this.aLong121;
		while (local11 == this.anInt2115) {
			while (local11 == this.aClass98_1.anIntArray396[local4]) {
				this.aClass98_1.method2827(local4);
				@Pc(25) int local25 = this.aClass98_1.method2837(local4);
				if (local25 == 1) {
					this.aClass98_1.method2834();
					this.aClass98_1.method2829(local4);
					if (this.aClass98_1.method2833()) {
						if (!this.aBoolean91 || local11 == 0) {
							this.method1655();
							this.aClass98_1.method2839();
							return;
						}
						this.aClass98_1.method2830(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method1629(local25);
				}
				this.aClass98_1.method2841(local4);
				this.aClass98_1.method2829(local4);
			}
			local4 = this.aClass98_1.method2831();
			local11 = this.aClass98_1.anIntArray396[local4];
			local14 = this.aClass98_1.method2842(local11);
		}
		this.anInt2116 = local4;
		this.anInt2115 = local11;
		this.aLong121 = local14;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!da;BLclient!wa;Lclient!m;)Z")
	public synchronized boolean method1663(@OriginalArg(1) Class18 arg0, @OriginalArg(3) Class23 arg1, @OriginalArg(4) Class5_Sub18 arg2) {
		arg2.method1852();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class5_Sub16 local34 = (Class5_Sub16) arg2.aClass75_12.method2067(); local34 != null; local34 = (Class5_Sub16) arg2.aClass75_12.method2066()) {
			@Pc(40) int local40 = (int) local34.aLong253;
			@Pc(48) Class5_Sub4 local48 = (Class5_Sub4) this.aClass75_11.method2072((long) local40);
			if (local48 == null) {
				local48 = Static209.method3113(local40, arg1);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass75_11.method2069(local48, (long) local40);
			}
			if (!local48.method288(local23, arg0, local34.aByteArray25)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method1854();
		}
		return local9;
	}

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V")
	public synchronized void method1664() {
		for (@Pc(11) Class5_Sub4 local11 = (Class5_Sub4) this.aClass75_11.method2067(); local11 != null; local11 = (Class5_Sub4) this.aClass75_11.method2066()) {
			local11.method3207();
		}
	}
}
