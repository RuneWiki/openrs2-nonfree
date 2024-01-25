import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public final class Class121_Sub4 extends Class121 {

	@OriginalMember(owner = "client!saa", name = "x", descriptor = "I")
	private int anInt8889 = -1;

	@OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
	private int anInt8894 = -1;

	@OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
	public final int anInt8895;

	@OriginalMember(owner = "client!saa", name = "A", descriptor = "I")
	public final int anInt8892;

	@OriginalMember(owner = "client!saa", name = "B", descriptor = "I")
	public final int anInt8893;

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!eq;IIII[BI)V")
	public Class121_Sub4(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt8895 = arg3;
		this.anInt8892 = arg2;
		this.anInt8893 = arg4;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8871, 0, super.anInt8883, this.anInt8892, this.anInt8895, this.anInt8893, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!eq;IIII)V")
	public Class121_Sub4(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8892 = arg2;
		this.anInt8895 = arg3;
		this.anInt8893 = arg4;
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glTexImage3Dub(super.anInt8871, 0, super.anInt8883, this.anInt8892, this.anInt8895, this.anInt8893, 0, Static78.method1882(super.anInt8883), 5121, null, 0);
		this.method7326(true);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIIII)V")
	public void method7333(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass33_Sub3_36.method3012(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8871, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7320() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8894, this.anInt8889, super.anInt8871, 0, 0, 0);
		this.anInt8889 = -1;
		this.anInt8894 = -1;
	}
}
