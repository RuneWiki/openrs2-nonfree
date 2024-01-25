import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class8_Sub5_Sub5 extends Class8_Sub5 implements Interface15 {

	@OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
	private int anInt2808 = -1;

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
	private int anInt2816 = -1;

	@OriginalMember(owner = "client!ds", name = "E", descriptor = "I")
	private final int anInt2813;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
	public final int anInt2810;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_14;

	@OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
	public final int anInt2815;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
	private int anInt2809;

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
	private final int anInt2807;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!nv;III)V")
	public Class8_Sub5_Sub5(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2813 = arg1;
		this.anInt2810 = arg3;
		this.aClass16_Sub3_14 = arg0;
		this.anInt2815 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static141.anIntArray178, 0);
		this.anInt2809 = Static141.anIntArray178[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2809);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt2813, this.anInt2815, this.anInt2810);
		this.anInt2807 = this.anInt2815 * this.anInt2810 * this.aClass16_Sub3_14.method5947(this.anInt2813);
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!nv;IIII)V")
	public Class8_Sub5_Sub5(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt2813 = arg1;
		this.anInt2815 = arg2;
		this.aClass16_Sub3_14 = arg0;
		this.anInt2810 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static141.anIntArray178, 0);
		this.anInt2809 = Static141.anIntArray178[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt2809);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt2813, this.anInt2815, this.anInt2810);
		this.anInt2807 = this.anInt2815 * this.anInt2810 * this.aClass16_Sub3_14.method5947(this.anInt2813);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
	public void method2409() {
		if (this.anInt2809 > 0) {
			this.aClass16_Sub3_14.method5984(this.anInt2809, this.anInt2807);
			this.anInt2809 = 0;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	public void method7611() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt2808, this.anInt2816, 36161, 0);
		this.anInt2808 = -1;
		this.anInt2816 = -1;
	}

	@OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2409();
		super.finalize();
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(III)V")
	public void method2412(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt2809);
		this.anInt2816 = arg0;
		this.anInt2808 = arg1;
	}
}
