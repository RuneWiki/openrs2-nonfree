import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class22_Sub3_Sub1 extends Class22_Sub3 {

	@OriginalMember(owner = "client!no", name = "yc", descriptor = "Lclient!mf;")
	public Class112 aClass112_1;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	public int method3641() {
		if (this.aClass112_1.anIntArray283 != null) {
			@Pc(20) Class112 local20 = this.aClass112_1.method2817();
			if (local20 != null && local20.anInt3505 != -1) {
				return local20.anInt3505;
			}
		}
		return this.aClass112_1.anInt3505;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		if (this.aClass112_1 == null) {
			return;
		}
		@Pc(25) Class167 local25 = this.anInt4642 != -1 && this.anInt4632 == 0 ? Static313.method4648(this.anInt4642) : null;
		@Pc(50) Class167 local50 = this.anInt4566 == -1 || this.anInt4566 == this.method3659().anInt2171 && local25 != null ? null : Static313.method4648(this.anInt4566);
		@Pc(71) Class22_Sub4 local71 = this.aClass112_1.method2824(this.aClass53Array3, this.anInt4576, local50, this.anInt4635, this.anInt4609, this.anInt4612, local25, this.anInt4597, this.anInt4645);
		if (local71 == null) {
			return;
		}
		this.anInt4615 = local71.method4071();
		@Pc(83) Class112 local83 = this.aClass112_1;
		if (local83.anIntArray283 != null) {
			local83 = local83.method2817();
		}
		@Pc(139) Class22_Sub4 local139;
		if (Static285.aBoolean387 && local83.aBoolean243) {
			local139 = Static236.method3737(this.anInt4601, arg0, this.aClass112_1.aByte12, this.aClass112_1.aByte14, this.aClass112_1.aShort19, this.anInt4623, this.aClass112_1.anInt3495, local50 == null ? local25 : local50, local71, this.aBoolean332, this.anInt4579, this.aClass112_1.aShort20, local50 == null ? this.anInt4597 : this.anInt4635);
			if (Static291.aBoolean404) {
				@Pc(159) float local159 = Static291.method4329();
				@Pc(161) float local161 = Static291.method4298();
				Static291.method4330();
				Static291.method4291(local159, local161 - 150.0F);
				local139.method4073(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass45_Sub2_7);
				Static291.method4333();
				Static291.method4291(local159, local161);
			} else {
				local139.method4073(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass45_Sub2_7);
			}
		}
		this.method3643(local71);
		local139 = null;
		this.method3652(arg0, local71);
		if (this.anInt4562 != -1 && this.anInt4619 != -1) {
			@Pc(209) Class97 local209 = Static239.method3759(this.anInt4562);
			local139 = local209.method2204(this.anInt4607, this.anInt4596, this.anInt4619);
			if (local139 != null) {
				local139.method3577(0, -this.anInt4569, 0);
				if (local209.aBoolean195) {
					if (Static85.anInt1546 != 0) {
						local139.method3565(Static85.anInt1546);
					}
					if (Static225.anInt4444 != 0) {
						local139.method3576(Static225.anInt4444);
					}
					if (Static165.anInt3458 != 0) {
						local139.method3577(0, Static165.anInt3458, 0);
					}
				}
			}
		}
		if (!Static291.aBoolean404) {
			if (local139 != null) {
				local71 = ((Class22_Sub4_Sub2) local71).method3588(local139);
			}
			this.method3658(local139, local71);
			if (this.aClass112_1.anInt3495 == 1) {
				local71.aBoolean315 = true;
			}
			local71.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
			return;
		}
		this.method3658(local139, local71);
		if (this.aClass112_1.anInt3495 == 1) {
			local71.aBoolean315 = true;
		}
		local71.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
		if (local139 == null) {
			return;
		}
		if (this.aClass112_1.anInt3495 == 1) {
			local139.aBoolean315 = true;
		}
		if (this.aClass45_Sub2_7 != null) {
			@Pc(344) Class22_Sub4_Sub1 local344 = (Class22_Sub4_Sub1) local139;
			this.aClass45_Sub2_7.method2405(local344.aClass49Array1, local344.aClass15Array1, true, local344.anIntArray174, local344.anIntArray175, local344.anIntArray170);
		}
		local139.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass45_Sub2_7);
	}

	@OriginalMember(owner = "client!no", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2416();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)I")
	@Override
	protected int method3640() {
		if (this.aClass112_1.anIntArray283 != null) {
			@Pc(17) Class112 local17 = this.aClass112_1.method2817();
			if (local17 != null && local17.anInt3528 != -1) {
				return local17.anInt3528;
			}
		}
		return this.anInt4646;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3655() {
		return this.aClass112_1 != null;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass112_1 == null) {
			return;
		}
		if (!this.aBoolean330) {
			@Pc(27) Class167 local27 = this.anInt4642 != -1 && this.anInt4632 == 0 ? Static313.method4648(this.anInt4642) : null;
			@Pc(48) Class167 local48 = this.anInt4566 == -1 || this.anInt4566 == this.method3659().anInt2171 && local27 != null ? null : Static313.method4648(this.anInt4566);
			@Pc(69) Class22_Sub4 local69 = this.aClass112_1.method2824(this.aClass53Array3, this.anInt4576, local48, this.anInt4635, this.anInt4609, this.anInt4612, local27, this.anInt4597, this.anInt4645);
			if (local69 == null) {
				return;
			}
			this.method3658(null, local69);
		}
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2396(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I")
	@Override
	public int method3645() {
		if (this.aClass112_1.anIntArray283 != null) {
			@Pc(13) Class112 local13 = this.aClass112_1.method2817();
			if (local13 != null && local13.anInt3503 != -1) {
				return local13.anInt3503;
			}
		}
		return this.aClass112_1.anInt3503 == -1 ? super.method3645() : this.aClass112_1.anInt3503;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!mf;B)V")
	public void method3118(@OriginalArg(0) Class112 arg0) {
		this.aClass112_1 = arg0;
		if (this.aClass45_Sub2_7 != null) {
			this.aClass45_Sub2_7.method2398();
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt4615;
	}
}
