import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vfa")
public abstract class Class52 implements Interface9 {

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!vfa", name = "p", descriptor = "I")
	public final int anInt6859;

	@OriginalMember(owner = "client!vfa", name = "l", descriptor = "I")
	protected final int anInt6855;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "Z")
	private boolean aBoolean495;

	@OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lclient!ag;")
	protected final Class12_Sub1 aClass12_Sub1_31;

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "I")
	private final int anInt6862;

	@OriginalMember(owner = "client!vfa", name = "n", descriptor = "I")
	protected int anInt6857;

	@OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lclient!ag;IIIZ)V")
	protected Class52(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6859 = arg1;
		this.anInt6855 = arg2;
		this.aBoolean495 = arg4;
		this.aClass12_Sub1_31 = arg0;
		this.anInt6862 = arg3;
		OpenGL.glGenTextures(1, Static447.anIntArray517, 0);
		this.anInt6857 = Static447.anIntArray517[0];
		this.method5638(0);
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)I")
	public final int method5636() {
		return this.anInt6857;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
	private void method5637() {
		this.aClass12_Sub1_31.method378(this);
		if (this.aBoolean496) {
			OpenGL.glTexParameteri(this.anInt6859, 10241, this.aBoolean495 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt6859, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt6859, 10241, this.aBoolean495 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt6859, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	private void method5638(@OriginalArg(1) int arg0) {
		this.aClass12_Sub1_31.anInt469 -= arg0;
		this.aClass12_Sub1_31.anInt469 += this.method5645();
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(I)Z")
	public final boolean method5639() {
		if (!this.aClass12_Sub1_31.aBoolean34) {
			return false;
		}
		@Pc(11) int local11 = this.method5645();
		this.aClass12_Sub1_31.method378(this);
		OpenGL.glGenerateMipmapEXT(this.anInt6859);
		this.aBoolean495 = true;
		this.method5637();
		this.method5638(local11);
		return true;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZI)V")
	protected final void method5640(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean495) {
			@Pc(11) int local11 = this.method5645();
			this.aBoolean495 = true;
			this.method5637();
			this.method5638(local11);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "(I)V")
	public final void method5643() {
		if (this.anInt6857 > 0) {
			this.aClass12_Sub1_31.method403(this.method5645(), this.anInt6857);
			this.anInt6857 = 0;
		}
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V")
	public final void method5644(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean496) {
			this.aBoolean496 = arg0;
			this.method5637();
		}
	}

	@OriginalMember(owner = "client!vfa", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5643();
		super.finalize();
	}

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "(I)I")
	private int method5645() {
		@Pc(13) int local13 = this.aClass12_Sub1_31.method377(this.anInt6855) * this.anInt6862;
		return this.aBoolean495 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
	public abstract void method5633();
}
