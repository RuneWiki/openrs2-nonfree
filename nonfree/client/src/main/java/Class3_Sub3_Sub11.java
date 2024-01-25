import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class3_Sub3_Sub11 extends Class3_Sub3 implements Interface9 {

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
	private int anInt3372 = -1;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
	private int anInt3374 = -1;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	public final int anInt3370;

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
	private final int anInt3375;

	@OriginalMember(owner = "client!hp", name = "I", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_19;

	@OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
	public final int anInt3379;

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
	private int anInt3368;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
	private final int anInt3373;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!gk;III)V")
	public Class3_Sub3_Sub11(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3370 = arg2;
		this.anInt3375 = arg1;
		this.aClass75_Sub2_19 = arg0;
		this.anInt3379 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static110.anIntArray203, 0);
		this.anInt3368 = Static110.anIntArray203[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3368);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3375, this.anInt3370, this.anInt3379);
		this.anInt3373 = this.anInt3370 * this.anInt3379 * this.aClass75_Sub2_19.method2469(this.anInt3375);
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!gk;IIII)V")
	public Class3_Sub3_Sub11(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass75_Sub2_19 = arg0;
		this.anInt3379 = arg3;
		this.anInt3375 = arg1;
		this.anInt3370 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static110.anIntArray203, 0);
		this.anInt3368 = Static110.anIntArray203[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3368);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3375, this.anInt3370, this.anInt3379);
		this.anInt3373 = this.anInt3379 * this.anInt3370 * this.aClass75_Sub2_19.method2469(this.anInt3375);
	}

	@OriginalMember(owner = "client!hp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2757();
		super.finalize();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	@Override
	public void method4908() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3374, this.anInt3372, 36161, 0);
		this.anInt3374 = -1;
		this.anInt3372 = -1;
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "(I)V")
	public void method2757() {
		if (this.anInt3368 > 0) {
			this.aClass75_Sub2_19.method2450(this.anInt3373, this.anInt3368);
			this.anInt3368 = 0;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIZ)V")
	public void method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3368);
		this.anInt3374 = arg0;
		this.anInt3372 = arg1;
	}
}
