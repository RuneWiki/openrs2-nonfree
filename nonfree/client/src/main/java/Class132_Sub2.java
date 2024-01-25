import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class132_Sub2 extends Class132 {

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
	private int anInt5104 = -1;

	@OriginalMember(owner = "client!jm", name = "F", descriptor = "I")
	private int anInt5110 = -1;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "I")
	public final int anInt5108;

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "I")
	public final int anInt5106;

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "I")
	public final int anInt5109;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ap;IIII[BI)V")
	public Class132_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt5108 = arg2;
		this.anInt5106 = arg3;
		this.anInt5109 = arg4;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6650, 0, super.anInt6656, this.anInt5108, this.anInt5106, this.anInt5109, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ap;IIII)V")
	public Class132_Sub2(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt5106 = arg3;
		this.anInt5108 = arg2;
		this.anInt5109 = arg4;
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glTexImage3Dub(super.anInt6650, 0, super.anInt6656, this.anInt5108, this.anInt5106, this.anInt5109, 0, Static12.method634(super.anInt6656), 5121, null, 0);
		this.method5614(true);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V")
	@Override
	public void method6643() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5110, this.anInt5104, super.anInt6650, 0, 0, 0);
		this.anInt5104 = -1;
		this.anInt5110 = -1;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)V")
	public void method4416(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass9_Sub2_24.method814(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6650, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
