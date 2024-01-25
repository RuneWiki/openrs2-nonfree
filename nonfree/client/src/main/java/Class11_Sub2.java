import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
	private int anInt1685 = -1;

	@OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
	private int anInt1688 = -1;

	@OriginalMember(owner = "client!vga", name = "y", descriptor = "I")
	public final int anInt1686;

	@OriginalMember(owner = "client!vga", name = "z", descriptor = "I")
	public final int anInt1687;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ji;IIIII)V")
	public Class11_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg4 * arg5, false);
		this.anInt1686 = arg4;
		this.anInt1687 = arg5;
		@Pc(30) int local30 = super.aClass15_Sub3_35.lb - arg5 - arg3;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glCopyTexImage2D(super.anInt9053, 0, super.anInt9048, arg2, local30, arg4, arg5, 0);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ji;IIIIZ[IZ)V")
	public Class11_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1686 = arg3;
		this.anInt1687 = arg4;
		if (arg7) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = (arg4 - local28 - 1) * arg3;
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass15_Sub3_35.method4377(this);
		if (arg5 && super.anInt9053 != 34037) {
			Static19.method754(super.aClass15_Sub3_35.anInt5362, this.anInt1686, super.anInt9053, this.anInt1687, arg6, super.anInt9048);
			this.method7405(true);
		} else {
			OpenGL.glTexImage2Di(super.anInt9053, 0, super.anInt9048, this.anInt1686, this.anInt1687, 0, 32993, super.aClass15_Sub3_35.anInt5362, arg6, 0);
			this.method7405(false);
		}
		this.method7412(true);
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ji;IIIIZ[FI)V")
	public Class11_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1686 = arg3;
		this.anInt1687 = arg4;
		super.aClass15_Sub3_35.method4377(this);
		if (arg5 && super.anInt9053 != 34037) {
			Static400.method6457(arg4, arg1, arg6, arg7, arg3, arg2);
			this.method7405(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt9053, 0, super.anInt9048, this.anInt1686, this.anInt1687, 0, arg7, 5126, arg6, 0);
			this.method7405(false);
		}
		this.method7412(true);
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ji;IIIIZ[BIZ)V")
	public Class11_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt1686 = arg3;
		this.anInt1687 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt9053 != 34037) {
			Static460.method7072(arg7, arg6, arg1, arg4, arg3, arg2);
			this.method7405(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt9053, 0, super.anInt9048, this.anInt1686, this.anInt1687, 0, arg7, 5121, arg6, 0);
			this.method7405(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ji;IIII)V")
	public Class11_Sub2(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg4 * arg3, false);
		this.anInt1686 = arg3;
		this.anInt1687 = arg4;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glTexImage2Dub(super.anInt9053, 0, super.anInt9048, arg3, arg4, 0, Static596.method8421(super.anInt9048), 5121, null, 0);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	@Override
	public final void method8310() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1685, this.anInt1688, super.anInt9053, 0, 0);
		this.anInt1688 = -1;
		this.anInt1685 = -1;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZBZ)V")
	public final void method1633(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt9053 == 3553) {
			super.aClass15_Sub3_35.method4377(this);
			OpenGL.glTexParameteri(super.anInt9053, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt9053, 10243, arg1 ? 10497 : 33071);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIII)V")
	public final void method1634(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, super.anInt9053, super.anInt9049, 0);
		this.anInt1685 = arg1;
		this.anInt1688 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIBIIII)V")
	public final void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = super.aClass15_Sub3_35.lb - arg0 - arg3;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glCopyTexSubImage2D(super.anInt9053, 0, arg2, this.anInt1687 - arg3 - arg4, arg5, local16, arg1, arg3);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIIIIII[IZ)V")
	protected final void method1640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int[] arg2) {
		@Pc(14) int[] local14 = new int[arg1 * arg0];
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			@Pc(21) int local21 = local16 * arg0;
			@Pc(32) int local32 = (arg1 - local16 - 1) * arg0;
			for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
				local14[local21++] = arg2[local32++];
			}
		}
		super.aClass15_Sub3_35.method4377(this);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Di(super.anInt9053, 0, 0, 0, arg0, arg1, 32993, super.aClass15_Sub3_35.anInt5362, local14, 0);
		if (arg0 != arg0) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(III[BZIIIII)V")
	public final void method1641(@OriginalArg(3) byte[] arg0, @OriginalArg(4) boolean arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(9) int arg4) {
		if (arg1) {
			@Pc(13) int local13 = Static191.method3300(6406);
			@Pc(17) int local17 = arg2 * local13;
			@Pc(21) int local21 = arg2 * local13;
			@Pc(26) byte[] local26 = new byte[local17 * arg4];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * local17;
				@Pc(45) int local45 = (arg4 - local28 - 1) * local21;
				for (@Pc(47) int local47 = 0; local47 < local17; local47++) {
					local26[local33++] = arg0[local45++];
				}
			}
			arg0 = local26;
		}
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9053, 0, 0, 0, arg2, arg4, 6406, 5121, arg0, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}
}
