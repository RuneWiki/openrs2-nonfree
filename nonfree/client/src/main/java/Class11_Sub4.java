import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "I")
	private int anInt9057 = -1;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "I")
	private int anInt9063 = -1;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "I")
	public final int anInt9062;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "I")
	public final int anInt9064;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "I")
	public final int anInt9065;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!ji;IIII[BI)V")
	public Class11_Sub4(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt9062 = arg3;
		this.anInt9064 = arg4;
		this.anInt9065 = arg2;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9053, 0, super.anInt9048, this.anInt9065, this.anInt9062, this.anInt9064, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!ji;IIII)V")
	public Class11_Sub4(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt9065 = arg2;
		this.anInt9064 = arg4;
		this.anInt9062 = arg3;
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glTexImage3Dub(super.anInt9053, 0, super.anInt9048, this.anInt9065, this.anInt9062, this.anInt9064, 0, Static596.method8421(super.anInt9048), 5121, null, 0);
		this.method7412(true);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIBIIII)V")
	public void method7414(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass15_Sub3_35.method4377(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9053, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
	@Override
	public void method8310() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt9057, this.anInt9063, super.anInt9053, 0, 0, 0);
		this.anInt9057 = -1;
		this.anInt9063 = -1;
	}
}
