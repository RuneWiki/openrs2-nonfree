import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class208 implements Interface8 {

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	private int anInt6622 = -1;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_38;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
	public final int anInt6624;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
	public final int anInt6623;

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	private final int anInt6621;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
	private int anInt6620;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
	private final int anInt6625;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lclient!ql;III)V")
	public Class208(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass92_Sub2_38 = arg0;
		this.anInt6624 = arg2;
		this.anInt6623 = arg3;
		this.anInt6621 = arg1;
		@Pc(20) opengl local20 = this.aClass92_Sub2_38.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static334.anIntArray524, 0);
		this.anInt6620 = Static334.anIntArray524[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6620);
		local20.glRenderbufferStorageEXT(36161, this.anInt6621, this.anInt6624, this.anInt6623);
		this.anInt6625 = this.anInt6624 * this.anInt6623 * this.aClass92_Sub2_38.method4592(this.anInt6621);
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	public void method5490() {
		if (this.anInt6620 > 0) {
			this.aClass92_Sub2_38.method4574(this.anInt6620, this.anInt6625);
			this.anInt6620 = 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5490();
		super.finalize();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	public void method5491(@OriginalArg(0) int arg0) {
		this.aClass92_Sub2_38.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6620);
		this.anInt6622 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()V")
	@Override
	public void method5489() {
		this.aClass92_Sub2_38.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt6622, 36161, 0);
		this.anInt6622 = -1;
	}
}
