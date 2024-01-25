import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public int anInt128;

	static {
		new Class55("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	private Class7_Sub2() {
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(I)V")
	public Class7_Sub2(@OriginalArg(0) int arg0) {
		this.anInt128 = arg0;
	}
}
