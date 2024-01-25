import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class12_Sub13_Sub2 extends Class12_Sub13 {

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "Lclient!tl;")
	public static final Class285 lb;

	@OriginalMember(owner = "client!kb", name = "Ib", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!kb", name = "Jb", descriptor = "I")
	private int anInt5098;

	@OriginalMember(owner = "client!kb", name = "Kb", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!kb", name = "Lb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!kb", name = "Mb", descriptor = "J")
	private long aLong137;

	@OriginalMember(owner = "client!kb", name = "Ob", descriptor = "I")
	private int anInt5099;

	@OriginalMember(owner = "client!kb", name = "Pb", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!kb", name = "Qb", descriptor = "Lclient!sda;")
	private Class12_Sub45 aClass12_Sub45_2;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "[I")
	public final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
	private int anInt5076 = 256;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
	private final int anInt5081 = 1000000;

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!kb", name = "hb", descriptor = "[I")
	public final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!kb", name = "yb", descriptor = "[[Lclient!dg;")
	private final Class12_Sub9[][] aClass12_Sub9ArrayArray2 = new Class12_Sub9[16][128];

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "[I")
	private final int[] anIntArray362 = new int[16];

	@OriginalMember(owner = "client!kb", name = "xb", descriptor = "[[Lclient!dg;")
	private final Class12_Sub9[][] aClass12_Sub9ArrayArray1 = new Class12_Sub9[16][128];

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!kb", name = "Bb", descriptor = "[I")
	private final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!kb", name = "Eb", descriptor = "[I")
	public final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!kb", name = "Cb", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "Lclient!qf;")
	private final Class251 aClass251_1 = new Class251();

	@OriginalMember(owner = "client!kb", name = "Nb", descriptor = "Lclient!pt;")
	private final Class12_Sub13_Sub3 aClass12_Sub13_Sub3_1 = new Class12_Sub13_Sub3(this);

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lclient!dea;")
	private final Class68 aClass68_40 = new Class68(128);

	static {
		new Class88("Player ", "Spieler ", "Joueur ", "Jogador ");
		lb = new Class285("WTQA", 2);
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
	public Class12_Sub13_Sub2() {
		this.method4248();
		this.method4269(true);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public synchronized void method4242() {
		this.method4250(true);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!dg;I)I")
	private int method4243(@OriginalArg(0) Class12_Sub9 arg0) {
		@Pc(17) int local17 = this.anIntArray357[arg0.anInt2144];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt2142) * (-local17 + 16384) + 32 >> 6) : arg0.anInt2142 * local17 + 32 >> 6;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Lclient!dg;I)I")
	private int method4244(@OriginalArg(0) Class12_Sub9 arg0) {
		@Pc(20) int local20 = arg0.anInt2143 + (arg0.anInt2151 * arg0.anInt2150 >> 12);
		local20 += (this.anIntArray361[arg0.anInt2144] - 8192) * this.anIntArray354[arg0.anInt2144] >> 12;
		@Pc(41) Class281 local41 = arg0.aClass281_1;
		@Pc(61) int local61;
		if (local41.anInt8374 > 0 && (local41.anInt8370 > 0 || this.anIntArray364[arg0.anInt2144] > 0)) {
			local61 = local41.anInt8370 << 2;
			@Pc(66) int local66 = local41.anInt8368 << 1;
			if (arg0.anInt2146 < local66) {
				local61 = arg0.anInt2146 * local61 / local66;
			}
			local61 += this.anIntArray364[arg0.anInt2144] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt2153 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass12_Sub29_Sub1_1.anInt5186 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static426.anInt6103 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[ILclient!dg;Z)Z")
	public boolean method4245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class12_Sub9 arg3) {
		arg3.anInt2154 = Static426.anInt6103 / 100;
		if (arg3.anInt2140 >= 0 && (arg3.aClass12_Sub13_Sub4_1 == null || arg3.aClass12_Sub13_Sub4_1.method7712())) {
			arg3.method1968();
			arg3.method7967();
			if (arg3.anInt2155 > 0 && arg3 == this.aClass12_Sub9ArrayArray1[arg3.anInt2144][arg3.anInt2155]) {
				this.aClass12_Sub9ArrayArray1[arg3.anInt2144][arg3.anInt2155] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt2151;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray355[arg3.anInt2144] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt2151 = local56;
		}
		arg3.aClass12_Sub13_Sub4_1.method7703(this.method4244(arg3));
		@Pc(96) Class281 local96 = arg3.aClass281_1;
		arg3.anInt2146++;
		arg3.anInt2153 += local96.anInt8374;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg3.anInt2151 * arg3.anInt2150 >> 12) + (arg3.anInt2158 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt8372 > 0) {
			if (local96.anInt8367 <= 0) {
				arg3.anInt2148 += 128;
			} else {
				arg3.anInt2148 += (int) (Math.pow(2.0D, (double) local96.anInt8367 * local129) * 128.0D + 0.5D);
			}
			if (arg3.anInt2148 * local96.anInt8372 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray104 != null) {
			if (local96.anInt8371 > 0) {
				arg3.anInt2157 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt8371) * 128.0D + 0.5D);
			} else {
				arg3.anInt2157 += 128;
			}
			while (arg3.anInt2152 < local96.aByteArray104.length - 2 && arg3.anInt2157 > (local96.aByteArray104[arg3.anInt2152 + 2] & 0xFF) << 8) {
				arg3.anInt2152 += 2;
			}
			if (arg3.anInt2152 == local96.aByteArray104.length - 2 && local96.aByteArray104[arg3.anInt2152 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg3.anInt2140 >= 0 && local96.aByteArray103 != null && (this.anIntArray369[arg3.anInt2144] & 0x1) == 0 && (arg3.anInt2155 < 0 || this.aClass12_Sub9ArrayArray1[arg3.anInt2144][arg3.anInt2155] != arg3)) {
			if (local96.anInt8373 > 0) {
				arg3.anInt2140 += (int) (Math.pow(2.0D, (double) local96.anInt8373 * local129) * 128.0D + 0.5D);
			} else {
				arg3.anInt2140 += 128;
			}
			while (arg3.anInt2156 < local96.aByteArray103.length - 2 && arg3.anInt2140 > (local96.aByteArray103[arg3.anInt2156 + 2] & 0xFF) << 8) {
				arg3.anInt2156 += 2;
			}
			if (arg3.anInt2156 == local96.aByteArray103.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg3.aClass12_Sub13_Sub4_1.method7684(arg3.anInt2154, this.method4249(arg3), this.method4243(arg3));
			return false;
		}
		arg3.aClass12_Sub13_Sub4_1.method7693(arg3.anInt2154);
		if (arg2 == null) {
			arg3.aClass12_Sub13_Sub4_1.method7675(arg1);
		} else {
			arg3.aClass12_Sub13_Sub4_1.method7676(arg2, arg0, arg1);
		}
		if (arg3.aClass12_Sub13_Sub4_1.method7682()) {
			this.aClass12_Sub13_Sub3_1.aClass12_Sub13_Sub1_2.method2445(arg3.aClass12_Sub13_Sub4_1);
		}
		arg3.method1968();
		if (arg3.anInt2140 >= 0) {
			arg3.method7967();
			if (arg3.anInt2155 > 0 && arg3 == this.aClass12_Sub9ArrayArray1[arg3.anInt2144][arg3.anInt2155]) {
				this.aClass12_Sub9ArrayArray1[arg3.anInt2144][arg3.anInt2155] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7672() {
		return 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZBLclient!dg;)V")
	public void method4246(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class12_Sub9 arg1) {
		@Pc(8) int local8 = arg1.aClass12_Sub29_Sub1_1.aByteArray59.length;
		@Pc(35) int local35;
		if (arg0 && arg1.aClass12_Sub29_Sub1_1.aBoolean400) {
			@Pc(22) int local22 = local8 + local8 - arg1.aClass12_Sub29_Sub1_1.anInt5187;
			local35 = (int) ((long) this.anIntArray366[arg1.anInt2144] * (long) local22 >> 6);
			local8 <<= 0x8;
			if (local8 <= local35) {
				local35 = local8 + local8 - local35 - 1;
				arg1.aClass12_Sub13_Sub4_1.method7688();
			}
		} else {
			local35 = (int) ((long) this.anIntArray366[arg1.anInt2144] * (long) local8 >> 6);
		}
		arg1.aClass12_Sub13_Sub4_1.method7697(local35);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BII)V")
	private void method4247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V")
	private synchronized void method4248() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray365[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Lclient!dg;I)I")
	private int method4249(@OriginalArg(0) Class12_Sub9 arg0) {
		if (this.anIntArray365[arg0.anInt2144] == 0) {
			return 0;
		}
		@Pc(17) Class281 local17 = arg0.aClass281_1;
		@Pc(33) int local33 = this.anIntArray363[arg0.anInt2144] * this.anIntArray359[arg0.anInt2144] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt2147 * local41 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt5076 * local56 + 128 >> 8;
		local33 = this.anIntArray365[arg0.anInt2144] * local65 + 128 >> 8;
		if (local17.anInt8372 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt8372 * (double) arg0.anInt2148 * 1.953125E-5D) * (double) local33 + 0.5D);
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local17.aByteArray104 != null) {
			local107 = arg0.anInt2157;
			local115 = local17.aByteArray104[arg0.anInt2152 + 1];
			if (arg0.anInt2152 < local17.aByteArray104.length - 2) {
				local133 = (local17.aByteArray104[arg0.anInt2152] & 0xFF) << 8;
				local145 = (local17.aByteArray104[arg0.anInt2152 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray104[arg0.anInt2152 + 3] - local115) * (-local133 + local107) / (local145 - local133);
			}
			local33 = local115 * local33 + 32 >> 6;
		}
		if (arg0.anInt2140 > 0 && local17.aByteArray103 != null) {
			local107 = arg0.anInt2140;
			local115 = local17.aByteArray103[arg0.anInt2156 + 1];
			if (local17.aByteArray103.length - 2 > arg0.anInt2156) {
				local133 = (local17.aByteArray103[arg0.anInt2156] & 0xFF) << 8;
				local145 = (local17.aByteArray103[arg0.anInt2156 + 2] & 0xFF) << 8;
				local115 += (local107 - local133) * (-local115 + local17.aByteArray103[arg0.anInt2156 + 3]) / (local145 - local133);
			}
			local33 = local115 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V")
	private synchronized void method4250(@OriginalArg(1) boolean arg0) {
		this.aClass251_1.method6256();
		this.aClass12_Sub45_2 = null;
		this.method4269(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	private void method4251(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class12_Sub9 local16 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2005(); local16 != null; local16 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2009()) {
			if (arg0 < 0 || arg0 == local16.anInt2144) {
				if (local16.aClass12_Sub13_Sub4_1 != null) {
					local16.aClass12_Sub13_Sub4_1.method7693(Static426.anInt6103 / 100);
					if (local16.aClass12_Sub13_Sub4_1.method7682()) {
						this.aClass12_Sub13_Sub3_1.aClass12_Sub13_Sub1_2.method2445(local16.aClass12_Sub13_Sub4_1);
					}
					local16.method1968();
				}
				if (local16.anInt2140 < 0) {
					this.aClass12_Sub9ArrayArray2[local16.anInt2144][local16.anInt2158] = null;
				}
				local16.method7967();
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(Lclient!dg;I)Z")
	public boolean method4252(@OriginalArg(0) Class12_Sub9 arg0) {
		if (arg0.aClass12_Sub13_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt2140 >= 0) {
			arg0.method7967();
			if (arg0.anInt2155 > 0 && arg0 == this.aClass12_Sub9ArrayArray1[arg0.anInt2144][arg0.anInt2155]) {
				this.aClass12_Sub9ArrayArray1[arg0.anInt2144][arg0.anInt2155] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIII)V")
	private void method4254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class12_Sub9 local12 = this.aClass12_Sub9ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass12_Sub9ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray369[arg2] & 0x2) == 0) {
			local12.anInt2140 = 0;
			return;
		}
		for (@Pc(49) Class12_Sub9 local49 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2005(); local49 != null; local49 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2009()) {
			if (local49.anInt2144 == local12.anInt2144 && local49.anInt2140 < 0 && local12 != local49) {
				local12.anInt2140 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!an;ZLclient!hj;Lclient!sda;)Z")
	public synchronized boolean method4255(@OriginalArg(1) Class16 arg0, @OriginalArg(3) Class132 arg1, @OriginalArg(4) Class12_Sub45 arg2) {
		arg2.method6737();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(37) Class12_Sub39 local37 = (Class12_Sub39) arg2.aClass68_64.method1923(); local37 != null; local37 = (Class12_Sub39) arg2.aClass68_64.method1920()) {
			@Pc(43) int local43 = (int) local37.aLong248;
			@Pc(51) Class12_Sub25 local51 = (Class12_Sub25) this.aClass68_40.method1917((long) local43);
			if (local51 == null) {
				local51 = Static333.method5315(arg0, local43);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass68_40.method1916(local51, (long) local43);
			}
			if (!local51.method3851(local23, arg1, local37.aByteArray81)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method6736();
		}
		return local9;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public synchronized void method4256() {
		for (@Pc(7) Class12_Sub25 local7 = (Class12_Sub25) this.aClass68_40.method1923(); local7 != null; local7 = (Class12_Sub25) this.aClass68_40.method1920()) {
			local7.method7967();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V")
	private void method4257(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4254(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method4263(local16, local22, local28);
			} else {
				this.method4254(64, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method4259(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray362[local16] = (local28 << 14) + (this.anIntArray362[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray362[local16] = (this.anIntArray362[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray364[local16] = (local28 << 7) + (this.anIntArray364[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray364[local16] = local28 + (this.anIntArray364[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray355[local16] = (this.anIntArray355[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray355[local16] = local28 + (this.anIntArray355[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray359[local16] = (local28 << 7) + (this.anIntArray359[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray359[local16] = local28 + (this.anIntArray359[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray357[local16] = (this.anIntArray357[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray357[local16] = (this.anIntArray357[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray363[local16] = (local28 << 7) + (this.anIntArray363[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray363[local16] = (this.anIntArray363[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray369[local16] |= 0x1;
				} else {
					this.anIntArray369[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method4258(local16);
					this.anIntArray369[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray369[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray360[local16] = (this.anIntArray360[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray360[local16] = local28 + (this.anIntArray360[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray360[local16] = (this.anIntArray360[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray360[local16] = (this.anIntArray360[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method4251(local16);
			}
			if (local22 == 121) {
				this.method4279(local16);
			}
			if (local22 == 123) {
				this.method4277(local16);
			}
			@Pc(500) int local500;
			if (local22 == 6) {
				local500 = this.anIntArray360[local16];
				if (local500 == 16384) {
					this.anIntArray354[local16] = (this.anIntArray354[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local500 = this.anIntArray360[local16];
				if (local500 == 16384) {
					this.anIntArray354[local16] = local28 + (this.anIntArray354[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray366[local16] = (this.anIntArray366[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray366[local16] = (this.anIntArray366[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method4272(local16);
					this.anIntArray369[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray369[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method4275((local28 << 7) + (this.anIntArray367[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method4275(local28 + (this.anIntArray367[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method4267(local16, local22 + this.anIntArray362[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method4247(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F1C) >> 8);
			this.method4260(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method4269(true);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	private void method4258(@OriginalArg(0) int arg0) {
		if ((this.anIntArray369[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class12_Sub9 local30 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2005(); local30 != null; local30 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2009()) {
			if (local30.anInt2144 == arg0 && this.aClass12_Sub9ArrayArray2[arg0][local30.anInt2158] == null && local30.anInt2140 < 0) {
				local30.anInt2140 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	private void method4259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)V")
	private void method4260(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray361[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZLclient!sda;Z)V")
	public synchronized void method4261(@OriginalArg(1) Class12_Sub45 arg0, @OriginalArg(2) boolean arg1) {
		this.method4268(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public synchronized void method4262(@OriginalArg(1) int arg0) {
		this.anInt5076 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)V")
	private void method4263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method4254(64, arg1, arg0);
		if ((this.anIntArray369[arg0] & 0x2) != 0) {
			for (@Pc(28) Class12_Sub9 local28 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2016(); local28 != null; local28 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2004()) {
				if (arg0 == local28.anInt2144 && local28.anInt2140 < 0) {
					this.aClass12_Sub9ArrayArray2[arg0][local28.anInt2158] = null;
					this.aClass12_Sub9ArrayArray2[arg0][arg1] = local28;
					@Pc(67) int local67 = local28.anInt2143 + (local28.anInt2151 * local28.anInt2150 >> 12);
					local28.anInt2143 += arg1 - local28.anInt2158 << 8;
					local28.anInt2150 = local67 - local28.anInt2143;
					local28.anInt2151 = 4096;
					local28.anInt2158 = arg1;
					return;
				}
			}
		}
		@Pc(123) Class12_Sub25 local123 = (Class12_Sub25) this.aClass68_40.method1917((long) this.anIntArray356[arg0]);
		if (local123 == null) {
			return;
		}
		@Pc(131) Class12_Sub29_Sub1 local131 = local123.aClass12_Sub29_Sub1Array1[arg1];
		if (local131 == null) {
			return;
		}
		@Pc(138) Class12_Sub9 local138 = new Class12_Sub9();
		local138.aClass12_Sub29_Sub1_1 = local131;
		local138.aClass12_Sub25_1 = local123;
		local138.anInt2144 = arg0;
		local138.aClass281_1 = local123.aClass281Array1[arg1];
		local138.anInt2155 = local123.aByteArray55[arg1];
		local138.anInt2158 = arg1;
		local138.anInt2147 = local123.aByteArray53[arg1] * arg2 * arg2 * local123.anInt4581 + 1024 >> 11;
		local138.anInt2142 = local123.aByteArray54[arg1] & 0xFF;
		local138.anInt2143 = (arg1 << 8) - (local123.aShortArray74[arg1] & 0x7FFF);
		local138.anInt2157 = 0;
		local138.anInt2148 = 0;
		local138.anInt2156 = 0;
		local138.anInt2152 = 0;
		local138.anInt2140 = -1;
		if (this.anIntArray366[arg0] == 0) {
			local138.aClass12_Sub13_Sub4_1 = Static560.method7698(local131, this.method4244(local138), this.method4249(local138), this.method4243(local138));
		} else {
			local138.aClass12_Sub13_Sub4_1 = Static560.method7698(local131, this.method4244(local138), 0, this.method4243(local138));
			this.method4246(local123.aShortArray74[arg1] < 0, local138);
		}
		if (local123.aShortArray74[arg1] < 0) {
			local138.aClass12_Sub13_Sub4_1.method7711(-1);
		}
		if (local138.anInt2155 >= 0) {
			@Pc(285) Class12_Sub9 local285 = this.aClass12_Sub9ArrayArray1[arg0][local138.anInt2155];
			if (local285 != null && local285.anInt2140 < 0) {
				this.aClass12_Sub9ArrayArray2[arg0][local285.anInt2158] = null;
				local285.anInt2140 = 0;
			}
			this.aClass12_Sub9ArrayArray1[arg0][local138.anInt2155] = local138;
		}
		this.aClass12_Sub13_Sub3_1.aClass73_64.method2012(local138);
		this.aClass12_Sub9ArrayArray2[arg0][arg1] = local138;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)Z")
	public synchronized boolean method4264() {
		return this.aClass251_1.method6246();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7675(@OriginalArg(0) int arg0) {
		if (this.aClass251_1.method6246()) {
			@Pc(14) int local14 = this.anInt5081 * this.aClass251_1.anInt7496 / Static426.anInt6103;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong137;
				if (this.aLong136 - local23 >= 0L) {
					this.aLong137 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong136 + (long) local14 - this.aLong137 - 1L) / (long) local14);
				this.aLong137 += (long) local52 * (long) local14;
				this.aClass12_Sub13_Sub3_1.method7675(local52);
				arg0 -= local52;
				this.method4278();
			} while (this.aClass251_1.method6246());
		}
		this.aClass12_Sub13_Sub3_1.method7675(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)I")
	public int method4265() {
		return this.anInt5076;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V")
	private void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray356[arg0]) {
			this.anIntArray356[arg0] = arg1;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass12_Sub9ArrayArray1[arg0][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZLclient!sda;Z)V")
	private synchronized void method4268(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class12_Sub45 arg1, @OriginalArg(3) boolean arg2) {
		this.method4250(arg2);
		this.aClass251_1.method6245(arg1.aByteArray99);
		this.aLong137 = 0L;
		this.aBoolean396 = arg0;
		@Pc(31) int local31 = this.aClass251_1.method6251();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass251_1.method6253(local33);
			this.aClass251_1.method6258(local33);
			this.aClass251_1.method6260(local33);
		}
		this.anInt5098 = this.aClass251_1.method6249();
		this.anInt5097 = this.aClass251_1.anIntArray497[this.anInt5098];
		this.aLong136 = this.aClass251_1.method6255(this.anInt5097);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZB)V")
	private void method4269(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4251(-1);
		} else {
			this.method4277(-1);
		}
		this.method4279(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray356[local31] = this.anIntArray368[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray362[local47] = this.anIntArray368[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	private void method4272(@OriginalArg(0) int arg0) {
		if ((this.anIntArray369[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class12_Sub9 local25 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2005(); local25 != null; local25 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2009()) {
			if (arg0 == local25.anInt2144) {
				local25.anInt2141 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass251_1.method6246()) {
			@Pc(18) int local18 = this.aClass251_1.anInt7496 * this.anInt5081 / Static426.anInt6103;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong137;
				if (this.aLong136 - local27 >= 0L) {
					this.aLong137 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong136 - this.aLong137 - 1L) / (long) local18);
				this.aLong137 += (long) local18 * (long) local57;
				this.aClass12_Sub13_Sub3_1.method7676(arg0, arg1, local57);
				arg1 += local57;
				this.method4278();
				arg2 -= local57;
			} while (this.aClass251_1.method6246());
		}
		this.aClass12_Sub13_Sub3_1.method7676(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "(I)V")
	public synchronized void method4274() {
		for (@Pc(7) Class12_Sub25 local7 = (Class12_Sub25) this.aClass68_40.method1923(); local7 != null; local7 = (Class12_Sub25) this.aClass68_40.method1920()) {
			local7.method3853();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()Lclient!ff;")
	@Override
	public synchronized Class12_Sub13 method7673() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(III)V")
	private void method4275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray367[arg1] = arg0;
		this.anIntArray358[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIZ)V")
	public synchronized void method4276() {
		this.method4280();
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)V")
	private void method4277(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class12_Sub9 local12 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2005(); local12 != null; local12 = (Class12_Sub9) this.aClass12_Sub13_Sub3_1.aClass73_64.method2009()) {
			if ((arg0 < 0 || local12.anInt2144 == arg0) && local12.anInt2140 < 0) {
				this.aClass12_Sub9ArrayArray2[local12.anInt2144][local12.anInt2158] = null;
				local12.anInt2140 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	private void method4278() {
		@Pc(8) int local8 = this.anInt5098;
		@Pc(11) int local11 = this.anInt5097;
		@Pc(20) long local20 = this.aLong136;
		if (this.aClass12_Sub45_2 != null && local11 == this.anInt5099) {
			this.method4268(this.aBoolean396, this.aClass12_Sub45_2, this.aBoolean397);
			this.method4278();
			return;
		}
		while (local11 == this.anInt5097) {
			while (local11 == this.aClass251_1.anIntArray497[local8]) {
				this.aClass251_1.method6253(local8);
				@Pc(53) int local53 = this.aClass251_1.method6254(local8);
				if (local53 == 1) {
					this.aClass251_1.method6248();
					this.aClass251_1.method6260(local8);
					if (this.aClass251_1.method6257()) {
						if (this.aClass12_Sub45_2 != null) {
							this.method4261(this.aClass12_Sub45_2, this.aBoolean396);
							this.method4278();
							return;
						}
						if (!this.aBoolean396 || local11 == 0) {
							this.method4269(true);
							this.aClass251_1.method6256();
							return;
						}
						this.aClass251_1.method6259(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method4257(local53);
				}
				this.aClass251_1.method6258(local8);
				this.aClass251_1.method6260(local8);
			}
			local8 = this.aClass251_1.method6249();
			local11 = this.aClass251_1.anIntArray497[local8];
			local20 = this.aClass251_1.method6255(local11);
		}
		this.anInt5098 = local8;
		this.anInt5097 = local11;
		this.aLong136 = local20;
		if (this.aClass12_Sub45_2 != null && this.anInt5099 < local11) {
			this.anInt5098 = -1;
			this.anInt5097 = this.anInt5099;
			this.aLong136 = this.aClass251_1.method6255(this.anInt5097);
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V")
	private void method4279(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method4279(local12);
			}
			return;
		}
		this.anIntArray359[arg0] = 12800;
		this.anIntArray357[arg0] = 8192;
		this.anIntArray363[arg0] = 16383;
		this.anIntArray361[arg0] = 8192;
		this.anIntArray364[arg0] = 0;
		this.anIntArray355[arg0] = 8192;
		this.method4258(arg0);
		this.method4272(arg0);
		this.anIntArray369[arg0] = 0;
		this.anIntArray360[arg0] = 32767;
		this.anIntArray354[arg0] = 256;
		this.anIntArray366[arg0] = 0;
		this.method4275(8192, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lclient!ff;")
	@Override
	public synchronized Class12_Sub13 method7674() {
		return this.aClass12_Sub13_Sub3_1;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(III)V")
	private void method4280() {
		this.anIntArray368[9] = 128;
		this.anIntArray362[9] = 128;
		this.method4267(9, 128);
	}
}
