import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class Class158 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
	public int anInt4053;

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
	public int anInt4055;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
	public int anInt4058;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Z")
	public final boolean method3610() {
		return (this.anInt4053 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)Z")
	public final boolean method3613() {
		return (this.anInt4053 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)Z")
	public final boolean method3615() {
		return (this.anInt4053 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "(I)Z")
	public final boolean method3616() {
		return (this.anInt4053 & 0x2) != 0;
	}
}
