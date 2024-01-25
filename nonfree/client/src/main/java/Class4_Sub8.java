import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
	public int anInt492;

	static {
		new Class159("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	private Class4_Sub8() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(I)V")
	public Class4_Sub8(@OriginalArg(0) int arg0) {
		this.anInt492 = arg0;
	}
}
