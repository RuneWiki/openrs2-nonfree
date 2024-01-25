import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class116 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "I")
	public int anInt3457;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "[I")
	public final int[] anIntArray225;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "[I")
	public final int[] anIntArray224;

	static {
		new Class189("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	public Class116(@OriginalArg(0) int arg0) {
		this.anInt3457 = arg0;
		this.anIntArray225 = new int[this.anInt3457];
		this.anIntArray224 = new int[this.anInt3457];
	}
}
