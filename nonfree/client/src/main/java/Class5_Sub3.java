import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
	private int anInt4034 = -1;

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
	private int anInt4035 = -1;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
	public final int anInt4039;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
	public final int anInt4037;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
	public final int anInt4038;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!od;IIII[BI)V")
	public Class5_Sub3(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt4039 = arg3;
		this.anInt4037 = arg2;
		this.anInt4038 = arg4;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7321, 0, super.anInt7332, this.anInt4037, this.anInt4039, this.anInt4038, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!od;IIII)V")
	public Class5_Sub3(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt4037 = arg2;
		this.anInt4038 = arg4;
		this.anInt4039 = arg3;
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glTexImage3Dub(super.anInt7321, 0, super.anInt7332, this.anInt4037, this.anInt4039, this.anInt4038, 0, Static217.method2879(super.anInt7332), 5121, null, 0);
		this.method5540(true);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public void method5532() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4035, this.anInt4034, super.anInt7321, 0, 0, 0);
		this.anInt4034 = -1;
		this.anInt4035 = -1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIIIII)V")
	public void method3225(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		super.aClass128_Sub2_43.method3691(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7321, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}
}
