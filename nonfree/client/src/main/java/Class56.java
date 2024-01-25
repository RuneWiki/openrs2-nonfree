import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public final class Class56 {

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	public final int anInt1531;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	private final int anInt1527;

	static {
		new Class15("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(II)V")
	public Class56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1531 = arg1;
		this.anInt1527 = arg0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)I")
	public int method1248() {
		return this.anInt1527;
	}

	@OriginalMember(owner = "client!dq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
