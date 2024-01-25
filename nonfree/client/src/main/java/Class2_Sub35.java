import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
	public final int anInt5880;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "I")
	public final int anInt5883;

	static {
		new Class221("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class221("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5880 = arg1;
		this.anInt5883 = arg0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Z")
	public boolean method5119(@OriginalArg(0) int arg0) {
		return (this.anInt5883 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
	public int method5121() {
		return this.anInt5883 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)I")
	public int method5123() {
		return Static379.method1123(this.anInt5883);
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)Z")
	public boolean method5125() {
		return (this.anInt5883 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)Z")
	public boolean method5126() {
		return (this.anInt5883 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)Z")
	public boolean method5127() {
		return (this.anInt5883 & 0x1) != 0;
	}
}
