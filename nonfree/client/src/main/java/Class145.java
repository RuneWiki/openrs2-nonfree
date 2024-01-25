import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class Class145 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public int anInt4478;

	@OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
	public int anInt4485;

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
	public int anInt4486;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)Z")
	public final boolean method3655() {
		return (this.anInt4486 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
	public final boolean method3656() {
		return (this.anInt4486 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)Z")
	public final boolean method3657() {
		return (this.anInt4486 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)Z")
	public final boolean method3659() {
		return (this.anInt4486 & 0x8) != 0;
	}
}
