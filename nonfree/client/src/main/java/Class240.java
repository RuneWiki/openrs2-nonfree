import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class240 {

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
	public final int anInt6576;

	static {
		new Class209("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		new Class209("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6576 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
