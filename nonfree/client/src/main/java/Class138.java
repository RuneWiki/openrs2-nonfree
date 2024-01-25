import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class Class138 {

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
	public int anInt3869;

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
	public int anInt3871;

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public int anInt3872;

	static {
		new Class32("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Z")
	public final boolean method3565() {
		return (this.anInt3869 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Z")
	public final boolean method3566() {
		return (this.anInt3869 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)Z")
	public final boolean method3569() {
		return (this.anInt3869 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)Z")
	public final boolean method3570() {
		return (this.anInt3869 & 0x8) != 0;
	}
}
