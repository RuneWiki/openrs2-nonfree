import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class4_Sub2_Sub5_Sub1 extends Class4_Sub2_Sub5 {

	@OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
	public int anInt10254;

	@OriginalMember(owner = "client!vv", name = "T", descriptor = "I")
	public int anInt10257;

	@OriginalMember(owner = "client!vv", name = "X", descriptor = "I")
	public int anInt10261;

	@OriginalMember(owner = "client!vv", name = "Y", descriptor = "I")
	public int anInt10262;

	@OriginalMember(owner = "client!vv", name = "E", descriptor = "I")
	public int anInt10249 = -1;

	@OriginalMember(owner = "client!vv", name = "V", descriptor = "I")
	private int anInt10259 = 0;

	@OriginalMember(owner = "client!vv", name = "P", descriptor = "I")
	public int anInt10253 = 0;

	@OriginalMember(owner = "client!vv", name = "M", descriptor = "Z")
	private boolean aBoolean733 = false;

	@OriginalMember(owner = "client!vv", name = "db", descriptor = "I")
	public int anInt10267 = -1;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIII)V")
	public Class4_Sub2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!vv", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method8733() {
		return false;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!ha;I)Lclient!kn;")
	@Override
	public Class200 method8720(@OriginalArg(0) Class133 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method8732(@OriginalArg(0) Class133 arg0) {
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILclient!ha;I)Z")
	@Override
	public boolean method8724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(6) Class113 local6 = arg2.method7262();
		local6.method8458(super.anInt10231, super.anInt10228 - 10, super.anInt10229);
		@Pc(22) Class255 local22 = Static643.aClass275_2.method6641(this.anInt10262);
		@Pc(35) Class187 local35 = local22.method5852(131072, null, null, this.anInt10254, 0, arg2, 0, -1);
		if (local35 != null && (Static57.aBoolean65 ? local35.method8641(arg0, arg1, local6, true, local22.anInt6563, Static469.anInt7885) : local35.method8642(arg0, arg1, local6, true, local22.anInt6563))) {
			return true;
		}
		if (this.anInt10267 != -1) {
			@Pc(70) Class255 local70 = Static643.aClass275_2.method6641(this.anInt10267);
			local35 = local70.method5852(131072, null, null, this.anInt10257, 0, arg2, 0, -1);
			if (local35 != null && (Static57.aBoolean65 ? local35.method8641(arg0, arg1, local6, true, local70.anInt6563, Static469.anInt7885) : local35.method8642(arg0, arg1, local6, true, local70.anInt6563))) {
				return true;
			}
		}
		if (this.anInt10249 != -1) {
			@Pc(127) Class255 local127 = Static643.aClass275_2.method6641(this.anInt10249);
			local35 = local127.method5852(131072, null, null, this.anInt10261, 0, arg2, 0, -1);
			if (local35 != null && (Static57.aBoolean65 ? local35.method8641(arg0, arg1, local6, true, local127.anInt6563, Static469.anInt7885) : local35.method8642(arg0, arg1, local6, true, local127.anInt6563))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(ILclient!ha;)Lclient!gh;")
	@Override
	public Class4_Sub6 method8721(@OriginalArg(1) Class133 arg0) {
		@Pc(17) Class290 local17 = Static316.method4834(super.aByte132, super.anInt10231 >> Static115.anInt2156, super.anInt10229 >> Static115.anInt2156);
		if (local17 != null && local17.aClass4_Sub2_Sub1_1.aBoolean678) {
			@Pc(28) int local28 = local17.aClass4_Sub2_Sub1_1.method8734();
			if (this.anInt10253 != local28) {
				super.anInt10228 -= this.anInt10253;
				super.anInt10228 += local28;
				this.anInt10253 = local28;
			}
		}
		@Pc(55) Class113 local55 = arg0.method7262();
		local55.method8460();
		if (local17 == null || !local17.aClass4_Sub2_Sub1_1.aBoolean678) {
			@Pc(74) Class61 local74 = Static11.aClass61Array1[super.aByte131];
			@Pc(79) int local79 = this.anInt10259 << 1;
			@Pc(86) int local86 = -local79 / 2;
			@Pc(91) int local91 = -local79 / 2;
			@Pc(103) int local103 = local74.method8584(local91 + super.anInt10229, super.anInt10231 + local86);
			@Pc(107) int local107 = local79 / 2;
			@Pc(112) int local112 = -local79 / 2;
			@Pc(124) int local124 = local74.method8584(super.anInt10229 + local112, local107 + super.anInt10231);
			@Pc(129) int local129 = -local79 / 2;
			@Pc(133) int local133 = local79 / 2;
			@Pc(145) int local145 = local74.method8584(local133 + super.anInt10229, local129 + super.anInt10231);
			@Pc(149) int local149 = local79 / 2;
			@Pc(153) int local153 = local79 / 2;
			@Pc(166) int local166 = local74.method8584(super.anInt10229 + local153, super.anInt10231 - -local149);
			@Pc(177) int local177 = local124 <= local103 ? local124 : local103;
			@Pc(188) int local188 = local166 > local145 ? local145 : local166;
			@Pc(199) int local199 = local124 >= local166 ? local166 : local124;
			@Pc(210) int local210 = local145 > local103 ? local103 : local145;
			if (local79 != 0) {
				@Pc(229) int local229 = (int) (Math.atan2((double) (local177 - local188), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local229 != 0) {
					local55.method8455(local229);
				}
			}
			if (local79 != 0) {
				@Pc(256) int local256 = (int) (Math.atan2((double) (local210 - local199), (double) local79) * 2607.5945876176133D) & 0x3FFF;
				if (local256 != 0) {
					local55.method8450(-local256);
				}
			}
			@Pc(266) int local266 = local103 + local166;
			if (local124 + local145 < local266) {
				local266 = local145 + local124;
			}
			local266 = (local266 >> 1) - super.anInt10228;
			if (local266 != 0) {
				local55.method8454(0, local266, 0);
			}
		}
		local55.method8454(super.anInt10231, super.anInt10228 - 10, super.anInt10229);
		@Pc(309) Class4_Sub6 local309 = Static242.method4012(3, true);
		this.aBoolean733 = false;
		this.anInt10259 = 0;
		@Pc(339) Class187 local339;
		if (this.anInt10249 != -1) {
			local339 = Static643.aClass275_2.method6641(this.anInt10249).method5852(2048, null, null, this.anInt10261, 0, arg0, 0, -1);
			if (local339 != null) {
				if (Static57.aBoolean65) {
					local339.method8654(local55, local309.aClass4_Sub9Array1[2], Static469.anInt7885, 0);
				} else {
					local339.method8645(local55, local309.aClass4_Sub9Array1[2], 0);
				}
				this.aBoolean733 |= local339.F();
				this.anInt10259 = local339.ma();
			}
		}
		if (this.anInt10267 != -1) {
			local339 = Static643.aClass275_2.method6641(this.anInt10267).method5852(2048, null, null, this.anInt10257, 0, arg0, 0, -1);
			if (local339 != null) {
				if (Static57.aBoolean65) {
					local339.method8654(local55, local309.aClass4_Sub9Array1[1], Static469.anInt7885, 0);
				} else {
					local339.method8645(local55, local309.aClass4_Sub9Array1[1], 0);
				}
				this.aBoolean733 |= local339.F();
				if (local339.ma() > this.anInt10259) {
					this.anInt10259 = local339.ma();
				}
			}
		}
		local339 = Static643.aClass275_2.method6641(this.anInt10262).method5852(2048, null, null, this.anInt10254, 0, arg0, 0, -1);
		if (local339 != null) {
			if (Static57.aBoolean65) {
				local339.method8654(local55, local309.aClass4_Sub9Array1[0], Static469.anInt7885, 0);
			} else {
				local339.method8645(local55, local309.aClass4_Sub9Array1[0], 0);
			}
			this.aBoolean733 |= local339.F();
			if (local339.ma() > this.anInt10259) {
				this.anInt10259 = local339.ma();
			}
		}
		return local309;
	}

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)I")
	@Override
	public int method8716() {
		@Pc(17) Class255 local17 = Static643.aClass275_2.method6641(this.anInt10262);
		@Pc(20) int local20 = local17.anInt6563;
		@Pc(31) Class255 local31;
		if (this.anInt10267 != -1) {
			local31 = Static643.aClass275_2.method6641(this.anInt10267);
			if (local20 < local31.anInt6563) {
				local20 = local31.anInt6563;
			}
		}
		if (this.anInt10249 != -1) {
			local31 = Static643.aClass275_2.method6641(this.anInt10249);
			if (local20 < local31.anInt6563) {
				local20 = local31.anInt6563;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "(B)I")
	@Override
	public int method8734() {
		return -10;
	}

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8727() {
		return this.aBoolean733;
	}

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "(I)I")
	@Override
	protected int method8730() {
		return this.anInt10259;
	}
}
