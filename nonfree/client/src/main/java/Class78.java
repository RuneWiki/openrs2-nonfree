import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class78 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!n;")
	private Class4_Sub2_Sub4_Sub2 aClass4_Sub2_Sub4_Sub2_5;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "I")
	private int anInt2450;

	@OriginalMember(owner = "client!in", name = "i", descriptor = "I")
	private int anInt2453;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	private int anInt2454 = -1;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "I")
	private int anInt2449;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	private int anInt2452;

	@OriginalMember(owner = "client!in", name = "k", descriptor = "I")
	private int anInt2455;

	@OriginalMember(owner = "client!in", name = "g", descriptor = "I")
	private int anInt2451;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "[Lclient!af;")
	private Class6[] aClass6Array1;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "[Lclient!af;")
	private Class6[] aClass6Array2;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!af;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I[Lclient!af;IIII)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) Class6[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2449 = arg3;
		this.anInt2452 = arg4;
		this.anInt2455 = arg5;
		this.anInt2451 = arg0;
		this.aClass6Array1 = arg1;
		if (arg1 == null) {
			this.aClass6Array2 = null;
			this.aClass6_1 = null;
		} else {
			this.aClass6Array2 = new Class6[arg1.length];
			this.aClass6_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	private void method2003(@OriginalArg(0) int arg0) {
		if (this.anInt2454 == arg0) {
			return;
		}
		this.anInt2454 = arg0;
		@Pc(10) int local10 = Static70.method1196(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt2453) {
			this.anInt2453 = local10;
			this.aClass4_Sub2_Sub4_Sub2_5 = null;
		}
		if (this.aClass6Array1 == null) {
			return;
		}
		this.anInt2450 = 0;
		@Pc(36) int[] local36 = new int[this.aClass6Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass6Array1.length; local38++) {
			@Pc(48) Class6 local48 = this.aClass6Array1[local38];
			if (local48.method107(this.anInt2449, this.anInt2452, this.anInt2455, this.anInt2454)) {
				local36[this.anInt2450] = local48.anInt128;
				this.aClass6Array2[this.anInt2450++] = local48;
			}
		}
		Static58.method2507(local36, 0, this.aClass6Array2, this.anInt2450 - 1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIIIIII)V")
	public void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static251.aGL1;
		this.method2003(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static251.method3894(false);
		Static251.method3854(false);
		Static251.method3868(false);
		Static251.method3873();
		Static251.method3855(arg1, local14, arg2, local18);
		Static251.method3856();
		@Pc(36) int local36;
		for (local36 = this.anInt2450 - 1; local36 >= 0; local36--) {
			this.aClass6Array2[local36].method102(this.aClass6_1);
		}
		if (this.anInt2451 == -1) {
			Static251.method3867(arg7);
		} else {
			if (!Static283.anInterface1_1.method2426(this.anInt2451)) {
				Static251.method3867(arg7);
			}
			Static283.anInterface1_1.method2424(this.anInt2451, this.anInt2453);
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
		for (local36 = this.anInt2450 - 1; local36 >= 0; local36--) {
			this.aClass6Array2[local36].method92(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static251.method3878();
		Static251.method3868(true);
		Static251.method3854(true);
		Static251.method3894(true);
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(IIIIIIII)V")
	public void method2005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2003(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt2451 == -1) {
			Static258.method4031(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass4_Sub2_Sub4_Sub2_5 == null) {
				this.aClass4_Sub2_Sub4_Sub2_5 = Static283.anInterface1_1.method2428(false, this.anInt2453, Static283.aFloat160, this.anInt2451);
			}
			if (!Static283.anInterface1_1.method2426(this.anInt2451)) {
				Static258.method4031(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass4_Sub2_Sub4_Sub2_5 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static258.anInt5069; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static258.anInt5064; local100 += arg4) {
						this.aClass4_Sub2_Sub4_Sub2_5.method4136(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt2450 - 1; local47 >= 0; local47--) {
			this.aClass6Array2[local47].method99(arg1, arg2, arg3, arg4, arg5, local8, this.aClass6_1);
		}
	}
}
