import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class Class8 {

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	public int anInt2009;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	public int anInt2012;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Z")
	public final boolean method1738() {
		return (this.anInt2009 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(I)Z")
	public final boolean method1740() {
		return (this.anInt2009 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "(I)Z")
	public final boolean method1741() {
		return (this.anInt2009 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)Z")
	public final boolean method1744() {
		return (this.anInt2009 & 0x4) != 0;
	}
}
