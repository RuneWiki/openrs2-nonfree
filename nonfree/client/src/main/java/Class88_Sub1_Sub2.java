import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class88_Sub1_Sub2 extends Class88_Sub1 {

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
	public final int anInt3884 = (int) (Static446.method5903() / 1000L);

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "S")
	public final short aShort42;

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "Ljava/lang/String;")
	public final String aString44;

	static {
		new Class198("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
		new Class198("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class88_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aShort42 = (short) arg1;
		this.aString44 = arg0;
	}
}
