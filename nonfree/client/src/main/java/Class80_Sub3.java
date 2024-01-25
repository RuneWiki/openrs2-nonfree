import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class80_Sub3 extends Class80 {

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
	private int anInt6038 = -1;

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "I")
	private int anInt6037 = -1;

	@OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
	public final int anInt6041;

	@OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
	public final int anInt6042;

	@OriginalMember(owner = "client!kq", name = "v", descriptor = "I")
	public final int anInt6036;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ck;IIII[BI)V")
	public Class80_Sub3(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt6041 = arg4;
		this.anInt6042 = arg2;
		this.anInt6036 = arg3;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8338, 0, super.anInt8332, this.anInt6042, this.anInt6036, this.anInt6041, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ck;IIII)V")
	public Class80_Sub3(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6036 = arg3;
		this.anInt6041 = arg4;
		this.anInt6042 = arg2;
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glTexImage3Dub(super.anInt8338, 0, super.anInt8332, this.anInt6042, this.anInt6036, this.anInt6041, 0, Static149.method2714(super.anInt8332), 5121, (byte[]) null, 0);
		this.method7142(true);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIZII)V")
	public void method5017(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		super.aClass65_Sub1_32.method1286(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8338, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
	@Override
	public void method7433() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6038, this.anInt6037, super.anInt8338, 0, 0, 0);
		this.anInt6037 = -1;
		this.anInt6038 = -1;
	}
}
