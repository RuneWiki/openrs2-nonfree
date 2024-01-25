import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class72_Sub1_Sub2 extends Class72_Sub1 {

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public final int anInt8156 = (int) (Static60.method1119() / 1000L);

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "S")
	public final short aShort130;

	static {
		new Class306("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class72_Sub1_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString76 = arg0;
		this.aShort130 = (short) arg1;
	}
}
