import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class139 {

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
	private int anInt4776;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!si;")
	private Class1_Sub3_Sub13_Sub2 aClass1_Sub3_Sub13_Sub2_4;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
	private int anInt4782;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	private int anInt4779 = -1;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	private int anInt4778;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	private int anInt4777;

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	private int anInt4780;

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
	private int anInt4781;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "[Lclient!ra;")
	private Class144[] aClass144Array2;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "[Lclient!ra;")
	private Class144[] aClass144Array1;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!ra;")
	private Class144 aClass144_1;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I[Lclient!ra;IIII)V")
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) Class144[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4778 = arg3;
		this.anInt4777 = arg4;
		this.anInt4780 = arg5;
		this.anInt4781 = arg0;
		this.aClass144Array2 = arg1;
		if (arg1 == null) {
			this.aClass144Array1 = null;
			this.aClass144_1 = null;
		} else {
			this.aClass144Array1 = new Class144[arg1.length];
			this.aClass144_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIII)V")
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3546(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt4781 == -1) {
			Static231.method3630(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub3_Sub13_Sub2_4 == null) {
				this.aClass1_Sub3_Sub13_Sub2_4 = Static237.anInterface1_1.method4592(this.anInt4782, Static237.aFloat48, false, this.anInt4781);
			}
			if (!Static237.anInterface1_1.method4593(this.anInt4781)) {
				Static231.method3630(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub3_Sub13_Sub2_4 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < arg3; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < arg4; local100 += arg4) {
						this.aClass1_Sub3_Sub13_Sub2_4.method4205(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt4776 - 1; local47 >= 0; local47--) {
			this.aClass144Array1[local47].method3685(arg1, arg2, arg3, arg4, arg5, local8, this.aClass144_1);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	private void method3546(@OriginalArg(0) int arg0) {
		if (this.anInt4779 == arg0) {
			return;
		}
		this.anInt4779 = arg0;
		@Pc(10) int local10 = Static151.method2450(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt4782) {
			this.anInt4782 = local10;
			this.aClass1_Sub3_Sub13_Sub2_4 = null;
		}
		if (this.aClass144Array2 == null) {
			return;
		}
		this.anInt4776 = 0;
		@Pc(36) int[] local36 = new int[this.aClass144Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass144Array2.length; local38++) {
			@Pc(48) Class144 local48 = this.aClass144Array2[local38];
			if (local48.method3694(this.anInt4778, this.anInt4777, this.anInt4780, this.anInt4779)) {
				local36[this.anInt4776] = local48.anInt4902;
				this.aClass144Array1[this.anInt4776++] = local48;
			}
		}
		Static315.method4764(local36, this.aClass144Array1, this.anInt4776 - 1, 0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIIIII)V")
	public void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static294.aGL1;
		this.method3546(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static294.method4499(false);
		Static294.method4496(false);
		Static294.method4491(false);
		Static294.method4512();
		Static294.method4525(arg1, local14, arg2, local18);
		Static294.method4492();
		@Pc(36) int local36;
		for (local36 = this.anInt4776 - 1; local36 >= 0; local36--) {
			this.aClass144Array1[local36].method3691(this.aClass144_1);
		}
		if (this.anInt4781 == -1) {
			Static294.method4524(arg7);
		} else {
			if (!Static237.anInterface1_1.method4593(this.anInt4781)) {
				Static294.method4524(arg7);
			}
			Static237.anInterface1_1.method4599(this.anInt4782, this.anInt4781);
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
		for (local36 = this.anInt4776 - 1; local36 >= 0; local36--) {
			this.aClass144Array1[local36].method3687(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static294.method4495();
		Static294.method4491(true);
		Static294.method4496(true);
		Static294.method4499(true);
	}
}
