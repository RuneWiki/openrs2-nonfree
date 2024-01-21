import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class2_Sub9_Sub3 extends Class2_Sub9 {

	@OriginalMember(owner = "client!se", name = "Jb", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!se", name = "Kb", descriptor = "Z")
	private boolean aBoolean146;

	@OriginalMember(owner = "client!se", name = "Lb", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!se", name = "Nb", descriptor = "J")
	private long aLong106;

	@OriginalMember(owner = "client!se", name = "Ob", descriptor = "I")
	private int anInt3590;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "[I")
	public final int[] anIntArray518 = new int[16];

	@OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
	private final int[] anIntArray517 = new int[16];

	@OriginalMember(owner = "client!se", name = "M", descriptor = "[I")
	private final int[] anIntArray519 = new int[16];

	@OriginalMember(owner = "client!se", name = "y", descriptor = "[[Lclient!wd;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray1 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "[I")
	private final int[] anIntArray524 = new int[16];

	@OriginalMember(owner = "client!se", name = "nb", descriptor = "I")
	private int anInt3575 = 256;

	@OriginalMember(owner = "client!se", name = "hb", descriptor = "[I")
	private final int[] anIntArray526 = new int[16];

	@OriginalMember(owner = "client!se", name = "gb", descriptor = "[I")
	private final int[] anIntArray525 = new int[16];

	@OriginalMember(owner = "client!se", name = "Y", descriptor = "[I")
	private final int[] anIntArray522 = new int[16];

	@OriginalMember(owner = "client!se", name = "vb", descriptor = "[[Lclient!wd;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray2 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!se", name = "bb", descriptor = "[I")
	private final int[] anIntArray523 = new int[16];

	@OriginalMember(owner = "client!se", name = "xb", descriptor = "[I")
	public final int[] anIntArray529 = new int[16];

	@OriginalMember(owner = "client!se", name = "zb", descriptor = "I")
	private final int anInt3581 = 1000000;

	@OriginalMember(owner = "client!se", name = "yb", descriptor = "[I")
	private final int[] anIntArray530 = new int[16];

	@OriginalMember(owner = "client!se", name = "N", descriptor = "[I")
	private final int[] anIntArray520 = new int[16];

	@OriginalMember(owner = "client!se", name = "ub", descriptor = "[I")
	public final int[] anIntArray527 = new int[16];

	@OriginalMember(owner = "client!se", name = "Fb", descriptor = "[I")
	private final int[] anIntArray532 = new int[16];

	@OriginalMember(owner = "client!se", name = "Bb", descriptor = "[I")
	private final int[] anIntArray531 = new int[16];

	@OriginalMember(owner = "client!se", name = "wb", descriptor = "[I")
	private final int[] anIntArray528 = new int[16];

	@OriginalMember(owner = "client!se", name = "ob", descriptor = "Lclient!ea;")
	private final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!se", name = "Mb", descriptor = "Lclient!re;")
	private final Class2_Sub9_Sub2 aClass2_Sub9_Sub2_1 = new Class2_Sub9_Sub2(this);

	@OriginalMember(owner = "client!se", name = "W", descriptor = "Lclient!sa;")
	private final Class74 aClass74_9 = new Class74(128);

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class2_Sub9_Sub3() {
		this.method2482();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	private void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray525[arg0] = arg1;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	private void method2462(@OriginalArg(0) int arg0) {
		if ((this.anIntArray529[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(25) Class2_Sub23 local25 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method444(); local25 != null; local25 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method451()) {
			if (arg0 == local25.anInt4500) {
				local25.anInt4497 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	public synchronized void method2463(@OriginalArg(1) int arg0) {
		this.anInt3575 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(II)V")
	private void method2464(@OriginalArg(1) int arg0) {
		if ((this.anIntArray529[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class2_Sub23 local13 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method444(); local13 != null; local13 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method451()) {
			if (local13.anInt4500 == arg0 && this.aClass2_Sub23ArrayArray2[arg0][local13.anInt4499] == null && local13.anInt4491 < 0) {
				local13.anInt4491 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public synchronized void method2465() {
		for (@Pc(5) Class2_Sub12 local5 = (Class2_Sub12) this.aClass74_9.method2430(); local5 != null; local5 = (Class2_Sub12) this.aClass74_9.method2435()) {
			local5.method3004();
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
	public int method2466() {
		return this.anInt3575;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)V")
	public synchronized void method2467() {
		this.method2481();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IBI)V")
	private void method2468(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray523[arg0] = arg1;
		this.anIntArray527[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(III)V")
	private void method2469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIII)V")
	private void method2470(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method2489(arg0, arg1, 64);
		if ((this.anIntArray529[arg1] & 0x2) != 0) {
			for (@Pc(26) Class2_Sub23 local26 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method446(); local26 != null; local26 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method452()) {
				if (local26.anInt4500 == arg1 && local26.anInt4491 < 0) {
					this.aClass2_Sub23ArrayArray2[arg1][local26.anInt4499] = null;
					this.aClass2_Sub23ArrayArray2[arg1][arg0] = local26;
					@Pc(67) int local67 = (local26.anInt4509 * local26.anInt4502 >> 12) + local26.anInt4498;
					local26.anInt4502 = 4096;
					local26.anInt4498 += arg0 - local26.anInt4499 << 8;
					local26.anInt4499 = arg0;
					local26.anInt4509 = local67 - local26.anInt4498;
					return;
				}
			}
		}
		@Pc(112) Class2_Sub12 local112 = (Class2_Sub12) this.aClass74_9.method2433((long) this.anIntArray531[arg1]);
		if (local112 == null) {
			return;
		}
		@Pc(120) Class2_Sub5_Sub1 local120 = local112.aClass2_Sub5_Sub1Array1[arg0];
		if (local120 == null) {
			return;
		}
		@Pc(127) Class2_Sub23 local127 = new Class2_Sub23();
		local127.aClass2_Sub12_1 = local112;
		local127.aClass2_Sub5_Sub1_1 = local120;
		local127.anInt4500 = arg1;
		local127.aClass16_1 = local112.aClass16Array1[arg0];
		local127.anInt4501 = local112.aByteArray31[arg0];
		local127.anInt4499 = arg0;
		local127.anInt4508 = local112.aByteArray32[arg0] * local112.anInt1975 * arg2 * arg2 + 1024 >> 11;
		local127.anInt4506 = local112.aByteArray33[arg0] & 0xFF;
		local127.anInt4498 = (arg0 << 8) - (local112.aShortArray74[arg0] & 0x7FFF);
		local127.anInt4495 = 0;
		local127.anInt4491 = -1;
		local127.anInt4505 = 0;
		local127.anInt4494 = 0;
		local127.anInt4510 = 0;
		if (this.anIntArray518[arg1] == 0) {
			local127.aClass2_Sub9_Sub1_1 = Static187.method1738(local120, this.method2484(local127), this.method2473(local127), this.method2475(local127));
		} else {
			local127.aClass2_Sub9_Sub1_1 = Static187.method1738(local120, this.method2484(local127), 0, this.method2475(local127));
			this.method2488(local127, local112.aShortArray74[arg0] < 0);
		}
		if (local112.aShortArray74[arg0] < 0) {
			local127.aClass2_Sub9_Sub1_1.method1723(-1);
		}
		if (local127.anInt4501 >= 0) {
			@Pc(289) Class2_Sub23 local289 = this.aClass2_Sub23ArrayArray1[arg1][local127.anInt4501];
			if (local289 != null && local289.anInt4491 < 0) {
				this.aClass2_Sub23ArrayArray2[arg1][local289.anInt4499] = null;
				local289.anInt4491 = 0;
			}
			this.aClass2_Sub23ArrayArray1[arg1][local127.anInt4501] = local127;
		}
		this.aClass2_Sub9_Sub2_1.aClass10_90.method448(local127);
		this.aClass2_Sub23ArrayArray2[arg1][arg0] = local127;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(II)V")
	private void method2471(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(10) int local10 = 0; local10 < 16; local10++) {
				this.method2471(local10);
			}
			return;
		}
		this.anIntArray519[arg0] = 12800;
		this.anIntArray520[arg0] = 8192;
		this.anIntArray526[arg0] = 16383;
		this.anIntArray525[arg0] = 8192;
		this.anIntArray532[arg0] = 0;
		this.anIntArray530[arg0] = 8192;
		this.method2464(arg0);
		this.method2462(arg0);
		this.anIntArray529[arg0] = 0;
		this.anIntArray517[arg0] = 32767;
		this.anIntArray524[arg0] = 256;
		this.anIntArray518[arg0] = 0;
		this.method2468(arg0, 8192);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(II)V")
	private void method2472(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class2_Sub23 local8 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method444(); local8 != null; local8 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method451()) {
			if ((arg0 < 0 || arg0 == local8.anInt4500) && local8.anInt4491 < 0) {
				this.aClass2_Sub23ArrayArray2[local8.anInt4500][local8.anInt4499] = null;
				local8.anInt4491 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wd;Z)I")
	private int method2473(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(14) Class16 local14 = arg0.aClass16_1;
		@Pc(30) int local30 = this.anIntArray519[arg0.anInt4500] * this.anIntArray526[arg0.anInt4500] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt4508 + 16384 >> 15;
		local30 = local47 * this.anInt3575 + 128 >> 8;
		if (local14.anInt869 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt4510 * 1.953125E-5D * (double) local14.anInt869) * (double) local30 + 0.5D);
		}
		@Pc(86) int local86;
		@Pc(94) int local94;
		@Pc(112) int local112;
		@Pc(124) int local124;
		if (local14.aByteArray8 != null) {
			local86 = arg0.anInt4495;
			local94 = local14.aByteArray8[arg0.anInt4494 + 1];
			if (local14.aByteArray8.length - 2 > arg0.anInt4494) {
				local112 = (local14.aByteArray8[arg0.anInt4494] & 0xFF) << 8;
				local124 = (local14.aByteArray8[arg0.anInt4494 + 2] & 0xFF) << 8;
				local94 += (local86 - local112) * (local14.aByteArray8[arg0.anInt4494 + 3] - local94) / (local124 - local112);
			}
			local30 = local30 * local94 + 32 >> 6;
		}
		if (arg0.anInt4491 > 0 && local14.aByteArray9 != null) {
			local86 = arg0.anInt4491;
			local94 = local14.aByteArray9[arg0.anInt4505 + 1];
			if (arg0.anInt4505 < local14.aByteArray9.length - 2) {
				local112 = (local14.aByteArray9[arg0.anInt4505] & 0xFF) << 8;
				local124 = (local14.aByteArray9[arg0.anInt4505 + 2] & 0xFF) << 8;
				local94 += (local86 - local112) * (local14.aByteArray9[arg0.anInt4505 + 3] - local94) / (local124 - local112);
			}
			local30 = local30 * local94 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
	public synchronized void method2474() {
		this.aClass21_1.method716();
		this.method2482();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!wd;)I")
	private int method2475(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(5) int local5 = this.anIntArray520[arg0.anInt4500];
		return local5 < 8192 ? local5 * arg0.anInt4506 + 32 >> 6 : 16384 - ((128 - arg0.anInt4506) * (16384 - local5) + 32 >> 6);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wd;I)Z")
	public boolean method2476(@OriginalArg(0) Class2_Sub23 arg0) {
		if (arg0.aClass2_Sub9_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt4491 >= 0) {
			arg0.method3004();
			if (arg0.anInt4501 > 0 && arg0 == this.aClass2_Sub23ArrayArray1[arg0.anInt4500][arg0.anInt4501]) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt4500][arg0.anInt4501] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
	public synchronized void method2477() {
		for (@Pc(17) Class2_Sub12 local17 = (Class2_Sub12) this.aClass74_9.method2430(); local17 != null; local17 = (Class2_Sub12) this.aClass74_9.method2435()) {
			local17.method1418();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method2927(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass21_1.method724()) {
			@Pc(14) int local14 = this.aClass21_1.anInt1045 * this.anInt3581 / Static63.anInt1680;
			do {
				@Pc(23) long local23 = this.aLong105 + (long) arg2 * (long) local14;
				if (this.aLong106 - local23 >= 0L) {
					this.aLong105 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong106 - this.aLong105 - 1L) / (long) local14);
				arg2 -= local52;
				this.aLong105 += (long) local52 * (long) local14;
				this.aClass2_Sub9_Sub2_1.method2927(arg0, arg1, local52);
				this.method2492();
				arg1 += local52;
			} while (this.aClass21_1.method724());
		}
		this.aClass2_Sub9_Sub2_1.method2927(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IZI)V")
	private void method2478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray531[arg0] != arg1) {
			this.anIntArray531[arg0] = arg1;
			for (@Pc(20) int local20 = 0; local20 < 128; local20++) {
				this.aClass2_Sub23ArrayArray1[arg0][local20] = null;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BZLclient!bc;)V")
	public synchronized void method2479(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		this.method2474();
		this.aClass21_1.method713(arg1.aByteArray2);
		this.aLong105 = 0L;
		this.aBoolean146 = arg0;
		@Pc(21) int local21 = this.aClass21_1.method726();
		for (@Pc(28) int local28 = 0; local28 < local21; local28++) {
			this.aClass21_1.method723(local28);
			this.aClass21_1.method727(local28);
			this.aClass21_1.method722(local28);
		}
		this.anInt3589 = this.aClass21_1.method718();
		this.anInt3590 = this.aClass21_1.anIntArray163[this.anInt3589];
		this.aLong106 = this.aClass21_1.method721(this.anInt3590);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ILclient!wd;I[IB)Z")
	public boolean method2480(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		arg1.anInt4504 = Static63.anInt1680 / 100;
		if (arg1.anInt4491 >= 0 && (arg1.aClass2_Sub9_Sub1_1 == null || arg1.aClass2_Sub9_Sub1_1.method1717())) {
			arg1.method2967();
			arg1.method3004();
			if (arg1.anInt4501 > 0 && arg1 == this.aClass2_Sub23ArrayArray1[arg1.anInt4500][arg1.anInt4501]) {
				this.aClass2_Sub23ArrayArray1[arg1.anInt4500][arg1.anInt4501] = null;
			}
			return true;
		}
		@Pc(59) int local59 = arg1.anInt4502;
		if (local59 > 0) {
			local59 -= (int) (Math.pow(2.0D, (double) this.anIntArray530[arg1.anInt4500] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local59 < 0) {
				local59 = 0;
			}
			arg1.anInt4502 = local59;
		}
		arg1.aClass2_Sub9_Sub1_1.method1713(this.method2484(arg1));
		@Pc(96) Class16 local96 = arg1.aClass16_1;
		arg1.anInt4492++;
		arg1.anInt4511 += local96.anInt870;
		@Pc(111) boolean local111 = false;
		@Pc(129) double local129 = (double) ((arg1.anInt4509 * arg1.anInt4502 >> 12) + (arg1.anInt4499 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt869 > 0) {
			if (local96.anInt875 > 0) {
				arg1.anInt4510 += (int) (Math.pow(2.0D, (double) local96.anInt875 * local129) * 128.0D + 0.5D);
			} else {
				arg1.anInt4510 += 128;
			}
			if (arg1.anInt4510 * local96.anInt869 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray8 != null) {
			if (local96.anInt872 <= 0) {
				arg1.anInt4495 += 128;
			} else {
				arg1.anInt4495 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt872) * 128.0D + 0.5D);
			}
			while (arg1.anInt4494 < local96.aByteArray8.length - 2 && arg1.anInt4495 > (local96.aByteArray8[arg1.anInt4494 + 2] & 0xFF) << 8) {
				arg1.anInt4494 += 2;
			}
			if (arg1.anInt4494 == local96.aByteArray8.length - 2 && local96.aByteArray8[arg1.anInt4494 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg1.anInt4491 >= 0 && local96.aByteArray9 != null && (this.anIntArray529[arg1.anInt4500] & 0x1) == 0 && (arg1.anInt4501 < 0 || arg1 != this.aClass2_Sub23ArrayArray1[arg1.anInt4500][arg1.anInt4501])) {
			if (local96.anInt879 > 0) {
				arg1.anInt4491 += (int) (Math.pow(2.0D, local129 * (double) local96.anInt879) * 128.0D + 0.5D);
			} else {
				arg1.anInt4491 += 128;
			}
			while (arg1.anInt4505 < local96.aByteArray9.length - 2 && arg1.anInt4491 > (local96.aByteArray9[arg1.anInt4505 + 2] & 0xFF) << 8) {
				arg1.anInt4505 += 2;
			}
			if (arg1.anInt4505 == local96.aByteArray9.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg1.aClass2_Sub9_Sub1_1.method1734(arg1.anInt4504, this.method2473(arg1), this.method2475(arg1));
			return false;
		}
		arg1.aClass2_Sub9_Sub1_1.method1719(arg1.anInt4504);
		if (arg3 == null) {
			arg1.aClass2_Sub9_Sub1_1.method2930(arg0);
		} else {
			arg1.aClass2_Sub9_Sub1_1.method2927(arg3, arg2, arg0);
		}
		if (arg1.aClass2_Sub9_Sub1_1.method1716()) {
			this.aClass2_Sub9_Sub2_1.aClass2_Sub9_Sub4_1.method2932(arg1.aClass2_Sub9_Sub1_1);
		}
		arg1.method2967();
		if (arg1.anInt4491 >= 0) {
			arg1.method3004();
			if (arg1.anInt4501 > 0 && arg1 == this.aClass2_Sub23ArrayArray1[arg1.anInt4500][arg1.anInt4501]) {
				this.aClass2_Sub23ArrayArray1[arg1.anInt4500][arg1.anInt4501] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(III)V")
	private void method2481() {
		this.anIntArray522[9] = 128;
		this.anIntArray528[9] = 128;
		this.method2478(9, 128);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	private void method2482() {
		this.method2483(-1);
		this.method2471(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray531[local19] = this.anIntArray522[local19];
		}
		for (@Pc(34) int local34 = 0; local34 < 16; local34++) {
			this.anIntArray528[local34] = this.anIntArray522[local34] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(II)V")
	private void method2483(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class2_Sub23 local10 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method444(); local10 != null; local10 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method451()) {
			if (arg0 < 0 || arg0 == local10.anInt4500) {
				if (local10.aClass2_Sub9_Sub1_1 != null) {
					local10.aClass2_Sub9_Sub1_1.method1719(Static63.anInt1680 / 100);
					if (local10.aClass2_Sub9_Sub1_1.method1716()) {
						this.aClass2_Sub9_Sub2_1.aClass2_Sub9_Sub4_1.method2932(local10.aClass2_Sub9_Sub1_1);
					}
					local10.method2967();
				}
				if (local10.anInt4491 < 0) {
					this.aClass2_Sub23ArrayArray2[local10.anInt4500][local10.anInt4499] = null;
				}
				local10.method3004();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()Lclient!ig;")
	@Override
	public synchronized Class2_Sub9 method2925() {
		return this.aClass2_Sub9_Sub2_1;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!wd;Z)I")
	private int method2484(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(15) int local15 = arg0.anInt4498 + (arg0.anInt4509 * arg0.anInt4502 >> 12);
		local15 += (this.anIntArray525[arg0.anInt4500] - 8192) * this.anIntArray524[arg0.anInt4500] >> 12;
		@Pc(36) Class16 local36 = arg0.aClass16_1;
		@Pc(61) int local61;
		if (local36.anInt870 > 0 && (local36.anInt878 > 0 || this.anIntArray532[arg0.anInt4500] > 0)) {
			local61 = local36.anInt878 << 2;
			@Pc(66) int local66 = local36.anInt867 << 1;
			if (local66 > arg0.anInt4492) {
				local61 = local61 * arg0.anInt4492 / local66;
			}
			local61 += this.anIntArray532[arg0.anInt4500] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt4511 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass2_Sub5_Sub1_1.anInt1944 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static63.anInt1680 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
	@Override
	public synchronized int method2931() {
		return 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	private void method2487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()Lclient!ig;")
	@Override
	public synchronized Class2_Sub9 method2926() {
		return null;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!wd;ZB)V")
	public void method2488(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) int local4 = arg0.aClass2_Sub5_Sub1_1.aByteArray28.length;
		@Pc(45) int local45;
		if (arg1 && arg0.aClass2_Sub5_Sub1_1.aBoolean85) {
			@Pc(32) int local32 = local4 + local4 - arg0.aClass2_Sub5_Sub1_1.anInt1943;
			local45 = (int) ((long) local32 * (long) this.anIntArray518[arg0.anInt4500] >> 6);
			local4 <<= 0x8;
			if (local45 >= local4) {
				local45 = local4 + local4 - local45 - 1;
				arg0.aClass2_Sub9_Sub1_1.method1720();
			}
		} else {
			local45 = (int) ((long) local4 * (long) this.anIntArray518[arg0.anInt4500] >> 6);
		}
		arg0.aClass2_Sub9_Sub1_1.method1707(local45);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2930(@OriginalArg(0) int arg0) {
		if (this.aClass21_1.method724()) {
			@Pc(16) int local16 = this.anInt3581 * this.aClass21_1.anInt1045 / Static63.anInt1680;
			do {
				@Pc(25) long local25 = (long) local16 * (long) arg0 + this.aLong105;
				if (this.aLong106 - local25 >= 0L) {
					this.aLong105 = local25;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong106 + (long) local16 - this.aLong105 - 1L) / (long) local16);
				this.aLong105 += (long) local16 * (long) local54;
				this.aClass2_Sub9_Sub2_1.method2930(local54);
				arg0 -= local54;
				this.method2492();
			} while (this.aClass21_1.method724());
		}
		this.aClass2_Sub9_Sub2_1.method2930(arg0);
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)V")
	private void method2489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class2_Sub23 local16 = this.aClass2_Sub23ArrayArray2[arg1][arg0];
		if (local16 == null) {
			return;
		}
		this.aClass2_Sub23ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray529[arg1] & 0x2) == 0) {
			local16.anInt4491 = 0;
			return;
		}
		for (@Pc(40) Class2_Sub23 local40 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method444(); local40 != null; local40 = (Class2_Sub23) this.aClass2_Sub9_Sub2_1.aClass10_90.method451()) {
			if (local40.anInt4500 == local16.anInt4500 && local40.anInt4491 < 0 && local40 != local16) {
				local16.anInt4491 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
	public synchronized boolean method2490() {
		return this.aClass21_1.method724();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)V")
	private void method2491(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local7 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method2489(local22, local16, local28);
		} else if (local7 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method2489(local22, local16, 64);
			} else {
				this.method2470(local22, local16, local28);
			}
		} else if (local7 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method2487(local28, local16, local22);
		} else if (local7 == 176) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			local22 = arg0 >> 8 & 0x7F;
			if (local22 == 0) {
				this.anIntArray528[local16] = (local28 << 14) + (this.anIntArray528[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray528[local16] = (this.anIntArray528[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray532[local16] = (this.anIntArray532[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray532[local16] = local28 + (this.anIntArray532[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray530[local16] = (local28 << 7) + (this.anIntArray530[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray530[local16] = (this.anIntArray530[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray519[local16] = (this.anIntArray519[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray519[local16] = local28 + (this.anIntArray519[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray520[local16] = (local28 << 7) + (this.anIntArray520[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray520[local16] = local28 + (this.anIntArray520[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray526[local16] = (this.anIntArray526[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray529[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray529[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method2464(local16);
					this.anIntArray529[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray529[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray517[local16] = (this.anIntArray517[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray517[local16] = local28 + (this.anIntArray517[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray517[local16] = (this.anIntArray517[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray517[local16] = (this.anIntArray517[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method2483(local16);
			}
			if (local22 == 121) {
				this.method2471(local16);
			}
			if (local22 == 123) {
				this.method2472(local16);
			}
			@Pc(503) int local503;
			if (local22 == 6) {
				local503 = this.anIntArray517[local16];
				if (local503 == 16384) {
					this.anIntArray524[local16] = (this.anIntArray524[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local503 = this.anIntArray517[local16];
				if (local503 == 16384) {
					this.anIntArray524[local16] = local28 + (this.anIntArray524[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray518[local16] = (local28 << 7) + (this.anIntArray518[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray518[local16] = local28 + (this.anIntArray518[local16] & 0xFFFFFF80);
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method2462(local16);
					this.anIntArray529[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray529[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method2468(local16, (this.anIntArray523[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method2468(local16, local28 + (this.anIntArray523[local16] & 0xFFFFFF80));
			}
		} else if (local7 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method2478(local16, this.anIntArray528[local16] + local22);
		} else if (local7 == 208) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2469(local22, local16);
		} else if (local7 == 224) {
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7FF6) >> 8);
			local16 = arg0 & 0xF;
			this.method2461(local16, local22);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method2482();
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
	private void method2492() {
		@Pc(6) int local6 = this.anInt3589;
		@Pc(9) int local9 = this.anInt3590;
		@Pc(12) long local12 = this.aLong106;
		while (local9 == this.anInt3590) {
			while (this.aClass21_1.anIntArray163[local6] == local9) {
				this.aClass21_1.method723(local6);
				@Pc(22) int local22 = this.aClass21_1.method715(local6);
				if (local22 == 1) {
					this.aClass21_1.method728();
					this.aClass21_1.method722(local6);
					if (this.aClass21_1.method725()) {
						if (!this.aBoolean146 || local9 == 0) {
							this.method2482();
							this.aClass21_1.method716();
							return;
						}
						this.aClass21_1.method719(local12);
					}
					break;
				}
				if ((local22 & 0x80) != 0) {
					this.method2491(local22);
				}
				this.aClass21_1.method727(local6);
				this.aClass21_1.method722(local6);
			}
			local6 = this.aClass21_1.method718();
			local9 = this.aClass21_1.anIntArray163[local6];
			local12 = this.aClass21_1.method721(local9);
		}
		this.aLong106 = local12;
		this.anInt3590 = local9;
		this.anInt3589 = local6;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ke;Lclient!bc;IILclient!ha;)Z")
	public synchronized boolean method2493(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class2_Sub4 arg1, @OriginalArg(4) Class33 arg2) {
		arg1.method275();
		@Pc(3) boolean local3 = true;
		@Pc(21) int[] local21 = new int[] { 22050 };
		for (@Pc(27) Class2_Sub14 local27 = (Class2_Sub14) arg1.aClass74_3.method2430(); local27 != null; local27 = (Class2_Sub14) arg1.aClass74_3.method2435()) {
			@Pc(32) int local32 = (int) local27.aLong134;
			@Pc(40) Class2_Sub12 local40 = (Class2_Sub12) this.aClass74_9.method2433((long) local32);
			if (local40 == null) {
				local40 = Static140.method2334(local32, arg0);
				if (local40 == null) {
					local3 = false;
					continue;
				}
				this.aClass74_9.method2432((long) local32, local40);
			}
			if (!local40.method1417(local27.aByteArray34, arg2, local21)) {
				local3 = false;
			}
		}
		if (local3) {
			arg1.method274();
		}
		return local3;
	}
}
