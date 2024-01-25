import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public abstract class Class21 implements Interface7 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!go", name = "q", descriptor = "I")
	public final int anInt4557;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "I")
	protected final int anInt4549;

	@OriginalMember(owner = "client!go", name = "n", descriptor = "Lclient!qg;")
	protected final Class121_Sub2 aClass121_Sub2_24;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "I")
	private final int anInt4558;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "I")
	protected int anInt4556;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(Lclient!qg;IIIZ)V")
	protected Class21(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean359 = arg4;
		this.anInt4557 = arg1;
		this.anInt4549 = arg2;
		this.aClass121_Sub2_24 = arg0;
		this.anInt4558 = arg3;
		OpenGL.glGenTextures(1, Static39.anIntArray39, 0);
		this.anInt4556 = Static39.anIntArray39[0];
		this.method3753(0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z")
	public final boolean method3748() {
		if (!this.aClass121_Sub2_24.aBoolean466) {
			return false;
		}
		@Pc(11) int local11 = this.method3757();
		this.aClass121_Sub2_24.method4681(this);
		OpenGL.glGenerateMipmapEXT(this.anInt4557);
		this.aBoolean359 = true;
		this.method3754();
		this.method3753(local11);
		return true;
	}

	@OriginalMember(owner = "client!go", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3752();
		super.finalize();
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V")
	public final void method3752() {
		if (this.anInt4556 > 0) {
			this.aClass121_Sub2_24.method4646(this.anInt4556, this.method3757());
			this.anInt4556 = 0;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	private void method3753(@OriginalArg(0) int arg0) {
		this.aClass121_Sub2_24.anInt5942 -= arg0;
		this.aClass121_Sub2_24.anInt5942 += this.method3757();
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V")
	private void method3754() {
		this.aClass121_Sub2_24.method4681(this);
		if (this.aBoolean360) {
			OpenGL.glTexParameteri(this.anInt4557, 10241, this.aBoolean359 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt4557, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt4557, 10241, this.aBoolean359 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt4557, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)V")
	public final void method3755(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean360 != arg0) {
			this.aBoolean360 = arg0;
			this.method3754();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BZ)V")
	protected final void method3756(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean359) {
			@Pc(17) int local17 = this.method3757();
			this.aBoolean359 = true;
			this.method3754();
			this.method3753(local17);
		}
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(I)I")
	private int method3757() {
		@Pc(18) int local18 = this.aClass121_Sub2_24.method4664(this.anInt4549) * this.anInt4558;
		return this.aBoolean359 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!go", name = "f", descriptor = "(I)I")
	public final int method3758() {
		return this.anInt4556;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)V")
	public abstract void method3747();
}
