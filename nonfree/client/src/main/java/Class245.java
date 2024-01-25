import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class245 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	public final int anInt6544;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public final int anInt6542;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public final int anInt6538;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
	public final int anInt6543;

	static {
		new Class15("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIII)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6544 = arg0;
		this.anInt6542 = arg1;
		this.anInt6538 = arg2;
		this.anInt6543 = arg3;
	}

	@OriginalMember(owner = "client!ud", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
