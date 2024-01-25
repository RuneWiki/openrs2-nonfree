import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class14_Sub2_Sub13 extends Class14_Sub2 implements Interface15 {

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
	private int anInt5342 = -1;

	@OriginalMember(owner = "client!jv", name = "B", descriptor = "I")
	private int anInt5350 = -1;

	@OriginalMember(owner = "client!jv", name = "H", descriptor = "I")
	private final int anInt5352;

	@OriginalMember(owner = "client!jv", name = "D", descriptor = "I")
	public final int anInt5343;

	@OriginalMember(owner = "client!jv", name = "E", descriptor = "I")
	public final int anInt5347;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_17;

	@OriginalMember(owner = "client!jv", name = "z", descriptor = "I")
	private int anInt5351;

	@OriginalMember(owner = "client!jv", name = "F", descriptor = "I")
	private final int anInt5348;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!pi;III)V")
	public Class14_Sub2_Sub13(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5352 = arg1;
		this.anInt5343 = arg2;
		this.anInt5347 = arg3;
		this.aClass144_Sub3_17 = arg0;
		OpenGL.glGenRenderbuffersEXT(1, Static655.anIntArray574, 0);
		this.anInt5351 = Static655.anIntArray574[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5351);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5352, this.anInt5343, this.anInt5347);
		this.anInt5348 = this.anInt5343 * this.anInt5347 * this.aClass144_Sub3_17.method7034(this.anInt5352);
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!pi;IIII)V")
	public Class14_Sub2_Sub13(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5352 = arg1;
		this.aClass144_Sub3_17 = arg0;
		this.anInt5343 = arg2;
		this.anInt5347 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static655.anIntArray574, 0);
		this.anInt5351 = Static655.anIntArray574[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5351);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5352, this.anInt5343, this.anInt5347);
		this.anInt5348 = this.anInt5343 * this.anInt5347 * this.aClass144_Sub3_17.method7034(this.anInt5352);
	}

	@OriginalMember(owner = "client!jv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4872();
		super.finalize();
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)V")
	public void method4872() {
		if (this.anInt5351 > 0) {
			this.aClass144_Sub3_17.method7022(this.anInt5348, this.anInt5351);
			this.anInt5351 = 0;
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V")
	public void method4873(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt5351);
		this.anInt5350 = arg0;
		this.anInt5342 = arg1;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
	@Override
	public void method9166() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5350, this.anInt5342, 36161, 0);
		this.anInt5342 = -1;
		this.anInt5350 = -1;
	}
}
