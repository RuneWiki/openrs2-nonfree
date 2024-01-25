import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class196 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt7417;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
	public int anInt7418;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public int anInt7422;

	static {
		new Class84("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z")
	public final boolean method5750() {
		return (this.anInt7422 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)Z")
	public final boolean method5751() {
		return (this.anInt7422 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(Z)Z")
	public final boolean method5752() {
		return (this.anInt7422 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
	public final boolean method5754() {
		return (this.anInt7422 & 0x2) != 0;
	}
}
