import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!so", name = "q", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!so", name = "u", descriptor = "Ljava/lang/String;")
	public String aString65;

	@OriginalMember(owner = "client!so", name = "y", descriptor = "I")
	public int anInt5511;

	@OriginalMember(owner = "client!so", name = "z", descriptor = "I")
	public int anInt5512 = -1;

	static {
		new Class169("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(I)Lclient!rp;")
	public Class203 method4762() {
		return Static291.aClass203Array1[super.anInt5496];
	}
}
