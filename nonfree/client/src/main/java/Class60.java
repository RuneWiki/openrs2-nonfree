import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public final class Class60 {

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public final int anInt1721;

	static {
		new Class134("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class60(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1721 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)I")
	public int method1385() {
		return this.anInt1721;
	}

	@OriginalMember(owner = "client!ea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
