import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public final class Class76_Sub4 extends Class76 {

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private int anInt9216 = -1;

	@OriginalMember(owner = "client!te", name = "C", descriptor = "I")
	private int anInt9218 = -1;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "I")
	public final int anInt9219;

	@OriginalMember(owner = "client!te", name = "u", descriptor = "I")
	public final int anInt9212;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "I")
	public final int anInt9211;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!kw;IIII)V")
	public Class76_Sub4(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt9219 = arg4;
		this.anInt9212 = arg2;
		this.anInt9211 = arg3;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glTexImage3Dub(super.anInt9197, 0, super.anInt9207, this.anInt9212, this.anInt9211, this.anInt9219, 0, Static140.method2607(super.anInt9207), 5121, null, 0);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!kw;IIII[BI)V")
	public Class76_Sub4(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt9212 = arg2;
		this.anInt9219 = arg4;
		this.anInt9211 = arg3;
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9197, 0, super.anInt9207, this.anInt9212, this.anInt9211, this.anInt9219, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7930(true);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
	public void method7933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass5_Sub2_36.method4997(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9197, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	@Override
	public void method7922() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt9218, this.anInt9216, super.anInt9197, 0, 0, 0);
		this.anInt9218 = -1;
		this.anInt9216 = -1;
	}
}
