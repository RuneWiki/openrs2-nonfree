import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 implements Interface10 {

	@OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
	private int anInt4168 = -1;

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	private int anInt4165 = -1;

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_24;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	public final int anInt4167;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public final int anInt4169;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	private final int anInt4159;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt4166;

	@OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
	private final int anInt4161;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!ih;III)V")
	public Class1_Sub3_Sub12(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass117_Sub1_24 = arg0;
		this.anInt4167 = arg3;
		this.anInt4169 = arg2;
		this.anInt4159 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static400.anIntArray465, 0);
		this.anInt4166 = Static400.anIntArray465[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4166);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4159, this.anInt4169, this.anInt4167);
		this.anInt4161 = this.anInt4167 * this.anInt4169 * this.aClass117_Sub1_24.method2458(this.anInt4159);
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lclient!ih;IIII)V")
	public Class1_Sub3_Sub12(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass117_Sub1_24 = arg0;
		this.anInt4159 = arg1;
		this.anInt4169 = arg2;
		this.anInt4167 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static400.anIntArray465, 0);
		this.anInt4166 = Static400.anIntArray465[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4166);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4159, this.anInt4169, this.anInt4167);
		this.anInt4161 = this.anInt4169 * this.anInt4167 * this.aClass117_Sub1_24.method2458(this.anInt4159);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public void method3291() {
		if (this.anInt4166 > 0) {
			this.aClass117_Sub1_24.method2508(this.anInt4161, this.anInt4166);
			this.anInt4166 = 0;
		}
	}

	@OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3291();
		super.finalize();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	@Override
	public void method5797() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4168, this.anInt4165, 36161, 0);
		this.anInt4168 = -1;
		this.anInt4165 = -1;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V")
	public void method3295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt4166);
		this.anInt4168 = arg0;
		this.anInt4165 = arg1;
	}
}
