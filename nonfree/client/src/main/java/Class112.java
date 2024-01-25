import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public abstract class Class112 implements Interface4 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "Z")
	private boolean aBoolean496 = false;

	@OriginalMember(owner = "client!ih", name = "q", descriptor = "Lclient!vj;")
	protected final Class172_Sub2 aClass172_Sub2_29;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	protected final int anInt5821;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "Z")
	private boolean aBoolean497;

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "I")
	private final int anInt5824;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public final int anInt5815;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
	protected int anInt5818;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!vj;IIIZ)V")
	protected Class112(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass172_Sub2_29 = arg0;
		this.anInt5821 = arg2;
		this.aBoolean497 = arg4;
		this.anInt5824 = arg3;
		this.anInt5815 = arg1;
		OpenGL.glGenTextures(1, Static451.anIntArray529, 0);
		this.anInt5818 = Static451.anIntArray529[0];
		this.method4548(0);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I")
	private int method4546() {
		@Pc(18) int local18 = this.aClass172_Sub2_29.method5603(this.anInt5821) * this.anInt5824;
		return this.aBoolean497 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)I")
	public final int method4547() {
		return this.anInt5818;
	}

	@OriginalMember(owner = "client!ih", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4553();
		super.finalize();
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)V")
	private void method4548(@OriginalArg(0) int arg0) {
		this.aClass172_Sub2_29.anInt7169 -= arg0;
		this.aClass172_Sub2_29.anInt7169 += this.method4546();
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)Z")
	public final boolean method4549() {
		if (!this.aClass172_Sub2_29.aBoolean605) {
			return false;
		}
		@Pc(11) int local11 = this.method4546();
		this.aClass172_Sub2_29.method5630(this);
		OpenGL.glGenerateMipmapEXT(this.anInt5815);
		this.aBoolean497 = true;
		this.method4550();
		this.method4548(local11);
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	private void method4550() {
		this.aClass172_Sub2_29.method5630(this);
		if (this.aBoolean496) {
			OpenGL.glTexParameteri(this.anInt5815, 10241, this.aBoolean497 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5815, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5815, 10241, this.aBoolean497 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5815, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BZ)V")
	public final void method4551(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean496 != arg0) {
			this.aBoolean496 = arg0;
			this.method4550();
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)V")
	protected final void method4552(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean497) {
			@Pc(18) int local18 = this.method4546();
			this.aBoolean497 = true;
			this.method4550();
			this.method4548(local18);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
	public final void method4553() {
		if (this.anInt5818 > 0) {
			this.aClass172_Sub2_29.method5550(this.anInt5818, this.method4546());
			this.anInt5818 = 0;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	public abstract void method4544();
}
