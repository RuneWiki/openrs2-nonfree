import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class150 {

	@OriginalMember(owner = "client!t", name = "g", descriptor = "I")
	private int anInt5419;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "I")
	private int anInt5421;

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!n;")
	private Class1_Sub2_Sub14_Sub1 aClass1_Sub2_Sub14_Sub1_3;

	@OriginalMember(owner = "client!t", name = "l", descriptor = "I")
	private int anInt5423 = -1;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "I")
	private int anInt5417;

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	private int anInt5422;

	@OriginalMember(owner = "client!t", name = "h", descriptor = "I")
	private int anInt5420;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt5418;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[Lclient!vc;")
	private Class165[] aClass165Array1;

	@OriginalMember(owner = "client!t", name = "e", descriptor = "[Lclient!vc;")
	private Class165[] aClass165Array2;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!vc;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(I[Lclient!vc;IIII)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) Class165[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5417 = arg3;
		this.anInt5422 = arg4;
		this.anInt5420 = arg5;
		this.anInt5418 = arg0;
		this.aClass165Array1 = arg1;
		if (arg1 == null) {
			this.aClass165Array2 = null;
			this.aClass165_1 = null;
		} else {
			this.aClass165Array2 = new Class165[arg1.length];
			this.aClass165_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
	public void method4251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static296.aGL1;
		this.method4252(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static296.method4814(false);
		Static296.method4840(false);
		Static296.method4798(false);
		Static296.method4811();
		Static296.method4838(arg1, local14, arg2, local18);
		Static296.method4808();
		@Pc(36) int local36;
		for (local36 = this.anInt5419 - 1; local36 >= 0; local36--) {
			this.aClass165Array2[local36].method4621(this.aClass165_1);
		}
		if (this.anInt5418 == -1) {
			Static296.method4833(arg7);
		} else {
			if (!Static151.anInterface2_1.method4420(this.anInt5418)) {
				Static296.method4833(arg7);
			}
			Static151.anInterface2_1.method4425(this.anInt5421, this.anInt5418);
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
		for (local36 = this.anInt5419 - 1; local36 >= 0; local36--) {
			this.aClass165Array2[local36].method4614(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static296.method4813();
		Static296.method4798(true);
		Static296.method4840(true);
		Static296.method4814(true);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	private void method4252(@OriginalArg(0) int arg0) {
		if (this.anInt5423 == arg0) {
			return;
		}
		this.anInt5423 = arg0;
		@Pc(10) int local10 = Static56.method1126(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt5421) {
			this.anInt5421 = local10;
			this.aClass1_Sub2_Sub14_Sub1_3 = null;
		}
		if (this.aClass165Array1 == null) {
			return;
		}
		this.anInt5419 = 0;
		@Pc(36) int[] local36 = new int[this.aClass165Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass165Array1.length; local38++) {
			@Pc(48) Class165 local48 = this.aClass165Array1[local38];
			if (local48.method4625(this.anInt5417, this.anInt5422, this.anInt5420, this.anInt5423)) {
				local36[this.anInt5419] = local48.anInt5961;
				this.aClass165Array2[this.anInt5419++] = local48;
			}
		}
		Static254.method4243(0, local36, this.anInt5419 - 1, this.aClass165Array2);
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IIIIIIII)V")
	public void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4252(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt5418 == -1) {
			Static203.method3592(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub2_Sub14_Sub1_3 == null) {
				this.aClass1_Sub2_Sub14_Sub1_3 = Static151.anInterface2_1.method4412(false, this.anInt5421, Static151.aFloat122, this.anInt5418);
			}
			if (!Static151.anInterface2_1.method4420(this.anInt5418)) {
				Static203.method3592(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub2_Sub14_Sub1_3 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static203.anInt4507; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static203.anInt4511; local100 += arg4) {
						this.aClass1_Sub2_Sub14_Sub1_3.method2726(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt5419 - 1; local47 >= 0; local47--) {
			this.aClass165Array2[local47].method4631(arg1, arg2, arg3, arg4, arg5, local8, this.aClass165_1);
		}
	}
}
