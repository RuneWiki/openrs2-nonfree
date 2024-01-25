import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public abstract class Class64 implements Interface5 {

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Z")
	private boolean aBoolean320 = false;

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public final int anInt4388;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	protected final int anInt4384;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!na;")
	protected final Class75_Sub2 aClass75_Sub2_24;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
	private final int anInt4385;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
	protected int anInt4398;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!na;IIIZ)V")
	protected Class64(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean321 = arg4;
		this.anInt4388 = arg1;
		this.anInt4384 = arg2;
		this.aClass75_Sub2_24 = arg0;
		this.anInt4385 = arg3;
		OpenGL.glGenTextures(1, Static195.anIntArray280, 0);
		this.anInt4398 = Static195.anIntArray280[0];
		this.method3527(0);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public final void method3518() {
		if (this.anInt4398 > 0) {
			this.aClass75_Sub2_24.method3853(this.method3524(), this.anInt4398);
			this.anInt4398 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	private void method3519() {
		this.aClass75_Sub2_24.method3844(this);
		if (this.aBoolean320) {
			OpenGL.glTexParameteri(this.anInt4388, 10241, this.aBoolean321 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt4388, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt4388, 10241, this.aBoolean321 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt4388, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
	public final boolean method3521() {
		if (!this.aClass75_Sub2_24.aBoolean339) {
			return false;
		}
		@Pc(19) int local19 = this.method3524();
		this.aClass75_Sub2_24.method3844(this);
		OpenGL.glGenerateMipmapEXT(this.anInt4388);
		this.aBoolean321 = true;
		this.method3519();
		this.method3527(local19);
		return true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZ)V")
	public final void method3523(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean320 != arg0) {
			this.aBoolean320 = arg0;
			this.method3519();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)I")
	private int method3524() {
		@Pc(13) int local13 = this.aClass75_Sub2_24.method3797(this.anInt4384) * this.anInt4385;
		return this.aBoolean321 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V")
	protected final void method3525(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean321 != arg0) {
			@Pc(23) int local23 = this.method3524();
			this.aBoolean321 = true;
			this.method3519();
			this.method3527(local23);
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
	public final int method3526() {
		return this.anInt4398;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)V")
	private void method3527(@OriginalArg(1) int arg0) {
		this.aClass75_Sub2_24.anInt4865 -= arg0;
		this.aClass75_Sub2_24.anInt4865 += this.method3524();
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method3518();
		super.finalize();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public abstract void method5596();
}
