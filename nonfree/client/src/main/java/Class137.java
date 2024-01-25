import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public abstract class Class137 implements Interface8 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
	protected final int anInt7134;

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
	public final int anInt7136;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	private final int anInt7137;

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "Lclient!nq;")
	protected final Class167_Sub1 aClass167_Sub1_43;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	protected int anInt7144;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!nq;IIIZ)V")
	protected Class137(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean485 = arg4;
		this.anInt7134 = arg2;
		this.anInt7136 = arg1;
		this.anInt7137 = arg3;
		this.aClass167_Sub1_43 = arg0;
		OpenGL.glGenTextures(1, Static280.anIntArray313, 0);
		this.anInt7144 = Static280.anIntArray313[0];
		this.method5787(0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public final void method5779() {
		if (this.anInt7144 > 0) {
			this.aClass167_Sub1_43.method4029(this.anInt7144, this.method5781());
			this.anInt7144 = 0;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)I")
	private int method5781() {
		@Pc(18) int local18 = this.aClass167_Sub1_43.method4030(this.anInt7134) * this.anInt7137;
		return this.aBoolean485 ? local18 * 4 / 3 : local18;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)Z")
	public final boolean method5782() {
		if (!this.aClass167_Sub1_43.aBoolean343) {
			return false;
		}
		@Pc(16) int local16 = this.method5781();
		this.aClass167_Sub1_43.method4028(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7136);
		this.aBoolean485 = true;
		this.method5784();
		this.method5787(local16);
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZZ)V")
	public final void method5783(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean484 != arg0) {
			this.aBoolean484 = arg0;
			this.method5784();
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	private void method5784() {
		this.aClass167_Sub1_43.method4028(this);
		if (this.aBoolean484) {
			OpenGL.glTexParameteri(this.anInt7136, 10241, this.aBoolean485 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7136, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7136, 10241, this.aBoolean485 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7136, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)I")
	public final int method5785() {
		return this.anInt7144;
	}

	@OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5779();
		super.finalize();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(ZZ)V")
	protected final void method5786(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean485) {
			@Pc(16) int local16 = this.method5781();
			this.aBoolean485 = true;
			this.method5784();
			this.method5787(local16);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
	private void method5787(@OriginalArg(1) int arg0) {
		this.aClass167_Sub1_43.anInt4896 -= arg0;
		this.aClass167_Sub1_43.anInt4896 += this.method5781();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	public abstract void method5778();
}
