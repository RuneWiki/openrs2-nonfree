import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
	private int anInt934 = -1;

	@OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
	private int anInt936 = -1;

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
	public final int anInt939;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	public final int anInt940;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	public final int anInt938;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!pg;IIII[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt939 = arg3;
		this.anInt940 = arg4;
		this.anInt938 = arg2;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3919, 0, super.anInt3921, this.anInt938, this.anInt939, this.anInt940, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!pg;IIII)V")
	public Class20_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt939 = arg3;
		this.anInt938 = arg2;
		this.anInt940 = arg4;
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glTexImage3Dub(super.anInt3919, 0, super.anInt3921, this.anInt938, this.anInt939, this.anInt940, 0, Static452.method5679(super.anInt3921), 5121, null, 0);
		this.method3113(true);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBIIIIII)V")
	public void method758(@OriginalArg(2) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		super.aClass163_Sub2_27.method4118(this);
		OpenGL.glCopyTexSubImage3D(super.anInt3919, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	@Override
	public void method4531() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt934, this.anInt936, super.anInt3919, 0, 0, 0);
		this.anInt934 = -1;
		this.anInt936 = -1;
	}
}
