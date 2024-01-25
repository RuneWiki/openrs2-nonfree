import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eka")
public final class Class5_Sub17_Sub1 extends Class5_Sub17 {

	@OriginalMember(owner = "client!eka", name = "Eb", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!eka", name = "Fb", descriptor = "I")
	private int anInt2878;

	@OriginalMember(owner = "client!eka", name = "Gb", descriptor = "Z")
	private boolean aBoolean244;

	@OriginalMember(owner = "client!eka", name = "Hb", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!eka", name = "Jb", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!eka", name = "Kb", descriptor = "Z")
	private boolean aBoolean245;

	@OriginalMember(owner = "client!eka", name = "Lb", descriptor = "I")
	private int anInt2879;

	@OriginalMember(owner = "client!eka", name = "Mb", descriptor = "Lclient!jr;")
	private Class5_Sub33 aClass5_Sub33_1;

	@OriginalMember(owner = "client!eka", name = "x", descriptor = "[I")
	public final int[] anIntArray108 = new int[16];

	@OriginalMember(owner = "client!eka", name = "E", descriptor = "[I")
	private final int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!eka", name = "ab", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!eka", name = "Y", descriptor = "[I")
	private final int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!eka", name = "W", descriptor = "[I")
	private final int[] anIntArray111 = new int[16];

	@OriginalMember(owner = "client!eka", name = "Q", descriptor = "[I")
	private final int[] anIntArray110 = new int[16];

	@OriginalMember(owner = "client!eka", name = "q", descriptor = "[[Lclient!eu;")
	private final Class5_Sub19[][] aClass5_Sub19ArrayArray1 = new Class5_Sub19[16][128];

	@OriginalMember(owner = "client!eka", name = "jb", descriptor = "[I")
	private final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!eka", name = "p", descriptor = "[I")
	private final int[] anIntArray106 = new int[16];

	@OriginalMember(owner = "client!eka", name = "Z", descriptor = "[I")
	private final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!eka", name = "qb", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!eka", name = "ub", descriptor = "[[Lclient!eu;")
	private final Class5_Sub19[][] aClass5_Sub19ArrayArray2 = new Class5_Sub19[16][128];

	@OriginalMember(owner = "client!eka", name = "u", descriptor = "[I")
	private final int[] anIntArray107 = new int[16];

	@OriginalMember(owner = "client!eka", name = "hb", descriptor = "[I")
	private final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!eka", name = "bb", descriptor = "[I")
	public final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!eka", name = "Bb", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!eka", name = "Ab", descriptor = "I")
	private final int anInt2875 = 1000000;

	@OriginalMember(owner = "client!eka", name = "tb", descriptor = "[I")
	public final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!eka", name = "vb", descriptor = "I")
	private int anInt2872 = 256;

	@OriginalMember(owner = "client!eka", name = "Db", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!eka", name = "B", descriptor = "Lclient!kda;")
	private final Class191 aClass191_1 = new Class191();

	@OriginalMember(owner = "client!eka", name = "Ib", descriptor = "Lclient!qaa;")
	private final Class5_Sub17_Sub5 aClass5_Sub17_Sub5_1 = new Class5_Sub17_Sub5(this);

	@OriginalMember(owner = "client!eka", name = "G", descriptor = "Lclient!rda;")
	private final Class300 aClass300_13;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V")
	public Class5_Sub17_Sub1() {
		this.aClass300_13 = new Class300(128);
		this.method2531(-1, 256);
		this.method2555(true);
	}

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lclient!eka;)V")
	public Class5_Sub17_Sub1(@OriginalArg(0) Class5_Sub17_Sub1 arg0) {
		this.aClass300_13 = arg0.aClass300_13;
		this.method2531(-1, 256);
		this.method2555(true);
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)V")
	public synchronized void method2527() {
		this.method2550(true);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Z)V")
	public synchronized void method2529() {
		for (@Pc(15) Class5_Sub35 local15 = (Class5_Sub35) this.aClass300_13.method7182(); local15 != null; local15 = (Class5_Sub35) this.aClass300_13.method7192()) {
			local15.method9052();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B)V")
	private void method2530() {
		@Pc(6) int local6 = this.anInt2878;
		@Pc(9) int local9 = this.anInt2877;
		@Pc(12) long local12 = this.aLong52;
		if (this.aClass5_Sub33_1 != null && local9 == this.anInt2879) {
			this.method2535(this.aClass5_Sub33_1, this.aBoolean244, this.aBoolean245);
			this.method2530();
			return;
		}
		while (local9 == this.anInt2877) {
			while (this.aClass191_1.anIntArray329[local6] == local9) {
				this.aClass191_1.method4862(local6);
				@Pc(54) int local54 = this.aClass191_1.method4852(local6);
				if (local54 == 1) {
					this.aClass191_1.method4855();
					this.aClass191_1.method4849(local6);
					if (this.aClass191_1.method4859()) {
						if (this.aClass5_Sub33_1 != null) {
							this.method2543(this.aBoolean244, this.aClass5_Sub33_1);
							this.method2530();
							return;
						}
						if (!this.aBoolean244 || local9 == 0) {
							this.method2555(true);
							this.aClass191_1.method4850();
							return;
						}
						this.aClass191_1.method4854(local12);
					}
					break;
				}
				if ((local54 & 0x80) != 0) {
					this.method2560(local54);
				}
				this.aClass191_1.method4857(local6);
				this.aClass191_1.method4849(local6);
			}
			local6 = this.aClass191_1.method4861();
			local9 = this.aClass191_1.anIntArray329[local6];
			local12 = this.aClass191_1.method4851(local9);
		}
		this.anInt2878 = local6;
		this.anInt2877 = local9;
		this.aLong52 = local12;
		if (this.aClass5_Sub33_1 != null && this.anInt2879 < local9) {
			this.anInt2877 = this.anInt2879;
			this.anInt2878 = -1;
			this.aLong52 = this.aClass191_1.method4851(this.anInt2877);
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)V")
	public synchronized void method2531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray107[arg0] = arg1;
		} else {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.anIntArray107[local12] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIII)V")
	private void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IBI)V")
	private void method2533(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray111[arg0] = arg1;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZI)V")
	private void method2534(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class5_Sub19 local6 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2805(); local6 != null; local6 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2814()) {
			if (arg0 < 0 || arg0 == local6.anInt3106) {
				if (local6.aClass5_Sub17_Sub2_1 != null) {
					local6.aClass5_Sub17_Sub2_1.method3938(Static302.anInt5797 / 100);
					if (local6.aClass5_Sub17_Sub2_1.method3950()) {
						this.aClass5_Sub17_Sub5_1.aClass5_Sub17_Sub4_3.method6191(local6.aClass5_Sub17_Sub2_1);
					}
					local6.method2749();
				}
				if (local6.anInt3116 < 0) {
					this.aClass5_Sub19ArrayArray2[local6.anInt3106][local6.anInt3114] = null;
				}
				local6.method9052();
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!jr;ZIZ)V")
	private synchronized void method2535(@OriginalArg(0) Class5_Sub33 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method2550(arg2);
		this.aClass191_1.method4863(arg0.aByteArray45);
		this.aBoolean244 = arg1;
		this.aLong51 = 0L;
		@Pc(32) int local32 = this.aClass191_1.method4848();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass191_1.method4862(local34);
			this.aClass191_1.method4857(local34);
			this.aClass191_1.method4849(local34);
		}
		this.anInt2878 = this.aClass191_1.method4861();
		this.anInt2877 = this.aClass191_1.anIntArray329[this.anInt2878];
		this.aLong52 = this.aClass191_1.method4851(this.anInt2877);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6650(@OriginalArg(0) int arg0) {
		if (this.aClass191_1.method4856()) {
			@Pc(16) int local16 = this.anInt2875 * this.aClass191_1.anInt5854 / Static302.anInt5797;
			do {
				@Pc(25) long local25 = (long) local16 * (long) arg0 + this.aLong51;
				if (this.aLong52 - local25 >= 0L) {
					this.aLong51 = local25;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong52 + (long) local16 - this.aLong51 - 1L) / (long) local16);
				this.aLong51 += (long) local16 * (long) local55;
				this.aClass5_Sub17_Sub5_1.method6650(local55);
				arg0 -= local55;
				this.method2530();
			} while (this.aClass191_1.method4856());
		}
		this.aClass5_Sub17_Sub5_1.method6650(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZLclient!jr;JZ)V")
	public synchronized void method2536(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub33 arg1, @OriginalArg(3) long arg2) {
		this.method2535(arg1, arg0, true);
		this.method2554(arg2 * (long) this.aClass191_1.anInt5854);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!eu;I)I")
	private int method2537(@OriginalArg(0) Class5_Sub19 arg0) {
		@Pc(15) int local15 = arg0.anInt3109 + (arg0.anInt3123 * arg0.anInt3121 >> 12);
		local15 += this.anIntArray118[arg0.anInt3106] * (this.anIntArray111[arg0.anInt3106] - 8192) >> 12;
		@Pc(42) Class349 local42 = arg0.aClass349_1;
		@Pc(65) int local65;
		if (local42.anInt9712 > 0 && (local42.anInt9713 > 0 || this.anIntArray114[arg0.anInt3106] > 0)) {
			local65 = local42.anInt9713 << 2;
			@Pc(70) int local70 = local42.anInt9714 << 1;
			if (arg0.anInt3120 < local70) {
				local65 = arg0.anInt3120 * local65 / local70;
			}
			local65 += this.anIntArray114[arg0.anInt3106] >> 7;
			@Pc(104) double local104 = Math.sin((double) (arg0.anInt3113 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local65 * local104);
		}
		local65 = (int) ((double) (arg0.aClass5_Sub42_Sub1_1.anInt7021 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static302.anInt5797 + 0.5D);
		return local65 < 1 ? 1 : local65;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ILclient!eu;)I")
	private int method2538(@OriginalArg(1) Class5_Sub19 arg0) {
		if (this.anIntArray107[arg0.anInt3106] == 0) {
			return 0;
		}
		@Pc(17) Class349 local17 = arg0.aClass349_1;
		@Pc(33) int local33 = this.anIntArray116[arg0.anInt3106] * this.anIntArray112[arg0.anInt3106] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt3117 * local41 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt2872 * local50 + 128 >> 8;
		local33 = local59 * this.anIntArray107[arg0.anInt3106] + 128 >> 8;
		if (local17.anInt9722 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt3108 * 1.953125E-5D * (double) local17.anInt9722) * (double) local33 + 0.5D);
		}
		@Pc(104) int local104;
		@Pc(112) int local112;
		@Pc(134) int local134;
		@Pc(146) int local146;
		if (local17.aByteArray98 != null) {
			local104 = arg0.anInt3111;
			local112 = local17.aByteArray98[arg0.anInt3107 + 1];
			if (local17.aByteArray98.length - 2 > arg0.anInt3107) {
				local134 = (local17.aByteArray98[arg0.anInt3107] & 0xFF) << 8;
				local146 = (local17.aByteArray98[arg0.anInt3107 + 2] & 0xFF) << 8;
				local112 += (local17.aByteArray98[arg0.anInt3107 + 3] - local112) * (-local134 + local104) / (local146 - local134);
			}
			local33 = local112 * local33 + 32 >> 6;
		}
		if (arg0.anInt3116 > 0 && local17.aByteArray99 != null) {
			local104 = arg0.anInt3116;
			local112 = local17.aByteArray99[arg0.anInt3110 + 1];
			if (local17.aByteArray99.length - 2 > arg0.anInt3110) {
				local134 = (local17.aByteArray99[arg0.anInt3110] & 0xFF) << 8;
				local146 = (local17.aByteArray99[arg0.anInt3110 + 2] & 0xFF) << 8;
				local112 += (local104 - local134) * (local17.aByteArray99[arg0.anInt3110 + 3] + -local112) / (local146 - local134);
			}
			local33 = local33 * local112 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "()Lclient!km;")
	@Override
	public synchronized Class5_Sub17 method6649() {
		return this.aClass5_Sub17_Sub5_1;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(III)V")
	private void method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(II)V")
	private void method2540(@OriginalArg(1) int arg0) {
		if ((this.anIntArray119[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class5_Sub19 local18 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2805(); local18 != null; local18 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2814()) {
			if (arg0 == local18.anInt3106 && this.aClass5_Sub19ArrayArray2[arg0][local18.anInt3114] == null && local18.anInt3116 < 0) {
				local18.anInt3116 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(ILclient!eu;)Z")
	public boolean method2541(@OriginalArg(1) Class5_Sub19 arg0) {
		if (arg0.aClass5_Sub17_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt3116 >= 0) {
			arg0.method9052();
			if (arg0.anInt3122 > 0 && this.aClass5_Sub19ArrayArray1[arg0.anInt3106][arg0.anInt3122] == arg0) {
				this.aClass5_Sub19ArrayArray1[arg0.anInt3106][arg0.anInt3122] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6647(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass191_1.method4856()) {
			@Pc(14) int local14 = this.anInt2875 * this.aClass191_1.anInt5854 / Static302.anInt5797;
			do {
				@Pc(23) long local23 = this.aLong51 + (long) arg2 * (long) local14;
				if (this.aLong52 - local23 >= 0L) {
					this.aLong51 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong52 + (long) local14 - this.aLong51 - 1L) / (long) local14);
				this.aLong51 += (long) local53 * (long) local14;
				this.aClass5_Sub17_Sub5_1.method6647(arg0, arg1, local53);
				this.method2530();
				arg1 += local53;
				arg2 -= local53;
			} while (this.aClass191_1.method4856());
		}
		this.aClass5_Sub17_Sub5_1.method6647(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(II)V")
	public synchronized void method2542(@OriginalArg(1) int arg0) {
		this.anInt2872 = arg0;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZLclient!jr;I)V")
	public synchronized void method2543(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub33 arg1) {
		this.method2535(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ILclient!eu;Z)V")
	public void method2544(@OriginalArg(1) Class5_Sub19 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass5_Sub42_Sub1_1.aByteArray67.length;
		@Pc(35) int local35;
		if (arg1 && arg0.aClass5_Sub42_Sub1_1.aBoolean606) {
			@Pc(45) int local45 = local16 + local16 - arg0.aClass5_Sub42_Sub1_1.anInt7023;
			local16 <<= 0x8;
			local35 = (int) ((long) local45 * (long) this.anIntArray115[arg0.anInt3106] >> 6);
			if (local35 >= local16) {
				local35 = local16 + local16 - local35 - 1;
				arg0.aClass5_Sub17_Sub2_1.method3961();
			}
		} else {
			local35 = (int) ((long) local16 * (long) this.anIntArray115[arg0.anInt3106] >> 6);
		}
		arg0.aClass5_Sub17_Sub2_1.method3934(local35);
	}

	@OriginalMember(owner = "client!eka", name = "f", descriptor = "(I)V")
	public synchronized void method2545() {
		for (@Pc(9) Class5_Sub35 local9 = (Class5_Sub35) this.aClass300_13.method7182(); local9 != null; local9 = (Class5_Sub35) this.aClass300_13.method7192()) {
			local9.method4818();
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IZ)V")
	private void method2546(@OriginalArg(0) int arg0) {
		if ((this.anIntArray119[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(13) Class5_Sub19 local13 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2805(); local13 != null; local13 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2814()) {
			if (arg0 == local13.anInt3106) {
				local13.anInt3118 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(III)V")
	public synchronized void method2547() {
		this.method2557();
	}

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "(II)V")
	private void method2548(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class5_Sub19 local6 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2805(); local6 != null; local6 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2814()) {
			if ((arg0 < 0 || local6.anInt3106 == arg0) && local6.anInt3116 < 0) {
				this.aClass5_Sub19ArrayArray2[local6.anInt3106][local6.anInt3114] = null;
				local6.anInt3116 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(IZ)V")
	private void method2549(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method2549(local7);
			}
			return;
		}
		this.anIntArray112[arg0] = 12800;
		this.anIntArray113[arg0] = 8192;
		this.anIntArray116[arg0] = 16383;
		this.anIntArray111[arg0] = 8192;
		this.anIntArray114[arg0] = 0;
		this.anIntArray109[arg0] = 8192;
		this.method2540(arg0);
		this.method2546(arg0);
		this.anIntArray119[arg0] = 0;
		this.anIntArray110[arg0] = 32767;
		this.anIntArray118[arg0] = 256;
		this.anIntArray115[arg0] = 0;
		this.method2556(8192, arg0);
	}

	@OriginalMember(owner = "client!eka", name = "d", descriptor = "()Lclient!km;")
	@Override
	public synchronized Class5_Sub17 method6652() {
		return null;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(ZI)V")
	private synchronized void method2550(@OriginalArg(0) boolean arg0) {
		this.aClass191_1.method4850();
		this.aClass5_Sub33_1 = null;
		this.method2555(arg0);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!jr;Lclient!wm;ILclient!qj;I)Z")
	public synchronized boolean method2551(@OriginalArg(0) Class5_Sub33 arg0, @OriginalArg(1) Class390 arg1, @OriginalArg(3) Class290 arg2) {
		arg0.method4710();
		@Pc(12) boolean local12 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class5_Sub46 local29 = (Class5_Sub46) arg0.aClass300_23.method7182(); local29 != null; local29 = (Class5_Sub46) arg0.aClass300_23.method7192()) {
			@Pc(34) int local34 = (int) local29.aLong307;
			@Pc(42) Class5_Sub35 local42 = (Class5_Sub35) this.aClass300_13.method7188((long) local34);
			if (local42 == null) {
				local42 = Static407.method5977(arg1, local34);
				if (local42 == null) {
					local12 = false;
					continue;
				}
				this.aClass300_13.method7191(local42, (long) local34);
			}
			if (!local42.method4816(local29.aByteArray76, arg2, local23)) {
				local12 = false;
			}
		}
		if (local12) {
			arg0.method4708();
		}
		return local12;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(Lclient!eu;I)I")
	private int method2552(@OriginalArg(0) Class5_Sub19 arg0) {
		@Pc(9) int local9 = this.anIntArray113[arg0.anInt3106];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt3119) * (-local9 + 16384) + 32 >> 6) : arg0.anInt3119 * local9 + 32 >> 6;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(B)Z")
	public synchronized boolean method2553() {
		return this.aClass191_1.method4856();
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(JI)V")
	private void method2554(@OriginalArg(0) long arg0) {
		while (arg0 >= this.aLong52) {
			@Pc(13) int local13 = this.anInt2878;
			@Pc(16) int local16 = this.anInt2877;
			@Pc(19) long local19 = this.aLong52;
			while (this.anInt2877 == local16) {
				while (this.aClass191_1.anIntArray329[local13] == local16) {
					this.aClass191_1.method4862(local13);
					@Pc(29) int local29 = this.aClass191_1.method4852(local13);
					if (local29 == 1) {
						this.aClass191_1.method4855();
						this.aClass191_1.method4849(local13);
						if (this.aClass191_1.method4859()) {
							if (!this.aBoolean244 || local16 == 0) {
								this.method2555(true);
								this.aClass191_1.method4850();
								return;
							}
							this.aClass191_1.method4854(local19);
						}
						break;
					}
					if ((local29 & 0x80) != 0 && (local29 & 0xF0) != 144) {
						this.method2560(local29);
					}
					this.aClass191_1.method4857(local13);
					this.aClass191_1.method4849(local13);
				}
				this.aLong51 = local19;
				local13 = this.aClass191_1.method4861();
				local16 = this.aClass191_1.anIntArray329[local13];
				local19 = this.aClass191_1.method4851(local16);
			}
			this.aLong52 = local19;
			this.anInt2878 = local13;
			this.anInt2877 = local16;
		}
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(ZI)V")
	private void method2555(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2534(-1);
		} else {
			this.method2548(-1);
		}
		this.method2549(-1);
		for (@Pc(26) int local26 = 0; local26 < 16; local26++) {
			this.anIntArray121[local26] = this.anIntArray122[local26];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray106[local43] = this.anIntArray122[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIB)V")
	private void method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray117[arg1] = arg0;
		this.anIntArray108[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIZ)V")
	private void method2557() {
		this.anIntArray122[9] = 128;
		this.anIntArray106[9] = 128;
		this.method2561(9, 128);
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I[IIILclient!eu;)Z")
	public boolean method2558(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5_Sub19 arg3) {
		arg3.anInt3112 = Static302.anInt5797 / 100;
		if (arg3.anInt3116 >= 0 && (arg3.aClass5_Sub17_Sub2_1 == null || arg3.aClass5_Sub17_Sub2_1.method3946())) {
			arg3.method2749();
			arg3.method9052();
			if (arg3.anInt3122 > 0 && arg3 == this.aClass5_Sub19ArrayArray1[arg3.anInt3106][arg3.anInt3122]) {
				this.aClass5_Sub19ArrayArray1[arg3.anInt3106][arg3.anInt3122] = null;
			}
			return true;
		}
		@Pc(51) int local51 = arg3.anInt3123;
		if (local51 > 0) {
			local51 -= (int) (Math.pow(2.0D, (double) this.anIntArray109[arg3.anInt3106] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local51 < 0) {
				local51 = 0;
			}
			arg3.anInt3123 = local51;
		}
		arg3.aClass5_Sub17_Sub2_1.method3958(this.method2537(arg3));
		@Pc(94) Class349 local94 = arg3.aClass349_1;
		arg3.anInt3120++;
		@Pc(102) boolean local102 = false;
		arg3.anInt3113 += local94.anInt9712;
		@Pc(127) double local127 = (double) ((arg3.anInt3123 * arg3.anInt3121 >> 12) + (arg3.anInt3114 - 60 << 8)) * 5.086263020833333E-6D;
		if (local94.anInt9722 > 0) {
			if (local94.anInt9721 <= 0) {
				arg3.anInt3108 += 128;
			} else {
				arg3.anInt3108 += (int) (Math.pow(2.0D, (double) local94.anInt9721 * local127) * 128.0D + 0.5D);
			}
			if (local94.anInt9722 * arg3.anInt3108 >= 819200) {
				local102 = true;
			}
		}
		if (local94.aByteArray98 != null) {
			if (local94.anInt9716 <= 0) {
				arg3.anInt3111 += 128;
			} else {
				arg3.anInt3111 += (int) (Math.pow(2.0D, (double) local94.anInt9716 * local127) * 128.0D + 0.5D);
			}
			while (local94.aByteArray98.length - 2 > arg3.anInt3107 && (local94.aByteArray98[arg3.anInt3107 + 2] & 0xFF) << 8 < arg3.anInt3111) {
				arg3.anInt3107 += 2;
			}
			if (arg3.anInt3107 == local94.aByteArray98.length - 2 && local94.aByteArray98[arg3.anInt3107 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg3.anInt3116 >= 0 && local94.aByteArray99 != null && (this.anIntArray119[arg3.anInt3106] & 0x1) == 0 && (arg3.anInt3122 < 0 || arg3 != this.aClass5_Sub19ArrayArray1[arg3.anInt3106][arg3.anInt3122])) {
			if (local94.anInt9720 > 0) {
				arg3.anInt3116 += (int) (Math.pow(2.0D, (double) local94.anInt9720 * local127) * 128.0D + 0.5D);
			} else {
				arg3.anInt3116 += 128;
			}
			while (arg3.anInt3110 < local94.aByteArray99.length - 2 && (local94.aByteArray99[arg3.anInt3110 + 2] & 0xFF) << 8 < arg3.anInt3116) {
				arg3.anInt3110 += 2;
			}
			if (arg3.anInt3110 == local94.aByteArray99.length - 2) {
				local102 = true;
			}
		}
		if (!local102) {
			arg3.aClass5_Sub17_Sub2_1.method3970(arg3.anInt3112, this.method2538(arg3), this.method2552(arg3));
			return false;
		}
		arg3.aClass5_Sub17_Sub2_1.method3938(arg3.anInt3112);
		if (arg1 == null) {
			arg3.aClass5_Sub17_Sub2_1.method6650(arg0);
		} else {
			arg3.aClass5_Sub17_Sub2_1.method6647(arg1, arg2, arg0);
		}
		if (arg3.aClass5_Sub17_Sub2_1.method3950()) {
			this.aClass5_Sub17_Sub5_1.aClass5_Sub17_Sub4_3.method6191(arg3.aClass5_Sub17_Sub2_1);
		}
		arg3.method2749();
		if (arg3.anInt3116 >= 0) {
			arg3.method9052();
			if (arg3.anInt3122 > 0 && this.aClass5_Sub19ArrayArray1[arg3.anInt3106][arg3.anInt3122] == arg3) {
				this.aClass5_Sub19ArrayArray1[arg3.anInt3106][arg3.anInt3122] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(IIII)V")
	private void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class5_Sub19 local10 = this.aClass5_Sub19ArrayArray2[arg1][arg2];
		if (local10 == null) {
			return;
		}
		this.aClass5_Sub19ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray119[arg1] & 0x2) == 0) {
			local10.anInt3116 = 0;
			return;
		}
		for (@Pc(47) Class5_Sub19 local47 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2805(); local47 != null; local47 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2814()) {
			if (local10.anInt3106 == local47.anInt3106 && local47.anInt3116 < 0 && local10 != local47) {
				local10.anInt3116 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "e", descriptor = "(II)V")
	private void method2560(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local7 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2559(local28, local16, local22);
		} else if (local7 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method2563(local16, local22, local28);
			} else {
				this.method2559(64, local16, local22);
			}
		} else if (local7 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2532(local28, local22, local16);
		} else if (local7 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray106[local16] = (this.anIntArray106[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray106[local16] = (this.anIntArray106[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray114[local16] = (this.anIntArray114[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray114[local16] = local28 + (this.anIntArray114[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray109[local16] = (this.anIntArray109[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray109[local16] = (this.anIntArray109[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray112[local16] = (this.anIntArray112[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray112[local16] = local28 + (this.anIntArray112[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray113[local16] = (this.anIntArray113[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray113[local16] = (this.anIntArray113[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray116[local16] = (local28 << 7) + (this.anIntArray116[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray116[local16] = local28 + (this.anIntArray116[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray119[local16] |= 0x1;
				} else {
					this.anIntArray119[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2540(local16);
					this.anIntArray119[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray119[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray110[local16] = (this.anIntArray110[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray110[local16] = local28 + (this.anIntArray110[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray110[local16] = (this.anIntArray110[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray110[local16] = local28 + (this.anIntArray110[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2534(local16);
			}
			if (local22 == 121) {
				this.method2549(local16);
			}
			if (local22 == 123) {
				this.method2548(local16);
			}
			@Pc(503) int local503;
			if (local22 == 6) {
				local503 = this.anIntArray110[local16];
				if (local503 == 16384) {
					this.anIntArray118[local16] = (local28 << 7) + (this.anIntArray118[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local503 = this.anIntArray110[local16];
				if (local503 == 16384) {
					this.anIntArray118[local16] = (this.anIntArray118[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray115[local16] = (local28 << 7) + (this.anIntArray115[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray115[local16] = local28 + (this.anIntArray115[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method2546(local16);
					this.anIntArray119[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray119[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method2556((this.anIntArray117[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method2556(local28 + (this.anIntArray117[local16] & 0xFFFFFF80), local16);
			}
		} else if (local7 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2561(local16, this.anIntArray106[local16] + local22);
		} else if (local7 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2539(local22, local16);
		} else if (local7 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00FA) >> 9);
			this.method2533(local16, local22);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method2555(true);
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(IBI)V")
	private void method2561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray121[arg0] != arg1) {
			this.anIntArray121[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass5_Sub19ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "()I")
	@Override
	public synchronized int method6646() {
		return 0;
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(Z)I")
	public int method2562() {
		return this.anInt2872;
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(IIII)V")
	private void method2563(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2559(64, arg0, arg1);
		if ((this.anIntArray119[arg0] & 0x2) != 0) {
			for (@Pc(34) Class5_Sub19 local34 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2818(); local34 != null; local34 = (Class5_Sub19) this.aClass5_Sub17_Sub5_1.aClass114_54.method2817()) {
				if (arg0 == local34.anInt3106 && local34.anInt3116 < 0) {
					this.aClass5_Sub19ArrayArray2[arg0][local34.anInt3114] = null;
					this.aClass5_Sub19ArrayArray2[arg0][arg1] = local34;
					@Pc(71) int local71 = (local34.anInt3123 * local34.anInt3121 >> 12) + local34.anInt3109;
					local34.anInt3109 += arg1 - local34.anInt3114 << 8;
					local34.anInt3123 = 4096;
					local34.anInt3121 = local71 - local34.anInt3109;
					local34.anInt3114 = arg1;
					return;
				}
			}
		}
		@Pc(116) Class5_Sub35 local116 = (Class5_Sub35) this.aClass300_13.method7188((long) this.anIntArray121[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class5_Sub42_Sub1 local124 = local116.aClass5_Sub42_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class5_Sub19 local131 = new Class5_Sub19();
		local131.anInt3106 = arg0;
		local131.aClass5_Sub42_Sub1_1 = local124;
		local131.aClass5_Sub35_1 = local116;
		local131.aClass349_1 = local116.aClass349Array1[arg1];
		local131.anInt3122 = local116.aByteArray49[arg1];
		local131.anInt3114 = arg1;
		local131.anInt3117 = local116.aByteArray47[arg1] * local116.anInt5821 * arg2 * arg2 + 1024 >> 11;
		local131.anInt3119 = local116.aByteArray48[arg1] & 0xFF;
		local131.anInt3109 = (arg1 << 8) - (local116.aShortArray75[arg1] & 0x7FFF);
		local131.anInt3116 = -1;
		local131.anInt3107 = 0;
		local131.anInt3111 = 0;
		local131.anInt3108 = 0;
		local131.anInt3110 = 0;
		if (this.anIntArray115[arg0] == 0) {
			local131.aClass5_Sub17_Sub2_1 = Static684.method3952(local124, this.method2537(local131), this.method2538(local131), this.method2552(local131));
		} else {
			local131.aClass5_Sub17_Sub2_1 = Static684.method3952(local124, this.method2537(local131), 0, this.method2552(local131));
			this.method2544(local131, local116.aShortArray75[arg1] < 0);
		}
		if (local116.aShortArray75[arg1] < 0) {
			local131.aClass5_Sub17_Sub2_1.method3969(-1);
		}
		if (local131.anInt3122 >= 0) {
			@Pc(282) Class5_Sub19 local282 = this.aClass5_Sub19ArrayArray1[arg0][local131.anInt3122];
			if (local282 != null && local282.anInt3116 < 0) {
				this.aClass5_Sub19ArrayArray2[arg0][local282.anInt3114] = null;
				local282.anInt3116 = 0;
			}
			this.aClass5_Sub19ArrayArray1[arg0][local131.anInt3122] = local131;
		}
		this.aClass5_Sub17_Sub5_1.aClass114_54.method2807(local131);
		this.aClass5_Sub19ArrayArray2[arg0][arg1] = local131;
	}
}
