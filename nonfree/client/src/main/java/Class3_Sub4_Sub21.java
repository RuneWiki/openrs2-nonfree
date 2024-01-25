import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class3_Sub4_Sub21 extends Class3_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!so", name = "C", descriptor = "I")
	private int anInt9019 = -1;

	@OriginalMember(owner = "client!so", name = "v", descriptor = "I")
	private int anInt9014 = -1;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "I")
	public final int anInt9025;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "I")
	public final int anInt9026;

	@OriginalMember(owner = "client!so", name = "w", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_34;

	@OriginalMember(owner = "client!so", name = "D", descriptor = "I")
	private final int anInt9020;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int anInt9024;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "I")
	private final int anInt9012;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!kw;III)V")
	public Class3_Sub4_Sub21(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9025 = arg3;
		this.anInt9026 = arg2;
		this.aClass5_Sub2_34 = arg0;
		this.anInt9020 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static231.anIntArray228, 0);
		this.anInt9024 = Static231.anIntArray228[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9024);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt9020, this.anInt9026, this.anInt9025);
		this.anInt9012 = this.anInt9026 * this.anInt9025 * this.aClass5_Sub2_34.method5032(this.anInt9020);
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!kw;IIII)V")
	public Class3_Sub4_Sub21(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt9026 = arg2;
		this.anInt9025 = arg3;
		this.anInt9020 = arg1;
		this.aClass5_Sub2_34 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static231.anIntArray228, 0);
		this.anInt9024 = Static231.anIntArray228[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9024);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt9020, this.anInt9026, this.anInt9025);
		this.anInt9012 = this.anInt9025 * this.anInt9026 * this.aClass5_Sub2_34.method5032(this.anInt9020);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
	@Override
	public void method7922() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt9019, this.anInt9014, 36161, 0);
		this.anInt9014 = -1;
		this.anInt9019 = -1;
	}

	@OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method7754();
		super.finalize();
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(B)V")
	public void method7754() {
		if (this.anInt9024 > 0) {
			this.aClass5_Sub2_34.method4978(this.anInt9024, this.anInt9012);
			this.anInt9024 = 0;
		}
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(III)V")
	public void method7755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt9024);
		this.anInt9014 = arg1;
		this.anInt9019 = arg0;
	}
}
