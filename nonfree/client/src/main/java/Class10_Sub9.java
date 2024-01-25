import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class10_Sub9 extends Class10 {

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[B")
	public final byte[] aByteArray9;

	static {
		new Class182("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
		new Class182("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "([B)V")
	public Class10_Sub9(@OriginalArg(0) byte[] arg0) {
		this.aByteArray9 = arg0;
	}
}
