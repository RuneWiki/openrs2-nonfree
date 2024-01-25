import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!mea", name = "B", descriptor = "I")
	private int anInt5779 = -1;

	@OriginalMember(owner = "client!mea", name = "I", descriptor = "I")
	private int anInt5784 = -1;

	@OriginalMember(owner = "client!mea", name = "H", descriptor = "I")
	public final int anInt5783;

	@OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
	private final int anInt5775;

	@OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
	public final int anInt5774;

	@OriginalMember(owner = "client!mea", name = "w", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_23;

	@OriginalMember(owner = "client!mea", name = "G", descriptor = "I")
	private int anInt5782;

	@OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
	public final int anInt5778;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!ag;III)V")
	public Class1_Sub3_Sub12(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5783 = arg3;
		this.anInt5775 = arg1;
		this.anInt5774 = arg2;
		this.aClass12_Sub1_23 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static206.anIntArray235, 0);
		this.anInt5782 = Static206.anIntArray235[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5782);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5775, this.anInt5774, this.anInt5783);
		this.anInt5778 = this.anInt5774 * this.anInt5783 * this.aClass12_Sub1_23.method377(this.anInt5775);
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class1_Sub3_Sub12(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5774 = arg2;
		this.anInt5783 = arg3;
		this.aClass12_Sub1_23 = arg0;
		this.anInt5775 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static206.anIntArray235, 0);
		this.anInt5782 = Static206.anIntArray235[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5782);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5775, this.anInt5774, this.anInt5783);
		this.anInt5778 = this.anInt5783 * this.anInt5774 * this.aClass12_Sub1_23.method377(this.anInt5775);
	}

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)V")
	public void method4881() {
		if (this.anInt5782 > 0) {
			this.aClass12_Sub1_23.method373(this.anInt5782, this.anInt5778);
			this.anInt5782 = 0;
		}
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V")
	@Override
	public void method5633() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5784, this.anInt5779, 36161, 0);
		this.anInt5784 = -1;
		this.anInt5779 = -1;
	}

	@OriginalMember(owner = "client!mea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4881();
		super.finalize();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)V")
	public void method4882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5782);
		this.anInt5784 = arg0;
		this.anInt5779 = arg1;
	}
}
