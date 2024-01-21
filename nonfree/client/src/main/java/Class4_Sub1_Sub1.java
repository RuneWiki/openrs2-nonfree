import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ad", name = "Pb", descriptor = "I")
	private int anInt106;

	@OriginalMember(owner = "client!ad", name = "Qb", descriptor = "J")
	private long aLong7;

	@OriginalMember(owner = "client!ad", name = "Rb", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!ad", name = "Tb", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ad", name = "Ub", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "[[Lclient!tc;")
	private final Class4_Sub21[][] aClass4_Sub21ArrayArray1 = new Class4_Sub21[16][128];

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "[I")
	private final int[] anIntArray8 = new int[16];

	@OriginalMember(owner = "client!ad", name = "bb", descriptor = "[I")
	private final int[] anIntArray12 = new int[16];

	@OriginalMember(owner = "client!ad", name = "ib", descriptor = "I")
	private int anInt82 = 256;

	@OriginalMember(owner = "client!ad", name = "V", descriptor = "[I")
	public final int[] anIntArray9 = new int[16];

	@OriginalMember(owner = "client!ad", name = "X", descriptor = "[I")
	private final int[] anIntArray10 = new int[16];

	@OriginalMember(owner = "client!ad", name = "nb", descriptor = "[I")
	private final int[] anIntArray14 = new int[16];

	@OriginalMember(owner = "client!ad", name = "gb", descriptor = "[I")
	private final int[] anIntArray13 = new int[16];

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "[I")
	private final int[] anIntArray7 = new int[16];

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "[I")
	public final int[] anIntArray6 = new int[16];

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "[I")
	private final int[] anIntArray5 = new int[16];

	@OriginalMember(owner = "client!ad", name = "Db", descriptor = "[I")
	private final int[] anIntArray16 = new int[16];

	@OriginalMember(owner = "client!ad", name = "Fb", descriptor = "[I")
	public final int[] anIntArray18 = new int[16];

	@OriginalMember(owner = "client!ad", name = "eb", descriptor = "I")
	private final int anInt79 = 1000000;

	@OriginalMember(owner = "client!ad", name = "Y", descriptor = "[I")
	private final int[] anIntArray11 = new int[16];

	@OriginalMember(owner = "client!ad", name = "Eb", descriptor = "[I")
	private final int[] anIntArray17 = new int[16];

	@OriginalMember(owner = "client!ad", name = "cb", descriptor = "[[Lclient!tc;")
	private final Class4_Sub21[][] aClass4_Sub21ArrayArray2 = new Class4_Sub21[16][128];

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "[I")
	private final int[] anIntArray4 = new int[16];

	@OriginalMember(owner = "client!ad", name = "zb", descriptor = "[I")
	private final int[] anIntArray15 = new int[16];

	@OriginalMember(owner = "client!ad", name = "pb", descriptor = "Lclient!ne;")
	private final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!ad", name = "Sb", descriptor = "Lclient!g;")
	private final Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3(this);

	@OriginalMember(owner = "client!ad", name = "Mb", descriptor = "Lclient!jf;")
	private final Class42 aClass42_1 = new Class42(128);

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1() {
		this.method56();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	private void method55() {
		@Pc(4) int local4 = this.anInt106;
		@Pc(17) int local17 = this.anInt107;
		@Pc(20) long local20 = this.aLong8;
		while (this.anInt107 == local17) {
			while (local17 == this.aClass54_1.anIntArray215[local4]) {
				this.aClass54_1.method1336(local4);
				@Pc(31) int local31 = this.aClass54_1.method1345(local4);
				if (local31 == 1) {
					this.aClass54_1.method1331();
					this.aClass54_1.method1339(local4);
					if (this.aClass54_1.method1332()) {
						if (!this.aBoolean3 || local17 == 0) {
							this.method56();
							this.aClass54_1.method1334();
							return;
						}
						this.aClass54_1.method1346(local20);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method81(local31);
				}
				this.aClass54_1.method1344(local4);
				this.aClass54_1.method1339(local4);
			}
			local4 = this.aClass54_1.method1335();
			local17 = this.aClass54_1.anIntArray215[local4];
			local20 = this.aClass54_1.method1337(local17);
		}
		this.anInt107 = local17;
		this.aLong8 = local20;
		this.anInt106 = local4;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
	private void method56() {
		this.method58(-1);
		this.method78(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray11[local23] = this.anIntArray7[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray12[local39] = this.anIntArray7[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB)V")
	private void method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray11[arg1] != arg0) {
			this.anIntArray11[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass4_Sub21ArrayArray1[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)V")
	private void method58(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class4_Sub21 local20 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1628(); local20 != null; local20 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1629()) {
			if (arg0 < 0 || arg0 == local20.anInt2820) {
				if (local20.aClass4_Sub1_Sub4_3 != null) {
					local20.aClass4_Sub1_Sub4_3.method1539(Static123.anInt3048 / 100);
					if (local20.aClass4_Sub1_Sub4_3.method1578()) {
						this.aClass4_Sub1_Sub3_1.aClass4_Sub1_Sub2_1.method360(local20.aClass4_Sub1_Sub4_3);
					}
					local20.method1989();
				}
				if (local20.anInt2833 < 0) {
					this.aClass4_Sub21ArrayArray2[local20.anInt2820][local20.anInt2826] = null;
				}
				local20.method2189();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BII[ILclient!tc;)Z")
	public boolean method59(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class4_Sub21 arg3) {
		arg3.anInt2836 = Static123.anInt3048 / 100;
		if (arg3.anInt2833 >= 0 && (arg3.aClass4_Sub1_Sub4_3 == null || arg3.aClass4_Sub1_Sub4_3.method1553())) {
			arg3.method1989();
			arg3.method2189();
			if (arg3.anInt2842 > 0 && this.aClass4_Sub21ArrayArray1[arg3.anInt2820][arg3.anInt2842] == arg3) {
				this.aClass4_Sub21ArrayArray1[arg3.anInt2820][arg3.anInt2842] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt2821;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray16[arg3.anInt2820] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt2821 = local56;
		}
		arg3.aClass4_Sub1_Sub4_3.method1575(this.method72(arg3));
		arg3.anInt2827++;
		@Pc(99) Class56 local99 = arg3.aClass56_1;
		arg3.anInt2841 += local99.anInt2123;
		@Pc(124) double local124 = (double) ((arg3.anInt2821 * arg3.anInt2840 >> 12) + (arg3.anInt2826 - 60 << 8)) * 5.086263020833333E-6D;
		if (local99.anInt2121 > 0) {
			if (local99.anInt2118 > 0) {
				arg3.anInt2823 += (int) (Math.pow(2.0D, local124 * (double) local99.anInt2118) * 128.0D + 0.5D);
			} else {
				arg3.anInt2823 += 128;
			}
		}
		@Pc(157) boolean local157 = false;
		if (local99.aByteArray24 != null) {
			if (local99.anInt2124 <= 0) {
				arg3.anInt2839 += 128;
			} else {
				arg3.anInt2839 += (int) (Math.pow(2.0D, (double) local99.anInt2124 * local124) * 128.0D + 0.5D);
			}
			while (local99.aByteArray24.length - 2 > arg3.anInt2822 && (local99.aByteArray24[arg3.anInt2822 + 2] & 0xFF) << 8 < arg3.anInt2839) {
				arg3.anInt2822 += 2;
			}
			if (local99.aByteArray24.length - 2 == arg3.anInt2822 && local99.aByteArray24[arg3.anInt2822 + 1] == 0) {
				local157 = true;
			}
		}
		if (arg3.anInt2833 >= 0 && local99.aByteArray23 != null && (this.anIntArray18[arg3.anInt2820] & 0x1) == 0 && (arg3.anInt2842 < 0 || this.aClass4_Sub21ArrayArray1[arg3.anInt2820][arg3.anInt2842] != arg3)) {
			if (local99.anInt2119 > 0) {
				arg3.anInt2833 += (int) (Math.pow(2.0D, (double) local99.anInt2119 * local124) * 128.0D + 0.5D);
			} else {
				arg3.anInt2833 += 128;
			}
			while (local99.aByteArray23.length - 2 > arg3.anInt2829 && (local99.aByteArray23[arg3.anInt2829 + 2] & 0xFF) << 8 < arg3.anInt2833) {
				arg3.anInt2829 += 2;
			}
			if (local99.aByteArray23.length - 2 == arg3.anInt2829) {
				local157 = true;
			}
		}
		if (!local157) {
			arg3.aClass4_Sub1_Sub4_3.method1563(arg3.anInt2836, this.method66(arg3), this.method68(arg3));
			return false;
		}
		arg3.aClass4_Sub1_Sub4_3.method1539(arg3.anInt2836);
		if (arg2 == null) {
			arg3.aClass4_Sub1_Sub4_3.method1534(arg0);
		} else {
			arg3.aClass4_Sub1_Sub4_3.method1533(arg2, arg1, arg0);
		}
		if (arg3.aClass4_Sub1_Sub4_3.method1578()) {
			this.aClass4_Sub1_Sub3_1.aClass4_Sub1_Sub2_1.method360(arg3.aClass4_Sub1_Sub4_3);
		}
		arg3.method1989();
		if (arg3.anInt2833 >= 0) {
			arg3.method2189();
			if (arg3.anInt2842 > 0 && arg3 == this.aClass4_Sub21ArrayArray1[arg3.anInt2820][arg3.anInt2842]) {
				this.aClass4_Sub21ArrayArray1[arg3.anInt2820][arg3.anInt2842] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	private void method60() {
		this.anIntArray7[9] = 128;
		this.anIntArray12[9] = 128;
		this.method57(128, 9);
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
	public synchronized void method61() {
		for (@Pc(18) Class4_Sub15 local18 = (Class4_Sub15) this.aClass42_1.method1049(); local18 != null; local18 = (Class4_Sub15) this.aClass42_1.method1054()) {
			local18.method2189();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)V")
	private void method62(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray5[arg0] = arg1;
		this.anIntArray9[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)V")
	private void method63(@OriginalArg(1) int arg0) {
		if ((this.anIntArray18[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class4_Sub21 local27 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1628(); local27 != null; local27 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1629()) {
			if (local27.anInt2820 == arg0) {
				local27.anInt2838 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIB)V")
	private void method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()Lclient!md;")
	@Override
	public synchronized Class4_Sub1 method1532() {
		return this.aClass4_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIB)V")
	private void method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tc;I)I")
	private int method66(@OriginalArg(0) Class4_Sub21 arg0) {
		@Pc(7) Class56 local7 = arg0.aClass56_1;
		@Pc(23) int local23 = this.anIntArray10[arg0.anInt2820] * this.anIntArray8[arg0.anInt2820] + 4096 >> 13;
		@Pc(31) int local31 = local23 * local23 + 16384 >> 15;
		@Pc(44) int local44 = arg0.anInt2825 * local31 + 16384 >> 15;
		local23 = this.anInt82 * local44 + 128 >> 8;
		if (local7.anInt2121 > 0) {
			local23 = (int) ((double) local23 * Math.pow(0.5D, (double) arg0.anInt2823 * 1.953125E-5D * (double) local7.anInt2121) + 0.5D);
		}
		@Pc(88) int local88;
		@Pc(85) int local85;
		@Pc(106) int local106;
		@Pc(118) int local118;
		if (local7.aByteArray24 != null) {
			local85 = local7.aByteArray24[arg0.anInt2822 + 1];
			local88 = arg0.anInt2839;
			if (local7.aByteArray24.length - 2 > arg0.anInt2822) {
				local106 = (local7.aByteArray24[arg0.anInt2822] & 0xFF) << 8;
				local118 = (local7.aByteArray24[arg0.anInt2822 + 2] & 0xFF) << 8;
				local85 += (local88 - local106) * (local7.aByteArray24[arg0.anInt2822 + 3] - local85) / (local118 - local106);
			}
			local23 = local23 * local85 + 32 >> 6;
		}
		if (arg0.anInt2833 > 0 && local7.aByteArray23 != null) {
			local88 = arg0.anInt2833;
			local85 = local7.aByteArray23[arg0.anInt2829 + 1];
			if (local7.aByteArray23.length - 2 > arg0.anInt2829) {
				local106 = (local7.aByteArray23[arg0.anInt2829] & 0xFF) << 8;
				local118 = (local7.aByteArray23[arg0.anInt2829 + 2] & 0xFF) << 8;
				local85 += (local88 - local106) * (local7.aByteArray23[arg0.anInt2829 + 3] - local85) / (local118 - local106);
			}
			local23 = local85 * local23 + 32 >> 6;
		}
		return local23;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!tc;IZ)V")
	public void method67(@OriginalArg(0) Class4_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.aClass4_Sub6_Sub1_1.aByteArray13.length;
		@Pc(34) int local34;
		if (arg1 && arg0.aClass4_Sub6_Sub1_1.aBoolean93) {
			@Pc(45) int local45 = local15 + local15 - arg0.aClass4_Sub6_Sub1_1.anInt1656;
			local15 <<= 0x8;
			local34 = (int) ((long) local45 * (long) this.anIntArray6[arg0.anInt2820] >> 6);
			if (local15 <= local34) {
				local34 = local15 + local15 - local34 - 1;
				arg0.aClass4_Sub1_Sub4_3.method1554();
			}
		} else {
			local34 = (int) ((long) local15 * (long) this.anIntArray6[arg0.anInt2820] >> 6);
		}
		arg0.aClass4_Sub1_Sub4_3.method1566(local34);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZLclient!tc;)I")
	private int method68(@OriginalArg(1) Class4_Sub21 arg0) {
		@Pc(10) int local10 = this.anIntArray13[arg0.anInt2820];
		return local10 >= 8192 ? 16384 - ((128 - arg0.anInt2828) * (-local10 + 16384) + 32 >> 6) : arg0.anInt2828 * local10 - -32 >> 6;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()Lclient!md;")
	@Override
	public synchronized Class4_Sub1 method1536() {
		return null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLclient!tc;)Z")
	public boolean method71(@OriginalArg(1) Class4_Sub21 arg0) {
		if (arg0.aClass4_Sub1_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt2833 >= 0) {
			arg0.method2189();
			if (arg0.anInt2842 > 0 && this.aClass4_Sub21ArrayArray1[arg0.anInt2820][arg0.anInt2842] == arg0) {
				this.aClass4_Sub21ArrayArray1[arg0.anInt2820][arg0.anInt2842] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Lclient!tc;I)I")
	private int method72(@OriginalArg(0) Class4_Sub21 arg0) {
		@Pc(20) int local20 = (arg0.anInt2821 * arg0.anInt2840 >> 12) + arg0.anInt2819;
		local20 += this.anIntArray17[arg0.anInt2820] * (this.anIntArray15[arg0.anInt2820] - 8192) >> 12;
		@Pc(41) Class56 local41 = arg0.aClass56_1;
		@Pc(64) int local64;
		if (local41.anInt2123 > 0 && (local41.anInt2114 > 0 || this.anIntArray4[arg0.anInt2820] > 0)) {
			local64 = local41.anInt2114 << 2;
			@Pc(69) int local69 = local41.anInt2120 << 1;
			if (local69 > arg0.anInt2827) {
				local64 = arg0.anInt2827 * local64 / local69;
			}
			local64 += this.anIntArray4[arg0.anInt2820] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt2841 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) ((double) local64 * local103);
		}
		local64 = (int) ((double) (arg0.aClass4_Sub6_Sub1_1.anInt1657 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static123.anInt3048 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)V")
	private void method73(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub21 local12 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1628(); local12 != null; local12 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1629()) {
			if ((arg0 < 0 || arg0 == local12.anInt2820) && local12.anInt2833 < 0) {
				this.aClass4_Sub21ArrayArray2[local12.anInt2820][local12.anInt2826] = null;
				local12.anInt2833 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1534(@OriginalArg(0) int arg0) {
		if (this.aClass54_1.method1342()) {
			@Pc(14) int local14 = this.aClass54_1.anInt1903 * this.anInt79 / Static123.anInt3048;
			do {
				@Pc(23) long local23 = (long) arg0 * (long) local14 + this.aLong7;
				if (this.aLong8 - local23 >= 0L) {
					this.aLong7 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong8 + (long) local14 - this.aLong7 - 1L) / (long) local14);
				arg0 -= local52;
				this.aLong7 += (long) local14 * (long) local52;
				this.aClass4_Sub1_Sub3_1.method1534(local52);
				this.method55();
			} while (this.aClass54_1.method1342());
		}
		this.aClass4_Sub1_Sub3_1.method1534(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()I")
	@Override
	public synchronized int method1535() {
		return 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V")
	private void method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method86(arg2, 64, arg0);
		if ((this.anIntArray18[arg0] & 0x2) != 0) {
			for (@Pc(28) Class4_Sub21 local28 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1634(); local28 != null; local28 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1627()) {
				if (arg0 == local28.anInt2820 && local28.anInt2833 < 0) {
					this.aClass4_Sub21ArrayArray2[arg0][local28.anInt2826] = null;
					this.aClass4_Sub21ArrayArray2[arg0][arg2] = local28;
					@Pc(63) int local63 = local28.anInt2819 + (local28.anInt2840 * local28.anInt2821 >> 12);
					local28.anInt2821 = 4096;
					local28.anInt2819 += arg2 - local28.anInt2826 << 8;
					local28.anInt2840 = local63 - local28.anInt2819;
					local28.anInt2826 = arg2;
					return;
				}
			}
		}
		@Pc(111) Class4_Sub15 local111 = (Class4_Sub15) this.aClass42_1.method1055((long) this.anIntArray11[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class4_Sub6_Sub1 local119 = local111.aClass4_Sub6_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(131) Class4_Sub21 local131 = new Class4_Sub21();
		local131.anInt2820 = arg0;
		local131.aClass4_Sub6_Sub1_1 = local119;
		local131.aClass4_Sub15_1 = local111;
		local131.aClass56_1 = local111.aClass56Array1[arg2];
		local131.anInt2842 = local111.aByteArray17[arg2];
		local131.anInt2826 = arg2;
		local131.anInt2825 = local111.aByteArray18[arg2] * local111.anInt1892 * arg1 * arg1 + 1024 >> 11;
		local131.anInt2828 = local111.aByteArray19[arg2] & 0xFF;
		local131.anInt2819 = (arg2 << 8) - (local111.aShortArray6[arg2] & 0x7FFF);
		local131.anInt2839 = 0;
		local131.anInt2829 = 0;
		local131.anInt2823 = 0;
		local131.anInt2833 = -1;
		local131.anInt2822 = 0;
		if (this.anIntArray6[arg0] == 0) {
			local131.aClass4_Sub1_Sub4_3 = Static135.method1546(local119, this.method72(local131), this.method66(local131), this.method68(local131));
		} else {
			local131.aClass4_Sub1_Sub4_3 = Static135.method1546(local119, this.method72(local131), 0, this.method68(local131));
			this.method67(local131, local111.aShortArray6[arg2] < 0);
		}
		if (local111.aShortArray6[arg2] < 0) {
			local131.aClass4_Sub1_Sub4_3.method1558(-1);
		}
		if (local131.anInt2842 >= 0) {
			@Pc(284) Class4_Sub21 local284 = this.aClass4_Sub21ArrayArray1[arg0][local131.anInt2842];
			if (local284 != null && local284.anInt2833 < 0) {
				this.aClass4_Sub21ArrayArray2[arg0][local284.anInt2826] = null;
				local284.anInt2833 = 0;
			}
			this.aClass4_Sub21ArrayArray1[arg0][local131.anInt2842] = local131;
		}
		this.aClass4_Sub1_Sub3_1.aClass61_6.method1635(local131);
		this.aClass4_Sub21ArrayArray2[arg0][arg2] = local131;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass54_1.method1342()) {
			@Pc(14) int local14 = this.aClass54_1.anInt1903 * this.anInt79 / Static123.anInt3048;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong7;
				if (this.aLong8 - local23 >= 0L) {
					this.aLong7 = local23;
					break;
				}
				@Pc(52) int local52 = (int) ((this.aLong8 + (long) local14 - this.aLong7 - 1L) / (long) local14);
				arg2 -= local52;
				this.aLong7 += (long) local14 * (long) local52;
				this.aClass4_Sub1_Sub3_1.method1533(arg0, arg1, local52);
				this.method55();
				arg1 += local52;
			} while (this.aClass54_1.method1342());
		}
		this.aClass4_Sub1_Sub3_1.method1533(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)V")
	public synchronized void method75() {
		this.method60();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZLclient!ed;)V")
	public synchronized void method76(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub4 arg1) {
		this.method80();
		this.aClass54_1.method1341(arg1.aByteArray7);
		this.aBoolean3 = arg0;
		this.aLong7 = 0L;
		@Pc(28) int local28 = this.aClass54_1.method1343();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			this.aClass54_1.method1336(local30);
			this.aClass54_1.method1344(local30);
			this.aClass54_1.method1339(local30);
		}
		this.anInt106 = this.aClass54_1.method1335();
		this.anInt107 = this.aClass54_1.anIntArray215[this.anInt106];
		this.aLong8 = this.aClass54_1.method1337(this.anInt107);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!pd;Lclient!ed;ILclient!ca;B)Z")
	public synchronized boolean method77(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class4_Sub4 arg1, @OriginalArg(3) Class13 arg2) {
		arg1.method520();
		@Pc(9) boolean local9 = true;
		@Pc(31) int[] local31 = new int[] { 22050 };
		for (@Pc(37) Class4_Sub11 local37 = (Class4_Sub11) arg1.aClass42_6.method1049(); local37 != null; local37 = (Class4_Sub11) arg1.aClass42_6.method1054()) {
			@Pc(43) int local43 = (int) local37.aLong155;
			@Pc(51) Class4_Sub15 local51 = (Class4_Sub15) this.aClass42_1.method1055((long) local43);
			if (local51 == null) {
				local51 = Static71.method1192(arg0, local43);
				if (local51 == null) {
					local9 = false;
					continue;
				}
				this.aClass42_1.method1056(local51, (long) local43);
			}
			if (!local51.method1324(arg2, local37.aByteArray16, local31)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method519();
		}
		return local9;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
	private void method78(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method78(local9);
			}
			return;
		}
		this.anIntArray10[arg0] = 12800;
		this.anIntArray13[arg0] = 8192;
		this.anIntArray8[arg0] = 16383;
		this.anIntArray15[arg0] = 8192;
		this.anIntArray4[arg0] = 0;
		this.anIntArray16[arg0] = 8192;
		this.method84(arg0);
		this.method63(arg0);
		this.anIntArray18[arg0] = 0;
		this.anIntArray14[arg0] = 32767;
		this.anIntArray17[arg0] = 256;
		this.anIntArray6[arg0] = 0;
		this.method62(arg0, 8192);
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(B)V")
	public synchronized void method80() {
		this.aClass54_1.method1334();
		this.method56();
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
	private void method81(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method86(local28, local22, local16);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			if (local22 <= 0) {
				this.method86(local28, 64, local16);
			} else {
				this.method74(local16, local22, local28);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			this.method65(local22, local16, local28);
		} else if (local9 == 176) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			if (local28 == 0) {
				this.anIntArray12[local16] = (this.anIntArray12[local16] & 0xFFE03FFF) + (local22 << 14);
			}
			if (local28 == 32) {
				this.anIntArray12[local16] = (this.anIntArray12[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 1) {
				this.anIntArray4[local16] = (local22 << 7) + (this.anIntArray4[local16] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray4[local16] = (this.anIntArray4[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 5) {
				this.anIntArray16[local16] = (local22 << 7) + (this.anIntArray16[local16] & 0xFFFFC07F);
			}
			if (local28 == 37) {
				this.anIntArray16[local16] = (this.anIntArray16[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 7) {
				this.anIntArray10[local16] = (local22 << 7) + (this.anIntArray10[local16] & 0xFFFFC07F);
			}
			if (local28 == 39) {
				this.anIntArray10[local16] = local22 + (this.anIntArray10[local16] & 0xFFFFFF80);
			}
			if (local28 == 10) {
				this.anIntArray13[local16] = (local22 << 7) + (this.anIntArray13[local16] & 0xFFFFC07F);
			}
			if (local28 == 42) {
				this.anIntArray13[local16] = (this.anIntArray13[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 11) {
				this.anIntArray8[local16] = (local22 << 7) + (this.anIntArray8[local16] & 0xFFFFC07F);
			}
			if (local28 == 43) {
				this.anIntArray8[local16] = (this.anIntArray8[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 64) {
				if (local22 >= 64) {
					this.anIntArray18[local16] |= 0x1;
				} else {
					this.anIntArray18[local16] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local22 < 64) {
					this.method84(local16);
					this.anIntArray18[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray18[local16] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray14[local16] = (this.anIntArray14[local16] & 0x7F) + (local22 << 7);
			}
			if (local28 == 98) {
				this.anIntArray14[local16] = local22 + (this.anIntArray14[local16] & 0x3F80);
			}
			if (local28 == 101) {
				this.anIntArray14[local16] = (this.anIntArray14[local16] & 0x7F) + (local22 << 7) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray14[local16] = (this.anIntArray14[local16] & 0x3F80) + local22 + 16384;
			}
			if (local28 == 120) {
				this.method58(local16);
			}
			if (local28 == 121) {
				this.method78(local16);
			}
			if (local28 == 123) {
				this.method73(local16);
			}
			@Pc(498) int local498;
			if (local28 == 6) {
				local498 = this.anIntArray14[local16];
				if (local498 == 16384) {
					this.anIntArray17[local16] = (local22 << 7) + (this.anIntArray17[local16] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local498 = this.anIntArray14[local16];
				if (local498 == 16384) {
					this.anIntArray17[local16] = local22 + (this.anIntArray17[local16] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray6[local16] = (local22 << 7) + (this.anIntArray6[local16] & 0xFFFFC07F);
			}
			if (local28 == 48) {
				this.anIntArray6[local16] = (this.anIntArray6[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 81) {
				if (local22 < 64) {
					this.method63(local16);
					this.anIntArray18[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray18[local16] |= 0x4;
				}
			}
			if (local28 == 17) {
				this.method62(local16, (local22 << 7) + (this.anIntArray5[local16] & 0xFFFFC07F));
			}
			if (local28 == 49) {
				this.method62(local16, (this.anIntArray5[local16] & 0xFFFFFF80) + local22);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method57(this.anIntArray12[local16] + local28, local16);
		} else if (local9 == 208) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method64(local16, local28);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method89(local28, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method56();
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)Z")
	public synchronized boolean method82() {
		return this.aClass54_1.method1342();
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)I")
	public int method83() {
		return this.anInt82;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(II)V")
	private void method84(@OriginalArg(1) int arg0) {
		if ((this.anIntArray18[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(28) Class4_Sub21 local28 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1628(); local28 != null; local28 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1629()) {
			if (arg0 == local28.anInt2820 && this.aClass4_Sub21ArrayArray2[arg0][local28.anInt2826] == null && local28.anInt2833 < 0) {
				local28.anInt2833 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(IIII)V")
	private void method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub21 local8 = this.aClass4_Sub21ArrayArray2[arg2][arg0];
		if (local8 == null) {
			return;
		}
		this.aClass4_Sub21ArrayArray2[arg2][arg0] = null;
		if ((this.anIntArray18[arg2] & 0x2) == 0) {
			local8.anInt2833 = 0;
			return;
		}
		for (@Pc(49) Class4_Sub21 local49 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1628(); local49 != null; local49 = (Class4_Sub21) this.aClass4_Sub1_Sub3_1.aClass61_6.method1629()) {
			if (local49.anInt2820 == local8.anInt2820 && local49.anInt2833 < 0 && local49 != local8) {
				local8.anInt2833 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V")
	public synchronized void method87() {
		for (@Pc(14) Class4_Sub15 local14 = (Class4_Sub15) this.aClass42_1.method1049(); local14 != null; local14 = (Class4_Sub15) this.aClass42_1.method1054()) {
			local14.method1327();
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(BI)V")
	public synchronized void method88(@OriginalArg(1) int arg0) {
		this.anInt82 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(III)V")
	private void method89(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray15[arg1] = arg0;
	}
}
