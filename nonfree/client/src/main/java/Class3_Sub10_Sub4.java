import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class3_Sub10_Sub4 extends Class3_Sub10 {

	@OriginalMember(owner = "client!vc", name = "Zb", descriptor = "J")
	private long aLong89;

	@OriginalMember(owner = "client!vc", name = "ac", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "client!vc", name = "bc", descriptor = "I")
	private int anInt2780;

	@OriginalMember(owner = "client!vc", name = "dc", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!vc", name = "ec", descriptor = "I")
	private int anInt2781;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "[[Lclient!ub;")
	private final Class3_Sub17[][] aClass3_Sub17ArrayArray1 = new Class3_Sub17[16][128];

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	private int anInt2737 = 256;

	@OriginalMember(owner = "client!vc", name = "M", descriptor = "[I")
	private final int[] anIntArray390 = new int[16];

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "[I")
	public final int[] anIntArray387 = new int[16];

	@OriginalMember(owner = "client!vc", name = "U", descriptor = "[I")
	private final int[] anIntArray391 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Y", descriptor = "[I")
	private final int[] anIntArray392 = new int[16];

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "[I")
	private final int[] anIntArray389 = new int[16];

	@OriginalMember(owner = "client!vc", name = "ob", descriptor = "[I")
	private final int[] anIntArray396 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Ab", descriptor = "[[Lclient!ub;")
	private final Class3_Sub17[][] aClass3_Sub17ArrayArray2 = new Class3_Sub17[16][128];

	@OriginalMember(owner = "client!vc", name = "sb", descriptor = "[I")
	private final int[] anIntArray397 = new int[16];

	@OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
	private final int[] anIntArray393 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Kb", descriptor = "[I")
	private final int[] anIntArray399 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Pb", descriptor = "[I")
	private final int[] anIntArray401 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Ob", descriptor = "[I")
	public final int[] anIntArray400 = new int[16];

	@OriginalMember(owner = "client!vc", name = "mb", descriptor = "[I")
	private final int[] anIntArray395 = new int[16];

	@OriginalMember(owner = "client!vc", name = "xb", descriptor = "[I")
	private final int[] anIntArray398 = new int[16];

	@OriginalMember(owner = "client!vc", name = "hb", descriptor = "[I")
	private final int[] anIntArray394 = new int[16];

	@OriginalMember(owner = "client!vc", name = "Sb", descriptor = "[I")
	public final int[] anIntArray402 = new int[16];

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "Lclient!ic;")
	private final Class35 aClass35_1 = new Class35();

	@OriginalMember(owner = "client!vc", name = "cc", descriptor = "Lclient!ne;")
	private final Class3_Sub10_Sub2 aClass3_Sub10_Sub2_1 = new Class3_Sub10_Sub2(this);

	@OriginalMember(owner = "client!vc", name = "Db", descriptor = "Lclient!ud;")
	private final Class77 aClass77_10 = new Class77(128);

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class3_Sub10_Sub4() {
		this.method1897();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	private void method1871(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class3_Sub17 local13 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method189(); local13 != null; local13 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method187()) {
			if ((arg0 < 0 || local13.anInt2557 == arg0) && local13.anInt2568 < 0) {
				this.aClass3_Sub17ArrayArray2[local13.anInt2557][local13.anInt2571] = null;
				local13.anInt2568 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
	private void method1872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray390[arg1]) {
			this.anIntArray390[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub17ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lclient!hb;")
	@Override
	public synchronized Class3_Sub10 method1867() {
		return this.aClass3_Sub10_Sub2_1;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IB)V")
	private void method1873(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1873(local12);
			}
			return;
		}
		this.anIntArray396[arg0] = 12800;
		this.anIntArray391[arg0] = 8192;
		this.anIntArray399[arg0] = 16383;
		this.anIntArray389[arg0] = 8192;
		this.anIntArray398[arg0] = 0;
		this.anIntArray394[arg0] = 8192;
		this.method1877(arg0);
		this.method1883(arg0);
		this.anIntArray402[arg0] = 0;
		this.anIntArray395[arg0] = 32767;
		this.anIntArray401[arg0] = 256;
		this.anIntArray400[arg0] = 0;
		this.method1879(arg0, 8192);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V")
	private void method1874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()Lclient!hb;")
	@Override
	public synchronized Class3_Sub10 method1869() {
		return null;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public synchronized void method1875() {
		for (@Pc(16) Class3_Sub12 local16 = (Class3_Sub12) this.aClass77_10.method1803(); local16 != null; local16 = (Class3_Sub12) this.aClass77_10.method1802()) {
			local16.method1962();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ea;ZB)V")
	public synchronized void method1876(@OriginalArg(0) Class3_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		this.method1887();
		this.aClass35_1.method906(arg0.aByteArray12);
		this.aLong89 = 0L;
		this.aBoolean125 = arg1;
		@Pc(31) int local31 = this.aClass35_1.method903();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass35_1.method898(local33);
			this.aClass35_1.method899(local33);
			this.aClass35_1.method901(local33);
		}
		this.anInt2780 = this.aClass35_1.method894();
		this.anInt2781 = this.aClass35_1.anIntArray156[this.anInt2780];
		this.aLong90 = this.aClass35_1.method902(this.anInt2781);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
	private void method1877(@OriginalArg(1) int arg0) {
		if ((this.anIntArray402[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub17 local18 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method189(); local18 != null; local18 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method187()) {
			if (local18.anInt2557 == arg0 && this.aClass3_Sub17ArrayArray2[arg0][local18.anInt2571] == null && local18.anInt2568 < 0) {
				local18.anInt2568 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V")
	private void method1878(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1895(arg1, 64, arg2);
		if ((this.anIntArray402[arg2] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub17 local25 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method198(); local25 != null; local25 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method196()) {
				if (local25.anInt2557 == arg2 && local25.anInt2568 < 0) {
					this.aClass3_Sub17ArrayArray2[arg2][local25.anInt2571] = null;
					this.aClass3_Sub17ArrayArray2[arg2][arg1] = local25;
					@Pc(64) int local64 = (local25.anInt2566 * local25.anInt2578 >> 12) + local25.anInt2579;
					local25.anInt2566 = 4096;
					local25.anInt2579 += arg1 - local25.anInt2571 << 8;
					local25.anInt2578 = local64 - local25.anInt2579;
					local25.anInt2571 = arg1;
					return;
				}
			}
		}
		@Pc(111) Class3_Sub12 local111 = (Class3_Sub12) this.aClass77_10.method1805((long) this.anIntArray390[arg2]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class3_Sub2_Sub1 local119 = local111.aClass3_Sub2_Sub1Array1[arg1];
		if (local119 == null) {
			return;
		}
		@Pc(131) Class3_Sub17 local131 = new Class3_Sub17();
		local131.aClass3_Sub12_1 = local111;
		local131.aClass3_Sub2_Sub1_1 = local119;
		local131.anInt2557 = arg2;
		local131.aClass51_1 = local111.aClass51Array1[arg1];
		local131.anInt2558 = local111.aByteArray32[arg1];
		local131.anInt2571 = arg1;
		local131.anInt2580 = local111.aByteArray31[arg1] * local111.anInt1663 * arg0 * arg0 + 1024 >> 11;
		local131.anInt2567 = local111.aByteArray33[arg1] & 0xFF;
		local131.anInt2579 = (arg1 << 8) - (local111.aShortArray10[arg1] & 0x7FFF);
		local131.anInt2559 = 0;
		local131.anInt2568 = -1;
		local131.anInt2554 = 0;
		local131.anInt2572 = 0;
		local131.anInt2584 = 0;
		if (this.anIntArray400[arg2] == 0) {
			local131.aClass3_Sub10_Sub3_1 = Static132.method1616(local119, this.method1890(local131), this.method1903(local131), this.method1884(local131));
		} else {
			local131.aClass3_Sub10_Sub3_1 = Static132.method1616(local119, this.method1890(local131), 0, this.method1884(local131));
			this.method1896(local111.aShortArray10[arg1] < 0, local131);
		}
		if (local111.aShortArray10[arg1] < 0) {
			local131.aClass3_Sub10_Sub3_1.method1595(-1);
		}
		if (local131.anInt2558 >= 0) {
			@Pc(283) Class3_Sub17 local283 = this.aClass3_Sub17ArrayArray1[arg2][local131.anInt2558];
			if (local283 != null && local283.anInt2568 < 0) {
				this.aClass3_Sub17ArrayArray2[arg2][local283.anInt2571] = null;
				local283.anInt2568 = 0;
			}
			this.aClass3_Sub17ArrayArray1[arg2][local131.anInt2558] = local131;
		}
		this.aClass3_Sub10_Sub2_1.aClass11_9.method190(local131);
		this.aClass3_Sub17ArrayArray2[arg2][arg1] = local131;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)V")
	private void method1879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray392[arg0] = arg1;
		this.anIntArray387[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V")
	public synchronized void method1880() {
		for (@Pc(17) Class3_Sub12 local17 = (Class3_Sub12) this.aClass77_10.method1803(); local17 != null; local17 = (Class3_Sub12) this.aClass77_10.method1802()) {
			local17.method1131();
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!ub;)Z")
	public boolean method1881(@OriginalArg(1) Class3_Sub17 arg0) {
		if (arg0.aClass3_Sub10_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt2568 >= 0) {
			arg0.method1962();
			if (arg0.anInt2558 > 0 && this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] == arg0) {
				this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)V")
	private void method1883(@OriginalArg(1) int arg0) {
		if ((this.anIntArray402[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub17 local18 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method189(); local18 != null; local18 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method187()) {
			if (local18.anInt2557 == arg0) {
				local18.anInt2555 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ub;Z)I")
	private int method1884(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(9) int local9 = this.anIntArray391[arg0.anInt2557];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (128 - arg0.anInt2567) + 32 >> 6) : local9 * arg0.anInt2567 + 32 >> 6;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V")
	public synchronized void method1886() {
		this.method1894();
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public synchronized void method1887() {
		this.aClass35_1.method895();
		this.method1897();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rd;BLclient!we;ILclient!ea;)Z")
	public synchronized boolean method1888(@OriginalArg(0) Class68 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(4) Class3_Sub6 arg2) {
		arg2.method488();
		@Pc(5) boolean local5 = true;
		@Pc(19) int[] local19 = new int[] { 22050 };
		for (@Pc(37) Class3_Sub14 local37 = (Class3_Sub14) arg2.aClass77_3.method1803(); local37 != null; local37 = (Class3_Sub14) arg2.aClass77_3.method1802()) {
			@Pc(43) int local43 = (int) local37.aLong94;
			@Pc(51) Class3_Sub12 local51 = (Class3_Sub12) this.aClass77_10.method1805((long) local43);
			if (local51 == null) {
				local51 = Static36.method768(local43, arg1);
				if (local51 == null) {
					local5 = false;
					continue;
				}
				this.aClass77_10.method1810(local51, (long) local43);
			}
			if (!local51.method1133(local37.aByteArray45, arg0, local19)) {
				local5 = false;
			}
		}
		if (local5) {
			arg2.method487();
		}
		return local5;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!ub;)I")
	private int method1890(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(6) Class51 local6 = arg0.aClass51_1;
		@Pc(25) int local25 = (arg0.anInt2566 * arg0.anInt2578 >> 12) + arg0.anInt2579;
		local25 += (this.anIntArray389[arg0.anInt2557] - 8192) * this.anIntArray401[arg0.anInt2557] >> 12;
		@Pc(60) int local60;
		if (local6.anInt1860 > 0 && (local6.anInt1852 > 0 || this.anIntArray398[arg0.anInt2557] > 0)) {
			local60 = local6.anInt1852 << 2;
			@Pc(65) int local65 = local6.anInt1864 << 1;
			if (local65 > arg0.anInt2573) {
				local60 = arg0.anInt2573 * local60 / local65;
			}
			local60 += this.anIntArray398[arg0.anInt2557] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt2575 & 0x1FF) * 0.01227184630308513D);
			local25 += (int) ((double) local60 * local99);
		}
		local60 = (int) ((double) (arg0.aClass3_Sub2_Sub1_1.anInt2454 * 256) * Math.pow(2.0D, (double) local25 * 3.255208333333333E-4D) / (double) Static38.anInt1141 + 0.5D);
		return local60 < 1 ? 1 : local60;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(ILclient!ub;)Z")
	public boolean method1892(@OriginalArg(1) Class3_Sub17 arg0) {
		arg0.anInt2564 = Static38.anInt1141 / 100;
		if (arg0.anInt2568 >= 0 && (arg0.aClass3_Sub10_Sub3_1 == null || arg0.aClass3_Sub10_Sub3_1.method1598())) {
			arg0.method1785();
			arg0.method1962();
			if (arg0.anInt2558 > 0 && this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] == arg0) {
				this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] = null;
			}
			return true;
		}
		@Pc(61) int local61 = arg0.anInt2566;
		if (local61 > 0) {
			local61 -= (int) (Math.pow(2.0D, (double) this.anIntArray394[arg0.anInt2557] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local61 < 0) {
				local61 = 0;
			}
			arg0.anInt2566 = local61;
		}
		arg0.aClass3_Sub10_Sub3_1.method1622(this.method1890(arg0));
		arg0.anInt2573++;
		@Pc(118) boolean local118 = false;
		@Pc(136) double local136 = (double) ((arg0.anInt2578 * arg0.anInt2566 >> 12) + (arg0.anInt2571 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(139) Class51 local139 = arg0.aClass51_1;
		arg0.anInt2575 += local139.anInt1860;
		if (local139.anInt1850 > 0) {
			if (local139.anInt1858 <= 0) {
				arg0.anInt2554 += 128;
			} else {
				arg0.anInt2554 += (int) (Math.pow(2.0D, (double) local139.anInt1858 * local136) * 128.0D + 0.5D);
			}
		}
		if (local139.aByteArray42 != null) {
			if (local139.anInt1866 <= 0) {
				arg0.anInt2572 += 128;
			} else {
				arg0.anInt2572 += (int) (Math.pow(2.0D, local136 * (double) local139.anInt1866) * 128.0D + 0.5D);
			}
			while (local139.aByteArray42.length - 2 > arg0.anInt2584 && arg0.anInt2572 > (local139.aByteArray42[arg0.anInt2584 + 2] & 0xFF) << 8) {
				arg0.anInt2584 += 2;
			}
			if (local139.aByteArray42.length - 2 == arg0.anInt2584 && local139.aByteArray42[arg0.anInt2584 + 1] == 0) {
				local118 = true;
			}
		}
		if (arg0.anInt2568 >= 0 && local139.aByteArray41 != null && (this.anIntArray402[arg0.anInt2557] & 0x1) == 0 && (arg0.anInt2558 < 0 || this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] != arg0)) {
			if (local139.anInt1855 <= 0) {
				arg0.anInt2568 += 128;
			} else {
				arg0.anInt2568 += (int) (Math.pow(2.0D, (double) local139.anInt1855 * local136) * 128.0D + 0.5D);
			}
			while (arg0.anInt2559 < local139.aByteArray41.length - 2 && (local139.aByteArray41[arg0.anInt2559 + 2] & 0xFF) << 8 < arg0.anInt2568) {
				arg0.anInt2559 += 2;
			}
			if (arg0.anInt2559 == local139.aByteArray41.length - 2) {
				local118 = true;
			}
		}
		if (!local118) {
			arg0.aClass3_Sub10_Sub3_1.method1613(arg0.anInt2564, this.method1903(arg0), this.method1884(arg0));
			return false;
		}
		arg0.aClass3_Sub10_Sub3_1.method1606(arg0.anInt2564);
		if (arg0.aClass3_Sub10_Sub3_1.method1601()) {
			this.aClass3_Sub10_Sub2_1.aClass3_Sub10_Sub1_2.method862(arg0.aClass3_Sub10_Sub3_1);
		}
		arg0.method1785();
		if (arg0.anInt2568 >= 0) {
			arg0.method1962();
			if (arg0.anInt2558 > 0 && this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] == arg0) {
				this.aClass3_Sub17ArrayArray1[arg0.anInt2557][arg0.anInt2558] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ)V")
	public synchronized void method1893(@OriginalArg(0) int arg0) {
		this.anInt2737 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(III)V")
	private void method1894() {
		this.anIntArray397[9] = 128;
		this.anIntArray393[9] = 128;
		this.method1872(128, 9);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass35_1.method905()) {
			@Pc(13) int local13 = this.aClass35_1.anInt1268 * 1000000 / Static38.anInt1141;
			do {
				@Pc(23) long local23 = this.aLong89 + (long) arg2 * (long) local13;
				if (this.aLong90 - local23 >= 0L) {
					this.aLong89 = local23;
					break;
				}
				@Pc(50) int local50 = (int) (((long) local13 + this.aLong90 - this.aLong89 - 1L) / (long) local13);
				this.aLong89 += (long) local13 * (long) local50;
				this.aClass3_Sub10_Sub2_1.method1870(arg0, arg1, local50);
				this.method1906();
				arg1 += local50;
				arg2 -= local50;
			} while (this.aClass35_1.method905());
		}
		this.aClass3_Sub10_Sub2_1.method1870(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIII)V")
	private void method1895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub17 local8 = this.aClass3_Sub17ArrayArray2[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass3_Sub17ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray402[arg2] & 0x2) == 0) {
			local8.anInt2568 = 0;
			return;
		}
		for (@Pc(43) Class3_Sub17 local43 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method189(); local43 != null; local43 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method187()) {
			if (local8.anInt2557 == local43.anInt2557 && local43.anInt2568 < 0 && local8 != local43) {
				local8.anInt2568 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLclient!ub;)V")
	public void method1896(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub2_Sub1_1.aByteArray52.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass3_Sub2_Sub1_1.aBoolean104) {
			@Pc(27) int local27 = local8 + local8 - arg1.aClass3_Sub2_Sub1_1.anInt2452;
			local8 <<= 0x8;
			local44 = (int) ((long) local27 * (long) this.anIntArray400[arg1.anInt2557] >> 6);
			if (local44 >= local8) {
				local44 = local8 + local8 - local44 - 1;
				arg1.aClass3_Sub10_Sub3_1.method1614();
			}
		} else {
			local44 = (int) ((long) this.anIntArray400[arg1.anInt2557] * (long) local8 >> 6);
		}
		arg1.aClass3_Sub10_Sub3_1.method1607(local44);
	}

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "(I)V")
	private void method1897() {
		this.method1905(-1);
		this.method1873(-1);
		for (@Pc(17) int local17 = 0; local17 < 16; local17++) {
			this.anIntArray390[local17] = this.anIntArray397[local17];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray393[local35] = this.anIntArray397[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBI)V")
	private void method1898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "(I)Z")
	public synchronized boolean method1899() {
		return this.aClass35_1.method905();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)I")
	public int method1900() {
		return this.anInt2737;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(III)V")
	private void method1902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray389[arg1] = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(ILclient!ub;)I")
	private int method1903(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(2) Class51 local2 = arg0.aClass51_1;
		@Pc(18) int local18 = this.anIntArray399[arg0.anInt2557] * this.anIntArray396[arg0.anInt2557] + 4096 >> 13;
		@Pc(26) int local26 = local18 * local18 + 16384 >> 15;
		@Pc(35) int local35 = arg0.anInt2580 * local26 + 16384 >> 15;
		local18 = this.anInt2737 * local35 + 128 >> 8;
		if (local2.anInt1850 > 0) {
			local18 = (int) (Math.pow(0.5D, (double) local2.anInt1850 * (double) arg0.anInt2554 * 1.953125E-5D) * (double) local18 + 0.5D);
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(104) int local104;
		@Pc(116) int local116;
		if (local2.aByteArray42 != null) {
			local78 = arg0.anInt2572;
			local86 = local2.aByteArray42[arg0.anInt2584 + 1];
			if (local2.aByteArray42.length - 2 > arg0.anInt2584) {
				local104 = (local2.aByteArray42[arg0.anInt2584] & 0xFF) << 8;
				local116 = (local2.aByteArray42[arg0.anInt2584 + 2] & 0xFF) << 8;
				local86 += (local78 - local104) * (local2.aByteArray42[arg0.anInt2584 + 3] - local86) / (local116 - local104);
			}
			local18 = local18 * local86 + 32 >> 6;
		}
		if (arg0.anInt2568 > 0 && local2.aByteArray41 != null) {
			local78 = arg0.anInt2568;
			local86 = local2.aByteArray41[arg0.anInt2559 + 1];
			if (arg0.anInt2559 < local2.aByteArray41.length - 2) {
				local116 = (local2.aByteArray41[arg0.anInt2559 + 2] & 0xFF) << 8;
				local104 = (local2.aByteArray41[arg0.anInt2559] & 0xFF) << 8;
				local86 += (local78 - local104) * (local2.aByteArray41[arg0.anInt2559 + 3] - local86) / (local116 - local104);
			}
			local18 = local18 * local86 + 32 >> 6;
		}
		return local18;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1865(@OriginalArg(0) int arg0) {
		if (this.aClass35_1.method905()) {
			@Pc(13) int local13 = this.aClass35_1.anInt1268 * 1000000 / Static38.anInt1141;
			do {
				@Pc(23) long local23 = this.aLong89 + (long) local13 * (long) arg0;
				if (this.aLong90 - local23 >= 0L) {
					this.aLong89 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local13 + this.aLong90 - this.aLong89 - 1L) / (long) local13);
				arg0 -= local52;
				this.aLong89 += (long) local52 * (long) local13;
				this.aClass3_Sub10_Sub2_1.method1865(local52);
				this.method1906();
			} while (this.aClass35_1.method905());
		}
		this.aClass3_Sub10_Sub2_1.method1865(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(II)V")
	private void method1904(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1895(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method1895(local22, 64, local16);
			} else {
				this.method1878(local28, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method1898(local28, local22, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray393[local16] = (local28 << 14) + (this.anIntArray393[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray393[local16] = (this.anIntArray393[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray398[local16] = (this.anIntArray398[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray398[local16] = (this.anIntArray398[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray394[local16] = (this.anIntArray394[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray394[local16] = (this.anIntArray394[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray396[local16] = (this.anIntArray396[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray396[local16] = local28 + (this.anIntArray396[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray391[local16] = (this.anIntArray391[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray391[local16] = local28 + (this.anIntArray391[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray399[local16] = (local28 << 7) + (this.anIntArray399[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray399[local16] = local28 + (this.anIntArray399[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray402[local16] |= 0x1;
				} else {
					this.anIntArray402[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method1877(local16);
					this.anIntArray402[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray402[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray395[local16] = (local28 << 7) + (this.anIntArray395[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray395[local16] = (this.anIntArray395[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray395[local16] = (this.anIntArray395[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray395[local16] = (this.anIntArray395[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method1905(local16);
			}
			if (local22 == 121) {
				this.method1873(local16);
			}
			if (local22 == 123) {
				this.method1871(local16);
			}
			@Pc(505) int local505;
			if (local22 == 6) {
				local505 = this.anIntArray395[local16];
				if (local505 == 16384) {
					this.anIntArray401[local16] = (local28 << 7) + (this.anIntArray401[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local505 = this.anIntArray395[local16];
				if (local505 == 16384) {
					this.anIntArray401[local16] = (this.anIntArray401[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray400[local16] = (local28 << 7) + (this.anIntArray400[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray400[local16] = local28 + (this.anIntArray400[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method1883(local16);
					this.anIntArray402[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray402[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method1879(local16, (local28 << 7) + (this.anIntArray392[local16] & 0xFFFFC07F));
			}
			if (local22 == 49) {
				this.method1879(local16, (this.anIntArray392[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1872(this.anIntArray393[local16] + local22, local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method1874(local16, local22);
		} else if (local9 == 224) {
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			local16 = arg0 & 0xF;
			this.method1902(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1897();
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "()I")
	@Override
	public synchronized int method1866() {
		return 0;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(II)V")
	private void method1905(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub17 local12 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method189(); local12 != null; local12 = (Class3_Sub17) this.aClass3_Sub10_Sub2_1.aClass11_9.method187()) {
			if (arg0 < 0 || local12.anInt2557 == arg0) {
				if (local12.aClass3_Sub10_Sub3_1 != null) {
					local12.aClass3_Sub10_Sub3_1.method1606(Static38.anInt1141 / 100);
					if (local12.aClass3_Sub10_Sub3_1.method1601()) {
						this.aClass3_Sub10_Sub2_1.aClass3_Sub10_Sub1_2.method862(local12.aClass3_Sub10_Sub3_1);
					}
					local12.method1785();
				}
				if (local12.anInt2568 < 0) {
					this.aClass3_Sub17ArrayArray2[local12.anInt2557][local12.anInt2571] = null;
				}
				local12.method1962();
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
	private void method1906() {
		@Pc(4) int local4 = this.anInt2780;
		@Pc(11) long local11 = this.aLong90;
		@Pc(14) int local14 = this.anInt2781;
		while (this.anInt2781 == local14) {
			while (this.aClass35_1.anIntArray156[local4] == local14) {
				this.aClass35_1.method898(local4);
				@Pc(27) int local27 = this.aClass35_1.method892(local4);
				if (local27 == 1) {
					this.aClass35_1.method893();
					this.aClass35_1.method901(local4);
					if (this.aClass35_1.method900()) {
						if (!this.aBoolean125 || local14 == 0) {
							this.method1897();
							this.aClass35_1.method895();
							return;
						}
						this.aClass35_1.method904(local11);
					}
					break;
				}
				if ((local27 & 0x80) != 0) {
					this.method1904(local27);
				}
				this.aClass35_1.method899(local4);
				this.aClass35_1.method901(local4);
			}
			local4 = this.aClass35_1.method894();
			local14 = this.aClass35_1.anIntArray156[local4];
			local11 = this.aClass35_1.method902(local14);
		}
		this.anInt2780 = local4;
		this.anInt2781 = local14;
		this.aLong90 = local11;
	}
}
