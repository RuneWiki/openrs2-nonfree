import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
	private int anInt4493 = -1;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
	private int anInt4494 = -1;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
	public final int anInt4489;

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "I")
	public final int anInt4491;

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
	public final int anInt4490;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!us;IIII[BI)V")
	public Class34_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4489 = arg4;
		this.anInt4491 = arg2;
		this.anInt4490 = arg3;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5770, 0, super.anInt5764, this.anInt4491, this.anInt4490, this.anInt4489, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!us;IIII)V")
	public Class34_Sub3(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt4489 = arg4;
		this.anInt4491 = arg2;
		this.anInt4490 = arg3;
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glTexImage3Dub(super.anInt5770, 0, super.anInt5764, this.anInt4491, this.anInt4490, this.anInt4489, 0, Static562.method7491(super.anInt5764), 5121, null, 0);
		this.method4974(true);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	@Override
	public void method4969() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4494, this.anInt4493, super.anInt5770, 0, 0, 0);
		this.anInt4493 = -1;
		this.anInt4494 = -1;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIII)V")
	public void method3996(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass43_Sub3_23.method7220(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5770, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}
}
