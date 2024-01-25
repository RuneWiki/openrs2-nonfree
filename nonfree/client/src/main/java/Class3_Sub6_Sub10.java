import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class3_Sub6_Sub10 extends Class3_Sub6 implements Interface4 {

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "I")
	private int anInt3392 = -1;

	@OriginalMember(owner = "client!fw", name = "A", descriptor = "I")
	private int anInt3395 = -1;

	@OriginalMember(owner = "client!fw", name = "F", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_15;

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "I")
	private final int anInt3391;

	@OriginalMember(owner = "client!fw", name = "E", descriptor = "I")
	public final int anInt3399;

	@OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
	public final int anInt3403;

	@OriginalMember(owner = "client!fw", name = "G", descriptor = "I")
	private int anInt3400;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "I")
	private final int anInt3393;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!hk;III)V")
	public Class3_Sub6_Sub10(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass16_Sub2_15 = arg0;
		this.anInt3391 = arg1;
		this.anInt3399 = arg2;
		this.anInt3403 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static470.anIntArray500, 0);
		this.anInt3400 = Static470.anIntArray500[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3400);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3391, this.anInt3399, this.anInt3403);
		this.anInt3393 = this.anInt3403 * this.anInt3399 * this.aClass16_Sub2_15.method3650(this.anInt3391);
	}

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!hk;IIII)V")
	public Class3_Sub6_Sub10(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3391 = arg1;
		this.aClass16_Sub2_15 = arg0;
		this.anInt3403 = arg3;
		this.anInt3399 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static470.anIntArray500, 0);
		this.anInt3400 = Static470.anIntArray500[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3400);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3391, this.anInt3399, this.anInt3403);
		this.anInt3393 = this.anInt3403 * this.anInt3399 * this.aClass16_Sub2_15.method3650(this.anInt3391);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	@Override
	public void method8457() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3395, this.anInt3392, 36161, 0);
		this.anInt3392 = -1;
		this.anInt3395 = -1;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(IBI)V")
	public void method2993(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3400);
		this.anInt3395 = arg0;
		this.anInt3392 = arg1;
	}

	@OriginalMember(owner = "client!fw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2994();
		super.finalize();
	}

	@OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)V")
	public void method2994() {
		if (this.anInt3400 > 0) {
			this.aClass16_Sub2_15.method3672(this.anInt3393, this.anInt3400);
			this.anInt3400 = 0;
		}
	}
}
