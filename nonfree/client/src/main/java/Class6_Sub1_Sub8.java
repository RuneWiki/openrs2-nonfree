import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class6_Sub1_Sub8 extends Class6_Sub1 implements Interface4 {

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
	private int anInt2726 = -1;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
	private int anInt2728 = -1;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_16;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	private final int anInt2730;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
	public final int anInt2725;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
	private int anInt2736;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	private final int anInt2723;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!pea;III)V")
	public Class6_Sub1_Sub8(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2737 = arg2;
		this.aClass121_Sub3_16 = arg0;
		this.anInt2730 = arg1;
		this.anInt2725 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static99.anIntArray251, 0);
		this.anInt2736 = Static99.anIntArray251[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2736);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2730, this.anInt2737, this.anInt2725);
		this.anInt2723 = this.anInt2737 * this.anInt2725 * this.aClass121_Sub3_16.method5715(this.anInt2730);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!pea;IIII)V")
	public Class6_Sub1_Sub8(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2730 = arg1;
		this.anInt2737 = arg2;
		this.anInt2725 = arg3;
		this.aClass121_Sub3_16 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static99.anIntArray251, 0);
		this.anInt2736 = Static99.anIntArray251[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2736);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2730, this.anInt2737, this.anInt2725);
		this.anInt2723 = this.anInt2737 * this.anInt2725 * this.aClass121_Sub3_16.method5715(this.anInt2730);
	}

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2273();
		super.finalize();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
	public void method2270(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt2736);
		this.anInt2728 = arg0;
		this.anInt2726 = arg1;
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public void method2273() {
		if (this.anInt2736 > 0) {
			this.aClass121_Sub3_16.method5651(this.anInt2723, this.anInt2736);
			this.anInt2736 = 0;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method5323() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2728, this.anInt2726, 36161, 0);
		this.anInt2728 = -1;
		this.anInt2726 = -1;
	}
}
