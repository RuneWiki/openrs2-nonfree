import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public abstract class Class73 implements Interface19 {

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Z")
	private boolean aBoolean549 = false;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public final int anInt7616;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "Lclient!uq;")
	protected final Class122_Sub3 aClass122_Sub3_35;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Z")
	private boolean aBoolean548;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	protected final int anInt7624;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
	private final int anInt7627;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	protected int anInt7632;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!uq;IIIZ)V")
	protected Class73(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7616 = arg1;
		this.aClass122_Sub3_35 = arg0;
		this.aBoolean548 = arg4;
		this.anInt7624 = arg2;
		this.anInt7627 = arg3;
		OpenGL.glGenTextures(1, Static522.anIntArray821, 0);
		this.anInt7632 = Static522.anIntArray821[0];
		this.method6346(0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	private void method6346(@OriginalArg(0) int arg0) {
		this.aClass122_Sub3_35.anInt8426 -= arg0;
		this.aClass122_Sub3_35.anInt8426 += this.method6358();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	public final void method6348(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean549) {
			this.aBoolean549 = arg0;
			this.method6356();
		}
	}

	@OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6354();
		super.finalize();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(ZI)V")
	protected final void method6352(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean548) {
			@Pc(19) int local19 = this.method6358();
			this.aBoolean548 = true;
			this.method6356();
			this.method6346(local19);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Z")
	public final boolean method6353() {
		if (!this.aClass122_Sub3_35.aBoolean601) {
			return false;
		}
		@Pc(17) int local17 = this.method6358();
		this.aClass122_Sub3_35.method6850(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7616);
		this.aBoolean548 = true;
		this.method6356();
		this.method6346(local17);
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public final void method6354() {
		if (this.anInt7632 > 0) {
			this.aClass122_Sub3_35.method6878(this.method6358(), this.anInt7632);
			this.anInt7632 = 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	private void method6356() {
		this.aClass122_Sub3_35.method6850(this);
		if (this.aBoolean549) {
			OpenGL.glTexParameteri(this.anInt7616, 10241, this.aBoolean548 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7616, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7616, 10241, this.aBoolean548 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7616, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)I")
	public final int method6357() {
		return this.anInt7632;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)I")
	private int method6358() {
		@Pc(19) int local19 = this.aClass122_Sub3_35.method6866(this.anInt7624) * this.anInt7627;
		return this.aBoolean548 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public abstract void method6345();
}
