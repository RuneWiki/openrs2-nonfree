import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class1_Sub2_Sub2_Sub2_Sub2 extends Class1_Sub2_Sub2_Sub2 {

	@OriginalMember(owner = "client!kd", name = "yc", descriptor = "Lclient!dd;")
	public Class13 aClass13_847;

	@OriginalMember(owner = "client!kd", name = "Cc", descriptor = "I")
	public int anInt2611;

	@OriginalMember(owner = "client!kd", name = "Dc", descriptor = "I")
	public int anInt2612;

	@OriginalMember(owner = "client!kd", name = "Jc", descriptor = "I")
	public int anInt2617;

	@OriginalMember(owner = "client!kd", name = "Mc", descriptor = "Lclient!ia;")
	public Class1_Sub2_Sub2_Sub5 aClass1_Sub2_Sub2_Sub5_1;

	@OriginalMember(owner = "client!kd", name = "Pc", descriptor = "I")
	public int anInt2622;

	@OriginalMember(owner = "client!kd", name = "Wc", descriptor = "I")
	public int anInt2627;

	@OriginalMember(owner = "client!kd", name = "Zc", descriptor = "Lclient!bi;")
	public Class6 aClass6_2;

	@OriginalMember(owner = "client!kd", name = "id", descriptor = "I")
	public int anInt2633;

	@OriginalMember(owner = "client!kd", name = "jd", descriptor = "I")
	public int anInt2634;

	@OriginalMember(owner = "client!kd", name = "vc", descriptor = "S")
	private short aShort24 = 0;

	@OriginalMember(owner = "client!kd", name = "Bc", descriptor = "I")
	public int anInt2610 = -1;

	@OriginalMember(owner = "client!kd", name = "Ic", descriptor = "S")
	private short aShort25 = 0;

	@OriginalMember(owner = "client!kd", name = "Rc", descriptor = "I")
	public int anInt2624 = 0;

	@OriginalMember(owner = "client!kd", name = "Uc", descriptor = "I")
	public int anInt2625 = 0;

	@OriginalMember(owner = "client!kd", name = "Gc", descriptor = "I")
	public int anInt2615 = 0;

	@OriginalMember(owner = "client!kd", name = "xc", descriptor = "I")
	public int anInt2608 = 0;

	@OriginalMember(owner = "client!kd", name = "bd", descriptor = "I")
	public int anInt2629 = 0;

	@OriginalMember(owner = "client!kd", name = "Vc", descriptor = "I")
	public int anInt2626 = -1;

	@OriginalMember(owner = "client!kd", name = "gd", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!ce;)V")
	public void method1894(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.anInt2195 = 0;
		@Pc(15) int[] local15 = new int[12];
		@Pc(17) int local17 = -1;
		@Pc(21) int local21 = arg0.method1607();
		@Pc(32) boolean local32 = (local21 & 0x4) != 0;
		@Pc(36) int local36 = local21 & 0x1;
		if ((local21 & 0x2) == 2) {
			this.aShort24 = (short) (arg0.method1607() << 2);
			this.aShort25 = (short) (arg0.method1607() << 2);
		} else {
			this.aShort24 = 0;
			this.aShort25 = 0;
		}
		super.anInt2583 = (local21 >> 3) + 1;
		this.anInt2610 = arg0.method1611();
		this.anInt2626 = arg0.method1611();
		this.anInt2629 = 0;
		@Pc(110) int local110;
		@Pc(116) int local116;
		for (@Pc(89) int local89 = 0; local89 < 12; local89++) {
			@Pc(95) int local95 = arg0.method1607();
			if (local95 == 0) {
				local15[local89] = 0;
			} else {
				local110 = arg0.method1607();
				local116 = local110 + (local95 << 8);
				if (local89 == 0 && local116 == 65535) {
					local17 = arg0.method1642();
					break;
				}
				if (local116 >= 32768) {
					local116 = Static156.anIntArray382[local116 - 32768];
					local15[local89] = local116 | 0x40000000;
					@Pc(152) int local152 = Static184.method2994(local116).anInt1329;
					if (local152 != 0) {
						this.anInt2629 = local152;
					}
				} else {
					local15[local89] = Integer.MIN_VALUE | local116 - 256;
				}
			}
		}
		@Pc(176) int[] local176 = new int[5];
		for (local110 = 0; local110 < 5; local110++) {
			local116 = arg0.method1607();
			if (local116 < 0 || Static63.aShortArrayArray6[local110].length <= local116) {
				local116 = 0;
			}
			local176[local110] = local116;
		}
		super.anInt2584 = arg0.method1642();
		if (super.anInt2584 == 65535) {
			super.anInt2584 = -1;
		}
		super.anInt2561 = arg0.method1642();
		if (super.anInt2561 == 65535) {
			super.anInt2561 = -1;
		}
		super.anInt2574 = super.anInt2561;
		super.anInt2550 = arg0.method1642();
		if (super.anInt2550 == 65535) {
			super.anInt2550 = -1;
		}
		super.anInt2552 = arg0.method1642();
		if (super.anInt2552 == 65535) {
			super.anInt2552 = -1;
		}
		super.anInt2582 = arg0.method1642();
		if (super.anInt2582 == 65535) {
			super.anInt2582 = -1;
		}
		super.anInt2581 = arg0.method1642();
		if (super.anInt2581 == 65535) {
			super.anInt2581 = -1;
		}
		super.anInt2562 = arg0.method1642();
		if (super.anInt2562 == 65535) {
			super.anInt2562 = -1;
		}
		this.aClass13_847 = Static43.method1141(arg0.method1616()).method903();
		this.anInt2615 = arg0.method1607();
		if (local32) {
			this.anInt2624 = arg0.method1642();
		}
		if (this.aClass6_2 == null) {
			this.aClass6_2 = new Class6();
		}
		this.aClass6_2.method641(local17, local15, local36 == 1, local176);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass6_2 == null) {
			return;
		}
		@Pc(23) Class1_Sub2_Sub8 local23 = super.anInt2553 != -1 && super.anInt2585 == 0 ? Static142.method2538(super.anInt2553) : null;
		@Pc(45) Class1_Sub2_Sub8 local45 = super.anInt2593 == -1 || this.aBoolean194 || super.anInt2593 == super.anInt2584 && local23 != null ? null : Static142.method2538(super.anInt2593);
		@Pc(56) Class1_Sub2_Sub2_Sub5 local56 = this.aClass6_2.method635(local23, super.anInt2549, local45, super.anInt2590);
		if (local56 == null) {
			return;
		}
		local56.method2714();
		super.aShort27 = local56.aShort27;
		if (this.aShort24 != 0 && this.aShort25 != 0) {
			@Pc(81) int local81 = Class1_Sub2_Sub1_Sub2.anIntArray41[arg0];
			@Pc(85) int local85 = Class1_Sub2_Sub1_Sub2.anIntArray38[arg0];
			@Pc(88) short local88 = this.aShort24;
			@Pc(91) short local91 = this.aShort25;
			@Pc(96) int local96 = -local91 / 2;
			@Pc(101) int local101 = -local88 / 2;
			@Pc(112) int local112 = local85 * local96 - local101 * local81 >> 16;
			@Pc(117) int local117 = -local91 / 2;
			@Pc(128) int local128 = local81 * local96 + local101 * local85 >> 16;
			@Pc(132) int local132 = local88 / 2;
			@Pc(146) int local146 = Static66.method1449(Static156.anInt3696, super.anInt2606 + local112, super.anInt2596 - -local128);
			@Pc(156) int local156 = local85 * local132 + local117 * local81 >> 16;
			@Pc(160) int local160 = local91 / 2;
			@Pc(171) int local171 = local117 * local85 - local132 * local81 >> 16;
			@Pc(183) int local183 = Static66.method1449(Static156.anInt3696, local171 + super.anInt2606, local156 + super.anInt2596);
			@Pc(188) int local188 = -local88 / 2;
			@Pc(198) int local198 = local160 * local81 + local85 * local188 >> 16;
			@Pc(209) int local209 = local85 * local160 - local81 * local188 >> 16;
			@Pc(222) int local222 = Static66.method1449(Static156.anInt3696, super.anInt2606 + local209, super.anInt2596 - -local198);
			@Pc(229) int local229 = local146 >= local183 ? local183 : local146;
			@Pc(233) int local233 = local88 / 2;
			@Pc(237) int local237 = local91 / 2;
			@Pc(247) int local247 = local237 * local85 - local81 * local233 >> 16;
			@Pc(258) int local258 = local146 < local222 ? local146 : local222;
			@Pc(269) int local269 = local237 * local81 + local233 * local85 >> 16;
			@Pc(282) int local282 = Static66.method1449(Static156.anInt3696, super.anInt2606 + local247, local269 + super.anInt2596);
			@Pc(293) int local293 = local222 < local282 ? local222 : local282;
			@Pc(300) int local300 = local183 >= local282 ? local282 : local183;
			@Pc(311) int local311 = (local293 + local229 + local300 + local258) / 4;
			@Pc(325) int local325 = (int) (Math.atan2((double) (local229 - local293), (double) local91) * 320.0D) & 0x7FF;
			local56.method2716(local325);
			@Pc(342) int local342 = (int) (Math.atan2((double) (local258 - local300), (double) local88) * 320.0D) & 0x7FF;
			local56.method2724(local342);
			local56.method2715(0, local311 - super.anInt2564, 0);
		}
		@Pc(356) Class1_Sub2_Sub2_Sub5 local356 = null;
		if (!this.aBoolean194 && super.anInt2603 != -1 && super.anInt2598 != -1) {
			local356 = Static42.method1121(super.anInt2603).method530(super.anInt2598);
			if (local356 != null) {
				local356.method2715(0, -super.anInt2569, 0);
			}
		}
		@Pc(388) Class1_Sub2_Sub2_Sub5 local388 = null;
		if (!this.aBoolean194 && this.aClass1_Sub2_Sub2_Sub5_1 != null) {
			if (Static78.anInt2168 >= this.anInt2625) {
				this.aClass1_Sub2_Sub2_Sub5_1 = null;
			}
			if (this.anInt2608 <= Static78.anInt2168 && Static78.anInt2168 < this.anInt2625) {
				local388 = this.aClass1_Sub2_Sub2_Sub5_1;
				local388.method2715(this.anInt2627 - super.anInt2596, -super.anInt2564 + this.anInt2617, this.anInt2612 - super.anInt2606);
				if (super.anInt2555 == 512) {
					local388.method2718();
					local388.method2718();
					local388.method2718();
				} else if (super.anInt2555 == 1024) {
					local388.method2718();
					local388.method2718();
				} else if (super.anInt2555 == 1536) {
					local388.method2718();
				}
			}
		}
		if (local356 != null) {
			local56 = ((Class1_Sub2_Sub2_Sub5_Sub1) local56).method2731(local356);
		}
		if (local388 != null) {
			local56 = ((Class1_Sub2_Sub2_Sub5_Sub1) local56).method2731(local388);
		}
		local56.aBoolean287 = true;
		local56.method2704(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local388 == null) {
			return;
		}
		if (super.anInt2555 == 512) {
			local388.method2718();
		} else if (super.anInt2555 == 1024) {
			local388.method2718();
			local388.method2718();
		} else if (super.anInt2555 == 1536) {
			local388.method2718();
			local388.method2718();
			local388.method2718();
		}
		local388.method2715(super.anInt2596 - this.anInt2627, super.anInt2564 - this.anInt2617, super.anInt2606 - this.anInt2612);
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1882() {
		return this.aClass6_2 != null;
	}
}
