import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public abstract class Class20 implements Interface19 {

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Lclient!te;")
	protected final Class9_Sub3 aClass9_Sub3_36;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	protected final int anInt7318;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	private final int anInt7328;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	public final int anInt7329;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	protected int anInt7321;

	static {
		new Class114("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
		new Class114("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!te;IIIZ)V")
	protected Class20(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass9_Sub3_36 = arg0;
		this.anInt7318 = arg2;
		this.anInt7328 = arg3;
		this.anInt7329 = arg1;
		this.aBoolean482 = arg4;
		OpenGL.glGenTextures(1, Static397.anIntArray521, 0);
		this.anInt7321 = Static397.anIntArray521[0];
		this.method6234(0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	private void method6234(@OriginalArg(0) int arg0) {
		this.aClass9_Sub3_36.anInt7881 -= arg0;
		this.aClass9_Sub3_36.anInt7881 += this.method6245();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZI)V")
	public final void method6237(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean481) {
			this.aBoolean481 = arg0;
			this.method6242();
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Z")
	public final boolean method6238() {
		if (!this.aClass9_Sub3_36.aBoolean527) {
			return false;
		}
		@Pc(11) int local11 = this.method6245();
		this.aClass9_Sub3_36.method6701(this);
		OpenGL.glGenerateMipmapEXT(this.anInt7329);
		this.aBoolean482 = true;
		this.method6242();
		this.method6234(local11);
		return true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public final void method6239() {
		if (this.anInt7321 > 0) {
			this.aClass9_Sub3_36.method6693(this.anInt7321, this.method6245());
			this.anInt7321 = 0;
		}
	}

	@OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6239();
		super.finalize();
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	private void method6242() {
		this.aClass9_Sub3_36.method6701(this);
		if (this.aBoolean481) {
			OpenGL.glTexParameteri(this.anInt7329, 10241, this.aBoolean482 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt7329, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt7329, 10241, this.aBoolean482 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt7329, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BZ)V")
	protected final void method6244(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean482 != arg0) {
			@Pc(19) int local19 = this.method6245();
			this.aBoolean482 = true;
			this.method6242();
			this.method6234(local19);
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)I")
	private int method6245() {
		@Pc(21) int local21 = this.aClass9_Sub3_36.method6710(this.anInt7318) * this.anInt7328;
		return this.aBoolean482 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)I")
	public final int method6247() {
		return this.anInt7321;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public abstract void method6233();
}
