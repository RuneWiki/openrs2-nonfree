import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!cc", name = "Cb", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!cc", name = "Fb", descriptor = "I")
	private int anInt1015;

	@OriginalMember(owner = "client!cc", name = "Gb", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!cc", name = "Ib", descriptor = "I")
	private int anInt1016;

	@OriginalMember(owner = "client!cc", name = "Jb", descriptor = "Lclient!bh;")
	private Class2_Sub8 aClass2_Sub8_1;

	@OriginalMember(owner = "client!cc", name = "Kb", descriptor = "I")
	private int anInt1017;

	@OriginalMember(owner = "client!cc", name = "Lb", descriptor = "Z")
	private boolean aBoolean60;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[I")
	public final int[] anIntArray82 = new int[16];

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "[I")
	private final int[] anIntArray90 = new int[16];

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "[I")
	private final int[] anIntArray83 = new int[16];

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "[I")
	private final int[] anIntArray85 = new int[16];

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "[I")
	private final int[] anIntArray88 = new int[16];

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "[I")
	private final int[] anIntArray89 = new int[16];

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "[I")
	private final int[] anIntArray84 = new int[16];

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "[I")
	private final int[] anIntArray92 = new int[16];

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "[I")
	public final int[] anIntArray94 = new int[16];

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[I")
	public final int[] anIntArray87 = new int[16];

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "[[Lclient!gt;")
	private final Class2_Sub25[][] aClass2_Sub25ArrayArray1 = new Class2_Sub25[16][128];

	@OriginalMember(owner = "client!cc", name = "pb", descriptor = "[I")
	private final int[] anIntArray97 = new int[16];

	@OriginalMember(owner = "client!cc", name = "rb", descriptor = "[I")
	private final int[] anIntArray98 = new int[16];

	@OriginalMember(owner = "client!cc", name = "mb", descriptor = "I")
	private final int anInt1002 = 1000000;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "[I")
	private final int[] anIntArray95 = new int[16];

	@OriginalMember(owner = "client!cc", name = "ub", descriptor = "[[Lclient!gt;")
	private final Class2_Sub25[][] aClass2_Sub25ArrayArray2 = new Class2_Sub25[16][128];

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "[I")
	private final int[] anIntArray93 = new int[16];

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
	private int anInt990 = 256;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "[I")
	private final int[] anIntArray86 = new int[16];

	@OriginalMember(owner = "client!cc", name = "jb", descriptor = "[I")
	private final int[] anIntArray96 = new int[16];

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "Lclient!faa;")
	private final Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!cc", name = "Db", descriptor = "Lclient!ug;")
	private final Class2_Sub12_Sub4 aClass2_Sub12_Sub4_1 = new Class2_Sub12_Sub4(this);

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "Lclient!ica;")
	private final Class127 aClass127_10 = new Class127(128);

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class2_Sub12_Sub1() {
		this.method1010();
		this.method1017(true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILclient!gt;I[I)Z")
	public boolean method1001(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub25 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt3064 = Static302.anInt5530 / 100;
		if (arg1.anInt3054 >= 0 && (arg1.aClass2_Sub12_Sub3_1 == null || arg1.aClass2_Sub12_Sub3_1.method5596())) {
			arg1.method2827();
			arg1.method7802();
			if (arg1.anInt3069 > 0 && this.aClass2_Sub25ArrayArray1[arg1.anInt3052][arg1.anInt3069] == arg1) {
				this.aClass2_Sub25ArrayArray1[arg1.anInt3052][arg1.anInt3069] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt3065;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray86[arg1.anInt3052] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt3065 = local56;
		}
		arg1.aClass2_Sub12_Sub3_1.method5565(this.method1016(arg1));
		@Pc(104) Class81 local104 = arg1.aClass81_1;
		@Pc(106) boolean local106 = false;
		arg1.anInt3057++;
		arg1.anInt3061 += local104.anInt2450;
		@Pc(137) double local137 = (double) ((arg1.anInt3062 - 60 << 8) + (arg1.anInt3067 * arg1.anInt3065 >> 12)) * 5.086263020833333E-6D;
		if (local104.anInt2447 > 0) {
			if (local104.anInt2448 > 0) {
				arg1.anInt3066 += (int) (Math.pow(2.0D, (double) local104.anInt2448 * local137) * 128.0D + 0.5D);
			} else {
				arg1.anInt3066 += 128;
			}
			if (local104.anInt2447 * arg1.anInt3066 >= 819200) {
				local106 = true;
			}
		}
		if (local104.aByteArray62 != null) {
			if (local104.anInt2441 > 0) {
				arg1.anInt3059 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt2441) * 128.0D + 0.5D);
			} else {
				arg1.anInt3059 += 128;
			}
			while (arg1.anInt3055 < local104.aByteArray62.length - 2 && arg1.anInt3059 > (local104.aByteArray62[arg1.anInt3055 + 2] & 0xFF) << 8) {
				arg1.anInt3055 += 2;
			}
			if (local104.aByteArray62.length - 2 == arg1.anInt3055 && local104.aByteArray62[arg1.anInt3055 + 1] == 0) {
				local106 = true;
			}
		}
		if (arg1.anInt3054 >= 0 && local104.aByteArray61 != null && (this.anIntArray87[arg1.anInt3052] & 0x1) == 0 && (arg1.anInt3069 < 0 || arg1 != this.aClass2_Sub25ArrayArray1[arg1.anInt3052][arg1.anInt3069])) {
			if (local104.anInt2444 > 0) {
				arg1.anInt3054 += (int) (Math.pow(2.0D, local137 * (double) local104.anInt2444) * 128.0D + 0.5D);
			} else {
				arg1.anInt3054 += 128;
			}
			while (local104.aByteArray61.length - 2 > arg1.anInt3056 && arg1.anInt3054 > (local104.aByteArray61[arg1.anInt3056 + 2] & 0xFF) << 8) {
				arg1.anInt3056 += 2;
			}
			if (local104.aByteArray61.length - 2 == arg1.anInt3056) {
				local106 = true;
			}
		}
		if (!local106) {
			arg1.aClass2_Sub12_Sub3_1.method5560(arg1.anInt3064, this.method1034(arg1), this.method1036(arg1));
			return false;
		}
		arg1.aClass2_Sub12_Sub3_1.method5595(arg1.anInt3064);
		if (arg3 == null) {
			arg1.aClass2_Sub12_Sub3_1.method7193(arg0);
		} else {
			arg1.aClass2_Sub12_Sub3_1.method7192(arg3, arg2, arg0);
		}
		if (arg1.aClass2_Sub12_Sub3_1.method5575()) {
			this.aClass2_Sub12_Sub4_1.aClass2_Sub12_Sub2_6.method2086(arg1.aClass2_Sub12_Sub3_1);
		}
		arg1.method2827();
		if (arg1.anInt3054 >= 0) {
			arg1.method7802();
			if (arg1.anInt3069 > 0 && arg1 == this.aClass2_Sub25ArrayArray1[arg1.anInt3052][arg1.anInt3069]) {
				this.aClass2_Sub25ArrayArray1[arg1.anInt3052][arg1.anInt3069] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	private void method1002(@OriginalArg(1) int arg0) {
		if ((this.anIntArray87[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub25 local23 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6527(); local23 != null; local23 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6525()) {
			if (local23.anInt3052 == arg0) {
				local23.anInt3060 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	private void method1003(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1003(local12);
			}
			return;
		}
		this.anIntArray90[arg0] = 12800;
		this.anIntArray88[arg0] = 8192;
		this.anIntArray93[arg0] = 16383;
		this.anIntArray89[arg0] = 8192;
		this.anIntArray85[arg0] = 0;
		this.anIntArray86[arg0] = 8192;
		this.method1037(arg0);
		this.method1002(arg0);
		this.anIntArray87[arg0] = 0;
		this.anIntArray95[arg0] = 32767;
		this.anIntArray97[arg0] = 256;
		this.anIntArray82[arg0] = 0;
		this.method1035(8192, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	private void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray96[arg0]) {
			this.anIntArray96[arg0] = arg1;
			for (@Pc(30) int local30 = 0; local30 < 128; local30++) {
				this.aClass2_Sub25ArrayArray1[arg0][local30] = null;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public synchronized void method1005() {
		this.method1012(true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!dda;Lclient!bh;Lclient!gv;II)Z")
	public synchronized boolean method1006(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class2_Sub8 arg1, @OriginalArg(2) Class108 arg2) {
		arg1.method759();
		@Pc(18) boolean local18 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class2_Sub33 local35 = (Class2_Sub33) arg1.aClass127_9.method3203(); local35 != null; local35 = (Class2_Sub33) arg1.aClass127_9.method3212()) {
			@Pc(41) int local41 = (int) local35.aLong241;
			@Pc(49) Class2_Sub10 local49 = (Class2_Sub10) this.aClass127_10.method3205((long) local41);
			if (local49 == null) {
				local49 = Static7.method6810(arg0, local41);
				if (local49 == null) {
					local18 = false;
					continue;
				}
				this.aClass127_10.method3213(local49, (long) local41);
			}
			if (!local49.method970(local35.aByteArray93, arg2, local29)) {
				local18 = false;
			}
		}
		if (local18) {
			arg1.method761();
		}
		return local18;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	private void method1007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub25 local12 = this.aClass2_Sub25ArrayArray2[arg0][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub25ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray87[arg0] & 0x2) == 0) {
			local12.anInt3054 = 0;
			return;
		}
		for (@Pc(39) Class2_Sub25 local39 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6527(); local39 != null; local39 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6525()) {
			if (local12.anInt3052 == local39.anInt3052 && local39.anInt3054 < 0 && local12 != local39) {
				local12.anInt3054 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)V")
	private void method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray89[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!bh;Z)V")
	public synchronized void method1009(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		this.method1014(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()Lclient!ft;")
	@Override
	public synchronized Class2_Sub12 method7196() {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
	private synchronized void method1010() {
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray98[local13] = 256;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILclient!gt;)V")
	public void method1011(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub25 arg1) {
		@Pc(12) int local12 = arg1.aClass2_Sub31_Sub1_1.aByteArray91.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass2_Sub31_Sub1_1.aBoolean401) {
			@Pc(42) int local42 = local12 + local12 - arg1.aClass2_Sub31_Sub1_1.anInt5386;
			local12 <<= 0x8;
			local31 = (int) ((long) local42 * (long) this.anIntArray82[arg1.anInt3052] >> 6);
			if (local12 <= local31) {
				local31 = local12 + local12 - local31 - 1;
				arg1.aClass2_Sub12_Sub3_1.method5569();
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray82[arg1.anInt3052] >> 6);
		}
		arg1.aClass2_Sub12_Sub3_1.method5581(local31);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	private synchronized void method1012(@OriginalArg(1) boolean arg0) {
		this.aClass82_1.method2332();
		this.aClass2_Sub8_1 = null;
		this.method1017(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	private void method1013() {
		@Pc(12) int local12 = this.anInt1015;
		@Pc(15) int local15 = this.anInt1016;
		@Pc(18) long local18 = this.aLong28;
		if (this.aClass2_Sub8_1 != null && this.anInt1017 == local15) {
			this.method1014(this.aBoolean59, this.aBoolean60, this.aClass2_Sub8_1);
			this.method1013();
			return;
		}
		while (this.anInt1016 == local15) {
			while (this.aClass82_1.anIntArray315[local12] == local15) {
				this.aClass82_1.method2327(local12);
				@Pc(47) int local47 = this.aClass82_1.method2330(local12);
				if (local47 == 1) {
					this.aClass82_1.method2326();
					this.aClass82_1.method2334(local12);
					if (this.aClass82_1.method2338()) {
						if (this.aClass2_Sub8_1 != null) {
							this.method1009(this.aBoolean59, this.aClass2_Sub8_1);
							this.method1013();
							return;
						}
						if (!this.aBoolean59 || local15 == 0) {
							this.method1017(true);
							this.aClass82_1.method2332();
							return;
						}
						this.aClass82_1.method2333(local18);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1031(local47);
				}
				this.aClass82_1.method2336(local12);
				this.aClass82_1.method2334(local12);
			}
			local12 = this.aClass82_1.method2329();
			local15 = this.aClass82_1.anIntArray315[local12];
			local18 = this.aClass82_1.method2340(local15);
		}
		this.anInt1015 = local12;
		this.aLong28 = local18;
		this.anInt1016 = local15;
		if (this.aClass2_Sub8_1 != null && local15 > this.anInt1017) {
			this.anInt1016 = this.anInt1017;
			this.anInt1015 = -1;
			this.aLong28 = this.aClass82_1.method2340(this.anInt1016);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZZLclient!bh;)V")
	private synchronized void method1014(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub8 arg2) {
		this.method1012(arg1);
		this.aClass82_1.method2341(arg2.aByteArray24);
		this.aBoolean59 = arg0;
		this.aLong29 = 0L;
		@Pc(24) int local24 = this.aClass82_1.method2339();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass82_1.method2327(local26);
			this.aClass82_1.method2336(local26);
			this.aClass82_1.method2334(local26);
		}
		this.anInt1015 = this.aClass82_1.method2329();
		this.anInt1016 = this.aClass82_1.anIntArray315[this.anInt1015];
		this.aLong28 = this.aClass82_1.method2340(this.anInt1016);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
	private void method1015(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1007(arg1, arg0, 64);
		if ((this.anIntArray87[arg1] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub25 local28 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6521(); local28 != null; local28 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6526()) {
				if (local28.anInt3052 == arg1 && local28.anInt3054 < 0) {
					this.aClass2_Sub25ArrayArray2[arg1][local28.anInt3062] = null;
					this.aClass2_Sub25ArrayArray2[arg1][arg0] = local28;
					@Pc(67) int local67 = local28.anInt3068 + (local28.anInt3065 * local28.anInt3067 >> 12);
					local28.anInt3068 += arg0 - local28.anInt3062 << 8;
					local28.anInt3062 = arg0;
					local28.anInt3067 = local67 - local28.anInt3068;
					local28.anInt3065 = 4096;
					return;
				}
			}
		}
		@Pc(113) Class2_Sub10 local113 = (Class2_Sub10) this.aClass127_10.method3205((long) this.anIntArray96[arg1]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class2_Sub31_Sub1 local121 = local113.aClass2_Sub31_Sub1Array1[arg0];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class2_Sub25 local128 = new Class2_Sub25();
		local128.aClass2_Sub10_1 = local113;
		local128.aClass2_Sub31_Sub1_1 = local121;
		local128.anInt3052 = arg1;
		local128.aClass81_1 = local113.aClass81Array1[arg0];
		local128.anInt3069 = local113.aByteArray35[arg0];
		local128.anInt3062 = arg0;
		local128.anInt3053 = local113.aByteArray33[arg0] * local113.anInt953 * arg2 * arg2 + 1024 >> 11;
		local128.anInt3070 = local113.aByteArray34[arg0] & 0xFF;
		local128.anInt3068 = (arg0 << 8) - (local113.aShortArray36[arg0] & 0x7FFF);
		local128.anInt3066 = 0;
		local128.anInt3056 = 0;
		local128.anInt3055 = 0;
		local128.anInt3059 = 0;
		local128.anInt3054 = -1;
		if (this.anIntArray82[arg1] == 0) {
			local128.aClass2_Sub12_Sub3_1 = Static555.method5580(local121, this.method1016(local128), this.method1034(local128), this.method1036(local128));
		} else {
			local128.aClass2_Sub12_Sub3_1 = Static555.method5580(local121, this.method1016(local128), 0, this.method1036(local128));
			this.method1011(local113.aShortArray36[arg0] < 0, local128);
		}
		if (local113.aShortArray36[arg0] < 0) {
			local128.aClass2_Sub12_Sub3_1.method5579(-1);
		}
		if (local128.anInt3069 >= 0) {
			@Pc(284) Class2_Sub25 local284 = this.aClass2_Sub25ArrayArray1[arg1][local128.anInt3069];
			if (local284 != null && local284.anInt3054 < 0) {
				this.aClass2_Sub25ArrayArray2[arg1][local284.anInt3062] = null;
				local284.anInt3054 = 0;
			}
			this.aClass2_Sub25ArrayArray1[arg1][local128.anInt3069] = local128;
		}
		this.aClass2_Sub12_Sub4_1.aClass249_66.method6523(local128);
		this.aClass2_Sub25ArrayArray2[arg1][arg0] = local128;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7192(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass82_1.method2331()) {
			@Pc(18) int local18 = this.anInt1002 * this.aClass82_1.anInt2451 / Static302.anInt5530;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong29;
				if (this.aLong28 - local27 >= 0L) {
					this.aLong29 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong28 - this.aLong29 - 1L) / (long) local18);
				this.aLong29 += (long) local56 * (long) local18;
				this.aClass2_Sub12_Sub4_1.method7192(arg0, arg1, local56);
				arg2 -= local56;
				arg1 += local56;
				this.method1013();
			} while (this.aClass82_1.method2331());
		}
		this.aClass2_Sub12_Sub4_1.method7192(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!gt;B)I")
	private int method1016(@OriginalArg(0) Class2_Sub25 arg0) {
		@Pc(15) int local15 = arg0.anInt3068 + (arg0.anInt3067 * arg0.anInt3065 >> 12);
		local15 += (this.anIntArray89[arg0.anInt3052] - 8192) * this.anIntArray97[arg0.anInt3052] >> 12;
		@Pc(44) Class81 local44 = arg0.aClass81_1;
		@Pc(67) int local67;
		if (local44.anInt2450 > 0 && (local44.anInt2449 > 0 || this.anIntArray85[arg0.anInt3052] > 0)) {
			local67 = local44.anInt2449 << 2;
			@Pc(72) int local72 = local44.anInt2446 << 1;
			if (arg0.anInt3057 < local72) {
				local67 = arg0.anInt3057 * local67 / local72;
			}
			local67 += this.anIntArray85[arg0.anInt3052] >> 7;
			@Pc(106) double local106 = Math.sin((double) (arg0.anInt3061 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local67 * local106);
		}
		local67 = (int) ((double) (arg0.aClass2_Sub31_Sub1_1.anInt5384 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static302.anInt5530 + 0.5D);
		return local67 >= 1 ? local67 : 1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
	@Override
	public synchronized int method7191() {
		return 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7193(@OriginalArg(0) int arg0) {
		if (this.aClass82_1.method2331()) {
			@Pc(18) int local18 = this.aClass82_1.anInt2451 * this.anInt1002 / Static302.anInt5530;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong29;
				if (this.aLong28 - local27 >= 0L) {
					this.aLong29 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong28 - this.aLong29 - 1L) / (long) local18);
				this.aLong29 += (long) local18 * (long) local58;
				this.aClass2_Sub12_Sub4_1.method7193(local58);
				arg0 -= local58;
				this.method1013();
			} while (this.aClass82_1.method2331());
		}
		this.aClass2_Sub12_Sub4_1.method7193(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	private void method1017(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1024(-1);
		} else {
			this.method1038(-1);
		}
		this.method1003(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray96[local23] = this.anIntArray84[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray83[local41] = this.anIntArray84[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIII)V")
	private void method1018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I")
	public int method1019() {
		return this.anInt990;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!gt;)Z")
	public boolean method1022(@OriginalArg(1) Class2_Sub25 arg0) {
		if (arg0.aClass2_Sub12_Sub3_1 != null) {
			return false;
		}
		if (arg0.anInt3054 >= 0) {
			arg0.method7802();
			if (arg0.anInt3069 > 0 && arg0 == this.aClass2_Sub25ArrayArray1[arg0.anInt3052][arg0.anInt3069]) {
				this.aClass2_Sub25ArrayArray1[arg0.anInt3052][arg0.anInt3069] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
	public synchronized void method1023() {
		this.method1032();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	private void method1024(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub25 local16 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6527(); local16 != null; local16 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6525()) {
			if (arg0 < 0 || arg0 == local16.anInt3052) {
				if (local16.aClass2_Sub12_Sub3_1 != null) {
					local16.aClass2_Sub12_Sub3_1.method5595(Static302.anInt5530 / 100);
					if (local16.aClass2_Sub12_Sub3_1.method5575()) {
						this.aClass2_Sub12_Sub4_1.aClass2_Sub12_Sub2_6.method2086(local16.aClass2_Sub12_Sub3_1);
					}
					local16.method2827();
				}
				if (local16.anInt3054 < 0) {
					this.aClass2_Sub25ArrayArray2[local16.anInt3052][local16.anInt3062] = null;
				}
				local16.method7802();
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
	public synchronized boolean method1027() {
		return this.aClass82_1.method2331();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)V")
	public synchronized void method1028(@OriginalArg(0) int arg0) {
		this.anInt990 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(I)V")
	public synchronized void method1030() {
		for (@Pc(11) Class2_Sub10 local11 = (Class2_Sub10) this.aClass127_10.method3203(); local11 != null; local11 = (Class2_Sub10) this.aClass127_10.method3212()) {
			local11.method967();
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(II)V")
	private void method1031(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method1007(local24, local30, local36);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method1015(local30, local24, local36);
			} else {
				this.method1007(local24, local30, 64);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method1018(local36, local30, local24);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray83[local24] = (this.anIntArray83[local24] & 0xFFE03FFF) + (local36 << 14);
			}
			if (local30 == 32) {
				this.anIntArray83[local24] = (this.anIntArray83[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.anIntArray85[local24] = (this.anIntArray85[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray85[local24] = local36 + (this.anIntArray85[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray86[local24] = (local36 << 7) + (this.anIntArray86[local24] & 0xFFFFC07F);
			}
			if (local30 == 37) {
				this.anIntArray86[local24] = (this.anIntArray86[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 7) {
				this.anIntArray90[local24] = (local36 << 7) + (this.anIntArray90[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray90[local24] = (this.anIntArray90[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 10) {
				this.anIntArray88[local24] = (this.anIntArray88[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 42) {
				this.anIntArray88[local24] = (this.anIntArray88[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray93[local24] = (local36 << 7) + (this.anIntArray93[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray93[local24] = local36 + (this.anIntArray93[local24] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray87[local24] |= 0x1;
				} else {
					this.anIntArray87[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray87[local24] |= 0x2;
				} else {
					this.method1037(local24);
					this.anIntArray87[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray95[local24] = (local36 << 7) + (this.anIntArray95[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray95[local24] = (this.anIntArray95[local24] & 0x3F80) + local36;
			}
			if (local30 == 101) {
				this.anIntArray95[local24] = (local36 << 7) + (this.anIntArray95[local24] & 0x7F) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray95[local24] = (this.anIntArray95[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method1024(local24);
			}
			if (local30 == 121) {
				this.method1003(local24);
			}
			if (local30 == 123) {
				this.method1038(local24);
			}
			@Pc(507) int local507;
			if (local30 == 6) {
				local507 = this.anIntArray95[local24];
				if (local507 == 16384) {
					this.anIntArray97[local24] = (this.anIntArray97[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local507 = this.anIntArray95[local24];
				if (local507 == 16384) {
					this.anIntArray97[local24] = (this.anIntArray97[local24] & 0xFFFFFF80) + local36;
				}
			}
			if (local30 == 16) {
				this.anIntArray82[local24] = (local36 << 7) + (this.anIntArray82[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray82[local24] = (this.anIntArray82[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method1002(local24);
					this.anIntArray87[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray87[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method1035((this.anIntArray92[local24] & 0xFFFFC07F) + (local36 << 7), local24);
			}
			if (local30 == 49) {
				this.method1035((this.anIntArray92[local24] & 0xFFFFFF80) + local36, local24);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method1004(local24, this.anIntArray83[local24] + local30);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method1033(local24, local30);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1008(local24, local30);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method1017(true);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(III)V")
	private void method1032() {
		this.anIntArray84[9] = 128;
		this.anIntArray83[9] = 128;
		this.method1004(9, 128);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(III)V")
	private void method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!gt;)I")
	private int method1034(@OriginalArg(1) Class2_Sub25 arg0) {
		if (this.anIntArray98[arg0.anInt3052] == 0) {
			return 0;
		}
		@Pc(17) Class81 local17 = arg0.aClass81_1;
		@Pc(33) int local33 = this.anIntArray93[arg0.anInt3052] * this.anIntArray90[arg0.anInt3052] + 4096 >> 13;
		@Pc(41) int local41 = local33 * local33 + 16384 >> 15;
		@Pc(50) int local50 = arg0.anInt3053 * local41 + 16384 >> 15;
		@Pc(59) int local59 = this.anInt990 * local50 + 128 >> 8;
		local33 = local59 * this.anIntArray98[arg0.anInt3052] + 128 >> 8;
		if (local17.anInt2447 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) local17.anInt2447 * 1.953125E-5D * (double) arg0.anInt3066) * (double) local33 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local17.aByteArray62 != null) {
			local106 = arg0.anInt3059;
			local114 = local17.aByteArray62[arg0.anInt3055 + 1];
			if (local17.aByteArray62.length - 2 > arg0.anInt3055) {
				local136 = (local17.aByteArray62[arg0.anInt3055] & 0xFF) << 8;
				local148 = (local17.aByteArray62[arg0.anInt3055 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (local17.aByteArray62[arg0.anInt3055 + 3] + -local114) / (local148 - local136);
			}
			local33 = local114 * local33 + 32 >> 6;
		}
		if (arg0.anInt3054 > 0 && local17.aByteArray61 != null) {
			local106 = arg0.anInt3054;
			local114 = local17.aByteArray61[arg0.anInt3056 + 1];
			if (local17.aByteArray61.length - 2 > arg0.anInt3056) {
				local136 = (local17.aByteArray61[arg0.anInt3056] & 0xFF) << 8;
				local148 = (local17.aByteArray61[arg0.anInt3056 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local17.aByteArray61[arg0.anInt3056 + 3]) / (local148 - local136);
			}
			local33 = local33 * local114 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)V")
	private void method1035(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray92[arg1] = arg0;
		this.anIntArray94[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(ILclient!gt;)I")
	private int method1036(@OriginalArg(1) Class2_Sub25 arg0) {
		@Pc(17) int local17 = this.anIntArray88[arg0.anInt3052];
		return local17 < 8192 ? local17 * arg0.anInt3070 + 32 >> 6 : 16384 - ((128 - arg0.anInt3070) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(BI)V")
	private void method1037(@OriginalArg(1) int arg0) {
		if ((this.anIntArray87[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(25) Class2_Sub25 local25 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6527(); local25 != null; local25 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6525()) {
			if (local25.anInt3052 == arg0 && this.aClass2_Sub25ArrayArray2[arg0][local25.anInt3062] == null && local25.anInt3054 < 0) {
				local25.anInt3054 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZI)V")
	private void method1038(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub25 local8 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6527(); local8 != null; local8 = (Class2_Sub25) this.aClass2_Sub12_Sub4_1.aClass249_66.method6525()) {
			if ((arg0 < 0 || local8.anInt3052 == arg0) && local8.anInt3054 < 0) {
				this.aClass2_Sub25ArrayArray2[local8.anInt3052][local8.anInt3062] = null;
				local8.anInt3054 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()Lclient!ft;")
	@Override
	public synchronized Class2_Sub12 method7195() {
		return this.aClass2_Sub12_Sub4_1;
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)V")
	public synchronized void method1039() {
		for (@Pc(19) Class2_Sub10 local19 = (Class2_Sub10) this.aClass127_10.method3203(); local19 != null; local19 = (Class2_Sub10) this.aClass127_10.method3212()) {
			local19.method7802();
		}
	}
}
