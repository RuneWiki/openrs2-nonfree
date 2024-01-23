import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class53_Sub1_Sub2 extends Class53_Sub1 {

	@OriginalMember(owner = "client!p", name = "oc", descriptor = "Lclient!ua;")
	public Class171 aClass171_1;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ua;)V")
	public void method3330(@OriginalArg(1) Class171 arg0) {
		this.aClass171_1 = arg0;
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2965();
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3323() {
		return this.aClass171_1 != null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		if (this.aClass171_1 == null) {
			return;
		}
		@Pc(28) Class46 local28 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static156.method2501(this.anInt4007) : null;
		@Pc(54) Class46 local54 = this.anInt4005 == -1 || this.anInt4005 == this.method3327().anInt860 && local28 != null ? null : Static156.method2501(this.anInt4005);
		@Pc(75) Class53_Sub4 local75 = this.aClass171_1.method4305(this.anInt3970, this.anInt4000, local54, local28, this.anInt4011, this.aClass153Array3, this.anInt4019, this.anInt4046, this.anInt4044);
		if (local75 == null) {
			return;
		}
		this.anInt4016 = local75.method3850();
		@Pc(86) Class171 local86 = this.aClass171_1;
		if (local86.anIntArray590 != null) {
			local86 = local86.method4302();
		}
		@Pc(141) Class53_Sub4 local141;
		if (Static66.aBoolean75 && local86.aBoolean355) {
			local141 = Static48.method745(this.aClass171_1.aShort46, local54 == null ? local28 : local54, arg0, this.aClass171_1.anInt5263, this.aClass171_1.aByte20, local75, local54 == null ? this.anInt3970 : this.anInt4046, this.anInt4006, this.anInt4002, this.aBoolean284, this.aClass171_1.aShort47, this.aClass171_1.aByte19, this.anInt3974);
			if (Static94.aBoolean138) {
				@Pc(145) float local145 = Static94.method1620();
				@Pc(147) float local147 = Static94.method1612();
				Static94.method1589();
				Static94.method1621(local145, local147 - 150.0F);
				local141.method3842(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub3_6);
				Static94.method1591();
				Static94.method1621(local145, local147);
			} else {
				local141.method3842(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass20_Sub3_6);
			}
		}
		local141 = null;
		this.method3318(local75);
		this.method3325(local75, arg0);
		if (this.anInt3961 != -1 && this.anInt4026 != -1) {
			@Pc(214) Class112 local214 = Static132.method2005(this.anInt3961);
			local141 = local214.method2582(this.anInt3976, this.anInt3968, this.anInt4026);
			if (local141 != null) {
				local141.method3860(0, -this.anInt3971, 0);
				if (local214.aBoolean221) {
					if (Static185.anInt3525 != 0) {
						local141.method3869(Static185.anInt3525);
					}
					if (Static258.anInt4908 != 0) {
						local141.method3854(Static258.anInt4908);
					}
					if (Static143.anInt2747 != 0) {
						local141.method3860(0, Static143.anInt2747, 0);
					}
				}
			}
		}
		if (!Static94.aBoolean138) {
			if (local141 != null) {
				local75 = ((Class53_Sub4_Sub1) local75).method2916(local141);
			}
			this.method3328(local75, local141);
			if (this.aClass171_1.anInt5263 == 1) {
				local75.aBoolean325 = true;
			}
			local75.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
			return;
		}
		this.method3328(local75, local141);
		if (this.aClass171_1.anInt5263 == 1) {
			local75.aBoolean325 = true;
		}
		local75.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
		if (local141 == null) {
			return;
		}
		if (this.aClass171_1.anInt5263 == 1) {
			local141.aBoolean325 = true;
		}
		if (this.aClass20_Sub3_6 != null) {
			@Pc(352) Class53_Sub4_Sub2 local352 = (Class53_Sub4_Sub2) local141;
			this.aClass20_Sub3_6.method2980(local352.aClass161Array3, local352.aClass170Array3, true, local352.anIntArray507, local352.anIntArray504, local352.anIntArray502);
		}
		local141.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass20_Sub3_6);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		return this.anInt4016;
	}

	@OriginalMember(owner = "client!p", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2971();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass171_1 == null) {
			return;
		}
		if (!this.aBoolean285) {
			@Pc(28) Class46 local28 = this.anInt4007 != -1 && this.anInt3996 == 0 ? Static156.method2501(this.anInt4007) : null;
			@Pc(52) Class46 local52 = this.anInt4005 == -1 || this.anInt4005 == this.method3327().anInt860 && local28 != null ? null : Static156.method2501(this.anInt4005);
			@Pc(73) Class53_Sub4 local73 = this.aClass171_1.method4305(this.anInt3970, this.anInt4000, local52, local28, this.anInt4011, this.aClass153Array3, this.anInt4019, this.anInt4046, this.anInt4044);
			if (local73 == null) {
				return;
			}
			this.method3328(local73, null);
		}
		if (this.aClass20_Sub3_6 != null) {
			this.aClass20_Sub3_6.method2962(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I")
	@Override
	protected int method3316() {
		if (this.aClass171_1.anIntArray590 != null) {
			@Pc(17) Class171 local17 = this.aClass171_1.method4302();
			if (local17 != null && local17.anInt5262 != -1) {
				return local17.anInt5262;
			}
		}
		return this.anInt3986;
	}
}
