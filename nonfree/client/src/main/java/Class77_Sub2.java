import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!pfa", name = "D", descriptor = "I")
	private int anInt7645 = -1;

	@OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
	private int anInt7649 = -1;

	@OriginalMember(owner = "client!pfa", name = "z", descriptor = "I")
	public final int anInt7643;

	@OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
	public final int anInt7646;

	@OriginalMember(owner = "client!pfa", name = "B", descriptor = "I")
	public final int anInt7644;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!kga;IIII[BI)V")
	public Class77_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt7643 = arg4;
		this.anInt7646 = arg3;
		this.anInt7644 = arg2;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8662, 0, super.anInt8673, this.anInt7644, this.anInt7646, this.anInt7643, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!kga;IIII)V")
	public Class77_Sub2(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt7643 = arg4;
		this.anInt7644 = arg2;
		this.anInt7646 = arg3;
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glTexImage3Dub(super.anInt8662, 0, super.anInt8673, this.anInt7644, this.anInt7646, this.anInt7643, 0, Static296.method5095(super.anInt8673), 5121, null, 0);
		this.method7076(true);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIII)V")
	public void method6304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass44_Sub3_36.method4605(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8662, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	@Override
	public void method7064() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt7649, this.anInt7645, super.anInt8662, 0, 0, 0);
		this.anInt7649 = -1;
		this.anInt7645 = -1;
	}
}
