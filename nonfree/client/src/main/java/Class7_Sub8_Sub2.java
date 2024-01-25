import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class7_Sub8_Sub2 extends Class7_Sub8 {

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "I")
	private int anInt3393;

	@OriginalMember(owner = "client!ka", name = "Hb", descriptor = "I")
	private int anInt3394;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "J")
	private long aLong116;

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "J")
	private long aLong117;

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "Lclient!ud;")
	private Class7_Sub38 aClass7_Sub38_2;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
	private int anInt3395;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "Z")
	private boolean aBoolean248;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "[I")
	public final int[] anIntArray448 = new int[16];

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
	private final int[] anIntArray447 = new int[16];

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "[I")
	private final int[] anIntArray449 = new int[16];

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "[I")
	private final int[] anIntArray444 = new int[16];

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "[[Lclient!w;")
	private final Class7_Sub41[][] aClass7_Sub41ArrayArray1 = new Class7_Sub41[16][128];

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "[I")
	private final int[] anIntArray445 = new int[16];

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
	public final int[] anIntArray450 = new int[16];

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "[I")
	private final int[] anIntArray446 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
	private final int anInt3364 = 1000000;

	@OriginalMember(owner = "client!ka", name = "hb", descriptor = "[I")
	private final int[] anIntArray454 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "[I")
	private final int[] anIntArray452 = new int[16];

	@OriginalMember(owner = "client!ka", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "[I")
	private final int[] anIntArray455 = new int[16];

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "[I")
	private final int[] anIntArray456 = new int[16];

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "[I")
	private final int[] anIntArray453 = new int[16];

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
	private int anInt3378 = 256;

	@OriginalMember(owner = "client!ka", name = "Bb", descriptor = "[I")
	private final int[] anIntArray458 = new int[16];

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "[I")
	private final int[] anIntArray451 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "[I")
	public final int[] anIntArray457 = new int[16];

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "[[Lclient!w;")
	private final Class7_Sub41[][] aClass7_Sub41ArrayArray2 = new Class7_Sub41[16][128];

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "Lclient!jp;")
	private final Class116 aClass116_1 = new Class116();

	@OriginalMember(owner = "client!ka", name = "Gb", descriptor = "Lclient!ek;")
	private final Class7_Sub8_Sub1 aClass7_Sub8_Sub1_1 = new Class7_Sub8_Sub1(this);

	@OriginalMember(owner = "client!ka", name = "zb", descriptor = "Lclient!aj;")
	private final Class10 aClass10_30 = new Class10(128);

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class7_Sub8_Sub2() {
		this.method3099();
		this.method3123(true);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLclient!ud;Z)V")
	public synchronized void method3091(@OriginalArg(1) Class7_Sub38 arg0, @OriginalArg(2) boolean arg1) {
		this.method3127(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public synchronized void method3092(@OriginalArg(1) int arg0) {
		this.anInt3378 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class7_Sub8 method4932() {
		return this.aClass7_Sub8_Sub1_1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!w;)I")
	private int method3094(@OriginalArg(1) Class7_Sub41 arg0) {
		@Pc(15) int local15 = this.anIntArray455[arg0.anInt6516];
		return local15 >= 8192 ? 16384 - ((128 - arg0.anInt6506) * (-local15 + 16384) + 32 >> 6) : local15 * arg0.anInt6506 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4936(@OriginalArg(0) int arg0) {
		if (this.aClass116_1.method3012()) {
			@Pc(18) int local18 = this.anInt3364 * this.aClass116_1.anInt3290 / Static172.anInt2667;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong116;
				if (this.aLong117 - local27 >= 0L) {
					this.aLong116 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong117 + (long) local18 - this.aLong116 - 1L) / (long) local18);
				this.aLong116 += (long) local57 * (long) local18;
				arg0 -= local57;
				this.aClass7_Sub8_Sub1_1.method4936(local57);
				this.method3119();
			} while (this.aClass116_1.method3012());
		}
		this.aClass7_Sub8_Sub1_1.method4936(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIILclient!w;[I)Z")
	public boolean method3095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class7_Sub41 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt6518 = Static172.anInt2667 / 100;
		if (arg2.anInt6505 >= 0 && (arg2.aClass7_Sub8_Sub4_3 == null || arg2.aClass7_Sub8_Sub4_3.method4939())) {
			arg2.method5558();
			arg2.method5648();
			if (arg2.anInt6517 > 0 && this.aClass7_Sub41ArrayArray1[arg2.anInt6516][arg2.anInt6517] == arg2) {
				this.aClass7_Sub41ArrayArray1[arg2.anInt6516][arg2.anInt6517] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg2.anInt6511;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray456[arg2.anInt6516] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg2.anInt6511 = local59;
		}
		arg2.aClass7_Sub8_Sub4_3.method4942(this.method3098(arg2));
		@Pc(102) Class173 local102 = arg2.aClass173_1;
		arg2.anInt6510 += local102.anInt5047;
		@Pc(111) boolean local111 = false;
		arg2.anInt6515++;
		@Pc(135) double local135 = (double) ((arg2.anInt6511 * arg2.anInt6513 >> 12) + (arg2.anInt6519 - 60 << 8)) * 5.086263020833333E-6D;
		if (local102.anInt5053 > 0) {
			if (local102.anInt5050 > 0) {
				arg2.anInt6514 += (int) (Math.pow(2.0D, (double) local102.anInt5050 * local135) * 128.0D + 0.5D);
			} else {
				arg2.anInt6514 += 128;
			}
			if (arg2.anInt6514 * local102.anInt5053 >= 819200) {
				local111 = true;
			}
		}
		if (local102.aByteArray76 != null) {
			if (local102.anInt5056 > 0) {
				arg2.anInt6509 += (int) (Math.pow(2.0D, (double) local102.anInt5056 * local135) * 128.0D + 0.5D);
			} else {
				arg2.anInt6509 += 128;
			}
			while (local102.aByteArray76.length - 2 > arg2.anInt6502 && arg2.anInt6509 > (local102.aByteArray76[arg2.anInt6502 + 2] & 0xFF) << 8) {
				arg2.anInt6502 += 2;
			}
			if (arg2.anInt6502 == local102.aByteArray76.length - 2 && local102.aByteArray76[arg2.anInt6502 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt6505 >= 0 && local102.aByteArray75 != null && (this.anIntArray457[arg2.anInt6516] & 0x1) == 0 && (arg2.anInt6517 < 0 || this.aClass7_Sub41ArrayArray1[arg2.anInt6516][arg2.anInt6517] != arg2)) {
			if (local102.anInt5052 > 0) {
				arg2.anInt6505 += (int) (Math.pow(2.0D, local135 * (double) local102.anInt5052) * 128.0D + 0.5D);
			} else {
				arg2.anInt6505 += 128;
			}
			while (local102.aByteArray75.length - 2 > arg2.anInt6521 && (local102.aByteArray75[arg2.anInt6521 + 2] & 0xFF) << 8 < arg2.anInt6505) {
				arg2.anInt6521 += 2;
			}
			if (arg2.anInt6521 == local102.aByteArray75.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass7_Sub8_Sub4_3.method4965(arg2.anInt6518, this.method3118(arg2), this.method3094(arg2));
			return false;
		}
		arg2.aClass7_Sub8_Sub4_3.method4973(arg2.anInt6518);
		if (arg3 == null) {
			arg2.aClass7_Sub8_Sub4_3.method4936(arg0);
		} else {
			arg2.aClass7_Sub8_Sub4_3.method4934(arg3, arg1, arg0);
		}
		if (arg2.aClass7_Sub8_Sub4_3.method4963()) {
			this.aClass7_Sub8_Sub1_1.aClass7_Sub8_Sub3_1.method3895(arg2.aClass7_Sub8_Sub4_3);
		}
		arg2.method5558();
		if (arg2.anInt6505 >= 0) {
			arg2.method5648();
			if (arg2.anInt6517 > 0 && this.aClass7_Sub41ArrayArray1[arg2.anInt6516][arg2.anInt6517] == arg2) {
				this.aClass7_Sub41ArrayArray1[arg2.anInt6516][arg2.anInt6517] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V")
	private synchronized void method3096(@OriginalArg(1) boolean arg0) {
		this.aClass116_1.method3015();
		this.aClass7_Sub38_2 = null;
		this.method3123(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
	private void method3097() {
		this.anIntArray449[9] = 128;
		this.anIntArray451[9] = 128;
		this.method3110(9, 128);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Lclient!mi;")
	@Override
	public synchronized Class7_Sub8 method4930() {
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(ILclient!w;)I")
	private int method3098(@OriginalArg(1) Class7_Sub41 arg0) {
		@Pc(14) int local14 = (arg0.anInt6511 * arg0.anInt6513 >> 12) + arg0.anInt6520;
		local14 += this.anIntArray458[arg0.anInt6516] * (this.anIntArray447[arg0.anInt6516] - 8192) >> 12;
		@Pc(35) Class173 local35 = arg0.aClass173_1;
		@Pc(55) int local55;
		if (local35.anInt5047 > 0 && (local35.anInt5055 > 0 || this.anIntArray454[arg0.anInt6516] > 0)) {
			local55 = local35.anInt5055 << 2;
			@Pc(60) int local60 = local35.anInt5057 << 1;
			if (arg0.anInt6515 < local60) {
				local55 = arg0.anInt6515 * local55 / local60;
			}
			local55 += this.anIntArray454[arg0.anInt6516] >> 7;
			@Pc(94) double local94 = Math.sin((double) (arg0.anInt6510 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local94 * (double) local55);
		}
		local55 = (int) ((double) (arg0.aClass7_Sub20_Sub1_1.anInt3465 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static172.anInt2667 + 0.5D);
		return local55 < 1 ? 1 : local55;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)V")
	private synchronized void method3099() {
		for (@Pc(13) int local13 = 0; local13 < 16; local13++) {
			this.anIntArray453[local13] = 256;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(BII)V")
	public synchronized void method3100() {
		this.method3097();
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	private void method3101(@OriginalArg(0) int arg0) {
		if ((this.anIntArray457[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class7_Sub41 local16 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1793(); local16 != null; local16 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1798()) {
			if (local16.anInt6516 == arg0) {
				local16.anInt6512 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)V")
	private void method3102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray446[arg1] = arg0;
		this.anIntArray448[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIB)V")
	private void method3104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZI)V")
	private void method3105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class7_Sub41 local12 = this.aClass7_Sub41ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass7_Sub41ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray457[arg0] & 0x2) == 0) {
			local12.anInt6505 = 0;
			return;
		}
		for (@Pc(39) Class7_Sub41 local39 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1793(); local39 != null; local39 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1798()) {
			if (local39.anInt6516 == local12.anInt6516 && local39.anInt6505 < 0 && local12 != local39) {
				local12.anInt6505 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZILclient!w;)V")
	public void method3106(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class7_Sub41 arg1) {
		@Pc(12) int local12 = arg1.aClass7_Sub20_Sub1_1.aByteArray50.length;
		@Pc(44) int local44;
		if (arg0 && arg1.aClass7_Sub20_Sub1_1.aBoolean256) {
			@Pc(27) int local27 = local12 + local12 - arg1.aClass7_Sub20_Sub1_1.anInt3466;
			local12 <<= 0x8;
			local44 = (int) ((long) local27 * (long) this.anIntArray450[arg1.anInt6516] >> 6);
			if (local12 <= local44) {
				arg1.aClass7_Sub8_Sub4_3.method4954();
				local44 = local12 + local12 - local44 - 1;
			}
		} else {
			local44 = (int) ((long) local12 * (long) this.anIntArray450[arg1.anInt6516] >> 6);
		}
		arg1.aClass7_Sub8_Sub4_3.method4945(local44);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZLclient!w;)Z")
	public boolean method3107(@OriginalArg(1) Class7_Sub41 arg0) {
		if (arg0.aClass7_Sub8_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt6505 >= 0) {
			arg0.method5648();
			if (arg0.anInt6517 > 0 && arg0 == this.aClass7_Sub41ArrayArray1[arg0.anInt6516][arg0.anInt6517]) {
				this.aClass7_Sub41ArrayArray1[arg0.anInt6516][arg0.anInt6517] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	private void method3109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	private void method3110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray445[arg0] != arg1) {
			this.anIntArray445[arg0] = arg1;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass7_Sub41ArrayArray1[arg0][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ie;ILclient!ud;ILclient!rk;)Z")
	public synchronized boolean method3112(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class7_Sub38 arg1, @OriginalArg(4) Class180 arg2) {
		arg1.method5111();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(31) Class7_Sub40 local31 = (Class7_Sub40) arg1.aClass10_51.method157(); local31 != null; local31 = (Class7_Sub40) arg1.aClass10_51.method155()) {
			@Pc(37) int local37 = (int) local31.aLong232;
			@Pc(45) Class7_Sub31 local45 = (Class7_Sub31) this.aClass10_30.method163((long) local37);
			if (local45 == null) {
				local45 = Static180.method3314(arg2, local37);
				if (local45 == null) {
					local14 = false;
					continue;
				}
				this.aClass10_30.method161((long) local37, local45);
			}
			if (!local45.method4310(local31.aByteArray94, local25, arg0)) {
				local14 = false;
			}
		}
		if (local14) {
			arg1.method5113();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)V")
	private void method3113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method3105(arg1, 64, arg0);
		if ((this.anIntArray457[arg1] & 0x2) != 0) {
			for (@Pc(28) Class7_Sub41 local28 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1805(); local28 != null; local28 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1796()) {
				if (local28.anInt6516 == arg1 && local28.anInt6505 < 0) {
					this.aClass7_Sub41ArrayArray2[arg1][local28.anInt6519] = null;
					this.aClass7_Sub41ArrayArray2[arg1][arg0] = local28;
					@Pc(63) int local63 = (local28.anInt6511 * local28.anInt6513 >> 12) + local28.anInt6520;
					local28.anInt6520 += arg0 - local28.anInt6519 << 8;
					local28.anInt6519 = arg0;
					local28.anInt6513 = local63 - local28.anInt6520;
					local28.anInt6511 = 4096;
					return;
				}
			}
		}
		@Pc(109) Class7_Sub31 local109 = (Class7_Sub31) this.aClass10_30.method163((long) this.anIntArray445[arg1]);
		if (local109 == null) {
			return;
		}
		@Pc(117) Class7_Sub20_Sub1 local117 = local109.aClass7_Sub20_Sub1Array1[arg0];
		if (local117 == null) {
			return;
		}
		@Pc(124) Class7_Sub41 local124 = new Class7_Sub41();
		local124.aClass7_Sub20_Sub1_1 = local117;
		local124.aClass7_Sub31_1 = local109;
		local124.anInt6516 = arg1;
		local124.aClass173_1 = local109.aClass173Array1[arg0];
		local124.anInt6517 = local109.aByteArray72[arg0];
		local124.anInt6519 = arg0;
		local124.anInt6508 = local109.anInt4939 * arg2 * arg2 * local109.aByteArray73[arg0] + 1024 >> 11;
		local124.anInt6506 = local109.aByteArray74[arg0] & 0xFF;
		local124.anInt6520 = (arg0 << 8) - (local109.aShortArray106[arg0] & 0x7FFF);
		local124.anInt6505 = -1;
		local124.anInt6521 = 0;
		local124.anInt6509 = 0;
		local124.anInt6514 = 0;
		local124.anInt6502 = 0;
		if (this.anIntArray450[arg1] == 0) {
			local124.aClass7_Sub8_Sub4_3 = Static367.method4960(local117, this.method3098(local124), this.method3118(local124), this.method3094(local124));
		} else {
			local124.aClass7_Sub8_Sub4_3 = Static367.method4960(local117, this.method3098(local124), 0, this.method3094(local124));
			this.method3106(local109.aShortArray106[arg0] < 0, local124);
		}
		if (local109.aShortArray106[arg0] < 0) {
			local124.aClass7_Sub8_Sub4_3.method4947(-1);
		}
		if (local124.anInt6517 >= 0) {
			@Pc(283) Class7_Sub41 local283 = this.aClass7_Sub41ArrayArray1[arg1][local124.anInt6517];
			if (local283 != null && local283.anInt6505 < 0) {
				this.aClass7_Sub41ArrayArray2[arg1][local283.anInt6519] = null;
				local283.anInt6505 = 0;
			}
			this.aClass7_Sub41ArrayArray1[arg1][local124.anInt6517] = local124;
		}
		this.aClass7_Sub8_Sub1_1.aClass74_6.method1802(local124);
		this.aClass7_Sub41ArrayArray2[arg1][arg0] = local124;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
	public synchronized void method3114() {
		this.method3096(true);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)Z")
	public synchronized boolean method3115() {
		return this.aClass116_1.method3012();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	private void method3117(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class7_Sub41 local10 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1793(); local10 != null; local10 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1798()) {
			if (arg0 < 0 || local10.anInt6516 == arg0) {
				if (local10.aClass7_Sub8_Sub4_3 != null) {
					local10.aClass7_Sub8_Sub4_3.method4973(Static172.anInt2667 / 100);
					if (local10.aClass7_Sub8_Sub4_3.method4963()) {
						this.aClass7_Sub8_Sub1_1.aClass7_Sub8_Sub3_1.method3895(local10.aClass7_Sub8_Sub4_3);
					}
					local10.method5558();
				}
				if (local10.anInt6505 < 0) {
					this.aClass7_Sub41ArrayArray2[local10.anInt6516][local10.anInt6519] = null;
				}
				local10.method5648();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!w;Z)I")
	private int method3118(@OriginalArg(0) Class7_Sub41 arg0) {
		if (this.anIntArray453[arg0.anInt6516] == 0) {
			return 0;
		}
		@Pc(17) Class173 local17 = arg0.aClass173_1;
		@Pc(40) int local40 = this.lb[arg0.anInt6516] * this.anIntArray444[arg0.anInt6516] + 4096 >> 13;
		@Pc(48) int local48 = local40 * local40 + 16384 >> 15;
		@Pc(57) int local57 = arg0.anInt6508 * local48 + 16384 >> 15;
		@Pc(66) int local66 = local57 * this.anInt3378 + 128 >> 8;
		local40 = this.anIntArray453[arg0.anInt6516] * local66 + 128 >> 8;
		if (local17.anInt5053 > 0) {
			local40 = (int) (Math.pow(0.5D, (double) local17.anInt5053 * 1.953125E-5D * (double) arg0.anInt6514) * (double) local40 + 0.5D);
		}
		@Pc(108) int local108;
		@Pc(116) int local116;
		@Pc(138) int local138;
		@Pc(150) int local150;
		if (local17.aByteArray76 != null) {
			local108 = arg0.anInt6509;
			local116 = local17.aByteArray76[arg0.anInt6502 + 1];
			if (arg0.anInt6502 < local17.aByteArray76.length - 2) {
				local138 = (local17.aByteArray76[arg0.anInt6502] & 0xFF) << 8;
				local150 = (local17.aByteArray76[arg0.anInt6502 + 2] & 0xFF) << 8;
				local116 += (local17.aByteArray76[arg0.anInt6502 + 3] - local116) * (-local138 + local108) / (local150 - local138);
			}
			local40 = local40 * local116 + 32 >> 6;
		}
		if (arg0.anInt6505 > 0 && local17.aByteArray75 != null) {
			local108 = arg0.anInt6505;
			local116 = local17.aByteArray75[arg0.anInt6521 + 1];
			if (local17.aByteArray75.length - 2 > arg0.anInt6521) {
				local138 = (local17.aByteArray75[arg0.anInt6521] & 0xFF) << 8;
				local150 = (local17.aByteArray75[arg0.anInt6521 + 2] & 0xFF) << 8;
				local116 += (local17.aByteArray75[arg0.anInt6521 + 3] - local116) * (local108 - local138) / (local150 - local138);
			}
			local40 = local40 * local116 + 32 >> 6;
		}
		return local40;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	private void method3119() {
		@Pc(8) int local8 = this.anInt3394;
		@Pc(11) int local11 = this.anInt3393;
		@Pc(14) long local14 = this.aLong117;
		if (this.aClass7_Sub38_2 != null && local11 == this.anInt3395) {
			this.method3127(this.aBoolean248, this.aBoolean247, this.aClass7_Sub38_2);
			this.method3119();
			return;
		}
		while (local11 == this.anInt3393) {
			while (this.aClass116_1.anIntArray431[local8] == local11) {
				this.aClass116_1.method3021(local8);
				@Pc(47) int local47 = this.aClass116_1.method3009(local8);
				if (local47 == 1) {
					this.aClass116_1.method3014();
					this.aClass116_1.method3017(local8);
					if (this.aClass116_1.method3022()) {
						if (this.aClass7_Sub38_2 != null) {
							this.method3091(this.aClass7_Sub38_2, this.aBoolean247);
							this.method3119();
							return;
						}
						if (!this.aBoolean247 || local11 == 0) {
							this.method3123(true);
							this.aClass116_1.method3015();
							return;
						}
						this.aClass116_1.method3007(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method3120(local47);
				}
				this.aClass116_1.method3010(local8);
				this.aClass116_1.method3017(local8);
			}
			local8 = this.aClass116_1.method3018();
			local11 = this.aClass116_1.anIntArray431[local8];
			local14 = this.aClass116_1.method3016(local11);
		}
		this.anInt3393 = local11;
		this.aLong117 = local14;
		this.anInt3394 = local8;
		if (this.aClass7_Sub38_2 != null && local11 > this.anInt3395) {
			this.anInt3394 = -1;
			this.anInt3393 = this.anInt3395;
			this.aLong117 = this.aClass116_1.method3016(this.anInt3393);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	private void method3120(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 & 0xF0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		if (local13 == 128) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method3105(local22, local34, local28);
		} else if (local13 == 144) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local34 > 0) {
				this.method3113(local28, local22, local34);
			} else {
				this.method3105(local22, 64, local28);
			}
		} else if (local13 == 160) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			this.method3109(local22, local28, local34);
		} else if (local13 == 176) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local34 = arg0 >> 16 & 0x7F;
			if (local28 == 0) {
				this.anIntArray451[local22] = (local34 << 14) + (this.anIntArray451[local22] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray451[local22] = (this.anIntArray451[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 1) {
				this.anIntArray454[local22] = (this.anIntArray454[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 33) {
				this.anIntArray454[local22] = local34 + (this.anIntArray454[local22] & 0xFFFFFF80);
			}
			if (local28 == 5) {
				this.anIntArray456[local22] = (local34 << 7) + (this.anIntArray456[local22] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray456[local22] = local34 + (this.anIntArray456[local22] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray444[local22] = (local34 << 7) + (this.anIntArray444[local22] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray444[local22] = local34 + (this.anIntArray444[local22] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray455[local22] = (local34 << 7) + (this.anIntArray455[local22] & 0xFFFFC07F);
			}
			if (local28 == 42) {
				this.anIntArray455[local22] = local34 + (this.anIntArray455[local22] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.lb[local22] = (local34 << 7) + (this.lb[local22] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.lb[local22] = (this.lb[local22] & 0xFFFFFF80) + local34;
			}
			if (local28 == 64) {
				if (local34 >= 64) {
					this.anIntArray457[local22] |= 0x1;
				} else {
					this.anIntArray457[local22] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local34 >= 64) {
					this.anIntArray457[local22] |= 0x2;
				} else {
					this.method3130(local22);
					this.anIntArray457[local22] &= 0xFFFFFFFD;
				}
			}
			if (local28 == 99) {
				this.anIntArray452[local22] = (this.anIntArray452[local22] & 0x7F) + (local34 << 7);
			}
			if (local28 == 98) {
				this.anIntArray452[local22] = (this.anIntArray452[local22] & 0x3F80) + local34;
			}
			if (local28 == 101) {
				this.anIntArray452[local22] = (this.anIntArray452[local22] & 0x7F) + (local34 << 7) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray452[local22] = (this.anIntArray452[local22] & 0x3F80) + local34 + 16384;
			}
			if (local28 == 120) {
				this.method3117(local22);
			}
			if (local28 == 121) {
				this.method3128(local22);
			}
			if (local28 == 123) {
				this.method3121(local22);
			}
			@Pc(502) int local502;
			if (local28 == 6) {
				local502 = this.anIntArray452[local22];
				if (local502 == 16384) {
					this.anIntArray458[local22] = (local34 << 7) + (this.anIntArray458[local22] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local502 = this.anIntArray452[local22];
				if (local502 == 16384) {
					this.anIntArray458[local22] = local34 + (this.anIntArray458[local22] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray450[local22] = (this.anIntArray450[local22] & 0xFFFFC07F) + (local34 << 7);
			}
			if (local28 == 48) {
				this.anIntArray450[local22] = local34 + (this.anIntArray450[local22] & 0xFFFFFF80);
			}
			if (local28 == 81) {
				if (local34 >= 64) {
					this.anIntArray457[local22] |= 0x4;
				} else {
					this.method3101(local22);
					this.anIntArray457[local22] &= 0xFFFFFFFB;
				}
			}
			if (local28 == 17) {
				this.method3102((local34 << 7) + (this.anIntArray446[local22] & 0xFFFFC07F), local22);
			}
			if (local28 == 49) {
				this.method3102(local34 + (this.anIntArray446[local22] & 0xFFFFFF80), local22);
			}
		} else if (local13 == 192) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method3110(local22, this.anIntArray451[local22] + local28);
		} else if (local13 == 208) {
			local22 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method3104(local28, local22);
		} else if (local13 == 224) {
			local22 = arg0 & 0xF;
			local28 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F38) >> 8);
			this.method3131(local22, local28);
		} else {
			local13 = arg0 & 0xFF;
			if (local13 == 255) {
				this.method3123(true);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V")
	private void method3121(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class7_Sub41 local10 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1793(); local10 != null; local10 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1798()) {
			if ((arg0 < 0 || arg0 == local10.anInt6516) && local10.anInt6505 < 0) {
				this.aClass7_Sub41ArrayArray2[local10.anInt6516][local10.anInt6519] = null;
				local10.anInt6505 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public int method3122() {
		return this.anInt3378;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	private void method3123(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method3117(-1);
		} else {
			this.method3121(-1);
		}
		this.method3128(-1);
		for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
			this.anIntArray445[local22] = this.anIntArray449[local22];
		}
		for (@Pc(43) int local43 = 0; local43 < 16; local43++) {
			this.anIntArray451[local43] = this.anIntArray449[local43] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4935() {
		return 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass116_1.method3012()) {
			@Pc(18) int local18 = this.aClass116_1.anInt3290 * this.anInt3364 / Static172.anInt2667;
			do {
				@Pc(27) long local27 = this.aLong116 + (long) arg2 * (long) local18;
				if (this.aLong117 - local27 >= 0L) {
					this.aLong116 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong117 + (long) local18 - this.aLong116 - 1L) / (long) local18);
				this.aLong116 += (long) local18 * (long) local57;
				this.aClass7_Sub8_Sub1_1.method4934(arg0, arg1, local57);
				arg2 -= local57;
				arg1 += local57;
				this.method3119();
			} while (this.aClass116_1.method3012());
		}
		this.aClass7_Sub8_Sub1_1.method4934(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
	public synchronized void method3125() {
		for (@Pc(17) Class7_Sub31 local17 = (Class7_Sub31) this.aClass10_30.method157(); local17 != null; local17 = (Class7_Sub31) this.aClass10_30.method155()) {
			local17.method5648();
		}
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
	public synchronized void method3126() {
		for (@Pc(17) Class7_Sub31 local17 = (Class7_Sub31) this.aClass10_30.method157(); local17 != null; local17 = (Class7_Sub31) this.aClass10_30.method155()) {
			local17.method4308();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZBZLclient!ud;)V")
	private synchronized void method3127(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class7_Sub38 arg2) {
		this.method3096(arg0);
		this.aClass116_1.method3019(arg2.aByteArray90);
		this.aLong116 = 0L;
		this.aBoolean247 = arg1;
		@Pc(24) int local24 = this.aClass116_1.method3020();
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			this.aClass116_1.method3021(local32);
			this.aClass116_1.method3010(local32);
			this.aClass116_1.method3017(local32);
		}
		this.anInt3394 = this.aClass116_1.method3018();
		this.anInt3393 = this.aClass116_1.anIntArray431[this.anInt3394];
		this.aLong117 = this.aClass116_1.method3016(this.anInt3393);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	private void method3128(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method3128(local7);
			}
			return;
		}
		this.anIntArray444[arg0] = 12800;
		this.anIntArray455[arg0] = 8192;
		this.lb[arg0] = 16383;
		this.anIntArray447[arg0] = 8192;
		this.anIntArray454[arg0] = 0;
		this.anIntArray456[arg0] = 8192;
		this.method3130(arg0);
		this.method3101(arg0);
		this.anIntArray457[arg0] = 0;
		this.anIntArray452[arg0] = 32767;
		this.anIntArray458[arg0] = 256;
		this.anIntArray450[arg0] = 0;
		this.method3102(8192, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(II)V")
	private void method3130(@OriginalArg(1) int arg0) {
		if ((this.anIntArray457[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(26) Class7_Sub41 local26 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1793(); local26 != null; local26 = (Class7_Sub41) this.aClass7_Sub8_Sub1_1.aClass74_6.method1798()) {
			if (local26.anInt6516 == arg0 && this.aClass7_Sub41ArrayArray2[arg0][local26.anInt6519] == null && local26.anInt6505 < 0) {
				local26.anInt6505 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(BII)V")
	private void method3131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray447[arg0] = arg1;
	}
}
