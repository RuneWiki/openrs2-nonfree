import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class167 {

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
	private int anInt5359;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
	private int anInt5361;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "Lclient!qn;")
	private Class3_Sub4_Sub12_Sub2 aClass3_Sub4_Sub12_Sub2_5;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	private int anInt5362 = -1;

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
	private int anInt5360;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	private int anInt5357;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	private int anInt5358;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	private int anInt5356;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lclient!nb;")
	private Class118[] aClass118Array1;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lclient!nb;")
	private Class118[] aClass118Array2;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!nb;")
	private Class118 aClass118_1;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I[Lclient!nb;IIII)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) Class118[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5360 = arg3;
		this.anInt5357 = arg4;
		this.anInt5358 = arg5;
		this.anInt5356 = arg0;
		this.aClass118Array1 = arg1;
		if (arg1 == null) {
			this.aClass118Array2 = null;
			this.aClass118_1 = null;
		} else {
			this.aClass118Array2 = new Class118[arg1.length];
			this.aClass118_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIII)V")
	public void method4353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4356(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt5356 == -1) {
			Static143.method2462(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass3_Sub4_Sub12_Sub2_5 == null) {
				this.aClass3_Sub4_Sub12_Sub2_5 = Static16.anInterface4_1.method2900(this.anInt5356, false, this.anInt5359, Static16.aFloat7);
			}
			if (!Static16.anInterface4_1.method2910(this.anInt5356)) {
				Static143.method2462(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass3_Sub4_Sub12_Sub2_5 != null) {
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
						this.aClass3_Sub4_Sub12_Sub2_5.method4703(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt5361 - 1; local47 >= 0; local47--) {
			this.aClass118Array2[local47].method2959(arg1, arg2, arg3, arg4, arg5, local8, this.aClass118_1);
		}
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(IIIIIIII)V")
	public void method4354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static283.aGL1;
		this.method4356(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static283.method4665(false);
		Static283.method4651(false);
		Static283.method4657(false);
		Static283.method4655();
		Static283.method4658(arg1, local14, arg2, local18);
		Static283.method4641();
		@Pc(36) int local36;
		for (local36 = this.anInt5361 - 1; local36 >= 0; local36--) {
			this.aClass118Array2[local36].method2971(this.aClass118_1);
		}
		if (this.anInt5356 == -1) {
			Static283.method4660(arg7);
		} else {
			if (!Static16.anInterface4_1.method2910(this.anInt5356)) {
				Static283.method4660(arg7);
			}
			Static16.anInterface4_1.method2904(this.anInt5359, this.anInt5356);
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
		for (local36 = this.anInt5361 - 1; local36 >= 0; local36--) {
			this.aClass118Array2[local36].method2973(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static283.method4653();
		Static283.method4657(true);
		Static283.method4651(true);
		Static283.method4665(true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	private void method4356(@OriginalArg(0) int arg0) {
		if (this.anInt5362 == arg0) {
			return;
		}
		this.anInt5362 = arg0;
		@Pc(10) int local10 = Static310.method4990(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt5359) {
			this.anInt5359 = local10;
			this.aClass3_Sub4_Sub12_Sub2_5 = null;
		}
		if (this.aClass118Array1 == null) {
			return;
		}
		this.anInt5361 = 0;
		@Pc(36) int[] local36 = new int[this.aClass118Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass118Array1.length; local38++) {
			@Pc(48) Class118 local48 = this.aClass118Array1[local38];
			if (local48.method2963(this.anInt5360, this.anInt5357, this.anInt5358, this.anInt5362)) {
				local36[this.anInt5361] = local48.anInt3357;
				this.aClass118Array2[this.anInt5361++] = local48;
			}
		}
		Static73.method1117(0, local36, this.aClass118Array2, this.anInt5361 - 1);
	}
}
