import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
	private int anInt4367 = -1;

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
	private int anInt4369 = -1;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	public final int anInt4370;

	@OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
	private final int anInt4366;

	@OriginalMember(owner = "client!gk", name = "z", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_14;

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
	public final int anInt4363;

	@OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
	private int anInt4371;

	@OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
	private final int anInt4364;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!eq;III)V")
	public Class3_Sub1_Sub5(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4370 = arg3;
		this.anInt4366 = arg1;
		this.aClass33_Sub3_14 = arg0;
		this.anInt4363 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static574.anIntArray590, 0);
		this.anInt4371 = Static574.anIntArray590[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4371);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt4366, this.anInt4363, this.anInt4370);
		this.anInt4364 = this.anInt4363 * this.anInt4370 * this.aClass33_Sub3_14.method3071(this.anInt4366);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!eq;IIII)V")
	public Class3_Sub1_Sub5(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4366 = arg1;
		this.aClass33_Sub3_14 = arg0;
		this.anInt4363 = arg2;
		this.anInt4370 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static574.anIntArray590, 0);
		this.anInt4371 = Static574.anIntArray590[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt4371);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt4366, this.anInt4363, this.anInt4370);
		this.anInt4364 = this.anInt4370 * this.anInt4363 * this.aClass33_Sub3_14.method3071(this.anInt4366);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	@Override
	public void method7320() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt4367, this.anInt4369, 36161, 0);
		this.anInt4369 = -1;
		this.anInt4367 = -1;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	public void method3726() {
		if (this.anInt4371 > 0) {
			this.aClass33_Sub3_14.method3019(this.anInt4371, this.anInt4364);
			this.anInt4371 = 0;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public void method3728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt4371);
		this.anInt4367 = arg1;
		this.anInt4369 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3726();
		super.finalize();
	}
}
