import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class36_Sub3_Sub1 extends Class36_Sub3 {

	@OriginalMember(owner = "client!kk", name = "Dc", descriptor = "Lclient!cm;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt5102;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		if (this.aClass33_1 == null) {
			return;
		}
		@Pc(25) Class15 local25 = this.anInt5087 != -1 && this.anInt5070 == 0 ? Static35.method706(this.anInt5087) : null;
		@Pc(50) Class15 local50 = this.anInt5138 == -1 || this.anInt5138 == this.method4104().anInt2124 && local25 != null ? null : Static35.method706(this.anInt5138);
		@Pc(71) Class36_Sub2 local71 = this.aClass33_1.method713(local50, this.anInt5082, local25, this.anInt5071, this.anInt5119, this.anInt5106, this.anInt5081, this.aClass86Array3, this.anInt5078);
		if (local71 == null) {
			return;
		}
		this.anInt5102 = local71.method4881();
		@Pc(82) Class33 local82 = this.aClass33_1;
		if (local82.anIntArray55 != null) {
			local82 = local82.method719();
		}
		@Pc(135) Class36_Sub2 local135;
		if (Static284.aBoolean475 && local82.aBoolean62) {
			local135 = Static209.method1568(this.aClass33_1.aShort5, this.anInt5109, this.aClass33_1.aByte6, local71, local50 == null ? local25 : local50, local50 == null ? this.anInt5106 : this.anInt5119, this.anInt5093, this.aBoolean421, this.aClass33_1.aShort6, this.aClass33_1.anInt888, arg0, this.anInt5110, this.aClass33_1.aByte4);
			if (Static60.aBoolean106) {
				@Pc(155) float local155 = Static60.method1149();
				@Pc(157) float local157 = Static60.method1135();
				Static60.method1158();
				Static60.method1144(local155, local157 - 150.0F);
				local135.method4878(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass119_Sub1_6);
				Static60.method1145();
				Static60.method1144(local155, local157);
			} else {
				local135.method4878(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass119_Sub1_6);
			}
		}
		this.method4093(local71);
		this.method4105(local71, arg0);
		local135 = null;
		if (this.anInt5125 != -1 && this.anInt5129 != -1) {
			@Pc(208) Class167 local208 = Static208.method3532(this.anInt5125);
			local135 = local208.method4337(this.anInt5076, this.anInt5142, this.anInt5129);
			if (local135 != null) {
				local135.method3834(0, -this.anInt5133, 0);
				if (local208.aBoolean434) {
					if (Static197.anInt4131 != 0) {
						local135.method3827(Static197.anInt4131);
					}
					if (Static164.anInt3456 != 0) {
						local135.method3843(Static164.anInt3456);
					}
					if (Static141.anInt3028 != 0) {
						local135.method3834(0, Static141.anInt3028, 0);
					}
				}
			}
		}
		if (!Static60.aBoolean106) {
			if (local135 != null) {
				local71 = ((Class36_Sub2_Sub2) local71).method3869(local135);
			}
			if (this.aClass33_1.anInt888 == 1) {
				local71.aBoolean399 = true;
			}
			local71.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
			return;
		}
		if (this.aClass33_1.anInt888 == 1) {
			local71.aBoolean399 = true;
		}
		local71.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
		if (local135 != null) {
			if (this.aClass33_1.anInt888 == 1) {
				local135.aBoolean399 = true;
			}
			local135.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_6);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BLclient!cm;)V")
	public void method2418(@OriginalArg(1) Class33 arg0) {
		this.aClass33_1 = arg0;
		if (this.aClass119_Sub1_6 != null) {
			this.aClass119_Sub1_6.method3102();
		}
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method4099() {
		return this.aClass33_1 != null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass33_1 == null) {
			;
		}
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)I")
	@Override
	protected int method4089() {
		if (this.aClass33_1.anIntArray55 != null) {
			@Pc(22) Class33 local22 = this.aClass33_1.method719();
			if (local22 != null && local22.anInt864 != -1) {
				return local22.anInt864;
			}
		}
		return this.anInt5140;
	}
}
