import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public final class Class94_Sub3 extends Class94 {

	@OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
	private int anInt3187 = -1;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "I")
	private int anInt3186 = -1;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
	public final int anInt3184;

	@OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
	public final int anInt3189;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
	public final int anInt3188;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!dw;IIII)V")
	public Class94_Sub3(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3184 = arg2;
		this.anInt3189 = arg3;
		this.anInt3188 = arg4;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glTexImage3Dub(super.anInt4672, 0, super.anInt4680, this.anInt3184, this.anInt3189, this.anInt3188, 0, Static512.method7421(super.anInt4680), 5121, (byte[]) null, 0);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!dw;IIII[BI)V")
	public Class94_Sub3(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3184 = arg2;
		this.anInt3189 = arg3;
		this.anInt3188 = arg4;
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt4672, 0, super.anInt4680, this.anInt3184, this.anInt3189, this.anInt3188, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4012(true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIII)V")
	public void method2754(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass82_Sub1_25.method2029(this);
		OpenGL.glCopyTexSubImage3D(super.anInt4672, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	@Override
	public void method4004() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3187, this.anInt3186, super.anInt4672, 0, 0, 0);
		this.anInt3187 = -1;
		this.anInt3186 = -1;
	}
}
