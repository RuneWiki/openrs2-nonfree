import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class8_Sub3_Sub5_Sub1 extends Class8_Sub3_Sub5 {

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
	public int anInt8970;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
	public int anInt8976;

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
	public int anInt8978;

	@OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
	public int anInt8982;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
	public int anInt8972 = -1;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "I")
	public int anInt8967 = -1;

	@OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
	private int anInt8975 = 0;

	@OriginalMember(owner = "client!uo", name = "R", descriptor = "Z")
	private boolean aBoolean697 = false;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub3_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)I")
	@Override
	public int method7618() {
		return -10;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)I")
	@Override
	public int method7628(@OriginalArg(0) byte arg0) {
		return arg0 < 39 ? -70 : this.anInt8975;
	}

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method7620() {
		return this.aBoolean697;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Lclient!r;Z)Lclient!kq;")
	@Override
	public Class8_Sub5 method7630(@OriginalArg(0) Class134 arg0) {
		@Pc(27) Class111 local27 = Static90.method1579(super.aByte123, super.anInt9365 >> Static351.anInt5832, super.anInt9370 >> Static351.anInt5832);
		@Pc(30) Class113 local30 = arg0.method6963();
		local30.Y();
		if (local27 == null || !local27.aClass8_Sub3_Sub3_1.aBoolean731) {
			@Pc(49) Class47 local49 = Static199.aClass47Array1[super.aByte124];
			@Pc(54) int local54 = this.anInt8975 << 1;
			@Pc(61) int local61 = -local54 / 2;
			@Pc(66) int local66 = -local54 / 2;
			@Pc(79) int local79 = local49.method7550(super.anInt9365 + local61, local66 + super.anInt9370);
			@Pc(83) int local83 = local54 / 2;
			@Pc(88) int local88 = -local54 / 2;
			@Pc(100) int local100 = local49.method7550(super.anInt9365 + local83, local88 + super.anInt9370);
			@Pc(105) int local105 = -local54 / 2;
			@Pc(109) int local109 = local54 / 2;
			@Pc(122) int local122 = local49.method7550(super.anInt9365 + local105, local109 + super.anInt9370);
			@Pc(126) int local126 = local54 / 2;
			@Pc(130) int local130 = local54 / 2;
			@Pc(143) int local143 = local49.method7550(local126 + super.anInt9365, super.anInt9370 - -local130);
			@Pc(154) int local154 = local79 >= local100 ? local100 : local79;
			@Pc(161) int local161 = local122 >= local143 ? local143 : local122;
			@Pc(168) int local168 = local100 >= local143 ? local143 : local100;
			@Pc(179) int local179 = local122 <= local79 ? local122 : local79;
			if (local54 != 0) {
				@Pc(195) int local195 = (int) (Math.atan2((double) (local154 - local161), (double) local54) * 2607.5945876176133D) & 0x3FFF;
				if (local195 != 0) {
					local30.w(local195);
				}
			}
			@Pc(204) int local204 = local79 + local143;
			if (local54 != 0) {
				@Pc(223) int local223 = (int) (Math.atan2((double) (local179 - local168), (double) local54) * 2607.5945876176133D) & 0x3FFF;
				if (local223 != 0) {
					local30.AA(-local223);
				}
			}
			if (local204 > local100 + local122) {
				local204 = local122 + local100;
			}
			local204 = (local204 >> 1) - super.anInt9361;
			if (local204 != 0) {
				local30.U(0, local204, 0);
			}
		}
		local30.U(super.anInt9365, super.anInt9361 - 10, super.anInt9370);
		if (local27 != null && local27.aClass8_Sub3_Sub3_1.aBoolean731) {
			local30.U(0, local27.aClass8_Sub3_Sub3_1.method7618(), 0);
		}
		@Pc(288) Class8_Sub5 local288 = Static418.method5818(3);
		this.anInt8975 = 0;
		this.aBoolean697 = false;
		@Pc(316) Class63 local316;
		if (this.anInt8972 != -1) {
			local316 = Static175.aClass114_4.method2217(this.anInt8972).method5005(0, 2048, -1, this.anInt8970, null, 0, arg0, null);
			if (local316 != null) {
				if (Static181.aBoolean242) {
					local316.method7420(local30, local288.aClass8_Sub4Array1[2], Static40.anInt631, 0);
				} else {
					local316.method7429(local30, local288.aClass8_Sub4Array1[2], 0);
				}
				this.aBoolean697 |= local316.LA();
				this.anInt8975 = local316.RA();
			}
		}
		if (this.anInt8967 != -1) {
			local316 = Static175.aClass114_4.method2217(this.anInt8967).method5005(0, 2048, -1, this.anInt8982, null, 0, arg0, null);
			if (local316 != null) {
				if (Static181.aBoolean242) {
					local316.method7420(local30, local288.aClass8_Sub4Array1[1], Static40.anInt631, 0);
				} else {
					local316.method7429(local30, local288.aClass8_Sub4Array1[1], 0);
				}
				this.aBoolean697 |= local316.LA();
				if (local316.RA() > this.anInt8975) {
					this.anInt8975 = local316.RA();
				}
			}
		}
		local316 = Static175.aClass114_4.method2217(this.anInt8978).method5005(0, 2048, -1, this.anInt8976, null, 0, arg0, null);
		if (local316 != null) {
			if (Static181.aBoolean242) {
				local316.method7420(local30, local288.aClass8_Sub4Array1[0], Static40.anInt631, 0);
			} else {
				local316.method7429(local30, local288.aClass8_Sub4Array1[0], 0);
			}
			this.aBoolean697 |= local316.LA();
			if (local316.RA() > this.anInt8975) {
				this.anInt8975 = local316.RA();
			}
		}
		return local288;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7625(@OriginalArg(1) Class134 arg0) {
	}

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method7622() {
		return false;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(ILclient!r;)Lclient!nu;")
	@Override
	public Class242 method7627(@OriginalArg(1) Class134 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7626(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class113 local6 = arg1.method6963();
		local6.NA(super.anInt9365, super.anInt9361 - 10, super.anInt9370);
		@Pc(28) Class111 local28 = Static90.method1579(super.aByte123, super.anInt9365 >> Static351.anInt5832, super.anInt9370 >> Static351.anInt5832);
		if (local28 != null && local28.aClass8_Sub3_Sub3_1.aBoolean731) {
			local6.U(0, local28.aClass8_Sub3_Sub3_1.method7618(), 0);
		}
		@Pc(61) Class63 local61 = Static175.aClass114_4.method2217(this.anInt8978).method5005(0, 131072, -1, this.anInt8976, null, 0, arg1, null);
		if (local61 != null && Static181.aBoolean242 ? local61.method7419(arg2, arg0, local6, true, Static40.anInt631) : local61.method7415(arg2, arg0, local6, true)) {
			return true;
		}
		if (this.anInt8967 != -1) {
			local61 = Static175.aClass114_4.method2217(this.anInt8967).method5005(0, 131072, -1, this.anInt8982, null, 0, arg1, null);
			if (local61 != null && Static181.aBoolean242 ? local61.method7419(arg2, arg0, local6, true, Static40.anInt631) : local61.method7415(arg2, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt8972 != -1) {
			local61 = Static175.aClass114_4.method2217(this.anInt8972).method5005(0, 131072, -1, this.anInt8970, null, 0, arg1, null);
			if (local61 != null && Static181.aBoolean242 ? local61.method7419(arg2, arg0, local6, true, Static40.anInt631) : local61.method7415(arg2, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
