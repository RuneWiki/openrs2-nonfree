import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class3_Sub8_Sub4 extends Class3_Sub8 {

	@OriginalMember(owner = "client!hi", name = "Lb", descriptor = "I")
	private int anInt2590;

	@OriginalMember(owner = "client!hi", name = "Mb", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!hi", name = "Nb", descriptor = "J")
	private long aLong101;

	@OriginalMember(owner = "client!hi", name = "Pb", descriptor = "I")
	private int anInt2591;

	@OriginalMember(owner = "client!hi", name = "Qb", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!hi", name = "Sb", descriptor = "I")
	private int anInt2592;

	@OriginalMember(owner = "client!hi", name = "Tb", descriptor = "Lclient!pt;")
	private Class3_Sub35 aClass3_Sub35_1;

	@OriginalMember(owner = "client!hi", name = "Ub", descriptor = "Z")
	private boolean aBoolean193;

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
	private int anInt2545 = 256;

	@OriginalMember(owner = "client!hi", name = "R", descriptor = "[I")
	private final int[] anIntArray262 = new int[16];

	@OriginalMember(owner = "client!hi", name = "P", descriptor = "[I")
	public final int[] anIntArray261 = new int[16];

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "[I")
	private final int[] anIntArray257 = new int[16];

	@OriginalMember(owner = "client!hi", name = "fb", descriptor = "[I")
	public final int[] anIntArray265 = new int[16];

	@OriginalMember(owner = "client!hi", name = "ib", descriptor = "[I")
	private final int[] anIntArray266 = new int[16];

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
	private final int[] anIntArray260 = new int[16];

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "[I")
	private final int[] anIntArray258 = new int[16];

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "[[Lclient!ep;")
	private final Class3_Sub13[][] aClass3_Sub13ArrayArray1 = new Class3_Sub13[16][128];

	@OriginalMember(owner = "client!hi", name = "mb", descriptor = "[I")
	private final int[] anIntArray267 = new int[16];

	@OriginalMember(owner = "client!hi", name = "ab", descriptor = "[[Lclient!ep;")
	private final Class3_Sub13[][] aClass3_Sub13ArrayArray2 = new Class3_Sub13[16][128];

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
	private final int anInt2548 = 1000000;

	@OriginalMember(owner = "client!hi", name = "Y", descriptor = "[I")
	private final int[] anIntArray263 = new int[16];

	@OriginalMember(owner = "client!hi", name = "Z", descriptor = "[I")
	public final int[] anIntArray264 = new int[16];

	@OriginalMember(owner = "client!hi", name = "zb", descriptor = "[I")
	private final int[] anIntArray268 = new int[16];

	@OriginalMember(owner = "client!hi", name = "Db", descriptor = "[I")
	private final int[] anIntArray271 = new int[16];

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[I")
	private final int[] anIntArray259 = new int[16];

	@OriginalMember(owner = "client!hi", name = "Fb", descriptor = "[I")
	private final int[] anIntArray272 = new int[16];

	@OriginalMember(owner = "client!hi", name = "Ab", descriptor = "[I")
	private final int[] anIntArray269 = new int[16];

	@OriginalMember(owner = "client!hi", name = "Bb", descriptor = "[I")
	private final int[] anIntArray270 = new int[16];

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "Lclient!eu;")
	private final Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!hi", name = "Rb", descriptor = "Lclient!gd;")
	private final Class3_Sub8_Sub3 aClass3_Sub8_Sub3_1 = new Class3_Sub8_Sub3(this);

	@OriginalMember(owner = "client!hi", name = "gb", descriptor = "Lclient!cp;")
	private final Class44 aClass44_15 = new Class44(128);

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub4() {
		this.method2151();
		this.method2136(true);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2129(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass74_1.method1554()) {
			@Pc(14) int local14 = this.aClass74_1.anInt1916 * this.anInt2548 / Static374.anInt6244;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong101;
				if (this.aLong100 - local23 >= 0L) {
					this.aLong101 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong100 - this.aLong101 - 1L) / (long) local14);
				this.aLong101 += (long) local54 * (long) local14;
				this.aClass3_Sub8_Sub3_1.method2129(arg0, arg1, local54);
				this.method2166();
				arg2 -= local54;
				arg1 += local54;
			} while (this.aClass74_1.method1554());
		}
		this.aClass3_Sub8_Sub3_1.method2129(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)Z")
	public synchronized boolean method2134() {
		return this.aClass74_1.method1554();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2125() {
		return 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ep;B)I")
	private int method2135(@OriginalArg(0) Class3_Sub13 arg0) {
		@Pc(15) int local15 = this.anIntArray262[arg0.anInt1847];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt1849) * (16384 - local15) + 32 >> 6) : local15 * arg0.anInt1849 + 32 >> 6;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZ)V")
	private void method2136(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2140(-1);
		} else {
			this.method2145(-1);
		}
		this.method2171(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray258[local31] = this.anIntArray266[local31];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray272[local49] = this.anIntArray266[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZB)V")
	private synchronized void method2137(@OriginalArg(0) boolean arg0) {
		this.aClass74_1.method1561();
		this.aClass3_Sub35_1 = null;
		this.method2136(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!ep;I)V")
	public void method2138(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub13 arg1) {
		@Pc(14) int local14 = arg1.aClass3_Sub29_Sub1_1.aByteArray54.length;
		@Pc(46) int local46;
		if (arg0 && arg1.aClass3_Sub29_Sub1_1.aBoolean324) {
			@Pc(29) int local29 = local14 + local14 - arg1.aClass3_Sub29_Sub1_1.anInt4133;
			local14 <<= 0x8;
			local46 = (int) ((long) this.anIntArray261[arg1.anInt1847] * (long) local29 >> 6);
			if (local14 <= local46) {
				local46 = local14 + local14 - local46 - 1;
				arg1.aClass3_Sub8_Sub1_3.method1255();
			}
		} else {
			local46 = (int) ((long) local14 * (long) this.anIntArray261[arg1.anInt1847] >> 6);
		}
		arg1.aClass3_Sub8_Sub1_3.method1260(local46);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IB)V")
	private void method2139(@OriginalArg(0) int arg0) {
		if ((this.anIntArray265[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class3_Sub13 local19 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3051(); local19 != null; local19 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3050()) {
			if (local19.anInt1847 == arg0) {
				local19.anInt1846 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()Lclient!me;")
	@Override
	public synchronized Class3_Sub8 method2128() {
		return this.aClass3_Sub8_Sub3_1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	private void method2140(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub13 local12 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3051(); local12 != null; local12 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3050()) {
			if (arg0 < 0 || local12.anInt1847 == arg0) {
				if (local12.aClass3_Sub8_Sub1_3 != null) {
					local12.aClass3_Sub8_Sub1_3.method1253(Static374.anInt6244 / 100);
					if (local12.aClass3_Sub8_Sub1_3.method1264()) {
						this.aClass3_Sub8_Sub3_1.aClass3_Sub8_Sub2_3.method1710(local12.aClass3_Sub8_Sub1_3);
					}
					local12.method1501();
				}
				if (local12.anInt1836 < 0) {
					this.aClass3_Sub13ArrayArray1[local12.anInt1847][local12.anInt1835] = null;
				}
				local12.method5700();
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZLclient!pt;ZZ)V")
	private synchronized void method2141(@OriginalArg(1) Class3_Sub35 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method2137(arg1);
		this.aClass74_1.method1559(arg0.aByteArray62);
		this.aLong101 = 0L;
		this.aBoolean192 = arg2;
		@Pc(24) int local24 = this.aClass74_1.method1560();
		for (@Pc(33) int local33 = 0; local33 < local24; local33++) {
			this.aClass74_1.method1555(local33);
			this.aClass74_1.method1552(local33);
			this.aClass74_1.method1566(local33);
		}
		this.anInt2591 = this.aClass74_1.method1564();
		this.anInt2590 = this.aClass74_1.anIntArray190[this.anInt2591];
		this.aLong100 = this.aClass74_1.method1553(this.anInt2590);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!pt;ZI)V")
	public synchronized void method2142(@OriginalArg(0) Class3_Sub35 arg0, @OriginalArg(1) boolean arg1) {
		this.method2141(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
	private void method2143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray263[arg1] = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)V")
	private void method2144(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IB)V")
	private void method2145(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub13 local8 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3051(); local8 != null; local8 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3050()) {
			if ((arg0 < 0 || arg0 == local8.anInt1847) && local8.anInt1836 < 0) {
				this.aClass3_Sub13ArrayArray1[local8.anInt1847][local8.anInt1835] = null;
				local8.anInt1836 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIII)V")
	private void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2150(arg0, 64, arg2);
		if ((this.anIntArray265[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub13 local25 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3055(); local25 != null; local25 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3057()) {
				if (arg0 == local25.anInt1847 && local25.anInt1836 < 0) {
					this.aClass3_Sub13ArrayArray1[arg0][local25.anInt1835] = null;
					this.aClass3_Sub13ArrayArray1[arg0][arg2] = local25;
					@Pc(68) int local68 = local25.anInt1838 + (local25.anInt1851 * local25.anInt1844 >> 12);
					local25.anInt1838 += arg2 - local25.anInt1835 << 8;
					local25.anInt1835 = arg2;
					local25.anInt1844 = local68 - local25.anInt1838;
					local25.anInt1851 = 4096;
					return;
				}
			}
		}
		@Pc(114) Class3_Sub37 local114 = (Class3_Sub37) this.aClass44_15.method942((long) this.anIntArray258[arg0]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class3_Sub29_Sub1 local122 = local114.aClass3_Sub29_Sub1Array1[arg2];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class3_Sub13 local129 = new Class3_Sub13();
		local129.anInt1847 = arg0;
		local129.aClass3_Sub29_Sub1_1 = local122;
		local129.aClass3_Sub37_1 = local114;
		local129.aClass6_1 = local114.aClass6Array1[arg2];
		local129.anInt1837 = local114.aByteArray70[arg2];
		local129.anInt1835 = arg2;
		local129.anInt1840 = local114.anInt5234 * arg1 * arg1 * local114.aByteArray71[arg2] + 1024 >> 11;
		local129.anInt1849 = local114.aByteArray69[arg2] & 0xFF;
		local129.anInt1838 = (arg2 << 8) - (local114.aShortArray82[arg2] & 0x7FFF);
		local129.anInt1841 = 0;
		local129.anInt1836 = -1;
		local129.anInt1852 = 0;
		local129.anInt1848 = 0;
		local129.anInt1845 = 0;
		if (this.anIntArray261[arg0] == 0) {
			local129.aClass3_Sub8_Sub1_3 = Static396.method1258(local122, this.method2162(local129), this.method2165(local129), this.method2135(local129));
		} else {
			local129.aClass3_Sub8_Sub1_3 = Static396.method1258(local122, this.method2162(local129), 0, this.method2135(local129));
			this.method2138(local114.aShortArray82[arg2] < 0, local129);
		}
		if (local114.aShortArray82[arg2] < 0) {
			local129.aClass3_Sub8_Sub1_3.method1248(-1);
		}
		if (local129.anInt1837 >= 0) {
			@Pc(282) Class3_Sub13 local282 = this.aClass3_Sub13ArrayArray2[arg0][local129.anInt1837];
			if (local282 != null && local282.anInt1836 < 0) {
				this.aClass3_Sub13ArrayArray1[arg0][local282.anInt1835] = null;
				local282.anInt1836 = 0;
			}
			this.aClass3_Sub13ArrayArray2[arg0][local129.anInt1837] = local129;
		}
		this.aClass3_Sub8_Sub3_1.aClass138_14.method3053(local129);
		this.aClass3_Sub13ArrayArray1[arg0][arg2] = local129;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
	public synchronized void method2147() {
		this.method2137(true);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
	private void method2149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray257[arg1] = arg0;
		this.anIntArray264[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIII)V")
	private void method2150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class3_Sub13 local16 = this.aClass3_Sub13ArrayArray1[arg0][arg2];
		if (local16 == null) {
			return;
		}
		this.aClass3_Sub13ArrayArray1[arg0][arg2] = null;
		if ((this.anIntArray265[arg0] & 0x2) == 0) {
			local16.anInt1836 = 0;
			return;
		}
		for (@Pc(43) Class3_Sub13 local43 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3051(); local43 != null; local43 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3050()) {
			if (local16.anInt1847 == local43.anInt1847 && local43.anInt1836 < 0 && local43 != local16) {
				local16.anInt1836 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(III)V")
	private synchronized void method2151() {
		for (@Pc(16) int local16 = 0; local16 < 16; local16++) {
			this.anIntArray260[local16] = 256;
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(IIII)V")
	private void method2152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(III)V")
	private void method2153() {
		this.anIntArray266[9] = 128;
		this.anIntArray272[9] = 128;
		this.method2161(9, 128);
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BILclient!ep;[II)Z")
	public boolean method2155(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub13 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt1839 = Static374.anInt6244 / 100;
		if (arg1.anInt1836 >= 0 && (arg1.aClass3_Sub8_Sub1_3 == null || arg1.aClass3_Sub8_Sub1_3.method1280())) {
			arg1.method1501();
			arg1.method5700();
			if (arg1.anInt1837 > 0 && arg1 == this.aClass3_Sub13ArrayArray2[arg1.anInt1847][arg1.anInt1837]) {
				this.aClass3_Sub13ArrayArray2[arg1.anInt1847][arg1.anInt1837] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt1851;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray267[arg1.anInt1847] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt1851 = local59;
		}
		arg1.aClass3_Sub8_Sub1_3.method1247(this.method2162(arg1));
		@Pc(96) Class6 local96 = arg1.aClass6_1;
		arg1.anInt1850++;
		@Pc(104) boolean local104 = false;
		arg1.anInt1854 += local96.anInt120;
		@Pc(129) double local129 = (double) ((arg1.anInt1851 * arg1.anInt1844 >> 12) + (arg1.anInt1835 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt117 > 0) {
			if (local96.anInt123 <= 0) {
				arg1.anInt1852 += 128;
			} else {
				arg1.anInt1852 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt123) * 128.0D + 0.5D);
			}
			if (local96.anInt117 * arg1.anInt1852 >= 819200) {
				local104 = true;
			}
		}
		if (local96.aByteArray3 != null) {
			if (local96.anInt122 > 0) {
				arg1.anInt1848 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt122) * 128.0D + 0.5D);
			} else {
				arg1.anInt1848 += 128;
			}
			while (arg1.anInt1845 < local96.aByteArray3.length - 2 && arg1.anInt1848 > (local96.aByteArray3[arg1.anInt1845 + 2] & 0xFF) << 8) {
				arg1.anInt1845 += 2;
			}
			if (arg1.anInt1845 == local96.aByteArray3.length - 2 && local96.aByteArray3[arg1.anInt1845 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg1.anInt1836 >= 0 && local96.aByteArray2 != null && (this.anIntArray265[arg1.anInt1847] & 0x1) == 0 && (arg1.anInt1837 < 0 || arg1 != this.aClass3_Sub13ArrayArray2[arg1.anInt1847][arg1.anInt1837])) {
			if (local96.anInt126 > 0) {
				arg1.anInt1836 += (int) (Math.pow(2.0D, (double) local96.anInt126 * local129) * 128.0D + 0.5D);
			} else {
				arg1.anInt1836 += 128;
			}
			while (local96.aByteArray2.length - 2 > arg1.anInt1841 && arg1.anInt1836 > (local96.aByteArray2[arg1.anInt1841 + 2] & 0xFF) << 8) {
				arg1.anInt1841 += 2;
			}
			if (local96.aByteArray2.length - 2 == arg1.anInt1841) {
				local104 = true;
			}
		}
		if (!local104) {
			arg1.aClass3_Sub8_Sub1_3.method1276(arg1.anInt1839, this.method2165(arg1), this.method2135(arg1));
			return false;
		}
		arg1.aClass3_Sub8_Sub1_3.method1253(arg1.anInt1839);
		if (arg2 == null) {
			arg1.aClass3_Sub8_Sub1_3.method2131(arg0);
		} else {
			arg1.aClass3_Sub8_Sub1_3.method2129(arg2, arg3, arg0);
		}
		if (arg1.aClass3_Sub8_Sub1_3.method1264()) {
			this.aClass3_Sub8_Sub3_1.aClass3_Sub8_Sub2_3.method1710(arg1.aClass3_Sub8_Sub1_3);
		}
		arg1.method1501();
		if (arg1.anInt1836 >= 0) {
			arg1.method5700();
			if (arg1.anInt1837 > 0 && arg1 == this.aClass3_Sub13ArrayArray2[arg1.anInt1847][arg1.anInt1837]) {
				this.aClass3_Sub13ArrayArray2[arg1.anInt1847][arg1.anInt1837] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(III)V")
	public synchronized void method2156() {
		this.method2153();
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(IZ)V")
	public synchronized void method2157(@OriginalArg(0) int arg0) {
		this.anInt2545 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)V")
	public synchronized void method2158() {
		for (@Pc(11) Class3_Sub37 local11 = (Class3_Sub37) this.aClass44_15.method950(); local11 != null; local11 = (Class3_Sub37) this.aClass44_15.method949()) {
			local11.method4679();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()Lclient!me;")
	@Override
	public synchronized Class3_Sub8 method2126() {
		return null;
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)I")
	public int method2159() {
		return this.anInt2545;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2131(@OriginalArg(0) int arg0) {
		if (this.aClass74_1.method1554()) {
			@Pc(18) int local18 = this.aClass74_1.anInt1916 * this.anInt2548 / Static374.anInt6244;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong101;
				if (this.aLong100 - local27 >= 0L) {
					this.aLong101 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong100 - this.aLong101 - 1L) / (long) local18);
				this.aLong101 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass3_Sub8_Sub3_1.method2131(local57);
				this.method2166();
			} while (this.aClass74_1.method1554());
		}
		this.aClass3_Sub8_Sub3_1.method2131(arg0);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(Z)V")
	public synchronized void method2160() {
		for (@Pc(11) Class3_Sub37 local11 = (Class3_Sub37) this.aClass44_15.method950(); local11 != null; local11 = (Class3_Sub37) this.aClass44_15.method949()) {
			local11.method5700();
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(BII)V")
	private void method2161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray258[arg0] != arg1) {
			this.anIntArray258[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass3_Sub13ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!ep;)I")
	private int method2162(@OriginalArg(1) Class3_Sub13 arg0) {
		@Pc(14) int local14 = (arg0.anInt1851 * arg0.anInt1844 >> 12) + arg0.anInt1838;
		local14 += this.anIntArray268[arg0.anInt1847] * (this.anIntArray263[arg0.anInt1847] - 8192) >> 12;
		@Pc(41) Class6 local41 = arg0.aClass6_1;
		@Pc(64) int local64;
		if (local41.anInt120 > 0 && (local41.anInt118 > 0 || this.anIntArray271[arg0.anInt1847] > 0)) {
			local64 = local41.anInt118 << 2;
			@Pc(69) int local69 = local41.anInt121 << 1;
			if (local69 > arg0.anInt1850) {
				local64 = arg0.anInt1850 * local64 / local69;
			}
			local64 += this.anIntArray271[arg0.anInt1847] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt1854 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass3_Sub29_Sub1_1.anInt4131 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static374.anInt6244 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!ui;ILclient!pt;Lclient!b;I)Z")
	public synchronized boolean method2163(@OriginalArg(0) Class231 arg0, @OriginalArg(2) Class3_Sub35 arg1, @OriginalArg(3) Class20 arg2) {
		arg1.method4320();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class3_Sub30 local29 = (Class3_Sub30) arg1.aClass44_28.method950(); local29 != null; local29 = (Class3_Sub30) arg1.aClass44_28.method949()) {
			@Pc(35) int local35 = (int) local29.aLong240;
			@Pc(43) Class3_Sub37 local43 = (Class3_Sub37) this.aClass44_15.method942((long) local35);
			if (local43 == null) {
				local43 = Static238.method3920(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass44_15.method948((long) local35, local43);
			}
			if (!local43.method4680(local29.aByteArray55, arg0, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method4321();
		}
		return local9;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLclient!ep;)I")
	private int method2165(@OriginalArg(1) Class3_Sub13 arg0) {
		if (this.anIntArray260[arg0.anInt1847] == 0) {
			return 0;
		}
		@Pc(21) Class6 local21 = arg0.aClass6_1;
		@Pc(37) int local37 = this.anIntArray259[arg0.anInt1847] * this.anIntArray269[arg0.anInt1847] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = local45 * arg0.anInt1840 + 16384 >> 15;
		@Pc(63) int local63 = this.anInt2545 * local54 + 128 >> 8;
		local37 = local63 * this.anIntArray260[arg0.anInt1847] + 128 >> 8;
		if (local21.anInt117 > 0) {
			local37 = (int) (Math.pow(0.5D, (double) local21.anInt117 * 1.953125E-5D * (double) arg0.anInt1852) * (double) local37 + 0.5D);
		}
		@Pc(105) int local105;
		@Pc(113) int local113;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (local21.aByteArray3 != null) {
			local105 = arg0.anInt1848;
			local113 = local21.aByteArray3[arg0.anInt1845 + 1];
			if (local21.aByteArray3.length - 2 > arg0.anInt1845) {
				local131 = (local21.aByteArray3[arg0.anInt1845] & 0xFF) << 8;
				local143 = (local21.aByteArray3[arg0.anInt1845 + 2] & 0xFF) << 8;
				local113 += (local21.aByteArray3[arg0.anInt1845 + 3] - local113) * (local105 + -local131) / (local143 - local131);
			}
			local37 = local37 * local113 + 32 >> 6;
		}
		if (arg0.anInt1836 > 0 && local21.aByteArray2 != null) {
			local105 = arg0.anInt1836;
			local113 = local21.aByteArray2[arg0.anInt1841 + 1];
			if (arg0.anInt1841 < local21.aByteArray2.length - 2) {
				local131 = (local21.aByteArray2[arg0.anInt1841] & 0xFF) << 8;
				local143 = (local21.aByteArray2[arg0.anInt1841 + 2] & 0xFF) << 8;
				local113 += (local105 - local131) * (local21.aByteArray2[arg0.anInt1841 + 3] - local113) / (local143 - local131);
			}
			local37 = local113 * local37 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(B)V")
	private void method2166() {
		@Pc(8) int local8 = this.anInt2591;
		@Pc(11) int local11 = this.anInt2590;
		@Pc(22) long local22 = this.aLong100;
		if (this.aClass3_Sub35_1 != null && local11 == this.anInt2592) {
			this.method2141(this.aClass3_Sub35_1, this.aBoolean193, this.aBoolean192);
			this.method2166();
			return;
		}
		while (local11 == this.anInt2590) {
			while (this.aClass74_1.anIntArray190[local8] == local11) {
				this.aClass74_1.method1555(local8);
				@Pc(55) int local55 = this.aClass74_1.method1562(local8);
				if (local55 == 1) {
					this.aClass74_1.method1563();
					this.aClass74_1.method1566(local8);
					if (this.aClass74_1.method1551()) {
						if (this.aClass3_Sub35_1 != null) {
							this.method2142(this.aClass3_Sub35_1, this.aBoolean192);
							this.method2166();
							return;
						}
						if (!this.aBoolean192 || local11 == 0) {
							this.method2136(true);
							this.aClass74_1.method1561();
							return;
						}
						this.aClass74_1.method1557(local22);
					}
					break;
				}
				if ((local55 & 0x80) != 0) {
					this.method2169(local55);
				}
				this.aClass74_1.method1552(local8);
				this.aClass74_1.method1566(local8);
			}
			local8 = this.aClass74_1.method1564();
			local11 = this.aClass74_1.anIntArray190[local8];
			local22 = this.aClass74_1.method1553(local11);
		}
		this.aLong100 = local22;
		this.anInt2590 = local11;
		this.anInt2591 = local8;
		if (this.aClass3_Sub35_1 != null && local11 > this.anInt2592) {
			this.anInt2590 = this.anInt2592;
			this.anInt2591 = -1;
			this.aLong100 = this.aClass74_1.method1553(this.anInt2590);
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(ILclient!ep;)Z")
	public boolean method2168(@OriginalArg(1) Class3_Sub13 arg0) {
		if (arg0.aClass3_Sub8_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt1836 >= 0) {
			arg0.method5700();
			if (arg0.anInt1837 > 0 && arg0 == this.aClass3_Sub13ArrayArray2[arg0.anInt1847][arg0.anInt1837]) {
				this.aClass3_Sub13ArrayArray2[arg0.anInt1847][arg0.anInt1837] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(II)V")
	private void method2169(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (local9 == 128) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method2150(local23, local35, local29);
		} else if (local9 == 144) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			if (local35 <= 0) {
				this.method2150(local23, 64, local29);
			} else {
				this.method2146(local23, local35, local29);
			}
		} else if (local9 == 160) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method2152(local35, local29, local23);
		} else if (local9 == 176) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			if (local29 == 0) {
				this.anIntArray272[local23] = (local35 << 14) + (this.anIntArray272[local23] & 0xFFE03FFF);
			}
			if (local29 == 32) {
				this.anIntArray272[local23] = (this.anIntArray272[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 1) {
				this.anIntArray271[local23] = (this.anIntArray271[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 33) {
				this.anIntArray271[local23] = local35 + (this.anIntArray271[local23] & 0xFFFFFF80);
			}
			if (local29 == 5) {
				this.anIntArray267[local23] = (local35 << 7) + (this.anIntArray267[local23] & 0xFFFFC07F);
			}
			if (local29 == 37) {
				this.anIntArray267[local23] = (this.anIntArray267[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 7) {
				this.anIntArray269[local23] = (this.anIntArray269[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 39) {
				this.anIntArray269[local23] = (this.anIntArray269[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 10) {
				this.anIntArray262[local23] = (this.anIntArray262[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 42) {
				this.anIntArray262[local23] = local35 + (this.anIntArray262[local23] & 0xFFFFFF80);
			}
			if (local29 == 11) {
				this.anIntArray259[local23] = (this.anIntArray259[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 43) {
				this.anIntArray259[local23] = (this.anIntArray259[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 64) {
				if (local35 < 64) {
					this.anIntArray265[local23] &= 0xFFFFFFFE;
				} else {
					this.anIntArray265[local23] |= 0x1;
				}
			}
			if (local29 == 65) {
				if (local35 < 64) {
					this.method2170(local23);
					this.anIntArray265[local23] &= 0xFFFFFFFD;
				} else {
					this.anIntArray265[local23] |= 0x2;
				}
			}
			if (local29 == 99) {
				this.anIntArray270[local23] = (this.anIntArray270[local23] & 0x7F) + (local35 << 7);
			}
			if (local29 == 98) {
				this.anIntArray270[local23] = local35 + (this.anIntArray270[local23] & 0x3F80);
			}
			if (local29 == 101) {
				this.anIntArray270[local23] = (this.anIntArray270[local23] & 0x7F) + (local35 << 7) + 16384;
			}
			if (local29 == 100) {
				this.anIntArray270[local23] = (this.anIntArray270[local23] & 0x3F80) + local35 + 16384;
			}
			if (local29 == 120) {
				this.method2140(local23);
			}
			if (local29 == 121) {
				this.method2171(local23);
			}
			if (local29 == 123) {
				this.method2145(local23);
			}
			@Pc(519) int local519;
			if (local29 == 6) {
				local519 = this.anIntArray270[local23];
				if (local519 == 16384) {
					this.anIntArray268[local23] = (this.anIntArray268[local23] & 0xFFFFC07F) + (local35 << 7);
				}
			}
			if (local29 == 38) {
				local519 = this.anIntArray270[local23];
				if (local519 == 16384) {
					this.anIntArray268[local23] = local35 + (this.anIntArray268[local23] & 0xFFFFFF80);
				}
			}
			if (local29 == 16) {
				this.anIntArray261[local23] = (this.anIntArray261[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 48) {
				this.anIntArray261[local23] = local35 + (this.anIntArray261[local23] & 0xFFFFFF80);
			}
			if (local29 == 81) {
				if (local35 >= 64) {
					this.anIntArray265[local23] |= 0x4;
				} else {
					this.method2139(local23);
					this.anIntArray265[local23] &= 0xFFFFFFFB;
				}
			}
			if (local29 == 17) {
				this.method2149((this.anIntArray257[local23] & 0xFFFFC07F) + (local35 << 7), local23);
			}
			if (local29 == 49) {
				this.method2149((this.anIntArray257[local23] & 0xFFFFFF80) + local35, local23);
			}
		} else if (local9 == 192) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method2161(local23, this.anIntArray272[local23] + local29);
		} else if (local9 == 208) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method2144(local23, local29);
		} else if (local9 == 224) {
			local23 = arg0 & 0xF;
			local29 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2143(local29, local23);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2136(true);
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(IB)V")
	private void method2170(@OriginalArg(0) int arg0) {
		if ((this.anIntArray265[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub13 local22 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3051(); local22 != null; local22 = (Class3_Sub13) this.aClass3_Sub8_Sub3_1.aClass138_14.method3050()) {
			if (arg0 == local22.anInt1847 && this.aClass3_Sub13ArrayArray1[arg0][local22.anInt1835] == null && local22.anInt1836 < 0) {
				local22.anInt1836 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(II)V")
	private void method2171(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2171(local12);
			}
			return;
		}
		this.anIntArray269[arg0] = 12800;
		this.anIntArray262[arg0] = 8192;
		this.anIntArray259[arg0] = 16383;
		this.anIntArray263[arg0] = 8192;
		this.anIntArray271[arg0] = 0;
		this.anIntArray267[arg0] = 8192;
		this.method2170(arg0);
		this.method2139(arg0);
		this.anIntArray265[arg0] = 0;
		this.anIntArray270[arg0] = 32767;
		this.anIntArray268[arg0] = 256;
		this.anIntArray261[arg0] = 0;
		this.method2149(8192, arg0);
	}
}
