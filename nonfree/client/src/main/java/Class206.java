import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class206 implements Interface5 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	private int anInt6114 = -1;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_36;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	public final int anInt6117;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "I")
	public final int anInt6115;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	private final int anInt6112;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "I")
	private int anInt6116;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	private final int anInt6113;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!hj;III)V")
	public Class206(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass2_Sub1_36 = arg0;
		this.anInt6117 = arg2;
		this.anInt6115 = arg3;
		this.anInt6112 = arg1;
		@Pc(20) opengl local20 = this.aClass2_Sub1_36.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static319.anIntArray765, 0);
		this.anInt6116 = Static319.anIntArray765[0];
		local20.glBindRenderbufferEXT(36161, this.anInt6116);
		local20.glRenderbufferStorageEXT(36161, this.anInt6112, this.anInt6117, this.anInt6115);
		this.anInt6113 = this.anInt6117 * this.anInt6115 * this.aClass2_Sub1_36.method2335(this.anInt6112);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
	public void method5355(@OriginalArg(0) int arg0) {
		this.aClass2_Sub1_36.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt6116);
		this.anInt6114 = arg0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V")
	@Override
	public void method5354() {
		this.aClass2_Sub1_36.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt6114, 36161, 0);
		this.anInt6114 = -1;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "()V")
	public void method5356() {
		if (this.anInt6116 > 0) {
			this.aClass2_Sub1_36.method2374(this.anInt6116, this.anInt6113);
			this.anInt6116 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method5356();
		super.finalize();
	}
}
