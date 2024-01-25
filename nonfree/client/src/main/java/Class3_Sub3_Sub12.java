import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class3_Sub3_Sub12 extends Class3_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	private int anInt3313 = -1;

	@OriginalMember(owner = "client!in", name = "E", descriptor = "I")
	private int anInt3318 = -1;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	public final int anInt3319;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "I")
	private final int anInt3317;

	@OriginalMember(owner = "client!in", name = "w", descriptor = "I")
	public final int anInt3312;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_16;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "I")
	private int anInt3316;

	@OriginalMember(owner = "client!in", name = "u", descriptor = "I")
	private final int anInt3310;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!nq;III)V")
	public Class3_Sub3_Sub12(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3319 = arg3;
		this.anInt3317 = arg1;
		this.anInt3312 = arg2;
		this.aClass167_Sub1_16 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static257.anIntArray283, 0);
		this.anInt3316 = Static257.anIntArray283[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3316);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3317, this.anInt3312, this.anInt3319);
		this.anInt3310 = this.anInt3312 * this.anInt3319 * this.aClass167_Sub1_16.method4030(this.anInt3317);
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!nq;IIII)V")
	public Class3_Sub3_Sub12(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3319 = arg3;
		this.anInt3312 = arg2;
		this.anInt3317 = arg1;
		this.aClass167_Sub1_16 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static257.anIntArray283, 0);
		this.anInt3316 = Static257.anIntArray283[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3316);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3317, this.anInt3312, this.anInt3319);
		this.anInt3310 = this.anInt3319 * this.anInt3312 * this.aClass167_Sub1_16.method4030(this.anInt3317);
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(Z)V")
	public void method2848() {
		if (this.anInt3316 > 0) {
			this.aClass167_Sub1_16.method4043(this.anInt3316, this.anInt3310);
			this.anInt3316 = 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2848();
		super.finalize();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V")
	public void method2849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt3316);
		this.anInt3313 = arg0;
		this.anInt3318 = arg1;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
	@Override
	public void method5778() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3313, this.anInt3318, 36161, 0);
		this.anInt3313 = -1;
		this.anInt3318 = -1;
	}
}
