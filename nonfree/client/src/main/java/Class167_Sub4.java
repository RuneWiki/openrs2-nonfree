import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class167_Sub4 extends Class167 {

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	private int anInt9279 = -1;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
	private int anInt9277 = -1;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	public final int anInt9278;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	public final int anInt9283;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
	public final int anInt9285;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!rs;IIII)V")
	public Class167_Sub4(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt9278 = arg4;
		this.anInt9283 = arg3;
		this.anInt9285 = arg2;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glTexImage3Dub(super.anInt9270, 0, super.anInt9261, this.anInt9285, this.anInt9283, this.anInt9278, 0, Static48.method834(super.anInt9261), 5121, null, 0);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!rs;IIII[BI)V")
	public Class167_Sub4(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt9283 = arg3;
		this.anInt9285 = arg2;
		this.anInt9278 = arg4;
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9270, 0, super.anInt9261, this.anInt9285, this.anInt9283, this.anInt9278, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8013(true);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	@Override
	public void method8000() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt9279, this.anInt9277, super.anInt9270, 0, 0, 0);
		this.anInt9277 = -1;
		this.anInt9279 = -1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V")
	public void method8016(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass133_Sub3_34.method7375(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9270, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}
}
