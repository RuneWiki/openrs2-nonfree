import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class19_Sub4 extends Class19 {

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "I")
	private int anInt5634 = -1;

	@OriginalMember(owner = "client!mu", name = "x", descriptor = "I")
	private int anInt5635 = -1;

	@OriginalMember(owner = "client!mu", name = "z", descriptor = "I")
	public final int anInt5637;

	@OriginalMember(owner = "client!mu", name = "D", descriptor = "I")
	public final int anInt5640;

	@OriginalMember(owner = "client!mu", name = "B", descriptor = "I")
	public final int anInt5638;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!os;IIII[BI)V")
	public Class19_Sub4(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt5637 = arg4;
		this.anInt5640 = arg2;
		this.anInt5638 = arg3;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5629, 0, super.anInt5628, this.anInt5640, this.anInt5638, this.anInt5637, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!os;IIII)V")
	public Class19_Sub4(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt5637 = arg4;
		this.anInt5638 = arg3;
		this.anInt5640 = arg2;
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glTexImage3Dub(super.anInt5629, 0, super.anInt5628, this.anInt5640, this.anInt5638, this.anInt5637, 0, Static428.method6599(super.anInt5628), 5121, null, 0);
		this.method4799(true);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIIIII)V")
	public void method4810(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass39_Sub3_26.method5719(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5629, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	@Override
	public void method4798() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5635, this.anInt5634, super.anInt5629, 0, 0, 0);
		this.anInt5635 = -1;
		this.anInt5634 = -1;
	}
}
