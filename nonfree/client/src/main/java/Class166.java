import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class166 implements Interface9 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	private int anInt5094 = -1;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_34;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public final int anInt5099;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public final int anInt5095;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	private final int anInt5096;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	private final int anInt5098;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ks;III)V")
	public Class166(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass63_Sub1_34 = arg0;
		this.anInt5099 = arg2;
		this.anInt5095 = arg3;
		this.anInt5096 = arg1;
		@Pc(20) opengl local20 = this.aClass63_Sub1_34.anOpengl1;
		local20.glGenRenderbuffersEXT(1, Static250.anIntArray388, 0);
		this.anInt5097 = Static250.anIntArray388[0];
		local20.glBindRenderbufferEXT(36161, this.anInt5097);
		local20.glRenderbufferStorageEXT(36161, this.anInt5096, this.anInt5099, this.anInt5095);
		this.anInt5098 = this.anInt5099 * this.anInt5095 * this.aClass63_Sub1_34.method3396(this.anInt5096);
	}

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4709();
		super.finalize();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	public void method4709() {
		if (this.anInt5097 > 0) {
			this.aClass63_Sub1_34.method3341(this.anInt5097, this.anInt5098);
			this.anInt5097 = 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	@Override
	public void method4708() {
		this.aClass63_Sub1_34.anOpengl1.glFramebufferRenderbufferEXT(36160, this.anInt5094, 36161, 0);
		this.anInt5094 = -1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method4710(@OriginalArg(0) int arg0) {
		this.aClass63_Sub1_34.anOpengl1.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5097);
		this.anInt5094 = arg0;
	}
}
