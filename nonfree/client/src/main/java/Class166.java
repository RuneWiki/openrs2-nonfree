import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public abstract class Class166 {

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
	public int anInt8510;

	@OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
	public int anInt8513;

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	public int anInt8516;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)Z")
	public final boolean method7332() {
		return (this.anInt8510 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)Z")
	public final boolean method7333() {
		return (this.anInt8510 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)Z")
	public final boolean method7334() {
		return (this.anInt8510 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "(I)Z")
	public final boolean method7335() {
		return (this.anInt8510 & 0x1) != 0;
	}
}
