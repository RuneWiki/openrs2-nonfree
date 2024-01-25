import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public abstract class Class169 {

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
	public int anInt4662;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	public int anInt4665;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
	public int anInt4667;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Z")
	public final boolean method4079() {
		return (this.anInt4662 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Z")
	public final boolean method4082() {
		return (this.anInt4662 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)Z")
	public final boolean method4083() {
		return (this.anInt4662 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Z")
	public final boolean method4084() {
		return (this.anInt4662 & 0x4) != 0;
	}
}
