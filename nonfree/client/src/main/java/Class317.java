import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class Class317 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public int anInt9102;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	public int anInt9106;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public int anInt9107;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z")
	public final boolean method7453() {
		return (this.anInt9102 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
	public final boolean method7454() {
		return (this.anInt9102 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z")
	public final boolean method7456() {
		return (this.anInt9102 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Z")
	public final boolean method7457() {
		return (this.anInt9102 & 0x1) != 0;
	}
}
