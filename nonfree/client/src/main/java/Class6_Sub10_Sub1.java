import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class6_Sub10_Sub1 extends Class6_Sub10 {

	@OriginalMember(owner = "client!co", name = "Db", descriptor = "I")
	private int anInt1776;

	@OriginalMember(owner = "client!co", name = "Fb", descriptor = "J")
	private long aLong37;

	@OriginalMember(owner = "client!co", name = "Gb", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!co", name = "Hb", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!co", name = "Ib", descriptor = "I")
	private int anInt1777;

	@OriginalMember(owner = "client!co", name = "Jb", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!co", name = "Kb", descriptor = "I")
	private int anInt1778;

	@OriginalMember(owner = "client!co", name = "Lb", descriptor = "Lclient!ao;")
	private Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "[I")
	private final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!co", name = "r", descriptor = "[I")
	public final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!co", name = "I", descriptor = "[I")
	public final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!co", name = "N", descriptor = "[[Lclient!waa;")
	private final Class6_Sub49[][] aClass6_Sub49ArrayArray1 = new Class6_Sub49[16][128];

	@OriginalMember(owner = "client!co", name = "F", descriptor = "[I")
	public final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!co", name = "s", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!co", name = "J", descriptor = "[I")
	private final int[] anIntArray118 = new int[16];

	@OriginalMember(owner = "client!co", name = "X", descriptor = "[I")
	private final int[] anIntArray122 = new int[16];

	@OriginalMember(owner = "client!co", name = "cb", descriptor = "[[Lclient!waa;")
	private final Class6_Sub49[][] aClass6_Sub49ArrayArray2 = new Class6_Sub49[16][128];

	@OriginalMember(owner = "client!co", name = "P", descriptor = "[I")
	private final int[] anIntArray119 = new int[16];

	@OriginalMember(owner = "client!co", name = "S", descriptor = "[I")
	private final int[] anIntArray120 = new int[16];

	@OriginalMember(owner = "client!co", name = "T", descriptor = "[I")
	private final int[] anIntArray121 = new int[16];

	@OriginalMember(owner = "client!co", name = "E", descriptor = "I")
	private final int anInt1743 = 1000000;

	@OriginalMember(owner = "client!co", name = "mb", descriptor = "I")
	private int anInt1763 = 256;

	@OriginalMember(owner = "client!co", name = "fb", descriptor = "[I")
	private final int[] anIntArray123 = new int[16];

	@OriginalMember(owner = "client!co", name = "zb", descriptor = "[I")
	private final int[] anIntArray128 = new int[16];

	@OriginalMember(owner = "client!co", name = "tb", descriptor = "[I")
	private final int[] anIntArray127 = new int[16];

	@OriginalMember(owner = "client!co", name = "kb", descriptor = "[I")
	private final int[] anIntArray125 = new int[16];

	@OriginalMember(owner = "client!co", name = "ob", descriptor = "[I")
	private final int[] anIntArray126 = new int[16];

	@OriginalMember(owner = "client!co", name = "jb", descriptor = "[I")
	private final int[] anIntArray124 = new int[16];

	@OriginalMember(owner = "client!co", name = "x", descriptor = "Lclient!aba;")
	private final Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!co", name = "Eb", descriptor = "Lclient!nj;")
	private final Class6_Sub10_Sub4 aClass6_Sub10_Sub4_1 = new Class6_Sub10_Sub4(this);

	@OriginalMember(owner = "client!co", name = "A", descriptor = "Lclient!tq;")
	private final Class305 aClass305_10 = new Class305(128);

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class6_Sub10_Sub1() {
		this.method1534();
		this.method1549(true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)I")
	public int method1516() {
		return this.anInt1763;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBI)V")
	private void method1517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray126[arg1] != arg0) {
			this.anIntArray126[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass6_Sub49ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIB)V")
	private void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray118[arg0] = arg1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZ)V")
	private synchronized void method1519(@OriginalArg(1) boolean arg0) {
		this.aClass3_1.method114();
		this.aClass6_Sub3_2 = null;
		this.method1549(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
	private void method1520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray120[arg1] = arg0;
		this.anIntArray117[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
	private void method1521(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method1530(arg0, 64, arg1);
		if ((this.anIntArray113[arg0] & 0x2) != 0) {
			for (@Pc(28) Class6_Sub49 local28 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5184(); local28 != null; local28 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5172()) {
				if (local28.anInt9522 == arg0 && local28.anInt9520 < 0) {
					this.aClass6_Sub49ArrayArray2[arg0][local28.anInt9533] = null;
					this.aClass6_Sub49ArrayArray2[arg0][arg1] = local28;
					@Pc(70) int local70 = (local28.anInt9529 * local28.anInt9518 >> 12) + local28.anInt9525;
					local28.anInt9525 += arg1 - local28.anInt9533 << 8;
					local28.anInt9529 = 4096;
					local28.anInt9518 = local70 - local28.anInt9525;
					local28.anInt9533 = arg1;
					return;
				}
			}
		}
		@Pc(116) Class6_Sub46 local116 = (Class6_Sub46) this.aClass305_10.method7447((long) this.anIntArray126[arg0]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class6_Sub12_Sub1 local124 = local116.aClass6_Sub12_Sub1Array1[arg1];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class6_Sub49 local131 = new Class6_Sub49();
		local131.aClass6_Sub12_Sub1_4 = local124;
		local131.aClass6_Sub46_1 = local116;
		local131.anInt9522 = arg0;
		local131.aClass229_1 = local116.aClass229Array1[arg1];
		local131.anInt9515 = local116.aByteArray114[arg1];
		local131.anInt9533 = arg1;
		local131.anInt9524 = arg2 * arg2 * local116.anInt8949 * local116.aByteArray113[arg1] + 1024 >> 11;
		local131.anInt9517 = local116.aByteArray112[arg1] & 0xFF;
		local131.anInt9525 = (arg1 << 8) - (local116.aShortArray157[arg1] & 0x7FFF);
		local131.anInt9528 = 0;
		local131.anInt9516 = 0;
		local131.anInt9520 = -1;
		local131.anInt9523 = 0;
		local131.anInt9532 = 0;
		if (this.anIntArray116[arg0] == 0) {
			local131.aClass6_Sub10_Sub2_4 = Static587.method3444(local124, this.method1548(local131), this.method1526(local131), this.method1528(local131));
		} else {
			local131.aClass6_Sub10_Sub2_4 = Static587.method3444(local124, this.method1548(local131), 0, this.method1528(local131));
			this.method1522(local131, local116.aShortArray157[arg1] < 0);
		}
		if (local116.aShortArray157[arg1] < 0) {
			local131.aClass6_Sub10_Sub2_4.method3434(-1);
		}
		if (local131.anInt9515 >= 0) {
			@Pc(278) Class6_Sub49 local278 = this.aClass6_Sub49ArrayArray1[arg0][local131.anInt9515];
			if (local278 != null && local278.anInt9520 < 0) {
				this.aClass6_Sub49ArrayArray2[arg0][local278.anInt9533] = null;
				local278.anInt9520 = 0;
			}
			this.aClass6_Sub49ArrayArray1[arg0][local131.anInt9515] = local131;
		}
		this.aClass6_Sub10_Sub4_1.aClass211_56.method5173(local131);
		this.aClass6_Sub49ArrayArray2[arg0][arg1] = local131;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!waa;IZ)V")
	public void method1522(@OriginalArg(0) Class6_Sub49 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass6_Sub12_Sub1_4.aByteArray124.length;
		@Pc(27) int local27;
		if (arg1 && arg0.aClass6_Sub12_Sub1_4.aBoolean706) {
			@Pc(38) int local38 = local8 + local8 - arg0.aClass6_Sub12_Sub1_4.anInt9542;
			local27 = (int) ((long) this.anIntArray116[arg0.anInt9522] * (long) local38 >> 6);
			local8 <<= 0x8;
			if (local8 <= local27) {
				arg0.aClass6_Sub10_Sub2_4.method3412();
				local27 = local8 + local8 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) this.anIntArray116[arg0.anInt9522] * (long) local8 >> 6);
		}
		arg0.aClass6_Sub10_Sub2_4.method3423(local27);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!waa;II[I)Z")
	public boolean method1523(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub49 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg1.anInt9527 = Static77.anInt1912 / 100;
		if (arg1.anInt9520 >= 0 && (arg1.aClass6_Sub10_Sub2_4 == null || arg1.aClass6_Sub10_Sub2_4.method3419())) {
			arg1.method7950();
			arg1.method8151();
			if (arg1.anInt9515 > 0 && this.aClass6_Sub49ArrayArray1[arg1.anInt9522][arg1.anInt9515] == arg1) {
				this.aClass6_Sub49ArrayArray1[arg1.anInt9522][arg1.anInt9515] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt9529;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray115[arg1.anInt9522] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt9529 = local56;
		}
		arg1.aClass6_Sub10_Sub2_4.method3438(this.method1548(arg1));
		@Pc(94) Class229 local94 = arg1.aClass229_1;
		arg1.anInt9531++;
		@Pc(102) boolean local102 = false;
		arg1.anInt9521 += local94.anInt6824;
		@Pc(127) double local127 = (double) ((arg1.anInt9529 * arg1.anInt9518 >> 12) + (arg1.anInt9533 - 60 << 8)) * 5.086263020833333E-6D;
		if (local94.anInt6819 > 0) {
			if (local94.anInt6820 > 0) {
				arg1.anInt9532 += (int) (Math.pow(2.0D, local127 * (double) local94.anInt6820) * 128.0D + 0.5D);
			} else {
				arg1.anInt9532 += 128;
			}
			if (arg1.anInt9532 * local94.anInt6819 >= 819200) {
				local102 = true;
			}
		}
		if (local94.aByteArray76 != null) {
			if (local94.anInt6818 <= 0) {
				arg1.anInt9516 += 128;
			} else {
				arg1.anInt9516 += (int) (Math.pow(2.0D, local127 * (double) local94.anInt6818) * 128.0D + 0.5D);
			}
			while (arg1.anInt9523 < local94.aByteArray76.length - 2 && arg1.anInt9516 > (local94.aByteArray76[arg1.anInt9523 + 2] & 0xFF) << 8) {
				arg1.anInt9523 += 2;
			}
			if (local94.aByteArray76.length - 2 == arg1.anInt9523 && local94.aByteArray76[arg1.anInt9523 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg1.anInt9520 >= 0 && local94.aByteArray75 != null && (this.anIntArray113[arg1.anInt9522] & 0x1) == 0 && (arg1.anInt9515 < 0 || arg1 != this.aClass6_Sub49ArrayArray1[arg1.anInt9522][arg1.anInt9515])) {
			if (local94.anInt6823 > 0) {
				arg1.anInt9520 += (int) (Math.pow(2.0D, local127 * (double) local94.anInt6823) * 128.0D + 0.5D);
			} else {
				arg1.anInt9520 += 128;
			}
			while (local94.aByteArray75.length - 2 > arg1.anInt9528 && arg1.anInt9520 > (local94.aByteArray75[arg1.anInt9528 + 2] & 0xFF) << 8) {
				arg1.anInt9528 += 2;
			}
			if (local94.aByteArray75.length - 2 == arg1.anInt9528) {
				local102 = true;
			}
		}
		if (!local102) {
			arg1.aClass6_Sub10_Sub2_4.method3441(arg1.anInt9527, this.method1526(arg1), this.method1528(arg1));
			return false;
		}
		arg1.aClass6_Sub10_Sub2_4.method3428(arg1.anInt9527);
		if (arg3 == null) {
			arg1.aClass6_Sub10_Sub2_4.method5651(arg2);
		} else {
			arg1.aClass6_Sub10_Sub2_4.method5657(arg3, arg0, arg2);
		}
		if (arg1.aClass6_Sub10_Sub2_4.method3421()) {
			this.aClass6_Sub10_Sub4_1.aClass6_Sub10_Sub3_2.method4737(arg1.aClass6_Sub10_Sub2_4);
		}
		arg1.method7950();
		if (arg1.anInt9520 >= 0) {
			arg1.method8151();
			if (arg1.anInt9515 > 0 && this.aClass6_Sub49ArrayArray1[arg1.anInt9522][arg1.anInt9515] == arg1) {
				this.aClass6_Sub49ArrayArray1[arg1.anInt9522][arg1.anInt9515] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5651(@OriginalArg(0) int arg0) {
		if (this.aClass3_1.method119()) {
			@Pc(14) int local14 = this.aClass3_1.anInt63 * this.anInt1743 / Static77.anInt1912;
			do {
				@Pc(24) long local24 = this.aLong37 + (long) local14 * (long) arg0;
				if (this.aLong38 - local24 >= 0L) {
					this.aLong37 = local24;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong38 + (long) local14 - this.aLong37 - 1L) / (long) local14);
				this.aLong37 += (long) local54 * (long) local14;
				this.aClass6_Sub10_Sub4_1.method5651(local54);
				arg0 -= local54;
				this.method1543();
			} while (this.aClass3_1.method119());
		}
		this.aClass6_Sub10_Sub4_1.method5651(arg0);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(III)V")
	private void method1524() {
		this.anIntArray121[9] = 128;
		this.anIntArray122[9] = 128;
		this.method1517(128, 9);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V")
	public synchronized void method1525() {
		for (@Pc(13) Class6_Sub46 local13 = (Class6_Sub46) this.aClass305_10.method7445(); local13 != null; local13 = (Class6_Sub46) this.aClass305_10.method7449()) {
			local13.method8151();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLclient!waa;)I")
	private int method1526(@OriginalArg(1) Class6_Sub49 arg0) {
		if (this.anIntArray114[arg0.anInt9522] == 0) {
			return 0;
		}
		@Pc(25) Class229 local25 = arg0.aClass229_1;
		@Pc(41) int local41 = this.anIntArray127[arg0.anInt9522] * this.anIntArray124[arg0.anInt9522] + 4096 >> 13;
		@Pc(49) int local49 = local41 * local41 + 16384 >> 15;
		@Pc(58) int local58 = local49 * arg0.anInt9524 + 16384 >> 15;
		@Pc(67) int local67 = local58 * this.anInt1763 + 128 >> 8;
		local41 = local67 * this.anIntArray114[arg0.anInt9522] + 128 >> 8;
		if (local25.anInt6819 > 0) {
			local41 = (int) ((double) local41 * Math.pow(0.5D, (double) arg0.anInt9532 * 1.953125E-5D * (double) local25.anInt6819) + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local25.aByteArray76 != null) {
			local106 = arg0.anInt9516;
			local114 = local25.aByteArray76[arg0.anInt9523 + 1];
			if (arg0.anInt9523 < local25.aByteArray76.length - 2) {
				local132 = (local25.aByteArray76[arg0.anInt9523] & 0xFF) << 8;
				local144 = (local25.aByteArray76[arg0.anInt9523 + 2] & 0xFF) << 8;
				local114 += (local25.aByteArray76[arg0.anInt9523 + 3] - local114) * (local106 + -local132) / (local144 - local132);
			}
			local41 = local114 * local41 + 32 >> 6;
		}
		if (arg0.anInt9520 > 0 && local25.aByteArray75 != null) {
			local106 = arg0.anInt9520;
			local114 = local25.aByteArray75[arg0.anInt9528 + 1];
			if (local25.aByteArray75.length - 2 > arg0.anInt9528) {
				local132 = (local25.aByteArray75[arg0.anInt9528] & 0xFF) << 8;
				local144 = (local25.aByteArray75[arg0.anInt9528 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (-local114 + local25.aByteArray75[arg0.anInt9528 + 3]) / (local144 - local132);
			}
			local41 = local41 * local114 + 32 >> 6;
		}
		return local41;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	private void method1527(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class6_Sub49 local12 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5183(); local12 != null; local12 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5177()) {
			if (arg0 < 0 || arg0 == local12.anInt9522) {
				if (local12.aClass6_Sub10_Sub2_4 != null) {
					local12.aClass6_Sub10_Sub2_4.method3428(Static77.anInt1912 / 100);
					if (local12.aClass6_Sub10_Sub2_4.method3421()) {
						this.aClass6_Sub10_Sub4_1.aClass6_Sub10_Sub3_2.method4737(local12.aClass6_Sub10_Sub2_4);
					}
					local12.method7950();
				}
				if (local12.anInt9520 < 0) {
					this.aClass6_Sub49ArrayArray2[local12.anInt9522][local12.anInt9533] = null;
				}
				local12.method8151();
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!waa;I)I")
	private int method1528(@OriginalArg(0) Class6_Sub49 arg0) {
		@Pc(17) int local17 = this.anIntArray128[arg0.anInt9522];
		return local17 < 8192 ? arg0.anInt9517 * local17 + 32 >> 6 : 16384 - ((128 - arg0.anInt9517) * (-local17 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(IIII)V")
	private void method1529(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIBI)V")
	private void method1530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub49 local12 = this.aClass6_Sub49ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub49ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray113[arg0] & 0x2) == 0) {
			local12.anInt9520 = 0;
			return;
		}
		for (@Pc(51) Class6_Sub49 local51 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5183(); local51 != null; local51 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5177()) {
			if (local12.anInt9522 == local51.anInt9522 && local51.anInt9520 < 0 && local12 != local51) {
				local12.anInt9520 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(III)V")
	public synchronized void method1531() {
		this.method1524();
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)V")
	public synchronized void method1532() {
		this.method1519(true);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)Z")
	public synchronized boolean method1533() {
		return this.aClass3_1.method119();
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "()Lclient!cd;")
	@Override
	public synchronized Class6_Sub10 method5656() {
		return this.aClass6_Sub10_Sub4_1;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "()Lclient!cd;")
	@Override
	public synchronized Class6_Sub10 method5655() {
		return null;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(III)V")
	private synchronized void method1534() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray114[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(II)V")
	private void method1536(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local15 == 128) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method1530(local24, local36, local30);
		} else if (local15 == 144) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local36 > 0) {
				this.method1521(local24, local30, local36);
			} else {
				this.method1530(local24, 64, local30);
			}
		} else if (local15 == 160) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			this.method1529(local30, local36, local24);
		} else if (local15 == 176) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			local36 = arg0 >> 16 & 0x7F;
			if (local30 == 0) {
				this.anIntArray122[local24] = (local36 << 14) + (this.anIntArray122[local24] & 0xFFE03FFF);
			}
			if (local30 == 32) {
				this.anIntArray122[local24] = (this.anIntArray122[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 1) {
				this.anIntArray123[local24] = (this.anIntArray123[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 33) {
				this.anIntArray123[local24] = local36 + (this.anIntArray123[local24] & 0xFFFFFF80);
			}
			if (local30 == 5) {
				this.anIntArray115[local24] = (this.anIntArray115[local24] & 0xFFFFC07F) + (local36 << 7);
			}
			if (local30 == 37) {
				this.anIntArray115[local24] = local36 + (this.anIntArray115[local24] & 0xFFFFFF80);
			}
			if (local30 == 7) {
				this.anIntArray127[local24] = (local36 << 7) + (this.anIntArray127[local24] & 0xFFFFC07F);
			}
			if (local30 == 39) {
				this.anIntArray127[local24] = local36 + (this.anIntArray127[local24] & 0xFFFFFF80);
			}
			if (local30 == 10) {
				this.anIntArray128[local24] = (local36 << 7) + (this.anIntArray128[local24] & 0xFFFFC07F);
			}
			if (local30 == 42) {
				this.anIntArray128[local24] = (this.anIntArray128[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 11) {
				this.anIntArray124[local24] = (local36 << 7) + (this.anIntArray124[local24] & 0xFFFFC07F);
			}
			if (local30 == 43) {
				this.anIntArray124[local24] = (this.anIntArray124[local24] & 0xFFFFFF80) + local36;
			}
			if (local30 == 64) {
				if (local36 >= 64) {
					this.anIntArray113[local24] |= 0x1;
				} else {
					this.anIntArray113[local24] &= 0xFFFFFFFE;
				}
			}
			if (local30 == 65) {
				if (local36 >= 64) {
					this.anIntArray113[local24] |= 0x2;
				} else {
					this.method1546(local24);
					this.anIntArray113[local24] &= 0xFFFFFFFD;
				}
			}
			if (local30 == 99) {
				this.anIntArray119[local24] = (local36 << 7) + (this.anIntArray119[local24] & 0x7F);
			}
			if (local30 == 98) {
				this.anIntArray119[local24] = (this.anIntArray119[local24] & 0x3F80) + local36;
			}
			if (local30 == 101) {
				this.anIntArray119[local24] = (this.anIntArray119[local24] & 0x7F) + (local36 << 7) + 16384;
			}
			if (local30 == 100) {
				this.anIntArray119[local24] = (this.anIntArray119[local24] & 0x3F80) + local36 + 16384;
			}
			if (local30 == 120) {
				this.method1527(local24);
			}
			if (local30 == 121) {
				this.method1540(local24);
			}
			if (local30 == 123) {
				this.method1542(local24);
			}
			@Pc(511) int local511;
			if (local30 == 6) {
				local511 = this.anIntArray119[local24];
				if (local511 == 16384) {
					this.anIntArray125[local24] = (this.anIntArray125[local24] & 0xFFFFC07F) + (local36 << 7);
				}
			}
			if (local30 == 38) {
				local511 = this.anIntArray119[local24];
				if (local511 == 16384) {
					this.anIntArray125[local24] = local36 + (this.anIntArray125[local24] & 0xFFFFFF80);
				}
			}
			if (local30 == 16) {
				this.anIntArray116[local24] = (local36 << 7) + (this.anIntArray116[local24] & 0xFFFFC07F);
			}
			if (local30 == 48) {
				this.anIntArray116[local24] = local36 + (this.anIntArray116[local24] & 0xFFFFFF80);
			}
			if (local30 == 81) {
				if (local36 < 64) {
					this.method1550(local24);
					this.anIntArray113[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray113[local24] |= 0x4;
				}
			}
			if (local30 == 17) {
				this.method1520((local36 << 7) + (this.anIntArray120[local24] & 0xFFFFC07F), local24);
			}
			if (local30 == 49) {
				this.method1520(local36 + (this.anIntArray120[local24] & 0xFFFFFF80), local24);
			}
		} else if (local15 == 192) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method1517(local30 + this.anIntArray122[local24], local24);
		} else if (local15 == 208) {
			local24 = arg0 & 0xF;
			local30 = arg0 >> 8 & 0x7F;
			this.method1547(local30, local24);
		} else if (local15 == 224) {
			local24 = arg0 & 0xF;
			local30 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method1518(local24, local30);
		} else {
			local15 = arg0 & 0xFF;
			if (local15 == 255) {
				this.method1549(true);
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ao;IZ)V")
	public synchronized void method1537(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		this.method1551(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public synchronized void method1538() {
		for (@Pc(11) Class6_Sub46 local11 = (Class6_Sub46) this.aClass305_10.method7445(); local11 != null; local11 = (Class6_Sub46) this.aClass305_10.method7449()) {
			local11.method7504();
		}
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method5657(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass3_1.method119()) {
			@Pc(14) int local14 = this.anInt1743 * this.aClass3_1.anInt63 / Static77.anInt1912;
			do {
				@Pc(23) long local23 = (long) local14 * (long) arg2 + this.aLong37;
				if (this.aLong38 - local23 >= 0L) {
					this.aLong37 = local23;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong38 + (long) local14 - this.aLong37 - 1L) / (long) local14);
				this.aLong37 += (long) local14 * (long) local55;
				this.aClass6_Sub10_Sub4_1.method5657(arg0, arg1, local55);
				this.method1543();
				arg1 += local55;
				arg2 -= local55;
			} while (this.aClass3_1.method119());
		}
		this.aClass6_Sub10_Sub4_1.method5657(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!ao;Lclient!jo;Lclient!rda;IB)Z")
	public synchronized boolean method1539(@OriginalArg(0) Class6_Sub3 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class276 arg2) {
		arg0.method665();
		@Pc(17) boolean local17 = true;
		@Pc(31) int[] local31 = new int[] { 22050 };
		for (@Pc(37) Class6_Sub17 local37 = (Class6_Sub17) arg0.aClass305_7.method7445(); local37 != null; local37 = (Class6_Sub17) arg0.aClass305_7.method7449()) {
			@Pc(43) int local43 = (int) local37.aLong252;
			@Pc(51) Class6_Sub46 local51 = (Class6_Sub46) this.aClass305_10.method7447((long) local43);
			if (local51 == null) {
				local51 = Static375.method5955(arg1, local43);
				if (local51 == null) {
					local17 = false;
					continue;
				}
				this.aClass305_10.method7448((long) local43, local51);
			}
			if (!local51.method7508(local31, local37.aByteArray42, arg2)) {
				local17 = false;
			}
		}
		if (local17) {
			arg0.method666();
		}
		return local17;
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(II)V")
	private void method1540(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1540(local12);
			}
			return;
		}
		this.anIntArray127[arg0] = 12800;
		this.anIntArray128[arg0] = 8192;
		this.anIntArray124[arg0] = 16383;
		this.anIntArray118[arg0] = 8192;
		this.anIntArray123[arg0] = 0;
		this.anIntArray115[arg0] = 8192;
		this.method1546(arg0);
		this.method1550(arg0);
		this.anIntArray113[arg0] = 0;
		this.anIntArray119[arg0] = 32767;
		this.anIntArray125[arg0] = 256;
		this.anIntArray116[arg0] = 0;
		this.method1520(8192, arg0);
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(Lclient!waa;I)Z")
	public boolean method1541(@OriginalArg(0) Class6_Sub49 arg0) {
		if (arg0.aClass6_Sub10_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt9520 >= 0) {
			arg0.method8151();
			if (arg0.anInt9515 > 0 && this.aClass6_Sub49ArrayArray1[arg0.anInt9522][arg0.anInt9515] == arg0) {
				this.aClass6_Sub49ArrayArray1[arg0.anInt9522][arg0.anInt9515] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	private void method1542(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class6_Sub49 local16 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5183(); local16 != null; local16 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5177()) {
			if ((arg0 < 0 || arg0 == local16.anInt9522) && local16.anInt9520 < 0) {
				this.aClass6_Sub49ArrayArray2[local16.anInt9522][local16.anInt9533] = null;
				local16.anInt9520 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(I)V")
	private void method1543() {
		@Pc(14) int local14 = this.anInt1776;
		@Pc(17) int local17 = this.anInt1777;
		@Pc(20) long local20 = this.aLong38;
		if (this.aClass6_Sub3_2 != null && local17 == this.anInt1778) {
			this.method1551(this.aBoolean180, this.aBoolean179, this.aClass6_Sub3_2);
			this.method1543();
			return;
		}
		while (local17 == this.anInt1777) {
			while (local17 == this.aClass3_1.anIntArray10[local14]) {
				this.aClass3_1.method111(local14);
				@Pc(53) int local53 = this.aClass3_1.method116(local14);
				if (local53 == 1) {
					this.aClass3_1.method110();
					this.aClass3_1.method121(local14);
					if (this.aClass3_1.method123()) {
						if (this.aClass6_Sub3_2 != null) {
							this.method1537(this.aClass6_Sub3_2, this.aBoolean179);
							this.method1543();
							return;
						}
						if (!this.aBoolean179 || local17 == 0) {
							this.method1549(true);
							this.aClass3_1.method114();
							return;
						}
						this.aClass3_1.method109(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method1536(local53);
				}
				this.aClass3_1.method124(local14);
				this.aClass3_1.method121(local14);
			}
			local14 = this.aClass3_1.method118();
			local17 = this.aClass3_1.anIntArray10[local14];
			local20 = this.aClass3_1.method115(local17);
		}
		this.aLong38 = local20;
		this.anInt1776 = local14;
		this.anInt1777 = local17;
		if (this.aClass6_Sub3_2 != null && this.anInt1778 < local17) {
			this.anInt1776 = -1;
			this.anInt1777 = this.anInt1778;
			this.aLong38 = this.aClass3_1.method115(this.anInt1777);
		}
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(II)V")
	public synchronized void method1544(@OriginalArg(0) int arg0) {
		this.anInt1763 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(II)V")
	private void method1546(@OriginalArg(1) int arg0) {
		if ((this.anIntArray113[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub49 local22 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5183(); local22 != null; local22 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5177()) {
			if (local22.anInt9522 == arg0 && this.aClass6_Sub49ArrayArray2[arg0][local22.anInt9533] == null && local22.anInt9520 < 0) {
				local22.anInt9520 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "e", descriptor = "(III)V")
	private void method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZLclient!waa;)I")
	private int method1548(@OriginalArg(1) Class6_Sub49 arg0) {
		@Pc(15) int local15 = arg0.anInt9525 + (arg0.anInt9518 * arg0.anInt9529 >> 12);
		local15 += this.anIntArray125[arg0.anInt9522] * (this.anIntArray118[arg0.anInt9522] - 8192) >> 12;
		@Pc(36) Class229 local36 = arg0.aClass229_1;
		@Pc(62) int local62;
		if (local36.anInt6824 > 0 && (local36.anInt6822 > 0 || this.anIntArray123[arg0.anInt9522] > 0)) {
			local62 = local36.anInt6822 << 2;
			@Pc(67) int local67 = local36.anInt6821 << 1;
			if (arg0.anInt9531 < local67) {
				local62 = arg0.anInt9531 * local62 / local67;
			}
			local62 += this.anIntArray123[arg0.anInt9522] >> 7;
			@Pc(97) double local97 = Math.sin((double) (arg0.anInt9521 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local62 * local97);
		}
		local62 = (int) ((double) (arg0.aClass6_Sub12_Sub1_4.anInt9543 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static77.anInt1912 + 0.5D);
		return local62 >= 1 ? local62 : 1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	private void method1549(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1527(-1);
		} else {
			this.method1542(-1);
		}
		this.method1540(-1);
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			this.anIntArray126[local25] = this.anIntArray121[local25];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray122[local47] = this.anIntArray121[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(II)V")
	private void method1550(@OriginalArg(0) int arg0) {
		if ((this.anIntArray113[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(29) Class6_Sub49 local29 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5183(); local29 != null; local29 = (Class6_Sub49) this.aClass6_Sub10_Sub4_1.aClass211_56.method5177()) {
			if (local29.anInt9522 == arg0) {
				local29.anInt9530 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZLclient!ao;B)V")
	private synchronized void method1551(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub3 arg2) {
		this.method1519(arg0);
		this.aClass3_1.method113(arg2.aByteArray21);
		this.aBoolean179 = arg1;
		this.aLong37 = 0L;
		@Pc(24) int local24 = this.aClass3_1.method122();
		for (@Pc(34) int local34 = 0; local34 < local24; local34++) {
			this.aClass3_1.method111(local34);
			this.aClass3_1.method124(local34);
			this.aClass3_1.method121(local34);
		}
		this.anInt1776 = this.aClass3_1.method118();
		this.anInt1777 = this.aClass3_1.anIntArray10[this.anInt1776];
		this.aLong38 = this.aClass3_1.method115(this.anInt1777);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5652() {
		return 0;
	}
}
