import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class Class136 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "I")
	public int anInt4378;

	@OriginalMember(owner = "client!he", name = "e", descriptor = "I")
	public int anInt4380;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)Z")
	public final boolean method3649() {
		return (this.anInt4380 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Z")
	public final boolean method3650() {
		return (this.anInt4380 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Z")
	public final boolean method3651() {
		return (this.anInt4380 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)Z")
	public final boolean method3652() {
		return (this.anInt4380 & 0x4) != 0;
	}
}
