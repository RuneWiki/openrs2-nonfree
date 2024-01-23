import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class13_Sub5_Sub2 extends Class13_Sub5 {

	@OriginalMember(owner = "client!u", name = "wc", descriptor = "Lclient!wh;")
	public Class185 aClass185_1;

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)I")
	@Override
	protected int method4223() {
		if (this.aClass185_1.anIntArray466 != null) {
			@Pc(19) Class185 local19 = this.aClass185_1.method4658();
			if (local19 != null && local19.anInt5790 != -1) {
				return local19.anInt5790;
			}
		}
		return this.anInt5275;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt5296;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		if (this.aClass185_1 == null) {
			return;
		}
		@Pc(28) Class186 local28 = this.anInt5305 != -1 && this.anInt5251 == 0 ? Static51.method992(this.anInt5305) : null;
		@Pc(49) Class186 local49 = this.anInt5307 == -1 || this.anInt5307 == this.method4212().anInt1156 && local28 != null ? null : Static51.method992(this.anInt5307);
		@Pc(70) Class13_Sub1 local70 = this.aClass185_1.method4656(this.anInt5249, this.anInt5287, this.anInt5247, this.aClass170Array3, local28, this.anInt5333, this.anInt5313, this.anInt5260, local49);
		if (local70 == null) {
			return;
		}
		this.anInt5296 = local70.method4266();
		@Pc(80) Class185 local80 = this.aClass185_1;
		if (local80.anIntArray466 != null) {
			local80 = local80.method4658();
		}
		@Pc(133) Class13_Sub1 local133;
		if (Static114.aBoolean143 && local80.aBoolean399) {
			local133 = Static178.method2920(arg0, this.anInt5315, this.anInt5334, this.aClass185_1.aByte24, this.aClass185_1.aShort54, local70, this.aClass185_1.aByte25, this.aBoolean353, local49 == null ? this.anInt5249 : this.anInt5287, this.anInt5294, this.aClass185_1.anInt5803, this.aClass185_1.aShort53, local49 == null ? local28 : local49);
			if (Static251.aBoolean330) {
				@Pc(153) float local153 = Static251.method3883();
				@Pc(155) float local155 = Static251.method3884();
				Static251.method3856();
				Static251.method3877(local153, local155 - 150.0F);
				local133.method4262(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass21_Sub1_7);
				Static251.method3878();
				Static251.method3877(local153, local155);
			} else {
				local133.method4262(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.aClass21_Sub1_7);
			}
		}
		this.method4226(local70);
		this.method4214(local70, arg0);
		local133 = null;
		if (this.anInt5291 != -1 && this.anInt5279 != -1) {
			@Pc(203) Class120 local203 = Static32.method639(this.anInt5291);
			local133 = local203.method3158(this.anInt5280, this.anInt5281, this.anInt5279);
			if (local133 != null) {
				local133.method2740(0, -this.anInt5304, 0);
				if (local203.aBoolean240) {
					if (Static144.anInt2843 != 0) {
						local133.method2733(Static144.anInt2843);
					}
					if (Static248.anInt4870 != 0) {
						local133.method2757(Static248.anInt4870);
					}
					if (Static266.anInt5237 != 0) {
						local133.method2740(0, Static266.anInt5237, 0);
					}
				}
			}
		}
		if (!Static251.aBoolean330) {
			if (local133 != null) {
				local70 = ((Class13_Sub1_Sub1) local70).method403(local133);
			}
			this.method4225(local70, local133);
			if (this.aClass185_1.anInt5803 == 1) {
				local70.aBoolean223 = true;
			}
			local70.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
			return;
		}
		this.method4225(local70, local133);
		if (this.aClass185_1.anInt5803 == 1) {
			local70.aBoolean223 = true;
		}
		local70.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
		if (local133 == null) {
			return;
		}
		if (this.aClass185_1.anInt5803 == 1) {
			local133.aBoolean223 = true;
		}
		if (this.aClass21_Sub1_7 != null) {
			@Pc(335) Class13_Sub1_Sub2 local335 = (Class13_Sub1_Sub2) local133;
			this.aClass21_Sub1_7.method1974(local335.aClass62Array2, local335.aClass88Array2, true, local335.anIntArray289, local335.anIntArray286, local335.anIntArray290);
		}
		local133.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass21_Sub1_7);
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4213() {
		return this.aClass185_1 != null;
	}

	@OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1985();
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass185_1 == null) {
			return;
		}
		if (!this.aBoolean350) {
			@Pc(27) Class186 local27 = this.anInt5305 != -1 && this.anInt5251 == 0 ? Static51.method992(this.anInt5305) : null;
			@Pc(50) Class186 local50 = this.anInt5307 == -1 || this.anInt5307 == this.method4212().anInt1156 && local27 != null ? null : Static51.method992(this.anInt5307);
			@Pc(71) Class13_Sub1 local71 = this.aClass185_1.method4656(this.anInt5249, this.anInt5287, this.anInt5247, this.aClass170Array3, local27, this.anInt5333, this.anInt5313, this.anInt5260, local50);
			if (local71 == null) {
				return;
			}
			this.method4225(local71, null);
		}
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1976(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!wh;I)V")
	public void method4230(@OriginalArg(0) Class185 arg0) {
		this.aClass185_1 = arg0;
		if (this.aClass21_Sub1_7 != null) {
			this.aClass21_Sub1_7.method1981();
		}
	}
}
