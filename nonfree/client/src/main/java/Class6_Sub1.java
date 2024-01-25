import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public int anInt85;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	public int anInt86 = -1;

	static {
		new Class85("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)Lclient!lq;")
	public Class128 method90() {
		return Static163.aClass128Array1[super.anInt76];
	}
}
