import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class11_Sub4_Sub2 extends Class11_Sub4 {

	@OriginalMember(owner = "client!od", name = "lc", descriptor = "Lclient!vn;")
	public Class183 aClass183_1;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)I")
	@Override
	protected int method3351() {
		if (this.aClass183_1.anIntArray596 != null) {
			@Pc(17) Class183 local17 = this.aClass183_1.method4526();
			if (local17 != null && local17.anInt5425 != -1) {
				return local17.anInt5425;
			}
		}
		return this.anInt3803;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt3793;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method3354() {
		return this.aClass183_1 != null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!vn;)V")
	public void method3365(@OriginalArg(1) Class183 arg0) {
		this.aClass183_1 = arg0;
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method958();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		if (this.aClass183_1 == null) {
			return;
		}
		@Pc(27) Class152 local27 = this.anInt3864 != -1 && this.anInt3798 == 0 ? Static107.method2016(this.anInt3864) : null;
		@Pc(54) Class152 local54 = this.anInt3828 == -1 || this.anInt3828 == this.method3348().anInt869 && local27 != null ? null : Static107.method2016(this.anInt3828);
		@Pc(75) Class11_Sub1 local75 = this.aClass183_1.method4510(local54, this.anInt3826, local27, this.anInt3847, this.anInt3850, this.aClass14Array3, this.anInt3794, this.anInt3842, this.anInt3799);
		if (local75 == null) {
			return;
		}
		this.anInt3793 = local75.method4297();
		@Pc(85) Class183 local85 = this.aClass183_1;
		if (local85.anIntArray596 != null) {
			local85 = local85.method4526();
		}
		@Pc(138) Class11_Sub1 local138;
		if (Static294.aBoolean109 && local85.aBoolean513) {
			local138 = Static53.method980(this.aBoolean338, arg0, this.aClass183_1.aShort50, this.aClass183_1.aShort49, local75, this.anInt3865, this.aClass183_1.anInt5436, this.aClass183_1.aByte19, local54 == null ? local27 : local54, this.anInt3856, local54 == null ? this.anInt3847 : this.anInt3799, this.aClass183_1.aByte21, this.anInt3839);
			if (Static71.aBoolean165) {
				@Pc(158) float local158 = Static71.method1406();
				@Pc(160) float local160 = Static71.method1393();
				Static71.method1384();
				Static71.method1398(local158, local160 - 150.0F);
				local138.method4299(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass22_Sub3_6);
				Static71.method1395();
				Static71.method1398(local158, local160);
			} else {
				local138.method4299(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass22_Sub3_6);
			}
		}
		this.method3360(local75);
		this.method3350(local75, arg0);
		local138 = null;
		if (this.anInt3857 != -1 && this.anInt3788 != -1) {
			@Pc(212) Class15 local212 = Static226.method3632(this.anInt3857);
			local138 = local212.method496(this.anInt3788, this.anInt3795, this.anInt3801);
			if (local138 != null) {
				local138.method2913(0, -this.anInt3805, 0);
				if (local212.aBoolean52) {
					if (Static223.anInt4195 != 0) {
						local138.method2896(Static223.anInt4195);
					}
					if (Static96.anInt2076 != 0) {
						local138.method2917(Static96.anInt2076);
					}
					if (Static83.anInt1854 != 0) {
						local138.method2913(0, Static83.anInt1854, 0);
					}
				}
			}
		}
		if (!Static71.aBoolean165) {
			if (local138 != null) {
				local75 = ((Class11_Sub1_Sub2) local75).method2938(local138);
			}
			this.method3346(local138, local75);
			if (this.aClass183_1.anInt5436 == 1) {
				local75.aBoolean288 = true;
			}
			local75.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
			return;
		}
		this.method3346(local138, local75);
		if (this.aClass183_1.anInt5436 == 1) {
			local75.aBoolean288 = true;
		}
		local75.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
		if (local138 == null) {
			return;
		}
		if (this.aClass183_1.anInt5436 == 1) {
			local138.aBoolean288 = true;
		}
		if (this.aClass22_Sub3_6 != null) {
			@Pc(307) Class11_Sub1_Sub1 local307 = (Class11_Sub1_Sub1) local138;
			this.aClass22_Sub3_6.method971(local307.aClass146Array1, local307.aClass76Array1, true, local307.anIntArray46, local307.anIntArray45, local307.anIntArray41);
		}
		local138.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass22_Sub3_6);
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method955();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass183_1 == null) {
			return;
		}
		if (!this.aBoolean335) {
			@Pc(29) Class152 local29 = this.anInt3864 != -1 && this.anInt3798 == 0 ? Static107.method2016(this.anInt3864) : null;
			@Pc(54) Class152 local54 = this.anInt3828 == -1 || this.anInt3828 == this.method3348().anInt869 && local29 != null ? null : Static107.method2016(this.anInt3828);
			@Pc(75) Class11_Sub1 local75 = this.aClass183_1.method4510(local54, this.anInt3826, local29, this.anInt3847, this.anInt3850, this.aClass14Array3, this.anInt3794, this.anInt3842, this.anInt3799);
			if (local75 == null) {
				return;
			}
			this.method3346(null, local75);
		}
		if (this.aClass22_Sub3_6 != null) {
			this.aClass22_Sub3_6.method972(arg0, arg1, arg3, arg2, arg4);
		}
	}
}
