import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!gba", name = "s", descriptor = "I")
	private int anInt3463 = -1;

	@OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
	private int anInt3473 = -1;

	@OriginalMember(owner = "client!gba", name = "B", descriptor = "I")
	public final int anInt3471;

	@OriginalMember(owner = "client!gba", name = "x", descriptor = "I")
	public final int anInt3467;

	@OriginalMember(owner = "client!gba", name = "D", descriptor = "I")
	public final int anInt3472;

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!qj;IIII)V")
	public Class23_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt3471 = arg4;
		this.anInt3467 = arg3;
		this.anInt3472 = arg2;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glTexImage3Dub(super.anInt9352, 0, super.anInt9354, this.anInt3472, this.anInt3467, this.anInt3471, 0, Static123.method1797(super.anInt9354), 5121, null, 0);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lclient!qj;IIII[BI)V")
	public Class23_Sub2(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt3471 = arg4;
		this.anInt3472 = arg2;
		this.anInt3467 = arg3;
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9352, 0, super.anInt9354, this.anInt3472, this.anInt3467, this.anInt3471, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7783(true);
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
	@Override
	public void method7774() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3463, this.anInt3473, super.anInt9352, 0, 0, 0);
		this.anInt3463 = -1;
		this.anInt3473 = -1;
	}

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIIIIII)V")
	public void method2873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		super.aClass100_Sub3_42.method6277(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9352, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
