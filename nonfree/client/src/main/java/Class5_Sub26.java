import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class5_Sub26 extends Class5 {

	static {
		new Class85("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)I")
	public abstract int method4478();

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(I)I")
	public abstract int method4481();

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)J")
	public abstract long method4482();

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Z)I")
	public abstract int method4483();
}
