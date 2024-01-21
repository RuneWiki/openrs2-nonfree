import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ub", name = "Pb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!ub", name = "Qb", descriptor = "I")
	private int anInt3704;

	@OriginalMember(owner = "client!ub", name = "Rb", descriptor = "I")
	private int anInt3705;

	@OriginalMember(owner = "client!ub", name = "Sb", descriptor = "Z")
	private boolean aBoolean145;

	@OriginalMember(owner = "client!ub", name = "Tb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "[I")
	private final int[] anIntArray356 = new int[16];

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
	private final int[] anIntArray357 = new int[16];

	@OriginalMember(owner = "client!ub", name = "db", descriptor = "[I")
	private final int[] anIntArray359 = new int[16];

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "[I")
	public final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "[I")
	private final int[] anIntArray360 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Ab", descriptor = "I")
	private final int anInt3695 = 1000000;

	@OriginalMember(owner = "client!ub", name = "qb", descriptor = "[I")
	private final int[] anIntArray363 = new int[16];

	@OriginalMember(owner = "client!ub", name = "vb", descriptor = "[I")
	private final int[] anIntArray364 = new int[16];

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "[I")
	private final int[] anIntArray361 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "[I")
	public final int[] anIntArray358 = new int[16];

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "[[Lclient!u;")
	private final Class4_Sub25[][] aClass4_Sub25ArrayArray1 = new Class4_Sub25[16][128];

	@OriginalMember(owner = "client!ub", name = "eb", descriptor = "[[Lclient!u;")
	private final Class4_Sub25[][] aClass4_Sub25ArrayArray2 = new Class4_Sub25[16][128];

	@OriginalMember(owner = "client!ub", name = "Nb", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Mb", descriptor = "[I")
	public final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Cb", descriptor = "[I")
	private final int[] anIntArray365 = new int[16];

	@OriginalMember(owner = "client!ub", name = "Hb", descriptor = "I")
	private int anInt3700 = 256;

	@OriginalMember(owner = "client!ub", name = "Db", descriptor = "[I")
	private final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!ub", name = "U", descriptor = "Lclient!bh;")
	private final Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!ub", name = "Ub", descriptor = "Lclient!me;")
	private final Class4_Sub2_Sub3 aClass4_Sub2_Sub3_1 = new Class4_Sub2_Sub3(this);

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!db;")
	private final Class20 aClass20_14 = new Class20(128);

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub4() {
		this.method2781();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!le;IZ)V")
	public synchronized void method2775(@OriginalArg(0) Class4_Sub15 arg0, @OriginalArg(2) boolean arg1) {
		this.method2806();
		this.aClass12_1.method283(arg0.aByteArray27);
		this.aBoolean145 = arg1;
		this.aLong135 = 0L;
		@Pc(23) int local23 = this.aClass12_1.method290();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass12_1.method288(local25);
			this.aClass12_1.method287(local25);
			this.aClass12_1.method282(local25);
		}
		this.anInt3705 = this.aClass12_1.method296();
		this.anInt3704 = this.aClass12_1.anIntArray44[this.anInt3705];
		this.aLong136 = this.aClass12_1.method294(this.anInt3704);
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public synchronized void method2776() {
		for (@Pc(7) Class4_Sub17 local7 = (Class4_Sub17) this.aClass20_14.method504(); local7 != null; local7 = (Class4_Sub17) this.aClass20_14.method498()) {
			local7.method3173();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)V")
	private void method2777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIZI)V")
	private void method2778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class4_Sub25 local18 = this.aClass4_Sub25ArrayArray1[arg0][arg1];
		if (local18 == null) {
			return;
		}
		this.aClass4_Sub25ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray358[arg0] & 0x2) == 0) {
			local18.anInt3635 = 0;
			return;
		}
		for (@Pc(45) Class4_Sub25 local45 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method274(); local45 != null; local45 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method271()) {
			if (local18.anInt3633 == local45.anInt3633 && local45.anInt3635 < 0 && local45 != local18) {
				local18.anInt3635 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()Lclient!ag;")
	@Override
	public synchronized Class4_Sub2 method2774() {
		return this.aClass4_Sub2_Sub3_1;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	public synchronized void method2780() {
		for (@Pc(17) Class4_Sub17 local17 = (Class4_Sub17) this.aClass20_14.method504(); local17 != null; local17 = (Class4_Sub17) this.aClass20_14.method498()) {
			local17.method2058();
		}
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)V")
	private void method2781() {
		this.method2805(-1);
		this.method2799(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray366[local15] = this.anIntArray356[local15];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray368[local41] = this.anIntArray356[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!u;B)I")
	private int method2782(@OriginalArg(0) Class4_Sub25 arg0) {
		@Pc(14) Class67 local14 = arg0.aClass67_1;
		@Pc(30) int local30 = this.anIntArray365[arg0.anInt3633] * this.anIntArray359[arg0.anInt3633] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt3631 + 16384 >> 15;
		local30 = this.anInt3700 * local47 + 128 >> 8;
		if (local14.anInt3000 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt3000 * (double) arg0.anInt3638 * 1.953125E-5D) * (double) local30 + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		@Pc(128) int local128;
		@Pc(118) int local118;
		if (local14.aByteArray36 != null) {
			local86 = arg0.anInt3636;
			local94 = local14.aByteArray36[arg0.anInt3624 + 1];
			if (local14.aByteArray36.length - 2 > arg0.anInt3624) {
				local118 = (local14.aByteArray36[arg0.anInt3624 + 2] & 0xFF) << 8;
				local128 = (local14.aByteArray36[arg0.anInt3624] & 0xFF) << 8;
				local94 += (local14.aByteArray36[arg0.anInt3624 + 3] - local94) * (local86 - local128) / (local118 - local128);
			}
			local30 = local30 * local94 + 32 >> 6;
		}
		if (arg0.anInt3635 > 0 && local14.aByteArray35 != null) {
			local86 = arg0.anInt3635;
			local94 = local14.aByteArray35[arg0.anInt3632 + 1];
			if (local14.aByteArray35.length - 2 > arg0.anInt3632) {
				local128 = (local14.aByteArray35[arg0.anInt3632] & 0xFF) << 8;
				local118 = (local14.aByteArray35[arg0.anInt3632 + 2] & 0xFF) << 8;
				local94 += (local86 - local128) * (local14.aByteArray35[arg0.anInt3632 + 3] - local94) / (local118 - local128);
			}
			local30 = local30 * local94 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(I)V")
	private void method2783() {
		@Pc(12) int local12 = this.anInt3705;
		@Pc(15) int local15 = this.anInt3704;
		@Pc(18) long local18 = this.aLong136;
		while (local15 == this.anInt3704) {
			while (local15 == this.aClass12_1.anIntArray44[local12]) {
				this.aClass12_1.method288(local12);
				@Pc(29) int local29 = this.aClass12_1.method285(local12);
				if (local29 == 1) {
					this.aClass12_1.method286();
					this.aClass12_1.method282(local12);
					if (this.aClass12_1.method293()) {
						if (!this.aBoolean145 || local15 == 0) {
							this.method2781();
							this.aClass12_1.method291();
							return;
						}
						this.aClass12_1.method284(local18);
					}
					break;
				}
				if ((local29 & 0x80) != 0) {
					this.method2791(local29);
				}
				this.aClass12_1.method287(local12);
				this.aClass12_1.method282(local12);
			}
			local12 = this.aClass12_1.method296();
			local15 = this.aClass12_1.anIntArray44[local12];
			local18 = this.aClass12_1.method294(local15);
		}
		this.aLong136 = local18;
		this.anInt3705 = local12;
		this.anInt3704 = local15;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZBLclient!u;)V")
	public void method2784(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub25 arg1) {
		@Pc(12) int local12 = arg1.aClass4_Sub12_Sub1_1.aByteArray48.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass4_Sub12_Sub1_1.aBoolean164) {
			@Pc(42) int local42 = local12 + local12 - arg1.aClass4_Sub12_Sub1_1.anInt3982;
			local31 = (int) ((long) local42 * (long) this.anIntArray355[arg1.anInt3633] >> 6);
			local12 <<= 0x8;
			if (local31 >= local12) {
				local31 = local12 + local12 - local31 - 1;
				arg1.aClass4_Sub2_Sub2_3.method1311();
			}
		} else {
			local31 = (int) ((long) this.anIntArray355[arg1.anInt3633] * (long) local12 >> 6);
		}
		arg1.aClass4_Sub2_Sub2_3.method1322(local31);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()Lclient!ag;")
	@Override
	public synchronized Class4_Sub2 method2768() {
		return null;
	}

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "(I)I")
	public int method2786() {
		return this.anInt3700;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
	public synchronized void method2787(@OriginalArg(0) int arg0) {
		this.anInt3700 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	private void method2788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray364[arg0] = arg1;
		this.anIntArray367[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)V")
	private void method2789(@OriginalArg(1) int arg0) {
		if ((this.anIntArray358[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class4_Sub25 local22 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method274(); local22 != null; local22 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method271()) {
			if (arg0 == local22.anInt3633 && this.aClass4_Sub25ArrayArray1[arg0][local22.anInt3642] == null && local22.anInt3635 < 0) {
				local22.anInt3635 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V")
	private void method2790(@OriginalArg(1) int arg0) {
		for (@Pc(17) Class4_Sub25 local17 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method274(); local17 != null; local17 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method271()) {
			if ((arg0 < 0 || arg0 == local17.anInt3633) && local17.anInt3635 < 0) {
				this.aClass4_Sub25ArrayArray1[local17.anInt3633][local17.anInt3642] = null;
				local17.anInt3635 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)V")
	private void method2791(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(30) int local30;
		@Pc(24) int local24;
		if (local5 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 16 & 0x7F;
			local30 = arg0 >> 8 & 0x7F;
			this.method2778(local18, local30, local24);
		} else if (local5 == 144) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local24 = arg0 >> 16 & 0x7F;
			if (local24 <= 0) {
				this.method2778(local18, local30, 64);
			} else {
				this.method2795(local24, local18, local30);
			}
		} else if (local5 == 160) {
			local30 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local24 = arg0 >> 16 & 0x7F;
			this.method2793(local18, local24, local30);
		} else if (local5 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 16 & 0x7F;
			local30 = arg0 >> 8 & 0x7F;
			if (local30 == 0) {
				this.anIntArray368[local18] = (local24 << 14) + (this.anIntArray368[local18] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray368[local18] = (local24 << 7) + (this.anIntArray368[local18] & 0xFFFFC07F);
			}
			if (local30 == 1) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0xFFFFC07F) + (local24 << 7);
			}
			if (local30 == 33) {
				this.anIntArray353[local18] = local24 + (this.anIntArray353[local18] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray360[local18] = (this.anIntArray360[local18] & 0xFFFFC07F) + (local24 << 7);
			}
			if (local30 == 37) {
				this.anIntArray360[local18] = local24 + (this.anIntArray360[local18] & 0xFFFFFF80);
			}
			if (local30 == 7) {
				this.anIntArray359[local18] = (this.anIntArray359[local18] & 0xFFFFC07F) + (local24 << 7);
			}
			if (local30 == 39) {
				this.anIntArray359[local18] = local24 + (this.anIntArray359[local18] & 0xFFFFFF80);
			}
			if (local30 == 10) {
				this.anIntArray357[local18] = (local24 << 7) + (this.anIntArray357[local18] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray357[local18] = local24 + (this.anIntArray357[local18] & 0xFFFFFF80);
			}
			if (local30 == 11) {
				this.anIntArray365[local18] = (this.anIntArray365[local18] & 0xFFFFC07F) + (local24 << 7);
			}
			if (local30 == 43) {
				this.anIntArray365[local18] = local24 + (this.anIntArray365[local18] & 0xFFFFFF80);
			}
			if (local30 == 64) {
				if (local24 >= 64) {
					this.anIntArray358[local18] |= 0x1;
				} else {
					this.anIntArray358[local18] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local24 >= 64) {
					this.anIntArray358[local18] |= 0x2;
				} else {
					this.method2789(local18);
					this.anIntArray358[local18] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x7F) + (local24 << 7);
			}
			if (local30 == 98) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x3F80) + local24;
			}
			if (local30 == 101) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x7F) + (local24 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray363[local18] = (this.anIntArray363[local18] & 0x3F80) + local24 + 16384;
			}
			if (local30 == 120) {
				this.method2805(local18);
			}
			if (local30 == 121) {
				this.method2799(local18);
			}
			if (local30 == 123) {
				this.method2790(local18);
			}
			@Pc(499) int local499;
			if (local30 == 6) {
				local499 = this.anIntArray363[local18];
				if (local499 == 16384) {
					this.anIntArray354[local18] = (local24 << 7) + (this.anIntArray354[local18] & 0xFFFFC07F);
				}
			}
			if (local30 == 38) {
				local499 = this.anIntArray363[local18];
				if (local499 == 16384) {
					this.anIntArray354[local18] = (this.anIntArray354[local18] & 0xFFFFFF80) + local24;
				}
			}
			if (local30 == 16) {
				this.anIntArray355[local18] = (local24 << 7) + (this.anIntArray355[local18] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray355[local18] = (this.anIntArray355[local18] & 0xFFFFFF80) + local24;
			}
			if (local30 == 81) {
				if (local24 >= 64) {
					this.anIntArray358[local18] |= 0x4;
				} else {
					this.method2804(local18);
					this.anIntArray358[local18] &= 0xFFFFFFFB;
				}
			}
			if (local30 == 17) {
				this.method2788(local18, (local24 << 7) + (this.anIntArray364[local18] & 0xFFFFC07F));
			}
			if (local30 == 49) {
				this.method2788(local18, (this.anIntArray364[local18] & 0xFFFFFF80) + local24);
			}
		} else if (local5 == 192) {
			local30 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			this.method2794(this.anIntArray368[local18] + local30, local18);
		} else if (local5 == 208) {
			local18 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method2777(local18, local30);
		} else if (local5 == 224) {
			local18 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2800(local18, local30);
		} else {
			local5 = arg0 & 0xFF;
			if (local5 == 255) {
				this.method2781();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!u;I)I")
	private int method2792(@OriginalArg(0) Class4_Sub25 arg0) {
		@Pc(17) int local17 = this.anIntArray357[arg0.anInt3633];
		return local17 < 8192 ? arg0.anInt3634 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt3634) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V")
	private void method2793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(III)V")
	private void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray366[arg1] != arg0) {
			this.anIntArray366[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass4_Sub25ArrayArray2[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2773(@OriginalArg(0) int arg0) {
		if (this.aClass12_1.method292()) {
			@Pc(18) int local18 = this.anInt3695 * this.aClass12_1.anInt469 / Static154.anInt4087;
			do {
				@Pc(28) long local28 = this.aLong135 + (long) local18 * (long) arg0;
				if (this.aLong136 - local28 >= 0L) {
					this.aLong135 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong136 + (long) local18 - this.aLong135 - 1L) / (long) local18);
				arg0 -= local58;
				this.aLong135 += (long) local18 * (long) local58;
				this.aClass4_Sub2_Sub3_1.method2773(local58);
				this.method2783();
			} while (this.aClass12_1.method292());
		}
		this.aClass4_Sub2_Sub3_1.method2773(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIB)V")
	private void method2795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2778(arg1, arg2, 64);
		if ((this.anIntArray358[arg1] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub25 local28 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method275(); local28 != null; local28 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method278()) {
				if (arg1 == local28.anInt3633 && local28.anInt3635 < 0) {
					this.aClass4_Sub25ArrayArray1[arg1][local28.anInt3642] = null;
					this.aClass4_Sub25ArrayArray1[arg1][arg2] = local28;
					@Pc(63) int local63 = local28.anInt3626 + (local28.anInt3640 * local28.anInt3628 >> 12);
					local28.anInt3640 = 4096;
					local28.anInt3626 += arg2 - local28.anInt3642 << 8;
					local28.anInt3642 = arg2;
					local28.anInt3628 = local63 - local28.anInt3626;
					return;
				}
			}
		}
		@Pc(109) Class4_Sub17 local109 = (Class4_Sub17) this.aClass20_14.method505((long) this.anIntArray366[arg1]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class4_Sub12_Sub1 local117 = local109.aClass4_Sub12_Sub1Array1[arg2];
		if (local117 == null) {
			return;
		}
		@Pc(130) Class4_Sub25 local130 = new Class4_Sub25();
		local130.aClass4_Sub12_Sub1_1 = local117;
		local130.anInt3633 = arg1;
		local130.aClass4_Sub17_1 = local109;
		local130.aClass67_1 = local109.aClass67Array1[arg2];
		local130.anInt3625 = local109.aByteArray32[arg2];
		local130.anInt3642 = arg2;
		local130.anInt3631 = local109.aByteArray34[arg2] * local109.anInt2731 * arg0 * arg0 + 1024 >> 11;
		local130.anInt3634 = local109.aByteArray33[arg2] & 0xFF;
		local130.anInt3626 = (arg2 << 8) - (local109.aShortArray33[arg2] & 0x7FFF);
		local130.anInt3632 = 0;
		local130.anInt3635 = -1;
		local130.anInt3624 = 0;
		local130.anInt3638 = 0;
		local130.anInt3636 = 0;
		if (this.anIntArray355[arg1] == 0) {
			local130.aClass4_Sub2_Sub2_3 = Static192.method1329(local117, this.method2801(local130), this.method2782(local130), this.method2792(local130));
		} else {
			local130.aClass4_Sub2_Sub2_3 = Static192.method1329(local117, this.method2801(local130), 0, this.method2792(local130));
			this.method2784(local109.aShortArray33[arg2] < 0, local130);
		}
		if (local109.aShortArray33[arg2] < 0) {
			local130.aClass4_Sub2_Sub2_3.method1335(-1);
		}
		if (local130.anInt3625 >= 0) {
			@Pc(281) Class4_Sub25 local281 = this.aClass4_Sub25ArrayArray2[arg1][local130.anInt3625];
			if (local281 != null && local281.anInt3635 < 0) {
				this.aClass4_Sub25ArrayArray1[arg1][local281.anInt3642] = null;
				local281.anInt3635 = 0;
			}
			this.aClass4_Sub25ArrayArray2[arg1][local130.anInt3625] = local130;
		}
		this.aClass4_Sub2_Sub3_1.aClass11_11.method272(local130);
		this.aClass4_Sub25ArrayArray1[arg1][arg2] = local130;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB[ILclient!u;)Z")
	public boolean method2796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub25 arg3) {
		arg3.anInt3630 = Static154.anInt4087 / 100;
		if (arg3.anInt3635 >= 0 && (arg3.aClass4_Sub2_Sub2_3 == null || arg3.aClass4_Sub2_Sub2_3.method1343())) {
			arg3.method2754();
			arg3.method3173();
			if (arg3.anInt3625 > 0 && this.aClass4_Sub25ArrayArray2[arg3.anInt3633][arg3.anInt3625] == arg3) {
				this.aClass4_Sub25ArrayArray2[arg3.anInt3633][arg3.anInt3625] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt3640;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray360[arg3.anInt3633] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt3640 = local56;
		}
		arg3.aClass4_Sub2_Sub2_3.method1321(this.method2801(arg3));
		arg3.anInt3644++;
		@Pc(104) boolean local104 = false;
		@Pc(107) Class67 local107 = arg3.aClass67_1;
		arg3.anInt3627 += local107.anInt2999;
		@Pc(138) double local138 = (double) ((arg3.anInt3642 - 60 << 8) + (arg3.anInt3640 * arg3.anInt3628 >> 12)) * 5.086263020833333E-6D;
		if (local107.anInt3000 > 0) {
			if (local107.anInt3001 > 0) {
				arg3.anInt3638 += (int) (Math.pow(2.0D, local138 * (double) local107.anInt3001) * 128.0D + 0.5D);
			} else {
				arg3.anInt3638 += 128;
			}
			if (arg3.anInt3638 * local107.anInt3000 >= 819200) {
				local104 = true;
			}
		}
		if (local107.aByteArray36 != null) {
			if (local107.anInt3005 > 0) {
				arg3.anInt3636 += (int) (Math.pow(2.0D, local138 * (double) local107.anInt3005) * 128.0D + 0.5D);
			} else {
				arg3.anInt3636 += 128;
			}
			while (arg3.anInt3624 < local107.aByteArray36.length - 2 && (local107.aByteArray36[arg3.anInt3624 + 2] & 0xFF) << 8 < arg3.anInt3636) {
				arg3.anInt3624 += 2;
			}
			if (local107.aByteArray36.length - 2 == arg3.anInt3624 && local107.aByteArray36[arg3.anInt3624 + 1] == 0) {
				local104 = true;
			}
		}
		if (arg3.anInt3635 >= 0 && local107.aByteArray35 != null && (this.anIntArray358[arg3.anInt3633] & 0x1) == 0 && (arg3.anInt3625 < 0 || arg3 != this.aClass4_Sub25ArrayArray2[arg3.anInt3633][arg3.anInt3625])) {
			if (local107.anInt3011 > 0) {
				arg3.anInt3635 += (int) (Math.pow(2.0D, (double) local107.anInt3011 * local138) * 128.0D + 0.5D);
			} else {
				arg3.anInt3635 += 128;
			}
			while (local107.aByteArray35.length - 2 > arg3.anInt3632 && arg3.anInt3635 > (local107.aByteArray35[arg3.anInt3632 + 2] & 0xFF) << 8) {
				arg3.anInt3632 += 2;
			}
			if (arg3.anInt3632 == local107.aByteArray35.length - 2) {
				local104 = true;
			}
		}
		if (!local104) {
			arg3.aClass4_Sub2_Sub2_3.method1342(arg3.anInt3630, this.method2782(arg3), this.method2792(arg3));
			return false;
		}
		arg3.aClass4_Sub2_Sub2_3.method1313(arg3.anInt3630);
		if (arg2 == null) {
			arg3.aClass4_Sub2_Sub2_3.method2773(arg1);
		} else {
			arg3.aClass4_Sub2_Sub2_3.method2769(arg2, arg0, arg1);
		}
		if (arg3.aClass4_Sub2_Sub2_3.method1307()) {
			this.aClass4_Sub2_Sub3_1.aClass4_Sub2_Sub1_2.method1076(arg3.aClass4_Sub2_Sub2_3);
		}
		arg3.method2754();
		if (arg3.anInt3635 >= 0) {
			arg3.method3173();
			if (arg3.anInt3625 > 0 && this.aClass4_Sub25ArrayArray2[arg3.anInt3633][arg3.anInt3625] == arg3) {
				this.aClass4_Sub25ArrayArray2[arg3.anInt3633][arg3.anInt3625] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(III)V")
	private void method2797() {
		this.anIntArray356[9] = 128;
		this.anIntArray368[9] = 128;
		this.method2794(128, 9);
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(III)V")
	public synchronized void method2798() {
		this.method2797();
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V")
	private void method2799(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2799(local12);
			}
			return;
		}
		this.anIntArray359[arg0] = 12800;
		this.anIntArray357[arg0] = 8192;
		this.anIntArray365[arg0] = 16383;
		this.anIntArray361[arg0] = 8192;
		this.anIntArray353[arg0] = 0;
		this.anIntArray360[arg0] = 8192;
		this.method2789(arg0);
		this.method2804(arg0);
		this.anIntArray358[arg0] = 0;
		this.anIntArray363[arg0] = 32767;
		this.anIntArray354[arg0] = 256;
		this.anIntArray355[arg0] = 0;
		this.method2788(arg0, 8192);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZI)V")
	private void method2800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray361[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!u;B)I")
	private int method2801(@OriginalArg(0) Class4_Sub25 arg0) {
		@Pc(21) int local21 = arg0.anInt3626 + (arg0.anInt3640 * arg0.anInt3628 >> 12);
		local21 += this.anIntArray354[arg0.anInt3633] * (this.anIntArray361[arg0.anInt3633] - 8192) >> 12;
		@Pc(42) Class67 local42 = arg0.aClass67_1;
		@Pc(59) int local59;
		if (local42.anInt2999 > 0 && (local42.anInt3003 > 0 || this.anIntArray353[arg0.anInt3633] > 0)) {
			local59 = local42.anInt3003 << 2;
			@Pc(64) int local64 = local42.anInt3002 << 1;
			if (arg0.anInt3644 < local64) {
				local59 = arg0.anInt3644 * local59 / local64;
			}
			local59 += this.anIntArray353[arg0.anInt3633] >> 7;
			@Pc(98) double local98 = Math.sin((double) (arg0.anInt3627 & 0x1FF) * 0.01227184630308513D);
			local21 += (int) (local98 * (double) local59);
		}
		local59 = (int) ((double) (arg0.aClass4_Sub12_Sub1_1.anInt3984 * 256) * Math.pow(2.0D, (double) local21 * 3.255208333333333E-4D) / (double) Static154.anInt4087 + 0.5D);
		return local59 < 1 ? 1 : local59;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2769(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass12_1.method292()) {
			@Pc(14) int local14 = this.anInt3695 * this.aClass12_1.anInt469 / Static154.anInt4087;
			do {
				@Pc(23) long local23 = this.aLong135 + (long) arg2 * (long) local14;
				if (this.aLong136 - local23 >= 0L) {
					this.aLong135 = local23;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local14 + this.aLong136 - this.aLong135 - 1L) / (long) local14);
				arg2 -= local51;
				this.aLong135 += (long) local51 * (long) local14;
				this.aClass4_Sub2_Sub3_1.method2769(arg0, arg1, local51);
				this.method2783();
				arg1 += local51;
			} while (this.aClass12_1.method292());
		}
		this.aClass4_Sub2_Sub3_1.method2769(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()I")
	@Override
	public synchronized int method2771() {
		return 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!sb;BLclient!le;Lclient!nh;I)Z")
	public synchronized boolean method2802(@OriginalArg(0) Class77 arg0, @OriginalArg(2) Class4_Sub15 arg1, @OriginalArg(3) Class62 arg2) {
		arg1.method1928();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class4_Sub10 local29 = (Class4_Sub10) arg1.aClass20_4.method504(); local29 != null; local29 = (Class4_Sub10) arg1.aClass20_4.method498()) {
			@Pc(35) int local35 = (int) local29.aLong148;
			@Pc(43) Class4_Sub17 local43 = (Class4_Sub17) this.aClass20_14.method505((long) local35);
			if (local43 == null) {
				local43 = Static67.method1472(local35, arg2);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass20_14.method499((long) local35, local43);
			}
			if (!local43.method2063(arg0, local29.aByteArray17, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method1926();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "(I)Z")
	public synchronized boolean method2803() {
		return this.aClass12_1.method292();
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(II)V")
	private void method2804(@OriginalArg(1) int arg0) {
		if ((this.anIntArray358[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class4_Sub25 local18 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method274(); local18 != null; local18 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method271()) {
			if (local18.anInt3633 == arg0) {
				local18.anInt3641 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BI)V")
	private void method2805(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub25 local12 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method274(); local12 != null; local12 = (Class4_Sub25) this.aClass4_Sub2_Sub3_1.aClass11_11.method271()) {
			if (arg0 < 0 || local12.anInt3633 == arg0) {
				if (local12.aClass4_Sub2_Sub2_3 != null) {
					local12.aClass4_Sub2_Sub2_3.method1313(Static154.anInt4087 / 100);
					if (local12.aClass4_Sub2_Sub2_3.method1307()) {
						this.aClass4_Sub2_Sub3_1.aClass4_Sub2_Sub1_2.method1076(local12.aClass4_Sub2_Sub2_3);
					}
					local12.method2754();
				}
				if (local12.anInt3635 < 0) {
					this.aClass4_Sub25ArrayArray1[local12.anInt3633][local12.anInt3642] = null;
				}
				local12.method3173();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V")
	public synchronized void method2806() {
		this.aClass12_1.method291();
		this.method2781();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!u;)Z")
	public boolean method2808(@OriginalArg(1) Class4_Sub25 arg0) {
		if (arg0.aClass4_Sub2_Sub2_3 != null) {
			return false;
		}
		if (arg0.anInt3635 >= 0) {
			arg0.method3173();
			if (arg0.anInt3625 > 0 && arg0 == this.aClass4_Sub25ArrayArray2[arg0.anInt3633][arg0.anInt3625]) {
				this.aClass4_Sub25ArrayArray2[arg0.anInt3633][arg0.anInt3625] = null;
			}
		}
		return true;
	}
}
