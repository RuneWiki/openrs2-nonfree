import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class Class98 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public int anInt5501;

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public int anInt5505;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "I")
	public int anInt5508;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	public final boolean method5035() {
		return (this.anInt5501 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)Z")
	public final boolean method5036() {
		return (this.anInt5501 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Z")
	public final boolean method5039() {
		return (this.anInt5501 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)Z")
	public final boolean method5043() {
		return (this.anInt5501 & 0x1) != 0;
	}
}
