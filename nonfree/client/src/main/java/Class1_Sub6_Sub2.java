import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class1_Sub6_Sub2 extends Class1_Sub6 {

	@OriginalMember(owner = "client!hj", name = "Ob", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!hj", name = "Qb", descriptor = "I")
	private int anInt1870;

	@OriginalMember(owner = "client!hj", name = "Rb", descriptor = "J")
	private long aLong67;

	@OriginalMember(owner = "client!hj", name = "Sb", descriptor = "I")
	private int anInt1871;

	@OriginalMember(owner = "client!hj", name = "Tb", descriptor = "J")
	private long aLong68;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "[[Lclient!kc;")
	private Class1_Sub15[][] aClass1_Sub15ArrayArray1 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "[I")
	private int[] anIntArray183 = new int[16];

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "[I")
	private int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "[I")
	private int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "[I")
	private int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!hj", name = "pb", descriptor = "I")
	private int anInt1856 = 1000000;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	private int anInt1840 = 256;

	@OriginalMember(owner = "client!hj", name = "sb", descriptor = "[I")
	public int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!hj", name = "hb", descriptor = "[[Lclient!kc;")
	private Class1_Sub15[][] aClass1_Sub15ArrayArray2 = new Class1_Sub15[16][128];

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
	private int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!hj", name = "qb", descriptor = "[I")
	private int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!hj", name = "Db", descriptor = "[I")
	private int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
	private int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!hj", name = "lb", descriptor = "[I")
	private int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!hj", name = "Jb", descriptor = "[I")
	public int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!hj", name = "nb", descriptor = "[I")
	private int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!hj", name = "xb", descriptor = "[I")
	private int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!hj", name = "Ib", descriptor = "[I")
	public int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!hj", name = "Fb", descriptor = "[I")
	private int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!hj", name = "rb", descriptor = "Lclient!nf;")
	private Class81 aClass81_1 = new Class81();

	@OriginalMember(owner = "client!hj", name = "Pb", descriptor = "Lclient!mc;")
	private Class1_Sub6_Sub4 aClass1_Sub6_Sub4_1 = new Class1_Sub6_Sub4(this);

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "Lclient!hd;")
	private Class50 aClass50_13 = new Class50(128);

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
	public Class1_Sub6_Sub2() {
		this.method1461();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	private void method1433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub15 local12 = this.aClass1_Sub15ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub15ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray190[arg0] & 0x2) == 0) {
			local12.anInt2392 = 0;
			return;
		}
		for (@Pc(48) Class1_Sub15 local48 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3564(); local48 != null; local48 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3561()) {
			if (local48.anInt2401 == local12.anInt2401 && local48.anInt2392 < 0 && local48 != local12) {
				local12.anInt2392 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V")
	private void method1434(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1433(local18, local24, local30);
		} else if (local9 == 144) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method1454(local18, local24, local30);
			} else {
				this.method1433(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1452(local24, local18, local30);
		} else if (local9 == 176) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray187[local18] = (this.anIntArray187[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray187[local18] = (this.anIntArray187[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray183[local18] = (local30 << 7) + (this.anIntArray183[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray183[local18] = (this.anIntArray183[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray189[local18] = (local30 << 7) + (this.anIntArray189[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray189[local18] = local30 + (this.anIntArray189[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray184[local18] = (this.anIntArray184[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray184[local18] = local30 + (this.anIntArray184[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray192[local18] = (local30 << 7) + (this.anIntArray192[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray192[local18] = local30 + (this.anIntArray192[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray185[local18] = (local30 << 7) + (this.anIntArray185[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray185[local18] = (this.anIntArray185[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray190[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray190[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray190[local18] |= 0x2;
				} else {
					this.method1465(local18);
					this.anIntArray190[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray188[local18] = (this.anIntArray188[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray188[local18] = (this.anIntArray188[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray188[local18] = (local30 << 7) + (this.anIntArray188[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray188[local18] = local30 + (this.anIntArray188[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1449(local18);
			}
			if (local24 == 121) {
				this.method1446(local18);
			}
			if (local24 == 123) {
				this.method1463(local18);
			}
			@Pc(501) int local501;
			if (local24 == 6) {
				local501 = this.anIntArray188[local18];
				if (local501 == 16384) {
					this.anIntArray181[local18] = (local30 << 7) + (this.anIntArray181[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local501 = this.anIntArray188[local18];
				if (local501 == 16384) {
					this.anIntArray181[local18] = local30 + (this.anIntArray181[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray195[local18] = (local30 << 7) + (this.anIntArray195[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray195[local18] = (this.anIntArray195[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray190[local18] |= 0x4;
				} else {
					this.method1444(local18);
					this.anIntArray190[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1464(local18, (local30 << 7) + (this.anIntArray193[local18] & 0xFFFFC07F));
			}
			if (local24 == 49) {
				this.method1464(local18, local30 + (this.anIntArray193[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1438(local18, local24 + this.anIntArray187[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1455(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FFA) >> 8);
			this.method1450(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1461();
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBI)V")
	private void method1437() {
		this.anIntArray194[9] = 128;
		this.anIntArray187[9] = 128;
		this.method1438(9, 128);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BII)V")
	private void method1438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray186[arg0]) {
			this.anIntArray186[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass1_Sub15ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!kc;)I")
	private int method1439(@OriginalArg(1) Class1_Sub15 arg0) {
		@Pc(9) int local9 = this.anIntArray192[arg0.anInt2401];
		return local9 < 8192 ? arg0.anInt2408 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt2408 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!kc;I)I")
	private int method1441(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(2) Class44 local2 = arg0.aClass44_1;
		@Pc(30) int local30 = this.anIntArray185[arg0.anInt2401] * this.anIntArray184[arg0.anInt2401] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt2397 * local38 + 16384 >> 15;
		local30 = this.anInt1840 * local47 + 128 >> 8;
		if (local2.anInt1644 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) local2.anInt1644 * (double) arg0.anInt2404 * 1.953125E-5D) + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		@Pc(128) int local128;
		@Pc(118) int local118;
		if (local2.aByteArray26 != null) {
			local86 = arg0.anInt2409;
			local94 = local2.aByteArray26[arg0.anInt2391 + 1];
			if (arg0.anInt2391 < local2.aByteArray26.length - 2) {
				local118 = (local2.aByteArray26[arg0.anInt2391 + 2] & 0xFF) << 8;
				local128 = (local2.aByteArray26[arg0.anInt2391] & 0xFF) << 8;
				local94 += (local2.aByteArray26[arg0.anInt2391 + 3] - local94) * (local86 - local128) / (local118 - local128);
			}
			local30 = local94 * local30 + 32 >> 6;
		}
		if (arg0.anInt2392 > 0 && local2.aByteArray27 != null) {
			local86 = arg0.anInt2392;
			local94 = local2.aByteArray27[arg0.anInt2400 + 1];
			if (local2.aByteArray27.length - 2 > arg0.anInt2400) {
				local128 = (local2.aByteArray27[arg0.anInt2400] & 0xFF) << 8;
				local118 = (local2.aByteArray27[arg0.anInt2400 + 2] & 0xFF) << 8;
				local94 += (local86 - local128) * (local2.aByteArray27[arg0.anInt2400 + 3] - local94) / (local118 - local128);
			}
			local30 = local30 * local94 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!jb;IILclient!s;Lclient!bd;)Z")
	public synchronized boolean method1442(@OriginalArg(0) Class28 arg0, @OriginalArg(3) Class1_Sub27 arg1, @OriginalArg(4) Class12 arg2) {
		@Pc(3) boolean local3 = true;
		arg1.method3053();
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class1_Sub18 local27 = (Class1_Sub18) arg1.aClass50_23.method1358(); local27 != null; local27 = (Class1_Sub18) arg1.aClass50_23.method1361()) {
			@Pc(33) int local33 = (int) local27.aLong177;
			@Pc(41) Class1_Sub14 local41 = (Class1_Sub14) this.aClass50_13.method1364((long) local33);
			if (local41 == null) {
				local41 = Static158.method2565(local33, arg0);
				if (local41 == null) {
					local3 = false;
					continue;
				}
				this.aClass50_13.method1362((long) local33, local41);
			}
			if (!local41.method1515(local21, arg2, local27.aByteArray42)) {
				local3 = false;
			}
		}
		if (local3) {
			arg1.method3054();
		}
		return local3;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
	public synchronized void method1443() {
		this.method1437();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
	private void method1444(@OriginalArg(0) int arg0) {
		if ((this.anIntArray190[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub15 local22 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3564(); local22 != null; local22 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3561()) {
			if (local22.anInt2401 == arg0) {
				local22.anInt2394 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()Lclient!pf;")
	@Override
	public synchronized Class1_Sub6 method2182() {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(BI)V")
	public synchronized void method1445(@OriginalArg(1) int arg0) {
		this.anInt1840 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(BI)V")
	private void method1446(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1446(local12);
			}
			return;
		}
		this.anIntArray184[arg0] = 12800;
		this.anIntArray192[arg0] = 8192;
		this.anIntArray185[arg0] = 16383;
		this.anIntArray182[arg0] = 8192;
		this.anIntArray183[arg0] = 0;
		this.anIntArray189[arg0] = 8192;
		this.method1465(arg0);
		this.method1444(arg0);
		this.anIntArray190[arg0] = 0;
		this.anIntArray188[arg0] = 32767;
		this.anIntArray181[arg0] = 256;
		this.anIntArray195[arg0] = 0;
		this.method1464(arg0, 8192);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2183(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass81_1.method2388()) {
			@Pc(18) int local18 = this.anInt1856 * this.aClass81_1.anInt3152 / Static14.anInt334;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong68;
				if (this.aLong67 - local27 >= 0L) {
					this.aLong68 = local27;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong67 + (long) local18 - this.aLong68 - 1L) / (long) local18);
				this.aLong68 += (long) local18 * (long) local59;
				this.aClass1_Sub6_Sub4_1.method2183(arg0, arg1, local59);
				arg2 -= local59;
				this.method1460();
				arg1 += local59;
			} while (this.aClass81_1.method2388());
		}
		this.aClass1_Sub6_Sub4_1.method2183(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	public synchronized void method1447() {
		for (@Pc(13) Class1_Sub14 local13 = (Class1_Sub14) this.aClass50_13.method1358(); local13 != null; local13 = (Class1_Sub14) this.aClass50_13.method1361()) {
			local13.method1510();
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2184() {
		return 0;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Z")
	public synchronized boolean method1448() {
		return this.aClass81_1.method2388();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
	private void method1449(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub15 local12 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3564(); local12 != null; local12 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3561()) {
			if (arg0 < 0 || local12.anInt2401 == arg0) {
				if (local12.aClass1_Sub6_Sub3_1 != null) {
					local12.aClass1_Sub6_Sub3_1.method1845(Static14.anInt334 / 100);
					if (local12.aClass1_Sub6_Sub3_1.method1819()) {
						this.aClass1_Sub6_Sub4_1.aClass1_Sub6_Sub1_2.method972(local12.aClass1_Sub6_Sub3_1);
					}
					local12.method1902();
				}
				if (local12.anInt2392 < 0) {
					this.aClass1_Sub15ArrayArray2[local12.anInt2401][local12.anInt2398] = null;
				}
				local12.method3735();
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "()Lclient!pf;")
	@Override
	public synchronized Class1_Sub6 method2185() {
		return this.aClass1_Sub6_Sub4_1;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2187(@OriginalArg(0) int arg0) {
		if (this.aClass81_1.method2388()) {
			@Pc(14) int local14 = this.aClass81_1.anInt3152 * this.anInt1856 / Static14.anInt334;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong68;
				if (this.aLong67 - local23 >= 0L) {
					this.aLong68 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong67 - this.aLong68 - 1L) / (long) local14);
				arg0 -= local51;
				this.aLong68 += (long) local51 * (long) local14;
				this.aClass1_Sub6_Sub4_1.method2187(local51);
				this.method1460();
			} while (this.aClass81_1.method2388());
		}
		this.aClass1_Sub6_Sub4_1.method2187(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZII)V")
	private void method1450(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray182[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	public synchronized void method1451() {
		this.aClass81_1.method2377();
		this.method1461();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZ)V")
	private void method1452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZLclient!s;)V")
	public synchronized void method1453(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub27 arg1) {
		this.method1451();
		this.aClass81_1.method2384(arg1.aByteArray54);
		this.aLong68 = 0L;
		this.aBoolean169 = arg0;
		@Pc(23) int local23 = this.aClass81_1.method2392();
		for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
			this.aClass81_1.method2382(local33);
			this.aClass81_1.method2383(local33);
			this.aClass81_1.method2387(local33);
		}
		this.anInt1870 = this.aClass81_1.method2381();
		this.anInt1871 = this.aClass81_1.anIntArray270[this.anInt1870];
		this.aLong67 = this.aClass81_1.method2378(this.anInt1871);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIII)V")
	private void method1454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1433(arg0, arg1, 64);
		if ((this.anIntArray190[arg0] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub15 local25 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3563(); local25 != null; local25 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3565()) {
				if (local25.anInt2401 == arg0 && local25.anInt2392 < 0) {
					this.aClass1_Sub15ArrayArray2[arg0][local25.anInt2398] = null;
					this.aClass1_Sub15ArrayArray2[arg0][arg1] = local25;
					@Pc(67) int local67 = (local25.anInt2405 * local25.anInt2410 >> 12) + local25.anInt2403;
					local25.anInt2405 = 4096;
					local25.anInt2403 += arg1 - local25.anInt2398 << 8;
					local25.anInt2398 = arg1;
					local25.anInt2410 = local67 - local25.anInt2403;
					return;
				}
			}
		}
		@Pc(113) Class1_Sub14 local113 = (Class1_Sub14) this.aClass50_13.method1364((long) this.anIntArray186[arg0]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class1_Sub7_Sub1 local121 = local113.aClass1_Sub7_Sub1Array1[arg1];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class1_Sub15 local128 = new Class1_Sub15();
		local128.anInt2401 = arg0;
		local128.aClass1_Sub14_1 = local113;
		local128.aClass1_Sub7_Sub1_1 = local121;
		local128.aClass44_1 = local113.aClass44Array1[arg1];
		local128.anInt2395 = local113.aByteArray31[arg1];
		local128.anInt2398 = arg1;
		local128.anInt2397 = local113.anInt1935 * arg2 * arg2 * local113.aByteArray30[arg1] + 1024 >> 11;
		local128.anInt2408 = local113.aByteArray29[arg1] & 0xFF;
		local128.anInt2403 = (arg1 << 8) - (local113.aShortArray23[arg1] & 0x7FFF);
		local128.anInt2409 = 0;
		local128.anInt2391 = 0;
		local128.anInt2392 = -1;
		local128.anInt2400 = 0;
		local128.anInt2404 = 0;
		if (this.anIntArray195[arg0] == 0) {
			local128.aClass1_Sub6_Sub3_1 = Static238.method1815(local121, this.method1466(local128), this.method1441(local128), this.method1439(local128));
		} else {
			local128.aClass1_Sub6_Sub3_1 = Static238.method1815(local121, this.method1466(local128), 0, this.method1439(local128));
			this.method1462(local113.aShortArray23[arg1] < 0, local128);
		}
		if (local113.aShortArray23[arg1] < 0) {
			local128.aClass1_Sub6_Sub3_1.method1837(-1);
		}
		if (local128.anInt2395 >= 0) {
			@Pc(288) Class1_Sub15 local288 = this.aClass1_Sub15ArrayArray1[arg0][local128.anInt2395];
			if (local288 != null && local288.anInt2392 < 0) {
				this.aClass1_Sub15ArrayArray2[arg0][local288.anInt2398] = null;
				local288.anInt2392 = 0;
			}
			this.aClass1_Sub15ArrayArray1[arg0][local128.anInt2395] = local128;
		}
		this.aClass1_Sub6_Sub4_1.aClass120_16.method3567(local128);
		this.aClass1_Sub15ArrayArray2[arg0][arg1] = local128;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V")
	private void method1455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
	public synchronized void method1457() {
		for (@Pc(7) Class1_Sub14 local7 = (Class1_Sub14) this.aClass50_13.method1358(); local7 != null; local7 = (Class1_Sub14) this.aClass50_13.method1361()) {
			local7.method3735();
		}
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(ILclient!kc;)Z")
	public boolean method1458(@OriginalArg(1) Class1_Sub15 arg0) {
		if (arg0.aClass1_Sub6_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt2392 >= 0) {
			arg0.method3735();
			if (arg0.anInt2395 > 0 && arg0 == this.aClass1_Sub15ArrayArray1[arg0.anInt2401][arg0.anInt2395]) {
				this.aClass1_Sub15ArrayArray1[arg0.anInt2401][arg0.anInt2395] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V")
	private void method1460() {
		@Pc(12) int local12 = this.anInt1870;
		@Pc(15) int local15 = this.anInt1871;
		@Pc(18) long local18 = this.aLong67;
		while (this.anInt1871 == local15) {
			while (local15 == this.aClass81_1.anIntArray270[local12]) {
				this.aClass81_1.method2382(local12);
				@Pc(29) int local29 = this.aClass81_1.method2389(local12);
				if (local29 == 1) {
					this.aClass81_1.method2390();
					this.aClass81_1.method2387(local12);
					if (this.aClass81_1.method2379()) {
						if (!this.aBoolean169 || local15 == 0) {
							this.method1461();
							this.aClass81_1.method2377();
							return;
						}
						this.aClass81_1.method2391(local18);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1434(local29);
				}
				this.aClass81_1.method2383(local12);
				this.aClass81_1.method2387(local12);
			}
			local12 = this.aClass81_1.method2381();
			local15 = this.aClass81_1.anIntArray270[local12];
			local18 = this.aClass81_1.method2378(local15);
		}
		this.anInt1871 = local15;
		this.aLong67 = local18;
		this.anInt1870 = local12;
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)V")
	private void method1461() {
		this.method1449(-1);
		this.method1446(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray186[local21] = this.anIntArray194[local21];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray187[local37] = this.anIntArray194[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZLclient!kc;B)V")
	public void method1462(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub15 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub7_Sub1_1.aByteArray24.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass1_Sub7_Sub1_1.aBoolean113) {
			@Pc(37) int local37 = local8 + local8 - arg1.aClass1_Sub7_Sub1_1.anInt1312;
			local27 = (int) ((long) local37 * (long) this.anIntArray195[arg1.anInt2401] >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass1_Sub6_Sub3_1.method1818();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray195[arg1.anInt2401] >> 6);
		}
		arg1.aClass1_Sub6_Sub3_1.method1842(local27);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(ZI)V")
	private void method1463(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub15 local12 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3564(); local12 != null; local12 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3561()) {
			if ((arg0 < 0 || arg0 == local12.anInt2401) && local12.anInt2392 < 0) {
				this.aClass1_Sub15ArrayArray2[local12.anInt2401][local12.anInt2398] = null;
				local12.anInt2392 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)V")
	private void method1464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray193[arg0] = arg1;
		this.anIntArray196[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
	private void method1465(@OriginalArg(0) int arg0) {
		if ((this.anIntArray190[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class1_Sub15 local25 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3564(); local25 != null; local25 = (Class1_Sub15) this.aClass1_Sub6_Sub4_1.aClass120_16.method3561()) {
			if (arg0 == local25.anInt2401 && this.aClass1_Sub15ArrayArray2[arg0][local25.anInt2398] == null && local25.anInt2392 < 0) {
				local25.anInt2392 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!kc;B)I")
	private int method1466(@OriginalArg(0) Class1_Sub15 arg0) {
		@Pc(10) int local10 = (arg0.anInt2410 * arg0.anInt2405 >> 12) + arg0.anInt2403;
		@Pc(17) Class44 local17 = arg0.aClass44_1;
		local10 += (this.anIntArray182[arg0.anInt2401] - 8192) * this.anIntArray181[arg0.anInt2401] >> 12;
		@Pc(61) int local61;
		if (local17.anInt1638 > 0 && (local17.anInt1639 > 0 || this.anIntArray183[arg0.anInt2401] > 0)) {
			local61 = local17.anInt1639 << 2;
			@Pc(66) int local66 = local17.anInt1640 << 1;
			if (local66 > arg0.anInt2396) {
				local61 = arg0.anInt2396 * local61 / local66;
			}
			local61 += this.anIntArray183[arg0.anInt2401] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt2407 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass1_Sub7_Sub1_1.anInt1313 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static14.anInt334 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B[IILclient!kc;I)Z")
	public boolean method1467(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub15 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt2390 = Static14.anInt334 / 100;
		if (arg2.anInt2392 >= 0 && (arg2.aClass1_Sub6_Sub3_1 == null || arg2.aClass1_Sub6_Sub3_1.method1813())) {
			arg2.method1902();
			arg2.method3735();
			if (arg2.anInt2395 > 0 && arg2 == this.aClass1_Sub15ArrayArray1[arg2.anInt2401][arg2.anInt2395]) {
				this.aClass1_Sub15ArrayArray1[arg2.anInt2401][arg2.anInt2395] = null;
			}
			return true;
		}
		@Pc(64) int local64 = arg2.anInt2405;
		if (local64 > 0) {
			local64 -= (int) (Math.pow(2.0D, (double) this.anIntArray189[arg2.anInt2401] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local64 < 0) {
				local64 = 0;
			}
			arg2.anInt2405 = local64;
		}
		arg2.aClass1_Sub6_Sub3_1.method1812(this.method1466(arg2));
		arg2.anInt2396++;
		@Pc(128) double local128 = (double) ((arg2.anInt2398 - 60 << 8) + (arg2.anInt2410 * arg2.anInt2405 >> 12)) * 5.086263020833333E-6D;
		@Pc(131) Class44 local131 = arg2.aClass44_1;
		@Pc(133) boolean local133 = false;
		arg2.anInt2407 += local131.anInt1638;
		if (local131.anInt1644 > 0) {
			if (local131.anInt1642 > 0) {
				arg2.anInt2404 += (int) (Math.pow(2.0D, (double) local131.anInt1642 * local128) * 128.0D + 0.5D);
			} else {
				arg2.anInt2404 += 128;
			}
			if (arg2.anInt2404 * local131.anInt1644 >= 819200) {
				local133 = true;
			}
		}
		if (local131.aByteArray26 != null) {
			if (local131.anInt1641 > 0) {
				arg2.anInt2409 += (int) (Math.pow(2.0D, local128 * (double) local131.anInt1641) * 128.0D + 0.5D);
			} else {
				arg2.anInt2409 += 128;
			}
			while (arg2.anInt2391 < local131.aByteArray26.length - 2 && arg2.anInt2409 > (local131.aByteArray26[arg2.anInt2391 + 2] & 0xFF) << 8) {
				arg2.anInt2391 += 2;
			}
			if (arg2.anInt2391 == local131.aByteArray26.length - 2 && local131.aByteArray26[arg2.anInt2391 + 1] == 0) {
				local133 = true;
			}
		}
		if (arg2.anInt2392 >= 0 && local131.aByteArray27 != null && (this.anIntArray190[arg2.anInt2401] & 0x1) == 0 && (arg2.anInt2395 < 0 || arg2 != this.aClass1_Sub15ArrayArray1[arg2.anInt2401][arg2.anInt2395])) {
			if (local131.anInt1643 > 0) {
				arg2.anInt2392 += (int) (Math.pow(2.0D, local128 * (double) local131.anInt1643) * 128.0D + 0.5D);
			} else {
				arg2.anInt2392 += 128;
			}
			while (local131.aByteArray27.length - 2 > arg2.anInt2400 && arg2.anInt2392 > (local131.aByteArray27[arg2.anInt2400 + 2] & 0xFF) << 8) {
				arg2.anInt2400 += 2;
			}
			if (arg2.anInt2400 == local131.aByteArray27.length - 2) {
				local133 = true;
			}
		}
		if (!local133) {
			arg2.aClass1_Sub6_Sub3_1.method1840(arg2.anInt2390, this.method1441(arg2), this.method1439(arg2));
			return false;
		}
		arg2.aClass1_Sub6_Sub3_1.method1845(arg2.anInt2390);
		if (arg0 == null) {
			arg2.aClass1_Sub6_Sub3_1.method2187(arg1);
		} else {
			arg2.aClass1_Sub6_Sub3_1.method2183(arg0, arg3, arg1);
		}
		if (arg2.aClass1_Sub6_Sub3_1.method1819()) {
			this.aClass1_Sub6_Sub4_1.aClass1_Sub6_Sub1_2.method972(arg2.aClass1_Sub6_Sub3_1);
		}
		arg2.method1902();
		if (arg2.anInt2392 >= 0) {
			arg2.method3735();
			if (arg2.anInt2395 > 0 && arg2 == this.aClass1_Sub15ArrayArray1[arg2.anInt2401][arg2.anInt2395]) {
				this.aClass1_Sub15ArrayArray1[arg2.anInt2401][arg2.anInt2395] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)I")
	public int method1468() {
		return this.anInt1840;
	}
}
