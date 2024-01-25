import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class Class104 {

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
	public int anInt4706;

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
	public int anInt4708;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public int anInt4711;

	static {
		new Class34("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
		new Class34(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
	public final boolean method4224() {
		return (this.anInt4711 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z")
	public final boolean method4225() {
		return (this.anInt4711 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z")
	public final boolean method4226() {
		return (this.anInt4711 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
	public final boolean method4230() {
		return (this.anInt4711 & 0x2) != 0;
	}
}
