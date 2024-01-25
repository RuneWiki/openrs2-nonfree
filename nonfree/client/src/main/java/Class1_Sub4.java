import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!an", name = "j", descriptor = "[B")
	public final byte[] aByteArray7;

	static {
		new Class306("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "([B)V")
	public Class1_Sub4(@OriginalArg(0) byte[] arg0) {
		this.aByteArray7 = arg0;
	}
}
