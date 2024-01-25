import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt748 = -1;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
	private int anInt756 = -1;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public final int anInt746;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
	public final int anInt755;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	public final int anInt757;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!rl;IIII)V")
	public Class19_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt746 = arg3;
		this.anInt755 = arg4;
		this.anInt757 = arg2;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glTexImage3Dub(super.anInt5060, 0, super.anInt5062, this.anInt757, this.anInt746, this.anInt755, 0, Static426.method6222(super.anInt5062), 5121, null, 0);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!rl;IIII[BI)V")
	public Class19_Sub1(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt755 = arg4;
		this.anInt746 = arg3;
		this.anInt757 = arg2;
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5060, 0, super.anInt5062, this.anInt757, this.anInt746, this.anInt755, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4238(true);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method4235() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt756, this.anInt748, super.anInt5060, 0, 0, 0);
		this.anInt748 = -1;
		this.anInt756 = -1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIBII)V")
	public void method652(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		super.aClass66_Sub2_28.method5109(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5060, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}
}
