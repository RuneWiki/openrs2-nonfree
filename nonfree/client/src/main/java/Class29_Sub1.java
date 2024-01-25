import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	private int anInt517 = -1;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	private int anInt518 = -1;

	@OriginalMember(owner = "client!be", name = "w", descriptor = "I")
	public final int anInt515;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "I")
	public final int anInt519;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public final int anInt521;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vf;IIII)V")
	public Class29_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt515 = arg3;
		this.anInt519 = arg2;
		this.anInt521 = arg4;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glTexImage3Dub(super.anInt9567, 0, super.anInt9574, this.anInt519, this.anInt515, this.anInt521, 0, Static271.method4452(super.anInt9574), 5121, (byte[]) null, 0);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!vf;IIII[BI)V")
	public Class29_Sub1(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt515 = arg3;
		this.anInt521 = arg4;
		this.anInt519 = arg2;
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9567, 0, super.anInt9574, this.anInt519, this.anInt515, this.anInt521, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8164(true);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	@Override
	public void method8162() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt517, this.anInt518, super.anInt9567, 0, 0, 0);
		this.anInt518 = -1;
		this.anInt517 = -1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIII)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass100_Sub3_41.method8743(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9567, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
