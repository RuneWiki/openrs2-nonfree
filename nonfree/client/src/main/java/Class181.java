import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class181 {

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public final int anInt4883;

	static {
		new Class55("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class181(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4883 = arg1;
	}

	@OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)I")
	public int method3873() {
		return this.anInt4883;
	}
}
