import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "I")
	public int anInt1497;

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "J")
	public long aLong46;

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
	public int anInt1502;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "I")
	public int anInt1509;

	static {
		new Class93("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
		new Class93("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)I")
	@Override
	public int method1557() {
		return this.anInt1502;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)J")
	@Override
	public long method1559() {
		return this.aLong46;
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
	@Override
	public int method1562() {
		return this.anInt1509;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)I")
	@Override
	public int method1564() {
		return this.anInt1497;
	}
}
