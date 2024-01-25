import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class145 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "S")
	public final short aShort50;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!ms;")
	public Interface9 anInterface9_4;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "B")
	public final byte aByte47;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "B")
	public byte aByte48;

	static {
		new Class174("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ms;III)V")
	public Class145(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort50 = (short) arg1;
		this.anInterface9_4 = arg0;
		this.aByte47 = (byte) arg2;
		this.aByte48 = (byte) arg3;
	}
}
