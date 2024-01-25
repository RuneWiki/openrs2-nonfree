import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class36 implements Interface8 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
	public final int anInt890;

	static {
		new Class182("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class36(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt890 = arg1;
	}

	@OriginalMember(owner = "client!cd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
