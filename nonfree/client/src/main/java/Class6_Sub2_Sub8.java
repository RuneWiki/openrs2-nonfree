import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 implements Interface14 {

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private int anInt3719 = -1;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
	private int anInt3727 = -1;

	@OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
	private final int anInt3730;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
	public final int anInt3732;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_17;

	@OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
	public final int anInt3726;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
	private int anInt3731;

	@OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
	public final int anInt3722;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!jaa;III)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3730 = arg1;
		this.anInt3732 = arg3;
		this.aClass14_Sub3_17 = arg0;
		this.anInt3726 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static143.anIntArray191, 0);
		this.anInt3731 = Static143.anIntArray191[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3731);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3730, this.anInt3726, this.anInt3732);
		this.anInt3722 = this.anInt3726 * this.anInt3732 * this.aClass14_Sub3_17.method3953(this.anInt3730);
	}

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!jaa;IIII)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3732 = arg3;
		this.aClass14_Sub3_17 = arg0;
		this.anInt3730 = arg1;
		this.anInt3726 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static143.anIntArray191, 0);
		this.anInt3731 = Static143.anIntArray191[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3731);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3730, this.anInt3726, this.anInt3732);
		this.anInt3722 = this.anInt3726 * this.anInt3732 * this.aClass14_Sub3_17.method3953(this.anInt3730);
	}

	@OriginalMember(owner = "client!hc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3252();
		super.finalize();
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	public void method3252() {
		if (this.anInt3731 > 0) {
			this.aClass14_Sub3_17.method3930(this.anInt3731, this.anInt3722);
			this.anInt3731 = 0;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	@Override
	public void method7726() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3727, this.anInt3719, 36161, 0);
		this.anInt3719 = -1;
		this.anInt3727 = -1;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	public void method3254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt3731);
		this.anInt3719 = arg0;
		this.anInt3727 = arg1;
	}
}
