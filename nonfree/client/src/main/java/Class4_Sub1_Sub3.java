import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 implements Interface1 {

	@OriginalMember(owner = "client!at", name = "E", descriptor = "I")
	private int anInt339 = -1;

	@OriginalMember(owner = "client!at", name = "M", descriptor = "I")
	private int anInt346 = -1;

	@OriginalMember(owner = "client!at", name = "D", descriptor = "I")
	public final int anInt338;

	@OriginalMember(owner = "client!at", name = "A", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_1;

	@OriginalMember(owner = "client!at", name = "B", descriptor = "I")
	private final int anInt336;

	@OriginalMember(owner = "client!at", name = "J", descriptor = "I")
	public final int anInt344;

	@OriginalMember(owner = "client!at", name = "G", descriptor = "I")
	private int anInt341;

	@OriginalMember(owner = "client!at", name = "C", descriptor = "I")
	private final int anInt337;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!bt;III)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt338 = arg2;
		this.aClass30_Sub1_1 = arg0;
		this.anInt336 = arg1;
		this.anInt344 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static9.anIntArray13, 0);
		this.anInt341 = Static9.anIntArray13[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt341);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt336, this.anInt338, this.anInt344);
		this.anInt337 = this.anInt338 * this.anInt344 * this.aClass30_Sub1_1.method700(this.anInt336);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!bt;IIII)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass30_Sub1_1 = arg0;
		this.anInt338 = arg2;
		this.anInt336 = arg1;
		this.anInt344 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static9.anIntArray13, 0);
		this.anInt341 = Static9.anIntArray13[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt341);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt336, this.anInt338, this.anInt344);
		this.anInt337 = this.anInt338 * this.anInt344 * this.aClass30_Sub1_1.method700(this.anInt336);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBI)V")
	public void method290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.anInt341);
		this.anInt346 = arg0;
		this.anInt339 = arg1;
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(I)V")
	public void method293() {
		if (this.anInt341 > 0) {
			this.aClass30_Sub1_1.method759(this.anInt341, this.anInt337);
			this.anInt341 = 0;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)V")
	@Override
	public void method5348() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt346, this.anInt339, 36161, 0);
		this.anInt339 = -1;
		this.anInt346 = -1;
	}

	@OriginalMember(owner = "client!at", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method293();
		super.finalize();
	}
}
