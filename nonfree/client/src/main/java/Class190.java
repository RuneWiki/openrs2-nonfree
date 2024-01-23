import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class190 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "Lclient!ln;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_5;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
	private int anInt5805;

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	private int anInt5807;

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	private int anInt5808 = -1;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
	private int anInt5806;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private int anInt5809;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	private int anInt5803;

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
	private int anInt5804;

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "[Lclient!mb;")
	private Class110[] aClass110Array2;

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "[Lclient!mb;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "Lclient!mb;")
	private Class110 aClass110_1;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[Lclient!mb;IIII)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5806 = arg3;
		this.anInt5809 = arg4;
		this.anInt5803 = arg5;
		this.anInt5804 = arg0;
		this.aClass110Array2 = arg1;
		if (arg1 == null) {
			this.aClass110Array1 = null;
			this.aClass110_1 = null;
		} else {
			this.aClass110Array1 = new Class110[arg1.length];
			this.aClass110_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
	public void method4562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method4564(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt5804 == -1) {
			Static41.method730(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass1_Sub1_Sub3_Sub2_5 == null) {
				this.aClass1_Sub1_Sub3_Sub2_5 = Static18.anInterface1_1.method1628(false, Static18.aFloat3, this.anInt5804, this.anInt5807);
			}
			if (!Static18.anInterface1_1.method1634(this.anInt5804)) {
				Static41.method730(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass1_Sub1_Sub3_Sub2_5 != null) {
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
						this.aClass1_Sub1_Sub3_Sub2_5.method4631(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt5805 - 1; local47 >= 0; local47--) {
			this.aClass110Array1[local47].method2765(arg1, arg2, arg3, arg4, arg5, local8, this.aClass110_1);
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	private void method4564(@OriginalArg(0) int arg0) {
		if (this.anInt5808 == arg0) {
			return;
		}
		this.anInt5808 = arg0;
		@Pc(10) int local10 = Static302.method4512(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt5807) {
			this.anInt5807 = local10;
			this.aClass1_Sub1_Sub3_Sub2_5 = null;
		}
		if (this.aClass110Array2 == null) {
			return;
		}
		this.anInt5805 = 0;
		@Pc(36) int[] local36 = new int[this.aClass110Array2.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass110Array2.length; local38++) {
			@Pc(48) Class110 local48 = this.aClass110Array2[local38];
			if (local48.method2764(this.anInt5806, this.anInt5809, this.anInt5803, this.anInt5808)) {
				local36[this.anInt5805] = local48.anInt3431;
				this.aClass110Array1[this.anInt5805++] = local48;
			}
		}
		Static222.method3504(this.aClass110Array1, local36, this.anInt5805 - 1, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIII)V")
	public void method4565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static291.aGL1;
		this.method4564(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static291.method4321(false);
		Static291.method4331(false);
		Static291.method4292(false);
		Static291.method4297();
		Static291.method4320(arg1, local14, arg2, local18);
		Static291.method4330();
		@Pc(36) int local36;
		for (local36 = this.anInt5805 - 1; local36 >= 0; local36--) {
			this.aClass110Array1[local36].method2781(this.aClass110_1);
		}
		if (this.anInt5804 == -1) {
			Static291.method4300(arg7);
		} else {
			if (!Static18.anInterface1_1.method1634(this.anInt5804)) {
				Static291.method4300(arg7);
			}
			Static18.anInterface1_1.method1633(this.anInt5804, this.anInt5807);
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
		for (local36 = this.anInt5805 - 1; local36 >= 0; local36--) {
			this.aClass110Array1[local36].method2774(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static291.method4333();
		Static291.method4292(true);
		Static291.method4331(true);
		Static291.method4321(true);
	}
}
