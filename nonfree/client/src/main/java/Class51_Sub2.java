import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
	private int anInt2847 = -1;

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "I")
	private int anInt2845 = -1;

	@OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
	public final int anInt2850;

	@OriginalMember(owner = "client!ep", name = "x", descriptor = "I")
	public final int anInt2842;

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
	public final int anInt2848;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!jaa;IIII)V")
	public Class51_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt2850 = arg3;
		this.anInt2842 = arg2;
		this.anInt2848 = arg4;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glTexImage3Dub(super.anInt9463, 0, super.anInt9471, this.anInt2842, this.anInt2850, this.anInt2848, 0, Static163.method2976(super.anInt9471), 5121, null, 0);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!jaa;IIII[BI)V")
	public Class51_Sub2(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt2842 = arg2;
		this.anInt2848 = arg4;
		this.anInt2850 = arg3;
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9463, 0, super.anInt9471, this.anInt2842, this.anInt2850, this.anInt2848, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7734(true);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIIIIII)V")
	public void method2512(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		super.aClass14_Sub3_43.method3985(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9463, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
	@Override
	public void method7726() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2847, this.anInt2845, super.anInt9463, 0, 0, 0);
		this.anInt2845 = -1;
		this.anInt2847 = -1;
	}
}
