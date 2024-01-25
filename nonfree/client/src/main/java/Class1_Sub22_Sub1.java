import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public final class Class1_Sub22_Sub1 extends Class1_Sub22 {

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
	public int anInt2820;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "J")
	public long aLong96;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	public int anInt2821;

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	public int anInt2822;

	static {
		new Class142("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)J")
	@Override
	public long method4157() {
		return this.aLong96;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)I")
	@Override
	public int method4156() {
		return this.anInt2820;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)I")
	@Override
	public int method4162() {
		return this.anInt2821;
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)I")
	@Override
	public int method4158() {
		return 0;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)I")
	@Override
	public int method4161() {
		return this.anInt2822;
	}
}
