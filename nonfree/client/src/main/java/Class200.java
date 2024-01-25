import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class200 implements Interface1 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	private int anInt6333 = -1;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_40;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
	public final int anInt6329;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	public final int anInt6334;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
	private final int anInt6330;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	private int anInt6332;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	private final int anInt6331;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!cg;III)V")
	public Class200(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass37_Sub1_40 = arg0;
		this.anInt6329 = arg2;
		this.anInt6334 = arg3;
		this.anInt6330 = arg1;
		@Pc(20) opengl local20 = this.aClass37_Sub1_40.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static324.anIntArray494, 0);
		this.anInt6332 = Static324.anIntArray494[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6332);
		local20.glRenderbufferStorageEXT(36161, this.anInt6330, this.anInt6329, this.anInt6334);
		this.anInt6331 = this.anInt6329 * this.anInt6334 * this.aClass37_Sub1_40.method801(this.anInt6330);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	@Override
	public void method5338() {
		this.aClass37_Sub1_40.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt6333, 36161, 0);
		this.anInt6333 = -1;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
	public void method5339() {
		if (this.anInt6332 > 0) {
			this.aClass37_Sub1_40.method784(this.anInt6332, this.anInt6331);
			this.anInt6332 = 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5339();
		super.finalize();
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method5340(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_40.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6332);
		this.anInt6333 = arg0;
	}
}
