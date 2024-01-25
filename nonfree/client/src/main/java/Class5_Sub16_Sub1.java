import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class5_Sub16_Sub1 extends Class5_Sub16 {

	@OriginalMember(owner = "client!ft", name = "xb", descriptor = "I")
	private int anInt3051;

	@OriginalMember(owner = "client!ft", name = "yb", descriptor = "Z")
	private boolean aBoolean262;

	@OriginalMember(owner = "client!ft", name = "Ab", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!ft", name = "Bb", descriptor = "I")
	private int anInt3052;

	@OriginalMember(owner = "client!ft", name = "Db", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!ft", name = "Eb", descriptor = "Lclient!ue;")
	private Class5_Sub45 aClass5_Sub45_1;

	@OriginalMember(owner = "client!ft", name = "Fb", descriptor = "I")
	private int anInt3054;

	@OriginalMember(owner = "client!ft", name = "Gb", descriptor = "Z")
	private boolean aBoolean263;

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "[I")
	private final int[] anIntArray257 = new int[16];

	@OriginalMember(owner = "client!ft", name = "C", descriptor = "[[Lclient!lv;")
	private final Class5_Sub30[][] aClass5_Sub30ArrayArray1 = new Class5_Sub30[16][128];

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "[[Lclient!lv;")
	private final Class5_Sub30[][] aClass5_Sub30ArrayArray2 = new Class5_Sub30[16][128];

	@OriginalMember(owner = "client!ft", name = "X", descriptor = "[I")
	private final int[] anIntArray264 = new int[16];

	@OriginalMember(owner = "client!ft", name = "V", descriptor = "[I")
	public final int[] anIntArray263 = new int[16];

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "[I")
	private final int[] anIntArray258 = new int[16];

	@OriginalMember(owner = "client!ft", name = "n", descriptor = "[I")
	private final int[] anIntArray256 = new int[16];

	@OriginalMember(owner = "client!ft", name = "F", descriptor = "I")
	private int anInt3024 = 256;

	@OriginalMember(owner = "client!ft", name = "fb", descriptor = "[I")
	private final int[] anIntArray265 = new int[16];

	@OriginalMember(owner = "client!ft", name = "gb", descriptor = "[I")
	private final int[] anIntArray266 = new int[16];

	@OriginalMember(owner = "client!ft", name = "M", descriptor = "[I")
	private final int[] anIntArray262 = new int[16];

	@OriginalMember(owner = "client!ft", name = "G", descriptor = "[I")
	private final int[] anIntArray259 = new int[16];

	@OriginalMember(owner = "client!ft", name = "U", descriptor = "I")
	private final int anInt3033 = 1000000;

	@OriginalMember(owner = "client!ft", name = "hb", descriptor = "[I")
	private final int[] anIntArray267 = new int[16];

	@OriginalMember(owner = "client!ft", name = "ib", descriptor = "[I")
	public final int[] anIntArray268 = new int[16];

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "[I")
	public final int[] anIntArray261 = new int[16];

	@OriginalMember(owner = "client!ft", name = "rb", descriptor = "[I")
	private final int[] anIntArray269 = new int[16];

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "[I")
	private final int[] anIntArray260 = new int[16];

	@OriginalMember(owner = "client!ft", name = "vb", descriptor = "[I")
	private final int[] anIntArray270 = new int[16];

	@OriginalMember(owner = "client!ft", name = "wb", descriptor = "[I")
	private final int[] anIntArray271 = new int[16];

	@OriginalMember(owner = "client!ft", name = "B", descriptor = "Lclient!iea;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!ft", name = "zb", descriptor = "Lclient!qba;")
	private final Class5_Sub16_Sub4 aClass5_Sub16_Sub4_1 = new Class5_Sub16_Sub4(this);

	@OriginalMember(owner = "client!ft", name = "pb", descriptor = "Lclient!du;")
	private final Class81 aClass81_25;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class5_Sub16_Sub1() {
		this.aClass81_25 = new Class81(128);
		this.method2576(-1, 256);
		this.method2590(true);
	}

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class5_Sub16_Sub1(@OriginalArg(0) Class5_Sub16_Sub1 arg0) {
		this.aClass81_25 = arg0.aClass81_25;
		this.method2576(-1, 256);
		this.method2590(true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass154_1.method3595()) {
			@Pc(14) int local14 = this.aClass154_1.anInt3968 * this.anInt3033 / Static92.anInt9993;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong90;
				if (this.aLong91 - local23 >= 0L) {
					this.aLong90 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong91 - this.aLong90 - 1L) / (long) local14);
				this.aLong90 += (long) local53 * (long) local14;
				this.aClass5_Sub16_Sub4_1.method8282(arg0, arg1, local53);
				arg1 += local53;
				arg2 -= local53;
				this.method2571();
			} while (this.aClass154_1.method3595());
		}
		this.aClass5_Sub16_Sub4_1.method8282(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)V")
	private void method2561(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class5_Sub30 local8 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7313(); local8 != null; local8 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7301()) {
			if (arg0 < 0 || arg0 == local8.anInt5826) {
				if (local8.aClass5_Sub16_Sub2_2 != null) {
					local8.aClass5_Sub16_Sub2_2.method3369(Static92.anInt9993 / 100);
					if (local8.aClass5_Sub16_Sub2_2.method3353()) {
						this.aClass5_Sub16_Sub4_1.aClass5_Sub16_Sub3_2.method6140(local8.aClass5_Sub16_Sub2_2);
					}
					local8.method5177();
				}
				if (local8.anInt5818 < 0) {
					this.aClass5_Sub30ArrayArray1[local8.anInt5826][local8.anInt5821] = null;
				}
				local8.method8911();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!lv;[IIII)Z")
	public boolean method2562(@OriginalArg(0) Class5_Sub30 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		arg0.anInt5825 = Static92.anInt9993 / 100;
		if (arg0.anInt5818 >= 0 && (arg0.aClass5_Sub16_Sub2_2 == null || arg0.aClass5_Sub16_Sub2_2.method3356())) {
			arg0.method5177();
			arg0.method8911();
			if (arg0.anInt5831 > 0 && arg0 == this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831]) {
				this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg0.anInt5830;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray269[arg0.anInt5826] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg0.anInt5830 = local59;
		}
		arg0.aClass5_Sub16_Sub2_2.method3343(this.method2594(arg0));
		@Pc(103) Class347 local103 = arg0.aClass347_1;
		@Pc(105) boolean local105 = false;
		arg0.anInt5832++;
		arg0.anInt5829 += local103.anInt9528;
		@Pc(137) double local137 = (double) ((arg0.anInt5821 - 60 << 8) + (arg0.anInt5830 * arg0.anInt5827 >> 12)) * 5.086263020833333E-6D;
		if (local103.anInt9530 > 0) {
			if (local103.anInt9527 <= 0) {
				arg0.anInt5822 += 128;
			} else {
				arg0.anInt5822 += (int) (Math.pow(2.0D, (double) local103.anInt9527 * local137) * 128.0D + 0.5D);
			}
			if (arg0.anInt5822 * local103.anInt9530 >= 819200) {
				local105 = true;
			}
		}
		if (local103.aByteArray90 != null) {
			if (local103.anInt9534 <= 0) {
				arg0.anInt5828 += 128;
			} else {
				arg0.anInt5828 += (int) (Math.pow(2.0D, local137 * (double) local103.anInt9534) * 128.0D + 0.5D);
			}
			while (local103.aByteArray90.length - 2 > arg0.anInt5823 && arg0.anInt5828 > (local103.aByteArray90[arg0.anInt5823 + 2] & 0xFF) << 8) {
				arg0.anInt5823 += 2;
			}
			if (arg0.anInt5823 == local103.aByteArray90.length - 2 && local103.aByteArray90[arg0.anInt5823 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg0.anInt5818 >= 0 && local103.aByteArray89 != null && (this.anIntArray263[arg0.anInt5826] & 0x1) == 0 && (arg0.anInt5831 < 0 || this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831] != arg0)) {
			if (local103.anInt9533 <= 0) {
				arg0.anInt5818 += 128;
			} else {
				arg0.anInt5818 += (int) (Math.pow(2.0D, local137 * (double) local103.anInt9533) * 128.0D + 0.5D);
			}
			while (arg0.anInt5824 < local103.aByteArray89.length - 2 && arg0.anInt5818 > (local103.aByteArray89[arg0.anInt5824 + 2] & 0xFF) << 8) {
				arg0.anInt5824 += 2;
			}
			if (arg0.anInt5824 == local103.aByteArray89.length - 2) {
				local105 = true;
			}
		}
		if (!local105) {
			arg0.aClass5_Sub16_Sub2_2.method3350(arg0.anInt5825, this.method2573(arg0), this.method2582(arg0));
			return false;
		}
		arg0.aClass5_Sub16_Sub2_2.method3369(arg0.anInt5825);
		if (arg1 == null) {
			arg0.aClass5_Sub16_Sub2_2.method8286(arg3);
		} else {
			arg0.aClass5_Sub16_Sub2_2.method8282(arg1, arg2, arg3);
		}
		if (arg0.aClass5_Sub16_Sub2_2.method3353()) {
			this.aClass5_Sub16_Sub4_1.aClass5_Sub16_Sub3_2.method6140(arg0.aClass5_Sub16_Sub2_2);
		}
		arg0.method5177();
		if (arg0.anInt5818 >= 0) {
			arg0.method8911();
			if (arg0.anInt5831 > 0 && this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831] == arg0) {
				this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)V")
	private void method2563(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(40) int local40;
		if (local9 == 128) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			local40 = arg0 >> 16 & 0x7F;
			this.method2589(local40, local28, local34);
		} else if (local9 == 144) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			local40 = arg0 >> 16 & 0x7F;
			if (local40 <= 0) {
				this.method2589(64, local28, local34);
			} else {
				this.method2583(local28, local34, local40);
			}
		} else if (local9 == 160) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			local40 = arg0 >> 16 & 0x7F;
			this.method2566(local34, local28, local40);
		} else if (local9 == 176) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			local40 = arg0 >> 16 & 0x7F;
			if (local34 == 0) {
				this.anIntArray262[local28] = (local40 << 14) + (this.anIntArray262[local28] & 0xFFE03FFF);
			}
			if (local34 == 32) {
				this.anIntArray262[local28] = (local40 << 7) + (this.anIntArray262[local28] & 0xFFFFC07F);
			}
			if (local34 == 1) {
				this.anIntArray258[local28] = (this.anIntArray258[local28] & 0xFFFFC07F) + (local40 << 7);
			}
			if (local34 == 33) {
				this.anIntArray258[local28] = local40 + (this.anIntArray258[local28] & 0xFFFFFF80);
			}
			if (local34 == 5) {
				this.anIntArray269[local28] = (local40 << 7) + (this.anIntArray269[local28] & 0xFFFFC07F);
			}
			if (local34 == 37) {
				this.anIntArray269[local28] = (this.anIntArray269[local28] & 0xFFFFFF80) + local40;
			}
			if (local34 == 7) {
				this.anIntArray271[local28] = (local40 << 7) + (this.anIntArray271[local28] & 0xFFFFC07F);
			}
			if (local34 == 39) {
				this.anIntArray271[local28] = (this.anIntArray271[local28] & 0xFFFFFF80) + local40;
			}
			if (local34 == 10) {
				this.anIntArray256[local28] = (local40 << 7) + (this.anIntArray256[local28] & 0xFFFFC07F);
			}
			if (local34 == 42) {
				this.anIntArray256[local28] = (this.anIntArray256[local28] & 0xFFFFFF80) + local40;
			}
			if (local34 == 11) {
				this.anIntArray266[local28] = (local40 << 7) + (this.anIntArray266[local28] & 0xFFFFC07F);
			}
			if (local34 == 43) {
				this.anIntArray266[local28] = local40 + (this.anIntArray266[local28] & 0xFFFFFF80);
			}
			if (local34 == 64) {
				if (local40 >= 64) {
					this.anIntArray263[local28] |= 0x1;
				} else {
					this.anIntArray263[local28] &= 0xFFFFFFFE;
				}
			}
			if (local34 == 65) {
				if (local40 >= 64) {
					this.anIntArray263[local28] |= 0x2;
				} else {
					this.method2575(local28);
					this.anIntArray263[local28] &= 0xFFFFFFFD;
				}
			}
			if (local34 == 99) {
				this.anIntArray264[local28] = (this.anIntArray264[local28] & 0x7F) + (local40 << 7);
			}
			if (local34 == 98) {
				this.anIntArray264[local28] = local40 + (this.anIntArray264[local28] & 0x3F80);
			}
			if (local34 == 101) {
				this.anIntArray264[local28] = (local40 << 7) + (this.anIntArray264[local28] & 0x7F) + 16384;
			}
			if (local34 == 100) {
				this.anIntArray264[local28] = local40 + (this.anIntArray264[local28] & 0x3F80) + 16384;
			}
			if (local34 == 120) {
				this.method2561(local28);
			}
			if (local34 == 121) {
				this.method2579(local28);
			}
			if (local34 == 123) {
				this.method2577(local28);
			}
			@Pc(516) int local516;
			if (local34 == 6) {
				local516 = this.anIntArray264[local28];
				if (local516 == 16384) {
					this.anIntArray270[local28] = (local40 << 7) + (this.anIntArray270[local28] & 0xFFFFC07F);
				}
			}
			if (local34 == 38) {
				local516 = this.anIntArray264[local28];
				if (local516 == 16384) {
					this.anIntArray270[local28] = local40 + (this.anIntArray270[local28] & 0xFFFFFF80);
				}
			}
			if (local34 == 16) {
				this.anIntArray261[local28] = (this.anIntArray261[local28] & 0xFFFFC07F) + (local40 << 7);
			}
			if (local34 == 48) {
				this.anIntArray261[local28] = (this.anIntArray261[local28] & 0xFFFFFF80) + local40;
			}
			if (local34 == 81) {
				if (local40 < 64) {
					this.method2595(local28);
					this.anIntArray263[local28] &= 0xFFFFFFFB;
				} else {
					this.anIntArray263[local28] |= 0x4;
				}
			}
			if (local34 == 17) {
				this.method2578((this.anIntArray259[local28] & 0xFFFFC07F) + (local40 << 7), local28);
			}
			if (local34 == 49) {
				this.method2578(local40 + (this.anIntArray259[local28] & 0xFFFFFF80), local28);
			}
		} else if (local9 == 192) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			this.method2586(local34 + this.anIntArray262[local28], local28);
		} else if (local9 == 208) {
			local28 = arg0 & 0xF;
			local34 = arg0 >> 8 & 0x7F;
			this.method2581(local28, local34);
		} else if (local9 == 224) {
			local28 = arg0 & 0xF;
			local34 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F02) >> 8);
			this.method2593(local28, local34);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2590(true);
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V")
	public synchronized void method2564() {
		for (@Pc(7) Class5_Sub51 local7 = (Class5_Sub51) this.aClass81_25.method1608(); local7 != null; local7 = (Class5_Sub51) this.aClass81_25.method1610()) {
			local7.method8911();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZZBLclient!ue;)V")
	private synchronized void method2565(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class5_Sub45 arg2) {
		this.method2585(arg0);
		this.aClass154_1.method3589(arg2.aByteArray87);
		this.aBoolean262 = arg1;
		this.aLong90 = 0L;
		@Pc(24) int local24 = this.aClass154_1.method3596();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass154_1.method3603(local26);
			this.aClass154_1.method3598(local26);
			this.aClass154_1.method3593(local26);
		}
		this.anInt3052 = this.aClass154_1.method3592();
		this.anInt3051 = this.aClass154_1.anIntArray330[this.anInt3052];
		this.aLong91 = this.aClass154_1.method3594(this.anInt3051);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIBI)V")
	private void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "()Lclient!gu;")
	@Override
	public synchronized Class5_Sub16 method8283() {
		return this.aClass5_Sub16_Sub4_1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V")
	public synchronized void method2567(@OriginalArg(1) int arg0) {
		this.anInt3024 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IJ)V")
	private void method2568(@OriginalArg(1) long arg0) {
		while (arg0 >= this.aLong91) {
			@Pc(16) int local16 = this.anInt3052;
			@Pc(19) int local19 = this.anInt3051;
			@Pc(22) long local22 = this.aLong91;
			while (this.anInt3051 == local19) {
				while (this.aClass154_1.anIntArray330[local16] == local19) {
					this.aClass154_1.method3603(local16);
					@Pc(33) int local33 = this.aClass154_1.method3591(local16);
					if (local33 == 1) {
						this.aClass154_1.method3601();
						this.aClass154_1.method3593(local16);
						if (this.aClass154_1.method3600()) {
							if (!this.aBoolean262 || local19 == 0) {
								this.method2590(true);
								this.aClass154_1.method3604();
								return;
							}
							this.aClass154_1.method3599(local22);
						}
						break;
					}
					if ((local33 & 0x80) != 0 && (local33 & 0xF0) != 144) {
						this.method2563(local33);
					}
					this.aClass154_1.method3598(local16);
					this.aClass154_1.method3593(local16);
				}
				this.aLong90 = local22;
				local16 = this.aClass154_1.method3592();
				local19 = this.aClass154_1.anIntArray330[local16];
				local22 = this.aClass154_1.method3594(local19);
			}
			this.anInt3052 = local16;
			this.aLong91 = local22;
			this.anInt3051 = local19;
		}
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)Z")
	public synchronized boolean method2569() {
		return this.aClass154_1.method3595();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!ue;Z)V")
	public synchronized void method2570(@OriginalArg(1) Class5_Sub45 arg0, @OriginalArg(2) boolean arg1) {
		this.method2565(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
	private void method2571() {
		@Pc(12) int local12 = this.anInt3052;
		@Pc(15) int local15 = this.anInt3051;
		@Pc(18) long local18 = this.aLong91;
		if (this.aClass5_Sub45_1 != null && this.anInt3054 == local15) {
			this.method2565(this.aBoolean263, this.aBoolean262, this.aClass5_Sub45_1);
			this.method2571();
			return;
		}
		while (this.anInt3051 == local15) {
			while (this.aClass154_1.anIntArray330[local12] == local15) {
				this.aClass154_1.method3603(local12);
				@Pc(51) int local51 = this.aClass154_1.method3591(local12);
				if (local51 == 1) {
					this.aClass154_1.method3601();
					this.aClass154_1.method3593(local12);
					if (this.aClass154_1.method3600()) {
						if (this.aClass5_Sub45_1 != null) {
							this.method2570(this.aClass5_Sub45_1, this.aBoolean262);
							this.method2571();
							return;
						}
						if (!this.aBoolean262 || local15 == 0) {
							this.method2590(true);
							this.aClass154_1.method3604();
							return;
						}
						this.aClass154_1.method3599(local18);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method2563(local51);
				}
				this.aClass154_1.method3598(local12);
				this.aClass154_1.method3593(local12);
			}
			local12 = this.aClass154_1.method3592();
			local15 = this.aClass154_1.anIntArray330[local12];
			local18 = this.aClass154_1.method3594(local15);
		}
		this.anInt3051 = local15;
		this.anInt3052 = local12;
		this.aLong91 = local18;
		if (this.aClass5_Sub45_1 != null && this.anInt3054 < local15) {
			this.anInt3051 = this.anInt3054;
			this.anInt3052 = -1;
			this.aLong91 = this.aClass154_1.method3594(this.anInt3051);
		}
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(Z)I")
	public int method2572() {
		return this.anInt3024;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!lv;)I")
	private int method2573(@OriginalArg(1) Class5_Sub30 arg0) {
		if (this.anIntArray265[arg0.anInt5826] == 0) {
			return 0;
		}
		@Pc(17) Class347 local17 = arg0.aClass347_1;
		@Pc(33) int local33 = this.anIntArray271[arg0.anInt5826] * this.anIntArray266[arg0.anInt5826] + 4096 >> 13;
		@Pc(46) int local46 = local33 * local33 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt5820 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt3024 * local55 + 128 >> 8;
		local33 = local64 * this.anIntArray265[arg0.anInt5826] + 128 >> 8;
		if (local17.anInt9530 > 0) {
			local33 = (int) (Math.pow(0.5D, (double) arg0.anInt5822 * 1.953125E-5D * (double) local17.anInt9530) * (double) local33 + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(129) int local129;
		@Pc(141) int local141;
		if (local17.aByteArray90 != null) {
			local103 = arg0.anInt5828;
			local111 = local17.aByteArray90[arg0.anInt5823 + 1];
			if (arg0.anInt5823 < local17.aByteArray90.length - 2) {
				local129 = (local17.aByteArray90[arg0.anInt5823] & 0xFF) << 8;
				local141 = (local17.aByteArray90[arg0.anInt5823 + 2] & 0xFF) << 8;
				local111 += (local17.aByteArray90[arg0.anInt5823 + 3] - local111) * (-local129 + local103) / (local141 - local129);
			}
			local33 = local33 * local111 + 32 >> 6;
		}
		if (arg0.anInt5818 > 0 && local17.aByteArray89 != null) {
			local103 = arg0.anInt5818;
			local111 = local17.aByteArray89[arg0.anInt5824 + 1];
			if (local17.aByteArray89.length - 2 > arg0.anInt5824) {
				local129 = (local17.aByteArray89[arg0.anInt5824] & 0xFF) << 8;
				local141 = (local17.aByteArray89[arg0.anInt5824 + 2] & 0xFF) << 8;
				local111 += (local103 - local129) * (local17.aByteArray89[arg0.anInt5824 + 3] - local111) / (local141 - local129);
			}
			local33 = local111 * local33 + 32 >> 6;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
	public synchronized void method2574() {
		this.method2585(true);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)V")
	private void method2575(@OriginalArg(1) int arg0) {
		if ((this.anIntArray263[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(30) Class5_Sub30 local30 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7313(); local30 != null; local30 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7301()) {
			if (arg0 == local30.anInt5826 && this.aClass5_Sub30ArrayArray1[arg0][local30.anInt5821] == null && local30.anInt5818 < 0) {
				local30.anInt5818 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BII)V")
	public synchronized void method2576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0) {
			this.anIntArray265[arg0] = arg1;
		} else {
			for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
				this.anIntArray265[local21] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(IZ)V")
	private void method2577(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class5_Sub30 local14 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7313(); local14 != null; local14 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7301()) {
			if ((arg0 < 0 || arg0 == local14.anInt5826) && local14.anInt5818 < 0) {
				this.aClass5_Sub30ArrayArray1[local14.anInt5826][local14.anInt5821] = null;
				local14.anInt5818 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(III)V")
	private void method2578(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray259[arg1] = arg0;
		this.anIntArray268[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)V")
	private void method2579(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2579(local12);
			}
			return;
		}
		this.anIntArray271[arg0] = 12800;
		this.anIntArray256[arg0] = 8192;
		this.anIntArray266[arg0] = 16383;
		this.anIntArray260[arg0] = 8192;
		this.anIntArray258[arg0] = 0;
		this.anIntArray269[arg0] = 8192;
		this.method2575(arg0);
		this.method2595(arg0);
		this.anIntArray263[arg0] = 0;
		this.anIntArray264[arg0] = 32767;
		this.anIntArray270[arg0] = 256;
		this.anIntArray261[arg0] = 0;
		this.method2578(8192, arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZZLclient!ue;JB)V")
	public synchronized void method2580(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub45 arg1, @OriginalArg(3) long arg2) {
		this.method2565(true, arg0, arg1);
		this.method2568(arg2 * (long) this.aClass154_1.anInt3968);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(III)V")
	private void method2581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "()I")
	@Override
	public synchronized int method8287() {
		return 0;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(ILclient!lv;)I")
	private int method2582(@OriginalArg(1) Class5_Sub30 arg0) {
		@Pc(9) int local9 = this.anIntArray256[arg0.anInt5826];
		return local9 >= 8192 ? 16384 - ((16384 - local9) * (-arg0.anInt5819 + 128) + 32 >> 6) : local9 * arg0.anInt5819 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIII)V")
	private void method2583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2589(64, arg0, arg1);
		if ((this.anIntArray263[arg0] & 0x2) != 0) {
			for (@Pc(28) Class5_Sub30 local28 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7304(); local28 != null; local28 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7314()) {
				if (arg0 == local28.anInt5826 && local28.anInt5818 < 0) {
					this.aClass5_Sub30ArrayArray1[arg0][local28.anInt5821] = null;
					this.aClass5_Sub30ArrayArray1[arg0][arg1] = local28;
					@Pc(70) int local70 = (local28.anInt5827 * local28.anInt5830 >> 12) + local28.anInt5817;
					local28.anInt5817 += arg1 - local28.anInt5821 << 8;
					local28.anInt5821 = arg1;
					local28.anInt5830 = 4096;
					local28.anInt5827 = local70 - local28.anInt5817;
					return;
				}
			}
		}
		@Pc(116) Class5_Sub51 local116 = (Class5_Sub51) this.aClass81_25.method1599((long) this.anIntArray257[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class5_Sub11_Sub1 local124 = local116.aClass5_Sub11_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class5_Sub30 local131 = new Class5_Sub30();
		local131.aClass5_Sub11_Sub1_2 = local124;
		local131.anInt5826 = arg0;
		local131.aClass5_Sub51_1 = local116;
		local131.aClass347_1 = local116.aClass347Array1[arg1];
		local131.anInt5831 = local116.aByteArray105[arg1];
		local131.anInt5821 = arg1;
		local131.anInt5820 = local116.anInt10369 * arg2 * arg2 * local116.aByteArray107[arg1] + 1024 >> 11;
		local131.anInt5819 = local116.aByteArray106[arg1] & 0xFF;
		local131.anInt5817 = (arg1 << 8) - (local116.aShortArray190[arg1] & 0x7FFF);
		local131.anInt5822 = 0;
		local131.anInt5824 = 0;
		local131.anInt5818 = -1;
		local131.anInt5823 = 0;
		local131.anInt5828 = 0;
		if (this.anIntArray261[arg0] == 0) {
			local131.aClass5_Sub16_Sub2_2 = Static653.method3341(local124, this.method2594(local131), this.method2573(local131), this.method2582(local131));
		} else {
			local131.aClass5_Sub16_Sub2_2 = Static653.method3341(local124, this.method2594(local131), 0, this.method2582(local131));
			this.method2588(local131, local116.aShortArray190[arg1] < 0);
		}
		if (local116.aShortArray190[arg1] < 0) {
			local131.aClass5_Sub16_Sub2_2.method3352(-1);
		}
		if (local131.anInt5831 >= 0) {
			@Pc(283) Class5_Sub30 local283 = this.aClass5_Sub30ArrayArray2[arg0][local131.anInt5831];
			if (local283 != null && local283.anInt5818 < 0) {
				this.aClass5_Sub30ArrayArray1[arg0][local283.anInt5821] = null;
				local283.anInt5818 = 0;
			}
			this.aClass5_Sub30ArrayArray2[arg0][local131.anInt5831] = local131;
		}
		this.aClass5_Sub16_Sub4_1.aClass306_44.method7303(local131);
		this.aClass5_Sub30ArrayArray1[arg0][arg1] = local131;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V")
	public synchronized void method2584() {
		for (@Pc(7) Class5_Sub51 local7 = (Class5_Sub51) this.aClass81_25.method1608(); local7 != null; local7 = (Class5_Sub51) this.aClass81_25.method1610()) {
			local7.method8811();
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "()Lclient!gu;")
	@Override
	public synchronized Class5_Sub16 method8281() {
		return null;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZ)V")
	private synchronized void method2585(@OriginalArg(1) boolean arg0) {
		this.aClass154_1.method3604();
		this.aClass5_Sub45_1 = null;
		this.method2590(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "(III)V")
	private void method2586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray257[arg1]) {
			this.anIntArray257[arg1] = arg0;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass5_Sub30ArrayArray2[arg1][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILclient!ue;Lclient!jj;ILclient!wu;)Z")
	public synchronized boolean method2587(@OriginalArg(1) Class5_Sub45 arg0, @OriginalArg(2) Class173 arg1, @OriginalArg(4) Class384 arg2) {
		arg0.method8038();
		@Pc(9) boolean local9 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class5_Sub22 local35 = (Class5_Sub22) arg0.aClass81_66.method1608(); local35 != null; local35 = (Class5_Sub22) arg0.aClass81_66.method1610()) {
			@Pc(41) int local41 = (int) local35.aLong282;
			@Pc(49) Class5_Sub51 local49 = (Class5_Sub51) this.aClass81_25.method1599((long) local41);
			if (local49 == null) {
				local49 = Static467.method6874(local41, arg2);
				if (local49 == null) {
					local9 = false;
					continue;
				}
				this.aClass81_25.method1607(local49, (long) local41);
			}
			if (!local49.method8813(local29, local35.aByteArray35, arg1)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method8040();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!lv;BZ)V")
	public void method2588(@OriginalArg(0) Class5_Sub30 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.aClass5_Sub11_Sub1_2.aByteArray17.length;
		@Pc(43) int local43;
		if (arg1 && arg0.aClass5_Sub11_Sub1_2.aBoolean106) {
			@Pc(30) int local30 = local16 + local16 - arg0.aClass5_Sub11_Sub1_2.anInt1320;
			local43 = (int) ((long) this.anIntArray261[arg0.anInt5826] * (long) local30 >> 6);
			local16 <<= 0x8;
			if (local16 <= local43) {
				arg0.aClass5_Sub16_Sub2_2.method3354();
				local43 = local16 + local16 - local43 - 1;
			}
		} else {
			local43 = (int) ((long) local16 * (long) this.anIntArray261[arg0.anInt5826] >> 6);
		}
		arg0.aClass5_Sub16_Sub2_2.method3342(local43);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBII)V")
	private void method2589(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class5_Sub30 local16 = this.aClass5_Sub30ArrayArray1[arg1][arg2];
		if (local16 == null) {
			return;
		}
		this.aClass5_Sub30ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray263[arg1] & 0x2) == 0) {
			local16.anInt5818 = 0;
			return;
		}
		for (@Pc(44) Class5_Sub30 local44 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7313(); local44 != null; local44 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7301()) {
			if (local44.anInt5826 == local16.anInt5826 && local44.anInt5818 < 0 && local16 != local44) {
				local16.anInt5818 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(ZI)V")
	private void method2590(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2561(-1);
		} else {
			this.method2577(-1);
		}
		this.method2579(-1);
		for (@Pc(33) int local33 = 0; local33 < 16; local33++) {
			this.anIntArray257[local33] = this.anIntArray267[local33];
		}
		for (@Pc(49) int local49 = 0; local49 < 16; local49++) {
			this.anIntArray262[local49] = this.anIntArray267[local49] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8286(@OriginalArg(0) int arg0) {
		if (this.aClass154_1.method3595()) {
			@Pc(18) int local18 = this.anInt3033 * this.aClass154_1.anInt3968 / Static92.anInt9993;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong90;
				if (this.aLong91 - local27 >= 0L) {
					this.aLong90 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong91 - this.aLong90 - 1L) / (long) local18);
				this.aLong90 += (long) local18 * (long) local58;
				this.aClass5_Sub16_Sub4_1.method8286(local58);
				arg0 -= local58;
				this.method2571();
			} while (this.aClass154_1.method3595());
		}
		this.aClass5_Sub16_Sub4_1.method8286(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!lv;I)Z")
	public boolean method2591(@OriginalArg(0) Class5_Sub30 arg0) {
		if (arg0.aClass5_Sub16_Sub2_2 != null) {
			return false;
		}
		if (arg0.anInt5818 >= 0) {
			arg0.method8911();
			if (arg0.anInt5831 > 0 && arg0 == this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831]) {
				this.aClass5_Sub30ArrayArray2[arg0.anInt5826][arg0.anInt5831] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IBI)V")
	public synchronized void method2592() {
		this.method2596();
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(III)V")
	private void method2593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray260[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(Lclient!lv;I)I")
	private int method2594(@OriginalArg(0) Class5_Sub30 arg0) {
		@Pc(20) int local20 = arg0.anInt5817 + (arg0.anInt5827 * arg0.anInt5830 >> 12);
		local20 += (this.anIntArray260[arg0.anInt5826] - 8192) * this.anIntArray270[arg0.anInt5826] >> 12;
		@Pc(41) Class347 local41 = arg0.aClass347_1;
		@Pc(61) int local61;
		if (local41.anInt9528 > 0 && (local41.anInt9532 > 0 || this.anIntArray258[arg0.anInt5826] > 0)) {
			local61 = local41.anInt9532 << 2;
			@Pc(66) int local66 = local41.anInt9529 << 1;
			if (local66 > arg0.anInt5832) {
				local61 = arg0.anInt5832 * local61 / local66;
			}
			local61 += this.anIntArray258[arg0.anInt5826] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt5829 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) (local100 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass5_Sub11_Sub1_2.anInt1318 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static92.anInt9993 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)V")
	private void method2595(@OriginalArg(0) int arg0) {
		if ((this.anIntArray263[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(26) Class5_Sub30 local26 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7313(); local26 != null; local26 = (Class5_Sub30) this.aClass5_Sub16_Sub4_1.aClass306_44.method7301()) {
			if (arg0 == local26.anInt5826) {
				local26.anInt5833 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(IBI)V")
	private void method2596() {
		this.anIntArray267[9] = 128;
		this.anIntArray262[9] = 128;
		this.method2586(128, 9);
	}
}
