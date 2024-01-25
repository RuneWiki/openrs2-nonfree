import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class Class219 {

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
	public int anInt6535;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
	public int anInt6539;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	public int anInt6541;

	static {
		new Class209("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Z")
	public final boolean method5158() {
		return (this.anInt6541 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Z")
	public final boolean method5161() {
		return (this.anInt6541 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)Z")
	public final boolean method5162() {
		return (this.anInt6541 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Z")
	public final boolean method5164() {
		return (this.anInt6541 & 0x8) != 0;
	}
}
