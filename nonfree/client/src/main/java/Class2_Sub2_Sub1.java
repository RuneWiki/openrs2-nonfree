import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ae", name = "Db", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!ae", name = "Eb", descriptor = "J")
	private long aLong6;

	@OriginalMember(owner = "client!ae", name = "Fb", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!ae", name = "Hb", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ae", name = "Ib", descriptor = "Z")
	private boolean aBoolean6;

	@OriginalMember(owner = "client!ae", name = "Jb", descriptor = "Lclient!rg;")
	private Class2_Sub43 aClass2_Sub43_1;

	@OriginalMember(owner = "client!ae", name = "Kb", descriptor = "Z")
	private boolean aBoolean7;

	@OriginalMember(owner = "client!ae", name = "Lb", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "[I")
	public final int[] anIntArray11 = new int[16];

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
	private final int[] anIntArray13 = new int[16];

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "[I")
	private final int[] anIntArray9 = new int[16];

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "[I")
	private final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "[I")
	public final int[] anIntArray8 = new int[16];

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "[[Lclient!em;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray1 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!ae", name = "W", descriptor = "[I")
	public final int[] anIntArray15 = new int[16];

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "[I")
	private final int[] anIntArray14 = new int[16];

	@OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
	private final int anInt133 = 1000000;

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "[I")
	private final int[] anIntArray19 = new int[16];

	@OriginalMember(owner = "client!ae", name = "Y", descriptor = "[I")
	private final int[] anIntArray17 = new int[16];

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	private final int[] anIntArray18 = new int[16];

	@OriginalMember(owner = "client!ae", name = "X", descriptor = "[I")
	private final int[] anIntArray16 = new int[16];

	@OriginalMember(owner = "client!ae", name = "xb", descriptor = "I")
	private int anInt167 = 256;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "[I")
	private final int[] anIntArray10 = new int[16];

	@OriginalMember(owner = "client!ae", name = "zb", descriptor = "[I")
	private final int[] anIntArray23 = new int[16];

	@OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
	private final int[] anIntArray20 = new int[16];

	@OriginalMember(owner = "client!ae", name = "Bb", descriptor = "[[Lclient!em;")
	private final Class2_Sub21[][] aClass2_Sub21ArrayArray2 = new Class2_Sub21[16][128];

	@OriginalMember(owner = "client!ae", name = "wb", descriptor = "[I")
	private final int[] anIntArray22 = new int[16];

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!er;")
	private final Class98 aClass98_1 = new Class98();

	@OriginalMember(owner = "client!ae", name = "Gb", descriptor = "Lclient!le;")
	private final Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1 = new Class2_Sub2_Sub3(this);

	@OriginalMember(owner = "client!ae", name = "tb", descriptor = "Lclient!mp;")
	private final Class222 aClass222_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		this.aClass222_1 = new Class222(128);
		this.method158(256, -1);
		this.method161(true);
	}

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lclient!ae;)V")
	public Class2_Sub2_Sub1(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		this.aClass222_1 = arg0.aClass222_1;
		this.method158(256, -1);
		this.method161(true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7544(@OriginalArg(0) int arg0) {
		if (this.aClass98_1.method2578()) {
			@Pc(14) int local14 = this.anInt133 * this.aClass98_1.anInt3031 / Static66.anInt1396;
			do {
				@Pc(23) long local23 = this.aLong7 + (long) arg0 * (long) local14;
				if (this.aLong6 - local23 >= 0L) {
					this.aLong7 = local23;
					break;
				}
				@Pc(51) int local51 = (int) ((this.aLong6 + (long) local14 - this.aLong7 - 1L) / (long) local14);
				this.aLong7 += (long) local51 * (long) local14;
				this.aClass2_Sub2_Sub3_1.method7544(local51);
				arg0 -= local51;
				this.method151();
			} while (this.aClass98_1.method2578());
		}
		this.aClass2_Sub2_Sub3_1.method7544(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	private void method151() {
		@Pc(12) int local12 = this.anInt172;
		@Pc(15) int local15 = this.anInt171;
		@Pc(18) long local18 = this.aLong6;
		if (this.aClass2_Sub43_1 != null && local15 == this.anInt173) {
			this.method156(this.aBoolean7, this.aBoolean6, this.aClass2_Sub43_1);
			this.method151();
			return;
		}
		while (local15 == this.anInt171) {
			while (this.aClass98_1.anIntArray215[local12] == local15) {
				this.aClass98_1.method2579(local12);
				@Pc(51) int local51 = this.aClass98_1.method2590(local12);
				if (local51 == 1) {
					this.aClass98_1.method2588();
					this.aClass98_1.method2583(local12);
					if (this.aClass98_1.method2586()) {
						if (this.aClass2_Sub43_1 != null) {
							this.method185(this.aClass2_Sub43_1, this.aBoolean6);
							this.method151();
							return;
						}
						if (!this.aBoolean6 || local15 == 0) {
							this.method161(true);
							this.aClass98_1.method2581();
							return;
						}
						this.aClass98_1.method2589(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method160(local51);
				}
				this.aClass98_1.method2576(local12);
				this.aClass98_1.method2583(local12);
			}
			local12 = this.aClass98_1.method2580();
			local15 = this.aClass98_1.anIntArray215[local12];
			local18 = this.aClass98_1.method2582(local15);
		}
		this.anInt172 = local12;
		this.anInt171 = local15;
		this.aLong6 = local18;
		if (this.aClass2_Sub43_1 != null && local15 > this.anInt173) {
			this.anInt172 = -1;
			this.anInt171 = this.anInt173;
			this.aLong6 = this.aClass98_1.method2582(this.anInt171);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
	private void method152(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	private void method154(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method154(local7);
			}
			return;
		}
		this.anIntArray19[arg0] = 12800;
		this.anIntArray14[arg0] = 8192;
		this.lb[arg0] = 16383;
		this.anIntArray9[arg0] = 8192;
		this.anIntArray13[arg0] = 0;
		this.anIntArray17[arg0] = 8192;
		this.method173(arg0);
		this.method177(arg0);
		this.anIntArray11[arg0] = 0;
		this.anIntArray10[arg0] = 32767;
		this.anIntArray18[arg0] = 256;
		this.anIntArray8[arg0] = 0;
		this.method164(arg0, 8192);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZBLclient!em;)V")
	public void method155(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		@Pc(8) int local8 = arg1.aClass2_Sub12_Sub1_1.aByteArray21.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass2_Sub12_Sub1_1.aBoolean117) {
			@Pc(37) int local37 = local8 + local8 - arg1.aClass2_Sub12_Sub1_1.anInt1416;
			local8 <<= 0x8;
			local27 = (int) ((long) local37 * (long) this.anIntArray8[arg1.anInt2974] >> 6);
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass2_Sub2_Sub5_1.method7553();
			}
		} else {
			local27 = (int) ((long) local8 * (long) this.anIntArray8[arg1.anInt2974] >> 6);
		}
		arg1.aClass2_Sub2_Sub5_1.method7554(local27);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZLclient!rg;Z)V")
	private synchronized void method156(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub43 arg2) {
		this.method174(arg0);
		this.aClass98_1.method2585(arg2.aByteArray80);
		this.aLong7 = 0L;
		this.aBoolean6 = arg1;
		@Pc(22) int local22 = this.aClass98_1.method2591();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			this.aClass98_1.method2579(local24);
			this.aClass98_1.method2576(local24);
			this.aClass98_1.method2583(local24);
		}
		this.anInt172 = this.aClass98_1.method2580();
		this.anInt171 = this.aClass98_1.anIntArray215[this.anInt172];
		this.aLong6 = this.aClass98_1.method2582(this.anInt171);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZII)V")
	private void method157() {
		this.anIntArray23[9] = 128;
		this.anIntArray12[9] = 128;
		this.method186(9, 128);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V")
	public synchronized void method158(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray16[arg1] = arg0;
		} else {
			for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
				this.anIntArray16[local24] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZLclient!rg;JI)V")
	public synchronized void method159(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub43 arg1, @OriginalArg(3) long arg2) {
		this.method156(true, arg0, arg1);
		this.method188(arg2 * (long) this.aClass98_1.anInt3031);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7541() {
		return 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
	private void method160(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		if (local13 == 128) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method171(local26, local32, local20);
		} else if (local13 == 144) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local32 <= 0) {
				this.method171(local26, 64, local20);
			} else {
				this.method176(local20, local32, local26);
			}
		} else if (local13 == 160) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			this.method152(local32, local20, local26);
		} else if (local13 == 176) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			local32 = arg0 >> 16 & 0x7F;
			if (local26 == 0) {
				this.anIntArray12[local20] = (local32 << 14) + (this.anIntArray12[local20] & 0xFFE03FFF);
			}
			if (local26 == 32) {
				this.anIntArray12[local20] = (this.anIntArray12[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 1) {
				this.anIntArray13[local20] = (local32 << 7) + (this.anIntArray13[local20] & 0xFFFFC07F);
			}
			if (local26 == 33) {
				this.anIntArray13[local20] = local32 + (this.anIntArray13[local20] & 0xFFFFFF80);
			}
			if (local26 == 5) {
				this.anIntArray17[local20] = (local32 << 7) + (this.anIntArray17[local20] & 0xFFFFC07F);
			}
			if (local26 == 37) {
				this.anIntArray17[local20] = (this.anIntArray17[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 7) {
				this.anIntArray19[local20] = (this.anIntArray19[local20] & 0xFFFFC07F) + (local32 << 7);
			}
			if (local26 == 39) {
				this.anIntArray19[local20] = local32 + (this.anIntArray19[local20] & 0xFFFFFF80);
			}
			if (local26 == 10) {
				this.anIntArray14[local20] = (local32 << 7) + (this.anIntArray14[local20] & 0xFFFFC07F);
			}
			if (local26 == 42) {
				this.anIntArray14[local20] = local32 + (this.anIntArray14[local20] & 0xFFFFFF80);
			}
			if (local26 == 11) {
				this.lb[local20] = (local32 << 7) + (this.lb[local20] & 0xFFFFC07F);
			}
			if (local26 == 43) {
				this.lb[local20] = local32 + (this.lb[local20] & 0xFFFFFF80);
			}
			if (local26 == 64) {
				if (local32 < 64) {
					this.anIntArray11[local20] &= 0xFFFFFFFE;
				} else {
					this.anIntArray11[local20] |= 0x1;
				}
			}
			if (local26 == 65) {
				if (local32 >= 64) {
					this.anIntArray11[local20] |= 0x2;
				} else {
					this.method173(local20);
					this.anIntArray11[local20] &= 0xFFFFFFFD;
				}
			}
			if (local26 == 99) {
				this.anIntArray10[local20] = (local32 << 7) + (this.anIntArray10[local20] & 0x7F);
			}
			if (local26 == 98) {
				this.anIntArray10[local20] = local32 + (this.anIntArray10[local20] & 0x3F80);
			}
			if (local26 == 101) {
				this.anIntArray10[local20] = (this.anIntArray10[local20] & 0x7F) + (local32 << 7) + 16384;
			}
			if (local26 == 100) {
				this.anIntArray10[local20] = (this.anIntArray10[local20] & 0x3F80) + local32 + 16384;
			}
			if (local26 == 120) {
				this.method172(local20);
			}
			if (local26 == 121) {
				this.method154(local20);
			}
			if (local26 == 123) {
				this.method166(local20);
			}
			@Pc(501) int local501;
			if (local26 == 6) {
				local501 = this.anIntArray10[local20];
				if (local501 == 16384) {
					this.anIntArray18[local20] = (local32 << 7) + (this.anIntArray18[local20] & 0xFFFFC07F);
				}
			}
			if (local26 == 38) {
				local501 = this.anIntArray10[local20];
				if (local501 == 16384) {
					this.anIntArray18[local20] = local32 + (this.anIntArray18[local20] & 0xFFFFFF80);
				}
			}
			if (local26 == 16) {
				this.anIntArray8[local20] = (local32 << 7) + (this.anIntArray8[local20] & 0xFFFFC07F);
			}
			if (local26 == 48) {
				this.anIntArray8[local20] = (this.anIntArray8[local20] & 0xFFFFFF80) + local32;
			}
			if (local26 == 81) {
				if (local32 >= 64) {
					this.anIntArray11[local20] |= 0x4;
				} else {
					this.method177(local20);
					this.anIntArray11[local20] &= 0xFFFFFFFB;
				}
			}
			if (local26 == 17) {
				this.method164(local20, (local32 << 7) + (this.anIntArray22[local20] & 0xFFFFC07F));
			}
			if (local26 == 49) {
				this.method164(local20, local32 + (this.anIntArray22[local20] & 0xFFFFFF80));
			}
		} else if (local13 == 192) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method186(local20, this.anIntArray12[local20] + local26);
		} else if (local13 == 208) {
			local20 = arg0 & 0xF;
			local26 = arg0 >> 8 & 0x7F;
			this.method167(local26, local20);
		} else if (local13 == 224) {
			local20 = arg0 & 0xF;
			local26 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FC1) >> 8);
			this.method181(local26, local20);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method161(true);
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IZ)V")
	private void method161(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method172(-1);
		} else {
			this.method166(-1);
		}
		this.method154(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray20[local31] = this.anIntArray23[local31];
		}
		for (@Pc(46) int local46 = 0; local46 < 16; local46++) {
			this.anIntArray12[local46] = this.anIntArray23[local46] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	public synchronized void method162() {
		for (@Pc(15) Class2_Sub25 local15 = (Class2_Sub25) this.aClass222_1.method5474(); local15 != null; local15 = (Class2_Sub25) this.aClass222_1.method5472()) {
			local15.method8599();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!em;I)I")
	private int method163(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(18) int local18 = this.anIntArray14[arg0.anInt2974];
		return local18 >= 8192 ? 16384 - ((16384 - local18) * (-arg0.anInt2979 + 128) + 32 >> 6) : arg0.anInt2979 * local18 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)V")
	private void method164(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray22[arg0] = arg1;
		this.anIntArray15[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
	private void method166(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub21 local6 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5833(); local6 != null; local6 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5838()) {
			if ((arg0 < 0 || arg0 == local6.anInt2974) && local6.anInt2964 < 0) {
				this.aClass2_Sub21ArrayArray2[local6.anInt2974][local6.anInt2963] = null;
				local6.anInt2964 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
	private void method167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!nc;Lclient!rg;Lclient!eq;BI)Z")
	public synchronized boolean method168(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class2_Sub43 arg1, @OriginalArg(2) Class97 arg2) {
		arg1.method6971();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub33 local26 = (Class2_Sub33) arg1.aClass222_34.method5474(); local26 != null; local26 = (Class2_Sub33) arg1.aClass222_34.method5472()) {
			@Pc(32) int local32 = (int) local26.aLong287;
			@Pc(40) Class2_Sub25 local40 = (Class2_Sub25) this.aClass222_1.method5468((long) local32);
			if (local40 == null) {
				local40 = Static10.method192(local32, arg2);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass222_1.method5476(local40, (long) local32);
			}
			if (!local40.method3763(arg0, local26.aByteArray62, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method6970();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)Z")
	public synchronized boolean method169() {
		return this.aClass98_1.method2578();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLclient!em;)I")
	private int method170(@OriginalArg(1) Class2_Sub21 arg0) {
		if (this.anIntArray16[arg0.anInt2974] == 0) {
			return 0;
		}
		@Pc(21) Class194 local21 = arg0.aClass194_1;
		@Pc(37) int local37 = this.lb[arg0.anInt2974] * this.anIntArray19[arg0.anInt2974] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = local45 * arg0.anInt2969 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt167 + 128 >> 8;
		local37 = local63 * this.anIntArray16[arg0.anInt2974] + 128 >> 8;
		if (local21.anInt5582 > 0) {
			local37 = (int) ((double) local37 * Math.pow(0.5D, (double) arg0.anInt2965 * 1.953125E-5D * (double) local21.anInt5582) + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local21.aByteArray58 != null) {
			local102 = arg0.anInt2973;
			local110 = local21.aByteArray58[arg0.anInt2966 + 1];
			if (arg0.anInt2966 < local21.aByteArray58.length - 2) {
				local128 = (local21.aByteArray58[arg0.anInt2966] & 0xFF) << 8;
				local140 = (local21.aByteArray58[arg0.anInt2966 + 2] & 0xFF) << 8;
				local110 += (local102 - local128) * (local21.aByteArray58[arg0.anInt2966 + 3] - local110) / (local140 - local128);
			}
			local37 = local110 * local37 + 32 >> 6;
		}
		if (arg0.anInt2964 > 0 && local21.aByteArray57 != null) {
			local102 = arg0.anInt2964;
			local110 = local21.aByteArray57[arg0.anInt2959 + 1];
			if (arg0.anInt2959 < local21.aByteArray57.length - 2) {
				local128 = (local21.aByteArray57[arg0.anInt2959] & 0xFF) << 8;
				local140 = (local21.aByteArray57[arg0.anInt2959 + 2] & 0xFF) << 8;
				local110 += (local21.aByteArray57[arg0.anInt2959 + 3] - local110) * (local102 + -local128) / (local140 - local128);
			}
			local37 = local37 * local110 + 32 >> 6;
		}
		return local37;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub21 local10 = this.aClass2_Sub21ArrayArray2[arg2][arg0];
		if (local10 == null) {
			return;
		}
		this.aClass2_Sub21ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray11[arg2] & 0x2) == 0) {
			local10.anInt2964 = 0;
			return;
		}
		for (@Pc(37) Class2_Sub21 local37 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5833(); local37 != null; local37 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5838()) {
			if (local10.anInt2974 == local37.anInt2974 && local37.anInt2964 < 0 && local37 != local10) {
				local10.anInt2964 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
	private void method172(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub21 local10 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5833(); local10 != null; local10 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5838()) {
			if (arg0 < 0 || arg0 == local10.anInt2974) {
				if (local10.aClass2_Sub2_Sub5_1 != null) {
					local10.aClass2_Sub2_Sub5_1.method7582(Static66.anInt1396 / 100);
					if (local10.aClass2_Sub2_Sub5_1.method7580()) {
						this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub2_3.method1044(local10.aClass2_Sub2_Sub5_1);
					}
					local10.method2530();
				}
				if (local10.anInt2964 < 0) {
					this.aClass2_Sub21ArrayArray2[local10.anInt2974][local10.anInt2963] = null;
				}
				local10.method8599();
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass98_1.method2578()) {
			@Pc(16) int local16 = this.anInt133 * this.aClass98_1.anInt3031 / Static66.anInt1396;
			do {
				@Pc(25) long local25 = this.aLong7 + (long) local16 * (long) arg2;
				if (this.aLong6 - local25 >= 0L) {
					this.aLong7 = local25;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong6 + (long) local16 - this.aLong7 - 1L) / (long) local16);
				this.aLong7 += (long) local52 * (long) local16;
				this.aClass2_Sub2_Sub3_1.method7538(arg0, arg1, local52);
				arg2 -= local52;
				this.method151();
				arg1 += local52;
			} while (this.aClass98_1.method2578());
		}
		this.aClass2_Sub2_Sub3_1.method7538(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
	private void method173(@OriginalArg(1) int arg0) {
		if ((this.anIntArray11[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class2_Sub21 local16 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5833(); local16 != null; local16 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5838()) {
			if (arg0 == local16.anInt2974 && this.aClass2_Sub21ArrayArray2[arg0][local16.anInt2963] == null && local16.anInt2964 < 0) {
				local16.anInt2964 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZ)V")
	private synchronized void method174(@OriginalArg(1) boolean arg0) {
		this.aClass98_1.method2581();
		this.aClass2_Sub43_1 = null;
		this.method161(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILclient!em;)Z")
	public boolean method175(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.aClass2_Sub2_Sub5_1 != null) {
			return false;
		}
		if (arg0.anInt2964 >= 0) {
			arg0.method8599();
			if (arg0.anInt2977 > 0 && arg0 == this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977]) {
				this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(IIII)V")
	private void method176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method171(arg2, 64, arg0);
		if ((this.anIntArray11[arg0] & 0x2) != 0) {
			for (@Pc(23) Class2_Sub21 local23 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5834(); local23 != null; local23 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5843()) {
				if (local23.anInt2974 == arg0 && local23.anInt2964 < 0) {
					this.aClass2_Sub21ArrayArray2[arg0][local23.anInt2963] = null;
					this.aClass2_Sub21ArrayArray2[arg0][arg2] = local23;
					@Pc(61) int local61 = (local23.anInt2961 * local23.anInt2967 >> 12) + local23.anInt2978;
					local23.anInt2978 += arg2 - local23.anInt2963 << 8;
					local23.anInt2963 = arg2;
					local23.anInt2967 = 4096;
					local23.anInt2961 = local61 - local23.anInt2978;
					return;
				}
			}
		}
		@Pc(105) Class2_Sub25 local105 = (Class2_Sub25) this.aClass222_1.method5468((long) this.anIntArray20[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class2_Sub12_Sub1 local113 = local105.aClass2_Sub12_Sub1Array1[arg2];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class2_Sub21 local120 = new Class2_Sub21();
		local120.anInt2974 = arg0;
		local120.aClass2_Sub25_1 = local105;
		local120.aClass2_Sub12_Sub1_1 = local113;
		local120.aClass194_1 = local105.aClass194Array1[arg2];
		local120.anInt2977 = local105.aByteArray43[arg2];
		local120.anInt2963 = arg2;
		local120.anInt2969 = local105.aByteArray44[arg2] * arg1 * arg1 * local105.anInt4546 + 1024 >> 11;
		local120.anInt2979 = local105.aByteArray42[arg2] & 0xFF;
		local120.anInt2978 = (arg2 << 8) - (local105.aShortArray56[arg2] & 0x7FFF);
		local120.anInt2973 = 0;
		local120.anInt2959 = 0;
		local120.anInt2965 = 0;
		local120.anInt2964 = -1;
		local120.anInt2966 = 0;
		if (this.anIntArray8[arg0] == 0) {
			local120.aClass2_Sub2_Sub5_1 = Static652.method7560(local113, this.method182(local120), this.method170(local120), this.method163(local120));
		} else {
			local120.aClass2_Sub2_Sub5_1 = Static652.method7560(local113, this.method182(local120), 0, this.method163(local120));
			this.method155(local105.aShortArray56[arg2] < 0, local120);
		}
		if (local105.aShortArray56[arg2] < 0) {
			local120.aClass2_Sub2_Sub5_1.method7552(-1);
		}
		if (local120.anInt2977 >= 0) {
			@Pc(275) Class2_Sub21 local275 = this.aClass2_Sub21ArrayArray1[arg0][local120.anInt2977];
			if (local275 != null && local275.anInt2964 < 0) {
				this.aClass2_Sub21ArrayArray2[arg0][local275.anInt2963] = null;
				local275.anInt2964 = 0;
			}
			this.aClass2_Sub21ArrayArray1[arg0][local120.anInt2977] = local120;
		}
		this.aClass2_Sub2_Sub3_1.aClass238_34.method5837(local120);
		this.aClass2_Sub21ArrayArray2[arg0][arg2] = local120;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
	private void method177(@OriginalArg(1) int arg0) {
		if ((this.anIntArray11[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub21 local24 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5833(); local24 != null; local24 = (Class2_Sub21) this.aClass2_Sub2_Sub3_1.aClass238_34.method5838()) {
			if (arg0 == local24.anInt2974) {
				local24.anInt2976 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "()Lclient!ep;")
	@Override
	public synchronized Class2_Sub2 method7542() {
		return null;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)V")
	public synchronized void method178(@OriginalArg(0) int arg0) {
		this.anInt167 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)I")
	public int method179() {
		return this.anInt167;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()Lclient!ep;")
	@Override
	public synchronized Class2_Sub2 method7539() {
		return this.aClass2_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public synchronized void method180() {
		this.method174(true);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZI)V")
	private void method181(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray9[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!em;B)I")
	private int method182(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(14) int local14 = (arg0.anInt2961 * arg0.anInt2967 >> 12) + arg0.anInt2978;
		local14 += (this.anIntArray9[arg0.anInt2974] - 8192) * this.anIntArray18[arg0.anInt2974] >> 12;
		@Pc(43) Class194 local43 = arg0.aClass194_1;
		@Pc(69) int local69;
		if (local43.anInt5587 > 0 && (local43.anInt5584 > 0 || this.anIntArray13[arg0.anInt2974] > 0)) {
			local69 = local43.anInt5584 << 2;
			@Pc(74) int local74 = local43.anInt5583 << 1;
			if (local74 > arg0.anInt2968) {
				local69 = local69 * arg0.anInt2968 / local74;
			}
			local69 += this.anIntArray13[arg0.anInt2974] >> 7;
			@Pc(104) double local104 = Math.sin((double) (arg0.anInt2962 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local69 * local104);
		}
		local69 = (int) ((double) (arg0.aClass2_Sub12_Sub1_1.anInt1415 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static66.anInt1396 + 0.5D);
		return local69 < 1 ? 1 : local69;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!em;[IIII)Z")
	public boolean method184(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0.anInt2971 = Static66.anInt1396 / 100;
		if (arg0.anInt2964 >= 0 && (arg0.aClass2_Sub2_Sub5_1 == null || arg0.aClass2_Sub2_Sub5_1.method7563())) {
			arg0.method2530();
			arg0.method8599();
			if (arg0.anInt2977 > 0 && this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977] == arg0) {
				this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg0.anInt2967;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray17[arg0.anInt2974] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg0.anInt2967 = local53;
		}
		arg0.aClass2_Sub2_Sub5_1.method7569(this.method182(arg0));
		@Pc(99) Class194 local99 = arg0.aClass194_1;
		arg0.anInt2968++;
		arg0.anInt2962 += local99.anInt5587;
		@Pc(114) boolean local114 = false;
		@Pc(132) double local132 = (double) ((arg0.anInt2963 - 60 << 8) + (arg0.anInt2961 * arg0.anInt2967 >> 12)) * 5.086263020833333E-6D;
		if (local99.anInt5582 > 0) {
			if (local99.anInt5589 > 0) {
				arg0.anInt2965 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt5589) * 128.0D + 0.5D);
			} else {
				arg0.anInt2965 += 128;
			}
			if (local99.anInt5582 * arg0.anInt2965 >= 819200) {
				local114 = true;
			}
		}
		if (local99.aByteArray58 != null) {
			if (local99.anInt5588 <= 0) {
				arg0.anInt2973 += 128;
			} else {
				arg0.anInt2973 += (int) (Math.pow(2.0D, (double) local99.anInt5588 * local132) * 128.0D + 0.5D);
			}
			while (local99.aByteArray58.length - 2 > arg0.anInt2966 && (local99.aByteArray58[arg0.anInt2966 + 2] & 0xFF) << 8 < arg0.anInt2973) {
				arg0.anInt2966 += 2;
			}
			if (local99.aByteArray58.length - 2 == arg0.anInt2966 && local99.aByteArray58[arg0.anInt2966 + 1] == 0) {
				local114 = true;
			}
		}
		if (arg0.anInt2964 >= 0 && local99.aByteArray57 != null && (this.anIntArray11[arg0.anInt2974] & 0x1) == 0 && (arg0.anInt2977 < 0 || arg0 != this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977])) {
			if (local99.anInt5586 > 0) {
				arg0.anInt2964 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt5586) * 128.0D + 0.5D);
			} else {
				arg0.anInt2964 += 128;
			}
			while (local99.aByteArray57.length - 2 > arg0.anInt2959 && arg0.anInt2964 > (local99.aByteArray57[arg0.anInt2959 + 2] & 0xFF) << 8) {
				arg0.anInt2959 += 2;
			}
			if (arg0.anInt2959 == local99.aByteArray57.length - 2) {
				local114 = true;
			}
		}
		if (!local114) {
			arg0.aClass2_Sub2_Sub5_1.method7581(arg0.anInt2971, this.method170(arg0), this.method163(arg0));
			return false;
		}
		arg0.aClass2_Sub2_Sub5_1.method7582(arg0.anInt2971);
		if (arg1 == null) {
			arg0.aClass2_Sub2_Sub5_1.method7544(arg3);
		} else {
			arg0.aClass2_Sub2_Sub5_1.method7538(arg1, arg2, arg3);
		}
		if (arg0.aClass2_Sub2_Sub5_1.method7580()) {
			this.aClass2_Sub2_Sub3_1.aClass2_Sub2_Sub2_3.method1044(arg0.aClass2_Sub2_Sub5_1);
		}
		arg0.method2530();
		if (arg0.anInt2964 >= 0) {
			arg0.method8599();
			if (arg0.anInt2977 > 0 && arg0 == this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977]) {
				this.aClass2_Sub21ArrayArray1[arg0.anInt2974][arg0.anInt2977] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!rg;IZ)V")
	public synchronized void method185(@OriginalArg(0) Class2_Sub43 arg0, @OriginalArg(2) boolean arg1) {
		this.method156(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
	private void method186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray20[arg0]) {
			this.anIntArray20[arg0] = arg1;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass2_Sub21ArrayArray1[arg0][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(I)V")
	public synchronized void method187() {
		for (@Pc(17) Class2_Sub25 local17 = (Class2_Sub25) this.aClass222_1.method5474(); local17 != null; local17 = (Class2_Sub25) this.aClass222_1.method5472()) {
			local17.method3761();
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(JZ)V")
	private void method188(@OriginalArg(0) long arg0) {
		while (this.aLong6 <= arg0) {
			@Pc(10) int local10 = this.anInt172;
			@Pc(13) int local13 = this.anInt171;
			@Pc(16) long local16 = this.aLong6;
			while (local13 == this.anInt171) {
				while (this.aClass98_1.anIntArray215[local10] == local13) {
					this.aClass98_1.method2579(local10);
					@Pc(26) int local26 = this.aClass98_1.method2590(local10);
					if (local26 == 1) {
						this.aClass98_1.method2588();
						this.aClass98_1.method2583(local10);
						if (this.aClass98_1.method2586()) {
							if (!this.aBoolean6 || local13 == 0) {
								this.method161(true);
								this.aClass98_1.method2581();
								return;
							}
							this.aClass98_1.method2589(local16);
						}
						break;
					}
					if ((local26 & 0x80) != 0 && (local26 & 0xF0) != 144) {
						this.method160(local26);
					}
					this.aClass98_1.method2576(local10);
					this.aClass98_1.method2583(local10);
				}
				this.aLong7 = local16;
				local10 = this.aClass98_1.method2580();
				local13 = this.aClass98_1.anIntArray215[local10];
				local16 = this.aClass98_1.method2582(local13);
			}
			this.anInt171 = local13;
			this.anInt172 = local10;
			this.aLong6 = local16;
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
	public synchronized void method189() {
		this.method157();
	}
}
