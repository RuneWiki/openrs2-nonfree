import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class139 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "I")
	public final int anInt4067;

	static {
		new Class45("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class139(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4067 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
