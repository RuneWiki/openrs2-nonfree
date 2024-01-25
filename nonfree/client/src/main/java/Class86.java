import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class Class86 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public int anInt1977;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	public int anInt1978;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public int anInt1984;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)Z")
	public final boolean method1653() {
		return (this.anInt1984 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)Z")
	public final boolean method1654() {
		return (this.anInt1984 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)Z")
	public final boolean method1655() {
		return (this.anInt1984 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)Z")
	public final boolean method1658() {
		return (this.anInt1984 & 0x8) != 0;
	}
}
