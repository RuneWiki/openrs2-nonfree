import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!lm", name = "Eb", descriptor = "I")
	private int anInt3241;

	@OriginalMember(owner = "client!lm", name = "Fb", descriptor = "I")
	private int anInt3242;

	@OriginalMember(owner = "client!lm", name = "Hb", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!lm", name = "Ib", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!lm", name = "Jb", descriptor = "J")
	private long aLong116;

	@OriginalMember(owner = "client!lm", name = "Kb", descriptor = "I")
	private int anInt3243;

	@OriginalMember(owner = "client!lm", name = "Lb", descriptor = "Lclient!qk;")
	private Class1_Sub26 aClass1_Sub26_1;

	@OriginalMember(owner = "client!lm", name = "Mb", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "[[Lclient!ja;")
	private Class1_Sub14[][] aClass1_Sub14ArrayArray2 = new Class1_Sub14[16][128];

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "[I")
	public int[] anIntArray279 = new int[16];

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	private int anInt3197 = 256;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "[[Lclient!ja;")
	private Class1_Sub14[][] aClass1_Sub14ArrayArray1 = new Class1_Sub14[16][128];

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "[I")
	public int[] anIntArray280 = new int[16];

	@OriginalMember(owner = "client!lm", name = "bb", descriptor = "[I")
	private int[] anIntArray284 = new int[16];

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[I")
	private int[] anIntArray278 = new int[16];

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "[I")
	private int[] anIntArray281 = new int[16];

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "[I")
	private int[] anIntArray276 = new int[16];

	@OriginalMember(owner = "client!lm", name = "S", descriptor = "[I")
	private int[] anIntArray282 = new int[16];

	@OriginalMember(owner = "client!lm", name = "hb", descriptor = "[I")
	private int[] anIntArray285 = new int[16];

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "[I")
	private int[] anIntArray277 = new int[16];

	@OriginalMember(owner = "client!lm", name = "mb", descriptor = "[I")
	private int[] anIntArray287 = new int[16];

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	private int anInt3200 = 1000000;

	@OriginalMember(owner = "client!lm", name = "rb", descriptor = "[I")
	private int[] anIntArray289 = new int[16];

	@OriginalMember(owner = "client!lm", name = "tb", descriptor = "[I")
	private int[] anIntArray290 = new int[16];

	@OriginalMember(owner = "client!lm", name = "pb", descriptor = "[I")
	private int[] anIntArray288 = new int[16];

	@OriginalMember(owner = "client!lm", name = "yb", descriptor = "[I")
	private int[] anIntArray291 = new int[16];

	@OriginalMember(owner = "client!lm", name = "kb", descriptor = "[I")
	private int[] anIntArray286 = new int[16];

	@OriginalMember(owner = "client!lm", name = "Z", descriptor = "[I")
	public int[] anIntArray283 = new int[16];

	@OriginalMember(owner = "client!lm", name = "Bb", descriptor = "Lclient!ec;")
	private Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!lm", name = "Gb", descriptor = "Lclient!qo;")
	private Class1_Sub7_Sub4 aClass1_Sub7_Sub4_1 = new Class1_Sub7_Sub4(this);

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "Lclient!il;")
	private Class86 aClass86_17 = new Class86(128);

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	public Class1_Sub7_Sub2() {
		this.method2760();
		this.method2792(true);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	private void method2758(@OriginalArg(0) int arg0) {
		if ((this.anIntArray279[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub14 local18 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2340(); local18 != null; local18 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2342()) {
			if (arg0 == local18.anInt2475 && this.aClass1_Sub14ArrayArray1[arg0][local18.anInt2491] == null && local18.anInt2476 < 0) {
				local18.anInt2476 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public synchronized void method2759() {
		for (@Pc(19) Class1_Sub3 local19 = (Class1_Sub3) this.aClass86_17.method2134(); local19 != null; local19 = (Class1_Sub3) this.aClass86_17.method2141()) {
			local19.method4573();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BII)V")
	private synchronized void method2760() {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			this.anIntArray276[local8] = 256;
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)I")
	public int method2761() {
		return this.anInt3197;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	public synchronized void method2762(@OriginalArg(0) int arg0) {
		this.anInt3197 = arg0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)V")
	public synchronized void method2763() {
		this.method2771();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(III)V")
	private void method2764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray291[arg1] = arg0;
		this.anIntArray283[arg1] = (int) ((double) 2097152 * Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) + 0.5D);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!ja;B)V")
	public void method2765(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub23_Sub1_1.aByteArray133.length;
		@Pc(47) int local47;
		if (arg0 && arg1.aClass1_Sub23_Sub1_1.aBoolean355) {
			@Pc(30) int local30 = local8 + local8 - arg1.aClass1_Sub23_Sub1_1.anInt4003;
			local8 <<= 0x8;
			local47 = (int) ((long) this.anIntArray280[arg1.anInt2475] * (long) local30 >> 6);
			if (local8 <= local47) {
				arg1.aClass1_Sub7_Sub1_1.method846();
				local47 = local8 + local8 - local47 - 1;
			}
		} else {
			local47 = (int) ((long) local8 * (long) this.anIntArray280[arg1.anInt2475] >> 6);
		}
		arg1.aClass1_Sub7_Sub1_1.method812(local47);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(III)V")
	private void method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray278[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!qk;ZIZ)V")
	private synchronized void method2768(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		this.method2781(arg2);
		this.aClass41_1.method1064(arg0.aByteArray147);
		this.aLong115 = 0L;
		this.aBoolean279 = arg1;
		@Pc(24) int local24 = this.aClass41_1.method1067();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass41_1.method1058(local26);
			this.aClass41_1.method1069(local26);
			this.aClass41_1.method1055(local26);
		}
		this.anInt3242 = this.aClass41_1.method1068();
		this.anInt3241 = this.aClass41_1.anIntArray100[this.anInt3242];
		this.aLong116 = this.aClass41_1.method1054(this.anInt3241);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[IIILclient!ja;)Z")
	public boolean method2769(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub14 arg3) {
		arg3.anInt2477 = Static69.anInt1498 / 100;
		if (arg3.anInt2476 >= 0 && (arg3.aClass1_Sub7_Sub1_1 == null || arg3.aClass1_Sub7_Sub1_1.method834())) {
			arg3.method2211();
			arg3.method4573();
			if (arg3.anInt2479 > 0 && arg3 == this.aClass1_Sub14ArrayArray2[arg3.anInt2475][arg3.anInt2479]) {
				this.aClass1_Sub14ArrayArray2[arg3.anInt2475][arg3.anInt2479] = null;
			}
			return true;
		}
		@Pc(54) boolean local54 = false;
		@Pc(57) int local57 = arg3.anInt2482;
		if (local57 > 0) {
			local57 -= (int) (Math.pow(2.0D, (double) this.anIntArray284[arg3.anInt2475] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local57 < 0) {
				local57 = 0;
			}
			arg3.anInt2482 = local57;
		}
		arg3.aClass1_Sub7_Sub1_1.method818(this.method2791(arg3));
		@Pc(97) Class162 local97 = arg3.aClass162_1;
		arg3.anInt2481 += local97.anInt4834;
		@Pc(123) double local123 = (double) ((arg3.anInt2491 - 60 << 8) + (arg3.anInt2482 * arg3.anInt2484 >> 12)) * 5.086263020833333E-6D;
		arg3.anInt2472++;
		if (local97.anInt4831 > 0) {
			if (local97.anInt4829 <= 0) {
				arg3.anInt2471 += 128;
			} else {
				arg3.anInt2471 += (int) (Math.pow(2.0D, local123 * (double) local97.anInt4829) * 128.0D + 0.5D);
			}
			if (local97.anInt4831 * arg3.anInt2471 >= 819200) {
				local54 = true;
			}
		}
		if (local97.aByteArray168 != null) {
			if (local97.anInt4822 <= 0) {
				arg3.anInt2486 += 128;
			} else {
				arg3.anInt2486 += (int) (Math.pow(2.0D, (double) local97.anInt4822 * local123) * 128.0D + 0.5D);
			}
			while (local97.aByteArray168.length - 2 > arg3.anInt2493 && (local97.aByteArray168[arg3.anInt2493 + 2] & 0xFF) << 8 < arg3.anInt2486) {
				arg3.anInt2493 += 2;
			}
			if (local97.aByteArray168.length - 2 == arg3.anInt2493 && local97.aByteArray168[arg3.anInt2493 + 1] == 0) {
				local54 = true;
			}
		}
		if (arg3.anInt2476 >= 0 && local97.aByteArray167 != null && (this.anIntArray279[arg3.anInt2475] & 0x1) == 0 && (arg3.anInt2479 < 0 || this.aClass1_Sub14ArrayArray2[arg3.anInt2475][arg3.anInt2479] != arg3)) {
			if (local97.anInt4823 <= 0) {
				arg3.anInt2476 += 128;
			} else {
				arg3.anInt2476 += (int) (Math.pow(2.0D, (double) local97.anInt4823 * local123) * 128.0D + 0.5D);
			}
			while (arg3.anInt2490 < local97.aByteArray167.length - 2 && (local97.aByteArray167[arg3.anInt2490 + 2] & 0xFF) << 8 < arg3.anInt2476) {
				arg3.anInt2490 += 2;
			}
			if (local97.aByteArray167.length - 2 == arg3.anInt2490) {
				local54 = true;
			}
		}
		if (!local54) {
			arg3.aClass1_Sub7_Sub1_1.method814(arg3.anInt2477, this.method2788(arg3), this.method2776(arg3));
			return false;
		}
		arg3.aClass1_Sub7_Sub1_1.method823(arg3.anInt2477);
		if (arg0 == null) {
			arg3.aClass1_Sub7_Sub1_1.method3726(arg2);
		} else {
			arg3.aClass1_Sub7_Sub1_1.method3725(arg0, arg1, arg2);
		}
		if (arg3.aClass1_Sub7_Sub1_1.method819()) {
			this.aClass1_Sub7_Sub4_1.aClass1_Sub7_Sub3_2.method3615(arg3.aClass1_Sub7_Sub1_1);
		}
		arg3.method2211();
		if (arg3.anInt2476 >= 0) {
			arg3.method4573();
			if (arg3.anInt2479 > 0 && this.aClass1_Sub14ArrayArray2[arg3.anInt2475][arg3.anInt2479] == arg3) {
				this.aClass1_Sub14ArrayArray2[arg3.anInt2475][arg3.anInt2479] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
	private void method2770(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (local15 == 128) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			this.method2782(local29, local35, local23);
		} else if (local15 == 144) {
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			local23 = arg0 & 0xF;
			if (local35 <= 0) {
				this.method2782(local29, 64, local23);
			} else {
				this.method2789(local35, local29, local23);
			}
		} else if (local15 == 160) {
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			local23 = arg0 & 0xF;
			this.method2775(local23, local35, local29);
		} else if (local15 == 176) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			local35 = arg0 >> 16 & 0x7F;
			if (local29 == 0) {
				this.anIntArray290[local23] = (local35 << 14) + (this.anIntArray290[local23] & 0xFFE03FFF);
			}
			if (local29 == 32) {
				this.anIntArray290[local23] = (local35 << 7) + (this.anIntArray290[local23] & 0xFFFFC07F);
			}
			if (local29 == 1) {
				this.anIntArray282[local23] = (this.anIntArray282[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 33) {
				this.anIntArray282[local23] = local35 + (this.anIntArray282[local23] & 0xFFFFFF80);
			}
			if (local29 == 5) {
				this.anIntArray284[local23] = (this.anIntArray284[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 37) {
				this.anIntArray284[local23] = local35 + (this.anIntArray284[local23] & 0xFFFFFF80);
			}
			if (local29 == 7) {
				this.anIntArray289[local23] = (this.anIntArray289[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 39) {
				this.anIntArray289[local23] = (this.anIntArray289[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 10) {
				this.anIntArray285[local23] = (local35 << 7) + (this.anIntArray285[local23] & 0xFFFFC07F);
			}
			if (local29 == 42) {
				this.anIntArray285[local23] = (this.anIntArray285[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 11) {
				this.anIntArray277[local23] = (this.anIntArray277[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 43) {
				this.anIntArray277[local23] = local35 + (this.anIntArray277[local23] & 0xFFFFFF80);
			}
			if (local29 == 64) {
				if (local35 >= 64) {
					this.anIntArray279[local23] |= 0x1;
				} else {
					this.anIntArray279[local23] &= 0xFFFFFFFE;
				}
			}
			if (local29 == 65) {
				if (local35 < 64) {
					this.method2758(local23);
					this.anIntArray279[local23] &= 0xFFFFFFFD;
				} else {
					this.anIntArray279[local23] |= 0x2;
				}
			}
			if (local29 == 99) {
				this.anIntArray281[local23] = (local35 << 7) + (this.anIntArray281[local23] & 0x7F);
			}
			if (local29 == 98) {
				this.anIntArray281[local23] = (this.anIntArray281[local23] & 0x3F80) + local35;
			}
			if (local29 == 101) {
				this.anIntArray281[local23] = (local35 << 7) + (this.anIntArray281[local23] & 0x7F) + 16384;
			}
			if (local29 == 100) {
				this.anIntArray281[local23] = (this.anIntArray281[local23] & 0x3F80) + local35 + 16384;
			}
			if (local29 == 120) {
				this.method2779(local23);
			}
			if (local29 == 121) {
				this.method2772(local23);
			}
			if (local29 == 123) {
				this.method2778(local23);
			}
			@Pc(515) int local515;
			if (local29 == 6) {
				local515 = this.anIntArray281[local23];
				if (local515 == 16384) {
					this.anIntArray287[local23] = (local35 << 7) + (this.anIntArray287[local23] & 0xFFFFC07F);
				}
			}
			if (local29 == 38) {
				local515 = this.anIntArray281[local23];
				if (local515 == 16384) {
					this.anIntArray287[local23] = local35 + (this.anIntArray287[local23] & 0xFFFFFF80);
				}
			}
			if (local29 == 16) {
				this.anIntArray280[local23] = (this.anIntArray280[local23] & 0xFFFFC07F) + (local35 << 7);
			}
			if (local29 == 48) {
				this.anIntArray280[local23] = (this.anIntArray280[local23] & 0xFFFFFF80) + local35;
			}
			if (local29 == 81) {
				if (local35 >= 64) {
					this.anIntArray279[local23] |= 0x4;
				} else {
					this.method2784(local23);
					this.anIntArray279[local23] &= 0xFFFFFFFB;
				}
			}
			if (local29 == 17) {
				this.method2764((this.anIntArray291[local23] & 0xFFFFC07F) + (local35 << 7), local23);
			}
			if (local29 == 49) {
				this.method2764((this.anIntArray291[local23] & 0xFFFFFF80) + local35, local23);
			}
		} else if (local15 == 192) {
			local29 = arg0 >> 8 & 0x7F;
			local23 = arg0 & 0xF;
			this.method2780(local23, this.anIntArray290[local23] + local29);
		} else if (local15 == 208) {
			local23 = arg0 & 0xF;
			local29 = arg0 >> 8 & 0x7F;
			this.method2773(local29, local23);
		} else if (local15 == 224) {
			local23 = arg0 & 0xF;
			local29 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method2766(local23, local29);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method2792(true);
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IBI)V")
	private void method2771() {
		this.anIntArray288[9] = 128;
		this.anIntArray290[9] = 128;
		this.method2780(9, 128);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3728() {
		return 0;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method3726(@OriginalArg(0) int arg0) {
		if (this.aClass41_1.method1061()) {
			@Pc(14) int local14 = this.anInt3200 * this.aClass41_1.anInt1263 / Static69.anInt1498;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg0 + this.aLong115;
				if (this.aLong116 - local23 >= 0L) {
					this.aLong115 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong116 - this.aLong115 - 1L) / (long) local14);
				arg0 -= local53;
				this.aLong115 += (long) local14 * (long) local53;
				this.aClass1_Sub7_Sub4_1.method3726(local53);
				this.method2787();
			} while (this.aClass41_1.method1061());
		}
		this.aClass1_Sub7_Sub4_1.method3726(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BI)V")
	private void method2772(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method2772(local10);
			}
			return;
		}
		this.anIntArray289[arg0] = 12800;
		this.anIntArray285[arg0] = 8192;
		this.anIntArray277[arg0] = 16383;
		this.anIntArray278[arg0] = 8192;
		this.anIntArray282[arg0] = 0;
		this.anIntArray284[arg0] = 8192;
		this.method2758(arg0);
		this.method2784(arg0);
		this.anIntArray279[arg0] = 0;
		this.anIntArray281[arg0] = 32767;
		this.anIntArray287[arg0] = 256;
		this.anIntArray280[arg0] = 0;
		this.method2764(8192, arg0);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(III)V")
	private void method2773(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!ja;)Z")
	public boolean method2774(@OriginalArg(1) Class1_Sub14 arg0) {
		if (arg0.aClass1_Sub7_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt2476 >= 0) {
			arg0.method4573();
			if (arg0.anInt2479 > 0 && arg0 == this.aClass1_Sub14ArrayArray2[arg0.anInt2475][arg0.anInt2479]) {
				this.aClass1_Sub14ArrayArray2[arg0.anInt2475][arg0.anInt2479] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V")
	private void method2775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "()Lclient!ro;")
	@Override
	public synchronized Class1_Sub7 method3724() {
		return this.aClass1_Sub7_Sub4_1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!ja;I)I")
	private int method2776(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(9) int local9 = this.anIntArray285[arg0.anInt2475];
		return local9 < 8192 ? arg0.anInt2494 * local9 + 32 >> 6 : 16384 - ((128 - arg0.anInt2494) * (16384 - local9) + 32 >> 6);
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
	public synchronized void method2777() {
		this.method2781(true);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	private void method2778(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class1_Sub14 local16 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2340(); local16 != null; local16 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2342()) {
			if ((arg0 < 0 || local16.anInt2475 == arg0) && local16.anInt2476 < 0) {
				this.aClass1_Sub14ArrayArray1[local16.anInt2475][local16.anInt2491] = null;
				local16.anInt2476 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(BI)V")
	private void method2779(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class1_Sub14 local16 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2340(); local16 != null; local16 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2342()) {
			if (arg0 < 0 || local16.anInt2475 == arg0) {
				if (local16.aClass1_Sub7_Sub1_1 != null) {
					local16.aClass1_Sub7_Sub1_1.method823(Static69.anInt1498 / 100);
					if (local16.aClass1_Sub7_Sub1_1.method819()) {
						this.aClass1_Sub7_Sub4_1.aClass1_Sub7_Sub3_2.method3615(local16.aClass1_Sub7_Sub1_1);
					}
					local16.method2211();
				}
				if (local16.anInt2476 < 0) {
					this.aClass1_Sub14ArrayArray1[local16.anInt2475][local16.anInt2491] = null;
				}
				local16.method4573();
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(III)V")
	private void method2780(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray286[arg0] != arg1) {
			this.anIntArray286[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub14ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZ)V")
	private synchronized void method2781(@OriginalArg(1) boolean arg0) {
		this.aClass41_1.method1057();
		this.aClass1_Sub26_1 = null;
		this.method2792(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIBI)V")
	private void method2782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub14 local12 = this.aClass1_Sub14ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub14ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray279[arg2] & 0x2) == 0) {
			local12.anInt2476 = 0;
			return;
		}
		for (@Pc(47) Class1_Sub14 local47 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2340(); local47 != null; local47 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2342()) {
			if (local47.anInt2475 == local12.anInt2475 && local47.anInt2476 < 0 && local47 != local12) {
				local12.anInt2476 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!nm;ILclient!g;Lclient!qk;B)Z")
	public synchronized boolean method2783(@OriginalArg(0) Class119 arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) Class1_Sub26 arg2) {
		arg2.method3675();
		@Pc(16) boolean local16 = true;
		@Pc(30) int[] local30 = new int[] { 22050 };
		for (@Pc(36) Class1_Sub27 local36 = (Class1_Sub27) arg2.aClass86_28.method2134(); local36 != null; local36 = (Class1_Sub27) arg2.aClass86_28.method2141()) {
			@Pc(42) int local42 = (int) local36.aLong210;
			@Pc(50) Class1_Sub3 local50 = (Class1_Sub3) this.aClass86_17.method2136((long) local42);
			if (local50 == null) {
				local50 = Static66.method1153(arg0, local42);
				if (local50 == null) {
					local16 = false;
					continue;
				}
				this.aClass86_17.method2144(local50, (long) local42);
			}
			if (!local50.method63(arg1, local30, local36.aByteArray149)) {
				local16 = false;
			}
		}
		if (local16) {
			arg2.method3674();
		}
		return local16;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
	private void method2784(@OriginalArg(1) int arg0) {
		if ((this.anIntArray279[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(21) Class1_Sub14 local21 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2340(); local21 != null; local21 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2342()) {
			if (local21.anInt2475 == arg0) {
				local21.anInt2480 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)Z")
	public synchronized boolean method2785() {
		return this.aClass41_1.method1061();
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V")
	public synchronized void method2786() {
		for (@Pc(11) Class1_Sub3 local11 = (Class1_Sub3) this.aClass86_17.method2134(); local11 != null; local11 = (Class1_Sub3) this.aClass86_17.method2141()) {
			local11.method65();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3725(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass41_1.method1061()) {
			@Pc(19) int local19 = this.aClass41_1.anInt1263 * this.anInt3200 / Static69.anInt1498;
			do {
				@Pc(28) long local28 = (long) arg2 * (long) local19 + this.aLong115;
				if (this.aLong116 - local28 >= 0L) {
					this.aLong115 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local19 + this.aLong116 - this.aLong115 - 1L) / (long) local19);
				this.aLong115 += (long) local58 * (long) local19;
				this.aClass1_Sub7_Sub4_1.method3725(arg0, arg1, local58);
				this.method2787();
				arg2 -= local58;
				arg1 += local58;
			} while (this.aClass41_1.method1061());
		}
		this.aClass1_Sub7_Sub4_1.method3725(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "()Lclient!ro;")
	@Override
	public synchronized Class1_Sub7 method3722() {
		return null;
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)V")
	private void method2787() {
		@Pc(8) int local8 = this.anInt3242;
		@Pc(18) int local18 = this.anInt3241;
		@Pc(21) long local21 = this.aLong116;
		if (this.aClass1_Sub26_1 != null && local18 == this.anInt3243) {
			this.method2768(this.aClass1_Sub26_1, this.aBoolean279, this.aBoolean280);
			this.method2787();
			return;
		}
		while (this.anInt3241 == local18) {
			while (local18 == this.aClass41_1.anIntArray100[local8]) {
				this.aClass41_1.method1058(local8);
				@Pc(74) int local74 = this.aClass41_1.method1062(local8);
				if (local74 == 1) {
					this.aClass41_1.method1063();
					this.aClass41_1.method1055(local8);
					if (this.aClass41_1.method1065()) {
						if (this.aClass1_Sub26_1 != null) {
							this.method2790(this.aBoolean279, this.aClass1_Sub26_1);
							this.method2787();
							return;
						}
						if (!this.aBoolean279 || local18 == 0) {
							this.method2792(true);
							this.aClass41_1.method1057();
							return;
						}
						this.aClass41_1.method1066(local21);
					}
					break;
				}
				if ((local74 & 0x80) != 0) {
					this.method2770(local74);
				}
				this.aClass41_1.method1069(local8);
				this.aClass41_1.method1055(local8);
			}
			local8 = this.aClass41_1.method1068();
			local18 = this.aClass41_1.anIntArray100[local8];
			local21 = this.aClass41_1.method1054(local18);
		}
		this.aLong116 = local21;
		this.anInt3241 = local18;
		this.anInt3242 = local8;
		if (this.aClass1_Sub26_1 != null && local18 > this.anInt3243) {
			this.anInt3241 = this.anInt3243;
			this.anInt3242 = -1;
			this.aLong116 = this.aClass41_1.method1054(this.anInt3241);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!ja;)I")
	private int method2788(@OriginalArg(1) Class1_Sub14 arg0) {
		if (this.anIntArray276[arg0.anInt2475] == 0) {
			return 0;
		}
		@Pc(36) int local36 = this.anIntArray277[arg0.anInt2475] * this.anIntArray289[arg0.anInt2475] + 4096 >> 13;
		@Pc(39) Class162 local39 = arg0.aClass162_1;
		@Pc(47) int local47 = local36 * local36 + 16384 >> 15;
		@Pc(56) int local56 = arg0.anInt2483 * local47 + 16384 >> 15;
		@Pc(65) int local65 = this.anInt3197 * local56 + 128 >> 8;
		local36 = local65 * this.anIntArray276[arg0.anInt2475] + 128 >> 8;
		if (local39.anInt4831 > 0) {
			local36 = (int) ((double) local36 * Math.pow(0.5D, (double) local39.anInt4831 * 1.953125E-5D * (double) arg0.anInt2471) + 0.5D);
		}
		@Pc(110) int local110;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(153) int local153;
		if (local39.aByteArray168 != null) {
			local110 = arg0.anInt2486;
			local118 = local39.aByteArray168[arg0.anInt2493 + 1];
			if (arg0.anInt2493 < local39.aByteArray168.length - 2) {
				local141 = (local39.aByteArray168[arg0.anInt2493] & 0xFF) << 8;
				local153 = (local39.aByteArray168[arg0.anInt2493 + 2] & 0xFF) << 8;
				local118 += (local39.aByteArray168[arg0.anInt2493 + 3] - local118) * (-local141 + local110) / (local153 - local141);
			}
			local36 = local118 * local36 + 32 >> 6;
		}
		if (arg0.anInt2476 > 0 && local39.aByteArray167 != null) {
			local118 = local39.aByteArray167[arg0.anInt2490 + 1];
			local110 = arg0.anInt2476;
			if (arg0.anInt2490 < local39.aByteArray167.length - 2) {
				local141 = (local39.aByteArray167[arg0.anInt2490] & 0xFF) << 8;
				local153 = (local39.aByteArray167[arg0.anInt2490 + 2] & 0xFF) << 8;
				local118 += (local39.aByteArray167[arg0.anInt2490 + 3] - local118) * (-local141 + local110) / (local153 - local141);
			}
			local36 = local118 * local36 + 32 >> 6;
		}
		return local36;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIII)V")
	private void method2789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2782(arg1, 64, arg2);
		if ((this.anIntArray279[arg2] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub14 local25 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2345(); local25 != null; local25 = (Class1_Sub14) this.aClass1_Sub7_Sub4_1.aClass96_21.method2347()) {
				if (arg2 == local25.anInt2475 && local25.anInt2476 < 0) {
					this.aClass1_Sub14ArrayArray1[arg2][local25.anInt2491] = null;
					this.aClass1_Sub14ArrayArray1[arg2][arg1] = local25;
					@Pc(68) int local68 = (local25.anInt2484 * local25.anInt2482 >> 12) + local25.anInt2488;
					local25.anInt2482 = 4096;
					local25.anInt2488 += arg1 - local25.anInt2491 << 8;
					local25.anInt2484 = local68 - local25.anInt2488;
					local25.anInt2491 = arg1;
					return;
				}
			}
		}
		@Pc(115) Class1_Sub3 local115 = (Class1_Sub3) this.aClass86_17.method2136((long) this.anIntArray286[arg2]);
		if (local115 == null) {
			return;
		}
		@Pc(124) Class1_Sub23_Sub1 local124 = local115.aClass1_Sub23_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(132) Class1_Sub14 local132 = new Class1_Sub14();
		local132.aClass1_Sub3_1 = local115;
		local132.anInt2475 = arg2;
		local132.aClass1_Sub23_Sub1_1 = local124;
		local132.aClass162_1 = local115.aClass162Array1[arg1];
		local132.anInt2479 = local115.aByteArray7[arg1];
		local132.anInt2491 = arg1;
		local132.anInt2483 = local115.aByteArray8[arg1] * arg0 * arg0 * local115.anInt115 + 1024 >> 11;
		local132.anInt2494 = local115.aByteArray6[arg1] & 0xFF;
		local132.anInt2488 = (arg1 << 8) - (local115.aShortArray1[arg1] & 0x7FFF);
		local132.anInt2486 = 0;
		local132.anInt2471 = 0;
		local132.anInt2476 = -1;
		local132.anInt2490 = 0;
		local132.anInt2493 = 0;
		if (this.anIntArray280[arg2] == 0) {
			local132.aClass1_Sub7_Sub1_1 = Static316.method831(local124, this.method2791(local132), this.method2788(local132), this.method2776(local132));
		} else {
			local132.aClass1_Sub7_Sub1_1 = Static316.method831(local124, this.method2791(local132), 0, this.method2776(local132));
			this.method2765(local115.aShortArray1[arg1] < 0, local132);
		}
		if (local115.aShortArray1[arg1] < 0) {
			local132.aClass1_Sub7_Sub1_1.method825(-1);
		}
		if (local132.anInt2479 >= 0) {
			@Pc(293) Class1_Sub14 local293 = this.aClass1_Sub14ArrayArray2[arg2][local132.anInt2479];
			if (local293 != null && local293.anInt2476 < 0) {
				this.aClass1_Sub14ArrayArray1[arg2][local293.anInt2491] = null;
				local293.anInt2476 = 0;
			}
			this.aClass1_Sub14ArrayArray2[arg2][local132.anInt2479] = local132;
		}
		this.aClass1_Sub7_Sub4_1.aClass96_21.method2336(local132);
		this.aClass1_Sub14ArrayArray1[arg2][arg1] = local132;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!qk;I)V")
	public synchronized void method2790(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub26 arg1) {
		this.method2768(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BLclient!ja;)I")
	private int method2791(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(15) int local15 = arg0.anInt2488 + (arg0.anInt2484 * arg0.anInt2482 >> 12);
		@Pc(18) Class162 local18 = arg0.aClass162_1;
		local15 += (this.anIntArray278[arg0.anInt2475] - 8192) * this.anIntArray287[arg0.anInt2475] >> 12;
		@Pc(58) int local58;
		if (local18.anInt4834 > 0 && (local18.anInt4827 > 0 || this.anIntArray282[arg0.anInt2475] > 0)) {
			local58 = local18.anInt4827 << 2;
			@Pc(63) int local63 = local18.anInt4826 << 1;
			if (arg0.anInt2472 < local63) {
				local58 = arg0.anInt2472 * local58 / local63;
			}
			local58 += this.anIntArray282[arg0.anInt2475] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt2481 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local58 * local97);
		}
		local58 = (int) ((double) (arg0.aClass1_Sub23_Sub1_1.anInt4002 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static69.anInt1498 + 0.5D);
		return local58 < 1 ? 1 : local58;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(BZ)V")
	private void method2792(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method2779(-1);
		} else {
			this.method2778(-1);
		}
		this.method2772(-1);
		@Pc(31) int local31;
		for (local31 = 0; local31 < 16; local31++) {
			this.anIntArray286[local31] = this.anIntArray288[local31];
		}
		for (local31 = 0; local31 < 16; local31++) {
			this.anIntArray290[local31] = this.anIntArray288[local31] & 0xFFFFFF80;
		}
	}
}
