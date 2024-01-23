import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class14_Sub2_Sub2 extends Class14_Sub2 {

	@OriginalMember(owner = "client!sc", name = "Ac", descriptor = "Lclient!ff;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass46_1 == null) {
			;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
	@Override
	protected int method3644() {
		if (Static87.anInt1946 != 0 && this.aClass46_1.anIntArray148 != null) {
			@Pc(20) Class46 local20 = this.aClass46_1.method1283();
			if (local20 != null && local20.anInt1553 != -1) {
				return local20.anInt1553;
			}
		}
		return this.anInt4674;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt4699;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		if (this.aClass46_1 == null) {
			return;
		}
		@Pc(25) Class125 local25 = this.anInt4620 != -1 && this.anInt4695 == 0 ? Static90.method1591(this.anInt4620) : null;
		@Pc(46) Class125 local46 = this.anInt4658 == -1 || this.anInt4658 == this.method3650().anInt5190 && local25 != null ? null : Static90.method1591(this.anInt4658);
		@Pc(67) Class14_Sub6 local67 = this.aClass46_1.method1272(this.anInt4637, this.anInt4632, this.aClass3Array3, this.anInt4663, local25, local46, this.anInt4638, this.anInt4633, this.anInt4662);
		if (local67 == null) {
			return;
		}
		this.anInt4699 = local67.method4091();
		@Pc(77) Class46 local77 = this.aClass46_1;
		if (local77.anIntArray148 != null) {
			local77 = local77.method1283();
		}
		@Pc(131) Class14_Sub6 local131;
		if (Static199.aBoolean308 && local77.aBoolean109) {
			local131 = Static299.method4472(this.aClass46_1.aByte3, local67, this.anInt4630, this.aClass46_1.aByte6, this.anInt4694, this.anInt4680, local46 == null ? this.anInt4633 : this.anInt4638, this.aClass46_1.aShort18, this.aBoolean356, this.aClass46_1.aShort19, this.aClass46_1.anInt1532, arg0, local46 == null ? local25 : local46);
			if (Static277.aBoolean412) {
				@Pc(135) float local135 = Static277.method4203();
				@Pc(137) float local137 = Static277.method4218();
				Static277.method4208();
				Static277.method4224(local135, local137 - 150.0F);
				local131.method4097(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass86_Sub1_6);
				Static277.method4215();
				Static277.method4224(local135, local137);
			} else {
				local131.method4097(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass86_Sub1_6);
			}
		}
		this.method3652(local67);
		local131 = null;
		this.method3645(arg0, local67);
		if (this.anInt4656 != -1 && this.anInt4673 != -1) {
			@Pc(205) Class157 local205 = Static242.method3711(this.anInt4656);
			local131 = local205.method3873(this.anInt4673, this.anInt4655, this.anInt4657);
			if (local131 != null) {
				local131.method4107(0, -this.anInt4641, 0);
				if (local205.aBoolean376) {
					if (Static118.anInt2736 != 0) {
						local131.method4108(Static118.anInt2736);
					}
					if (Static230.anInt2005 != 0) {
						local131.method4126(Static230.anInt2005);
					}
					if (Static73.anInt1538 != 0) {
						local131.method4107(0, Static73.anInt1538, 0);
					}
				}
			}
		}
		if (!Static277.aBoolean412) {
			if (local131 != null) {
				local67 = ((Class14_Sub6_Sub2) local67).method4135(local131);
			}
			if (this.aClass46_1.anInt1532 == 1) {
				local67.aBoolean393 = true;
			}
			local67.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
			return;
		}
		if (this.aClass46_1.anInt1532 == 1) {
			local67.aBoolean393 = true;
		}
		local67.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
		if (local131 != null) {
			if (this.aClass46_1.anInt1532 == 1) {
				local131.aBoolean393 = true;
			}
			local131.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass86_Sub1_6);
		}
	}

	@OriginalMember(owner = "client!sc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!ff;B)V")
	public void method3663(@OriginalArg(0) Class46 arg0) {
		this.aClass46_1 = arg0;
		if (this.aClass86_Sub1_6 != null) {
			this.aClass86_Sub1_6.method3618();
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method3647() {
		return this.aClass46_1 != null;
	}
}
