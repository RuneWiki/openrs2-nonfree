import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class Class139 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
	public int anInt7121;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	public int anInt7124;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	public int anInt7125;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)Z")
	public final boolean method5687() {
		return (this.anInt7124 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Z")
	public final boolean method5688() {
		return (this.anInt7124 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)Z")
	public final boolean method5690() {
		return (this.anInt7124 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)Z")
	public final boolean method5692() {
		return (this.anInt7124 & 0x2) != 0;
	}
}
