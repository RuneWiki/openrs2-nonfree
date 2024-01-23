import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class6_Sub6_Sub1 extends Class6_Sub6 {

	@OriginalMember(owner = "client!qi", name = "qc", descriptor = "Lclient!bo;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass19_1 == null) {
			;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		if (this.aClass19_1 == null) {
			return;
		}
		@Pc(26) Class133 local26 = this.anInt4572 != -1 && this.anInt4506 == 0 ? Static262.method4031(this.anInt4572) : null;
		@Pc(48) Class133 local48 = this.anInt4544 == -1 || this.anInt4544 == this.method3503().anInt2197 && local26 != null ? null : Static262.method4031(this.anInt4544);
		@Pc(69) Class6_Sub2 local69 = this.aClass19_1.method495(this.aClass160Array3, this.anInt4510, this.anInt4526, local48, this.anInt4549, this.anInt4516, this.anInt4570, this.anInt4507, local26);
		if (local69 == null) {
			return;
		}
		this.anInt4576 = local69.method3833();
		@Pc(81) Class19 local81 = this.aClass19_1;
		if (local81.anIntArray67 != null) {
			local81 = local81.method507();
		}
		@Pc(135) Class6_Sub2 local135;
		if (Static97.aBoolean136 && local81.aBoolean57) {
			local135 = Static108.method1717(arg0, local48 == null ? this.anInt4570 : this.anInt4526, this.aBoolean340, this.anInt4569, this.aClass19_1.aShort2, local69, this.aClass19_1.aByte4, this.anInt4562, local48 == null ? local26 : local48, this.aClass19_1.anInt629, this.aClass19_1.aByte2, this.anInt4533, this.aClass19_1.aShort3);
			if (Static240.aBoolean369) {
				@Pc(139) float local139 = Static240.method3773();
				@Pc(141) float local141 = Static240.method3769();
				Static240.method3800();
				Static240.method3807(local139, local141 - 150.0F);
				local135.method3838(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass91_Sub1_6);
				Static240.method3808();
				Static240.method3807(local139, local141);
			} else {
				local135.method3838(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass91_Sub1_6);
			}
		}
		this.method3504(local69);
		local135 = null;
		this.method3512(local69, arg0);
		if (this.anInt4580 != -1 && this.anInt4578 != -1) {
			@Pc(208) Class25 local208 = Static280.method4295(this.anInt4580);
			local135 = local208.method711(this.anInt4525, this.anInt4571, this.anInt4578);
			if (local135 != null) {
				local135.method2073(0, -this.anInt4520, 0);
				if (local208.aBoolean79) {
					if (Static297.anInt5895 != 0) {
						local135.method2070(Static297.anInt5895);
					}
					if (Static299.anInt5916 != 0) {
						local135.method2085(Static299.anInt5916);
					}
					if (Static286.anInt5081 != 0) {
						local135.method2073(0, Static286.anInt5081, 0);
					}
				}
			}
		}
		if (!Static240.aBoolean369) {
			if (local135 != null) {
				local69 = ((Class6_Sub2_Sub1) local69).method590(local135);
			}
			if (this.aClass19_1.anInt629 == 1) {
				local69.aBoolean176 = true;
			}
			local69.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
			return;
		}
		if (this.aClass19_1.anInt629 == 1) {
			local69.aBoolean176 = true;
		}
		local69.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
		if (local135 != null) {
			if (this.aClass19_1.anInt629 == 1) {
				local135.aBoolean176 = true;
			}
			local135.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_6);
		}
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method3514() {
		return this.aClass19_1 != null;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!bo;)V")
	public void method3458(@OriginalArg(1) Class19 arg0) {
		this.aClass19_1 = arg0;
		if (this.aClass91_Sub1_6 != null) {
			this.aClass91_Sub1_6.method3051();
		}
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)I")
	@Override
	protected int method3505() {
		if (Static107.anInt1994 != 0 && this.aClass19_1.anIntArray67 != null) {
			@Pc(28) Class19 local28 = this.aClass19_1.method507();
			if (local28 != null && local28.anInt656 != -1) {
				return local28.anInt656;
			}
		}
		return this.anInt4546;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt4576;
	}
}
