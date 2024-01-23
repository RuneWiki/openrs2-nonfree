import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class Class132 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public int anInt4116;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)Z")
	public final boolean method3342() {
		return (this.anInt4122 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Z")
	public final boolean method3343() {
		return (this.anInt4122 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z")
	public final boolean method3345() {
		return (this.anInt4122 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)Z")
	public final boolean method3346() {
		return (this.anInt4122 & 0x1) != 0;
	}
}
