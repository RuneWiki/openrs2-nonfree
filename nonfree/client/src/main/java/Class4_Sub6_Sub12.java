import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class4_Sub6_Sub12 extends Class4_Sub6 implements Interface22 {

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
	private int anInt5383 = -1;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	private int anInt5392 = -1;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_25;

	@OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
	public final int anInt5391;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
	public final int anInt5379;

	@OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
	private final int anInt5388;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	private int anInt5389;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
	public final int anInt5380;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!kfa;III)V")
	public Class4_Sub6_Sub12(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass7_Sub2_25 = arg0;
		this.anInt5391 = arg3;
		this.anInt5379 = arg2;
		this.anInt5388 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static407.anIntArray422, 0);
		this.anInt5389 = Static407.anIntArray422[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5389);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt5388, this.anInt5379, this.anInt5391);
		this.anInt5380 = this.anInt5379 * this.anInt5391 * this.aClass7_Sub2_25.method4341(this.anInt5388);
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!kfa;IIII)V")
	public Class4_Sub6_Sub12(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5391 = arg3;
		this.aClass7_Sub2_25 = arg0;
		this.anInt5388 = arg1;
		this.anInt5379 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static407.anIntArray422, 0);
		this.anInt5389 = Static407.anIntArray422[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5389);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt5388, this.anInt5379, this.anInt5391);
		this.anInt5380 = this.anInt5379 * this.anInt5391 * this.aClass7_Sub2_25.method4341(this.anInt5388);
	}

	@OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4192();
		super.finalize();
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
	public void method4192() {
		if (this.anInt5389 > 0) {
			this.aClass7_Sub2_25.method4335(this.anInt5380, this.anInt5389);
			this.anInt5389 = 0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public void method4191() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt5383, this.anInt5392, 36161, 0);
		this.anInt5392 = -1;
		this.anInt5383 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(III)V")
	public void method4194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt5389);
		this.anInt5383 = arg1;
		this.anInt5392 = arg0;
	}
}
