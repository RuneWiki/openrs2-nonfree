import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class134 implements Interface4 {

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt3377 = -1;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_24;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public final int anInt3372;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public final int anInt3376;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private final int anInt3375;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
	private int anInt3374;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	private final int anInt3373;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!fu;III)V")
	public Class134(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass63_Sub2_24 = arg0;
		this.anInt3372 = arg2;
		this.anInt3376 = arg3;
		this.anInt3375 = arg1;
		@Pc(20) opengl local20 = this.aClass63_Sub2_24.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static175.anIntArray655, 0);
		this.anInt3374 = Static175.anIntArray655[0];
		local20.glBindRenderbufferEXT(36161, this.anInt3374);
		local20.glRenderbufferStorageEXT(36161, this.anInt3375, this.anInt3372, this.anInt3376);
		this.anInt3373 = this.anInt3372 * this.anInt3376 * this.aClass63_Sub2_24.method2101(this.anInt3375);
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3099();
		super.finalize();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	@Override
	public void method5494() {
		this.aClass63_Sub2_24.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt3377, 36161, 0);
		this.anInt3377 = -1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public void method3098(@OriginalArg(0) int arg0) {
		this.aClass63_Sub2_24.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt3374);
		this.anInt3377 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "()V")
	public void method3099() {
		if (this.anInt3374 > 0) {
			this.aClass63_Sub2_24.method2076(this.anInt3374, this.anInt3373);
			this.anInt3374 = 0;
		}
	}
}
