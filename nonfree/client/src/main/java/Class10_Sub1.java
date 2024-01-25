import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	private int anInt338 = -1;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	private int anInt345 = -1;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	public final int anInt344;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	public final int anInt343;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	public final int anInt340;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!lf;IIII)V")
	public Class10_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt344 = arg4;
		this.anInt343 = arg3;
		this.anInt340 = arg2;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glTexImage3Dub(super.anInt7252, 0, super.anInt7248, this.anInt340, this.anInt343, this.anInt344, 0, Static618.method8347(super.anInt7248), 5121, (byte[]) null, 0);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!lf;IIII[BI)V")
	public Class10_Sub1(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt340 = arg2;
		this.anInt343 = arg3;
		this.anInt344 = arg4;
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7252, 0, super.anInt7248, this.anInt340, this.anInt343, this.anInt344, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6097(true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIIB)V")
	public void method377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		super.aClass95_Sub3_30.method4864(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7252, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	@Override
	public void method6091() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt338, this.anInt345, super.anInt7252, 0, 0, 0);
		this.anInt345 = -1;
		this.anInt338 = -1;
	}
}
