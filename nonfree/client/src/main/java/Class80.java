import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public abstract class Class80 implements Interface26 {

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Z")
	private boolean aBoolean707 = false;

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
	private final int anInt8335;

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
	public final int anInt8338;

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "Z")
	private boolean aBoolean708;

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!ck;")
	protected final Class65_Sub1 aClass65_Sub1_32;

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
	protected final int anInt8332;

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	protected int anInt8337;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lclient!ck;IIIZ)V")
	protected Class80(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt8335 = arg3;
		this.anInt8338 = arg1;
		this.aBoolean708 = arg4;
		this.aClass65_Sub1_32 = arg0;
		this.anInt8332 = arg2;
		OpenGL.glGenTextures(1, Static13.anIntArray484, 0);
		this.anInt8337 = Static13.anIntArray484[0];
		this.method7134(0);
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)I")
	private int method7132() {
		@Pc(19) int local19 = this.aClass65_Sub1_32.method1257(this.anInt8332) * this.anInt8335;
		return this.aBoolean708 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)I")
	public final int method7133() {
		return this.anInt8337;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
	private void method7134(@OriginalArg(0) int arg0) {
		this.aClass65_Sub1_32.anInt1387 -= arg0;
		this.aClass65_Sub1_32.anInt1387 += this.method7132();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
	public final boolean method7135() {
		if (!this.aClass65_Sub1_32.aBoolean100) {
			return false;
		}
		@Pc(16) int local16 = this.method7132();
		this.aClass65_Sub1_32.method1286(this);
		OpenGL.glGenerateMipmapEXT(this.anInt8338);
		this.aBoolean708 = true;
		this.method7140();
		this.method7134(local16);
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public final void method7136() {
		if (this.anInt8337 > 0) {
			this.aClass65_Sub1_32.method1284(this.method7132(), this.anInt8337);
			this.anInt8337 = 0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BZ)V")
	protected final void method7139(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean708 != arg0) {
			@Pc(17) int local17 = this.method7132();
			this.aBoolean708 = true;
			this.method7140();
			this.method7134(local17);
		}
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
	private void method7140() {
		this.aClass65_Sub1_32.method1286(this);
		if (this.aBoolean707) {
			OpenGL.glTexParameteri(this.anInt8338, 10241, this.aBoolean708 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8338, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8338, 10241, this.aBoolean708 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8338, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(IZ)V")
	public final void method7142(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean707 != arg0) {
			this.aBoolean707 = arg0;
			this.method7140();
		}
	}

	@OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7136();
		super.finalize();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
	public abstract void method7433();
}
