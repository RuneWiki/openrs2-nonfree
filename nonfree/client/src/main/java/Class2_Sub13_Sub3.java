import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class2_Sub13_Sub3 extends Class2_Sub13 {

	@OriginalMember(owner = "client!qc", name = "Ib", descriptor = "I")
	private int anInt7222;

	@OriginalMember(owner = "client!qc", name = "Jb", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!qc", name = "Kb", descriptor = "I")
	private int anInt7223;

	@OriginalMember(owner = "client!qc", name = "Lb", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!qc", name = "Mb", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!qc", name = "Ob", descriptor = "Z")
	private boolean aBoolean542;

	@OriginalMember(owner = "client!qc", name = "Pb", descriptor = "I")
	private int anInt7224;

	@OriginalMember(owner = "client!qc", name = "Qb", descriptor = "Lclient!rp;")
	private Class2_Sub42 aClass2_Sub42_2;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "[I")
	private final int[] anIntArray515 = new int[16];

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "I")
	private final int anInt7185 = 1000000;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "[I")
	public final int[] anIntArray513 = new int[16];

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "[I")
	private final int[] anIntArray519 = new int[16];

	@OriginalMember(owner = "client!qc", name = "Q", descriptor = "[I")
	private final int[] anIntArray518 = new int[16];

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "[I")
	private final int[] anIntArray522 = new int[16];

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "[I")
	private final int[] anIntArray521 = new int[16];

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "[I")
	private final int[] anIntArray517 = new int[16];

	@OriginalMember(owner = "client!qc", name = "hb", descriptor = "[I")
	private final int[] anIntArray524 = new int[16];

	@OriginalMember(owner = "client!qc", name = "gb", descriptor = "[I")
	private final int[] anIntArray523 = new int[16];

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "I")
	private int anInt7207 = 256;

	@OriginalMember(owner = "client!qc", name = "ab", descriptor = "[[Lclient!ve;")
	private final Class2_Sub51[][] aClass2_Sub51ArrayArray1 = new Class2_Sub51[16][128];

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "[I")
	private final int[] anIntArray512 = new int[16];

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "[I")
	private final int[] anIntArray514 = new int[16];

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "[I")
	public final int[] anIntArray516 = new int[16];

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "[I")
	private final int[] anIntArray520 = new int[16];

	@OriginalMember(owner = "client!qc", name = "Db", descriptor = "[I")
	private final int[] anIntArray527 = new int[16];

	@OriginalMember(owner = "client!qc", name = "zb", descriptor = "[[Lclient!ve;")
	private final Class2_Sub51[][] aClass2_Sub51ArrayArray2 = new Class2_Sub51[16][128];

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "[I")
	private final int[] anIntArray526 = new int[16];

	@OriginalMember(owner = "client!qc", name = "Hb", descriptor = "[I")
	public final int[] anIntArray528 = new int[16];

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "Lclient!bn;")
	private final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!qc", name = "Nb", descriptor = "Lclient!fia;")
	private final Class2_Sub13_Sub1 aClass2_Sub13_Sub1_1 = new Class2_Sub13_Sub1(this);

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "Lclient!gca;")
	private final Class118 aClass118_42;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	public Class2_Sub13_Sub3() {
		this.aClass118_42 = new Class118(128);
		this.method6133(256, -1);
		this.method6119(true);
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!qc;)V")
	public Class2_Sub13_Sub3(@OriginalArg(0) Class2_Sub13_Sub3 arg0) {
		this.aClass118_42 = arg0.aClass118_42;
		this.method6133(256, -1);
		this.method6119(true);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)Z")
	public synchronized boolean method6116() {
		return this.aClass37_1.method759();
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
	public synchronized void method6117() {
		for (@Pc(15) Class2_Sub47 local15 = (Class2_Sub47) this.aClass118_42.method2596(); local15 != null; local15 = (Class2_Sub47) this.aClass118_42.method2597()) {
			local15.method7805();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ve;)I")
	private int method6118(@OriginalArg(1) Class2_Sub51 arg0) {
		@Pc(14) int local14 = (arg0.anInt9670 * arg0.anInt9682 >> 12) + arg0.anInt9675;
		local14 += (this.anIntArray520[arg0.anInt9672] - 8192) * this.anIntArray526[arg0.anInt9672] >> 12;
		@Pc(35) Class124 local35 = arg0.aClass124_1;
		@Pc(58) int local58;
		if (local35.anInt3155 > 0 && (local35.anInt3157 > 0 || this.anIntArray519[arg0.anInt9672] > 0)) {
			local58 = local35.anInt3157 << 2;
			@Pc(63) int local63 = local35.anInt3154 << 1;
			if (local63 > arg0.anInt9664) {
				local58 = local58 * arg0.anInt9664 / local63;
			}
			local58 += this.anIntArray519[arg0.anInt9672] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt9676 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local93 * (double) local58);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub1_Sub1_4.anInt15 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static283.anInt7446 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
	@Override
	public synchronized int method8175() {
		return 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZB)V")
	private void method6119(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method6130(-1);
		} else {
			this.method6128(-1);
		}
		this.method6138(-1);
		for (@Pc(27) int local27 = 0; local27 < 16; local27++) {
			this.anIntArray521[local27] = this.anIntArray518[local27];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray524[local45] = this.anIntArray518[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)V")
	private void method6120(@OriginalArg(0) long arg0) {
		while (this.aLong210 <= arg0) {
			@Pc(16) int local16 = this.anInt7223;
			@Pc(19) int local19 = this.anInt7222;
			@Pc(22) long local22 = this.aLong210;
			while (local19 == this.anInt7222) {
				while (this.aClass37_1.anIntArray83[local16] == local19) {
					this.aClass37_1.method758(local16);
					@Pc(33) int local33 = this.aClass37_1.method755(local16);
					if (local33 == 1) {
						this.aClass37_1.method768();
						this.aClass37_1.method769(local16);
						if (this.aClass37_1.method765()) {
							if (!this.aBoolean541 || local19 == 0) {
								this.method6119(true);
								this.aClass37_1.method757();
								return;
							}
							this.aClass37_1.method761(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method6155(local33);
					}
					this.aClass37_1.method766(local16);
					this.aClass37_1.method769(local16);
				}
				this.aLong211 = local22;
				local16 = this.aClass37_1.method756();
				local19 = this.aClass37_1.anIntArray83[local16];
				local22 = this.aClass37_1.method754(local19);
			}
			this.anInt7223 = local16;
			this.aLong210 = local22;
			this.anInt7222 = local19;
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)I")
	public int method6121() {
		return this.anInt7207;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)V")
	private void method6122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray520[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)V")
	private void method6123(@OriginalArg(1) int arg0) {
		if ((this.anIntArray516[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(29) Class2_Sub51 local29 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2325(); local29 != null; local29 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2318()) {
			if (arg0 == local29.anInt9672) {
				local29.anInt9669 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(III)V")
	private void method6124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray527[arg0] = arg1;
		this.anIntArray528[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()Lclient!ua;")
	@Override
	public synchronized Class2_Sub13 method8178() {
		return this.aClass2_Sub13_Sub1_1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!ve;Z)V")
	public void method6125(@OriginalArg(1) Class2_Sub51 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub1_Sub1_4.aByteArray1.length;
		@Pc(32) int local32;
		if (arg1 && arg0.aClass2_Sub1_Sub1_4.aBoolean1) {
			@Pc(43) int local43 = local8 + local8 - arg0.aClass2_Sub1_Sub1_4.anInt14;
			local32 = (int) ((long) local43 * (long) this.anIntArray513[arg0.anInt9672] >> 6);
			local8 <<= 0x8;
			if (local8 <= local32) {
				arg0.aClass2_Sub13_Sub2_4.method4455();
				local32 = local8 + local8 - local32 - 1;
			}
		} else {
			local32 = (int) ((long) this.anIntArray513[arg0.anInt9672] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub13_Sub2_4.method4454(local32);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)V")
	public synchronized void method6126(@OriginalArg(1) int arg0) {
		this.anInt7207 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(BLclient!ve;)I")
	private int method6127(@OriginalArg(1) Class2_Sub51 arg0) {
		if (this.anIntArray514[arg0.anInt9672] == 0) {
			return 0;
		}
		@Pc(17) Class124 local17 = arg0.aClass124_1;
		@Pc(41) int local41 = this.anIntArray523[arg0.anInt9672] * this.anIntArray512[arg0.anInt9672] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = local49 * arg0.anInt9679 + 16384 >> 15;
		@Pc(67) int local67 = local58 * this.anInt7207 + 128 >> 8;
		local41 = local67 * this.anIntArray514[arg0.anInt9672] + 128 >> 8;
		if (local17.anInt3156 > 0) {
			local41 = (int) (Math.pow(0.5D, (double) arg0.anInt9671 * 1.953125E-5D * (double) local17.anInt3156) * (double) local41 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(136) int local136;
		@Pc(148) int local148;
		if (local17.aByteArray39 != null) {
			local106 = arg0.anInt9673;
			local114 = local17.aByteArray39[arg0.anInt9666 + 1];
			if (local17.aByteArray39.length - 2 > arg0.anInt9666) {
				local136 = (local17.aByteArray39[arg0.anInt9666] & 0xFF) << 8;
				local148 = (local17.aByteArray39[arg0.anInt9666 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (local17.aByteArray39[arg0.anInt9666 + 3] + -local114) / (local148 - local136);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		if (arg0.anInt9665 > 0 && local17.aByteArray40 != null) {
			local106 = arg0.anInt9665;
			local114 = local17.aByteArray40[arg0.anInt9677 + 1];
			if (local17.aByteArray40.length - 2 > arg0.anInt9677) {
				local136 = (local17.aByteArray40[arg0.anInt9677] & 0xFF) << 8;
				local148 = (local17.aByteArray40[arg0.anInt9677 + 2] & 0xFF) << 8;
				local114 += (local106 - local136) * (-local114 + local17.aByteArray40[arg0.anInt9677 + 3]) / (local148 - local136);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method6128(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub51 local16 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2325(); local16 != null; local16 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2318()) {
			if ((arg0 < 0 || local16.anInt9672 == arg0) && local16.anInt9665 < 0) {
				this.aClass2_Sub51ArrayArray2[local16.anInt9672][local16.anInt9667] = null;
				local16.anInt9665 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V")
	public synchronized void method6129() {
		for (@Pc(11) Class2_Sub47 local11 = (Class2_Sub47) this.aClass118_42.method2596(); local11 != null; local11 = (Class2_Sub47) this.aClass118_42.method2597()) {
			local11.method8653();
		}
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(BI)V")
	private void method6130(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub51 local12 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2325(); local12 != null; local12 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2318()) {
			if (arg0 < 0 || arg0 == local12.anInt9672) {
				if (local12.aClass2_Sub13_Sub2_4 != null) {
					local12.aClass2_Sub13_Sub2_4.method4468(Static283.anInt7446 / 100);
					if (local12.aClass2_Sub13_Sub2_4.method4441()) {
						this.aClass2_Sub13_Sub1_1.aClass2_Sub13_Sub4_1.method7225(local12.aClass2_Sub13_Sub2_4);
					}
					local12.method8091();
				}
				if (local12.anInt9665 < 0) {
					this.aClass2_Sub51ArrayArray2[local12.anInt9672][local12.anInt9667] = null;
				}
				local12.method8653();
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BIII)V")
	private void method6131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method6148(64, arg0, arg2);
		if ((this.anIntArray516[arg2] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub51 local25 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2321(); local25 != null; local25 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2324()) {
				if (local25.anInt9672 == arg2 && local25.anInt9665 < 0) {
					this.aClass2_Sub51ArrayArray2[arg2][local25.anInt9667] = null;
					this.aClass2_Sub51ArrayArray2[arg2][arg0] = local25;
					@Pc(67) int local67 = local25.anInt9675 + (local25.anInt9682 * local25.anInt9670 >> 12);
					local25.anInt9675 += arg0 - local25.anInt9667 << 8;
					local25.anInt9670 = 4096;
					local25.anInt9667 = arg0;
					local25.anInt9682 = local67 - local25.anInt9675;
					return;
				}
			}
		}
		@Pc(113) Class2_Sub47 local113 = (Class2_Sub47) this.aClass118_42.method2595((long) this.anIntArray521[arg2]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class2_Sub1_Sub1 local121 = local113.aClass2_Sub1_Sub1Array1[arg0];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class2_Sub51 local128 = new Class2_Sub51();
		local128.anInt9672 = arg2;
		local128.aClass2_Sub1_Sub1_4 = local121;
		local128.aClass2_Sub47_1 = local113;
		local128.aClass124_1 = local113.aClass124Array1[arg0];
		local128.anInt9681 = local113.aByteArray106[arg0];
		local128.anInt9667 = arg0;
		local128.anInt9679 = local113.anInt9297 * arg1 * arg1 * local113.aByteArray105[arg0] + 1024 >> 11;
		local128.anInt9678 = local113.aByteArray104[arg0] & 0xFF;
		local128.anInt9675 = (arg0 << 8) - (local113.aShortArray137[arg0] & 0x7FFF);
		local128.anInt9671 = 0;
		local128.anInt9673 = 0;
		local128.anInt9677 = 0;
		local128.anInt9665 = -1;
		local128.anInt9666 = 0;
		if (this.anIntArray513[arg2] == 0) {
			local128.aClass2_Sub13_Sub2_4 = Static652.method4446(local121, this.method6118(local128), this.method6127(local128), this.method6146(local128));
		} else {
			local128.aClass2_Sub13_Sub2_4 = Static652.method4446(local121, this.method6118(local128), 0, this.method6146(local128));
			this.method6125(local128, local113.aShortArray137[arg0] < 0);
		}
		if (local113.aShortArray137[arg0] < 0) {
			local128.aClass2_Sub13_Sub2_4.method4453(-1);
		}
		if (local128.anInt9681 >= 0) {
			@Pc(290) Class2_Sub51 local290 = this.aClass2_Sub51ArrayArray1[arg2][local128.anInt9681];
			if (local290 != null && local290.anInt9665 < 0) {
				this.aClass2_Sub51ArrayArray2[arg2][local290.anInt9667] = null;
				local290.anInt9665 = 0;
			}
			this.aClass2_Sub51ArrayArray1[arg2][local128.anInt9681] = local128;
		}
		this.aClass2_Sub13_Sub1_1.aClass109_25.method2323(local128);
		this.aClass2_Sub51ArrayArray2[arg2][arg0] = local128;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!rp;IZJZ)V")
	public synchronized void method6132(@OriginalArg(0) Class2_Sub42 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2) {
		this.method6144(arg1, arg0, true);
		this.method6120(arg2 * (long) this.aClass37_1.anInt978);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(III)V")
	public synchronized void method6133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray514[arg1] = arg0;
		} else {
			for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
				this.anIntArray514[local22] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)V")
	private void method6134(@OriginalArg(0) int arg0) {
		if ((this.anIntArray516[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class2_Sub51 local23 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2325(); local23 != null; local23 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2318()) {
			if (arg0 == local23.anInt9672 && this.aClass2_Sub51ArrayArray2[arg0][local23.anInt9667] == null && local23.anInt9665 < 0) {
				local23.anInt9665 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V")
	public synchronized void method6136() {
		this.method6157(true);
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "(III)V")
	private void method6137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray521[arg1] != arg0) {
			this.anIntArray521[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub51ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8176(@OriginalArg(0) int arg0) {
		if (this.aClass37_1.method759()) {
			@Pc(18) int local18 = this.aClass37_1.anInt978 * this.anInt7185 / Static283.anInt7446;
			do {
				@Pc(28) long local28 = this.aLong211 + (long) arg0 * (long) local18;
				if (this.aLong210 - local28 >= 0L) {
					this.aLong211 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong210 - this.aLong211 - 1L) / (long) local18);
				this.aLong211 += (long) local18 * (long) local57;
				this.aClass2_Sub13_Sub1_1.method8176(local57);
				arg0 -= local57;
				this.method6152();
			} while (this.aClass37_1.method759());
		}
		this.aClass2_Sub13_Sub1_1.method8176(arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()Lclient!ua;")
	@Override
	public synchronized Class2_Sub13 method8174() {
		return null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	private void method6138(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6138(local12);
			}
			return;
		}
		this.anIntArray523[arg0] = 12800;
		this.anIntArray517[arg0] = 8192;
		this.anIntArray512[arg0] = 16383;
		this.anIntArray520[arg0] = 8192;
		this.anIntArray519[arg0] = 0;
		this.anIntArray515[arg0] = 8192;
		this.method6134(arg0);
		this.method6123(arg0);
		this.anIntArray516[arg0] = 0;
		this.anIntArray522[arg0] = 32767;
		this.anIntArray526[arg0] = 256;
		this.anIntArray513[arg0] = 0;
		this.method6124(arg0, 8192);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!wu;IBLclient!rp;Lclient!km;)Z")
	public synchronized boolean method6140(@OriginalArg(0) Class380 arg0, @OriginalArg(3) Class2_Sub42 arg1, @OriginalArg(4) Class195 arg2) {
		arg1.method6895();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub20 local26 = (Class2_Sub20) arg1.aClass118_43.method2596(); local26 != null; local26 = (Class2_Sub20) arg1.aClass118_43.method2597()) {
			@Pc(32) int local32 = (int) local26.aLong280;
			@Pc(40) Class2_Sub47 local40 = (Class2_Sub47) this.aClass118_42.method2595((long) local32);
			if (local40 == null) {
				local40 = Static248.method3413(arg0, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass118_42.method2601(local40, (long) local32);
			}
			if (!local40.method7803(local26.aByteArray44, arg2, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method6896();
		}
		return local9;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!rp;BZ)V")
	private synchronized void method6144(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub42 arg1, @OriginalArg(3) boolean arg2) {
		this.method6157(arg2);
		this.aClass37_1.method767(arg1.aByteArray97);
		this.aBoolean541 = arg0;
		this.aLong211 = 0L;
		@Pc(24) int local24 = this.aClass37_1.method764();
		for (@Pc(30) int local30 = 0; local30 < local24; local30++) {
			this.aClass37_1.method758(local30);
			this.aClass37_1.method766(local30);
			this.aClass37_1.method769(local30);
		}
		this.anInt7223 = this.aClass37_1.method756();
		this.anInt7222 = this.aClass37_1.anIntArray83[this.anInt7223];
		this.aLong210 = this.aClass37_1.method754(this.anInt7222);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass37_1.method759()) {
			@Pc(18) int local18 = this.aClass37_1.anInt978 * this.anInt7185 / Static283.anInt7446;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong211;
				if (this.aLong210 - local27 >= 0L) {
					this.aLong211 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong210 + (long) local18 - this.aLong211 - 1L) / (long) local18);
				this.aLong211 += (long) local18 * (long) local58;
				this.aClass2_Sub13_Sub1_1.method8180(arg0, arg1, local58);
				this.method6152();
				arg1 += local58;
				arg2 -= local58;
			} while (this.aClass37_1.method759());
		}
		this.aClass2_Sub13_Sub1_1.method8180(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!ve;)I")
	private int method6146(@OriginalArg(1) Class2_Sub51 arg0) {
		@Pc(9) int local9 = this.anIntArray517[arg0.anInt9672];
		return local9 < 8192 ? local9 * arg0.anInt9678 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt9678 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[IILclient!ve;)Z")
	public boolean method6147(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub51 arg3) {
		arg3.anInt9668 = Static283.anInt7446 / 100;
		if (arg3.anInt9665 >= 0 && (arg3.aClass2_Sub13_Sub2_4 == null || arg3.aClass2_Sub13_Sub2_4.method4457())) {
			arg3.method8091();
			arg3.method8653();
			if (arg3.anInt9681 > 0 && this.aClass2_Sub51ArrayArray1[arg3.anInt9672][arg3.anInt9681] == arg3) {
				this.aClass2_Sub51ArrayArray1[arg3.anInt9672][arg3.anInt9681] = null;
			}
			return true;
		}
		@Pc(65) int local65 = arg3.anInt9670;
		if (local65 > 0) {
			local65 -= (int) (Math.pow(2.0D, (double) this.anIntArray515[arg3.anInt9672] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local65 < 0) {
				local65 = 0;
			}
			arg3.anInt9670 = local65;
		}
		arg3.aClass2_Sub13_Sub2_4.method4436(this.method6118(arg3));
		@Pc(102) Class124 local102 = arg3.aClass124_1;
		arg3.anInt9676 += local102.anInt3155;
		arg3.anInt9664++;
		@Pc(117) boolean local117 = false;
		@Pc(136) double local136 = (double) ((arg3.anInt9667 - 60 << 8) + (arg3.anInt9670 * arg3.anInt9682 >> 12)) * 5.086263020833333E-6D;
		if (local102.anInt3156 > 0) {
			if (local102.anInt3161 <= 0) {
				arg3.anInt9671 += 128;
			} else {
				arg3.anInt9671 += (int) (Math.pow(2.0D, local136 * (double) local102.anInt3161) * 128.0D + 0.5D);
			}
			if (arg3.anInt9671 * local102.anInt3156 >= 819200) {
				local117 = true;
			}
		}
		if (local102.aByteArray39 != null) {
			if (local102.anInt3162 <= 0) {
				arg3.anInt9673 += 128;
			} else {
				arg3.anInt9673 += (int) (Math.pow(2.0D, (double) local102.anInt3162 * local136) * 128.0D + 0.5D);
			}
			while (local102.aByteArray39.length - 2 > arg3.anInt9666 && (local102.aByteArray39[arg3.anInt9666 + 2] & 0xFF) << 8 < arg3.anInt9673) {
				arg3.anInt9666 += 2;
			}
			if (local102.aByteArray39.length - 2 == arg3.anInt9666 && local102.aByteArray39[arg3.anInt9666 + 1] == 0) {
				local117 = true;
			}
		}
		if (arg3.anInt9665 >= 0 && local102.aByteArray40 != null && (this.anIntArray516[arg3.anInt9672] & 0x1) == 0 && (arg3.anInt9681 < 0 || arg3 != this.aClass2_Sub51ArrayArray1[arg3.anInt9672][arg3.anInt9681])) {
			if (local102.anInt3158 > 0) {
				arg3.anInt9665 += (int) (Math.pow(2.0D, (double) local102.anInt3158 * local136) * 128.0D + 0.5D);
			} else {
				arg3.anInt9665 += 128;
			}
			while (arg3.anInt9677 < local102.aByteArray40.length - 2 && (local102.aByteArray40[arg3.anInt9677 + 2] & 0xFF) << 8 < arg3.anInt9665) {
				arg3.anInt9677 += 2;
			}
			if (arg3.anInt9677 == local102.aByteArray40.length - 2) {
				local117 = true;
			}
		}
		if (!local117) {
			arg3.aClass2_Sub13_Sub2_4.method4463(arg3.anInt9668, this.method6127(arg3), this.method6146(arg3));
			return false;
		}
		arg3.aClass2_Sub13_Sub2_4.method4468(arg3.anInt9668);
		if (arg1 == null) {
			arg3.aClass2_Sub13_Sub2_4.method8176(arg2);
		} else {
			arg3.aClass2_Sub13_Sub2_4.method8180(arg1, arg0, arg2);
		}
		if (arg3.aClass2_Sub13_Sub2_4.method4441()) {
			this.aClass2_Sub13_Sub1_1.aClass2_Sub13_Sub4_1.method7225(arg3.aClass2_Sub13_Sub2_4);
		}
		arg3.method8091();
		if (arg3.anInt9665 >= 0) {
			arg3.method8653();
			if (arg3.anInt9681 > 0 && this.aClass2_Sub51ArrayArray1[arg3.anInt9672][arg3.anInt9681] == arg3) {
				this.aClass2_Sub51ArrayArray1[arg3.anInt9672][arg3.anInt9681] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
	private void method6148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub51 local12 = this.aClass2_Sub51ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub51ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray516[arg2] & 0x2) == 0) {
			local12.anInt9665 = 0;
			return;
		}
		for (@Pc(39) Class2_Sub51 local39 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2325(); local39 != null; local39 = (Class2_Sub51) this.aClass2_Sub13_Sub1_1.aClass109_25.method2318()) {
			if (local12.anInt9672 == local39.anInt9672 && local39.anInt9665 < 0 && local12 != local39) {
				local12.anInt9665 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(ILclient!ve;)Z")
	public boolean method6149(@OriginalArg(1) Class2_Sub51 arg0) {
		if (arg0.aClass2_Sub13_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt9665 >= 0) {
			arg0.method8653();
			if (arg0.anInt9681 > 0 && this.aClass2_Sub51ArrayArray1[arg0.anInt9672][arg0.anInt9681] == arg0) {
				this.aClass2_Sub51ArrayArray1[arg0.anInt9672][arg0.anInt9681] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZLclient!rp;)V")
	public synchronized void method6150(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub42 arg1) {
		this.method6144(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBI)V")
	private void method6151() {
		this.anIntArray518[9] = 128;
		this.anIntArray524[9] = 128;
		this.method6137(128, 9);
	}

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "(I)V")
	private void method6152() {
		@Pc(8) int local8 = this.anInt7223;
		@Pc(11) int local11 = this.anInt7222;
		@Pc(14) long local14 = this.aLong210;
		if (this.aClass2_Sub42_2 != null && this.anInt7224 == local11) {
			this.method6144(this.aBoolean541, this.aClass2_Sub42_2, this.aBoolean542);
			this.method6152();
			return;
		}
		while (local11 == this.anInt7222) {
			while (local11 == this.aClass37_1.anIntArray83[local8]) {
				this.aClass37_1.method758(local8);
				@Pc(47) int local47 = this.aClass37_1.method755(local8);
				if (local47 == 1) {
					this.aClass37_1.method768();
					this.aClass37_1.method769(local8);
					if (this.aClass37_1.method765()) {
						if (this.aClass2_Sub42_2 != null) {
							this.method6150(this.aBoolean541, this.aClass2_Sub42_2);
							this.method6152();
							return;
						}
						if (!this.aBoolean541 || local11 == 0) {
							this.method6119(true);
							this.aClass37_1.method757();
							return;
						}
						this.aClass37_1.method761(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method6155(local47);
				}
				this.aClass37_1.method766(local8);
				this.aClass37_1.method769(local8);
			}
			local8 = this.aClass37_1.method756();
			local11 = this.aClass37_1.anIntArray83[local8];
			local14 = this.aClass37_1.method754(local11);
		}
		this.anInt7223 = local8;
		this.aLong210 = local14;
		this.anInt7222 = local11;
		if (this.aClass2_Sub42_2 != null && local11 > this.anInt7224) {
			this.anInt7223 = -1;
			this.anInt7222 = this.anInt7224;
			this.aLong210 = this.aClass37_1.method754(this.anInt7222);
		}
	}

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(III)V")
	public synchronized void method6153() {
		this.method6151();
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(III)V")
	private void method6154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(II)V")
	private void method6155(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (local13 == 128) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method6148(local34, local28, local22);
		} else if (local13 == 144) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local34 <= 0) {
				this.method6148(64, local28, local22);
			} else {
				this.method6131(local28, local34, local22);
			}
		} else if (local13 == 160) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method6156(local34, local28, local22);
		} else if (local13 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray524[local22] = (local34 << 14) + (this.anIntArray524[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray524[local22] = (this.anIntArray524[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 1) {
				this.anIntArray519[local22] = (this.anIntArray519[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 33) {
				this.anIntArray519[local22] = (this.anIntArray519[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 5) {
				this.anIntArray515[local22] = (local34 << 7) + (this.anIntArray515[local22] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray515[local22] = local34 + (this.anIntArray515[local22] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray523[local22] = (local34 << 7) + (this.anIntArray523[local22] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray523[local22] = local34 + (this.anIntArray523[local22] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray517[local22] = (this.anIntArray517[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 42) {
				this.anIntArray517[local22] = local34 + (this.anIntArray517[local22] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.anIntArray512[local22] = (local34 << 7) + (this.anIntArray512[local22] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray512[local22] = local34 + (this.anIntArray512[local22] & 0xFFFFFF80);
			}
			if (local28 == 64) {
				if (local34 >= 64) {
					this.anIntArray516[local22] |= 0x1;
				} else {
					this.anIntArray516[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local34 >= 64) {
					this.anIntArray516[local22] |= 0x2;
				} else {
					this.method6134(local22);
					this.anIntArray516[local22] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray522[local22] = (local34 << 7) + (this.anIntArray522[local22] & 0x7F);
			}
			if (local28 == 98) {
				this.anIntArray522[local22] = local34 + (this.anIntArray522[local22] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray522[local22] = (local34 << 7) + (this.anIntArray522[local22] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray522[local22] = local34 + (this.anIntArray522[local22] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method6130(local22);
			}
			if (local28 == 121) {
				this.method6138(local22);
			}
			if (local28 == 123) {
				this.method6128(local22);
			}
			@Pc(504) int local504;
			if (local28 == 6) {
				local504 = this.anIntArray522[local22];
				if (local504 == 16384) {
					this.anIntArray526[local22] = (local34 << 7) + (this.anIntArray526[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local504 = this.anIntArray522[local22];
				if (local504 == 16384) {
					this.anIntArray526[local22] = local34 + (this.anIntArray526[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray513[local22] = (local34 << 7) + (this.anIntArray513[local22] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray513[local22] = (this.anIntArray513[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 81) {
				if (local34 >= 64) {
					this.anIntArray516[local22] |= 0x4;
				} else {
					this.method6123(local22);
					this.anIntArray516[local22] &= 0xFFFFFFFB;
				}
			}
			if (local28 == 17) {
				this.method6124(local22, (this.anIntArray527[local22] & 0xFFFFC07F) + (local34 << 7));
			}
			if (local28 == 49) {
				this.method6124(local22, local34 + (this.anIntArray527[local22] & 0xFFFFFF80));
			}
		} else if (local13 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method6137(local28 + this.anIntArray524[local22], local22);
		} else if (local13 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method6154(local28, local22);
		} else if (local13 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F78) >> 8);
			this.method6122(local28, local22);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method6119(true);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIII)V")
	private void method6156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BZ)V")
	private synchronized void method6157(@OriginalArg(1) boolean arg0) {
		this.aClass37_1.method757();
		this.aClass2_Sub42_2 = null;
		this.method6119(arg0);
	}
}
