import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class20_Sub2_Sub4_Sub1 extends Class20_Sub2_Sub4 {

	@OriginalMember(owner = "client!mfa", name = "U", descriptor = "I")
	public int anInt6449;

	@OriginalMember(owner = "client!mfa", name = "bb", descriptor = "I")
	public int anInt6456;

	@OriginalMember(owner = "client!mfa", name = "hb", descriptor = "I")
	public int anInt6461;

	@OriginalMember(owner = "client!mfa", name = "ib", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!mfa", name = "O", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!mfa", name = "ab", descriptor = "I")
	public int anInt6455 = 0;

	@OriginalMember(owner = "client!mfa", name = "Z", descriptor = "I")
	public int anInt6454 = -1;

	@OriginalMember(owner = "client!mfa", name = "jb", descriptor = "I")
	public int anInt6463 = -1;

	@OriginalMember(owner = "client!mfa", name = "X", descriptor = "I")
	private int anInt6452 = 0;

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(IIIII)V")
	public Class20_Sub2_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9016(@OriginalArg(0) Class100 arg0) {
	}

	@OriginalMember(owner = "client!mfa", name = "j", descriptor = "(B)I")
	@Override
	public int method9022(@OriginalArg(0) byte arg0) {
		if (arg0 != 3) {
			this.anInt6456 = 69;
		}
		return this.anInt6452;
	}

	@OriginalMember(owner = "client!mfa", name = "h", descriptor = "(B)I")
	@Override
	public int method9019() {
		return -10;
	}

	@OriginalMember(owner = "client!mfa", name = "g", descriptor = "(B)I")
	@Override
	public int method9013() {
		@Pc(9) Class347 local9 = Static266.aClass138_1.method3730(this.anInt6456);
		@Pc(12) int local12 = local9.anInt9778;
		if (this.anInt6463 != -1) {
			@Pc(23) Class347 local23 = Static266.aClass138_1.method3730(this.anInt6463);
			if (local12 < local23.anInt9778) {
				local12 = local23.anInt9778;
			}
		}
		if (this.anInt6454 != -1) {
			@Pc(52) Class347 local52 = Static266.aClass138_1.method3730(this.anInt6454);
			if (local12 < local52.anInt9778) {
				local12 = local52.anInt9778;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mfa", name = "i", descriptor = "(B)Z")
	@Override
	public boolean method9021() {
		return false;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IBLclient!ha;I)Z")
	@Override
	public boolean method9014(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class154 local6 = arg1.method8785();
		local6.method6559(super.anInt10725, super.anInt10724 - 10, super.anInt10729);
		@Pc(27) Class347 local27 = Static266.aClass138_1.method3730(this.anInt6456);
		@Pc(40) Class24 local40 = local27.method8253(0, this.anInt6462, -1, (Class12) null, 131072, arg1, (Class21) null, 0);
		if (local40 != null && (Static591.aBoolean675 ? local40.method6867(arg0, arg2, local6, true, local27.anInt9778, Static419.anInt7660) : local40.method6855(arg0, arg2, local6, true, local27.anInt9778))) {
			return true;
		}
		@Pc(75) Class347 local75;
		if (this.anInt6463 != -1) {
			local75 = Static266.aClass138_1.method3730(this.anInt6463);
			local40 = local75.method8253(0, this.anInt6449, -1, (Class12) null, 131072, arg1, (Class21) null, 0);
			if (local40 != null && (Static591.aBoolean675 ? local40.method6867(arg0, arg2, local6, true, local75.anInt9778, Static419.anInt7660) : local40.method6855(arg0, arg2, local6, true, local75.anInt9778))) {
				return true;
			}
		}
		if (this.anInt6454 != -1) {
			local75 = Static266.aClass138_1.method3730(this.anInt6454);
			local40 = local75.method8253(0, this.anInt6461, -1, (Class12) null, 131072, arg1, (Class21) null, 0);
			if (local40 != null && (Static591.aBoolean675 ? local40.method6867(arg0, arg2, local6, true, local75.anInt9778, Static419.anInt7660) : local40.method6855(arg0, arg2, local6, true, local75.anInt9778))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "(B)Z")
	@Override
	public boolean method9023() {
		return this.aBoolean424;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!ha;I)Lclient!ria;")
	@Override
	public Class290 method9007(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(Lclient!ha;B)Lclient!c;")
	@Override
	public Class20_Sub3 method9020(@OriginalArg(0) Class100 arg0) {
		@Pc(17) Class196 local17 = Static343.method5555(super.aByte131, super.anInt10725 >> Static643.anInt10682, super.anInt10729 >> Static643.anInt10682);
		if (local17 != null && local17.aClass20_Sub2_Sub2_1.aBoolean729) {
			@Pc(28) int local28 = local17.aClass20_Sub2_Sub2_1.method9019();
			if (local28 != this.anInt6455) {
				super.anInt10724 -= this.anInt6455;
				super.anInt10724 += local28;
				this.anInt6455 = local28;
			}
		}
		@Pc(59) Class154 local59 = arg0.method8785();
		local59.method6564();
		if (local17 == null || !local17.aClass20_Sub2_Sub2_1.aBoolean729) {
			@Pc(78) Class199 local78 = Static195.aClass199Array1[super.aByte130];
			@Pc(83) int local83 = this.anInt6452 << 1;
			@Pc(90) int local90 = -local83 / 2;
			@Pc(95) int local95 = -local83 / 2;
			@Pc(108) int local108 = local78.method8531(super.anInt10729 + local95, super.anInt10725 + local90);
			@Pc(112) int local112 = local83 / 2;
			@Pc(117) int local117 = -local83 / 2;
			@Pc(130) int local130 = local78.method8531(local117 + super.anInt10729, super.anInt10725 - -local112);
			@Pc(135) int local135 = -local83 / 2;
			@Pc(139) int local139 = local83 / 2;
			@Pc(152) int local152 = local78.method8531(local139 + super.anInt10729, super.anInt10725 - -local135);
			@Pc(156) int local156 = local83 / 2;
			@Pc(160) int local160 = local83 / 2;
			@Pc(173) int local173 = local78.method8531(super.anInt10729 + local160, super.anInt10725 + local156);
			@Pc(180) int local180 = local108 >= local130 ? local130 : local108;
			@Pc(191) int local191 = local173 <= local152 ? local173 : local152;
			@Pc(202) int local202 = local173 <= local130 ? local173 : local130;
			if (local83 != 0) {
				@Pc(218) int local218 = (int) (Math.atan2((double) (local180 - local191), (double) local83) * 2607.5945876176133D) & 0x3FFF;
				if (local218 != 0) {
					local59.method6557(local218);
				}
			}
			@Pc(233) int local233 = local108 < local152 ? local108 : local152;
			@Pc(237) int local237 = local173 + local108;
			if (local83 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local233 - local202), (double) local83) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local59.method6572(-local256);
				}
			}
			if (local237 > local152 + local130) {
				local237 = local130 + local152;
			}
			local237 = (local237 >> 1) - super.anInt10724;
			if (local237 != 0) {
				local59.method6570(0, local237, 0);
			}
		}
		local59.method6570(super.anInt10725, super.anInt10724 - 10, super.anInt10729);
		@Pc(302) Class20_Sub3 local302 = Static307.method5201(true, 3);
		this.anInt6452 = 0;
		this.aBoolean424 = false;
		@Pc(330) Class24 local330;
		if (this.anInt6454 != -1) {
			local330 = Static266.aClass138_1.method3730(this.anInt6454).method8253(0, this.anInt6461, -1, (Class12) null, 2048, arg0, (Class21) null, 0);
			if (local330 != null) {
				if (Static591.aBoolean675) {
					local330.method6845(local59, local302.aClass20_Sub4Array1[2], Static419.anInt7660, 0);
				} else {
					local330.method6862(local59, local302.aClass20_Sub4Array1[2], 0);
				}
				this.aBoolean424 |= local330.F();
				this.anInt6452 = local330.ma();
			}
		}
		if (this.anInt6463 != -1) {
			local330 = Static266.aClass138_1.method3730(this.anInt6463).method8253(0, this.anInt6449, -1, (Class12) null, 2048, arg0, (Class21) null, 0);
			if (local330 != null) {
				if (Static591.aBoolean675) {
					local330.method6845(local59, local302.aClass20_Sub4Array1[1], Static419.anInt7660, 0);
				} else {
					local330.method6862(local59, local302.aClass20_Sub4Array1[1], 0);
				}
				this.aBoolean424 |= local330.F();
				if (local330.ma() > this.anInt6452) {
					this.anInt6452 = local330.ma();
				}
			}
		}
		local330 = Static266.aClass138_1.method3730(this.anInt6456).method8253(0, this.anInt6462, -1, (Class12) null, 2048, arg0, (Class21) null, 0);
		if (local330 != null) {
			if (Static591.aBoolean675) {
				local330.method6845(local59, local302.aClass20_Sub4Array1[0], Static419.anInt7660, 0);
			} else {
				local330.method6862(local59, local302.aClass20_Sub4Array1[0], 0);
			}
			this.aBoolean424 |= local330.F();
			if (local330.ma() > this.anInt6452) {
				this.anInt6452 = local330.ma();
			}
		}
		return local302;
	}
}
