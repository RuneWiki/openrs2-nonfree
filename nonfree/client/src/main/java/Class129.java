import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class129 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public final int anInt3357;

	static {
		new Class231("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class129(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3357 = arg1;
	}

	@OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
