import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class1_Sub8_Sub2 extends Class1_Sub8 {

	@OriginalMember(owner = "client!le", name = "Ob", descriptor = "Z")
	private boolean aBoolean118;

	@OriginalMember(owner = "client!le", name = "Pb", descriptor = "I")
	private int anInt2928;

	@OriginalMember(owner = "client!le", name = "Rb", descriptor = "I")
	private int anInt2929;

	@OriginalMember(owner = "client!le", name = "Sb", descriptor = "J")
	private long aLong90;

	@OriginalMember(owner = "client!le", name = "Tb", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "[I")
	public final int[] anIntArray273 = new int[16];

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[I")
	private final int[] anIntArray274 = new int[16];

	@OriginalMember(owner = "client!le", name = "L", descriptor = "[I")
	private final int[] anIntArray275 = new int[16];

	@OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
	private final int[] anIntArray279 = new int[16];

	@OriginalMember(owner = "client!le", name = "tb", descriptor = "[I")
	private final int[] anIntArray283 = new int[16];

	@OriginalMember(owner = "client!le", name = "qb", descriptor = "[I")
	private final int[] anIntArray281 = new int[16];

	@OriginalMember(owner = "client!le", name = "ab", descriptor = "[I")
	private final int[] anIntArray278 = new int[16];

	@OriginalMember(owner = "client!le", name = "W", descriptor = "[I")
	private final int[] anIntArray277 = new int[16];

	@OriginalMember(owner = "client!le", name = "Bb", descriptor = "I")
	private final int anInt2917 = 1000000;

	@OriginalMember(owner = "client!le", name = "zb", descriptor = "[I")
	public final int[] anIntArray285 = new int[16];

	@OriginalMember(owner = "client!le", name = "ib", descriptor = "[[Lclient!bh;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray2 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!le", name = "V", descriptor = "[I")
	private final int[] anIntArray276 = new int[16];

	@OriginalMember(owner = "client!le", name = "A", descriptor = "[[Lclient!bh;")
	private final Class1_Sub5[][] aClass1_Sub5ArrayArray1 = new Class1_Sub5[16][128];

	@OriginalMember(owner = "client!le", name = "fb", descriptor = "[I")
	private final int[] anIntArray280 = new int[16];

	@OriginalMember(owner = "client!le", name = "Fb", descriptor = "[I")
	private final int[] anIntArray286 = new int[16];

	@OriginalMember(owner = "client!le", name = "I", descriptor = "I")
	private int anInt2889 = 256;

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "[I")
	public final int[] anIntArray282 = new int[16];

	@OriginalMember(owner = "client!le", name = "wb", descriptor = "[I")
	private final int[] anIntArray284 = new int[16];

	@OriginalMember(owner = "client!le", name = "Kb", descriptor = "[I")
	private final int[] anIntArray287 = new int[16];

	@OriginalMember(owner = "client!le", name = "G", descriptor = "Lclient!wb;")
	private final Class87 aClass87_1 = new Class87();

	@OriginalMember(owner = "client!le", name = "Qb", descriptor = "Lclient!m;")
	private final Class1_Sub8_Sub3 aClass1_Sub8_Sub3_1 = new Class1_Sub8_Sub3(this);

	@OriginalMember(owner = "client!le", name = "lb", descriptor = "Lclient!ge;")
	private final Class30 aClass30_10 = new Class30(128);

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub2() {
		this.method2142();
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(I)Z")
	public synchronized boolean method2140() {
		return this.aClass87_1.method3458();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()Lclient!qh;")
	@Override
	public synchronized Class1_Sub8 method2942() {
		return this.aClass1_Sub8_Sub3_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
	private void method2141(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
	private void method2142() {
		this.method2150(-1);
		this.method2147(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray287[local23] = this.anIntArray280[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray286[local39] = this.anIntArray280[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()Lclient!qh;")
	@Override
	public synchronized Class1_Sub8 method2937() {
		return null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIILclient!bh;B)Z")
	public boolean method2143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub5 arg3) {
		arg3.anInt494 = Static166.anInt4307 / 100;
		if (arg3.anInt501 >= 0 && (arg3.aClass1_Sub8_Sub4_1 == null || arg3.aClass1_Sub8_Sub4_1.method2947())) {
			arg3.method410();
			arg3.method3499();
			if (arg3.anInt495 > 0 && arg3 == this.aClass1_Sub5ArrayArray2[arg3.anInt487][arg3.anInt495]) {
				this.aClass1_Sub5ArrayArray2[arg3.anInt487][arg3.anInt495] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt492;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray274[arg3.anInt487] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt492 = local56;
		}
		arg3.aClass1_Sub8_Sub4_1.method2975(this.method2171(arg3));
		@Pc(92) boolean local92 = false;
		@Pc(95) Class45 local95 = arg3.aClass45_1;
		arg3.anInt488++;
		arg3.anInt498 += local95.anInt2849;
		@Pc(126) double local126 = (double) ((arg3.anInt492 * arg3.anInt499 >> 12) + (arg3.anInt490 - 60 << 8)) * 5.086263020833333E-6D;
		if (local95.anInt2852 > 0) {
			if (local95.anInt2855 <= 0) {
				arg3.anInt486 += 128;
			} else {
				arg3.anInt486 += (int) (Math.pow(2.0D, (double) local95.anInt2855 * local126) * 128.0D + 0.5D);
			}
			if (arg3.anInt486 * local95.anInt2852 >= 819200) {
				local92 = true;
			}
		}
		if (local95.aByteArray40 != null) {
			if (local95.anInt2858 <= 0) {
				arg3.anInt480 += 128;
			} else {
				arg3.anInt480 += (int) (Math.pow(2.0D, local126 * (double) local95.anInt2858) * 128.0D + 0.5D);
			}
			while (local95.aByteArray40.length - 2 > arg3.anInt485 && (local95.aByteArray40[arg3.anInt485 + 2] & 0xFF) << 8 < arg3.anInt480) {
				arg3.anInt485 += 2;
			}
			if (arg3.anInt485 == local95.aByteArray40.length - 2 && local95.aByteArray40[arg3.anInt485 + 1] == 0) {
				local92 = true;
			}
		}
		if (arg3.anInt501 >= 0 && local95.aByteArray39 != null && (this.anIntArray285[arg3.anInt487] & 0x1) == 0 && (arg3.anInt495 < 0 || this.aClass1_Sub5ArrayArray2[arg3.anInt487][arg3.anInt495] != arg3)) {
			if (local95.anInt2850 > 0) {
				arg3.anInt501 += (int) (Math.pow(2.0D, local126 * (double) local95.anInt2850) * 128.0D + 0.5D);
			} else {
				arg3.anInt501 += 128;
			}
			while (local95.aByteArray39.length - 2 > arg3.anInt483 && arg3.anInt501 > (local95.aByteArray39[arg3.anInt483 + 2] & 0xFF) << 8) {
				arg3.anInt483 += 2;
			}
			if (arg3.anInt483 == local95.aByteArray39.length - 2) {
				local92 = true;
			}
		}
		if (!local92) {
			arg3.aClass1_Sub8_Sub4_1.method2959(arg3.anInt494, this.method2169(arg3), this.method2148(arg3));
			return false;
		}
		arg3.aClass1_Sub8_Sub4_1.method2979(arg3.anInt494);
		if (arg0 == null) {
			arg3.aClass1_Sub8_Sub4_1.method2943(arg1);
		} else {
			arg3.aClass1_Sub8_Sub4_1.method2941(arg0, arg2, arg1);
		}
		if (arg3.aClass1_Sub8_Sub4_1.method2972()) {
			this.aClass1_Sub8_Sub3_1.aClass1_Sub8_Sub1_2.method1090(arg3.aClass1_Sub8_Sub4_1);
		}
		arg3.method410();
		if (arg3.anInt501 >= 0) {
			arg3.method3499();
			if (arg3.anInt495 > 0 && arg3 == this.aClass1_Sub5ArrayArray2[arg3.anInt487][arg3.anInt495]) {
				this.aClass1_Sub5ArrayArray2[arg3.anInt487][arg3.anInt495] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
	private void method2144() {
		@Pc(8) int local8 = this.anInt2929;
		@Pc(11) int local11 = this.anInt2928;
		@Pc(14) long local14 = this.aLong91;
		while (this.anInt2928 == local11) {
			while (local11 == this.aClass87_1.anIntArray430[local8]) {
				this.aClass87_1.method3457(local8);
				@Pc(30) int local30 = this.aClass87_1.method3462(local8);
				if (local30 == 1) {
					this.aClass87_1.method3459();
					this.aClass87_1.method3463(local8);
					if (this.aClass87_1.method3466()) {
						if (!this.aBoolean118 || local11 == 0) {
							this.method2142();
							this.aClass87_1.method3469();
							return;
						}
						this.aClass87_1.method3456(local14);
					}
					break;
				}
				if ((local30 & 0x80) != 0) {
					this.method2173(local30);
				}
				this.aClass87_1.method3467(local8);
				this.aClass87_1.method3463(local8);
			}
			local8 = this.aClass87_1.method3460();
			local11 = this.aClass87_1.anIntArray430[local8];
			local14 = this.aClass87_1.method3461(local11);
		}
		this.anInt2929 = local8;
		this.aLong91 = local14;
		this.anInt2928 = local11;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIB)V")
	private void method2145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray283[arg1] = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ed;ILclient!ag;Lclient!u;I)Z")
	public synchronized boolean method2146(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) Class76 arg2) {
		@Pc(9) boolean local9 = true;
		arg0.method1050();
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub3 local29 = (Class1_Sub3) arg0.aClass30_6.method1470(); local29 != null; local29 = (Class1_Sub3) arg0.aClass30_6.method1473()) {
			@Pc(35) int local35 = (int) local29.aLong147;
			@Pc(43) Class1_Sub15 local43 = (Class1_Sub15) this.aClass30_10.method1467((long) local35);
			if (local43 == null) {
				local43 = Static163.method3267(arg2, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass30_10.method1464(local43, (long) local35);
			}
			if (!local43.method1835(local23, arg1, local29.aByteArray4)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method1051();
		}
		return local9;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IB)V")
	private void method2147(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method2147(local9);
			}
			return;
		}
		this.anIntArray279[arg0] = 12800;
		this.anIntArray276[arg0] = 8192;
		this.anIntArray278[arg0] = 16383;
		this.anIntArray283[arg0] = 8192;
		this.anIntArray281[arg0] = 0;
		this.anIntArray274[arg0] = 8192;
		this.method2170(arg0);
		this.method2156(arg0);
		this.anIntArray285[arg0] = 0;
		this.anIntArray277[arg0] = 32767;
		this.anIntArray275[arg0] = 256;
		this.anIntArray273[arg0] = 0;
		this.method2168(arg0, 8192);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!bh;B)I")
	private int method2148(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(9) int local9 = this.anIntArray276[arg0.anInt487];
		return local9 < 8192 ? arg0.anInt504 * local9 + 32 >> 6 : 16384 - ((128 - arg0.anInt504) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public synchronized void method2149() {
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass30_10.method1470(); local17 != null; local17 = (Class1_Sub15) this.aClass30_10.method1473()) {
			local17.method3499();
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method2941(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass87_1.method3458()) {
			@Pc(14) int local14 = this.anInt2917 * this.aClass87_1.anInt4506 / Static166.anInt4307;
			do {
				@Pc(23) long local23 = (long) arg2 * (long) local14 + this.aLong90;
				if (this.aLong91 - local23 >= 0L) {
					this.aLong90 = local23;
					break;
				}
				@Pc(54) int local54 = (int) ((this.aLong91 + (long) local14 - this.aLong90 - 1L) / (long) local14);
				this.aLong90 += (long) local54 * (long) local14;
				arg2 -= local54;
				this.aClass1_Sub8_Sub3_1.method2941(arg0, arg1, local54);
				arg1 += local54;
				this.method2144();
			} while (this.aClass87_1.method3458());
		}
		this.aClass1_Sub8_Sub3_1.method2941(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IB)V")
	private void method2150(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method174(); local12 != null; local12 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method181()) {
			if (arg0 < 0 || local12.anInt487 == arg0) {
				if (local12.aClass1_Sub8_Sub4_1 != null) {
					local12.aClass1_Sub8_Sub4_1.method2979(Static166.anInt4307 / 100);
					if (local12.aClass1_Sub8_Sub4_1.method2972()) {
						this.aClass1_Sub8_Sub3_1.aClass1_Sub8_Sub1_2.method1090(local12.aClass1_Sub8_Sub4_1);
					}
					local12.method410();
				}
				if (local12.anInt501 < 0) {
					this.aClass1_Sub5ArrayArray1[local12.anInt487][local12.anInt490] = null;
				}
				local12.method3499();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBI)V")
	private void method2152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(II)V")
	public synchronized void method2153(@OriginalArg(0) int arg0) {
		this.anInt2889 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)V")
	private void method2154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray287[arg1] != arg0) {
			this.anIntArray287[arg1] = arg0;
			for (@Pc(28) int local28 = 0; local28 < 128; local28++) {
				this.aClass1_Sub5ArrayArray2[arg1][local28] = null;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)V")
	private void method2155() {
		this.anIntArray280[9] = 128;
		this.anIntArray286[9] = 128;
		this.method2154(128, 9);
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(II)V")
	private void method2156(@OriginalArg(0) int arg0) {
		if ((this.anIntArray285[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(27) Class1_Sub5 local27 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method174(); local27 != null; local27 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method181()) {
			if (local27.anInt487 == arg0) {
				local27.anInt497 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(I)V")
	public synchronized void method2157() {
		this.aClass87_1.method3469();
		this.method2142();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)V")
	private void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2163(64, arg2, arg1);
		if ((this.anIntArray285[arg1] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub5 local25 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method176(); local25 != null; local25 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method175()) {
				if (arg1 == local25.anInt487 && local25.anInt501 < 0) {
					this.aClass1_Sub5ArrayArray1[arg1][local25.anInt490] = null;
					this.aClass1_Sub5ArrayArray1[arg1][arg2] = local25;
					@Pc(64) int local64 = (local25.anInt499 * local25.anInt492 >> 12) + local25.anInt500;
					local25.anInt492 = 4096;
					local25.anInt500 += arg2 - local25.anInt490 << 8;
					local25.anInt499 = local64 - local25.anInt500;
					local25.anInt490 = arg2;
					return;
				}
			}
		}
		@Pc(110) Class1_Sub15 local110 = (Class1_Sub15) this.aClass30_10.method1467((long) this.anIntArray287[arg1]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class1_Sub20_Sub1 local118 = local110.aClass1_Sub20_Sub1Array1[arg2];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class1_Sub5 local125 = new Class1_Sub5();
		local125.aClass1_Sub20_Sub1_1 = local118;
		local125.aClass1_Sub15_1 = local110;
		local125.anInt487 = arg1;
		local125.aClass45_1 = local110.aClass45Array1[arg2];
		local125.anInt495 = local110.aByteArray37[arg2];
		local125.anInt490 = arg2;
		local125.anInt489 = local110.aByteArray35[arg2] * local110.anInt2483 * arg0 * arg0 + 1024 >> 11;
		local125.anInt504 = local110.aByteArray36[arg2] & 0xFF;
		local125.anInt500 = (arg2 << 8) - (local110.aShortArray24[arg2] & 0x7FFF);
		local125.anInt480 = 0;
		local125.anInt485 = 0;
		local125.anInt483 = 0;
		local125.anInt486 = 0;
		local125.anInt501 = -1;
		if (this.anIntArray273[arg1] == 0) {
			local125.aClass1_Sub8_Sub4_1 = Static190.method2976(local118, this.method2171(local125), this.method2169(local125), this.method2148(local125));
		} else {
			local125.aClass1_Sub8_Sub4_1 = Static190.method2976(local118, this.method2171(local125), 0, this.method2148(local125));
			this.method2172(local110.aShortArray24[arg2] < 0, local125);
		}
		if (local110.aShortArray24[arg2] < 0) {
			local125.aClass1_Sub8_Sub4_1.method2968(-1);
		}
		if (local125.anInt495 >= 0) {
			@Pc(280) Class1_Sub5 local280 = this.aClass1_Sub5ArrayArray2[arg1][local125.anInt495];
			if (local280 != null && local280.anInt501 < 0) {
				this.aClass1_Sub5ArrayArray1[arg1][local280.anInt490] = null;
				local280.anInt501 = 0;
			}
			this.aClass1_Sub5ArrayArray2[arg1][local125.anInt495] = local125;
		}
		this.aClass1_Sub8_Sub3_1.aClass4_10.method179(local125);
		this.aClass1_Sub5ArrayArray1[arg1][arg2] = local125;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!bh;)Z")
	public boolean method2160(@OriginalArg(1) Class1_Sub5 arg0) {
		if (arg0.aClass1_Sub8_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt501 >= 0) {
			arg0.method3499();
			if (arg0.anInt495 > 0 && arg0 == this.aClass1_Sub5ArrayArray2[arg0.anInt487][arg0.anInt495]) {
				this.aClass1_Sub5ArrayArray2[arg0.anInt487][arg0.anInt495] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
	public synchronized void method2161() {
		for (@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) this.aClass30_10.method1470(); local13 != null; local13 = (Class1_Sub15) this.aClass30_10.method1473()) {
			local13.method1830();
		}
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(II)V")
	private void method2162(@OriginalArg(0) int arg0) {
		for (@Pc(20) Class1_Sub5 local20 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method174(); local20 != null; local20 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method181()) {
			if ((arg0 < 0 || local20.anInt487 == arg0) && local20.anInt501 < 0) {
				this.aClass1_Sub5ArrayArray1[local20.anInt487][local20.anInt490] = null;
				local20.anInt501 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)V")
	private void method2163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub5 local8 = this.aClass1_Sub5ArrayArray1[arg2][arg1];
		if (local8 == null) {
			return;
		}
		this.aClass1_Sub5ArrayArray1[arg2][arg1] = null;
		if ((this.anIntArray285[arg2] & 0x2) == 0) {
			local8.anInt501 = 0;
			return;
		}
		for (@Pc(36) Class1_Sub5 local36 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method174(); local36 != null; local36 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method181()) {
			if (local8.anInt487 == local36.anInt487 && local36.anInt501 < 0 && local8 != local36) {
				local8.anInt501 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(III)V")
	public synchronized void method2164() {
		this.method2155();
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method2943(@OriginalArg(0) int arg0) {
		if (this.aClass87_1.method3458()) {
			@Pc(18) int local18 = this.aClass87_1.anInt4506 * this.anInt2917 / Static166.anInt4307;
			do {
				@Pc(27) long local27 = (long) local18 * (long) arg0 + this.aLong90;
				if (this.aLong91 - local27 >= 0L) {
					this.aLong90 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong91 + (long) local18 - this.aLong90 - 1L) / (long) local18);
				this.aLong90 += (long) local18 * (long) local58;
				this.aClass1_Sub8_Sub3_1.method2943(local58);
				arg0 -= local58;
				this.method2144();
			} while (this.aClass87_1.method3458());
		}
		this.aClass1_Sub8_Sub3_1.method2943(arg0);
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)I")
	public int method2165() {
		return this.anInt2889;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLclient!ed;Z)V")
	public synchronized void method2166(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) boolean arg1) {
		this.method2157();
		this.aClass87_1.method3468(arg0.aByteArray13);
		this.aBoolean118 = arg1;
		this.aLong90 = 0L;
		@Pc(23) int local23 = this.aClass87_1.method3464();
		for (@Pc(25) int local25 = 0; local25 < local23; local25++) {
			this.aClass87_1.method3457(local25);
			this.aClass87_1.method3467(local25);
			this.aClass87_1.method3463(local25);
		}
		this.anInt2929 = this.aClass87_1.method3460();
		this.anInt2928 = this.aClass87_1.anIntArray430[this.anInt2929];
		this.aLong91 = this.aClass87_1.method3461(this.anInt2928);
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	@Override
	public synchronized int method2938() {
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(III)V")
	private void method2168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray284[arg0] = arg1;
		this.anIntArray282[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!bh;)I")
	private int method2169(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(20) int local20 = this.anIntArray278[arg0.anInt487] * this.anIntArray279[arg0.anInt487] + 4096 >> 13;
		@Pc(23) Class45 local23 = arg0.aClass45_1;
		@Pc(31) int local31 = local20 * local20 + 16384 >> 15;
		@Pc(44) int local44 = arg0.anInt489 * local31 + 16384 >> 15;
		local20 = this.anInt2889 * local44 + 128 >> 8;
		if (local23.anInt2852 > 0) {
			local20 = (int) ((double) local20 * Math.pow(0.5D, (double) local23.anInt2852 * (double) arg0.anInt486 * 1.953125E-5D) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(121) int local121;
		@Pc(111) int local111;
		if (local23.aByteArray40 != null) {
			local83 = arg0.anInt480;
			local91 = local23.aByteArray40[arg0.anInt485 + 1];
			if (arg0.anInt485 < local23.aByteArray40.length - 2) {
				local111 = (local23.aByteArray40[arg0.anInt485 + 2] & 0xFF) << 8;
				local121 = (local23.aByteArray40[arg0.anInt485] & 0xFF) << 8;
				local91 += (local83 - local121) * (local23.aByteArray40[arg0.anInt485 + 3] - local91) / (local111 - local121);
			}
			local20 = local91 * local20 + 32 >> 6;
		}
		if (arg0.anInt501 > 0 && local23.aByteArray39 != null) {
			local83 = arg0.anInt501;
			local91 = local23.aByteArray39[arg0.anInt483 + 1];
			if (local23.aByteArray39.length - 2 > arg0.anInt483) {
				local121 = (local23.aByteArray39[arg0.anInt483] & 0xFF) << 8;
				local111 = (local23.aByteArray39[arg0.anInt483 + 2] & 0xFF) << 8;
				local91 += (local23.aByteArray39[arg0.anInt483 + 3] - local91) * (local83 - local121) / (local111 - local121);
			}
			local20 = local20 * local91 + 32 >> 6;
		}
		return local20;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(II)V")
	private void method2170(@OriginalArg(0) int arg0) {
		if ((this.anIntArray285[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub5 local18 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method174(); local18 != null; local18 = (Class1_Sub5) this.aClass1_Sub8_Sub3_1.aClass4_10.method181()) {
			if (arg0 == local18.anInt487 && this.aClass1_Sub5ArrayArray1[arg0][local18.anInt490] == null && local18.anInt501 < 0) {
				local18.anInt501 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(Lclient!bh;B)I")
	private int method2171(@OriginalArg(0) Class1_Sub5 arg0) {
		@Pc(7) Class45 local7 = arg0.aClass45_1;
		@Pc(23) int local23 = arg0.anInt500 + (arg0.anInt492 * arg0.anInt499 >> 12);
		local23 += this.anIntArray275[arg0.anInt487] * (this.anIntArray283[arg0.anInt487] - 8192) >> 12;
		@Pc(64) int local64;
		if (local7.anInt2849 > 0 && (local7.anInt2848 > 0 || this.anIntArray281[arg0.anInt487] > 0)) {
			local64 = local7.anInt2848 << 2;
			@Pc(69) int local69 = local7.anInt2856 << 1;
			if (arg0.anInt488 < local69) {
				local64 = arg0.anInt488 * local64 / local69;
			}
			local64 += this.anIntArray281[arg0.anInt487] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt498 & 0x1FF) * 0.01227184630308513D);
			local23 += (int) (local103 * (double) local64);
		}
		local64 = (int) ((double) (arg0.aClass1_Sub20_Sub1_1.anInt3738 * 256) * Math.pow(2.0D, (double) local23 * 3.255208333333333E-4D) / (double) Static166.anInt4307 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ZZLclient!bh;)V")
	public void method2172(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(8) int local8 = arg1.aClass1_Sub20_Sub1_1.aByteArray45.length;
		@Pc(43) int local43;
		if (arg0 && arg1.aClass1_Sub20_Sub1_1.aBoolean140) {
			@Pc(30) int local30 = local8 + local8 - arg1.aClass1_Sub20_Sub1_1.anInt3737;
			local43 = (int) ((long) this.anIntArray273[arg1.anInt487] * (long) local30 >> 6);
			local8 <<= 0x8;
			if (local43 >= local8) {
				local43 = local8 + local8 - local43 - 1;
				arg1.aClass1_Sub8_Sub4_1.method2965();
			}
		} else {
			local43 = (int) ((long) this.anIntArray273[arg1.anInt487] * (long) local8 >> 6);
		}
		arg1.aClass1_Sub8_Sub4_1.method2964(local43);
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(II)V")
	private void method2173(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(28) int local28;
		@Pc(22) int local22;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			this.method2163(local22, local28, local16);
		} else if (local9 == 144) {
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			if (local22 > 0) {
				this.method2159(local22, local16, local28);
			} else {
				this.method2163(64, local28, local16);
			}
		} else if (local9 == 160) {
			local28 = arg0 >> 8 & 0x7F;
			local22 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2152(local28, local16, local22);
		} else if (local9 == 176) {
			local22 = arg0 >> 16 & 0x7F;
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			if (local28 == 0) {
				this.anIntArray286[local16] = (local22 << 14) + (this.anIntArray286[local16] & 0xFFE03FFF);
			}
			if (local28 == 32) {
				this.anIntArray286[local16] = (local22 << 7) + (this.anIntArray286[local16] & 0xFFFFC07F);
			}
			if (local28 == 1) {
				this.anIntArray281[local16] = (local22 << 7) + (this.anIntArray281[local16] & 0xFFFFC07F);
			}
			if (local28 == 33) {
				this.anIntArray281[local16] = (this.anIntArray281[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 5) {
				this.anIntArray274[local16] = (this.anIntArray274[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 37) {
				this.anIntArray274[local16] = local22 + (this.anIntArray274[local16] & 0xFFFFFF80);
			}
			if (local28 == 7) {
				this.anIntArray279[local16] = (this.anIntArray279[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 39) {
				this.anIntArray279[local16] = (this.anIntArray279[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 10) {
				this.anIntArray276[local16] = (this.anIntArray276[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 42) {
				this.anIntArray276[local16] = local22 + (this.anIntArray276[local16] & 0xFFFFFF80);
			}
			if (local28 == 11) {
				this.anIntArray278[local16] = (this.anIntArray278[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 43) {
				this.anIntArray278[local16] = (this.anIntArray278[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 64) {
				if (local22 >= 64) {
					this.anIntArray285[local16] |= 0x1;
				} else {
					this.anIntArray285[local16] &= 0xFFFFFFFE;
				}
			}
			if (local28 == 65) {
				if (local22 < 64) {
					this.method2170(local16);
					this.anIntArray285[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray285[local16] |= 0x2;
				}
			}
			if (local28 == 99) {
				this.anIntArray277[local16] = (this.anIntArray277[local16] & 0x7F) + (local22 << 7);
			}
			if (local28 == 98) {
				this.anIntArray277[local16] = (this.anIntArray277[local16] & 0x3F80) + local22;
			}
			if (local28 == 101) {
				this.anIntArray277[local16] = (local22 << 7) + (this.anIntArray277[local16] & 0x7F) + 16384;
			}
			if (local28 == 100) {
				this.anIntArray277[local16] = local22 + (this.anIntArray277[local16] & 0x3F80) + 16384;
			}
			if (local28 == 120) {
				this.method2150(local16);
			}
			if (local28 == 121) {
				this.method2147(local16);
			}
			if (local28 == 123) {
				this.method2162(local16);
			}
			@Pc(507) int local507;
			if (local28 == 6) {
				local507 = this.anIntArray277[local16];
				if (local507 == 16384) {
					this.anIntArray275[local16] = (local22 << 7) + (this.anIntArray275[local16] & 0xFFFFC07F);
				}
			}
			if (local28 == 38) {
				local507 = this.anIntArray277[local16];
				if (local507 == 16384) {
					this.anIntArray275[local16] = local22 + (this.anIntArray275[local16] & 0xFFFFFF80);
				}
			}
			if (local28 == 16) {
				this.anIntArray273[local16] = (this.anIntArray273[local16] & 0xFFFFC07F) + (local22 << 7);
			}
			if (local28 == 48) {
				this.anIntArray273[local16] = (this.anIntArray273[local16] & 0xFFFFFF80) + local22;
			}
			if (local28 == 81) {
				if (local22 >= 64) {
					this.anIntArray285[local16] |= 0x4;
				} else {
					this.method2156(local16);
					this.anIntArray285[local16] &= 0xFFFFFFFB;
				}
			}
			if (local28 == 17) {
				this.method2168(local16, (local22 << 7) + (this.anIntArray284[local16] & 0xFFFFC07F));
			}
			if (local28 == 49) {
				this.method2168(local16, (this.anIntArray284[local16] & 0xFFFFFF80) + local22);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local28 = arg0 >> 8 & 0x7F;
			this.method2154(this.anIntArray286[local16] + local28, local16);
		} else if (local9 == 208) {
			local28 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method2141(local28, local16);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local28 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2145(local28, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method2142();
			}
		}
	}
}
