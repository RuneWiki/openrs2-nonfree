import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class215 implements Interface1 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
	private int anInt6708 = -1;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_41;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public final int anInt6710;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
	public final int anInt6709;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private final int anInt6713;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	private int anInt6712;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	private final int anInt6711;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!tb;III)V")
	public Class215(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass129_Sub2_41 = arg0;
		this.anInt6710 = arg2;
		this.anInt6709 = arg3;
		this.anInt6713 = arg1;
		@Pc(20) opengl local20 = this.aClass129_Sub2_41.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static353.anIntArray548, 0);
		this.anInt6712 = Static353.anIntArray548[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6712);
		local20.glRenderbufferStorageEXT(36161, this.anInt6713, this.anInt6710, this.anInt6709);
		this.anInt6711 = this.anInt6710 * this.anInt6709 * this.aClass129_Sub2_41.method5043(this.anInt6713);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public void method5674(@OriginalArg(0) int arg0) {
		this.aClass129_Sub2_41.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6712);
		this.anInt6708 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	public void method5675() {
		if (this.anInt6712 > 0) {
			this.aClass129_Sub2_41.method5061(this.anInt6712, this.anInt6711);
			this.anInt6712 = 0;
		}
	}

	@OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5675();
		super.finalize();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	@Override
	public void method5673() {
		this.aClass129_Sub2_41.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt6708, 36161, 0);
		this.anInt6708 = -1;
	}
}
