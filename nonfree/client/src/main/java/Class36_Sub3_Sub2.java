import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class36_Sub3_Sub2 extends Class36_Sub3 {

	@OriginalMember(owner = "client!ph", name = "tc", descriptor = "Lclient!vm;")
	public Class173 aClass173_1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass173_1 != null) {
			;
		}
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)I")
	@Override
	protected int method3109() {
		if (this.aClass173_1.anIntArray491 != null) {
			@Pc(22) Class173 local22 = this.aClass173_1.method4245();
			if (local22 != null && local22.anInt5634 != -1) {
				return local22.anInt5634;
			}
		}
		return this.anInt4083;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method3112() {
		return this.aClass173_1 != null;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt4102;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vm;)V")
	public void method3117(@OriginalArg(1) Class173 arg0) {
		this.aClass173_1 = arg0;
		if (this.aClass105_Sub1_5 != null) {
			this.aClass105_Sub1_5.method3484();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		if (this.aClass173_1 == null) {
			return;
		}
		@Pc(26) Class76 local26 = this.anInt4107 != -1 && this.anInt4113 == 0 ? Static115.method1855(this.anInt4107) : null;
		@Pc(49) Class76 local49 = this.anInt4067 == -1 || this.anInt4067 == this.method3105().anInt423 && local26 != null ? null : Static115.method1855(this.anInt4067);
		@Pc(70) Class36_Sub2 local70 = this.aClass173_1.method4249(this.anInt4120, this.anInt4103, this.anInt4132, local49, local26, this.anInt4122, this.anInt4104, this.aClass83Array3, this.anInt4097);
		if (local70 == null) {
			return;
		}
		this.anInt4102 = local70.method4175();
		@Pc(81) Class173 local81 = this.aClass173_1;
		if (local81.anIntArray491 != null) {
			local81 = local81.method4245();
		}
		@Pc(136) Class36_Sub2 local136;
		if (Static150.aBoolean367 && local81.aBoolean473) {
			local136 = Static55.method891(this.anInt4117, local49 == null ? local26 : local49, this.aClass173_1.anInt5633, this.anInt4086, arg0, this.aClass173_1.aByte24, local70, this.aClass173_1.aShort39, local49 == null ? this.anInt4103 : this.anInt4104, this.aClass173_1.aShort38, this.aClass173_1.aByte25, this.anInt4118, this.aBoolean330);
			if (Static116.aBoolean188) {
				@Pc(156) float local156 = Static116.method1869();
				@Pc(158) float local158 = Static116.method1886();
				Static116.method1874();
				Static116.method1909(local156, local158 - 150.0F);
				local136.method4173(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass105_Sub1_5);
				Static116.method1881();
				Static116.method1909(local156, local158);
			} else {
				local136.method4173(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass105_Sub1_5);
			}
		}
		this.method3113(local70);
		this.method3114(local70, arg0);
		local136 = null;
		if (this.anInt4125 != -1 && this.anInt4127 != -1) {
			@Pc(210) Class144 local210 = Static81.method1346(this.anInt4125);
			local136 = local210.method3527(this.anInt4127, this.anInt4070, this.anInt4124);
			if (local136 != null) {
				local136.method3950(0, -this.anInt4095, 0);
				if (local210.aBoolean375) {
					if (Static169.anInt3377 != 0) {
						local136.method3945(Static169.anInt3377);
					}
					if (Static151.anInt4136 != 0) {
						local136.method3938(Static151.anInt4136);
					}
					if (Static219.anInt4499 != 0) {
						local136.method3950(0, Static219.anInt4499, 0);
					}
				}
			}
		}
		if (!Static116.aBoolean188) {
			if (local136 != null) {
				local70 = ((Class36_Sub2_Sub2) local70).method3980(local136);
			}
			if (this.aClass173_1.anInt5633 == 1) {
				local70.aBoolean435 = true;
			}
			local70.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
			return;
		}
		if (this.aClass173_1.anInt5633 == 1) {
			local70.aBoolean435 = true;
		}
		local70.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
		if (local136 != null) {
			if (this.aClass173_1.anInt5633 == 1) {
				local136.aBoolean435 = true;
			}
			local136.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}
}
