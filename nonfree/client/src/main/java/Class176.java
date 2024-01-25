import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class176 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt4256;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt4257;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public int anInt4258;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)Z")
	public final boolean method3389() {
		return (this.anInt4258 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
	public final boolean method3390() {
		return (this.anInt4258 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Z")
	public final boolean method3391() {
		return (this.anInt4258 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z")
	public final boolean method3394() {
		return (this.anInt4258 & 0x2) != 0;
	}
}
