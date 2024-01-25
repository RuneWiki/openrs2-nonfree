import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class Class58 {

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	public int anInt5525;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z")
	public final boolean method4633() {
		return (this.anInt5529 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
	public final boolean method4634() {
		return (this.anInt5529 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)Z")
	public final boolean method4635() {
		return (this.anInt5529 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)Z")
	public final boolean method4636() {
		return (this.anInt5529 & 0x4) != 0;
	}
}
