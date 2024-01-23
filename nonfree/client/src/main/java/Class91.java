import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class91 {

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "Lclient!eg;")
	private Class8_Sub1_Sub7_Sub1 aClass8_Sub1_Sub7_Sub1_2;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "I")
	private int anInt2608;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	private int anInt2602 = -1;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private int anInt2606;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private int anInt2607;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "I")
	private int anInt2603;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "[Lclient!ma;")
	private Class109[] aClass109Array1;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "[Lclient!ma;")
	private Class109[] aClass109Array2;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!ma;")
	private Class109 aClass109_1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I[Lclient!ma;IIII)V")
	public Class91(@OriginalArg(0) int arg0, @OriginalArg(1) Class109[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2606 = arg3;
		this.anInt2607 = arg4;
		this.anInt2605 = arg5;
		this.anInt2603 = arg0;
		this.aClass109Array1 = arg1;
		if (arg1 == null) {
			this.aClass109Array2 = null;
			this.aClass109_1 = null;
		} else {
			this.aClass109Array2 = new Class109[arg1.length];
			this.aClass109_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	private void method2095(@OriginalArg(0) int arg0) {
		if (this.anInt2602 == arg0) {
			return;
		}
		this.anInt2602 = arg0;
		@Pc(10) int local10 = Static125.method1987(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt2608) {
			this.anInt2608 = local10;
			this.aClass8_Sub1_Sub7_Sub1_2 = null;
		}
		if (this.aClass109Array1 == null) {
			return;
		}
		this.anInt2604 = 0;
		@Pc(36) int[] local36 = new int[this.aClass109Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass109Array1.length; local38++) {
			@Pc(48) Class109 local48 = this.aClass109Array1[local38];
			if (local48.method2481(this.anInt2606, this.anInt2607, this.anInt2605, this.anInt2602)) {
				local36[this.anInt2604] = local48.anInt3146;
				this.aClass109Array2[this.anInt2604++] = local48;
			}
		}
		Static2.method5(this.aClass109Array2, 0, this.anInt2604 - 1, local36);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIIII)V")
	public void method2097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static116.aGL1;
		this.method2095(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static116.method1885(false);
		Static116.method1883(false);
		Static116.method1871(false);
		Static116.method1892();
		Static116.method1899(arg1, local14, arg2, local18);
		Static116.method1874();
		@Pc(36) int local36;
		for (local36 = this.anInt2604 - 1; local36 >= 0; local36--) {
			this.aClass109Array2[local36].method2473(this.aClass109_1);
		}
		if (this.anInt2603 == -1) {
			Static116.method1903(arg7);
		} else {
			if (!Static96.anInterface4_1.method1266(this.anInt2603)) {
				Static116.method1903(arg7);
			}
			Static96.anInterface4_1.method1269(this.anInt2603, this.anInt2608);
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
		for (local36 = this.anInt2604 - 1; local36 >= 0; local36--) {
			this.aClass109Array2[local36].method2472(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static116.method1881();
		Static116.method1871(true);
		Static116.method1883(true);
		Static116.method1885(true);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(IIIIIIII)V")
	public void method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method2095(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt2603 == -1) {
			Static103.method1664(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass8_Sub1_Sub7_Sub1_2 == null) {
				this.aClass8_Sub1_Sub7_Sub1_2 = Static96.anInterface4_1.method1260(false, Static96.aFloat21, this.anInt2608, this.anInt2603);
			}
			if (!Static96.anInterface4_1.method1266(this.anInt2603)) {
				Static103.method1664(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass8_Sub1_Sub7_Sub1_2 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static103.anInt2161; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static103.anInt2164; local100 += arg4) {
						this.aClass8_Sub1_Sub7_Sub1_2.method2808(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt2604 - 1; local47 >= 0; local47--) {
			this.aClass109Array2[local47].method2475(arg1, arg2, arg3, arg4, arg5, local8, this.aClass109_1);
		}
	}
}
