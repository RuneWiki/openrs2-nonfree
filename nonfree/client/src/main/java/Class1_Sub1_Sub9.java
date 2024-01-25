import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 implements Interface19 {

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	private int anInt3904 = -1;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
	private int anInt3906 = -1;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	private final int anInt3907;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_16;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	public final int anInt3908;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
	public final int anInt3914;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
	private int anInt3916;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
	private final int anInt3903;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!te;III)V")
	public Class1_Sub1_Sub9(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3907 = arg1;
		this.aClass9_Sub3_16 = arg0;
		this.anInt3908 = arg3;
		this.anInt3914 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static317.anIntArray425, 0);
		this.anInt3916 = Static317.anIntArray425[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3916);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3907, this.anInt3914, this.anInt3908);
		this.anInt3903 = this.anInt3914 * this.anInt3908 * this.aClass9_Sub3_16.method6710(this.anInt3907);
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!te;IIII)V")
	public Class1_Sub1_Sub9(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3914 = arg2;
		this.aClass9_Sub3_16 = arg0;
		this.anInt3908 = arg3;
		this.anInt3907 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static317.anIntArray425, 0);
		this.anInt3916 = Static317.anIntArray425[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3916);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3907, this.anInt3914, this.anInt3908);
		this.anInt3903 = this.anInt3908 * this.anInt3914 * this.aClass9_Sub3_16.method6710(this.anInt3907);
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	public void method3489() {
		if (this.anInt3916 > 0) {
			this.aClass9_Sub3_16.method6685(this.anInt3903, this.anInt3916);
			this.anInt3916 = 0;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	@Override
	public void method6233() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3904, this.anInt3906, 36161, 0);
		this.anInt3904 = -1;
		this.anInt3906 = -1;
	}

	@OriginalMember(owner = "client!hk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3489();
		super.finalize();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
	public void method3493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3916);
		this.anInt3904 = arg0;
		this.anInt3906 = arg1;
	}
}
