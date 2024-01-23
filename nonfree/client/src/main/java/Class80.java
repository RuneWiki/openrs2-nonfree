import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public abstract class Class80 {

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
	public int anInt2569;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public int anInt2571;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public int anInt2577;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Z")
	public final boolean method1920() {
		return (this.anInt2569 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Z")
	public final boolean method1921() {
		return (this.anInt2569 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)Z")
	public final boolean method1922() {
		return (this.anInt2569 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)Z")
	public final boolean method1926() {
		return (this.anInt2569 & 0x4) != 0;
	}
}
