import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class108 implements Interface6 {

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	private int anInt3254 = -1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_19;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public final int anInt3253;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
	public final int anInt3250;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	private final int anInt3252;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
	private int anInt3249;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
	private final int anInt3251;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!sq;III)V")
	public Class108(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass46_Sub2_19 = arg0;
		this.anInt3253 = arg2;
		this.anInt3250 = arg3;
		this.anInt3252 = arg1;
		@Pc(20) opengl local20 = this.aClass46_Sub2_19.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static152.anIntArray286, 0);
		this.anInt3249 = Static152.anIntArray286[0];
		local20.glBindRenderbufferEXT(36161, this.anInt3249);
		local20.glRenderbufferStorageEXT(36161, this.anInt3252, this.anInt3253, this.anInt3250);
		this.anInt3251 = this.anInt3253 * this.anInt3250 * this.aClass46_Sub2_19.method5202(this.anInt3252);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
	public void method3013(@OriginalArg(0) int arg0) {
		this.aClass46_Sub2_19.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt3249);
		this.anInt3254 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "()V")
	public void method3014() {
		if (this.anInt3249 > 0) {
			this.aClass46_Sub2_19.method5203(this.anInt3249, this.anInt3251);
			this.anInt3249 = 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
		this.aClass46_Sub2_19.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt3254, 36161, 0);
		this.anInt3254 = -1;
	}

	@OriginalMember(owner = "client!jn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3014();
		super.finalize();
	}
}
