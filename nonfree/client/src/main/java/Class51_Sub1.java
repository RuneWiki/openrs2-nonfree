import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	private int anInt4041 = -1;

	@OriginalMember(owner = "client!co", name = "L", descriptor = "I")
	private int anInt4049 = -1;

	@OriginalMember(owner = "client!co", name = "C", descriptor = "I")
	public final int anInt4042;

	@OriginalMember(owner = "client!co", name = "D", descriptor = "I")
	public final int anInt4043;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!jaa;IIIII)V")
	public Class51_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt4042 = arg4;
		this.anInt4043 = arg5;
		@Pc(28) int local28 = super.aClass14_Sub3_43.anInt4385 - arg5 - arg3;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glCopyTexImage2D(super.anInt9463, 0, super.anInt9471, arg2, local28, arg4, arg5, 0);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!jaa;IIIIZ[FI)V")
	public Class51_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4043 = arg4;
		this.anInt4042 = arg3;
		super.aClass14_Sub3_43.method3985(this);
		if (arg5 && super.anInt9463 != 34037) {
			Static527.method7218(arg6, arg7, arg3, arg2, arg1, arg4);
			this.method7727(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9463, 0, super.anInt9471, this.anInt4042, this.anInt4043, 0, arg7, 5126, arg6, 0);
			this.method7727(false);
		}
		this.method7734(true);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!jaa;IIII)V")
	public Class51_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt4042 = arg3;
		this.anInt4043 = arg4;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glTexImage2Dub(super.anInt9463, 0, super.anInt9471, arg3, arg4, 0, Static163.method2976(super.anInt9471), 5121, null, 0);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!jaa;IIIIZ[BIZ)V")
	public Class51_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt4043 = arg4;
		this.anInt4042 = arg3;
		if (arg8) {
			@Pc(28) byte[] local28 = new byte[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(44) int local44 = arg3 * (arg4 - local30 - 1);
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					local28[local36++] = arg6[local44++];
				}
			}
			arg6 = local28;
		}
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9463 != 34037) {
			Static60.method1253(arg6, arg2, arg1, arg3, arg7, arg4);
			this.method7727(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9463, 0, super.anInt9471, this.anInt4042, this.anInt4043, 0, arg7, 5121, arg6, 0);
			this.method7727(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!jaa;IIIIZ[IZ)V")
	public Class51_Sub1(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg4 * arg3, arg5);
		this.anInt4043 = arg4;
		this.anInt4042 = arg3;
		if (arg7) {
			@Pc(28) int[] local28 = new int[arg6.length];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = arg3 * local30;
				@Pc(45) int local45 = arg3 * (arg4 - local30 - 1);
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					local28[local36++] = arg6[local45++];
				}
			}
			arg6 = local28;
		}
		super.aClass14_Sub3_43.method3985(this);
		if (arg5 && super.anInt9463 != 34037) {
			Static577.method7711(this.anInt4042, arg6, super.aClass14_Sub3_43.anInt4599, super.anInt9463, super.anInt9471, this.anInt4043);
			this.method7727(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt9463, 0, super.anInt9471, this.anInt4042, this.anInt4043, 0, 32993, super.aClass14_Sub3_43.anInt4599, arg6, 0);
			this.method7727(false);
		}
		this.method7734(true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IZZ)V")
	public final void method3535(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9463 == 3553) {
			super.aClass14_Sub3_43.method3985(this);
			OpenGL.glTexParameteri(super.anInt9463, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9463, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIII)V")
	public final void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) int local19 = super.aClass14_Sub3_43.anInt4385 - arg0 - arg4;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9463, 0, arg5, this.anInt4043 - arg1 - arg0, arg2, local19, arg3, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IBII)V")
	public final void method3538(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9463, super.anInt9474, 0);
		this.anInt4041 = arg1;
		this.anInt4049 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIZIIII[II)V")
	protected final void method3541(@OriginalArg(3) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int[] arg2) {
		@Pc(16) int[] local16 = new int[arg1 * arg0];
		for (@Pc(18) int local18 = 0; local18 < arg0; local18++) {
			@Pc(24) int local24 = arg1 * local18;
			@Pc(36) int local36 = arg1 * (arg0 - local18 - 1);
			for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
				local16[local24++] = arg2[local36++];
			}
		}
		super.aClass14_Sub3_43.method3985(this);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, arg1);
		}
		OpenGL.glTexSubImage2Di(super.anInt9463, 0, 0, 0, arg1, arg0, 32993, super.aClass14_Sub3_43.anInt4599, local16, 0);
		if (arg1 != arg1) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	@Override
	public final void method7726() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4041, this.anInt4049, super.anInt9463, 0, 0);
		this.anInt4041 = -1;
		this.anInt4049 = -1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIZ[BZIIII)V")
	public final void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(7) int arg4) {
		if (arg2) {
			@Pc(15) int local15 = Static52.method1134(6406);
			@Pc(19) int local19 = arg0 * local15;
			@Pc(23) int local23 = local15 * arg0;
			@Pc(28) byte[] local28 = new byte[local19 * arg4];
			for (@Pc(30) int local30 = 0; local30 < arg4; local30++) {
				@Pc(36) int local36 = local30 * local19;
				@Pc(47) int local47 = (arg4 - local30 - 1) * local23;
				for (@Pc(49) int local49 = 0; local49 < local19; local49++) {
					local28[local36++] = arg3[local47++];
				}
			}
			arg3 = local28;
		}
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9463, 0, 0, 0, arg0, arg4, 6406, 5121, arg3, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
