import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!tk", name = "E", descriptor = "[B")
	public final byte[] aByteArray95;

	static {
		new Class221("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub15(@OriginalArg(0) byte[] arg0) {
		this.aByteArray95 = arg0;
	}
}
