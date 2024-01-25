import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
	private int anInt7526 = -1;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
	private int anInt7530 = -1;

	@OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
	public final int anInt7533;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "I")
	public final int anInt7529;

	@OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
	public final int anInt7532;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ur;IIII[BI)V")
	public Class10_Sub4(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt7533 = arg2;
		this.anInt7529 = arg3;
		this.anInt7532 = arg4;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7522, 0, super.anInt7515, this.anInt7533, this.anInt7529, this.anInt7532, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!ur;IIII)V")
	public Class10_Sub4(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt7533 = arg2;
		this.anInt7532 = arg4;
		this.anInt7529 = arg3;
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glTexImage3Dub(super.anInt7522, 0, super.anInt7515, this.anInt7533, this.anInt7529, this.anInt7532, 0, Static423.method5066(super.anInt7515), 5121, null, 0);
		this.method5928(true);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIIBI)V")
	public void method5940(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		super.aClass34_Sub2_43.method5493(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7522, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	@Override
	public void method5925() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt7526, this.anInt7530, super.anInt7522, 0, 0, 0);
		this.anInt7530 = -1;
		this.anInt7526 = -1;
	}
}
