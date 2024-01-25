import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class Class19 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
	public int anInt2207;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	public int anInt2211;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
	public int anInt2214;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)Z")
	public final boolean method1880() {
		return (this.anInt2207 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Z")
	public final boolean method1882() {
		return (this.anInt2207 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Z")
	public final boolean method1885() {
		return (this.anInt2207 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)Z")
	public final boolean method1887() {
		return (this.anInt2207 & 0x4) != 0;
	}
}
