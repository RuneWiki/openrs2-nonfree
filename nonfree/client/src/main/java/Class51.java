import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class Class51 {

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	public int anInt3943;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public int anInt3944;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public int anInt3946;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z")
	public final boolean method3612() {
		return (this.anInt3944 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z")
	public final boolean method3613() {
		return (this.anInt3944 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z")
	public final boolean method3614() {
		return (this.anInt3944 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Z")
	public final boolean method3615() {
		return (this.anInt3944 & 0x1) != 0;
	}
}
