import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class25 {

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
	private final int anInt505;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public final int anInt500;

	static {
		new Class231("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
	public Class25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt505 = arg0;
		this.anInt500 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	public int method473() {
		return this.anInt505;
	}
}
