import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public abstract class Class65 implements Interface5 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Z")
	private boolean aBoolean455 = false;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
	public final int anInt5266;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!bo;")
	protected final Class26_Sub1 aClass26_Sub1_26;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	private final int anInt5263;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
	protected final int anInt5260;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	protected int anInt5269;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!bo;IIIZ)V")
	protected Class65(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5266 = arg1;
		this.aClass26_Sub1_26 = arg0;
		this.aBoolean454 = arg4;
		this.anInt5263 = arg3;
		this.anInt5260 = arg2;
		OpenGL.glGenTextures(1, Static130.anIntArray143, 0);
		this.anInt5269 = Static130.anIntArray143[0];
		this.method4266(0);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)V")
	protected final void method4256(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean454) {
			@Pc(24) int local24 = this.method4257();
			this.aBoolean454 = true;
			this.method4264();
			this.method4266(local24);
		}
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
	private int method4257() {
		@Pc(18) int local18 = this.aClass26_Sub1_26.method674(this.anInt5260) * this.anInt5263;
		return this.aBoolean454 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V")
	public final void method4258() {
		if (this.anInt5269 > 0) {
			this.aClass26_Sub1_26.method658(this.anInt5269, this.method4257());
			this.anInt5269 = 0;
		}
	}

	@OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4258();
		super.finalize();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)I")
	public final int method4261() {
		return this.anInt5269;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(IZ)V")
	public final void method4263(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean455 != arg0) {
			this.aBoolean455 = arg0;
			this.method4264();
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	private void method4264() {
		this.aClass26_Sub1_26.method673(this);
		if (this.aBoolean455) {
			OpenGL.glTexParameteri(this.anInt5266, 10241, this.aBoolean454 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5266, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5266, 10241, this.aBoolean454 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5266, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)Z")
	public final boolean method4265() {
		if (!this.aClass26_Sub1_26.aBoolean80) {
			return false;
		}
		@Pc(19) int local19 = this.method4257();
		this.aClass26_Sub1_26.method673(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5266);
		this.aBoolean454 = true;
		this.method4264();
		this.method4266(local19);
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
	private void method4266(@OriginalArg(0) int arg0) {
		this.aClass26_Sub1_26.anInt930 -= arg0;
		this.aClass26_Sub1_26.anInt930 += this.method4257();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public abstract void method4255();
}
