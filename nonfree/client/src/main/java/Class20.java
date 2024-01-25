import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class20 {

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)Z")
	public final boolean method724() {
		return (this.anInt496 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)Z")
	public final boolean method725() {
		return (this.anInt496 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Z")
	public final boolean method726() {
		return (this.anInt496 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z")
	public final boolean method729() {
		return (this.anInt496 & 0x8) != 0;
	}
}
