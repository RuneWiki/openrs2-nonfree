import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class11_Sub4_Sub13_Sub2 extends Class11_Sub4_Sub13 {

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject7;

	static {
		new Class117("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
	public Class11_Sub4_Sub13_Sub2(@OriginalArg(0) Object arg0) {
		this.anObject7 = arg0;
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5306() {
		return false;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method5302() {
		return this.anObject7;
	}
}
