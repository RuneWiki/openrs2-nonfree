import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class5_Sub22_Sub1 extends Class5_Sub22 {

	@OriginalMember(owner = "client!jq", name = "Fb", descriptor = "I")
	private int anInt3412;

	@OriginalMember(owner = "client!jq", name = "Hb", descriptor = "Z")
	private boolean aBoolean217;

	@OriginalMember(owner = "client!jq", name = "Ib", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!jq", name = "Kb", descriptor = "J")
	private long aLong107;

	@OriginalMember(owner = "client!jq", name = "Lb", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "client!jq", name = "Nb", descriptor = "I")
	private int anInt3414;

	@OriginalMember(owner = "client!jq", name = "Ob", descriptor = "Lclient!sp;")
	private Class5_Sub37 aClass5_Sub37_1;

	@OriginalMember(owner = "client!jq", name = "Pb", descriptor = "Z")
	private boolean aBoolean218;

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!jq", name = "Q", descriptor = "[I")
	public final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!jq", name = "P", descriptor = "[I")
	private final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "[I")
	private final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!jq", name = "cb", descriptor = "[I")
	private final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!jq", name = "D", descriptor = "[[Lclient!js;")
	private final Class5_Sub23[][] aClass5_Sub23ArrayArray1 = new Class5_Sub23[16][128];

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "[I")
	private final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	private int anInt3374 = 256;

	@OriginalMember(owner = "client!jq", name = "R", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!jq", name = "gb", descriptor = "[I")
	private final int[] anIntArray204 = new int[16];

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "[I")
	private final int[] anIntArray190 = new int[16];

	@OriginalMember(owner = "client!jq", name = "W", descriptor = "[I")
	private final int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!jq", name = "ab", descriptor = "[I")
	private final int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "[I")
	public final int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!jq", name = "mb", descriptor = "[I")
	private final int[] anIntArray205 = new int[16];

	@OriginalMember(owner = "client!jq", name = "zb", descriptor = "I")
	private final int anInt3408 = 1000000;

	@OriginalMember(owner = "client!jq", name = "qb", descriptor = "[I")
	private final int[] anIntArray206 = new int[16];

	@OriginalMember(owner = "client!jq", name = "V", descriptor = "[I")
	public final int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!jq", name = "Bb", descriptor = "[[Lclient!js;")
	private final Class5_Sub23[][] aClass5_Sub23ArrayArray2 = new Class5_Sub23[16][128];

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "Lclient!tc;")
	private final Class228 aClass228_1 = new Class228();

	@OriginalMember(owner = "client!jq", name = "Mb", descriptor = "Lclient!wh;")
	private final Class5_Sub22_Sub4 aClass5_Sub22_Sub4_1 = new Class5_Sub22_Sub4(this);

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "Lclient!vg;")
	private final Class252 aClass252_24 = new Class252(128);

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class5_Sub22_Sub1() {
		this.method2742();
		this.method2725(true);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	private void method2724(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2734(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method2743(local22, local16, local28);
			} else {
				this.method2734(64, local22, local16);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2733(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray191[local16] = (local28 << 14) + (this.anIntArray191[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray191[local16] = (local28 << 7) + (this.anIntArray191[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray205[local16] = (local28 << 7) + (this.anIntArray205[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray205[local16] = (this.anIntArray205[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray193[local16] = (local28 << 7) + (this.anIntArray193[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray193[local16] = local28 + (this.anIntArray193[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray202[local16] = (this.anIntArray202[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray202[local16] = local28 + (this.anIntArray202[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray192[local16] = (local28 << 7) + (this.anIntArray192[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray192[local16] = local28 + (this.anIntArray192[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray195[local16] = (this.anIntArray195[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray195[local16] = (this.anIntArray195[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray198[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray198[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2750(local16);
					this.anIntArray198[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray198[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray203[local16] = (local28 << 7) + (this.anIntArray203[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray203[local16] = local28 + (this.anIntArray203[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray203[local16] = (this.anIntArray203[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray203[local16] = local28 + (this.anIntArray203[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method2737(local16);
			}
			if (local22 == 121) {
				this.method2753(local16);
			}
			if (local22 == 123) {
				this.method2757(local16);
			}
			@Pc(496) int local496;
			if (local22 == 6) {
				local496 = this.anIntArray203[local16];
				if (local496 == 16384) {
					this.anIntArray199[local16] = (local28 << 7) + (this.anIntArray199[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local496 = this.anIntArray203[local16];
				if (local496 == 16384) {
					this.anIntArray199[local16] = (this.anIntArray199[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray196[local16] = (local28 << 7) + (this.anIntArray196[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray196[local16] = local28 + (this.anIntArray196[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray198[local16] |= 0x4;
				} else {
					this.method2755(local16);
					this.anIntArray198[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method2754((this.anIntArray197[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method2754(local28 + (this.anIntArray197[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2735(local22 + this.anIntArray191[local16], local16);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2761(local22, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2726(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2725(true);
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
	private void method2725(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2737(-1);
		} else {
			this.method2757(-1);
		}
		this.method2753(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray204[local23] = this.anIntArray190[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray191[local41] = this.anIntArray190[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	private void method2726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray201[arg1] = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!js;)Z")
	public boolean method2727(@OriginalArg(1) Class5_Sub23 arg0) {
		if (arg0.aClass5_Sub22_Sub2_2 != null) {
			return false;
		}
		if (arg0.anInt3424 >= 0) {
			arg0.method6003();
			if (arg0.anInt3434 > 0 && arg0 == this.aClass5_Sub23ArrayArray1[arg0.anInt3420][arg0.anInt3434]) {
				this.aClass5_Sub23ArrayArray1[arg0.anInt3420][arg0.anInt3434] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public synchronized void method2729() {
		for (@Pc(11) Class5_Sub42 local11 = (Class5_Sub42) this.aClass252_24.method5660(); local11 != null; local11 = (Class5_Sub42) this.aClass252_24.method5666()) {
			local11.method6003();
		}
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V")
	public synchronized void method2730() {
		for (@Pc(11) Class5_Sub42 local11 = (Class5_Sub42) this.aClass252_24.method5660(); local11 != null; local11 = (Class5_Sub42) this.aClass252_24.method5666()) {
			local11.method5431();
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "()I")
	@Override
	public synchronized int method5931() {
		return 0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZLclient!js;)V")
	public void method2732(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		@Pc(8) int local8 = arg1.aClass5_Sub5_Sub1_2.aByteArray74.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass5_Sub5_Sub1_2.aBoolean396) {
			@Pc(41) int local41 = local8 + local8 - arg1.aClass5_Sub5_Sub1_2.anInt5863;
			local31 = (int) ((long) local41 * (long) this.anIntArray196[arg1.anInt3420] >> 6);
			local8 <<= 0x8;
			if (local8 <= local31) {
				local31 = local8 + local8 - local31 - 1;
				arg1.aClass5_Sub22_Sub2_2.method3115();
			}
		} else {
			local31 = (int) ((long) this.anIntArray196[arg1.anInt3420] * (long) local8 >> 6);
		}
		arg1.aClass5_Sub22_Sub2_2.method3133(local31);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)V")
	private void method2733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IIII)V")
	private void method2734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class5_Sub23 local12 = this.aClass5_Sub23ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass5_Sub23ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray198[arg2] & 0x2) == 0) {
			local12.anInt3424 = 0;
			return;
		}
		for (@Pc(39) Class5_Sub23 local39 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3618(); local39 != null; local39 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3619()) {
			if (local12.anInt3420 == local39.anInt3420 && local39.anInt3424 < 0 && local12 != local39) {
				local12.anInt3424 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "()Lclient!ms;")
	@Override
	public synchronized Class5_Sub22 method5929() {
		return this.aClass5_Sub22_Sub4_1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)V")
	private void method2735(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray204[arg1]) {
			this.anIntArray204[arg1] = arg0;
			for (@Pc(29) int local29 = 0; local29 < 128; local29++) {
				this.aClass5_Sub23ArrayArray1[arg1][local29] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!sp;B)V")
	public synchronized void method2736(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub37 arg1) {
		this.method2748(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)V")
	private void method2737(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class5_Sub23 local14 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3618(); local14 != null; local14 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3619()) {
			if (arg0 < 0 || local14.anInt3420 == arg0) {
				if (local14.aClass5_Sub22_Sub2_2 != null) {
					local14.aClass5_Sub22_Sub2_2.method3100(Static193.anInt3215 / 100);
					if (local14.aClass5_Sub22_Sub2_2.method3108()) {
						this.aClass5_Sub22_Sub4_1.aClass5_Sub22_Sub3_4.method3641(local14.aClass5_Sub22_Sub2_2);
					}
					local14.method2768();
				}
				if (local14.anInt3424 < 0) {
					this.aClass5_Sub23ArrayArray2[local14.anInt3420][local14.anInt3425] = null;
				}
				local14.method6003();
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V")
	public synchronized void method2738() {
		this.method2756();
	}

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)Z")
	public synchronized boolean method2739() {
		return this.aClass228_1.method5020();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "()Lclient!ms;")
	@Override
	public synchronized Class5_Sub22 method5928() {
		return null;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!js;)I")
	private int method2740(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(14) int local14 = (arg0.anInt3426 * arg0.anInt3436 >> 12) + arg0.anInt3437;
		local14 += (this.anIntArray201[arg0.anInt3420] - 8192) * this.anIntArray199[arg0.anInt3420] >> 12;
		@Pc(35) Class272 local35 = arg0.aClass272_1;
		@Pc(58) int local58;
		if (local35.anInt7540 > 0 && (local35.anInt7542 > 0 || this.anIntArray205[arg0.anInt3420] > 0)) {
			local58 = local35.anInt7542 << 2;
			@Pc(63) int local63 = local35.anInt7534 << 1;
			if (arg0.anInt3428 < local63) {
				local58 = local58 * arg0.anInt3428 / local63;
			}
			local58 += this.anIntArray205[arg0.anInt3420] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt3423 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local97);
		}
		local58 = (int) ((double) (arg0.aClass5_Sub5_Sub1_2.anInt5864 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static193.anInt3215 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZI)V")
	private synchronized void method2742() {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			this.anIntArray206[local5] = 256;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5930(@OriginalArg(0) int arg0) {
		if (this.aClass228_1.method5020()) {
			@Pc(14) int local14 = this.aClass228_1.anInt6352 * this.anInt3408 / Static193.anInt3215;
			do {
				@Pc(23) long local23 = this.aLong107 + (long) arg0 * (long) local14;
				if (this.aLong106 - local23 >= 0L) {
					this.aLong107 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong106 - this.aLong107 - 1L) / (long) local14);
				this.aLong107 += (long) local14 * (long) local53;
				arg0 -= local53;
				this.aClass5_Sub22_Sub4_1.method5930(local53);
				this.method2744();
			} while (this.aClass228_1.method5020());
		}
		this.aClass5_Sub22_Sub4_1.method5930(arg0);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass228_1.method5020()) {
			@Pc(18) int local18 = this.anInt3408 * this.aClass228_1.anInt6352 / Static193.anInt3215;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong107;
				if (this.aLong106 - local27 >= 0L) {
					this.aLong107 = local27;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong106 + (long) local18 - this.aLong107 - 1L) / (long) local18);
				this.aLong107 += (long) local18 * (long) local54;
				this.aClass5_Sub22_Sub4_1.method5934(arg0, arg1, local54);
				arg2 -= local54;
				this.method2744();
				arg1 += local54;
			} while (this.aClass228_1.method5020());
		}
		this.aClass5_Sub22_Sub4_1.method5934(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IIII)V")
	private void method2743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2734(64, arg0, arg1);
		if ((this.anIntArray198[arg1] & 0x2) != 0) {
			for (@Pc(28) Class5_Sub23 local28 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3617(); local28 != null; local28 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3612()) {
				if (local28.anInt3420 == arg1 && local28.anInt3424 < 0) {
					this.aClass5_Sub23ArrayArray2[arg1][local28.anInt3425] = null;
					this.aClass5_Sub23ArrayArray2[arg1][arg0] = local28;
					@Pc(63) int local63 = (local28.anInt3426 * local28.anInt3436 >> 12) + local28.anInt3437;
					local28.anInt3437 += arg0 - local28.anInt3425 << 8;
					local28.anInt3426 = 4096;
					local28.anInt3425 = arg0;
					local28.anInt3436 = local63 - local28.anInt3437;
					return;
				}
			}
		}
		@Pc(108) Class5_Sub42 local108 = (Class5_Sub42) this.aClass252_24.method5659((long) this.anIntArray204[arg1]);
		if (local108 == null) {
			return;
		}
		@Pc(116) Class5_Sub5_Sub1 local116 = local108.aClass5_Sub5_Sub1Array1[arg0];
		if (local116 == null) {
			return;
		}
		@Pc(123) Class5_Sub23 local123 = new Class5_Sub23();
		local123.aClass5_Sub5_Sub1_2 = local116;
		local123.anInt3420 = arg1;
		local123.aClass5_Sub42_1 = local108;
		local123.aClass272_1 = local108.aClass272Array1[arg0];
		local123.anInt3434 = local108.aByteArray90[arg0];
		local123.anInt3425 = arg0;
		local123.anInt3427 = arg2 * arg2 * local108.anInt6866 * local108.aByteArray88[arg0] + 1024 >> 11;
		local123.anInt3419 = local108.aByteArray87[arg0] & 0xFF;
		local123.anInt3437 = (arg0 << 8) - (local108.aShortArray111[arg0] & 0x7FFF);
		local123.anInt3422 = 0;
		local123.anInt3438 = 0;
		local123.anInt3433 = 0;
		local123.anInt3424 = -1;
		local123.anInt3429 = 0;
		if (this.anIntArray196[arg1] == 0) {
			local123.aClass5_Sub22_Sub2_2 = Static467.method3135(local116, this.method2740(local123), this.method2751(local123), this.method2760(local123));
		} else {
			local123.aClass5_Sub22_Sub2_2 = Static467.method3135(local116, this.method2740(local123), 0, this.method2760(local123));
			this.method2732(local108.aShortArray111[arg0] < 0, local123);
		}
		if (local108.aShortArray111[arg0] < 0) {
			local123.aClass5_Sub22_Sub2_2.method3128(-1);
		}
		if (local123.anInt3434 >= 0) {
			@Pc(275) Class5_Sub23 local275 = this.aClass5_Sub23ArrayArray1[arg1][local123.anInt3434];
			if (local275 != null && local275.anInt3424 < 0) {
				this.aClass5_Sub23ArrayArray2[arg1][local275.anInt3425] = null;
				local275.anInt3424 = 0;
			}
			this.aClass5_Sub23ArrayArray1[arg1][local123.anInt3434] = local123;
		}
		this.aClass5_Sub22_Sub4_1.aClass177_50.method3615(local123);
		this.aClass5_Sub23ArrayArray2[arg1][arg0] = local123;
	}

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "(I)V")
	private void method2744() {
		@Pc(16) int local16 = this.anInt3412;
		@Pc(19) int local19 = this.anInt3413;
		@Pc(22) long local22 = this.aLong106;
		if (this.aClass5_Sub37_1 != null && this.anInt3414 == local19) {
			this.method2748(this.aBoolean218, this.aClass5_Sub37_1, this.aBoolean217);
			this.method2744();
			return;
		}
		while (this.anInt3413 == local19) {
			while (local19 == this.aClass228_1.anIntArray449[local16]) {
				this.aClass228_1.method5022(local16);
				@Pc(51) int local51 = this.aClass228_1.method5029(local16);
				if (local51 == 1) {
					this.aClass228_1.method5031();
					this.aClass228_1.method5021(local16);
					if (this.aClass228_1.method5032()) {
						if (this.aClass5_Sub37_1 != null) {
							this.method2736(this.aBoolean217, this.aClass5_Sub37_1);
							this.method2744();
							return;
						}
						if (!this.aBoolean217 || local19 == 0) {
							this.method2725(true);
							this.aClass228_1.method5033();
							return;
						}
						this.aClass228_1.method5034(local22);
					}
					break;
				}
				if ((local51 & 0x80) != 0) {
					this.method2724(local51);
				}
				this.aClass228_1.method5023(local16);
				this.aClass228_1.method5021(local16);
			}
			local16 = this.aClass228_1.method5030();
			local19 = this.aClass228_1.anIntArray449[local16];
			local22 = this.aClass228_1.method5026(local19);
		}
		this.anInt3412 = local16;
		this.aLong106 = local22;
		this.anInt3413 = local19;
		if (this.aClass5_Sub37_1 != null && local19 > this.anInt3414) {
			this.anInt3413 = this.anInt3414;
			this.anInt3412 = -1;
			this.aLong106 = this.aClass228_1.method5026(this.anInt3413);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([IILclient!js;IZ)Z")
	public boolean method2746(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub23 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt3431 = Static193.anInt3215 / 100;
		if (arg2.anInt3424 >= 0 && (arg2.aClass5_Sub22_Sub2_2 == null || arg2.aClass5_Sub22_Sub2_2.method3116())) {
			arg2.method2768();
			arg2.method6003();
			if (arg2.anInt3434 > 0 && this.aClass5_Sub23ArrayArray1[arg2.anInt3420][arg2.anInt3434] == arg2) {
				this.aClass5_Sub23ArrayArray1[arg2.anInt3420][arg2.anInt3434] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt3426;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray193[arg2.anInt3420] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt3426 = local56;
		}
		arg2.aClass5_Sub22_Sub2_2.method3125(this.method2740(arg2));
		@Pc(93) Class272 local93 = arg2.aClass272_1;
		arg2.anInt3423 += local93.anInt7540;
		arg2.anInt3428++;
		@Pc(108) boolean local108 = false;
		@Pc(126) double local126 = (double) ((arg2.anInt3436 * arg2.anInt3426 >> 12) + (arg2.anInt3425 - 60 << 8)) * 5.086263020833333E-6D;
		if (local93.anInt7541 > 0) {
			if (local93.anInt7539 > 0) {
				arg2.anInt3433 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt7539) * 128.0D + 0.5D);
			} else {
				arg2.anInt3433 += 128;
			}
			if (local93.anInt7541 * arg2.anInt3433 >= 819200) {
				local108 = true;
			}
		}
		if (local93.aByteArray96 != null) {
			if (local93.anInt7536 <= 0) {
				arg2.anInt3438 += 128;
			} else {
				arg2.anInt3438 += (int) (Math.pow(2.0D, local126 * (double) local93.anInt7536) * 128.0D + 0.5D);
			}
			while (local93.aByteArray96.length - 2 > arg2.anInt3429 && (local93.aByteArray96[arg2.anInt3429 + 2] & 0xFF) << 8 < arg2.anInt3438) {
				arg2.anInt3429 += 2;
			}
			if (local93.aByteArray96.length - 2 == arg2.anInt3429 && local93.aByteArray96[arg2.anInt3429 + 1] == 0) {
				local108 = true;
			}
		}
		if (arg2.anInt3424 >= 0 && local93.aByteArray95 != null && (this.anIntArray198[arg2.anInt3420] & 0x1) == 0 && (arg2.anInt3434 < 0 || arg2 != this.aClass5_Sub23ArrayArray1[arg2.anInt3420][arg2.anInt3434])) {
			if (local93.anInt7528 <= 0) {
				arg2.anInt3424 += 128;
			} else {
				arg2.anInt3424 += (int) (Math.pow(2.0D, (double) local93.anInt7528 * local126) * 128.0D + 0.5D);
			}
			while (local93.aByteArray95.length - 2 > arg2.anInt3422 && (local93.aByteArray95[arg2.anInt3422 + 2] & 0xFF) << 8 < arg2.anInt3424) {
				arg2.anInt3422 += 2;
			}
			if (local93.aByteArray95.length - 2 == arg2.anInt3422) {
				local108 = true;
			}
		}
		if (!local108) {
			arg2.aClass5_Sub22_Sub2_2.method3122(arg2.anInt3431, this.method2751(arg2), this.method2760(arg2));
			return false;
		}
		arg2.aClass5_Sub22_Sub2_2.method3100(arg2.anInt3431);
		if (arg0 == null) {
			arg2.aClass5_Sub22_Sub2_2.method5930(arg3);
		} else {
			arg2.aClass5_Sub22_Sub2_2.method5934(arg0, arg1, arg3);
		}
		if (arg2.aClass5_Sub22_Sub2_2.method3108()) {
			this.aClass5_Sub22_Sub4_1.aClass5_Sub22_Sub3_4.method3641(arg2.aClass5_Sub22_Sub2_2);
		}
		arg2.method2768();
		if (arg2.anInt3424 >= 0) {
			arg2.method6003();
			if (arg2.anInt3434 > 0 && arg2 == this.aClass5_Sub23ArrayArray1[arg2.anInt3420][arg2.anInt3434]) {
				this.aClass5_Sub23ArrayArray1[arg2.anInt3420][arg2.anInt3434] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "(I)V")
	public synchronized void method2747() {
		this.method2758(true);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZBLclient!sp;Z)V")
	private synchronized void method2748(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class5_Sub37 arg1, @OriginalArg(3) boolean arg2) {
		this.method2758(arg0);
		this.aClass228_1.method5025(arg1.aByteArray79);
		this.aBoolean217 = arg2;
		this.aLong107 = 0L;
		@Pc(30) int local30 = this.aClass228_1.method5024();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			this.aClass228_1.method5022(local32);
			this.aClass228_1.method5023(local32);
			this.aClass228_1.method5021(local32);
		}
		this.anInt3412 = this.aClass228_1.method5030();
		this.anInt3413 = this.aClass228_1.anIntArray449[this.anInt3412];
		this.aLong106 = this.aClass228_1.method5026(this.anInt3413);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!um;Lclient!ao;BLclient!sp;)Z")
	public synchronized boolean method2749(@OriginalArg(1) Class243 arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(4) Class5_Sub37 arg2) {
		arg2.method4953();
		@Pc(15) boolean local15 = true;
		@Pc(29) int[] local29 = new int[] { 22050 };
		for (@Pc(35) Class5_Sub6 local35 = (Class5_Sub6) arg2.aClass252_35.method5660(); local35 != null; local35 = (Class5_Sub6) arg2.aClass252_35.method5666()) {
			@Pc(41) int local41 = (int) local35.aLong234;
			@Pc(49) Class5_Sub42 local49 = (Class5_Sub42) this.aClass252_24.method5659((long) local41);
			if (local49 == null) {
				local49 = Static37.method621(arg0, local41);
				if (local49 == null) {
					local15 = false;
					continue;
				}
				this.aClass252_24.method5658(local49, (long) local41);
			}
			if (!local49.method5430(local29, local35.aByteArray8, arg1)) {
				local15 = false;
			}
		}
		if (local15) {
			arg2.method4951();
		}
		return local15;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)V")
	private void method2750(@OriginalArg(0) int arg0) {
		if ((this.anIntArray198[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(37) Class5_Sub23 local37 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3618(); local37 != null; local37 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3619()) {
			if (arg0 == local37.anInt3420 && this.aClass5_Sub23ArrayArray2[arg0][local37.anInt3425] == null && local37.anInt3424 < 0) {
				local37.anInt3424 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZLclient!js;)I")
	private int method2751(@OriginalArg(1) Class5_Sub23 arg0) {
		if (this.anIntArray206[arg0.anInt3420] == 0) {
			return 0;
		}
		@Pc(19) Class272 local19 = arg0.aClass272_1;
		@Pc(35) int local35 = this.anIntArray195[arg0.anInt3420] * this.anIntArray202[arg0.anInt3420] + 4096 >> 13;
		@Pc(43) int local43 = local35 * local35 + 16384 >> 15;
		@Pc(52) int local52 = arg0.anInt3427 * local43 + 16384 >> 15;
		@Pc(61) int local61 = local52 * this.anInt3374 + 128 >> 8;
		local35 = this.anIntArray206[arg0.anInt3420] * local61 + 128 >> 8;
		if (local19.anInt7541 > 0) {
			local35 = (int) ((double) local35 * Math.pow(0.5D, (double) arg0.anInt3433 * 1.953125E-5D * (double) local19.anInt7541) + 0.5D);
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		@Pc(126) int local126;
		@Pc(138) int local138;
		if (local19.aByteArray96 != null) {
			local100 = arg0.anInt3438;
			local108 = local19.aByteArray96[arg0.anInt3429 + 1];
			if (local19.aByteArray96.length - 2 > arg0.anInt3429) {
				local126 = (local19.aByteArray96[arg0.anInt3429] & 0xFF) << 8;
				local138 = (local19.aByteArray96[arg0.anInt3429 + 2] & 0xFF) << 8;
				local108 += (local19.aByteArray96[arg0.anInt3429 + 3] - local108) * (-local126 + local100) / (local138 - local126);
			}
			local35 = local35 * local108 + 32 >> 6;
		}
		if (arg0.anInt3424 > 0 && local19.aByteArray95 != null) {
			local100 = arg0.anInt3424;
			local108 = local19.aByteArray95[arg0.anInt3422 + 1];
			if (arg0.anInt3422 < local19.aByteArray95.length - 2) {
				local126 = (local19.aByteArray95[arg0.anInt3422] & 0xFF) << 8;
				local138 = (local19.aByteArray95[arg0.anInt3422 + 2] & 0xFF) << 8;
				local108 += (local100 - local126) * (local19.aByteArray95[arg0.anInt3422 + 3] - local108) / (local138 - local126);
			}
			local35 = local35 * local108 + 32 >> 6;
		}
		return local35;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)V")
	private void method2753(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2753(local9);
			}
			return;
		}
		this.anIntArray202[arg0] = 12800;
		this.anIntArray192[arg0] = 8192;
		this.anIntArray195[arg0] = 16383;
		this.anIntArray201[arg0] = 8192;
		this.anIntArray205[arg0] = 0;
		this.anIntArray193[arg0] = 8192;
		this.method2750(arg0);
		this.method2755(arg0);
		this.anIntArray198[arg0] = 0;
		this.anIntArray203[arg0] = 32767;
		this.anIntArray199[arg0] = 256;
		this.anIntArray196[arg0] = 0;
		this.method2754(8192, arg0);
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)V")
	private void method2754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray197[arg1] = arg0;
		this.anIntArray200[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(II)V")
	private void method2755(@OriginalArg(0) int arg0) {
		if ((this.anIntArray198[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class5_Sub23 local22 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3618(); local22 != null; local22 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3619()) {
			if (local22.anInt3420 == arg0) {
				local22.anInt3435 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IBI)V")
	private void method2756() {
		this.anIntArray190[9] = 128;
		this.anIntArray191[9] = 128;
		this.method2735(128, 9);
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(II)V")
	private void method2757(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class5_Sub23 local8 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3618(); local8 != null; local8 = (Class5_Sub23) this.aClass5_Sub22_Sub4_1.aClass177_50.method3619()) {
			if ((arg0 < 0 || arg0 == local8.anInt3420) && local8.anInt3424 < 0) {
				this.aClass5_Sub23ArrayArray2[local8.anInt3420][local8.anInt3425] = null;
				local8.anInt3424 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZZ)V")
	private synchronized void method2758(@OriginalArg(0) boolean arg0) {
		this.aClass228_1.method5033();
		this.aClass5_Sub37_1 = null;
		this.method2725(arg0);
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(B)I")
	public int method2759() {
		return this.anInt3374;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(ILclient!js;)I")
	private int method2760(@OriginalArg(1) Class5_Sub23 arg0) {
		@Pc(9) int local9 = this.anIntArray192[arg0.anInt3420];
		return local9 < 8192 ? local9 * arg0.anInt3419 + 32 >> 6 : 16384 - ((128 - arg0.anInt3419) * (16384 - local9) + 32 >> 6);
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(III)V")
	private void method2761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(II)V")
	public synchronized void method2762(@OriginalArg(0) int arg0) {
		this.anInt3374 = arg0;
	}
}
