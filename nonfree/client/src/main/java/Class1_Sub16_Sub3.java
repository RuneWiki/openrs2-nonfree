import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class1_Sub16_Sub3 extends Class1_Sub16 {

	@OriginalMember(owner = "client!om", name = "yb", descriptor = "J")
	private long aLong271;

	@OriginalMember(owner = "client!om", name = "zb", descriptor = "Z")
	private boolean aBoolean443;

	@OriginalMember(owner = "client!om", name = "Bb", descriptor = "J")
	private long aLong272;

	@OriginalMember(owner = "client!om", name = "Cb", descriptor = "I")
	private int anInt6229;

	@OriginalMember(owner = "client!om", name = "Db", descriptor = "I")
	private int anInt6230;

	@OriginalMember(owner = "client!om", name = "Eb", descriptor = "I")
	private int anInt6231;

	@OriginalMember(owner = "client!om", name = "Fb", descriptor = "Lclient!gf;")
	private Class1_Sub21 aClass1_Sub21_2;

	@OriginalMember(owner = "client!om", name = "Gb", descriptor = "Z")
	private boolean aBoolean444;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "[I")
	private final int[] anIntArray621 = new int[16];

	@OriginalMember(owner = "client!om", name = "L", descriptor = "[I")
	private final int[] anIntArray625 = new int[16];

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	private final int anInt6206 = 1000000;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "[I")
	private final int[] anIntArray624 = new int[16];

	@OriginalMember(owner = "client!om", name = "T", descriptor = "[[Lclient!vd;")
	private final Class1_Sub49[][] aClass1_Sub49ArrayArray1 = new Class1_Sub49[16][128];

	@OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
	private final int[] anIntArray619 = new int[16];

	@OriginalMember(owner = "client!om", name = "D", descriptor = "[I")
	private final int[] anIntArray623 = new int[16];

	@OriginalMember(owner = "client!om", name = "A", descriptor = "I")
	private int anInt6195 = 256;

	@OriginalMember(owner = "client!om", name = "X", descriptor = "[I")
	private final int[] anIntArray626 = new int[16];

	@OriginalMember(owner = "client!om", name = "nb", descriptor = "[I")
	private final int[] anIntArray628 = new int[16];

	@OriginalMember(owner = "client!om", name = "v", descriptor = "[I")
	private final int[] anIntArray620 = new int[16];

	@OriginalMember(owner = "client!om", name = "ob", descriptor = "[I")
	public final int[] anIntArray629 = new int[16];

	@OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
	public final int[] anIntArray622 = new int[16];

	@OriginalMember(owner = "client!om", name = "tb", descriptor = "[I")
	private final int[] anIntArray630 = new int[16];

	@OriginalMember(owner = "client!om", name = "mb", descriptor = "[[Lclient!vd;")
	private final Class1_Sub49[][] aClass1_Sub49ArrayArray2 = new Class1_Sub49[16][128];

	@OriginalMember(owner = "client!om", name = "q", descriptor = "[I")
	private final int[] anIntArray618 = new int[16];

	@OriginalMember(owner = "client!om", name = "vb", descriptor = "[I")
	private final int[] anIntArray631 = new int[16];

	@OriginalMember(owner = "client!om", name = "gb", descriptor = "[I")
	private final int[] anIntArray627 = new int[16];

	@OriginalMember(owner = "client!om", name = "wb", descriptor = "[I")
	private final int[] anIntArray632 = new int[16];

	@OriginalMember(owner = "client!om", name = "xb", descriptor = "[I")
	public final int[] anIntArray633 = new int[16];

	@OriginalMember(owner = "client!om", name = "p", descriptor = "Lclient!ne;")
	private final Class202 aClass202_1 = new Class202();

	@OriginalMember(owner = "client!om", name = "Ab", descriptor = "Lclient!pt;")
	private final Class1_Sub16_Sub4 aClass1_Sub16_Sub4_1 = new Class1_Sub16_Sub4(this);

	@OriginalMember(owner = "client!om", name = "db", descriptor = "Lclient!ba;")
	private final Class17 aClass17_27 = new Class17(128);

	static {
		new Class306("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class1_Sub16_Sub3() {
		this.method5255();
		this.method5273(true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	private void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray628[arg0] != arg1) {
			this.anIntArray628[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub49ArrayArray1[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)V")
	private void method5243(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5256(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method5271(local22, local28, local16);
			} else {
				this.method5256(local22, 64, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method5246(local16, local22, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray632[local16] = (local28 << 14) + (this.anIntArray632[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray632[local16] = (local28 << 7) + (this.anIntArray632[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray626[local16] = (local28 << 7) + (this.anIntArray626[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray626[local16] = local28 + (this.anIntArray626[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray620[local16] = (this.anIntArray620[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray620[local16] = (this.anIntArray620[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray624[local16] = (this.anIntArray624[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray624[local16] = (this.anIntArray624[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 10) {
				this.anIntArray621[local16] = (local28 << 7) + (this.anIntArray621[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray621[local16] = (this.anIntArray621[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray618[local16] = (local28 << 7) + (this.anIntArray618[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray618[local16] = (this.anIntArray618[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray633[local16] |= 0x1;
				} else {
					this.anIntArray633[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method5260(local16);
					this.anIntArray633[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray633[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray623[local16] = (local28 << 7) + (this.anIntArray623[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray623[local16] = (this.anIntArray623[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray623[local16] = (this.anIntArray623[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray623[local16] = local28 + (this.anIntArray623[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method5252(local16);
			}
			if (local22 == 121) {
				this.method5261(local16);
			}
			if (local22 == 123) {
				this.method5274(local16);
			}
			@Pc(493) int local493;
			if (local22 == 6) {
				local493 = this.anIntArray623[local16];
				if (local493 == 16384) {
					this.anIntArray625[local16] = (local28 << 7) + (this.anIntArray625[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local493 = this.anIntArray623[local16];
				if (local493 == 16384) {
					this.anIntArray625[local16] = local28 + (this.anIntArray625[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray622[local16] = (this.anIntArray622[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray622[local16] = (this.anIntArray622[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray633[local16] |= 0x4;
				} else {
					this.method5258(local16);
					this.anIntArray633[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method5276((local28 << 7) + (this.anIntArray631[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method5276((this.anIntArray631[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5242(local16, local22 + this.anIntArray632[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method5265(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method5275(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method5273(true);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Z")
	public synchronized boolean method5244() {
		return this.aClass202_1.method4974();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vd;I)I")
	private int method5245(@OriginalArg(0) Class1_Sub49 arg0) {
		if (this.anIntArray619[arg0.anInt8589] == 0) {
			return 0;
		}
		@Pc(23) Class289 local23 = arg0.aClass289_1;
		@Pc(39) int local39 = this.anIntArray618[arg0.anInt8589] * this.anIntArray624[arg0.anInt8589] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt8584 * local47 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt6195 * local56 + 128 >> 8;
		local39 = local65 * this.anIntArray619[arg0.anInt8589] + 128 >> 8;
		if (local23.anInt7991 > 0) {
			local39 = (int) (Math.pow(0.5D, (double) arg0.anInt8590 * 1.953125E-5D * (double) local23.anInt7991) * (double) local39 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(130) int local130;
		@Pc(142) int local142;
		if (local23.aByteArray112 != null) {
			local104 = arg0.anInt8593;
			local112 = local23.aByteArray112[arg0.anInt8587 + 1];
			if (arg0.anInt8587 < local23.aByteArray112.length - 2) {
				local130 = (local23.aByteArray112[arg0.anInt8587] & 0xFF) << 8;
				local142 = (local23.aByteArray112[arg0.anInt8587 + 2] & 0xFF) << 8;
				local112 += (local104 - local130) * (local23.aByteArray112[arg0.anInt8587 - -3] - local112) / (local142 - local130);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		if (arg0.anInt8580 > 0 && local23.aByteArray113 != null) {
			local104 = arg0.anInt8580;
			local112 = local23.aByteArray113[arg0.anInt8575 + 1];
			if (local23.aByteArray113.length - 2 > arg0.anInt8575) {
				local130 = (local23.aByteArray113[arg0.anInt8575] & 0xFF) << 8;
				local142 = (local23.aByteArray113[arg0.anInt8575 + 2] & 0xFF) << 8;
				local112 += (local23.aByteArray113[arg0.anInt8575 + 3] - local112) * (local104 - local130) / (local142 - local130);
			}
			local39 = local39 * local112 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZI)V")
	private void method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(III)V")
	public synchronized void method5247() {
		this.method5269();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!kr;Lclient!rl;ILclient!gf;I)Z")
	public synchronized boolean method5248(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(3) Class1_Sub21 arg2) {
		arg2.method2480();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class1_Sub4 local34 = (Class1_Sub4) arg2.aClass17_12.method735(); local34 != null; local34 = (Class1_Sub4) arg2.aClass17_12.method740()) {
			@Pc(40) int local40 = (int) local34.aLong392;
			@Pc(48) Class1_Sub31 local48 = (Class1_Sub31) this.aClass17_27.method738((long) local40);
			if (local48 == null) {
				local48 = Static87.method1480(local40, arg0);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass17_27.method737(local48, (long) local40);
			}
			if (!local48.method4765(arg1, local28, local34.aByteArray7)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method2482();
		}
		return local9;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "([IILclient!vd;II)Z")
	public boolean method5249(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class1_Sub49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt8578 = Static477.anInt7971 / 100;
		if (arg1.anInt8580 >= 0 && (arg1.aClass1_Sub16_Sub2_4 == null || arg1.aClass1_Sub16_Sub2_4.method4108())) {
			arg1.method7022();
			arg1.method7525();
			if (arg1.anInt8592 > 0 && arg1 == this.aClass1_Sub49ArrayArray1[arg1.anInt8589][arg1.anInt8592]) {
				this.aClass1_Sub49ArrayArray1[arg1.anInt8589][arg1.anInt8592] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt8579;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray620[arg1.anInt8589] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt8579 = local56;
		}
		arg1.aClass1_Sub16_Sub2_4.method4112(this.method5257(arg1));
		@Pc(94) Class289 local94 = arg1.aClass289_1;
		arg1.anInt8586++;
		arg1.anInt8583 += local94.anInt7997;
		@Pc(109) boolean local109 = false;
		@Pc(127) double local127 = (double) ((arg1.anInt8579 * arg1.anInt8588 >> 12) + (arg1.anInt8585 - 60 << 8)) * 5.086263020833333E-6D;
		if (local94.anInt7991 > 0) {
			if (local94.anInt7996 > 0) {
				arg1.anInt8590 += (int) (Math.pow(2.0D, local127 * (double) local94.anInt7996) * 128.0D + 0.5D);
			} else {
				arg1.anInt8590 += 128;
			}
			if (local94.anInt7991 * arg1.anInt8590 >= 819200) {
				local109 = true;
			}
		}
		if (local94.aByteArray112 != null) {
			if (local94.anInt7998 > 0) {
				arg1.anInt8593 += (int) (Math.pow(2.0D, (double) local94.anInt7998 * local127) * 128.0D + 0.5D);
			} else {
				arg1.anInt8593 += 128;
			}
			while (local94.aByteArray112.length - 2 > arg1.anInt8587 && arg1.anInt8593 > (local94.aByteArray112[arg1.anInt8587 + 2] & 0xFF) << 8) {
				arg1.anInt8587 += 2;
			}
			if (arg1.anInt8587 == local94.aByteArray112.length - 2 && local94.aByteArray112[arg1.anInt8587 + 1] == 0) {
				local109 = true;
			}
		}
		if (arg1.anInt8580 >= 0 && local94.aByteArray113 != null && (this.anIntArray633[arg1.anInt8589] & 0x1) == 0 && (arg1.anInt8592 < 0 || arg1 != this.aClass1_Sub49ArrayArray1[arg1.anInt8589][arg1.anInt8592])) {
			if (local94.anInt7999 <= 0) {
				arg1.anInt8580 += 128;
			} else {
				arg1.anInt8580 += (int) (Math.pow(2.0D, (double) local94.anInt7999 * local127) * 128.0D + 0.5D);
			}
			while (arg1.anInt8575 < local94.aByteArray113.length - 2 && (local94.aByteArray113[arg1.anInt8575 + 2] & 0xFF) << 8 < arg1.anInt8580) {
				arg1.anInt8575 += 2;
			}
			if (arg1.anInt8575 == local94.aByteArray113.length - 2) {
				local109 = true;
			}
		}
		if (!local109) {
			arg1.aClass1_Sub16_Sub2_4.method4087(arg1.anInt8578, this.method5245(arg1), this.method5264(arg1));
			return false;
		}
		arg1.aClass1_Sub16_Sub2_4.method4118(arg1.anInt8578);
		if (arg0 == null) {
			arg1.aClass1_Sub16_Sub2_4.method5754(arg2);
		} else {
			arg1.aClass1_Sub16_Sub2_4.method5753(arg0, arg3, arg2);
		}
		if (arg1.aClass1_Sub16_Sub2_4.method4115()) {
			this.aClass1_Sub16_Sub4_1.aClass1_Sub16_Sub1_1.method2236(arg1.aClass1_Sub16_Sub2_4);
		}
		arg1.method7022();
		if (arg1.anInt8580 >= 0) {
			arg1.method7525();
			if (arg1.anInt8592 > 0 && arg1 == this.aClass1_Sub49ArrayArray1[arg1.anInt8589][arg1.anInt8592]) {
				this.aClass1_Sub49ArrayArray1[arg1.anInt8589][arg1.anInt8592] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vd;BZ)V")
	public void method5250(@OriginalArg(0) Class1_Sub49 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub37_Sub1_2.aByteArray111.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub37_Sub1_2.aBoolean560) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub37_Sub1_2.anInt7862;
			local12 <<= 0x8;
			local31 = (int) ((long) this.anIntArray622[arg0.anInt8589] * (long) local42 >> 6);
			if (local31 >= local12) {
				arg0.aClass1_Sub16_Sub2_4.method4085();
				local31 = local12 + local12 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) this.anIntArray622[arg0.anInt8589] * (long) local12 >> 6);
		}
		arg0.aClass1_Sub16_Sub2_4.method4105(local31);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZBLclient!gf;)V")
	public synchronized void method5251(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub21 arg1) {
		this.method5267(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	private void method5252(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class1_Sub49 local8 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method977(); local8 != null; local8 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method971()) {
			if (arg0 < 0 || local8.anInt8589 == arg0) {
				if (local8.aClass1_Sub16_Sub2_4 != null) {
					local8.aClass1_Sub16_Sub2_4.method4118(Static477.anInt7971 / 100);
					if (local8.aClass1_Sub16_Sub2_4.method4115()) {
						this.aClass1_Sub16_Sub4_1.aClass1_Sub16_Sub1_1.method2236(local8.aClass1_Sub16_Sub2_4);
					}
					local8.method7022();
				}
				if (local8.anInt8580 < 0) {
					this.aClass1_Sub49ArrayArray2[local8.anInt8589][local8.anInt8585] = null;
				}
				local8.method7525();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	public synchronized void method5253() {
		this.method5270(true);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(BI)V")
	public synchronized void method5254(@OriginalArg(1) int arg0) {
		this.anInt6195 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
	private synchronized void method5255() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray619[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII)V")
	private void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub49 local12 = this.aClass1_Sub49ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub49ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray633[arg2] & 0x2) == 0) {
			local12.anInt8580 = 0;
			return;
		}
		for (@Pc(36) Class1_Sub49 local36 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method977(); local36 != null; local36 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method971()) {
			if (local12.anInt8589 == local36.anInt8589 && local36.anInt8580 < 0 && local36 != local12) {
				local12.anInt8580 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!vd;)I")
	private int method5257(@OriginalArg(1) Class1_Sub49 arg0) {
		@Pc(14) int local14 = (arg0.anInt8588 * arg0.anInt8579 >> 12) + arg0.anInt8577;
		local14 += (this.anIntArray627[arg0.anInt8589] - 8192) * this.anIntArray625[arg0.anInt8589] >> 12;
		@Pc(40) Class289 local40 = arg0.aClass289_1;
		@Pc(60) int local60;
		if (local40.anInt7997 > 0 && (local40.anInt7995 > 0 || this.anIntArray626[arg0.anInt8589] > 0)) {
			local60 = local40.anInt7995 << 2;
			@Pc(65) int local65 = local40.anInt7994 << 1;
			if (local65 > arg0.anInt8586) {
				local60 = arg0.anInt8586 * local60 / local65;
			}
			local60 += this.anIntArray626[arg0.anInt8589] >> 7;
			@Pc(95) double local95 = Math.sin((double) (arg0.anInt8583 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local95 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass1_Sub37_Sub1_2.anInt7861 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static477.anInt7971 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(II)V")
	private void method5258(@OriginalArg(0) int arg0) {
		if ((this.anIntArray633[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub49 local18 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method977(); local18 != null; local18 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method971()) {
			if (local18.anInt8589 == arg0) {
				local18.anInt8591 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
	private void method5260(@OriginalArg(0) int arg0) {
		if ((this.anIntArray633[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub49 local18 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method977(); local18 != null; local18 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method971()) {
			if (arg0 == local18.anInt8589 && this.aClass1_Sub49ArrayArray2[arg0][local18.anInt8585] == null && local18.anInt8580 < 0) {
				local18.anInt8580 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5754(@OriginalArg(0) int arg0) {
		if (this.aClass202_1.method4974()) {
			@Pc(14) int local14 = this.anInt6206 * this.aClass202_1.anInt5848 / Static477.anInt7971;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong272;
				if (this.aLong271 - local23 >= 0L) {
					this.aLong272 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong271 + (long) local14 - this.aLong272 - 1L) / (long) local14);
				this.aLong272 += (long) local14 * (long) local53;
				this.aClass1_Sub16_Sub4_1.method5754(local53);
				arg0 -= local53;
				this.method5266();
			} while (this.aClass202_1.method4974());
		}
		this.aClass1_Sub16_Sub4_1.method5754(arg0);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V")
	private void method5261(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method5261(local9);
			}
			return;
		}
		this.anIntArray624[arg0] = 12800;
		this.anIntArray621[arg0] = 8192;
		this.anIntArray618[arg0] = 16383;
		this.anIntArray627[arg0] = 8192;
		this.anIntArray626[arg0] = 0;
		this.anIntArray620[arg0] = 8192;
		this.method5260(arg0);
		this.method5258(arg0);
		this.anIntArray633[arg0] = 0;
		this.anIntArray623[arg0] = 32767;
		this.anIntArray625[arg0] = 256;
		this.anIntArray622[arg0] = 0;
		this.method5276(8192, arg0);
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(I)I")
	public int method5263() {
		return this.anInt6195;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!vd;B)I")
	private int method5264(@OriginalArg(0) Class1_Sub49 arg0) {
		@Pc(15) int local15 = this.anIntArray621[arg0.anInt8589];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt8576) * (16384 - local15) + 32 >> 6) : local15 * arg0.anInt8576 + 32 >> 6;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIB)V")
	private void method5265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V")
	private void method5266() {
		@Pc(8) int local8 = this.anInt6229;
		@Pc(11) int local11 = this.anInt6230;
		@Pc(14) long local14 = this.aLong271;
		if (this.aClass1_Sub21_2 != null && this.anInt6231 == local11) {
			this.method5267(this.aClass1_Sub21_2, this.aBoolean443, this.aBoolean444);
			this.method5266();
			return;
		}
		while (this.anInt6230 == local11) {
			while (local11 == this.aClass202_1.anIntArray586[local8]) {
				this.aClass202_1.method4970(local8);
				@Pc(50) int local50 = this.aClass202_1.method4967(local8);
				if (local50 == 1) {
					this.aClass202_1.method4971();
					this.aClass202_1.method4979(local8);
					if (this.aClass202_1.method4966()) {
						if (this.aClass1_Sub21_2 != null) {
							this.method5251(this.aBoolean443, this.aClass1_Sub21_2);
							this.method5266();
							return;
						}
						if (!this.aBoolean443 || local11 == 0) {
							this.method5273(true);
							this.aClass202_1.method4965();
							return;
						}
						this.aClass202_1.method4969(local14);
					}
					break;
				}
				if ((local50 & 0x80) != 0) {
					this.method5243(local50);
				}
				this.aClass202_1.method4968(local8);
				this.aClass202_1.method4979(local8);
			}
			local8 = this.aClass202_1.method4972();
			local11 = this.aClass202_1.anIntArray586[local8];
			local14 = this.aClass202_1.method4964(local11);
		}
		this.aLong271 = local14;
		this.anInt6229 = local8;
		this.anInt6230 = local11;
		if (this.aClass1_Sub21_2 != null && local11 > this.anInt6231) {
			this.anInt6230 = this.anInt6231;
			this.anInt6229 = -1;
			this.aLong271 = this.aClass202_1.method4964(this.anInt6230);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!gf;ZZ)V")
	private synchronized void method5267(@OriginalArg(1) Class1_Sub21 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method5270(arg2);
		this.aClass202_1.method4977(arg0.aByteArray43);
		this.aLong272 = 0L;
		this.aBoolean443 = arg1;
		@Pc(24) int local24 = this.aClass202_1.method4976();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass202_1.method4970(local26);
			this.aClass202_1.method4968(local26);
			this.aClass202_1.method4979(local26);
		}
		this.anInt6229 = this.aClass202_1.method4972();
		this.anInt6230 = this.aClass202_1.anIntArray586[this.anInt6229];
		this.aLong271 = this.aClass202_1.method4964(this.anInt6230);
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
	public synchronized void method5268() {
		for (@Pc(7) Class1_Sub31 local7 = (Class1_Sub31) this.aClass17_27.method735(); local7 != null; local7 = (Class1_Sub31) this.aClass17_27.method740()) {
			local7.method7525();
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(III)V")
	private void method5269() {
		this.anIntArray630[9] = 128;
		this.anIntArray632[9] = 128;
		this.method5242(9, 128);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZZ)V")
	private synchronized void method5270(@OriginalArg(1) boolean arg0) {
		this.aClass202_1.method4965();
		this.aClass1_Sub21_2 = null;
		this.method5273(arg0);
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "()Lclient!gv;")
	@Override
	public synchronized Class1_Sub16 method5752() {
		return null;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass202_1.method4974()) {
			@Pc(14) int local14 = this.anInt6206 * this.aClass202_1.anInt5848 / Static477.anInt7971;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong272;
				if (this.aLong271 - local23 >= 0L) {
					this.aLong272 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong271 - this.aLong272 - 1L) / (long) local14);
				this.aLong272 += (long) local51 * (long) local14;
				this.aClass1_Sub16_Sub4_1.method5753(arg0, arg1, local51);
				arg1 += local51;
				arg2 -= local51;
				this.method5266();
			} while (this.aClass202_1.method4974());
		}
		this.aClass1_Sub16_Sub4_1.method5753(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(IIII)V")
	private void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method5256(arg0, 64, arg2);
		if ((this.anIntArray633[arg2] & 0x2) != 0) {
			for (@Pc(30) Class1_Sub49 local30 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method974(); local30 != null; local30 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method966()) {
				if (local30.anInt8589 == arg2 && local30.anInt8580 < 0) {
					this.aClass1_Sub49ArrayArray2[arg2][local30.anInt8585] = null;
					this.aClass1_Sub49ArrayArray2[arg2][arg0] = local30;
					@Pc(70) int local70 = local30.anInt8577 + (local30.anInt8588 * local30.anInt8579 >> 12);
					local30.anInt8577 += arg0 - local30.anInt8585 << 8;
					local30.anInt8585 = arg0;
					local30.anInt8588 = local70 - local30.anInt8577;
					local30.anInt8579 = 4096;
					return;
				}
			}
		}
		@Pc(116) Class1_Sub31 local116 = (Class1_Sub31) this.aClass17_27.method738((long) this.anIntArray628[arg2]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class1_Sub37_Sub1 local124 = local116.aClass1_Sub37_Sub1Array1[arg0];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class1_Sub49 local131 = new Class1_Sub49();
		local131.aClass1_Sub37_Sub1_2 = local124;
		local131.anInt8589 = arg2;
		local131.aClass1_Sub31_1 = local116;
		local131.aClass289_1 = local116.aClass289Array1[arg0];
		local131.anInt8592 = local116.aByteArray87[arg0];
		local131.anInt8585 = arg0;
		local131.anInt8584 = local116.anInt5566 * arg1 * arg1 * local116.aByteArray89[arg0] + 1024 >> 11;
		local131.anInt8576 = local116.aByteArray88[arg0] & 0xFF;
		local131.anInt8577 = (arg0 << 8) - (local116.aShortArray105[arg0] & 0x7FFF);
		local131.anInt8590 = 0;
		local131.anInt8580 = -1;
		local131.anInt8575 = 0;
		local131.anInt8587 = 0;
		local131.anInt8593 = 0;
		if (this.anIntArray622[arg2] == 0) {
			local131.aClass1_Sub16_Sub2_4 = Static555.method4082(local124, this.method5257(local131), this.method5245(local131), this.method5264(local131));
		} else {
			local131.aClass1_Sub16_Sub2_4 = Static555.method4082(local124, this.method5257(local131), 0, this.method5264(local131));
			this.method5250(local131, local116.aShortArray105[arg0] < 0);
		}
		if (local116.aShortArray105[arg0] < 0) {
			local131.aClass1_Sub16_Sub2_4.method4083(-1);
		}
		if (local131.anInt8592 >= 0) {
			@Pc(290) Class1_Sub49 local290 = this.aClass1_Sub49ArrayArray1[arg2][local131.anInt8592];
			if (local290 != null && local290.anInt8580 < 0) {
				this.aClass1_Sub49ArrayArray2[arg2][local290.anInt8585] = null;
				local290.anInt8580 = 0;
			}
			this.aClass1_Sub49ArrayArray1[arg2][local131.anInt8592] = local131;
		}
		this.aClass1_Sub16_Sub4_1.aClass37_73.method970(local131);
		this.aClass1_Sub49ArrayArray2[arg2][arg0] = local131;
	}

	@OriginalMember(owner = "client!om", name = "i", descriptor = "(I)V")
	public synchronized void method5272() {
		for (@Pc(13) Class1_Sub31 local13 = (Class1_Sub31) this.aClass17_27.method735(); local13 != null; local13 = (Class1_Sub31) this.aClass17_27.method740()) {
			local13.method4767();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ZZ)V")
	private void method5273(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method5252(-1);
		} else {
			this.method5274(-1);
		}
		this.method5261(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray628[local23] = this.anIntArray630[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray632[local41] = this.anIntArray630[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!om", name = "c", descriptor = "(BI)V")
	private void method5274(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub49 local12 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method977(); local12 != null; local12 = (Class1_Sub49) this.aClass1_Sub16_Sub4_1.aClass37_73.method971()) {
			if ((arg0 < 0 || local12.anInt8589 == arg0) && local12.anInt8580 < 0) {
				this.aClass1_Sub49ArrayArray2[local12.anInt8589][local12.anInt8585] = null;
				local12.anInt8580 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZI)V")
	private void method5275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray627[arg0] = arg1;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()I")
	@Override
	public synchronized int method5749() {
		return 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "()Lclient!gv;")
	@Override
	public synchronized Class1_Sub16 method5748() {
		return this.aClass1_Sub16_Sub4_1;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(III)V")
	private void method5276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray631[arg1] = arg0;
		this.anIntArray629[arg1] = (int) (Math.pow((double) 2, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Lclient!vd;I)Z")
	public boolean method5277(@OriginalArg(0) Class1_Sub49 arg0) {
		if (arg0.aClass1_Sub16_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt8580 >= 0) {
			arg0.method7525();
			if (arg0.anInt8592 > 0 && this.aClass1_Sub49ArrayArray1[arg0.anInt8589][arg0.anInt8592] == arg0) {
				this.aClass1_Sub49ArrayArray1[arg0.anInt8589][arg0.anInt8592] = null;
			}
		}
		return true;
	}
}
