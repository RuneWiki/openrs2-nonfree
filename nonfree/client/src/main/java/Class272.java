import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class272 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
	public final int anInt7964;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString67;

	static {
		new Class158("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class272(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7964 = arg1;
		this.aString67 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
