import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class4_Sub3 extends Class4 {

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
	private int anInt3691 = -1;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
	private int anInt3685 = -1;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	public final int anInt3688;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
	public final int anInt3689;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
	public final int anInt3690;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!da;IIII)V")
	public Class4_Sub3(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3688 = arg3;
		this.anInt3689 = arg4;
		this.anInt3690 = arg2;
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glTexImage3Dub(super.anInt5771, 0, super.anInt5763, this.anInt3690, this.anInt3688, this.anInt3689, 0, Static245.method3581(super.anInt5763), 5121, null, 0);
		this.method4580(true);
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!da;IIII[BI)V")
	public Class4_Sub3(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt3690 = arg2;
		this.anInt3688 = arg3;
		this.anInt3689 = arg4;
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5771, 0, super.anInt5763, this.anInt3690, this.anInt3688, this.anInt3689, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4580(true);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIIII)V")
	public void method2971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		super.aClass50_Sub1_32.method1295(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5771, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3685, this.anInt3691, super.anInt5771, 0, 0, 0);
		this.anInt3691 = -1;
		this.anInt3685 = -1;
	}
}
