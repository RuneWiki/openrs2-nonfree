import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	private int anInt2632 = -1;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
	private int anInt2633 = -1;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
	public final int anInt2634;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public final int anInt2630;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
	public final int anInt2629;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!qfa;IIII)V")
	public Class66_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt2634 = arg2;
		this.anInt2630 = arg4;
		this.anInt2629 = arg3;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glTexImage3Dub(super.anInt8223, 0, super.anInt8228, this.anInt2634, this.anInt2629, this.anInt2630, 0, Static679.method9322(super.anInt8228), 5121, (byte[]) null, 0);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!qfa;IIII[BI)V")
	public Class66_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt2629 = arg3;
		this.anInt2630 = arg4;
		this.anInt2634 = arg2;
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8223, 0, super.anInt8228, this.anInt2634, this.anInt2629, this.anInt2630, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6848(true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
	public void method2189(@OriginalArg(2) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		super.aClass137_Sub3_36.method7090(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8223, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public void method6844() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2632, this.anInt2633, super.anInt8223, 0, 0, 0);
		this.anInt2633 = -1;
		this.anInt2632 = -1;
	}
}
