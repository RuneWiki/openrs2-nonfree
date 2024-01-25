import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public final class Class4_Sub42 extends Class4 {

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
	public int anInt7299;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	public final int anInt7301;

	static {
		new Class21("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(II)V")
	public Class4_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7299 = arg1;
		this.anInt7301 = arg0;
	}
}
