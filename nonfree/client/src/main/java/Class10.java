import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public abstract class Class10 implements Interface14 {

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	protected final int anInt7248;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "I")
	public final int anInt7252;

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "I")
	private final int anInt7254;

	@OriginalMember(owner = "client!ru", name = "e", descriptor = "Lclient!lf;")
	protected final Class95_Sub3 aClass95_Sub3_30;

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
	protected int anInt7244;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!lf;IIIZ)V")
	protected Class10(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7248 = arg2;
		this.aBoolean519 = arg4;
		this.anInt7252 = arg1;
		this.anInt7254 = arg3;
		this.aClass95_Sub3_30 = arg0;
		OpenGL.glGenTextures(1, Static607.anIntArray541, 0);
		this.anInt7244 = Static607.anIntArray541[0];
		this.method6095(0);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
	protected final void method6093(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean519 != arg0) {
			@Pc(7) int local7 = this.method6100();
			this.aBoolean519 = true;
			this.method6098();
			this.method6095(local7);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)V")
	public final void method6094() {
		if (this.anInt7244 > 0) {
			this.aClass95_Sub3_30.method4912(this.method6100(), this.anInt7244);
			this.anInt7244 = 0;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)V")
	private void method6095(@OriginalArg(0) int arg0) {
		this.aClass95_Sub3_30.anInt5756 -= arg0;
		this.aClass95_Sub3_30.anInt5756 += this.method6100();
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z")
	public final boolean method6096() {
		if (!this.aClass95_Sub3_30.aBoolean392) {
			return false;
		}
		@Pc(15) int local15 = this.method6100();
		this.aClass95_Sub3_30.method4864(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7252);
		this.aBoolean519 = true;
		this.method6098();
		this.method6095(local15);
		return true;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)V")
	public final void method6097(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean518) {
			this.aBoolean518 = arg0;
			this.method6098();
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
	private void method6098() {
		this.aClass95_Sub3_30.method4864(this);
		if (this.aBoolean518) {
			OpenGL.glTexParameteri(this.anInt7252, 10241, this.aBoolean519 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7252, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7252, 10241, this.aBoolean519 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7252, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
	public final int method6099() {
		return this.anInt7244;
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)I")
	private int method6100() {
		@Pc(13) int local13 = this.aClass95_Sub3_30.method4859(this.anInt7248) * this.anInt7254;
		return this.aBoolean519 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6094();
		super.finalize();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
	public abstract void method6091();
}
