import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public abstract class Class44 implements Interface19 {

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "Z")
	private boolean aBoolean576 = false;

	@OriginalMember(owner = "client!fia", name = "v", descriptor = "I")
	private final int anInt7894;

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
	public final int anInt7892;

	@OriginalMember(owner = "client!fia", name = "p", descriptor = "Lclient!kv;")
	protected final Class143_Sub2 aClass143_Sub2_32;

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
	protected final int anInt7885;

	@OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
	protected int anInt7886;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!kv;IIIZ)V")
	protected Class44(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7894 = arg3;
		this.aBoolean578 = arg4;
		this.anInt7892 = arg1;
		this.aClass143_Sub2_32 = arg0;
		this.anInt7885 = arg2;
		OpenGL.glGenTextures(1, Static225.anIntArray201, 0);
		this.anInt7886 = Static225.anIntArray201[0];
		this.method6697(0);
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)V")
	private void method6697(@OriginalArg(0) int arg0) {
		this.aClass143_Sub2_32.anInt5827 -= arg0;
		this.aClass143_Sub2_32.anInt5827 += this.method6702();
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)I")
	public final int method6699() {
		return this.anInt7886;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)Z")
	public final boolean method6700() {
		if (!this.aClass143_Sub2_32.aBoolean420) {
			return false;
		}
		@Pc(17) int local17 = this.method6702();
		this.aClass143_Sub2_32.method4945(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7892);
		this.aBoolean578 = true;
		this.method6701();
		this.method6697(local17);
		return true;
	}

	@OriginalMember(owner = "client!fia", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6703();
		super.finalize();
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V")
	private void method6701() {
		this.aClass143_Sub2_32.method4945(this);
		if (this.aBoolean576) {
			OpenGL.glTexParameteri(this.anInt7892, 10241, this.aBoolean578 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7892, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7892, 10241, this.aBoolean578 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7892, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I")
	private int method6702() {
		@Pc(13) int local13 = this.aClass143_Sub2_32.method4948(this.anInt7885) * this.anInt7894;
		return this.aBoolean578 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V")
	public final void method6703() {
		if (this.anInt7886 > 0) {
			this.aClass143_Sub2_32.method4944(this.anInt7886, this.method6702());
			this.anInt7886 = 0;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BZ)V")
	protected final void method6705(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean578) {
			@Pc(15) int local15 = this.method6702();
			this.aBoolean578 = true;
			this.method6701();
			this.method6697(local15);
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V")
	public final void method6706(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean576) {
			this.aBoolean576 = arg0;
			this.method6701();
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
	public abstract void method6695();
}
