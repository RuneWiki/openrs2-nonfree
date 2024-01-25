import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class267 {

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "S")
	public final short aShort108;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "B")
	public final byte aByte103;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "Lclient!uv;")
	public Interface12 anInterface12_7;

	static {
		new Class96("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!uv;III)V")
	public Class267(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aShort108 = (short) arg1;
		this.aByte104 = (byte) arg3;
		this.aByte103 = (byte) arg2;
		this.anInterface12_7 = arg0;
	}
}
