import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class Class11_Sub39 extends Class11 {

	static {
		new Class117("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
		new Class117("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)I")
	public abstract int method5598();

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
	public abstract int method5600();

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)I")
	public abstract int method5601();

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(B)J")
	public abstract long method5602();
}
