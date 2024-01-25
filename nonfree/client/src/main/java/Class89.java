import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class Class89 {

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "I")
	public int anInt2232;

	@OriginalMember(owner = "client!kfa", name = "h", descriptor = "I")
	public int anInt2233;

	@OriginalMember(owner = "client!kfa", name = "i", descriptor = "I")
	public int anInt2234;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)Z")
	public final boolean method1821() {
		return (this.anInt2233 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "(I)Z")
	public final boolean method1823() {
		return (this.anInt2233 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)Z")
	public final boolean method1824() {
		return (this.anInt2233 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)Z")
	public final boolean method1827() {
		return (this.anInt2233 & 0x2) != 0;
	}
}
