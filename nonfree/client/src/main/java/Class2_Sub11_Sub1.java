import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!fi", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!fi", name = "Hb", descriptor = "Z")
	private boolean aBoolean165;

	@OriginalMember(owner = "client!fi", name = "Jb", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!fi", name = "Kb", descriptor = "I")
	private int anInt2252;

	@OriginalMember(owner = "client!fi", name = "Lb", descriptor = "I")
	private int anInt2253;

	@OriginalMember(owner = "client!fi", name = "Nb", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!fi", name = "Ob", descriptor = "I")
	private int anInt2255;

	@OriginalMember(owner = "client!fi", name = "Pb", descriptor = "Z")
	private boolean aBoolean166;

	@OriginalMember(owner = "client!fi", name = "Qb", descriptor = "Lclient!u;")
	private Class2_Sub39 aClass2_Sub39_1;

	@OriginalMember(owner = "client!fi", name = "z", descriptor = "[I")
	private final int[] anIntArray175 = new int[16];

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "[I")
	private final int[] anIntArray176 = new int[16];

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "[I")
	private final int[] anIntArray177 = new int[16];

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
	private final int[] anIntArray178 = new int[16];

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "[I")
	private final int[] anIntArray173 = new int[16];

	@OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
	private final int anInt2236 = 1000000;

	@OriginalMember(owner = "client!fi", name = "hb", descriptor = "[I")
	public final int[] anIntArray180 = new int[16];

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "[I")
	private final int[] anIntArray174 = new int[16];

	@OriginalMember(owner = "client!fi", name = "rb", descriptor = "[I")
	public final int[] anIntArray183 = new int[16];

	@OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
	private int anInt2232 = 256;

	@OriginalMember(owner = "client!fi", name = "mb", descriptor = "[[Lclient!kb;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray2 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "[[Lclient!kb;")
	private final Class2_Sub23[][] aClass2_Sub23ArrayArray1 = new Class2_Sub23[16][128];

	@OriginalMember(owner = "client!fi", name = "tb", descriptor = "[I")
	private final int[] anIntArray185 = new int[16];

	@OriginalMember(owner = "client!fi", name = "ub", descriptor = "[I")
	private final int[] anIntArray186 = new int[16];

	@OriginalMember(owner = "client!fi", name = "ib", descriptor = "[I")
	private final int[] anIntArray181 = new int[16];

	@OriginalMember(owner = "client!fi", name = "vb", descriptor = "[I")
	public final int[] anIntArray187 = new int[16];

	@OriginalMember(owner = "client!fi", name = "O", descriptor = "[I")
	private final int[] anIntArray179 = new int[16];

	@OriginalMember(owner = "client!fi", name = "Cb", descriptor = "[I")
	private final int[] anIntArray188 = new int[16];

	@OriginalMember(owner = "client!fi", name = "qb", descriptor = "[I")
	private final int[] anIntArray182 = new int[16];

	@OriginalMember(owner = "client!fi", name = "sb", descriptor = "[I")
	private final int[] anIntArray184 = new int[16];

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "Lclient!mo;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!fi", name = "Ib", descriptor = "Lclient!op;")
	private final Class2_Sub11_Sub3 aClass2_Sub11_Sub3_1 = new Class2_Sub11_Sub3(this);

	@OriginalMember(owner = "client!fi", name = "X", descriptor = "Lclient!wb;")
	private final Class243 aClass243_8 = new Class243(128);

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub1() {
		this.method1771();
		this.method1790(true);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z")
	public synchronized boolean method1770() {
		return this.aClass154_1.method3871();
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
	private synchronized void method1771() {
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray184[local19] = 256;
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V")
	private void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class2_Sub23 local12 = this.aClass2_Sub23ArrayArray2[arg0][arg2];
		if (local12 == null) {
			return;
		}
		this.aClass2_Sub23ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray180[arg0] & 0x2) == 0) {
			local12.anInt3564 = 0;
			return;
		}
		for (@Pc(37) Class2_Sub23 local37 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5795(); local37 != null; local37 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5799()) {
			if (local37.anInt3549 == local12.anInt3549 && local37.anInt3564 < 0 && local12 != local37) {
				local12.anInt3564 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!kb;)I")
	private int method1773(@OriginalArg(1) Class2_Sub23 arg0) {
		@Pc(9) int local9 = this.anIntArray173[arg0.anInt3549];
		return local9 >= 8192 ? 16384 - ((128 - arg0.anInt3551) * (16384 - local9) + 32 >> 6) : local9 * arg0.anInt3551 + 32 >> 6;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLclient!kb;)I")
	private int method1774(@OriginalArg(1) Class2_Sub23 arg0) {
		if (this.anIntArray184[arg0.anInt3549] == 0) {
			return 0;
		}
		@Pc(17) Class117 local17 = arg0.aClass117_1;
		@Pc(38) int local38 = this.anIntArray181[arg0.anInt3549] * this.anIntArray186[arg0.anInt3549] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt3553 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt2232 + 128 >> 8;
		local38 = local64 * this.anIntArray184[arg0.anInt3549] + 128 >> 8;
		if (local17.anInt3319 > 0) {
			local38 = (int) (Math.pow(0.5D, (double) arg0.anInt3559 * 1.953125E-5D * (double) local17.anInt3319) * (double) local38 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local17.aByteArray38 != null) {
			local106 = arg0.anInt3563;
			local114 = local17.aByteArray38[arg0.anInt3562 + 1];
			if (local17.aByteArray38.length - 2 > arg0.anInt3562) {
				local132 = (local17.aByteArray38[arg0.anInt3562] & 0xFF) << 8;
				local144 = (local17.aByteArray38[arg0.anInt3562 + 2] & 0xFF) << 8;
				local114 += (local17.aByteArray38[arg0.anInt3562 + 3] - local114) * (-local132 + local106) / (local144 - local132);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		if (arg0.anInt3564 > 0 && local17.aByteArray39 != null) {
			local106 = arg0.anInt3564;
			local114 = local17.aByteArray39[arg0.anInt3556 + 1];
			if (arg0.anInt3556 < local17.aByteArray39.length - 2) {
				local132 = (local17.aByteArray39[arg0.anInt3556] & 0xFF) << 8;
				local144 = (local17.aByteArray39[arg0.anInt3556 + 2] & 0xFF) << 8;
				local114 += (local106 - local132) * (local17.aByteArray39[arg0.anInt3556 + 3] + -local114) / (local144 - local132);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V")
	public synchronized void method1775() {
		for (@Pc(19) Class2_Sub36 local19 = (Class2_Sub36) this.aClass243_8.method5975(); local19 != null; local19 = (Class2_Sub36) this.aClass243_8.method5973()) {
			local19.method6130();
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!kb;BZ)V")
	public void method1776(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass2_Sub20_Sub1_1.aByteArray40.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass2_Sub20_Sub1_1.aBoolean257) {
			@Pc(44) int local44 = local8 + local8 - arg0.aClass2_Sub20_Sub1_1.anInt3406;
			local8 <<= 0x8;
			local33 = (int) ((long) local44 * (long) this.anIntArray187[arg0.anInt3549] >> 6);
			if (local8 <= local33) {
				arg0.aClass2_Sub11_Sub2_1.method2989();
				local33 = local8 + local8 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray187[arg0.anInt3549] * (long) local8 >> 6);
		}
		arg0.aClass2_Sub11_Sub2_1.method2984(local33);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(III)V")
	private void method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray176[arg1] != arg0) {
			this.anIntArray176[arg1] = arg0;
			for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
				this.aClass2_Sub23ArrayArray1[arg1][local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "()Lclient!rk;")
	@Override
	public synchronized Class2_Sub11 method4872() {
		return null;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)V")
	private void method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray182[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)V")
	private void method1779(@OriginalArg(1) int arg0) {
		if ((this.anIntArray180[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class2_Sub23 local22 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5795(); local22 != null; local22 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5799()) {
			if (local22.anInt3549 == arg0 && this.aClass2_Sub23ArrayArray2[arg0][local22.anInt3558] == null && local22.anInt3564 < 0) {
				local22.anInt3564 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()Lclient!rk;")
	@Override
	public synchronized Class2_Sub11 method4871() {
		return this.aClass2_Sub11_Sub3_1;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(III)V")
	private void method1781() {
		this.anIntArray177[9] = 128;
		this.anIntArray174[9] = 128;
		this.method1777(128, 9);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZI)V")
	private void method1782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!kb;III[I)Z")
	public boolean method1783(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0.anInt3555 = Static392.anInt7144 / 100;
		if (arg0.anInt3564 >= 0 && (arg0.aClass2_Sub11_Sub2_1 == null || arg0.aClass2_Sub11_Sub2_1.method3003())) {
			arg0.method3093();
			arg0.method6130();
			if (arg0.anInt3567 > 0 && arg0 == this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567]) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg0.anInt3561;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray185[arg0.anInt3549] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg0.anInt3561 = local56;
		}
		arg0.aClass2_Sub11_Sub2_1.method2998(this.method1789(arg0));
		@Pc(105) Class117 local105 = arg0.aClass117_1;
		arg0.anInt3550 += local105.anInt3320;
		arg0.anInt3557++;
		@Pc(120) boolean local120 = false;
		@Pc(138) double local138 = (double) ((arg0.anInt3561 * arg0.anInt3554 >> 12) + (arg0.anInt3558 - 60 << 8)) * 5.086263020833333E-6D;
		if (local105.anInt3319 > 0) {
			if (local105.anInt3316 <= 0) {
				arg0.anInt3559 += 128;
			} else {
				arg0.anInt3559 += (int) (Math.pow(2.0D, (double) local105.anInt3316 * local138) * 128.0D + 0.5D);
			}
			if (local105.anInt3319 * arg0.anInt3559 >= 819200) {
				local120 = true;
			}
		}
		if (local105.aByteArray38 != null) {
			if (local105.anInt3321 > 0) {
				arg0.anInt3563 += (int) (Math.pow(2.0D, local138 * (double) local105.anInt3321) * 128.0D + 0.5D);
			} else {
				arg0.anInt3563 += 128;
			}
			while (arg0.anInt3562 < local105.aByteArray38.length - 2 && arg0.anInt3563 > (local105.aByteArray38[arg0.anInt3562 + 2] & 0xFF) << 8) {
				arg0.anInt3562 += 2;
			}
			if (arg0.anInt3562 == local105.aByteArray38.length - 2 && local105.aByteArray38[arg0.anInt3562 + 1] == 0) {
				local120 = true;
			}
		}
		if (arg0.anInt3564 >= 0 && local105.aByteArray39 != null && (this.anIntArray180[arg0.anInt3549] & 0x1) == 0 && (arg0.anInt3567 < 0 || this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567] != arg0)) {
			if (local105.anInt3322 <= 0) {
				arg0.anInt3564 += 128;
			} else {
				arg0.anInt3564 += (int) (Math.pow(2.0D, (double) local105.anInt3322 * local138) * 128.0D + 0.5D);
			}
			while (arg0.anInt3556 < local105.aByteArray39.length - 2 && arg0.anInt3564 > (local105.aByteArray39[arg0.anInt3556 + 2] & 0xFF) << 8) {
				arg0.anInt3556 += 2;
			}
			if (local105.aByteArray39.length - 2 == arg0.anInt3556) {
				local120 = true;
			}
		}
		if (!local120) {
			arg0.aClass2_Sub11_Sub2_1.method2990(arg0.anInt3555, this.method1774(arg0), this.method1773(arg0));
			return false;
		}
		arg0.aClass2_Sub11_Sub2_1.method3018(arg0.anInt3555);
		if (arg3 == null) {
			arg0.aClass2_Sub11_Sub2_1.method4875(arg1);
		} else {
			arg0.aClass2_Sub11_Sub2_1.method4877(arg3, arg2, arg1);
		}
		if (arg0.aClass2_Sub11_Sub2_1.method3019()) {
			this.aClass2_Sub11_Sub3_1.aClass2_Sub11_Sub4_2.method4878(arg0.aClass2_Sub11_Sub2_1);
		}
		arg0.method3093();
		if (arg0.anInt3564 >= 0) {
			arg0.method6130();
			if (arg0.anInt3567 > 0 && arg0 == this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567]) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V")
	private void method1784(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1784(local9);
			}
			return;
		}
		this.anIntArray181[arg0] = 12800;
		this.anIntArray173[arg0] = 8192;
		this.anIntArray186[arg0] = 16383;
		this.anIntArray182[arg0] = 8192;
		this.anIntArray175[arg0] = 0;
		this.anIntArray185[arg0] = 8192;
		this.method1779(arg0);
		this.method1801(arg0);
		this.anIntArray180[arg0] = 0;
		this.anIntArray178[arg0] = 32767;
		this.anIntArray188[arg0] = 256;
		this.anIntArray187[arg0] = 0;
		this.method1799(8192, arg0);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(ZI)V")
	private synchronized void method1785(@OriginalArg(0) boolean arg0) {
		this.aClass154_1.method3863();
		this.aClass2_Sub39_1 = null;
		this.method1790(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
	private void method1786(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub23 local12 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5795(); local12 != null; local12 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5799()) {
			if ((arg0 < 0 || arg0 == local12.anInt3549) && local12.anInt3564 < 0) {
				this.aClass2_Sub23ArrayArray2[local12.anInt3549][local12.anInt3558] = null;
				local12.anInt3564 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(IIII)V")
	private void method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1772(arg1, 64, arg2);
		if ((this.anIntArray180[arg1] & 0x2) != 0) {
			for (@Pc(35) Class2_Sub23 local35 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5800(); local35 != null; local35 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5798()) {
				if (arg1 == local35.anInt3549 && local35.anInt3564 < 0) {
					this.aClass2_Sub23ArrayArray2[arg1][local35.anInt3558] = null;
					this.aClass2_Sub23ArrayArray2[arg1][arg2] = local35;
					@Pc(70) int local70 = local35.anInt3552 + (local35.anInt3561 * local35.anInt3554 >> 12);
					local35.anInt3552 += arg2 - local35.anInt3558 << 8;
					local35.anInt3558 = arg2;
					local35.anInt3561 = 4096;
					local35.anInt3554 = local70 - local35.anInt3552;
					return;
				}
			}
		}
		@Pc(116) Class2_Sub36 local116 = (Class2_Sub36) this.aClass243_8.method5967((long) this.anIntArray176[arg1]);
		if (local116 == null) {
			return;
		}
		@Pc(124) Class2_Sub20_Sub1 local124 = local116.aClass2_Sub20_Sub1Array1[arg2];
		if (local124 == null) {
			return;
		}
		@Pc(131) Class2_Sub23 local131 = new Class2_Sub23();
		local131.aClass2_Sub36_1 = local116;
		local131.aClass2_Sub20_Sub1_1 = local124;
		local131.anInt3549 = arg1;
		local131.aClass117_1 = local116.aClass117Array1[arg2];
		local131.anInt3567 = local116.aByteArray91[arg2];
		local131.anInt3558 = arg2;
		local131.anInt3553 = local116.aByteArray90[arg2] * arg0 * arg0 * local116.anInt6047 + 1024 >> 11;
		local131.anInt3551 = local116.aByteArray89[arg2] & 0xFF;
		local131.anInt3552 = (arg2 << 8) - (local116.aShortArray112[arg2] & 0x7FFF);
		local131.anInt3562 = 0;
		local131.anInt3564 = -1;
		local131.anInt3556 = 0;
		local131.anInt3563 = 0;
		local131.anInt3559 = 0;
		if (this.anIntArray187[arg1] == 0) {
			local131.aClass2_Sub11_Sub2_1 = Static397.method2992(local124, this.method1789(local131), this.method1774(local131), this.method1773(local131));
		} else {
			local131.aClass2_Sub11_Sub2_1 = Static397.method2992(local124, this.method1789(local131), 0, this.method1773(local131));
			this.method1776(local131, local116.aShortArray112[arg2] < 0);
		}
		if (local116.aShortArray112[arg2] < 0) {
			local131.aClass2_Sub11_Sub2_1.method2991(-1);
		}
		if (local131.anInt3567 >= 0) {
			@Pc(282) Class2_Sub23 local282 = this.aClass2_Sub23ArrayArray1[arg1][local131.anInt3567];
			if (local282 != null && local282.anInt3564 < 0) {
				this.aClass2_Sub23ArrayArray2[arg1][local282.anInt3558] = null;
				local282.anInt3564 = 0;
			}
			this.aClass2_Sub23ArrayArray1[arg1][local131.anInt3567] = local131;
		}
		this.aClass2_Sub11_Sub3_1.aClass238_26.method5796(local131);
		this.aClass2_Sub23ArrayArray2[arg1][arg2] = local131;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)I")
	public int method1788() {
		return this.anInt2232;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!kb;B)I")
	private int method1789(@OriginalArg(0) Class2_Sub23 arg0) {
		@Pc(14) int local14 = (arg0.anInt3554 * arg0.anInt3561 >> 12) + arg0.anInt3552;
		local14 += (this.anIntArray182[arg0.anInt3549] - 8192) * this.anIntArray188[arg0.anInt3549] >> 12;
		@Pc(43) Class117 local43 = arg0.aClass117_1;
		@Pc(60) int local60;
		if (local43.anInt3320 > 0 && (local43.anInt3323 > 0 || this.anIntArray175[arg0.anInt3549] > 0)) {
			local60 = local43.anInt3323 << 2;
			@Pc(65) int local65 = local43.anInt3315 << 1;
			if (arg0.anInt3557 < local65) {
				local60 = local60 * arg0.anInt3557 / local65;
			}
			local60 += this.anIntArray175[arg0.anInt3549] >> 7;
			@Pc(99) double local99 = Math.sin((double) (arg0.anInt3550 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) (local99 * (double) local60);
		}
		local60 = (int) ((double) (arg0.aClass2_Sub20_Sub1_1.anInt3404 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static392.anInt7144 + 0.5D);
		return local60 >= 1 ? local60 : 1;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(ZI)V")
	private void method1790(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method1804(-1);
		} else {
			this.method1786(-1);
		}
		this.method1784(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray176[local23] = this.anIntArray177[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray174[local41] = this.anIntArray177[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(II)V")
	private void method1791(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1772(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method1787(local30, local18, local24);
			} else {
				this.method1772(local18, 64, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1794(local24, local30, local18);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray174[local18] = (this.anIntArray174[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray175[local18] = (this.anIntArray175[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray175[local18] = (this.anIntArray175[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray185[local18] = (this.anIntArray185[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray185[local18] = local30 + (this.anIntArray185[local18] & 0xFFFFFF80);
			}
			if (local24 == 7) {
				this.anIntArray181[local18] = (this.anIntArray181[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray181[local18] = (this.anIntArray181[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 10) {
				this.anIntArray173[local18] = (this.anIntArray173[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray173[local18] = local30 + (this.anIntArray173[local18] & 0xFFFFFF80);
			}
			if (local24 == 11) {
				this.anIntArray186[local18] = (local30 << 7) + (this.anIntArray186[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray186[local18] = (this.anIntArray186[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray180[local18] |= 0x1;
				} else {
					this.anIntArray180[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 >= 64) {
					this.anIntArray180[local18] |= 0x2;
				} else {
					this.method1779(local18);
					this.anIntArray180[local18] &= 0xFFFFFFFD;
				}
			}
			if (local24 == 99) {
				this.anIntArray178[local18] = (this.anIntArray178[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray178[local18] = local30 + (this.anIntArray178[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray178[local18] = (local30 << 7) + (this.anIntArray178[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray178[local18] = local30 + (this.anIntArray178[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1804(local18);
			}
			if (local24 == 121) {
				this.method1784(local18);
			}
			if (local24 == 123) {
				this.method1786(local18);
			}
			@Pc(502) int local502;
			if (local24 == 6) {
				local502 = this.anIntArray178[local18];
				if (local502 == 16384) {
					this.anIntArray188[local18] = (local30 << 7) + (this.anIntArray188[local18] & 0xFFFFC07F);
				}
			}
			if (local24 == 38) {
				local502 = this.anIntArray178[local18];
				if (local502 == 16384) {
					this.anIntArray188[local18] = (this.anIntArray188[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray187[local18] = (this.anIntArray187[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray187[local18] = local30 + (this.anIntArray187[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray180[local18] |= 0x4;
				} else {
					this.method1801(local18);
					this.anIntArray180[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1799((this.anIntArray179[local18] & 0xFFFFC07F) + (local30 << 7), local18);
			}
			if (local24 == 49) {
				this.method1799(local30 + (this.anIntArray179[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1777(this.anIntArray174[local18] + local24, local18);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1782(local18, local24);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + ((arg0 & 0x7F01EF) >> 9);
			this.method1778(local18, local24);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1790(true);
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(II)V")
	public synchronized void method1792(@OriginalArg(1) int arg0) {
		this.anInt2232 = arg0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!pq;IILclient!g;Lclient!u;)Z")
	public synchronized boolean method1793(@OriginalArg(0) Class186 arg0, @OriginalArg(3) Class83 arg1, @OriginalArg(4) Class2_Sub39 arg2) {
		arg2.method5514();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class2_Sub19 local26 = (Class2_Sub19) arg2.aClass243_32.method5975(); local26 != null; local26 = (Class2_Sub19) arg2.aClass243_32.method5973()) {
			@Pc(32) int local32 = (int) local26.aLong213;
			@Pc(42) Class2_Sub36 local42 = (Class2_Sub36) this.aClass243_8.method5967((long) local32);
			if (local42 == null) {
				local42 = Static180.method3304(local32, arg1);
				if (local42 == null) {
					local9 = false;
					continue;
				}
				this.aClass243_8.method5968((long) local32, local42);
			}
			if (!local42.method5291(local20, arg0, local26.aByteArray36)) {
				local9 = false;
			}
		}
		if (local9) {
			arg2.method5516();
		}
		return local9;
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(IIII)V")
	private void method1794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!u;ZZI)V")
	private synchronized void method1795(@OriginalArg(0) Class2_Sub39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method1785(arg2);
		this.aClass154_1.method3869(arg0.aByteArray94);
		this.aLong54 = 0L;
		this.aBoolean165 = arg1;
		@Pc(24) int local24 = this.aClass154_1.method3864();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass154_1.method3867(local26);
			this.aClass154_1.method3860(local26);
			this.aClass154_1.method3868(local26);
		}
		this.anInt2253 = this.aClass154_1.method3859();
		this.anInt2252 = this.aClass154_1.anIntArray316[this.anInt2253];
		this.aLong53 = this.aClass154_1.method3874(this.anInt2252);
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(III)V")
	public synchronized void method1796() {
		this.method1781();
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public synchronized void method1797() {
		for (@Pc(19) Class2_Sub36 local19 = (Class2_Sub36) this.aClass243_8.method5975(); local19 != null; local19 = (Class2_Sub36) this.aClass243_8.method5973()) {
			local19.method5287();
		}
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(BLclient!kb;)Z")
	public boolean method1798(@OriginalArg(1) Class2_Sub23 arg0) {
		if (arg0.aClass2_Sub11_Sub2_1 != null) {
			return false;
		}
		if (arg0.anInt3564 >= 0) {
			arg0.method6130();
			if (arg0.anInt3567 > 0 && arg0 == this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567]) {
				this.aClass2_Sub23ArrayArray1[arg0.anInt3549][arg0.anInt3567] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method4875(@OriginalArg(0) int arg0) {
		if (this.aClass154_1.method3871()) {
			@Pc(18) int local18 = this.anInt2236 * this.aClass154_1.anInt4386 / Static392.anInt7144;
			do {
				@Pc(28) long local28 = this.aLong54 + (long) local18 * (long) arg0;
				if (this.aLong53 - local28 >= 0L) {
					this.aLong54 = local28;
					break;
				}
				@Pc(59) int local59 = (int) ((this.aLong53 + (long) local18 - this.aLong54 - 1L) / (long) local18);
				this.aLong54 += (long) local59 * (long) local18;
				arg0 -= local59;
				this.aClass2_Sub11_Sub3_1.method4875(local59);
				this.method1803();
			} while (this.aClass154_1.method3871());
		}
		this.aClass2_Sub11_Sub3_1.method4875(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4877(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass154_1.method3871()) {
			@Pc(18) int local18 = this.aClass154_1.anInt4386 * this.anInt2236 / Static392.anInt7144;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong54;
				if (this.aLong53 - local27 >= 0L) {
					this.aLong54 = local27;
					break;
				}
				@Pc(55) int local55 = (int) ((this.aLong53 + (long) local18 - this.aLong54 - 1L) / (long) local18);
				this.aLong54 += (long) local55 * (long) local18;
				this.aClass2_Sub11_Sub3_1.method4877(arg0, arg1, local55);
				arg1 += local55;
				arg2 -= local55;
				this.method1803();
			} while (this.aClass154_1.method3871());
		}
		this.aClass2_Sub11_Sub3_1.method4877(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(III)V")
	private void method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray179[arg1] = arg0;
		this.anIntArray183[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(B)V")
	public synchronized void method1800() {
		this.method1785(true);
	}

	@OriginalMember(owner = "client!fi", name = "e", descriptor = "(II)V")
	private void method1801(@OriginalArg(0) int arg0) {
		if ((this.anIntArray180[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub23 local18 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5795(); local18 != null; local18 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5799()) {
			if (arg0 == local18.anInt3549) {
				local18.anInt3568 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!u;Z)V")
	public synchronized void method1802(@OriginalArg(1) Class2_Sub39 arg0, @OriginalArg(2) boolean arg1) {
		this.method1795(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V")
	private void method1803() {
		@Pc(8) int local8 = this.anInt2253;
		@Pc(11) int local11 = this.anInt2252;
		@Pc(14) long local14 = this.aLong53;
		if (this.aClass2_Sub39_1 != null && local11 == this.anInt2255) {
			this.method1795(this.aClass2_Sub39_1, this.aBoolean165, this.aBoolean166);
			this.method1803();
			return;
		}
		while (this.anInt2252 == local11) {
			while (local11 == this.aClass154_1.anIntArray316[local8]) {
				this.aClass154_1.method3867(local8);
				@Pc(47) int local47 = this.aClass154_1.method3865(local8);
				if (local47 == 1) {
					this.aClass154_1.method3873();
					this.aClass154_1.method3868(local8);
					if (this.aClass154_1.method3870()) {
						if (this.aClass2_Sub39_1 != null) {
							this.method1802(this.aClass2_Sub39_1, this.aBoolean165);
							this.method1803();
							return;
						}
						if (!this.aBoolean165 || local11 == 0) {
							this.method1790(true);
							this.aClass154_1.method3863();
							return;
						}
						this.aClass154_1.method3862(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1791(local47);
				}
				this.aClass154_1.method3860(local8);
				this.aClass154_1.method3868(local8);
			}
			local8 = this.aClass154_1.method3859();
			local11 = this.aClass154_1.anIntArray316[local8];
			local14 = this.aClass154_1.method3874(local11);
		}
		this.anInt2252 = local11;
		this.aLong53 = local14;
		this.anInt2253 = local8;
		if (this.aClass2_Sub39_1 != null && this.anInt2255 < local11) {
			this.anInt2252 = this.anInt2255;
			this.anInt2253 = -1;
			this.aLong53 = this.aClass154_1.method3874(this.anInt2252);
		}
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "()I")
	@Override
	public synchronized int method4876() {
		return 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
	private void method1804(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub23 local8 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5795(); local8 != null; local8 = (Class2_Sub23) this.aClass2_Sub11_Sub3_1.aClass238_26.method5799()) {
			if (arg0 < 0 || local8.anInt3549 == arg0) {
				if (local8.aClass2_Sub11_Sub2_1 != null) {
					local8.aClass2_Sub11_Sub2_1.method3018(Static392.anInt7144 / 100);
					if (local8.aClass2_Sub11_Sub2_1.method3019()) {
						this.aClass2_Sub11_Sub3_1.aClass2_Sub11_Sub4_2.method4878(local8.aClass2_Sub11_Sub2_1);
					}
					local8.method3093();
				}
				if (local8.anInt3564 < 0) {
					this.aClass2_Sub23ArrayArray2[local8.anInt3549][local8.anInt3558] = null;
				}
				local8.method6130();
			}
		}
	}
}
