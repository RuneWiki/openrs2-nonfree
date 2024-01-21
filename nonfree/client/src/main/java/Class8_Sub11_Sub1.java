import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class8_Sub11_Sub1 extends Class8_Sub11 {

	@OriginalMember(owner = "client!id", name = "Nb", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!id", name = "Ob", descriptor = "J")
	private long aLong50;

	@OriginalMember(owner = "client!id", name = "Pb", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!id", name = "Rb", descriptor = "Z")
	private boolean aBoolean59;

	@OriginalMember(owner = "client!id", name = "Sb", descriptor = "I")
	private int anInt1514;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
	private final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!id", name = "I", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!id", name = "V", descriptor = "[I")
	private final int[] anIntArray183 = new int[16];

	@OriginalMember(owner = "client!id", name = "R", descriptor = "[I")
	public final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!id", name = "jb", descriptor = "[[Lclient!we;")
	private final Class8_Sub23[][] aClass8_Sub23ArrayArray1 = new Class8_Sub23[16][128];

	@OriginalMember(owner = "client!id", name = "P", descriptor = "[I")
	private final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!id", name = "T", descriptor = "[I")
	private final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!id", name = "tb", descriptor = "I")
	private int anInt1500 = 256;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
	private final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!id", name = "vb", descriptor = "[[Lclient!we;")
	private final Class8_Sub23[][] aClass8_Sub23ArrayArray2 = new Class8_Sub23[16][128];

	@OriginalMember(owner = "client!id", name = "ub", descriptor = "[I")
	private final int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!id", name = "O", descriptor = "[I")
	public final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!id", name = "bb", descriptor = "[I")
	private final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!id", name = "hb", descriptor = "[I")
	private final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!id", name = "ab", descriptor = "[I")
	private final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!id", name = "Eb", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
	private final int anInt1498 = 1000000;

	@OriginalMember(owner = "client!id", name = "wb", descriptor = "[I")
	public final int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!id", name = "xb", descriptor = "[I")
	private final int[] anIntArray189 = new int[16];

	@OriginalMember(owner = "client!id", name = "Fb", descriptor = "Lclient!gb;")
	private final Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!id", name = "Qb", descriptor = "Lclient!td;")
	private final Class8_Sub11_Sub3 aClass8_Sub11_Sub3_1 = new Class8_Sub11_Sub3(this);

	@OriginalMember(owner = "client!id", name = "H", descriptor = "Lclient!af;")
	private final Class7 aClass7_9 = new Class7(128);

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class8_Sub11_Sub1() {
		this.method880();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
	private void method865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!we;I)I")
	private int method866(@OriginalArg(0) Class8_Sub23 arg0) {
		@Pc(2) Class75 local2 = arg0.aClass75_1;
		@Pc(13) int local13 = (arg0.anInt3068 * arg0.anInt3070 >> 12) + arg0.anInt3064;
		local13 += (this.anIntArray189[arg0.anInt3077] - 8192) * this.anIntArray190[arg0.anInt3077] >> 12;
		@Pc(54) int local54;
		if (local2.anInt2626 > 0 && (local2.anInt2627 > 0 || this.anIntArray180[arg0.anInt3077] > 0)) {
			local54 = local2.anInt2627 << 2;
			@Pc(59) int local59 = local2.anInt2631 << 1;
			if (arg0.anInt3080 < local59) {
				local54 = arg0.anInt3080 * local54 / local59;
			}
			local54 += this.anIntArray180[arg0.anInt3077] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt3058 & 0x1FF) * 0.01227184630308513D);
			local13 += (int) ((double) local54 * local93);
		}
		local54 = (int) ((double) (arg0.aClass8_Sub9_Sub1_1.anInt2236 * 256) * Math.pow(2.0D, (double) local13 * 3.255208333333333E-4D) / (double) Static23.anInt713 + 0.5D);
		return local54 >= 1 ? local54 : 1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	public synchronized void method867(@OriginalArg(0) int arg0) {
		this.anInt1500 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(Lclient!we;I)Z")
	public boolean method868(@OriginalArg(0) Class8_Sub23 arg0) {
		if (arg0.aClass8_Sub11_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt3062 >= 0) {
			arg0.method2013();
			if (arg0.anInt3063 > 0 && this.aClass8_Sub23ArrayArray1[arg0.anInt3077][arg0.anInt3063] == arg0) {
				this.aClass8_Sub23ArrayArray1[arg0.anInt3077][arg0.anInt3063] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)Z")
	public synchronized boolean method869() {
		return this.aClass27_1.method647();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
	private void method870() {
		this.anIntArray178[9] = 128;
		this.anIntArray186[9] = 128;
		this.method874(9, 128);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()Lclient!rf;")
	@Override
	public synchronized Class8_Sub11 method1918() {
		return null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZILclient!kc;)V")
	public synchronized void method871(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub12 arg1) {
		this.method898();
		this.aClass27_1.method655(arg1.aByteArray23);
		this.aLong50 = 0L;
		this.aBoolean59 = arg0;
		@Pc(19) int local19 = this.aClass27_1.method646();
		for (@Pc(31) int local31 = 0; local31 < local19; local31++) {
			this.aClass27_1.method651(local31);
			this.aClass27_1.method652(local31);
			this.aClass27_1.method653(local31);
		}
		this.anInt1513 = this.aClass27_1.method650();
		this.anInt1514 = this.aClass27_1.anIntArray140[this.anInt1513];
		this.aLong51 = this.aClass27_1.method649(this.anInt1514);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!we;[II)Z")
	public boolean method872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8_Sub23 arg2, @OriginalArg(3) int[] arg3) {
		arg2.anInt3073 = Static23.anInt713 / 100;
		if (arg2.anInt3062 >= 0 && (arg2.aClass8_Sub11_Sub2_3 == null || arg2.aClass8_Sub11_Sub2_3.method1001())) {
			arg2.method2008();
			arg2.method2013();
			if (arg2.anInt3063 > 0 && this.aClass8_Sub23ArrayArray1[arg2.anInt3077][arg2.anInt3063] == arg2) {
				this.aClass8_Sub23ArrayArray1[arg2.anInt3077][arg2.anInt3063] = null;
			}
			return true;
		}
		@Pc(60) boolean local60 = false;
		@Pc(63) int local63 = arg2.anInt3070;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray185[arg2.anInt3077] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg2.anInt3070 = local63;
		}
		arg2.aClass8_Sub11_Sub2_3.method993(this.method866(arg2));
		arg2.anInt3080++;
		@Pc(111) Class75 local111 = arg2.aClass75_1;
		arg2.anInt3058 += local111.anInt2626;
		@Pc(136) double local136 = (double) ((arg2.anInt3078 - 60 << 8) + (arg2.anInt3070 * arg2.anInt3068 >> 12)) * 5.086263020833333E-6D;
		if (local111.anInt2625 > 0) {
			if (local111.anInt2630 > 0) {
				arg2.anInt3081 += (int) (Math.pow(2.0D, local136 * (double) local111.anInt2630) * 128.0D + 0.5D);
			} else {
				arg2.anInt3081 += 128;
			}
			if (local111.anInt2625 * arg2.anInt3081 >= 819200) {
				local60 = true;
			}
		}
		if (local111.aByteArray39 != null) {
			if (local111.anInt2634 > 0) {
				arg2.anInt3065 += (int) (Math.pow(2.0D, local136 * (double) local111.anInt2634) * 128.0D + 0.5D);
			} else {
				arg2.anInt3065 += 128;
			}
			while (local111.aByteArray39.length - 2 > arg2.anInt3079 && arg2.anInt3065 > (local111.aByteArray39[arg2.anInt3079 + 2] & 0xFF) << 8) {
				arg2.anInt3079 += 2;
			}
			if (arg2.anInt3079 == local111.aByteArray39.length - 2 && local111.aByteArray39[arg2.anInt3079 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg2.anInt3062 >= 0 && local111.aByteArray40 != null && (this.anIntArray188[arg2.anInt3077] & 0x1) == 0 && (arg2.anInt3063 < 0 || this.aClass8_Sub23ArrayArray1[arg2.anInt3077][arg2.anInt3063] != arg2)) {
			if (local111.anInt2633 <= 0) {
				arg2.anInt3062 += 128;
			} else {
				arg2.anInt3062 += (int) (Math.pow(2.0D, local136 * (double) local111.anInt2633) * 128.0D + 0.5D);
			}
			while (local111.aByteArray40.length - 2 > arg2.anInt3072 && arg2.anInt3062 > (local111.aByteArray40[arg2.anInt3072 + 2] & 0xFF) << 8) {
				arg2.anInt3072 += 2;
			}
			if (arg2.anInt3072 == local111.aByteArray40.length - 2) {
				local60 = true;
			}
		}
		if (!local60) {
			arg2.aClass8_Sub11_Sub2_3.method999(arg2.anInt3073, this.method881(arg2), this.method876(arg2));
			return false;
		}
		arg2.aClass8_Sub11_Sub2_3.method998(arg2.anInt3073);
		if (arg3 == null) {
			arg2.aClass8_Sub11_Sub2_3.method1917(arg1);
		} else {
			arg2.aClass8_Sub11_Sub2_3.method1921(arg3, arg0, arg1);
		}
		if (arg2.aClass8_Sub11_Sub2_3.method972()) {
			this.aClass8_Sub11_Sub3_1.aClass8_Sub11_Sub4_2.method1922(arg2.aClass8_Sub11_Sub2_3);
		}
		arg2.method2008();
		if (arg2.anInt3062 >= 0) {
			arg2.method2013();
			if (arg2.anInt3063 > 0 && arg2 == this.aClass8_Sub23ArrayArray1[arg2.anInt3077][arg2.anInt3063]) {
				this.aClass8_Sub23ArrayArray1[arg2.anInt3077][arg2.anInt3063] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()Lclient!rf;")
	@Override
	public synchronized Class8_Sub11 method1920() {
		return this.aClass8_Sub11_Sub3_1;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	private void method873(@OriginalArg(1) int arg0) {
		if ((this.anIntArray188[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class8_Sub23 local15 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1107(); local15 != null; local15 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1109()) {
			if (arg0 == local15.anInt3077 && this.aClass8_Sub23ArrayArray2[arg0][local15.anInt3078] == null && local15.anInt3062 < 0) {
				local15.anInt3062 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
	private void method874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray176[arg0] != arg1) {
			this.anIntArray176[arg0] = arg1;
			for (@Pc(24) int local24 = 0; local24 < 128; local24++) {
				this.aClass8_Sub23ArrayArray1[arg0][local24] = null;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)V")
	private void method875(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(28) int local28;
		if (local5 == 128) {
			local18 = arg0 >> 8 & 0x7F;
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method891(local28, local18, local22);
		} else if (local5 == 144) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method891(64, local18, local22);
			} else {
				this.method886(local18, local28, local22);
			}
		} else if (local5 == 160) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method865(local18, local28, local22);
		} else if (local5 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local18 = arg0 >> 8 & 0x7F;
			if (local18 == 0) {
				this.anIntArray186[local22] = (local28 << 14) + (this.anIntArray186[local22] & 0xFFE03FFF);
			}
			if (local18 == 32) {
				this.anIntArray186[local22] = (local28 << 7) + (this.anIntArray186[local22] & 0xFFFFC07F);
			}
			if (local18 == 1) {
				this.anIntArray180[local22] = (local28 << 7) + (this.anIntArray180[local22] & 0xFFFFC07F);
			}
			if (local18 == 33) {
				this.anIntArray180[local22] = local28 + (this.anIntArray180[local22] & 0xFFFFFF80);
			}
			if (local18 == 5) {
				this.anIntArray185[local22] = (this.anIntArray185[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 37) {
				this.anIntArray185[local22] = local28 + (this.anIntArray185[local22] & 0xFFFFFF80);
			}
			if (local18 == 7) {
				this.anIntArray184[local22] = (this.anIntArray184[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 39) {
				this.anIntArray184[local22] = (this.anIntArray184[local22] & 0xFFFFFF80) + local28;
			}
			if (local18 == 10) {
				this.anIntArray182[local22] = (this.anIntArray182[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 42) {
				this.anIntArray182[local22] = (this.anIntArray182[local22] & 0xFFFFFF80) + local28;
			}
			if (local18 == 11) {
				this.anIntArray187[local22] = (this.anIntArray187[local22] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local18 == 43) {
				this.anIntArray187[local22] = local28 + (this.anIntArray187[local22] & 0xFFFFFF80);
			}
			if (local18 == 64) {
				if (local28 < 64) {
					this.anIntArray188[local22] &= 0xFFFFFFFE;
				} else {
					this.anIntArray188[local22] |= 0x1;
				}
			}
			if (local18 == 65) {
				if (local28 < 64) {
					this.method873(local22);
					this.anIntArray188[local22] &= 0xFFFFFFFD;
				} else {
					this.anIntArray188[local22] |= 0x2;
				}
			}
			if (local18 == 99) {
				this.anIntArray177[local22] = (local28 << 7) + (this.anIntArray177[local22] & 0x7F);
			}
			if (local18 == 98) {
				this.anIntArray177[local22] = (this.anIntArray177[local22] & 0x3F80) + local28;
			}
			if (local18 == 101) {
				this.anIntArray177[local22] = (local28 << 7) + (this.anIntArray177[local22] & 0x7F) + 16384;
			}
			if (local18 == 100) {
				this.anIntArray177[local22] = local28 + (this.anIntArray177[local22] & 0x3F80) + 16384;
			}
			if (local18 == 120) {
				this.method877(local22);
			}
			if (local18 == 121) {
				this.method887(local22);
			}
			if (local18 == 123) {
				this.method889(local22);
			}
			@Pc(496) int local496;
			if (local18 == 6) {
				local496 = this.anIntArray177[local22];
				if (local496 == 16384) {
					this.anIntArray190[local22] = (this.anIntArray190[local22] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local18 == 38) {
				local496 = this.anIntArray177[local22];
				if (local496 == 16384) {
					this.anIntArray190[local22] = local28 + (this.anIntArray190[local22] & 0xFFFFFF80);
				}
			}
			if (local18 == 16) {
				this.anIntArray181[local22] = (local28 << 7) + (this.anIntArray181[local22] & 0xFFFFC07F);
			}
			if (local18 == 48) {
				this.anIntArray181[local22] = local28 + (this.anIntArray181[local22] & 0xFFFFFF80);
			}
			if (local18 == 81) {
				if (local28 >= 64) {
					this.anIntArray188[local22] |= 0x4;
				} else {
					this.method894(local22);
					this.anIntArray188[local22] &= 0xFFFFFFFB;
				}
			}
			if (local18 == 17) {
				this.method888((this.anIntArray183[local22] & 0xFFFFC07F) + (local28 << 7), local22);
			}
			if (local18 == 49) {
				this.method888((this.anIntArray183[local22] & 0xFFFFFF80) + local28, local22);
			}
		} else if (local5 == 192) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			this.method874(local22, local18 + this.anIntArray186[local22]);
		} else if (local5 == 208) {
			local22 = arg0 & 0xF;
			local18 = arg0 >> 8 & 0x7F;
			this.method879(local18, local22);
		} else if (local5 == 224) {
			local22 = arg0 & 0xF;
			local18 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FB6) >> 8);
			this.method883(local22, local18);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method880();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1917(@OriginalArg(0) int arg0) {
		if (this.aClass27_1.method647()) {
			@Pc(18) int local18 = this.anInt1498 * this.aClass27_1.anInt1037 / Static23.anInt713;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong50;
				if (this.aLong51 - local27 >= 0L) {
					this.aLong50 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong51 + (long) local18 - this.aLong50 - 1L) / (long) local18);
				arg0 -= local57;
				this.aLong50 += (long) local18 * (long) local57;
				this.aClass8_Sub11_Sub3_1.method1917(local57);
				this.method899();
			} while (this.aClass27_1.method647());
		}
		this.aClass8_Sub11_Sub3_1.method1917(arg0);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!we;)I")
	private int method876(@OriginalArg(1) Class8_Sub23 arg0) {
		@Pc(9) int local9 = this.anIntArray182[arg0.anInt3077];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt3082) * (16384 - local9) + 32 >> 6) : local9 * arg0.anInt3082 + 32 >> 6;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(II)V")
	private void method877(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class8_Sub23 local14 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1107(); local14 != null; local14 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1109()) {
			if (arg0 < 0 || local14.anInt3077 == arg0) {
				if (local14.aClass8_Sub11_Sub2_3 != null) {
					local14.aClass8_Sub11_Sub2_3.method998(Static23.anInt713 / 100);
					if (local14.aClass8_Sub11_Sub2_3.method972()) {
						this.aClass8_Sub11_Sub3_1.aClass8_Sub11_Sub4_2.method1922(local14.aClass8_Sub11_Sub2_3);
					}
					local14.method2008();
				}
				if (local14.anInt3062 < 0) {
					this.aClass8_Sub23ArrayArray2[local14.anInt3077][local14.anInt3078] = null;
				}
				local14.method2013();
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public synchronized void method878() {
		for (@Pc(13) Class8_Sub8 local13 = (Class8_Sub8) this.aClass7_9.method47(); local13 != null; local13 = (Class8_Sub8) this.aClass7_9.method46()) {
			local13.method2013();
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
	private void method879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
	private void method880() {
		this.method877(-1);
		this.method887(-1);
		for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
			this.anIntArray176[local22] = this.anIntArray178[local22];
		}
		for (@Pc(40) int local40 = 0; local40 < 16; local40++) {
			this.anIntArray186[local40] = this.anIntArray178[local40] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLclient!we;)I")
	private int method881(@OriginalArg(1) Class8_Sub23 arg0) {
		@Pc(24) int local24 = this.anIntArray184[arg0.anInt3077] * this.anIntArray187[arg0.anInt3077] + 4096 >> 13;
		@Pc(32) int local32 = local24 * local24 + 16384 >> 15;
		@Pc(41) int local41 = local32 * arg0.anInt3061 + 16384 >> 15;
		local24 = local41 * this.anInt1500 + 128 >> 8;
		@Pc(53) Class75 local53 = arg0.aClass75_1;
		if (local53.anInt2625 > 0) {
			local24 = (int) (Math.pow(0.5D, (double) arg0.anInt3081 * 1.953125E-5D * (double) local53.anInt2625) * (double) local24 + 0.5D);
		}
		@Pc(88) int local88;
		@Pc(85) int local85;
		@Pc(106) int local106;
		@Pc(118) int local118;
		if (local53.aByteArray39 != null) {
			local85 = local53.aByteArray39[arg0.anInt3079 + 1];
			local88 = arg0.anInt3065;
			if (local53.aByteArray39.length - 2 > arg0.anInt3079) {
				local106 = (local53.aByteArray39[arg0.anInt3079] & 0xFF) << 8;
				local118 = (local53.aByteArray39[arg0.anInt3079 + 2] & 0xFF) << 8;
				local85 += (local53.aByteArray39[arg0.anInt3079 + 3] - local85) * (local88 - local106) / (local118 - local106);
			}
			local24 = local85 * local24 + 32 >> 6;
		}
		if (arg0.anInt3062 > 0 && local53.aByteArray40 != null) {
			local88 = arg0.anInt3062;
			local85 = local53.aByteArray40[arg0.anInt3072 + 1];
			if (arg0.anInt3072 < local53.aByteArray40.length - 2) {
				local118 = (local53.aByteArray40[arg0.anInt3072 + 2] & 0xFF) << 8;
				local106 = (local53.aByteArray40[arg0.anInt3072] & 0xFF) << 8;
				local85 += (local88 - local106) * (local53.aByteArray40[arg0.anInt3072 + 3] - local85) / (local118 - local106);
			}
			local24 = local24 * local85 + 32 >> 6;
		}
		return local24;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)I")
	public int method882() {
		return this.anInt1500;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(III)V")
	private void method883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray189[arg0] = arg1;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()I")
	@Override
	public synchronized int method1919() {
		return 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII)V")
	private void method886(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method891(64, arg0, arg2);
		if ((this.anIntArray188[arg2] & 0x2) != 0) {
			for (@Pc(33) Class8_Sub23 local33 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1112(); local33 != null; local33 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1113()) {
				if (arg2 == local33.anInt3077 && local33.anInt3062 < 0) {
					this.aClass8_Sub23ArrayArray2[arg2][local33.anInt3078] = null;
					this.aClass8_Sub23ArrayArray2[arg2][arg0] = local33;
					@Pc(68) int local68 = local33.anInt3064 + (local33.anInt3068 * local33.anInt3070 >> 12);
					local33.anInt3064 += arg0 - local33.anInt3078 << 8;
					local33.anInt3070 = 4096;
					local33.anInt3068 = local68 - local33.anInt3064;
					local33.anInt3078 = arg0;
					return;
				}
			}
		}
		@Pc(113) Class8_Sub8 local113 = (Class8_Sub8) this.aClass7_9.method45((long) this.anIntArray176[arg2]);
		if (local113 == null) {
			return;
		}
		@Pc(121) Class8_Sub9_Sub1 local121 = local113.aClass8_Sub9_Sub1Array1[arg0];
		if (local121 == null) {
			return;
		}
		@Pc(128) Class8_Sub23 local128 = new Class8_Sub23();
		local128.aClass8_Sub8_1 = local113;
		local128.aClass8_Sub9_Sub1_1 = local121;
		local128.anInt3077 = arg2;
		local128.aClass75_1 = local113.aClass75Array1[arg0];
		local128.anInt3063 = local113.aByteArray14[arg0];
		local128.anInt3078 = arg0;
		local128.anInt3061 = arg1 * arg1 * local113.anInt979 * local113.aByteArray13[arg0] + 1024 >> 11;
		local128.anInt3082 = local113.aByteArray15[arg0] & 0xFF;
		local128.anInt3064 = (arg0 << 8) - (local113.aShortArray26[arg0] & 0x7FFF);
		local128.anInt3062 = -1;
		local128.anInt3081 = 0;
		local128.anInt3065 = 0;
		local128.anInt3079 = 0;
		local128.anInt3072 = 0;
		if (this.anIntArray181[arg2] == 0) {
			local128.aClass8_Sub11_Sub2_3 = Static136.method988(local121, this.method866(local128), this.method881(local128), this.method876(local128));
		} else {
			local128.aClass8_Sub11_Sub2_3 = Static136.method988(local121, this.method866(local128), 0, this.method876(local128));
			this.method897(local113.aShortArray26[arg0] < 0, local128);
		}
		if (local113.aShortArray26[arg0] < 0) {
			local128.aClass8_Sub11_Sub2_3.method984(-1);
		}
		if (local128.anInt3063 >= 0) {
			@Pc(282) Class8_Sub23 local282 = this.aClass8_Sub23ArrayArray1[arg2][local128.anInt3063];
			if (local282 != null && local282.anInt3062 < 0) {
				this.aClass8_Sub23ArrayArray2[arg2][local282.anInt3078] = null;
				local282.anInt3062 = 0;
			}
			this.aClass8_Sub23ArrayArray1[arg2][local128.anInt3063] = local128;
		}
		this.aClass8_Sub11_Sub3_1.aClass49_11.method1114(local128);
		this.aClass8_Sub23ArrayArray2[arg2][arg0] = local128;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	private void method887(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
				this.method887(local18);
			}
			return;
		}
		this.anIntArray184[arg0] = 12800;
		this.anIntArray182[arg0] = 8192;
		this.anIntArray187[arg0] = 16383;
		this.anIntArray189[arg0] = 8192;
		this.anIntArray180[arg0] = 0;
		this.anIntArray185[arg0] = 8192;
		this.method873(arg0);
		this.method894(arg0);
		this.anIntArray188[arg0] = 0;
		this.anIntArray177[arg0] = 32767;
		this.anIntArray190[arg0] = 256;
		this.anIntArray181[arg0] = 0;
		this.method888(8192, arg0);
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(III)V")
	private void method888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray183[arg1] = arg0;
		this.anIntArray179[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(BI)V")
	private void method889(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class8_Sub23 local12 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1107(); local12 != null; local12 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1109()) {
			if ((arg0 < 0 || local12.anInt3077 == arg0) && local12.anInt3062 < 0) {
				this.aClass8_Sub23ArrayArray2[local12.anInt3077][local12.anInt3078] = null;
				local12.anInt3062 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)V")
	public synchronized void method890() {
		this.method870();
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(IIII)V")
	private void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class8_Sub23 local16 = this.aClass8_Sub23ArrayArray2[arg2][arg1];
		if (local16 == null) {
			return;
		}
		this.aClass8_Sub23ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray188[arg2] & 0x2) == 0) {
			local16.anInt3062 = 0;
			return;
		}
		for (@Pc(43) Class8_Sub23 local43 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1107(); local43 != null; local43 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1109()) {
			if (local43.anInt3077 == local16.anInt3077 && local43.anInt3062 < 0 && local43 != local16) {
				local16.anInt3062 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
	public synchronized void method892() {
		for (@Pc(5) Class8_Sub8 local5 = (Class8_Sub8) this.aClass7_9.method47(); local5 != null; local5 = (Class8_Sub8) this.aClass7_9.method46()) {
			local5.method605();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)V")
	private void method894(@OriginalArg(0) int arg0) {
		if ((this.anIntArray188[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class8_Sub23 local15 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1107(); local15 != null; local15 = (Class8_Sub23) this.aClass8_Sub11_Sub3_1.aClass49_11.method1109()) {
			if (local15.anInt3077 == arg0) {
				local15.anInt3083 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method1921(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass27_1.method647()) {
			@Pc(18) int local18 = this.anInt1498 * this.aClass27_1.anInt1037 / Static23.anInt713;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong50;
				if (this.aLong51 - local27 >= 0L) {
					this.aLong50 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong51 + (long) local18 - this.aLong50 - 1L) / (long) local18);
				this.aLong50 += (long) local57 * (long) local18;
				arg2 -= local57;
				this.aClass8_Sub11_Sub3_1.method1921(arg0, arg1, local57);
				arg1 += local57;
				this.method899();
			} while (this.aClass27_1.method647());
		}
		this.aClass8_Sub11_Sub3_1.method1921(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZLclient!we;I)V")
	public void method897(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub23 arg1) {
		@Pc(8) int local8 = arg1.aClass8_Sub9_Sub1_1.aByteArray37.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass8_Sub9_Sub1_1.aBoolean88) {
			@Pc(42) int local42 = local8 + local8 - arg1.aClass8_Sub9_Sub1_1.anInt2235;
			local31 = (int) ((long) local42 * (long) this.anIntArray181[arg1.anInt3077] >> 6);
			local8 <<= 0x8;
			if (local8 <= local31) {
				arg1.aClass8_Sub11_Sub2_3.method983();
				local31 = local8 + local8 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) this.anIntArray181[arg1.anInt3077] * (long) local8 >> 6);
		}
		arg1.aClass8_Sub11_Sub2_3.method969(local31);
	}

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
	public synchronized void method898() {
		this.aClass27_1.method643();
		this.method880();
	}

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
	private void method899() {
		@Pc(8) int local8 = this.anInt1513;
		@Pc(11) long local11 = this.aLong51;
		@Pc(14) int local14 = this.anInt1514;
		while (local14 == this.anInt1514) {
			while (local14 == this.aClass27_1.anIntArray140[local8]) {
				this.aClass27_1.method651(local8);
				@Pc(25) int local25 = this.aClass27_1.method656(local8);
				if (local25 == 1) {
					this.aClass27_1.method641();
					this.aClass27_1.method653(local8);
					if (this.aClass27_1.method654()) {
						if (!this.aBoolean59 || local14 == 0) {
							this.method880();
							this.aClass27_1.method643();
							return;
						}
						this.aClass27_1.method642(local11);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method875(local25);
				}
				this.aClass27_1.method652(local8);
				this.aClass27_1.method653(local8);
			}
			local8 = this.aClass27_1.method650();
			local14 = this.aClass27_1.anIntArray140[local8];
			local11 = this.aClass27_1.method649(local14);
		}
		this.anInt1513 = local8;
		this.aLong51 = local11;
		this.anInt1514 = local14;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!dd;ILclient!ed;ILclient!kc;)Z")
	public synchronized boolean method900(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(4) Class8_Sub12 arg2) {
		arg2.method1010();
		@Pc(17) int[] local17 = new int[] { 22050 };
		@Pc(23) boolean local23 = true;
		for (@Pc(39) Class8_Sub13 local39 = (Class8_Sub13) arg2.aClass7_11.method47(); local39 != null; local39 = (Class8_Sub13) arg2.aClass7_11.method46()) {
			@Pc(45) int local45 = (int) local39.aLong102;
			@Pc(53) Class8_Sub8 local53 = (Class8_Sub8) this.aClass7_9.method45((long) local45);
			if (local53 == null) {
				local53 = Static96.method338(arg0, local45);
				if (local53 == null) {
					local23 = false;
					continue;
				}
				this.aClass7_9.method48(local53, (long) local45);
			}
			if (!local53.method609(local39.aByteArray24, local17, arg1)) {
				local23 = false;
			}
		}
		if (local23) {
			arg2.method1009();
		}
		return local23;
	}
}
