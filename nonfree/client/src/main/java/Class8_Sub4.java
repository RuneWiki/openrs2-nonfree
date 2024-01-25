import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public final class Class8_Sub4 extends Class8 {

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
	private int anInt3965 = -1;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
	private int anInt3966 = -1;

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
	public final int anInt3968;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
	public final int anInt3964;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
	public final int anInt3963;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ih;IIII[BI)V")
	public Class8_Sub4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt3968 = arg3;
		this.anInt3964 = arg4;
		this.anInt3963 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3947, 0, super.anInt3950, this.anInt3963, this.anInt3968, this.anInt3964, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class8_Sub4(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3964 = arg4;
		this.anInt3968 = arg3;
		this.anInt3963 = arg2;
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glTexImage3Dub(super.anInt3947, 0, super.anInt3950, this.anInt3963, this.anInt3968, this.anInt3964, 0, Static76.method1408(super.anInt3950), 5121, null, 0);
		this.method3073(true);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3966, this.anInt3965, super.anInt3947, 0, 0, 0);
		this.anInt3966 = -1;
		this.anInt3965 = -1;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIZ)V")
	public void method3078(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass106_Sub2_25.method2912(this);
		OpenGL.glCopyTexSubImage3D(super.anInt3947, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
