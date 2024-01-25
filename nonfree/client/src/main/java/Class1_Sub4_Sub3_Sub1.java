import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub4_Sub3_Sub1 extends Class1_Sub4_Sub3 {

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	public int anInt4737;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	public int anInt4738;

	@OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "I")
	private int anInt4734 = 0;

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	public int anInt4736 = -1;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "I")
	public int anInt4735 = 0;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "I")
	public int anInt4748 = -1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIII)V")
	public Class1_Sub4_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!r;Z)V")
	@Override
	public void method8124(@OriginalArg(0) Class44 arg0) {
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method8128() {
		return this.aBoolean335;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!r;B)Lclient!lt;")
	@Override
	public Class1_Sub8 method8130(@OriginalArg(0) Class44 arg0) {
		@Pc(17) Class289 local17 = Static463.method5951(super.aByte126, super.anInt9934 >> Static145.anInt3093, super.anInt9935 >> Static145.anInt3093);
		if (local17 != null && local17.aClass1_Sub4_Sub2_1.aBoolean698) {
			@Pc(28) int local28 = local17.aClass1_Sub4_Sub2_1.method8117();
			if (this.anInt4735 != local28) {
				super.anInt9932 -= this.anInt4735;
				super.anInt9932 += local28;
				this.anInt4735 = local28;
			}
		}
		@Pc(55) Class8 local55 = arg0.method5007();
		local55.Y();
		if (local17 == null || !local17.aClass1_Sub4_Sub2_1.aBoolean698) {
			@Pc(74) Class83 local74 = Static499.aClass83Array3[super.aByte127];
			@Pc(79) int local79 = this.anInt4734 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method7213(super.anInt9934 + local86, super.anInt9935 + local91);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(126) int local126 = local74.method7213(super.anInt9934 + local107, super.anInt9935 - -local112);
			@Pc(131) int local131 = -local79 / 2;
			@Pc(135) int local135 = local79 / 2;
			@Pc(147) int local147 = local74.method7213(local131 + super.anInt9934, super.anInt9935 + local135);
			@Pc(151) int local151 = local79 / 2;
			@Pc(155) int local155 = local79 / 2;
			@Pc(167) int local167 = local74.method7213(local151 + super.anInt9934, super.anInt9935 + local155);
			@Pc(174) int local174 = local103 < local126 ? local103 : local126;
			@Pc(181) int local181 = local167 <= local147 ? local167 : local147;
			@Pc(188) int local188 = local167 <= local126 ? local167 : local126;
			if (local79 != 0) {
				@Pc(207) int local207 = (int) (Math.atan2((double) (local174 - local181), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local207 != 0) {
					local55.w(local207);
				}
			}
			@Pc(223) int local223 = local103 < local147 ? local103 : local147;
			@Pc(227) int local227 = local167 + local103;
			if (local79 != 0) {
				@Pc(246) int local246 = (int) (Math.atan2((double) (local223 - local188), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local246 != 0) {
					local55.AA(-local246);
				}
			}
			if (local227 > local126 + local147) {
				local227 = local147 + local126;
			}
			local227 = (local227 >> 1) - super.anInt9932;
			if (local227 != 0) {
				local55.U(0, local227, 0);
			}
		}
		local55.U(super.anInt9934, super.anInt9932 - 10, super.anInt9935);
		@Pc(306) Class1_Sub8 local306 = Static361.method5833(3);
		this.aBoolean335 = false;
		this.anInt4734 = 0;
		@Pc(336) Class57 local336;
		if (this.anInt4748 != -1) {
			local336 = Static521.aClass273_2.method6712(this.anInt4748).method5893(0, arg0, -1, null, 0, null, 2048, this.anInt4737);
			if (local336 != null) {
				if (Static361.aBoolean500) {
					local336.method7919(local55, local306.aClass1_Sub9Array1[2], Static6.anInt161, 0);
				} else {
					local336.method7927(local55, local306.aClass1_Sub9Array1[2], 0);
				}
				this.aBoolean335 |= local336.LA();
				this.anInt4734 = local336.RA();
			}
		}
		if (this.anInt4736 != -1) {
			local336 = Static521.aClass273_2.method6712(this.anInt4736).method5893(0, arg0, -1, null, 0, null, 2048, this.anInt4747);
			if (local336 != null) {
				if (Static361.aBoolean500) {
					local336.method7919(local55, local306.aClass1_Sub9Array1[1], Static6.anInt161, 0);
				} else {
					local336.method7927(local55, local306.aClass1_Sub9Array1[1], 0);
				}
				this.aBoolean335 |= local336.LA();
				if (local336.RA() > this.anInt4734) {
					this.anInt4734 = local336.RA();
				}
			}
		}
		local336 = Static521.aClass273_2.method6712(this.anInt4738).method5893(0, arg0, -1, null, 0, null, 2048, this.anInt4744);
		if (local336 != null) {
			if (Static361.aBoolean500) {
				local336.method7919(local55, local306.aClass1_Sub9Array1[0], Static6.anInt161, 0);
			} else {
				local336.method7927(local55, local306.aClass1_Sub9Array1[0], 0);
			}
			this.aBoolean335 |= local336.LA();
			if (local336.RA() > this.anInt4734) {
				this.anInt4734 = local336.RA();
			}
		}
		return local306;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8118() {
		return false;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I")
	@Override
	public int method8117() {
		return -10;
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(BLclient!r;)Lclient!sr;")
	@Override
	public Class308 method8121(@OriginalArg(1) Class44 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I")
	@Override
	public int method8123(@OriginalArg(0) byte arg0) {
		if (arg0 != -117) {
			this.anInt4735 = -55;
		}
		return this.anInt4734;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!r;III)Z")
	@Override
	public boolean method8116(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class8 local12 = arg0.method5007();
		local12.NA(super.anInt9934, super.anInt9932 - 10, super.anInt9935);
		@Pc(39) Class57 local39 = Static521.aClass273_2.method6712(this.anInt4738).method5893(0, arg0, -1, null, 0, null, 131072, this.anInt4744);
		if (local39 != null && (Static361.aBoolean500 ? local39.method7924(arg1, arg2, local12, true, Static6.anInt161) : local39.method7933(arg1, arg2, local12, true))) {
			return true;
		}
		if (this.anInt4736 != -1) {
			local39 = Static521.aClass273_2.method6712(this.anInt4736).method5893(0, arg0, -1, null, 0, null, 131072, this.anInt4747);
			if (local39 != null && (Static361.aBoolean500 ? local39.method7924(arg1, arg2, local12, true, Static6.anInt161) : local39.method7933(arg1, arg2, local12, true))) {
				return true;
			}
		}
		if (this.anInt4748 != -1) {
			local39 = Static521.aClass273_2.method6712(this.anInt4748).method5893(0, arg0, -1, null, 0, null, 131072, this.anInt4737);
			if (local39 != null && (Static361.aBoolean500 ? local39.method7924(arg1, arg2, local12, true, Static6.anInt161) : local39.method7933(arg1, arg2, local12, true))) {
				return true;
			}
		}
		return false;
	}
}
