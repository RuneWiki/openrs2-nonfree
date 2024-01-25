import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public final class Class167 implements Interface1 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "I")
	public final int anInt5066;

	static {
		new Class189("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class167(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5066 = arg1;
	}

	@OriginalMember(owner = "client!no", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
