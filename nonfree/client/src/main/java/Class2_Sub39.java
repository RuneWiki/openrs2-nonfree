import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!s", name = "m", descriptor = "[B")
	public final byte[] aByteArray70;

	static {
		new Class231("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "([B)V")
	public Class2_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray70 = arg0;
	}
}
