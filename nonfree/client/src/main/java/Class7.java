import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class Class7 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)Z")
	public final boolean method91() {
		return (this.anInt84 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Z")
	public final boolean method93() {
		return (this.anInt84 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)Z")
	public final boolean method94() {
		return (this.anInt84 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)Z")
	public final boolean method97() {
		return (this.anInt84 & 0x1) != 0;
	}
}
