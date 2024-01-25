import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class Class160 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "I")
	public int anInt3879;

	@OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
	public int anInt3884;

	@OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
	public int anInt3889;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)Z")
	public final boolean method3436() {
		return (this.anInt3889 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)Z")
	public final boolean method3438() {
		return (this.anInt3889 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	public final boolean method3439() {
		return (this.anInt3889 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)Z")
	public final boolean method3441() {
		return (this.anInt3889 & 0x2) != 0;
	}
}
