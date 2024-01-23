import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class116 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!ek;")
	private Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_5;

	@OriginalMember(owner = "client!na", name = "f", descriptor = "I")
	private int anInt3172;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "I")
	private int anInt3176;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	private int anInt3175 = -1;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	private int anInt3171;

	@OriginalMember(owner = "client!na", name = "i", descriptor = "I")
	private int anInt3174;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "I")
	private int anInt3170;

	@OriginalMember(owner = "client!na", name = "h", descriptor = "I")
	private int anInt3173;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "[Lclient!kk;")
	private Class97[] aClass97Array2;

	@OriginalMember(owner = "client!na", name = "c", descriptor = "[Lclient!kk;")
	private Class97[] aClass97Array1;

	@OriginalMember(owner = "client!na", name = "l", descriptor = "Lclient!kk;")
	private Class97 aClass97_1;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(I[Lclient!kk;IIII)V")
	public Class116(@OriginalArg(0) int arg0, @OriginalArg(1) Class97[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3171 = arg3;
		this.anInt3174 = arg4;
		this.anInt3170 = arg5;
		this.anInt3173 = arg0;
		this.aClass97Array2 = arg1;
		if (arg1 == null) {
			this.aClass97Array1 = null;
			this.aClass97_1 = null;
		} else {
			this.aClass97Array1 = new Class97[arg1.length];
			this.aClass97_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	public void method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2615(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt3173 == -1) {
			Static213.method3362(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub2_Sub2_Sub1_5 == null) {
				this.aClass1_Sub2_Sub2_Sub1_5 = Static208.anInterface4_1.method989(Static208.aFloat123, this.anInt3173, false, this.anInt3172);
			}
			if (!Static208.anInterface4_1.method983(this.anInt3173)) {
				Static213.method3362(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub2_Sub2_Sub1_5 != null) {
				local47 = arg5 * arg4 / -512;
				@Pc(59) int local59;
				for (local59 = (arg3 - arg4) / 2 + local8 * arg4 / 512; local59 > arg4; local59 -= arg4) {
				}
				while (local59 < 0) {
					local59 += arg4;
				}
				while (local47 > arg4) {
					local47 -= arg4;
				}
				while (local47 < 0) {
					local47 += arg4;
				}
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static213.anInt4239; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static213.anInt4240; local100 += arg4) {
						this.aClass1_Sub2_Sub2_Sub1_5.method3922(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt3176 - 1; local47 >= 0; local47--) {
			this.aClass97Array1[local47].method2262(arg1, arg2, arg3, arg4, arg5, local8, this.aClass97_1);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(IIIIIIII)V")
	public void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static240.aGL1;
		this.method2615(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static240.method3774(false);
		Static240.method3787(false);
		Static240.method3801(false);
		Static240.method3781();
		Static240.method3771(arg1, local14, arg2, local18);
		Static240.method3800();
		@Pc(36) int local36;
		for (local36 = this.anInt3176 - 1; local36 >= 0; local36--) {
			this.aClass97Array1[local36].method2267(this.aClass97_1);
		}
		if (this.anInt3173 == -1) {
			Static240.method3788(arg7);
		} else {
			if (!Static208.anInterface4_1.method983(this.anInt3173)) {
				Static240.method3788(arg7);
			}
			Static208.anInterface4_1.method992(this.anInt3173, this.anInt3172);
			@Pc(71) float local71 = (float) arg5 / 512.0F;
			@Pc(76) float local76 = (float) local10 / -512.0F;
			@Pc(86) float local86 = (float) (arg3 - arg4) / ((float) arg4 * 2.0F);
			local1.glBegin(7);
			local1.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			local1.glTexCoord2f(local76 - local86, local71);
			local1.glVertex2i(arg1, arg2);
			local1.glTexCoord2f(local76 - local86, local71 + 1.0F);
			local1.glVertex2i(arg1, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71 + 1.0F);
			local1.glVertex2i(local14, local18);
			local1.glTexCoord2f(local86 + local76 + 1.0F, local71);
			local1.glVertex2i(local14, arg2);
			local1.glEnd();
		}
		for (local36 = this.anInt3176 - 1; local36 >= 0; local36--) {
			this.aClass97Array1[local36].method2265(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static240.method3808();
		Static240.method3801(true);
		Static240.method3787(true);
		Static240.method3774(true);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
	private void method2615(@OriginalArg(0) int arg0) {
		if (this.anInt3175 == arg0) {
			return;
		}
		this.anInt3175 = arg0;
		@Pc(10) int local10 = Static202.method3145(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt3172) {
			this.anInt3172 = local10;
			this.aClass1_Sub2_Sub2_Sub1_5 = null;
		}
		if (this.aClass97Array2 == null) {
			return;
		}
		this.anInt3176 = 0;
		@Pc(36) int[] local36 = new int[this.aClass97Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass97Array2.length; local38++) {
			@Pc(48) Class97 local48 = this.aClass97Array2[local38];
			if (local48.method2263(this.anInt3171, this.anInt3174, this.anInt3170, this.anInt3175)) {
				local36[this.anInt3176] = local48.anInt2683;
				this.aClass97Array1[this.anInt3176++] = local48;
			}
		}
		Static82.method1398(this.anInt3176 - 1, 0, local36, this.aClass97Array1);
	}
}
