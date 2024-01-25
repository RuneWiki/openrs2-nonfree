import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class6_Sub29 extends Class6 {

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	public final int anInt5401;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	public final int anInt5402;

	static {
		new Class267("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(II)V")
	public Class6_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5401 = arg1;
		this.anInt5402 = arg0;
	}
}
