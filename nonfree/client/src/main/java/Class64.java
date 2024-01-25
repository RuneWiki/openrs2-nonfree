import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public abstract class Class64 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public int anInt2858;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Z")
	public final boolean method3062() {
		return (this.anInt2860 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)Z")
	public final boolean method3064() {
		return (this.anInt2860 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)Z")
	public final boolean method3065() {
		return (this.anInt2860 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)Z")
	public final boolean method3067() {
		return (this.anInt2860 & 0x2) != 0;
	}
}
