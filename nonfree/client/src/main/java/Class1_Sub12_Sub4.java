import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class1_Sub12_Sub4 extends Class1_Sub12 {

	@OriginalMember(owner = "client!sc", name = "Jb", descriptor = "J")
	private long aLong129;

	@OriginalMember(owner = "client!sc", name = "Kb", descriptor = "Z")
	private boolean aBoolean282;

	@OriginalMember(owner = "client!sc", name = "Lb", descriptor = "J")
	private long aLong130;

	@OriginalMember(owner = "client!sc", name = "Mb", descriptor = "I")
	private int anInt3684;

	@OriginalMember(owner = "client!sc", name = "Nb", descriptor = "I")
	private int anInt3685;

	@OriginalMember(owner = "client!sc", name = "F", descriptor = "[I")
	private final int[] anIntArray369 = new int[16];

	@OriginalMember(owner = "client!sc", name = "u", descriptor = "[I")
	private final int[] anIntArray366 = new int[16];

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
	private final int[] anIntArray368 = new int[16];

	@OriginalMember(owner = "client!sc", name = "S", descriptor = "[I")
	private final int[] anIntArray372 = new int[16];

	@OriginalMember(owner = "client!sc", name = "eb", descriptor = "[I")
	private final int[] anIntArray376 = new int[16];

	@OriginalMember(owner = "client!sc", name = "I", descriptor = "[I")
	private final int[] anIntArray371 = new int[16];

	@OriginalMember(owner = "client!sc", name = "O", descriptor = "[[Lclient!kc;")
	private final Class1_Sub13[][] aClass1_Sub13ArrayArray1 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!sc", name = "db", descriptor = "[I")
	private final int[] anIntArray375 = new int[16];

	@OriginalMember(owner = "client!sc", name = "H", descriptor = "[I")
	private final int[] anIntArray370 = new int[16];

	@OriginalMember(owner = "client!sc", name = "kb", descriptor = "[I")
	private final int[] anIntArray378 = new int[16];

	@OriginalMember(owner = "client!sc", name = "fb", descriptor = "[I")
	private final int[] anIntArray377 = new int[16];

	@OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
	private int anInt3650 = 256;

	@OriginalMember(owner = "client!sc", name = "B", descriptor = "I")
	private final int anInt3646 = 1000000;

	@OriginalMember(owner = "client!sc", name = "bb", descriptor = "[I")
	private final int[] anIntArray374 = new int[16];

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
	public final int[] anIntArray367 = new int[16];

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[I")
	private final int[] anIntArray373 = new int[16];

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "[[Lclient!kc;")
	private final Class1_Sub13[][] aClass1_Sub13ArrayArray2 = new Class1_Sub13[16][128];

	@OriginalMember(owner = "client!sc", name = "xb", descriptor = "[I")
	public final int[] anIntArray380 = new int[16];

	@OriginalMember(owner = "client!sc", name = "tb", descriptor = "[I")
	public final int[] anIntArray379 = new int[16];

	@OriginalMember(owner = "client!sc", name = "mb", descriptor = "Lclient!uf;")
	private final Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!sc", name = "Ib", descriptor = "Lclient!qc;")
	private final Class1_Sub12_Sub3 aClass1_Sub12_Sub3_1 = new Class1_Sub12_Sub3(this);

	@OriginalMember(owner = "client!sc", name = "Y", descriptor = "Lclient!l;")
	private final Class45 aClass45_14 = new Class45(128);

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class1_Sub12_Sub4() {
		this.method2635();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	private void method2635() {
		this.method2665(-1);
		this.method2647(-1);
		for (@Pc(21) int local21 = 0; local21 < 16; local21++) {
			this.anIntArray378[local21] = this.anIntArray373[local21];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray370[local39] = this.anIntArray373[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method2633(@OriginalArg(0) int arg0) {
		if (this.aClass87_1.method2899()) {
			@Pc(18) int local18 = this.anInt3646 * this.aClass87_1.anInt3968 / Static135.anInt3382;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong130;
				if (this.aLong129 - local27 >= 0L) {
					this.aLong130 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong129 - this.aLong130 - 1L) / (long) local18);
				arg0 -= local58;
				this.aLong130 += (long) local18 * (long) local58;
				this.aClass1_Sub12_Sub3_1.method2633(local58);
				this.method2639();
			} while (this.aClass87_1.method2899());
		}
		this.aClass1_Sub12_Sub3_1.method2633(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIII)V")
	private void method2636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub13 local8 = this.aClass1_Sub13ArrayArray1[arg2][arg1];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub13ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray367[arg2] & 0x2) == 0) {
			local8.anInt2524 = 0;
			return;
		}
		for (@Pc(50) Class1_Sub13 local50 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2849(); local50 != null; local50 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2855()) {
			if (local8.anInt2527 == local50.anInt2527 && local50.anInt2524 < 0 && local8 != local50) {
				local8.anInt2524 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!wh;ZLclient!ag;Lclient!qf;I)Z")
	public synchronized boolean method2637(@OriginalArg(0) Class1_Sub25 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class72 arg2) {
		arg0.method3063();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class1_Sub21 local26 = (Class1_Sub21) arg0.aClass45_15.method1982(); local26 != null; local26 = (Class1_Sub21) arg0.aClass45_15.method1986()) {
			@Pc(32) int local32 = (int) local26.aLong158;
			@Pc(40) Class1_Sub19 local40 = (Class1_Sub19) this.aClass45_14.method1988((long) local32);
			if (local40 == null) {
				local40 = Static28.method836(arg1, local32);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass45_14.method1981(local40, (long) local32);
			}
			if (!local40.method2593(local20, local26.aByteArray43, arg2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method3062();
		}
		return local9;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)V")
	public synchronized void method2638() {
		this.method2645();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()Lclient!ve;")
	@Override
	public synchronized Class1_Sub12 method2629() {
		return null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
	private void method2639() {
		@Pc(8) int local8 = this.anInt3684;
		@Pc(11) int local11 = this.anInt3685;
		@Pc(14) long local14 = this.aLong129;
		while (local11 == this.anInt3685) {
			while (local11 == this.aClass87_1.anIntArray440[local8]) {
				this.aClass87_1.method2898(local8);
				@Pc(25) int local25 = this.aClass87_1.method2905(local8);
				if (local25 == 1) {
					this.aClass87_1.method2897();
					this.aClass87_1.method2906(local8);
					if (this.aClass87_1.method2909()) {
						if (!this.aBoolean282 || local11 == 0) {
							this.method2635();
							this.aClass87_1.method2903();
							return;
						}
						this.aClass87_1.method2900(local14);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2667(local25);
				}
				this.aClass87_1.method2904(local8);
				this.aClass87_1.method2906(local8);
			}
			local8 = this.aClass87_1.method2901();
			local11 = this.aClass87_1.anIntArray440[local8];
			local14 = this.aClass87_1.method2912(local11);
		}
		this.anInt3684 = local8;
		this.aLong129 = local14;
		this.anInt3685 = local11;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)V")
	private void method2640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBI)V")
	private void method2641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray372[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!kc;I)I")
	private int method2642(@OriginalArg(0) Class1_Sub13 arg0) {
		@Pc(6) Class76 local6 = arg0.aClass76_1;
		@Pc(22) int local22 = this.anIntArray366[arg0.anInt2527] * this.anIntArray377[arg0.anInt2527] + 4096 >> 13;
		@Pc(30) int local30 = local22 * local22 + 16384 >> 15;
		@Pc(39) int local39 = local30 * arg0.anInt2501 + 16384 >> 15;
		local22 = local39 * this.anInt3650 + 128 >> 8;
		if (local6.anInt3573 > 0) {
			local22 = (int) ((double) local22 * Math.pow(0.5D, (double) arg0.anInt2514 * 1.953125E-5D * (double) local6.anInt3573) + 0.5D);
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		@Pc(117) int local117;
		@Pc(107) int local107;
		if (local6.aByteArray34 != null) {
			local75 = arg0.anInt2512;
			local83 = local6.aByteArray34[arg0.anInt2526 + 1];
			if (arg0.anInt2526 < local6.aByteArray34.length - 2) {
				local107 = (local6.aByteArray34[arg0.anInt2526 + 2] & 0xFF) << 8;
				local117 = (local6.aByteArray34[arg0.anInt2526] & 0xFF) << 8;
				local83 += (local6.aByteArray34[arg0.anInt2526 + 3] - local83) * (local75 - local117) / (local107 - local117);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		if (arg0.anInt2524 > 0 && local6.aByteArray33 != null) {
			local75 = arg0.anInt2524;
			local83 = local6.aByteArray33[arg0.anInt2509 + 1];
			if (local6.aByteArray33.length - 2 > arg0.anInt2509) {
				local117 = (local6.aByteArray33[arg0.anInt2509] & 0xFF) << 8;
				local107 = (local6.aByteArray33[arg0.anInt2509 + 2] & 0xFF) << 8;
				local83 += (local6.aByteArray33[arg0.anInt2509 + 3] - local83) * (local75 - local117) / (local107 - local117);
			}
			local22 = local83 * local22 + 32 >> 6;
		}
		return local22;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
	private void method2643(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub13 local10 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2849(); local10 != null; local10 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2855()) {
			if ((arg0 < 0 || local10.anInt2527 == arg0) && local10.anInt2524 < 0) {
				this.aClass1_Sub13ArrayArray1[local10.anInt2527][local10.anInt2519] = null;
				local10.anInt2524 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)I")
	public int method2644() {
		return this.anInt3650;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIB)V")
	private void method2645() {
		this.anIntArray373[9] = 128;
		this.anIntArray370[9] = 128;
		this.method2653(9, 128);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V")
	private void method2647(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2647(local12);
			}
			return;
		}
		this.anIntArray366[arg0] = 12800;
		this.anIntArray376[arg0] = 8192;
		this.anIntArray377[arg0] = 16383;
		this.anIntArray372[arg0] = 8192;
		this.anIntArray369[arg0] = 0;
		this.anIntArray375[arg0] = 8192;
		this.method2664(arg0);
		this.method2663(arg0);
		this.anIntArray367[arg0] = 0;
		this.anIntArray371[arg0] = 32767;
		this.anIntArray374[arg0] = 256;
		this.anIntArray379[arg0] = 0;
		this.method2648(8192, arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V")
	private void method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray368[arg1] = arg0;
		this.anIntArray380[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(IIII)V")
	private void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZZLclient!kc;)V")
	public void method2650(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		@Pc(12) int local12 = arg1.aClass1_Sub4_Sub1_1.aByteArray6.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass1_Sub4_Sub1_1.aBoolean27) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass1_Sub4_Sub1_1.anInt310;
			local12 <<= 0x8;
			local44 = (int) ((long) this.anIntArray379[arg1.anInt2527] * (long) local27 >> 6);
			if (local12 <= local44) {
				local44 = local12 + local12 - local44 - 1;
				arg1.aClass1_Sub12_Sub1_3.method1765();
			}
		} else {
			local44 = (int) ((long) local12 * (long) this.anIntArray379[arg1.anInt2527] >> 6);
		}
		arg1.aClass1_Sub12_Sub1_3.method1767(local44);
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)V")
	public synchronized void method2651() {
		for (@Pc(5) Class1_Sub19 local5 = (Class1_Sub19) this.aClass45_14.method1982(); local5 != null; local5 = (Class1_Sub19) this.aClass45_14.method1986()) {
			local5.method2594();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBLclient!wh;)V")
	public synchronized void method2652(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub25 arg1) {
		this.method2666();
		this.aClass87_1.method2902(arg1.aByteArray48);
		this.aBoolean282 = arg0;
		this.aLong130 = 0L;
		@Pc(23) int local23 = this.aClass87_1.method2907();
		for (@Pc(33) int local33 = 0; local33 < local23; local33++) {
			this.aClass87_1.method2898(local33);
			this.aClass87_1.method2904(local33);
			this.aClass87_1.method2906(local33);
		}
		this.anInt3684 = this.aClass87_1.method2901();
		this.anInt3685 = this.aClass87_1.anIntArray440[this.anInt3684];
		this.aLong129 = this.aClass87_1.method2912(this.anInt3685);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	private void method2653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray378[arg0] != arg1) {
			this.anIntArray378[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub13ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[ILclient!kc;)Z")
	public boolean method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class1_Sub13 arg3) {
		arg3.anInt2507 = Static135.anInt3382 / 100;
		if (arg3.anInt2524 >= 0 && (arg3.aClass1_Sub12_Sub1_3 == null || arg3.aClass1_Sub12_Sub1_3.method1752())) {
			arg3.method1864();
			arg3.method3056();
			if (arg3.anInt2513 > 0 && this.aClass1_Sub13ArrayArray2[arg3.anInt2527][arg3.anInt2513] == arg3) {
				this.aClass1_Sub13ArrayArray2[arg3.anInt2527][arg3.anInt2513] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg3.anInt2520;
		@Pc(61) boolean local61 = false;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray375[arg3.anInt2527] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg3.anInt2520 = local59;
		}
		arg3.aClass1_Sub12_Sub1_3.method1768(this.method2660(arg3));
		@Pc(101) Class76 local101 = arg3.aClass76_1;
		arg3.anInt2503 += local101.anInt3576;
		arg3.anInt2523++;
		@Pc(133) double local133 = (double) ((arg3.anInt2519 - 60 << 8) + (arg3.anInt2518 * arg3.anInt2520 >> 12)) * 5.086263020833333E-6D;
		if (local101.anInt3573 > 0) {
			if (local101.anInt3571 > 0) {
				arg3.anInt2514 += (int) (Math.pow(2.0D, (double) local101.anInt3571 * local133) * 128.0D + 0.5D);
			} else {
				arg3.anInt2514 += 128;
			}
			if (local101.anInt3573 * arg3.anInt2514 >= 819200) {
				local61 = true;
			}
		}
		if (local101.aByteArray34 != null) {
			if (local101.anInt3579 > 0) {
				arg3.anInt2512 += (int) (Math.pow(2.0D, (double) local101.anInt3579 * local133) * 128.0D + 0.5D);
			} else {
				arg3.anInt2512 += 128;
			}
			while (local101.aByteArray34.length - 2 > arg3.anInt2526 && arg3.anInt2512 > (local101.aByteArray34[arg3.anInt2526 + 2] & 0xFF) << 8) {
				arg3.anInt2526 += 2;
			}
			if (local101.aByteArray34.length - 2 == arg3.anInt2526 && local101.aByteArray34[arg3.anInt2526 + 1] == 0) {
				local61 = true;
			}
		}
		if (arg3.anInt2524 >= 0 && local101.aByteArray33 != null && (this.anIntArray367[arg3.anInt2527] & 0x1) == 0 && (arg3.anInt2513 < 0 || this.aClass1_Sub13ArrayArray2[arg3.anInt2527][arg3.anInt2513] != arg3)) {
			if (local101.anInt3577 <= 0) {
				arg3.anInt2524 += 128;
			} else {
				arg3.anInt2524 += (int) (Math.pow(2.0D, local133 * (double) local101.anInt3577) * 128.0D + 0.5D);
			}
			while (arg3.anInt2509 < local101.aByteArray33.length - 2 && (local101.aByteArray33[arg3.anInt2509 + 2] & 0xFF) << 8 < arg3.anInt2524) {
				arg3.anInt2509 += 2;
			}
			if (local101.aByteArray33.length - 2 == arg3.anInt2509) {
				local61 = true;
			}
		}
		if (!local61) {
			arg3.aClass1_Sub12_Sub1_3.method1744(arg3.anInt2507, this.method2642(arg3), this.method2662(arg3));
			return false;
		}
		arg3.aClass1_Sub12_Sub1_3.method1743(arg3.anInt2507);
		if (arg2 == null) {
			arg3.aClass1_Sub12_Sub1_3.method2633(arg0);
		} else {
			arg3.aClass1_Sub12_Sub1_3.method2632(arg2, arg1, arg0);
		}
		if (arg3.aClass1_Sub12_Sub1_3.method1761()) {
			this.aClass1_Sub12_Sub3_1.aClass1_Sub12_Sub2_2.method2357(arg3.aClass1_Sub12_Sub1_3);
		}
		arg3.method1864();
		if (arg3.anInt2524 >= 0) {
			arg3.method3056();
			if (arg3.anInt2513 > 0 && arg3 == this.aClass1_Sub13ArrayArray2[arg3.anInt2527][arg3.anInt2513]) {
				this.aClass1_Sub13ArrayArray2[arg3.anInt2527][arg3.anInt2513] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	@Override
	public synchronized int method2628() {
		return 0;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(II)V")
	public synchronized void method2656(@OriginalArg(1) int arg0) {
		this.anInt3650 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!kc;I)Z")
	public boolean method2657(@OriginalArg(0) Class1_Sub13 arg0) {
		if (arg0.aClass1_Sub12_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt2524 >= 0) {
			arg0.method3056();
			if (arg0.anInt2513 > 0 && arg0 == this.aClass1_Sub13ArrayArray2[arg0.anInt2527][arg0.anInt2513]) {
				this.aClass1_Sub13ArrayArray2[arg0.anInt2527][arg0.anInt2513] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(IIII)V")
	private void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method2636(64, arg0, arg1);
		if ((this.anIntArray367[arg1] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub13 local28 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2858(); local28 != null; local28 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2848()) {
				if (arg1 == local28.anInt2527 && local28.anInt2524 < 0) {
					this.aClass1_Sub13ArrayArray1[arg1][local28.anInt2519] = null;
					this.aClass1_Sub13ArrayArray1[arg1][arg0] = local28;
					@Pc(66) int local66 = local28.anInt2522 + (local28.anInt2520 * local28.anInt2518 >> 12);
					local28.anInt2522 += arg0 - local28.anInt2519 << 8;
					local28.anInt2520 = 4096;
					local28.anInt2519 = arg0;
					local28.anInt2518 = local66 - local28.anInt2522;
					return;
				}
			}
		}
		@Pc(112) Class1_Sub19 local112 = (Class1_Sub19) this.aClass45_14.method1988((long) this.anIntArray378[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class1_Sub4_Sub1 local120 = local112.aClass1_Sub4_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class1_Sub13 local127 = new Class1_Sub13();
		local127.aClass1_Sub4_Sub1_1 = local120;
		local127.aClass1_Sub19_1 = local112;
		local127.anInt2527 = arg1;
		local127.aClass76_1 = local112.aClass76Array1[arg0];
		local127.anInt2513 = local112.aByteArray35[arg0];
		local127.anInt2519 = arg0;
		local127.anInt2501 = arg2 * arg2 * local112.anInt3592 * local112.aByteArray36[arg0] + 1024 >> 11;
		local127.anInt2521 = local112.aByteArray37[arg0] & 0xFF;
		local127.anInt2522 = (arg0 << 8) - (local112.aShortArray42[arg0] & 0x7FFF);
		local127.anInt2524 = -1;
		local127.anInt2514 = 0;
		local127.anInt2512 = 0;
		local127.anInt2509 = 0;
		local127.anInt2526 = 0;
		if (this.anIntArray379[arg1] == 0) {
			local127.aClass1_Sub12_Sub1_3 = Static192.method1747(local120, this.method2660(local127), this.method2642(local127), this.method2662(local127));
		} else {
			local127.aClass1_Sub12_Sub1_3 = Static192.method1747(local120, this.method2660(local127), 0, this.method2662(local127));
			this.method2650(local112.aShortArray42[arg0] < 0, local127);
		}
		if (local112.aShortArray42[arg0] < 0) {
			local127.aClass1_Sub12_Sub1_3.method1760(-1);
		}
		if (local127.anInt2513 >= 0) {
			@Pc(287) Class1_Sub13 local287 = this.aClass1_Sub13ArrayArray2[arg1][local127.anInt2513];
			if (local287 != null && local287.anInt2524 < 0) {
				this.aClass1_Sub13ArrayArray1[arg1][local287.anInt2519] = null;
				local287.anInt2524 = 0;
			}
			this.aClass1_Sub13ArrayArray2[arg1][local127.anInt2513] = local127;
		}
		this.aClass1_Sub12_Sub3_1.aClass82_13.method2853(local127);
		this.aClass1_Sub13ArrayArray1[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
	public synchronized void method2659() {
		for (@Pc(7) Class1_Sub19 local7 = (Class1_Sub19) this.aClass45_14.method1982(); local7 != null; local7 = (Class1_Sub19) this.aClass45_14.method1986()) {
			local7.method3056();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!kc;)I")
	private int method2660(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(14) int local14 = (arg0.anInt2518 * arg0.anInt2520 >> 12) + arg0.anInt2522;
		@Pc(17) Class76 local17 = arg0.aClass76_1;
		local14 += (this.anIntArray372[arg0.anInt2527] - 8192) * this.anIntArray374[arg0.anInt2527] >> 12;
		@Pc(52) int local52;
		if (local17.anInt3576 > 0 && (local17.anInt3578 > 0 || this.anIntArray369[arg0.anInt2527] > 0)) {
			local52 = local17.anInt3578 << 2;
			@Pc(57) int local57 = local17.anInt3575 << 1;
			if (local57 > arg0.anInt2523) {
				local52 = arg0.anInt2523 * local52 / local57;
			}
			local52 += this.anIntArray369[arg0.anInt2527] >> 7;
			@Pc(91) double local91 = Math.sin((double) (arg0.anInt2503 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local52 * local91);
		}
		local52 = (int) ((double) (arg0.aClass1_Sub4_Sub1_1.anInt312 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static135.anInt3382 + 0.5D);
		return local52 < 1 ? 1 : local52;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!kc;)I")
	private int method2662(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(17) int local17 = this.anIntArray376[arg0.anInt2527];
		return local17 < 8192 ? local17 * arg0.anInt2521 + 32 >> 6 : 16384 - ((128 - arg0.anInt2521) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
	private void method2663(@OriginalArg(1) int arg0) {
		if ((this.anIntArray367[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2849(); local15 != null; local15 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2855()) {
			if (arg0 == local15.anInt2527) {
				local15.anInt2516 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass87_1.method2899()) {
			@Pc(14) int local14 = this.aClass87_1.anInt3968 * this.anInt3646 / Static135.anInt3382;
			do {
				@Pc(23) long local23 = this.aLong130 + (long) local14 * (long) arg2;
				if (this.aLong129 - local23 >= 0L) {
					this.aLong130 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong129 - this.aLong130 - 1L) / (long) local14);
				arg2 -= local53;
				this.aLong130 += (long) local14 * (long) local53;
				this.aClass1_Sub12_Sub3_1.method2632(arg0, arg1, local53);
				arg1 += local53;
				this.method2639();
			} while (this.aClass87_1.method2899());
		}
		this.aClass1_Sub12_Sub3_1.method2632(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(II)V")
	private void method2664(@OriginalArg(0) int arg0) {
		if ((this.anIntArray367[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub13 local18 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2849(); local18 != null; local18 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2855()) {
			if (arg0 == local18.anInt2527 && this.aClass1_Sub13ArrayArray1[arg0][local18.anInt2519] == null && local18.anInt2524 < 0) {
				local18.anInt2524 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lclient!ve;")
	@Override
	public synchronized Class1_Sub12 method2630() {
		return this.aClass1_Sub12_Sub3_1;
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(II)V")
	private void method2665(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2849(); local15 != null; local15 = (Class1_Sub13) this.aClass1_Sub12_Sub3_1.aClass82_13.method2855()) {
			if (arg0 < 0 || arg0 == local15.anInt2527) {
				if (local15.aClass1_Sub12_Sub1_3 != null) {
					local15.aClass1_Sub12_Sub1_3.method1743(Static135.anInt3382 / 100);
					if (local15.aClass1_Sub12_Sub1_3.method1761()) {
						this.aClass1_Sub12_Sub3_1.aClass1_Sub12_Sub2_2.method2357(local15.aClass1_Sub12_Sub1_3);
					}
					local15.method1864();
				}
				if (local15.anInt2524 < 0) {
					this.aClass1_Sub13ArrayArray1[local15.anInt2527][local15.anInt2519] = null;
				}
				local15.method3056();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
	public synchronized void method2666() {
		this.aClass87_1.method2903();
		this.method2635();
	}

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "(II)V")
	private void method2667(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method2636(local30, local24, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method2636(64, local24, local18);
			} else {
				this.method2658(local24, local18, local30);
			}
		} else if (local9 == 160) {
			local24 = arg0 >> 8 & 0x7F;
			local18 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method2649(local18, local30, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray370[local18] = (local30 << 14) + (this.anIntArray370[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray370[local18] = (local30 << 7) + (this.anIntArray370[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.anIntArray369[local18] = (this.anIntArray369[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray369[local18] = local30 + (this.anIntArray369[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray375[local18] = (this.anIntArray375[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray375[local18] = (this.anIntArray375[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray366[local18] = (this.anIntArray366[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray366[local18] = (this.anIntArray366[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray376[local18] = (local30 << 7) + (this.anIntArray376[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray376[local18] = (this.anIntArray376[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray377[local18] = (local30 << 7) + (this.anIntArray377[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray377[local18] = local30 + (this.anIntArray377[local18] & 0xFFFFFF80);
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray367[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray367[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray367[local18] |= 0x2;
				} else {
					this.method2664(local18);
					this.anIntArray367[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray371[local18] = (local30 << 7) + (this.anIntArray371[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray371[local18] = (this.anIntArray371[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray371[local18] = (local30 << 7) + (this.anIntArray371[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray371[local18] = (this.anIntArray371[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method2665(local18);
			}
			if (local24 == 121) {
				this.method2647(local18);
			}
			if (local24 == 123) {
				this.method2643(local18);
			}
			@Pc(504) int local504;
			if (local24 == 6) {
				local504 = this.anIntArray371[local18];
				if (local504 == 16384) {
					this.anIntArray374[local18] = (this.anIntArray374[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local504 = this.anIntArray371[local18];
				if (local504 == 16384) {
					this.anIntArray374[local18] = (this.anIntArray374[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray379[local18] = (this.anIntArray379[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray379[local18] = (this.anIntArray379[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray367[local18] |= 0x4;
				} else {
					this.method2663(local18);
					this.anIntArray367[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method2648((this.anIntArray368[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method2648((this.anIntArray368[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2653(local18, local24 + this.anIntArray370[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method2640(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F013C) >> 9);
			this.method2641(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2635();
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Z")
	public synchronized boolean method2669() {
		return this.aClass87_1.method2899();
	}
}
