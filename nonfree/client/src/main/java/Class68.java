import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class Class68 {

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
	public int anInt2091;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
	public int anInt2092;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)Z")
	public final boolean method1967() {
		return (this.anInt2091 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)Z")
	public final boolean method1969() {
		return (this.anInt2091 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)Z")
	public final boolean method1970() {
		return (this.anInt2091 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Z")
	public final boolean method1972() {
		return (this.anInt2091 & 0x8) != 0;
	}
}
