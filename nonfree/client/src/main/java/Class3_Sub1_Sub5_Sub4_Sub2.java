import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub1_Sub5_Sub4_Sub2 extends Class3_Sub1_Sub5_Sub4 {

	@OriginalMember(owner = "client!ve", name = "uc", descriptor = "I")
	public int anInt4331;

	@OriginalMember(owner = "client!ve", name = "wc", descriptor = "Lclient!rd;")
	public Class80 aClass80_1689;

	@OriginalMember(owner = "client!ve", name = "xc", descriptor = "I")
	public int anInt4332;

	@OriginalMember(owner = "client!ve", name = "Gc", descriptor = "I")
	public int anInt4339;

	@OriginalMember(owner = "client!ve", name = "Ic", descriptor = "Lclient!le;")
	public Class55 aClass55_2;

	@OriginalMember(owner = "client!ve", name = "Kc", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!ve", name = "Lc", descriptor = "I")
	public int anInt4343;

	@OriginalMember(owner = "client!ve", name = "Nc", descriptor = "I")
	public int anInt4345;

	@OriginalMember(owner = "client!ve", name = "Yc", descriptor = "Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_1;

	@OriginalMember(owner = "client!ve", name = "Zc", descriptor = "I")
	public int anInt4351;

	@OriginalMember(owner = "client!ve", name = "vc", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!ve", name = "Bc", descriptor = "I")
	public int anInt4336 = -1;

	@OriginalMember(owner = "client!ve", name = "yc", descriptor = "I")
	public int anInt4333 = 0;

	@OriginalMember(owner = "client!ve", name = "Tc", descriptor = "I")
	public int anInt4349 = -1;

	@OriginalMember(owner = "client!ve", name = "Oc", descriptor = "I")
	public int anInt4346 = 0;

	@OriginalMember(owner = "client!ve", name = "Jc", descriptor = "I")
	public int anInt4341 = 0;

	@OriginalMember(owner = "client!ve", name = "Pc", descriptor = "I")
	public int anInt4347 = 0;

	@OriginalMember(owner = "client!ve", name = "Fc", descriptor = "S")
	private short aShort35 = 0;

	@OriginalMember(owner = "client!ve", name = "Ac", descriptor = "I")
	public int anInt4335 = 0;

	@OriginalMember(owner = "client!ve", name = "Wc", descriptor = "S")
	private short aShort36 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass55_2 == null) {
			return;
		}
		@Pc(27) Class3_Sub1_Sub15 local27 = super.anInt4323 != -1 && super.anInt4286 == 0 ? Static148.method2368(super.anInt4323) : null;
		@Pc(48) Class3_Sub1_Sub15 local48 = super.anInt4285 == -1 || this.aBoolean171 || super.anInt4326 == super.anInt4285 && local27 != null ? null : Static148.method2368(super.anInt4285);
		@Pc(59) Class3_Sub1_Sub5_Sub3 local59 = this.aClass55_2.method1532(super.anInt4275, local48, super.anInt4304, local27);
		if (local59 == null) {
			return;
		}
		local59.method1385();
		super.aShort34 = local59.aShort34;
		if (this.aShort36 != 0 && this.aShort35 != 0) {
			@Pc(81) int local81 = Class3_Sub1_Sub4_Sub2.anIntArray188[arg0];
			@Pc(85) int local85 = Class3_Sub1_Sub4_Sub2.anIntArray190[arg0];
			@Pc(88) short local88 = this.aShort36;
			@Pc(91) short local91 = this.aShort35;
			@Pc(96) int local96 = -local88 / 2;
			@Pc(101) int local101 = -local91 / 2;
			@Pc(112) int local112 = local85 * local101 - local96 * local81 >> 16;
			@Pc(122) int local122 = local85 * local96 + local81 * local101 >> 16;
			@Pc(135) int local135 = Static50.method742(Static153.anInt673, local112 + super.anInt4315, super.anInt4329 - -local122);
			@Pc(140) int local140 = -local91 / 2;
			@Pc(144) int local144 = local88 / 2;
			@Pc(154) int local154 = local140 * local85 - local144 * local81 >> 16;
			@Pc(165) int local165 = local81 * local140 + local85 * local144 >> 16;
			@Pc(178) int local178 = Static50.method742(Static153.anInt673, local154 + super.anInt4315, super.anInt4329 - -local165);
			@Pc(183) int local183 = -local88 / 2;
			@Pc(187) int local187 = local91 / 2;
			@Pc(198) int local198 = local187 * local85 - local81 * local183 >> 16;
			@Pc(208) int local208 = local187 * local81 + local183 * local85 >> 16;
			@Pc(220) int local220 = Static50.method742(Static153.anInt673, super.anInt4315 + local198, local208 + super.anInt4329);
			@Pc(224) int local224 = local88 / 2;
			@Pc(228) int local228 = local91 / 2;
			@Pc(238) int local238 = local224 * local85 + local81 * local228 >> 16;
			@Pc(249) int local249 = local85 * local228 - local224 * local81 >> 16;
			@Pc(261) int local261 = Static50.method742(Static153.anInt673, super.anInt4315 + local249, local238 + super.anInt4329);
			@Pc(272) int local272 = local135 < local178 ? local135 : local178;
			@Pc(283) int local283 = local220 >= local261 ? local261 : local220;
			@Pc(290) int local290 = local178 < local261 ? local178 : local261;
			@Pc(303) int local303 = (int) (Math.atan2((double) (local272 - local283), (double) local91) * 320.0D) & 0x7FF;
			local59.method1376(local303);
			@Pc(313) int local313 = local220 <= local135 ? local220 : local135;
			@Pc(327) int local327 = (int) (Math.atan2((double) (local313 - local290), (double) local88) * 320.0D) & 0x7FF;
			local59.method1384(local327);
			@Pc(340) int local340 = (local313 + local290 + local283 + local272) / 4;
			local59.method1381(0, local340 - super.anInt4280, 0);
		}
		@Pc(351) Class3_Sub1_Sub5_Sub3 local351 = null;
		if (!this.aBoolean171 && super.anInt4296 != -1 && super.anInt4313 != -1) {
			local351 = Static194.method3135(super.anInt4296).method1708(super.anInt4313);
			if (local351 != null) {
				local351.method1381(0, -super.anInt4317, 0);
			}
		}
		@Pc(383) Class3_Sub1_Sub5_Sub3 local383 = null;
		if (!this.aBoolean171 && this.aClass3_Sub1_Sub5_Sub3_1 != null) {
			if (this.anInt4335 <= Static193.anInt4411) {
				this.aClass3_Sub1_Sub5_Sub3_1 = null;
			}
			if (this.anInt4347 <= Static193.anInt4411 && Static193.anInt4411 < this.anInt4335) {
				local383 = this.aClass3_Sub1_Sub5_Sub3_1;
				local383.method1381(this.anInt4345 - super.anInt4329, -super.anInt4280 + this.anInt4342, this.anInt4332 - super.anInt4315);
				if (super.anInt4309 == 512) {
					local383.method1374();
					local383.method1374();
					local383.method1374();
				} else if (super.anInt4309 == 1024) {
					local383.method1374();
					local383.method1374();
				} else if (super.anInt4309 == 1536) {
					local383.method1374();
				}
			}
		}
		if (local351 != null) {
			local59 = ((Class3_Sub1_Sub5_Sub3_Sub1) local59).method1390(local351);
		}
		if (local383 != null) {
			local59 = ((Class3_Sub1_Sub5_Sub3_Sub1) local59).method1390(local383);
		}
		local59.aBoolean75 = true;
		local59.method3054(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local383 == null) {
			return;
		}
		if (super.anInt4309 == 512) {
			local383.method1374();
		} else if (super.anInt4309 == 1024) {
			local383.method1374();
			local383.method1374();
		} else if (super.anInt4309 == 1536) {
			local383.method1374();
			local383.method1374();
			local383.method1374();
		}
		local383.method1381(super.anInt4329 - this.anInt4345, super.anInt4280 + -this.anInt4342, super.anInt4315 - this.anInt4332);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!mb;I)V")
	public void method3071(@OriginalArg(0) Class3_Sub17 arg0) {
		arg0.anInt2923 = 0;
		@Pc(12) int local12 = arg0.method2107();
		if ((local12 & 0x2) == 2) {
			this.aShort36 = (short) (arg0.method2107() << 2);
			this.aShort35 = (short) (arg0.method2107() << 2);
		} else {
			this.aShort36 = 0;
			this.aShort35 = 0;
		}
		super.anInt4277 = (local12 >> 3) + 1;
		@Pc(52) int local52 = local12 & 0x1;
		this.anInt4349 = arg0.method2123();
		@Pc(67) boolean local67 = (local12 & 0x4) != 0;
		this.anInt4336 = arg0.method2123();
		@Pc(74) int local74 = -1;
		this.anInt4346 = 0;
		@Pc(80) int[] local80 = new int[12];
		@Pc(100) int local100;
		@Pc(106) int local106;
		for (@Pc(82) int local82 = 0; local82 < 12; local82++) {
			@Pc(88) int local88 = arg0.method2107();
			if (local88 == 0) {
				local80[local82] = 0;
			} else {
				local100 = arg0.method2107();
				local106 = (local88 << 8) + local100;
				if (local82 == 0 && local106 == 65535) {
					local74 = arg0.method2111();
					break;
				}
				if (local106 >= 32768) {
					local106 = Static29.anIntArray91[local106 - 32768];
					local80[local82] = local106 | 0x40000000;
					@Pc(141) int local141 = Static173.method2793(local106).anInt350;
					if (local141 != 0) {
						this.anInt4346 = local141;
					}
				} else {
					local80[local82] = Integer.MIN_VALUE | local106 - 256;
				}
			}
		}
		@Pc(165) int[] local165 = new int[5];
		for (local100 = 0; local100 < 5; local100++) {
			local106 = arg0.method2107();
			if (local106 < 0 || local106 >= Static145.aShortArrayArray5[local100].length) {
				local106 = 0;
			}
			local165[local100] = local106;
		}
		super.anInt4326 = arg0.method2111();
		if (super.anInt4326 == 65535) {
			super.anInt4326 = -1;
		}
		super.anInt4318 = arg0.method2111();
		if (super.anInt4318 == 65535) {
			super.anInt4318 = -1;
		}
		super.anInt4311 = super.anInt4318;
		super.anInt4324 = arg0.method2111();
		if (super.anInt4324 == 65535) {
			super.anInt4324 = -1;
		}
		super.anInt4288 = arg0.method2111();
		if (super.anInt4288 == 65535) {
			super.anInt4288 = -1;
		}
		super.anInt4283 = arg0.method2111();
		if (super.anInt4283 == 65535) {
			super.anInt4283 = -1;
		}
		super.anInt4278 = arg0.method2111();
		if (super.anInt4278 == 65535) {
			super.anInt4278 = -1;
		}
		super.anInt4289 = arg0.method2111();
		if (super.anInt4289 == 65535) {
			super.anInt4289 = -1;
		}
		this.aClass80_1689 = Static19.method321(arg0.method2115()).method2451();
		this.anInt4341 = arg0.method2107();
		if (local67) {
			this.anInt4333 = arg0.method2111();
		} else {
			this.anInt4333 = 0;
		}
		if (this.aClass55_2 == null) {
			this.aClass55_2 = new Class55();
		}
		this.aClass55_2.method1534(local74, local52 == 1, local165, local80);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3064() {
		return this.aClass55_2 != null;
	}
}
