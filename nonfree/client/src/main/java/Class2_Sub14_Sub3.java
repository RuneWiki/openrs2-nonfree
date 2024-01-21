import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub14_Sub3 extends Class2_Sub14 {

	@OriginalMember(owner = "client!sh", name = "Lb", descriptor = "Z")
	private boolean aBoolean142;

	@OriginalMember(owner = "client!sh", name = "Mb", descriptor = "I")
	private int anInt3338;

	@OriginalMember(owner = "client!sh", name = "Nb", descriptor = "I")
	private int anInt3339;

	@OriginalMember(owner = "client!sh", name = "Ob", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!sh", name = "Pb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "[I")
	private final int[] anIntArray301 = new int[16];

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "[I")
	private final int[] anIntArray300 = new int[16];

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "[I")
	private final int[] anIntArray302 = new int[16];

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
	public final int[] anIntArray295 = new int[16];

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "[I")
	private final int[] anIntArray299 = new int[16];

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
	private int anInt3314 = 256;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "[I")
	private final int[] anIntArray297 = new int[16];

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "[I")
	public final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "[I")
	private final int[] anIntArray298 = new int[16];

	@OriginalMember(owner = "client!sh", name = "db", descriptor = "[[Lclient!vf;")
	private final Class2_Sub25[][] aClass2_Sub25ArrayArray1 = new Class2_Sub25[16][128];

	@OriginalMember(owner = "client!sh", name = "lb", descriptor = "[I")
	public final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!sh", name = "rb", descriptor = "[[Lclient!vf;")
	private final Class2_Sub25[][] aClass2_Sub25ArrayArray2 = new Class2_Sub25[16][128];

	@OriginalMember(owner = "client!sh", name = "fb", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "[I")
	private final int[] anIntArray296 = new int[16];

	@OriginalMember(owner = "client!sh", name = "tb", descriptor = "[I")
	private final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!sh", name = "Eb", descriptor = "I")
	private final int anInt3334 = 1000000;

	@OriginalMember(owner = "client!sh", name = "Hb", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!sh", name = "V", descriptor = "Lclient!qf;")
	private final Class71 aClass71_1 = new Class71();

	@OriginalMember(owner = "client!sh", name = "Qb", descriptor = "Lclient!mf;")
	private final Class2_Sub14_Sub2 aClass2_Sub14_Sub2_1 = new Class2_Sub14_Sub2(this);

	@OriginalMember(owner = "client!sh", name = "O", descriptor = "Lclient!eh;")
	private final Class25 aClass25_12 = new Class25(128);

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
	public Class2_Sub14_Sub3() {
		this.method2557();
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2589() {
		return 0;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "()Lclient!kc;")
	@Override
	public synchronized Class2_Sub14 method2588() {
		return null;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2584(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass71_1.method2282()) {
			@Pc(14) int local14 = this.anInt3334 * this.aClass71_1.anInt2928 / Static22.anInt472;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong135;
				if (this.aLong136 - local23 >= 0L) {
					this.aLong135 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong136 + (long) local14 - this.aLong135 - 1L) / (long) local14);
				this.aLong135 += (long) local52 * (long) local14;
				arg2 -= local52;
				this.aClass2_Sub14_Sub2_1.method2584(arg0, arg1, local52);
				arg1 += local52;
				this.method2569();
			} while (this.aClass71_1.method2282());
		}
		this.aClass2_Sub14_Sub2_1.method2584(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)I")
	public int method2545() {
		return this.anInt3314;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!vf;)I")
	private int method2546(@OriginalArg(1) Class2_Sub25 arg0) {
		@Pc(5) int local5 = this.anIntArray300[arg0.anInt3815];
		return local5 < 8192 ? local5 * arg0.anInt3812 + 32 >> 6 : 16384 - ((16384 - local5) * (128 - arg0.anInt3812) + 32 >> 6);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V")
	private void method2547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub25 local8 = this.aClass2_Sub25ArrayArray2[arg0][arg1];
		if (local8 == null) {
			return;
		}
		this.aClass2_Sub25ArrayArray2[arg0][arg1] = null;
		if ((this.anIntArray307[arg0] & 0x2) == 0) {
			local8.anInt3798 = 0;
			return;
		}
		for (@Pc(47) Class2_Sub25 local47 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2682(); local47 != null; local47 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2686()) {
			if (local47.anInt3815 == local8.anInt3815 && local47.anInt3798 < 0 && local47 != local8) {
				local8.anInt3798 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V")
	private void method2548(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2548(local9);
			}
			return;
		}
		this.anIntArray297[arg0] = 12800;
		this.anIntArray300[arg0] = 8192;
		this.anIntArray298[arg0] = 16383;
		this.anIntArray301[arg0] = 8192;
		this.anIntArray299[arg0] = 0;
		this.anIntArray296[arg0] = 8192;
		this.method2559(arg0);
		this.method2573(arg0);
		this.anIntArray307[arg0] = 0;
		this.anIntArray309[arg0] = 32767;
		this.anIntArray305[arg0] = 256;
		this.anIntArray295[arg0] = 0;
		this.method2568(arg0, 8192);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZBLclient!s;)V")
	public synchronized void method2549(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		this.method2577();
		this.aClass71_1.method2281(arg1.aByteArray48);
		this.aLong135 = 0L;
		this.aBoolean142 = arg0;
		@Pc(23) int local23 = this.aClass71_1.method2275();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass71_1.method2276(local25);
			this.aClass71_1.method2272(local25);
			this.aClass71_1.method2277(local25);
		}
		this.anInt3339 = this.aClass71_1.method2274();
		this.anInt3338 = this.aClass71_1.anIntArray275[this.anInt3339];
		this.aLong136 = this.aClass71_1.method2280(this.anInt3338);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	private void method2550(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub25 local12 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2682(); local12 != null; local12 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2686()) {
			if ((arg0 < 0 || arg0 == local12.anInt3815) && local12.anInt3798 < 0) {
				this.aClass2_Sub25ArrayArray2[local12.anInt3815][local12.anInt3820] = null;
				local12.anInt3798 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
	private void method2551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray306[arg1] != arg0) {
			this.anIntArray306[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass2_Sub25ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
	public synchronized void method2552() {
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) this.aClass25_12.method837(); local15 != null; local15 = (Class2_Sub20) this.aClass25_12.method834()) {
			local15.method3007();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZI)V")
	private void method2554() {
		this.anIntArray308[9] = 128;
		this.anIntArray302[9] = 128;
		this.method2551(128, 9);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!vf;ZI)V")
	public void method2555(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(17) int local17 = arg0.aClass2_Sub5_Sub1_1.aByteArray25.length;
		@Pc(45) int local45;
		if (arg1 && arg0.aClass2_Sub5_Sub1_1.aBoolean78) {
			@Pc(32) int local32 = local17 + local17 - arg0.aClass2_Sub5_Sub1_1.anInt1820;
			local45 = (int) ((long) local32 * (long) this.anIntArray295[arg0.anInt3815] >> 6);
			local17 <<= 0x8;
			if (local17 <= local45) {
				local45 = local17 + local17 - local45 - 1;
				arg0.aClass2_Sub14_Sub1_3.method1375();
			}
		} else {
			local45 = (int) ((long) local17 * (long) this.anIntArray295[arg0.anInt3815] >> 6);
		}
		arg0.aClass2_Sub14_Sub1_3.method1352(local45);
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	private void method2557() {
		this.method2572(-1);
		this.method2548(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray306[local19] = this.anIntArray308[local19];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray302[local35] = this.anIntArray308[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)Z")
	public synchronized boolean method2558() {
		return this.aClass71_1.method2282();
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)V")
	private void method2559(@OriginalArg(1) int arg0) {
		if ((this.anIntArray307[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class2_Sub25 local15 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2682(); local15 != null; local15 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2686()) {
			if (arg0 == local15.anInt3815 && this.aClass2_Sub25ArrayArray2[arg0][local15.anInt3820] == null && local15.anInt3798 < 0) {
				local15.anInt3798 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[IILclient!vf;I)Z")
	public boolean method2560(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub25 arg3) {
		arg3.anInt3817 = Static22.anInt472 / 100;
		if (arg3.anInt3798 >= 0 && (arg3.aClass2_Sub14_Sub1_3 == null || arg3.aClass2_Sub14_Sub1_3.method1354())) {
			arg3.method2886();
			arg3.method3007();
			if (arg3.anInt3818 > 0 && arg3 == this.aClass2_Sub25ArrayArray1[arg3.anInt3815][arg3.anInt3818]) {
				this.aClass2_Sub25ArrayArray1[arg3.anInt3815][arg3.anInt3818] = null;
			}
			return true;
		}
		@Pc(60) boolean local60 = false;
		@Pc(63) int local63 = arg3.anInt3801;
		if (local63 > 0) {
			local63 -= (int) (Math.pow(2.0D, (double) this.anIntArray296[arg3.anInt3815] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local63 < 0) {
				local63 = 0;
			}
			arg3.anInt3801 = local63;
		}
		arg3.aClass2_Sub14_Sub1_3.method1356(this.method2575(arg3));
		@Pc(118) double local118 = (double) ((arg3.anInt3820 - 60 << 8) + (arg3.anInt3814 * arg3.anInt3801 >> 12)) * 5.086263020833333E-6D;
		arg3.anInt3816++;
		@Pc(127) Class58 local127 = arg3.aClass58_1;
		arg3.anInt3804 += local127.anInt2305;
		if (local127.anInt2306 > 0) {
			if (local127.anInt2310 <= 0) {
				arg3.anInt3807 += 128;
			} else {
				arg3.anInt3807 += (int) (Math.pow(2.0D, local118 * (double) local127.anInt2310) * 128.0D + 0.5D);
			}
			if (arg3.anInt3807 * local127.anInt2306 >= 819200) {
				local60 = true;
			}
		}
		if (local127.aByteArray33 != null) {
			if (local127.anInt2308 > 0) {
				arg3.anInt3800 += (int) (Math.pow(2.0D, local118 * (double) local127.anInt2308) * 128.0D + 0.5D);
			} else {
				arg3.anInt3800 += 128;
			}
			while (arg3.anInt3809 < local127.aByteArray33.length - 2 && (local127.aByteArray33[arg3.anInt3809 + 2] & 0xFF) << 8 < arg3.anInt3800) {
				arg3.anInt3809 += 2;
			}
			if (arg3.anInt3809 == local127.aByteArray33.length - 2 && local127.aByteArray33[arg3.anInt3809 + 1] == 0) {
				local60 = true;
			}
		}
		if (arg3.anInt3798 >= 0 && local127.aByteArray34 != null && (this.anIntArray307[arg3.anInt3815] & 0x1) == 0 && (arg3.anInt3818 < 0 || arg3 != this.aClass2_Sub25ArrayArray1[arg3.anInt3815][arg3.anInt3818])) {
			if (local127.anInt2313 > 0) {
				arg3.anInt3798 += (int) (Math.pow(2.0D, local118 * (double) local127.anInt2313) * 128.0D + 0.5D);
			} else {
				arg3.anInt3798 += 128;
			}
			while (arg3.anInt3803 < local127.aByteArray34.length - 2 && arg3.anInt3798 > (local127.aByteArray34[arg3.anInt3803 + 2] & 0xFF) << 8) {
				arg3.anInt3803 += 2;
			}
			if (arg3.anInt3803 == local127.aByteArray34.length - 2) {
				local60 = true;
			}
		}
		if (!local60) {
			arg3.aClass2_Sub14_Sub1_3.method1346(arg3.anInt3817, this.method2563(arg3), this.method2546(arg3));
			return false;
		}
		arg3.aClass2_Sub14_Sub1_3.method1382(arg3.anInt3817);
		if (arg1 == null) {
			arg3.aClass2_Sub14_Sub1_3.method2587(arg2);
		} else {
			arg3.aClass2_Sub14_Sub1_3.method2584(arg1, arg0, arg2);
		}
		if (arg3.aClass2_Sub14_Sub1_3.method1360()) {
			this.aClass2_Sub14_Sub2_1.aClass2_Sub14_Sub4_1.method2590(arg3.aClass2_Sub14_Sub1_3);
		}
		arg3.method2886();
		if (arg3.anInt3798 >= 0) {
			arg3.method3007();
			if (arg3.anInt3818 > 0 && this.aClass2_Sub25ArrayArray1[arg3.anInt3815][arg3.anInt3818] == arg3) {
				this.aClass2_Sub25ArrayArray1[arg3.anInt3815][arg3.anInt3818] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIB)V")
	private void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray301[arg0] = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method2587(@OriginalArg(0) int arg0) {
		if (this.aClass71_1.method2282()) {
			@Pc(18) int local18 = this.anInt3334 * this.aClass71_1.anInt2928 / Static22.anInt472;
			do {
				@Pc(28) long local28 = this.aLong135 + (long) arg0 * (long) local18;
				if (this.aLong136 - local28 >= 0L) {
					this.aLong135 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong136 - this.aLong135 - 1L) / (long) local18);
				this.aLong135 += (long) local57 * (long) local18;
				this.aClass2_Sub14_Sub2_1.method2587(local57);
				this.method2569();
				arg0 -= local57;
			} while (this.aClass71_1.method2282());
		}
		this.aClass2_Sub14_Sub2_1.method2587(arg0);
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(B)V")
	public synchronized void method2562() {
		for (@Pc(12) Class2_Sub20 local12 = (Class2_Sub20) this.aClass25_12.method837(); local12 != null; local12 = (Class2_Sub20) this.aClass25_12.method834()) {
			local12.method1744();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!vf;B)I")
	private int method2563(@OriginalArg(0) Class2_Sub25 arg0) {
		@Pc(25) int local25 = this.anIntArray297[arg0.anInt3815] * this.anIntArray298[arg0.anInt3815] + 4096 >> 13;
		@Pc(28) Class58 local28 = arg0.aClass58_1;
		@Pc(36) int local36 = local25 * local25 + 16384 >> 15;
		@Pc(45) int local45 = arg0.anInt3808 * local36 + 16384 >> 15;
		local25 = this.anInt3314 * local45 + 128 >> 8;
		if (local28.anInt2306 > 0) {
			local25 = (int) (Math.pow(0.5D, (double) arg0.anInt3807 * 1.953125E-5D * (double) local28.anInt2306) * (double) local25 + 0.5D);
		}
		@Pc(92) int local92;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(112) int local112;
		if (local28.aByteArray33 != null) {
			local89 = local28.aByteArray33[arg0.anInt3809 + 1];
			local92 = arg0.anInt3800;
			if (arg0.anInt3809 < local28.aByteArray33.length - 2) {
				local112 = (local28.aByteArray33[arg0.anInt3809 + 2] & 0xFF) << 8;
				local122 = (local28.aByteArray33[arg0.anInt3809] & 0xFF) << 8;
				local89 += (local28.aByteArray33[arg0.anInt3809 + 3] - local89) * (local92 - local122) / (local112 - local122);
			}
			local25 = local25 * local89 + 32 >> 6;
		}
		if (arg0.anInt3798 > 0 && local28.aByteArray34 != null) {
			local92 = arg0.anInt3798;
			local89 = local28.aByteArray34[arg0.anInt3803 + 1];
			if (arg0.anInt3803 < local28.aByteArray34.length - 2) {
				local112 = (local28.aByteArray34[arg0.anInt3803 + 2] & 0xFF) << 8;
				local122 = (local28.aByteArray34[arg0.anInt3803] & 0xFF) << 8;
				local89 += (local92 - local122) * (local28.aByteArray34[arg0.anInt3803 + 3] - local89) / (local112 - local122);
			}
			local25 = local25 * local89 + 32 >> 6;
		}
		return local25;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "()Lclient!kc;")
	@Override
	public synchronized Class2_Sub14 method2586() {
		return this.aClass2_Sub14_Sub2_1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!s;Lclient!bg;ILclient!cb;)Z")
	public synchronized boolean method2564(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(4) Class13 arg2) {
		arg0.method2430();
		@Pc(5) boolean local5 = true;
		@Pc(19) int[] local19 = new int[] { 22050 };
		for (@Pc(25) Class2_Sub6 local25 = (Class2_Sub6) arg0.aClass25_11.method837(); local25 != null; local25 = (Class2_Sub6) arg0.aClass25_11.method834()) {
			@Pc(34) int local34 = (int) local25.aLong157;
			@Pc(42) Class2_Sub20 local42 = (Class2_Sub20) this.aClass25_12.method836((long) local34);
			if (local42 == null) {
				local42 = Static103.method1757(arg1, local34);
				if (local42 == null) {
					local5 = false;
					continue;
				}
				this.aClass25_12.method838((long) local34, local42);
			}
			if (!local42.method1740(local25.aByteArray10, arg2, local19)) {
				local5 = false;
			}
		}
		if (local5) {
			arg0.method2429();
		}
		return local5;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBI)V")
	private void method2565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2547(arg0, arg1, 64);
		if ((this.anIntArray307[arg0] & 0x2) != 0) {
			for (@Pc(28) Class2_Sub25 local28 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2678(); local28 != null; local28 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2685()) {
				if (arg0 == local28.anInt3815 && local28.anInt3798 < 0) {
					this.aClass2_Sub25ArrayArray2[arg0][local28.anInt3820] = null;
					this.aClass2_Sub25ArrayArray2[arg0][arg1] = local28;
					@Pc(66) int local66 = local28.anInt3797 + (local28.anInt3814 * local28.anInt3801 >> 12);
					local28.anInt3801 = 4096;
					local28.anInt3797 += arg1 - local28.anInt3820 << 8;
					local28.anInt3814 = local66 - local28.anInt3797;
					local28.anInt3820 = arg1;
					return;
				}
			}
		}
		@Pc(111) Class2_Sub20 local111 = (Class2_Sub20) this.aClass25_12.method836((long) this.anIntArray306[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class2_Sub5_Sub1 local119 = local111.aClass2_Sub5_Sub1Array1[arg1];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class2_Sub25 local126 = new Class2_Sub25();
		local126.aClass2_Sub5_Sub1_1 = local119;
		local126.aClass2_Sub20_1 = local111;
		local126.anInt3815 = arg0;
		local126.aClass58_1 = local111.aClass58Array1[arg1];
		local126.anInt3818 = local111.aByteArray29[arg1];
		local126.anInt3820 = arg1;
		local126.anInt3808 = arg2 * arg2 * local111.anInt2145 * local111.aByteArray30[arg1] + 1024 >> 11;
		local126.anInt3812 = local111.aByteArray31[arg1] & 0xFF;
		local126.anInt3797 = (arg1 << 8) - (local111.aShortArray23[arg1] & 0x7FFF);
		local126.anInt3807 = 0;
		local126.anInt3800 = 0;
		local126.anInt3798 = -1;
		local126.anInt3803 = 0;
		local126.anInt3809 = 0;
		if (this.anIntArray295[arg0] == 0) {
			local126.aClass2_Sub14_Sub1_3 = Static188.method1361(local119, this.method2575(local126), this.method2563(local126), this.method2546(local126));
		} else {
			local126.aClass2_Sub14_Sub1_3 = Static188.method1361(local119, this.method2575(local126), 0, this.method2546(local126));
			this.method2555(local126, local111.aShortArray23[arg1] < 0);
		}
		if (local111.aShortArray23[arg1] < 0) {
			local126.aClass2_Sub14_Sub1_3.method1349(-1);
		}
		if (local126.anInt3818 >= 0) {
			@Pc(281) Class2_Sub25 local281 = this.aClass2_Sub25ArrayArray1[arg0][local126.anInt3818];
			if (local281 != null && local281.anInt3798 < 0) {
				this.aClass2_Sub25ArrayArray2[arg0][local281.anInt3820] = null;
				local281.anInt3798 = 0;
			}
			this.aClass2_Sub25ArrayArray1[arg0][local126.anInt3818] = local126;
		}
		this.aClass2_Sub14_Sub2_1.aClass81_9.method2683(local126);
		this.aClass2_Sub25ArrayArray2[arg0][arg1] = local126;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIB)V")
	private void method2566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIII)V")
	private void method2567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
	private void method2568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray303[arg0] = arg1;
		this.anIntArray304[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V")
	private void method2569() {
		@Pc(8) int local8 = this.anInt3339;
		@Pc(11) long local11 = this.aLong136;
		@Pc(14) int local14 = this.anInt3338;
		while (this.anInt3338 == local14) {
			while (local14 == this.aClass71_1.anIntArray275[local8]) {
				this.aClass71_1.method2276(local8);
				@Pc(25) int local25 = this.aClass71_1.method2269(local8);
				if (local25 == 1) {
					this.aClass71_1.method2279();
					this.aClass71_1.method2277(local8);
					if (this.aClass71_1.method2283()) {
						if (!this.aBoolean142 || local14 == 0) {
							this.method2557();
							this.aClass71_1.method2268();
							return;
						}
						this.aClass71_1.method2270(local11);
					}
					break;
				}
				if ((local25 & 0x80) != 0) {
					this.method2571(local25);
				}
				this.aClass71_1.method2272(local8);
				this.aClass71_1.method2277(local8);
			}
			local8 = this.aClass71_1.method2274();
			local14 = this.aClass71_1.anIntArray275[local8];
			local11 = this.aClass71_1.method2280(local14);
		}
		this.anInt3338 = local14;
		this.anInt3339 = local8;
		this.aLong136 = local11;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)V")
	public synchronized void method2570() {
		this.method2554();
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)V")
	private void method2571(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(32) int local32;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local13 == 128) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local32 = arg0 & 0xF;
			this.method2547(local32, local22, local28);
		} else if (local13 == 144) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2547(local32, local22, 64);
			} else {
				this.method2565(local32, local22, local28);
			}
		} else if (local13 == 160) {
			local32 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			this.method2567(local22, local32, local28);
		} else if (local13 == 176) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray302[local32] = (this.anIntArray302[local32] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray302[local32] = (local28 << 7) + (this.anIntArray302[local32] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray299[local32] = (this.anIntArray299[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray299[local32] = (this.anIntArray299[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray296[local32] = (this.anIntArray296[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray296[local32] = (this.anIntArray296[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray297[local32] = (this.anIntArray297[local32] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray297[local32] = local28 + (this.anIntArray297[local32] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray300[local32] = (local28 << 7) + (this.anIntArray300[local32] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray300[local32] = local28 + (this.anIntArray300[local32] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray298[local32] = (local28 << 7) + (this.anIntArray298[local32] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray298[local32] = local28 + (this.anIntArray298[local32] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray307[local32] |= 0x1;
				} else {
					this.anIntArray307[local32] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray307[local32] |= 0x2;
				} else {
					this.method2559(local32);
					this.anIntArray307[local32] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray309[local32] = (local28 << 7) + (this.anIntArray309[local32] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray309[local32] = (this.anIntArray309[local32] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray309[local32] = (local28 << 7) + (this.anIntArray309[local32] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray309[local32] = (this.anIntArray309[local32] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2572(local32);
			}
			if (local22 == 121) {
				this.method2548(local32);
			}
			if (local22 == 123) {
				this.method2550(local32);
			}
			@Pc(507) int local507;
			if (local22 == 6) {
				local507 = this.anIntArray309[local32];
				if (local507 == 16384) {
					this.anIntArray305[local32] = (this.anIntArray305[local32] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local507 = this.anIntArray309[local32];
				if (local507 == 16384) {
					this.anIntArray305[local32] = local28 + (this.anIntArray305[local32] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray295[local32] = (local28 << 7) + (this.anIntArray295[local32] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray295[local32] = (this.anIntArray295[local32] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method2573(local32);
					this.anIntArray307[local32] &= 0xFFFFFFFB;
				} else {
					this.anIntArray307[local32] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method2568(local32, (this.anIntArray303[local32] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method2568(local32, local28 + (this.anIntArray303[local32] & 0xFFFFFF80));
			}
		} else if (local13 == 192) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2551(this.anIntArray302[local32] + local22, local32);
		} else if (local13 == 208) {
			local32 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2566(local22, local32);
		} else if (local13 == 224) {
			local32 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F009B) >> 9);
			this.method2561(local32, local22);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method2557();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)V")
	private void method2572(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class2_Sub25 local12 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2682(); local12 != null; local12 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2686()) {
			if (arg0 < 0 || local12.anInt3815 == arg0) {
				if (local12.aClass2_Sub14_Sub1_3 != null) {
					local12.aClass2_Sub14_Sub1_3.method1382(Static22.anInt472 / 100);
					if (local12.aClass2_Sub14_Sub1_3.method1360()) {
						this.aClass2_Sub14_Sub2_1.aClass2_Sub14_Sub4_1.method2590(local12.aClass2_Sub14_Sub1_3);
					}
					local12.method2886();
				}
				if (local12.anInt3798 < 0) {
					this.aClass2_Sub25ArrayArray2[local12.anInt3815][local12.anInt3820] = null;
				}
				local12.method3007();
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "e", descriptor = "(II)V")
	private void method2573(@OriginalArg(0) int arg0) {
		if ((this.anIntArray307[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(21) Class2_Sub25 local21 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2682(); local21 != null; local21 = (Class2_Sub25) this.aClass2_Sub14_Sub2_1.aClass81_9.method2686()) {
			if (arg0 == local21.anInt3815) {
				local21.anInt3810 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)V")
	public synchronized void method2574(@OriginalArg(0) int arg0) {
		this.anInt3314 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(Lclient!vf;B)I")
	private int method2575(@OriginalArg(0) Class2_Sub25 arg0) {
		@Pc(14) int local14 = arg0.anInt3797 + (arg0.anInt3801 * arg0.anInt3814 >> 12);
		@Pc(17) Class58 local17 = arg0.aClass58_1;
		local14 += (this.anIntArray301[arg0.anInt3815] - 8192) * this.anIntArray305[arg0.anInt3815] >> 12;
		@Pc(60) int local60;
		if (local17.anInt2305 > 0 && (local17.anInt2309 > 0 || this.anIntArray299[arg0.anInt3815] > 0)) {
			@Pc(55) int local55 = local17.anInt2311 << 1;
			local60 = local17.anInt2309 << 2;
			if (arg0.anInt3816 < local55) {
				local60 = local60 * arg0.anInt3816 / local55;
			}
			local60 += this.anIntArray299[arg0.anInt3815] >> 7;
			@Pc(90) double local90 = Math.sin((double) (arg0.anInt3804 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local90 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass2_Sub5_Sub1_1.anInt1822 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static22.anInt472 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(BLclient!vf;)Z")
	public boolean method2576(@OriginalArg(1) Class2_Sub25 arg0) {
		if (arg0.aClass2_Sub14_Sub1_3 != null) {
			return false;
		}
		if (arg0.anInt3798 >= 0) {
			arg0.method3007();
			if (arg0.anInt3818 > 0 && this.aClass2_Sub25ArrayArray1[arg0.anInt3815][arg0.anInt3818] == arg0) {
				this.aClass2_Sub25ArrayArray1[arg0.anInt3815][arg0.anInt3818] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "f", descriptor = "(B)V")
	public synchronized void method2577() {
		this.aClass71_1.method2268();
		this.method2557();
	}
}
