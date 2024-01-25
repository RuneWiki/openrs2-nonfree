import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class6 {

	@OriginalMember(owner = "client!os", name = "f", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Z")
	public final boolean method57() {
		return (this.anInt55 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)Z")
	public final boolean method59() {
		return (this.anInt55 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)Z")
	public final boolean method60() {
		return (this.anInt55 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(I)Z")
	public final boolean method62() {
		return (this.anInt55 & 0x2) != 0;
	}
}
