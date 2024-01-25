import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public abstract class Class10 implements Interface7 {

	@OriginalMember(owner = "client!he", name = "s", descriptor = "Z")
	private boolean aBoolean819 = false;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	private final int anInt7518;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "I")
	protected final int anInt7515;

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!ur;")
	protected final Class34_Sub2 aClass34_Sub2_43;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	public final int anInt7522;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "Z")
	private boolean aBoolean818;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	protected int anInt7520;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lclient!ur;IIIZ)V")
	protected Class10(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7518 = arg3;
		this.anInt7515 = arg2;
		this.aClass34_Sub2_43 = arg0;
		this.anInt7522 = arg1;
		this.aBoolean818 = arg4;
		OpenGL.glGenTextures(1, Static295.anIntArray336, 0);
		this.anInt7520 = Static295.anIntArray336[0];
		this.method5935(0);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	public final void method5926() {
		if (this.anInt7520 > 0) {
			this.aClass34_Sub2_43.method5561(this.method5933(), this.anInt7520);
			this.anInt7520 = 0;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	private void method5927() {
		this.aClass34_Sub2_43.method5493(this);
		if (this.aBoolean819) {
			OpenGL.glTexParameteri(this.anInt7522, 10241, this.aBoolean818 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7522, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7522, 10241, this.aBoolean818 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7522, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BZ)V")
	public final void method5928(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean819 != arg0) {
			this.aBoolean819 = arg0;
			this.method5927();
		}
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)I")
	public final int method5930() {
		return this.anInt7520;
	}

	@OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5926();
		super.finalize();
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	private int method5933() {
		@Pc(13) int local13 = this.aClass34_Sub2_43.method5559(this.anInt7515) * this.anInt7518;
		return this.aBoolean818 ? local13 * 4 / 3 : local13;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
	public final boolean method5934() {
		if (!this.aClass34_Sub2_43.aBoolean774) {
			return false;
		}
		@Pc(11) int local11 = this.method5933();
		this.aClass34_Sub2_43.method5493(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7522);
		this.aBoolean818 = true;
		this.method5927();
		this.method5935(local11);
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	private void method5935(@OriginalArg(0) int arg0) {
		this.aClass34_Sub2_43.anInt7078 -= arg0;
		this.aClass34_Sub2_43.anInt7078 += this.method5933();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	protected final void method5936(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean818) {
			@Pc(11) int local11 = this.method5933();
			this.aBoolean818 = true;
			this.method5927();
			this.method5935(local11);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public abstract void method5925();
}
