import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class Class2_Sub11_Sub12 extends Class2_Sub11 {

	static {
		new Class93("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	protected Class2_Sub11_Sub12() {
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)Z")
	public abstract boolean method5151();

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method5152();
}
