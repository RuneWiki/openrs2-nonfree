import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class161_Sub3 extends Class161 {

	@OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
	private int anInt8160 = -1;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
	private int anInt8153 = -1;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
	public final int anInt8156;

	@OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
	public final int anInt8159;

	@OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
	public final int anInt8157;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!pi;IIII)V")
	public Class161_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8156 = arg3;
		this.anInt8159 = arg4;
		this.anInt8157 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glTexImage3Dub(super.anInt10743, 0, super.anInt10745, this.anInt8157, this.anInt8156, this.anInt8159, 0, Static30.method478(super.anInt10745), 5121, (byte[]) null, 0);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!pi;IIII[BI)V")
	public Class161_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8159 = arg4;
		this.anInt8156 = arg3;
		this.anInt8157 = arg2;
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10743, 0, super.anInt10745, this.anInt8157, this.anInt8156, this.anInt8159, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9173(true);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIIII)V")
	public void method7100(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass144_Sub3_42.method6982(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10743, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	@Override
	public void method9166() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8153, this.anInt8160, super.anInt10743, 0, 0, 0);
		this.anInt8153 = -1;
		this.anInt8160 = -1;
	}
}
