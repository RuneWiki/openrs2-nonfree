import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	private int anInt2260 = -1;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	private int anInt2263 = -1;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	public final int anInt2261;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public final int anInt2257;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
	public final int anInt2262;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!bo;IIII[BI)V")
	public Class65_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2261 = arg3;
		this.anInt2257 = arg2;
		this.anInt2262 = arg4;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5266, 0, super.anInt5260, this.anInt2257, this.anInt2261, this.anInt2262, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!bo;IIII)V")
	public Class65_Sub2(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt2262 = arg4;
		this.anInt2257 = arg2;
		this.anInt2261 = arg3;
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glTexImage3Dub(super.anInt5266, 0, super.anInt5260, this.anInt2257, this.anInt2261, this.anInt2262, 0, Static449.method1966(super.anInt5260), 5121, null, 0);
		this.method4263(true);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	@Override
	public void method4255() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2260, this.anInt2263, super.anInt5266, 0, 0, 0);
		this.anInt2260 = -1;
		this.anInt2263 = -1;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIII)V")
	public void method1684(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		super.aClass26_Sub1_26.method673(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5266, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}
}
