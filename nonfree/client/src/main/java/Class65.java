import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public abstract class Class65 implements Interface13 {

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "Z")
	private boolean aBoolean604 = false;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
	protected final int anInt8057;

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Z")
	private boolean aBoolean603;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
	public final int anInt8058;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	private final int anInt8052;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "Lclient!ep;")
	protected final Class95_Sub1 aClass95_Sub1_36;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	protected int anInt8055;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!ep;IIIZ)V")
	protected Class65(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8057 = arg2;
		this.aBoolean603 = arg4;
		this.anInt8058 = arg1;
		this.anInt8052 = arg3;
		this.aClass95_Sub1_36 = arg0;
		OpenGL.glGenTextures(1, Static452.anIntArray525, 0);
		this.anInt8055 = Static452.anIntArray525[0];
		this.method6826(0);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z")
	public final boolean method6825() {
		if (!this.aClass95_Sub1_36.aBoolean184) {
			return false;
		}
		@Pc(16) int local16 = this.method6832();
		this.aClass95_Sub1_36.method2077(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8058);
		this.aBoolean603 = true;
		this.method6835();
		this.method6826(local16);
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V")
	private void method6826(@OriginalArg(0) int arg0) {
		this.aClass95_Sub1_36.anInt2519 -= arg0;
		this.aClass95_Sub1_36.anInt2519 += this.method6832();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)V")
	protected final void method6827(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean603) {
			@Pc(21) int local21 = this.method6832();
			this.aBoolean603 = true;
			this.method6835();
			this.method6826(local21);
		}
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public final void method6828() {
		if (this.anInt8055 > 0) {
			this.aClass95_Sub1_36.method2094(this.anInt8055, this.method6832());
			this.anInt8055 = 0;
		}
	}

	@OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6828();
		super.finalize();
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)I")
	private int method6832() {
		@Pc(21) int local21 = this.aClass95_Sub1_36.method2114(this.anInt8057) * this.anInt8052;
		return this.aBoolean603 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)I")
	public final int method6833() {
		return this.anInt8055;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
	private void method6835() {
		this.aClass95_Sub1_36.method2077(this);
		if (this.aBoolean604) {
			OpenGL.glTexParameteri(this.anInt8058, 10241, this.aBoolean603 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8058, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8058, 10241, this.aBoolean603 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8058, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V")
	public final void method6836(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean604 != arg0) {
			this.aBoolean604 = arg0;
			this.method6835();
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public abstract void method6824();
}
