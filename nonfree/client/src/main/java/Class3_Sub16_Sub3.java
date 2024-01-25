import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class3_Sub16_Sub3 extends Class3_Sub16 {

	@OriginalMember(owner = "client!qk", name = "Jb", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!qk", name = "Kb", descriptor = "Z")
	private boolean aBoolean540;

	@OriginalMember(owner = "client!qk", name = "Mb", descriptor = "J")
	private long aLong210;

	@OriginalMember(owner = "client!qk", name = "Nb", descriptor = "I")
	private int anInt7806;

	@OriginalMember(owner = "client!qk", name = "Ob", descriptor = "I")
	private int anInt7807;

	@OriginalMember(owner = "client!qk", name = "Pb", descriptor = "I")
	private int anInt7808;

	@OriginalMember(owner = "client!qk", name = "Qb", descriptor = "Z")
	private boolean aBoolean541;

	@OriginalMember(owner = "client!qk", name = "Rb", descriptor = "Lclient!gh;")
	private Class3_Sub22 aClass3_Sub22_1;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "[I")
	private final int[] anIntArray450 = new int[16];

	@OriginalMember(owner = "client!qk", name = "u", descriptor = "[I")
	private final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!qk", name = "Q", descriptor = "[I")
	private final int[] anIntArray453 = new int[16];

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "[I")
	private final int[] anIntArray449 = new int[16];

	@OriginalMember(owner = "client!qk", name = "Z", descriptor = "[I")
	private final int[] anIntArray455 = new int[16];

	@OriginalMember(owner = "client!qk", name = "eb", descriptor = "I")
	private int anInt7788 = 256;

	@OriginalMember(owner = "client!qk", name = "P", descriptor = "[I")
	private final int[] anIntArray452 = new int[16];

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "[I")
	public final int[] anIntArray451 = new int[16];

	@OriginalMember(owner = "client!qk", name = "fb", descriptor = "[I")
	private final int[] anIntArray456 = new int[16];

	@OriginalMember(owner = "client!qk", name = "T", descriptor = "[I")
	public final int[] anIntArray454 = new int[16];

	@OriginalMember(owner = "client!qk", name = "ib", descriptor = "[[Lclient!efa;")
	private final Class3_Sub14[][] aClass3_Sub14ArrayArray1 = new Class3_Sub14[16][128];

	@OriginalMember(owner = "client!qk", name = "sb", descriptor = "[I")
	private final int[] anIntArray458 = new int[16];

	@OriginalMember(owner = "client!qk", name = "hb", descriptor = "[I")
	public final int[] anIntArray457 = new int[16];

	@OriginalMember(owner = "client!qk", name = "Ab", descriptor = "[I")
	private final int[] anIntArray461 = new int[16];

	@OriginalMember(owner = "client!qk", name = "Gb", descriptor = "[I")
	private final int[] anIntArray463 = new int[16];

	@OriginalMember(owner = "client!qk", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!qk", name = "tb", descriptor = "[I")
	private final int[] anIntArray459 = new int[16];

	@OriginalMember(owner = "client!qk", name = "zb", descriptor = "[I")
	private final int[] anIntArray460 = new int[16];

	@OriginalMember(owner = "client!qk", name = "nb", descriptor = "I")
	private final int anInt7793 = 1000000;

	@OriginalMember(owner = "client!qk", name = "Ib", descriptor = "[[Lclient!efa;")
	private final Class3_Sub14[][] aClass3_Sub14ArrayArray2 = new Class3_Sub14[16][128];

	@OriginalMember(owner = "client!qk", name = "ob", descriptor = "Lclient!kga;")
	private final Class174 aClass174_1 = new Class174();

	@OriginalMember(owner = "client!qk", name = "Lb", descriptor = "Lclient!lm;")
	private final Class3_Sub16_Sub1 aClass3_Sub16_Sub1_1 = new Class3_Sub16_Sub1(this);

	@OriginalMember(owner = "client!qk", name = "Db", descriptor = "Lclient!sba;")
	private final Class297 aClass297_31;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class3_Sub16_Sub3() {
		this.aClass297_31 = new Class297(128);
		this.method6100(256, -1);
		this.method6120(true);
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!qk;)V")
	public Class3_Sub16_Sub3(@OriginalArg(0) Class3_Sub16_Sub3 arg0) {
		this.aClass297_31 = arg0.aClass297_31;
		this.method6100(256, -1);
		this.method6120(true);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIII)V")
	private void method6099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method6112(arg1, 64, arg0);
		if ((this.anIntArray451[arg0] & 0x2) != 0) {
			for (@Pc(25) Class3_Sub14 local25 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5577(); local25 != null; local25 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5574()) {
				if (arg0 == local25.anInt2787 && local25.anInt2797 < 0) {
					this.aClass3_Sub14ArrayArray2[arg0][local25.anInt2802] = null;
					this.aClass3_Sub14ArrayArray2[arg0][arg1] = local25;
					@Pc(67) int local67 = local25.anInt2792 + (local25.anInt2782 * local25.anInt2788 >> 12);
					local25.anInt2792 += arg1 - local25.anInt2802 << 8;
					local25.anInt2788 = 4096;
					local25.anInt2802 = arg1;
					local25.anInt2782 = local67 - local25.anInt2792;
					return;
				}
			}
		}
		@Pc(113) Class3_Sub19 local113 = (Class3_Sub19) this.aClass297_31.method6531((long) this.anIntArray463[arg0]);
		if (local113 == null) {
			return;
		}
		@Pc(129) Class3_Sub17_Sub1 local129 = local113.aClass3_Sub17_Sub1Array1[arg1];
		if (local129 == null) {
			return;
		}
		@Pc(136) Class3_Sub14 local136 = new Class3_Sub14();
		local136.anInt2787 = arg0;
		local136.aClass3_Sub17_Sub1_1 = local129;
		local136.aClass3_Sub19_1 = local113;
		local136.aClass300_1 = local113.aClass300Array1[arg1];
		local136.anInt2795 = local113.aByteArray83[arg1];
		local136.anInt2802 = arg1;
		local136.anInt2798 = local113.anInt3515 * arg2 * arg2 * local113.aByteArray81[arg1] + 1024 >> 11;
		local136.anInt2800 = local113.aByteArray82[arg1] & 0xFF;
		local136.anInt2792 = (arg1 << 8) - (local113.aShortArray53[arg1] & 0x7FFF);
		local136.anInt2799 = 0;
		local136.anInt2784 = 0;
		local136.anInt2794 = 0;
		local136.anInt2803 = 0;
		local136.anInt2797 = -1;
		if (this.anIntArray454[arg0] == 0) {
			local136.aClass3_Sub16_Sub2_1 = Static603.method6055(local129, this.method6114(local136), this.method6135(local136), this.method6119(local136));
		} else {
			local136.aClass3_Sub16_Sub2_1 = Static603.method6055(local129, this.method6114(local136), 0, this.method6119(local136));
			this.method6123(local113.aShortArray53[arg1] < 0, local136);
		}
		if (local113.aShortArray53[arg1] < 0) {
			local136.aClass3_Sub16_Sub2_1.method6045(-1);
		}
		if (local136.anInt2795 >= 0) {
			@Pc(286) Class3_Sub14 local286 = this.aClass3_Sub14ArrayArray1[arg0][local136.anInt2795];
			if (local286 != null && local286.anInt2797 < 0) {
				this.aClass3_Sub14ArrayArray2[arg0][local286.anInt2802] = null;
				local286.anInt2797 = 0;
			}
			this.aClass3_Sub14ArrayArray1[arg0][local136.anInt2795] = local136;
		}
		this.aClass3_Sub16_Sub1_1.aClass244_47.method5570(local136);
		this.aClass3_Sub14ArrayArray2[arg0][arg1] = local136;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V")
	public synchronized void method6100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
				this.anIntArray459[local5] = arg0;
			}
		} else {
			this.anIntArray459[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
	private void method6101(@OriginalArg(1) int arg0) {
		if ((this.anIntArray451[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class3_Sub14 local18 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5572(); local18 != null; local18 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5576()) {
			if (arg0 == local18.anInt2787 && this.aClass3_Sub14ArrayArray2[arg0][local18.anInt2802] == null && local18.anInt2797 < 0) {
				local18.anInt2797 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)V")
	public synchronized void method6102() {
		this.method6130();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZJ)V")
	private void method6103(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong210) {
			@Pc(19) int local19 = this.anInt7807;
			@Pc(22) int local22 = this.anInt7806;
			@Pc(25) long local25 = this.aLong210;
			while (this.anInt7806 == local22) {
				while (this.aClass174_1.anIntArray251[local19] == local22) {
					this.aClass174_1.method4254(local19);
					@Pc(36) int local36 = this.aClass174_1.method4249(local19);
					if (local36 == 1) {
						this.aClass174_1.method4259();
						this.aClass174_1.method4253(local19);
						if (this.aClass174_1.method4260()) {
							if (!this.aBoolean540 || local22 == 0) {
								this.method6120(true);
								this.aClass174_1.method4264();
								return;
							}
							this.aClass174_1.method4258(local25);
						}
						break;
					}
					if ((local36 & 0x80) != 0 && (local36 & 0xF0) != 144) {
						this.method6126(local36);
					}
					this.aClass174_1.method4262(local19);
					this.aClass174_1.method4253(local19);
				}
				this.aLong209 = local25;
				local19 = this.aClass174_1.method4256();
				local22 = this.aClass174_1.anIntArray251[local19];
				local25 = this.aClass174_1.method4250(local22);
			}
			this.anInt7806 = local22;
			this.anInt7807 = local19;
			this.aLong210 = local25;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBI)V")
	private void method6104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray455[arg1] = arg0;
		this.anIntArray457[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)V")
	public synchronized void method6105(@OriginalArg(1) int arg0) {
		this.anInt7788 = arg0;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Z")
	public synchronized boolean method6106() {
		return this.aClass174_1.method4252();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)V")
	private void method6107(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub14 local8 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5572(); local8 != null; local8 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5576()) {
			if (arg0 < 0 || local8.anInt2787 == arg0) {
				if (local8.aClass3_Sub16_Sub2_1 != null) {
					local8.aClass3_Sub16_Sub2_1.method6049(Static180.anInt3952 / 100);
					if (local8.aClass3_Sub16_Sub2_1.method6064()) {
						this.aClass3_Sub16_Sub1_1.aClass3_Sub16_Sub4_1.method7762(local8.aClass3_Sub16_Sub2_1);
					}
					local8.method2326();
				}
				if (local8.anInt2797 < 0) {
					this.aClass3_Sub14ArrayArray2[local8.anInt2787][local8.anInt2802] = null;
				}
				local8.method8128();
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(JZLclient!gh;ZI)V")
	public synchronized void method6108(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class3_Sub22 arg2) {
		this.method6111(arg2, true, arg1);
		this.method6103(arg0 * (long) this.aClass174_1.anInt5316);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(II[IILclient!efa;)Z")
	public boolean method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class3_Sub14 arg3) {
		arg3.anInt2783 = Static180.anInt3952 / 100;
		if (arg3.anInt2797 >= 0 && (arg3.aClass3_Sub16_Sub2_1 == null || arg3.aClass3_Sub16_Sub2_1.method6036())) {
			arg3.method2326();
			arg3.method8128();
			if (arg3.anInt2795 > 0 && this.aClass3_Sub14ArrayArray1[arg3.anInt2787][arg3.anInt2795] == arg3) {
				this.aClass3_Sub14ArrayArray1[arg3.anInt2787][arg3.anInt2795] = null;
			}
			return true;
		}
		@Pc(53) int local53 = arg3.anInt2788;
		if (local53 > 0) {
			local53 -= (int) (Math.pow(2.0D, (double) this.anIntArray458[arg3.anInt2787] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local53 < 0) {
				local53 = 0;
			}
			arg3.anInt2788 = local53;
		}
		arg3.aClass3_Sub16_Sub2_1.method6034(this.method6114(arg3));
		@Pc(97) Class300 local97 = arg3.aClass300_1;
		@Pc(99) boolean local99 = false;
		arg3.anInt2791 += local97.anInt8367;
		arg3.anInt2790++;
		@Pc(131) double local131 = (double) ((arg3.anInt2802 - 60 << 8) + (arg3.anInt2788 * arg3.anInt2782 >> 12)) * 5.086263020833333E-6D;
		if (local97.anInt8371 > 0) {
			if (local97.anInt8363 <= 0) {
				arg3.anInt2799 += 128;
			} else {
				arg3.anInt2799 += (int) (Math.pow(2.0D, local131 * (double) local97.anInt8363) * 128.0D + 0.5D);
			}
			if (local97.anInt8371 * arg3.anInt2799 >= 819200) {
				local99 = true;
			}
		}
		if (local97.aByteArray205 != null) {
			if (local97.anInt8370 > 0) {
				arg3.anInt2784 += (int) (Math.pow(2.0D, (double) local97.anInt8370 * local131) * 128.0D + 0.5D);
			} else {
				arg3.anInt2784 += 128;
			}
			while (local97.aByteArray205.length - 2 > arg3.anInt2803 && (local97.aByteArray205[arg3.anInt2803 + 2] & 0xFF) << 8 < arg3.anInt2784) {
				arg3.anInt2803 += 2;
			}
			if (arg3.anInt2803 == local97.aByteArray205.length - 2 && local97.aByteArray205[arg3.anInt2803 + 1] == 0) {
				local99 = true;
			}
		}
		if (arg3.anInt2797 >= 0 && local97.aByteArray206 != null && (this.anIntArray451[arg3.anInt2787] & 0x1) == 0 && (arg3.anInt2795 < 0 || this.aClass3_Sub14ArrayArray1[arg3.anInt2787][arg3.anInt2795] != arg3)) {
			if (local97.anInt8368 > 0) {
				arg3.anInt2797 += (int) (Math.pow(2.0D, local131 * (double) local97.anInt8368) * 128.0D + 0.5D);
			} else {
				arg3.anInt2797 += 128;
			}
			while (local97.aByteArray206.length - 2 > arg3.anInt2794 && arg3.anInt2797 > (local97.aByteArray206[arg3.anInt2794 + 2] & 0xFF) << 8) {
				arg3.anInt2794 += 2;
			}
			if (arg3.anInt2794 == local97.aByteArray206.length - 2) {
				local99 = true;
			}
		}
		if (!local99) {
			arg3.aClass3_Sub16_Sub2_1.method6030(arg3.anInt2783, this.method6135(arg3), this.method6119(arg3));
			return false;
		}
		arg3.aClass3_Sub16_Sub2_1.method6049(arg3.anInt2783);
		if (arg2 == null) {
			arg3.aClass3_Sub16_Sub2_1.method7751(arg0);
		} else {
			arg3.aClass3_Sub16_Sub2_1.method7754(arg2, arg1, arg0);
		}
		if (arg3.aClass3_Sub16_Sub2_1.method6064()) {
			this.aClass3_Sub16_Sub1_1.aClass3_Sub16_Sub4_1.method7762(arg3.aClass3_Sub16_Sub2_1);
		}
		arg3.method2326();
		if (arg3.anInt2797 >= 0) {
			arg3.method8128();
			if (arg3.anInt2795 > 0 && arg3 == this.aClass3_Sub14ArrayArray1[arg3.anInt2787][arg3.anInt2795]) {
				this.aClass3_Sub14ArrayArray1[arg3.anInt2787][arg3.anInt2795] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(III)V")
	private void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != this.anIntArray463[arg0]) {
			this.anIntArray463[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass3_Sub14ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7749() {
		return 0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!gh;ZZI)V")
	private synchronized void method6111(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method6128(arg1);
		this.aClass174_1.method4261(arg0.aByteArray92);
		this.aLong209 = 0L;
		this.aBoolean540 = arg2;
		@Pc(28) int local28 = this.aClass174_1.method4255();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass174_1.method4254(local30);
			this.aClass174_1.method4262(local30);
			this.aClass174_1.method4253(local30);
		}
		this.anInt7807 = this.aClass174_1.method4256();
		this.anInt7806 = this.aClass174_1.anIntArray251[this.anInt7807];
		this.aLong210 = this.aClass174_1.method4250(this.anInt7806);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IIII)V")
	private void method6112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub14 local12 = this.aClass3_Sub14ArrayArray2[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass3_Sub14ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray451[arg2] & 0x2) == 0) {
			local12.anInt2797 = 0;
			return;
		}
		for (@Pc(40) Class3_Sub14 local40 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5572(); local40 != null; local40 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5576()) {
			if (local12.anInt2787 == local40.anInt2787 && local40.anInt2797 < 0 && local12 != local40) {
				local12.anInt2797 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	private void method6113(@OriginalArg(1) int arg0) {
		if ((this.anIntArray451[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(19) Class3_Sub14 local19 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5572(); local19 != null; local19 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5576()) {
			if (arg0 == local19.anInt2787) {
				local19.anInt2789 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "()Lclient!eq;")
	@Override
	public synchronized Class3_Sub16 method7752() {
		return this.aClass3_Sub16_Sub1_1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "()Lclient!eq;")
	@Override
	public synchronized Class3_Sub16 method7748() {
		return null;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!efa;I)I")
	private int method6114(@OriginalArg(0) Class3_Sub14 arg0) {
		@Pc(14) int local14 = (arg0.anInt2788 * arg0.anInt2782 >> 12) + arg0.anInt2792;
		local14 += this.anIntArray452[arg0.anInt2787] * (this.anIntArray449[arg0.anInt2787] - 8192) >> 12;
		@Pc(35) Class300 local35 = arg0.aClass300_1;
		@Pc(61) int local61;
		if (local35.anInt8367 > 0 && (local35.anInt8369 > 0 || this.anIntArray456[arg0.anInt2787] > 0)) {
			local61 = local35.anInt8369 << 2;
			@Pc(66) int local66 = local35.anInt8366 << 1;
			if (arg0.anInt2790 < local66) {
				local61 = local61 * arg0.anInt2790 / local66;
			}
			local61 += this.anIntArray456[arg0.anInt2787] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt2791 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass3_Sub17_Sub1_1.anInt7874 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static180.anInt3952 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!gh;BZ)V")
	public synchronized void method6115(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(2) boolean arg1) {
		this.method6111(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!efa;)Z")
	public boolean method6116(@OriginalArg(1) Class3_Sub14 arg0) {
		if (arg0.aClass3_Sub16_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt2797 >= 0) {
			arg0.method8128();
			if (arg0.anInt2795 > 0 && this.aClass3_Sub14ArrayArray1[arg0.anInt2787][arg0.anInt2795] == arg0) {
				this.aClass3_Sub14ArrayArray1[arg0.anInt2787][arg0.anInt2795] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
	private void method6118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray449[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!efa;Z)I")
	private int method6119(@OriginalArg(0) Class3_Sub14 arg0) {
		@Pc(14) int local14 = this.anIntArray450[arg0.anInt2787];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt2800 + 128) + 32 >> 6) : local14 * arg0.anInt2800 - -32 >> 6;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)V")
	private void method6120(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method6107(-1);
		} else {
			this.method6122(-1);
		}
		this.method6132(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray463[local23] = this.anIntArray461[local23];
		}
		for (@Pc(45) int local45 = 0; local45 < 16; local45++) {
			this.anIntArray448[local45] = this.anIntArray461[local45] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)I")
	public int method6121() {
		return this.anInt7788;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IB)V")
	private void method6122(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class3_Sub14 local8 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5572(); local8 != null; local8 = (Class3_Sub14) this.aClass3_Sub16_Sub1_1.aClass244_47.method5576()) {
			if ((arg0 < 0 || arg0 == local8.anInt2787) && local8.anInt2797 < 0) {
				this.aClass3_Sub14ArrayArray2[local8.anInt2787][local8.anInt2802] = null;
				local8.anInt2797 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZBLclient!efa;)V")
	public void method6123(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub14 arg1) {
		@Pc(8) int local8 = arg1.aClass3_Sub17_Sub1_1.aByteArray195.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass3_Sub17_Sub1_1.aBoolean547) {
			@Pc(37) int local37 = local8 + local8 - arg1.aClass3_Sub17_Sub1_1.anInt7875;
			local27 = (int) ((long) this.anIntArray454[arg1.anInt2787] * (long) local37 >> 6);
			local8 <<= 0x8;
			if (local27 >= local8) {
				local27 = local8 + local8 - local27 - 1;
				arg1.aClass3_Sub16_Sub2_1.method6061();
			}
		} else {
			local27 = (int) ((long) this.anIntArray454[arg1.anInt2787] * (long) local8 >> 6);
		}
		arg1.aClass3_Sub16_Sub2_1.method6048(local27);
	}

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
	public synchronized void method6124() {
		for (@Pc(19) Class3_Sub19 local19 = (Class3_Sub19) this.aClass297_31.method6529(); local19 != null; local19 = (Class3_Sub19) this.aClass297_31.method6532()) {
			local19.method8128();
		}
	}

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "(I)V")
	public synchronized void method6125() {
		this.method6128(true);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(IB)V")
	private void method6126(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6112(local22, local28, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method6112(local22, 64, local16);
			} else {
				this.method6099(local16, local22, local28);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method6131(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray448[local16] = (this.anIntArray448[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray448[local16] = (local28 << 7) + (this.anIntArray448[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray456[local16] = (this.anIntArray456[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray456[local16] = (this.anIntArray456[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray458[local16] = (local28 << 7) + (this.anIntArray458[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray458[local16] = (this.anIntArray458[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.lb[local16] = (local28 << 7) + (this.lb[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.lb[local16] = local28 + (this.lb[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray450[local16] = (local28 << 7) + (this.anIntArray450[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray450[local16] = (this.anIntArray450[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray460[local16] = (local28 << 7) + (this.anIntArray460[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray460[local16] = (this.anIntArray460[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray451[local16] |= 0x1;
				} else {
					this.anIntArray451[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method6101(local16);
					this.anIntArray451[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray451[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray453[local16] = (local28 << 7) + (this.anIntArray453[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray453[local16] = (this.anIntArray453[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray453[local16] = (this.anIntArray453[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray453[local16] = (this.anIntArray453[local16] & 0x3F80) + (local28 + 16384);
			}
			if (local22 == 120) {
				this.method6107(local16);
			}
			if (local22 == 121) {
				this.method6132(local16);
			}
			if (local22 == 123) {
				this.method6122(local16);
			}
			@Pc(497) int local497;
			if (local22 == 6) {
				local497 = this.anIntArray453[local16];
				if (local497 == 16384) {
					this.anIntArray452[local16] = (this.anIntArray452[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local497 = this.anIntArray453[local16];
				if (local497 == 16384) {
					this.anIntArray452[local16] = local28 + (this.anIntArray452[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray454[local16] = (this.anIntArray454[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray454[local16] = local28 + (this.anIntArray454[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method6113(local16);
					this.anIntArray451[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray451[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method6104((local28 << 7) + (this.anIntArray455[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method6104((this.anIntArray455[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6110(local16, local22 + this.anIntArray448[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method6129(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method6118(local16, local22);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method6120(true);
			}
		}
	}

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "(I)V")
	private void method6127() {
		@Pc(8) int local8 = this.anInt7807;
		@Pc(11) int local11 = this.anInt7806;
		@Pc(14) long local14 = this.aLong210;
		if (this.aClass3_Sub22_1 != null && local11 == this.anInt7808) {
			this.method6111(this.aClass3_Sub22_1, this.aBoolean541, this.aBoolean540);
			this.method6127();
			return;
		}
		while (local11 == this.anInt7806) {
			while (local11 == this.aClass174_1.anIntArray251[local8]) {
				this.aClass174_1.method4254(local8);
				@Pc(47) int local47 = this.aClass174_1.method4249(local8);
				if (local47 == 1) {
					this.aClass174_1.method4259();
					this.aClass174_1.method4253(local8);
					if (this.aClass174_1.method4260()) {
						if (this.aClass3_Sub22_1 != null) {
							this.method6115(this.aClass3_Sub22_1, this.aBoolean540);
							this.method6127();
							return;
						}
						if (!this.aBoolean540 || local11 == 0) {
							this.method6120(true);
							this.aClass174_1.method4264();
							return;
						}
						this.aClass174_1.method4258(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method6126(local47);
				}
				this.aClass174_1.method4262(local8);
				this.aClass174_1.method4253(local8);
			}
			local8 = this.aClass174_1.method4256();
			local11 = this.aClass174_1.anIntArray251[local8];
			local14 = this.aClass174_1.method4250(local11);
		}
		this.aLong210 = local14;
		this.anInt7807 = local8;
		this.anInt7806 = local11;
		if (this.aClass3_Sub22_1 != null && local11 > this.anInt7808) {
			this.anInt7806 = this.anInt7808;
			this.anInt7807 = -1;
			this.aLong210 = this.aClass174_1.method4250(this.anInt7806);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7751(@OriginalArg(0) int arg0) {
		if (this.aClass174_1.method4252()) {
			@Pc(18) int local18 = this.aClass174_1.anInt5316 * this.anInt7793 / Static180.anInt3952;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong209;
				if (this.aLong210 - local27 >= 0L) {
					this.aLong209 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong210 - this.aLong209 - 1L) / (long) local18);
				this.aLong209 += (long) local56 * (long) local18;
				arg0 -= local56;
				this.aClass3_Sub16_Sub1_1.method7751(local56);
				this.method6127();
			} while (this.aClass174_1.method4252());
		}
		this.aClass3_Sub16_Sub1_1.method7751(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IZ)V")
	private synchronized void method6128(@OriginalArg(1) boolean arg0) {
		this.aClass174_1.method4264();
		this.aClass3_Sub22_1 = null;
		this.method6120(arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZII)V")
	private void method6129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBI)V")
	private void method6130() {
		this.anIntArray461[9] = 128;
		this.anIntArray448[9] = 128;
		this.method6110(9, 128);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IBII)V")
	private void method6131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7754(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass174_1.method4252()) {
			@Pc(18) int local18 = this.aClass174_1.anInt5316 * this.anInt7793 / Static180.anInt3952;
			do {
				@Pc(28) long local28 = this.aLong209 + (long) arg2 * (long) local18;
				if (this.aLong210 - local28 >= 0L) {
					this.aLong209 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong210 + (long) local18 - this.aLong209 - 1L) / (long) local18);
				this.aLong209 += (long) local18 * (long) local58;
				this.aClass3_Sub16_Sub1_1.method7754(arg0, arg1, local58);
				arg2 -= local58;
				this.method6127();
				arg1 += local58;
			} while (this.aClass174_1.method4252());
		}
		this.aClass3_Sub16_Sub1_1.method7754(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "(IB)V")
	private void method6132(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method6132(local12);
			}
			return;
		}
		this.lb[arg0] = 12800;
		this.anIntArray450[arg0] = 8192;
		this.anIntArray460[arg0] = 16383;
		this.anIntArray449[arg0] = 8192;
		this.anIntArray456[arg0] = 0;
		this.anIntArray458[arg0] = 8192;
		this.method6101(arg0);
		this.method6113(arg0);
		this.anIntArray451[arg0] = 0;
		this.anIntArray453[arg0] = 32767;
		this.anIntArray452[arg0] = 256;
		this.anIntArray454[arg0] = 0;
		this.method6104(8192, arg0);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!gh;Lclient!ri;IILclient!ao;)Z")
	public synchronized boolean method6133(@OriginalArg(0) Class3_Sub22 arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(4) Class20 arg2) {
		arg0.method3074();
		@Pc(15) boolean local15 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class3_Sub15 local35 = (Class3_Sub15) arg0.aClass297_13.method6529(); local35 != null; local35 = (Class3_Sub15) arg0.aClass297_13.method6532()) {
			@Pc(41) int local41 = (int) local35.aLong262;
			@Pc(49) Class3_Sub19 local49 = (Class3_Sub19) this.aClass297_31.method6531((long) local41);
			if (local49 == null) {
				local49 = Static224.method3703(local41, arg1);
				if (local49 == null) {
					local15 = false;
					continue;
				}
				this.aClass297_31.method6537((long) local41, local49);
			}
			if (!local49.method2851(arg2, local29, local35.aByteArray69)) {
				local15 = false;
			}
		}
		if (local15) {
			arg0.method3072();
		}
		return local15;
	}

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "(I)V")
	public synchronized void method6134() {
		for (@Pc(11) Class3_Sub19 local11 = (Class3_Sub19) this.aClass297_31.method6529(); local11 != null; local11 = (Class3_Sub19) this.aClass297_31.method6532()) {
			local11.method2853();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(Lclient!efa;I)I")
	private int method6135(@OriginalArg(0) Class3_Sub14 arg0) {
		if (this.anIntArray459[arg0.anInt2787] == 0) {
			return 0;
		}
		@Pc(21) Class300 local21 = arg0.aClass300_1;
		@Pc(37) int local37 = this.lb[arg0.anInt2787] * this.anIntArray460[arg0.anInt2787] + 4096 >> 13;
		@Pc(45) int local45 = local37 * local37 + 16384 >> 15;
		@Pc(54) int local54 = arg0.anInt2798 * local45 + 16384 >> 15;
		@Pc(63) int local63 = local54 * this.anInt7788 + 128 >> 8;
		local37 = local63 * this.anIntArray459[arg0.anInt2787] + 128 >> 8;
		if (local21.anInt8371 > 0) {
			local37 = (int) (Math.pow(0.5D, (double) arg0.anInt2799 * 1.953125E-5D * (double) local21.anInt8371) * (double) local37 + 0.5D);
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		@Pc(128) int local128;
		@Pc(140) int local140;
		if (local21.aByteArray205 != null) {
			local102 = arg0.anInt2784;
			local110 = local21.aByteArray205[arg0.anInt2803 + 1];
			if (arg0.anInt2803 < local21.aByteArray205.length - 2) {
				local128 = (local21.aByteArray205[arg0.anInt2803] & 0xFF) << 8;
				local140 = (local21.aByteArray205[arg0.anInt2803 + 2] & 0xFF) << 8;
				local110 += (local102 - local128) * (local21.aByteArray205[arg0.anInt2803 + 3] - local110) / (local140 - local128);
			}
			local37 = local37 * local110 + 32 >> 6;
		}
		if (arg0.anInt2797 > 0 && local21.aByteArray206 != null) {
			local102 = arg0.anInt2797;
			local110 = local21.aByteArray206[arg0.anInt2794 + 1];
			if (arg0.anInt2794 < local21.aByteArray206.length - 2) {
				local128 = (local21.aByteArray206[arg0.anInt2794] & 0xFF) << 8;
				local140 = (local21.aByteArray206[arg0.anInt2794 + 2] & 0xFF) << 8;
				local110 += (local21.aByteArray206[arg0.anInt2794 + 3] - local110) * (local102 + -local128) / (local140 - local128);
			}
			local37 = local110 * local37 + 32 >> 6;
		}
		return local37;
	}
}
