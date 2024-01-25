import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class Class119 {

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
	public int anInt3539;

	@OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
	public int anInt3540;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	public int anInt3543;

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Z")
	public final boolean method3161() {
		return (this.anInt3539 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)Z")
	public final boolean method3162() {
		return (this.anInt3539 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)Z")
	public final boolean method3163() {
		return (this.anInt3539 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)Z")
	public final boolean method3164() {
		return (this.anInt3539 & 0x2) != 0;
	}
}
