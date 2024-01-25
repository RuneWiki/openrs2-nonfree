import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wha")
public abstract class Class53 implements Interface3 {

	@OriginalMember(owner = "client!wha", name = "n", descriptor = "Z")
	private boolean aBoolean697 = false;

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "Z")
	private boolean aBoolean696;

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public final int anInt9817;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "I")
	private final int anInt9814;

	@OriginalMember(owner = "client!wha", name = "q", descriptor = "Lclient!pq;")
	protected final Class132_Sub3 aClass132_Sub3_40;

	@OriginalMember(owner = "client!wha", name = "u", descriptor = "I")
	protected final int anInt9821;

	@OriginalMember(owner = "client!wha", name = "p", descriptor = "I")
	protected int anInt9819;

	@OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lclient!pq;IIIZ)V")
	protected Class53(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean696 = arg4;
		this.anInt9817 = arg1;
		this.anInt9814 = arg3;
		this.aClass132_Sub3_40 = arg0;
		this.anInt9821 = arg2;
		OpenGL.glGenTextures(1, Static453.anIntArray89, 0);
		this.anInt9819 = Static453.anIntArray89[0];
		this.method8294(0);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)V")
	private void method8285() {
		this.aClass132_Sub3_40.method6759(this);
		if (this.aBoolean697) {
			OpenGL.glTexParameteri(this.anInt9817, 10241, this.aBoolean696 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9817, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9817, 10241, this.aBoolean696 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9817, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!wha", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8292();
		super.finalize();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)I")
	private int method8286() {
		@Pc(19) int local19 = this.aClass132_Sub3_40.method6797(this.anInt9821) * this.anInt9814;
		return this.aBoolean696 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZZ)V")
	public final void method8287(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean697) {
			this.aBoolean697 = arg0;
			this.method8285();
		}
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)Z")
	public final boolean method8288() {
		if (!this.aClass132_Sub3_40.aBoolean529) {
			return false;
		}
		@Pc(11) int local11 = this.method8286();
		this.aClass132_Sub3_40.method6759(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9817);
		this.aBoolean696 = true;
		this.method8285();
		this.method8294(local11);
		return true;
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)I")
	public final int method8291() {
		return this.anInt9819;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)V")
	public final void method8292() {
		if (this.anInt9819 > 0) {
			this.aClass132_Sub3_40.method6796(this.anInt9819, this.method8286());
			this.anInt9819 = 0;
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(IZ)V")
	protected final void method8293(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean696 != arg0) {
			@Pc(15) int local15 = this.method8286();
			this.aBoolean696 = true;
			this.method8285();
			this.method8294(local15);
		}
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(BI)V")
	private void method8294(@OriginalArg(1) int arg0) {
		this.aClass132_Sub3_40.anInt7885 -= arg0;
		this.aClass132_Sub3_40.anInt7885 += this.method8286();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public abstract void method8284();
}
