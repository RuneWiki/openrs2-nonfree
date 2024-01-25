import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
	private int anInt3585 = -1;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
	private int anInt3586 = -1;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
	public final int anInt3587;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
	public final int anInt3591;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
	public final int anInt3589;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ok;IIII[BI)V")
	public Class40_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3587 = arg2;
		this.anInt3591 = arg3;
		this.anInt3589 = arg4;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7362, 0, super.anInt7350, this.anInt3587, this.anInt3591, this.anInt3589, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!ok;IIII)V")
	public Class40_Sub2(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3589 = arg4;
		this.anInt3587 = arg2;
		this.anInt3591 = arg3;
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glTexImage3Dub(super.anInt7362, 0, super.anInt7350, this.anInt3587, this.anInt3591, this.anInt3589, 0, Static22.method242(super.anInt7350), 5121, null, 0);
		this.method5874(true);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZIII)V")
	public void method2951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		super.aClass134_Sub2_31.method5202(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7362, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method5870() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3586, this.anInt3585, super.anInt7362, 0, 0, 0);
		this.anInt3586 = -1;
		this.anInt3585 = -1;
	}
}
