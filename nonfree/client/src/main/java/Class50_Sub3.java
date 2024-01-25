import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	private int anInt6382 = -1;

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	private int anInt6385 = -1;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	public final int anInt6387;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public final int anInt6381;

	@OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
	public final int anInt6380;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!er;IIII[BI)V")
	public Class50_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt6387 = arg3;
		this.anInt6381 = arg4;
		this.anInt6380 = arg2;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7830, 0, super.anInt7828, this.anInt6380, this.anInt6387, this.anInt6381, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class50_Sub3(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt6381 = arg4;
		this.anInt6380 = arg2;
		this.anInt6387 = arg3;
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glTexImage3Dub(super.anInt7830, 0, super.anInt7828, this.anInt6380, this.anInt6387, this.anInt6381, 0, Static393.method5568(super.anInt7828), 5121, null, 0);
		this.method6153(true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIZII)V")
	public void method5151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass31_Sub2_37.method2535(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7830, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method6150() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6382, this.anInt6385, super.anInt7830, 0, 0, 0);
		this.anInt6382 = -1;
		this.anInt6385 = -1;
	}
}
