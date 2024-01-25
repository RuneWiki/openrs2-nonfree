import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fn", name = "Ab", descriptor = "I")
	private int anInt2413;

	@OriginalMember(owner = "client!fn", name = "Bb", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!fn", name = "Cb", descriptor = "Z")
	private boolean aBoolean168;

	@OriginalMember(owner = "client!fn", name = "Db", descriptor = "I")
	private int anInt2414;

	@OriginalMember(owner = "client!fn", name = "Fb", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!fn", name = "Hb", descriptor = "Lclient!mca;")
	private Class2_Sub31 aClass2_Sub31_1;

	@OriginalMember(owner = "client!fn", name = "Ib", descriptor = "I")
	private int anInt2416;

	@OriginalMember(owner = "client!fn", name = "Jb", descriptor = "Z")
	private boolean aBoolean169;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "[I")
	private final int[] anIntArray191 = new int[16];

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "[I")
	private final int[] anIntArray194 = new int[16];

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "[I")
	private final int[] anIntArray193 = new int[16];

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "[I")
	private final int[] anIntArray197 = new int[16];

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "[I")
	private final int[] anIntArray195 = new int[16];

	@OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
	private final int anInt2378 = 1000000;

	@OriginalMember(owner = "client!fn", name = "L", descriptor = "[I")
	public final int[] anIntArray198 = new int[16];

	@OriginalMember(owner = "client!fn", name = "Y", descriptor = "[I")
	private final int[] anIntArray200 = new int[16];

	@OriginalMember(owner = "client!fn", name = "X", descriptor = "[I")
	private final int[] anIntArray199 = new int[16];

	@OriginalMember(owner = "client!fn", name = "Z", descriptor = "[I")
	public final int[] anIntArray201 = new int[16];

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "[I")
	private final int[] anIntArray196 = new int[16];

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "[I")
	private final int[] anIntArray192 = new int[16];

	@OriginalMember(owner = "client!fn", name = "nb", descriptor = "[I")
	private final int[] anIntArray203 = new int[16];

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private int anInt2368 = 256;

	@OriginalMember(owner = "client!fn", name = "rb", descriptor = "[[Lclient!uf;")
	private final Class2_Sub47[][] aClass2_Sub47ArrayArray1 = new Class2_Sub47[16][128];

	@OriginalMember(owner = "client!fn", name = "sb", descriptor = "[I")
	private final int[] anIntArray204 = new int[16];

	@OriginalMember(owner = "client!fn", name = "wb", descriptor = "[I")
	private final int[] anIntArray206 = new int[16];

	@OriginalMember(owner = "client!fn", name = "ab", descriptor = "[I")
	private final int[] anIntArray202 = new int[16];

	@OriginalMember(owner = "client!fn", name = "lb", descriptor = "[[Lclient!uf;")
	private final Class2_Sub47[][] lb = new Class2_Sub47[16][128];

	@OriginalMember(owner = "client!fn", name = "tb", descriptor = "[I")
	public final int[] anIntArray205 = new int[16];

	@OriginalMember(owner = "client!fn", name = "vb", descriptor = "Lclient!ld;")
	private final Class203 aClass203_1 = new Class203();

	@OriginalMember(owner = "client!fn", name = "Gb", descriptor = "Lclient!bg;")
	private final Class2_Sub3_Sub1 aClass2_Sub3_Sub1_1 = new Class2_Sub3_Sub1(this);

	@OriginalMember(owner = "client!fn", name = "M", descriptor = "Lclient!efa;")
	private final Class90 aClass90_7;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub2() {
		this.aClass90_7 = new Class90(128);
		this.method2048(256, -1);
		this.method2042(true);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!fn;)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class2_Sub3_Sub2 arg0) {
		this.aClass90_7 = arg0.aClass90_7;
		this.method2048(256, -1);
		this.method2042(true);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)V")
	private void method2036() {
		this.anIntArray204[9] = 128;
		this.anIntArray192[9] = 128;
		this.method2065(128, 9);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(III)V")
	private void method2037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray196[arg1] = arg0;
		this.anIntArray205[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BIILclient!uf;[I)Z")
	public boolean method2038(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub47 arg2, @OriginalArg(4) int[] arg3) {
		arg2.anInt8822 = Static591.anInt9580 / 100;
		if (arg2.anInt8813 >= 0 && (arg2.aClass2_Sub3_Sub3_4 == null || arg2.aClass2_Sub3_Sub3_4.method4322())) {
			arg2.method7027();
			arg2.method7657();
			if (arg2.anInt8815 > 0 && this.aClass2_Sub47ArrayArray1[arg2.anInt8818][arg2.anInt8815] == arg2) {
				this.aClass2_Sub47ArrayArray1[arg2.anInt8818][arg2.anInt8815] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt8814;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray203[arg2.anInt8818] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt8814 = local56;
		}
		arg2.aClass2_Sub3_Sub3_4.method4296(this.method2055(arg2));
		@Pc(96) Class69 local96 = arg2.aClass69_1;
		arg2.anInt8808++;
		arg2.anInt8826 += local96.anInt1439;
		@Pc(111) boolean local111 = false;
		@Pc(130) double local130 = (double) ((arg2.anInt8825 - 60 << 8) + (arg2.anInt8816 * arg2.anInt8814 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt1432 > 0) {
			if (local96.anInt1440 > 0) {
				arg2.anInt8823 += (int) (Math.pow(2.0D, (double) local96.anInt1440 * local130) * 128.0D + 0.5D);
			} else {
				arg2.anInt8823 += 128;
			}
			if (arg2.anInt8823 * local96.anInt1432 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray28 != null) {
			if (local96.anInt1431 > 0) {
				arg2.anInt8811 += (int) (Math.pow(2.0D, (double) local96.anInt1431 * local130) * 128.0D + 0.5D);
			} else {
				arg2.anInt8811 += 128;
			}
			while (arg2.anInt8817 < local96.aByteArray28.length - 2 && (local96.aByteArray28[arg2.anInt8817 + 2] & 0xFF) << 8 < arg2.anInt8811) {
				arg2.anInt8817 += 2;
			}
			if (arg2.anInt8817 == local96.aByteArray28.length - 2 && local96.aByteArray28[arg2.anInt8817 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt8813 >= 0 && local96.aByteArray27 != null && (this.anIntArray201[arg2.anInt8818] & 0x1) == 0 && (arg2.anInt8815 < 0 || arg2 != this.aClass2_Sub47ArrayArray1[arg2.anInt8818][arg2.anInt8815])) {
			if (local96.anInt1429 <= 0) {
				arg2.anInt8813 += 128;
			} else {
				arg2.anInt8813 += (int) (Math.pow(2.0D, local130 * (double) local96.anInt1429) * 128.0D + 0.5D);
			}
			while (arg2.anInt8809 < local96.aByteArray27.length - 2 && (local96.aByteArray27[arg2.anInt8809 + 2] & 0xFF) << 8 < arg2.anInt8813) {
				arg2.anInt8809 += 2;
			}
			if (arg2.anInt8809 == local96.aByteArray27.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass2_Sub3_Sub3_4.method4292(arg2.anInt8822, this.method2052(arg2), this.method2074(arg2));
			return false;
		}
		arg2.aClass2_Sub3_Sub3_4.method4306(arg2.anInt8822);
		if (arg3 == null) {
			arg2.aClass2_Sub3_Sub3_4.method6700(arg0);
		} else {
			arg2.aClass2_Sub3_Sub3_4.method6697(arg3, arg1, arg0);
		}
		if (arg2.aClass2_Sub3_Sub3_4.method4300()) {
			this.aClass2_Sub3_Sub1_1.aClass2_Sub3_Sub4_1.method6706(arg2.aClass2_Sub3_Sub3_4);
		}
		arg2.method7027();
		if (arg2.anInt8813 >= 0) {
			arg2.method7657();
			if (arg2.anInt8815 > 0 && this.aClass2_Sub47ArrayArray1[arg2.anInt8818][arg2.anInt8815] == arg2) {
				this.aClass2_Sub47ArrayArray1[arg2.anInt8818][arg2.anInt8815] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIII)V")
	private void method2039(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub47 local12 = this.lb[arg1][arg2];
		if (local12 == null) {
			return;
		}
		this.lb[arg1][arg2] = null;
		if ((this.anIntArray201[arg1] & 0x2) == 0) {
			local12.anInt8813 = 0;
			return;
		}
		for (@Pc(46) Class2_Sub47 local46 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1264(); local46 != null; local46 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1261()) {
			if (local12.anInt8818 == local46.anInt8818 && local46.anInt8813 < 0 && local46 != local12) {
				local12.anInt8813 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIZI)V")
	private void method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!mca;Lclient!mv;BLclient!ne;)Z")
	public synchronized boolean method2041(@OriginalArg(1) Class2_Sub31 arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(4) Class234 arg2) {
		arg0.method4676();
		@Pc(9) boolean local9 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub9 local34 = (Class2_Sub9) arg0.aClass90_15.method1676(); local34 != null; local34 = (Class2_Sub9) arg0.aClass90_15.method1680()) {
			@Pc(40) int local40 = (int) local34.aLong268;
			@Pc(48) Class2_Sub48 local48 = (Class2_Sub48) this.aClass90_7.method1685((long) local40);
			if (local48 == null) {
				local48 = Static579.method7521(local40, arg1);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass90_7.method1684(local48, (long) local40);
			}
			if (!local48.method7176(local34.aByteArray20, arg2, local28)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.method4677();
		}
		return local9;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZZ)V")
	private void method2042(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method2045(-1);
		} else {
			this.method2058(-1);
		}
		this.method2060(-1);
		for (@Pc(29) int local29 = 0; local29 < 16; local29++) {
			this.anIntArray200[local29] = this.anIntArray204[local29];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray192[local47] = this.anIntArray204[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "()Lclient!ac;")
	@Override
	public synchronized Class2_Sub3 method6703() {
		return null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZLclient!uf;)V")
	public void method2043(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub47 arg1) {
		@Pc(14) int local14 = arg1.aClass2_Sub13_Sub1_4.aByteArray101.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass2_Sub13_Sub1_4.aBoolean801) {
			@Pc(43) int local43 = local14 + local14 - arg1.aClass2_Sub13_Sub1_4.anInt9544;
			local33 = (int) ((long) this.anIntArray198[arg1.anInt8818] * (long) local43 >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				arg1.aClass2_Sub3_Sub3_4.method4298();
				local33 = local14 + local14 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray198[arg1.anInt8818] * (long) local14 >> 6);
		}
		arg1.aClass2_Sub3_Sub3_4.method4317(local33);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V")
	private void method2045(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub47 local12 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1264(); local12 != null; local12 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1261()) {
			if (arg0 < 0 || arg0 == local12.anInt8818) {
				if (local12.aClass2_Sub3_Sub3_4 != null) {
					local12.aClass2_Sub3_Sub3_4.method4306(Static591.anInt9580 / 100);
					if (local12.aClass2_Sub3_Sub3_4.method4300()) {
						this.aClass2_Sub3_Sub1_1.aClass2_Sub3_Sub4_1.method6706(local12.aClass2_Sub3_Sub3_4);
					}
					local12.method7027();
				}
				if (local12.anInt8813 < 0) {
					this.lb[local12.anInt8818][local12.anInt8825] = null;
				}
				local12.method7657();
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V")
	private synchronized void method2046(@OriginalArg(0) boolean arg0) {
		this.aClass203_1.method4334();
		this.aClass2_Sub31_1 = null;
		this.method2042(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(III)V")
	public synchronized void method2047() {
		this.method2036();
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(III)V")
	public synchronized void method2048(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0) {
			this.anIntArray202[arg1] = arg0;
		} else {
			for (@Pc(22) int local22 = 0; local22 < 16; local22++) {
				this.anIntArray202[local22] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(IIII)V")
	private void method2049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method2039(64, arg0, arg2);
		if ((this.anIntArray201[arg0] & 0x2) != 0) {
			for (@Pc(30) Class2_Sub47 local30 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1266(); local30 != null; local30 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1271()) {
				if (arg0 == local30.anInt8818 && local30.anInt8813 < 0) {
					this.lb[arg0][local30.anInt8825] = null;
					this.lb[arg0][arg2] = local30;
					@Pc(65) int local65 = local30.anInt8810 + (local30.anInt8816 * local30.anInt8814 >> 12);
					local30.anInt8810 += arg2 - local30.anInt8825 << 8;
					local30.anInt8816 = local65 - local30.anInt8810;
					local30.anInt8825 = arg2;
					local30.anInt8814 = 4096;
					return;
				}
			}
		}
		@Pc(111) Class2_Sub48 local111 = (Class2_Sub48) this.aClass90_7.method1685((long) this.anIntArray200[arg0]);
		if (local111 == null) {
			return;
		}
		@Pc(119) Class2_Sub13_Sub1 local119 = local111.aClass2_Sub13_Sub1Array1[arg2];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class2_Sub47 local126 = new Class2_Sub47();
		local126.aClass2_Sub13_Sub1_4 = local119;
		local126.anInt8818 = arg0;
		local126.aClass2_Sub48_1 = local111;
		local126.aClass69_1 = local111.aClass69Array1[arg2];
		local126.anInt8815 = local111.aByteArray97[arg2];
		local126.anInt8825 = arg2;
		local126.anInt8821 = local111.anInt9004 * arg1 * arg1 * local111.aByteArray99[arg2] + 1024 >> 11;
		local126.anInt8812 = local111.aByteArray98[arg2] & 0xFF;
		local126.anInt8810 = (arg2 << 8) - (local111.aShortArray133[arg2] & 0x7FFF);
		local126.anInt8823 = 0;
		local126.anInt8811 = 0;
		local126.anInt8817 = 0;
		local126.anInt8809 = 0;
		local126.anInt8813 = -1;
		if (this.anIntArray198[arg0] == 0) {
			local126.aClass2_Sub3_Sub3_4 = Static599.method4313(local119, this.method2055(local126), this.method2052(local126), this.method2074(local126));
		} else {
			local126.aClass2_Sub3_Sub3_4 = Static599.method4313(local119, this.method2055(local126), 0, this.method2074(local126));
			this.method2043(local111.aShortArray133[arg2] < 0, local126);
		}
		if (local111.aShortArray133[arg2] < 0) {
			local126.aClass2_Sub3_Sub3_4.method4331(-1);
		}
		if (local126.anInt8815 >= 0) {
			@Pc(279) Class2_Sub47 local279 = this.aClass2_Sub47ArrayArray1[arg0][local126.anInt8815];
			if (local279 != null && local279.anInt8813 < 0) {
				this.lb[arg0][local279.anInt8825] = null;
				local279.anInt8813 = 0;
			}
			this.aClass2_Sub47ArrayArray1[arg0][local126.anInt8815] = local126;
		}
		this.aClass2_Sub3_Sub1_1.aClass70_2.method1269(local126);
		this.lb[arg0][arg2] = local126;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z")
	public synchronized boolean method2050() {
		return this.aClass203_1.method4340();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!mca;ZZB)V")
	private synchronized void method2051(@OriginalArg(0) Class2_Sub31 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method2046(arg2);
		this.aClass203_1.method4341(arg0.aByteArray55);
		this.aBoolean168 = arg1;
		this.aLong58 = 0L;
		@Pc(32) int local32 = this.aClass203_1.method4337();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			this.aClass203_1.method4342(local34);
			this.aClass203_1.method4332(local34);
			this.aClass203_1.method4338(local34);
		}
		this.anInt2414 = this.aClass203_1.method4345();
		this.anInt2413 = this.aClass203_1.anIntArray343[this.anInt2414];
		this.aLong59 = this.aClass203_1.method4344(this.anInt2413);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLclient!uf;)I")
	private int method2052(@OriginalArg(1) Class2_Sub47 arg0) {
		if (this.anIntArray202[arg0.anInt8818] == 0) {
			return 0;
		}
		@Pc(22) Class69 local22 = arg0.aClass69_1;
		@Pc(38) int local38 = this.anIntArray195[arg0.anInt8818] * this.anIntArray199[arg0.anInt8818] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = local46 * arg0.anInt8821 + 16384 >> 15;
		@Pc(64) int local64 = local55 * this.anInt2368 + 128 >> 8;
		local38 = local64 * this.anIntArray202[arg0.anInt8818] + 128 >> 8;
		if (local22.anInt1432 > 0) {
			local38 = (int) (Math.pow(0.5D, (double) arg0.anInt8823 * 1.953125E-5D * (double) local22.anInt1432) * (double) local38 + 0.5D);
		}
		@Pc(106) int local106;
		@Pc(114) int local114;
		@Pc(132) int local132;
		@Pc(144) int local144;
		if (local22.aByteArray28 != null) {
			local106 = arg0.anInt8811;
			local114 = local22.aByteArray28[arg0.anInt8817 + 1];
			if (arg0.anInt8817 < local22.aByteArray28.length - 2) {
				local132 = (local22.aByteArray28[arg0.anInt8817] & 0xFF) << 8;
				local144 = (local22.aByteArray28[arg0.anInt8817 + 2] & 0xFF) << 8;
				local114 += (local22.aByteArray28[arg0.anInt8817 + 3] - local114) * (local106 - local132) / (local144 - local132);
			}
			local38 = local38 * local114 + 32 >> 6;
		}
		if (arg0.anInt8813 > 0 && local22.aByteArray27 != null) {
			local106 = arg0.anInt8813;
			local114 = local22.aByteArray27[arg0.anInt8809 + 1];
			if (arg0.anInt8809 < local22.aByteArray27.length - 2) {
				local132 = (local22.aByteArray27[arg0.anInt8809] & 0xFF) << 8;
				local144 = (local22.aByteArray27[arg0.anInt8809 + 2] & 0xFF) << 8;
				local114 += (local22.aByteArray27[arg0.anInt8809 + 3] - local114) * (local106 - local132) / (local144 - local132);
			}
			local38 = local114 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	public synchronized void method2053() {
		for (@Pc(18) Class2_Sub48 local18 = (Class2_Sub48) this.aClass90_7.method1676(); local18 != null; local18 = (Class2_Sub48) this.aClass90_7.method1680()) {
			local18.method7171();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZZBLclient!mca;J)V")
	public synchronized void method2054(@OriginalArg(0) boolean arg0, @OriginalArg(3) Class2_Sub31 arg1, @OriginalArg(4) long arg2) {
		this.method2051(arg1, arg0, true);
		this.method2071((long) this.aClass203_1.anInt5013 * arg2);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!uf;)I")
	private int method2055(@OriginalArg(1) Class2_Sub47 arg0) {
		@Pc(20) int local20 = (arg0.anInt8816 * arg0.anInt8814 >> 12) + arg0.anInt8810;
		local20 += (this.anIntArray197[arg0.anInt8818] - 8192) * this.anIntArray206[arg0.anInt8818] >> 12;
		@Pc(41) Class69 local41 = arg0.aClass69_1;
		@Pc(64) int local64;
		if (local41.anInt1439 > 0 && (local41.anInt1433 > 0 || this.anIntArray191[arg0.anInt8818] > 0)) {
			local64 = local41.anInt1433 << 2;
			@Pc(69) int local69 = local41.anInt1437 << 1;
			if (local69 > arg0.anInt8808) {
				local64 = local64 * arg0.anInt8808 / local69;
			}
			local64 += this.anIntArray191[arg0.anInt8818] >> 7;
			@Pc(103) double local103 = Math.sin((double) (arg0.anInt8826 & 0x1FF) * 0.01227184630308513D);
			local20 += (int) ((double) local64 * local103);
		}
		local64 = (int) ((double) (arg0.aClass2_Sub13_Sub1_4.anInt9545 * 256) * Math.pow(2.0D, (double) local20 * 3.255208333333333E-4D) / (double) Static591.anInt9580 + 0.5D);
		return local64 >= 1 ? local64 : 1;
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	public synchronized void method2057() {
		this.method2046(true);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "()I")
	@Override
	public synchronized int method6699() {
		return 0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V")
	private void method2058(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class2_Sub47 local12 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1264(); local12 != null; local12 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1261()) {
			if ((arg0 < 0 || local12.anInt8818 == arg0) && local12.anInt8813 < 0) {
				this.lb[local12.anInt8818][local12.anInt8825] = null;
				local12.anInt8813 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6697(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass203_1.method4340()) {
			@Pc(14) int local14 = this.aClass203_1.anInt5013 * this.anInt2378 / Static591.anInt9580;
			do {
				@Pc(23) long local23 = this.aLong58 + (long) local14 * (long) arg2;
				if (this.aLong59 - local23 >= 0L) {
					this.aLong58 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong59 - this.aLong58 - 1L) / (long) local14);
				this.aLong58 += (long) local54 * (long) local14;
				this.aClass2_Sub3_Sub1_1.method6697(arg0, arg1, local54);
				this.method2067();
				arg1 += local54;
				arg2 -= local54;
			} while (this.aClass203_1.method4340());
		}
		this.aClass2_Sub3_Sub1_1.method6697(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(IB)V")
	public synchronized void method2059(@OriginalArg(0) int arg0) {
		this.anInt2368 = arg0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZ)V")
	private void method2060(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method2060(local12);
			}
			return;
		}
		this.anIntArray199[arg0] = 12800;
		this.anIntArray193[arg0] = 8192;
		this.anIntArray195[arg0] = 16383;
		this.anIntArray197[arg0] = 8192;
		this.anIntArray191[arg0] = 0;
		this.anIntArray203[arg0] = 8192;
		this.method2062(arg0);
		this.method2063(arg0);
		this.anIntArray201[arg0] = 0;
		this.anIntArray194[arg0] = 32767;
		this.anIntArray206[arg0] = 256;
		this.anIntArray198[arg0] = 0;
		this.method2037(8192, arg0);
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(III)V")
	private void method2061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)V")
	private void method2062(@OriginalArg(1) int arg0) {
		if ((this.anIntArray201[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub47 local24 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1264(); local24 != null; local24 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1261()) {
			if (arg0 == local24.anInt8818 && this.lb[arg0][local24.anInt8825] == null && local24.anInt8813 < 0) {
				local24.anInt8813 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(BI)V")
	private void method2063(@OriginalArg(1) int arg0) {
		if ((this.anIntArray201[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(24) Class2_Sub47 local24 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1264(); local24 != null; local24 = (Class2_Sub47) this.aClass2_Sub3_Sub1_1.aClass70_2.method1261()) {
			if (local24.anInt8818 == arg0) {
				local24.anInt8819 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(III)V")
	private void method2064(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray197[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "(III)V")
	private void method2065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray200[arg1] != arg0) {
			this.anIntArray200[arg1] = arg0;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass2_Sub47ArrayArray1[arg1][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)I")
	public int method2066() {
		return this.anInt2368;
	}

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "(B)V")
	private void method2067() {
		@Pc(14) int local14 = this.anInt2414;
		@Pc(17) int local17 = this.anInt2413;
		@Pc(20) long local20 = this.aLong59;
		if (this.aClass2_Sub31_1 != null && this.anInt2416 == local17) {
			this.method2051(this.aClass2_Sub31_1, this.aBoolean168, this.aBoolean169);
			this.method2067();
			return;
		}
		while (local17 == this.anInt2413) {
			while (local17 == this.aClass203_1.anIntArray343[local14]) {
				this.aClass203_1.method4342(local14);
				@Pc(53) int local53 = this.aClass203_1.method4343(local14);
				if (local53 == 1) {
					this.aClass203_1.method4335();
					this.aClass203_1.method4338(local14);
					if (this.aClass203_1.method4336()) {
						if (this.aClass2_Sub31_1 != null) {
							this.method2069(this.aBoolean168, this.aClass2_Sub31_1);
							this.method2067();
							return;
						}
						if (!this.aBoolean168 || local17 == 0) {
							this.method2042(true);
							this.aClass203_1.method4334();
							return;
						}
						this.aClass203_1.method4347(local20);
					}
					break;
				}
				if ((local53 & 0x80) != 0) {
					this.method2073(local53);
				}
				this.aClass203_1.method4332(local14);
				this.aClass203_1.method4338(local14);
			}
			local14 = this.aClass203_1.method4345();
			local17 = this.aClass203_1.anIntArray343[local14];
			local20 = this.aClass203_1.method4344(local17);
		}
		this.anInt2413 = local17;
		this.anInt2414 = local14;
		this.aLong59 = local20;
		if (this.aClass2_Sub31_1 != null && this.anInt2416 < local17) {
			this.anInt2413 = this.anInt2416;
			this.anInt2414 = -1;
			this.aLong59 = this.aClass203_1.method4344(this.anInt2413);
		}
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	public synchronized void method2068() {
		for (@Pc(7) Class2_Sub48 local7 = (Class2_Sub48) this.aClass90_7.method1676(); local7 != null; local7 = (Class2_Sub48) this.aClass90_7.method1680()) {
			local7.method7657();
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZLclient!mca;I)V")
	public synchronized void method2069(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub31 arg1) {
		this.method2051(arg1, arg0, true);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "()Lclient!ac;")
	@Override
	public synchronized Class2_Sub3 method6701() {
		return this.aClass2_Sub3_Sub1_1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IJ)V")
	private void method2071(@OriginalArg(1) long arg0) {
		while (this.aLong59 <= arg0) {
			@Pc(15) int local15 = this.anInt2414;
			@Pc(18) int local18 = this.anInt2413;
			@Pc(21) long local21 = this.aLong59;
			while (this.anInt2413 == local18) {
				while (local18 == this.aClass203_1.anIntArray343[local15]) {
					this.aClass203_1.method4342(local15);
					@Pc(32) int local32 = this.aClass203_1.method4343(local15);
					if (local32 == 1) {
						this.aClass203_1.method4335();
						this.aClass203_1.method4338(local15);
						if (this.aClass203_1.method4336()) {
							if (!this.aBoolean168 || local18 == 0) {
								this.method2042(true);
								this.aClass203_1.method4334();
								return;
							}
							this.aClass203_1.method4347(local21);
						}
						break;
					}
					if ((local32 & 0x80) != 0 && (local32 & 0xF0) != 144) {
						this.method2073(local32);
					}
					this.aClass203_1.method4332(local15);
					this.aClass203_1.method4338(local15);
				}
				this.aLong58 = local21;
				local15 = this.aClass203_1.method4345();
				local18 = this.aClass203_1.anIntArray343[local15];
				local21 = this.aClass203_1.method4344(local18);
			}
			this.aLong59 = local21;
			this.anInt2413 = local18;
			this.anInt2414 = local15;
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(ILclient!uf;)Z")
	public boolean method2072(@OriginalArg(1) Class2_Sub47 arg0) {
		if (arg0.aClass2_Sub3_Sub3_4 != null) {
			return false;
		}
		if (arg0.anInt8813 >= 0) {
			arg0.method7657();
			if (arg0.anInt8815 > 0 && this.aClass2_Sub47ArrayArray1[arg0.anInt8818][arg0.anInt8815] == arg0) {
				this.aClass2_Sub47ArrayArray1[arg0.anInt8818][arg0.anInt8815] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6700(@OriginalArg(0) int arg0) {
		if (this.aClass203_1.method4340()) {
			@Pc(18) int local18 = this.anInt2378 * this.aClass203_1.anInt5013 / Static591.anInt9580;
			do {
				@Pc(27) long local27 = this.aLong58 + (long) arg0 * (long) local18;
				if (this.aLong59 - local27 >= 0L) {
					this.aLong58 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong59 - this.aLong58 - 1L) / (long) local18);
				this.aLong58 += (long) local18 * (long) local56;
				this.aClass2_Sub3_Sub1_1.method6700(local56);
				arg0 -= local56;
				this.method2067();
			} while (this.aClass203_1.method4340());
		}
		this.aClass2_Sub3_Sub1_1.method6700(arg0);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(IB)V")
	private void method2073(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = arg0 & 0xF0;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(38) int local38;
		if (local17 == 128) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			this.method2039(local38, local26, local32);
		} else if (local17 == 144) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			if (local38 <= 0) {
				this.method2039(64, local26, local32);
			} else {
				this.method2049(local26, local38, local32);
			}
		} else if (local17 == 160) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			this.method2040(local32, local38, local26);
		} else if (local17 == 176) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			local38 = arg0 >> 16 & 0x7F;
			if (local32 == 0) {
				this.anIntArray192[local26] = (local38 << 14) + (this.anIntArray192[local26] & 0xFFE03FFF);
			}
			if (local32 == 32) {
				this.anIntArray192[local26] = (local38 << 7) + (this.anIntArray192[local26] & 0xFFFFC07F);
			}
			if (local32 == 1) {
				this.anIntArray191[local26] = (local38 << 7) + (this.anIntArray191[local26] & 0xFFFFC07F);
			}
			if (local32 == 33) {
				this.anIntArray191[local26] = local38 + (this.anIntArray191[local26] & 0xFFFFFF80);
			}
			if (local32 == 5) {
				this.anIntArray203[local26] = (local38 << 7) + (this.anIntArray203[local26] & 0xFFFFC07F);
			}
			if (local32 == 37) {
				this.anIntArray203[local26] = (this.anIntArray203[local26] & 0xFFFFFF80) + local38;
			}
			if (local32 == 7) {
				this.anIntArray199[local26] = (local38 << 7) + (this.anIntArray199[local26] & 0xFFFFC07F);
			}
			if (local32 == 39) {
				this.anIntArray199[local26] = local38 + (this.anIntArray199[local26] & 0xFFFFFF80);
			}
			if (local32 == 10) {
				this.anIntArray193[local26] = (local38 << 7) + (this.anIntArray193[local26] & 0xFFFFC07F);
			}
			if (local32 == 42) {
				this.anIntArray193[local26] = local38 + (this.anIntArray193[local26] & 0xFFFFFF80);
			}
			if (local32 == 11) {
				this.anIntArray195[local26] = (this.anIntArray195[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 43) {
				this.anIntArray195[local26] = local38 + (this.anIntArray195[local26] & 0xFFFFFF80);
			}
			if (local32 == 64) {
				if (local38 >= 64) {
					this.anIntArray201[local26] |= 0x1;
				} else {
					this.anIntArray201[local26] &= 0xFFFFFFFE;
				}
			}
			if (local32 == 65) {
				if (local38 >= 64) {
					this.anIntArray201[local26] |= 0x2;
				} else {
					this.method2062(local26);
					this.anIntArray201[local26] &= 0xFFFFFFFD;
				}
			}
			if (local32 == 99) {
				this.anIntArray194[local26] = (this.anIntArray194[local26] & 0x7F) + (local38 << 7);
			}
			if (local32 == 98) {
				this.anIntArray194[local26] = local38 + (this.anIntArray194[local26] & 0x3F80);
			}
			if (local32 == 101) {
				this.anIntArray194[local26] = (this.anIntArray194[local26] & 0x7F) + (local38 << 7) + 16384;
			}
			if (local32 == 100) {
				this.anIntArray194[local26] = (this.anIntArray194[local26] & 0x3F80) + (local38 + 16384);
			}
			if (local32 == 120) {
				this.method2045(local26);
			}
			if (local32 == 121) {
				this.method2060(local26);
			}
			if (local32 == 123) {
				this.method2058(local26);
			}
			@Pc(501) int local501;
			if (local32 == 6) {
				local501 = this.anIntArray194[local26];
				if (local501 == 16384) {
					this.anIntArray206[local26] = (local38 << 7) + (this.anIntArray206[local26] & 0xFFFFC07F);
				}
			}
			if (local32 == 38) {
				local501 = this.anIntArray194[local26];
				if (local501 == 16384) {
					this.anIntArray206[local26] = (this.anIntArray206[local26] & 0xFFFFFF80) + local38;
				}
			}
			if (local32 == 16) {
				this.anIntArray198[local26] = (this.anIntArray198[local26] & 0xFFFFC07F) + (local38 << 7);
			}
			if (local32 == 48) {
				this.anIntArray198[local26] = (this.anIntArray198[local26] & 0xFFFFFF80) + local38;
			}
			if (local32 == 81) {
				if (local38 < 64) {
					this.method2063(local26);
					this.anIntArray201[local26] &= 0xFFFFFFFB;
				} else {
					this.anIntArray201[local26] |= 0x4;
				}
			}
			if (local32 == 17) {
				this.method2037((this.anIntArray196[local26] & 0xFFFFC07F) + (local38 << 7), local26);
			}
			if (local32 == 49) {
				this.method2037((this.anIntArray196[local26] & 0xFFFFFF80) + local38, local26);
			}
		} else if (local17 == 192) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			this.method2065(local32 + this.anIntArray192[local26], local26);
		} else if (local17 == 208) {
			local26 = arg0 & 0xF;
			local32 = arg0 >> 8 & 0x7F;
			this.method2061(local26, local32);
		} else if (local17 == 224) {
			local26 = arg0 & 0xF;
			local32 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method2064(local26, local32);
		} else {
			local17 = arg0 & 0xFF;
			if (local17 == 255) {
				this.method2042(true);
			}
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!uf;B)I")
	private int method2074(@OriginalArg(0) Class2_Sub47 arg0) {
		@Pc(14) int local14 = this.anIntArray193[arg0.anInt8818];
		return local14 >= 8192 ? 16384 - ((16384 - local14) * (-arg0.anInt8812 + 128) + 32 >> 6) : local14 * arg0.anInt8812 + 32 >> 6;
	}
}
