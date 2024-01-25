import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!mo", name = "j", descriptor = "Lclient!qj;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
	public int anInt4312;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	public int anInt4314;

	@OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
	public int anInt4315;

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "[Lclient!qb;")
	public Class28_Sub6[] aClass28_Sub6Array1;

	static {
		new Class55("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
		new Class55("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BILclient!ya;I)Z")
	public boolean method3403(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass28_Sub6Array1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass28_Sub6Array1.length; local10++) {
				if (this.aClass28_Sub6Array1[local10].method4213(arg2, arg0) && this.aClass26_1.method5711(arg2, arg1, arg0)) {
					return true;
				}
			}
		}
		return false;
	}
}
