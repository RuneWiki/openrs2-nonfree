import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class3_Sub1_Sub4_Sub1 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
	public int anInt7082;

	@OriginalMember(owner = "client!mq", name = "Q", descriptor = "I")
	public int anInt7086;

	@OriginalMember(owner = "client!mq", name = "R", descriptor = "I")
	public int anInt7087;

	@OriginalMember(owner = "client!mq", name = "V", descriptor = "I")
	public int anInt7091;

	@OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
	public int anInt7081 = -1;

	@OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
	private int anInt7085 = 0;

	@OriginalMember(owner = "client!mq", name = "W", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "client!mq", name = "U", descriptor = "I")
	public int anInt7090 = -1;

	@OriginalMember(owner = "client!mq", name = "bb", descriptor = "I")
	public int anInt7094 = 0;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIII)V")
	public Class3_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "(I)I")
	@Override
	public int method8617() {
		@Pc(14) Class301 local14 = Static635.aClass336_2.method8424(this.anInt7082);
		@Pc(17) int local17 = local14.anInt9189;
		@Pc(28) Class301 local28;
		if (this.anInt7090 != -1) {
			local28 = Static635.aClass336_2.method8424(this.anInt7090);
			if (local28.anInt9189 > local17) {
				local17 = local28.anInt9189;
			}
		}
		if (this.anInt7081 != -1) {
			local28 = Static635.aClass336_2.method8424(this.anInt7081);
			if (local17 < local28.anInt9189) {
				local17 = local28.anInt9189;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(Lclient!ha;I)Lclient!hw;")
	@Override
	public Class142 method8605(@OriginalArg(0) Class20 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Z)I")
	@Override
	public int method8618() {
		return -10;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8611(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8615(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class30 local6 = arg0.method7308();
		local6.method4649(super.anInt10303, super.anInt10306 - 10, super.anInt10310);
		@Pc(24) Class301 local24 = Static635.aClass336_2.method8424(this.anInt7082);
		@Pc(37) Class166 local37 = local24.method7705(null, null, arg0, 131072, 0, this.anInt7086, 0, -1);
		if (local37 != null && (Static639.aBoolean753 ? local37.method6693(arg2, arg1, local6, true, local24.anInt9189, Static380.anInt7419) : local37.method6698(arg2, arg1, local6, true, local24.anInt9189))) {
			return true;
		}
		@Pc(74) Class301 local74;
		if (this.anInt7090 != -1) {
			local74 = Static635.aClass336_2.method8424(this.anInt7090);
			local37 = local74.method7705(null, null, arg0, 131072, 0, this.anInt7091, 0, -1);
			if (local37 != null && (Static639.aBoolean753 ? local37.method6693(arg2, arg1, local6, true, local74.anInt9189, Static380.anInt7419) : local37.method6698(arg2, arg1, local6, true, local74.anInt9189))) {
				return true;
			}
		}
		if (this.anInt7081 != -1) {
			local74 = Static635.aClass336_2.method8424(this.anInt7081);
			local37 = local74.method7705(null, null, arg0, 131072, 0, this.anInt7087, 0, -1);
			if (local37 != null && (Static639.aBoolean753 ? local37.method6693(arg2, arg1, local6, true, local74.anInt9189, Static380.anInt7419) : local37.method6698(arg2, arg1, local6, true, local74.anInt9189))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(ILclient!ha;)Lclient!jda;")
	@Override
	public Class3_Sub4 method8610(@OriginalArg(1) Class20 arg0) {
		@Pc(25) Class243 local25 = Static471.method7420(super.aByte132, super.anInt10303 >> Static151.anInt3896, super.anInt10310 >> Static151.anInt3896);
		if (local25 != null && local25.aClass3_Sub1_Sub3_1.aBoolean687) {
			@Pc(36) int local36 = local25.aClass3_Sub1_Sub3_1.method8618();
			if (this.anInt7094 != local36) {
				super.anInt10306 -= this.anInt7094;
				this.anInt7094 = local36;
				super.anInt10306 += local36;
			}
		}
		@Pc(59) Class30 local59 = arg0.method7308();
		local59.method4665();
		if (local25 == null || !local25.aClass3_Sub1_Sub3_1.aBoolean687) {
			@Pc(78) Class65 local78 = Static9.aClass65Array1[super.aByte131];
			@Pc(83) int local83 = this.anInt7085 << 1;
			@Pc(90) int local90 = -local83 / 2;
			@Pc(95) int local95 = -local83 / 2;
			@Pc(107) int local107 = local78.method7999(super.anInt10303 + local90, super.anInt10310 + local95);
			@Pc(111) int local111 = local83 / 2;
			@Pc(116) int local116 = -local83 / 2;
			@Pc(129) int local129 = local78.method7999(local111 + super.anInt10303, super.anInt10310 - -local116);
			@Pc(134) int local134 = -local83 / 2;
			@Pc(138) int local138 = local83 / 2;
			@Pc(150) int local150 = local78.method7999(super.anInt10303 + local134, local138 + super.anInt10310);
			@Pc(154) int local154 = local83 / 2;
			@Pc(158) int local158 = local83 / 2;
			@Pc(170) int local170 = local78.method7999(super.anInt10303 + local154, super.anInt10310 + local158);
			@Pc(177) int local177 = local107 >= local129 ? local129 : local107;
			@Pc(188) int local188 = local170 > local150 ? local150 : local170;
			@Pc(199) int local199 = local129 < local170 ? local129 : local170;
			if (local83 != 0) {
				@Pc(215) int local215 = (int) (Math.atan2((double) (local177 - local188), (double) local83) * 2607.5945876176133D) & 0x3FFF;
				if (local215 != 0) {
					local59.method4655(local215);
				}
			}
			@Pc(231) int local231 = local107 >= local150 ? local150 : local107;
			@Pc(236) int local236 = local107 + local170;
			if (local83 != 0) {
				@Pc(251) int local251 = (int) (Math.atan2((double) (local231 - local199), (double) local83) * 2607.5945876176133D) & 0x3FFF;
				if (local251 != 0) {
					local59.method4663(-local251);
				}
			}
			if (local236 > local150 + local129) {
				local236 = local150 + local129;
			}
			local236 = (local236 >> 1) - super.anInt10306;
			if (local236 != 0) {
				local59.method4646(0, local236, 0);
			}
		}
		local59.method4646(super.anInt10303, super.anInt10306 - 10, super.anInt10310);
		@Pc(303) Class3_Sub4 local303 = Static546.method8162(3, true);
		this.aBoolean517 = false;
		this.anInt7085 = 0;
		@Pc(333) Class166 local333;
		if (this.anInt7081 != -1) {
			local333 = Static635.aClass336_2.method8424(this.anInt7081).method7705(null, null, arg0, 2048, 0, this.anInt7087, 0, -1);
			if (local333 != null) {
				if (Static639.aBoolean753) {
					local333.method6678(local59, local303.aClass3_Sub3Array1[2], Static380.anInt7419, 0);
				} else {
					local333.method6685(local59, local303.aClass3_Sub3Array1[2], 0);
				}
				this.aBoolean517 |= local333.F();
				this.anInt7085 = local333.ma();
			}
		}
		if (this.anInt7090 != -1) {
			local333 = Static635.aClass336_2.method8424(this.anInt7090).method7705(null, null, arg0, 2048, 0, this.anInt7091, 0, -1);
			if (local333 != null) {
				if (Static639.aBoolean753) {
					local333.method6678(local59, local303.aClass3_Sub3Array1[1], Static380.anInt7419, 0);
				} else {
					local333.method6685(local59, local303.aClass3_Sub3Array1[1], 0);
				}
				this.aBoolean517 |= local333.F();
				if (local333.ma() > this.anInt7085) {
					this.anInt7085 = local333.ma();
				}
			}
		}
		local333 = Static635.aClass336_2.method8424(this.anInt7082).method7705(null, null, arg0, 2048, 0, this.anInt7086, 0, -1);
		if (local333 != null) {
			if (Static639.aBoolean753) {
				local333.method6678(local59, local303.aClass3_Sub3Array1[0], Static380.anInt7419, 0);
			} else {
				local333.method6685(local59, local303.aClass3_Sub3Array1[0], 0);
			}
			this.aBoolean517 |= local333.F();
			if (local333.ma() > this.anInt7085) {
				this.anInt7085 = local333.ma();
			}
		}
		return local303;
	}

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "(I)I")
	@Override
	public int method8603(@OriginalArg(0) int arg0) {
		if (arg0 != -25675) {
			Static355.aClass234_18 = null;
		}
		return this.anInt7085;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8601() {
		return this.aBoolean517;
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8600() {
		return false;
	}
}
