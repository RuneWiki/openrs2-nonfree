import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class137 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
	private int anInt4242;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	private int anInt4247;

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!af;")
	private Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_4;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	private int anInt4243 = -1;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	private int anInt4248;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
	private int anInt4245;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	private int anInt4244;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
	private int anInt4246;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "[Lclient!ok;")
	private Class129[] aClass129Array1;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "[Lclient!ok;")
	private Class129[] aClass129Array2;

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Lclient!ok;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(I[Lclient!ok;IIII)V")
	public Class137(@OriginalArg(0) int arg0, @OriginalArg(1) Class129[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4248 = arg3;
		this.anInt4245 = arg4;
		this.anInt4244 = arg5;
		this.anInt4246 = arg0;
		this.aClass129Array1 = arg1;
		if (arg1 == null) {
			this.aClass129Array2 = null;
			this.aClass129_1 = null;
		} else {
			this.aClass129Array2 = new Class129[arg1.length];
			this.aClass129_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	private void method3428(@OriginalArg(0) int arg0) {
		if (this.anInt4243 == arg0) {
			return;
		}
		this.anInt4243 = arg0;
		@Pc(10) int local10 = Static186.method3169(arg0);
		if (local10 > 512) {
			local10 = 512;
		}
		if (local10 != this.anInt4242) {
			this.anInt4242 = local10;
			this.aClass2_Sub3_Sub1_Sub1_4 = null;
		}
		if (this.aClass129Array1 == null) {
			return;
		}
		this.anInt4247 = 0;
		@Pc(36) int[] local36 = new int[this.aClass129Array1.length];
		for (@Pc(38) int local38 = 0; local38 < this.aClass129Array1.length; local38++) {
			@Pc(48) Class129 local48 = this.aClass129Array1[local38];
			if (local48.method3236(this.anInt4248, this.anInt4245, this.anInt4244, this.anInt4243)) {
				local36[this.anInt4247] = local48.anInt4006;
				this.aClass129Array2[this.anInt4247++] = local48;
			}
		}
		Static38.method726(local36, this.aClass129Array2, 0, this.anInt4247 - 1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V")
	public void method3429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.method3428(arg4);
		@Pc(8) int local8 = arg6 + arg0 & 0x7FF;
		@Pc(47) int local47;
		if (this.anInt4246 == -1) {
			Static160.method2788(arg1, arg2, arg3, arg4, 0);
		} else {
			if (this.aClass2_Sub3_Sub1_Sub1_4 == null) {
				this.aClass2_Sub3_Sub1_Sub1_4 = Static93.anInterface5_1.method3525(Static93.aFloat23, false, this.anInt4242, this.anInt4246);
			}
			if (!Static93.anInterface5_1.method3513(this.anInt4246)) {
				Static160.method2788(arg1, arg2, arg3, arg4, 0);
			}
			if (this.aClass2_Sub3_Sub1_Sub1_4 != null) {
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
				for (@Pc(93) int local93 = local59 - arg4; local93 < Static160.anInt3390; local93 += arg4) {
					for (@Pc(100) int local100 = local47 - arg4; local100 < Static160.anInt3388; local100 += arg4) {
						this.aClass2_Sub3_Sub1_Sub1_4.method4363(local93 + arg1, local100 + arg2, arg4, arg4);
					}
				}
			}
		}
		for (local47 = this.anInt4247 - 1; local47 >= 0; local47--) {
			this.aClass129Array2[local47].method3229(arg1, arg2, arg3, arg4, arg5, local8, this.aClass129_1);
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIIII)V")
	public void method3431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) GL local1 = Static60.aGL1;
		this.method3428(arg4);
		@Pc(10) int local10 = arg6 + arg0 & 0x7FF;
		@Pc(14) int local14 = arg1 + arg3;
		@Pc(18) int local18 = arg2 + arg4;
		Static60.method1151(false);
		Static60.method1164(false);
		Static60.method1178(false);
		Static60.method1172();
		Static60.method1161(arg1, local14, arg2, local18);
		Static60.method1158();
		@Pc(36) int local36;
		for (local36 = this.anInt4247 - 1; local36 >= 0; local36--) {
			this.aClass129Array2[local36].method3221(this.aClass129_1);
		}
		if (this.anInt4246 == -1) {
			Static60.method1173(arg7);
		} else {
			if (!Static93.anInterface5_1.method3513(this.anInt4246)) {
				Static60.method1173(arg7);
			}
			Static93.anInterface5_1.method3522(this.anInt4246, this.anInt4242);
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
		for (local36 = this.anInt4247 - 1; local36 >= 0; local36--) {
			this.aClass129Array2[local36].method3233(arg1, arg2, arg3, arg4, arg5, local10);
		}
		Static60.method1145();
		Static60.method1178(true);
		Static60.method1164(true);
		Static60.method1151(true);
	}
}
