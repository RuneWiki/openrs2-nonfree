import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class Class4 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
	public final boolean method96() {
		return (this.anInt193 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)Z")
	public final boolean method97() {
		return (this.anInt193 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Z")
	public final boolean method100() {
		return (this.anInt193 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Z")
	public final boolean method101() {
		return (this.anInt193 & 0x1) != 0;
	}
}
