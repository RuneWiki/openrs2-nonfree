import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class3_Sub12_Sub3 extends Class3_Sub12 {

	@OriginalMember(owner = "client!tga", name = "Db", descriptor = "J")
	private long aLong261;

	@OriginalMember(owner = "client!tga", name = "Eb", descriptor = "I")
	private int anInt9315;

	@OriginalMember(owner = "client!tga", name = "Fb", descriptor = "I")
	private int anInt9316;

	@OriginalMember(owner = "client!tga", name = "Hb", descriptor = "J")
	private long aLong262;

	@OriginalMember(owner = "client!tga", name = "Ib", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!tga", name = "Jb", descriptor = "Lclient!k;")
	private Class3_Sub32 aClass3_Sub32_2;

	@OriginalMember(owner = "client!tga", name = "Kb", descriptor = "I")
	private int anInt9317;

	@OriginalMember(owner = "client!tga", name = "Lb", descriptor = "Z")
	private boolean aBoolean651;

	@OriginalMember(owner = "client!tga", name = "p", descriptor = "[I")
	private final int[] anIntArray487 = new int[16];

	@OriginalMember(owner = "client!tga", name = "s", descriptor = "[I")
	private final int[] anIntArray488 = new int[16];

	@OriginalMember(owner = "client!tga", name = "K", descriptor = "[I")
	private final int[] anIntArray493 = new int[16];

	@OriginalMember(owner = "client!tga", name = "H", descriptor = "[I")
	private final int[] anIntArray491 = new int[16];

	@OriginalMember(owner = "client!tga", name = "v", descriptor = "[[Lclient!ew;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray1 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!tga", name = "N", descriptor = "[I")
	private final int[] anIntArray494 = new int[16];

	@OriginalMember(owner = "client!tga", name = "cb", descriptor = "[I")
	public final int[] anIntArray498 = new int[16];

	@OriginalMember(owner = "client!tga", name = "u", descriptor = "[I")
	public final int[] anIntArray489 = new int[16];

	@OriginalMember(owner = "client!tga", name = "y", descriptor = "[I")
	private final int[] anIntArray490 = new int[16];

	@OriginalMember(owner = "client!tga", name = "jb", descriptor = "[[Lclient!ew;")
	private final Class3_Sub16[][] aClass3_Sub16ArrayArray2 = new Class3_Sub16[16][128];

	@OriginalMember(owner = "client!tga", name = "ab", descriptor = "I")
	private final int anInt9295 = 1000000;

	@OriginalMember(owner = "client!tga", name = "Z", descriptor = "[I")
	private final int[] anIntArray497 = new int[16];

	@OriginalMember(owner = "client!tga", name = "db", descriptor = "I")
	private int anInt9297 = 256;

	@OriginalMember(owner = "client!tga", name = "X", descriptor = "[I")
	private final int[] anIntArray496 = new int[16];

	@OriginalMember(owner = "client!tga", name = "nb", descriptor = "[I")
	private final int[] anIntArray500 = new int[16];

	@OriginalMember(owner = "client!tga", name = "hb", descriptor = "[I")
	private final int[] anIntArray499 = new int[16];

	@OriginalMember(owner = "client!tga", name = "I", descriptor = "[I")
	private final int[] anIntArray492 = new int[16];

	@OriginalMember(owner = "client!tga", name = "U", descriptor = "[I")
	private final int[] anIntArray495 = new int[16];

	@OriginalMember(owner = "client!tga", name = "vb", descriptor = "[I")
	private final int[] anIntArray501 = new int[16];

	@OriginalMember(owner = "client!tga", name = "zb", descriptor = "[I")
	public final int[] anIntArray502 = new int[16];

	@OriginalMember(owner = "client!tga", name = "fb", descriptor = "Lclient!wf;")
	private final Class384 aClass384_1 = new Class384();

	@OriginalMember(owner = "client!tga", name = "Gb", descriptor = "Lclient!lba;")
	private final Class3_Sub12_Sub2 aClass3_Sub12_Sub2_1 = new Class3_Sub12_Sub2(this);

	@OriginalMember(owner = "client!tga", name = "sb", descriptor = "Lclient!tca;")
	private final Class333 aClass333_35;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "()V")
	public Class3_Sub12_Sub3() {
		this.aClass333_35 = new Class333(128);
		this.method7552(-1, 256);
		this.method7555(true);
	}

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Lclient!tga;)V")
	public Class3_Sub12_Sub3(@OriginalArg(0) Class3_Sub12_Sub3 arg0) {
		this.aClass333_35 = arg0.aClass333_35;
		this.method7552(-1, 256);
		this.method7555(true);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLclient!ew;)I")
	private int method7544(@OriginalArg(1) Class3_Sub16 arg0) {
		if (this.anIntArray487[arg0.anInt2816] == 0) {
			return 0;
		}
		@Pc(17) Class353 local17 = arg0.aClass353_1;
		@Pc(39) int local39 = this.anIntArray494[arg0.anInt2816] * this.anIntArray490[arg0.anInt2816] + 4096 >> 13;
		@Pc(47) int local47 = local39 * local39 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt2822 * local47 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt9297 * local56 + 128 >> 8;
		local39 = this.anIntArray487[arg0.anInt2816] * local65 + 128 >> 8;
		if (local17.anInt10118 > 0) {
			local39 = (int) (Math.pow(0.5D, (double) local17.anInt10118 * 1.953125E-5D * (double) arg0.anInt2826) * (double) local39 + 0.5D);
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		@Pc(137) int local137;
		@Pc(149) int local149;
		if (local17.aByteArray92 != null) {
			local107 = arg0.anInt2817;
			local115 = local17.aByteArray92[arg0.anInt2829 + 1];
			if (local17.aByteArray92.length - 2 > arg0.anInt2829) {
				local137 = (local17.aByteArray92[arg0.anInt2829] & 0xFF) << 8;
				local149 = (local17.aByteArray92[arg0.anInt2829 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray92[arg0.anInt2829 + 3] - local115) * (-local137 + local107) / (local149 - local137);
			}
			local39 = local39 * local115 + 32 >> 6;
		}
		if (arg0.anInt2828 > 0 && local17.aByteArray91 != null) {
			local107 = arg0.anInt2828;
			local115 = local17.aByteArray91[arg0.anInt2821 + 1];
			if (arg0.anInt2821 < local17.aByteArray91.length - 2) {
				local137 = (local17.aByteArray91[arg0.anInt2821] & 0xFF) << 8;
				local149 = (local17.aByteArray91[arg0.anInt2821 + 2] & 0xFF) << 8;
				local115 += (local17.aByteArray91[arg0.anInt2821 + 3] - local115) * (-local137 + local107) / (local149 - local137);
			}
			local39 = local39 * local115 + 32 >> 6;
		}
		return local39;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BII)V")
	private void method7545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IB)V")
	private void method7546(@OriginalArg(0) int arg0) {
		if ((this.anIntArray502[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(30) Class3_Sub16 local30 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6603(); local30 != null; local30 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6605()) {
			if (local30.anInt2816 == arg0) {
				local30.anInt2815 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass384_1.method8803()) {
			@Pc(14) int local14 = this.anInt9295 * this.aClass384_1.anInt10724 / Static16.anInt10139;
			do {
				@Pc(24) long local24 = this.aLong261 + (long) local14 * (long) arg2;
				if (this.aLong262 - local24 >= 0L) {
					this.aLong261 = local24;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong262 + (long) local14 - this.aLong261 - 1L) / (long) local14);
				this.aLong261 += (long) local14 * (long) local53;
				this.aClass3_Sub12_Sub2_1.method8948(arg0, arg1, local53);
				arg2 -= local53;
				arg1 += local53;
				this.method7565();
			} while (this.aClass384_1.method8803());
		}
		this.aClass3_Sub12_Sub2_1.method8948(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIILclient!ew;[I)Z")
	public boolean method7547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub16 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt2830 = Static16.anInt10139 / 100;
		if (arg2.anInt2828 >= 0 && (arg2.aClass3_Sub12_Sub4_2 == null || arg2.aClass3_Sub12_Sub4_2.method8525())) {
			arg2.method2451();
			arg2.method9034();
			if (arg2.anInt2820 > 0 && arg2 == this.aClass3_Sub16ArrayArray1[arg2.anInt2816][arg2.anInt2820]) {
				this.aClass3_Sub16ArrayArray1[arg2.anInt2816][arg2.anInt2820] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt2823;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray488[arg2.anInt2816] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt2823 = local59;
		}
		arg2.aClass3_Sub12_Sub4_2.method8524(this.method7569(arg2));
		@Pc(96) Class353 local96 = arg2.aClass353_1;
		arg2.anInt2818 += local96.anInt10122;
		arg2.anInt2832++;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg2.anInt2831 - 60 << 8) + (arg2.anInt2825 * arg2.anInt2823 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt10118 > 0) {
			if (local96.anInt10119 <= 0) {
				arg2.anInt2826 += 128;
			} else {
				arg2.anInt2826 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt10119) * 128.0D + 0.5D);
			}
			if (arg2.anInt2826 * local96.anInt10118 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray92 != null) {
			if (local96.anInt10125 <= 0) {
				arg2.anInt2817 += 128;
			} else {
				arg2.anInt2817 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt10125) * 128.0D + 0.5D);
			}
			while (arg2.anInt2829 < local96.aByteArray92.length - 2 && (local96.aByteArray92[arg2.anInt2829 + 2] & 0xFF) << 8 < arg2.anInt2817) {
				arg2.anInt2829 += 2;
			}
			if (arg2.anInt2829 == local96.aByteArray92.length - 2 && local96.aByteArray92[arg2.anInt2829 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt2828 >= 0 && local96.aByteArray91 != null && (this.anIntArray502[arg2.anInt2816] & 0x1) == 0 && (arg2.anInt2820 < 0 || arg2 != this.aClass3_Sub16ArrayArray1[arg2.anInt2816][arg2.anInt2820])) {
			if (local96.anInt10124 <= 0) {
				arg2.anInt2828 += 128;
			} else {
				arg2.anInt2828 += (int) (Math.pow(2.0D, (double) local96.anInt10124 * local129) * 128.0D + 0.5D);
			}
			while (arg2.anInt2821 < local96.aByteArray91.length - 2 && (local96.aByteArray91[arg2.anInt2821 + 2] & 0xFF) << 8 < arg2.anInt2828) {
				arg2.anInt2821 += 2;
			}
			if (local96.aByteArray91.length - 2 == arg2.anInt2821) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass3_Sub12_Sub4_2.method8544(arg2.anInt2830, this.method7544(arg2), this.method7559(arg2));
			return false;
		}
		arg2.aClass3_Sub12_Sub4_2.method8532(arg2.anInt2830);
		if (arg3 == null) {
			arg2.aClass3_Sub12_Sub4_2.method8942(arg0);
		} else {
			arg2.aClass3_Sub12_Sub4_2.method8948(arg3, arg1, arg0);
		}
		if (arg2.aClass3_Sub12_Sub4_2.method8543()) {
			this.aClass3_Sub12_Sub2_1.aClass3_Sub12_Sub1_2.method1765(arg2.aClass3_Sub12_Sub4_2);
		}
		arg2.method2451();
		if (arg2.anInt2828 >= 0) {
			arg2.method9034();
			if (arg2.anInt2820 > 0 && this.aClass3_Sub16ArrayArray1[arg2.anInt2816][arg2.anInt2820] == arg2) {
				this.aClass3_Sub16ArrayArray1[arg2.anInt2816][arg2.anInt2820] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lclient!ew;Z)Z")
	public boolean method7548(@OriginalArg(0) Class3_Sub16 arg0) {
		if (arg0.aClass3_Sub12_Sub4_2 != null) {
			return false;
		}
		if (arg0.anInt2828 >= 0) {
			arg0.method9034();
			if (arg0.anInt2820 > 0 && this.aClass3_Sub16ArrayArray1[arg0.anInt2816][arg0.anInt2820] == arg0) {
				this.aClass3_Sub16ArrayArray1[arg0.anInt2816][arg0.anInt2820] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BZ)V")
	private synchronized void method7549(@OriginalArg(1) boolean arg0) {
		this.aClass384_1.method8801();
		this.aClass3_Sub32_2 = null;
		this.method7555(arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(III)V")
	private void method7550() {
		this.anIntArray499[9] = 128;
		this.anIntArray501[9] = 128;
		this.method7562(128, 9);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BIII)V")
	private void method7551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7580(arg0, arg2, 64);
		if ((this.anIntArray502[arg0] & 0x2) != 0) {
			for (@Pc(27) Class3_Sub16 local27 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6602(); local27 != null; local27 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6609()) {
				if (arg0 == local27.anInt2816 && local27.anInt2828 < 0) {
					this.aClass3_Sub16ArrayArray2[arg0][local27.anInt2831] = null;
					this.aClass3_Sub16ArrayArray2[arg0][arg2] = local27;
					@Pc(69) int local69 = local27.anInt2827 + (local27.anInt2825 * local27.anInt2823 >> 12);
					local27.anInt2827 += arg2 - local27.anInt2831 << 8;
					local27.anInt2823 = 4096;
					local27.anInt2825 = local69 - local27.anInt2827;
					local27.anInt2831 = arg2;
					return;
				}
			}
		}
		@Pc(117) Class3_Sub35 local117 = (Class3_Sub35) this.aClass333_35.method7489((long) this.anIntArray491[arg0]);
		if (local117 == null) {
			return;
		}
		@Pc(125) Class3_Sub39_Sub1 local125 = local117.aClass3_Sub39_Sub1Array1[arg2];
		if (local125 == null) {
			return;
		}
		@Pc(132) Class3_Sub16 local132 = new Class3_Sub16();
		local132.aClass3_Sub39_Sub1_2 = local125;
		local132.anInt2816 = arg0;
		local132.aClass3_Sub35_1 = local117;
		local132.aClass353_1 = local117.aClass353Array1[arg2];
		local132.anInt2820 = local117.aByteArray51[arg2];
		local132.anInt2831 = arg2;
		local132.anInt2822 = local117.aByteArray52[arg2] * arg1 * arg1 * local117.anInt6007 + 1024 >> 11;
		local132.anInt2819 = local117.aByteArray53[arg2] & 0xFF;
		local132.anInt2827 = (arg2 << 8) - (local117.aShortArray72[arg2] & 0x7FFF);
		local132.anInt2828 = -1;
		local132.anInt2817 = 0;
		local132.anInt2829 = 0;
		local132.anInt2826 = 0;
		local132.anInt2821 = 0;
		if (this.anIntArray498[arg0] == 0) {
			local132.aClass3_Sub12_Sub4_2 = Static687.method8546(local125, this.method7569(local132), this.method7544(local132), this.method7559(local132));
		} else {
			local132.aClass3_Sub12_Sub4_2 = Static687.method8546(local125, this.method7569(local132), 0, this.method7559(local132));
			this.method7564(local117.aShortArray72[arg2] < 0, local132);
		}
		if (local117.aShortArray72[arg2] < 0) {
			local132.aClass3_Sub12_Sub4_2.method8528(-1);
		}
		if (local132.anInt2820 >= 0) {
			@Pc(287) Class3_Sub16 local287 = this.aClass3_Sub16ArrayArray1[arg0][local132.anInt2820];
			if (local287 != null && local287.anInt2828 < 0) {
				this.aClass3_Sub16ArrayArray2[arg0][local287.anInt2831] = null;
				local287.anInt2828 = 0;
			}
			this.aClass3_Sub16ArrayArray1[arg0][local132.anInt2820] = local132;
		}
		this.aClass3_Sub12_Sub2_1.aClass302_28.method6613(local132);
		this.aClass3_Sub16ArrayArray2[arg0][arg2] = local132;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(III)V")
	public synchronized void method7552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray487[arg0] = arg1;
		} else {
			for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
				this.anIntArray487[local18] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BI)V")
	public synchronized void method7553(@OriginalArg(1) int arg0) {
		this.anInt9297 = arg0;
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
	public synchronized void method7554() {
		for (@Pc(7) Class3_Sub35 local7 = (Class3_Sub35) this.aClass333_35.method7490(); local7 != null; local7 = (Class3_Sub35) this.aClass333_35.method7487()) {
			local7.method9034();
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "()Lclient!pp;")
	@Override
	public synchronized Class3_Sub12 method8945() {
		return null;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZI)V")
	private void method7555(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method7575(-1);
		} else {
			this.method7579(-1);
		}
		this.method7572(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray491[local27] = this.anIntArray499[local27];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray501[local43] = this.anIntArray499[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(BII)V")
	public synchronized void method7556() {
		this.method7550();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BLclient!k;Z)V")
	public synchronized void method7557(@OriginalArg(1) Class3_Sub32 arg0, @OriginalArg(2) boolean arg1) {
		this.method7582(arg1, true, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIII)V")
	private void method7558(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(BLclient!ew;)I")
	private int method7559(@OriginalArg(1) Class3_Sub16 arg0) {
		@Pc(14) int local14 = this.anIntArray493[arg0.anInt2816];
		return local14 >= 8192 ? 16384 - ((128 - arg0.anInt2819) * (-local14 + 16384) + 32 >> 6) : arg0.anInt2819 * local14 + 32 >> 6;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIB)V")
	private void method7560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray492[arg1] = arg0;
		this.anIntArray489[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
	public synchronized void method7561() {
		this.method7549(true);
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(III)V")
	private void method7562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray491[arg1] != arg0) {
			this.anIntArray491[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass3_Sub16ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!cga;ILclient!k;Lclient!uq;)Z")
	public synchronized boolean method7563(@OriginalArg(1) Class53 arg0, @OriginalArg(3) Class3_Sub32 arg1, @OriginalArg(4) Class362 arg2) {
		arg1.method4333();
		@Pc(9) boolean local9 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class3_Sub17 local32 = (Class3_Sub17) arg1.aClass333_19.method7490(); local32 != null; local32 = (Class3_Sub17) arg1.aClass333_19.method7487()) {
			@Pc(38) int local38 = (int) local32.aLong313;
			@Pc(46) Class3_Sub35 local46 = (Class3_Sub35) this.aClass333_35.method7489((long) local38);
			if (local46 == null) {
				local46 = Static323.method4616(arg2, local38);
				if (local46 == null) {
					local9 = false;
					continue;
				}
				this.aClass333_35.method7488((long) local38, local46);
			}
			if (!local46.method5060(arg0, local26, local32.aByteArray16)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method4332();
		}
		return local9;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLclient!ew;B)V")
	public void method7564(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class3_Sub16 arg1) {
		@Pc(14) int local14 = arg1.aClass3_Sub39_Sub1_2.aByteArray67.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass3_Sub39_Sub1_2.aBoolean534) {
			@Pc(43) int local43 = local14 + local14 - arg1.aClass3_Sub39_Sub1_2.anInt7569;
			local14 <<= 0x8;
			local33 = (int) ((long) this.anIntArray498[arg1.anInt2816] * (long) local43 >> 6);
			if (local14 <= local33) {
				arg1.aClass3_Sub12_Sub4_2.method8550();
				local33 = local14 + local14 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray498[arg1.anInt2816] * (long) local14 >> 6);
		}
		arg1.aClass3_Sub12_Sub4_2.method8554(local33);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
	private void method7565() {
		@Pc(14) int local14 = this.anInt9316;
		@Pc(17) int local17 = this.anInt9315;
		@Pc(20) long local20 = this.aLong262;
		if (this.aClass3_Sub32_2 != null && this.anInt9317 == local17) {
			this.method7582(this.aBoolean650, this.aBoolean651, this.aClass3_Sub32_2);
			this.method7565();
			return;
		}
		while (this.anInt9315 == local17) {
			while (this.aClass384_1.anIntArray587[local14] == local17) {
				this.aClass384_1.method8799(local14);
				@Pc(53) int local53 = this.aClass384_1.method8802(local14);
				if (local53 == 1) {
					this.aClass384_1.method8805();
					this.aClass384_1.method8797(local14);
					if (this.aClass384_1.method8800()) {
						if (this.aClass3_Sub32_2 != null) {
							this.method7557(this.aClass3_Sub32_2, this.aBoolean650);
							this.method7565();
							return;
						}
						if (!this.aBoolean650 || local17 == 0) {
							this.method7555(true);
							this.aClass384_1.method8801();
							return;
						}
						this.aClass384_1.method8798(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method7577(local53);
				}
				this.aClass384_1.method8793(local14);
				this.aClass384_1.method8797(local14);
			}
			local14 = this.aClass384_1.method8806();
			local17 = this.aClass384_1.anIntArray587[local14];
			local20 = this.aClass384_1.method8796(local17);
		}
		this.anInt9316 = local14;
		this.aLong262 = local20;
		this.anInt9315 = local17;
		if (this.aClass3_Sub32_2 != null && this.anInt9317 < local17) {
			this.anInt9315 = this.anInt9317;
			this.anInt9316 = -1;
			this.aLong262 = this.aClass384_1.method8796(this.anInt9315);
		}
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "()I")
	@Override
	public synchronized int method8947() {
		return 0;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZZZLclient!k;J)V")
	public synchronized void method7567(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class3_Sub32 arg1, @OriginalArg(4) long arg2) {
		this.method7582(arg0, true, arg1);
		this.method7570((long) this.aClass384_1.anInt10724 * arg2);
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "(III)V")
	private void method7568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray496[arg1] = arg0;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ILclient!ew;)I")
	private int method7569(@OriginalArg(1) Class3_Sub16 arg0) {
		@Pc(14) int local14 = arg0.anInt2827 + (arg0.anInt2825 * arg0.anInt2823 >> 12);
		local14 += this.anIntArray500[arg0.anInt2816] * (this.anIntArray496[arg0.anInt2816] - 8192) >> 12;
		@Pc(35) Class353 local35 = arg0.aClass353_1;
		@Pc(55) int local55;
		if (local35.anInt10122 > 0 && (local35.anInt10123 > 0 || this.anIntArray497[arg0.anInt2816] > 0)) {
			local55 = local35.anInt10123 << 2;
			@Pc(60) int local60 = local35.anInt10121 << 1;
			if (local60 > arg0.anInt2832) {
				local55 = local55 * arg0.anInt2832 / local60;
			}
			local55 += this.anIntArray497[arg0.anInt2816] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt2818 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local55 * local90);
		}
		local55 = (int) ((double) (arg0.aClass3_Sub39_Sub1_2.anInt7568 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static16.anInt10139 + 0.5D);
		return local55 >= 1 ? local55 : 1;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(BJ)V")
	private void method7570(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong262) {
			@Pc(16) int local16 = this.anInt9316;
			@Pc(19) int local19 = this.anInt9315;
			@Pc(22) long local22 = this.aLong262;
			while (this.anInt9315 == local19) {
				while (this.aClass384_1.anIntArray587[local16] == local19) {
					this.aClass384_1.method8799(local16);
					@Pc(33) int local33 = this.aClass384_1.method8802(local16);
					if (local33 == 1) {
						this.aClass384_1.method8805();
						this.aClass384_1.method8797(local16);
						if (this.aClass384_1.method8800()) {
							if (!this.aBoolean650 || local19 == 0) {
								this.method7555(true);
								this.aClass384_1.method8801();
								return;
							}
							this.aClass384_1.method8798(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method7577(local33);
					}
					this.aClass384_1.method8793(local16);
					this.aClass384_1.method8797(local16);
				}
				this.aLong261 = local22;
				local16 = this.aClass384_1.method8806();
				local19 = this.aClass384_1.anIntArray587[local16];
				local22 = this.aClass384_1.method8796(local19);
			}
			this.aLong262 = local22;
			this.anInt9315 = local19;
			this.anInt9316 = local16;
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)Z")
	public synchronized boolean method7571() {
		return this.aClass384_1.method8803();
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II)V")
	private void method7572(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method7572(local12);
			}
			return;
		}
		this.anIntArray490[arg0] = 12800;
		this.anIntArray493[arg0] = 8192;
		this.anIntArray494[arg0] = 16383;
		this.anIntArray496[arg0] = 8192;
		this.anIntArray497[arg0] = 0;
		this.anIntArray488[arg0] = 8192;
		this.method7573(arg0);
		this.method7546(arg0);
		this.anIntArray502[arg0] = 0;
		this.anIntArray495[arg0] = 32767;
		this.anIntArray500[arg0] = 256;
		this.anIntArray498[arg0] = 0;
		this.method7560(8192, arg0);
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(BI)V")
	private void method7573(@OriginalArg(1) int arg0) {
		if ((this.anIntArray502[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class3_Sub16 local15 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6603(); local15 != null; local15 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6605()) {
			if (local15.anInt2816 == arg0 && this.aClass3_Sub16ArrayArray2[arg0][local15.anInt2831] == null && local15.anInt2828 < 0) {
				local15.anInt2828 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(II)V")
	private void method7575(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6603(); local12 != null; local12 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6605()) {
			if (arg0 < 0 || local12.anInt2816 == arg0) {
				if (local12.aClass3_Sub12_Sub4_2 != null) {
					local12.aClass3_Sub12_Sub4_2.method8532(Static16.anInt10139 / 100);
					if (local12.aClass3_Sub12_Sub4_2.method8543()) {
						this.aClass3_Sub12_Sub2_1.aClass3_Sub12_Sub1_2.method1765(local12.aClass3_Sub12_Sub4_2);
					}
					local12.method2451();
				}
				if (local12.anInt2828 < 0) {
					this.aClass3_Sub16ArrayArray2[local12.anInt2816][local12.anInt2831] = null;
				}
				local12.method9034();
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)I")
	public int method7576() {
		return this.anInt9297;
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "(BI)V")
	private void method7577(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7580(local18, local24, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method7551(local18, local30, local24);
			} else {
				this.method7580(local18, local24, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7558(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray501[local18] = (this.anIntArray501[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray501[local18] = (local30 << 7) + (this.anIntArray501[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray497[local18] = (this.anIntArray497[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray497[local18] = (this.anIntArray497[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray488[local18] = (this.anIntArray488[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray488[local18] = local30 + (this.anIntArray488[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray490[local18] = (this.anIntArray490[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray490[local18] = (this.anIntArray490[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray493[local18] = (this.anIntArray493[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray493[local18] = (this.anIntArray493[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray494[local18] = (local30 << 7) + (this.anIntArray494[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray494[local18] = local30 + (this.anIntArray494[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray502[local18] |= 0x1;
				} else {
					this.anIntArray502[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray502[local18] |= 0x2;
				} else {
					this.method7573(local18);
					this.anIntArray502[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray495[local18] = (local30 << 7) + (this.anIntArray495[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray495[local18] = local30 + (this.anIntArray495[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray495[local18] = (local30 << 7) + (this.anIntArray495[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray495[local18] = local30 + (this.anIntArray495[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method7575(local18);
			}
			if (local24 == 121) {
				this.method7572(local18);
			}
			if (local24 == 123) {
				this.method7579(local18);
			}
			@Pc(515) int local515;
			if (local24 == 6) {
				local515 = this.anIntArray495[local18];
				if (local515 == 16384) {
					this.anIntArray500[local18] = (this.anIntArray500[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local515 = this.anIntArray495[local18];
				if (local515 == 16384) {
					this.anIntArray500[local18] = (this.anIntArray500[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray498[local18] = (local30 << 7) + (this.anIntArray498[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray498[local18] = (this.anIntArray498[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method7546(local18);
					this.anIntArray502[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray502[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method7560((this.anIntArray492[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method7560((this.anIntArray492[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7562(local24 + this.anIntArray501[local18], local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method7545(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F00F0) >> 9);
			this.method7568(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7555(true);
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "c", descriptor = "()Lclient!pp;")
	@Override
	public synchronized Class3_Sub12 method8946() {
		return this.aClass3_Sub12_Sub2_1;
	}

	@OriginalMember(owner = "client!tga", name = "d", descriptor = "(B)V")
	public synchronized void method7578() {
		for (@Pc(11) Class3_Sub35 local11 = (Class3_Sub35) this.aClass333_35.method7490(); local11 != null; local11 = (Class3_Sub35) this.aClass333_35.method7487()) {
			local11.method5059();
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)V")
	private void method7579(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class3_Sub16 local12 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6603(); local12 != null; local12 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6605()) {
			if ((arg0 < 0 || arg0 == local12.anInt2816) && local12.anInt2828 < 0) {
				this.aClass3_Sub16ArrayArray2[local12.anInt2816][local12.anInt2831] = null;
				local12.anInt2828 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(IIII)V")
	private void method7580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub16 local12 = this.aClass3_Sub16ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub16ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray502[arg0] & 0x2) == 0) {
			local12.anInt2828 = 0;
			return;
		}
		for (@Pc(43) Class3_Sub16 local43 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6603(); local43 != null; local43 = (Class3_Sub16) this.aClass3_Sub12_Sub2_1.aClass302_28.method6605()) {
			if (local43.anInt2816 == local12.anInt2816 && local43.anInt2828 < 0 && local12 != local43) {
				local12.anInt2828 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8942(@OriginalArg(0) int arg0) {
		if (this.aClass384_1.method8803()) {
			@Pc(18) int local18 = this.anInt9295 * this.aClass384_1.anInt10724 / Static16.anInt10139;
			do {
				@Pc(28) long local28 = this.aLong261 + (long) arg0 * (long) local18;
				if (this.aLong262 - local28 >= 0L) {
					this.aLong261 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong262 - this.aLong261 - 1L) / (long) local18);
				this.aLong261 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass3_Sub12_Sub2_1.method8942(local57);
				this.method7565();
			} while (this.aClass384_1.method8803());
		}
		this.aClass3_Sub12_Sub2_1.method8942(arg0);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZZLclient!k;)V")
	private synchronized void method7582(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class3_Sub32 arg2) {
		this.method7549(arg1);
		this.aClass384_1.method8794(arg2.aByteArray44);
		this.aLong261 = (long) 0;
		this.aBoolean650 = arg0;
		@Pc(25) int local25 = this.aClass384_1.method8804();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass384_1.method8799(local27);
			this.aClass384_1.method8793(local27);
			this.aClass384_1.method8797(local27);
		}
		this.anInt9316 = this.aClass384_1.method8806();
		this.anInt9315 = this.aClass384_1.anIntArray587[this.anInt9316];
		this.aLong262 = this.aClass384_1.method8796(this.anInt9315);
	}
}
