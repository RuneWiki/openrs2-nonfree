import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class Class58 {

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
	public int anInt2159;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z")
	public final boolean method1589() {
		return (this.anInt2159 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Z")
	public final boolean method1592() {
		return (this.anInt2159 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
	public final boolean method1593() {
		return (this.anInt2159 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)Z")
	public final boolean method1594() {
		return (this.anInt2159 & 0x1) != 0;
	}
}
