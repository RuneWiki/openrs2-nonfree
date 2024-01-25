import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class222 {

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt10271;

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
	public int anInt10272;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
	public int anInt10273;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)Z")
	public final boolean method7989() {
		return (this.anInt10271 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z")
	public final boolean method7990() {
		return (this.anInt10271 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z")
	public final boolean method7991() {
		return (this.anInt10271 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z")
	public final boolean method7993() {
		return (this.anInt10271 & 0x1) != 0;
	}
}
