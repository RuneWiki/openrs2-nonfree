import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public abstract class Class48 {

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "I")
	public int anInt1521;

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	public int anInt1523;

	@OriginalMember(owner = "client!mga", name = "i", descriptor = "I")
	public int anInt1526;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(B)Z")
	public final boolean method1387() {
		return (this.anInt1523 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(B)Z")
	public final boolean method1388() {
		return (this.anInt1523 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mga", name = "b", descriptor = "(I)Z")
	public final boolean method1389() {
		return (this.anInt1523 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "(I)Z")
	public final boolean method1391() {
		return (this.anInt1523 & 0x4) != 0;
	}
}
