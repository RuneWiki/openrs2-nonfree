import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class152 implements Interface5 {

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	private int anInt4069 = -1;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_27;

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public final int anInt4072;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public final int anInt4070;

	@OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
	private final int anInt4071;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
	private final int anInt4068;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!qi;III)V")
	public Class152(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass82_Sub2_27 = arg0;
		this.anInt4072 = arg2;
		this.anInt4070 = arg3;
		this.anInt4071 = arg1;
		@Pc(20) opengl local20 = this.aClass82_Sub2_27.anOpengl2;
		local20.glGenRenderbuffersEXT(1, Static220.anIntArray499, 0);
		this.anInt4067 = Static220.anIntArray499[0];
		local20.glBindRenderbufferEXT(36161, this.anInt4067);
		local20.glRenderbufferStorageEXT(36161, this.anInt4071, this.anInt4072, this.anInt4070);
		this.anInt4068 = this.anInt4072 * this.anInt4070 * this.aClass82_Sub2_27.method4577(this.anInt4071);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public void method3713(@OriginalArg(0) int arg0) {
		this.aClass82_Sub2_27.anOpengl2.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt4067);
		this.anInt4069 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "()V")
	@Override
	public void method4731() {
		this.aClass82_Sub2_27.anOpengl2.glFramebufferRenderbufferEXT(36160, this.anInt4069, 36161, 0);
		this.anInt4069 = -1;
	}

	@OriginalMember(owner = "client!mn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3714();
		super.finalize();
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "()V")
	public void method3714() {
		if (this.anInt4067 > 0) {
			this.aClass82_Sub2_27.method4563(this.anInt4067, this.anInt4068);
			this.anInt4067 = 0;
		}
	}
}
