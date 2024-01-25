import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public abstract class Class56 implements Interface1 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!tb;")
	protected final Class129_Sub2 aClass129_Sub2_26;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	public final int anInt3010;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
	protected final int anInt3011;

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	private final int anInt3008;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
	protected int anInt3009;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!tb;IIIZ)V")
	protected Class56(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass129_Sub2_26 = arg0;
		this.anInt3010 = arg1;
		this.anInt3011 = arg2;
		this.aBoolean197 = arg4;
		this.anInt3008 = arg3;
		this.aClass129_Sub2_26.anOpengl2.glGenTextures(1, Static317.anIntArray202, 0);
		this.anInt3009 = Static317.anIntArray202[0];
		this.method2546(0);
	}

	@OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method2545();
		super.finalize();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()I")
	public final int method2536() {
		return this.anInt3009;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
	private void method2537() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_26.anOpengl2;
		this.aClass129_Sub2_26.method5084(this);
		if (this.aBoolean196) {
			local3.glTexParameteri(this.anInt3010, 10241, this.aBoolean197 ? 9987 : 9729);
			local3.glTexParameteri(this.anInt3010, 10240, 9729);
		} else {
			local3.glTexParameteri(this.anInt3010, 10241, this.aBoolean197 ? 9984 : 9728);
			local3.glTexParameteri(this.anInt3010, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()Z")
	public final boolean method2538() {
		@Pc(3) opengl local3 = this.aClass129_Sub2_26.anOpengl2;
		if (!this.aClass129_Sub2_26.aBoolean396) {
			return false;
		}
		@Pc(10) int local10 = this.method2541();
		this.aClass129_Sub2_26.method5084(this);
		local3.glGenerateMipmapEXT(this.anInt3010);
		this.aBoolean197 = true;
		this.method2537();
		this.method2546(local10);
		return true;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	protected final void method2539(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean197 != arg0) {
			@Pc(6) int local6 = this.method2541();
			this.aBoolean197 = true;
			this.method2537();
			this.method2546(local6);
		}
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "()I")
	private int method2541() {
		@Pc(8) int local8 = this.aClass129_Sub2_26.method5043(this.anInt3011) * this.anInt3008;
		return this.aBoolean197 ? local8 * 4 / 3 : local8;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public final void method2542(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean196 != arg0) {
			this.aBoolean196 = arg0;
			this.method2537();
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "()V")
	public final void method2545() {
		if (this.anInt3009 > 0) {
			this.aClass129_Sub2_26.method5066(this.anInt3009, this.method2541());
			this.anInt3009 = 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	private void method2546(@OriginalArg(0) int arg0) {
		this.aClass129_Sub2_26.anInt5882 -= arg0;
		this.aClass129_Sub2_26.anInt5882 += this.method2541();
	}
}
