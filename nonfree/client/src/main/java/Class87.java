import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class87 {

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public int anInt4355;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public int anInt4358;

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
	public int anInt4359;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z")
	public final boolean method3640() {
		return (this.anInt4355 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)Z")
	public final boolean method3644() {
		return (this.anInt4355 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Z")
	public final boolean method3645() {
		return (this.anInt4355 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)Z")
	public final boolean method3646() {
		return (this.anInt4355 & 0x8) != 0;
	}
}
