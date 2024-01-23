import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class178 {

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!af;")
	private Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_6;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
	private int anInt5400;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	private int anInt5401;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	private int anInt5395 = -1;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
	private int anInt5398;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private int anInt5399;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
	private int anInt5396;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	private int anInt5397;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[Lclient!jf;")
	private Class78[] aClass78Array2;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "[Lclient!jf;")
	private Class78[] aClass78Array1;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!jf;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(I[Lclient!jf;IIII)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5398 = arg3;
		this.anInt5399 = arg4;
		this.anInt5396 = arg5;
		this.anInt5397 = arg0;
		this.aClass78Array2 = arg1;
		if (arg1 == null) {
			this.aClass78Array1 = null;
			this.aClass78_1 = null;
		} else {
			this.aClass78Array1 = new Class78[arg1.length];
			this.aClass78_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	private void method4282(@OriginalArg(0) int arg0) {
		if (this.anInt5395 == arg0) {
			return;
		}
		this.anInt5395 = arg0;
		@Pc(10) int local10 = Static276.method4104(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt5400) {
			this.anInt5400 = local10;
			this.aClass4_Sub2_Sub1_Sub1_6 = null;
		}
		if (this.aClass78Array2 == null) {
			return;
		}
		this.anInt5401 = 0;
		@Pc(36) int[] local36 = new int[this.aClass78Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass78Array2.length; local38++) {
			@Pc(48) Class78 local48 = this.aClass78Array2[local38];
			if (local48.method2075(this.anInt5398, this.anInt5399, this.anInt5396, this.anInt5395)) {
				local36[this.anInt5401] = local48.anInt2674;
				this.aClass78Array1[this.anInt5401++] = local48;
			}
		}
		Static5.method126(0, this.anInt5401 - 1, local36, this.aClass78Array1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIII)V")
	public void method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static178.aGL1;
		this.method4282(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static178.method2772(false);
		Static178.method2776(false);
		Static178.method2751(false);
		Static178.method2791();
		Static178.method2787(arg1, local14, arg2, local18);
		Static178.method2784();
		@Pc(36) int local36;
		for (local36 = this.anInt5401 - 1; local36 >= 0; local36--) {
			this.aClass78Array1[local36].method2079(this.aClass78_1);
		}
		if (this.anInt5397 == -1) {
			Static178.method2788(arg7);
		} else {
			if (!Static204.anInterface2_1.method1980(this.anInt5397)) {
				Static178.method2788(arg7);
			}
			Static204.anInterface2_1.method1972(this.anInt5400, this.anInt5397);
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
		for (local36 = this.anInt5401 - 1; local36 >= 0; local36--) {
			this.aClass78Array1[local36].method2068(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static178.method2748();
		Static178.method2751(true);
		Static178.method2776(true);
		Static178.method2772(true);
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(IIIIIIII)V")
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4282(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt5397 == -1) {
			Static166.method2627(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass4_Sub2_Sub1_Sub1_6 == null) {
				this.aClass4_Sub2_Sub1_Sub1_6 = Static204.anInterface2_1.method1971(false, this.anInt5400, this.anInt5397, Static204.aFloat42);
			}
			if (!Static204.anInterface2_1.method1980(this.anInt5397)) {
				Static166.method2627(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass4_Sub2_Sub1_Sub1_6 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static166.anInt3305; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static166.anInt3307; local100 += arg4) {
						this.aClass4_Sub2_Sub1_Sub1_6.method3462(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt5401 - 1; local47 >= 0; local47--) {
			this.aClass78Array1[local47].method2063(arg1, arg2, arg3, arg4, arg5, local8, this.aClass78_1);
		}
	}
}
