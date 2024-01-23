import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class152 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
	public int anInt5072;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public int anInt5077;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
	public int anInt5084;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z")
	public final boolean method3891() {
		return (this.anInt5072 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	public final boolean method3894() {
		return (this.anInt5072 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Z")
	public final boolean method3895() {
		return (this.anInt5072 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Z")
	public final boolean method3898() {
		return (this.anInt5072 & 0x1) != 0;
	}
}
