import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class5_Sub7_Sub4 extends Class5_Sub7 {

	@OriginalMember(owner = "client!v", name = "fc", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "client!v", name = "gc", descriptor = "Z")
	private boolean aBoolean129;

	@OriginalMember(owner = "client!v", name = "hc", descriptor = "J")
	private long aLong138;

	@OriginalMember(owner = "client!v", name = "ic", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!v", name = "kc", descriptor = "I")
	private int anInt2985;

	@OriginalMember(owner = "client!v", name = "K", descriptor = "[I")
	public final int[] anIntArray446 = new int[16];

	@OriginalMember(owner = "client!v", name = "B", descriptor = "[I")
	private final int[] anIntArray445 = new int[16];

	@OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
	private final int[] anIntArray452 = new int[16];

	@OriginalMember(owner = "client!v", name = "X", descriptor = "[I")
	private final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!v", name = "R", descriptor = "[I")
	private final int[] anIntArray447 = new int[16];

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[[Lclient!ad;")
	private final Class5_Sub1[][] aClass5_Sub1ArrayArray1 = new Class5_Sub1[16][128];

	@OriginalMember(owner = "client!v", name = "Fb", descriptor = "[I")
	private final int[] anIntArray453 = new int[16];

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	private final int[] anIntArray451 = new int[16];

	@OriginalMember(owner = "client!v", name = "Mb", descriptor = "[I")
	private final int[] anIntArray455 = new int[16];

	@OriginalMember(owner = "client!v", name = "Ob", descriptor = "[I")
	public final int[] anIntArray456 = new int[16];

	@OriginalMember(owner = "client!v", name = "Rb", descriptor = "[I")
	private final int[] anIntArray457 = new int[16];

	@OriginalMember(owner = "client!v", name = "Ib", descriptor = "[I")
	private final int[] anIntArray454 = new int[16];

	@OriginalMember(owner = "client!v", name = "Ub", descriptor = "[I")
	private final int[] anIntArray458 = new int[16];

	@OriginalMember(owner = "client!v", name = "ab", descriptor = "[I")
	public final int[] anIntArray450 = new int[16];

	@OriginalMember(owner = "client!v", name = "Xb", descriptor = "[[Lclient!ad;")
	private final Class5_Sub1[][] aClass5_Sub1ArrayArray2 = new Class5_Sub1[16][128];

	@OriginalMember(owner = "client!v", name = "Wb", descriptor = "[I")
	private final int[] anIntArray459 = new int[16];

	@OriginalMember(owner = "client!v", name = "Zb", descriptor = "[I")
	private final int[] anIntArray460 = new int[16];

	@OriginalMember(owner = "client!v", name = "bc", descriptor = "I")
	private int anInt2980 = 256;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Lclient!ef;")
	private final Class22 aClass22_1 = new Class22();

	@OriginalMember(owner = "client!v", name = "jc", descriptor = "Lclient!fd;")
	private final Class5_Sub7_Sub1 aClass5_Sub7_Sub1_1 = new Class5_Sub7_Sub1(this);

	@OriginalMember(owner = "client!v", name = "Ab", descriptor = "Lclient!s;")
	private final Class66 aClass66_11 = new Class66(128);

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class5_Sub7_Sub4() {
		this.method2063();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "()Lclient!u;")
	@Override
	public synchronized Class5_Sub7 method2024() {
		return this.aClass5_Sub7_Sub1_1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZI)V")
	private void method2027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Z)V")
	public synchronized void method2029() {
		for (@Pc(11) Class5_Sub12 local11 = (Class5_Sub12) this.aClass66_11.method1815(); local11 != null; local11 = (Class5_Sub12) this.aClass66_11.method1809()) {
			local11.method1170();
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	private void method2030() {
		@Pc(4) int local4 = this.anInt2984;
		@Pc(11) int local11 = this.anInt2985;
		@Pc(14) long local14 = this.aLong139;
		while (local11 == this.anInt2985) {
			while (this.aClass22_1.anIntArray136[local4] == local11) {
				this.aClass22_1.method582(local4);
				@Pc(25) int local25 = this.aClass22_1.method578(local4);
				if (local25 == 1) {
					this.aClass22_1.method571();
					this.aClass22_1.method576(local4);
					if (this.aClass22_1.method585()) {
						if (!this.aBoolean129 || local11 == 0) {
							this.method2063();
							this.aClass22_1.method575();
							return;
						}
						this.aClass22_1.method580(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2065(local25);
				}
				this.aClass22_1.method572(local4);
				this.aClass22_1.method576(local4);
			}
			local4 = this.aClass22_1.method581();
			local11 = this.aClass22_1.anIntArray136[local4];
			local14 = this.aClass22_1.method573(local11);
		}
		this.anInt2985 = local11;
		this.anInt2984 = local4;
		this.aLong139 = local14;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	private void method2031() {
		this.anIntArray445[9] = 128;
		this.anIntArray459[9] = 128;
		this.method2058(128, 9);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
	public synchronized void method2032(@OriginalArg(0) int arg0) {
		this.anInt2980 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!fb;Lclient!sd;Lclient!gf;I)Z")
	public synchronized boolean method2033(@OriginalArg(1) Class23 arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) Class5_Sub8 arg2) {
		@Pc(7) boolean local7 = true;
		arg2.method786();
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class5_Sub10 local32 = (Class5_Sub10) arg2.aClass66_5.method1815(); local32 != null; local32 = (Class5_Sub10) arg2.aClass66_5.method1809()) {
			@Pc(38) int local38 = (int) local32.aLong146;
			@Pc(46) Class5_Sub12 local46 = (Class5_Sub12) this.aClass66_11.method1812((long) local38);
			if (local46 == null) {
				local46 = Static122.method2159(arg1, local38);
				if (local46 == null) {
					local7 = false;
					continue;
				}
				this.aClass66_11.method1811((long) local38, local46);
			}
			if (!local46.method1172(arg0, local26, local32.aByteArray22)) {
				local7 = false;
			}
		}
		if (local7) {
			arg2.method787();
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
	private void method2035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIB)V")
	private void method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2044(64, arg2, arg0);
		if ((this.anIntArray446[arg2] & 0x2) != 0) {
			for (@Pc(28) Class5_Sub1 local28 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method227(); local28 != null; local28 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method239()) {
				if (arg2 == local28.anInt74 && local28.anInt80 < 0) {
					this.aClass5_Sub1ArrayArray2[arg2][local28.anInt90] = null;
					this.aClass5_Sub1ArrayArray2[arg2][arg0] = local28;
					@Pc(63) int local63 = local28.anInt71 + (local28.anInt92 * local28.anInt83 >> 12);
					local28.anInt71 += arg0 - local28.anInt90 << 8;
					local28.anInt92 = local63 - local28.anInt71;
					local28.anInt83 = 4096;
					local28.anInt90 = arg0;
					return;
				}
			}
		}
		@Pc(108) Class5_Sub12 local108 = (Class5_Sub12) this.aClass66_11.method1812((long) this.anIntArray455[arg2]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class5_Sub5_Sub1 local116 = local108.aClass5_Sub5_Sub1Array1[arg0];
		if (local116 == null) {
			return;
		}
		@Pc(129) Class5_Sub1 local129 = new Class5_Sub1();
		local129.aClass5_Sub12_1 = local108;
		local129.aClass5_Sub5_Sub1_1 = local116;
		local129.anInt74 = arg2;
		local129.aClass14_1 = local108.aClass14Array1[arg0];
		local129.anInt78 = local108.aByteArray24[arg0];
		local129.anInt90 = arg0;
		local129.anInt89 = local108.aByteArray23[arg0] * arg1 * arg1 * local108.anInt1696 + 1024 >> 11;
		local129.anInt79 = local108.aByteArray25[arg0] & 0xFF;
		local129.anInt71 = (arg0 << 8) - (local108.aShortArray6[arg0] & 0x7FFF);
		local129.anInt93 = 0;
		local129.anInt85 = 0;
		local129.anInt80 = -1;
		local129.anInt87 = 0;
		local129.anInt76 = 0;
		if (this.anIntArray450[arg2] == 0) {
			local129.aClass5_Sub7_Sub2_1 = Static128.method1022(local116, this.method2059(local129), this.method2062(local129), this.method2067(local129));
		} else {
			local129.aClass5_Sub7_Sub2_1 = Static128.method1022(local116, this.method2059(local129), 0, this.method2067(local129));
			this.method2039(local108.aShortArray6[arg0] < 0, local129);
		}
		if (local108.aShortArray6[arg0] < 0) {
			local129.aClass5_Sub7_Sub2_1.method1028(-1);
		}
		if (local129.anInt78 >= 0) {
			@Pc(280) Class5_Sub1 local280 = this.aClass5_Sub1ArrayArray1[arg2][local129.anInt78];
			if (local280 != null && local280.anInt80 < 0) {
				this.aClass5_Sub1ArrayArray2[arg2][local280.anInt90] = null;
				local280.anInt80 = 0;
			}
			this.aClass5_Sub1ArrayArray1[arg2][local129.anInt78] = local129;
		}
		this.aClass5_Sub7_Sub1_1.aClass10_5.method234(local129);
		this.aClass5_Sub1ArrayArray2[arg2][arg0] = local129;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)I")
	public int method2038() {
		return this.anInt2980;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZLclient!ad;)V")
	public void method2039(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(4) int local4 = arg1.aClass5_Sub5_Sub1_1.aByteArray18.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass5_Sub5_Sub1_1.aBoolean33) {
			@Pc(44) int local44 = local4 + local4 - arg1.aClass5_Sub5_Sub1_1.anInt773;
			local33 = (int) ((long) local44 * (long) this.anIntArray450[arg1.anInt74] >> 6);
			local4 <<= 0x8;
			if (local4 <= local33) {
				local33 = local4 + local4 - local33 - 1;
				arg1.aClass5_Sub7_Sub2_1.method1024();
			}
		} else {
			local33 = (int) ((long) this.anIntArray450[arg1.anInt74] * (long) local4 >> 6);
		}
		arg1.aClass5_Sub7_Sub2_1.method1031(local33);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	private void method2041(@OriginalArg(1) int arg0) {
		if ((this.anIntArray446[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class5_Sub1 local16 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method230(); local16 != null; local16 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method233()) {
			if (local16.anInt74 == arg0) {
				local16.anInt91 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "()Lclient!u;")
	@Override
	public synchronized Class5_Sub7 method2026() {
		return null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLclient!gf;Z)V")
	public synchronized void method2043(@OriginalArg(1) Class5_Sub8 arg0, @OriginalArg(2) boolean arg1) {
		this.method2052();
		this.aClass22_1.method583(arg0.aByteArray20);
		this.aLong138 = 0L;
		this.aBoolean129 = arg1;
		@Pc(27) int local27 = this.aClass22_1.method584();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			this.aClass22_1.method582(local29);
			this.aClass22_1.method572(local29);
			this.aClass22_1.method576(local29);
		}
		this.anInt2984 = this.aClass22_1.method581();
		this.anInt2985 = this.aClass22_1.anIntArray136[this.anInt2984];
		this.aLong139 = this.aClass22_1.method573(this.anInt2985);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIBI)V")
	private void method2044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub1 local12 = this.aClass5_Sub1ArrayArray2[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub1ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray446[arg1] & 0x2) == 0) {
			local12.anInt80 = 0;
			return;
		}
		for (@Pc(49) Class5_Sub1 local49 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method230(); local49 != null; local49 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method233()) {
			if (local49.anInt74 == local12.anInt74 && local49.anInt80 < 0 && local12 != local49) {
				local12.anInt80 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(III)V")
	public synchronized void method2046() {
		this.method2031();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!ad;)Z")
	public boolean method2048(@OriginalArg(1) Class5_Sub1 arg0) {
		arg0.anInt81 = Static1.anInt3 / 100;
		if (arg0.anInt80 >= 0 && (arg0.aClass5_Sub7_Sub2_1 == null || arg0.aClass5_Sub7_Sub2_1.method1039())) {
			arg0.method66();
			arg0.method2144();
			if (arg0.anInt78 > 0 && this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78] == arg0) {
				this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt83;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray458[arg0.anInt74] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt83 = local59;
		}
		arg0.aClass5_Sub7_Sub2_1.method1013(this.method2059(arg0));
		arg0.anInt72++;
		@Pc(104) boolean local104 = false;
		@Pc(107) Class14 local107 = arg0.aClass14_1;
		arg0.anInt84 += local107.anInt521;
		@Pc(133) double local133 = (double) ((arg0.anInt90 - 60 << 8) + (arg0.anInt83 * arg0.anInt92 >> 12)) * 5.086263020833333E-6D;
		if (local107.anInt529 > 0) {
			if (local107.anInt522 <= 0) {
				arg0.anInt76 += 128;
			} else {
				arg0.anInt76 += (int) (Math.pow(2.0D, (double) local107.anInt522 * local133) * 128.0D + 0.5D);
			}
		}
		if (local107.aByteArray12 != null) {
			if (local107.anInt524 > 0) {
				arg0.anInt93 += (int) (Math.pow(2.0D, local133 * (double) local107.anInt524) * 128.0D + 0.5D);
			} else {
				arg0.anInt93 += 128;
			}
			while (arg0.anInt87 < local107.aByteArray12.length - 2 && arg0.anInt93 > (local107.aByteArray12[arg0.anInt87 + 2] & 0xFF) << 8) {
				arg0.anInt87 += 2;
			}
			if (local107.aByteArray12.length - 2 == arg0.anInt87 && local107.aByteArray12[arg0.anInt87 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg0.anInt80 >= 0 && local107.aByteArray11 != null && (this.anIntArray446[arg0.anInt74] & 0x1) == 0 && (arg0.anInt78 < 0 || arg0 != this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78])) {
			if (local107.anInt528 <= 0) {
				arg0.anInt80 += 128;
			} else {
				arg0.anInt80 += (int) (Math.pow(2.0D, (double) local107.anInt528 * local133) * 128.0D + 0.5D);
			}
			while (arg0.anInt85 < local107.aByteArray11.length - 2 && arg0.anInt80 > (local107.aByteArray11[arg0.anInt85 + 2] & 0xFF) << 8) {
				arg0.anInt85 += 2;
			}
			if (local107.aByteArray11.length - 2 == arg0.anInt85) {
				local104 = true;
			}
		}
		if (!local104) {
			arg0.aClass5_Sub7_Sub2_1.method1009(arg0.anInt81, this.method2062(arg0), this.method2067(arg0));
			return false;
		}
		arg0.aClass5_Sub7_Sub2_1.method1038(arg0.anInt81);
		if (arg0.aClass5_Sub7_Sub2_1.method1002()) {
			this.aClass5_Sub7_Sub1_1.aClass5_Sub7_Sub3_1.method2011(arg0.aClass5_Sub7_Sub2_1);
		}
		arg0.method66();
		if (arg0.anInt80 >= 0) {
			arg0.method2144();
			if (arg0.anInt78 > 0 && arg0 == this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78]) {
				this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(I)Z")
	public synchronized boolean method2049() {
		return this.aClass22_1.method577();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ad;B)Z")
	public boolean method2051(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub7_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt80 >= 0) {
			arg0.method2144();
			if (arg0.anInt78 > 0 && arg0 == this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78]) {
				this.aClass5_Sub1ArrayArray1[arg0.anInt74][arg0.anInt78] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public synchronized void method2052() {
		this.aClass22_1.method575();
		this.method2063();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(ZI)V")
	private void method2053(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method2053(local7);
			}
			return;
		}
		this.anIntArray447[arg0] = 12800;
		this.anIntArray453[arg0] = 8192;
		this.anIntArray457[arg0] = 16383;
		this.anIntArray452[arg0] = 8192;
		this.anIntArray454[arg0] = 0;
		this.anIntArray458[arg0] = 8192;
		this.method2060(arg0);
		this.method2041(arg0);
		this.anIntArray446[arg0] = 0;
		this.anIntArray451[arg0] = 32767;
		this.anIntArray448[arg0] = 256;
		this.anIntArray450[arg0] = 0;
		this.method2066(8192, arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)V")
	private void method2054(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class5_Sub1 local12 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method230(); local12 != null; local12 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method233()) {
			if ((arg0 < 0 || arg0 == local12.anInt74) && local12.anInt80 < 0) {
				this.aClass5_Sub1ArrayArray2[local12.anInt74][local12.anInt90] = null;
				local12.anInt80 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(IB)V")
	private void method2055(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class5_Sub1 local14 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method230(); local14 != null; local14 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method233()) {
			if (arg0 < 0 || arg0 == local14.anInt74) {
				if (local14.aClass5_Sub7_Sub2_1 != null) {
					local14.aClass5_Sub7_Sub2_1.method1038(Static1.anInt3 / 100);
					if (local14.aClass5_Sub7_Sub2_1.method1002()) {
						this.aClass5_Sub7_Sub1_1.aClass5_Sub7_Sub3_1.method2011(local14.aClass5_Sub7_Sub2_1);
					}
					local14.method66();
				}
				if (local14.anInt80 < 0) {
					this.aClass5_Sub1ArrayArray2[local14.anInt74][local14.anInt90] = null;
				}
				local14.method2144();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	public synchronized void method2056() {
		for (@Pc(13) Class5_Sub12 local13 = (Class5_Sub12) this.aClass66_11.method1815(); local13 != null; local13 = (Class5_Sub12) this.aClass66_11.method1809()) {
			local13.method2144();
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2025(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass22_1.method577()) {
			@Pc(17) int local17 = this.aClass22_1.anInt805 * 1000000 / Static1.anInt3;
			do {
				@Pc(27) long local27 = this.aLong138 + (long) arg2 * (long) local17;
				if (this.aLong139 - local27 >= 0L) {
					this.aLong138 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong139 + (long) local17 - this.aLong138 - 1L) / (long) local17);
				arg2 -= local57;
				this.aLong138 += (long) local57 * (long) local17;
				this.aClass5_Sub7_Sub1_1.method2025(arg0, arg1, local57);
				this.method2030();
				arg1 += local57;
			} while (this.aClass22_1.method577());
		}
		this.aClass5_Sub7_Sub1_1.method2025(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2021() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(III)V")
	private void method2058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray455[arg1] != arg0) {
			this.anIntArray455[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass5_Sub1ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!ad;B)I")
	private int method2059(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(18) int local18 = (arg0.anInt92 * arg0.anInt83 >> 12) + arg0.anInt71;
		local18 += (this.anIntArray452[arg0.anInt74] - 8192) * this.anIntArray448[arg0.anInt74] >> 12;
		@Pc(43) Class14 local43 = arg0.aClass14_1;
		@Pc(66) int local66;
		if (local43.anInt521 > 0 && (local43.anInt526 > 0 || this.anIntArray454[arg0.anInt74] > 0)) {
			local66 = local43.anInt526 << 2;
			@Pc(71) int local71 = local43.anInt527 << 1;
			if (arg0.anInt72 < local71) {
				local66 = local66 * arg0.anInt72 / local71;
			}
			local66 += this.anIntArray454[arg0.anInt74] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt84 & 0x1FF) * 0.01227184630308513D);
			local18 += (int) ((double) local66 * local101);
		}
		local66 = (int) ((double) (arg0.aClass5_Sub5_Sub1_1.anInt775 * 256) * Math.pow(2.0D, (double) local18 * 3.255208333333333E-4D) / (double) Static1.anInt3 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(IB)V")
	private void method2060(@OriginalArg(0) int arg0) {
		if ((this.anIntArray446[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class5_Sub1 local13 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method230(); local13 != null; local13 = (Class5_Sub1) this.aClass5_Sub7_Sub1_1.aClass10_5.method233()) {
			if (arg0 == local13.anInt74 && this.aClass5_Sub1ArrayArray2[arg0][local13.anInt90] == null && local13.anInt80 < 0) {
				local13.anInt80 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ad;I)I")
	private int method2062(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(2) Class14 local2 = arg0.aClass14_1;
		@Pc(28) int local28 = this.anIntArray447[arg0.anInt74] * this.anIntArray457[arg0.anInt74] + 4096 >> 13;
		@Pc(36) int local36 = local28 * local28 + 16384 >> 15;
		@Pc(45) int local45 = arg0.anInt89 * local36 + 16384 >> 15;
		local28 = local45 * this.anInt2980 + 128 >> 8;
		if (local2.anInt529 > 0) {
			local28 = (int) (Math.pow(0.5D, (double) local2.anInt529 * 1.953125E-5D * (double) arg0.anInt76) * (double) local28 + 0.5D);
		}
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(110) int local110;
		@Pc(122) int local122;
		if (local2.aByteArray12 != null) {
			local89 = local2.aByteArray12[arg0.anInt87 + 1];
			local92 = arg0.anInt93;
			if (local2.aByteArray12.length - 2 > arg0.anInt87) {
				local110 = (local2.aByteArray12[arg0.anInt87] & 0xFF) << 8;
				local122 = (local2.aByteArray12[arg0.anInt87 + 2] & 0xFF) << 8;
				local89 += (local92 - local110) * (local2.aByteArray12[arg0.anInt87 + 3] - local89) / (local122 - local110);
			}
			local28 = local28 * local89 + 32 >> 6;
		}
		if (arg0.anInt80 > 0 && local2.aByteArray11 != null) {
			local92 = arg0.anInt80;
			local89 = local2.aByteArray11[arg0.anInt85 + 1];
			if (local2.aByteArray11.length - 2 > arg0.anInt85) {
				local110 = (local2.aByteArray11[arg0.anInt85] & 0xFF) << 8;
				local122 = (local2.aByteArray11[arg0.anInt85 + 2] & 0xFF) << 8;
				local89 += (local92 - local110) * (local2.aByteArray11[arg0.anInt85 + 3] - local89) / (local122 - local110);
			}
			local28 = local89 * local28 + 32 >> 6;
		}
		return local28;
	}

	@OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V")
	private void method2063() {
		this.method2055(-1);
		this.method2053(-1);
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray455[local13] = this.anIntArray445[local13];
		}
		for (@Pc(28) int local28 = 0; local28 < 16; local28++) {
			this.anIntArray459[local28] = this.anIntArray445[local28] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(III)V")
	private void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray452[arg1] = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)V")
	private void method2065(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(36) int local36;
		@Pc(30) int local30;
		if (local9 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			local36 = arg0 >> 8 & 0x7F;
			this.method2044(local30, local24, local36);
		} else if (local9 == 144) {
			local36 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			local24 = arg0 & 0xF;
			if (local30 > 0) {
				this.method2036(local36, local30, local24);
			} else {
				this.method2044(64, local24, local36);
			}
		} else if (local9 == 160) {
			local36 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method2027(local36, local30, local24);
		} else if (local9 == 176) {
			local30 = arg0 >> 16 & 0x7F;
			local36 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			if (local36 == 0) {
				this.anIntArray459[local24] = (this.anIntArray459[local24] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local36 == 32) {
				this.anIntArray459[local24] = (local30 << 7) + (this.anIntArray459[local24] & 0xFFFFC07F);
			}
			if (local36 == 1) {
				this.anIntArray454[local24] = (local30 << 7) + (this.anIntArray454[local24] & 0xFFFFC07F);
			}
			if (local36 == 33) {
				this.anIntArray454[local24] = (this.anIntArray454[local24] & 0xFFFFFF80) + local30;
			}
			if (local36 == 5) {
				this.anIntArray458[local24] = (local30 << 7) + (this.anIntArray458[local24] & 0xFFFFC07F);
			}
			if (local36 == 37) {
				this.anIntArray458[local24] = local30 + (this.anIntArray458[local24] & 0xFFFFFF80);
			}
			if (local36 == 7) {
				this.anIntArray447[local24] = (local30 << 7) + (this.anIntArray447[local24] & 0xFFFFC07F);
			}
			if (local36 == 39) {
				this.anIntArray447[local24] = (this.anIntArray447[local24] & 0xFFFFFF80) + local30;
			}
			if (local36 == 10) {
				this.anIntArray453[local24] = (this.anIntArray453[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local36 == 42) {
				this.anIntArray453[local24] = (this.anIntArray453[local24] & 0xFFFFFF80) + local30;
			}
			if (local36 == 11) {
				this.anIntArray457[local24] = (local30 << 7) + (this.anIntArray457[local24] & 0xFFFFC07F);
			}
			if (local36 == 43) {
				this.anIntArray457[local24] = local30 + (this.anIntArray457[local24] & 0xFFFFFF80);
			}
			if (local36 == 64) {
				if (local30 >= 64) {
					this.anIntArray446[local24] |= 0x1;
				} else {
					this.anIntArray446[local24] &= 0xFFFFFFFE;
				}
			}
			if (local36 == 65) {
				if (local30 < 64) {
					this.method2060(local24);
					this.anIntArray446[local24] &= 0xFFFFFFFD;
				} else {
					this.anIntArray446[local24] |= 0x2;
				}
			}
			if (local36 == 99) {
				this.anIntArray451[local24] = (local30 << 7) + (this.anIntArray451[local24] & 0x7F);
			}
			if (local36 == 98) {
				this.anIntArray451[local24] = (this.anIntArray451[local24] & 0x3F80) + local30;
			}
			if (local36 == 101) {
				this.anIntArray451[local24] = (local30 << 7) + ((this.anIntArray451[local24] & 0x7F) + 16384);
			}
			if (local36 == 100) {
				this.anIntArray451[local24] = (this.anIntArray451[local24] & 0x3F80) + local30 + 16384;
			}
			if (local36 == 120) {
				this.method2055(local24);
			}
			if (local36 == 121) {
				this.method2053(local24);
			}
			if (local36 == 123) {
				this.method2054(local24);
			}
			@Pc(498) int local498;
			if (local36 == 6) {
				local498 = this.anIntArray451[local24];
				if (local498 == 16384) {
					this.anIntArray448[local24] = (local30 << 7) + (this.anIntArray448[local24] & 0xFFFFC07F);
				}
			}
			if (local36 == 38) {
				local498 = this.anIntArray451[local24];
				if (local498 == 16384) {
					this.anIntArray448[local24] = (this.anIntArray448[local24] & 0xFFFFFF80) + local30;
				}
			}
			if (local36 == 16) {
				this.anIntArray450[local24] = (this.anIntArray450[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local36 == 48) {
				this.anIntArray450[local24] = (this.anIntArray450[local24] & 0xFFFFFF80) + local30;
			}
			if (local36 == 81) {
				if (local30 >= 64) {
					this.anIntArray446[local24] |= 0x4;
				} else {
					this.method2041(local24);
					this.anIntArray446[local24] &= 0xFFFFFFFB;
				}
			}
			if (local36 == 17) {
				this.method2066((local30 << 7) + (this.anIntArray460[local24] & 0xFFFFC07F), local24);
			}
			if (local36 == 49) {
				this.method2066((this.anIntArray460[local24] & 0xFFFFFF80) + local30, local24);
			}
		} else if (local9 == 192) {
			local24 = arg0 & 0xF;
			local36 = arg0 >> 8 & 0x7F;
			this.method2058(local36 + this.anIntArray459[local24], local24);
		} else if (local9 == 208) {
			local36 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			this.method2035(local36, local24);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local36 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2064(local36, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2063();
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IIB)V")
	private void method2066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray460[arg1] = arg0;
		this.anIntArray456[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2023(@OriginalArg(0) int arg0) {
		if (this.aClass22_1.method577()) {
			@Pc(13) int local13 = this.aClass22_1.anInt805 * 1000000 / Static1.anInt3;
			do {
				@Pc(23) long local23 = this.aLong138 + (long) local13 * (long) arg0;
				if (this.aLong139 - local23 >= 0L) {
					this.aLong138 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong139 + (long) local13 - this.aLong138 - 1L) / (long) local13);
				this.aLong138 += (long) local13 * (long) local52;
				arg0 -= local52;
				this.aClass5_Sub7_Sub1_1.method2023(local52);
				this.method2030();
			} while (this.aClass22_1.method577());
		}
		this.aClass5_Sub7_Sub1_1.method2023(arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!ad;I)I")
	private int method2067(@OriginalArg(0) Class5_Sub1 arg0) {
		@Pc(17) int local17 = this.anIntArray453[arg0.anInt74];
		return local17 >= 8192 ? 16384 - ((16384 - local17) * (-arg0.anInt79 + 128) + 32 >> 6) : arg0.anInt79 * local17 + 32 >> 6;
	}
}
