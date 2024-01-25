import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public abstract class Class76 implements Interface22 {

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "Z")
	private boolean aBoolean662 = false;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
	private boolean aBoolean661;

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
	public final int anInt9197;

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	protected final int anInt9207;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private final int anInt9209;

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "Lclient!kw;")
	protected final Class5_Sub2 aClass5_Sub2_36;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
	protected int anInt9205;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lclient!kw;IIIZ)V")
	protected Class76(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean661 = arg4;
		this.anInt9197 = arg1;
		this.anInt9207 = arg2;
		this.anInt9209 = arg3;
		this.aClass5_Sub2_36 = arg0;
		OpenGL.glGenTextures(1, Static87.anIntArray75, 0);
		this.anInt9205 = Static87.anIntArray75[0];
		this.method7923(0);
	}

	@OriginalMember(owner = "client!ou", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7926();
		super.finalize();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	private void method7923(@OriginalArg(0) int arg0) {
		this.aClass5_Sub2_36.anInt5652 -= arg0;
		this.aClass5_Sub2_36.anInt5652 += this.method7927();
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Z")
	public final boolean method7925() {
		if (!this.aClass5_Sub2_36.aBoolean374) {
			return false;
		}
		@Pc(17) int local17 = this.method7927();
		this.aClass5_Sub2_36.method4997(this);
		OpenGL.glGenerateMipmapEXT(this.anInt9197);
		this.aBoolean661 = true;
		this.method7929();
		this.method7923(local17);
		return true;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	public final void method7926() {
		if (this.anInt9205 > 0) {
			this.aClass5_Sub2_36.method4965(this.method7927(), this.anInt9205);
			this.anInt9205 = 0;
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)I")
	private int method7927() {
		@Pc(18) int local18 = this.aClass5_Sub2_36.method5032(this.anInt9207) * this.anInt9209;
		return this.aBoolean661 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
	protected final void method7928(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean661) {
			@Pc(21) int local21 = this.method7927();
			this.aBoolean661 = true;
			this.method7929();
			this.method7923(local21);
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	private void method7929() {
		this.aClass5_Sub2_36.method4997(this);
		if (this.aBoolean662) {
			OpenGL.glTexParameteri(this.anInt9197, 10241, this.aBoolean661 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9197, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9197, 10241, this.aBoolean661 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9197, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BZ)V")
	public final void method7930(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean662) {
			this.aBoolean662 = arg0;
			this.method7929();
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)I")
	public final int method7931() {
		return this.anInt9205;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public abstract void method7922();
}
