import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class3_Sub14_Sub4 extends Class3_Sub14 {

	@OriginalMember(owner = "client!uga", name = "Cb", descriptor = "I")
	private int anInt9672;

	@OriginalMember(owner = "client!uga", name = "Db", descriptor = "I")
	private int anInt9673;

	@OriginalMember(owner = "client!uga", name = "Eb", descriptor = "J")
	private long aLong240;

	@OriginalMember(owner = "client!uga", name = "Gb", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "client!uga", name = "Hb", descriptor = "Z")
	private boolean aBoolean808;

	@OriginalMember(owner = "client!uga", name = "Ib", descriptor = "Lclient!rf;")
	private Class3_Sub43 aClass3_Sub43_2;

	@OriginalMember(owner = "client!uga", name = "Jb", descriptor = "I")
	private int anInt9674;

	@OriginalMember(owner = "client!uga", name = "Kb", descriptor = "Z")
	private boolean aBoolean809;

	@OriginalMember(owner = "client!uga", name = "H", descriptor = "[[Lclient!iga;")
	private final Class3_Sub23[][] aClass3_Sub23ArrayArray1 = new Class3_Sub23[16][128];

	@OriginalMember(owner = "client!uga", name = "F", descriptor = "[I")
	private final int[] anIntArray631 = new int[16];

	@OriginalMember(owner = "client!uga", name = "S", descriptor = "[I")
	private final int[] anIntArray635 = new int[16];

	@OriginalMember(owner = "client!uga", name = "u", descriptor = "[I")
	public final int[] anIntArray628 = new int[16];

	@OriginalMember(owner = "client!uga", name = "E", descriptor = "[I")
	private final int[] anIntArray630 = new int[16];

	@OriginalMember(owner = "client!uga", name = "G", descriptor = "[I")
	private final int[] anIntArray632 = new int[16];

	@OriginalMember(owner = "client!uga", name = "gb", descriptor = "[[Lclient!iga;")
	private final Class3_Sub23[][] aClass3_Sub23ArrayArray2 = new Class3_Sub23[16][128];

	@OriginalMember(owner = "client!uga", name = "W", descriptor = "[I")
	private final int[] anIntArray637 = new int[16];

	@OriginalMember(owner = "client!uga", name = "ab", descriptor = "[I")
	private final int[] anIntArray638 = new int[16];

	@OriginalMember(owner = "client!uga", name = "bb", descriptor = "[I")
	private final int[] anIntArray639 = new int[16];

	@OriginalMember(owner = "client!uga", name = "z", descriptor = "[I")
	public final int[] anIntArray629 = new int[16];

	@OriginalMember(owner = "client!uga", name = "U", descriptor = "[I")
	private final int[] anIntArray636 = new int[16];

	@OriginalMember(owner = "client!uga", name = "sb", descriptor = "I")
	private int anInt9663 = 256;

	@OriginalMember(owner = "client!uga", name = "kb", descriptor = "[I")
	private final int[] anIntArray641 = new int[16];

	@OriginalMember(owner = "client!uga", name = "Z", descriptor = "I")
	private final int anInt9652 = 1000000;

	@OriginalMember(owner = "client!uga", name = "wb", descriptor = "[I")
	private final int[] anIntArray643 = new int[16];

	@OriginalMember(owner = "client!uga", name = "jb", descriptor = "[I")
	private final int[] anIntArray640 = new int[16];

	@OriginalMember(owner = "client!uga", name = "O", descriptor = "[I")
	private final int[] anIntArray633 = new int[16];

	@OriginalMember(owner = "client!uga", name = "ob", descriptor = "[I")
	public final int[] anIntArray642 = new int[16];

	@OriginalMember(owner = "client!uga", name = "R", descriptor = "[I")
	private final int[] anIntArray634 = new int[16];

	@OriginalMember(owner = "client!uga", name = "M", descriptor = "Lclient!te;")
	private final Class307 aClass307_1 = new Class307();

	@OriginalMember(owner = "client!uga", name = "Fb", descriptor = "Lclient!qa;")
	private final Class3_Sub14_Sub3 aClass3_Sub14_Sub3_1 = new Class3_Sub14_Sub3(this);

	@OriginalMember(owner = "client!uga", name = "pb", descriptor = "Lclient!bc;")
	private final Class25 aClass25_42 = new Class25(128);

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class3_Sub14_Sub4() {
		this.method7835();
		this.method7841(true);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7823(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass307_1.method7527()) {
			@Pc(18) int local18 = this.anInt9652 * this.aClass307_1.anInt9274 / Static149.anInt2863;
			do {
				@Pc(28) long local28 = this.aLong240 + (long) local18 * (long) arg2;
				if (this.aLong241 - local28 >= 0L) {
					this.aLong240 = local28;
					break;
				}
				@Pc(59) int local59 = (int) (((long) local18 + this.aLong241 - this.aLong240 - 1L) / (long) local18);
				this.aLong240 += (long) local18 * (long) local59;
				this.aClass3_Sub14_Sub3_1.method7823(arg0, arg1, local59);
				arg2 -= local59;
				arg1 += local59;
				this.method7826();
			} while (this.aClass307_1.method7527());
		}
		this.aClass3_Sub14_Sub3_1.method7823(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!iga;[IBI)Z")
	public boolean method7825(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub23 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		arg1.anInt4449 = Static149.anInt2863 / 100;
		if (arg1.anInt4460 >= 0 && (arg1.aClass3_Sub14_Sub2_2 == null || arg1.aClass3_Sub14_Sub2_2.method6353())) {
			arg1.method3776();
			arg1.method8412();
			if (arg1.anInt4465 > 0 && this.aClass3_Sub23ArrayArray2[arg1.anInt4454][arg1.anInt4465] == arg1) {
				this.aClass3_Sub23ArrayArray2[arg1.anInt4454][arg1.anInt4465] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg1.anInt4457;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray643[arg1.anInt4454] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg1.anInt4457 = local53;
		}
		arg1.aClass3_Sub14_Sub2_2.method6388(this.method7842(arg1));
		@Pc(95) Class56 local95 = arg1.aClass56_1;
		arg1.anInt4451 += local95.anInt1917;
		arg1.anInt4452++;
		@Pc(110) boolean local110 = false;
		@Pc(128) double local128 = (double) ((arg1.anInt4463 - 60 << 8) + (arg1.anInt4453 * arg1.anInt4457 >> 12)) * 5.086263020833333E-6D;
		if (local95.anInt1921 > 0) {
			if (local95.anInt1923 <= 0) {
				arg1.anInt4450 += 128;
			} else {
				arg1.anInt4450 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt1923) * 128.0D + 0.5D);
			}
			if (local95.anInt1921 * arg1.anInt4450 >= 819200) {
				local110 = true;
			}
		}
		if (local95.aByteArray20 != null) {
			if (local95.anInt1922 <= 0) {
				arg1.anInt4458 += 128;
			} else {
				arg1.anInt4458 += (int) (Math.pow(2.0D, (double) local95.anInt1922 * local128) * 128.0D + 0.5D);
			}
			while (local95.aByteArray20.length - 2 > arg1.anInt4461 && arg1.anInt4458 > (local95.aByteArray20[arg1.anInt4461 + 2] & 0xFF) << 8) {
				arg1.anInt4461 += 2;
			}
			if (local95.aByteArray20.length - 2 == arg1.anInt4461 && local95.aByteArray20[arg1.anInt4461 + 1] == 0) {
				local110 = true;
			}
		}
		if (arg1.anInt4460 >= 0 && local95.aByteArray19 != null && (this.anIntArray642[arg1.anInt4454] & 0x1) == 0 && (arg1.anInt4465 < 0 || arg1 != this.aClass3_Sub23ArrayArray2[arg1.anInt4454][arg1.anInt4465])) {
			if (local95.anInt1920 <= 0) {
				arg1.anInt4460 += 128;
			} else {
				arg1.anInt4460 += (int) (Math.pow(2.0D, local128 * (double) local95.anInt1920) * 128.0D + 0.5D);
			}
			while (arg1.anInt4464 < local95.aByteArray19.length - 2 && arg1.anInt4460 > (local95.aByteArray19[arg1.anInt4464 + 2] & 0xFF) << 8) {
				arg1.anInt4464 += 2;
			}
			if (arg1.anInt4464 == local95.aByteArray19.length - 2) {
				local110 = true;
			}
		}
		if (!local110) {
			arg1.aClass3_Sub14_Sub2_2.method6373(arg1.anInt4449, this.method7836(arg1), this.method7829(arg1));
			return false;
		}
		arg1.aClass3_Sub14_Sub2_2.method6381(arg1.anInt4449);
		if (arg2 == null) {
			arg1.aClass3_Sub14_Sub2_2.method7821(arg3);
		} else {
			arg1.aClass3_Sub14_Sub2_2.method7823(arg2, arg0, arg3);
		}
		if (arg1.aClass3_Sub14_Sub2_2.method6375()) {
			this.aClass3_Sub14_Sub3_1.aClass3_Sub14_Sub1_1.method2820(arg1.aClass3_Sub14_Sub2_2);
		}
		arg1.method3776();
		if (arg1.anInt4460 >= 0) {
			arg1.method8412();
			if (arg1.anInt4465 > 0 && this.aClass3_Sub23ArrayArray2[arg1.anInt4454][arg1.anInt4465] == arg1) {
				this.aClass3_Sub23ArrayArray2[arg1.anInt4454][arg1.anInt4465] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)V")
	private void method7826() {
		@Pc(8) int local8 = this.anInt9672;
		@Pc(17) int local17 = this.anInt9673;
		@Pc(20) long local20 = this.aLong241;
		if (this.aClass3_Sub43_2 != null && this.anInt9674 == local17) {
			this.method7851(this.aBoolean808, this.aClass3_Sub43_2, this.aBoolean809);
			this.method7826();
			return;
		}
		while (this.anInt9673 == local17) {
			while (this.aClass307_1.anIntArray606[local8] == local17) {
				this.aClass307_1.method7519(local8);
				@Pc(49) int local49 = this.aClass307_1.method7520(local8);
				if (local49 == 1) {
					this.aClass307_1.method7530();
					this.aClass307_1.method7523(local8);
					if (this.aClass307_1.method7526()) {
						if (this.aClass3_Sub43_2 != null) {
							this.method7848(this.aClass3_Sub43_2, this.aBoolean808);
							this.method7826();
							return;
						}
						if (!this.aBoolean808 || local17 == 0) {
							this.method7841(true);
							this.aClass307_1.method7518();
							return;
						}
						this.aClass307_1.method7528(local20);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method7838(local49);
				}
				this.aClass307_1.method7517(local8);
				this.aClass307_1.method7523(local8);
			}
			local8 = this.aClass307_1.method7521();
			local17 = this.aClass307_1.anIntArray606[local8];
			local20 = this.aClass307_1.method7522(local17);
		}
		this.aLong241 = local20;
		this.anInt9673 = local17;
		this.anInt9672 = local8;
		if (this.aClass3_Sub43_2 != null && this.anInt9674 < local17) {
			this.anInt9672 = -1;
			this.anInt9673 = this.anInt9674;
			this.aLong241 = this.aClass307_1.method7522(this.anInt9673);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ILclient!hf;ILclient!pe;Lclient!rf;)Z")
	public synchronized boolean method7827(@OriginalArg(1) Class138 arg0, @OriginalArg(3) Class254 arg1, @OriginalArg(4) Class3_Sub43 arg2) {
		arg2.method7018();
		@Pc(7) boolean local7 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(35) Class3_Sub41 local35 = (Class3_Sub41) arg2.aClass25_33.method949(); local35 != null; local35 = (Class3_Sub41) arg2.aClass25_33.method947()) {
			@Pc(40) int local40 = (int) local35.aLong262;
			@Pc(48) Class3_Sub15 local48 = (Class3_Sub15) this.aClass25_42.method946((long) local40);
			if (local48 == null) {
				local48 = Static157.method3006(arg1, local40);
				if (local48 == null) {
					local7 = false;
					continue;
				}
				this.aClass25_42.method945(local48, (long) local40);
			}
			if (!local48.method3007(local35.aByteArray90, arg0, local21)) {
				local7 = false;
			}
		}
		if (local7) {
			arg2.method7017();
		}
		return local7;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZILclient!iga;)V")
	public void method7828(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub23 arg1) {
		@Pc(14) int local14 = arg1.aClass3_Sub6_Sub1_2.aByteArray13.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass3_Sub6_Sub1_2.aBoolean88) {
			@Pc(45) int local45 = local14 + local14 - arg1.aClass3_Sub6_Sub1_2.anInt1102;
			local33 = (int) ((long) local45 * (long) this.anIntArray628[arg1.anInt4454] >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				local33 = local14 + local14 - local33 - 1;
				arg1.aClass3_Sub14_Sub2_2.method6368();
			}
		} else {
			local33 = (int) ((long) this.anIntArray628[arg1.anInt4454] * (long) local14 >> 6);
		}
		arg1.aClass3_Sub14_Sub2_2.method6357(local33);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLclient!iga;)I")
	private int method7829(@OriginalArg(1) Class3_Sub23 arg0) {
		@Pc(17) int local17 = this.anIntArray634[arg0.anInt4454];
		return local17 < 8192 ? arg0.anInt4448 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt4448) * (16384 - local17) + 32 >> 6);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(II)V")
	public synchronized void method7830(@OriginalArg(0) int arg0) {
		this.anInt9663 = arg0;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(II)V")
	private void method7831(@OriginalArg(1) int arg0) {
		if ((this.anIntArray642[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(13) Class3_Sub23 local13 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4795(); local13 != null; local13 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4793()) {
			if (local13.anInt4454 == arg0) {
				local13.anInt4462 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(II)V")
	private void method7832(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method7832(local7);
			}
			return;
		}
		this.anIntArray638[arg0] = 12800;
		this.anIntArray634[arg0] = 8192;
		this.anIntArray641[arg0] = 16383;
		this.anIntArray633[arg0] = 8192;
		this.anIntArray632[arg0] = 0;
		this.anIntArray643[arg0] = 8192;
		this.method7850(arg0);
		this.method7831(arg0);
		this.anIntArray642[arg0] = 0;
		this.anIntArray640[arg0] = 32767;
		this.anIntArray636[arg0] = 256;
		this.anIntArray628[arg0] = 0;
		this.method7858(arg0, 8192);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIII)V")
	private void method7833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
	public synchronized void method7834() {
		this.method7855(true);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(III)V")
	private synchronized void method7835() {
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray631[local23] = 256;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!iga;B)I")
	private int method7836(@OriginalArg(0) Class3_Sub23 arg0) {
		if (this.anIntArray631[arg0.anInt4454] == 0) {
			return 0;
		}
		@Pc(14) Class56 local14 = arg0.aClass56_1;
		@Pc(30) int local30 = this.anIntArray638[arg0.anInt4454] * this.anIntArray641[arg0.anInt4454] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt4455 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt9663 * local47 + 128 >> 8;
		local30 = local56 * this.anIntArray631[arg0.anInt4454] + 128 >> 8;
		if (local14.anInt1921 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt4450 * 1.953125E-5D * (double) local14.anInt1921) * (double) local30 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(127) int local127;
		@Pc(139) int local139;
		if (local14.aByteArray20 != null) {
			local101 = arg0.anInt4458;
			local109 = local14.aByteArray20[arg0.anInt4461 + 1];
			if (arg0.anInt4461 < local14.aByteArray20.length - 2) {
				local127 = (local14.aByteArray20[arg0.anInt4461] & 0xFF) << 8;
				local139 = (local14.aByteArray20[arg0.anInt4461 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray20[arg0.anInt4461 + 3] - local109) * (local101 - local127) / (local139 - local127);
			}
			local30 = local30 * local109 + 32 >> 6;
		}
		if (arg0.anInt4460 > 0 && local14.aByteArray19 != null) {
			local101 = arg0.anInt4460;
			local109 = local14.aByteArray19[arg0.anInt4464 + 1];
			if (arg0.anInt4464 < local14.aByteArray19.length - 2) {
				local127 = (local14.aByteArray19[arg0.anInt4464] & 0xFF) << 8;
				local139 = (local14.aByteArray19[arg0.anInt4464 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray19[arg0.anInt4464 + 3] - local109) * (-local127 + local101) / (local139 - local127);
			}
			local30 = local30 * local109 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(III)V")
	private void method7837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray633[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(II)V")
	private void method7838(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7849(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method7849(local18, local24, 64);
			} else {
				this.method7857(local18, local24, local30);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7833(local30, local24, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray637[local18] = (local30 << 14) + (this.anIntArray637[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray637[local18] = (local30 << 7) + (this.anIntArray637[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray632[local18] = (this.anIntArray632[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray632[local18] = (this.anIntArray632[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray643[local18] = (local30 << 7) + (this.anIntArray643[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray643[local18] = (this.anIntArray643[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray638[local18] = (this.anIntArray638[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray638[local18] = local30 + (this.anIntArray638[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray634[local18] = (local30 << 7) + (this.anIntArray634[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray634[local18] = (this.anIntArray634[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray641[local18] = (this.anIntArray641[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.anIntArray641[local18] = local30 + (this.anIntArray641[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray642[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray642[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method7850(local18);
					this.anIntArray642[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray642[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray640[local18] = (this.anIntArray640[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray640[local18] = (this.anIntArray640[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray640[local18] = (this.anIntArray640[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray640[local18] = local30 + (this.anIntArray640[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method7839(local18);
			}
			if (local24 == 121) {
				this.method7832(local18);
			}
			if (local24 == 123) {
				this.method7840(local18);
			}
			@Pc(499) int local499;
			if (local24 == 6) {
				local499 = this.anIntArray640[local18];
				if (local499 == 16384) {
					this.anIntArray636[local18] = (local30 << 7) + (this.anIntArray636[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local499 = this.anIntArray640[local18];
				if (local499 == 16384) {
					this.anIntArray636[local18] = local30 + (this.anIntArray636[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray628[local18] = (local30 << 7) + (this.anIntArray628[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray628[local18] = (this.anIntArray628[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray642[local18] |= 0x4;
				} else {
					this.method7831(local18);
					this.anIntArray642[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method7858(local18, (this.anIntArray635[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method7858(local18, local30 + (this.anIntArray635[local18] & 0xFFFFFF80));
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7853(local18, this.anIntArray637[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7845(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F0167) >> 9);
			this.method7837(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7841(true);
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BI)V")
	private void method7839(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class3_Sub23 local6 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4795(); local6 != null; local6 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4793()) {
			if (arg0 < 0 || arg0 == local6.anInt4454) {
				if (local6.aClass3_Sub14_Sub2_2 != null) {
					local6.aClass3_Sub14_Sub2_2.method6381(Static149.anInt2863 / 100);
					if (local6.aClass3_Sub14_Sub2_2.method6375()) {
						this.aClass3_Sub14_Sub3_1.aClass3_Sub14_Sub1_1.method2820(local6.aClass3_Sub14_Sub2_2);
					}
					local6.method3776();
				}
				if (local6.anInt4460 < 0) {
					this.aClass3_Sub23ArrayArray1[local6.anInt4454][local6.anInt4463] = null;
				}
				local6.method8412();
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IB)V")
	private void method7840(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class3_Sub23 local14 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4795(); local14 != null; local14 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4793()) {
			if ((arg0 < 0 || arg0 == local14.anInt4454) && local14.anInt4460 < 0) {
				this.aClass3_Sub23ArrayArray1[local14.anInt4454][local14.anInt4463] = null;
				local14.anInt4460 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "()Lclient!ega;")
	@Override
	public synchronized Class3_Sub14 method7822() {
		return this.aClass3_Sub14_Sub3_1;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IZ)V")
	private void method7841(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method7839(-1);
		} else {
			this.method7840(-1);
		}
		this.method7832(-1);
		for (@Pc(20) int local20 = 0; local20 < 16; local20++) {
			this.anIntArray639[local20] = this.anIntArray630[local20];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray637[local35] = this.anIntArray630[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "()I")
	@Override
	public synchronized int method7820() {
		return 0;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!iga;Z)I")
	private int method7842(@OriginalArg(0) Class3_Sub23 arg0) {
		@Pc(14) int local14 = arg0.anInt4466 + (arg0.anInt4457 * arg0.anInt4453 >> 12);
		local14 += (this.anIntArray633[arg0.anInt4454] - 8192) * this.anIntArray636[arg0.anInt4454] >> 12;
		@Pc(40) Class56 local40 = arg0.aClass56_1;
		@Pc(63) int local63;
		if (local40.anInt1917 > 0 && (local40.anInt1916 > 0 || this.anIntArray632[arg0.anInt4454] > 0)) {
			local63 = local40.anInt1916 << 2;
			@Pc(68) int local68 = local40.anInt1919 << 1;
			if (arg0.anInt4452 < local68) {
				local63 = local63 * arg0.anInt4452 / local68;
			}
			local63 += this.anIntArray632[arg0.anInt4454] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt4451 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local102 * (double) local63);
		}
		local63 = (int) ((double) (arg0.aClass3_Sub6_Sub1_2.anInt1104 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static149.anInt2863 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)Z")
	public synchronized boolean method7843() {
		return this.aClass307_1.method7527();
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!iga;I)Z")
	public boolean method7844(@OriginalArg(0) Class3_Sub23 arg0) {
		if (arg0.aClass3_Sub14_Sub2_2 != null) {
			return false;
		}
		if (arg0.anInt4460 >= 0) {
			arg0.method8412();
			if (arg0.anInt4465 > 0 && arg0 == this.aClass3_Sub23ArrayArray2[arg0.anInt4454][arg0.anInt4465]) {
				this.aClass3_Sub23ArrayArray2[arg0.anInt4454][arg0.anInt4465] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IIB)V")
	private void method7845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(B)V")
	public synchronized void method7846() {
		for (@Pc(13) Class3_Sub15 local13 = (Class3_Sub15) this.aClass25_42.method949(); local13 != null; local13 = (Class3_Sub15) this.aClass25_42.method947()) {
			local13.method3009();
		}
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(B)I")
	public int method7847() {
		return this.anInt9663;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Lclient!rf;ZB)V")
	public synchronized void method7848(@OriginalArg(0) Class3_Sub43 arg0, @OriginalArg(1) boolean arg1) {
		this.method7851(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "()Lclient!ega;")
	@Override
	public synchronized Class3_Sub14 method7819() {
		return null;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(IIII)V")
	private void method7849(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub23 local12 = this.aClass3_Sub23ArrayArray1[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub23ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray642[arg0] & 0x2) == 0) {
			local12.anInt4460 = 0;
			return;
		}
		for (@Pc(47) Class3_Sub23 local47 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4795(); local47 != null; local47 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4793()) {
			if (local12.anInt4454 == local47.anInt4454 && local47.anInt4460 < 0 && local12 != local47) {
				local12.anInt4460 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(BI)V")
	private void method7850(@OriginalArg(1) int arg0) {
		if ((this.anIntArray642[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class3_Sub23 local22 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4795(); local22 != null; local22 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4793()) {
			if (arg0 == local22.anInt4454 && this.aClass3_Sub23ArrayArray1[arg0][local22.anInt4463] == null && local22.anInt4460 < 0) {
				local22.anInt4460 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(BZLclient!rf;Z)V")
	private synchronized void method7851(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub43 arg1, @OriginalArg(3) boolean arg2) {
		this.method7855(arg2);
		this.aClass307_1.method7532(arg1.aByteArray92);
		this.aBoolean808 = arg0;
		this.aLong240 = 0L;
		@Pc(22) int local22 = this.aClass307_1.method7531();
		for (@Pc(24) int local24 = 0; local24 < local22; local24++) {
			this.aClass307_1.method7519(local24);
			this.aClass307_1.method7517(local24);
			this.aClass307_1.method7523(local24);
		}
		this.anInt9672 = this.aClass307_1.method7521();
		this.anInt9673 = this.aClass307_1.anIntArray606[this.anInt9672];
		this.aLong241 = this.aClass307_1.method7522(this.anInt9673);
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(III)V")
	private void method7853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray639[arg0] != arg1) {
			this.anIntArray639[arg0] = arg1;
			for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
				this.aClass3_Sub23ArrayArray2[arg0][local20] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Z)V")
	public synchronized void method7854() {
		for (@Pc(7) Class3_Sub15 local7 = (Class3_Sub15) this.aClass25_42.method949(); local7 != null; local7 = (Class3_Sub15) this.aClass25_42.method947()) {
			local7.method8412();
		}
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(IZ)V")
	private synchronized void method7855(@OriginalArg(1) boolean arg0) {
		this.aClass307_1.method7518();
		this.aClass3_Sub43_2 = null;
		this.method7841(arg0);
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(III)V")
	private void method7856() {
		this.anIntArray630[9] = 128;
		this.anIntArray637[9] = 128;
		this.method7853(9, 128);
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(IIII)V")
	private void method7857(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7849(arg0, arg1, 64);
		if ((this.anIntArray642[arg0] & 0x2) != 0) {
			for (@Pc(28) Class3_Sub23 local28 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4786(); local28 != null; local28 = (Class3_Sub23) this.aClass3_Sub14_Sub3_1.aClass183_50.method4791()) {
				if (arg0 == local28.anInt4454 && local28.anInt4460 < 0) {
					this.aClass3_Sub23ArrayArray1[arg0][local28.anInt4463] = null;
					this.aClass3_Sub23ArrayArray1[arg0][arg1] = local28;
					@Pc(66) int local66 = (local28.anInt4453 * local28.anInt4457 >> 12) + local28.anInt4466;
					local28.anInt4466 += arg1 - local28.anInt4463 << 8;
					local28.anInt4453 = local66 - local28.anInt4466;
					local28.anInt4463 = arg1;
					local28.anInt4457 = 4096;
					return;
				}
			}
		}
		@Pc(113) Class3_Sub15 local113 = (Class3_Sub15) this.aClass25_42.method946((long) this.anIntArray639[arg0]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class3_Sub6_Sub1 local121 = local113.aClass3_Sub6_Sub1Array1[arg1];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class3_Sub23 local128 = new Class3_Sub23();
		local128.aClass3_Sub6_Sub1_2 = local121;
		local128.aClass3_Sub15_1 = local113;
		local128.anInt4454 = arg0;
		local128.aClass56_1 = local113.aClass56Array1[arg1];
		local128.anInt4465 = local113.aByteArray49[arg1];
		local128.anInt4463 = arg1;
		local128.anInt4455 = arg2 * arg2 * local113.anInt3407 * local113.aByteArray51[arg1] + 1024 >> 11;
		local128.anInt4448 = local113.aByteArray50[arg1] & 0xFF;
		local128.anInt4466 = (arg1 << 8) - (local113.aShortArray59[arg1] & 0x7FFF);
		local128.anInt4458 = 0;
		local128.anInt4464 = 0;
		local128.anInt4460 = -1;
		local128.anInt4450 = 0;
		local128.anInt4461 = 0;
		if (this.anIntArray628[arg0] == 0) {
			local128.aClass3_Sub14_Sub2_2 = Static606.method6355(local121, this.method7842(local128), this.method7836(local128), this.method7829(local128));
		} else {
			local128.aClass3_Sub14_Sub2_2 = Static606.method6355(local121, this.method7842(local128), 0, this.method7829(local128));
			this.method7828(local113.aShortArray59[arg1] < 0, local128);
		}
		if (local113.aShortArray59[arg1] < 0) {
			local128.aClass3_Sub14_Sub2_2.method6369(-1);
		}
		if (local128.anInt4465 >= 0) {
			@Pc(279) Class3_Sub23 local279 = this.aClass3_Sub23ArrayArray2[arg0][local128.anInt4465];
			if (local279 != null && local279.anInt4460 < 0) {
				this.aClass3_Sub23ArrayArray1[arg0][local279.anInt4463] = null;
				local279.anInt4460 = 0;
			}
			this.aClass3_Sub23ArrayArray2[arg0][local128.anInt4465] = local128;
		}
		this.aClass3_Sub14_Sub3_1.aClass183_50.method4792(local128);
		this.aClass3_Sub23ArrayArray1[arg0][arg1] = local128;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7821(@OriginalArg(0) int arg0) {
		if (this.aClass307_1.method7527()) {
			@Pc(18) int local18 = this.aClass307_1.anInt9274 * this.anInt9652 / Static149.anInt2863;
			do {
				@Pc(27) long local27 = this.aLong240 + (long) arg0 * (long) local18;
				if (this.aLong241 - local27 >= 0L) {
					this.aLong240 = local27;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local18 + this.aLong241 - this.aLong240 - 1L) / (long) local18);
				this.aLong240 += (long) local18 * (long) local55;
				arg0 -= local55;
				this.aClass3_Sub14_Sub3_1.method7821(local55);
				this.method7826();
			} while (this.aClass307_1.method7527());
		}
		this.aClass3_Sub14_Sub3_1.method7821(arg0);
	}

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "(III)V")
	private void method7858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray635[arg0] = arg1;
		this.anIntArray629[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(BII)V")
	public synchronized void method7861() {
		this.method7856();
	}
}
