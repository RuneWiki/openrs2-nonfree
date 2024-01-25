import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class178 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "I")
	public int anInt5251;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public int anInt5253;

	@OriginalMember(owner = "client!op", name = "f", descriptor = "I")
	public int anInt5255;

	static {
		new Class202("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Z")
	public final boolean method4510() {
		return (this.anInt5255 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Z")
	public final boolean method4511() {
		return (this.anInt5255 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
	public final boolean method4512() {
		return (this.anInt5255 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)Z")
	public final boolean method4513() {
		return (this.anInt5255 & 0x1) != 0;
	}
}
