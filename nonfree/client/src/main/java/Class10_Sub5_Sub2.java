import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class10_Sub5_Sub2 extends Class10_Sub5 {

	@OriginalMember(owner = "client!sd", name = "Mc", descriptor = "Lclient!nn;")
	public Class124 aClass124_1;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)I")
	@Override
	protected int method4192() {
		if (this.aClass124_1.anIntArray432 != null) {
			@Pc(21) Class124 local21 = this.aClass124_1.method3191();
			if (local21 != null && local21.anInt3758 != -1) {
				return local21.anInt3758;
			}
		}
		return this.anInt5090;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)I")
	@Override
	public int method4190() {
		if (this.aClass124_1.anIntArray432 != null) {
			@Pc(19) Class124 local19 = this.aClass124_1.method3191();
			if (local19 != null && local19.anInt3787 != -1) {
				return local19.anInt3787;
			}
		}
		return this.aClass124_1.anInt3787;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILclient!em;)V")
	@Override
	public void method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class47_Sub1 arg10) {
		if (this.aClass124_1 == null) {
			return;
		}
		@Pc(25) Class15 local25 = this.anInt5061 != -1 && this.anInt5027 == 0 ? Static253.method4288(this.anInt5061) : null;
		@Pc(51) Class15 local51 = this.anInt5066 == -1 || this.anInt5066 == this.method4191().anInt912 && local25 != null ? null : Static253.method4288(this.anInt5066);
		@Pc(72) Class10_Sub4 local72 = this.aClass124_1.method3197(local51, this.anInt5081, this.aClass145Array3, this.anInt5025, this.anInt5035, local25, this.anInt5020, this.anInt5034, this.anInt5049);
		if (local72 == null) {
			return;
		}
		this.anInt5079 = local72.method4973();
		@Pc(84) Class124 local84 = this.aClass124_1;
		if (local84.anIntArray432 != null) {
			local84 = local84.method3191();
		}
		@Pc(140) Class10_Sub4 local140;
		if (Static199.aBoolean275 && local84.aBoolean265) {
			local140 = Static34.method529(local51 == null ? local25 : local51, this.anInt5046, this.aClass124_1.aShort35, this.aClass124_1.anInt3781, this.aClass124_1.aByte20, local72, this.aClass124_1.aByte21, this.anInt5016, this.anInt5073, this.aBoolean356, this.aClass124_1.aShort36, local51 == null ? this.anInt5049 : this.anInt5025, arg0);
			if (Static283.aBoolean393) {
				@Pc(144) float local144 = Static283.method4632();
				@Pc(146) float local146 = Static283.method4667();
				Static283.method4641();
				Static283.method4628(local144, local146 - 150.0F);
				local140.method4982(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass47_Sub1_4);
				Static283.method4653();
				Static283.method4628(local144, local146);
			} else {
				local140.method4982(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass47_Sub1_4);
			}
		}
		this.method4205(local72);
		this.method4202(local72, arg0);
		local140 = null;
		if (this.anInt5023 != -1 && this.anInt5047 != -1) {
			@Pc(214) Class173 local214 = Static297.method1843(this.anInt5023);
			local140 = local214.method4451(this.anInt5047, this.anInt5069, this.anInt5101);
			if (local140 != null) {
				local140.method1964(0, -this.anInt5033, 0);
				if (local214.aBoolean379) {
					if (Static36.anInt642 != 0) {
						local140.method1958(Static36.anInt642);
					}
					if (Static22.anInt423 != 0) {
						local140.method1947(Static22.anInt423);
					}
					if (Static50.anInt948 != 0) {
						local140.method1964(0, Static50.anInt948, 0);
					}
				}
			}
		}
		if (!Static283.aBoolean393) {
			if (local140 != null) {
				local72 = ((Class10_Sub4_Sub2) local72).method1973(local140);
			}
			this.method4203(local72, local140);
			if (this.aClass124_1.anInt3781 == 1) {
				local72.aBoolean171 = true;
			}
			local72.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
			return;
		}
		this.method4203(local72, local140);
		if (this.aClass124_1.anInt3781 == 1) {
			local72.aBoolean171 = true;
		}
		local72.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
		if (local140 == null) {
			return;
		}
		if (this.aClass124_1.anInt3781 == 1) {
			local140.aBoolean171 = true;
		}
		if (this.aClass47_Sub1_4 != null) {
			@Pc(309) Class10_Sub4_Sub1 local309 = (Class10_Sub4_Sub1) local140;
			this.aClass47_Sub1_4.method1089(local309.aClass190Array2, local309.aClass67Array2, true, local309.anIntArray174, local309.anIntArray177, local309.anIntArray173);
		}
		local140.method4982(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass47_Sub1_4);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
	@Override
	public int method4973() {
		return this.anInt5079;
	}

	@OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1092();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!nn;I)V")
	public void method4209(@OriginalArg(0) Class124 arg0) {
		this.aClass124_1 = arg0;
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1072();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)I")
	@Override
	public int method4187() {
		if (this.aClass124_1.anIntArray432 != null) {
			@Pc(14) Class124 local14 = this.aClass124_1.method3191();
			if (local14 != null && local14.anInt3757 != -1) {
				return local14.anInt3757;
			}
		}
		return this.aClass124_1.anInt3757 == -1 ? super.method4187() : this.aClass124_1.anInt3757;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4189() {
		return this.aClass124_1 != null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass124_1 == null) {
			return;
		}
		if (!this.aBoolean355) {
			@Pc(27) Class15 local27 = this.anInt5061 != -1 && this.anInt5027 == 0 ? Static253.method4288(this.anInt5061) : null;
			@Pc(52) Class15 local52 = this.anInt5066 == -1 || this.anInt5066 == this.method4191().anInt912 && local27 != null ? null : Static253.method4288(this.anInt5066);
			@Pc(73) Class10_Sub4 local73 = this.aClass124_1.method3197(local52, this.anInt5081, this.aClass145Array3, this.anInt5025, this.anInt5035, local27, this.anInt5020, this.anInt5034, this.anInt5049);
			if (local73 == null) {
				return;
			}
			this.method4203(local73, null);
		}
		if (this.aClass47_Sub1_4 != null) {
			this.aClass47_Sub1_4.method1093(arg0, arg1, arg3, arg2, arg4);
		}
	}
}
