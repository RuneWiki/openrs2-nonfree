import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public abstract class Class11 implements Interface12 {

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "Z")
	private boolean aBoolean753 = false;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "Lclient!ji;")
	protected final Class15_Sub3 aClass15_Sub3_35;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
	protected final int anInt9048;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
	public final int anInt9053;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "Z")
	private boolean aBoolean754;

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "I")
	private final int anInt9043;

	@OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
	protected int anInt9049;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ji;IIIZ)V")
	protected Class11(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass15_Sub3_35 = arg0;
		this.anInt9048 = arg2;
		this.anInt9053 = arg1;
		this.aBoolean754 = arg4;
		this.anInt9043 = arg3;
		OpenGL.glGenTextures(1, Static449.anIntArray520, 0);
		this.anInt9049 = Static449.anIntArray520[0];
		this.method7406(0);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IZ)V")
	protected final void method7405(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean754) {
			@Pc(15) int local15 = this.method7407();
			this.aBoolean754 = true;
			this.method7409();
			this.method7406(local15);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	private void method7406(@OriginalArg(1) int arg0) {
		this.aClass15_Sub3_35.anInt5333 -= arg0;
		this.aClass15_Sub3_35.anInt5333 += this.method7407();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)I")
	private int method7407() {
		@Pc(18) int local18 = this.aClass15_Sub3_35.method4390(this.anInt9048) * this.anInt9043;
		return this.aBoolean754 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	private void method7409() {
		this.aClass15_Sub3_35.method4377(this);
		if (this.aBoolean753) {
			OpenGL.glTexParameteri(this.anInt9053, 10241, this.aBoolean754 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9053, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9053, 10241, this.aBoolean754 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9053, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)I")
	public final int method7410() {
		return this.anInt9049;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V")
	public final void method7411() {
		if (this.anInt9049 > 0) {
			this.aClass15_Sub3_35.method4385(this.method7407(), this.anInt9049);
			this.anInt9049 = 0;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZZ)V")
	public final void method7412(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean753) {
			this.aBoolean753 = arg0;
			this.method7409();
		}
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)Z")
	public final boolean method7413() {
		if (!this.aClass15_Sub3_35.aBoolean444) {
			return false;
		}
		@Pc(16) int local16 = this.method7407();
		this.aClass15_Sub3_35.method4377(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9053);
		this.aBoolean754 = true;
		this.method7409();
		this.method7406(local16);
		return true;
	}

	@OriginalMember(owner = "client!gq", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7411();
		super.finalize();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public abstract void method8310();
}
