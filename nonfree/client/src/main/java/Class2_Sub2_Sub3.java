import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub2_Sub3 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pd", name = "Ob", descriptor = "J")
	private long aLong71;

	@OriginalMember(owner = "client!pd", name = "Pb", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!pd", name = "Rb", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!pd", name = "Sb", descriptor = "I")
	private int anInt2265;

	@OriginalMember(owner = "client!pd", name = "Tb", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "[I")
	private final int[] anIntArray292 = new int[16];

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "[I")
	private final int[] anIntArray289 = new int[16];

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "[I")
	private final int[] anIntArray290 = new int[16];

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "[[Lclient!qc;")
	private final Class2_Sub15[][] aClass2_Sub15ArrayArray1 = new Class2_Sub15[16][128];

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
	private int anInt2239 = 256;

	@OriginalMember(owner = "client!pd", name = "ib", descriptor = "[I")
	public final int[] anIntArray295 = new int[16];

	@OriginalMember(owner = "client!pd", name = "tb", descriptor = "[I")
	private final int[] anIntArray299 = new int[16];

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "[I")
	private final int[] anIntArray297 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Bb", descriptor = "[I")
	public final int[] anIntArray300 = new int[16];

	@OriginalMember(owner = "client!pd", name = "ab", descriptor = "[I")
	private final int[] anIntArray294 = new int[16];

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "[I")
	public final int[] anIntArray291 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Cb", descriptor = "[I")
	private final int[] anIntArray301 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Hb", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "[I")
	private final int[] anIntArray293 = new int[16];

	@OriginalMember(owner = "client!pd", name = "rb", descriptor = "[I")
	private final int[] anIntArray298 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Lb", descriptor = "[[Lclient!qc;")
	private final Class2_Sub15[][] aClass2_Sub15ArrayArray2 = new Class2_Sub15[16][128];

	@OriginalMember(owner = "client!pd", name = "lb", descriptor = "[I")
	private final int[] anIntArray296 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Nb", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!pd", name = "Ab", descriptor = "Lclient!j;")
	private final Class36 aClass36_1 = new Class36();

	@OriginalMember(owner = "client!pd", name = "Qb", descriptor = "Lclient!ac;")
	private final Class2_Sub2_Sub1 aClass2_Sub2_Sub1_1 = new Class2_Sub2_Sub1(this);

	@OriginalMember(owner = "client!pd", name = "vb", descriptor = "Lclient!ka;")
	private final Class41 aClass41_11 = new Class41(128);

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub3() {
		this.method1385();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
	public synchronized void method1362() {
		for (@Pc(7) Class2_Sub13 local7 = (Class2_Sub13) this.aClass41_11.method1061(); local7 != null; local7 = (Class2_Sub13) this.aClass41_11.method1058()) {
			local7.method1211();
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1523(@OriginalArg(0) int arg0) {
		if (this.aClass36_1.method971()) {
			@Pc(13) int local13 = this.aClass36_1.anInt1655 * 1000000 / Static35.anInt1167;
			do {
				@Pc(22) long local22 = (long) local13 * (long) arg0 + this.aLong71;
				if (this.aLong72 - local22 >= 0L) {
					this.aLong71 = local22;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local13 + this.aLong72 - this.aLong71 - 1L) / (long) local13);
				arg0 -= local53;
				this.aLong71 += (long) local53 * (long) local13;
				this.aClass2_Sub2_Sub1_1.method1523(local53);
				this.method1378();
			} while (this.aClass36_1.method971());
		}
		this.aClass2_Sub2_Sub1_1.method1523(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	private void method1363(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub15 local12 = this.aClass2_Sub15ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub15ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray291[arg2] & 0x2) == 0) {
			local12.anInt2441 = 0;
			return;
		}
		for (@Pc(43) Class2_Sub15 local43 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1285(); local43 != null; local43 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1281()) {
			if (local12.anInt2431 == local43.anInt2431 && local43.anInt2441 < 0 && local43 != local12) {
				local12.anInt2441 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBII)V")
	private void method1364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1363(arg2, 64, arg1);
		if ((this.anIntArray291[arg1] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub15 local30 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1293(); local30 != null; local30 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1288()) {
				if (arg1 == local30.anInt2431 && local30.anInt2441 < 0) {
					this.aClass2_Sub15ArrayArray1[arg1][local30.anInt2437] = null;
					this.aClass2_Sub15ArrayArray1[arg1][arg2] = local30;
					@Pc(68) int local68 = local30.anInt2427 + (local30.anInt2447 * local30.anInt2446 >> 12);
					local30.anInt2446 = 4096;
					local30.anInt2427 += arg2 - local30.anInt2437 << 8;
					local30.anInt2437 = arg2;
					local30.anInt2447 = local68 - local30.anInt2427;
					return;
				}
			}
		}
		@Pc(113) Class2_Sub13 local113 = (Class2_Sub13) this.aClass41_11.method1056((long) this.anIntArray289[arg1]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class2_Sub16_Sub1 local121 = local113.aClass2_Sub16_Sub1Array1[arg2];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class2_Sub15 local128 = new Class2_Sub15();
		local128.anInt2431 = arg1;
		local128.aClass2_Sub16_Sub1_1 = local121;
		local128.aClass2_Sub13_1 = local113;
		local128.aClass38_1 = local113.aClass38Array1[arg2];
		local128.anInt2440 = local113.aByteArray31[arg2];
		local128.anInt2437 = arg2;
		local128.anInt2445 = local113.anInt2000 * arg0 * arg0 * local113.aByteArray30[arg2] + 1024 >> 11;
		local128.anInt2442 = local113.aByteArray29[arg2] & 0xFF;
		local128.anInt2427 = (arg2 << 8) - (local113.aShortArray10[arg2] & 0x7FFF);
		local128.anInt2429 = 0;
		local128.anInt2426 = 0;
		local128.anInt2454 = 0;
		local128.anInt2435 = 0;
		local128.anInt2441 = -1;
		if (this.anIntArray295[arg1] == 0) {
			local128.aClass2_Sub2_Sub4_3 = Static133.method1560(local121, this.method1368(local128), this.method1377(local128), this.method1383(local128));
		} else {
			local128.aClass2_Sub2_Sub4_3 = Static133.method1560(local121, this.method1368(local128), 0, this.method1383(local128));
			this.method1374(local113.aShortArray10[arg2] < 0, local128);
		}
		if (local113.aShortArray10[arg2] < 0) {
			local128.aClass2_Sub2_Sub4_3.method1551(-1);
		}
		if (local128.anInt2440 >= 0) {
			@Pc(282) Class2_Sub15 local282 = this.aClass2_Sub15ArrayArray2[arg1][local128.anInt2440];
			if (local282 != null && local282.anInt2441 < 0) {
				this.aClass2_Sub15ArrayArray1[arg1][local282.anInt2437] = null;
				local282.anInt2441 = 0;
			}
			this.aClass2_Sub15ArrayArray2[arg1][local128.anInt2440] = local128;
		}
		this.aClass2_Sub2_Sub1_1.aClass58_1.method1294(local128);
		this.aClass2_Sub15ArrayArray1[arg1][arg2] = local128;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(ZII)V")
	private void method1365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray301[arg0] = arg1;
		this.anIntArray300[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	private void method1366(@OriginalArg(1) int arg0) {
		if ((this.anIntArray291[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(20) Class2_Sub15 local20 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1285(); local20 != null; local20 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1281()) {
			if (local20.anInt2431 == arg0 && this.aClass2_Sub15ArrayArray1[arg0][local20.anInt2437] == null && local20.anInt2441 < 0) {
				local20.anInt2441 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZLclient!kf;)V")
	public synchronized void method1367(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		this.method1379();
		this.aClass36_1.method981(arg1.aByteArray26);
		this.aBoolean166 = arg0;
		this.aLong71 = 0L;
		@Pc(23) int local23 = this.aClass36_1.method973();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass36_1.method972(local25);
			this.aClass36_1.method974(local25);
			this.aClass36_1.method983(local25);
		}
		this.anInt2265 = this.aClass36_1.method978();
		this.anInt2264 = this.aClass36_1.anIntArray214[this.anInt2265];
		this.aLong72 = this.aClass36_1.method979(this.anInt2264);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!qc;I)I")
	private int method1368(@OriginalArg(0) Class2_Sub15 arg0) {
		@Pc(14) int local14 = (arg0.anInt2447 * arg0.anInt2446 >> 12) + arg0.anInt2427;
		@Pc(22) Class38 local22 = arg0.aClass38_1;
		local14 += (this.anIntArray297[arg0.anInt2431] - 8192) * this.anIntArray292[arg0.anInt2431] >> 12;
		@Pc(63) int local63;
		if (local22.anInt1727 > 0 && (local22.anInt1733 > 0 || this.anIntArray294[arg0.anInt2431] > 0)) {
			local63 = local22.anInt1733 << 2;
			@Pc(68) int local68 = local22.anInt1729 << 1;
			if (local68 > arg0.anInt2444) {
				local63 = local63 * arg0.anInt2444 / local68;
			}
			local63 += this.anIntArray294[arg0.anInt2431] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt2443 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local63 * local102);
		}
		local63 = (int) ((double) (arg0.aClass2_Sub16_Sub1_1.anInt2504 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static35.anInt1167 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
	private void method1370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	private void method1371(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local5 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1363(local24, local30, local18);
		} else if (local5 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1363(local24, 64, local18);
			} else {
				this.method1364(local30, local18, local24);
			}
		} else if (local5 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method1380(local30, local18, local24);
		} else if (local5 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray303[local18] = (this.anIntArray303[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray303[local18] = (local30 << 7) + (this.anIntArray303[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray294[local18] = (this.anIntArray294[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray294[local18] = (this.anIntArray294[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray304[local18] = (this.anIntArray304[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray304[local18] = local30 + (this.anIntArray304[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray296[local18] = (local30 << 7) + (this.anIntArray296[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray296[local18] = local30 + (this.anIntArray296[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray290[local18] = (this.anIntArray290[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray290[local18] = local30 + (this.anIntArray290[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray298[local18] = (local30 << 7) + (this.anIntArray298[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray298[local18] = (this.anIntArray298[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray291[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray291[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1366(local18);
					this.anIntArray291[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray291[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray299[local18] = (local30 << 7) + (this.anIntArray299[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray299[local18] = (this.anIntArray299[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray299[local18] = (local30 << 7) + ((this.anIntArray299[local18] & 0x7F) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray299[local18] = (this.anIntArray299[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1386(local18);
			}
			if (local24 == 121) {
				this.method1373(local18);
			}
			if (local24 == 123) {
				this.method1375(local18);
			}
			@Pc(499) int local499;
			if (local24 == 6) {
				local499 = this.anIntArray299[local18];
				if (local499 == 16384) {
					this.anIntArray292[local18] = (this.anIntArray292[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local499 = this.anIntArray299[local18];
				if (local499 == 16384) {
					this.anIntArray292[local18] = local30 + (this.anIntArray292[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray295[local18] = (local30 << 7) + (this.anIntArray295[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray295[local18] = local30 + (this.anIntArray295[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray291[local18] |= 0x4;
				} else {
					this.method1393(local18);
					this.anIntArray291[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1365(local18, (this.anIntArray301[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method1365(local18, (this.anIntArray301[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local5 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1391(this.anIntArray303[local18] + local24, local18);
		} else if (local5 == 208) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method1370(local18, local24);
		} else if (local5 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1384(local18, local24);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method1385();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIB)V")
	public synchronized void method1372() {
		this.method1382();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(II)V")
	private void method1373(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1373(local9);
			}
			return;
		}
		this.anIntArray296[arg0] = 12800;
		this.anIntArray290[arg0] = 8192;
		this.anIntArray298[arg0] = 16383;
		this.anIntArray297[arg0] = 8192;
		this.anIntArray294[arg0] = 0;
		this.anIntArray304[arg0] = 8192;
		this.method1366(arg0);
		this.method1393(arg0);
		this.anIntArray291[arg0] = 0;
		this.anIntArray299[arg0] = 32767;
		this.anIntArray292[arg0] = 256;
		this.anIntArray295[arg0] = 0;
		this.method1365(arg0, 8192);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLclient!qc;B)V")
	public void method1374(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub15 arg1) {
		@Pc(15) int local15 = arg1.aClass2_Sub16_Sub1_1.aByteArray35.length;
		@Pc(43) int local43;
		if (arg0 && arg1.aClass2_Sub16_Sub1_1.aBoolean180) {
			@Pc(30) int local30 = local15 + local15 - arg1.aClass2_Sub16_Sub1_1.anInt2505;
			local43 = (int) ((long) local30 * (long) this.anIntArray295[arg1.anInt2431] >> 6);
			local15 <<= 0x8;
			if (local15 <= local43) {
				local43 = local15 + local15 - local43 - 1;
				arg1.aClass2_Sub2_Sub4_3.method1543();
			}
		} else {
			local43 = (int) ((long) this.anIntArray295[arg1.anInt2431] * (long) local15 >> 6);
		}
		arg1.aClass2_Sub2_Sub4_3.method1544(local43);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
	private void method1375(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub15 local6 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1285(); local6 != null; local6 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1281()) {
			if ((arg0 < 0 || arg0 == local6.anInt2431) && local6.anInt2441 < 0) {
				this.aClass2_Sub15ArrayArray1[local6.anInt2431][local6.anInt2437] = null;
				local6.anInt2441 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!qc;B)Z")
	public boolean method1376(@OriginalArg(0) Class2_Sub15 arg0) {
		arg0.anInt2448 = Static35.anInt1167 / 100;
		if (arg0.anInt2441 >= 0 && (arg0.aClass2_Sub2_Sub4_3 == null || arg0.aClass2_Sub2_Sub4_3.method1531())) {
			arg0.method1461();
			arg0.method1961();
			if (arg0.anInt2440 > 0 && this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] == arg0) {
				this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] = null;
			}
			return true;
		}
		@Pc(63) int local63 = arg0.anInt2446;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray304[arg0.anInt2431] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg0.anInt2446 = local63;
		}
		arg0.aClass2_Sub2_Sub4_3.method1550(this.method1368(arg0));
		arg0.anInt2444++;
		@Pc(108) boolean local108 = false;
		@Pc(111) Class38 local111 = arg0.aClass38_1;
		arg0.anInt2443 += local111.anInt1727;
		@Pc(137) double local137 = (double) ((arg0.anInt2437 - 60 << 8) + (arg0.anInt2446 * arg0.anInt2447 >> 12)) * 5.086263020833333E-6D;
		if (local111.anInt1730 > 0) {
			if (local111.anInt1743 > 0) {
				arg0.anInt2435 += (int) (Math.pow(2.0D, (double) local111.anInt1743 * local137) * 128.0D + 0.5D);
			} else {
				arg0.anInt2435 += 128;
			}
		}
		if (local111.aByteArray24 != null) {
			if (local111.anInt1742 > 0) {
				arg0.anInt2454 += (int) (Math.pow(2.0D, local137 * (double) local111.anInt1742) * 128.0D + 0.5D);
			} else {
				arg0.anInt2454 += 128;
			}
			while (local111.aByteArray24.length - 2 > arg0.anInt2429 && (local111.aByteArray24[arg0.anInt2429 + 2] & 0xFF) << 8 < arg0.anInt2454) {
				arg0.anInt2429 += 2;
			}
			if (local111.aByteArray24.length - 2 == arg0.anInt2429 && local111.aByteArray24[arg0.anInt2429 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg0.anInt2441 >= 0 && local111.aByteArray25 != null && (this.anIntArray291[arg0.anInt2431] & 0x1) == 0 && (arg0.anInt2440 < 0 || this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] != arg0)) {
			if (local111.anInt1728 > 0) {
				arg0.anInt2441 += (int) (Math.pow(2.0D, (double) local111.anInt1728 * local137) * 128.0D + 0.5D);
			} else {
				arg0.anInt2441 += 128;
			}
			while (arg0.anInt2426 < local111.aByteArray25.length - 2 && arg0.anInt2441 > (local111.aByteArray25[arg0.anInt2426 + 2] & 0xFF) << 8) {
				arg0.anInt2426 += 2;
			}
			if (arg0.anInt2426 == local111.aByteArray25.length - 2) {
				local108 = true;
			}
		}
		if (!local108) {
			arg0.aClass2_Sub2_Sub4_3.method1536(arg0.anInt2448, this.method1377(arg0), this.method1383(arg0));
			return false;
		}
		arg0.aClass2_Sub2_Sub4_3.method1533(arg0.anInt2448);
		if (arg0.aClass2_Sub2_Sub4_3.method1540()) {
			this.aClass2_Sub2_Sub1_1.aClass2_Sub2_Sub2_1.method1231(arg0.aClass2_Sub2_Sub4_3);
		}
		arg0.method1461();
		if (arg0.anInt2441 >= 0) {
			arg0.method1961();
			if (arg0.anInt2440 > 0 && arg0 == this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440]) {
				this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!qc;)I")
	private int method1377(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(6) Class38 local6 = arg0.aClass38_1;
		@Pc(22) int local22 = this.anIntArray298[arg0.anInt2431] * this.anIntArray296[arg0.anInt2431] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt2445 * local30 + 16384 >> 15;
		local22 = this.anInt2239 * local39 + 128 >> 8;
		if (local6.anInt1730 > 0) {
			local22 = (int) (Math.pow(0.5D, (double) local6.anInt1730 * (double) arg0.anInt2435 * 1.953125E-5D) * (double) local22 + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(83) int local83;
		@Pc(104) int local104;
		@Pc(116) int local116;
		if (local6.aByteArray24 != null) {
			local83 = local6.aByteArray24[arg0.anInt2429 + 1];
			local86 = arg0.anInt2454;
			if (local6.aByteArray24.length - 2 > arg0.anInt2429) {
				local104 = (local6.aByteArray24[arg0.anInt2429] & 0xFF) << 8;
				local116 = (local6.aByteArray24[arg0.anInt2429 + 2] & 0xFF) << 8;
				local83 += (local86 - local104) * (local6.aByteArray24[arg0.anInt2429 + 3] - local83) / (local116 - local104);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt2441 > 0 && local6.aByteArray25 != null) {
			local86 = arg0.anInt2441;
			local83 = local6.aByteArray25[arg0.anInt2426 + 1];
			if (local6.aByteArray25.length - 2 > arg0.anInt2426) {
				local116 = (local6.aByteArray25[arg0.anInt2426 + 2] & 0xFF) << 8;
				local104 = (local6.aByteArray25[arg0.anInt2426] & 0xFF) << 8;
				local83 += (local6.aByteArray25[arg0.anInt2426 + 3] - local83) * (local86 - local104) / (local116 - local104);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
	private void method1378() {
		@Pc(8) int local8 = this.anInt2265;
		@Pc(17) long local17 = this.aLong72;
		@Pc(20) int local20 = this.anInt2264;
		while (this.anInt2264 == local20) {
			while (this.aClass36_1.anIntArray214[local8] == local20) {
				this.aClass36_1.method972(local8);
				@Pc(31) int local31 = this.aClass36_1.method969(local8);
				if (local31 == 1) {
					this.aClass36_1.method975();
					this.aClass36_1.method983(local8);
					if (this.aClass36_1.method977()) {
						if (!this.aBoolean166 || local20 == 0) {
							this.method1385();
							this.aClass36_1.method980();
							return;
						}
						this.aClass36_1.method984(local17);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method1371(local31);
				}
				this.aClass36_1.method974(local8);
				this.aClass36_1.method983(local8);
			}
			local8 = this.aClass36_1.method978();
			local20 = this.aClass36_1.anIntArray214[local8];
			local17 = this.aClass36_1.method979(local20);
		}
		this.aLong72 = local17;
		this.anInt2264 = local20;
		this.anInt2265 = local8;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V")
	public synchronized void method1379() {
		this.aClass36_1.method980();
		this.method1385();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZIII)V")
	private void method1380(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Z")
	public synchronized boolean method1381() {
		return this.aClass36_1.method971();
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1524(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass36_1.method971()) {
			@Pc(13) int local13 = this.aClass36_1.anInt1655 * 1000000 / Static35.anInt1167;
			do {
				@Pc(23) long local23 = this.aLong71 + (long) arg2 * (long) local13;
				if (this.aLong72 - local23 >= 0L) {
					this.aLong71 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local13 + this.aLong72 - this.aLong71 - 1L) / (long) local13);
				this.aLong71 += (long) local13 * (long) local52;
				this.aClass2_Sub2_Sub1_1.method1524(arg0, arg1, local52);
				arg2 -= local52;
				this.method1378();
				arg1 += local52;
			} while (this.aClass36_1.method971());
		}
		this.aClass2_Sub2_Sub1_1.method1524(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(ZII)V")
	private void method1382() {
		this.anIntArray293[9] = 128;
		this.anIntArray303[9] = 128;
		this.method1391(128, 9);
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class2_Sub2 method1521() {
		return this.aClass2_Sub2_Sub1_1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()Lclient!kb;")
	@Override
	public synchronized Class2_Sub2 method1518() {
		return null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLclient!qc;)I")
	private int method1383(@OriginalArg(1) Class2_Sub15 arg0) {
		@Pc(15) int local15 = this.anIntArray290[arg0.anInt2431];
		return local15 < 8192 ? local15 * arg0.anInt2442 + 32 >> 6 : 16384 - ((16384 - local15) * (-arg0.anInt2442 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)V")
	private void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray297[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	@Override
	public synchronized int method1520() {
		return 0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	private void method1385() {
		this.method1386(-1);
		this.method1373(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray289[local15] = this.anIntArray293[local15];
		}
		for (@Pc(44) int local44 = 0; local44 < 16; local44++) {
			this.anIntArray303[local44] = this.anIntArray293[local44] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V")
	private void method1386(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub15 local12 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1285(); local12 != null; local12 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1281()) {
			if (arg0 < 0 || local12.anInt2431 == arg0) {
				if (local12.aClass2_Sub2_Sub4_3 != null) {
					local12.aClass2_Sub2_Sub4_3.method1533(Static35.anInt1167 / 100);
					if (local12.aClass2_Sub2_Sub4_3.method1540()) {
						this.aClass2_Sub2_Sub1_1.aClass2_Sub2_Sub2_1.method1231(local12.aClass2_Sub2_Sub4_3);
					}
					local12.method1461();
				}
				if (local12.anInt2441 < 0) {
					this.aClass2_Sub15ArrayArray1[local12.anInt2431][local12.anInt2437] = null;
				}
				local12.method1961();
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!qc;)Z")
	public boolean method1387(@OriginalArg(1) Class2_Sub15 arg0) {
		if (arg0.aClass2_Sub2_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt2441 >= 0) {
			arg0.method1961();
			if (arg0.anInt2440 > 0 && this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] == arg0) {
				this.aClass2_Sub15ArrayArray2[arg0.anInt2431][arg0.anInt2440] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V")
	public synchronized void method1388() {
		for (@Pc(11) Class2_Sub13 local11 = (Class2_Sub13) this.aClass41_11.method1061(); local11 != null; local11 = (Class2_Sub13) this.aClass41_11.method1058()) {
			local11.method1961();
		}
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(II)V")
	public synchronized void method1389(@OriginalArg(1) int arg0) {
		this.anInt2239 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	public int method1390() {
		return this.anInt2239;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIZ)V")
	private void method1391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray289[arg1] != arg0) {
			this.anIntArray289[arg1] = arg0;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass2_Sub15ArrayArray2[arg1][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!kf;IILclient!ff;Lclient!ob;)Z")
	public synchronized boolean method1392(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(3) Class11 arg1, @OriginalArg(4) Class55 arg2) {
		arg0.method1088();
		@Pc(21) int[] local21 = new int[] { 22050 };
		@Pc(23) boolean local23 = true;
		for (@Pc(37) Class2_Sub14 local37 = (Class2_Sub14) arg0.aClass41_8.method1061(); local37 != null; local37 = (Class2_Sub14) arg0.aClass41_8.method1058()) {
			@Pc(43) int local43 = (int) local37.aLong91;
			@Pc(51) Class2_Sub13 local51 = (Class2_Sub13) this.aClass41_11.method1056((long) local43);
			if (local51 == null) {
				local51 = Static114.method1861(local43, arg1);
				if (local51 == null) {
					local23 = false;
					continue;
				}
				this.aClass41_11.method1063(local51, (long) local43);
			}
			if (!local51.method1210(local21, local37.aByteArray32, arg2)) {
				local23 = false;
			}
		}
		if (local23) {
			arg0.method1089();
		}
		return local23;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)V")
	private void method1393(@OriginalArg(0) int arg0) {
		if ((this.anIntArray291[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class2_Sub15 local22 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1285(); local22 != null; local22 = (Class2_Sub15) this.aClass2_Sub2_Sub1_1.aClass58_1.method1281()) {
			if (arg0 == local22.anInt2431) {
				local22.anInt2436 = 0;
			}
		}
	}
}
