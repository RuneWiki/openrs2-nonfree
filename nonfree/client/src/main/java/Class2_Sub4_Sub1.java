import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fc", name = "yc", descriptor = "Lclient!rb;")
	public Class145 aClass145_1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass145_1 == null) {
			return;
		}
		if (!this.aBoolean176) {
			@Pc(25) Class32 local25 = this.anInt2822 != -1 && this.anInt2830 == 0 ? Static202.method3231(this.anInt2822) : null;
			@Pc(50) Class32 local50 = this.anInt2820 == -1 || this.anInt2820 == this.method2095().anInt3138 && local25 != null ? null : Static202.method3231(this.anInt2820);
			@Pc(71) Class2_Sub1 local71 = this.aClass145_1.method3706(this.aClass36Array3, this.anInt2829, local50, this.anInt2800, this.anInt2776, this.anInt2812, local25, this.anInt2826, this.anInt2845);
			if (local71 == null) {
				return;
			}
			this.method2103(null, local71);
		}
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method860(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt2813;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!rb;)V")
	public void method1239(@OriginalArg(1) Class145 arg0) {
		this.aClass145_1 = arg0;
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method869();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	@Override
	protected int method2090() {
		if (this.aClass145_1.anIntArray455 != null) {
			@Pc(18) Class145 local18 = this.aClass145_1.method3711();
			if (local18 != null && local18.anInt4933 != -1) {
				return local18.anInt4933;
			}
		}
		return this.anInt2832;
	}

	@OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub1_4 != null) {
			this.aClass34_Sub1_4.method862();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		if (this.aClass145_1 == null) {
			return;
		}
		@Pc(24) Class32 local24 = this.anInt2822 != -1 && this.anInt2830 == 0 ? Static202.method3231(this.anInt2822) : null;
		@Pc(49) Class32 local49 = this.anInt2820 == -1 || this.anInt2820 == this.method2095().anInt3138 && local24 != null ? null : Static202.method3231(this.anInt2820);
		@Pc(70) Class2_Sub1 local70 = this.aClass145_1.method3706(this.aClass36Array3, this.anInt2829, local49, this.anInt2800, this.anInt2776, this.anInt2812, local24, this.anInt2826, this.anInt2845);
		if (local70 == null) {
			return;
		}
		this.anInt2813 = local70.method3948();
		@Pc(82) Class145 local82 = this.aClass145_1;
		if (local82.anIntArray455 != null) {
			local82 = local82.method3711();
		}
		@Pc(136) Class2_Sub1 local136;
		if (Static35.aBoolean65 && local82.aBoolean302) {
			local136 = Static135.method2295(this.aClass145_1.aByte20, this.anInt2794, arg0, this.aClass145_1.aShort73, this.aClass145_1.anInt4909, this.aBoolean178, local49 == null ? local24 : local49, this.aClass145_1.aShort72, local70, this.anInt2788, this.aClass145_1.aByte22, local49 == null ? this.anInt2800 : this.anInt2826, this.anInt2846);
			if (Static294.aBoolean367) {
				@Pc(156) float local156 = Static294.method4516();
				@Pc(158) float local158 = Static294.method4503();
				Static294.method4492();
				Static294.method4513(local156, local158 - 150.0F);
				local136.method3951(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass34_Sub1_4);
				Static294.method4495();
				Static294.method4513(local156, local158);
			} else {
				local136.method3951(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass34_Sub1_4);
			}
		}
		this.method2094(local70);
		this.method2099(arg0, local70);
		local136 = null;
		if (this.anInt2825 != -1 && this.anInt2837 != -1) {
			@Pc(207) Class94 local207 = Static28.method611(this.anInt2825);
			local136 = local207.method2423(this.anInt2808, this.anInt2837, this.anInt2785);
			if (local136 != null) {
				local136.method572(0, -this.anInt2792, 0);
				if (local207.aBoolean219) {
					if (Static144.anInt3286 != 0) {
						local136.method554(Static144.anInt3286);
					}
					if (Static270.anInt5410 != 0) {
						local136.method552(Static270.anInt5410);
					}
					if (Static269.anInt5352 != 0) {
						local136.method572(0, Static269.anInt5352, 0);
					}
				}
			}
		}
		if (!Static294.aBoolean367) {
			if (local136 != null) {
				local70 = ((Class2_Sub1_Sub2) local70).method584(local136);
			}
			this.method2103(local136, local70);
			if (this.aClass145_1.anInt4909 == 1) {
				local70.aBoolean39 = true;
			}
			local70.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
			return;
		}
		this.method2103(local136, local70);
		if (this.aClass145_1.anInt4909 == 1) {
			local70.aBoolean39 = true;
		}
		local70.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
		if (local136 == null) {
			return;
		}
		if (this.aClass145_1.anInt4909 == 1) {
			local136.aBoolean39 = true;
		}
		if (this.aClass34_Sub1_4 != null) {
			@Pc(337) Class2_Sub1_Sub1 local337 = (Class2_Sub1_Sub1) local136;
			this.aClass34_Sub1_4.method858(local337.aClass135Array1, local337.aClass86Array1, true, local337.anIntArray6, local337.anIntArray9, local337.anIntArray4);
		}
		local136.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_4);
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2100() {
		return this.aClass145_1 != null;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I")
	@Override
	public int method2098() {
		if (this.aClass145_1.anIntArray455 != null) {
			@Pc(13) Class145 local13 = this.aClass145_1.method3711();
			if (local13 != null && local13.anInt4919 != -1) {
				return local13.anInt4919;
			}
		}
		return this.aClass145_1.anInt4919 == -1 ? super.method2098() : this.aClass145_1.anInt4919;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
	@Override
	public int method2102() {
		if (this.aClass145_1.anIntArray455 != null) {
			@Pc(18) Class145 local18 = this.aClass145_1.method3711();
			if (local18 != null && local18.anInt4946 != -1) {
				return local18.anInt4946;
			}
		}
		return this.aClass145_1.anInt4946;
	}
}
