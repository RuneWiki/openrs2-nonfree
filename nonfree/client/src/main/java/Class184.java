import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class Class184 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public int anInt4766;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public int anInt4767;

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public int anInt4769;

	static {
		new Class231("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
	public final boolean method4228() {
		return (this.anInt4769 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Z")
	public final boolean method4231() {
		return (this.anInt4769 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
	public final boolean method4232() {
		return (this.anInt4769 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Z")
	public final boolean method4233() {
		return (this.anInt4769 & 0x8) != 0;
	}
}
