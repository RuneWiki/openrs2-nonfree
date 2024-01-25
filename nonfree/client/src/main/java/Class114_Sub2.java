import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	private int anInt4568 = -1;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
	private int anInt4567 = -1;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	public final int anInt4571;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public final int anInt4574;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public final int anInt4572;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!no;IIII)V")
	public Class114_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt4571 = arg4;
		this.anInt4574 = arg2;
		this.anInt4572 = arg3;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glTexImage3Dub(super.anInt5902, 0, super.anInt5900, this.anInt4574, this.anInt4572, this.anInt4571, 0, Static516.method2307(super.anInt5900), 5121, null, 0);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!no;IIII[BI)V")
	public Class114_Sub2(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4571 = arg4;
		this.anInt4574 = arg2;
		this.anInt4572 = arg3;
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5902, 0, super.anInt5900, this.anInt4574, this.anInt4572, this.anInt4571, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4999(true);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
	public void method3844(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass66_Sub3_28.method5382(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5902, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public void method4996() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4567, this.anInt4568, super.anInt5902, 0, 0, 0);
		this.anInt4567 = -1;
		this.anInt4568 = -1;
	}
}
