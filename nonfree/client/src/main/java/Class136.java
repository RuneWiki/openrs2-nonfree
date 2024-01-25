import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class136 implements Interface7 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public final int anInt4023;

	static {
		new Class62("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class136(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4023 = arg1;
	}

	@OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
