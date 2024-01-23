import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class Class115 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public int anInt4580;

	@OriginalMember(owner = "client!r", name = "q", descriptor = "I")
	public int anInt4591;

	@OriginalMember(owner = "client!r", name = "u", descriptor = "I")
	public int anInt4593;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Z")
	public final boolean method3466() {
		return (this.anInt4580 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
	public final boolean method3471() {
		return (this.anInt4580 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)Z")
	public final boolean method3475() {
		return (this.anInt4580 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)Z")
	public final boolean method3476() {
		return (this.anInt4580 & 0x8) != 0;
	}
}
