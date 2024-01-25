import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
	private int anInt2074 = -1;

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "I")
	private int anInt2081 = -1;

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "I")
	public final int anInt2077;

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "I")
	public final int anInt2076;

	@OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
	public final int anInt2080;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!ep;IIII[BI)V")
	public Class65_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt2077 = arg3;
		this.anInt2076 = arg4;
		this.anInt2080 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8058, 0, super.anInt8057, this.anInt2080, this.anInt2077, this.anInt2076, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!ep;IIII)V")
	public Class65_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2077 = arg3;
		this.anInt2076 = arg4;
		this.anInt2080 = arg2;
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glTexImage3Dub(super.anInt8058, 0, super.anInt8057, this.anInt2080, this.anInt2077, this.anInt2076, 0, Static194.method7690(super.anInt8057), 5121, null, 0);
		this.method6836(true);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	public void method6824() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2074, this.anInt2081, super.anInt8058, 0, 0, 0);
		this.anInt2081 = -1;
		this.anInt2074 = -1;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIBIII)V")
	public void method1699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		super.aClass95_Sub1_36.method2077(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8058, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
