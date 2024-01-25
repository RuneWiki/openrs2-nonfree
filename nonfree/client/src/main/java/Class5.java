import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public abstract class Class5 implements Interface3 {

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!od;")
	protected final Class128_Sub2 aClass128_Sub2_43;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	private final int anInt7320;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "Z")
	private boolean aBoolean600;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public final int anInt7321;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	protected final int anInt7332;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	protected int anInt7327;

	static {
		new Class151("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!od;IIIZ)V")
	protected Class5(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass128_Sub2_43 = arg0;
		this.anInt7320 = arg3;
		this.aBoolean600 = arg4;
		this.anInt7321 = arg1;
		this.anInt7332 = arg2;
		OpenGL.glGenTextures(1, Static288.anIntArray251, 0);
		this.anInt7327 = Static288.anIntArray251[0];
		this.method5537(0);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z")
	public final boolean method5533() {
		if (!this.aClass128_Sub2_43.aBoolean363) {
			return false;
		}
		@Pc(11) int local11 = this.method5535();
		this.aClass128_Sub2_43.method3691(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7321);
		this.aBoolean600 = true;
		this.method5536();
		this.method5537(local11);
		return true;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)I")
	public final int method5534() {
		return this.anInt7327;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)I")
	private int method5535() {
		@Pc(21) int local21 = this.aClass128_Sub2_43.method3620(this.anInt7332) * this.anInt7320;
		return this.aBoolean600 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method5538();
		super.finalize();
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	private void method5536() {
		this.aClass128_Sub2_43.method3691(this);
		if (this.aBoolean601) {
			OpenGL.glTexParameteri(this.anInt7321, 10241, this.aBoolean600 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7321, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7321, 10241, this.aBoolean600 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7321, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	private void method5537(@OriginalArg(1) int arg0) {
		this.aClass128_Sub2_43.anInt4610 -= arg0;
		this.aClass128_Sub2_43.anInt4610 += this.method5535();
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
	public final void method5538() {
		if (this.anInt7327 > 0) {
			this.aClass128_Sub2_43.method3682(this.method5535(), this.anInt7327);
			this.anInt7327 = 0;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)V")
	protected final void method5539(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean600) {
			@Pc(11) int local11 = this.method5535();
			this.aBoolean600 = true;
			this.method5536();
			this.method5537(local11);
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)V")
	public final void method5540(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean601) {
			this.aBoolean601 = arg0;
			this.method5536();
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	public abstract void method5532();
}
