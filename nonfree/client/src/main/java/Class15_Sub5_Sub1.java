import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class15_Sub5_Sub1 extends Class15_Sub5 {

	@OriginalMember(owner = "client!o", name = "zc", descriptor = "Lclient!ld;")
	public Class99 aClass99_1;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
	@Override
	protected int method4687() {
		if (this.aClass99_1.anIntArray255 != null) {
			@Pc(22) Class99 local22 = this.aClass99_1.method2647();
			if (local22 != null && local22.anInt3069 != -1) {
				return local22.anInt3069;
			}
		}
		return this.anInt5543;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4685() {
		return this.aClass99_1 != null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
	@Override
	public int method4676() {
		return this.anInt5513;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ld;)V")
	public void method3200(@OriginalArg(1) Class99 arg0) {
		this.aClass99_1 = arg0;
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2727();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass99_1 == null) {
			return;
		}
		if (!this.aBoolean374) {
			@Pc(28) Class157 local28 = this.anInt5594 != -1 && this.anInt5585 == 0 ? Static80.method1561(this.anInt5594) : null;
			@Pc(50) Class157 local50 = this.anInt5569 == -1 || this.anInt5569 == this.method4698().anInt206 && local28 != null ? null : Static80.method1561(this.anInt5569);
			@Pc(71) Class15_Sub2 local71 = this.aClass99_1.method2655(this.anInt5516, local28, this.anInt5537, local50, this.anInt5539, this.aClass14Array3, this.anInt5522, this.anInt5521, this.anInt5544);
			if (local71 == null) {
				return;
			}
			this.method4688(null, local71);
		}
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2719(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJILclient!lg;)V")
	@Override
	public void method4678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class87_Sub2 arg10) {
		if (this.aClass99_1 == null) {
			return;
		}
		@Pc(29) Class157 local29 = this.anInt5594 != -1 && this.anInt5585 == 0 ? Static80.method1561(this.anInt5594) : null;
		@Pc(54) Class157 local54 = this.anInt5569 == -1 || this.anInt5569 == this.method4698().anInt206 && local29 != null ? null : Static80.method1561(this.anInt5569);
		@Pc(75) Class15_Sub2 local75 = this.aClass99_1.method2655(this.anInt5516, local29, this.anInt5537, local54, this.anInt5539, this.aClass14Array3, this.anInt5522, this.anInt5521, this.anInt5544);
		if (local75 == null) {
			return;
		}
		this.anInt5513 = local75.method4676();
		@Pc(86) Class99 local86 = this.aClass99_1;
		if (local86.anIntArray255 != null) {
			local86 = local86.method2647();
		}
		@Pc(140) Class15_Sub2 local140;
		if (Static123.aBoolean160 && local86.aBoolean193) {
			local140 = Static286.method4397(this.aClass99_1.aByte15, this.aClass99_1.aShort22, this.aClass99_1.aByte17, this.aClass99_1.anInt3050, local54 == null ? this.anInt5537 : this.anInt5521, this.anInt5587, this.anInt5559, arg0, local54 == null ? local29 : local54, this.aClass99_1.aShort21, this.anInt5557, this.aBoolean372, local75);
			if (Static156.aBoolean211) {
				@Pc(144) float local144 = Static156.method2666();
				@Pc(146) float local146 = Static156.method2690();
				Static156.method2656();
				Static156.method2670(local144, local146 - 150.0F);
				local140.method4678(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass87_Sub2_7);
				Static156.method2676();
				Static156.method2670(local144, local146);
			} else {
				local140.method4678(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass87_Sub2_7);
			}
		}
		this.method4690(local75);
		this.method4699(local75, arg0);
		local140 = null;
		if (this.anInt5510 != -1 && this.anInt5590 != -1) {
			@Pc(211) Class114 local211 = Static55.method978(this.anInt5510);
			local140 = local211.method2985(this.anInt5547, this.anInt5580, this.anInt5590);
			if (local140 != null) {
				local140.method1028(0, -this.anInt5576, 0);
				if (local211.aBoolean234) {
					if (Static225.anInt4139 != 0) {
						local140.method1041(Static225.anInt4139);
					}
					if (Static105.anInt1295 != 0) {
						local140.method1036(Static105.anInt1295);
					}
					if (Static296.anInt5311 != 0) {
						local140.method1028(0, Static296.anInt5311, 0);
					}
				}
			}
		}
		if (!Static156.aBoolean211) {
			if (local140 != null) {
				local75 = ((Class15_Sub2_Sub2) local75).method1050(local140);
			}
			this.method4688(local140, local75);
			if (this.aClass99_1.anInt3050 == 1) {
				local75.aBoolean61 = true;
			}
			local75.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
			return;
		}
		this.method4688(local140, local75);
		if (this.aClass99_1.anInt3050 == 1) {
			local75.aBoolean61 = true;
		}
		local75.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
		if (local140 == null) {
			return;
		}
		if (this.aClass99_1.anInt3050 == 1) {
			local140.aBoolean61 = true;
		}
		if (this.aClass87_Sub2_7 != null) {
			@Pc(310) Class15_Sub2_Sub1 local310 = (Class15_Sub2_Sub1) local140;
			this.aClass87_Sub2_7.method2718(local310.aClass180Array1, local310.aClass176Array1, true, local310.anIntArray53, local310.anIntArray51, local310.anIntArray49);
		}
		local140.method4678(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass87_Sub2_7);
	}

	@OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass87_Sub2_7 != null) {
			this.aClass87_Sub2_7.method2722();
		}
	}
}
