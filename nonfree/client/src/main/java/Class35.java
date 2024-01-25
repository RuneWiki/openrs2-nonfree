import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public abstract class Class35 {

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "I")
	public int anInt996;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
	public int anInt998;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)Z")
	public final boolean method906() {
		return (this.anInt998 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)Z")
	public final boolean method908() {
		return (this.anInt998 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Z")
	public final boolean method909() {
		return (this.anInt998 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)Z")
	public final boolean method910() {
		return (this.anInt998 & 0x2) != 0;
	}
}
