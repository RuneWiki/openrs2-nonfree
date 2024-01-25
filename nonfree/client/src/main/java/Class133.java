import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class133 implements Interface7 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	private int anInt3294 = -1;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_23;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public final int anInt3289;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
	public final int anInt3290;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private final int anInt3292;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
	private int anInt3291;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	private final int anInt3293;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!nm;III)V")
	public Class133(@OriginalArg(0) Class164_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass164_Sub1_23 = arg0;
		this.anInt3289 = arg2;
		this.anInt3290 = arg3;
		this.anInt3292 = arg1;
		@Pc(20) opengl local20 = this.aClass164_Sub1_23.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static189.anIntArray387, 0);
		this.anInt3291 = Static189.anIntArray387[0];
		local20.glBindRenderbufferEXT(36161, this.anInt3291);
		local20.glRenderbufferStorageEXT(36161, this.anInt3292, this.anInt3289, this.anInt3290);
		this.anInt3293 = this.anInt3289 * this.anInt3290 * this.aClass164_Sub1_23.method3575(this.anInt3292);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	@Override
	public void method5548() {
		this.aClass164_Sub1_23.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt3294, 36161, 0);
		this.anInt3294 = -1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method2686(@OriginalArg(0) int arg0) {
		this.aClass164_Sub1_23.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt3291);
		this.anInt3294 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()V")
	public void method2687() {
		if (this.anInt3291 > 0) {
			this.aClass164_Sub1_23.method3560(this.anInt3291, this.anInt3293);
			this.anInt3291 = 0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2687();
		super.finalize();
	}
}
