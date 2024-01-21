import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class6_Sub6_Sub4 extends Class6_Sub6 {

	@OriginalMember(owner = "client!tc", name = "Xb", descriptor = "I")
	private int anInt2956;

	@OriginalMember(owner = "client!tc", name = "ac", descriptor = "J")
	private long aLong79;

	@OriginalMember(owner = "client!tc", name = "bc", descriptor = "J")
	private long aLong80;

	@OriginalMember(owner = "client!tc", name = "ec", descriptor = "Z")
	private boolean aBoolean158;

	@OriginalMember(owner = "client!tc", name = "hc", descriptor = "I")
	private int anInt2959;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "[I")
	private final int[] anIntArray322 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Y", descriptor = "[I")
	private final int[] anIntArray324 = new int[16];

	@OriginalMember(owner = "client!tc", name = "kb", descriptor = "[I")
	private final int[] anIntArray325 = new int[16];

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "[I")
	private final int[] anIntArray327 = new int[16];

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "[I")
	private final int[] anIntArray328 = new int[16];

	@OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
	private final int[] anIntArray323 = new int[16];

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "[I")
	public final int[] anIntArray326 = new int[16];

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "[I")
	public final int[] anIntArray329 = new int[16];

	@OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
	private int anInt2940 = 256;

	@OriginalMember(owner = "client!tc", name = "Jb", descriptor = "[[Lclient!pa;")
	private final Class6_Sub13[][] aClass6_Sub13ArrayArray1 = new Class6_Sub13[16][128];

	@OriginalMember(owner = "client!tc", name = "Kb", descriptor = "[I")
	public final int[] anIntArray332 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Qb", descriptor = "[I")
	private final int[] anIntArray334 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Rb", descriptor = "[I")
	private final int[] anIntArray335 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Mb", descriptor = "[[Lclient!pa;")
	private final Class6_Sub13[][] aClass6_Sub13ArrayArray2 = new Class6_Sub13[16][128];

	@OriginalMember(owner = "client!tc", name = "Fb", descriptor = "[I")
	private final int[] anIntArray330 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Lb", descriptor = "[I")
	private final int[] anIntArray333 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Ib", descriptor = "[I")
	private final int[] anIntArray331 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Vb", descriptor = "[I")
	private final int[] anIntArray336 = new int[16];

	@OriginalMember(owner = "client!tc", name = "Z", descriptor = "Lclient!u;")
	private final Class69 aClass69_1 = new Class69();

	@OriginalMember(owner = "client!tc", name = "gc", descriptor = "Lclient!qc;")
	private final Class6_Sub6_Sub3 aClass6_Sub6_Sub3_1 = new Class6_Sub6_Sub3(this);

	@OriginalMember(owner = "client!tc", name = "jb", descriptor = "Lclient!aa;")
	private final Class2 aClass2_11 = new Class2(128);

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
	public Class6_Sub6_Sub4() {
		this.method1923();
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	private void method1920() {
		@Pc(12) int local12 = this.anInt2956;
		@Pc(15) long local15 = this.aLong80;
		@Pc(18) int local18 = this.anInt2959;
		while (local18 == this.anInt2959) {
			while (this.aClass69_1.anIntArray346[local12] == local18) {
				this.aClass69_1.method2007(local12);
				@Pc(29) int local29 = this.aClass69_1.method2019(local12);
				if (local29 == 1) {
					this.aClass69_1.method2020();
					this.aClass69_1.method2014(local12);
					if (this.aClass69_1.method2016()) {
						if (!this.aBoolean158 || local18 == 0) {
							this.method1923();
							this.aClass69_1.method2012();
							return;
						}
						this.aClass69_1.method2008(local15);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method1950(local29);
				}
				this.aClass69_1.method2009(local12);
				this.aClass69_1.method2014(local12);
			}
			local12 = this.aClass69_1.method2005();
			local18 = this.aClass69_1.anIntArray346[local12];
			local15 = this.aClass69_1.method2006(local18);
		}
		this.anInt2956 = local12;
		this.anInt2959 = local18;
		this.aLong80 = local15;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)I")
	public int method1922() {
		return this.anInt2940;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	private void method1923() {
		this.method1938(-1);
		this.method1939(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray322[local21] = this.anIntArray328[local21];
		}
		for (@Pc(37) int local37 = 0; local37 < 16; local37++) {
			this.anIntArray336[local37] = this.anIntArray328[local37] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()Lclient!kf;")
	@Override
	public synchronized Class6_Sub6 method1913() {
		return this.aClass6_Sub6_Sub3_1;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)V")
	public synchronized void method1925(@OriginalArg(0) int arg0) {
		this.anInt2940 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(III)V")
	private void method1926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray330[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()I")
	@Override
	public synchronized int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(III)V")
	public synchronized void method1927() {
		this.method1936();
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V")
	public synchronized void method1928() {
		for (@Pc(16) Class6_Sub10 local16 = (Class6_Sub10) this.aClass2_11.method25(); local16 != null; local16 = (Class6_Sub10) this.aClass2_11.method21()) {
			local16.method1191();
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(III)V")
	private void method1929(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray323[arg1] = arg0;
		this.anIntArray326[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
	public synchronized void method1930() {
		this.aClass69_1.method2012();
		this.method1923();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!pa;B)Z")
	public boolean method1931(@OriginalArg(0) Class6_Sub13 arg0) {
		arg0.anInt2408 = Static73.anInt2059 / 100;
		if (arg0.anInt2399 >= 0 && (arg0.aClass6_Sub6_Sub1_1 == null || arg0.aClass6_Sub6_Sub1_1.method779())) {
			arg0.method1568();
			arg0.method2123();
			if (arg0.anInt2394 > 0 && this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] == arg0) {
				this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg0.anInt2406;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray334[arg0.anInt2392] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg0.anInt2406 = local58;
		}
		arg0.aClass6_Sub6_Sub1_1.method786(this.method1943(arg0));
		arg0.anInt2391++;
		@Pc(104) Class42 local104 = arg0.aClass42_1;
		arg0.anInt2401 += local104.anInt1841;
		@Pc(129) double local129 = (double) ((arg0.anInt2406 * arg0.anInt2403 >> 12) + (arg0.anInt2389 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(131) boolean local131 = false;
		if (local104.anInt1839 > 0) {
			if (local104.anInt1834 <= 0) {
				arg0.anInt2390 += 128;
			} else {
				arg0.anInt2390 += (int) (Math.pow(2.0D, local129 * (double) local104.anInt1834) * 128.0D + 0.5D);
			}
		}
		if (local104.aByteArray26 != null) {
			if (local104.anInt1840 <= 0) {
				arg0.anInt2396 += 128;
			} else {
				arg0.anInt2396 += (int) (Math.pow(2.0D, local129 * (double) local104.anInt1840) * 128.0D + 0.5D);
			}
			while (local104.aByteArray26.length - 2 > arg0.anInt2415 && arg0.anInt2396 > (local104.aByteArray26[arg0.anInt2415 + 2] & 0xFF) << 8) {
				arg0.anInt2415 += 2;
			}
			if (arg0.anInt2415 == local104.aByteArray26.length - 2 && local104.aByteArray26[arg0.anInt2415 + 1] == 0) {
				local131 = true;
			}
		}
		if (arg0.anInt2399 >= 0 && local104.aByteArray25 != null && (this.anIntArray329[arg0.anInt2392] & 0x1) == 0 && (arg0.anInt2394 < 0 || this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] != arg0)) {
			if (local104.anInt1837 <= 0) {
				arg0.anInt2399 += 128;
			} else {
				arg0.anInt2399 += (int) (Math.pow(2.0D, local129 * (double) local104.anInt1837) * 128.0D + 0.5D);
			}
			while (local104.aByteArray25.length - 2 > arg0.anInt2395 && (local104.aByteArray25[arg0.anInt2395 + 2] & 0xFF) << 8 < arg0.anInt2399) {
				arg0.anInt2395 += 2;
			}
			if (local104.aByteArray25.length - 2 == arg0.anInt2395) {
				local131 = true;
			}
		}
		if (!local131) {
			arg0.aClass6_Sub6_Sub1_1.method773(arg0.anInt2408, this.method1951(arg0), this.method1945(arg0));
			return false;
		}
		arg0.aClass6_Sub6_Sub1_1.method791(arg0.anInt2408);
		if (arg0.aClass6_Sub6_Sub1_1.method785()) {
			this.aClass6_Sub6_Sub3_1.aClass6_Sub6_Sub2_2.method1625(arg0.aClass6_Sub6_Sub1_1);
		}
		arg0.method1568();
		if (arg0.anInt2399 >= 0) {
			arg0.method2123();
			if (arg0.anInt2394 > 0 && this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] == arg0) {
				this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!ac;ZLclient!ge;Lclient!b;)Z")
	public synchronized boolean method1932(@OriginalArg(1) Class4 arg0, @OriginalArg(3) Class7 arg1, @OriginalArg(4) Class6_Sub2 arg2) {
		arg2.method139();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class6_Sub9 local26 = (Class6_Sub9) arg2.aClass2_3.method25(); local26 != null; local26 = (Class6_Sub9) arg2.aClass2_3.method21()) {
			@Pc(32) int local32 = (int) local26.aLong91;
			@Pc(44) Class6_Sub10 local44 = (Class6_Sub10) this.aClass2_11.method20((long) local32);
			if (local44 == null) {
				local44 = Static93.method1701(arg1, local32);
				if (local44 == null) {
					local9 = false;
					continue;
				}
				this.aClass2_11.method18(local44, (long) local32);
			}
			if (!local44.method1193(arg0, local26.aByteArray21, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method138();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		if (this.aClass69_1.method2015()) {
			@Pc(17) int local17 = this.aClass69_1.anInt3002 * 1000000 / Static73.anInt2059;
			do {
				@Pc(26) long local26 = (long) local17 * (long) arg0 + this.aLong79;
				if (this.aLong80 - local26 >= 0L) {
					this.aLong79 = local26;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local17 + this.aLong80 - this.aLong79 - 1L) / (long) local17);
				this.aLong79 += (long) local17 * (long) local56;
				this.aClass6_Sub6_Sub3_1.method1917(local56);
				arg0 -= local56;
				this.method1920();
			} while (this.aClass69_1.method2015());
		}
		this.aClass6_Sub6_Sub3_1.method1917(arg0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1915(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass69_1.method2015()) {
			@Pc(13) int local13 = this.aClass69_1.anInt3002 * 1000000 / Static73.anInt2059;
			do {
				@Pc(22) long local22 = (long) arg2 * (long) local13 + this.aLong79;
				if (this.aLong80 - local22 >= 0L) {
					this.aLong79 = local22;
					break;
				}
				@Pc(50) int local50 = (int) (((long) local13 + this.aLong80 - this.aLong79 - 1L) / (long) local13);
				arg2 -= local50;
				this.aLong79 += (long) local13 * (long) local50;
				this.aClass6_Sub6_Sub3_1.method1915(arg0, arg1, local50);
				arg1 += local50;
				this.method1920();
			} while (this.aClass69_1.method2015());
		}
		this.aClass6_Sub6_Sub3_1.method1915(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)V")
	private void method1933(@OriginalArg(1) int arg0) {
		if ((this.anIntArray329[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class6_Sub13 local25 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method3(); local25 != null; local25 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method14()) {
			if (arg0 == local25.anInt2392 && this.aClass6_Sub13ArrayArray1[arg0][local25.anInt2389] == null && local25.anInt2399 < 0) {
				local25.anInt2399 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "(I)Z")
	public synchronized boolean method1934() {
		return this.aClass69_1.method2015();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZBLclient!b;)V")
	public synchronized void method1935(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class6_Sub2 arg1) {
		this.method1930();
		this.aClass69_1.method2010(arg1.aByteArray1);
		this.aBoolean158 = arg0;
		this.aLong79 = 0L;
		@Pc(29) int local29 = this.aClass69_1.method2011();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass69_1.method2007(local31);
			this.aClass69_1.method2009(local31);
			this.aClass69_1.method2014(local31);
		}
		this.anInt2956 = this.aClass69_1.method2005();
		this.anInt2959 = this.aClass69_1.anIntArray346[this.anInt2956];
		this.aLong80 = this.aClass69_1.method2006(this.anInt2959);
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(III)V")
	private void method1936() {
		this.anIntArray328[9] = 128;
		this.anIntArray336[9] = 128;
		this.method1947(9, 128);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZ)V")
	private void method1937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(IB)V")
	private void method1938(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class6_Sub13 local17 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method3(); local17 != null; local17 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method14()) {
			if (arg0 < 0 || local17.anInt2392 == arg0) {
				if (local17.aClass6_Sub6_Sub1_1 != null) {
					local17.aClass6_Sub6_Sub1_1.method791(Static73.anInt2059 / 100);
					if (local17.aClass6_Sub6_Sub1_1.method785()) {
						this.aClass6_Sub6_Sub3_1.aClass6_Sub6_Sub2_2.method1625(local17.aClass6_Sub6_Sub1_1);
					}
					local17.method1568();
				}
				if (local17.anInt2399 < 0) {
					this.aClass6_Sub13ArrayArray1[local17.anInt2392][local17.anInt2389] = null;
				}
				local17.method2123();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)V")
	private void method1939(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1939(local12);
			}
			return;
		}
		this.anIntArray325[arg0] = 12800;
		this.anIntArray327[arg0] = 8192;
		this.anIntArray333[arg0] = 16383;
		this.anIntArray330[arg0] = 8192;
		this.anIntArray335[arg0] = 0;
		this.anIntArray334[arg0] = 8192;
		this.method1933(arg0);
		this.method1948(arg0);
		this.anIntArray329[arg0] = 0;
		this.anIntArray331[arg0] = 32767;
		this.anIntArray324[arg0] = 256;
		this.anIntArray332[arg0] = 0;
		this.method1929(8192, arg0);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Lclient!pa;B)Z")
	public boolean method1940(@OriginalArg(0) Class6_Sub13 arg0) {
		if (arg0.aClass6_Sub6_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt2399 >= 0) {
			arg0.method2123();
			if (arg0.anInt2394 > 0 && this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] == arg0) {
				this.aClass6_Sub13ArrayArray2[arg0.anInt2392][arg0.anInt2394] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	private void method1941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!pa;Z)V")
	public void method1942(@OriginalArg(1) Class6_Sub13 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass6_Sub11_Sub1_1.aByteArray34.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass6_Sub11_Sub1_1.aBoolean154) {
			@Pc(46) int local46 = local4 + local4 - arg0.aClass6_Sub11_Sub1_1.anInt2866;
			local4 <<= 0x8;
			local35 = (int) ((long) local46 * (long) this.anIntArray332[arg0.anInt2392] >> 6);
			if (local35 >= local4) {
				arg0.aClass6_Sub6_Sub1_1.method795();
				local35 = local4 + local4 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) local4 * (long) this.anIntArray332[arg0.anInt2392] >> 6);
		}
		arg0.aClass6_Sub6_Sub1_1.method760(local35);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!pa;)I")
	private int method1943(@OriginalArg(1) Class6_Sub13 arg0) {
		@Pc(7) Class42 local7 = arg0.aClass42_1;
		@Pc(22) int local22 = arg0.anInt2393 + (arg0.anInt2403 * arg0.anInt2406 >> 12);
		local22 += (this.anIntArray330[arg0.anInt2392] - 8192) * this.anIntArray324[arg0.anInt2392] >> 12;
		@Pc(60) int local60;
		if (local7.anInt1841 > 0 && (local7.anInt1843 > 0 || this.anIntArray335[arg0.anInt2392] > 0)) {
			local60 = local7.anInt1843 << 2;
			@Pc(65) int local65 = local7.anInt1836 << 1;
			if (arg0.anInt2391 < local65) {
				local60 = arg0.anInt2391 * local60 / local65;
			}
			local60 += this.anIntArray335[arg0.anInt2392] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt2401 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) (local95 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass6_Sub11_Sub1_1.anInt2865 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static73.anInt2059 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIB)V")
	private void method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1952(64, arg1, arg2);
		if ((this.anIntArray329[arg2] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub13 local28 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method5(); local28 != null; local28 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method1()) {
				if (local28.anInt2392 == arg2 && local28.anInt2399 < 0) {
					this.aClass6_Sub13ArrayArray1[arg2][local28.anInt2389] = null;
					this.aClass6_Sub13ArrayArray1[arg2][arg1] = local28;
					@Pc(71) int local71 = local28.anInt2393 + (local28.anInt2403 * local28.anInt2406 >> 12);
					local28.anInt2406 = 4096;
					local28.anInt2393 += arg1 - local28.anInt2389 << 8;
					local28.anInt2389 = arg1;
					local28.anInt2403 = local71 - local28.anInt2393;
					return;
				}
			}
		}
		@Pc(116) Class6_Sub10 local116 = (Class6_Sub10) this.aClass2_11.method20((long) this.anIntArray322[arg2]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class6_Sub11_Sub1 local124 = local116.aClass6_Sub11_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class6_Sub13 local131 = new Class6_Sub13();
		local131.anInt2392 = arg2;
		local131.aClass6_Sub10_1 = local116;
		local131.aClass6_Sub11_Sub1_1 = local124;
		local131.aClass42_1 = local116.aClass42Array1[arg1];
		local131.anInt2394 = local116.aByteArray24[arg1];
		local131.anInt2389 = arg1;
		local131.anInt2404 = arg0 * arg0 * local116.anInt1807 * local116.aByteArray22[arg1] + 1024 >> 11;
		local131.anInt2398 = local116.aByteArray23[arg1] & 0xFF;
		local131.anInt2393 = (arg1 << 8) - (local116.aShortArray10[arg1] & 0x7FFF);
		local131.anInt2390 = 0;
		local131.anInt2395 = 0;
		local131.anInt2396 = 0;
		local131.anInt2415 = 0;
		local131.anInt2399 = -1;
		if (this.anIntArray332[arg2] == 0) {
			local131.aClass6_Sub6_Sub1_1 = Static126.method793(local124, this.method1943(local131), this.method1951(local131), this.method1945(local131));
		} else {
			local131.aClass6_Sub6_Sub1_1 = Static126.method793(local124, this.method1943(local131), 0, this.method1945(local131));
			this.method1942(local131, local116.aShortArray10[arg1] < 0);
		}
		if (local116.aShortArray10[arg1] < 0) {
			local131.aClass6_Sub6_Sub1_1.method784(-1);
		}
		if (local131.anInt2394 >= 0) {
			@Pc(290) Class6_Sub13 local290 = this.aClass6_Sub13ArrayArray2[arg2][local131.anInt2394];
			if (local290 != null && local290.anInt2399 < 0) {
				this.aClass6_Sub13ArrayArray1[arg2][local290.anInt2389] = null;
				local290.anInt2399 = 0;
			}
			this.aClass6_Sub13ArrayArray2[arg2][local131.anInt2394] = local131;
		}
		this.aClass6_Sub6_Sub3_1.aClass1_8.method10(local131);
		this.aClass6_Sub13ArrayArray1[arg2][arg1] = local131;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()Lclient!kf;")
	@Override
	public synchronized Class6_Sub6 method1918() {
		return null;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(BLclient!pa;)I")
	private int method1945(@OriginalArg(1) Class6_Sub13 arg0) {
		@Pc(13) int local13 = this.anIntArray327[arg0.anInt2392];
		return local13 >= 8192 ? 16384 - ((128 - arg0.anInt2398) * (-local13 + 16384) + 32 >> 6) : arg0.anInt2398 * local13 - -32 >> 6;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(IB)V")
	private void method1946(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class6_Sub13 local12 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method3(); local12 != null; local12 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method14()) {
			if ((arg0 < 0 || arg0 == local12.anInt2392) && local12.anInt2399 < 0) {
				this.aClass6_Sub13ArrayArray1[local12.anInt2392][local12.anInt2389] = null;
				local12.anInt2399 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "(III)V")
	private void method1947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray322[arg0]) {
			this.anIntArray322[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass6_Sub13ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)V")
	private void method1948(@OriginalArg(0) int arg0) {
		if ((this.anIntArray329[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class6_Sub13 local23 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method3(); local23 != null; local23 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method14()) {
			if (local23.anInt2392 == arg0) {
				local23.anInt2407 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(Z)V")
	public synchronized void method1949() {
		for (@Pc(7) Class6_Sub10 local7 = (Class6_Sub10) this.aClass2_11.method25(); local7 != null; local7 = (Class6_Sub10) this.aClass2_11.method21()) {
			local7.method2123();
		}
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(II)V")
	private void method1950(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1952(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 >> 8 & 0x7F;
			if (local30 > 0) {
				this.method1944(local30, local24, local18);
			} else {
				this.method1952(64, local24, local18);
			}
		} else if (local9 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			local18 = arg0 & 0xF;
			this.method1941(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray336[local18] = (this.anIntArray336[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray336[local18] = (local30 << 7) + (this.anIntArray336[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray335[local18] = (this.anIntArray335[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray335[local18] = (this.anIntArray335[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray334[local18] = (local30 << 7) + (this.anIntArray334[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray334[local18] = (this.anIntArray334[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray325[local18] = (local30 << 7) + (this.anIntArray325[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray325[local18] = local30 + (this.anIntArray325[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray327[local18] = (this.anIntArray327[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray327[local18] = local30 + (this.anIntArray327[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray333[local18] = (local30 << 7) + (this.anIntArray333[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray333[local18] = local30 + (this.anIntArray333[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray329[local18] |= 0x1;
				} else {
					this.anIntArray329[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1933(local18);
					this.anIntArray329[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray329[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray331[local18] = (this.anIntArray331[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray331[local18] = (this.anIntArray331[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray331[local18] = (this.anIntArray331[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray331[local18] = (this.anIntArray331[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method1938(local18);
			}
			if (local24 == 121) {
				this.method1939(local18);
			}
			if (local24 == 123) {
				this.method1946(local18);
			}
			@Pc(499) int local499;
			if (local24 == 6) {
				local499 = this.anIntArray331[local18];
				if (local499 == 16384) {
					this.anIntArray324[local18] = (this.anIntArray324[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local499 = this.anIntArray331[local18];
				if (local499 == 16384) {
					this.anIntArray324[local18] = (this.anIntArray324[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray332[local18] = (local30 << 7) + (this.anIntArray332[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray332[local18] = (this.anIntArray332[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray329[local18] |= 0x4;
				} else {
					this.method1948(local18);
					this.anIntArray329[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1929((this.anIntArray323[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method1929((this.anIntArray323[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1947(local18, this.anIntArray336[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1937(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1926(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1923();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!pa;)I")
	private int method1951(@OriginalArg(1) Class6_Sub13 arg0) {
		@Pc(6) Class42 local6 = arg0.aClass42_1;
		@Pc(28) int local28 = this.anIntArray325[arg0.anInt2392] * this.anIntArray333[arg0.anInt2392] + 4096 >> 13;
		@Pc(36) int local36 = local28 * local28 + 16384 >> 15;
		@Pc(45) int local45 = local36 * arg0.anInt2404 + 16384 >> 15;
		local28 = local45 * this.anInt2940 + 128 >> 8;
		if (local6.anInt1839 > 0) {
			local28 = (int) ((double) local28 * Math.pow(0.5D, (double) local6.anInt1839 * 1.953125E-5D * (double) arg0.anInt2390) + 0.5D);
		}
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(114) int local114;
		@Pc(126) int local126;
		if (local6.aByteArray26 != null) {
			local89 = local6.aByteArray26[arg0.anInt2415 + 1];
			local92 = arg0.anInt2396;
			if (local6.aByteArray26.length - 2 > arg0.anInt2415) {
				local114 = (local6.aByteArray26[arg0.anInt2415] & 0xFF) << 8;
				local126 = (local6.aByteArray26[arg0.anInt2415 + 2] & 0xFF) << 8;
				local89 += (local6.aByteArray26[arg0.anInt2415 + 3] - local89) * (local92 - local114) / (local126 - local114);
			}
			local28 = local28 * local89 + 32 >> 6;
		}
		if (arg0.anInt2399 > 0 && local6.aByteArray25 != null) {
			local92 = arg0.anInt2399;
			local89 = local6.aByteArray25[arg0.anInt2395 + 1];
			if (local6.aByteArray25.length - 2 > arg0.anInt2395) {
				local126 = (local6.aByteArray25[arg0.anInt2395 + 2] & 0xFF) << 8;
				local114 = (local6.aByteArray25[arg0.anInt2395] & 0xFF) << 8;
				local89 += (local6.aByteArray25[arg0.anInt2395 + 3] - local89) * (local92 - local114) / (local126 - local114);
			}
			local28 = local89 * local28 + 32 >> 6;
		}
		return local28;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIII)V")
	private void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub13 local8 = this.aClass6_Sub13ArrayArray1[arg2][arg1];
		if (local8 == null) {
			return;
		}
		this.aClass6_Sub13ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray329[arg2] & 0x2) == 0) {
			local8.anInt2399 = 0;
			return;
		}
		for (@Pc(43) Class6_Sub13 local43 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method3(); local43 != null; local43 = (Class6_Sub13) this.aClass6_Sub6_Sub3_1.aClass1_8.method14()) {
			if (local8.anInt2392 == local43.anInt2392 && local43.anInt2399 < 0 && local8 != local43) {
				local8.anInt2399 = 0;
				return;
			}
		}
	}
}
