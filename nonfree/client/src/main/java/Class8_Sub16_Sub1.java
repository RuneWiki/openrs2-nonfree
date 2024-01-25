import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class8_Sub16_Sub1 extends Class8_Sub16 {

	@OriginalMember(owner = "client!dia", name = "Fb", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!dia", name = "Gb", descriptor = "I")
	private int anInt2702;

	@OriginalMember(owner = "client!dia", name = "Hb", descriptor = "Z")
	private boolean aBoolean200;

	@OriginalMember(owner = "client!dia", name = "Ib", descriptor = "I")
	private int anInt2703;

	@OriginalMember(owner = "client!dia", name = "Jb", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!dia", name = "Kb", descriptor = "Lclient!uia;")
	private Class8_Sub47 aClass8_Sub47_2;

	@OriginalMember(owner = "client!dia", name = "Lb", descriptor = "I")
	private int anInt2704;

	@OriginalMember(owner = "client!dia", name = "Mb", descriptor = "Z")
	private boolean aBoolean201;

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!dia", name = "t", descriptor = "[[Lclient!sia;")
	private final Class8_Sub43[][] aClass8_Sub43ArrayArray1 = new Class8_Sub43[16][128];

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!dia", name = "V", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!dia", name = "ab", descriptor = "[I")
	public final int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!dia", name = "O", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!dia", name = "B", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!dia", name = "F", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!dia", name = "X", descriptor = "I")
	private int anInt2680 = 256;

	@OriginalMember(owner = "client!dia", name = "v", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!dia", name = "tb", descriptor = "[I")
	private final int[] anIntArray132 = new int[16];

	@OriginalMember(owner = "client!dia", name = "C", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!dia", name = "J", descriptor = "[I")
	public final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!dia", name = "nb", descriptor = "I")
	private final int anInt2691 = 1000000;

	@OriginalMember(owner = "client!dia", name = "T", descriptor = "[[Lclient!sia;")
	private final Class8_Sub43[][] aClass8_Sub43ArrayArray2 = new Class8_Sub43[16][128];

	@OriginalMember(owner = "client!dia", name = "fb", descriptor = "[I")
	private final int[] anIntArray130 = new int[16];

	@OriginalMember(owner = "client!dia", name = "mb", descriptor = "[I")
	public final int[] anIntArray131 = new int[16];

	@OriginalMember(owner = "client!dia", name = "I", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!dia", name = "yb", descriptor = "[I")
	private final int[] anIntArray133 = new int[16];

	@OriginalMember(owner = "client!dia", name = "Ab", descriptor = "[I")
	private final int[] anIntArray134 = new int[16];

	@OriginalMember(owner = "client!dia", name = "vb", descriptor = "Lclient!ks;")
	private final Class185 aClass185_1 = new Class185();

	@OriginalMember(owner = "client!dia", name = "Eb", descriptor = "Lclient!qp;")
	private final Class8_Sub16_Sub4 aClass8_Sub16_Sub4_1 = new Class8_Sub16_Sub4(this);

	@OriginalMember(owner = "client!dia", name = "Db", descriptor = "Lclient!pfa;")
	private final Class253 aClass253_5;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "()V")
	public Class8_Sub16_Sub1() {
		this.aClass253_5 = new Class253(128);
		this.method2282(256, -1);
		this.method2296(true);
	}

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class8_Sub16_Sub1(@OriginalArg(0) Class8_Sub16_Sub1 arg0) {
		this.aClass253_5 = arg0.aClass253_5;
		this.method2282(256, -1);
		this.method2296(true);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BLclient!sia;)I")
	private int method2261(@OriginalArg(1) Class8_Sub43 arg0) {
		@Pc(16) int local16 = this.anIntArray120[arg0.anInt9045];
		return local16 < 8192 ? local16 * arg0.anInt9048 + 32 >> 6 : 16384 - ((128 - arg0.anInt9048) * (-local16 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZIII)V")
	private void method2262(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2293(arg1, arg2, 64);
		if ((this.anIntArray128[arg1] & 0x2) != 0) {
			for (@Pc(25) Class8_Sub43 local25 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1421(); local25 != null; local25 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1433()) {
				if (arg1 == local25.anInt9045 && local25.anInt9035 < 0) {
					this.aClass8_Sub43ArrayArray2[arg1][local25.anInt9050] = null;
					this.aClass8_Sub43ArrayArray2[arg1][arg2] = local25;
					@Pc(60) int local60 = (local25.anInt9042 * local25.anInt9039 >> 12) + local25.anInt9038;
					local25.anInt9038 += arg2 - local25.anInt9050 << 8;
					local25.anInt9050 = arg2;
					local25.anInt9042 = 4096;
					local25.anInt9039 = local60 - local25.anInt9038;
					return;
				}
			}
		}
		@Pc(105) Class8_Sub41 local105 = (Class8_Sub41) this.aClass253_5.method6594((long) this.anIntArray132[arg1]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class8_Sub9_Sub1 local113 = local105.aClass8_Sub9_Sub1Array1[arg2];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class8_Sub43 local120 = new Class8_Sub43();
		local120.aClass8_Sub41_1 = local105;
		local120.anInt9045 = arg1;
		local120.aClass8_Sub9_Sub1_4 = local113;
		local120.aClass260_1 = local105.aClass260Array1[arg2];
		local120.anInt9040 = local105.aByteArray73[arg2];
		local120.anInt9050 = arg2;
		local120.anInt9034 = local105.aByteArray72[arg2] * arg0 * arg0 * local105.anInt8298 + 1024 >> 11;
		local120.anInt9048 = local105.aByteArray74[arg2] & 0xFF;
		local120.anInt9038 = (arg2 << 8) - (local105.aShortArray102[arg2] & 0x7FFF);
		local120.anInt9037 = 0;
		local120.anInt9031 = 0;
		local120.anInt9033 = 0;
		local120.anInt9032 = 0;
		local120.anInt9035 = -1;
		if (this.anIntArray131[arg1] == 0) {
			local120.aClass8_Sub16_Sub3_4 = Static651.method6782(local113, this.method2265(local120), this.method2291(local120), this.method2261(local120));
		} else {
			local120.aClass8_Sub16_Sub3_4 = Static651.method6782(local113, this.method2265(local120), 0, this.method2261(local120));
			this.method2292(local105.aShortArray102[arg2] < 0, local120);
		}
		if (local105.aShortArray102[arg2] < 0) {
			local120.aClass8_Sub16_Sub3_4.method6773(-1);
		}
		if (local120.anInt9040 >= 0) {
			@Pc(268) Class8_Sub43 local268 = this.aClass8_Sub43ArrayArray1[arg1][local120.anInt9040];
			if (local268 != null && local268.anInt9035 < 0) {
				this.aClass8_Sub43ArrayArray2[arg1][local268.anInt9050] = null;
				local268.anInt9035 = 0;
			}
			this.aClass8_Sub43ArrayArray1[arg1][local120.anInt9040] = local120;
		}
		this.aClass8_Sub16_Sub4_1.aClass43_54.method1424(local120);
		this.aClass8_Sub43ArrayArray2[arg1][arg2] = local120;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)V")
	private void method2263() {
		@Pc(8) int local8 = this.anInt2703;
		@Pc(15) int local15 = this.anInt2702;
		@Pc(18) long local18 = this.aLong62;
		if (this.aClass8_Sub47_2 != null && local15 == this.anInt2704) {
			this.method2264(this.aBoolean201, this.aClass8_Sub47_2, this.aBoolean200);
			this.method2263();
			return;
		}
		while (local15 == this.anInt2702) {
			while (this.aClass185_1.anIntArray348[local8] == local15) {
				this.aClass185_1.method4865(local8);
				@Pc(51) int local51 = this.aClass185_1.method4880(local8);
				if (local51 == 1) {
					this.aClass185_1.method4868();
					this.aClass185_1.method4877(local8);
					if (this.aClass185_1.method4876()) {
						if (this.aClass8_Sub47_2 != null) {
							this.method2289(this.aBoolean200, this.aClass8_Sub47_2);
							this.method2263();
							return;
						}
						if (!this.aBoolean200 || local15 == 0) {
							this.method2296(true);
							this.aClass185_1.method4878();
							return;
						}
						this.aClass185_1.method4869(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method2276(local51);
				}
				this.aClass185_1.method4874(local8);
				this.aClass185_1.method4877(local8);
			}
			local8 = this.aClass185_1.method4873();
			local15 = this.aClass185_1.anIntArray348[local8];
			local18 = this.aClass185_1.method4875(local15);
		}
		this.anInt2703 = local8;
		this.aLong62 = local18;
		this.anInt2702 = local15;
		if (this.aClass8_Sub47_2 != null && this.anInt2704 < local15) {
			this.anInt2702 = this.anInt2704;
			this.anInt2703 = -1;
			this.aLong62 = this.aClass185_1.method4875(this.anInt2702);
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZLclient!uia;IZ)V")
	private synchronized void method2264(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub47 arg1, @OriginalArg(3) boolean arg2) {
		this.method2274(arg0);
		this.aClass185_1.method4872(arg1.aByteArray91);
		this.aLong63 = 0L;
		this.aBoolean200 = arg2;
		@Pc(30) int local30 = this.aClass185_1.method4867();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass185_1.method4865(local32);
			this.aClass185_1.method4874(local32);
			this.aClass185_1.method4877(local32);
		}
		this.anInt2703 = this.aClass185_1.method4873();
		this.anInt2702 = this.aClass185_1.anIntArray348[this.anInt2703];
		this.aLong62 = this.aClass185_1.method4875(this.anInt2702);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Lclient!sia;B)I")
	private int method2265(@OriginalArg(0) Class8_Sub43 arg0) {
		@Pc(19) int local19 = (arg0.anInt9039 * arg0.anInt9042 >> 12) + arg0.anInt9038;
		local19 += this.anIntArray121[arg0.anInt9045] * (this.anIntArray119[arg0.anInt9045] - 8192) >> 12;
		@Pc(40) Class260 local40 = arg0.aClass260_1;
		@Pc(60) int local60;
		if (local40.anInt8163 > 0 && (local40.anInt8165 > 0 || this.anIntArray124[arg0.anInt9045] > 0)) {
			local60 = local40.anInt8165 << 2;
			@Pc(65) int local65 = local40.anInt8166 << 1;
			if (arg0.anInt9036 < local65) {
				local60 = local60 * arg0.anInt9036 / local65;
			}
			local60 += this.anIntArray124[arg0.anInt9045] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt9041 & 0x1FF) * 0.01227184630308513D);
			local19 += (int) ((double) local60 * local95);
		}
		local60 = (int) ((double) (arg0.aClass8_Sub9_Sub1_4.anInt1947 * 256) * Math.pow(2.0D, (double) local19 * 3.255208333333333E-4D) / (double) Static345.anInt6689 + 0.5D);
		return local60 < 1 ? 1 : local60;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IB)V")
	private void method2266(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2266(local12);
			}
			return;
		}
		this.anIntArray130[arg0] = 12800;
		this.anIntArray120[arg0] = 8192;
		this.anIntArray122[arg0] = 16383;
		this.anIntArray119[arg0] = 8192;
		this.anIntArray124[arg0] = 0;
		this.anIntArray123[arg0] = 8192;
		this.method2278(arg0);
		this.method2288(arg0);
		this.anIntArray128[arg0] = 0;
		this.anIntArray118[arg0] = 32767;
		this.anIntArray121[arg0] = 256;
		this.anIntArray131[arg0] = 0;
		this.method2275(arg0, 8192);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IJ)V")
	private void method2267(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong62) {
			@Pc(16) int local16 = this.anInt2703;
			@Pc(19) int local19 = this.anInt2702;
			@Pc(22) long local22 = this.aLong62;
			while (this.anInt2702 == local19) {
				while (this.aClass185_1.anIntArray348[local16] == local19) {
					this.aClass185_1.method4865(local16);
					@Pc(33) int local33 = this.aClass185_1.method4880(local16);
					if (local33 == 1) {
						this.aClass185_1.method4868();
						this.aClass185_1.method4877(local16);
						if (this.aClass185_1.method4876()) {
							if (!this.aBoolean200 || local19 == 0) {
								this.method2296(true);
								this.aClass185_1.method4878();
								return;
							}
							this.aClass185_1.method4869(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method2276(local33);
					}
					this.aClass185_1.method4874(local16);
					this.aClass185_1.method4877(local16);
				}
				this.aLong63 = local22;
				local16 = this.aClass185_1.method4873();
				local19 = this.aClass185_1.anIntArray348[local16];
				local22 = this.aClass185_1.method4875(local19);
			}
			this.anInt2703 = local16;
			this.aLong62 = local22;
			this.anInt2702 = local19;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)V")
	private void method2268(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I[IIILclient!sia;)Z")
	public boolean method2269(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub43 arg3) {
		arg3.anInt9047 = Static345.anInt6689 / 100;
		if (arg3.anInt9035 >= 0 && (arg3.aClass8_Sub16_Sub3_4 == null || arg3.aClass8_Sub16_Sub3_4.method6792())) {
			arg3.method7410();
			arg3.method8640();
			if (arg3.anInt9040 > 0 && arg3 == this.aClass8_Sub43ArrayArray1[arg3.anInt9045][arg3.anInt9040]) {
				this.aClass8_Sub43ArrayArray1[arg3.anInt9045][arg3.anInt9040] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt9042;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray123[arg3.anInt9045] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt9042 = local53;
		}
		arg3.aClass8_Sub16_Sub3_4.method6774(this.method2265(arg3));
		@Pc(93) Class260 local93 = arg3.aClass260_1;
		arg3.anInt9036++;
		@Pc(101) boolean local101 = false;
		arg3.anInt9041 += local93.anInt8163;
		@Pc(126) double local126 = (double) ((arg3.anInt9050 - 60 << 8) + (arg3.anInt9039 * arg3.anInt9042 >> 12)) * 5.086263020833333E-6D;
		if (local93.anInt8171 > 0) {
			if (local93.anInt8167 > 0) {
				arg3.anInt9033 += (int) (Math.pow(2.0D, (double) local93.anInt8167 * local126) * 128.0D + 0.5D);
			} else {
				arg3.anInt9033 += 128;
			}
			if (arg3.anInt9033 * local93.anInt8171 >= 819200) {
				local101 = true;
			}
		}
		if (local93.aByteArray70 != null) {
			if (local93.anInt8169 <= 0) {
				arg3.anInt9032 += 128;
			} else {
				arg3.anInt9032 += (int) (Math.pow(2.0D, (double) local93.anInt8169 * local126) * 128.0D + 0.5D);
			}
			while (local93.aByteArray70.length - 2 > arg3.anInt9031 && arg3.anInt9032 > (local93.aByteArray70[arg3.anInt9031 + 2] & 0xFF) << 8) {
				arg3.anInt9031 += 2;
			}
			if (arg3.anInt9031 == local93.aByteArray70.length - 2 && local93.aByteArray70[arg3.anInt9031 + 1] == 0) {
				local101 = true;
			}
		}
		if (arg3.anInt9035 >= 0 && local93.aByteArray71 != null && (this.anIntArray128[arg3.anInt9045] & 0x1) == 0 && (arg3.anInt9040 < 0 || this.aClass8_Sub43ArrayArray1[arg3.anInt9045][arg3.anInt9040] != arg3)) {
			if (local93.anInt8164 > 0) {
				arg3.anInt9035 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt8164) * 128.0D + 0.5D);
			} else {
				arg3.anInt9035 += 128;
			}
			while (local93.aByteArray71.length - 2 > arg3.anInt9037 && (local93.aByteArray71[arg3.anInt9037 + 2] & 0xFF) << 8 < arg3.anInt9035) {
				arg3.anInt9037 += 2;
			}
			if (local93.aByteArray71.length - 2 == arg3.anInt9037) {
				local101 = true;
			}
		}
		if (!local101) {
			arg3.aClass8_Sub16_Sub3_4.method6771(arg3.anInt9047, this.method2291(arg3), this.method2261(arg3));
			return false;
		}
		arg3.aClass8_Sub16_Sub3_4.method6759(arg3.anInt9047);
		if (arg0 == null) {
			arg3.aClass8_Sub16_Sub3_4.method7435(arg1);
		} else {
			arg3.aClass8_Sub16_Sub3_4.method7430(arg0, arg2, arg1);
		}
		if (arg3.aClass8_Sub16_Sub3_4.method6765()) {
			this.aClass8_Sub16_Sub4_1.aClass8_Sub16_Sub5_2.method7442(arg3.aClass8_Sub16_Sub3_4);
		}
		arg3.method7410();
		if (arg3.anInt9035 >= 0) {
			arg3.method8640();
			if (arg3.anInt9040 > 0 && this.aClass8_Sub43ArrayArray1[arg3.anInt9045][arg3.anInt9040] == arg3) {
				this.aClass8_Sub43ArrayArray1[arg3.anInt9045][arg3.anInt9040] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(Z)I")
	public int method2270() {
		return this.anInt2680;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "()Lclient!eia;")
	@Override
	public synchronized Class8_Sub16 method7429() {
		return null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BII)V")
	private void method2271(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray132[arg0]) {
			this.anIntArray132[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass8_Sub43ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BIII)V")
	private void method2272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass185_1.method4870()) {
			@Pc(14) int local14 = this.anInt2691 * this.aClass185_1.anInt5946 / Static345.anInt6689;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong63;
				if (this.aLong62 - local23 >= 0L) {
					this.aLong63 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong62 + (long) local14 - this.aLong63 - 1L) / (long) local14);
				this.aLong63 += (long) local14 * (long) local54;
				this.aClass8_Sub16_Sub4_1.method7430(arg0, arg1, local54);
				arg2 -= local54;
				this.method2263();
				arg1 += local54;
			} while (this.aClass185_1.method4870());
		}
		this.aClass8_Sub16_Sub4_1.method7430(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(B)V")
	public synchronized void method2273() {
		for (@Pc(12) Class8_Sub41 local12 = (Class8_Sub41) this.aClass253_5.method6593(); local12 != null; local12 = (Class8_Sub41) this.aClass253_5.method6595()) {
			local12.method6857();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZI)V")
	private synchronized void method2274(@OriginalArg(0) boolean arg0) {
		this.aClass185_1.method4878();
		this.aClass8_Sub47_2 = null;
		this.method2296(arg0);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(III)V")
	private void method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray127[arg0] = arg1;
		this.anIntArray125[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)V")
	private void method2276(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2293(local16, local22, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2293(local16, local22, 64);
			} else {
				this.method2262(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2272(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray126[local16] = (this.anIntArray126[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray126[local16] = (this.anIntArray126[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray124[local16] = (local28 << 7) + (this.anIntArray124[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray124[local16] = local28 + (this.anIntArray124[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray123[local16] = (local28 << 7) + (this.anIntArray123[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray123[local16] = (this.anIntArray123[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray130[local16] = (this.anIntArray130[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray130[local16] = (this.anIntArray130[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray120[local16] = (this.anIntArray120[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray120[local16] = local28 + (this.anIntArray120[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray122[local16] = (local28 << 7) + (this.anIntArray122[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray122[local16] = local28 + (this.anIntArray122[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray128[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray128[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray128[local16] |= 0x2;
				} else {
					this.method2278(local16);
					this.anIntArray128[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray118[local16] = (local28 << 7) + (this.anIntArray118[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray118[local16] = local28 + (this.anIntArray118[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray118[local16] = (local28 << 7) + (this.anIntArray118[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray118[local16] = local28 + (this.anIntArray118[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2299(local16);
			}
			if (local22 == 121) {
				this.method2266(local16);
			}
			if (local22 == 123) {
				this.method2281(local16);
			}
			@Pc(502) int local502;
			if (local22 == 6) {
				local502 = this.anIntArray118[local16];
				if (local502 == 16384) {
					this.anIntArray121[local16] = (local28 << 7) + (this.anIntArray121[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local502 = this.anIntArray118[local16];
				if (local502 == 16384) {
					this.anIntArray121[local16] = (this.anIntArray121[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray131[local16] = (local28 << 7) + (this.anIntArray131[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray131[local16] = (this.anIntArray131[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method2288(local16);
					this.anIntArray128[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray128[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method2275(local16, (this.anIntArray127[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method2275(local16, (this.anIntArray127[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2271(local16, local22 + this.anIntArray126[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2268(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2287(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2296(true);
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(I)V")
	public synchronized void method2277() {
		this.method2274(true);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)V")
	private void method2278(@OriginalArg(1) int arg0) {
		if ((this.anIntArray128[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class8_Sub43 local30 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1422(); local30 != null; local30 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1426()) {
			if (arg0 == local30.anInt9045 && this.aClass8_Sub43ArrayArray2[arg0][local30.anInt9050] == null && local30.anInt9035 < 0) {
				local30.anInt9035 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!uia;Lclient!oh;ILclient!vi;)Z")
	public synchronized boolean method2280(@OriginalArg(1) Class8_Sub47 arg0, @OriginalArg(2) Class237 arg1, @OriginalArg(4) Class357 arg2) {
		arg0.method7989();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class8_Sub42 local31 = (Class8_Sub42) arg0.aClass253_39.method6593(); local31 != null; local31 = (Class8_Sub42) arg0.aClass253_39.method6595()) {
			@Pc(37) int local37 = (int) local31.aLong285;
			@Pc(45) Class8_Sub41 local45 = (Class8_Sub41) this.aClass253_5.method6594((long) local37);
			if (local45 == null) {
				local45 = Static418.method6563(arg1, local37);
				if (local45 == null) {
					local14 = false;
					continue;
				}
				this.aClass253_5.method6591(local45, (long) local37);
			}
			if (!local45.method6858(local25, arg2, local31.aByteArray80)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.method7991();
		}
		return local14;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(BI)V")
	private void method2281(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class8_Sub43 local14 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1422(); local14 != null; local14 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1426()) {
			if ((arg0 < 0 || local14.anInt9045 == arg0) && local14.anInt9035 < 0) {
				this.aClass8_Sub43ArrayArray2[local14.anInt9045][local14.anInt9050] = null;
				local14.anInt9035 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(III)V")
	public synchronized void method2282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
				this.anIntArray134[local6] = arg0;
			}
		} else {
			this.anIntArray134[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7435(@OriginalArg(0) int arg0) {
		if (this.aClass185_1.method4870()) {
			@Pc(18) int local18 = this.aClass185_1.anInt5946 * this.anInt2691 / Static345.anInt6689;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong63;
				if (this.aLong62 - local27 >= 0L) {
					this.aLong63 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong62 + (long) local18 - this.aLong63 - 1L) / (long) local18);
				this.aLong63 += (long) local18 * (long) local57;
				this.aClass8_Sub16_Sub4_1.method7435(local57);
				arg0 -= local57;
				this.method2263();
			} while (this.aClass185_1.method4870());
		}
		this.aClass8_Sub16_Sub4_1.method7435(arg0);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IBI)V")
	private void method2283() {
		this.anIntArray133[9] = 128;
		this.anIntArray126[9] = 128;
		this.method2271(9, 128);
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(Lclient!sia;B)Z")
	public boolean method2285(@OriginalArg(0) Class8_Sub43 arg0) {
		if (arg0.aClass8_Sub16_Sub3_4 != null) {
			return false;
		}
		if (arg0.anInt9035 >= 0) {
			arg0.method8640();
			if (arg0.anInt9040 > 0 && this.aClass8_Sub43ArrayArray1[arg0.anInt9045][arg0.anInt9040] == arg0) {
				this.aClass8_Sub43ArrayArray1[arg0.anInt9045][arg0.anInt9040] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(III)V")
	public synchronized void method2286() {
		this.method2283();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIB)V")
	private void method2287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray119[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(II)V")
	private void method2288(@OriginalArg(1) int arg0) {
		if ((this.anIntArray128[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(28) Class8_Sub43 local28 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1422(); local28 != null; local28 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1426()) {
			if (local28.anInt9045 == arg0) {
				local28.anInt9049 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZLclient!uia;Z)V")
	public synchronized void method2289(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub47 arg1) {
		this.method2264(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!dia", name = "f", descriptor = "(I)Z")
	public synchronized boolean method2290() {
		return this.aClass185_1.method4870();
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7431() {
		return 0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILclient!sia;)I")
	private int method2291(@OriginalArg(1) Class8_Sub43 arg0) {
		if (this.anIntArray134[arg0.anInt9045] == 0) {
			return 0;
		}
		@Pc(23) Class260 local23 = arg0.aClass260_1;
		@Pc(39) int local39 = this.anIntArray122[arg0.anInt9045] * this.anIntArray130[arg0.anInt9045] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = local47 * arg0.anInt9034 + 16384 >> 15;
		@Pc(65) int local65 = local56 * this.anInt2680 + 128 >> 8;
		local39 = this.anIntArray134[arg0.anInt9045] * local65 + 128 >> 8;
		if (local23.anInt8171 > 0) {
			local39 = (int) (Math.pow(0.5D, (double) arg0.anInt9033 * 1.953125E-5D * (double) local23.anInt8171) * (double) local39 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local23.aByteArray70 != null) {
			local104 = arg0.anInt9032;
			local112 = local23.aByteArray70[arg0.anInt9031 + 1];
			if (arg0.anInt9031 < local23.aByteArray70.length - 2) {
				local130 = (local23.aByteArray70[arg0.anInt9031] & 0xFF) << 8;
				local142 = (local23.aByteArray70[arg0.anInt9031 + 2] & 0xFF) << 8;
				local112 += (local104 - local130) * (-local112 + local23.aByteArray70[arg0.anInt9031 + 3]) / (local142 - local130);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		if (arg0.anInt9035 > 0 && local23.aByteArray71 != null) {
			local104 = arg0.anInt9035;
			local112 = local23.aByteArray71[arg0.anInt9037 + 1];
			if (arg0.anInt9037 < local23.aByteArray71.length - 2) {
				local130 = (local23.aByteArray71[arg0.anInt9037] & 0xFF) << 8;
				local142 = (local23.aByteArray71[arg0.anInt9037 + 2] & 0xFF) << 8;
				local112 += (local104 - local130) * (-local112 + local23.aByteArray71[arg0.anInt9037 + 3]) / (local142 - local130);
			}
			local39 = local112 * local39 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "()Lclient!eia;")
	@Override
	public synchronized Class8_Sub16 method7434() {
		return this.aClass8_Sub16_Sub4_1;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZBLclient!sia;)V")
	public void method2292(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub43 arg1) {
		@Pc(8) int local8 = arg1.aClass8_Sub9_Sub1_4.aByteArray8.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass8_Sub9_Sub1_4.aBoolean132) {
			@Pc(38) int local38 = local8 + local8 - arg1.aClass8_Sub9_Sub1_4.anInt1948;
			local27 = (int) ((long) this.anIntArray131[arg1.anInt9045] * (long) local38 >> 6);
			local8 <<= 0x8;
			if (local8 <= local27) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass8_Sub16_Sub3_4.method6769();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray131[arg1.anInt9045] >> 6);
		}
		arg1.aClass8_Sub16_Sub3_4.method6787(local27);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIB)V")
	private void method2293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class8_Sub43 local12 = this.aClass8_Sub43ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass8_Sub43ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray128[arg0] & 0x2) == 0) {
			local12.anInt9035 = 0;
			return;
		}
		for (@Pc(44) Class8_Sub43 local44 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1422(); local44 != null; local44 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1426()) {
			if (local44.anInt9045 == local12.anInt9045 && local44.anInt9035 < 0 && local12 != local44) {
				local12.anInt9035 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(II)V")
	public synchronized void method2294(@OriginalArg(1) int arg0) {
		this.anInt2680 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZB)V")
	private void method2296(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2299(-1);
		} else {
			this.method2281(-1);
		}
		this.method2266(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray132[local23] = this.anIntArray133[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray126[local39] = this.anIntArray133[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(B)V")
	public synchronized void method2297() {
		for (@Pc(15) Class8_Sub41 local15 = (Class8_Sub41) this.aClass253_5.method6593(); local15 != null; local15 = (Class8_Sub41) this.aClass253_5.method6595()) {
			local15.method8640();
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(JZLclient!uia;ZI)V")
	public synchronized void method2298(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8_Sub47 arg2) {
		this.method2264(true, arg2, arg1);
		this.method2267((long) this.aClass185_1.anInt5946 * arg0);
	}

	@OriginalMember(owner = "client!dia", name = "e", descriptor = "(II)V")
	private void method2299(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class8_Sub43 local10 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1422(); local10 != null; local10 = (Class8_Sub43) this.aClass8_Sub16_Sub4_1.aClass43_54.method1426()) {
			if (arg0 < 0 || local10.anInt9045 == arg0) {
				if (local10.aClass8_Sub16_Sub3_4 != null) {
					local10.aClass8_Sub16_Sub3_4.method6759(Static345.anInt6689 / 100);
					if (local10.aClass8_Sub16_Sub3_4.method6765()) {
						this.aClass8_Sub16_Sub4_1.aClass8_Sub16_Sub5_2.method7442(local10.aClass8_Sub16_Sub3_4);
					}
					local10.method7410();
				}
				if (local10.anInt9035 < 0) {
					this.aClass8_Sub43ArrayArray2[local10.anInt9045][local10.anInt9050] = null;
				}
				local10.method8640();
			}
		}
	}
}
