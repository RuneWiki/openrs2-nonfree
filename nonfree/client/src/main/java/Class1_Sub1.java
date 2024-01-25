import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "Lclient!wc;")
	public Class1_Sub1 aClass1_Sub1_57;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!wc;")
	public Class1_Sub1 aClass1_Sub1_58;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "J")
	public long aLong227;

	static {
		new Class158("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	public final void method6125() {
		if (this.aClass1_Sub1_57 != null) {
			this.aClass1_Sub1_57.aClass1_Sub1_58 = this.aClass1_Sub1_58;
			this.aClass1_Sub1_58.aClass1_Sub1_57 = this.aClass1_Sub1_57;
			this.aClass1_Sub1_57 = null;
			this.aClass1_Sub1_58 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Z")
	public final boolean method6129() {
		return this.aClass1_Sub1_57 != null;
	}
}
