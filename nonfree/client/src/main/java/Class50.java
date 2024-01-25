import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class50 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public int anInt1976;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public int anInt1981;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
	public int anInt1985;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
	public final boolean method1904() {
		return (this.anInt1985 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)Z")
	public final boolean method1907() {
		return (this.anInt1985 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z")
	public final boolean method1908() {
		return (this.anInt1985 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)Z")
	public final boolean method1910() {
		return (this.anInt1985 & 0x2) != 0;
	}
}
