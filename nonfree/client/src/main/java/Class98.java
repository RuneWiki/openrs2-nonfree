import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class98 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
	public int anInt3669;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public int anInt3674;

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
	public int anInt3678;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z")
	public final boolean method3019() {
		return (this.anInt3678 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
	public final boolean method3020() {
		return (this.anInt3678 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)Z")
	public final boolean method3021() {
		return (this.anInt3678 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)Z")
	public final boolean method3022() {
		return (this.anInt3678 & 0x4) != 0;
	}
}
