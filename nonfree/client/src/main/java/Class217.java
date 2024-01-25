import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public abstract class Class217 {

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	public int anInt9128;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public int anInt9130;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public int anInt9131;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Z")
	public final boolean method7548() {
		return (this.anInt9130 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Z")
	public final boolean method7549() {
		return (this.anInt9130 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)Z")
	public final boolean method7550() {
		return (this.anInt9130 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)Z")
	public final boolean method7551() {
		return (this.anInt9130 & 0x8) != 0;
	}
}
