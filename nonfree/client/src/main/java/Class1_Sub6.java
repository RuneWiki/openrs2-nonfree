import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
	public int anInt796;

	static {
		new Class151("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	private Class1_Sub6() {
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6(@OriginalArg(0) int arg0) {
		this.anInt796 = arg0;
	}
}
