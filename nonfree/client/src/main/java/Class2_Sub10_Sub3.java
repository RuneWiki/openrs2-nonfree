import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class2_Sub10_Sub3 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ph", name = "Hb", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!ph", name = "Ib", descriptor = "Z")
	private boolean aBoolean125;

	@OriginalMember(owner = "client!ph", name = "Jb", descriptor = "I")
	private int anInt3021;

	@OriginalMember(owner = "client!ph", name = "Kb", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!ph", name = "Lb", descriptor = "I")
	private int anInt3022;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	public final int[] anIntArray262 = new int[16];

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
	private final int[] anIntArray263 = new int[16];

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "[I")
	private final int[] anIntArray267 = new int[16];

	@OriginalMember(owner = "client!ph", name = "ab", descriptor = "[I")
	private final int[] anIntArray271 = new int[16];

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "[I")
	private final int[] anIntArray261 = new int[16];

	@OriginalMember(owner = "client!ph", name = "Z", descriptor = "[I")
	private final int[] anIntArray270 = new int[16];

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[I")
	private final int[] anIntArray264 = new int[16];

	@OriginalMember(owner = "client!ph", name = "X", descriptor = "[I")
	private final int[] anIntArray269 = new int[16];

	@OriginalMember(owner = "client!ph", name = "fb", descriptor = "[I")
	private final int[] anIntArray272 = new int[16];

	@OriginalMember(owner = "client!ph", name = "V", descriptor = "[I")
	public final int[] anIntArray268 = new int[16];

	@OriginalMember(owner = "client!ph", name = "hb", descriptor = "[[Lclient!bh;")
	private final Class2_Sub7[][] aClass2_Sub7ArrayArray2 = new Class2_Sub7[16][128];

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "[I")
	private final int[] anIntArray265 = new int[16];

	@OriginalMember(owner = "client!ph", name = "vb", descriptor = "[I")
	private final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!ph", name = "bb", descriptor = "[[Lclient!bh;")
	private final Class2_Sub7[][] aClass2_Sub7ArrayArray1 = new Class2_Sub7[16][128];

	@OriginalMember(owner = "client!ph", name = "N", descriptor = "[I")
	public final int[] anIntArray266 = new int[16];

	@OriginalMember(owner = "client!ph", name = "ub", descriptor = "I")
	private final int anInt3014 = 1000000;

	@OriginalMember(owner = "client!ph", name = "rb", descriptor = "[I")
	private final int[] anIntArray273 = new int[16];

	@OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
	private int anInt2995 = 256;

	@OriginalMember(owner = "client!ph", name = "zb", descriptor = "[I")
	private final int[] anIntArray275 = new int[16];

	@OriginalMember(owner = "client!ph", name = "M", descriptor = "Lclient!o;")
	private final Class59 aClass59_1 = new Class59();

	@OriginalMember(owner = "client!ph", name = "Mb", descriptor = "Lclient!oh;")
	private final Class2_Sub10_Sub2 aClass2_Sub10_Sub2_1 = new Class2_Sub10_Sub2(this);

	@OriginalMember(owner = "client!ph", name = "J", descriptor = "Lclient!db;")
	private final Class16 aClass16_9 = new Class16(128);

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub3() {
		this.method2017();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
	private void method2000() {
		this.anIntArray273[9] = 128;
		this.anIntArray270[9] = 128;
		this.method2026(9, 128);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
	public synchronized boolean method2001() {
		return this.aClass59_1.method1844();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!bh;Z)Z")
	public boolean method2002(@OriginalArg(0) Class2_Sub7 arg0) {
		if (arg0.aClass2_Sub10_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt413 >= 0) {
			arg0.method2808();
			if (arg0.anInt412 > 0 && this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412] == arg0) {
				this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	private void method2003(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class2_Sub7 local20 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2694(); local20 != null; local20 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2697()) {
			if (arg0 < 0 || local20.anInt400 == arg0) {
				if (local20.aClass2_Sub10_Sub1_1 != null) {
					local20.aClass2_Sub10_Sub1_1.method800(Static50.anInt1375 / 100);
					if (local20.aClass2_Sub10_Sub1_1.method777()) {
						this.aClass2_Sub10_Sub2_1.aClass2_Sub10_Sub4_7.method2745(local20.aClass2_Sub10_Sub1_1);
					}
					local20.method307();
				}
				if (local20.anInt413 < 0) {
					this.aClass2_Sub7ArrayArray2[local20.anInt400][local20.anInt407] = null;
				}
				local20.method2808();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!bh;B)V")
	public void method2004(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		@Pc(16) int local16 = arg1.aClass2_Sub19_Sub1_1.aByteArray38.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass2_Sub19_Sub1_1.aBoolean129) {
			@Pc(46) int local46 = local16 + local16 - arg1.aClass2_Sub19_Sub1_1.anInt3160;
			local35 = (int) ((long) this.anIntArray262[arg1.anInt400] * (long) local46 >> 6);
			local16 <<= 0x8;
			if (local35 >= local16) {
				arg1.aClass2_Sub10_Sub1_1.method786();
				local35 = local16 + local16 - local35 - 1;
			}
		} else {
			local35 = (int) ((long) this.anIntArray262[arg1.anInt400] * (long) local16 >> 6);
		}
		arg1.aClass2_Sub10_Sub1_1.method794(local35);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!bh;I[II)Z")
	public boolean method2005(@OriginalArg(1) Class2_Sub7 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg0.anInt401 = Static50.anInt1375 / 100;
		if (arg0.anInt413 >= 0 && (arg0.aClass2_Sub10_Sub1_1 == null || arg0.aClass2_Sub10_Sub1_1.method781())) {
			arg0.method307();
			arg0.method2808();
			if (arg0.anInt412 > 0 && arg0 == this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412]) {
				this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt404;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray272[arg0.anInt400] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt404 = local56;
		}
		@Pc(88) boolean local88 = false;
		arg0.aClass2_Sub10_Sub1_1.method812(this.method2013(arg0));
		arg0.anInt411++;
		@Pc(112) Class71 local112 = arg0.aClass71_1;
		arg0.anInt402 += local112.anInt3271;
		@Pc(137) double local137 = (double) ((arg0.anInt408 * arg0.anInt404 >> 12) + (arg0.anInt407 - 60 << 8)) * 5.086263020833333E-6D;
		if (local112.anInt3268 > 0) {
			if (local112.anInt3274 > 0) {
				arg0.anInt409 += (int) (Math.pow(2.0D, local137 * (double) local112.anInt3274) * 128.0D + 0.5D);
			} else {
				arg0.anInt409 += 128;
			}
			if (local112.anInt3268 * arg0.anInt409 >= 819200) {
				local88 = true;
			}
		}
		if (local112.aByteArray40 != null) {
			if (local112.anInt3277 <= 0) {
				arg0.anInt416 += 128;
			} else {
				arg0.anInt416 += (int) (Math.pow(2.0D, (double) local112.anInt3277 * local137) * 128.0D + 0.5D);
			}
			while (local112.aByteArray40.length - 2 > arg0.anInt405 && arg0.anInt416 > (local112.aByteArray40[arg0.anInt405 + 2] & 0xFF) << 8) {
				arg0.anInt405 += 2;
			}
			if (local112.aByteArray40.length - 2 == arg0.anInt405 && local112.aByteArray40[arg0.anInt405 + 1] == 0) {
				local88 = true;
			}
		}
		if (arg0.anInt413 >= 0 && local112.aByteArray39 != null && (this.anIntArray268[arg0.anInt400] & 0x1) == 0 && (arg0.anInt412 < 0 || this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412] != arg0)) {
			if (local112.anInt3269 > 0) {
				arg0.anInt413 += (int) (Math.pow(2.0D, (double) local112.anInt3269 * local137) * 128.0D + 0.5D);
			} else {
				arg0.anInt413 += 128;
			}
			while (arg0.anInt398 < local112.aByteArray39.length - 2 && arg0.anInt413 > (local112.aByteArray39[arg0.anInt398 + 2] & 0xFF) << 8) {
				arg0.anInt398 += 2;
			}
			if (arg0.anInt398 == local112.aByteArray39.length - 2) {
				local88 = true;
			}
		}
		if (!local88) {
			arg0.aClass2_Sub10_Sub1_1.method806(arg0.anInt401, this.method2009(arg0), this.method2032(arg0));
			return false;
		}
		arg0.aClass2_Sub10_Sub1_1.method800(arg0.anInt401);
		if (arg2 == null) {
			arg0.aClass2_Sub10_Sub1_1.method2741(arg3);
		} else {
			arg0.aClass2_Sub10_Sub1_1.method2742(arg2, arg1, arg3);
		}
		if (arg0.aClass2_Sub10_Sub1_1.method777()) {
			this.aClass2_Sub10_Sub2_1.aClass2_Sub10_Sub4_7.method2745(arg0.aClass2_Sub10_Sub1_1);
		}
		arg0.method307();
		if (arg0.anInt413 >= 0) {
			arg0.method2808();
			if (arg0.anInt412 > 0 && arg0 == this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412]) {
				this.aClass2_Sub7ArrayArray1[arg0.anInt400][arg0.anInt412] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IB)V")
	public synchronized void method2006(@OriginalArg(0) int arg0) {
		this.anInt2995 = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2743() {
		return 0;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
	private void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray264[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(IB)V")
	private void method2008(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2008(local12);
			}
			return;
		}
		this.anIntArray261[arg0] = 12800;
		this.anIntArray275[arg0] = 8192;
		this.anIntArray274[arg0] = 16383;
		this.anIntArray264[arg0] = 8192;
		this.anIntArray263[arg0] = 0;
		this.anIntArray272[arg0] = 8192;
		this.method2010(arg0);
		this.method2020(arg0);
		this.anIntArray268[arg0] = 0;
		this.anIntArray271[arg0] = 32767;
		this.anIntArray267[arg0] = 256;
		this.anIntArray262[arg0] = 0;
		this.method2025(8192, arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!bh;)I")
	private int method2009(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(6) Class71 local6 = arg0.aClass71_1;
		@Pc(27) int local27 = this.anIntArray274[arg0.anInt400] * this.anIntArray261[arg0.anInt400] + 4096 >> 13;
		@Pc(35) int local35 = local27 * local27 + 16384 >> 15;
		@Pc(44) int local44 = arg0.anInt399 * local35 + 16384 >> 15;
		local27 = this.anInt2995 * local44 + 128 >> 8;
		if (local6.anInt3268 > 0) {
			local27 = (int) ((double) local27 * Math.pow(0.5D, (double) local6.anInt3268 * 1.953125E-5D * (double) arg0.anInt409) + 0.5D);
		}
		@Pc(91) int local91;
		@Pc(88) int local88;
		@Pc(125) int local125;
		@Pc(115) int local115;
		if (local6.aByteArray40 != null) {
			local88 = local6.aByteArray40[arg0.anInt405 + 1];
			local91 = arg0.anInt416;
			if (arg0.anInt405 < local6.aByteArray40.length - 2) {
				local115 = (local6.aByteArray40[arg0.anInt405 + 2] & 0xFF) << 8;
				local125 = (local6.aByteArray40[arg0.anInt405] & 0xFF) << 8;
				local88 += (local6.aByteArray40[arg0.anInt405 + 3] - local88) * (local91 - local125) / (local115 - local125);
			}
			local27 = local88 * local27 + 32 >> 6;
		}
		if (arg0.anInt413 > 0 && local6.aByteArray39 != null) {
			local88 = local6.aByteArray39[arg0.anInt398 + 1];
			local91 = arg0.anInt413;
			if (arg0.anInt398 < local6.aByteArray39.length - 2) {
				local125 = (local6.aByteArray39[arg0.anInt398] & 0xFF) << 8;
				local115 = (local6.aByteArray39[arg0.anInt398 + 2] & 0xFF) << 8;
				local88 += (local6.aByteArray39[arg0.anInt398 + 3] - local88) * (local91 - local125) / (local115 - local125);
			}
			local27 = local27 * local88 + 32 >> 6;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)V")
	private void method2010(@OriginalArg(1) int arg0) {
		if ((this.anIntArray268[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(33) Class2_Sub7 local33 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2694(); local33 != null; local33 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2697()) {
			if (arg0 == local33.anInt400 && this.aClass2_Sub7ArrayArray2[arg0][local33.anInt407] == null && local33.anInt413 < 0) {
				local33.anInt413 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	public synchronized void method2011() {
		for (@Pc(13) Class2_Sub15 local13 = (Class2_Sub15) this.aClass16_9.method478(); local13 != null; local13 = (Class2_Sub15) this.aClass16_9.method481()) {
			local13.method1529();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!bh;B)I")
	private int method2013(@OriginalArg(0) Class2_Sub7 arg0) {
		@Pc(10) int local10 = (arg0.anInt408 * arg0.anInt404 >> 12) + arg0.anInt415;
		local10 += this.anIntArray267[arg0.anInt400] * (this.anIntArray264[arg0.anInt400] - 8192) >> 12;
		@Pc(35) Class71 local35 = arg0.aClass71_1;
		@Pc(66) int local66;
		if (local35.anInt3271 > 0 && (local35.anInt3272 > 0 || this.anIntArray263[arg0.anInt400] > 0)) {
			local66 = local35.anInt3272 << 2;
			@Pc(71) int local71 = local35.anInt3266 << 1;
			if (arg0.anInt411 < local71) {
				local66 = local66 * arg0.anInt411 / local71;
			}
			local66 += this.anIntArray263[arg0.anInt400] >> 7;
			@Pc(105) double local105 = Math.sin((double) (arg0.anInt402 & 0x1FF) * 0.01227184630308513D);
			local10 += (int) (local105 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass2_Sub19_Sub1_1.anInt3162 * 256) * Math.pow(2.0D, (double) local10 * 3.255208333333333E-4D) / (double) Static50.anInt1375 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
	public synchronized void method2014() {
		for (@Pc(11) Class2_Sub15 local11 = (Class2_Sub15) this.aClass16_9.method478(); local11 != null; local11 = (Class2_Sub15) this.aClass16_9.method481()) {
			local11.method2808();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZILclient!ag;)V")
	public synchronized void method2015(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		this.method2030();
		this.aClass59_1.method1847(arg1.aByteArray1);
		this.aLong169 = 0L;
		this.aBoolean125 = arg0;
		@Pc(25) int local25 = this.aClass59_1.method1841();
		for (@Pc(31) int local31 = 0; local31 < local25; local31++) {
			this.aClass59_1.method1849(local31);
			this.aClass59_1.method1837(local31);
			this.aClass59_1.method1834(local31);
		}
		this.anInt3022 = this.aClass59_1.method1848();
		this.anInt3021 = this.aClass59_1.anIntArray229[this.anInt3022];
		this.aLong170 = this.aClass59_1.method1846(this.anInt3021);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "()Lclient!tf;")
	@Override
	public synchronized Class2_Sub10 method2737() {
		return this.aClass2_Sub10_Sub2_1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!ag;Lclient!c;ILclient!cc;)Z")
	public synchronized boolean method2016(@OriginalArg(1) Class2_Sub4 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(4) Class13 arg2) {
		arg0.method92();
		@Pc(11) boolean local11 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub9 local26 = (Class2_Sub9) arg0.aClass16_1.method478(); local26 != null; local26 = (Class2_Sub9) arg0.aClass16_1.method481()) {
			@Pc(32) int local32 = (int) local26.aLong241;
			@Pc(40) Class2_Sub15 local40 = (Class2_Sub15) this.aClass16_9.method479((long) local32);
			if (local40 == null) {
				local40 = Static69.method1104(arg1, local32);
				if (local40 == null) {
					local11 = false;
					continue;
				}
				this.aClass16_9.method480(local40, (long) local32);
			}
			if (!local40.method1531(arg2, local26.aByteArray4, local20)) {
				local11 = false;
			}
		}
		if (local11) {
			arg0.method93();
		}
		return local11;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	private void method2017() {
		this.method2003(-1);
		this.method2008(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray265[local15] = this.anIntArray273[local15];
		}
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray270[local33] = this.anIntArray273[local33] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)V")
	private void method2018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
	private void method2019(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2_Sub7 local14 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2694(); local14 != null; local14 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2697()) {
			if ((arg0 < 0 || arg0 == local14.anInt400) && local14.anInt413 < 0) {
				this.aClass2_Sub7ArrayArray2[local14.anInt400][local14.anInt407] = null;
				local14.anInt413 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)V")
	private void method2020(@OriginalArg(1) int arg0) {
		if ((this.anIntArray268[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class2_Sub7 local22 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2694(); local22 != null; local22 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2697()) {
			if (arg0 == local22.anInt400) {
				local22.anInt417 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
	private void method2021() {
		@Pc(12) int local12 = this.anInt3022;
		@Pc(15) long local15 = this.aLong170;
		@Pc(18) int local18 = this.anInt3021;
		while (this.anInt3021 == local18) {
			while (local18 == this.aClass59_1.anIntArray229[local12]) {
				this.aClass59_1.method1849(local12);
				@Pc(29) int local29 = this.aClass59_1.method1840(local12);
				if (local29 == 1) {
					this.aClass59_1.method1842();
					this.aClass59_1.method1834(local12);
					if (this.aClass59_1.method1843()) {
						if (!this.aBoolean125 || local18 == 0) {
							this.method2017();
							this.aClass59_1.method1839();
							return;
						}
						this.aClass59_1.method1838(local15);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method2024(local29);
				}
				this.aClass59_1.method1837(local12);
				this.aClass59_1.method1834(local12);
			}
			local12 = this.aClass59_1.method1848();
			local18 = this.aClass59_1.anIntArray229[local12];
			local15 = this.aClass59_1.method1846(local18);
		}
		this.aLong170 = local15;
		this.anInt3021 = local18;
		this.anInt3022 = local12;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IBI)V")
	private void method2022(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IIII)V")
	private void method2023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) Class2_Sub7 local18 = this.aClass2_Sub7ArrayArray2[arg2][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass2_Sub7ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray268[arg2] & 0x2) == 0) {
			local18.anInt413 = 0;
			return;
		}
		for (@Pc(45) Class2_Sub7 local45 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2694(); local45 != null; local45 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2697()) {
			if (local18.anInt400 == local45.anInt400 && local45.anInt413 < 0 && local45 != local18) {
				local18.anInt413 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2742(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass59_1.method1844()) {
			@Pc(14) int local14 = this.aClass59_1.anInt2755 * this.anInt3014 / Static50.anInt1375;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong169;
				if (this.aLong170 - local23 >= 0L) {
					this.aLong169 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong170 + (long) local14 - this.aLong169 - 1L) / (long) local14);
				arg2 -= local54;
				this.aLong169 += (long) local54 * (long) local14;
				this.aClass2_Sub10_Sub2_1.method2742(arg0, arg1, local54);
				this.method2021();
				arg1 += local54;
			} while (this.aClass59_1.method1844());
		}
		this.aClass2_Sub10_Sub2_1.method2742(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	private void method2024(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2023(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method2028(local16, local28, local22);
			} else {
				this.method2023(64, local22, local16);
			}
		} else if (local9 == 160) {
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2018(local28, local22, local16);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray270[local16] = (this.anIntArray270[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray270[local16] = (local28 << 7) + (this.anIntArray270[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray263[local16] = (this.anIntArray263[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray263[local16] = (this.anIntArray263[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray272[local16] = (local28 << 7) + (this.anIntArray272[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray272[local16] = local28 + (this.anIntArray272[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray261[local16] = (this.anIntArray261[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray261[local16] = local28 + (this.anIntArray261[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray275[local16] = (this.anIntArray275[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray275[local16] = local28 + (this.anIntArray275[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray274[local16] = (local28 << 7) + (this.anIntArray274[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray274[local16] = local28 + (this.anIntArray274[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray268[local16] |= 0x1;
				} else {
					this.anIntArray268[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2010(local16);
					this.anIntArray268[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray268[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray271[local16] = (this.anIntArray271[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray271[local16] = local28 + (this.anIntArray271[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray271[local16] = (this.anIntArray271[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray271[local16] = (this.anIntArray271[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2003(local16);
			}
			if (local22 == 121) {
				this.method2008(local16);
			}
			if (local22 == 123) {
				this.method2019(local16);
			}
			@Pc(493) int local493;
			if (local22 == 6) {
				local493 = this.anIntArray271[local16];
				if (local493 == 16384) {
					this.anIntArray267[local16] = (local28 << 7) + (this.anIntArray267[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local493 = this.anIntArray271[local16];
				if (local493 == 16384) {
					this.anIntArray267[local16] = (this.anIntArray267[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray262[local16] = (local28 << 7) + (this.anIntArray262[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray262[local16] = (this.anIntArray262[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray268[local16] |= 0x4;
				} else {
					this.method2020(local16);
					this.anIntArray268[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2025((this.anIntArray269[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method2025((this.anIntArray269[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2026(local16, this.anIntArray270[local16] + local22);
		} else if (local9 == 208) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2022(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2007(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2017();
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method2741(@OriginalArg(0) int arg0) {
		if (this.aClass59_1.method1844()) {
			@Pc(18) int local18 = this.aClass59_1.anInt2755 * this.anInt3014 / Static50.anInt1375;
			do {
				@Pc(28) long local28 = this.aLong169 + (long) arg0 * (long) local18;
				if (this.aLong170 - local28 >= 0L) {
					this.aLong169 = local28;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.aLong170 - this.aLong169 - 1L) / (long) local18);
				this.aLong169 += (long) local59 * (long) local18;
				this.aClass2_Sub10_Sub2_1.method2741(local59);
				arg0 -= local59;
				this.method2021();
			} while (this.aClass59_1.method1844());
		}
		this.aClass2_Sub10_Sub2_1.method2741(arg0);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	private void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray269[arg1] = arg0;
		this.anIntArray266[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(IBI)V")
	private void method2026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray265[arg0] != arg1) {
			this.anIntArray265[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass2_Sub7ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)I")
	public int method2027() {
		return this.anInt2995;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBI)V")
	private void method2028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2023(64, arg2, arg0);
		if ((this.anIntArray268[arg0] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub7 local25 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2690(); local25 != null; local25 = (Class2_Sub7) this.aClass2_Sub10_Sub2_1.aClass84_9.method2692()) {
				if (local25.anInt400 == arg0 && local25.anInt413 < 0) {
					this.aClass2_Sub7ArrayArray2[arg0][local25.anInt407] = null;
					this.aClass2_Sub7ArrayArray2[arg0][arg2] = local25;
					@Pc(61) int local61 = local25.anInt415 + (local25.anInt408 * local25.anInt404 >> 12);
					local25.anInt404 = 4096;
					local25.anInt415 += arg2 - local25.anInt407 << 8;
					local25.anInt408 = local61 - local25.anInt415;
					local25.anInt407 = arg2;
					return;
				}
			}
		}
		@Pc(106) Class2_Sub15 local106 = (Class2_Sub15) this.aClass16_9.method479((long) this.anIntArray265[arg0]);
		if (local106 == null) {
			return;
		}
		@Pc(118) Class2_Sub19_Sub1 local118 = local106.aClass2_Sub19_Sub1Array1[arg2];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class2_Sub7 local125 = new Class2_Sub7();
		local125.aClass2_Sub19_Sub1_1 = local118;
		local125.anInt400 = arg0;
		local125.aClass2_Sub15_1 = local106;
		local125.aClass71_1 = local106.aClass71Array1[arg2];
		local125.anInt412 = local106.aByteArray17[arg2];
		local125.anInt407 = arg2;
		local125.anInt399 = local106.anInt2331 * arg1 * arg1 * local106.aByteArray15[arg2] + 1024 >> 11;
		local125.anInt406 = local106.aByteArray16[arg2] & 0xFF;
		local125.anInt415 = (arg2 << 8) - (local106.aShortArray15[arg2] & 0x7FFF);
		local125.anInt398 = 0;
		local125.anInt409 = 0;
		local125.anInt405 = 0;
		local125.anInt413 = -1;
		local125.anInt416 = 0;
		if (this.anIntArray262[arg0] == 0) {
			local125.aClass2_Sub10_Sub1_1 = Static186.method809(local118, this.method2013(local125), this.method2009(local125), this.method2032(local125));
		} else {
			local125.aClass2_Sub10_Sub1_1 = Static186.method809(local118, this.method2013(local125), 0, this.method2032(local125));
			this.method2004(local106.aShortArray15[arg2] < 0, local125);
		}
		if (local106.aShortArray15[arg2] < 0) {
			local125.aClass2_Sub10_Sub1_1.method775(-1);
		}
		if (local125.anInt412 >= 0) {
			@Pc(275) Class2_Sub7 local275 = this.aClass2_Sub7ArrayArray1[arg0][local125.anInt412];
			if (local275 != null && local275.anInt413 < 0) {
				this.aClass2_Sub7ArrayArray2[arg0][local275.anInt407] = null;
				local275.anInt413 = 0;
			}
			this.aClass2_Sub7ArrayArray1[arg0][local125.anInt412] = local125;
		}
		this.aClass2_Sub10_Sub2_1.aClass84_9.method2701(local125);
		this.aClass2_Sub7ArrayArray2[arg0][arg2] = local125;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()Lclient!tf;")
	@Override
	public synchronized Class2_Sub10 method2738() {
		return null;
	}

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V")
	public synchronized void method2030() {
		this.aClass59_1.method1839();
		this.method2017();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
	public synchronized void method2031() {
		this.method2000();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(ILclient!bh;)I")
	private int method2032(@OriginalArg(1) Class2_Sub7 arg0) {
		@Pc(15) int local15 = this.anIntArray275[arg0.anInt400];
		return local15 < 8192 ? arg0.anInt406 * local15 + 32 >> 6 : 16384 - ((128 - arg0.anInt406) * (-local15 + 16384) + 32 >> 6);
	}
}
