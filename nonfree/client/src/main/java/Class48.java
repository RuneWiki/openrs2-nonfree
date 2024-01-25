import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class48 {

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public int anInt1018;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt1022;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
	public int anInt1023;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)Z")
	public final boolean method845() {
		return (this.anInt1023 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z")
	public final boolean method846() {
		return (this.anInt1023 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
	public final boolean method850() {
		return (this.anInt1023 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z")
	public final boolean method852() {
		return (this.anInt1023 & 0x4) != 0;
	}
}
