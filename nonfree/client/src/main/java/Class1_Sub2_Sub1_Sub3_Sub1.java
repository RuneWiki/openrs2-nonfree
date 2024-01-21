import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub2_Sub1_Sub3_Sub1 extends Class1_Sub2_Sub1_Sub3 {

	@OriginalMember(owner = "client!gh", name = "kc", descriptor = "I")
	public int anInt1520;

	@OriginalMember(owner = "client!gh", name = "lc", descriptor = "Lclient!wc;")
	public Class90 aClass90_2;

	@OriginalMember(owner = "client!gh", name = "nc", descriptor = "I")
	public int anInt1522;

	@OriginalMember(owner = "client!gh", name = "qc", descriptor = "I")
	public int anInt1524;

	@OriginalMember(owner = "client!gh", name = "Dc", descriptor = "I")
	public int anInt1533;

	@OriginalMember(owner = "client!gh", name = "Fc", descriptor = "Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 aClass1_Sub2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!gh", name = "Gc", descriptor = "I")
	public int anInt1535;

	@OriginalMember(owner = "client!gh", name = "Hc", descriptor = "I")
	public int anInt1536;

	@OriginalMember(owner = "client!gh", name = "Jc", descriptor = "Lclient!tg;")
	public Class81 aClass81_518;

	@OriginalMember(owner = "client!gh", name = "Nc", descriptor = "I")
	public int anInt1540;

	@OriginalMember(owner = "client!gh", name = "Ac", descriptor = "I")
	public int anInt1532 = -1;

	@OriginalMember(owner = "client!gh", name = "sc", descriptor = "I")
	public int anInt1526 = 0;

	@OriginalMember(owner = "client!gh", name = "zc", descriptor = "S")
	private short aShort8 = 0;

	@OriginalMember(owner = "client!gh", name = "pc", descriptor = "I")
	public int anInt1523 = 0;

	@OriginalMember(owner = "client!gh", name = "Cc", descriptor = "S")
	private short aShort9 = 0;

	@OriginalMember(owner = "client!gh", name = "Bc", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!gh", name = "tc", descriptor = "I")
	public int anInt1527 = -1;

	@OriginalMember(owner = "client!gh", name = "Ec", descriptor = "I")
	public int anInt1534 = 0;

	@OriginalMember(owner = "client!gh", name = "vc", descriptor = "I")
	public int anInt1529 = 0;

	@OriginalMember(owner = "client!gh", name = "Ic", descriptor = "I")
	public int anInt1537 = 0;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2363() {
		return this.aClass90_2 != null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass90_2 == null) {
			return;
		}
		@Pc(26) Class1_Sub2_Sub18 local26 = super.anInt3024 != -1 && super.anInt3037 == 0 ? Static73.method1277(super.anInt3024) : null;
		@Pc(51) Class1_Sub2_Sub18 local51 = super.anInt3054 == -1 || this.aBoolean60 || super.anInt3054 == super.anInt3009 && local26 != null ? null : Static73.method1277(super.anInt3054);
		@Pc(62) Class1_Sub2_Sub1_Sub4 local62 = this.aClass90_2.method3118(local26, super.anInt3046, super.anInt3013, local51);
		if (local62 == null) {
			return;
		}
		local62.method1459();
		super.aShort36 = local62.aShort36;
		if (this.aShort8 != 0 && this.aShort9 != 0) {
			@Pc(87) int local87 = Class1_Sub2_Sub2_Sub1.anIntArray30[arg0];
			@Pc(91) int local91 = Class1_Sub2_Sub2_Sub1.anIntArray33[arg0];
			@Pc(94) short local94 = this.aShort8;
			@Pc(97) short local97 = this.aShort9;
			@Pc(102) int local102 = -local97 / 2;
			@Pc(107) int local107 = -local94 / 2;
			@Pc(118) int local118 = local102 * local91 - local87 * local107 >> 16;
			@Pc(122) int local122 = local94 / 2;
			@Pc(132) int local132 = local102 * local87 + local107 * local91 >> 16;
			@Pc(145) int local145 = Static102.method1694(super.anInt3040 + local132, Static44.anInt1086, local118 + super.anInt3026);
			@Pc(150) int local150 = -local97 / 2;
			@Pc(160) int local160 = local91 * local122 + local87 * local150 >> 16;
			@Pc(170) int local170 = local150 * local91 - local122 * local87 >> 16;
			@Pc(182) int local182 = Static102.method1694(local160 + super.anInt3040, Static44.anInt1086, local170 + super.anInt3026);
			@Pc(187) int local187 = -local94 / 2;
			@Pc(191) int local191 = local97 / 2;
			@Pc(195) int local195 = local97 / 2;
			@Pc(199) int local199 = local94 / 2;
			@Pc(210) int local210 = local91 * local191 - local87 * local187 >> 16;
			@Pc(220) int local220 = local87 * local195 + local199 * local91 >> 16;
			@Pc(231) int local231 = local87 * local191 + local91 * local187 >> 16;
			@Pc(244) int local244 = Static102.method1694(super.anInt3040 + local231, Static44.anInt1086, local210 + super.anInt3026);
			@Pc(255) int local255 = local91 * local195 - local87 * local199 >> 16;
			@Pc(267) int local267 = Static102.method1694(local220 + super.anInt3040, Static44.anInt1086, local255 + super.anInt3026);
			@Pc(278) int local278 = local267 > local182 ? local182 : local267;
			@Pc(285) int local285 = local182 <= local145 ? local182 : local145;
			@Pc(296) int local296 = local267 > local244 ? local244 : local267;
			@Pc(310) int local310 = (int) (Math.atan2((double) (local285 - local296), (double) local97) * 320.0D) & 0x7FF;
			@Pc(317) int local317 = local244 <= local145 ? local244 : local145;
			local62.method1447(local310);
			@Pc(331) int local331 = (local296 + local285 + local278 + local317) / 4;
			@Pc(345) int local345 = (int) (Math.atan2((double) (local317 - local278), (double) local94) * 320.0D) & 0x7FF;
			local62.method1460(local345);
			local62.method1458(0, local331 - super.anInt3012, 0);
		}
		@Pc(358) Class1_Sub2_Sub1_Sub4 local358 = null;
		@Pc(360) Class1_Sub2_Sub1_Sub4 local360 = null;
		if (!this.aBoolean60 && super.anInt3028 != -1 && super.anInt3058 != -1) {
			local360 = Static67.method1207(super.anInt3028).method912(super.anInt3058);
			if (local360 != null) {
				local360.method1458(0, -super.anInt3042, 0);
			}
		}
		if (!this.aBoolean60 && this.aClass1_Sub2_Sub1_Sub4_1 != null) {
			if (this.anInt1534 <= Static142.anInt3104) {
				this.aClass1_Sub2_Sub1_Sub4_1 = null;
			}
			if (Static142.anInt3104 >= this.anInt1523 && this.anInt1534 > Static142.anInt3104) {
				local358 = this.aClass1_Sub2_Sub1_Sub4_1;
				local358.method1458(this.anInt1540 - super.anInt3040, this.anInt1533 + -super.anInt3012, this.anInt1522 - super.anInt3026);
				if (super.anInt3049 == 512) {
					local358.method1453();
					local358.method1453();
					local358.method1453();
				} else if (super.anInt3049 == 1024) {
					local358.method1453();
					local358.method1453();
				} else if (super.anInt3049 == 1536) {
					local358.method1453();
				}
			}
		}
		if (local360 != null) {
			local62 = ((Class1_Sub2_Sub1_Sub4_Sub1) local62).method1470(local360);
		}
		if (local358 != null) {
			local62 = ((Class1_Sub2_Sub1_Sub4_Sub1) local62).method1470(local358);
		}
		local62.aBoolean81 = true;
		local62.method2784(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local358 == null) {
			return;
		}
		if (super.anInt3049 == 512) {
			local358.method1453();
		} else if (super.anInt3049 == 1024) {
			local358.method1453();
			local358.method1453();
		} else if (super.anInt3049 == 1536) {
			local358.method1453();
			local358.method1453();
			local358.method1453();
		}
		local358.method1458(super.anInt3040 - this.anInt1540, -this.anInt1533 + super.anInt3012, super.anInt3026 - this.anInt1522);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!ka;)V")
	public void method1105(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.anInt446 = 0;
		@Pc(12) int local12 = arg0.method336();
		if ((local12 & 0x2) == 2) {
			this.aShort8 = (short) (arg0.method336() << 2);
			this.aShort9 = (short) (arg0.method336() << 2);
		} else {
			this.aShort8 = 0;
			this.aShort9 = 0;
		}
		super.anInt3051 = (local12 >> 3) + 1;
		@Pc(61) boolean local61 = (local12 & 0x4) != 0;
		@Pc(63) int local63 = -1;
		@Pc(67) int local67 = local12 & 0x1;
		@Pc(70) int[] local70 = new int[12];
		this.anInt1527 = arg0.method339();
		this.anInt1532 = arg0.method339();
		this.anInt1529 = 0;
		@Pc(109) int local109;
		@Pc(115) int local115;
		for (@Pc(91) int local91 = 0; local91 < 12; local91++) {
			@Pc(97) int local97 = arg0.method336();
			if (local97 == 0) {
				local70[local91] = 0;
			} else {
				local109 = arg0.method336();
				local115 = local109 + (local97 << 8);
				if (local91 == 0 && local115 == 65535) {
					local63 = arg0.method359();
					break;
				}
				if (local115 >= 32768) {
					local115 = Static176.anIntArray424[local115 - 32768];
					local70[local91] = local115 | 0x40000000;
					@Pc(150) int local150 = Static54.method969(local115).anInt2417;
					if (local150 != 0) {
						this.anInt1529 = local150;
					}
				} else {
					local70[local91] = Integer.MIN_VALUE | local115 - 256;
				}
			}
		}
		@Pc(175) int[] local175 = new int[5];
		for (local109 = 0; local109 < 5; local109++) {
			local115 = arg0.method336();
			if (local115 < 0 || local115 >= Static118.aShortArrayArray5[local109].length) {
				local115 = 0;
			}
			local175[local109] = local115;
		}
		super.anInt3009 = arg0.method359();
		if (super.anInt3009 == 65535) {
			super.anInt3009 = -1;
		}
		super.anInt3061 = arg0.method359();
		if (super.anInt3061 == 65535) {
			super.anInt3061 = -1;
		}
		super.anInt3055 = super.anInt3061;
		super.anInt3034 = arg0.method359();
		if (super.anInt3034 == 65535) {
			super.anInt3034 = -1;
		}
		super.anInt3017 = arg0.method359();
		if (super.anInt3017 == 65535) {
			super.anInt3017 = -1;
		}
		super.anInt3033 = arg0.method359();
		if (super.anInt3033 == 65535) {
			super.anInt3033 = -1;
		}
		super.anInt3036 = arg0.method359();
		if (super.anInt3036 == 65535) {
			super.anInt3036 = -1;
		}
		super.anInt3010 = arg0.method359();
		if (super.anInt3010 == 65535) {
			super.anInt3010 = -1;
		}
		this.aClass81_518 = Static106.method1751(arg0.method363()).method2808();
		this.anInt1526 = arg0.method336();
		if (local61) {
			this.anInt1537 = arg0.method359();
		}
		if (this.aClass90_2 == null) {
			this.aClass90_2 = new Class90();
		}
		this.aClass90_2.method3116(local63, local175, local67 == 1, local70);
	}
}
