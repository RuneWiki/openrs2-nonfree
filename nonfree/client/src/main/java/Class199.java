import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class199 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public int anInt6201;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
	public final int[] anIntArray513;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
	public final int[] anIntArray512;

	static {
		new Class117("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V")
	public Class199(@OriginalArg(0) int arg0) {
		this.anInt6201 = arg0;
		this.anIntArray513 = new int[this.anInt6201];
		this.anIntArray512 = new int[this.anInt6201];
	}
}
