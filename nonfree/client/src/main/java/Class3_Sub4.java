import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!is", name = "y", descriptor = "I")
	private int anInt3247 = -1;

	@OriginalMember(owner = "client!is", name = "B", descriptor = "I")
	private int anInt3249 = -1;

	@OriginalMember(owner = "client!is", name = "v", descriptor = "I")
	public final int anInt3244;

	@OriginalMember(owner = "client!is", name = "u", descriptor = "I")
	public final int anInt3243;

	@OriginalMember(owner = "client!is", name = "x", descriptor = "I")
	public final int anInt3246;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!kd;IIII[BI)V")
	public Class3_Sub4(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3244 = arg2;
		this.anInt3243 = arg3;
		this.anInt3246 = arg4;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt4987, 0, super.anInt4993, this.anInt3244, this.anInt3243, this.anInt3246, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!kd;IIII)V")
	public Class3_Sub4(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3243 = arg3;
		this.anInt3246 = arg4;
		this.anInt3244 = arg2;
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glTexImage3Dub(super.anInt4987, 0, super.anInt4993, this.anInt3244, this.anInt3243, this.anInt3246, 0, Static105.method1877(super.anInt4993), 5121, null, 0);
		this.method4146(true);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	@Override
	public void method4145() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3249, this.anInt3247, super.anInt4987, 0, 0, 0);
		this.anInt3249 = -1;
		this.anInt3247 = -1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIII)V")
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		super.aClass39_Sub2_29.method3203(this);
		OpenGL.glCopyTexSubImage3D(super.anInt4987, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
