import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class12_Sub3_Sub1 extends Class12_Sub3 {

	@OriginalMember(owner = "client!hc", name = "sc", descriptor = "Lclient!ve;")
	public Class175 aClass175_1;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt4146;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		if (this.aClass175_1 == null) {
			return;
		}
		@Pc(28) Class141 local28 = this.anInt4178 != -1 && this.anInt4119 == 0 ? Static296.method1376(this.anInt4178) : null;
		@Pc(52) Class141 local52 = this.anInt4127 == -1 || this.anInt4127 == this.method3361().anInt2564 && local28 != null ? null : Static296.method1376(this.anInt4127);
		@Pc(73) Class12_Sub2 local73 = this.aClass175_1.method4127(this.anInt4152, local52, this.anInt4123, this.aClass28Array3, this.anInt4170, this.anInt4118, local28, this.anInt4159, this.anInt4120);
		if (local73 == null) {
			return;
		}
		this.anInt4146 = local73.method3355();
		@Pc(83) Class175 local83 = this.aClass175_1;
		if (local83.anIntArray462 != null) {
			local83 = local83.method4133();
		}
		@Pc(139) Class12_Sub2 local139;
		if (Static171.aBoolean210 && local83.aBoolean343) {
			local139 = Static112.method1922(this.aClass175_1.aByte25, local52 == null ? local28 : local52, this.aClass175_1.anInt5217, this.aBoolean277, arg0, this.aClass175_1.aShort41, this.anInt4135, this.anInt4113, this.anInt4141, this.aClass175_1.aByte23, local73, this.aClass175_1.aShort40, local52 == null ? this.anInt4170 : this.anInt4118);
			if (Static178.aBoolean216) {
				@Pc(159) float local159 = Static178.method2777();
				@Pc(161) float local161 = Static178.method2759();
				Static178.method2784();
				Static178.method2775(local159, local161 - 150.0F);
				local139.method3357(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass67_Sub1_6);
				Static178.method2748();
				Static178.method2775(local159, local161);
			} else {
				local139.method3357(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass67_Sub1_6);
			}
		}
		this.method3373(local73);
		this.method3369(arg0, local73);
		local139 = null;
		if (this.anInt4125 != -1 && this.anInt4188 != -1) {
			@Pc(212) Class126 local212 = Static262.method3973(this.anInt4125);
			local139 = local212.method3023(this.anInt4158, this.anInt4188, this.anInt4154);
			if (local139 != null) {
				local139.method3155(0, -this.anInt4187, 0);
				if (local212.aBoolean246) {
					if (Static298.anInt5528 != 0) {
						local139.method3158(Static298.anInt5528);
					}
					if (Static175.anInt3449 != 0) {
						local139.method3162(Static175.anInt3449);
					}
					if (Static269.anInt5029 != 0) {
						local139.method3155(0, Static269.anInt5029, 0);
					}
				}
			}
		}
		if (!Static178.aBoolean216) {
			if (local139 != null) {
				local73 = ((Class12_Sub2_Sub1) local73).method614(local139);
			}
			if (this.aClass175_1.anInt5217 == 1) {
				local73.aBoolean255 = true;
			}
			local73.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
			return;
		}
		if (this.aClass175_1.anInt5217 == 1) {
			local73.aBoolean255 = true;
		}
		local73.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
		if (local139 != null) {
			if (this.aClass175_1.anInt5217 == 1) {
				local139.aBoolean255 = true;
			}
			local139.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_6);
		}
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)I")
	@Override
	protected int method3366() {
		if (Static132.anInt2784 != 0 && this.aClass175_1.anIntArray462 != null) {
			@Pc(22) Class175 local22 = this.aClass175_1.method4133();
			if (local22 != null && local22.anInt5218 != -1) {
				return local22.anInt5218;
			}
		}
		return this.anInt4126;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!ve;I)V")
	public void method1562(@OriginalArg(0) Class175 arg0) {
		this.aClass175_1 = arg0;
		if (this.aClass67_Sub1_6 != null) {
			this.aClass67_Sub1_6.method1759();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass175_1 == null) {
			;
		}
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method3374() {
		return this.aClass175_1 != null;
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}
}
