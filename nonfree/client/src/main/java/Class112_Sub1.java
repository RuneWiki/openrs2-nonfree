import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	private int anInt3728 = -1;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	private int anInt3729 = -1;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	public final int anInt3726;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
	public final int anInt3720;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	public final int anInt3730;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!vj;IIII[BI)V")
	public Class112_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3726 = arg4;
		this.anInt3720 = arg3;
		this.anInt3730 = arg2;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5815, 0, super.anInt5821, this.anInt3730, this.anInt3720, this.anInt3726, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class112_Sub1(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3730 = arg2;
		this.anInt3726 = arg4;
		this.anInt3720 = arg3;
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glTexImage3Dub(super.anInt5815, 0, super.anInt5821, this.anInt3730, this.anInt3720, this.anInt3726, 0, Static228.method3427(super.anInt5821), 5121, null, 0);
		this.method4551(true);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	@Override
	public void method4544() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3728, this.anInt3729, super.anInt5815, 0, 0, 0);
		this.anInt3728 = -1;
		this.anInt3729 = -1;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
	public void method2978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass172_Sub2_29.method5630(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5815, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}
}
