import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class8_Sub8_Sub2 extends Class8_Sub8 {

	@OriginalMember(owner = "client!ka", name = "Hb", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!ka", name = "Ib", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!ka", name = "Jb", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!ka", name = "Lb", descriptor = "Z")
	private boolean aBoolean220;

	@OriginalMember(owner = "client!ka", name = "Mb", descriptor = "I")
	private int anInt2664;

	@OriginalMember(owner = "client!ka", name = "Nb", descriptor = "Lclient!ao;")
	private Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!ka", name = "Ob", descriptor = "Z")
	private boolean aBoolean221;

	@OriginalMember(owner = "client!ka", name = "Pb", descriptor = "I")
	private int anInt2665;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	private int anInt2625 = 1000000;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
	private int anInt2647 = 256;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "[I")
	private int[] anIntArray211 = new int[16];

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "[I")
	private int[] anIntArray213 = new int[16];

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
	private int[] anIntArray209 = new int[16];

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[I")
	private int[] anIntArray210 = new int[16];

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "[I")
	private int[] anIntArray216 = new int[16];

	@OriginalMember(owner = "client!ka", name = "jb", descriptor = "[I")
	public int[] anIntArray217 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "[I")
	public int[] anIntArray214 = new int[16];

	@OriginalMember(owner = "client!ka", name = "nb", descriptor = "[I")
	private int[] anIntArray218 = new int[16];

	@OriginalMember(owner = "client!ka", name = "bb", descriptor = "[I")
	private int[] anIntArray215 = new int[16];

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
	public int[] anIntArray212 = new int[16];

	@OriginalMember(owner = "client!ka", name = "ub", descriptor = "[I")
	private int[] anIntArray221 = new int[16];

	@OriginalMember(owner = "client!ka", name = "vb", descriptor = "[I")
	private int[] anIntArray222 = new int[16];

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "[I")
	private int[] anIntArray219 = new int[16];

	@OriginalMember(owner = "client!ka", name = "xb", descriptor = "[I")
	private int[] anIntArray223 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Ab", descriptor = "[[Lclient!bg;")
	private Class8_Sub5[][] aClass8_Sub5ArrayArray2 = new Class8_Sub5[16][128];

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "[[Lclient!bg;")
	private Class8_Sub5[][] aClass8_Sub5ArrayArray1 = new Class8_Sub5[16][128];

	@OriginalMember(owner = "client!ka", name = "tb", descriptor = "[I")
	private int[] anIntArray220 = new int[16];

	@OriginalMember(owner = "client!ka", name = "Fb", descriptor = "[I")
	private int[] anIntArray224 = new int[16];

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!tl;")
	private Class160 aClass160_1 = new Class160();

	@OriginalMember(owner = "client!ka", name = "Kb", descriptor = "Lclient!ni;")
	private Class8_Sub8_Sub3 aClass8_Sub8_Sub3_1 = new Class8_Sub8_Sub3(this);

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "Lclient!pd;")
	private Class129 aClass129_11 = new Class129(128);

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class8_Sub8_Sub2() {
		this.method2114();
		this.method2130(true);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public synchronized void method2112() {
		for (@Pc(17) Class8_Sub33 local17 = (Class8_Sub33) this.aClass129_11.method3035(); local17 != null; local17 = (Class8_Sub33) this.aClass129_11.method3048()) {
			local17.method4273();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method3705(@OriginalArg(0) int arg0) {
		if (this.aClass160_1.method3897()) {
			@Pc(15) int local15 = this.aClass160_1.anInt5210 * this.anInt2625 / Static264.anInt5577;
			do {
				@Pc(24) long local24 = this.aLong98 + (long) local15 * (long) arg0;
				if (this.aLong99 - local24 >= 0L) {
					this.aLong98 = local24;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local15 + this.aLong99 - this.aLong98 - 1L) / (long) local15);
				this.aLong98 += (long) local15 * (long) local52;
				arg0 -= local52;
				this.aClass8_Sub8_Sub3_1.method3705(local52);
				this.method2136();
			} while (this.aClass160_1.method3897());
		}
		this.aClass8_Sub8_Sub3_1.method3705(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
	private synchronized void method2113(@OriginalArg(0) boolean arg0) {
		this.aClass160_1.method3898();
		this.aClass8_Sub4_1 = null;
		this.method2130(arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	private synchronized void method2114() {
		for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
			this.anIntArray218[local22] = 256;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
	private void method2115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray221[arg1] = arg0;
		this.anIntArray212[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZBLclient!ao;Z)V")
	private synchronized void method2116(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub4 arg1, @OriginalArg(3) boolean arg2) {
		this.method2113(arg0);
		this.aClass160_1.method3904(arg1.aByteArray3);
		this.aLong98 = 0L;
		this.aBoolean220 = arg2;
		@Pc(24) int local24 = this.aClass160_1.method3902();
		for (@Pc(32) int local32 = 0; local32 < local24; local32++) {
			this.aClass160_1.method3905(local32);
			this.aClass160_1.method3907(local32);
			this.aClass160_1.method3908(local32);
		}
		this.anInt2663 = this.aClass160_1.method3901();
		this.anInt2664 = this.aClass160_1.anIntArray413[this.anInt2663];
		this.aLong99 = this.aClass160_1.method3899(this.anInt2664);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Lclient!kn;")
	@Override
	public synchronized Class8_Sub8 method3704() {
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bg;I)I")
	private int method2117(@OriginalArg(0) Class8_Sub5 arg0) {
		if (this.anIntArray218[arg0.anInt599] == 0) {
			return 0;
		}
		@Pc(17) Class88 local17 = arg0.aClass88_1;
		@Pc(38) int local38 = this.anIntArray215[arg0.anInt599] * this.anIntArray220[arg0.anInt599] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt610 * local46 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt2647 + 128 >> 8;
		local38 = local64 * this.anIntArray218[arg0.anInt599] + 128 >> 8;
		if (local17.anInt2498 > 0) {
			local38 = (int) ((double) local38 * Math.pow(0.5D, (double) arg0.anInt609 * 1.953125E-5D * (double) local17.anInt2498) + 0.5D);
		}
		@Pc(113) int local113;
		@Pc(110) int local110;
		@Pc(143) int local143;
		@Pc(133) int local133;
		if (local17.aByteArray18 != null) {
			local110 = local17.aByteArray18[arg0.anInt593 + 1];
			local113 = arg0.anInt606;
			if (arg0.anInt593 < local17.aByteArray18.length - 2) {
				local133 = (local17.aByteArray18[arg0.anInt593 + 2] & 0xFF) << 8;
				local143 = (local17.aByteArray18[arg0.anInt593] & 0xFF) << 8;
				local110 += (local17.aByteArray18[arg0.anInt593 + 3] - local110) * (-local143 + local113) / (local133 - local143);
			}
			local38 = local110 * local38 + 32 >> 6;
		}
		if (arg0.anInt607 > 0 && local17.aByteArray19 != null) {
			local113 = arg0.anInt607;
			local110 = local17.aByteArray19[arg0.anInt612 + 1];
			if (local17.aByteArray19.length - 2 > arg0.anInt612) {
				local143 = (local17.aByteArray19[arg0.anInt612] & 0xFF) << 8;
				local133 = (local17.aByteArray19[arg0.anInt612 + 2] & 0xFF) << 8;
				local110 += (local113 - local143) * (local17.aByteArray19[arg0.anInt612 + 3] + -local110) / (local133 - local143);
			}
			local38 = local110 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!ke;Lclient!pk;ILclient!ao;)Z")
	public synchronized boolean method2118(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(4) Class8_Sub4 arg2) {
		arg2.method276();
		@Pc(9) boolean local9 = true;
		@Pc(24) int[] local24 = new int[] { 22050 };
		for (@Pc(30) Class8_Sub31 local30 = (Class8_Sub31) arg2.aClass129_2.method3035(); local30 != null; local30 = (Class8_Sub31) arg2.aClass129_2.method3048()) {
			@Pc(36) int local36 = (int) local30.aLong203;
			@Pc(44) Class8_Sub33 local44 = (Class8_Sub33) this.aClass129_11.method3043((long) local36);
			if (local44 == null) {
				local44 = Static254.method3800(arg1, local36);
				if (local44 == null) {
					local9 = false;
					continue;
				}
				this.aClass129_11.method3039(local44, (long) local36);
			}
			if (!local44.method4049(arg0, local24, local30.aByteArray58)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method277();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)V")
	private void method2119(@OriginalArg(0) int arg0) {
		if ((this.anIntArray214[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(16) Class8_Sub5 local16 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4319(); local16 != null; local16 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4329()) {
			if (local16.anInt599 == arg0 && this.aClass8_Sub5ArrayArray2[arg0][local16.anInt598] == null && local16.anInt607 < 0) {
				local16.anInt607 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)V")
	private void method2120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IB)V")
	public synchronized void method2121(@OriginalArg(0) int arg0) {
		this.anInt2647 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
	private void method2122(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class8_Sub5 local12 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4319(); local12 != null; local12 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4329()) {
			if ((arg0 < 0 || local12.anInt599 == arg0) && local12.anInt607 < 0) {
				this.aClass8_Sub5ArrayArray2[local12.anInt599][local12.anInt598] = null;
				local12.anInt607 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)V")
	public synchronized void method2125() {
		this.method2126();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(III)V")
	private void method2126() {
		this.anIntArray211[9] = 128;
		this.anIntArray222[9] = 128;
		this.method2146(128, 9);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIILclient!bg;)Z")
	public boolean method2127(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class8_Sub5 arg3) {
		arg3.anInt597 = Static264.anInt5577 / 100;
		if (arg3.anInt607 >= 0 && (arg3.aClass8_Sub8_Sub4_1 == null || arg3.aClass8_Sub8_Sub4_1.method3715())) {
			arg3.method401();
			arg3.method4273();
			if (arg3.anInt605 > 0 && this.aClass8_Sub5ArrayArray1[arg3.anInt599][arg3.anInt605] == arg3) {
				this.aClass8_Sub5ArrayArray1[arg3.anInt599][arg3.anInt605] = null;
			}
			return true;
		}
		@Pc(58) int local58 = arg3.anInt603;
		if (local58 > 0) {
			local58 -= (int) (Math.pow(2.0D, (double) this.anIntArray210[arg3.anInt599] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local58 < 0) {
				local58 = 0;
			}
			arg3.anInt603 = local58;
		}
		arg3.aClass8_Sub8_Sub4_1.method3710(this.method2132(arg3));
		@Pc(95) boolean local95 = false;
		@Pc(98) Class88 local98 = arg3.aClass88_1;
		arg3.anInt616++;
		@Pc(130) double local130 = (double) ((arg3.anInt598 - 60 << 8) + (arg3.anInt595 * arg3.anInt603 >> 12)) * 5.086263020833333E-6D;
		arg3.anInt600 += local98.anInt2496;
		if (local98.anInt2498 > 0) {
			if (local98.anInt2491 <= 0) {
				arg3.anInt609 += 128;
			} else {
				arg3.anInt609 += (int) (Math.pow(2.0D, (double) local98.anInt2491 * local130) * 128.0D + 0.5D);
			}
			if (local98.anInt2498 * arg3.anInt609 >= 819200) {
				local95 = true;
			}
		}
		if (local98.aByteArray18 != null) {
			if (local98.anInt2488 > 0) {
				arg3.anInt606 += (int) (Math.pow(2.0D, local130 * (double) local98.anInt2488) * 128.0D + 0.5D);
			} else {
				arg3.anInt606 += 128;
			}
			while (arg3.anInt593 < local98.aByteArray18.length - 2 && (local98.aByteArray18[arg3.anInt593 + 2] & 0xFF) << 8 < arg3.anInt606) {
				arg3.anInt593 += 2;
			}
			if (arg3.anInt593 == local98.aByteArray18.length - 2 && local98.aByteArray18[arg3.anInt593 + 1] == 0) {
				local95 = true;
			}
		}
		if (arg3.anInt607 >= 0 && local98.aByteArray19 != null && (this.anIntArray214[arg3.anInt599] & 0x1) == 0 && (arg3.anInt605 < 0 || arg3 != this.aClass8_Sub5ArrayArray1[arg3.anInt599][arg3.anInt605])) {
			if (local98.anInt2494 <= 0) {
				arg3.anInt607 += 128;
			} else {
				arg3.anInt607 += (int) (Math.pow(2.0D, local130 * (double) local98.anInt2494) * 128.0D + 0.5D);
			}
			while (local98.aByteArray19.length - 2 > arg3.anInt612 && (local98.aByteArray19[arg3.anInt612 + 2] & 0xFF) << 8 < arg3.anInt607) {
				arg3.anInt612 += 2;
			}
			if (arg3.anInt612 == local98.aByteArray19.length - 2) {
				local95 = true;
			}
		}
		if (!local95) {
			arg3.aClass8_Sub8_Sub4_1.method3731(arg3.anInt597, this.method2117(arg3), this.method2148(arg3));
			return false;
		}
		arg3.aClass8_Sub8_Sub4_1.method3725(arg3.anInt597);
		if (arg0 == null) {
			arg3.aClass8_Sub8_Sub4_1.method3705(arg2);
		} else {
			arg3.aClass8_Sub8_Sub4_1.method3707(arg0, arg1, arg2);
		}
		if (arg3.aClass8_Sub8_Sub4_1.method3734()) {
			this.aClass8_Sub8_Sub3_1.aClass8_Sub8_Sub1_2.method834(arg3.aClass8_Sub8_Sub4_1);
		}
		arg3.method401();
		if (arg3.anInt607 >= 0) {
			arg3.method4273();
			if (arg3.anInt605 > 0 && arg3 == this.aClass8_Sub5ArrayArray1[arg3.anInt599][arg3.anInt605]) {
				this.aClass8_Sub5ArrayArray1[arg3.anInt599][arg3.anInt605] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIBI)V")
	private void method2128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2141(64, arg0, arg2);
		if ((this.anIntArray214[arg0] & 0x2) != 0) {
			for (@Pc(27) Class8_Sub5 local27 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4320(); local27 != null; local27 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4324()) {
				if (local27.anInt599 == arg0 && local27.anInt607 < 0) {
					this.aClass8_Sub5ArrayArray2[arg0][local27.anInt598] = null;
					this.aClass8_Sub5ArrayArray2[arg0][arg2] = local27;
					@Pc(70) int local70 = local27.anInt615 + (local27.anInt603 * local27.anInt595 >> 12);
					local27.anInt603 = 4096;
					local27.anInt615 += arg2 - local27.anInt598 << 8;
					local27.anInt598 = arg2;
					local27.anInt595 = local70 - local27.anInt615;
					return;
				}
			}
		}
		@Pc(124) Class8_Sub33 local124 = (Class8_Sub33) this.aClass129_11.method3043((long) this.anIntArray219[arg0]);
		if (local124 == null) {
			return;
		}
		@Pc(133) Class8_Sub20_Sub1 local133 = local124.aClass8_Sub20_Sub1Array1[arg2];
		if (local133 == null) {
			return;
		}
		@Pc(141) Class8_Sub5 local141 = new Class8_Sub5();
		local141.anInt599 = arg0;
		local141.aClass8_Sub20_Sub1_1 = local133;
		local141.aClass8_Sub33_1 = local124;
		local141.aClass88_1 = local124.aClass88Array1[arg2];
		local141.anInt605 = local124.aByteArray60[arg2];
		local141.anInt598 = arg2;
		local141.anInt610 = local124.aByteArray61[arg2] * local124.anInt5360 * arg1 * arg1 + 1024 >> 11;
		local141.anInt608 = local124.aByteArray59[arg2] & 0xFF;
		local141.anInt615 = (arg2 << 8) - (local124.aShortArray64[arg2] & 0x7FFF);
		local141.anInt612 = 0;
		local141.anInt606 = 0;
		local141.anInt609 = 0;
		local141.anInt607 = -1;
		local141.anInt593 = 0;
		if (this.anIntArray217[arg0] == 0) {
			local141.aClass8_Sub8_Sub4_1 = Static309.method3740(local133, this.method2132(local141), this.method2117(local141), this.method2148(local141));
		} else {
			local141.aClass8_Sub8_Sub4_1 = Static309.method3740(local133, this.method2132(local141), 0, this.method2148(local141));
			this.method2143(local124.aShortArray64[arg2] < 0, local141);
		}
		if (local124.aShortArray64[arg2] < 0) {
			local141.aClass8_Sub8_Sub4_1.method3716(-1);
		}
		if (local141.anInt605 >= 0) {
			@Pc(296) Class8_Sub5 local296 = this.aClass8_Sub5ArrayArray1[arg0][local141.anInt605];
			if (local296 != null && local296.anInt607 < 0) {
				this.aClass8_Sub5ArrayArray2[arg0][local296.anInt598] = null;
				local296.anInt607 = 0;
			}
			this.aClass8_Sub5ArrayArray1[arg0][local141.anInt605] = local141;
		}
		this.aClass8_Sub8_Sub3_1.aClass182_21.method4328(local141);
		this.aClass8_Sub5ArrayArray2[arg0][arg2] = local141;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	private void method2129(@OriginalArg(0) int arg0) {
		if ((this.anIntArray214[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(16) Class8_Sub5 local16 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4319(); local16 != null; local16 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4329()) {
			if (local16.anInt599 == arg0) {
				local16.anInt602 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)V")
	private void method2130(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2133(-1);
		} else {
			this.method2122(-1);
		}
		this.method2142(-1);
		@Pc(19) int local19;
		for (local19 = 0; local19 < 16; local19++) {
			this.anIntArray219[local19] = this.anIntArray211[local19];
		}
		for (local19 = 0; local19 < 16; local19++) {
			this.anIntArray222[local19] = this.anIntArray211[local19] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!bg;)Z")
	public boolean method2131(@OriginalArg(1) Class8_Sub5 arg0) {
		if (arg0.aClass8_Sub8_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt607 >= 0) {
			arg0.method4273();
			if (arg0.anInt605 > 0 && arg0 == this.aClass8_Sub5ArrayArray1[arg0.anInt599][arg0.anInt605]) {
				this.aClass8_Sub5ArrayArray1[arg0.anInt599][arg0.anInt605] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bg;B)I")
	private int method2132(@OriginalArg(0) Class8_Sub5 arg0) {
		@Pc(14) int local14 = (arg0.anInt603 * arg0.anInt595 >> 12) + arg0.anInt615;
		local14 += this.anIntArray224[arg0.anInt599] * (this.anIntArray216[arg0.anInt599] - 8192) >> 12;
		@Pc(42) Class88 local42 = arg0.aClass88_1;
		@Pc(66) int local66;
		if (local42.anInt2496 > 0 && (local42.anInt2492 > 0 || this.anIntArray213[arg0.anInt599] > 0)) {
			local66 = local42.anInt2492 << 2;
			@Pc(71) int local71 = local42.anInt2493 << 1;
			if (local71 > arg0.anInt616) {
				local66 = arg0.anInt616 * local66 / local71;
			}
			local66 += this.anIntArray213[arg0.anInt599] >> 7;
			@Pc(106) double local106 = Math.sin((double) (arg0.anInt600 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local106 * (double) local66);
		}
		local66 = (int) ((double) (arg0.aClass8_Sub20_Sub1_1.anInt4698 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static264.anInt5577 + 0.5D);
		return local66 >= 1 ? local66 : 1;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method3707(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass160_1.method3897()) {
			@Pc(18) int local18 = this.aClass160_1.anInt5210 * this.anInt2625 / Static264.anInt5577;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg2 + this.aLong98;
				if (this.aLong99 - local27 >= 0L) {
					this.aLong98 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong99 + (long) local18 - this.aLong98 - 1L) / (long) local18);
				arg2 -= local57;
				this.aLong98 += (long) local18 * (long) local57;
				this.aClass8_Sub8_Sub3_1.method3707(arg0, arg1, local57);
				this.method2136();
				arg1 += local57;
			} while (this.aClass160_1.method3897());
		}
		this.aClass8_Sub8_Sub3_1.method3707(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	private void method2133(@OriginalArg(0) int arg0) {
		for (@Pc(14) Class8_Sub5 local14 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4319(); local14 != null; local14 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4329()) {
			if (arg0 < 0 || local14.anInt599 == arg0) {
				if (local14.aClass8_Sub8_Sub4_1 != null) {
					local14.aClass8_Sub8_Sub4_1.method3725(Static264.anInt5577 / 100);
					if (local14.aClass8_Sub8_Sub4_1.method3734()) {
						this.aClass8_Sub8_Sub3_1.aClass8_Sub8_Sub1_2.method834(local14.aClass8_Sub8_Sub4_1);
					}
					local14.method401();
				}
				if (local14.anInt607 < 0) {
					this.aClass8_Sub5ArrayArray2[local14.anInt599][local14.anInt598] = null;
				}
				local14.method4273();
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public synchronized void method2134() {
		this.method2113(true);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public synchronized void method2135() {
		for (@Pc(15) Class8_Sub33 local15 = (Class8_Sub33) this.aClass129_11.method3035(); local15 != null; local15 = (Class8_Sub33) this.aClass129_11.method3048()) {
			local15.method4051();
		}
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V")
	private void method2136() {
		@Pc(8) long local8 = this.aLong99;
		@Pc(11) int local11 = this.anInt2664;
		@Pc(14) int local14 = this.anInt2663;
		if (this.aClass8_Sub4_1 != null && local11 == this.anInt2665) {
			this.method2116(this.aBoolean221, this.aClass8_Sub4_1, this.aBoolean220);
			this.method2136();
			return;
		}
		while (local11 == this.anInt2664) {
			while (local11 == this.aClass160_1.anIntArray413[local14]) {
				this.aClass160_1.method3905(local14);
				@Pc(62) int local62 = this.aClass160_1.method3893(local14);
				if (local62 == 1) {
					this.aClass160_1.method3903();
					this.aClass160_1.method3908(local14);
					if (this.aClass160_1.method3906()) {
						if (this.aClass8_Sub4_1 != null) {
							this.method2147(this.aClass8_Sub4_1, this.aBoolean220);
							this.method2136();
							return;
						}
						if (!this.aBoolean220 || local11 == 0) {
							this.method2130(true);
							this.aClass160_1.method3898();
							return;
						}
						this.aClass160_1.method3900(local8);
					}
					break;
				}
				if ((local62 & 0x80) != 0) {
					this.method2149(local62);
				}
				this.aClass160_1.method3907(local14);
				this.aClass160_1.method3908(local14);
			}
			local14 = this.aClass160_1.method3901();
			local11 = this.aClass160_1.anIntArray413[local14];
			local8 = this.aClass160_1.method3899(local11);
		}
		this.anInt2663 = local14;
		this.aLong99 = local8;
		this.anInt2664 = local11;
		if (this.aClass8_Sub4_1 != null && this.anInt2665 < local11) {
			this.anInt2663 = -1;
			this.anInt2664 = this.anInt2665;
			this.aLong99 = this.aClass160_1.method3899(this.anInt2664);
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I")
	public int method2138() {
		return this.anInt2647;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIB)V")
	private void method2139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray216[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIBI)V")
	private void method2140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIII)V")
	private void method2141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class8_Sub5 local16 = this.aClass8_Sub5ArrayArray2[arg1][arg2];
		if (local16 == null) {
			return;
		}
		this.aClass8_Sub5ArrayArray2[arg1][arg2] = null;
		if ((this.anIntArray214[arg1] & 0x2) == 0) {
			local16.anInt607 = 0;
			return;
		}
		for (@Pc(53) Class8_Sub5 local53 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4319(); local53 != null; local53 = (Class8_Sub5) this.aClass8_Sub8_Sub3_1.aClass182_21.method4329()) {
			if (local16.anInt599 == local53.anInt599 && local53.anInt607 < 0 && local16 != local53) {
				local16.anInt607 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	private void method2142(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(14) int local14 = 0; local14 < 16; local14++) {
				this.method2142(local14);
			}
			return;
		}
		this.anIntArray220[arg0] = 12800;
		this.anIntArray223[arg0] = 8192;
		this.anIntArray215[arg0] = 16383;
		this.anIntArray216[arg0] = 8192;
		this.anIntArray213[arg0] = 0;
		this.anIntArray210[arg0] = 8192;
		this.method2119(arg0);
		this.method2129(arg0);
		this.anIntArray214[arg0] = 0;
		this.anIntArray209[arg0] = 32767;
		this.anIntArray224[arg0] = 256;
		this.anIntArray217[arg0] = 0;
		this.method2115(8192, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZILclient!bg;)V")
	public void method2143(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		@Pc(15) int local15 = arg1.aClass8_Sub20_Sub1_1.aByteArray47.length;
		@Pc(43) int local43;
		if (arg0 && arg1.aClass8_Sub20_Sub1_1.aBoolean378) {
			@Pc(30) int local30 = local15 + local15 - arg1.aClass8_Sub20_Sub1_1.anInt4699;
			local43 = (int) ((long) local30 * (long) this.anIntArray217[arg1.anInt599] >> 6);
			local15 <<= 0x8;
			if (local43 >= local15) {
				local43 = local15 + local15 - local43 - 1;
				arg1.aClass8_Sub8_Sub4_1.method3718();
			}
		} else {
			local43 = (int) ((long) local15 * (long) this.anIntArray217[arg1.anInt599] >> 6);
		}
		arg1.aClass8_Sub8_Sub4_1.method3739(local43);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()I")
	@Override
	public synchronized int method3709() {
		return 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)Z")
	public synchronized boolean method2145() {
		return this.aClass160_1.method3897();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(IIB)V")
	private void method2146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray219[arg1]) {
			this.anIntArray219[arg1] = arg0;
			for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
				this.aClass8_Sub5ArrayArray1[arg1][local19] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()Lclient!kn;")
	@Override
	public synchronized Class8_Sub8 method3706() {
		return this.aClass8_Sub8_Sub3_1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ao;BZ)V")
	public synchronized void method2147(@OriginalArg(0) Class8_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		this.method2116(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lclient!bg;I)I")
	private int method2148(@OriginalArg(0) Class8_Sub5 arg0) {
		@Pc(14) int local14 = this.anIntArray223[arg0.anInt599];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt608 + 128) + 32 >> 6) : local14 * arg0.anInt608 + 32 >> 6;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)V")
	private void method2149(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(31) int local31;
		if (local9 == 128) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			this.method2141(local31, local19, local25);
		} else if (local9 == 144) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			if (local31 > 0) {
				this.method2128(local19, local31, local25);
			} else {
				this.method2141(64, local19, local25);
			}
		} else if (local9 == 160) {
			local25 = arg0 >> 8 & 0x7F;
			local19 = arg0 & 0xF;
			local31 = arg0 >> 16 & 0x7F;
			this.method2140(local31, local25, local19);
		} else if (local9 == 176) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			local31 = arg0 >> 16 & 0x7F;
			if (local25 == 0) {
				this.anIntArray222[local19] = (this.anIntArray222[local19] & 0xFFE03FFF) + (local31 << 14);
			}
			if (local25 == 32) {
				this.anIntArray222[local19] = (local31 << 7) + (this.anIntArray222[local19] & 0xFFFFC07F);
			}
			if (local25 == 1) {
				this.anIntArray213[local19] = (this.anIntArray213[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 33) {
				this.anIntArray213[local19] = (this.anIntArray213[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 5) {
				this.anIntArray210[local19] = (this.anIntArray210[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 37) {
				this.anIntArray210[local19] = local31 + (this.anIntArray210[local19] & 0xFFFFFF80);
			}
			if (local25 == 7) {
				this.anIntArray220[local19] = (local31 << 7) + (this.anIntArray220[local19] & 0xFFFFC07F);
			}
			if (local25 == 39) {
				this.anIntArray220[local19] = (this.anIntArray220[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 10) {
				this.anIntArray223[local19] = (this.anIntArray223[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 42) {
				this.anIntArray223[local19] = (this.anIntArray223[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 11) {
				this.anIntArray215[local19] = (local31 << 7) + (this.anIntArray215[local19] & 0xFFFFC07F);
			}
			if (local25 == 43) {
				this.anIntArray215[local19] = local31 + (this.anIntArray215[local19] & 0xFFFFFF80);
			}
			if (local25 == 64) {
				if (local31 < 64) {
					this.anIntArray214[local19] &= 0xFFFFFFFE;
				} else {
					this.anIntArray214[local19] |= 0x1;
				}
			}
			if (local25 == 65) {
				if (local31 >= 64) {
					this.anIntArray214[local19] |= 0x2;
				} else {
					this.method2119(local19);
					this.anIntArray214[local19] &= 0xFFFFFFFD;
				}
			}
			if (local25 == 99) {
				this.anIntArray209[local19] = (this.anIntArray209[local19] & 0x7F) + (local31 << 7);
			}
			if (local25 == 98) {
				this.anIntArray209[local19] = local31 + (this.anIntArray209[local19] & 0x3F80);
			}
			if (local25 == 101) {
				this.anIntArray209[local19] = (local31 << 7) + (this.anIntArray209[local19] & 0x7F) + 16384;
			}
			if (local25 == 100) {
				this.anIntArray209[local19] = (this.anIntArray209[local19] & 0x3F80) + local31 + 16384;
			}
			if (local25 == 120) {
				this.method2133(local19);
			}
			if (local25 == 121) {
				this.method2142(local19);
			}
			if (local25 == 123) {
				this.method2122(local19);
			}
			@Pc(529) int local529;
			if (local25 == 6) {
				local529 = this.anIntArray209[local19];
				if (local529 == 16384) {
					this.anIntArray224[local19] = (local31 << 7) + (this.anIntArray224[local19] & 0xFFFFC07F);
				}
			}
			if (local25 == 38) {
				local529 = this.anIntArray209[local19];
				if (local529 == 16384) {
					this.anIntArray224[local19] = local31 + (this.anIntArray224[local19] & 0xFFFFFF80);
				}
			}
			if (local25 == 16) {
				this.anIntArray217[local19] = (this.anIntArray217[local19] & 0xFFFFC07F) + (local31 << 7);
			}
			if (local25 == 48) {
				this.anIntArray217[local19] = (this.anIntArray217[local19] & 0xFFFFFF80) + local31;
			}
			if (local25 == 81) {
				if (local31 < 64) {
					this.method2129(local19);
					this.anIntArray214[local19] &= 0xFFFFFFFB;
				} else {
					this.anIntArray214[local19] |= 0x4;
				}
			}
			if (local25 == 17) {
				this.method2115((local31 << 7) + (this.anIntArray221[local19] & 0xFFFFC07F), local19);
			}
			if (local25 == 49) {
				this.method2115(local31 + (this.anIntArray221[local19] & 0xFFFFFF80), local19);
			}
		} else if (local9 == 192) {
			local25 = arg0 >> 8 & 0x7F;
			local19 = arg0 & 0xF;
			this.method2146(local25 + this.anIntArray222[local19], local19);
		} else if (local9 == 208) {
			local19 = arg0 & 0xF;
			local25 = arg0 >> 8 & 0x7F;
			this.method2120(local25, local19);
		} else if (local9 == 224) {
			local19 = arg0 & 0xF;
			local25 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F002E) >> 9);
			this.method2139(local19, local25);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2130(true);
			}
		}
	}
}
