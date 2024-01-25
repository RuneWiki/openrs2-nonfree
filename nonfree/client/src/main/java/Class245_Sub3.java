import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oka")
public final class Class245_Sub3 extends Class245 {

	@OriginalMember(owner = "client!oka", name = "E", descriptor = "I")
	private int anInt8100 = -1;

	@OriginalMember(owner = "client!oka", name = "H", descriptor = "I")
	private int anInt8101 = -1;

	@OriginalMember(owner = "client!oka", name = "B", descriptor = "I")
	public final int anInt8102;

	@OriginalMember(owner = "client!oka", name = "y", descriptor = "I")
	public final int anInt8098;

	@OriginalMember(owner = "client!oka", name = "w", descriptor = "I")
	public final int anInt8104;

	@OriginalMember(owner = "client!oka", name = "<init>", descriptor = "(Lclient!gia;IIII)V")
	public Class245_Sub3(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt8102 = arg2;
		this.anInt8098 = arg3;
		this.anInt8104 = arg4;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glTexImage3Dub(super.anInt10362, 0, super.anInt10366, this.anInt8102, this.anInt8098, this.anInt8104, 0, Static668.method2973(super.anInt10366), 5121, (byte[]) null, 0);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!oka", name = "<init>", descriptor = "(Lclient!gia;IIII[BI)V")
	public Class245_Sub3(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8104 = arg4;
		this.anInt8102 = arg2;
		this.anInt8098 = arg3;
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10362, 0, super.anInt10366, this.anInt8102, this.anInt8098, this.anInt8104, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8672(true);
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IIIIIIII)V")
	public void method6825(@OriginalArg(2) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass67_Sub2_40.method3234(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10362, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(B)V")
	@Override
	public void method8671() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8101, this.anInt8100, super.anInt10362, 0, 0, 0);
		this.anInt8100 = -1;
		this.anInt8101 = -1;
	}
}
